package com.p2082ss.android.ugc.aweme.editSticker.text.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.bean.EffectTextBgNinePatch */
public final class EffectTextBgNinePatch implements Parcelable {
    public static final Parcelable.Creator<EffectTextBgNinePatch> CREATOR = new C46052a();
    @AbstractC27891c(mo46611a = "divX")
    private final List<NinePatchDiv> divX;
    @AbstractC27891c(mo46611a = "divY")
    private final List<NinePatchDiv> divY;
    @AbstractC27891c(mo46611a = "padding_bottom")
    private final int paddingBottom;
    @AbstractC27891c(mo46611a = "padding_left")
    private final int paddingLeft;
    @AbstractC27891c(mo46611a = "padding_right")
    private final int paddingRight;
    @AbstractC27891c(mo46611a = "padding_top")
    private final int paddingTop;

    static {
        Covode.recordClassIndex(54587);
    }

    public EffectTextBgNinePatch() {
        this(null, null, 0, 0, 0, 0, 63, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_editSticker_text_bean_EffectTextBgNinePatch_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m88908x366133eb(int i) {
        return i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.editSticker.text.bean.EffectTextBgNinePatch */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EffectTextBgNinePatch copy$default(EffectTextBgNinePatch effectTextBgNinePatch, List list, List list2, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            list = effectTextBgNinePatch.divX;
        }
        if ((i5 & 2) != 0) {
            list2 = effectTextBgNinePatch.divY;
        }
        if ((i5 & 4) != 0) {
            i = effectTextBgNinePatch.paddingLeft;
        }
        if ((i5 & 8) != 0) {
            i2 = effectTextBgNinePatch.paddingRight;
        }
        if ((i5 & 16) != 0) {
            i3 = effectTextBgNinePatch.paddingTop;
        }
        if ((i5 & 32) != 0) {
            i4 = effectTextBgNinePatch.paddingBottom;
        }
        return effectTextBgNinePatch.copy(list, list2, i, i2, i3, i4);
    }

    public final List<NinePatchDiv> component1() {
        return this.divX;
    }

    public final List<NinePatchDiv> component2() {
        return this.divY;
    }

    public final int component3() {
        return this.paddingLeft;
    }

    public final int component4() {
        return this.paddingRight;
    }

    public final int component5() {
        return this.paddingTop;
    }

    public final int component6() {
        return this.paddingBottom;
    }

    public final EffectTextBgNinePatch copy(List<NinePatchDiv> list, List<NinePatchDiv> list2, int i, int i2, int i3, int i4) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(list2, "");
        return new EffectTextBgNinePatch(list, list2, i, i2, i3, i4);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EffectTextBgNinePatch)) {
            return false;
        }
        EffectTextBgNinePatch effectTextBgNinePatch = (EffectTextBgNinePatch) obj;
        return C89219l.m154714a(this.divX, effectTextBgNinePatch.divX) && C89219l.m154714a(this.divY, effectTextBgNinePatch.divY) && this.paddingLeft == effectTextBgNinePatch.paddingLeft && this.paddingRight == effectTextBgNinePatch.paddingRight && this.paddingTop == effectTextBgNinePatch.paddingTop && this.paddingBottom == effectTextBgNinePatch.paddingBottom;
    }

    public final int hashCode() {
        List<NinePatchDiv> list = this.divX;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<NinePatchDiv> list2 = this.divY;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return ((((((((hashCode + i) * 31) + m88908x366133eb(this.paddingLeft)) * 31) + m88908x366133eb(this.paddingRight)) * 31) + m88908x366133eb(this.paddingTop)) * 31) + m88908x366133eb(this.paddingBottom);
    }

    public final String toString() {
        return "EffectTextBgNinePatch(divX=" + this.divX + ", divY=" + this.divY + ", paddingLeft=" + this.paddingLeft + ", paddingRight=" + this.paddingRight + ", paddingTop=" + this.paddingTop + ", paddingBottom=" + this.paddingBottom + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        List<NinePatchDiv> list = this.divX;
        parcel.writeInt(list.size());
        for (NinePatchDiv ninePatchDiv : list) {
            ninePatchDiv.writeToParcel(parcel, 0);
        }
        List<NinePatchDiv> list2 = this.divY;
        parcel.writeInt(list2.size());
        for (NinePatchDiv ninePatchDiv2 : list2) {
            ninePatchDiv2.writeToParcel(parcel, 0);
        }
        parcel.writeInt(this.paddingLeft);
        parcel.writeInt(this.paddingRight);
        parcel.writeInt(this.paddingTop);
        parcel.writeInt(this.paddingBottom);
    }

    public final List<NinePatchDiv> getDivX() {
        return this.divX;
    }

    public final List<NinePatchDiv> getDivY() {
        return this.divY;
    }

    public final int getPaddingBottom() {
        return this.paddingBottom;
    }

    public final int getPaddingLeft() {
        return this.paddingLeft;
    }

    public final int getPaddingRight() {
        return this.paddingRight;
    }

    public final int getPaddingTop() {
        return this.paddingTop;
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.bean.EffectTextBgNinePatch$a */
    public static class C46052a implements Parcelable.Creator<EffectTextBgNinePatch> {
        static {
            Covode.recordClassIndex(54588);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ EffectTextBgNinePatch[] newArray(int i) {
            return new EffectTextBgNinePatch[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ EffectTextBgNinePatch createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add(NinePatchDiv.CREATOR.createFromParcel(parcel));
                readInt--;
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            while (readInt2 != 0) {
                arrayList2.add(NinePatchDiv.CREATOR.createFromParcel(parcel));
                readInt2--;
            }
            return new EffectTextBgNinePatch(arrayList, arrayList2, parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }
    }

    public EffectTextBgNinePatch(List<NinePatchDiv> list, List<NinePatchDiv> list2, int i, int i2, int i3, int i4) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(list2, "");
        this.divX = list;
        this.divY = list2;
        this.paddingLeft = i;
        this.paddingRight = i2;
        this.paddingTop = i3;
        this.paddingBottom = i4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EffectTextBgNinePatch(List list, List list2, int i, int i2, int i3, int i4, int i5, C89214g gVar) {
        this((i5 & 1) != 0 ? new ArrayList() : list, (i5 & 2) != 0 ? new ArrayList() : list2, (i5 & 4) != 0 ? 0 : i, (i5 & 8) != 0 ? 0 : i2, (i5 & 16) != 0 ? 0 : i3, (i5 & 32) == 0 ? i4 : 0);
    }
}
