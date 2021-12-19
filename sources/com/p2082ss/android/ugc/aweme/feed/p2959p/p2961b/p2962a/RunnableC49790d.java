package com.p2082ss.android.ugc.aweme.feed.p2959p.p2961b.p2962a;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.feed.experiment.C49517i;
import com.p2082ss.android.ugc.aweme.feed.p2959p.C49783b;
import com.p2082ss.android.ugc.aweme.feed.p2959p.p2961b.p2962a.C49788c;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.p.b.a.d */
final /* synthetic */ class RunnableC49790d implements Runnable {

    /* renamed from: a */
    private final C49788c.C497891 f114542a;

    /* renamed from: b */
    private final Boolean f114543b;

    static {
        Covode.recordClassIndex(58895);
    }

    RunnableC49790d(C49788c.C497891 r1, Boolean bool) {
        this.f114542a = r1;
        this.f114543b = bool;
    }

    public final void run() {
        MethodCollector.m26663i(6734);
        C49788c.C497891 r4 = this.f114542a;
        Boolean bool = this.f114543b;
        if (C49788c.this.f114536a == null || C49788c.this.f114536a.isFinishing() || C49788c.this.f114537b == null) {
            MethodCollector.m26664o(6734);
        } else if (!bool.booleanValue()) {
            C49788c.this.mo84327b();
            MethodCollector.m26664o(6734);
        } else if (C49517i.f113890a) {
            new C79459a(C49788c.this.f114536a).mo123050a(R.string.acq).mo123053a();
            MethodCollector.m26664o(6734);
        } else {
            if (C49788c.this.f114538c == null) {
                C49788c.this.f114538c = new C49785a((Context) C49788c.this.f114536a, (char) 0);
                if (C49788c.this.f114537b instanceof FrameLayout) {
                    ((FrameLayout) C49788c.this.f114537b).addView(C49788c.this.f114538c);
                }
            }
            C49788c cVar = C49788c.this;
            if (cVar.f114538c != null) {
                C49785a aVar = cVar.f114538c;
                if (C49783b.m93234a()) {
                    FrameLayout frameLayout = aVar.f114534a;
                    C89219l.m154716b(frameLayout, "");
                    frameLayout.setVisibility(0);
                }
            }
            MethodCollector.m26664o(6734);
        }
    }
}
