package com.wangzai.desgin.factory.abstractfactroy;



/**
 * 这个构造方法中的参数对应了定义enum的结构
 * 这里的String value参数，其实就是我们上面定义的结构中的所有值
 *
 * 无论我们直接通过 HumanEnum.xxx 来调用 , 这也太硬核了 ,不够灵活,
 * 还是通过 ValueOf 通过传入参数名(enum指定元素名)
 * 都会调用与那个元素类型结构所对应的构造方法
 * 而且每次都会调用 x(元素个数)次
 *
 * 比如我们上面 (String)类型有4个元素,那会调用6次构造方法
 * 调用6次就像是把上面的元素 都映射到我们的 value 上
 * 但最后我们value的值还是我们上面通过元素名指定的那个元素的值
 * 然后我们写getValue() 的时候可以直接返回value
 */


public enum StationeryEnum {
    ChenGuangPencil("com.wangzai.desgin.factory.abstractfactroy.ChenGuangPencil"),
    ChenGuangRubber("com.wangzai.desgin.factory.abstractfactroy.ChenGuangRubber"),
    DeLiPencil("com.wangzai.desgin.factory.abstractfactroy.DeLiPencil"),
    DeLiRubber("com.wangzai.desgin.factory.abstractfactroy.DeLiPencil");


    private String value = "";

    private StationeryEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;

    }

}
