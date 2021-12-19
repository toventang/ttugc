package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.shortvideo.C71804ej;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73560cj;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73977ba;
import com.p2082ss.android.ugc.aweme.utils.KeyBoardMonitor;
import com.p2082ss.android.ugc.trill.R;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.cm */
public final /* synthetic */ class ViewTreeObserver$OnGlobalLayoutListenerC73580cm implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    private final C73560cj f165384a;

    static {
        Covode.recordClassIndex(86317);
    }

    ViewTreeObserver$OnGlobalLayoutListenerC73580cm(C73560cj cjVar) {
        this.f165384a = cjVar;
    }

    public final void onGlobalLayout() {
        MethodCollector.m26663i(10794);
        C73560cj cjVar = this.f165384a;
        if (cjVar.f165345t == null) {
            cjVar.f165345t = View.inflate(cjVar.getContext(), R.layout.agw, null);
            cjVar.f165344s.addView(cjVar.f165345t, cjVar.f165344s.getWidth(), cjVar.f165344s.getHeight());
            cjVar.f165345t.setAlpha(0.196f);
            cjVar.f165261D.setAlpha(0.196f);
            cjVar.f165345t.setOnClickListener(View$OnClickListenerC73652ev.f165482a);
            cjVar.f165261D.setOnClickListener(View$OnClickListenerC73653ew.f165483a);
            C73977ba.m130111a(cjVar.f165345t);
            C71804ej ejVar = cjVar.f165343r;
            C73560cj.C7356210 r2 = new KeyBoardMonitor.AbstractC80174a() {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73560cj.C7356210 */

                static {
                    Covode.recordClassIndex(86299);
                }

                @Override // com.p2082ss.android.ugc.aweme.utils.KeyBoardMonitor.AbstractC80174a
                /* renamed from: b */
                public final void mo116177b() {
                    C73560cj.this.f165345t.setVisibility(8);
                    if (C73560cj.this.f165343r.f160930u) {
                        C73560cj.this.f165261D.setVisibility(8);
                    }
                }

                @Override // com.p2082ss.android.ugc.aweme.utils.KeyBoardMonitor.AbstractC80174a
                /* renamed from: a */
                public final void mo116176a() {
                    if (C73560cj.this.f165267J.getVisibility() == 0) {
                        C73560cj.this.f165345t.setVisibility(8);
                    } else {
                        C73560cj.this.f165345t.setVisibility(0);
                    }
                    if (C73560cj.this.f165343r.f160930u) {
                        C73560cj.this.f165261D.setVisibility(0);
                    }
                }
            };
            KeyBoardMonitor keyBoardMonitor = new KeyBoardMonitor(ejVar.f160911b);
            keyBoardMonitor.f179615a = ejVar.f160912c.getRootView();
            keyBoardMonitor.f179616b = r2;
            if (keyBoardMonitor.f179615a != null) {
                keyBoardMonitor.f179615a.getViewTreeObserver().addOnGlobalLayoutListener(keyBoardMonitor);
            }
        }
        MethodCollector.m26664o(10794);
    }
}
