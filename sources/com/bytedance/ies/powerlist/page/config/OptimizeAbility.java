package com.bytedance.ies.powerlist.page.config;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

public final class OptimizeAbility implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C17690a();

    /* renamed from: a */
    public final boolean f42316a;

    /* renamed from: b */
    public final int f42317b;

    /* renamed from: com.bytedance.ies.powerlist.page.config.OptimizeAbility$a */
    public static class C17690a implements Parcelable.Creator {
        static {
            Covode.recordClassIndex(20250);
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            C89219l.m154719c(parcel, "");
            return new OptimizeAbility(parcel.readInt() != 0, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OptimizeAbility[i];
        }
    }

    static {
        Covode.recordClassIndex(20249);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OptimizeAbility)) {
            return false;
        }
        OptimizeAbility optimizeAbility = (OptimizeAbility) obj;
        return this.f42316a == optimizeAbility.f42316a && this.f42317b == optimizeAbility.f42317b;
    }

    public final int hashCode() {
        boolean z = this.f42316a;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return (i * 31) + this.f42317b;
    }

    public final String toString() {
        return "OptimizeAbility(enable=" + this.f42316a + ", preloadCount=" + this.f42317b + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154719c(parcel, "");
        parcel.writeInt(this.f42316a ? 1 : 0);
        parcel.writeInt(this.f42317b);
    }

    private /* synthetic */ OptimizeAbility() {
        this(false, 8);
    }

    public OptimizeAbility(boolean z, int i) {
        this.f42316a = z;
        this.f42317b = i;
    }
}
