package com.p2082ss.android.ugc.aweme.effect;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.effect.ClipsModel */
public final class ClipsModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<ClipsModel> CREATOR = new C46248a();
    @AbstractC27891c(mo46611a = "i")

    /* renamed from: a */
    private final double f107775a;
    @AbstractC27891c(mo46611a = "o")

    /* renamed from: b */
    private final double f107776b;
    @AbstractC27891c(mo46611a = "duration")

    /* renamed from: c */
    private final float f107777c;
    @AbstractC27891c(mo46611a = "xPoints")

    /* renamed from: d */
    private final List<Float> f107778d;
    @AbstractC27891c(mo46611a = "yPoints")

    /* renamed from: e */
    private final List<Float> f107779e;

    static {
        Covode.recordClassIndex(54811);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.effect.ClipsModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ClipsModel copy$default(ClipsModel clipsModel, double d, double d2, float f, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = clipsModel.f107775a;
        }
        if ((i & 2) != 0) {
            d2 = clipsModel.f107776b;
        }
        if ((i & 4) != 0) {
            f = clipsModel.f107777c;
        }
        if ((i & 8) != 0) {
            list = clipsModel.f107778d;
        }
        if ((i & 16) != 0) {
            list2 = clipsModel.f107779e;
        }
        return clipsModel.copy(d, d2, f, list, list2);
    }

    public final double component1() {
        return this.f107775a;
    }

    public final double component2() {
        return this.f107776b;
    }

    public final float component3() {
        return this.f107777c;
    }

    public final List<Float> component4() {
        return this.f107778d;
    }

    public final List<Float> component5() {
        return this.f107779e;
    }

    public final ClipsModel copy(double d, double d2, float f, List<Float> list, List<Float> list2) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(list2, "");
        return new ClipsModel(d, d2, f, list, list2);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipsModel)) {
            return false;
        }
        ClipsModel clipsModel = (ClipsModel) obj;
        return Double.compare(this.f107775a, clipsModel.f107775a) == 0 && Double.compare(this.f107776b, clipsModel.f107776b) == 0 && Float.compare(this.f107777c, clipsModel.f107777c) == 0 && C89219l.m154714a(this.f107778d, clipsModel.f107778d) && C89219l.m154714a(this.f107779e, clipsModel.f107779e);
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f107775a);
        int i = ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31;
        long doubleToLongBits2 = Double.doubleToLongBits(this.f107776b);
        int floatToIntBits = (((i + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + Float.floatToIntBits(this.f107777c)) * 31;
        List<Float> list = this.f107778d;
        int i2 = 0;
        int hashCode = (floatToIntBits + (list != null ? list.hashCode() : 0)) * 31;
        List<Float> list2 = this.f107779e;
        if (list2 != null) {
            i2 = list2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "ClipsModel(i=" + this.f107775a + ", o=" + this.f107776b + ", duration=" + this.f107777c + ", xPoints=" + this.f107778d + ", yPoints=" + this.f107779e + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeDouble(this.f107775a);
        parcel.writeDouble(this.f107776b);
        parcel.writeFloat(this.f107777c);
        List<Float> list = this.f107778d;
        parcel.writeInt(list.size());
        for (Float f : list) {
            parcel.writeFloat(f.floatValue());
        }
        List<Float> list2 = this.f107779e;
        parcel.writeInt(list2.size());
        for (Float f2 : list2) {
            parcel.writeFloat(f2.floatValue());
        }
    }

    public final float getDuration() {
        return this.f107777c;
    }

    public final double getI() {
        return this.f107775a;
    }

    public final double getO() {
        return this.f107776b;
    }

    public final List<Float> getXPoints() {
        return this.f107778d;
    }

    public final List<Float> getYPoints() {
        return this.f107779e;
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.ClipsModel$a */
    public static class C46248a implements Parcelable.Creator<ClipsModel> {
        static {
            Covode.recordClassIndex(54812);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ClipsModel[] newArray(int i) {
            return new ClipsModel[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ClipsModel createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            double readDouble = parcel.readDouble();
            double readDouble2 = parcel.readDouble();
            float readFloat = parcel.readFloat();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add(Float.valueOf(parcel.readFloat()));
                readInt--;
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            while (readInt2 != 0) {
                arrayList2.add(Float.valueOf(parcel.readFloat()));
                readInt2--;
            }
            return new ClipsModel(readDouble, readDouble2, readFloat, arrayList, arrayList2);
        }
    }

    public ClipsModel(double d, double d2, float f, List<Float> list, List<Float> list2) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(list2, "");
        this.f107775a = d;
        this.f107776b = d2;
        this.f107777c = f;
        this.f107778d = list;
        this.f107779e = list2;
    }
}
