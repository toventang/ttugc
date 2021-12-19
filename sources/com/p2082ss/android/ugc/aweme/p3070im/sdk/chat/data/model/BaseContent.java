package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1216f.C17457c;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent */
public class BaseContent extends C17457c implements PreloadFetcher, Serializable {
    @AbstractC27891c(mo46611a = "ext")
    SystemContent extContent;
    @AbstractC27891c(mo46611a = "is_card")
    public boolean isCard;
    private long mSendStartTime;
    protected String msgHint = "";
    @AbstractC27891c(mo46611a = "prev_id")
    Long prevId;
    @AbstractC27891c(mo46611a = "root_id")
    Long rootId;
    @AbstractC27891c(mo46611a = "aweType")
    int type;

    static {
        Covode.recordClassIndex(63419);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.PreloadFetcher
    public List<UrlModel> fetchPreload() {
        return null;
    }

    public SharePackage generateSharePackage() {
        return null;
    }

    public boolean isValid() {
        return true;
    }

    public void tryInit() {
    }

    public int getType() {
        return this.type;
    }

    public Map<String, String> eventParam() {
        return Collections.emptyMap();
    }

    public SystemContent getExtContent() {
        setSystem(this.extContent);
        return this.extContent;
    }

    public String getMsgHint() {
        tryInit();
        return this.msgHint;
    }

    public Long getSendStartTime() {
        return Long.valueOf(this.mSendStartTime);
    }

    public String toString() {
        return getClass().getSimpleName() + "{type=" + this.type + ", prevId=" + this.prevId + ", rootId=" + this.rootId + ", isCard=" + this.isCard + ", extContent=" + this.extContent + ", msgHint='" + this.msgHint + '\'' + ", mSendStartTime=" + this.mSendStartTime + '}';
    }

    public void setType(int i) {
        this.type = i;
    }

    public String getQuoteHint(Context context) {
        return getMsgHint();
    }

    public void setExtContent(SystemContent systemContent) {
        setSystem(systemContent);
        this.extContent = systemContent;
    }

    public void setSendStartTime(Long l) {
        this.mSendStartTime = l.longValue();
    }

    public void setSystem(SystemContent systemContent) {
        if (systemContent != null) {
            systemContent.setType(100);
        }
    }

    public static void wrapForward(BaseContent baseContent, long j) {
        if (baseContent != null && j > 0) {
            baseContent.prevId = Long.valueOf(j);
            Long l = baseContent.rootId;
            if (l == null || l.longValue() <= 0) {
                baseContent.rootId = Long.valueOf(j);
            }
        }
    }

    public String wrapMsgHint(boolean z, boolean z2, String str) {
        return getMsgHint();
    }
}
