package com.p2082ss.android.ugc.aweme.notice.api.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;

/* renamed from: com.ss.android.ugc.aweme.notice.api.bean.LiveMessage */
public class LiveMessage extends C61550b {
    @AbstractC27891c(mo46611a = "anchor_avatar")
    private UrlModel anchorAvatar;
    @AbstractC27891c(mo46611a = "anchor_id")
    private String anchorId;
    @AbstractC27891c(mo46611a = StringSet.type)
    private int liveMessageType;

    static {
        Covode.recordClassIndex(72219);
    }

    public UrlModel getAnchorAvatar() {
        return this.anchorAvatar;
    }

    public String getAnchorId() {
        return this.anchorId;
    }

    public int getLiveMessageType() {
        return this.liveMessageType;
    }

    public LiveMessage() {
        this.msgType = EnumC61554f.LIVE;
    }

    public void setAnchorAvatar(UrlModel urlModel) {
        this.anchorAvatar = urlModel;
    }

    public void setAnchorId(String str) {
        this.anchorId = str;
    }

    public void setLiveMessageType(int i) {
        this.liveMessageType = i;
    }
}
