package com.wangzai.desgin.factory.abstractfactroy;


//可以理解为代工厂.代理工厂.帮得力和晨光生产文具他们需要加盟代工厂才帮他们造文具
public abstract class AbstractStationeryFactory implements StationeryFactory{

    protected Stationery createStationery(StationeryEnum stationeryEnum){
        Stationery stationery = null;

        if(!stationeryEnum.getValue().equals("")){
            try{
                //按照传入enum创建实例
                stationery = (Stationery) Class.forName(stationeryEnum.getValue()).newInstance();
            }catch (Exception e){
                //使用enum避免异常.毕竟参数固定
                e.printStackTrace();
            }
        }
        return stationery;
    }
}
