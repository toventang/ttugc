package com.p2082ss.android.ugc.aweme.ecommerce.delivery.repo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.OrderSKUDTO */
public final class OrderSKUDTO implements Parcelable {
    public static final Parcelable.Creator<OrderSKUDTO> CREATOR = new C44453a();
    @AbstractC27891c(mo46611a = "product_id")

    /* renamed from: a */
    public final String f103631a;
    @AbstractC27891c(mo46611a = "sku_id")

    /* renamed from: b */
    public final String f103632b;
    @AbstractC27891c(mo46611a = "quantity")

    /* renamed from: c */
    public final Integer f103633c;
    @AbstractC27891c(mo46611a = "cart_item_id")

    /* renamed from: d */
    public final String f103634d;
    @AbstractC27891c(mo46611a = "source")

    /* renamed from: e */
    public final Integer f103635e;
    @AbstractC27891c(mo46611a = "source_info")

    /* renamed from: f */
    public final String f103636f;
    @AbstractC27891c(mo46611a = "entrance_info")

    /* renamed from: g */
    public final String f103637g;
    @AbstractC27891c(mo46611a = "chain_key")

    /* renamed from: h */
    public final String f103638h;
    @AbstractC27891c(mo46611a = "kol_id")

    /* renamed from: i */
    public String f103639i;

    static {
        Covode.recordClassIndex(52795);
    }

    /* renamed from: a */
    public static /* synthetic */ OrderSKUDTO m87142a(OrderSKUDTO orderSKUDTO, String str, String str2, Integer num, String str3, Integer num2, String str4, String str5, String str6, String str7, int i) {
        String str8 = str7;
        String str9 = str6;
        String str10 = str5;
        String str11 = str4;
        Integer num3 = num2;
        String str12 = str;
        String str13 = str2;
        Integer num4 = num;
        String str14 = str3;
        if ((i & 1) != 0) {
            str12 = orderSKUDTO.f103631a;
        }
        if ((i & 2) != 0) {
            str13 = orderSKUDTO.f103632b;
        }
        if ((i & 4) != 0) {
            num4 = orderSKUDTO.f103633c;
        }
        if ((i & 8) != 0) {
            str14 = orderSKUDTO.f103634d;
        }
        if ((i & 16) != 0) {
            num3 = orderSKUDTO.f103635e;
        }
        if ((i & 32) != 0) {
            str11 = orderSKUDTO.f103636f;
        }
        if ((i & 64) != 0) {
            str10 = orderSKUDTO.f103637g;
        }
        if ((i & 128) != 0) {
            str9 = orderSKUDTO.f103638h;
        }
        if ((i & 256) != 0) {
            str8 = orderSKUDTO.f103639i;
        }
        return m87143a(str12, str13, num4, str14, num3, str11, str10, str9, str8);
    }

    /* renamed from: a */
    private static OrderSKUDTO m87143a(String str, String str2, Integer num, String str3, Integer num2, String str4, String str5, String str6, String str7) {
        return new OrderSKUDTO(str, str2, num, str3, num2, str4, str5, str6, str7);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderSKUDTO)) {
            return false;
        }
        OrderSKUDTO orderSKUDTO = (OrderSKUDTO) obj;
        return C89219l.m154714a(this.f103631a, orderSKUDTO.f103631a) && C89219l.m154714a(this.f103632b, orderSKUDTO.f103632b) && C89219l.m154714a(this.f103633c, orderSKUDTO.f103633c) && C89219l.m154714a(this.f103634d, orderSKUDTO.f103634d) && C89219l.m154714a(this.f103635e, orderSKUDTO.f103635e) && C89219l.m154714a(this.f103636f, orderSKUDTO.f103636f) && C89219l.m154714a(this.f103637g, orderSKUDTO.f103637g) && C89219l.m154714a(this.f103638h, orderSKUDTO.f103638h) && C89219l.m154714a(this.f103639i, orderSKUDTO.f103639i);
    }

    public final int hashCode() {
        String str = this.f103631a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f103632b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.f103633c;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        String str3 = this.f103634d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Integer num2 = this.f103635e;
        int hashCode5 = (hashCode4 + (num2 != null ? num2.hashCode() : 0)) * 31;
        String str4 = this.f103636f;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f103637g;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f103638h;
        int hashCode8 = (hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f103639i;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return hashCode8 + i;
    }

    public final String toString() {
        return "OrderSKUDTO(productId=" + this.f103631a + ", skuId=" + this.f103632b + ", quantity=" + this.f103633c + ", cartItemId=" + this.f103634d + ", source=" + this.f103635e + ", sourceInfo=" + this.f103636f + ", entranceInfo=" + this.f103637g + ", chainKey=" + this.f103638h + ", kolId=" + this.f103639i + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.f103631a);
        parcel.writeString(this.f103632b);
        Integer num = this.f103633c;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f103634d);
        Integer num2 = this.f103635e;
        if (num2 != null) {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f103636f);
        parcel.writeString(this.f103637g);
        parcel.writeString(this.f103638h);
        parcel.writeString(this.f103639i);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.OrderSKUDTO$a */
    public static class C44453a implements Parcelable.Creator<OrderSKUDTO> {
        static {
            Covode.recordClassIndex(52796);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ OrderSKUDTO[] newArray(int i) {
            return new OrderSKUDTO[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ OrderSKUDTO createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Integer num = null;
            Integer valueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            String readString3 = parcel.readString();
            if (parcel.readInt() != 0) {
                num = Integer.valueOf(parcel.readInt());
            }
            return new OrderSKUDTO(readString, readString2, valueOf, readString3, num, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }
    }

    public OrderSKUDTO(String str, String str2, Integer num, String str3, Integer num2, String str4, String str5, String str6, String str7) {
        this.f103631a = str;
        this.f103632b = str2;
        this.f103633c = num;
        this.f103634d = str3;
        this.f103635e = num2;
        this.f103636f = str4;
        this.f103637g = str5;
        this.f103638h = str6;
        this.f103639i = str7;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OrderSKUDTO(String str, String str2, Integer num, String str3, Integer num2, String str4, String str5, String str6, String str7, int i) {
        this(str, str2, num, (i & 8) != 0 ? null : str3, num2, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) == 0 ? str7 : null);
    }
}
