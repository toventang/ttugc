package com.bytedance.android.livesdk.chatroom.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

public class Barrage {
    @AbstractC27891c(mo46611a = "content")
    private String content;
    @AbstractC27891c(mo46611a = "left_diamond")
    private int leftDiamond;
    @AbstractC27891c(mo46611a = "msg_id")
    private long msgId;
    @AbstractC27891c(mo46611a = "order_id")
    private String orderId;
    @AbstractC27891c(mo46611a = "msg")
    private String screenChatMsg;

    static {
        Covode.recordClassIndex(8428);
    }

    public String getContent() {
        return this.content;
    }

    public int getLeftDiamond() {
        return this.leftDiamond;
    }

    public long getMsgId() {
        return this.msgId;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public String getScreenChatMsg() {
        return this.screenChatMsg;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setLeftDiamond(int i) {
        this.leftDiamond = i;
    }

    public void setMsgId(long j) {
        this.msgId = j;
    }

    public void setOrderId(String str) {
        this.orderId = str;
    }

    public void setScreenChatMsg(String str) {
        this.screenChatMsg = str;
    }
}
