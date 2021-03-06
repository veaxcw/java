package com.chengw.thread.bigfiledownload;

import com.chengw.thread.utils.Debug;

import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;

/**
 * @author chengw
 */
public class DownloadBuffer implements Closeable {

    private long globalOffSet;
    private long upperBound;
    private int offset = 0;
    public final ByteBuffer byteBuffer;
    private final Storage storage;

    public DownloadBuffer(long globalOffSet, long upperBound,final Storage storage)  {
        this.globalOffSet = globalOffSet;
        this.upperBound = upperBound;
        this.byteBuffer = ByteBuffer.allocate(1024*1024);
        this.storage = storage;
    }

    public void write(ByteBuffer buf) throws IOException {
        int length = buf.position();
        final int capacity = byteBuffer.capacity();
        if((offset + length) > capacity || length == capacity){
            //将缓冲区写入文件
            flush();
        }
        //Debug.info("将流写入缓冲区");
        byteBuffer.position(offset);
        buf.flip();
        byteBuffer.put(buf);
        offset += length;

    }

    public void flush() throws IOException {
        //Debug.info("将缓冲区写入文件");
        int length;
        byteBuffer.flip();
        length = storage.store(globalOffSet,byteBuffer);
        byteBuffer.clear();
        globalOffSet += length;
        offset = 0;
    }

    @Override
    public synchronized void close() throws IOException {
        Debug.info("globalOffset:"+ globalOffSet + ";upperBound:" + upperBound);
        if (globalOffSet < upperBound) {
            flush();
        }
    }
}
