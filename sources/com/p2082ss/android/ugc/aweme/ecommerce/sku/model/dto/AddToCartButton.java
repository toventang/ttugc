package com.p2082ss.android.ugc.aweme.ecommerce.sku.model.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.model.dto.AddToCartButton */
public final class AddToCartButton implements Parcelable, Serializable {
    public static final C45431a AddToCartButtonStatus = new C45431a((byte) 0);
    public static final Parcelable.Creator<AddToCartButton> CREATOR = new C45432b();
    @AbstractC27891c(mo46611a = "status")

    /* renamed from: a */
    private final Integer f105843a;
    @AbstractC27891c(mo46611a = "click_hint")

    /* renamed from: b */
    private final String f105844b;
    @AbstractC27891c(mo46611a = "available_count")

    /* renamed from: c */
    private final Integer f105845c;

    static {
        Covode.recordClassIndex(53906);
    }

    public static /* synthetic */ AddToCartButton copy$default(AddToCartButton addToCartButton, Integer num, String str, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = addToCartButton.f105843a;
        }
        if ((i & 2) != 0) {
            str = addToCartButton.f105844b;
        }
        if ((i & 4) != 0) {
            num2 = addToCartButton.f105845c;
        }
        return addToCartButton.copy(num, str, num2);
    }

    public final Integer component1() {
        return this.f105843a;
    }

    public final String component2() {
        return this.f105844b;
    }

    public final Integer component3() {
        return this.f105845c;
    }

    public final AddToCartButton copy(Integer num, String str, Integer num2) {
        return new AddToCartButton(num, str, num2);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddToCartButton)) {
            return false;
        }
        AddToCartButton addToCartButton = (AddToCartButton) obj;
        return C89219l.m154714a(this.f105843a, addToCartButton.f105843a) && C89219l.m154714a(this.f105844b, addToCartButton.f105844b) && C89219l.m154714a(this.f105845c, addToCartButton.f105845c);
    }

    public final int hashCode() {
        Integer num = this.f105843a;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.f105844b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Integer num2 = this.f105845c;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "AddToCartButton(status=" + this.f105843a + ", clickHint=" + this.f105844b + ", availableCount=" + this.f105845c + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        Integer num = this.f105843a;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f105844b);
        Integer num2 = this.f105845c;
        if (num2 != null) {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
            return;
        }
        parcel.writeInt(0);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.model.dto.AddToCartButton$a */
    public static final class C45431a {
        static {
            Covode.recordClassIndex(53907);
        }

        private C45431a() {
        }

        public /* synthetic */ C45431a(byte b) {
            this();
        }
    }

    public final Integer getAvailableCount() {
        return this.f105845c;
    }

    public final String getClickHint() {
        return this.f105844b;
    }

    public final Integer getStatus() {
        return this.f105843a;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.model.dto.AddToCartButton$b */
    public static class C45432b implements Parcelable.Creator<AddToCartButton> {
        static {
            Covode.recordClassIndex(53908);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ AddToCartButton[] newArray(int i) {
            return new AddToCartButton[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ AddToCartButton createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            Integer num = null;
            Integer valueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            String readString = parcel.readString();
            if (parcel.readInt() != 0) {
                num = Integer.valueOf(parcel.readInt());
            }
            return new AddToCartButton(valueOf, readString, num);
        }
    }

    public AddToCartButton(Integer num, String str, Integer num2) {
        this.f105843a = num;
        this.f105844b = str;
        this.f105845c = num2;
    }
}
