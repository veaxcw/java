装饰模式（wrapper 模式）：
    动态地将责任附加到对象上。若要扩展功能，装饰者提供了比继承更有弹性的替代方案。
 在如下三种情况下可以选择使用装饰者模式：
         1）需要扩展一个类的功能，或给一个类增加附加责任。
         2）需要动态的给一个对象增加功能，这些功能可以再动态地撤销。
         3）需要增加一些基本功能的排列组合而产生的非常大量的功能，从而使继承变得 不现实。
 结构：
        抽象父类
 被装饰者       抽象装饰者类
        具体装饰者类A      具体装饰者类A
        
        