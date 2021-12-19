package com.p2082ss.android.p2092ad.splash.core.p2096a;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ad.splash.core.a.a */
public abstract class AbstractView$OnClickListenerC29388a implements View.OnClickListener {

    /* renamed from: a */
    private long f69774a;

    /* renamed from: b */
    public boolean f69775b;

    static {
        Covode.recordClassIndex(35782);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo51385a();

    public AbstractView$OnClickListenerC29388a() {
        this((byte) 0);
    }

    private AbstractView$OnClickListenerC29388a(byte b) {
        this.f69775b = true;
        this.f69774a = 500;
    }

    public void onClick(View view) {
        ClickAgent.onClick(view);
        if (this.f69775b) {
            this.f69775b = false;
            view.postDelayed(new Runnable() {
                /* class com.p2082ss.android.p2092ad.splash.core.p2096a.AbstractView$OnClickListenerC29388a.RunnableC293891 */

                static {
                    Covode.recordClassIndex(35783);
                }

                public final void run() {
                    AbstractView$OnClickListenerC29388a.this.f69775b = true;
                }
            }, this.f69774a);
            mo51385a();
        }
    }
}
