package com.p2082ss.android.ugc.aweme.shortvideo.cut;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.BackgroundVideoCompileConfigure */
public final class BackgroundVideoCompileConfigure implements Parcelable {
    public static final Parcelable.Creator<BackgroundVideoCompileConfigure> CREATOR = new C70012a();

    /* renamed from: a */
    public final String f156527a;

    /* renamed from: b */
    public final String f156528b;

    static {
        Covode.recordClassIndex(82426);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BackgroundVideoCompileConfigure)) {
            return false;
        }
        BackgroundVideoCompileConfigure backgroundVideoCompileConfigure = (BackgroundVideoCompileConfigure) obj;
        return C89219l.m154714a(this.f156527a, backgroundVideoCompileConfigure.f156527a) && C89219l.m154714a(this.f156528b, backgroundVideoCompileConfigure.f156528b);
    }

    public final int hashCode() {
        String str = this.f156527a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f156528b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "BackgroundVideoCompileConfigure(videoOutputPath=" + this.f156527a + ", audioOutputPath=" + this.f156528b + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.f156527a);
        parcel.writeString(this.f156528b);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.BackgroundVideoCompileConfigure$a */
    public static class C70012a implements Parcelable.Creator<BackgroundVideoCompileConfigure> {
        static {
            Covode.recordClassIndex(82427);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ BackgroundVideoCompileConfigure[] newArray(int i) {
            return new BackgroundVideoCompileConfigure[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ BackgroundVideoCompileConfigure createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new BackgroundVideoCompileConfigure(parcel.readString(), parcel.readString());
        }
    }

    private /* synthetic */ BackgroundVideoCompileConfigure() {
        this("", "");
    }

    public BackgroundVideoCompileConfigure(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f156527a = str;
        this.f156528b = str2;
    }
}
