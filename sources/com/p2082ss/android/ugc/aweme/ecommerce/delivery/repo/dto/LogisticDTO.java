package com.p2082ss.android.ugc.aweme.ecommerce.delivery.repo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.Price;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.LogisticDTO */
public final class LogisticDTO implements Parcelable {
    public static final Parcelable.Creator<LogisticDTO> CREATOR = new C44451a();
    @AbstractC27891c(mo46611a = "delivery_option")

    /* renamed from: a */
    public final int f103614a;
    @AbstractC27891c(mo46611a = "delivery_name")

    /* renamed from: b */
    public final String f103615b;
    @AbstractC27891c(mo46611a = "is_default")

    /* renamed from: c */
    public final Boolean f103616c;
    @AbstractC27891c(mo46611a = "reachable")

    /* renamed from: d */
    public final Boolean f103617d;
    @AbstractC27891c(mo46611a = "lead_time")

    /* renamed from: e */
    public final String f103618e;
    @AbstractC27891c(mo46611a = "shipping_fee")

    /* renamed from: f */
    public final Price f103619f;
    @AbstractC27891c(mo46611a = "original_shipping_fee")

    /* renamed from: g */
    public final String f103620g;
    @AbstractC27891c(mo46611a = "free_shipping")

    /* renamed from: h */
    public final Boolean f103621h;
    @AbstractC27891c(mo46611a = "shipping_discount")

    /* renamed from: i */
    public final Boolean f103622i;
    @AbstractC27891c(mo46611a = "logistic_text")

    /* renamed from: j */
    public final LogisticTextDTO f103623j;
    @AbstractC27891c(mo46611a = "logistics_service_id")

    /* renamed from: k */
    public final String f103624k;

    static {
        Covode.recordClassIndex(52791);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeInt(this.f103614a);
        parcel.writeString(this.f103615b);
        Boolean bool = this.f103616c;
        if (bool != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else {
            parcel.writeInt(0);
        }
        Boolean bool2 = this.f103617d;
        if (bool2 != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f103618e);
        Price price = this.f103619f;
        if (price != null) {
            parcel.writeInt(1);
            price.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f103620g);
        Boolean bool3 = this.f103621h;
        if (bool3 != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        } else {
            parcel.writeInt(0);
        }
        Boolean bool4 = this.f103622i;
        if (bool4 != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool4.booleanValue() ? 1 : 0);
        } else {
            parcel.writeInt(0);
        }
        LogisticTextDTO logisticTextDTO = this.f103623j;
        if (logisticTextDTO != null) {
            parcel.writeInt(1);
            logisticTextDTO.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f103624k);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.LogisticDTO$a */
    public static class C44451a implements Parcelable.Creator<LogisticDTO> {
        static {
            Covode.recordClassIndex(52792);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ LogisticDTO[] newArray(int i) {
            return new LogisticDTO[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ LogisticDTO createFromParcel(Parcel parcel) {
            Boolean bool;
            Boolean bool2;
            Boolean bool3;
            Boolean bool4;
            C89219l.m154721d(parcel, "");
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            boolean z = true;
            LogisticTextDTO logisticTextDTO = null;
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            } else {
                bool = null;
            }
            if (parcel.readInt() != 0) {
                bool2 = Boolean.valueOf(parcel.readInt() != 0);
            } else {
                bool2 = null;
            }
            String readString2 = parcel.readString();
            Price createFromParcel = parcel.readInt() != 0 ? Price.CREATOR.createFromParcel(parcel) : null;
            String readString3 = parcel.readString();
            if (parcel.readInt() != 0) {
                bool3 = Boolean.valueOf(parcel.readInt() != 0);
            } else {
                bool3 = null;
            }
            if (parcel.readInt() != 0) {
                if (parcel.readInt() == 0) {
                    z = false;
                }
                bool4 = Boolean.valueOf(z);
            } else {
                bool4 = null;
            }
            if (parcel.readInt() != 0) {
                logisticTextDTO = LogisticTextDTO.CREATOR.createFromParcel(parcel);
            }
            return new LogisticDTO(readInt, readString, bool, bool2, readString2, createFromParcel, readString3, bool3, bool4, logisticTextDTO, parcel.readString());
        }
    }

    public LogisticDTO(int i, String str, Boolean bool, Boolean bool2, String str2, Price price, String str3, Boolean bool3, Boolean bool4, LogisticTextDTO logisticTextDTO, String str4) {
        this.f103614a = i;
        this.f103615b = str;
        this.f103616c = bool;
        this.f103617d = bool2;
        this.f103618e = str2;
        this.f103619f = price;
        this.f103620g = str3;
        this.f103621h = bool3;
        this.f103622i = bool4;
        this.f103623j = logisticTextDTO;
        this.f103624k = str4;
    }
}
