package com.p2082ss.android.ugc.aweme.upvote.detail.panel;

import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1182af;
import com.bytedance.assem.arch.core.AbstractC12748a;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.C12752d;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.extensions.C12777b;
import com.bytedance.assem.arch.extensions.C12786i;
import com.bytedance.assem.arch.p797d.AbstractC12769a;
import com.bytedance.assem.arch.viewModel.AbstractC12848i;
import com.bytedance.assem.arch.viewModel.C12814b;
import com.bytedance.assem.arch.viewModel.C12815c;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.assem.p793a.C12642a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.upvote.detail.C79788d;
import com.p2082ss.android.ugc.aweme.upvote.detail.UpvoteListViewModel;
import com.p2082ss.android.ugc.aweme.upvote.publish.C80022g;
import com.p2082ss.android.ugc.aweme.upvote.publish.UpvotePublishVM;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.a */
public abstract class AbstractC79808a extends AbstractC12769a {

    /* renamed from: j */
    private final C12786i f179037j = new C12786i(bW_(), new C79831u(this, null));

    /* renamed from: k */
    private final AbstractC89244h f179038k = C89250i.m154773a((AbstractC89171a) new C79811ab(this));

    /* renamed from: l */
    private final C12814b f179039l;

    /* renamed from: m */
    private final C12642a f179040m;

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.a$l */
    public static final class C79822l extends AbstractC89220m implements AbstractC89172b<C79884l, C79884l> {
        public static final C79822l INSTANCE = new C79822l();

        static {
            Covode.recordClassIndex(93047);
        }

        public C79822l() {
            super(1);
        }

        public final C79884l invoke(C79884l lVar) {
            C89219l.m154719c(lVar, "");
            return lVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.a$v */
    public static final class C79832v extends AbstractC89220m implements AbstractC89172b<C80022g, C80022g> {
        public static final C79832v INSTANCE = new C79832v();

        static {
            Covode.recordClassIndex(93057);
        }

        public C79832v() {
            super(1);
        }

        public final C80022g invoke(C80022g gVar) {
            C89219l.m154719c(gVar, "");
            return gVar;
        }
    }

    static {
        Covode.recordClassIndex(93033);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final C79869f mo123381v() {
        return (C79869f) this.f179037j.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final UpvoteListViewModel mo123382w() {
        return (UpvoteListViewModel) this.f179038k.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final UpvoteDetailPanelViewModel mo123383x() {
        return (UpvoteDetailPanelViewModel) this.f179039l.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final UpvotePublishVM mo123384y() {
        return (UpvotePublishVM) this.f179040m.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.a$h */
    public static final class C79818h extends AbstractC89220m implements AbstractC89171a<AbstractC12748a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f179047a;

        static {
            Covode.recordClassIndex(93043);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C79818h(AbstractC12748a aVar) {
            super(0);
            this.f179047a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC12748a invoke() {
            return this.f179047a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.a$z */
    public static final class C79836z extends AbstractC89220m implements AbstractC89171a<AbstractC1204m> {

        /* renamed from: a */
        final /* synthetic */ AbstractC1204m f179060a;

        static {
            Covode.recordClassIndex(93061);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C79836z(AbstractC1204m mVar) {
            super(0);
            this.f179060a = mVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC1204m invoke() {
            return this.f179060a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.a$aa */
    public static final class C79810aa extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C79810aa INSTANCE = new C79810aa();

        static {
            Covode.recordClassIndex(93035);
        }

        public C79810aa() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.a$d */
    public static final class C79814d extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C79814d INSTANCE = new C79814d();

        static {
            Covode.recordClassIndex(93039);
        }

        public C79814d() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.a$g */
    public static final class C79817g extends AbstractC89220m implements AbstractC89171a<C12874b<C79884l>> {
        public static final C79817g INSTANCE = new C79817g();

        static {
            Covode.recordClassIndex(93042);
        }

        public C79817g() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C79884l> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.a$i */
    public static final class C79819i extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f179048a;

        static {
            Covode.recordClassIndex(93044);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C79819i(AbstractC12748a aVar) {
            super(0);
            this.f179048a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            return this.f179048a.getViewModelStore();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.a$j */
    public static final class C79820j extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f179049a;

        static {
            Covode.recordClassIndex(93045);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C79820j(AbstractC12748a aVar) {
            super(0);
            this.f179049a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            return this.f179049a.mo20598q();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.a$n */
    public static final class C79824n extends AbstractC89220m implements AbstractC89171a<C12874b<C79884l>> {
        public static final C79824n INSTANCE = new C79824n();

        static {
            Covode.recordClassIndex(93049);
        }

        public C79824n() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C79884l> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.a$q */
    public static final class C79827q extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C79827q INSTANCE = new C79827q();

        static {
            Covode.recordClassIndex(93052);
        }

        public C79827q() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.a$t */
    public static final class C79830t extends AbstractC89220m implements AbstractC89171a<C12874b<C79884l>> {
        public static final C79830t INSTANCE = new C79830t();

        static {
            Covode.recordClassIndex(93055);
        }

        public C79830t() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C79884l> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.a$y */
    public static final class C79835y extends AbstractC89220m implements AbstractC89171a<C12874b<C80022g>> {
        public static final C79835y INSTANCE = new C79835y();

        static {
            Covode.recordClassIndex(93060);
        }

        public C79835y() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C80022g> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.a$ab */
    static final class C79811ab extends AbstractC89220m implements AbstractC89171a<UpvoteListViewModel> {

        /* renamed from: a */
        final /* synthetic */ AbstractC79808a f179042a;

        static {
            Covode.recordClassIndex(93036);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79811ab(AbstractC79808a aVar) {
            super(0);
            this.f179042a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ UpvoteListViewModel invoke() {
            return C79788d.m138613a(this.f179042a.mo123381v().f179096b, this.f179042a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.a$k */
    public static final class C79821k extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f179050a;

        static {
            Covode.recordClassIndex(93046);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C79821k(AbstractC12748a aVar) {
            super(0);
            this.f179050a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f179050a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.a$m */
    public static final class C79823m extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f179051a;

        static {
            Covode.recordClassIndex(93048);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C79823m(AbstractC12748a aVar) {
            super(0);
            this.f179051a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f179051a.bD_().f30985g;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.a$a */
    public static final class C79809a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f179041a;

        static {
            Covode.recordClassIndex(93034);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C79809a(AbstractC89277c cVar) {
            super(0);
            this.f179041a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f179041a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.a$b */
    public static final class C79812b extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f179043a;

        static {
            Covode.recordClassIndex(93037);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C79812b(AbstractC12748a aVar) {
            super(0);
            this.f179043a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final Fragment invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f179043a);
            if (a != null) {
                return a;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.a$c */
    public static final class C79813c extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f179044a;

        static {
            Covode.recordClassIndex(93038);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C79813c(AbstractC12748a aVar) {
            super(0);
            this.f179044a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f179044a);
            if (a != null) {
                C1182af viewModelStore = a.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.a$o */
    public static final class C79825o extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f179052a;

        static {
            Covode.recordClassIndex(93050);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C79825o(AbstractC12748a aVar) {
            super(0);
            this.f179052a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final ActivityC0945e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f179052a);
            if (b != null) {
                return b;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.a$p */
    public static final class C79826p extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f179053a;

        static {
            Covode.recordClassIndex(93051);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C79826p(AbstractC12748a aVar) {
            super(0);
            this.f179053a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f179053a);
            if (b != null) {
                C1182af viewModelStore = b.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.a$r */
    public static final class C79828r extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f179054a;

        static {
            Covode.recordClassIndex(93053);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C79828r(AbstractC12748a aVar) {
            super(0);
            this.f179054a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f179054a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20583b(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.a$s */
    public static final class C79829s extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f179055a;

        static {
            Covode.recordClassIndex(93054);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C79829s(AbstractC12748a aVar) {
            super(0);
            this.f179055a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f179055a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20584c(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.a$u */
    public static final class C79831u extends AbstractC89220m implements AbstractC89171a<C79869f> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f179056a;

        /* renamed from: b */
        final /* synthetic */ String f179057b;

        static {
            Covode.recordClassIndex(93056);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C79831u(AbstractC12748a aVar, String str) {
            super(0);
            this.f179056a = aVar;
            this.f179057b = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.ss.android.ugc.aweme.upvote.detail.panel.f] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.upvote.detail.panel.C79869f invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.f179056a
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bD_()
                com.bytedance.assem.arch.core.d r2 = r0.f30984f
                java.lang.Class<com.ss.android.ugc.aweme.upvote.detail.panel.f> r1 = com.p2082ss.android.ugc.aweme.upvote.detail.panel.C79869f.class
                java.lang.String r0 = r3.f179057b
                java.lang.Object r0 = r2.mo20603a(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.upvote.detail.panel.AbstractC79808a.C79831u.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.a$w */
    public static final class C79833w extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f179058a;

        static {
            Covode.recordClassIndex(93058);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C79833w(AbstractC12748a aVar) {
            super(0);
            this.f179058a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f179058a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20583b(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.a$x */
    public static final class C79834x extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f179059a;

        static {
            Covode.recordClassIndex(93059);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C79834x(AbstractC12748a aVar) {
            super(0);
            this.f179059a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f179059a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20584c(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.a$e */
    public static final class C79815e extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f179045a;

        static {
            Covode.recordClassIndex(93040);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C79815e(AbstractC12748a aVar) {
            super(0);
            this.f179045a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f179045a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20583b(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.a$f */
    public static final class C79816f extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f179046a;

        static {
            Covode.recordClassIndex(93041);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C79816f(AbstractC12748a aVar) {
            super(0);
            this.f179046a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f179046a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20584c(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    public AbstractC79808a() {
        C12814b bVar;
        AbstractC12848i.C12852d dVar = AbstractC12848i.C12852d.f31278a;
        AbstractC89277c a = C89204ab.m154669a(UpvoteDetailPanelViewModel.class);
        C79809a aVar = new C79809a(a);
        C79822l lVar = C79822l.INSTANCE;
        if (C89219l.m154714a(dVar, AbstractC12848i.C12849a.f31275a)) {
            bVar = new C12814b(a, aVar, C79824n.INSTANCE, new C79825o(this), new C79826p(this), C79827q.INSTANCE, lVar, new C79828r(this), new C79829s(this));
        } else if (C89219l.m154714a(dVar, AbstractC12848i.C12852d.f31278a)) {
            bVar = new C12814b(a, aVar, C79830t.INSTANCE, new C79812b(this), new C79813c(this), C79814d.INSTANCE, lVar, new C79815e(this), new C79816f(this));
        } else if (dVar == null || C89219l.m154714a(dVar, AbstractC12848i.C12850b.f31276a)) {
            bVar = new C12814b(a, aVar, C79817g.INSTANCE, new C79818h(this), new C79819i(this), new C79820j(this), lVar, new C79821k(this), new C79823m(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.f179039l = bVar;
        this.f179040m = new C12642a(C89204ab.m154669a(UpvotePublishVM.class), null, C79835y.INSTANCE, new C79836z(this), C79810aa.INSTANCE, C79832v.INSTANCE, new C79833w(this), new C79834x(this));
    }
}
