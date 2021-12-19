package com.p2082ss.android.ugc.aweme.comment.adapter;

import androidx.constraintlayout.widget.C0550b;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.comment.adapter.o */
final /* synthetic */ class RunnableC36242o implements Runnable {

    /* renamed from: a */
    private final C36229h f85614a;

    static {
        Covode.recordClassIndex(43508);
    }

    RunnableC36242o(C36229h hVar) {
        this.f85614a = hVar;
    }

    public final void run() {
        C36229h hVar = this.f85614a;
        int width = hVar.f85598w.getWidth();
        int b = (int) C13628n.m24520b(hVar.f85598w.getContext(), 80.0f);
        C0550b bVar = new C0550b();
        bVar.mo2451a((ConstraintLayout) hVar.f85576a);
        if (C80471gb.m139482a()) {
            bVar.mo2446a(R.id.f2i, 7);
            bVar.mo2446a(R.id.f2i, 6);
            bVar.mo2448a(R.id.f2i, 6, R.id.byy, 7);
            bVar.mo2448a(R.id.f2i, 7, R.id.bd3, 7);
            bVar.mo2445a(R.id.f2i, 0.0f);
            hVar.f85598w.setTextAlignment(5);
        }
        if (width < b) {
            bVar.mo2457d(R.id.f2i).f2342an = b;
        }
        bVar.mo2454b((ConstraintLayout) hVar.f85576a);
    }
}
