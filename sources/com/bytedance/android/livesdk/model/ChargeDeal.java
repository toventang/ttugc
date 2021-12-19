package com.bytedance.android.livesdk.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;

public class ChargeDeal implements Parcelable {
    public static final Parcelable.Creator<ChargeDeal> CREATOR = new Parcelable.Creator<ChargeDeal>() {
        /* class com.bytedance.android.livesdk.model.ChargeDeal.C95091 */

        static {
            Covode.recordClassIndex(11025);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ChargeDeal[] newArray(int i) {
            return new ChargeDeal[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ChargeDeal createFromParcel(Parcel parcel) {
            return new ChargeDeal(parcel);
        }
    };
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: a */
    public long f23068a;
    @AbstractC27891c(mo46611a = "exchange_price")

    /* renamed from: b */
    public int f23069b;
    @AbstractC27891c(mo46611a = "price")

    /* renamed from: c */
    public int f23070c;
    @AbstractC27891c(mo46611a = "describe")

    /* renamed from: d */
    public String f23071d = "";
    @AbstractC27891c(mo46611a = "diamond_count")

    /* renamed from: e */
    public int f23072e;
    @AbstractC27891c(mo46611a = "giving_count")

    /* renamed from: f */
    public int f23073f;
    @AbstractC27891c(mo46611a = "iap_id")

    /* renamed from: g */
    public String f23074g;
    @AbstractC27891c(mo46611a = "currency_price")

    /* renamed from: h */
    public List<CurrencyPrice> f23075h;

    /* renamed from: i */
    public int f23076i;

    /* renamed from: j */
    public boolean f23077j;
    @AbstractC27891c(mo46611a = "coupon_id")

    /* renamed from: k */
    private String f23078k;

    public int describeContents() {
        return 0;
    }

    public ChargeDeal() {
    }

    public static class CurrencyPrice implements Parcelable {
        public static final Parcelable.Creator<CurrencyPrice> CREATOR = new Parcelable.Creator<CurrencyPrice>() {
            /* class com.bytedance.android.livesdk.model.ChargeDeal.CurrencyPrice.C95101 */

            static {
                Covode.recordClassIndex(11027);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ CurrencyPrice[] newArray(int i) {
                return new CurrencyPrice[i];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ CurrencyPrice createFromParcel(Parcel parcel) {
                return new CurrencyPrice(parcel);
            }
        };
        @AbstractC27891c(mo46611a = "currency")

        /* renamed from: a */
        public String f23079a;
        @AbstractC27891c(mo46611a = "price")

        /* renamed from: b */
        public String f23080b;
        @AbstractC27891c(mo46611a = "price_show_form")

        /* renamed from: c */
        public String f23081c;

        public int describeContents() {
            return 0;
        }

        static {
            Covode.recordClassIndex(11026);
        }

        protected CurrencyPrice(Parcel parcel) {
            this.f23079a = parcel.readString();
            this.f23080b = parcel.readString();
            this.f23081c = parcel.readString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f23079a);
            parcel.writeString(this.f23080b);
            parcel.writeString(this.f23081c);
        }
    }

    static {
        Covode.recordClassIndex(11024);
    }

    protected ChargeDeal(Parcel parcel) {
        boolean z;
        this.f23068a = parcel.readLong();
        this.f23069b = parcel.readInt();
        this.f23070c = parcel.readInt();
        this.f23071d = parcel.readString();
        this.f23072e = parcel.readInt();
        this.f23073f = parcel.readInt();
        this.f23074g = parcel.readString();
        this.f23075h = parcel.createTypedArrayList(CurrencyPrice.CREATOR);
        this.f23076i = parcel.readInt();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f23077j = z;
        this.f23078k = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f23068a);
        parcel.writeInt(this.f23069b);
        parcel.writeInt(this.f23070c);
        parcel.writeString(this.f23071d);
        parcel.writeInt(this.f23072e);
        parcel.writeInt(this.f23073f);
        parcel.writeString(this.f23074g);
        parcel.writeTypedList(this.f23075h);
        parcel.writeInt(this.f23076i);
        parcel.writeByte(this.f23077j ? (byte) 1 : 0);
        parcel.writeString(this.f23078k);
    }
}
