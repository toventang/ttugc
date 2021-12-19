package com.p2082ss.android.ugc.aweme.views;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.views.d */
public abstract class AbstractView$OnClickListenerC81432d implements View.OnClickListener {

    /* renamed from: a */
    private final long f182007a;

    /* renamed from: b */
    private final Runnable f182008b;

    /* renamed from: f */
    boolean f182009f;

    static {
        Covode.recordClassIndex(94801);
    }

    /* renamed from: a */
    public abstract void mo77200a(View view);

    public AbstractView$OnClickListenerC81432d() {
        this(300);
    }

    public AbstractView$OnClickListenerC81432d(long j) {
        this.f182009f = true;
        this.f182008b = new RunnableC81433e(this);
        this.f182007a = j;
    }

    public void onClick(View view) {
        ClickAgent.onClick(view);
        if (this.f182009f) {
            this.f182009f = false;
            view.postDelayed(this.f182008b, this.f182007a);
            mo77200a(view);
        }
    }
}
