package com.p2082ss.android.ugc.aweme.sticker.data;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.sticker.data.CountDownStickerStruct */
public final class CountDownStickerStruct implements Serializable {
    @AbstractC27891c(mo46611a = "end_time")
    public Long expiredTime;
    @AbstractC27891c(mo46611a = "is_subscribed")
    public Boolean subscribe;
    @AbstractC27891c(mo46611a = "subscribe_count")
    public long subscribeNum;
    @AbstractC27891c(mo46611a = "text_already_ended")
    public String textAlreadyExpired;
    @AbstractC27891c(mo46611a = "text_already_subscribed")
    public String textAlreadySubscribed;
    @AbstractC27891c(mo46611a = "text_to_be_subscribed")
    public String textTobeSubscribed;
    @AbstractC27891c(mo46611a = "title")
    public String title;

    static {
        Covode.recordClassIndex(88206);
    }

    public CountDownStickerStruct() {
        this(null, 0, 0, null, null, null, null, 127, null);
    }

    public final Long getExpiredTime() {
        return this.expiredTime;
    }

    public final Boolean getSubscribe() {
        return this.subscribe;
    }

    public final long getSubscribeNum() {
        return this.subscribeNum;
    }

    public final String getTextAlreadyExpired() {
        return this.textAlreadyExpired;
    }

    public final String getTextAlreadySubscribed() {
        return this.textAlreadySubscribed;
    }

    public final String getTextTobeSubscribed() {
        return this.textTobeSubscribed;
    }

    public final String getTitle() {
        return this.title;
    }

    public final long getMillSecond() {
        Long l = this.expiredTime;
        if (l != null) {
            return l.longValue() * 1000;
        }
        return 0;
    }

    public final void setExpiredTime(Long l) {
        this.expiredTime = l;
    }

    public final void setSubscribe(Boolean bool) {
        this.subscribe = bool;
    }

    public final void setSubscribeNum(long j) {
        this.subscribeNum = j;
    }

    public final void setTextAlreadyExpired(String str) {
        this.textAlreadyExpired = str;
    }

    public final void setTextAlreadySubscribed(String str) {
        this.textAlreadySubscribed = str;
    }

    public final void setTextTobeSubscribed(String str) {
        this.textTobeSubscribed = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public CountDownStickerStruct(String str, long j, long j2, Boolean bool, String str2, String str3, String str4) {
        this.title = str;
        this.subscribeNum = j2;
        this.subscribe = bool;
        this.textAlreadyExpired = str2;
        this.textTobeSubscribed = str3;
        this.textAlreadySubscribed = str4;
        this.expiredTime = Long.valueOf(j);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CountDownStickerStruct(java.lang.String r11, long r12, long r14, java.lang.Boolean r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, int r20, p4600h.p4611f.p4613b.C89214g r21) {
        /*
            r10 = this;
            r8 = r18
            r1 = r11
            r2 = r12
            r6 = r16
            r7 = r17
            r0 = r20 & 1
            if (r0 == 0) goto L_0x000d
            r1 = 0
        L_0x000d:
            r0 = r20 & 2
            r4 = 0
            if (r0 == 0) goto L_0x0015
            r2 = 0
        L_0x0015:
            r0 = r20 & 4
            if (r0 == 0) goto L_0x003a
        L_0x0019:
            r0 = r20 & 8
            if (r0 == 0) goto L_0x0022
            r0 = 0
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
        L_0x0022:
            r0 = r20 & 16
            java.lang.String r9 = ""
            if (r0 == 0) goto L_0x0029
            r7 = r9
        L_0x0029:
            r0 = r20 & 32
            if (r0 == 0) goto L_0x002e
            r8 = r9
        L_0x002e:
            r0 = r20 & 64
            if (r0 == 0) goto L_0x0037
        L_0x0032:
            r0 = r10
            r0.<init>(r1, r2, r4, r6, r7, r8, r9)
            return
        L_0x0037:
            r9 = r19
            goto L_0x0032
        L_0x003a:
            r4 = r14
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.sticker.data.CountDownStickerStruct.<init>(java.lang.String, long, long, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, int, h.f.b.g):void");
    }
}
