package com.p2082ss.android.ugc.aweme.views;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.views.k */
public abstract class AbstractView$OnClickListenerC81441k implements View.OnClickListener {

    /* renamed from: b */
    public static boolean f182028b = true;

    /* renamed from: c */
    public static final C81442a f182029c = new C81442a((byte) 0);

    /* renamed from: a */
    private final int f182030a;

    /* renamed from: d */
    private final boolean f182031d;

    /* renamed from: e */
    private boolean f182032e;

    /* renamed from: f */
    private final Runnable f182033f;

    public AbstractView$OnClickListenerC81441k() {
        this(600, false, 2);
    }

    public AbstractView$OnClickListenerC81441k(byte b) {
        this(0, false, 3);
    }

    /* renamed from: a */
    public abstract void mo78773a(View view);

    /* renamed from: com.ss.android.ugc.aweme.views.k$a */
    public static final class C81442a {
        static {
            Covode.recordClassIndex(94811);
        }

        private C81442a() {
        }

        public /* synthetic */ C81442a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.views.k$b */
    static final class RunnableC81443b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractView$OnClickListenerC81441k f182034a;

        static {
            Covode.recordClassIndex(94812);
        }

        RunnableC81443b(AbstractView$OnClickListenerC81441k kVar) {
            this.f182034a = kVar;
        }

        public final void run() {
            this.f182034a.mo125094a(true);
        }
    }

    static {
        Covode.recordClassIndex(94810);
    }

    /* renamed from: a */
    public final void mo125094a(boolean z) {
        if (this.f182031d) {
            f182028b = z;
        } else {
            this.f182032e = z;
        }
    }

    public void onClick(View view) {
        boolean z;
        ClickAgent.onClick(view);
        C89219l.m154721d(view, "");
        if (this.f182031d) {
            z = f182028b;
        } else {
            z = this.f182032e;
        }
        if (z) {
            mo125094a(false);
            view.postDelayed(this.f182033f, (long) this.f182030a);
            mo78773a(view);
        }
    }

    private AbstractView$OnClickListenerC81441k(int i, boolean z) {
        this.f182032e = true;
        this.f182033f = new RunnableC81443b(this);
        this.f182030a = i;
        this.f182031d = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractView$OnClickListenerC81441k(int i, boolean z, int i2) {
        this((i2 & 1) != 0 ? 300 : i, (i2 & 2) != 0 ? true : z);
    }
}
