package com.p2082ss.android.ugc.aweme.feed.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.model.GreenScreenMaterial */
public final class GreenScreenMaterial implements Parcelable, Serializable {
    public static final Parcelable.Creator<GreenScreenMaterial> CREATOR = new Creator();
    public static final Companion Companion = new Companion(null);
    public static final String[] MEDIA_TYPE_STRING = {"all", UGCMonitor.TYPE_PHOTO, "video", "giphy"};
    @AbstractC27891c(mo46611a = "author_name")
    public String authorName;
    @AbstractC27891c(mo46611a = "end_time")
    public long endTime;
    public String localPath;
    public String mediasource;
    @AbstractC27891c(mo46611a = "resource_id")
    public String resId;
    @AbstractC27891c(mo46611a = "start_time")
    public long startTime;
    @AbstractC27891c(mo46611a = "effect_id")
    public String stickerId;
    @AbstractC27891c(mo46611a = StringSet.type)
    public int type;

    /* renamed from: com.ss.android.ugc.aweme.feed.model.GreenScreenMaterial$Creator */
    public static class Creator implements Parcelable.Creator<GreenScreenMaterial> {
        static {
            Covode.recordClassIndex(58700);
        }

        @Override // android.os.Parcelable.Creator
        public final GreenScreenMaterial createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new GreenScreenMaterial(parcel.readInt(), parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GreenScreenMaterial[] newArray(int i) {
            return new GreenScreenMaterial[i];
        }
    }

    public GreenScreenMaterial() {
        this(0, 0, 0, null, null, null, null, null, 255, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_feed_model_GreenScreenMaterial_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m93178xa4e7fe4e(int i) {
        return i;
    }

    /* renamed from: com_ss_android_ugc_aweme_feed_model_GreenScreenMaterial_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m93179xa4e7fe4e(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static /* synthetic */ GreenScreenMaterial copy$default(GreenScreenMaterial greenScreenMaterial, int i, long j, long j2, String str, String str2, String str3, String str4, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = greenScreenMaterial.type;
        }
        if ((i2 & 2) != 0) {
            j = greenScreenMaterial.startTime;
        }
        if ((i2 & 4) != 0) {
            j2 = greenScreenMaterial.endTime;
        }
        if ((i2 & 8) != 0) {
            str = greenScreenMaterial.resId;
        }
        if ((i2 & 16) != 0) {
            str2 = greenScreenMaterial.authorName;
        }
        if ((i2 & 32) != 0) {
            str3 = greenScreenMaterial.stickerId;
        }
        if ((i2 & 64) != 0) {
            str4 = greenScreenMaterial.localPath;
        }
        if ((i2 & 128) != 0) {
            str5 = greenScreenMaterial.mediasource;
        }
        return greenScreenMaterial.copy(i, j, j2, str, str2, str3, str4, str5);
    }

    public final int component1() {
        return this.type;
    }

    public final long component2() {
        return this.startTime;
    }

    public final long component3() {
        return this.endTime;
    }

    public final String component4() {
        return this.resId;
    }

    public final String component5() {
        return this.authorName;
    }

    public final String component6() {
        return this.stickerId;
    }

    public final String component7() {
        return this.localPath;
    }

    public final String component8() {
        return this.mediasource;
    }

    public final GreenScreenMaterial copy(int i, long j, long j2, String str, String str2, String str3, String str4, String str5) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        C89219l.m154721d(str5, "");
        return new GreenScreenMaterial(i, j, j2, str, str2, str3, str4, str5);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GreenScreenMaterial)) {
            return false;
        }
        GreenScreenMaterial greenScreenMaterial = (GreenScreenMaterial) obj;
        return this.type == greenScreenMaterial.type && this.startTime == greenScreenMaterial.startTime && this.endTime == greenScreenMaterial.endTime && C89219l.m154714a(this.resId, greenScreenMaterial.resId) && C89219l.m154714a(this.authorName, greenScreenMaterial.authorName) && C89219l.m154714a(this.stickerId, greenScreenMaterial.stickerId) && C89219l.m154714a(this.localPath, greenScreenMaterial.localPath) && C89219l.m154714a(this.mediasource, greenScreenMaterial.mediasource);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_feed_model_GreenScreenMaterial_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = ((((m93178xa4e7fe4e(this.type) * 31) + m93179xa4e7fe4e(this.startTime)) * 31) + m93179xa4e7fe4e(this.endTime)) * 31;
        String str = this.resId;
        int i = 0;
        int hashCode = (com_ss_android_ugc_aweme_feed_model_GreenScreenMaterial_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.authorName;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.stickerId;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.localPath;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.mediasource;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "GreenScreenMaterial(type=" + this.type + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", resId=" + this.resId + ", authorName=" + this.authorName + ", stickerId=" + this.stickerId + ", localPath=" + this.localPath + ", mediasource=" + this.mediasource + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeInt(this.type);
        parcel.writeLong(this.startTime);
        parcel.writeLong(this.endTime);
        parcel.writeString(this.resId);
        parcel.writeString(this.authorName);
        parcel.writeString(this.stickerId);
        parcel.writeString(this.localPath);
        parcel.writeString(this.mediasource);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.model.GreenScreenMaterial$Companion */
    public static final class Companion {
        static {
            Covode.recordClassIndex(58699);
        }

        private Companion() {
        }

        public final String[] getMEDIA_TYPE_STRING() {
            return GreenScreenMaterial.MEDIA_TYPE_STRING;
        }

        public /* synthetic */ Companion(C89214g gVar) {
            this();
        }
    }

    public final String getAuthorName() {
        return this.authorName;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final String getLocalPath() {
        return this.localPath;
    }

    public final String getMediasource() {
        return this.mediasource;
    }

    public final String getResId() {
        return this.resId;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final String getStickerId() {
        return this.stickerId;
    }

    public final int getType() {
        return this.type;
    }

    static {
        Covode.recordClassIndex(58698);
    }

    public final void setEndTime(long j) {
        this.endTime = j;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setAuthorName(String str) {
        C89219l.m154721d(str, "");
        this.authorName = str;
    }

    public final void setLocalPath(String str) {
        C89219l.m154721d(str, "");
        this.localPath = str;
    }

    public final void setMediasource(String str) {
        C89219l.m154721d(str, "");
        this.mediasource = str;
    }

    public final void setResId(String str) {
        C89219l.m154721d(str, "");
        this.resId = str;
    }

    public final void setStickerId(String str) {
        C89219l.m154721d(str, "");
        this.stickerId = str;
    }

    public GreenScreenMaterial(int i, long j, long j2, String str, String str2, String str3, String str4, String str5) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        C89219l.m154721d(str5, "");
        this.type = i;
        this.startTime = j;
        this.endTime = j2;
        this.resId = str;
        this.authorName = str2;
        this.stickerId = str3;
        this.localPath = str4;
        this.mediasource = str5;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ GreenScreenMaterial(int r13, long r14, long r16, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, int r23, p4600h.p4611f.p4613b.C89214g r24) {
        /*
            r12 = this;
            r1 = r23
            r9 = r20
            r10 = r21
            r3 = r14
            r7 = r18
            r2 = r13
            r8 = r19
            r0 = r1 & 1
            if (r0 == 0) goto L_0x0011
            r2 = 1
        L_0x0011:
            r0 = r1 & 2
            r5 = 0
            if (r0 == 0) goto L_0x0019
            r3 = 0
        L_0x0019:
            r0 = r1 & 4
            if (r0 == 0) goto L_0x003f
        L_0x001d:
            r0 = r1 & 8
            java.lang.String r11 = ""
            if (r0 == 0) goto L_0x0024
            r7 = r11
        L_0x0024:
            r0 = r1 & 16
            if (r0 == 0) goto L_0x0029
            r8 = r11
        L_0x0029:
            r0 = r1 & 32
            if (r0 == 0) goto L_0x002e
            r9 = r11
        L_0x002e:
            r0 = r1 & 64
            if (r0 == 0) goto L_0x0033
            r10 = r11
        L_0x0033:
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x003c
        L_0x0037:
            r1 = r12
            r1.<init>(r2, r3, r5, r7, r8, r9, r10, r11)
            return
        L_0x003c:
            r11 = r22
            goto L_0x0037
        L_0x003f:
            r5 = r16
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.model.GreenScreenMaterial.<init>(int, long, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, h.f.b.g):void");
    }
}
