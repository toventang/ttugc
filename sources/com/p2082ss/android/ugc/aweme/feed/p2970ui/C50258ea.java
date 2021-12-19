package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p084a.p088b.C1870c;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.feed.assem.report.C48956a;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.ea */
public final class C50258ea extends AbstractC49544a {

    /* renamed from: a */
    public static final C50259a f116054a = new C50259a((byte) 0);

    /* renamed from: b */
    private final View f116055b;

    static {
        Covode.recordClassIndex(59384);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: a */
    public final void mo80928a() {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: a */
    public final void mo80931a(DataCenter dataCenter) {
        C89219l.m154721d(dataCenter, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.ea$a */
    public static final class C50259a {
        static {
            Covode.recordClassIndex(59385);
        }

        private C50259a() {
        }

        public /* synthetic */ C50259a(byte b) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C50258ea(View view) {
        super(view);
        C89219l.m154721d(view, "");
        this.f116055b = view;
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.ea$b */
    static final class View$OnClickListenerC50260b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C50258ea f116056a;

        static {
            Covode.recordClassIndex(59386);
        }

        View$OnClickListenerC50260b(C50258ea eaVar) {
            this.f116056a = eaVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Aweme aweme = this.f116056a.f113953L;
            C89219l.m154716b(aweme, "");
            View view2 = this.f116056a.f113961T;
            C89219l.m154716b(view2, "");
            C48956a.m92139a(aweme, view2);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: b */
    public final void mo80935b(C33942b bVar) {
        MethodCollector.m26663i(4538);
        if (!this.f113952K) {
            this.f113952K = true;
            if (this.f113960S instanceof FrameLayout) {
                ((FrameLayout) this.f113960S).addView(this.f113961T);
            }
        }
        MethodCollector.m26664o(4538);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: a */
    public final void mo80929a(View view) {
        C89219l.m154721d(view, "");
        Context context = this.f113959R;
        Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
        this.f113961T = C1870c.m6045a((Activity) context, (int) R.layout.su);
        View view2 = this.f113961T;
        C89219l.m154716b(view2, "");
        view2.setVisibility(0);
        this.f113961T.setOnClickListener(new View$OnClickListenerC50260b(this));
    }
}
