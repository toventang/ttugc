package com.p2082ss.android.ugc.aweme.mvtheme;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.mvtheme.MvItemCrop */
public final class MvItemCrop implements Parcelable, Serializable {
    public static final Parcelable.Creator<MvItemCrop> CREATOR = new C61283a();
    @AbstractC27891c(mo46611a = "upperLeftX")

    /* renamed from: a */
    private final float f139173a;
    @AbstractC27891c(mo46611a = "upperLeftY")

    /* renamed from: b */
    private final float f139174b;
    @AbstractC27891c(mo46611a = "lowerRightX")

    /* renamed from: c */
    private final float f139175c;
    @AbstractC27891c(mo46611a = "lowerRightY")

    /* renamed from: d */
    private final float f139176d;

    static {
        Covode.recordClassIndex(71900);
    }

    public static /* synthetic */ MvItemCrop copy$default(MvItemCrop mvItemCrop, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = mvItemCrop.f139173a;
        }
        if ((i & 2) != 0) {
            f2 = mvItemCrop.f139174b;
        }
        if ((i & 4) != 0) {
            f3 = mvItemCrop.f139175c;
        }
        if ((i & 8) != 0) {
            f4 = mvItemCrop.f139176d;
        }
        return mvItemCrop.copy(f, f2, f3, f4);
    }

    public final float component1() {
        return this.f139173a;
    }

    public final float component2() {
        return this.f139174b;
    }

    public final float component3() {
        return this.f139175c;
    }

    public final float component4() {
        return this.f139176d;
    }

    public final MvItemCrop copy(float f, float f2, float f3, float f4) {
        return new MvItemCrop(f, f2, f3, f4);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MvItemCrop)) {
            return false;
        }
        MvItemCrop mvItemCrop = (MvItemCrop) obj;
        return Float.compare(this.f139173a, mvItemCrop.f139173a) == 0 && Float.compare(this.f139174b, mvItemCrop.f139174b) == 0 && Float.compare(this.f139175c, mvItemCrop.f139175c) == 0 && Float.compare(this.f139176d, mvItemCrop.f139176d) == 0;
    }

    public final int hashCode() {
        return (((((Float.floatToIntBits(this.f139173a) * 31) + Float.floatToIntBits(this.f139174b)) * 31) + Float.floatToIntBits(this.f139175c)) * 31) + Float.floatToIntBits(this.f139176d);
    }

    public final String toString() {
        return "MvItemCrop(upperLeftX=" + this.f139173a + ", upperLeftY=" + this.f139174b + ", lowerRightX=" + this.f139175c + ", lowerRightY=" + this.f139176d + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeFloat(this.f139173a);
        parcel.writeFloat(this.f139174b);
        parcel.writeFloat(this.f139175c);
        parcel.writeFloat(this.f139176d);
    }

    public final float getLowerRightX() {
        return this.f139175c;
    }

    public final float getLowerRightY() {
        return this.f139176d;
    }

    public final float getUpperLeftX() {
        return this.f139173a;
    }

    public final float getUpperLeftY() {
        return this.f139174b;
    }

    /* renamed from: com.ss.android.ugc.aweme.mvtheme.MvItemCrop$a */
    public static class C61283a implements Parcelable.Creator<MvItemCrop> {
        static {
            Covode.recordClassIndex(71901);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ MvItemCrop[] newArray(int i) {
            return new MvItemCrop[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ MvItemCrop createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new MvItemCrop(parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
        }
    }

    public MvItemCrop(float f, float f2, float f3, float f4) {
        this.f139173a = f;
        this.f139174b = f2;
        this.f139175c = f3;
        this.f139176d = f4;
    }
}
