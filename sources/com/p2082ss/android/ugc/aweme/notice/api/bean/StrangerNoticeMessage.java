package com.p2082ss.android.ugc.aweme.notice.api.bean;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.message.model.SimpleUser;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.notice.api.bean.StrangerNoticeMessage */
public class StrangerNoticeMessage {
    @AbstractC27891c(mo46611a = "client_msg_id")
    long clientMsgId;
    @AbstractC27891c(mo46611a = "content")
    String content;
    @AbstractC27891c(mo46611a = "create_time")
    long createTime;
    @AbstractC27891c(mo46611a = "device_id")
    long deviceId;
    @AbstractC27891c(mo46611a = "ext")
    String ext;
    @AbstractC27891c(mo46611a = "from_user")
    SimpleUser fromUser;
    @AbstractC27891c(mo46611a = "msg_type")
    int msgType;
    @AbstractC27891c(mo46611a = "to_user")
    SimpleUser toUser;

    static {
        Covode.recordClassIndex(72223);
    }

    public long getClientMsgId() {
        return this.clientMsgId;
    }

    public String getContent() {
        return this.content;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public long getDeviceId() {
        return this.deviceId;
    }

    public String getExt() {
        return this.ext;
    }

    public SimpleUser getFromUser() {
        return this.fromUser;
    }

    public int getMsgType() {
        return this.msgType;
    }

    public SimpleUser getToUser() {
        return this.toUser;
    }

    public boolean isRecalled() {
        if (TextUtils.isEmpty(this.ext)) {
            return false;
        }
        try {
            if (TextUtils.equals("true", (CharSequence) ((HashMap) new C27910f().mo46670a(this.ext, HashMap.class)).get("s:is_recalled"))) {
                return true;
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void setClientMsgId(long j) {
        this.clientMsgId = j;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setCreateTime(long j) {
        this.createTime = j;
    }

    public void setDeviceId(long j) {
        this.deviceId = j;
    }

    public void setExt(String str) {
        this.ext = str;
    }

    public void setFromUser(SimpleUser simpleUser) {
        this.fromUser = simpleUser;
    }

    public void setMsgType(int i) {
        this.msgType = i;
    }

    public void setToUser(SimpleUser simpleUser) {
        this.toUser = simpleUser;
    }
}
