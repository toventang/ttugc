package com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.Icon;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ShopPolicy */
public final class ShopPolicy implements Parcelable {
    public static final Parcelable.Creator<ShopPolicy> CREATOR = new C44885a();
    @AbstractC27891c(mo46611a = StringSet.name)

    /* renamed from: a */
    public final String f104711a;
    @AbstractC27891c(mo46611a = "description")

    /* renamed from: b */
    public final String f104712b;
    @AbstractC27891c(mo46611a = "logo")

    /* renamed from: c */
    public final Icon f104713c;

    static {
        Covode.recordClassIndex(53286);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.f104711a);
        parcel.writeString(this.f104712b);
        Icon icon = this.f104713c;
        if (icon != null) {
            parcel.writeInt(1);
            icon.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ShopPolicy$a */
    public static class C44885a implements Parcelable.Creator<ShopPolicy> {
        static {
            Covode.recordClassIndex(53287);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ShopPolicy[] newArray(int i) {
            return new ShopPolicy[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ShopPolicy createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new ShopPolicy(parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Icon.CREATOR.createFromParcel(parcel) : null);
        }
    }

    public ShopPolicy(String str, String str2, Icon icon) {
        this.f104711a = str;
        this.f104712b = str2;
        this.f104713c = icon;
    }
}
