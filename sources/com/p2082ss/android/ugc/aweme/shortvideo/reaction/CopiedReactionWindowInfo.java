package com.p2082ss.android.ugc.aweme.shortvideo.reaction;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.reaction.CopiedReactionWindowInfo */
public final class CopiedReactionWindowInfo implements Parcelable, Serializable {
    public static final C72727a CREATOR = new C72727a((byte) 0);
    @AbstractC27891c(mo46611a = "react_width")

    /* renamed from: a */
    private final int f163054a;
    @AbstractC27891c(mo46611a = "react_height")

    /* renamed from: b */
    private final int f163055b;
    @AbstractC27891c(mo46611a = "react_angle")

    /* renamed from: c */
    private final float f163056c;
    @AbstractC27891c(mo46611a = "react_type")

    /* renamed from: d */
    private final int f163057d;

    static {
        Covode.recordClassIndex(85410);
    }

    public CopiedReactionWindowInfo() {
        this(0, 0, 0.0f, 0, 15, null);
    }

    public static /* synthetic */ CopiedReactionWindowInfo copy$default(CopiedReactionWindowInfo copiedReactionWindowInfo, int i, int i2, float f, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = copiedReactionWindowInfo.f163054a;
        }
        if ((i4 & 2) != 0) {
            i2 = copiedReactionWindowInfo.f163055b;
        }
        if ((i4 & 4) != 0) {
            f = copiedReactionWindowInfo.f163056c;
        }
        if ((i4 & 8) != 0) {
            i3 = copiedReactionWindowInfo.f163057d;
        }
        return copiedReactionWindowInfo.copy(i, i2, f, i3);
    }

    public final int component1() {
        return this.f163054a;
    }

    public final int component2() {
        return this.f163055b;
    }

    public final float component3() {
        return this.f163056c;
    }

    public final int component4() {
        return this.f163057d;
    }

    public final CopiedReactionWindowInfo copy(int i, int i2, float f, int i3) {
        return new CopiedReactionWindowInfo(i, i2, f, i3);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CopiedReactionWindowInfo)) {
            return false;
        }
        CopiedReactionWindowInfo copiedReactionWindowInfo = (CopiedReactionWindowInfo) obj;
        return this.f163054a == copiedReactionWindowInfo.f163054a && this.f163055b == copiedReactionWindowInfo.f163055b && Float.compare(this.f163056c, copiedReactionWindowInfo.f163056c) == 0 && this.f163057d == copiedReactionWindowInfo.f163057d;
    }

    public final int hashCode() {
        return (((((this.f163054a * 31) + this.f163055b) * 31) + Float.floatToIntBits(this.f163056c)) * 31) + this.f163057d;
    }

    public final String toString() {
        return "CopiedReactionWindowInfo(width=" + this.f163054a + ", height=" + this.f163055b + ", angle=" + this.f163056c + ", type=" + this.f163057d + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.reaction.CopiedReactionWindowInfo$a */
    public static final class C72727a implements Parcelable.Creator<CopiedReactionWindowInfo> {
        static {
            Covode.recordClassIndex(85411);
        }

        private C72727a() {
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ CopiedReactionWindowInfo[] newArray(int i) {
            return new CopiedReactionWindowInfo[i];
        }

        public /* synthetic */ C72727a(byte b) {
            this();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CopiedReactionWindowInfo createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new CopiedReactionWindowInfo(parcel);
        }
    }

    public final float getAngle() {
        return this.f163056c;
    }

    public final int getHeight() {
        return this.f163055b;
    }

    public final int getType() {
        return this.f163057d;
    }

    public final int getWidth() {
        return this.f163054a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CopiedReactionWindowInfo(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readFloat(), parcel.readInt());
        C89219l.m154721d(parcel, "");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeInt(this.f163054a);
        parcel.writeInt(this.f163055b);
        parcel.writeFloat(this.f163056c);
        parcel.writeInt(this.f163057d);
    }

    public CopiedReactionWindowInfo(int i, int i2, float f, int i3) {
        this.f163054a = i;
        this.f163055b = i2;
        this.f163056c = f;
        this.f163057d = i3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CopiedReactionWindowInfo(int i, int i2, float f, int i3, int i4, C89214g gVar) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0.0f : f, (i4 & 8) != 0 ? 0 : i3);
    }
}
