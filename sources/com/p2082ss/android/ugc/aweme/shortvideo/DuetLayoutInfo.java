package com.p2082ss.android.ugc.aweme.shortvideo;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.DuetLayoutInfo */
public final class DuetLayoutInfo implements Parcelable {
    public static final Parcelable.Creator<DuetLayoutInfo> CREATOR = new C69730a();
    private final int type;

    /* renamed from: x1 */
    private final float f155701x1;

    /* renamed from: x2 */
    private final float f155702x2;

    /* renamed from: y1 */
    private final float f155703y1;

    /* renamed from: y2 */
    private final float f155704y2;

    static {
        Covode.recordClassIndex(82117);
    }

    public DuetLayoutInfo() {
        this(0, 0.0f, 0.0f, 0.0f, 0.0f, 31, null);
    }

    public static /* synthetic */ DuetLayoutInfo copy$default(DuetLayoutInfo duetLayoutInfo, int i, float f, float f2, float f3, float f4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = duetLayoutInfo.type;
        }
        if ((i2 & 2) != 0) {
            f = duetLayoutInfo.f155701x1;
        }
        if ((i2 & 4) != 0) {
            f2 = duetLayoutInfo.f155703y1;
        }
        if ((i2 & 8) != 0) {
            f3 = duetLayoutInfo.f155702x2;
        }
        if ((i2 & 16) != 0) {
            f4 = duetLayoutInfo.f155704y2;
        }
        return duetLayoutInfo.copy(i, f, f2, f3, f4);
    }

    public final int component1() {
        return this.type;
    }

    public final float component2() {
        return this.f155701x1;
    }

    public final float component3() {
        return this.f155703y1;
    }

    public final float component4() {
        return this.f155702x2;
    }

    public final float component5() {
        return this.f155704y2;
    }

    public final DuetLayoutInfo copy(int i, float f, float f2, float f3, float f4) {
        return new DuetLayoutInfo(i, f, f2, f3, f4);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DuetLayoutInfo)) {
            return false;
        }
        DuetLayoutInfo duetLayoutInfo = (DuetLayoutInfo) obj;
        return this.type == duetLayoutInfo.type && Float.compare(this.f155701x1, duetLayoutInfo.f155701x1) == 0 && Float.compare(this.f155703y1, duetLayoutInfo.f155703y1) == 0 && Float.compare(this.f155702x2, duetLayoutInfo.f155702x2) == 0 && Float.compare(this.f155704y2, duetLayoutInfo.f155704y2) == 0;
    }

    public final int hashCode() {
        return (((((((this.type * 31) + Float.floatToIntBits(this.f155701x1)) * 31) + Float.floatToIntBits(this.f155703y1)) * 31) + Float.floatToIntBits(this.f155702x2)) * 31) + Float.floatToIntBits(this.f155704y2);
    }

    public final String toString() {
        return "DuetLayoutInfo(type=" + this.type + ", x1=" + this.f155701x1 + ", y1=" + this.f155703y1 + ", x2=" + this.f155702x2 + ", y2=" + this.f155704y2 + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeInt(this.type);
        parcel.writeFloat(this.f155701x1);
        parcel.writeFloat(this.f155703y1);
        parcel.writeFloat(this.f155702x2);
        parcel.writeFloat(this.f155704y2);
    }

    public final int getType() {
        return this.type;
    }

    public final float getX1() {
        return this.f155701x1;
    }

    public final float getX2() {
        return this.f155702x2;
    }

    public final float getY1() {
        return this.f155703y1;
    }

    public final float getY2() {
        return this.f155704y2;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.DuetLayoutInfo$a */
    public static class C69730a implements Parcelable.Creator<DuetLayoutInfo> {
        static {
            Covode.recordClassIndex(82118);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ DuetLayoutInfo[] newArray(int i) {
            return new DuetLayoutInfo[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DuetLayoutInfo createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new DuetLayoutInfo(parcel.readInt(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
        }
    }

    public DuetLayoutInfo(int i, float f, float f2, float f3, float f4) {
        this.type = i;
        this.f155701x1 = f;
        this.f155703y1 = f2;
        this.f155702x2 = f3;
        this.f155704y2 = f4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DuetLayoutInfo(int i, float f, float f2, float f3, float f4, int i2, C89214g gVar) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? 0.0f : f, (i2 & 4) != 0 ? 0.0f : f2, (i2 & 8) != 0 ? 0.0f : f3, (i2 & 16) == 0 ? f4 : 0.0f);
    }
}
