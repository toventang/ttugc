package com.p2082ss.android.ugc.aweme.ecommerce.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.api.model.VideoInfo */
public final class VideoInfo implements Parcelable {
    public static final Parcelable.Creator<VideoInfo> CREATOR = new C43611a();
    @AbstractC27891c(mo46611a = "main_url")

    /* renamed from: a */
    public final String f101649a;
    @AbstractC27891c(mo46611a = "backup_url")

    /* renamed from: b */
    public final String f101650b;
    @AbstractC27891c(mo46611a = "url_expire")

    /* renamed from: c */
    public final Integer f101651c;
    @AbstractC27891c(mo46611a = "width")

    /* renamed from: d */
    public final Integer f101652d;
    @AbstractC27891c(mo46611a = "height")

    /* renamed from: e */
    public final Integer f101653e;
    @AbstractC27891c(mo46611a = "file_hash")

    /* renamed from: f */
    public final String f101654f;
    @AbstractC27891c(mo46611a = "format")

    /* renamed from: g */
    public final String f101655g;
    @AbstractC27891c(mo46611a = "size")

    /* renamed from: h */
    public final Integer f101656h;
    @AbstractC27891c(mo46611a = "bitrate")

    /* renamed from: i */
    public final Integer f101657i;

    static {
        Covode.recordClassIndex(51868);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoInfo)) {
            return false;
        }
        VideoInfo videoInfo = (VideoInfo) obj;
        return C89219l.m154714a(this.f101649a, videoInfo.f101649a) && C89219l.m154714a(this.f101650b, videoInfo.f101650b) && C89219l.m154714a(this.f101651c, videoInfo.f101651c) && C89219l.m154714a(this.f101652d, videoInfo.f101652d) && C89219l.m154714a(this.f101653e, videoInfo.f101653e) && C89219l.m154714a(this.f101654f, videoInfo.f101654f) && C89219l.m154714a(this.f101655g, videoInfo.f101655g) && C89219l.m154714a(this.f101656h, videoInfo.f101656h) && C89219l.m154714a(this.f101657i, videoInfo.f101657i);
    }

    public final int hashCode() {
        String str = this.f101649a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f101650b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.f101651c;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.f101652d;
        int hashCode4 = (hashCode3 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.f101653e;
        int hashCode5 = (hashCode4 + (num3 != null ? num3.hashCode() : 0)) * 31;
        String str3 = this.f101654f;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f101655g;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Integer num4 = this.f101656h;
        int hashCode8 = (hashCode7 + (num4 != null ? num4.hashCode() : 0)) * 31;
        Integer num5 = this.f101657i;
        if (num5 != null) {
            i = num5.hashCode();
        }
        return hashCode8 + i;
    }

    public final String toString() {
        return "VideoInfo(mainUrl=" + this.f101649a + ", backupUrl=" + this.f101650b + ", urlExpire=" + this.f101651c + ", width=" + this.f101652d + ", height=" + this.f101653e + ", fileHash=" + this.f101654f + ", format=" + this.f101655g + ", size=" + this.f101656h + ", bitrate=" + this.f101657i + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.f101649a);
        parcel.writeString(this.f101650b);
        Integer num = this.f101651c;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        } else {
            parcel.writeInt(0);
        }
        Integer num2 = this.f101652d;
        if (num2 != null) {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        } else {
            parcel.writeInt(0);
        }
        Integer num3 = this.f101653e;
        if (num3 != null) {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f101654f);
        parcel.writeString(this.f101655g);
        Integer num4 = this.f101656h;
        if (num4 != null) {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        } else {
            parcel.writeInt(0);
        }
        Integer num5 = this.f101657i;
        if (num5 != null) {
            parcel.writeInt(1);
            parcel.writeInt(num5.intValue());
            return;
        }
        parcel.writeInt(0);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.api.model.VideoInfo$a */
    public static class C43611a implements Parcelable.Creator<VideoInfo> {
        static {
            Covode.recordClassIndex(51869);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VideoInfo[] newArray(int i) {
            return new VideoInfo[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VideoInfo createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Integer num = null;
            Integer valueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            Integer valueOf2 = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            Integer valueOf3 = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            Integer valueOf4 = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            if (parcel.readInt() != 0) {
                num = Integer.valueOf(parcel.readInt());
            }
            return new VideoInfo(readString, readString2, valueOf, valueOf2, valueOf3, readString3, readString4, valueOf4, num);
        }
    }

    public VideoInfo(String str, String str2, Integer num, Integer num2, Integer num3, String str3, String str4, Integer num4, Integer num5) {
        this.f101649a = str;
        this.f101650b = str2;
        this.f101651c = num;
        this.f101652d = num2;
        this.f101653e = num3;
        this.f101654f = str3;
        this.f101655g = str4;
        this.f101656h = num4;
        this.f101657i = num5;
    }
}
