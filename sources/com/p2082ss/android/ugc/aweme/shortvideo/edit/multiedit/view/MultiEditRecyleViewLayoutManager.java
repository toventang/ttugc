package com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.C1481r;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.MultiEditRecyleViewLayoutManager */
public final class MultiEditRecyleViewLayoutManager extends LinearLayoutManager {

    /* renamed from: a */
    private final C71495a f160210a;

    static {
        Covode.recordClassIndex(84035);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.MultiEditRecyleViewLayoutManager$a */
    public final class C71495a extends C1481r {
        static {
            Covode.recordClassIndex(84036);
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

        public C71495a(Context context) {
            super(context);
        }
    }

    public MultiEditRecyleViewLayoutManager(Context context) {
        super(0, false);
        this.f160210a = new C71495a(context);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public final void mo4354a(RecyclerView recyclerView, RecyclerView.C1378s sVar, int i) {
        C89219l.m154721d(recyclerView, "");
        C71495a aVar = this.f160210a;
        aVar.f4515g = i;
        mo4695a(aVar);
    }
}
