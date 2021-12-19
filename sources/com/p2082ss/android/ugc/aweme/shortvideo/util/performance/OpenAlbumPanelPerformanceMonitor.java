package com.p2082ss.android.ugc.aweme.shortvideo.util.performance;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.performance.PerformanceMonitor;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.performance.OpenAlbumPanelPerformanceMonitor */
public final class OpenAlbumPanelPerformanceMonitor implements PerformanceMonitor {
    public static final Parcelable.Creator<OpenAlbumPanelPerformanceMonitor> CREATOR = new C74028a();

    /* renamed from: a */
    public static final OpenAlbumPanelPerformanceMonitor f166158a = new OpenAlbumPanelPerformanceMonitor();

    @Override // com.p2082ss.android.ugc.aweme.performance.PerformanceMonitor
    /* renamed from: a */
    public final String mo100786a() {
        return "tool_performance_open_album_panel";
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeInt(1);
    }

    private OpenAlbumPanelPerformanceMonitor() {
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.util.performance.OpenAlbumPanelPerformanceMonitor$a */
    public static class C74028a implements Parcelable.Creator<OpenAlbumPanelPerformanceMonitor> {
        static {
            Covode.recordClassIndex(86780);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ OpenAlbumPanelPerformanceMonitor[] newArray(int i) {
            return new OpenAlbumPanelPerformanceMonitor[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ OpenAlbumPanelPerformanceMonitor createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            if (parcel.readInt() != 0) {
                return OpenAlbumPanelPerformanceMonitor.f166158a;
            }
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.performance.PerformanceMonitor
    /* renamed from: b */
    public final List<String> mo100787b() {
        return C89070n.m154525d("imageLoaded", "animationEnded");
    }

    static {
        Covode.recordClassIndex(86779);
    }
}
