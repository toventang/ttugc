package com.p2082ss.android.ugc.aweme.shortvideo;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.TimeSpeedModelExtension;
import com.p2082ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.StitchContext */
public final class StitchContext implements Parcelable {
    public static final Parcelable.Creator<StitchContext> CREATOR = new C69738a();

    /* renamed from: a */
    public StitchParams f155846a;

    /* renamed from: b */
    public TimeSpeedModelExtension f155847b;

    static {
        Covode.recordClassIndex(82137);
    }

    public StitchContext(byte b) {
        this();
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StitchContext)) {
            return false;
        }
        StitchContext stitchContext = (StitchContext) obj;
        return C89219l.m154714a(this.f155846a, stitchContext.f155846a) && C89219l.m154714a(this.f155847b, stitchContext.f155847b);
    }

    public final int hashCode() {
        StitchParams stitchParams = this.f155846a;
        int i = 0;
        int hashCode = (stitchParams != null ? stitchParams.hashCode() : 0) * 31;
        TimeSpeedModelExtension timeSpeedModelExtension = this.f155847b;
        if (timeSpeedModelExtension != null) {
            i = timeSpeedModelExtension.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "StitchContext(stitchParams=" + this.f155846a + ", stitchClip=" + this.f155847b + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeParcelable(this.f155846a, i);
        parcel.writeParcelable(this.f155847b, i);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.StitchContext$a */
    public static class C69738a implements Parcelable.Creator<StitchContext> {
        static {
            Covode.recordClassIndex(82138);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ StitchContext[] newArray(int i) {
            return new StitchContext[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ StitchContext createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new StitchContext((StitchParams) parcel.readParcelable(StitchContext.class.getClassLoader()), (TimeSpeedModelExtension) parcel.readParcelable(StitchContext.class.getClassLoader()));
        }
    }

    private /* synthetic */ StitchContext() {
        this(null, null);
    }

    public StitchContext(StitchParams stitchParams, TimeSpeedModelExtension timeSpeedModelExtension) {
        this.f155846a = stitchParams;
        this.f155847b = timeSpeedModelExtension;
    }
}
