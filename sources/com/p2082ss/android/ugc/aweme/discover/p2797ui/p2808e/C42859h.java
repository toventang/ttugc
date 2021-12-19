package com.p2082ss.android.ugc.aweme.discover.p2797ui.p2808e;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.adapter.AbstractView$OnAttachStateChangeListenerC41671b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.e.h */
public final class C42859h extends AbstractView$OnAttachStateChangeListenerC41671b {

    /* renamed from: b */
    public static final C42860a f99946b = new C42860a((byte) 0);

    /* renamed from: a */
    public final AbstractC42844b f99947a;

    static {
        Covode.recordClassIndex(50963);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.e.h$a */
    public static final class C42860a {
        static {
            Covode.recordClassIndex(50964);
        }

        private C42860a() {
        }

        public /* synthetic */ C42860a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.e.h$b */
    static final class View$OnClickListenerC42861b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C42859h f99948a;

        static {
            Covode.recordClassIndex(50965);
        }

        View$OnClickListenerC42861b(C42859h hVar) {
            this.f99948a = hVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f99948a.f99947a.mo73090d();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42859h(View view, AbstractC42844b bVar) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(bVar, "");
        this.f99947a = bVar;
    }
}
