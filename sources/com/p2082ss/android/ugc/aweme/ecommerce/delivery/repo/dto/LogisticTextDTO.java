package com.p2082ss.android.ugc.aweme.ecommerce.delivery.repo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.LogisticTextDTO */
public final class LogisticTextDTO implements Parcelable {
    public static final Parcelable.Creator<LogisticTextDTO> CREATOR = new C44452a();
    @AbstractC27891c(mo46611a = "discount_desc_text")

    /* renamed from: a */
    public final String f103625a;
    @AbstractC27891c(mo46611a = "service_text")

    /* renamed from: b */
    public final String f103626b;
    @AbstractC27891c(mo46611a = "lead_time_text")

    /* renamed from: c */
    public final String f103627c;
    @AbstractC27891c(mo46611a = "delivery_status_text")

    /* renamed from: d */
    public final String f103628d;
    @AbstractC27891c(mo46611a = "threshold_text")

    /* renamed from: e */
    public final String f103629e;
    @AbstractC27891c(mo46611a = "threshold_text_en")

    /* renamed from: f */
    public final String f103630f;

    static {
        Covode.recordClassIndex(52793);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogisticTextDTO)) {
            return false;
        }
        LogisticTextDTO logisticTextDTO = (LogisticTextDTO) obj;
        return C89219l.m154714a(this.f103625a, logisticTextDTO.f103625a) && C89219l.m154714a(this.f103626b, logisticTextDTO.f103626b) && C89219l.m154714a(this.f103627c, logisticTextDTO.f103627c) && C89219l.m154714a(this.f103628d, logisticTextDTO.f103628d) && C89219l.m154714a(this.f103629e, logisticTextDTO.f103629e) && C89219l.m154714a(this.f103630f, logisticTextDTO.f103630f);
    }

    public final int hashCode() {
        String str = this.f103625a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f103626b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f103627c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f103628d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f103629e;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f103630f;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode5 + i;
    }

    public final String toString() {
        return "LogisticTextDTO(discountDescText=" + this.f103625a + ", serviceText=" + this.f103626b + ", leadTimeText=" + this.f103627c + ", deliveryStatusText=" + this.f103628d + ", thresholdText=" + this.f103629e + ", thresholdTextEn=" + this.f103630f + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.f103625a);
        parcel.writeString(this.f103626b);
        parcel.writeString(this.f103627c);
        parcel.writeString(this.f103628d);
        parcel.writeString(this.f103629e);
        parcel.writeString(this.f103630f);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.LogisticTextDTO$a */
    public static class C44452a implements Parcelable.Creator<LogisticTextDTO> {
        static {
            Covode.recordClassIndex(52794);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ LogisticTextDTO[] newArray(int i) {
            return new LogisticTextDTO[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ LogisticTextDTO createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new LogisticTextDTO(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }
    }

    public LogisticTextDTO(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f103625a = str;
        this.f103626b = str2;
        this.f103627c = str3;
        this.f103628d = str4;
        this.f103629e = str5;
        this.f103630f = str6;
    }
}
