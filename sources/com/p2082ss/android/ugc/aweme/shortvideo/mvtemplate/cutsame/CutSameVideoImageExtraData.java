package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.cutsame;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.cutsame.CutSameVideoImageExtraData */
public final class CutSameVideoImageExtraData implements Parcelable {
    public static final Parcelable.Creator<CutSameVideoImageExtraData> CREATOR = new C72270a();

    /* renamed from: a */
    public final long f162012a;

    static {
        Covode.recordClassIndex(84935);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof CutSameVideoImageExtraData) && this.f162012a == ((CutSameVideoImageExtraData) obj).f162012a;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.f162012a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return "CutSameVideoImageExtraData(extraDuration=" + this.f162012a + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeLong(this.f162012a);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.cutsame.CutSameVideoImageExtraData$a */
    public static class C72270a implements Parcelable.Creator<CutSameVideoImageExtraData> {
        static {
            Covode.recordClassIndex(84936);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ CutSameVideoImageExtraData[] newArray(int i) {
            return new CutSameVideoImageExtraData[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CutSameVideoImageExtraData createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new CutSameVideoImageExtraData(parcel.readLong());
        }
    }

    public CutSameVideoImageExtraData(long j) {
        this.f162012a = j;
    }
}
