package com.p2082ss.android.ugc.aweme.ecommercebase.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommercebase.dto.PromotionView */
public final class PromotionView implements Parcelable, Serializable {
    public static final Parcelable.Creator<PromotionView> CREATOR = new C45671a();
    @AbstractC27891c(mo46611a = "promotion_items")

    /* renamed from: a */
    private final List<PromotionItem> f106313a;

    static {
        Covode.recordClassIndex(54180);
    }

    public PromotionView() {
        this(null, 1, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.ecommercebase.dto.PromotionView */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PromotionView copy$default(PromotionView promotionView, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = promotionView.f106313a;
        }
        return promotionView.copy(list);
    }

    public final List<PromotionItem> component1() {
        return this.f106313a;
    }

    public final PromotionView copy(List<PromotionItem> list) {
        return new PromotionView(list);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof PromotionView) && C89219l.m154714a(this.f106313a, ((PromotionView) obj).f106313a);
        }
        return true;
    }

    public final int hashCode() {
        List<PromotionItem> list = this.f106313a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "PromotionView(promotion_items=" + this.f106313a + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        List<PromotionItem> list = this.f106313a;
        if (list != null) {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (PromotionItem promotionItem : list) {
                promotionItem.writeToParcel(parcel, 0);
            }
            return;
        }
        parcel.writeInt(0);
    }

    public final List<PromotionItem> getPromotion_items() {
        return this.f106313a;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommercebase.dto.PromotionView$a */
    public static class C45671a implements Parcelable.Creator<PromotionView> {
        static {
            Covode.recordClassIndex(54181);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ PromotionView[] newArray(int i) {
            return new PromotionView[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PromotionView createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            C89219l.m154721d(parcel, "");
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList.add(PromotionItem.CREATOR.createFromParcel(parcel));
                    readInt--;
                }
            } else {
                arrayList = null;
            }
            return new PromotionView(arrayList);
        }
    }

    public PromotionView(List<PromotionItem> list) {
        this.f106313a = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PromotionView(List list, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : list);
    }
}
