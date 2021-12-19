package com.p2082ss.android.ugc.aweme.upvote.detail.panel;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bytedance.assem.arch.core.AbstractC12766p;
import com.bytedance.assem.arch.viewModel.AbstractC12818f;
import com.bytedance.assem.arch.viewModel.C12854k;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.p1722h.C23155d;
import com.bytedance.tux.p1722h.C23163i;
import com.p2082ss.android.ugc.aweme.upvote.p4188b.C79706b;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.b */
public final class C79837b extends AbstractC79808a {

    /* renamed from: j */
    public static final C79838a f179061j = new C79838a((byte) 0);

    /* renamed from: k */
    private final AbstractC89244h f179062k = C89250i.m154773a((AbstractC89171a) new C79844g(this));

    /* renamed from: l */
    private final AbstractC89244h f179063l = C89250i.m154773a((AbstractC89171a) new C79839b(this));

    static {
        Covode.recordClassIndex(93062);
    }

    /* renamed from: B */
    private final TuxButton m138635B() {
        return (TuxButton) this.f179062k.getValue();
    }

    /* renamed from: z */
    public final FrameLayout mo123388z() {
        return (FrameLayout) this.f179063l.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.b$a */
    public static final class C79838a {
        static {
            Covode.recordClassIndex(93063);
        }

        private C79838a() {
        }

        public /* synthetic */ C79838a(byte b) {
            this();
        }
    }

    /* renamed from: A */
    public final void mo123387A() {
        m22977a(mo123383x(), new C79840c(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.b$b */
    static final class C79839b extends AbstractC89220m implements AbstractC89171a<FrameLayout> {

        /* renamed from: a */
        final /* synthetic */ C79837b f179064a;

        static {
            Covode.recordClassIndex(93064);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79839b(C79837b bVar) {
            super(0);
            this.f179064a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ FrameLayout invoke() {
            MethodCollector.m26663i(5362);
            FrameLayout frameLayout = new FrameLayout(this.f179064a.mo20528t().getContext());
            MethodCollector.m26664o(5362);
            return frameLayout;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.b$g */
    static final class C79844g extends AbstractC89220m implements AbstractC89171a<TuxButton> {

        /* renamed from: a */
        final /* synthetic */ C79837b f179069a;

        static {
            Covode.recordClassIndex(93069);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79844g(C79837b bVar) {
            super(0);
            this.f179069a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxButton invoke() {
            Context context = this.f179069a.mo20528t().getContext();
            C89219l.m154716b(context, "");
            return new TuxButton(context, null, 0, 6);
        }
    }

    /* renamed from: C */
    private final void m138636C() {
        MethodCollector.m26663i(4293);
        mo123388z().addView(m138635B());
        View t = mo20528t();
        while (true) {
            View view = null;
            if (t != null && t.getId() != R.id.aeb) {
                if (t.getId() == R.id.ajx && Build.VERSION.SDK_INT >= 21) {
                    t.setElevation(0.0f);
                }
                ViewParent parent = t.getParent();
                if (parent instanceof View) {
                    view = parent;
                }
                t = view;
            }
        }
        if (!(t instanceof CoordinatorLayout)) {
            t = null;
        }
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) t;
        if (coordinatorLayout != null) {
            coordinatorLayout.addView(mo123388z());
            MethodCollector.m26664o(4293);
            return;
        }
        MethodCollector.m26664o(4293);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.b$c */
    public static final class C79840c extends AbstractC89220m implements AbstractC89172b<C79884l, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C79837b f179065a;

        static {
            Covode.recordClassIndex(93065);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79840c(C79837b bVar) {
            super(1);
            this.f179065a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C79884l lVar) {
            C79884l lVar2 = lVar;
            C89219l.m154721d(lVar2, "");
            FrameLayout z = this.f179065a.mo123388z();
            int i = 8;
            if (lVar2.f179120c >= 0.0f && !lVar2.f179119b) {
                i = 0;
            }
            z.setVisibility(i);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.b$f */
    static final class View$OnClickListenerC79843f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C79837b f179068a;

        static {
            Covode.recordClassIndex(93068);
        }

        View$OnClickListenerC79843f(C79837b bVar) {
            this.f179068a = bVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
            r7 = r2.f179147c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0029, code lost:
            if (r7 != null) goto L_0x002e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
            r7 = r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
            if (r2 == null) goto L_0x0032;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
            r0 = r2.f179149e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
            if (r0 != null) goto L_0x003b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0032, code lost:
            com.p2082ss.android.ugc.aweme.upvote.publish.C79981c.m138708a(r1, new com.p2082ss.android.ugc.aweme.upvote.event.UpvotePublishMobParam(r4, "recommend_panel", r6, r7, r8));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x003a, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x003b, code lost:
            r8 = r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x001e, code lost:
            if (r2 != null) goto L_0x0020;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0022, code lost:
            if (r6 == null) goto L_0x0024;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
            r6 = r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0025, code lost:
            if (r2 == null) goto L_0x002b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r10) {
            /*
                r9 = this;
                com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent.onClick(r10)
                com.ss.android.ugc.aweme.upvote.detail.panel.b r0 = r9.f179068a
                com.ss.android.ugc.aweme.upvote.detail.UpvoteListViewModel r0 = r0.mo123382w()
                com.ss.android.ugc.aweme.upvote.event.b r2 = r0.f178883d
                com.ss.android.ugc.aweme.upvote.detail.panel.b r0 = r9.f179068a
                com.ss.android.ugc.aweme.upvote.detail.panel.f r0 = r0.mo123381v()
                java.lang.String r1 = r0.f179095a
                com.ss.android.ugc.aweme.upvote.event.UpvotePublishMobParam r3 = new com.ss.android.ugc.aweme.upvote.event.UpvotePublishMobParam
                java.lang.String r8 = ""
                if (r2 == 0) goto L_0x001d
                java.lang.String r4 = r2.f179145a
                if (r4 != 0) goto L_0x0020
            L_0x001d:
                r4 = r8
                if (r2 == 0) goto L_0x0024
            L_0x0020:
                java.lang.String r6 = r2.f179146b
                if (r6 != 0) goto L_0x0027
            L_0x0024:
                r6 = r8
                if (r2 == 0) goto L_0x002b
            L_0x0027:
                java.lang.String r7 = r2.f179147c
                if (r7 != 0) goto L_0x002e
            L_0x002b:
                r7 = r8
                if (r2 == 0) goto L_0x0032
            L_0x002e:
                java.lang.String r0 = r2.f179149e
                if (r0 != 0) goto L_0x003b
            L_0x0032:
                java.lang.String r5 = "recommend_panel"
                r3.<init>(r4, r5, r6, r7, r8)
                com.p2082ss.android.ugc.aweme.upvote.publish.C79981c.m138708a(r1, r3)
                return
            L_0x003b:
                r8 = r0
                goto L_0x0032
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.upvote.detail.panel.C79837b.View$OnClickListenerC79843f.onClick(android.view.View):void");
        }
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: b */
    public final void mo20630b(View view) {
        C89219l.m154721d(view, "");
        TuxButton B = m138635B();
        B.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        B.setButtonVariant(0);
        B.setButtonSize(3);
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        Integer valueOf = Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 16.0f, system.getDisplayMetrics())));
        Resources system2 = Resources.getSystem();
        C89219l.m154709a((Object) system2, "");
        Integer valueOf2 = Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 16.0f, system2.getDisplayMetrics())));
        Resources system3 = Resources.getSystem();
        C89219l.m154709a((Object) system3, "");
        Integer valueOf3 = Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 12.0f, system3.getDisplayMetrics())));
        Resources system4 = Resources.getSystem();
        C89219l.m154709a((Object) system4, "");
        C23163i.m43668b(B, valueOf, valueOf3, valueOf2, Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 12.0f, system4.getDisplayMetrics()))), false, 16);
        B.setText(B.getContext().getString(((Number) C79706b.m138537a(Integer.valueOf((int) R.string.f64), Integer.valueOf((int) R.string.fai))).intValue()));
        B.mo37348a(Integer.valueOf(((Number) C79706b.m138537a(Integer.valueOf((int) R.raw.icon_raising_star), Integer.valueOf((int) R.raw.icon_repost))).intValue()));
        FrameLayout z = mo123388z();
        CoordinatorLayout.C0560e eVar = new CoordinatorLayout.C0560e(-1, -2);
        eVar.f2418c = 80;
        z.setLayoutParams(eVar);
        z.setId(R.id.f9x);
        Context context = z.getContext();
        C89219l.m154716b(context, "");
        Integer a = C23155d.m43641a(context, R.attr.m);
        if (a != null) {
            z.setBackgroundColor(a.intValue());
        }
        m138636C();
        AbstractC12818f.C12819a.m23063a(this, mo123383x(), C79845c.f179070a, (C12854k) null, new C79841d(this), 6);
        AbstractC12818f.C12819a.m23063a(this, mo123383x(), C79846d.f179071a, (C12854k) null, new C79842e(this), 6);
        m138635B().setOnClickListener(new View$OnClickListenerC79843f(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.b$d */
    static final class C79841d extends AbstractC89220m implements AbstractC89183m<AbstractC12766p, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C79837b f179066a;

        static {
            Covode.recordClassIndex(93066);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79841d(C79837b bVar) {
            super(2);
            this.f179066a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC12766p pVar, Boolean bool) {
            bool.booleanValue();
            C89219l.m154721d(pVar, "");
            this.f179066a.mo123387A();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.b$e */
    static final class C79842e extends AbstractC89220m implements AbstractC89183m<AbstractC12766p, Float, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C79837b f179067a;

        static {
            Covode.recordClassIndex(93067);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79842e(C79837b bVar) {
            super(2);
            this.f179067a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC12766p pVar, Float f) {
            f.floatValue();
            C89219l.m154721d(pVar, "");
            this.f179067a.mo123387A();
            return C89391z.f203057a;
        }
    }
}
