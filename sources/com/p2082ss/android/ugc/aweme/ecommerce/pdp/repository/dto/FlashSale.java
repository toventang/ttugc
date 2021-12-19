package com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.Image;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.FlashSale */
public final class FlashSale implements Parcelable {
    public static final Parcelable.Creator<FlashSale> CREATOR = new C44873a();

    /* renamed from: j */
    public static final C44874b f104639j = new C44874b((byte) 0);
    @AbstractC27891c(mo46611a = "activity_id")

    /* renamed from: a */
    public final String f104640a;
    @AbstractC27891c(mo46611a = "status")

    /* renamed from: b */
    public final Integer f104641b;
    @AbstractC27891c(mo46611a = "countdown")

    /* renamed from: c */
    public final String f104642c;
    @AbstractC27891c(mo46611a = "start_time")

    /* renamed from: d */
    public final String f104643d;
    @AbstractC27891c(mo46611a = "end_time")

    /* renamed from: e */
    public final String f104644e;
    @AbstractC27891c(mo46611a = "title")

    /* renamed from: f */
    public final String f104645f;
    @AbstractC27891c(mo46611a = "price")

    /* renamed from: g */
    public final String f104646g;
    @AbstractC27891c(mo46611a = "bg_img")

    /* renamed from: h */
    public final Image f104647h;
    @AbstractC27891c(mo46611a = "countdown_bg_img")

    /* renamed from: i */
    public final Image f104648i;

    static {
        Covode.recordClassIndex(53264);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static FlashSale m87569a(String str, Integer num, String str2, String str3, String str4, String str5, String str6, Image image, Image image2) {
        return new FlashSale(str, num, str2, str3, str4, str5, str6, image, image2);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlashSale)) {
            return false;
        }
        FlashSale flashSale = (FlashSale) obj;
        return C89219l.m154714a(this.f104640a, flashSale.f104640a) && C89219l.m154714a(this.f104641b, flashSale.f104641b) && C89219l.m154714a(this.f104642c, flashSale.f104642c) && C89219l.m154714a(this.f104643d, flashSale.f104643d) && C89219l.m154714a(this.f104644e, flashSale.f104644e) && C89219l.m154714a(this.f104645f, flashSale.f104645f) && C89219l.m154714a(this.f104646g, flashSale.f104646g) && C89219l.m154714a(this.f104647h, flashSale.f104647h) && C89219l.m154714a(this.f104648i, flashSale.f104648i);
    }

    public final int hashCode() {
        String str = this.f104640a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Integer num = this.f104641b;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        String str2 = this.f104642c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f104643d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f104644e;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f104645f;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f104646g;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Image image = this.f104647h;
        int hashCode8 = (hashCode7 + (image != null ? image.hashCode() : 0)) * 31;
        Image image2 = this.f104648i;
        if (image2 != null) {
            i = image2.hashCode();
        }
        return hashCode8 + i;
    }

    public final String toString() {
        return "FlashSale(activityId=" + this.f104640a + ", status=" + this.f104641b + ", countdown=" + this.f104642c + ", startTime=" + this.f104643d + ", endTime=" + this.f104644e + ", title=" + this.f104645f + ", price=" + this.f104646g + ", image=" + this.f104647h + ", countdownBg=" + this.f104648i + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.f104640a);
        Integer num = this.f104641b;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f104642c);
        parcel.writeString(this.f104643d);
        parcel.writeString(this.f104644e);
        parcel.writeString(this.f104645f);
        parcel.writeString(this.f104646g);
        Image image = this.f104647h;
        if (image != null) {
            parcel.writeInt(1);
            image.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        Image image2 = this.f104648i;
        if (image2 != null) {
            parcel.writeInt(1);
            image2.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.FlashSale$b */
    public static final class C44874b {
        static {
            Covode.recordClassIndex(53266);
        }

        private C44874b() {
        }

        public /* synthetic */ C44874b(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.FlashSale$a */
    public static class C44873a implements Parcelable.Creator<FlashSale> {
        static {
            Covode.recordClassIndex(53265);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ FlashSale[] newArray(int i) {
            return new FlashSale[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ FlashSale createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            String readString = parcel.readString();
            Image image = null;
            Integer valueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            Image createFromParcel = parcel.readInt() != 0 ? Image.CREATOR.createFromParcel(parcel) : null;
            if (parcel.readInt() != 0) {
                image = Image.CREATOR.createFromParcel(parcel);
            }
            return new FlashSale(readString, valueOf, readString2, readString3, readString4, readString5, readString6, createFromParcel, image);
        }
    }

    public FlashSale(String str, Integer num, String str2, String str3, String str4, String str5, String str6, Image image, Image image2) {
        this.f104640a = str;
        this.f104641b = num;
        this.f104642c = str2;
        this.f104643d = str3;
        this.f104644e = str4;
        this.f104645f = str5;
        this.f104646g = str6;
        this.f104647h = image;
        this.f104648i = image2;
    }
}
