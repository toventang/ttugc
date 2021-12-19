package com.p2082ss.android.ugc.aweme.ecommercebase.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.p1477a.p1478a.C20714a;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommercebase.dto.GImage */
public final class GImage implements Parcelable, Serializable {
    public static final Parcelable.Creator<GImage> CREATOR = new C45668a();
    @AbstractC27891c(mo46611a = "height")
    private final Integer height;
    @AbstractC27891c(mo46611a = "mimetype")
    private final String mimetype;
    @AbstractC27891c(mo46611a = "thumb_uri")
    private final String thumbUri;
    @AbstractC27891c(mo46611a = "thumb_url_list")
    private final List<String> thumbUrls;
    @AbstractC27891c(mo46611a = "uri")
    private final String uri;
    @AbstractC27891c(mo46611a = "url_list")
    private final List<String> urls;
    @AbstractC27891c(mo46611a = "width")
    private final Integer width;

    static {
        Covode.recordClassIndex(54175);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.ecommercebase.dto.GImage */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GImage copy$default(GImage gImage, Integer num, Integer num2, String str, String str2, List list, String str3, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = gImage.width;
        }
        if ((i & 2) != 0) {
            num2 = gImage.height;
        }
        if ((i & 4) != 0) {
            str = gImage.mimetype;
        }
        if ((i & 8) != 0) {
            str2 = gImage.uri;
        }
        if ((i & 16) != 0) {
            list = gImage.urls;
        }
        if ((i & 32) != 0) {
            str3 = gImage.thumbUri;
        }
        if ((i & 64) != 0) {
            list2 = gImage.thumbUrls;
        }
        return gImage.copy(num, num2, str, str2, list, str3, list2);
    }

    public final Integer component1() {
        return this.width;
    }

    public final Integer component2() {
        return this.height;
    }

    public final String component3() {
        return this.mimetype;
    }

    public final String component4() {
        return this.uri;
    }

    public final List<String> component5() {
        return this.urls;
    }

    public final String component6() {
        return this.thumbUri;
    }

    public final List<String> component7() {
        return this.thumbUrls;
    }

    public final GImage copy(Integer num, Integer num2, String str, String str2, List<String> list, String str3, List<String> list2) {
        return new GImage(num, num2, str, str2, list, str3, list2);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GImage)) {
            return false;
        }
        GImage gImage = (GImage) obj;
        return C89219l.m154714a(this.width, gImage.width) && C89219l.m154714a(this.height, gImage.height) && C89219l.m154714a(this.mimetype, gImage.mimetype) && C89219l.m154714a(this.uri, gImage.uri) && C89219l.m154714a(this.urls, gImage.urls) && C89219l.m154714a(this.thumbUri, gImage.thumbUri) && C89219l.m154714a(this.thumbUrls, gImage.thumbUrls);
    }

    public final int hashCode() {
        Integer num = this.width;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.height;
        int hashCode2 = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
        String str = this.mimetype;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.uri;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<String> list = this.urls;
        int hashCode5 = (hashCode4 + (list != null ? list.hashCode() : 0)) * 31;
        String str3 = this.thumbUri;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31;
        List<String> list2 = this.thumbUrls;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode6 + i;
    }

    public final String toString() {
        return "GImage(width=" + this.width + ", height=" + this.height + ", mimetype=" + this.mimetype + ", uri=" + this.uri + ", urls=" + this.urls + ", thumbUri=" + this.thumbUri + ", thumbUrls=" + this.thumbUrls + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        Integer num = this.width;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        } else {
            parcel.writeInt(0);
        }
        Integer num2 = this.height;
        if (num2 != null) {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.mimetype);
        parcel.writeString(this.uri);
        parcel.writeStringList(this.urls);
        parcel.writeString(this.thumbUri);
        parcel.writeStringList(this.thumbUrls);
    }

    public final Integer getHeight() {
        return this.height;
    }

    public final String getMimetype() {
        return this.mimetype;
    }

    public final String getThumbUri() {
        return this.thumbUri;
    }

    public final List<String> getThumbUrls() {
        return this.thumbUrls;
    }

    public final String getUri() {
        return this.uri;
    }

    public final List<String> getUrls() {
        return this.urls;
    }

    public final Integer getWidth() {
        return this.width;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommercebase.dto.GImage$a */
    public static class C45668a implements Parcelable.Creator<GImage> {
        static {
            Covode.recordClassIndex(54176);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ GImage[] newArray(int i) {
            return new GImage[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ GImage createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            Integer num = null;
            Integer valueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            if (parcel.readInt() != 0) {
                num = Integer.valueOf(parcel.readInt());
            }
            return new GImage(valueOf, num, parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.createStringArrayList());
        }
    }

    private final C20714a toThumbImageUrlModel() {
        return new C20714a(this.thumbUrls);
    }

    public final C20714a toImageUrlModel() {
        return new C20714a(this.urls);
    }

    public final C20714a toThumbFirstImageUrlModel() {
        List<String> list = this.thumbUrls;
        if (list == null || list.isEmpty()) {
            return toImageUrlModel();
        }
        return toThumbImageUrlModel();
    }

    public GImage(Integer num, Integer num2, String str, String str2, List<String> list, String str3, List<String> list2) {
        this.width = num;
        this.height = num2;
        this.mimetype = str;
        this.uri = str2;
        this.urls = list;
        this.thumbUri = str3;
        this.thumbUrls = list2;
    }
}
