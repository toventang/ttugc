package com.p2082ss.android.ugc.aweme.qna.p3643a;

import android.app.Activity;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1182af;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.AbstractC12748a;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.C12752d;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.extensions.C12777b;
import com.bytedance.assem.arch.extensions.C12786i;
import com.bytedance.assem.arch.p797d.AbstractC12769a;
import com.bytedance.assem.arch.viewModel.AbstractC12848i;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.C12814b;
import com.bytedance.assem.arch.viewModel.C12815c;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.lighten.p1477a.EnumC20767w;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.google.android.material.appbar.AppBarLayout;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.qna.api.C66006c;
import com.p2082ss.android.ugc.aweme.qna.api.C66011h;
import com.p2082ss.android.ugc.aweme.qna.p3650ui.AbstractC66301a;
import com.p2082ss.android.ugc.aweme.qna.p3651vm.C66360f;
import com.p2082ss.android.ugc.aweme.qna.p3651vm.QnaBannerViewModel;
import com.p2082ss.android.ugc.aweme.utils.C80397em;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.qna.a.e */
public final class C65913e extends AbstractC12769a {

    /* renamed from: l */
    public static final C65937v f148481l = new C65937v((byte) 0);

    /* renamed from: j */
    public Activity f148482j;

    /* renamed from: k */
    public boolean f148483k;

    /* renamed from: m */
    private final C12786i f148484m = new C12786i(bW_(), new C65936u(this, null));

    /* renamed from: n */
    private final C12814b f148485n;

    /* renamed from: com.ss.android.ugc.aweme.qna.a.e$l */
    public static final class C65927l extends AbstractC89220m implements AbstractC89172b<C66360f, C66360f> {
        public static final C65927l INSTANCE = new C65927l();

        static {
            Covode.recordClassIndex(77432);
        }

        public C65927l() {
            super(1);
        }

        public final C66360f invoke(C66360f fVar) {
            C89219l.m154719c(fVar, "");
            return fVar;
        }
    }

    static {
        Covode.recordClassIndex(77418);
    }

    /* renamed from: v */
    private final C66006c m117810v() {
        return (C66006c) this.f148484m.getValue();
    }

    /* renamed from: w */
    private final QnaBannerViewModel m117811w() {
        return (QnaBannerViewModel) this.f148485n.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.e$h */
    public static final class C65923h extends AbstractC89220m implements AbstractC89171a<AbstractC12748a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f148497a;

        static {
            Covode.recordClassIndex(77428);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65923h(AbstractC12748a aVar) {
            super(0);
            this.f148497a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC12748a invoke() {
            return this.f148497a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.e$v */
    public static final class C65937v {
        static {
            Covode.recordClassIndex(77442);
        }

        private C65937v() {
        }

        public /* synthetic */ C65937v(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.e$d */
    public static final class C65919d extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C65919d INSTANCE = new C65919d();

        static {
            Covode.recordClassIndex(77424);
        }

        public C65919d() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.e$g */
    public static final class C65922g extends AbstractC89220m implements AbstractC89171a<C12874b<C66360f>> {
        public static final C65922g INSTANCE = new C65922g();

        static {
            Covode.recordClassIndex(77427);
        }

        public C65922g() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C66360f> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.e$i */
    public static final class C65924i extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f148498a;

        static {
            Covode.recordClassIndex(77429);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65924i(AbstractC12748a aVar) {
            super(0);
            this.f148498a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            return this.f148498a.getViewModelStore();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.e$j */
    public static final class C65925j extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f148499a;

        static {
            Covode.recordClassIndex(77430);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65925j(AbstractC12748a aVar) {
            super(0);
            this.f148499a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            return this.f148499a.mo20598q();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.e$n */
    public static final class C65929n extends AbstractC89220m implements AbstractC89171a<C12874b<C66360f>> {
        public static final C65929n INSTANCE = new C65929n();

        static {
            Covode.recordClassIndex(77434);
        }

        public C65929n() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C66360f> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.e$q */
    public static final class C65932q extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C65932q INSTANCE = new C65932q();

        static {
            Covode.recordClassIndex(77437);
        }

        public C65932q() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.e$t */
    public static final class C65935t extends AbstractC89220m implements AbstractC89171a<C12874b<C66360f>> {
        public static final C65935t INSTANCE = new C65935t();

        static {
            Covode.recordClassIndex(77440);
        }

        public C65935t() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C66360f> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.e$k */
    public static final class C65926k extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f148500a;

        static {
            Covode.recordClassIndex(77431);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65926k(AbstractC12748a aVar) {
            super(0);
            this.f148500a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f148500a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.e$m */
    public static final class C65928m extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f148501a;

        static {
            Covode.recordClassIndex(77433);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65928m(AbstractC12748a aVar) {
            super(0);
            this.f148501a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f148501a.bD_().f30985g;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.e$a */
    public static final class C65914a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f148486a;

        static {
            Covode.recordClassIndex(77419);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65914a(AbstractC89277c cVar) {
            super(0);
            this.f148486a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f148486a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.e$b */
    public static final class C65917b extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f148493a;

        static {
            Covode.recordClassIndex(77422);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65917b(AbstractC12748a aVar) {
            super(0);
            this.f148493a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final Fragment invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f148493a);
            if (a != null) {
                return a;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.e$c */
    public static final class C65918c extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f148494a;

        static {
            Covode.recordClassIndex(77423);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65918c(AbstractC12748a aVar) {
            super(0);
            this.f148494a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f148494a);
            if (a != null) {
                C1182af viewModelStore = a.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.e$o */
    public static final class C65930o extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f148502a;

        static {
            Covode.recordClassIndex(77435);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65930o(AbstractC12748a aVar) {
            super(0);
            this.f148502a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final ActivityC0945e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f148502a);
            if (b != null) {
                return b;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.e$p */
    public static final class C65931p extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f148503a;

        static {
            Covode.recordClassIndex(77436);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65931p(AbstractC12748a aVar) {
            super(0);
            this.f148503a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f148503a);
            if (b != null) {
                C1182af viewModelStore = b.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.e$r */
    public static final class C65933r extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f148504a;

        static {
            Covode.recordClassIndex(77438);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65933r(AbstractC12748a aVar) {
            super(0);
            this.f148504a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f148504a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20583b(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.e$s */
    public static final class C65934s extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f148505a;

        static {
            Covode.recordClassIndex(77439);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65934s(AbstractC12748a aVar) {
            super(0);
            this.f148505a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f148505a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20584c(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.e$u */
    public static final class C65936u extends AbstractC89220m implements AbstractC89171a<C66006c> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f148506a;

        /* renamed from: b */
        final /* synthetic */ String f148507b;

        static {
            Covode.recordClassIndex(77441);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65936u(AbstractC12748a aVar, String str) {
            super(0);
            this.f148506a = aVar;
            this.f148507b = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.qna.api.c, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.qna.api.C66006c invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.f148506a
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bD_()
                com.bytedance.assem.arch.core.d r2 = r0.f30984f
                java.lang.Class<com.ss.android.ugc.aweme.qna.api.c> r1 = com.p2082ss.android.ugc.aweme.qna.api.C66006c.class
                java.lang.String r0 = r3.f148507b
                java.lang.Object r0 = r2.mo20603a(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.qna.p3643a.C65913e.C65936u.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.e$z */
    static final class C65941z extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C65913e f148511a;

        /* renamed from: b */
        final /* synthetic */ View f148512b;

        static {
            Covode.recordClassIndex(77446);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65941z(C65913e eVar, View view) {
            super(0);
            this.f148511a = eVar;
            this.f148512b = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            int i;
            View view = this.f148512b;
            C89219l.m154716b(view, "");
            if (!this.f148511a.f148483k) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.e$e */
    public static final class C65920e extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f148495a;

        static {
            Covode.recordClassIndex(77425);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65920e(AbstractC12748a aVar) {
            super(0);
            this.f148495a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f148495a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20583b(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.e$f */
    public static final class C65921f extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f148496a;

        static {
            Covode.recordClassIndex(77426);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65921f(AbstractC12748a aVar) {
            super(0);
            this.f148496a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f148496a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20584c(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    public C65913e() {
        C12814b bVar;
        AbstractC12848i.C12849a aVar = AbstractC12848i.C12849a.f31275a;
        AbstractC89277c a = C89204ab.m154669a(QnaBannerViewModel.class);
        C65914a aVar2 = new C65914a(a);
        C65927l lVar = C65927l.INSTANCE;
        if (C89219l.m154714a(aVar, AbstractC12848i.C12849a.f31275a)) {
            bVar = new C12814b(a, aVar2, C65929n.INSTANCE, new C65930o(this), new C65931p(this), C65932q.INSTANCE, lVar, new C65933r(this), new C65934s(this));
        } else if (C89219l.m154714a(aVar, AbstractC12848i.C12852d.f31278a)) {
            bVar = new C12814b(a, aVar2, C65935t.INSTANCE, new C65917b(this), new C65918c(this), C65919d.INSTANCE, lVar, new C65920e(this), new C65921f(this));
        } else if (aVar == null || C89219l.m154714a(aVar, AbstractC12848i.C12850b.f31276a)) {
            bVar = new C12814b(a, aVar2, C65922g.INSTANCE, new C65923h(this), new C65924i(this), new C65925j(this), lVar, new C65926k(this), new C65928m(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.f148485n = bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.e$x */
    public static final class C65939x extends AbstractC66301a {

        /* renamed from: a */
        final /* synthetic */ TextView f148509a;

        static {
            Covode.recordClassIndex(77444);
        }

        C65939x(TextView textView) {
            this.f148509a = textView;
        }

        @Override // com.p2082ss.android.ugc.aweme.qna.p3650ui.AbstractC66301a
        /* renamed from: a */
        public final void mo105029a(AbstractC66301a.EnumC66302a aVar) {
            if (aVar != null) {
                int i = C65942f.f148513a[aVar.ordinal()];
                if (i == 1) {
                    TextView textView = this.f148509a;
                    C89219l.m154716b(textView, "");
                    textView.setVisibility(0);
                } else if (i == 2) {
                    TextView textView2 = this.f148509a;
                    C89219l.m154716b(textView2, "");
                    textView2.setVisibility(8);
                } else if (i == 3) {
                    TextView textView3 = this.f148509a;
                    C89219l.m154716b(textView3, "");
                    textView3.setVisibility(0);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.e$y */
    static final class View$OnClickListenerC65940y implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C65913e f148510a;

        static {
            Covode.recordClassIndex(77445);
        }

        View$OnClickListenerC65940y(C65913e eVar) {
            this.f148510a = eVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C65913e.m117809a(this.f148510a).finish();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ Activity m117809a(C65913e eVar) {
        Activity activity = eVar.f148482j;
        if (activity == null) {
            C89219l.m154710a("activity");
        }
        return activity;
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.e$ab */
    static final class C65916ab extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ View f148492a;

        static {
            Covode.recordClassIndex(77421);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65916ab(View view) {
            super(1);
            this.f148492a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            C89219l.m154721d(th, "");
            View view = this.f148492a;
            C89219l.m154716b(view, "");
            view.setVisibility(8);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.e$w */
    static final class View$OnClickListenerC65938w implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C65913e f148508a;

        static {
            Covode.recordClassIndex(77443);
        }

        View$OnClickListenerC65938w(C65913e eVar) {
            this.f148508a = eVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            SmartRouter.buildRoute(this.f148508a.az_(), "//qna/settings").open();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.e$aa */
    static final class C65915aa extends AbstractC89220m implements AbstractC89172b<C66011h, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C65913e f148487a;

        /* renamed from: b */
        final /* synthetic */ View f148488b;

        /* renamed from: c */
        final /* synthetic */ TextView f148489c;

        /* renamed from: d */
        final /* synthetic */ TextView f148490d;

        /* renamed from: e */
        final /* synthetic */ SmartImageView f148491e;

        static {
            Covode.recordClassIndex(77420);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65915aa(C65913e eVar, View view, TextView textView, TextView textView2, SmartImageView smartImageView) {
            super(1);
            this.f148487a = eVar;
            this.f148488b = view;
            this.f148489c = textView;
            this.f148490d = textView2;
            this.f148491e = smartImageView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C66011h hVar) {
            int i;
            User user;
            String string;
            C66011h hVar2 = hVar;
            View view = this.f148488b;
            C89219l.m154716b(view, "");
            if (!this.f148487a.f148483k) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
            if (!(hVar2 == null || (user = hVar2.f148615e) == null)) {
                String a = C80580in.m139677a(user, false);
                Resources resources = C65913e.m117809a(this.f148487a).getResources();
                if (this.f148487a.f148483k) {
                    string = resources.getString(R.string.f3w);
                } else {
                    string = resources.getString(R.string.f1k, a);
                }
                C89219l.m154716b(string, "");
                TextView textView = this.f148489c;
                C89219l.m154716b(textView, "");
                textView.setText(string);
                TextView textView2 = this.f148490d;
                C89219l.m154716b(textView2, "");
                textView2.setText(string);
                UrlModel avatarThumb = user.getAvatarThumb();
                C89219l.m154716b(avatarThumb, "");
                C20766v b = C20761r.m39060a(C34735v.m70965a(avatarThumb)).mo34185b(C80397em.m139369a(100));
                b.f49098K = true;
                C20766v a2 = b.mo34179a("QnaProfile");
                a2.f49125v = EnumC20767w.CENTER_CROP;
                a2.f49092E = this.f148491e;
                a2.mo34186c();
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: b */
    public final void mo20630b(View view) {
        Long l;
        C89219l.m154721d(view, "");
        ActivityC0945e b = C12777b.m23004b(this);
        if (b != null) {
            this.f148482j = b;
            String str = m117810v().f148594c;
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            this.f148483k = TextUtils.equals(str, g.getCurUserId());
            TextView textView = (TextView) view.findViewById(R.id.dbx);
            TextView textView2 = (TextView) view.findViewById(R.id.dby);
            SmartImageView smartImageView = (SmartImageView) view.findViewById(R.id.dbv);
            View findViewById = view.findViewById(R.id.dbw);
            AppBarLayout appBarLayout = (AppBarLayout) view.findViewById(R.id.dbn);
            if (this.f148483k) {
                C89219l.m154716b(textView2, "");
                textView2.setVisibility(0);
                C89219l.m154716b(findViewById, "");
                findViewById.setVisibility(8);
                appBarLayout.setExpanded(false);
            } else {
                appBarLayout.mo43717a(new C65939x(textView2));
            }
            ((TuxIconView) view.findViewById(R.id.dbp)).setOnClickListener(new View$OnClickListenerC65940y(this));
            QnaBannerViewModel w = m117811w();
            String str2 = m117810v().f148594c;
            if (str2 != null) {
                l = C89361p.m154865g(str2);
            } else {
                l = null;
            }
            IAccountUserService g2 = C31575b.m65865g();
            C89219l.m154716b(g2, "");
            String lastRecordedSecUid = g2.getLastRecordedSecUid();
            C89219l.m154716b(lastRecordedSecUid, "");
            w.mo105256a(l, lastRecordedSecUid);
            AssemViewModel.m23030a(m117811w(), C65943g.f148514a, null, new C65916ab(findViewById), new C65941z(this, findViewById), new C65915aa(this, findViewById, textView2, textView, smartImageView), 2);
            TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.dc0);
            if (C89219l.m154714a((Object) m117810v().f148593b, (Object) "click_creator_qna") || C89219l.m154714a((Object) m117810v().f148593b, (Object) "click_toast") || C89219l.m154714a((Object) m117810v().f148593b, (Object) "creator_tools")) {
                C89219l.m154716b(tuxIconView, "");
                tuxIconView.setVisibility(0);
            }
            tuxIconView.setOnClickListener(new View$OnClickListenerC65938w(this));
        }
    }
}
