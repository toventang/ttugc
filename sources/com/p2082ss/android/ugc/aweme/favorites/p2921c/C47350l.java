package com.p2082ss.android.ugc.aweme.favorites.p2921c;

import android.content.Context;
import android.view.View;
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
import com.bytedance.assem.arch.p797d.AbstractC12769a;
import com.bytedance.assem.arch.service.AbstractC12800c;
import com.bytedance.assem.arch.service.C12801d;
import com.bytedance.assem.arch.viewModel.AbstractC12848i;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.C12814b;
import com.bytedance.assem.arch.viewModel.C12815c;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1710c.C23005c;
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.ugc.aweme.favorites.viewmodel.C47799b;
import com.p2082ss.android.ugc.aweme.favorites.viewmodel.C47803e;
import com.p2082ss.android.ugc.aweme.favorites.viewmodel.VideoCollectionListViewModel;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4166g.C79440a;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.favorites.c.l */
public final class C47350l extends AbstractC12769a {

    /* renamed from: j */
    final AbstractC89244h f110073j;

    /* renamed from: k */
    private final C12814b f110074k;

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.l$l */
    public static final class C47362l extends AbstractC89220m implements AbstractC89172b<C47803e, C47803e> {
        public static final C47362l INSTANCE = new C47362l();

        static {
            Covode.recordClassIndex(55975);
        }

        public C47362l() {
            super(1);
        }

        public final C47803e invoke(C47803e eVar) {
            C89219l.m154719c(eVar, "");
            return eVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.l$u */
    public interface AbstractC47371u extends AbstractC12800c {
        static {
            Covode.recordClassIndex(55984);
        }

        /* renamed from: c */
        void mo79693c();
    }

    static {
        Covode.recordClassIndex(55963);
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.l$h */
    public static final class C47358h extends AbstractC89220m implements AbstractC89171a<AbstractC12748a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f110080a;

        static {
            Covode.recordClassIndex(55971);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47358h(AbstractC12748a aVar) {
            super(0);
            this.f110080a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC12748a invoke() {
            return this.f110080a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.l$d */
    public static final class C47354d extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C47354d INSTANCE = new C47354d();

        static {
            Covode.recordClassIndex(55967);
        }

        public C47354d() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.l$g */
    public static final class C47357g extends AbstractC89220m implements AbstractC89171a<C12874b<C47803e>> {
        public static final C47357g INSTANCE = new C47357g();

        static {
            Covode.recordClassIndex(55970);
        }

        public C47357g() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C47803e> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.l$i */
    public static final class C47359i extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f110081a;

        static {
            Covode.recordClassIndex(55972);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47359i(AbstractC12748a aVar) {
            super(0);
            this.f110081a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            return this.f110081a.getViewModelStore();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.l$j */
    public static final class C47360j extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f110082a;

        static {
            Covode.recordClassIndex(55973);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47360j(AbstractC12748a aVar) {
            super(0);
            this.f110082a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            return this.f110082a.mo20598q();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.l$n */
    public static final class C47364n extends AbstractC89220m implements AbstractC89171a<C12874b<C47803e>> {
        public static final C47364n INSTANCE = new C47364n();

        static {
            Covode.recordClassIndex(55977);
        }

        public C47364n() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C47803e> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.l$q */
    public static final class C47367q extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C47367q INSTANCE = new C47367q();

        static {
            Covode.recordClassIndex(55980);
        }

        public C47367q() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.l$t */
    public static final class C47370t extends AbstractC89220m implements AbstractC89171a<C12874b<C47803e>> {
        public static final C47370t INSTANCE = new C47370t();

        static {
            Covode.recordClassIndex(55983);
        }

        public C47370t() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C47803e> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.l$k */
    public static final class C47361k extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f110083a;

        static {
            Covode.recordClassIndex(55974);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47361k(AbstractC12748a aVar) {
            super(0);
            this.f110083a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f110083a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.l$m */
    public static final class C47363m extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f110084a;

        static {
            Covode.recordClassIndex(55976);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47363m(AbstractC12748a aVar) {
            super(0);
            this.f110084a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f110084a.bD_().f30985g;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.l$v */
    static final class C47372v extends AbstractC89220m implements AbstractC89171a<AbstractC47371u> {

        /* renamed from: a */
        final /* synthetic */ C47350l f110089a;

        static {
            Covode.recordClassIndex(55985);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47372v(C47350l lVar) {
            super(0);
            this.f110089a = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC47371u invoke() {
            return C12801d.m23023b(this.f110089a, C89204ab.m154669a(AbstractC47371u.class));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.l$x */
    static final class C47375x extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ TuxStatusView f110093a;

        static {
            Covode.recordClassIndex(55988);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47375x(TuxStatusView tuxStatusView) {
            super(0);
            this.f110093a = tuxStatusView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f110093a.mo37867a();
            this.f110093a.setVisibility(0);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.l$a */
    public static final class C47351a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f110075a;

        static {
            Covode.recordClassIndex(55964);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47351a(AbstractC89277c cVar) {
            super(0);
            this.f110075a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f110075a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.l$b */
    public static final class C47352b extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f110076a;

        static {
            Covode.recordClassIndex(55965);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47352b(AbstractC12748a aVar) {
            super(0);
            this.f110076a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final Fragment invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f110076a);
            if (a != null) {
                return a;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.l$c */
    public static final class C47353c extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f110077a;

        static {
            Covode.recordClassIndex(55966);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47353c(AbstractC12748a aVar) {
            super(0);
            this.f110077a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f110077a);
            if (a != null) {
                C1182af viewModelStore = a.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.l$o */
    public static final class C47365o extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f110085a;

        static {
            Covode.recordClassIndex(55978);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47365o(AbstractC12748a aVar) {
            super(0);
            this.f110085a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final ActivityC0945e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f110085a);
            if (b != null) {
                return b;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.l$p */
    public static final class C47366p extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f110086a;

        static {
            Covode.recordClassIndex(55979);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47366p(AbstractC12748a aVar) {
            super(0);
            this.f110086a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f110086a);
            if (b != null) {
                C1182af viewModelStore = b.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.l$r */
    public static final class C47368r extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f110087a;

        static {
            Covode.recordClassIndex(55981);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47368r(AbstractC12748a aVar) {
            super(0);
            this.f110087a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f110087a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20583b(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.l$s */
    public static final class C47369s extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f110088a;

        static {
            Covode.recordClassIndex(55982);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47369s(AbstractC12748a aVar) {
            super(0);
            this.f110088a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f110088a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20584c(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.l$e */
    public static final class C47355e extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f110078a;

        static {
            Covode.recordClassIndex(55968);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47355e(AbstractC12748a aVar) {
            super(0);
            this.f110078a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f110078a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20583b(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.l$f */
    public static final class C47356f extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f110079a;

        static {
            Covode.recordClassIndex(55969);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47356f(AbstractC12748a aVar) {
            super(0);
            this.f110079a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f110079a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20584c(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    public C47350l() {
        C12814b bVar;
        AbstractC12848i.C12852d dVar = AbstractC12848i.C12852d.f31278a;
        AbstractC89277c a = C89204ab.m154669a(VideoCollectionListViewModel.class);
        C47351a aVar = new C47351a(a);
        C47362l lVar = C47362l.INSTANCE;
        if (C89219l.m154714a(dVar, AbstractC12848i.C12849a.f31275a)) {
            bVar = new C12814b(a, aVar, C47364n.INSTANCE, new C47365o(this), new C47366p(this), C47367q.INSTANCE, lVar, new C47368r(this), new C47369s(this));
        } else if (C89219l.m154714a(dVar, AbstractC12848i.C12852d.f31278a)) {
            bVar = new C12814b(a, aVar, C47370t.INSTANCE, new C47352b(this), new C47353c(this), C47354d.INSTANCE, lVar, new C47355e(this), new C47356f(this));
        } else if (dVar == null || C89219l.m154714a(dVar, AbstractC12848i.C12850b.f31276a)) {
            bVar = new C12814b(a, aVar, C47357g.INSTANCE, new C47358h(this), new C47359i(this), new C47360j(this), lVar, new C47361k(this), new C47363m(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.f110074k = bVar;
        this.f110073j = C89250i.m154773a((AbstractC89171a) new C47372v(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.l$y */
    static final class C47376y extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C47350l f110094a;

        /* renamed from: b */
        final /* synthetic */ TuxStatusView f110095b;

        static {
            Covode.recordClassIndex(55989);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47376y(C47350l lVar, TuxStatusView tuxStatusView) {
            super(1);
            this.f110094a = lVar;
            this.f110095b = tuxStatusView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            C89219l.m154721d(th, "");
            this.f110095b.setStatus(C79440a.m138169a(new TuxStatusView.C23263c(), new AbstractC89171a<C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.favorites.p2921c.C47350l.C47376y.C473771 */

                /* renamed from: a */
                final /* synthetic */ C47376y f110096a;

                static {
                    Covode.recordClassIndex(55990);
                }

                {
                    this.f110096a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C89391z invoke() {
                    ((AbstractC47371u) this.f110096a.f110094a.f110073j.getValue()).mo79693c();
                    return C89391z.f203057a;
                }
            }));
            this.f110095b.setVisibility(0);
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: b */
    public final void mo20630b(View view) {
        C89219l.m154721d(view, "");
        TuxStatusView tuxStatusView = (TuxStatusView) view;
        Context context = tuxStatusView.getContext();
        AbstractC89290k kVar = C47378m.f110097a;
        C47373w wVar = new C47373w(tuxStatusView, context);
        AssemViewModel.m23030a((VideoCollectionListViewModel) this.f110074k.getValue(), kVar, null, new C47376y(this, tuxStatusView), new C47375x(tuxStatusView), wVar, 2);
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.l$w */
    static final class C47373w extends AbstractC89220m implements AbstractC89172b<List<? extends C47799b>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ TuxStatusView f110090a;

        /* renamed from: b */
        final /* synthetic */ Context f110091b;

        static {
            Covode.recordClassIndex(55986);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47373w(TuxStatusView tuxStatusView, Context context) {
            super(1);
            this.f110090a = tuxStatusView;
            this.f110091b = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(List<? extends C47799b> list) {
            List<? extends C47799b> list2 = list;
            C89219l.m154721d(list2, "");
            if (list2.isEmpty()) {
                TuxStatusView tuxStatusView = this.f110090a;
                TuxStatusView.C23263c cVar = new TuxStatusView.C23263c();
                String string = this.f110091b.getString(R.string.bsa);
                C89219l.m154716b(string, "");
                TuxStatusView.C23263c a = cVar.mo37879a(string);
                String string2 = this.f110091b.getString(R.string.bs_);
                C89219l.m154716b(string2, "");
                tuxStatusView.setStatus(a.mo37878a((CharSequence) string2).mo37877a(C23005c.m43393a(C473741.f110092a)));
                this.f110090a.setVisibility(0);
            } else {
                this.f110090a.setVisibility(8);
            }
            return C89391z.f203057a;
        }
    }
}
