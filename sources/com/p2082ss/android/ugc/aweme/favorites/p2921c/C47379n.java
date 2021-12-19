package com.p2082ss.android.ugc.aweme.favorites.p2921c;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1182af;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
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
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.lighten.p1477a.p1480c.AbstractC20737n;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.p1722h.C23163i;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.p2133d.C29853b;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import com.p2082ss.android.ugc.aweme.favorites.api.C47192d;
import com.p2082ss.android.ugc.aweme.favorites.viewmodel.C47799b;
import com.p2082ss.android.ugc.aweme.favorites.viewmodel.C47803e;
import com.p2082ss.android.ugc.aweme.favorites.viewmodel.VideoCollectionListViewModel;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.favorites.c.n */
public final class C47379n extends AbstractC12769a {

    /* renamed from: j */
    final AbstractC89244h f110098j;

    /* renamed from: k */
    private final C12814b f110099k;

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.n$l */
    public static final class C47397l extends AbstractC89220m implements AbstractC89172b<C47803e, C47803e> {
        public static final C47397l INSTANCE = new C47397l();

        static {
            Covode.recordClassIndex(56010);
        }

        public C47397l() {
            super(1);
        }

        public final C47803e invoke(C47803e eVar) {
            C89219l.m154719c(eVar, "");
            return eVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.n$x */
    public interface AbstractC47416x extends AbstractC12800c {
        static {
            Covode.recordClassIndex(56029);
        }

        /* renamed from: a */
        void mo79699a();
    }

    static {
        Covode.recordClassIndex(55992);
    }

    /* renamed from: v */
    public final VideoCollectionListViewModel mo79694v() {
        return (VideoCollectionListViewModel) this.f110099k.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.n$h */
    public static final class C47393h extends AbstractC89220m implements AbstractC89171a<AbstractC12748a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f110114a;

        static {
            Covode.recordClassIndex(56006);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47393h(AbstractC12748a aVar) {
            super(0);
            this.f110114a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC12748a invoke() {
            return this.f110114a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.n$d */
    public static final class C47389d extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C47389d INSTANCE = new C47389d();

        static {
            Covode.recordClassIndex(56002);
        }

        public C47389d() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.n$g */
    public static final class C47392g extends AbstractC89220m implements AbstractC89171a<C12874b<C47803e>> {
        public static final C47392g INSTANCE = new C47392g();

        static {
            Covode.recordClassIndex(56005);
        }

        public C47392g() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C47803e> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.n$i */
    public static final class C47394i extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f110115a;

        static {
            Covode.recordClassIndex(56007);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47394i(AbstractC12748a aVar) {
            super(0);
            this.f110115a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            return this.f110115a.getViewModelStore();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.n$j */
    public static final class C47395j extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f110116a;

        static {
            Covode.recordClassIndex(56008);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47395j(AbstractC12748a aVar) {
            super(0);
            this.f110116a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            return this.f110116a.mo20598q();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.n$n */
    public static final class C47399n extends AbstractC89220m implements AbstractC89171a<C12874b<C47803e>> {
        public static final C47399n INSTANCE = new C47399n();

        static {
            Covode.recordClassIndex(56012);
        }

        public C47399n() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C47803e> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.n$q */
    public static final class C47402q extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C47402q INSTANCE = new C47402q();

        static {
            Covode.recordClassIndex(56015);
        }

        public C47402q() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.n$t */
    public static final class C47405t extends AbstractC89220m implements AbstractC89171a<C12874b<C47803e>> {
        public static final C47405t INSTANCE = new C47405t();

        static {
            Covode.recordClassIndex(56018);
        }

        public C47405t() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C47803e> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.n$aa */
    static final class C47381aa implements AbstractC39063h.AbstractC39067a {

        /* renamed from: a */
        final /* synthetic */ C47417y f110101a;

        /* renamed from: b */
        final /* synthetic */ C47379n f110102b;

        static {
            Covode.recordClassIndex(55994);
        }

        C47381aa(C47417y yVar, C47379n nVar) {
            this.f110101a = yVar;
            this.f110102b = nVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h.AbstractC39067a
        /* renamed from: l */
        public final void mo62679l() {
            C47379n.m22977a(this.f110102b.mo79694v(), new AbstractC89172b<C47803e, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.favorites.p2921c.C47379n.C47381aa.C473821 */

                /* renamed from: a */
                final /* synthetic */ C47381aa f110103a;

                static {
                    Covode.recordClassIndex(55995);
                }

                {
                    this.f110103a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C47803e eVar) {
                    C47803e eVar2 = eVar;
                    C89219l.m154721d(eVar2, "");
                    if (eVar2.f110756c) {
                        this.f110103a.f110101a.ao_();
                        this.f110103a.f110102b.mo79694v().mo79857a(false);
                    }
                    return C89391z.f203057a;
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.n$ac */
    static final class C47384ac extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ RecyclerView f110106a;

        /* renamed from: b */
        final /* synthetic */ C47417y f110107b;

        static {
            Covode.recordClassIndex(55997);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47384ac(RecyclerView recyclerView, C47417y yVar) {
            super(0);
            this.f110106a = recyclerView;
            this.f110107b = yVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f110106a.setVisibility(8);
            this.f110107b.mo67810f();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.n$k */
    public static final class C47396k extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f110117a;

        static {
            Covode.recordClassIndex(56009);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47396k(AbstractC12748a aVar) {
            super(0);
            this.f110117a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f110117a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.n$m */
    public static final class C47398m extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f110118a;

        static {
            Covode.recordClassIndex(56011);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47398m(AbstractC12748a aVar) {
            super(0);
            this.f110118a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f110118a.bD_().f30985g;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.n$z */
    static final class C47418z extends AbstractC89220m implements AbstractC89171a<AbstractC47416x> {

        /* renamed from: a */
        final /* synthetic */ C47379n f110147a;

        static {
            Covode.recordClassIndex(56031);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47418z(C47379n nVar) {
            super(0);
            this.f110147a = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC47416x invoke() {
            return C12801d.m23023b(this.f110147a, C89204ab.m154669a(AbstractC47416x.class));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.n$a */
    public static final class C47380a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f110100a;

        static {
            Covode.recordClassIndex(55993);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47380a(AbstractC89277c cVar) {
            super(0);
            this.f110100a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f110100a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.n$b */
    public static final class C47387b extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f110110a;

        static {
            Covode.recordClassIndex(56000);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47387b(AbstractC12748a aVar) {
            super(0);
            this.f110110a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final Fragment invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f110110a);
            if (a != null) {
                return a;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.n$c */
    public static final class C47388c extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f110111a;

        static {
            Covode.recordClassIndex(56001);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47388c(AbstractC12748a aVar) {
            super(0);
            this.f110111a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f110111a);
            if (a != null) {
                C1182af viewModelStore = a.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.n$o */
    public static final class C47400o extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f110119a;

        static {
            Covode.recordClassIndex(56013);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47400o(AbstractC12748a aVar) {
            super(0);
            this.f110119a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final ActivityC0945e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f110119a);
            if (b != null) {
                return b;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.n$p */
    public static final class C47401p extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f110120a;

        static {
            Covode.recordClassIndex(56014);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47401p(AbstractC12748a aVar) {
            super(0);
            this.f110120a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f110120a);
            if (b != null) {
                C1182af viewModelStore = b.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.n$r */
    public static final class C47403r extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f110121a;

        static {
            Covode.recordClassIndex(56016);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47403r(AbstractC12748a aVar) {
            super(0);
            this.f110121a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f110121a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20583b(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.n$s */
    public static final class C47404s extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f110122a;

        static {
            Covode.recordClassIndex(56017);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47404s(AbstractC12748a aVar) {
            super(0);
            this.f110122a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f110122a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20584c(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.n$e */
    public static final class C47390e extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f110112a;

        static {
            Covode.recordClassIndex(56003);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47390e(AbstractC12748a aVar) {
            super(0);
            this.f110112a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f110112a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20583b(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.n$f */
    public static final class C47391f extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f110113a;

        static {
            Covode.recordClassIndex(56004);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47391f(AbstractC12748a aVar) {
            super(0);
            this.f110113a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f110113a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20584c(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    public C47379n() {
        C12814b bVar;
        AbstractC12848i.C12852d dVar = AbstractC12848i.C12852d.f31278a;
        AbstractC89277c a = C89204ab.m154669a(VideoCollectionListViewModel.class);
        C47380a aVar = new C47380a(a);
        C47397l lVar = C47397l.INSTANCE;
        if (C89219l.m154714a(dVar, AbstractC12848i.C12849a.f31275a)) {
            bVar = new C12814b(a, aVar, C47399n.INSTANCE, new C47400o(this), new C47401p(this), C47402q.INSTANCE, lVar, new C47403r(this), new C47404s(this));
        } else if (C89219l.m154714a(dVar, AbstractC12848i.C12852d.f31278a)) {
            bVar = new C12814b(a, aVar, C47405t.INSTANCE, new C47387b(this), new C47388c(this), C47389d.INSTANCE, lVar, new C47390e(this), new C47391f(this));
        } else if (dVar == null || C89219l.m154714a(dVar, AbstractC12848i.C12850b.f31276a)) {
            bVar = new C12814b(a, aVar, C47392g.INSTANCE, new C47393h(this), new C47394i(this), new C47395j(this), lVar, new C47396k(this), new C47398m(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.f110099k = bVar;
        this.f110098j = C89250i.m154773a((AbstractC89171a) new C47418z(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.n$u */
    final class C47406u extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final SmartImageView f110123a;

        /* renamed from: b */
        public final SmartImageView f110124b;

        /* renamed from: c */
        public final SmartImageView f110125c;

        /* renamed from: d */
        public final ImageView f110126d;

        /* renamed from: e */
        public final View f110127e;

        /* renamed from: f */
        public final View f110128f;

        /* renamed from: g */
        final /* synthetic */ C47379n f110129g;

        static {
            Covode.recordClassIndex(56019);
        }

        /* renamed from: com.ss.android.ugc.aweme.favorites.c.n$u$a */
        public static final class C47407a implements AbstractC20737n {

            /* renamed from: a */
            final /* synthetic */ C47406u f110130a;

            static {
                Covode.recordClassIndex(56020);
            }

            @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20737n
            /* renamed from: a */
            public final void mo34150a() {
            }

            @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20737n
            /* renamed from: a */
            public final void mo34166a(Throwable th) {
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C47407a(C47406u uVar) {
                this.f110130a = uVar;
            }

            /* renamed from: com.ss.android.ugc.aweme.favorites.c.n$u$a$c */
            static final class C47410c<T> implements AbstractC88433f {

                /* renamed from: a */
                final /* synthetic */ C47407a f110135a;

                static {
                    Covode.recordClassIndex(56023);
                }

                C47410c(C47407a aVar) {
                    this.f110135a = aVar;
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88433f
                public final /* synthetic */ void accept(Object obj) {
                    this.f110135a.f110130a.f110126d.setImageResource(R.color.j);
                }
            }

            /* renamed from: com.ss.android.ugc.aweme.favorites.c.n$u$a$b */
            static final class C47409b<T> implements AbstractC88433f {

                /* renamed from: a */
                final /* synthetic */ Bitmap f110133a;

                /* renamed from: b */
                final /* synthetic */ C47407a f110134b;

                static {
                    Covode.recordClassIndex(56022);
                }

                C47409b(Bitmap bitmap, C47407a aVar) {
                    this.f110133a = bitmap;
                    this.f110134b = aVar;
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88433f
                public final /* synthetic */ void accept(Object obj) {
                    this.f110134b.f110130a.f110126d.setImageBitmap((Bitmap) obj);
                    this.f110134b.f110130a.f110123a.setImageBitmap(this.f110133a);
                }
            }

            @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20737n
            /* renamed from: a */
            public final void mo34165a(Bitmap bitmap) {
                if (bitmap != null) {
                    AbstractC88979t.m154310b("").mo143261a(C88925a.m154160a(C88946a.f201990b)).mo143292d(new C47408a(bitmap, this)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C47409b(bitmap, this), new C47410c(this));
                }
            }

            /* renamed from: com.ss.android.ugc.aweme.favorites.c.n$u$a$a */
            static final class C47408a<T, R> implements AbstractC88434g {

                /* renamed from: a */
                final /* synthetic */ Bitmap f110131a;

                /* renamed from: b */
                final /* synthetic */ C47407a f110132b;

                static {
                    Covode.recordClassIndex(56021);
                }

                C47408a(Bitmap bitmap, C47407a aVar) {
                    this.f110131a = bitmap;
                    this.f110132b = aVar;
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88434g
                public final /* synthetic */ Object apply(Object obj) {
                    MethodCollector.m26663i(7220);
                    C89219l.m154721d(obj, "");
                    Bitmap bitmap = this.f110131a;
                    double width = (double) bitmap.getWidth();
                    Double.isNaN(width);
                    double height = (double) this.f110131a.getHeight();
                    Double.isNaN(height);
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (width * 0.05d), (int) (height * 0.05d), false);
                    this.f110132b.f110130a.f110129g.az_();
                    Bitmap.Config config = createScaledBitmap.getConfig();
                    if (config == null) {
                        MethodCollector.m26664o(7220);
                        return null;
                    }
                    Bitmap copy = createScaledBitmap.copy(config, true);
                    C29853b.m60160a(createScaledBitmap, copy, 25);
                    MethodCollector.m26664o(7220);
                    return copy;
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.favorites.c.n$u$b */
        static final class View$OnClickListenerC47411b implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C47406u f110136a;

            static {
                Covode.recordClassIndex(56024);
            }

            View$OnClickListenerC47411b(C47406u uVar) {
                this.f110136a = uVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                SmartRouter.buildRoute(this.f110136a.f110129g.az_(), "aweme://favorite/videos/allfavorites/content").open();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47406u(C47379n nVar, ViewGroup viewGroup) {
            super(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.zs, viewGroup, false));
            C89219l.m154721d(viewGroup, "");
            this.f110129g = nVar;
            View findViewById = this.itemView.findViewById(R.id.afo);
            C89219l.m154716b(findViewById, "");
            this.f110123a = (SmartImageView) findViewById;
            View findViewById2 = this.itemView.findViewById(R.id.afp);
            C89219l.m154716b(findViewById2, "");
            this.f110124b = (SmartImageView) findViewById2;
            View findViewById3 = this.itemView.findViewById(R.id.afq);
            C89219l.m154716b(findViewById3, "");
            this.f110125c = (SmartImageView) findViewById3;
            View findViewById4 = this.itemView.findViewById(R.id.rp);
            C89219l.m154716b(findViewById4, "");
            this.f110126d = (ImageView) findViewById4;
            View findViewById5 = this.itemView.findViewById(R.id.cif);
            C89219l.m154716b(findViewById5, "");
            this.f110127e = findViewById5;
            View findViewById6 = this.itemView.findViewById(R.id.av9);
            C89219l.m154716b(findViewById6, "");
            this.f110128f = findViewById6;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.n$ae */
    public static final class C47386ae extends GridLayoutManager.AbstractC1337c {

        /* renamed from: e */
        final /* synthetic */ C47417y f110109e;

        static {
            Covode.recordClassIndex(55999);
        }

        C47386ae(C47417y yVar) {
            this.f110109e = yVar;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1337c
        /* renamed from: a */
        public final int mo4342a(int i) {
            if (this.f110109e.getItemViewType(i) == 0) {
                return 2;
            }
            return 1;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.n$y */
    final class C47417y extends AbstractC39060f<C47799b> {
        static {
            Covode.recordClassIndex(56030);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C47417y() {
        }

        @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
        /* renamed from: c */
        public final int mo60936c(int i) {
            C47799b bVar;
            List e = mo63369e();
            if (e == null || (bVar = (C47799b) C89070n.m154561b(e, i)) == null) {
                return 2;
            }
            return bVar.f110749b;
        }

        @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
        /* renamed from: a */
        public final RecyclerView.ViewHolder mo60184a(ViewGroup viewGroup, int i) {
            C89219l.m154721d(viewGroup, "");
            if (i == 0) {
                return new C47414w(C47379n.this, viewGroup);
            }
            if (i == 1) {
                return new C47406u(C47379n.this, viewGroup);
            }
            if (i == 2) {
                return new C47412v(C47379n.this, viewGroup);
            }
            throw new Exception("not match view type");
        }

        @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
        /* renamed from: a */
        public final void mo60186a(RecyclerView.ViewHolder viewHolder, int i) {
            int i2;
            UrlModel urlModel;
            List<String> urlList;
            String str;
            String str2;
            String str3;
            UrlModel urlModel2;
            List<String> urlList2;
            String str4;
            UrlModel urlModel3;
            List<String> urlList3;
            UrlModel urlModel4;
            List<String> urlList4;
            List e = mo63369e();
            if (e != null && C89070n.m154561b(e, i) != null) {
                if (viewHolder instanceof C47414w) {
                    C47414w wVar = (C47414w) viewHolder;
                    wVar.itemView.setOnClickListener(new C47414w.View$OnClickListenerC47415a(wVar));
                    return;
                }
                int i3 = 4;
                int i4 = 8;
                String str5 = "";
                if (viewHolder instanceof C47406u) {
                    C47406u uVar = (C47406u) viewHolder;
                    C47192d dVar = ((C47799b) mo63369e().get(i)).f110748a;
                    C89219l.m154721d(dVar, str5);
                    if (dVar.f109844c == null || dVar.f109844c.size() <= 1) {
                        uVar.f110124b.setVisibility(8);
                        uVar.f110125c.setVisibility(8);
                        uVar.f110127e.setVisibility(0);
                    } else if (dVar.f109844c.size() <= 2) {
                        uVar.f110124b.setVisibility(0);
                        uVar.f110125c.setVisibility(4);
                        uVar.f110127e.setVisibility(8);
                    } else {
                        uVar.f110124b.setVisibility(0);
                        uVar.f110125c.setVisibility(0);
                        uVar.f110127e.setVisibility(8);
                    }
                    List<UrlModel> list = dVar.f109844c;
                    if (list == null || (urlModel4 = (UrlModel) C89070n.m154561b((List) list, 0)) == null || (urlList4 = urlModel4.getUrlList()) == null || (str2 = (String) C89070n.m154561b((List) urlList4, 0)) == null) {
                        str2 = str5;
                    }
                    List<UrlModel> list2 = dVar.f109844c;
                    if (list2 == null || (urlModel3 = (UrlModel) C89070n.m154561b((List) list2, 1)) == null || (urlList3 = urlModel3.getUrlList()) == null || (str3 = (String) C89070n.m154561b((List) urlList3, 0)) == null) {
                        str3 = str5;
                    }
                    List<UrlModel> list3 = dVar.f109844c;
                    if (!(list3 == null || (urlModel2 = (UrlModel) C89070n.m154561b((List) list3, 2)) == null || (urlList2 = urlModel2.getUrlList()) == null || (str4 = (String) C89070n.m154561b((List) urlList2, 0)) == null)) {
                        str5 = str4;
                    }
                    View view = uVar.f110128f;
                    List<UrlModel> list4 = dVar.f109844c;
                    if (list4 == null || list4.isEmpty()) {
                        i4 = 0;
                    }
                    view.setVisibility(i4);
                    C20766v a = C20761r.m39061a(str2);
                    a.f49092E = uVar.f110123a;
                    a.mo34182a(new C47406u.C47407a(uVar));
                    C20766v a2 = C20761r.m39061a(str3);
                    a2.f49092E = uVar.f110124b;
                    a2.mo34186c();
                    C20766v a3 = C20761r.m39061a(str5);
                    a3.f49092E = uVar.f110125c;
                    a3.mo34186c();
                    uVar.itemView.setOnClickListener(new C47406u.View$OnClickListenerC47411b(uVar));
                } else if (viewHolder instanceof C47412v) {
                    C47412v vVar = (C47412v) viewHolder;
                    C47192d dVar2 = ((C47799b) mo63369e().get(i)).f110748a;
                    List<C47799b> e2 = mo63369e();
                    C89219l.m154716b(e2, str5);
                    if (!(e2 instanceof Collection) || !e2.isEmpty()) {
                        i2 = 0;
                        for (C47799b bVar : e2) {
                            if (bVar.f110749b == 2 && (i2 = i2 + 1) < 0) {
                                C89070n.m154523b();
                            }
                        }
                    } else {
                        i2 = 0;
                    }
                    C89219l.m154721d(dVar2, str5);
                    vVar.f110137a.setText(dVar2.f109843b);
                    TextView textView = vVar.f110137a;
                    if (!C80471gb.m139483a(vVar.f110140d.az_())) {
                        i3 = 3;
                    }
                    textView.setTextDirection(i3);
                    List<UrlModel> list5 = dVar2.f109844c;
                    if (!(list5 == null || (urlModel = (UrlModel) C89070n.m154561b((List) list5, 0)) == null || (urlList = urlModel.getUrlList()) == null || (str = (String) C89070n.m154561b((List) urlList, 0)) == null)) {
                        str5 = str;
                    }
                    View view2 = vVar.f110139c;
                    if (str5.length() == 0) {
                        i4 = 0;
                    }
                    view2.setVisibility(i4);
                    C20766v a4 = C20761r.m39061a(str5);
                    a4.f49092E = vVar.f110138b;
                    a4.mo34186c();
                    vVar.itemView.setOnClickListener(new C47412v.View$OnClickListenerC47413a(vVar, dVar2, i2));
                } else {
                    throw new Exception("not match view type");
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.n$ad */
    static final class C47385ad extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ RecyclerView f110108a;

        static {
            Covode.recordClassIndex(55998);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47385ad(RecyclerView recyclerView) {
            super(1);
            this.f110108a = recyclerView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            C89219l.m154721d(th, "");
            this.f110108a.setVisibility(8);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.n$w */
    final class C47414w extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ C47379n f110144a;

        static {
            Covode.recordClassIndex(56027);
        }

        /* renamed from: com.ss.android.ugc.aweme.favorites.c.n$w$a */
        static final class View$OnClickListenerC47415a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C47414w f110145a;

            static {
                Covode.recordClassIndex(56028);
            }

            View$OnClickListenerC47415a(C47414w wVar) {
                this.f110145a = wVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                ((AbstractC47416x) this.f110145a.f110144a.f110098j.getValue()).mo79699a();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47414w(C47379n nVar, ViewGroup viewGroup) {
            super(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.zz, viewGroup, false));
            C89219l.m154721d(viewGroup, "");
            this.f110144a = nVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.n$ab */
    static final class C47383ab extends AbstractC89220m implements AbstractC89172b<List<? extends C47799b>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C47417y f110104a;

        /* renamed from: b */
        final /* synthetic */ RecyclerView f110105b;

        static {
            Covode.recordClassIndex(55996);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47383ab(C47417y yVar, RecyclerView recyclerView) {
            super(1);
            this.f110104a = yVar;
            this.f110105b = recyclerView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(List<? extends C47799b> list) {
            List<? extends C47799b> list2 = list;
            C89219l.m154721d(list2, "");
            this.f110104a.aq_();
            this.f110105b.setVisibility(0);
            List e = this.f110104a.mo63369e();
            if (e != null) {
                e.clear();
            }
            if (!list2.isEmpty()) {
                this.f110104a.mo63358a(new C47799b(new C47192d(null, null, null, null, 31), 0));
            }
            this.f110104a.mo63366c(list2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.n$v */
    final class C47412v extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final TextView f110137a;

        /* renamed from: b */
        public final SmartImageView f110138b;

        /* renamed from: c */
        public final View f110139c;

        /* renamed from: d */
        final /* synthetic */ C47379n f110140d;

        static {
            Covode.recordClassIndex(56025);
        }

        /* renamed from: com.ss.android.ugc.aweme.favorites.c.n$v$a */
        static final class View$OnClickListenerC47413a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C47412v f110141a;

            /* renamed from: b */
            final /* synthetic */ C47192d f110142b;

            /* renamed from: c */
            final /* synthetic */ int f110143c;

            static {
                Covode.recordClassIndex(56026);
            }

            View$OnClickListenerC47413a(C47412v vVar, C47192d dVar, int i) {
                this.f110141a = vVar;
                this.f110142b = dVar;
                this.f110143c = i;
            }

            public final void onClick(View view) {
                Integer num;
                long j;
                Long l;
                ClickAgent.onClick(view);
                SmartRoute withParam = SmartRouter.buildRoute(this.f110141a.f110140d.az_(), "aweme://favorite/videos/collections/content").withParam(StringSet.name, this.f110142b.f109843b).withParam("collectionCount", this.f110143c).withParam("id", this.f110142b.f109842a);
                C47192d.C47194b bVar = this.f110142b.f109845d;
                if (bVar != null) {
                    num = bVar.f109849a;
                } else {
                    num = null;
                }
                SmartRoute withParam2 = withParam.withParam("state", num);
                C47192d.C47193a aVar = this.f110142b.f109846e;
                if (aVar == null || (l = aVar.f109847a) == null) {
                    j = 0;
                } else {
                    j = l.longValue();
                }
                withParam2.withParam("total", j).open();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47412v(C47379n nVar, ViewGroup viewGroup) {
            super(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.zx, viewGroup, false));
            C89219l.m154721d(viewGroup, "");
            this.f110140d = nVar;
            View findViewById = this.itemView.findViewById(R.id.cpj);
            C89219l.m154716b(findViewById, "");
            this.f110137a = (TextView) findViewById;
            View findViewById2 = this.itemView.findViewById(R.id.afn);
            C89219l.m154716b(findViewById2, "");
            this.f110138b = (SmartImageView) findViewById2;
            View findViewById3 = this.itemView.findViewById(R.id.av9);
            C89219l.m154716b(findViewById3, "");
            this.f110139c = findViewById3;
        }
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: b */
    public final void mo20630b(View view) {
        C89219l.m154721d(view, "");
        RecyclerView recyclerView = (RecyclerView) view;
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        Integer valueOf = Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 12.0f, system.getDisplayMetrics())));
        Resources system2 = Resources.getSystem();
        C89219l.m154709a((Object) system2, "");
        C23163i.m43660a((View) recyclerView, valueOf, (Integer) null, Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 12.0f, system2.getDisplayMetrics()))), (Integer) null, false, 26);
        C47417y yVar = new C47417y();
        yVar.mo67813a((AbstractC39063h.AbstractC39067a) new C47381aa(yVar, this));
        yVar.f92247s = new C47386ae(yVar);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new GridLayoutManager(2));
        recyclerView.setAdapter(yVar);
        VideoCollectionListViewModel v = mo79694v();
        AbstractC89290k kVar = C47419o.f110148a;
        C47383ab abVar = new C47383ab(yVar, recyclerView);
        AssemViewModel.m23030a(v, kVar, null, new C47385ad(recyclerView), new C47384ac(recyclerView, yVar), abVar, 2);
        mo79694v().mo79857a(true);
    }
}
