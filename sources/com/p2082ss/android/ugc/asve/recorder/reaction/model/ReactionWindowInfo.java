package com.p2082ss.android.ugc.asve.recorder.reaction.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.asve.recorder.reaction.model.ReactionWindowInfo */
public final class ReactionWindowInfo implements Parcelable, Serializable {
    public static final C31228a CREATOR = new C31228a((byte) 0);
    @AbstractC27891c(mo46611a = "react_width")

    /* renamed from: a */
    private final int f74861a;
    @AbstractC27891c(mo46611a = "react_height")

    /* renamed from: b */
    private final int f74862b;
    @AbstractC27891c(mo46611a = "react_angle")

    /* renamed from: c */
    private final float f74863c;
    @AbstractC27891c(mo46611a = "react_type")

    /* renamed from: d */
    private final int f74864d;

    static {
        Covode.recordClassIndex(37874);
    }

    public ReactionWindowInfo() {
        this(0, 0, 0.0f, 0, 15, null);
    }

    public static /* synthetic */ ReactionWindowInfo copy$default(ReactionWindowInfo reactionWindowInfo, int i, int i2, float f, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = reactionWindowInfo.f74861a;
        }
        if ((i4 & 2) != 0) {
            i2 = reactionWindowInfo.f74862b;
        }
        if ((i4 & 4) != 0) {
            f = reactionWindowInfo.f74863c;
        }
        if ((i4 & 8) != 0) {
            i3 = reactionWindowInfo.f74864d;
        }
        return reactionWindowInfo.copy(i, i2, f, i3);
    }

    public final int component1() {
        return this.f74861a;
    }

    public final int component2() {
        return this.f74862b;
    }

    public final float component3() {
        return this.f74863c;
    }

    public final int component4() {
        return this.f74864d;
    }

    public final ReactionWindowInfo copy(int i, int i2, float f, int i3) {
        return new ReactionWindowInfo(i, i2, f, i3);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReactionWindowInfo)) {
            return false;
        }
        ReactionWindowInfo reactionWindowInfo = (ReactionWindowInfo) obj;
        return this.f74861a == reactionWindowInfo.f74861a && this.f74862b == reactionWindowInfo.f74862b && Float.compare(this.f74863c, reactionWindowInfo.f74863c) == 0 && this.f74864d == reactionWindowInfo.f74864d;
    }

    public final int hashCode() {
        return (((((this.f74861a * 31) + this.f74862b) * 31) + Float.floatToIntBits(this.f74863c)) * 31) + this.f74864d;
    }

    public final String toString() {
        return "ReactionWindowInfo(width=" + this.f74861a + ", height=" + this.f74862b + ", angle=" + this.f74863c + ", type=" + this.f74864d + ")";
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.reaction.model.ReactionWindowInfo$a */
    public static final class C31228a implements Parcelable.Creator<ReactionWindowInfo> {
        static {
            Covode.recordClassIndex(37875);
        }

        private C31228a() {
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ReactionWindowInfo[] newArray(int i) {
            return new ReactionWindowInfo[i];
        }

        public /* synthetic */ C31228a(byte b) {
            this();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ReactionWindowInfo createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new ReactionWindowInfo(parcel);
        }
    }

    public final float getAngle() {
        return this.f74863c;
    }

    public final int getHeight() {
        return this.f74862b;
    }

    public final int getType() {
        return this.f74864d;
    }

    public final int getWidth() {
        return this.f74861a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ReactionWindowInfo(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readFloat(), parcel.readInt());
        C89219l.m154721d(parcel, "");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeInt(this.f74861a);
        parcel.writeInt(this.f74862b);
        parcel.writeFloat(this.f74863c);
        parcel.writeInt(this.f74864d);
    }

    public ReactionWindowInfo(int i, int i2, float f, int i3) {
        this.f74861a = i;
        this.f74862b = i2;
        this.f74863c = f;
        this.f74864d = i3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ReactionWindowInfo(int i, int i2, float f, int i3, int i4, C89214g gVar) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0.0f : f, (i4 & 8) != 0 ? 0 : i3);
    }
}
