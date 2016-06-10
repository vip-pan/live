package com.loovee.live.service;


import com.loovee.live.po.LiveRoom;

/**
 * Created by Administrator on 2016/5/29.
 */
public interface LiveService {

    /**
     * ID获取房间
     * @param id
     * @return
     */
    public LiveRoom getLiveRoonById(String id);

    /**
     * 开启直播
     * @param id
     * @param time
     * @param name
     */
    public void openLive(String id, Long time, String name);

}
