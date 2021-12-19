package com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.Image;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.PickTag */
public final class PickTag implements Parcelable {
    public static final Parcelable.Creator<PickTag> CREATOR = new C44876a();
    @AbstractC27891c(mo46611a = "activity_id")

    /* renamed from: a */
    public final String f104653a;
    @AbstractC27891c(mo46611a = StringSet.name)

    /* renamed from: b */
    public final String f104654b;
    @AbstractC27891c(mo46611a = "icon")

    /* renamed from: c */
    public final Image f104655c;
    @AbstractC27891c(mo46611a = "log_extra")

    /* renamed from: d */
    public final String f104656d;

    static {
        Covode.recordClassIndex(53269);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PickTag)) {
            return false;
        }
        PickTag pickTag = (PickTag) obj;
        return C89219l.m154714a(this.f104653a, pickTag.f104653a) && C89219l.m154714a(this.f104654b, pickTag.f104654b) && C89219l.m154714a(this.f104655c, pickTag.f104655c) && C89219l.m154714a(this.f104656d, pickTag.f104656d);
    }

    public final int hashCode() {
        String str = this.f104653a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f104654b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Image image = this.f104655c;
        int hashCode3 = (hashCode2 + (image != null ? image.hashCode() : 0)) * 31;
        String str3 = this.f104656d;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "PickTag(activityId=" + this.f104653a + ", name=" + this.f104654b + ", icon=" + this.f104655c + ", logExtra=" + this.f104656d + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.f104653a);
        parcel.writeString(this.f104654b);
        Image image = this.f104655c;
        if (image != null) {
            parcel.writeInt(1);
            image.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f104656d);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.PickTag$a */
    public static class C44876a implements Parcelable.Creator<PickTag> {
        static {
            Covode.recordClassIndex(53270);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ PickTag[] newArray(int i) {
            return new PickTag[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PickTag createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new PickTag(parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Image.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }
    }

    private /* synthetic */ PickTag() {
        this(null, null, null, null);
    }

    public PickTag(String str, String str2, Image image, String str3) {
        this.f104653a = str;
        this.f104654b = str2;
        this.f104655c = image;
        this.f104656d = str3;
    }
}
