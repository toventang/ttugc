package com.p2082ss.android.ugc.aweme.performance;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.performance.OpenMusicPanelPerformanceMonitor */
public final class OpenMusicPanelPerformanceMonitor implements PerformanceMonitor {
    public static final Parcelable.Creator<OpenMusicPanelPerformanceMonitor> CREATOR = new C62826a();

    /* renamed from: a */
    public static final OpenMusicPanelPerformanceMonitor f142464a = new OpenMusicPanelPerformanceMonitor();

    @Override // com.p2082ss.android.ugc.aweme.performance.PerformanceMonitor
    /* renamed from: a */
    public final String mo100786a() {
        return "tool_performance_open_choose_music_panel";
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeInt(1);
    }

    private OpenMusicPanelPerformanceMonitor() {
    }

    /* renamed from: com.ss.android.ugc.aweme.performance.OpenMusicPanelPerformanceMonitor$a */
    public static class C62826a implements Parcelable.Creator<OpenMusicPanelPerformanceMonitor> {
        static {
            Covode.recordClassIndex(73651);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ OpenMusicPanelPerformanceMonitor[] newArray(int i) {
            return new OpenMusicPanelPerformanceMonitor[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ OpenMusicPanelPerformanceMonitor createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            if (parcel.readInt() != 0) {
                return OpenMusicPanelPerformanceMonitor.f142464a;
            }
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.performance.PerformanceMonitor
    /* renamed from: b */
    public final List<String> mo100787b() {
        return C89070n.m154525d("animation_finished", "set_music_data");
    }

    static {
        Covode.recordClassIndex(73650);
    }
}
