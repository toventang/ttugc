package com.p2082ss.android.ugc.aweme.shortvideo.model;

import android.content.Context;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89214g;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.model.CanvasVideoEditorTrackViewModel */
public final class CanvasVideoEditorTrackViewModel extends AbstractC1174ac {
    public static final Companion Companion = new Companion(null);
    public int filterIndex = Integer.MIN_VALUE;

    static {
        Covode.recordClassIndex(84555);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.model.CanvasVideoEditorTrackViewModel$Companion */
    public static final class Companion {
        static {
            Covode.recordClassIndex(84556);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(C89214g gVar) {
            this();
        }

        /* renamed from: com_ss_android_ugc_aweme_shortvideo_model_CanvasVideoEditorTrackViewModel$Companion_androidx_lifecycle_VScopeLancet_of */
        public static C1175ad m127075xbf94d881(ActivityC0945e eVar) {
            return C1181ae.m3881a(eVar, (C1175ad.AbstractC1177b) null);
        }

        public final CanvasVideoEditorTrackViewModel get(Context context) {
            if (context instanceof ActivityC0945e) {
                return (CanvasVideoEditorTrackViewModel) m127075xbf94d881((ActivityC0945e) context).mo3983a(CanvasVideoEditorTrackViewModel.class);
            }
            return null;
        }
    }

    public final boolean isFilterIndexValid() {
        if (this.filterIndex != Integer.MIN_VALUE) {
            return true;
        }
        return false;
    }
}
