package com.p2082ss.android.ugc.aweme.ecommerce.address.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.address.dto.Region */
public final class Region implements Parcelable {
    public static final Parcelable.Creator<Region> CREATOR = new C43363b();

    /* renamed from: d */
    public static final C43362a f101208d = new C43362a((byte) 0);
    @AbstractC27891c(mo46611a = StringSet.name)

    /* renamed from: a */
    public final String f101209a;
    @AbstractC27891c(mo46611a = "geoname_id")

    /* renamed from: b */
    public final String f101210b;
    @AbstractC27891c(mo46611a = "code")

    /* renamed from: c */
    public final String f101211c;

    static {
        Covode.recordClassIndex(51586);
    }

    public Region() {
        this(null, null, null, 7);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Region)) {
            return false;
        }
        Region region = (Region) obj;
        return C89219l.m154714a(this.f101209a, region.f101209a) && C89219l.m154714a(this.f101210b, region.f101210b) && C89219l.m154714a(this.f101211c, region.f101211c);
    }

    public final int hashCode() {
        String str = this.f101209a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f101210b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f101211c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "Region(name=" + this.f101209a + ", geoNameId=" + this.f101210b + ", code=" + this.f101211c + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.f101209a);
        parcel.writeString(this.f101210b);
        parcel.writeString(this.f101211c);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.dto.Region$a */
    public static final class C43362a {
        static {
            Covode.recordClassIndex(51587);
        }

        private C43362a() {
        }

        public /* synthetic */ C43362a(byte b) {
            this();
        }

        /* renamed from: a */
        public static boolean m86479a(Region region, Region region2) {
            if (!(region == null || region2 == null)) {
                if (region.f101211c != null && C89219l.m154714a((Object) region.f101211c, (Object) region2.f101211c)) {
                    return true;
                }
                if (region.f101210b == null || !C89219l.m154714a((Object) region.f101210b, (Object) region2.f101210b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.dto.Region$b */
    public static class C43363b implements Parcelable.Creator<Region> {
        static {
            Covode.recordClassIndex(51588);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Region[] newArray(int i) {
            return new Region[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Region createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new Region(parcel.readString(), parcel.readString(), parcel.readString());
        }
    }

    public Region(String str, String str2, String str3) {
        this.f101209a = str;
        this.f101210b = str2;
        this.f101211c = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Region(String str, String str2, String str3, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
