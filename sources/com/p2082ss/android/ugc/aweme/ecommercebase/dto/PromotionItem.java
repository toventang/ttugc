package com.p2082ss.android.ugc.aweme.ecommercebase.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommercebase.dto.PromotionItem */
public final class PromotionItem implements Parcelable, Serializable {
    public static final Parcelable.Creator<PromotionItem> CREATOR = new C45670b();
    public static final C45669a Companion = new C45669a((byte) 0);
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: a */
    private final String f106304a;
    @AbstractC27891c(mo46611a = StringSet.name)

    /* renamed from: b */
    private final String f106305b;
    @AbstractC27891c(mo46611a = "subheaders")

    /* renamed from: c */
    private final List<String> f106306c;
    @AbstractC27891c(mo46611a = "icon")

    /* renamed from: d */
    private final GImage f106307d;
    @AbstractC27891c(mo46611a = "back_ground")

    /* renamed from: e */
    private final GImage f106308e;
    @AbstractC27891c(mo46611a = "style")

    /* renamed from: f */
    private final Integer f106309f;
    @AbstractC27891c(mo46611a = "voucher_id")

    /* renamed from: g */
    private final String f106310g;
    @AbstractC27891c(mo46611a = StringSet.type)

    /* renamed from: h */
    private final Integer f106311h;
    @AbstractC27891c(mo46611a = "log_extra")

    /* renamed from: i */
    private final String f106312i;

    static {
        Covode.recordClassIndex(54177);
    }

    public PromotionItem() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.ecommercebase.dto.PromotionItem */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PromotionItem copy$default(PromotionItem promotionItem, String str, String str2, List list, GImage gImage, GImage gImage2, Integer num, String str3, Integer num2, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = promotionItem.f106304a;
        }
        if ((i & 2) != 0) {
            str2 = promotionItem.f106305b;
        }
        if ((i & 4) != 0) {
            list = promotionItem.f106306c;
        }
        if ((i & 8) != 0) {
            gImage = promotionItem.f106307d;
        }
        if ((i & 16) != 0) {
            gImage2 = promotionItem.f106308e;
        }
        if ((i & 32) != 0) {
            num = promotionItem.f106309f;
        }
        if ((i & 64) != 0) {
            str3 = promotionItem.f106310g;
        }
        if ((i & 128) != 0) {
            num2 = promotionItem.f106311h;
        }
        if ((i & 256) != 0) {
            str4 = promotionItem.f106312i;
        }
        return promotionItem.copy(str, str2, list, gImage, gImage2, num, str3, num2, str4);
    }

    public final String component1() {
        return this.f106304a;
    }

    public final String component2() {
        return this.f106305b;
    }

    public final List<String> component3() {
        return this.f106306c;
    }

    public final GImage component4() {
        return this.f106307d;
    }

    public final GImage component5() {
        return this.f106308e;
    }

    public final Integer component6() {
        return this.f106309f;
    }

    public final String component7() {
        return this.f106310g;
    }

    public final Integer component8() {
        return this.f106311h;
    }

    public final String component9() {
        return this.f106312i;
    }

    public final PromotionItem copy(String str, String str2, List<String> list, GImage gImage, GImage gImage2, Integer num, String str3, Integer num2, String str4) {
        return new PromotionItem(str, str2, list, gImage, gImage2, num, str3, num2, str4);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromotionItem)) {
            return false;
        }
        PromotionItem promotionItem = (PromotionItem) obj;
        return C89219l.m154714a(this.f106304a, promotionItem.f106304a) && C89219l.m154714a(this.f106305b, promotionItem.f106305b) && C89219l.m154714a(this.f106306c, promotionItem.f106306c) && C89219l.m154714a(this.f106307d, promotionItem.f106307d) && C89219l.m154714a(this.f106308e, promotionItem.f106308e) && C89219l.m154714a(this.f106309f, promotionItem.f106309f) && C89219l.m154714a(this.f106310g, promotionItem.f106310g) && C89219l.m154714a(this.f106311h, promotionItem.f106311h) && C89219l.m154714a(this.f106312i, promotionItem.f106312i);
    }

    public final int hashCode() {
        String str = this.f106304a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f106305b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<String> list = this.f106306c;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        GImage gImage = this.f106307d;
        int hashCode4 = (hashCode3 + (gImage != null ? gImage.hashCode() : 0)) * 31;
        GImage gImage2 = this.f106308e;
        int hashCode5 = (hashCode4 + (gImage2 != null ? gImage2.hashCode() : 0)) * 31;
        Integer num = this.f106309f;
        int hashCode6 = (hashCode5 + (num != null ? num.hashCode() : 0)) * 31;
        String str3 = this.f106310g;
        int hashCode7 = (hashCode6 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Integer num2 = this.f106311h;
        int hashCode8 = (hashCode7 + (num2 != null ? num2.hashCode() : 0)) * 31;
        String str4 = this.f106312i;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode8 + i;
    }

    public final String toString() {
        return "PromotionItem(id=" + this.f106304a + ", name=" + this.f106305b + ", subHeaders=" + this.f106306c + ", icon=" + this.f106307d + ", backGround=" + this.f106308e + ", style=" + this.f106309f + ", voucherId=" + this.f106310g + ", type=" + this.f106311h + ", log_extra=" + this.f106312i + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.f106304a);
        parcel.writeString(this.f106305b);
        parcel.writeStringList(this.f106306c);
        GImage gImage = this.f106307d;
        if (gImage != null) {
            parcel.writeInt(1);
            gImage.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        GImage gImage2 = this.f106308e;
        if (gImage2 != null) {
            parcel.writeInt(1);
            gImage2.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        Integer num = this.f106309f;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f106310g);
        Integer num2 = this.f106311h;
        if (num2 != null) {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f106312i);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommercebase.dto.PromotionItem$a */
    public static final class C45669a {
        static {
            Covode.recordClassIndex(54178);
        }

        private C45669a() {
        }

        public /* synthetic */ C45669a(byte b) {
            this();
        }
    }

    public final GImage getBackGround() {
        return this.f106308e;
    }

    public final GImage getIcon() {
        return this.f106307d;
    }

    public final String getId() {
        return this.f106304a;
    }

    public final String getLog_extra() {
        return this.f106312i;
    }

    public final String getName() {
        return this.f106305b;
    }

    public final Integer getStyle() {
        return this.f106309f;
    }

    public final List<String> getSubHeaders() {
        return this.f106306c;
    }

    public final Integer getType() {
        return this.f106311h;
    }

    public final String getVoucherId() {
        return this.f106310g;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommercebase.dto.PromotionItem$b */
    public static class C45670b implements Parcelable.Creator<PromotionItem> {
        static {
            Covode.recordClassIndex(54179);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ PromotionItem[] newArray(int i) {
            return new PromotionItem[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PromotionItem createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            Integer num = null;
            GImage createFromParcel = parcel.readInt() != 0 ? GImage.CREATOR.createFromParcel(parcel) : null;
            GImage createFromParcel2 = parcel.readInt() != 0 ? GImage.CREATOR.createFromParcel(parcel) : null;
            Integer valueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            String readString3 = parcel.readString();
            if (parcel.readInt() != 0) {
                num = Integer.valueOf(parcel.readInt());
            }
            return new PromotionItem(readString, readString2, createStringArrayList, createFromParcel, createFromParcel2, valueOf, readString3, num, parcel.readString());
        }
    }

    public PromotionItem(String str, String str2, List<String> list, GImage gImage, GImage gImage2, Integer num, String str3, Integer num2, String str4) {
        this.f106304a = str;
        this.f106305b = str2;
        this.f106306c = list;
        this.f106307d = gImage;
        this.f106308e = gImage2;
        this.f106309f = num;
        this.f106310g = str3;
        this.f106311h = num2;
        this.f106312i = str4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PromotionItem(String str, String str2, List list, GImage gImage, GImage gImage2, Integer num, String str3, Integer num2, String str4, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : gImage, (i & 16) != 0 ? null : gImage2, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : num2, (i & 256) == 0 ? str4 : null);
    }
}
