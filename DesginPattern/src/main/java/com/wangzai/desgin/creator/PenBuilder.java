package com.wangzai.desgin.creator;

//港币组装接口
public interface PenBuilder {

    /**
     *
     * @param color 钢笔的笔壳颜色
     * @return 返回钢笔实例
     */
    Pen build(String penShellcolor);

    /**
     *
     * @return 默认透明钢笔
     */
    Pen build();
}
