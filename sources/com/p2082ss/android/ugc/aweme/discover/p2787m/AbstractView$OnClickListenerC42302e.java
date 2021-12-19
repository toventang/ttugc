package com.p2082ss.android.ugc.aweme.discover.p2787m;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.discover.m.e */
public abstract class AbstractView$OnClickListenerC42302e implements View.OnClickListener {

    /* renamed from: a */
    private long f98541a;

    /* renamed from: b */
    private final long f98542b;

    static {
        Covode.recordClassIndex(50245);
    }

    public AbstractView$OnClickListenerC42302e(char c) {
        this((byte) 0);
    }

    /* renamed from: a */
    public abstract void mo70821a();

    private AbstractView$OnClickListenerC42302e() {
        this.f98542b = 500;
    }

    public /* synthetic */ AbstractView$OnClickListenerC42302e(byte b) {
        this();
    }

    public void onClick(View view) {
        ClickAgent.onClick(view);
        if (System.currentTimeMillis() - this.f98541a >= this.f98542b) {
            this.f98541a = System.currentTimeMillis();
            mo70821a();
        }
    }
}
