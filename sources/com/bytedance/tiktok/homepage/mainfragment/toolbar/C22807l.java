package com.bytedance.tiktok.homepage.mainfragment.toolbar;

import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.bytedance.tiktok.homepage.mainfragment.toolbar.l */
public final class C22807l {

    /* renamed from: a */
    boolean f53852a;

    /* renamed from: b */
    private FrameLayout f53853b;

    static {
        Covode.recordClassIndex(26703);
    }

    public C22807l(FrameLayout frameLayout) {
        this.f53853b = frameLayout;
    }

    /* renamed from: a */
    public final void mo37114a(AbstractC22773c cVar) {
        MethodCollector.m26663i(14120);
        if (cVar == null) {
            MethodCollector.m26664o(14120);
            return;
        }
        View b = cVar.mo37086b();
        if (b == null) {
            MethodCollector.m26664o(14120);
            return;
        }
        if (!cVar.mo37095d()) {
            b.setOnClickListener(new View$OnClickListenerC22808m(cVar));
        }
        if (b.getLayoutParams() instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) b.getLayoutParams();
            layoutParams.gravity = cVar.mo37087c();
            b.setLayoutParams(layoutParams);
        }
        this.f53853b.addView(b);
        MethodCollector.m26664o(14120);
    }

    /* renamed from: b */
    public final void mo37115b(AbstractC22773c cVar) {
        MethodCollector.m26663i(14146);
        if (this.f53852a) {
            MethodCollector.m26664o(14146);
            return;
        }
        if (cVar != null && cVar.mo37085a()) {
            View b = cVar.mo37086b();
            if (b == null) {
                MethodCollector.m26664o(14146);
                return;
            }
            this.f53852a = true;
            b.setOnClickListener(new View$OnClickListenerC22809n(cVar));
            if (b.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) b.getLayoutParams();
                layoutParams.gravity = cVar.mo37087c();
                b.setLayoutParams(layoutParams);
            }
            this.f53853b.addView(b);
        }
        MethodCollector.m26664o(14146);
    }
}
