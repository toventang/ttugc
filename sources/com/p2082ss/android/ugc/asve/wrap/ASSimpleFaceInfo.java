package com.p2082ss.android.ugc.asve.wrap;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.asve.wrap.ASSimpleFaceInfo */
public final class ASSimpleFaceInfo implements Parcelable {
    public static final C31260a CREATOR = new C31260a((byte) 0);

    /* renamed from: a */
    public float f74943a;

    static {
        Covode.recordClassIndex(37908);
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: com.ss.android.ugc.asve.wrap.ASSimpleFaceInfo$a */
    public static final class C31260a implements Parcelable.Creator<ASSimpleFaceInfo> {
        static {
            Covode.recordClassIndex(37909);
        }

        private C31260a() {
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ASSimpleFaceInfo[] newArray(int i) {
            return new ASSimpleFaceInfo[i];
        }

        public /* synthetic */ C31260a(byte b) {
            this();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ASSimpleFaceInfo createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new ASSimpleFaceInfo(parcel);
        }
    }

    public ASSimpleFaceInfo(float f) {
        this.f74943a = f;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ASSimpleFaceInfo(Parcel parcel) {
        this(parcel.readFloat());
        C89219l.m154721d(parcel, "");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeFloat(this.f74943a);
    }
}
