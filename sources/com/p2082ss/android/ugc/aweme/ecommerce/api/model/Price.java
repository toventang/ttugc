package com.p2082ss.android.ugc.aweme.ecommerce.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.api.model.Price */
public final class Price implements Parcelable, Serializable {
    public static final Parcelable.Creator<Price> CREATOR = new C43606a();
    @AbstractC27891c(mo46611a = "currency")
    private final String currency;
    @AbstractC27891c(mo46611a = "price_str")
    private final String priceStr;
    @AbstractC27891c(mo46611a = "price_text_color")
    private final Integer priceTextColor;
    @AbstractC27891c(mo46611a = "price_val")
    private final String priceVal;
    @AbstractC27891c(mo46611a = "promotions")
    private final List<Promotion> promotions;

    static {
        Covode.recordClassIndex(51858);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.ecommerce.api.model.Price */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Price copy$default(Price price, String str, String str2, String str3, List list, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = price.priceStr;
        }
        if ((i & 2) != 0) {
            str2 = price.priceVal;
        }
        if ((i & 4) != 0) {
            str3 = price.currency;
        }
        if ((i & 8) != 0) {
            list = price.promotions;
        }
        if ((i & 16) != 0) {
            num = price.priceTextColor;
        }
        return price.copy(str, str2, str3, list, num);
    }

    public final String component1() {
        return this.priceStr;
    }

    public final String component2() {
        return this.priceVal;
    }

    public final String component3() {
        return this.currency;
    }

    public final List<Promotion> component4() {
        return this.promotions;
    }

    public final Integer component5() {
        return this.priceTextColor;
    }

    public final Price copy(String str, String str2, String str3, List<Promotion> list, Integer num) {
        return new Price(str, str2, str3, list, num);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Price)) {
            return false;
        }
        Price price = (Price) obj;
        return C89219l.m154714a(this.priceStr, price.priceStr) && C89219l.m154714a(this.priceVal, price.priceVal) && C89219l.m154714a(this.currency, price.currency) && C89219l.m154714a(this.promotions, price.promotions) && C89219l.m154714a(this.priceTextColor, price.priceTextColor);
    }

    public final int hashCode() {
        String str = this.priceStr;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.priceVal;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.currency;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        List<Promotion> list = this.promotions;
        int hashCode4 = (hashCode3 + (list != null ? list.hashCode() : 0)) * 31;
        Integer num = this.priceTextColor;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "Price(priceStr=" + this.priceStr + ", priceVal=" + this.priceVal + ", currency=" + this.currency + ", promotions=" + this.promotions + ", priceTextColor=" + this.priceTextColor + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.priceStr);
        parcel.writeString(this.priceVal);
        parcel.writeString(this.currency);
        List<Promotion> list = this.promotions;
        if (list != null) {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (Promotion promotion : list) {
                promotion.writeToParcel(parcel, 0);
            }
        } else {
            parcel.writeInt(0);
        }
        Integer num = this.priceTextColor;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
            return;
        }
        parcel.writeInt(0);
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getPriceStr() {
        return this.priceStr;
    }

    public final Integer getPriceTextColor() {
        return this.priceTextColor;
    }

    public final String getPriceVal() {
        return this.priceVal;
    }

    public final List<Promotion> getPromotions() {
        return this.promotions;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.api.model.Price$a */
    public static class C43606a implements Parcelable.Creator<Price> {
        static {
            Covode.recordClassIndex(51859);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Price[] newArray(int i) {
            return new Price[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Price createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            C89219l.m154721d(parcel, "");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            Integer num = null;
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList.add(Promotion.CREATOR.createFromParcel(parcel));
                    readInt--;
                }
            } else {
                arrayList = null;
            }
            if (parcel.readInt() != 0) {
                num = Integer.valueOf(parcel.readInt());
            }
            return new Price(readString, readString2, readString3, arrayList, num);
        }
    }

    public Price(String str, String str2, String str3, List<Promotion> list, Integer num) {
        this.priceStr = str;
        this.priceVal = str2;
        this.currency = str3;
        this.promotions = list;
        this.priceTextColor = num;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Price(String str, String str2, String str3, List list, Integer num, int i, C89214g gVar) {
        this(str, str2, str3, list, (i & 16) != 0 ? 0 : num);
    }
}
