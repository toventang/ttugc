package com.p2082ss.android.ugc.aweme.shortvideo.util.performance;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.performance.PerformanceMonitor;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.performance.CameraFirstFramePerformanceMonitor */
public final class CameraFirstFramePerformanceMonitor implements PerformanceMonitor {
    public static final Parcelable.Creator<CameraFirstFramePerformanceMonitor> CREATOR = new C74027a();

    /* renamed from: a */
    public static final CameraFirstFramePerformanceMonitor f166157a = new CameraFirstFramePerformanceMonitor();

    @Override // com.p2082ss.android.ugc.aweme.performance.PerformanceMonitor
    /* renamed from: a */
    public final String mo100786a() {
        return "av_video_record_init";
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeInt(1);
    }

    private CameraFirstFramePerformanceMonitor() {
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.util.performance.CameraFirstFramePerformanceMonitor$a */
    public static class C74027a implements Parcelable.Creator<CameraFirstFramePerformanceMonitor> {
        static {
            Covode.recordClassIndex(86778);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ CameraFirstFramePerformanceMonitor[] newArray(int i) {
            return new CameraFirstFramePerformanceMonitor[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CameraFirstFramePerformanceMonitor createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            if (parcel.readInt() != 0) {
                return CameraFirstFramePerformanceMonitor.f166157a;
            }
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.performance.PerformanceMonitor
    /* renamed from: b */
    public final List<String> mo100787b() {
        return C89070n.m154525d("camera frame available", "PlanC onResume");
    }

    static {
        Covode.recordClassIndex(86777);
    }
}
