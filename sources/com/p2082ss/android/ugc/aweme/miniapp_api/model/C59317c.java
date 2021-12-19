package com.p2082ss.android.ugc.aweme.miniapp_api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.miniapp_api.model.c */
public final class C59317c implements Serializable {
    @AbstractC27891c(mo46611a = "image_url")
    public String imageUrl;
    @AbstractC27891c(mo46611a = "text")
    public String text;
    @AbstractC27891c(mo46611a = "wait_time")
    public int waitTime;

    static {
        Covode.recordClassIndex(69695);
    }

    public C59317c() {
    }

    /* renamed from: com_ss_android_ugc_aweme_miniapp_api_model_MiniAppCard_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m109013xbc707cb(int i) {
        return i;
    }

    public static /* synthetic */ C59317c copy$default(C59317c cVar, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = cVar.imageUrl;
        }
        if ((i2 & 2) != 0) {
            str2 = cVar.text;
        }
        if ((i2 & 4) != 0) {
            i = cVar.waitTime;
        }
        return cVar.copy(str, str2, i);
    }

    public final String component1() {
        return this.imageUrl;
    }

    public final String component2() {
        return this.text;
    }

    public final int component3() {
        return this.waitTime;
    }

    public final C59317c copy(String str, String str2, int i) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        return new C59317c(str, str2, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C59317c)) {
            return false;
        }
        C59317c cVar = (C59317c) obj;
        return C89219l.m154714a(this.imageUrl, cVar.imageUrl) && C89219l.m154714a(this.text, cVar.text) && this.waitTime == cVar.waitTime;
    }

    public final int hashCode() {
        String str = this.imageUrl;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.text;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode + i) * 31) + m109013xbc707cb(this.waitTime);
    }

    public final String toString() {
        return "MiniAppCard(imageUrl=" + this.imageUrl + ", text=" + this.text + ", waitTime=" + this.waitTime + ")";
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getText() {
        return this.text;
    }

    public final int getWaitTime() {
        return this.waitTime;
    }

    public final void setWaitTime(int i) {
        this.waitTime = i;
    }

    public final void setImageUrl(String str) {
        C89219l.m154721d(str, "");
        this.imageUrl = str;
    }

    public final void setText(String str) {
        C89219l.m154721d(str, "");
        this.text = str;
    }

    public C59317c(String str, String str2, int i) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.imageUrl = str;
        this.text = str2;
        this.waitTime = i;
    }
}
