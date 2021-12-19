package com.p2082ss.android.ugc.aweme.utils;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.utils.bp */
public abstract class AbstractView$OnClickListenerC80259bp implements View.OnClickListener {

    /* renamed from: a */
    private final long f179739a;

    /* renamed from: b */
    private final Runnable f179740b;

    /* renamed from: h */
    public boolean f179741h;

    static {
        Covode.recordClassIndex(93527);
    }

    /* renamed from: a */
    public abstract void mo60873a(View view);

    public AbstractView$OnClickListenerC80259bp() {
        this(300);
    }

    public AbstractView$OnClickListenerC80259bp(long j) {
        this.f179741h = true;
        this.f179740b = new Runnable() {
            /* class com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp.RunnableC802601 */

            static {
                Covode.recordClassIndex(93528);
            }

            public final void run() {
                AbstractView$OnClickListenerC80259bp.this.f179741h = true;
            }
        };
        this.f179739a = j;
    }

    public void onClick(View view) {
        ClickAgent.onClick(view);
        if (this.f179741h) {
            this.f179741h = false;
            view.postDelayed(this.f179740b, this.f179739a);
            mo60873a(view);
        }
    }
}
