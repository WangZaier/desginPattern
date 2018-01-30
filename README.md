    2018-1.21
    单例模式更新:
    	DoubleCheckLock		双重校验锁
    	HungryMan			饿汉式
    	LazyMan				懒汉式
    	LazyInitialization	嵌套类式
    	EnumSingletion		枚举式


----------
2018-1.23
工厂模式-更新

	简单工厂
	
		Stationery 文具接口
		Pencil 				铅笔
		Rubber 				橡皮
		StationeryFactory	文具工厂(按照参数创造)
		Consumer 			消费者
	————————————————————————————————
	方法工厂
		    Stationery 		文具接口
		    Pencil 			铅笔
		    Rubber 			橡皮
		    Factory 		工厂接口
		    PencilFactroy	铅笔工厂
		    RubberFactory	橡皮工厂
		    Consumer 		消费者
	————————————————————————————————
	抽象工厂:
	简介：世界上本没有路... 对不起拿错剧本了.鲁迅的棺材板压不住了
	原本有一套制造文具的生产规范[StationeryFactory](生产橡皮-createRubber)(生产铅笔-createPencil)
	然后有了有一个文具工厂(AbstractStationeryFactory)
	然后出现了得力和晨光.也就是(ChenGuangFactory)/(DeLiFactory)
	他们想让文具工厂给自己生产,那就要与文具工厂合作(extends),然后按照规范(createRubber)让代工厂按照自己的要求给我造东西出来
	
        Stationery 					文具接口
		Pencil 						铅笔(abstract)
		Rubber 						橡皮(abstract)
		DeLiPencil					得力铅笔
		DeliRubber					得力橡皮
		ChenGuangPencil				晨光铅笔
		ChenGuangRubber				晨光铅笔
		StationeryEnum				文具的类型定义和对应包名
		StationeryFactory 			文具工厂接口(生产铅笔,生产橡皮)
		AbstractStationeryFactory	抽象文具工厂(代工厂)(abstract)
		ChenGuangFactory			晨光工厂(给自家铅笔自定属性)
		DeLiFactory					得力工厂(给自家铅笔自定属性)
		Comsumer					消费者


----------


	2018-1.25
	创造者模式-更新
	简介:
	客户不需要知道生产细节,只需要下发命令
	生产,组装都会帮你做好
		Pen 				钢笔类
		Refill				笔芯
		RefillFactroy 		笔芯制造厂
		Penshell 			笔壳
		PenShellFactory 	笔壳制造厂
		PenBuilder 			钢笔建造接口
		RedPenBuilder 		红笔组装
		BlackPenBuilder 	黑笔组装
		Director 			手持Builder,调用生产
		Client				客户


----------


	2018-1.27
	原型模式-更新
	需求：我们有一万个造衣服的订单.先在要从数据库取出来.将pojo
	我觉得原型很关键的就是“复制”而不是"引用传递"
	才疏学浅..实力真的有限
		Client			下发任务
		ClothesOrder	衣服订单
		Department 		部门信息

	2018-1.28
	适配器模式-更新
	简介：比如两个系统对接.但是对方的结构不适用于我们的系统
		我们需要把对方的结构转换为我们的结构
	场景：一个美国人想和一个中国人进行交流,那他们就需要一个翻译器
	那这个翻译器就是适配起了咯
		English			英国人
		Chinese			中国人
		EnglishAdapter	中英翻译器
		ChineseAdapter	英中翻译器
		Client			测试


----------


	2018-1.29
	观察者模式-更新
	如果自己写的话:
		Observable 被观察的类
			这个被观察的类.有注册/删除观察者的方法,可以用list等等存储这些观察者
			一个通知方法notifyObservers(String message),然后遍历观察者,向他们发送消息(也就是调用他们的update)
		Observer 	观察者
			一个update方法.一般观察者多个会定义接口实现规范
	简介:某些商城.搞一些啥花里胡哨的活动.流量非常大,并发量就很高。
	流量可以采用限流等一些方法.那每秒钟那么多的订单下去.数据库io就很鸡儿吃力了
	那就可以做缓存.先把订单放起来.等系统缓一缓再存保证不会崩掉把数据同步到数据库
	可以用观察者模式.监听消息.进行同步
		OrderSystem			订单系统
		Synchronization		观察者.
		Client				测试

	2333我真是越来越不走心了...doge


----------


	2018-1.29
	访问者模式-更新
	简介:有
		系统A,系统B
		用户：wangzai
		通过授权中心让用户访问系统A,系统B
	我的妈耶...把系统的接口名写成System是真滴蠢...一直和lang.System弄错..也许这就是智障吧
	调用链： 传入系统A,B,放在List中——>传入用户->遍历list调用accept(Visitor visitor)方法->调用visitor.saveSystemBPermission(this)把自己传过去->保存"this"->调用"this"查看系统文件
		System 					系统接口
		SystemA					系统A
		SystemB 				系统B
		Visitor 				用户接口
		WangZai					用户“wangzai”
		AuthorizationCenter		授权中心
		Client					测试


----------


	2018-1.29
	装饰器模式-更新
	简介：可以理解为在原有基础上扩展功能而不会产生类膨胀
		 Component（抽象组件）：需要装饰的抽象对象,一般是接口或者抽象类。 
		 ConcreteComponent（具体组建）：是我们需要装饰的对象,他也是 抽象组件 的实现 
		 Docorator（抽象装饰类）：也是抽象构件角色的子类，在它的属性里必然有一个 private 变量指向 Component。 
		 ConcreteDecorator（具体装饰类）：具体的装饰类
	场景：
		我们有一个业务
		UserService			 用户接口
		UserServiceImpl		 用户接口实现
		现在有查询用户信息
		然后我们需要为他添加一个功能:删除用户
			继承？如果以后又要添加新功能.让你来个添加用户,再继承,再来一个功能,再继承...导致维护难度较大
		使用装饰器模式可以缓解这尴尬的气氛
			UserService 			用户服务接口
			UserServiceImpl			用户服务实现
			UserServiceDecorator	用户服务装饰抽象
			UserAddDecorator		用户添加功能
			UserDeleteDecorator		用户删除功能
			Client					测试


----------


	2018-1.29
	外观模式-更新
		简介:将一系列的业务操作整合.减少客户端与业务的接触
		我觉得controller+service 也就是外观模式了
		前端一个请求->controller,帮你把业务调用好
			Client 				客户端
			controller 			控制器
			DepartmentService	部门服务
			UserService 		用户服务

	2018-1.30
	模版模式-更新
	简介:定义抽象方法.组成顶级逻辑,抽象方法由子类实现
		Client 测试
		Game   游戏接口
		Fgo    Fgo游戏
		War3   War3游戏


----------


	2018-1.30
	代理模式-更新
	简介：我们使用spring进行一些对数据库的操作一般都会开启开启事务.通过aop将事务管理器行为插入到我们的业务,aop与动态代理的关系也是非常的亲密
	静态代理是编译期间就确定好的代理关系,而动态代理是运行期间由JVM通过反射等技术生成的代理对象
		静态代理:
			UserDao 				持久化层
			UserService 			用户接口
			UserServiceImpl 		用户接口实现
			UserServiceImplProxy	用户接口代理对象
			Client					测试
	——————————————————————————————
		动态代理：
			我们使用JDK包中的java.lang.reflect.Proxy来生成代理对象
				实现代理需要使用的方法static Object newProxyInstance(ClassLoader loader, Class<?>[] interfaces,InvocationHandler h )
					ClassLoader loader,:指定当前目标对象使用类加载器,获取加载器的方法是固定的
					Class<?>[] interfaces,:目标对象实现的接口的类型,使用泛型方式确认类型
					InvocationHandler h:事件处理,执行目标对象的方法时,会触发事件处理器的方法,会把当前执行目标对象的方法作为
			ProxyHandler 		代理实例
			UserDao 			持久化层
			UserService 	 	用户业务接口
			UserServiceImpl 	用户业务实现
			Client 				测试


----------


	2018-1.31
	备忘录模式-更新
	简介:也称为快照模式,用来存储对象内部状态的一种模式
		成员Originator的方法一般有: 创建备忘录/恢复到某一个状态/添加状态
		成员Caretaker的方法一般有: 创建新的检查点(调用创建备忘录后add到缓存)/将Originator恢复到某一状态
		笑哭...感觉Caretaker 和 Originator 很相似啊.
		但是Originator的职责是:保存备忘录状态(一些信息).进行创建备忘录.修改(更新/退回)当前的状态
		Carataker的职责是:保存备忘录实体,用来恢复备忘录,并更新/同步 Originator 的状态(信息) 
		多重检查点就是一个检查点(索引)对应了一个状态(备忘录的一些信息)和一个备忘录实体

			白盒:
				Memento 	备忘录
				Originator	备忘发起
				Caretaker	备忘录管理者
				Client 		测试
	———————————————————————————————
			多重检查点(与白盒相同的结构,只是支持多个状态):
				Memento 	备忘录
				Originator	备忘发起
				Caretaker	备忘录管理者
				Client 		测试
