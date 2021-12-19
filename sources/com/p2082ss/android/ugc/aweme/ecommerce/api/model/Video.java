package com.p2082ss.android.ugc.aweme.ecommerce.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.api.model.Video */
public final class Video implements Parcelable {
    public static final Parcelable.Creator<Video> CREATOR = new C43610a();
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: a */
    public final String f101644a;
    @AbstractC27891c(mo46611a = "duration")

    /* renamed from: b */
    public final Double f101645b;
    @AbstractC27891c(mo46611a = "post_url")

    /* renamed from: c */
    public final String f101646c;
    @AbstractC27891c(mo46611a = "media_type")

    /* renamed from: d */
    public final String f101647d;
    @AbstractC27891c(mo46611a = "video_infos")

    /* renamed from: e */
    public final List<VideoInfo> f101648e;

    static {
        Covode.recordClassIndex(51866);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Video)) {
            return false;
        }
        Video video = (Video) obj;
        return C89219l.m154714a(this.f101644a, video.f101644a) && C89219l.m154714a(this.f101645b, video.f101645b) && C89219l.m154714a(this.f101646c, video.f101646c) && C89219l.m154714a(this.f101647d, video.f101647d) && C89219l.m154714a(this.f101648e, video.f101648e);
    }

    public final int hashCode() {
        String str = this.f101644a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Double d = this.f101645b;
        int hashCode2 = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        String str2 = this.f101646c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f101647d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        List<VideoInfo> list = this.f101648e;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "Video(id=" + this.f101644a + ", duration=" + this.f101645b + ", postUrl=" + this.f101646c + ", mediaType=" + this.f101647d + ", urls=" + this.f101648e + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.f101644a);
        Double d = this.f101645b;
        if (d != null) {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f101646c);
        parcel.writeString(this.f101647d);
        List<VideoInfo> list = this.f101648e;
        if (list != null) {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (VideoInfo videoInfo : list) {
                videoInfo.writeToParcel(parcel, 0);
            }
            return;
        }
        parcel.writeInt(0);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.api.model.Video$a */
    public static class C43610a implements Parcelable.Creator<Video> {
        static {
            Covode.recordClassIndex(51867);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Video[] newArray(int i) {
            return new Video[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Video createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            String readString = parcel.readString();
            ArrayList arrayList = null;
            Double valueOf = parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null;
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList.add(VideoInfo.CREATOR.createFromParcel(parcel));
                    readInt--;
                }
            }
            return new Video(readString, valueOf, readString2, readString3, arrayList);
        }
    }

    public Video(String str, Double d, String str2, String str3, List<VideoInfo> list) {
        this.f101644a = str;
        this.f101645b = d;
        this.f101646c = str2;
        this.f101647d = str3;
        this.f101648e = list;
    }
}
