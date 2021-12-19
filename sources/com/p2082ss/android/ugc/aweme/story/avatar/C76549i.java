package com.p2082ss.android.ugc.aweme.story.avatar;

import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.ActivityC0218d;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1182af;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.AbstractC12748a;
import com.bytedance.assem.arch.core.AbstractC12766p;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.C12752d;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.extensions.C12777b;
import com.bytedance.assem.arch.extensions.C12786i;
import com.bytedance.assem.arch.p797d.AbstractC12769a;
import com.bytedance.assem.arch.service.C12801d;
import com.bytedance.assem.arch.viewModel.AbstractC12818f;
import com.bytedance.assem.arch.viewModel.AbstractC12848i;
import com.bytedance.assem.arch.viewModel.C12814b;
import com.bytedance.assem.arch.viewModel.C12815c;
import com.bytedance.assem.arch.viewModel.C12856l;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AnimationImageView;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.LiveCircleView;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.AbstractC64206ab;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.AbstractC64313x;
import com.p2082ss.android.ugc.aweme.profile.widgets.common.AbstractC64616j;
import com.p2082ss.android.ugc.aweme.profile.widgets.p3594h.p3595a.C64870a;
import com.p2082ss.android.ugc.aweme.services.story.EnterStoryParam;
import com.p2082ss.android.ugc.aweme.story.C76657c;
import com.p2082ss.android.ugc.aweme.story.C77260g;
import com.p2082ss.android.ugc.aweme.story.p4024c.C76658a;
import com.p2082ss.android.ugc.aweme.story.p4024c.C76660b;
import com.p2082ss.android.ugc.aweme.story.p4055i.C77283a;
import com.p2082ss.android.ugc.aweme.tux.business.story.EnumC79475a;
import com.p2082ss.android.ugc.aweme.tux.business.story.StoryBrandView;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.story.avatar.i */
public final class C76549i extends AbstractC12769a {

    /* renamed from: n */
    public static final C76577x f171861n = new C76577x((byte) 0);

    /* renamed from: j */
    final C12786i f171862j;

    /* renamed from: k */
    public StoryBrandView f171863k;

    /* renamed from: l */
    View f171864l;

    /* renamed from: m */
    public boolean f171865m;

    /* renamed from: o */
    private final C12814b f171866o;

    /* renamed from: p */
    private final C12786i f171867p;

    /* renamed from: q */
    private final C12786i f171868q;

    /* renamed from: r */
    private ImageView f171869r;

    /* renamed from: s */
    private AnimationImageView f171870s;

    /* renamed from: t */
    private LiveCircleView f171871t;

    /* renamed from: u */
    private final AbstractC89244h f171872u;

    /* renamed from: com.ss.android.ugc.aweme.story.avatar.i$l */
    public static final class C76565l extends AbstractC89220m implements AbstractC89172b<C76587p, C76587p> {
        public static final C76565l INSTANCE = new C76565l();

        static {
            Covode.recordClassIndex(89550);
        }

        public C76565l() {
            super(1);
        }

        public final C76587p invoke(C76587p pVar) {
            C89219l.m154719c(pVar, "");
            return pVar;
        }
    }

    static {
        Covode.recordClassIndex(89534);
    }

    /* renamed from: v */
    public final ProfileStoryRingViewModel mo120267v() {
        return (ProfileStoryRingViewModel) this.f171866o.getValue();
    }

    /* renamed from: x */
    public final AbstractC76506d mo120269x() {
        return (AbstractC76506d) this.f171872u.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.story.avatar.i$h */
    public static final class C76561h extends AbstractC89220m implements AbstractC89171a<AbstractC12748a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f171882a;

        static {
            Covode.recordClassIndex(89546);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76561h(AbstractC12748a aVar) {
            super(0);
            this.f171882a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC12748a invoke() {
            return this.f171882a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.avatar.i$x */
    public static final class C76577x {
        static {
            Covode.recordClassIndex(89562);
        }

        private C76577x() {
        }

        public /* synthetic */ C76577x(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.avatar.i$d */
    public static final class C76557d extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C76557d INSTANCE = new C76557d();

        static {
            Covode.recordClassIndex(89542);
        }

        public C76557d() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.avatar.i$g */
    public static final class C76560g extends AbstractC89220m implements AbstractC89171a<C12874b<C76587p>> {
        public static final C76560g INSTANCE = new C76560g();

        static {
            Covode.recordClassIndex(89545);
        }

        public C76560g() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C76587p> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.avatar.i$i */
    public static final class C76562i extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f171883a;

        static {
            Covode.recordClassIndex(89547);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76562i(AbstractC12748a aVar) {
            super(0);
            this.f171883a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            return this.f171883a.getViewModelStore();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.avatar.i$j */
    public static final class C76563j extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f171884a;

        static {
            Covode.recordClassIndex(89548);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76563j(AbstractC12748a aVar) {
            super(0);
            this.f171884a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            return this.f171884a.mo20598q();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.avatar.i$n */
    public static final class C76567n extends AbstractC89220m implements AbstractC89171a<C12874b<C76587p>> {
        public static final C76567n INSTANCE = new C76567n();

        static {
            Covode.recordClassIndex(89552);
        }

        public C76567n() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C76587p> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.avatar.i$q */
    public static final class C76570q extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C76570q INSTANCE = new C76570q();

        static {
            Covode.recordClassIndex(89555);
        }

        public C76570q() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.avatar.i$t */
    public static final class C76573t extends AbstractC89220m implements AbstractC89171a<C12874b<C76587p>> {
        public static final C76573t INSTANCE = new C76573t();

        static {
            Covode.recordClassIndex(89558);
        }

        public C76573t() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C76587p> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.avatar.i$k */
    public static final class C76564k extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f171885a;

        static {
            Covode.recordClassIndex(89549);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76564k(AbstractC12748a aVar) {
            super(0);
            this.f171885a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f171885a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.avatar.i$m */
    public static final class C76566m extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f171886a;

        static {
            Covode.recordClassIndex(89551);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76566m(AbstractC12748a aVar) {
            super(0);
            this.f171886a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f171886a.bD_().f30985g;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.avatar.i$a */
    public static final class C76550a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f171873a;

        static {
            Covode.recordClassIndex(89535);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76550a(AbstractC89277c cVar) {
            super(0);
            this.f171873a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f171873a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.avatar.i$b */
    public static final class C76555b extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f171878a;

        static {
            Covode.recordClassIndex(89540);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76555b(AbstractC12748a aVar) {
            super(0);
            this.f171878a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final Fragment invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f171878a);
            if (a != null) {
                return a;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.avatar.i$c */
    public static final class C76556c extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f171879a;

        static {
            Covode.recordClassIndex(89541);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76556c(AbstractC12748a aVar) {
            super(0);
            this.f171879a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f171879a);
            if (a != null) {
                C1182af viewModelStore = a.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.avatar.i$o */
    public static final class C76568o extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f171887a;

        static {
            Covode.recordClassIndex(89553);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76568o(AbstractC12748a aVar) {
            super(0);
            this.f171887a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final ActivityC0945e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f171887a);
            if (b != null) {
                return b;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.avatar.i$p */
    public static final class C76569p extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f171888a;

        static {
            Covode.recordClassIndex(89554);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76569p(AbstractC12748a aVar) {
            super(0);
            this.f171888a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f171888a);
            if (b != null) {
                C1182af viewModelStore = b.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.avatar.i$r */
    public static final class C76571r extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f171889a;

        static {
            Covode.recordClassIndex(89556);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76571r(AbstractC12748a aVar) {
            super(0);
            this.f171889a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f171889a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20583b(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.avatar.i$s */
    public static final class C76572s extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f171890a;

        static {
            Covode.recordClassIndex(89557);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76572s(AbstractC12748a aVar) {
            super(0);
            this.f171890a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f171890a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20584c(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.avatar.i$u */
    public static final class C76574u extends AbstractC89220m implements AbstractC89171a<C76588q> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f171891a;

        /* renamed from: b */
        final /* synthetic */ String f171892b;

        static {
            Covode.recordClassIndex(89559);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76574u(AbstractC12748a aVar, String str) {
            super(0);
            this.f171891a = aVar;
            this.f171892b = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.story.avatar.q, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.story.avatar.C76588q invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.f171891a
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bD_()
                com.bytedance.assem.arch.core.d r2 = r0.f30984f
                java.lang.Class<com.ss.android.ugc.aweme.story.avatar.q> r1 = com.p2082ss.android.ugc.aweme.story.avatar.C76588q.class
                java.lang.String r0 = r3.f171892b
                java.lang.Object r0 = r2.mo20603a(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.story.avatar.C76549i.C76574u.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.avatar.i$v */
    public static final class C76575v extends AbstractC89220m implements AbstractC89171a<C64870a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f171893a;

        /* renamed from: b */
        final /* synthetic */ String f171894b;

        static {
            Covode.recordClassIndex(89560);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76575v(AbstractC12748a aVar, String str) {
            super(0);
            this.f171893a = aVar;
            this.f171894b = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.profile.widgets.h.a.a, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.profile.widgets.p3594h.p3595a.C64870a invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.f171893a
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bD_()
                com.bytedance.assem.arch.core.d r2 = r0.f30984f
                java.lang.Class<com.ss.android.ugc.aweme.profile.widgets.h.a.a> r1 = com.p2082ss.android.ugc.aweme.profile.widgets.p3594h.p3595a.C64870a.class
                java.lang.String r0 = r3.f171894b
                java.lang.Object r0 = r2.mo20606b(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.story.avatar.C76549i.C76575v.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.avatar.i$w */
    public static final class C76576w extends AbstractC89220m implements AbstractC89171a<C64870a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f171895a;

        /* renamed from: b */
        final /* synthetic */ String f171896b;

        static {
            Covode.recordClassIndex(89561);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76576w(AbstractC12748a aVar, String str) {
            super(0);
            this.f171895a = aVar;
            this.f171896b = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.profile.widgets.h.a.a, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.profile.widgets.p3594h.p3595a.C64870a invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.f171895a
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bD_()
                com.bytedance.assem.arch.core.d r2 = r0.f30984f
                java.lang.Class<com.ss.android.ugc.aweme.profile.widgets.h.a.a> r1 = com.p2082ss.android.ugc.aweme.profile.widgets.p3594h.p3595a.C64870a.class
                java.lang.String r0 = r3.f171896b
                java.lang.Object r0 = r2.mo20606b(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.story.avatar.C76549i.C76576w.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.avatar.i$y */
    static final class C76578y extends AbstractC89220m implements AbstractC89171a<AbstractC76506d> {

        /* renamed from: a */
        final /* synthetic */ C76549i f171897a;

        static {
            Covode.recordClassIndex(89563);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76578y(C76549i iVar) {
            super(0);
            this.f171897a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC76506d invoke() {
            AbstractC76504c d = C77260g.f173332a.mo120156d();
            if (d != null) {
                return d.mo120228a(new AbstractC76508e(this) {
                    /* class com.p2082ss.android.ugc.aweme.story.avatar.C76549i.C76578y.C765791 */

                    /* renamed from: a */
                    final /* synthetic */ C76578y f171898a;

                    static {
                        Covode.recordClassIndex(89564);
                    }

                    @Override // com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76508e
                    /* renamed from: c */
                    public final EnumC76586o mo80539c() {
                        return EnumC76586o.PROFILE;
                    }

                    @Override // com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76508e
                    /* renamed from: b */
                    public final /* bridge */ /* synthetic */ AbstractC1204m mo80538b() {
                        return this.f171898a.f171897a;
                    }

                    @Override // com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76508e
                    /* renamed from: a */
                    public final StoryBrandView mo80534a() {
                        return C76549i.m134157a(this.f171898a.f171897a);
                    }

                    @Override // com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76548h
                    /* renamed from: d */
                    public final boolean mo80540d() {
                        if (this.f171898a.f171897a.mo120268w()) {
                            return false;
                        }
                        return true;
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f171898a = r1;
                    }

                    @Override // com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76547g
                    /* renamed from: a */
                    public final boolean mo80537a(String str, HashMap<String, String> hashMap) {
                        C89219l.m154721d(str, "");
                        C89219l.m154721d(hashMap, "");
                        if (!this.f171898a.f171897a.f171865m) {
                            return false;
                        }
                        if (C89219l.m154714a((Object) str, (Object) "story_show")) {
                            ProfileStoryRingViewModel v = this.f171898a.f171897a.mo120267v();
                            if (v.f171774l) {
                                return false;
                            }
                            v.f171774l = true;
                        }
                        hashMap.put("enter_from", this.f171898a.f171897a.mo120267v().mo23342g());
                        return true;
                    }

                    @Override // com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76508e
                    /* renamed from: a */
                    public final void mo80535a(SmartRoute smartRoute, Aweme aweme) {
                        String str;
                        String uid;
                        String str2 = "";
                        C89219l.m154721d(smartRoute, str2);
                        C89219l.m154721d(aweme, str2);
                        if (this.f171898a.f171897a.mo120267v().f171772j) {
                            str = "STORY_ENTRANCE_MINE";
                        } else {
                            str = "STORY_ENTRANCE_OTHER";
                        }
                        SmartRoute withParam = smartRoute.withParam("video_from", str).withParam("enter_from", this.f171898a.f171897a.mo120267v().mo23342g());
                        User author = aweme.getAuthor();
                        if (!(author == null || (uid = author.getUid()) == null)) {
                            str2 = uid;
                        }
                        withParam.withParam("userid", str2);
                    }

                    @Override // com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76548h
                    /* renamed from: a */
                    public final void mo80536a(boolean z, EnumC79475a aVar) {
                        C89219l.m154721d(aVar, "");
                        C76549i iVar = this.f171898a.f171897a;
                        if (!iVar.mo120267v().f171772j || iVar.mo120268w()) {
                            View view = iVar.f171864l;
                            if (view != null) {
                                view.setVisibility(8);
                            }
                        } else if (z && aVar == EnumC79475a.RED_RING) {
                            iVar.mo120266a(2131233477);
                        } else if (!((Boolean) C76658a.f172053a.getValue()).booleanValue() && z) {
                            View view2 = iVar.f171864l;
                            if (view2 != null) {
                                view2.setVisibility(8);
                            }
                        } else {
                            iVar.mo120266a(2131233476);
                        }
                    }
                });
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.avatar.i$e */
    public static final class C76558e extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f171880a;

        static {
            Covode.recordClassIndex(89543);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76558e(AbstractC12748a aVar) {
            super(0);
            this.f171880a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f171880a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20583b(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.avatar.i$f */
    public static final class C76559f extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f171881a;

        static {
            Covode.recordClassIndex(89544);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76559f(AbstractC12748a aVar) {
            super(0);
            this.f171881a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f171881a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20584c(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: w */
    public final boolean mo120268w() {
        User user = mo120267v().f171773k;
        if (user == null || !user.isLive() || !C76657c.m134240a() || C80580in.m139685b(mo120267v().f171773k, false)) {
            return false;
        }
        return true;
    }

    public C76549i() {
        C12814b bVar;
        AbstractC12848i.C12852d dVar = AbstractC12848i.C12852d.f31278a;
        AbstractC89277c a = C89204ab.m154669a(ProfileStoryRingViewModel.class);
        C76550a aVar = new C76550a(a);
        C76565l lVar = C76565l.INSTANCE;
        if (C89219l.m154714a(dVar, AbstractC12848i.C12849a.f31275a)) {
            bVar = new C12814b(a, aVar, C76567n.INSTANCE, new C76568o(this), new C76569p(this), C76570q.INSTANCE, lVar, new C76571r(this), new C76572s(this));
        } else if (C89219l.m154714a(dVar, AbstractC12848i.C12852d.f31278a)) {
            bVar = new C12814b(a, aVar, C76573t.INSTANCE, new C76555b(this), new C76556c(this), C76557d.INSTANCE, lVar, new C76558e(this), new C76559f(this));
        } else if (dVar == null || C89219l.m154714a(dVar, AbstractC12848i.C12850b.f31276a)) {
            bVar = new C12814b(a, aVar, C76560g.INSTANCE, new C76561h(this), new C76562i(this), new C76563j(this), lVar, new C76564k(this), new C76566m(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.f171866o = bVar;
        this.f171867p = new C12786i(bW_(), new C76575v(this, null));
        this.f171862j = new C12786i(bW_(), new C76574u(this, "story_ring_assem_enter_params"));
        this.f171868q = new C12786i(bW_(), new C76576w(this, null));
        this.f171872u = C89250i.m154773a((AbstractC89171a) new C76578y(this));
    }

    /* renamed from: a */
    public static final /* synthetic */ StoryBrandView m134157a(C76549i iVar) {
        StoryBrandView storyBrandView = iVar.f171863k;
        if (storyBrandView == null) {
            C89219l.m154710a("storyBrandView");
        }
        return storyBrandView;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.avatar.i$ab */
    static final class C76552ab extends AbstractC89220m implements AbstractC89172b<C12776a<? extends User>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C76549i f171875a;

        static {
            Covode.recordClassIndex(89537);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76552ab(C76549i iVar) {
            super(1);
            this.f171875a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C12776a<? extends User> aVar) {
            T t;
            C12776a<? extends User> aVar2 = aVar;
            if (!(aVar2 == null || (t = aVar2.f31085a) == null)) {
                this.f171875a.mo120267v().f171773k = t;
                AbstractC76506d x = this.f171875a.mo120269x();
                if (x != null) {
                    x.mo120241a(t, true);
                }
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo120266a(int i) {
        ImageView imageView = this.f171869r;
        if (imageView != null) {
            imageView.setImageResource(i);
        }
        View view = this.f171864l;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.avatar.i$ad */
    static final class C76554ad extends AbstractC89220m implements AbstractC89172b<C12776a<? extends Boolean>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C76549i f171877a;

        static {
            Covode.recordClassIndex(89539);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76554ad(C76549i iVar) {
            super(1);
            this.f171877a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C12776a<? extends Boolean> aVar) {
            C12776a<? extends Boolean> aVar2 = aVar;
            C76549i iVar = this.f171877a;
            boolean z = true;
            if (aVar2 == null || !aVar2.f31085a.booleanValue()) {
                z = false;
            }
            iVar.f171865m = z;
            if (this.f171877a.f171865m) {
                this.f171877a.mo120267v().f171774l = false;
                AbstractC76506d x = this.f171877a.mo120269x();
                if (x != null) {
                    x.mo120243a("story_show");
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.avatar.i$ac */
    static final class C76553ac extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C76549i f171876a;

        static {
            Covode.recordClassIndex(89538);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76553ac(C76549i iVar) {
            super(1);
            this.f171876a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            this.f171876a.f171865m = booleanValue;
            if (booleanValue && this.f171876a.mo120267v().f171772j) {
                this.f171876a.mo120267v().f171774l = false;
                AbstractC76506d x = this.f171876a.mo120269x();
                if (x != null) {
                    x.mo120241a(this.f171876a.mo120267v().f171773k, false);
                }
                AbstractC76506d x2 = this.f171876a.mo120269x();
                if (x2 != null) {
                    x2.mo120243a("story_show");
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.avatar.i$z */
    static final class View$OnClickListenerC76580z implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C76549i f171899a;

        static {
            Covode.recordClassIndex(89565);
        }

        View$OnClickListenerC76580z(C76549i iVar) {
            this.f171899a = iVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (C76549i.m134157a(this.f171899a).getMode() == EnumC79475a.RED_RING) {
                C76549i.m134157a(this.f171899a).performClick();
                return;
            }
            ActivityC0945e b = C12777b.m23004b(this.f171899a);
            if (!(b instanceof ActivityC0218d)) {
                b = null;
            }
            ActivityC0218d dVar = (ActivityC0218d) b;
            if (dVar != null && !C58001a.m104815a(view, 1200)) {
                ProfileStoryRingViewModel v = this.f171899a.mo120267v();
                C89219l.m154721d(dVar, "");
                AVExternalServiceImpl.m113114a().storyService().startStoryActivity(dVar, new EnterStoryParam(null, "click_head_plus", v.mo23342g(), false, false, false, !C76660b.m134249i(), 49, null));
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: b */
    public final void mo20630b(View view) {
        boolean z;
        C89219l.m154721d(view, "");
        AbstractC76504c d = C77260g.f173332a.mo120156d();
        if (d != null && d.mo120232a()) {
            this.f171870s = (AnimationImageView) mo20528t().findViewById(R.id.hv);
            this.f171871t = (LiveCircleView) mo20528t().findViewById(R.id.br7);
            View findViewById = mo20528t().findViewById(R.id.c05);
            C89219l.m154716b(findViewById, "");
            this.f171863k = (StoryBrandView) findViewById;
            this.f171864l = mo20528t().findViewById(R.id.afu);
            this.f171869r = (ImageView) mo20528t().findViewById(R.id.bgz);
            View view2 = this.f171864l;
            if (view2 != null) {
                view2.setOnClickListener(new View$OnClickListenerC76580z(this));
            }
            ProfileStoryRingViewModel v = mo120267v();
            C64870a aVar = (C64870a) this.f171867p.getValue();
            if (aVar != null) {
                z = aVar.f146660c;
            } else {
                z = false;
            }
            v.f171772j = z;
            AbstractC12818f.C12819a.m23063a(this, mo120267v(), C76581j.f171900a, C12856l.m23100a(), new C76551aa(this), 4);
            C12801d.m23020a(this, C89204ab.m154669a(AbstractC64616j.class), C76582k.f171901a, new C76552ab(this));
            C12801d.m23020a(this, C89204ab.m154669a(AbstractC64313x.class), C76583l.f171902a, new C76553ac(this));
            C12801d.m23020a(this, C89204ab.m154669a(AbstractC64206ab.class), C76584m.f171903a, new C76554ad(this));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.avatar.i$aa */
    static final class C76551aa extends AbstractC89220m implements AbstractC89183m<AbstractC12766p, C12776a<? extends String>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C76549i f171874a;

        static {
            Covode.recordClassIndex(89536);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76551aa(C76549i iVar) {
            super(2);
            this.f171874a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC12766p pVar, C12776a<? extends String> aVar) {
            C12776a<? extends String> aVar2 = aVar;
            C89219l.m154721d(pVar, "");
            C89219l.m154721d(aVar2, "");
            if (aVar2.f31085a.length() > 0) {
                T t = aVar2.f31085a;
                C77283a.m135111b("ProfileStoryRingAssem", "reset story ring due to " + ((String) t) + ", in " + ((C76588q) this.f171874a.f171862j.getValue()).f171908a);
                if (C89219l.m154714a((Object) t, (Object) "pull")) {
                    AbstractC76506d x = this.f171874a.mo120269x();
                    if (x != null) {
                        x.mo120241a(this.f171874a.mo120267v().f171773k, false);
                    }
                } else {
                    AbstractC76506d x2 = this.f171874a.mo120269x();
                    if (x2 != null) {
                        x2.mo120241a(this.f171874a.mo120267v().f171773k, true);
                    }
                }
            }
            return C89391z.f203057a;
        }
    }
}
