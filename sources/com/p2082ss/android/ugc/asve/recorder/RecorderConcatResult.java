package com.p2082ss.android.ugc.asve.recorder;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.asve.recorder.RecorderConcatResult */
public final class RecorderConcatResult implements Parcelable {
    public static final C31103a CREATOR = new C31103a((byte) 0);

    /* renamed from: a */
    public final int f74533a;

    /* renamed from: b */
    public final String f74534b;

    /* renamed from: c */
    public final String f74535c;

    static {
        Covode.recordClassIndex(37743);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecorderConcatResult)) {
            return false;
        }
        RecorderConcatResult recorderConcatResult = (RecorderConcatResult) obj;
        return this.f74533a == recorderConcatResult.f74533a && C89219l.m154714a(this.f74534b, recorderConcatResult.f74534b) && C89219l.m154714a(this.f74535c, recorderConcatResult.f74535c);
    }

    public final int hashCode() {
        int i = this.f74533a * 31;
        String str = this.f74534b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f74535c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "RecorderConcatResult(ret=" + this.f74533a + ", videoPath=" + this.f74534b + ", audioPath=" + this.f74535c + ")";
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.RecorderConcatResult$a */
    public static final class C31103a implements Parcelable.Creator<RecorderConcatResult> {
        static {
            Covode.recordClassIndex(37744);
        }

        private C31103a() {
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ RecorderConcatResult[] newArray(int i) {
            return new RecorderConcatResult[i];
        }

        public /* synthetic */ C31103a(byte b) {
            this();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RecorderConcatResult createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new RecorderConcatResult(parcel);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public RecorderConcatResult(android.os.Parcel r5) {
        /*
            r4 = this;
            java.lang.String r3 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r5, r3)
            int r2 = r5.readInt()
            java.lang.String r1 = r5.readString()
            if (r1 != 0) goto L_0x0012
            p4600h.p4611f.p4613b.C89219l.m154715b()
        L_0x0012:
            p4600h.p4611f.p4613b.C89219l.m154716b(r1, r3)
            java.lang.String r0 = r5.readString()
            if (r0 != 0) goto L_0x001e
            p4600h.p4611f.p4613b.C89219l.m154715b()
        L_0x001e:
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, r3)
            r4.<init>(r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.asve.recorder.RecorderConcatResult.<init>(android.os.Parcel):void");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeInt(this.f74533a);
        parcel.writeString(this.f74534b);
        parcel.writeString(this.f74535c);
    }

    public RecorderConcatResult(int i, String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f74533a = i;
        this.f74534b = str;
        this.f74535c = str2;
    }
}
