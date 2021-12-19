package com.p2082ss.android.ugc.aweme.profile.widgets.common;

import android.text.TextUtils;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1182af;
import com.bytedance.android.live.base.p177a.C2954a;
import com.bytedance.assem.arch.core.AbstractC12748a;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.C12752d;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.extensions.C12777b;
import com.bytedance.assem.arch.service.AbstractC12799b;
import com.bytedance.assem.arch.service.C12801d;
import com.bytedance.assem.arch.viewModel.AbstractC12848i;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.C12814b;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.widget.spring.SpringLayout;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3575f.C63762ab;
import com.p2082ss.android.ugc.aweme.profile.p3575f.C63804z;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.AbstractC64206ab;
import com.p2082ss.android.ugc.aweme.profile.widgets.common.AbstractC64616j;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import dagger.hilt.android.internal.p4539b.C88098a;
import java.util.ArrayList;
import java.util.List;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.common.k */
public final class C64618k extends AbstractC64573a {

    /* renamed from: l */
    private final C12814b f146334l;

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.common.k$j */
    public static final class C64628j extends AbstractC89220m implements AbstractC89172b<C64644n, C64644n> {
        public static final C64628j INSTANCE = new C64628j();

        static {
            Covode.recordClassIndex(76094);
        }

        public C64628j() {
            super(1);
        }

        public final C64644n invoke(C64644n nVar) {
            C89219l.m154719c(nVar, "");
            return nVar;
        }
    }

    static {
        Covode.recordClassIndex(76084);
    }

    /* renamed from: v */
    public final UserProfileInfoVM mo104155v() {
        return (UserProfileInfoVM) this.f146334l.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.common.AbstractC64593h
    /* renamed from: w */
    public final String mo104145w() {
        return "others_homepage";
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.common.k$g */
    public static final class C64625g extends AbstractC89220m implements AbstractC89171a<AbstractC12748a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146340a;

        static {
            Covode.recordClassIndex(76091);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64625g(AbstractC12748a aVar) {
            super(0);
            this.f146340a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC12748a invoke() {
            return this.f146340a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.common.k$f */
    public static final class C64624f extends AbstractC89220m implements AbstractC89171a<C12874b<C64644n>> {
        public static final C64624f INSTANCE = new C64624f();

        static {
            Covode.recordClassIndex(76090);
        }

        public C64624f() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C64644n> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.common.k$h */
    public static final class C64626h extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146341a;

        static {
            Covode.recordClassIndex(76092);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64626h(AbstractC12748a aVar) {
            super(0);
            this.f146341a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            return this.f146341a.getViewModelStore();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.common.k$l */
    public static final class C64630l extends AbstractC89220m implements AbstractC89171a<C12874b<C64644n>> {
        public static final C64630l INSTANCE = new C64630l();

        static {
            Covode.recordClassIndex(76096);
        }

        public C64630l() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C64644n> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.common.k$q */
    public static final class C64635q extends AbstractC89220m implements AbstractC89171a<C12874b<C64644n>> {
        public static final C64635q INSTANCE = new C64635q();

        static {
            Covode.recordClassIndex(76101);
        }

        public C64635q() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C64644n> invoke() {
            return new C12874b<>();
        }
    }

    /* Return type fixed from 'com.bytedance.assem.arch.service.a' to match base method */
    @Override // com.bytedance.assem.arch.service.AbstractC12799b
    /* renamed from: e */
    public final /* synthetic */ C64615i mo20658e() {
        return new C64615i();
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.common.k$i */
    public static final class C64627i extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146342a;

        static {
            Covode.recordClassIndex(76093);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64627i(AbstractC12748a aVar) {
            super(0);
            this.f146342a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f146342a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.common.k$k */
    public static final class C64629k extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146343a;

        static {
            Covode.recordClassIndex(76095);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64629k(AbstractC12748a aVar) {
            super(0);
            this.f146343a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f146343a.bD_().f30985g;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.common.k$u */
    static final class C64640u extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ C64618k f146354a;

        static {
            Covode.recordClassIndex(76106);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64640u(C64618k kVar) {
            super(0);
            this.f146354a = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1175ad.AbstractC1177b invoke() {
            C1175ad.AbstractC1177b a = C88098a.m153168a(C12777b.m23004b(this.f146354a));
            if (a == null) {
                C89219l.m154715b();
            }
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.common.k$a */
    public static final class C64619a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f146335a;

        static {
            Covode.recordClassIndex(76085);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64619a(AbstractC89277c cVar) {
            super(0);
            this.f146335a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f146335a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.common.k$b */
    public static final class C64620b extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146336a;

        static {
            Covode.recordClassIndex(76086);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64620b(AbstractC12748a aVar) {
            super(0);
            this.f146336a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final Fragment invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f146336a);
            if (a != null) {
                return a;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.common.k$c */
    public static final class C64621c extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146337a;

        static {
            Covode.recordClassIndex(76087);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64621c(AbstractC12748a aVar) {
            super(0);
            this.f146337a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f146337a);
            if (a != null) {
                C1182af viewModelStore = a.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.common.k$m */
    public static final class C64631m extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146344a;

        static {
            Covode.recordClassIndex(76097);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64631m(AbstractC12748a aVar) {
            super(0);
            this.f146344a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final ActivityC0945e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f146344a);
            if (b != null) {
                return b;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.common.k$n */
    public static final class C64632n extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146345a;

        static {
            Covode.recordClassIndex(76098);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64632n(AbstractC12748a aVar) {
            super(0);
            this.f146345a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f146345a);
            if (b != null) {
                C1182af viewModelStore = b.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.common.k$o */
    public static final class C64633o extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146346a;

        static {
            Covode.recordClassIndex(76099);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64633o(AbstractC12748a aVar) {
            super(0);
            this.f146346a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f146346a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20583b(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.common.k$p */
    public static final class C64634p extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146347a;

        static {
            Covode.recordClassIndex(76100);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64634p(AbstractC12748a aVar) {
            super(0);
            this.f146347a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f146347a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20584c(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.common.AbstractC64573a, com.bytedance.assem.arch.core.AbstractC12748a, com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: f */
    public final void mo20518f() {
        super.mo20518f();
        AssemViewModel.m23030a(mo104155v(), C64641l.f146355a, null, new C64638s(this), null, new C64636r(this), 10);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.common.k$d */
    public static final class C64622d extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146338a;

        static {
            Covode.recordClassIndex(76088);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64622d(AbstractC12748a aVar) {
            super(0);
            this.f146338a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f146338a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20583b(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.common.k$e */
    public static final class C64623e extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146339a;

        static {
            Covode.recordClassIndex(76089);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64623e(AbstractC12748a aVar) {
            super(0);
            this.f146339a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f146339a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20584c(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    public C64618k() {
        C12814b bVar;
        AbstractC12848i.C12852d dVar = AbstractC12848i.C12852d.f31278a;
        C64640u uVar = new C64640u(this);
        AbstractC89277c a = C89204ab.m154669a(UserProfileInfoVM.class);
        C64619a aVar = new C64619a(a);
        C64628j jVar = C64628j.INSTANCE;
        if (C89219l.m154714a(dVar, AbstractC12848i.C12849a.f31275a)) {
            bVar = new C12814b(a, aVar, C64630l.INSTANCE, new C64631m(this), new C64632n(this), uVar, jVar, new C64633o(this), new C64634p(this));
        } else if (C89219l.m154714a(dVar, AbstractC12848i.C12852d.f31278a)) {
            bVar = new C12814b(a, aVar, C64635q.INSTANCE, new C64620b(this), new C64621c(this), uVar, jVar, new C64622d(this), new C64623e(this));
        } else if (dVar == null || C89219l.m154714a(dVar, AbstractC12848i.C12850b.f31276a)) {
            bVar = new C12814b(a, aVar, C64624f.INSTANCE, new C64625g(this), new C64626h(this), uVar, jVar, new C64627i(this), new C64629k(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.f146334l = bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.common.k$t */
    static final class C64639t extends AbstractC89220m implements AbstractC89172b<C64615i, C64615i> {

        /* renamed from: a */
        final /* synthetic */ User f146351a;

        /* renamed from: b */
        final /* synthetic */ boolean f146352b;

        /* renamed from: c */
        final /* synthetic */ EnumC64592g f146353c;

        static {
            Covode.recordClassIndex(76105);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64639t(User user, boolean z, EnumC64592g gVar) {
            super(1);
            this.f146351a = user;
            this.f146352b = z;
            this.f146353c = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C64615i invoke(C64615i iVar) {
            C64615i iVar2 = iVar;
            if (iVar2 != null) {
                return C64615i.m116529a(iVar2, this.f146351a, new C12776a(this.f146351a), this.f146352b, null, this.f146353c, 8);
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.common.k$s */
    static final class C64638s extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64618k f146350a;

        static {
            Covode.recordClassIndex(76104);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64638s(C64618k kVar) {
            super(1);
            this.f146350a = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            Throwable th2 = th;
            C89219l.m154721d(th2, "");
            SpringLayout springLayout = this.f146350a.f146312j;
            if (springLayout != null) {
                springLayout.setRefreshing(false);
            }
            if (th2 instanceof C34485a) {
                C34485a aVar = (C34485a) th2;
                int errorCode = aVar.getErrorCode();
                if (!(TextUtils.isEmpty(aVar.getErrorMsg()) || this.f146350a.az_() == null || errorCode == 3070 || errorCode == 3071 || errorCode == 3072)) {
                    new C79459a(this.f146350a.az_()).mo123052a(aVar.getErrorMsg()).mo123053a();
                }
            }
            AbstractC64206ab abVar = (AbstractC64206ab) C12801d.m23025c(this.f146350a, C89204ab.m154669a(AbstractC64206ab.class));
            if (abVar != null) {
                abVar.mo103787d();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.common.k$r */
    static final class C64636r extends AbstractC89220m implements AbstractC89172b<User, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64618k f146348a;

        static {
            Covode.recordClassIndex(76102);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64636r(C64618k kVar) {
            super(1);
            this.f146348a = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(User user) {
            User user2 = user;
            final C89233z.C89238e eVar = new C89233z.C89238e();
            eVar.element = (T) EnumC64592g.NORMAL;
            C64618k.m22977a(this.f146348a.mo104155v(), new AbstractC89172b<C64644n, C89391z>() {
                /* class com.p2082ss.android.ugc.aweme.profile.widgets.common.C64618k.C64636r.C646371 */

                static {
                    Covode.recordClassIndex(76103);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C64644n nVar) {
                    C64644n nVar2 = nVar;
                    C89219l.m154721d(nVar2, "");
                    eVar.element = (T) nVar2.f146358b;
                    return C89391z.f203057a;
                }
            });
            SpringLayout springLayout = this.f146348a.f146312j;
            if (springLayout != null) {
                springLayout.setRefreshing(false);
            }
            if (user2 != null) {
                AbstractC64206ab abVar = (AbstractC64206ab) C12801d.m23025c(this.f146348a, C89204ab.m154669a(AbstractC64206ab.class));
                if (abVar != null) {
                    abVar.mo103786c(user2);
                }
                AbstractC64206ab abVar2 = (AbstractC64206ab) C12801d.m23025c(this.f146348a, C89204ab.m154669a(AbstractC64206ab.class));
                if (abVar2 != null) {
                    abVar2.mo103784b(user2);
                }
                AbstractC64616j.C64617a.m116532a(this.f146348a, user2, eVar.element, false, 4);
                C63762ab abVar3 = C63804z.f144626a;
                if (abVar3 != null) {
                    abVar3.mo102328d();
                }
                this.f146348a.mo104155v();
                C89219l.m154721d(user2, "");
                C2954a aVar = new C2954a();
                String uid = user2.getUid();
                C89219l.m154716b(uid, "");
                aVar.f8697b = Long.parseLong(uid);
                aVar.f8696a = user2.roomId;
                aVar.f8698c = !user2.isLive();
                AbstractC81915c.m141874a(aVar);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.common.AbstractC64616j
    /* renamed from: a */
    public final void mo104142a(int i, EnumC64592g gVar) {
        C89219l.m154721d(gVar, "");
        mo104155v().mo104137a(i, gVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.common.AbstractC64616j
    /* renamed from: a */
    public final void mo104143a(User user, EnumC64592g gVar, boolean z) {
        C89219l.m154721d(gVar, "");
        if (user != null) {
            C64639t tVar = new C64639t(user, z, gVar);
            Class<C64618k> cls = C64618k.class;
            Class<?>[] interfaces = cls.getInterfaces();
            C89219l.m154709a((Object) interfaces, "");
            ArrayList arrayList = new ArrayList();
            for (Class<?> cls2 : interfaces) {
                if (AbstractC12799b.class.isAssignableFrom(cls2)) {
                    arrayList.add(cls2);
                }
            }
            while (true) {
                ArrayList arrayList2 = arrayList;
                if (arrayList2.isEmpty()) {
                    cls = cls.getSuperclass();
                    if (cls != null) {
                        Class<?>[] interfaces2 = cls.getInterfaces();
                        C89219l.m154709a((Object) interfaces2, "");
                        arrayList = new ArrayList();
                        for (Class<?> cls3 : interfaces2) {
                            if (AbstractC12799b.class.isAssignableFrom(cls3)) {
                                arrayList.add(cls3);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    C12753e eVar = bD_().f30985g;
                    Object f = C89070n.m154579f((List) arrayList2);
                    if (f != null) {
                        eVar.mo20613a((Class) f, tVar);
                        return;
                    }
                    throw new C89388w("null cannot be cast to non-null type");
                }
            }
        }
    }
}
