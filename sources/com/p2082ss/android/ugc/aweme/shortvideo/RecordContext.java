package com.p2082ss.android.ugc.aweme.shortvideo;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.filter.StrArray;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.RecordContext */
public final class RecordContext implements Parcelable {
    public static final Parcelable.Creator<RecordContext> CREATOR = new C69734a();

    /* renamed from: a */
    public final StrArray f155724a;

    /* renamed from: b */
    public final StrArray f155725b;

    /* renamed from: c */
    public final StrArray f155726c;

    /* renamed from: d */
    public final StrArray f155727d;

    /* renamed from: e */
    public final StrArray f155728e;

    /* renamed from: f */
    public final StrArray f155729f;

    /* renamed from: g */
    public final StrArray f155730g;

    static {
        Covode.recordClassIndex(82127);
    }

    public RecordContext() {
        this(null, null, null, null, null, null, null, 127);
    }

    public RecordContext(StrArray strArray, StrArray strArray2, StrArray strArray3, StrArray strArray4, StrArray strArray5, StrArray strArray6) {
        this(strArray, strArray2, strArray3, strArray4, strArray5, strArray6, null, 64);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecordContext)) {
            return false;
        }
        RecordContext recordContext = (RecordContext) obj;
        return C89219l.m154714a(this.f155724a, recordContext.f155724a) && C89219l.m154714a(this.f155725b, recordContext.f155725b) && C89219l.m154714a(this.f155726c, recordContext.f155726c) && C89219l.m154714a(this.f155727d, recordContext.f155727d) && C89219l.m154714a(this.f155728e, recordContext.f155728e) && C89219l.m154714a(this.f155729f, recordContext.f155729f) && C89219l.m154714a(this.f155730g, recordContext.f155730g);
    }

    public final int hashCode() {
        StrArray strArray = this.f155724a;
        int i = 0;
        int hashCode = (strArray != null ? strArray.hashCode() : 0) * 31;
        StrArray strArray2 = this.f155725b;
        int hashCode2 = (hashCode + (strArray2 != null ? strArray2.hashCode() : 0)) * 31;
        StrArray strArray3 = this.f155726c;
        int hashCode3 = (hashCode2 + (strArray3 != null ? strArray3.hashCode() : 0)) * 31;
        StrArray strArray4 = this.f155727d;
        int hashCode4 = (hashCode3 + (strArray4 != null ? strArray4.hashCode() : 0)) * 31;
        StrArray strArray5 = this.f155728e;
        int hashCode5 = (hashCode4 + (strArray5 != null ? strArray5.hashCode() : 0)) * 31;
        StrArray strArray6 = this.f155729f;
        int hashCode6 = (hashCode5 + (strArray6 != null ? strArray6.hashCode() : 0)) * 31;
        StrArray strArray7 = this.f155730g;
        if (strArray7 != null) {
            i = strArray7.hashCode();
        }
        return hashCode6 + i;
    }

    public final String toString() {
        return "RecordContext(filterLabels=" + this.f155724a + ", filterIds=" + this.f155725b + ", filterValues=" + this.f155726c + ", smoothSkinLabels=" + this.f155727d + ", reshapeLabels=" + this.f155728e + ", eyesLables=" + this.f155729f + ", tanningLabels=" + this.f155730g + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeParcelable(this.f155724a, i);
        parcel.writeParcelable(this.f155725b, i);
        parcel.writeParcelable(this.f155726c, i);
        parcel.writeParcelable(this.f155727d, i);
        parcel.writeParcelable(this.f155728e, i);
        parcel.writeParcelable(this.f155729f, i);
        parcel.writeParcelable(this.f155730g, i);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.RecordContext$a */
    public static class C69734a implements Parcelable.Creator<RecordContext> {
        static {
            Covode.recordClassIndex(82128);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ RecordContext[] newArray(int i) {
            return new RecordContext[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RecordContext createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new RecordContext((StrArray) parcel.readParcelable(RecordContext.class.getClassLoader()), (StrArray) parcel.readParcelable(RecordContext.class.getClassLoader()), (StrArray) parcel.readParcelable(RecordContext.class.getClassLoader()), (StrArray) parcel.readParcelable(RecordContext.class.getClassLoader()), (StrArray) parcel.readParcelable(RecordContext.class.getClassLoader()), (StrArray) parcel.readParcelable(RecordContext.class.getClassLoader()), (StrArray) parcel.readParcelable(RecordContext.class.getClassLoader()));
        }
    }

    public RecordContext(StrArray strArray, StrArray strArray2, StrArray strArray3, StrArray strArray4, StrArray strArray5, StrArray strArray6, StrArray strArray7) {
        C89219l.m154721d(strArray, "");
        C89219l.m154721d(strArray2, "");
        C89219l.m154721d(strArray3, "");
        C89219l.m154721d(strArray4, "");
        C89219l.m154721d(strArray5, "");
        C89219l.m154721d(strArray6, "");
        C89219l.m154721d(strArray7, "");
        this.f155724a = strArray;
        this.f155725b = strArray2;
        this.f155726c = strArray3;
        this.f155727d = strArray4;
        this.f155728e = strArray5;
        this.f155729f = strArray6;
        this.f155730g = strArray7;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ RecordContext(StrArray strArray, StrArray strArray2, StrArray strArray3, StrArray strArray4, StrArray strArray5, StrArray strArray6, StrArray strArray7, int i) {
        this((i & 1) != 0 ? new StrArray() : strArray, (i & 2) != 0 ? new StrArray() : strArray2, (i & 4) != 0 ? new StrArray() : strArray3, (i & 8) != 0 ? new StrArray() : strArray4, (i & 16) != 0 ? new StrArray() : strArray5, (i & 32) != 0 ? new StrArray() : strArray6, (i & 64) != 0 ? new StrArray() : strArray7);
    }
}
