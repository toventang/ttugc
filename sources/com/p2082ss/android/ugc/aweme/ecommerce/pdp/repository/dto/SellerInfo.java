package com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.Image;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.SellerInfo */
public final class SellerInfo implements Parcelable {
    public static final Parcelable.Creator<SellerInfo> CREATOR = new C44884a();
    @AbstractC27891c(mo46611a = "seller_id")

    /* renamed from: a */
    public final String f104704a;
    @AbstractC27891c(mo46611a = StringSet.name)

    /* renamed from: b */
    public final String f104705b;
    @AbstractC27891c(mo46611a = "avatar")

    /* renamed from: c */
    public final Image f104706c;
    @AbstractC27891c(mo46611a = "product_count")

    /* renamed from: d */
    public final Long f104707d;
    @AbstractC27891c(mo46611a = "rating")

    /* renamed from: e */
    public final String f104708e;
    @AbstractC27891c(mo46611a = "link")

    /* renamed from: f */
    public final String f104709f;
    @AbstractC27891c(mo46611a = "im_schema")

    /* renamed from: g */
    public final String f104710g;

    static {
        Covode.recordClassIndex(53284);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SellerInfo)) {
            return false;
        }
        SellerInfo sellerInfo = (SellerInfo) obj;
        return C89219l.m154714a(this.f104704a, sellerInfo.f104704a) && C89219l.m154714a(this.f104705b, sellerInfo.f104705b) && C89219l.m154714a(this.f104706c, sellerInfo.f104706c) && C89219l.m154714a(this.f104707d, sellerInfo.f104707d) && C89219l.m154714a(this.f104708e, sellerInfo.f104708e) && C89219l.m154714a(this.f104709f, sellerInfo.f104709f) && C89219l.m154714a(this.f104710g, sellerInfo.f104710g);
    }

    public final int hashCode() {
        String str = this.f104704a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f104705b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Image image = this.f104706c;
        int hashCode3 = (hashCode2 + (image != null ? image.hashCode() : 0)) * 31;
        Long l = this.f104707d;
        int hashCode4 = (hashCode3 + (l != null ? l.hashCode() : 0)) * 31;
        String str3 = this.f104708e;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f104709f;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f104710g;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode6 + i;
    }

    public final String toString() {
        return "SellerInfo(sellerId=" + this.f104704a + ", name=" + this.f104705b + ", avatar=" + this.f104706c + ", productCount=" + this.f104707d + ", rating=" + this.f104708e + ", link=" + this.f104709f + ", imSchema=" + this.f104710g + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.f104704a);
        parcel.writeString(this.f104705b);
        Image image = this.f104706c;
        if (image != null) {
            parcel.writeInt(1);
            image.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        Long l = this.f104707d;
        if (l != null) {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f104708e);
        parcel.writeString(this.f104709f);
        parcel.writeString(this.f104710g);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.SellerInfo$a */
    public static class C44884a implements Parcelable.Creator<SellerInfo> {
        static {
            Covode.recordClassIndex(53285);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ SellerInfo[] newArray(int i) {
            return new SellerInfo[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ SellerInfo createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Long l = null;
            Image createFromParcel = parcel.readInt() != 0 ? Image.CREATOR.createFromParcel(parcel) : null;
            if (parcel.readInt() != 0) {
                l = Long.valueOf(parcel.readLong());
            }
            return new SellerInfo(readString, readString2, createFromParcel, l, parcel.readString(), parcel.readString(), parcel.readString());
        }
    }

    /* renamed from: a */
    public final SellerInfo mo76047a(SellerInfo sellerInfo) {
        if (sellerInfo == null) {
            return this;
        }
        String str = sellerInfo.f104704a;
        if (str == null) {
            str = this.f104704a;
        }
        String str2 = sellerInfo.f104705b;
        if (str2 == null) {
            str2 = this.f104705b;
        }
        Image image = sellerInfo.f104706c;
        if (image == null) {
            image = this.f104706c;
        }
        Long l = sellerInfo.f104707d;
        if (l == null) {
            l = this.f104707d;
        }
        String str3 = sellerInfo.f104708e;
        if (str3 == null) {
            str3 = this.f104708e;
        }
        String str4 = sellerInfo.f104709f;
        if (str4 == null) {
            str4 = this.f104709f;
        }
        String str5 = sellerInfo.f104710g;
        if (str5 == null) {
            str5 = this.f104710g;
        }
        return new SellerInfo(str, str2, image, l, str3, str4, str5);
    }

    public SellerInfo(String str, String str2, Image image, Long l, String str3, String str4, String str5) {
        this.f104704a = str;
        this.f104705b = str2;
        this.f104706c = image;
        this.f104707d = l;
        this.f104708e = str3;
        this.f104709f = str4;
        this.f104710g = str5;
    }
}
