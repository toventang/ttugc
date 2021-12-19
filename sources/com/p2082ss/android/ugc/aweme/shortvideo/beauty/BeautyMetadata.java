package com.p2082ss.android.ugc.aweme.shortvideo.beauty;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.beauty.BeautyMetadata */
public final class BeautyMetadata implements Parcelable, Serializable {
    public static final C69856a CREATOR = new C69856a((byte) 0);
    @AbstractC27891c(mo46611a = "te_record_beauty_name")

    /* renamed from: a */
    private String f156105a;
    @AbstractC27891c(mo46611a = "te_record_beauty_strength")

    /* renamed from: b */
    private String f156106b;
    @AbstractC27891c(mo46611a = "te_record_beauty_id")

    /* renamed from: c */
    private String f156107c;
    @AbstractC27891c(mo46611a = "te_record_beauty_res")

    /* renamed from: d */
    private String f156108d;
    @AbstractC27891c(mo46611a = "te_record_beauty_res_valid")

    /* renamed from: e */
    private String f156109e;

    static {
        Covode.recordClassIndex(82264);
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.beauty.BeautyMetadata$a */
    public static final class C69856a implements Parcelable.Creator<BeautyMetadata> {
        static {
            Covode.recordClassIndex(82265);
        }

        private C69856a() {
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ BeautyMetadata[] newArray(int i) {
            return new BeautyMetadata[i];
        }

        public /* synthetic */ C69856a(byte b) {
            this();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ BeautyMetadata createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new BeautyMetadata(parcel);
        }
    }

    public final String getBeautyId() {
        return this.f156107c;
    }

    public final String getBeautyName() {
        return this.f156105a;
    }

    public final String getBeautyRes() {
        return this.f156108d;
    }

    public final String getBeautyStrength() {
        return this.f156106b;
    }

    public final String getBeautyValid() {
        return this.f156109e;
    }

    public BeautyMetadata() {
        this.f156105a = "";
        this.f156106b = "";
        this.f156107c = "";
        this.f156108d = "";
        this.f156109e = "";
    }

    public final String toString() {
        return "BeautyMetadata:id=" + this.f156107c + ",name=" + this.f156105a + ",strength=" + this.f156106b + ",res=" + this.f156108d + ",valid=" + this.f156109e;
    }

    public final void setBeautyId(String str) {
        C89219l.m154721d(str, "");
        this.f156107c = str;
    }

    public final void setBeautyName(String str) {
        C89219l.m154721d(str, "");
        this.f156105a = str;
    }

    public final void setBeautyRes(String str) {
        C89219l.m154721d(str, "");
        this.f156108d = str;
    }

    public final void setBeautyStrength(String str) {
        C89219l.m154721d(str, "");
        this.f156106b = str;
    }

    public final void setBeautyValid(String str) {
        C89219l.m154721d(str, "");
        this.f156109e = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BeautyMetadata(Parcel parcel) {
        this();
        String str = "";
        C89219l.m154721d(parcel, str);
        String readString = parcel.readString();
        this.f156105a = readString == null ? str : readString;
        String readString2 = parcel.readString();
        this.f156106b = readString2 == null ? str : readString2;
        String readString3 = parcel.readString();
        this.f156107c = readString3 == null ? str : readString3;
        String readString4 = parcel.readString();
        this.f156108d = readString4 == null ? str : readString4;
        String readString5 = parcel.readString();
        this.f156109e = readString5 != null ? readString5 : str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (parcel != null) {
            parcel.writeString(this.f156105a);
            parcel.writeString(this.f156106b);
            parcel.writeString(this.f156107c);
            parcel.writeString(this.f156108d);
            parcel.writeString(this.f156109e);
        }
    }
}
