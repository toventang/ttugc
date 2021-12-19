package com.p2082ss.android.ugc.aweme.editSticker.text.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectExtraConfig */
public final class InnerEffectExtraConfig implements Parcelable {
    public static final Parcelable.Creator<InnerEffectExtraConfig> CREATOR = new C46053a();
    private final boolean forceUpdate;

    static {
        Covode.recordClassIndex(54589);
    }

    public InnerEffectExtraConfig() {
        this(false, 1, null);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeInt(this.forceUpdate ? 1 : 0);
    }

    public final boolean getForceUpdate() {
        return this.forceUpdate;
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectExtraConfig$a */
    public static class C46053a implements Parcelable.Creator<InnerEffectExtraConfig> {
        static {
            Covode.recordClassIndex(54590);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ InnerEffectExtraConfig[] newArray(int i) {
            return new InnerEffectExtraConfig[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ InnerEffectExtraConfig createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new InnerEffectExtraConfig(parcel.readInt() != 0);
        }
    }

    public InnerEffectExtraConfig(boolean z) {
        this.forceUpdate = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InnerEffectExtraConfig(boolean z, int i, C89214g gVar) {
        this((i & 1) != 0 ? false : z);
    }
}
