package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.model.CaptionVideoPlayerItemModel */
public final class CaptionVideoPlayerItemModel implements Serializable {
    @AbstractC27891c(mo46611a = "expire")
    private final long expire;
    @AbstractC27891c(mo46611a = "format")
    private final String format;
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: id */
    private final Integer f114476id;
    @AbstractC27891c(mo46611a = "language_id")
    private final int languageId;
    @AbstractC27891c(mo46611a = "language")
    private final String languageName;
    @AbstractC27891c(mo46611a = "sub_id")
    private final int subId;
    @AbstractC27891c(mo46611a = "url")
    private final String url;

    static {
        Covode.recordClassIndex(58664);
    }

    public CaptionVideoPlayerItemModel() {
        this(null, null, 0, null, 0, null, 0, 127, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_feed_model_CaptionVideoPlayerItemModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m93175xe5c4b3b8(int i) {
        return i;
    }

    /* renamed from: com_ss_android_ugc_aweme_feed_model_CaptionVideoPlayerItemModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m93176xe5c4b3b8(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static /* synthetic */ CaptionVideoPlayerItemModel copy$default(CaptionVideoPlayerItemModel captionVideoPlayerItemModel, Integer num, String str, int i, String str2, long j, String str3, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            num = captionVideoPlayerItemModel.f114476id;
        }
        if ((i3 & 2) != 0) {
            str = captionVideoPlayerItemModel.languageName;
        }
        if ((i3 & 4) != 0) {
            i = captionVideoPlayerItemModel.languageId;
        }
        if ((i3 & 8) != 0) {
            str2 = captionVideoPlayerItemModel.url;
        }
        if ((i3 & 16) != 0) {
            j = captionVideoPlayerItemModel.expire;
        }
        if ((i3 & 32) != 0) {
            str3 = captionVideoPlayerItemModel.format;
        }
        if ((i3 & 64) != 0) {
            i2 = captionVideoPlayerItemModel.subId;
        }
        return captionVideoPlayerItemModel.copy(num, str, i, str2, j, str3, i2);
    }

    public final Integer component1() {
        return this.f114476id;
    }

    public final String component2() {
        return this.languageName;
    }

    public final int component3() {
        return this.languageId;
    }

    public final String component4() {
        return this.url;
    }

    public final long component5() {
        return this.expire;
    }

    public final String component6() {
        return this.format;
    }

    public final int component7() {
        return this.subId;
    }

    public final CaptionVideoPlayerItemModel copy(Integer num, String str, int i, String str2, long j, String str3, int i2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        return new CaptionVideoPlayerItemModel(num, str, i, str2, j, str3, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CaptionVideoPlayerItemModel)) {
            return false;
        }
        CaptionVideoPlayerItemModel captionVideoPlayerItemModel = (CaptionVideoPlayerItemModel) obj;
        return C89219l.m154714a(this.f114476id, captionVideoPlayerItemModel.f114476id) && C89219l.m154714a(this.languageName, captionVideoPlayerItemModel.languageName) && this.languageId == captionVideoPlayerItemModel.languageId && C89219l.m154714a(this.url, captionVideoPlayerItemModel.url) && this.expire == captionVideoPlayerItemModel.expire && C89219l.m154714a(this.format, captionVideoPlayerItemModel.format) && this.subId == captionVideoPlayerItemModel.subId;
    }

    public final int hashCode() {
        Integer num = this.f114476id;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.languageName;
        int hashCode2 = (((hashCode + (str != null ? str.hashCode() : 0)) * 31) + m93175xe5c4b3b8(this.languageId)) * 31;
        String str2 = this.url;
        int hashCode3 = (((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + m93176xe5c4b3b8(this.expire)) * 31;
        String str3 = this.format;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((hashCode3 + i) * 31) + m93175xe5c4b3b8(this.subId);
    }

    public final String toString() {
        return "CaptionVideoPlayerItemModel(id=" + this.f114476id + ", languageName=" + this.languageName + ", languageId=" + this.languageId + ", url=" + this.url + ", expire=" + this.expire + ", format=" + this.format + ", subId=" + this.subId + ")";
    }

    public final long getExpire() {
        return this.expire;
    }

    public final String getFormat() {
        return this.format;
    }

    public final Integer getId() {
        return this.f114476id;
    }

    public final int getLanguageId() {
        return this.languageId;
    }

    public final String getLanguageName() {
        return this.languageName;
    }

    public final int getSubId() {
        return this.subId;
    }

    public final String getUrl() {
        return this.url;
    }

    public CaptionVideoPlayerItemModel(Integer num, String str, int i, String str2, long j, String str3, int i2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f114476id = num;
        this.languageName = str;
        this.languageId = i;
        this.url = str2;
        this.expire = j;
        this.format = str3;
        this.subId = i2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CaptionVideoPlayerItemModel(java.lang.Integer r10, java.lang.String r11, int r12, java.lang.String r13, long r14, java.lang.String r16, int r17, int r18, p4600h.p4611f.p4613b.C89214g r19) {
        /*
            r9 = this;
            r5 = r14
            r1 = r10
            r2 = r11
            r4 = r13
            r3 = r12
            r0 = r18 & 1
            if (r0 == 0) goto L_0x000e
            r0 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L_0x000e:
            r0 = r18 & 2
            java.lang.String r7 = ""
            if (r0 == 0) goto L_0x0015
            r2 = r7
        L_0x0015:
            r0 = r18 & 4
            r8 = -1
            if (r0 == 0) goto L_0x001b
            r3 = -1
        L_0x001b:
            r0 = r18 & 8
            if (r0 == 0) goto L_0x0020
            r4 = r7
        L_0x0020:
            r0 = r18 & 16
            if (r0 == 0) goto L_0x0026
            r5 = 0
        L_0x0026:
            r0 = r18 & 32
            if (r0 == 0) goto L_0x0036
        L_0x002a:
            r0 = r18 & 64
            if (r0 == 0) goto L_0x0033
        L_0x002e:
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r7, r8)
            return
        L_0x0033:
            r8 = r17
            goto L_0x002e
        L_0x0036:
            r7 = r16
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.model.CaptionVideoPlayerItemModel.<init>(java.lang.Integer, java.lang.String, int, java.lang.String, long, java.lang.String, int, int, h.f.b.g):void");
    }
}
