package com.p2082ss.android.ugc.aweme.edit;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.edit.Cut2EditTransferModel */
public final class Cut2EditTransferModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<Cut2EditTransferModel> CREATOR = new C45819a();

    /* renamed from: a */
    private final boolean f106752a;

    /* renamed from: b */
    private final boolean f106753b;

    /* renamed from: c */
    private final List<C69905c> f106754c;

    /* renamed from: d */
    private final long f106755d;

    /* renamed from: e */
    private final long f106756e;

    /* renamed from: f */
    private final long f106757f;

    static {
        Covode.recordClassIndex(54340);
    }

    /* renamed from: com_ss_android_ugc_aweme_edit_Cut2EditTransferModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m88433xf6c4defe(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.edit.Cut2EditTransferModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Cut2EditTransferModel copy$default(Cut2EditTransferModel cut2EditTransferModel, boolean z, boolean z2, List list, long j, long j2, long j3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = cut2EditTransferModel.f106752a;
        }
        if ((i & 2) != 0) {
            z2 = cut2EditTransferModel.f106753b;
        }
        if ((i & 4) != 0) {
            list = cut2EditTransferModel.f106754c;
        }
        if ((i & 8) != 0) {
            j = cut2EditTransferModel.f106755d;
        }
        if ((i & 16) != 0) {
            j2 = cut2EditTransferModel.f106756e;
        }
        if ((i & 32) != 0) {
            j3 = cut2EditTransferModel.f106757f;
        }
        return cut2EditTransferModel.copy(z, z2, list, j, j2, j3);
    }

    public final boolean component1() {
        return this.f106752a;
    }

    public final boolean component2() {
        return this.f106753b;
    }

    public final List<C69905c> component3() {
        return this.f106754c;
    }

    public final long component4() {
        return this.f106755d;
    }

    public final long component5() {
        return this.f106756e;
    }

    public final long component6() {
        return this.f106757f;
    }

    public final Cut2EditTransferModel copy(boolean z, boolean z2, List<C69905c> list, long j, long j2, long j3) {
        C89219l.m154721d(list, "");
        return new Cut2EditTransferModel(z, z2, list, j, j2, j3);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cut2EditTransferModel)) {
            return false;
        }
        Cut2EditTransferModel cut2EditTransferModel = (Cut2EditTransferModel) obj;
        return this.f106752a == cut2EditTransferModel.f106752a && this.f106753b == cut2EditTransferModel.f106753b && C89219l.m154714a(this.f106754c, cut2EditTransferModel.f106754c) && this.f106755d == cut2EditTransferModel.f106755d && this.f106756e == cut2EditTransferModel.f106756e && this.f106757f == cut2EditTransferModel.f106757f;
    }

    public final int hashCode() {
        boolean z = this.f106752a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        if (!this.f106753b) {
            i = 0;
        }
        int i6 = (i5 + i) * 31;
        List<C69905c> list = this.f106754c;
        return ((((((i6 + (list != null ? list.hashCode() : 0)) * 31) + m88433xf6c4defe(this.f106755d)) * 31) + m88433xf6c4defe(this.f106756e)) * 31) + m88433xf6c4defe(this.f106757f);
    }

    public final String toString() {
        return "Cut2EditTransferModel(isVideoCompressed=" + this.f106752a + ", musicSyncMode=" + this.f106753b + ", musicList=" + this.f106754c + ", resizeImageTime=" + this.f106755d + ", downloadResTime=" + this.f106756e + ", compressVideoTime=" + this.f106757f + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeInt(this.f106752a ? 1 : 0);
        parcel.writeInt(this.f106753b ? 1 : 0);
        List<C69905c> list = this.f106754c;
        parcel.writeInt(list.size());
        for (C69905c cVar : list) {
            parcel.writeSerializable(cVar);
        }
        parcel.writeLong(this.f106755d);
        parcel.writeLong(this.f106756e);
        parcel.writeLong(this.f106757f);
    }

    public final long getCompressVideoTime() {
        return this.f106757f;
    }

    public final long getDownloadResTime() {
        return this.f106756e;
    }

    public final List<C69905c> getMusicList() {
        return this.f106754c;
    }

    public final boolean getMusicSyncMode() {
        return this.f106753b;
    }

    public final long getResizeImageTime() {
        return this.f106755d;
    }

    public final boolean isVideoCompressed() {
        return this.f106752a;
    }

    /* renamed from: com.ss.android.ugc.aweme.edit.Cut2EditTransferModel$a */
    public static class C45819a implements Parcelable.Creator<Cut2EditTransferModel> {
        static {
            Covode.recordClassIndex(54341);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Cut2EditTransferModel[] newArray(int i) {
            return new Cut2EditTransferModel[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Cut2EditTransferModel createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            boolean z = false;
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = true;
            }
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add(parcel.readSerializable());
                readInt--;
            }
            return new Cut2EditTransferModel(z2, z, arrayList, parcel.readLong(), parcel.readLong(), parcel.readLong());
        }
    }

    public Cut2EditTransferModel(boolean z, boolean z2, List<C69905c> list, long j, long j2, long j3) {
        C89219l.m154721d(list, "");
        this.f106752a = z;
        this.f106753b = z2;
        this.f106754c = list;
        this.f106755d = j;
        this.f106756e = j2;
        this.f106757f = j3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Cut2EditTransferModel(boolean z, boolean z2, List list, long j, long j2, long j3, int i, C89214g gVar) {
        this(z, z2, list, (i & 8) != 0 ? 0 : j, (i & 16) != 0 ? 0 : j2, (i & 32) != 0 ? 0 : j3);
    }
}
