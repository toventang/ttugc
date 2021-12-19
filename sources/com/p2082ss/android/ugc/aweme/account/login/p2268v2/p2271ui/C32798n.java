package com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.account.view.AbstractC33062b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.n */
public final class C32798n {

    /* renamed from: e */
    public static final C32799a f78148e = new C32799a((byte) 0);

    /* renamed from: a */
    public long f78149a = System.currentTimeMillis();

    /* renamed from: b */
    final AbstractC89244h f78150b = C89250i.m154773a((AbstractC89171a) C32800b.f78153a);

    /* renamed from: c */
    public final View f78151c;

    /* renamed from: d */
    public final AbstractC33062b f78152d;

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.n$e */
    static final class C32803e<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C32803e f78157a = new C32803e();

        static {
            Covode.recordClassIndex(39582);
        }

        C32803e() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(39577);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.n$a */
    public static final class C32799a {
        static {
            Covode.recordClassIndex(39578);
        }

        private C32799a() {
        }

        public /* synthetic */ C32799a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.n$b */
    static final class C32800b extends AbstractC89220m implements AbstractC89171a<PrivateAccountUserSettingsApi> {

        /* renamed from: a */
        public static final C32800b f78153a = new C32800b();

        static {
            Covode.recordClassIndex(39579);
        }

        C32800b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ PrivateAccountUserSettingsApi invoke() {
            return RetrofitFactory.m33635a().mo28817b(C29736b.f70924e).mo28832d().mo28858a(PrivateAccountUserSettingsApi.class);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.n$f */
    static final class C32804f<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C32804f f78158a = new C32804f();

        static {
            Covode.recordClassIndex(39583);
        }

        C32804f() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            ((Throwable) obj).getMessage();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.n$d */
    public static final class C32802d extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ Context f78155a;

        /* renamed from: b */
        final /* synthetic */ int f78156b;

        static {
            Covode.recordClassIndex(39581);
        }

        public final void onClick(View view) {
            C89219l.m154721d(view, "");
            SmartRouter.buildRoute(this.f78155a, C32797m.m67389a()).open();
        }

        public final void updateDrawState(TextPaint textPaint) {
            C89219l.m154721d(textPaint, "");
            textPaint.setColor(this.f78156b);
            textPaint.setFakeBoldText(true);
            textPaint.setUnderlineText(false);
        }

        C32802d(Context context, int i) {
            this.f78155a = context;
            this.f78156b = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.n$c */
    static final class View$OnClickListenerC32801c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C32798n f78154a;

        static {
            Covode.recordClassIndex(39580);
        }

        View$OnClickListenerC32801c(C32798n nVar) {
            this.f78154a = nVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C39162r.m79460a("private_notify_exit", new C33744d().mo59983a("result", "get_started").mo59981a("stay_time", System.currentTimeMillis() - this.f78154a.f78149a).f79943a);
            this.f78154a.f78152d.mo58492a();
        }
    }

    public C32798n(View view, AbstractC33062b bVar) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(bVar, "");
        this.f78151c = view;
        this.f78152d = bVar;
    }
}
