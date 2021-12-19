package com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditTrimState */
public final class MultiEditTrimState implements Parcelable, Serializable {
    public static final Parcelable.Creator<MultiEditTrimState> CREATOR = new C71488a();

    /* renamed from: a */
    private final boolean f160190a;

    /* renamed from: b */
    private final long f160191b;

    /* renamed from: c */
    private final long f160192c;

    static {
        Covode.recordClassIndex(84023);
    }

    /* renamed from: com_ss_android_ugc_aweme_shortvideo_edit_multiedit_data_MultiEditTrimState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m126267x78e02711(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static /* synthetic */ MultiEditTrimState copy$default(MultiEditTrimState multiEditTrimState, boolean z, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = multiEditTrimState.f160190a;
        }
        if ((i & 2) != 0) {
            j = multiEditTrimState.f160191b;
        }
        if ((i & 4) != 0) {
            j2 = multiEditTrimState.f160192c;
        }
        return multiEditTrimState.copy(z, j, j2);
    }

    public final boolean component1() {
        return this.f160190a;
    }

    public final long component2() {
        return this.f160191b;
    }

    public final long component3() {
        return this.f160192c;
    }

    public final MultiEditTrimState copy(boolean z, long j, long j2) {
        return new MultiEditTrimState(z, j, j2);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiEditTrimState)) {
            return false;
        }
        MultiEditTrimState multiEditTrimState = (MultiEditTrimState) obj;
        return this.f160190a == multiEditTrimState.f160190a && this.f160191b == multiEditTrimState.f160191b && this.f160192c == multiEditTrimState.f160192c;
    }

    public final int hashCode() {
        boolean z = this.f160190a;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return (((i * 31) + m126267x78e02711(this.f160191b)) * 31) + m126267x78e02711(this.f160192c);
    }

    public final String toString() {
        return "MultiEditTrimState(enable=" + this.f160190a + ", startTime=" + this.f160191b + ", endTime=" + this.f160192c + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeInt(this.f160190a ? 1 : 0);
        parcel.writeLong(this.f160191b);
        parcel.writeLong(this.f160192c);
    }

    public final boolean getEnable() {
        return this.f160190a;
    }

    public final long getEndTime() {
        return this.f160192c;
    }

    public final long getStartTime() {
        return this.f160191b;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditTrimState$a */
    public static class C71488a implements Parcelable.Creator<MultiEditTrimState> {
        static {
            Covode.recordClassIndex(84024);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ MultiEditTrimState[] newArray(int i) {
            return new MultiEditTrimState[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ MultiEditTrimState createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new MultiEditTrimState(parcel.readInt() != 0, parcel.readLong(), parcel.readLong());
        }
    }

    public MultiEditTrimState(boolean z, long j, long j2) {
        this.f160190a = z;
        this.f160191b = j;
        this.f160192c = j2;
    }
}
