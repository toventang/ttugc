package com.p2082ss.android.ugc.aweme.shortvideo.cut;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.C1481r;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VideoLayoutManager */
public final class VideoLayoutManager extends LinearLayoutManager {

    /* renamed from: a */
    public final C70043a f156633a;

    static {
        Covode.recordClassIndex(82462);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VideoLayoutManager$a */
    public final class C70043a extends C1481r {

        /* renamed from: f */
        final /* synthetic */ VideoLayoutManager f156634f;

        static {
            Covode.recordClassIndex(82463);
        }

        @Override // androidx.recyclerview.widget.C1481r
        /* renamed from: a */
        public final float mo4862a(DisplayMetrics displayMetrics) {
            C89219l.m154721d(displayMetrics, "");
            return 200.0f / ((float) displayMetrics.densityDpi);
        }

        @Override // androidx.recyclerview.widget.C1481r
        /* renamed from: b */
        public final int mo5014b(int i) {
            if (i > 2000) {
                i = LiveNetAdaptiveHurryTimeSetting.DEFAULT;
            }
            return super.mo5014b(i);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C70043a(VideoLayoutManager videoLayoutManager, Context context) {
            super(context);
            C89219l.m154721d(context, "");
            this.f156634f = videoLayoutManager;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VideoLayoutManager(Context context) {
        super(0, false);
        C89219l.m154721d(context, "");
        this.f156633a = new C70043a(this, context);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public final void mo4354a(RecyclerView recyclerView, RecyclerView.C1378s sVar, int i) {
        C89219l.m154721d(recyclerView, "");
        C70043a aVar = this.f156633a;
        aVar.f4515g = i;
        mo4695a(aVar);
    }
}
