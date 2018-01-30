package com.wangzai.desgin.factory.abstractfactroy;

public class ChenGuangFactory extends AbstractStationeryFactory{


    //代工铅笔
    @Override
    public Stationery createPencil() {
        //生产文具：指定晨光铅笔
        return super.createStationery(StationeryEnum.ChenGuangPencil);
    }


    //代工橡皮
    @Override
    public Stationery createRubber() {
        //生产文具:指定晨光橡皮
        return super.createStationery(StationeryEnum.ChenGuangRubber);
    }
}
