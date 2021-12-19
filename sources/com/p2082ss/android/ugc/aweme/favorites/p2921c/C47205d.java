package com.p2082ss.android.ugc.aweme.favorites.p2921c;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1182af;
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
import com.bytedance.tux.p1710c.C23005c;
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.ugc.aweme.favorites.viewmodel.C47797a;
import com.p2082ss.android.ugc.aweme.favorites.viewmodel.C47802d;
import com.p2082ss.android.ugc.aweme.favorites.viewmodel.VideoCollectionContentViewModel;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4166g.C79440a;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Arrays;
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

/* renamed from: com.ss.android.ugc.aweme.favorites.c.d */
public final class C47205d extends AbstractC12769a {

    /* renamed from: j */
    final AbstractC89244h f109876j;

    /* renamed from: k */
    private final C12814b f109877k;

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.d$l */
    public static final class C47217l extends AbstractC89220m implements AbstractC89172b<C47802d, C47802d> {
        public static final C47217l INSTANCE = new C47217l();

        static {
            Covode.recordClassIndex(55830);
        }

        public C47217l() {
            super(1);
        }

        public final C47802d invoke(C47802d dVar) {
            C89219l.m154719c(dVar, "");
            return dVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.d$u */
    public interface AbstractC47226u extends AbstractC12800c {
        static {
            Covode.recordClassIndex(55839);
        }

        /* renamed from: a */
        void mo79644a();
    }

    static {
        Covode.recordClassIndex(55818);
    }

    /* renamed from: v */
    public final VideoCollectionContentViewModel mo79642v() {
        return (VideoCollectionContentViewModel) this.f109877k.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.d$h */
    public static final class C47213h extends AbstractC89220m implements AbstractC89171a<AbstractC12748a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f109883a;

        static {
            Covode.recordClassIndex(55826);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47213h(AbstractC12748a aVar) {
            super(0);
            this.f109883a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC12748a invoke() {
            return this.f109883a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.d$d */
    public static final class C47209d extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C47209d INSTANCE = new C47209d();

        static {
            Covode.recordClassIndex(55822);
        }

        public C47209d() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.d$g */
    public static final class C47212g extends AbstractC89220m implements AbstractC89171a<C12874b<C47802d>> {
        public static final C47212g INSTANCE = new C47212g();

        static {
            Covode.recordClassIndex(55825);
        }

        public C47212g() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C47802d> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.d$i */
    public static final class C47214i extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f109884a;

        static {
            Covode.recordClassIndex(55827);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47214i(AbstractC12748a aVar) {
            super(0);
            this.f109884a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            return this.f109884a.getViewModelStore();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.d$j */
    public static final class C47215j extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f109885a;

        static {
            Covode.recordClassIndex(55828);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47215j(AbstractC12748a aVar) {
            super(0);
            this.f109885a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            return this.f109885a.mo20598q();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.d$n */
    public static final class C47219n extends AbstractC89220m implements AbstractC89171a<C12874b<C47802d>> {
        public static final C47219n INSTANCE = new C47219n();

        static {
            Covode.recordClassIndex(55832);
        }

        public C47219n() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C47802d> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.d$q */
    public static final class C47222q extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C47222q INSTANCE = new C47222q();

        static {
            Covode.recordClassIndex(55835);
        }

        public C47222q() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.d$t */
    public static final class C47225t extends AbstractC89220m implements AbstractC89171a<C12874b<C47802d>> {
        public static final C47225t INSTANCE = new C47225t();

        static {
            Covode.recordClassIndex(55838);
        }

        public C47225t() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C47802d> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.d$k */
    public static final class C47216k extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f109886a;

        static {
            Covode.recordClassIndex(55829);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47216k(AbstractC12748a aVar) {
            super(0);
            this.f109886a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f109886a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.d$m */
    public static final class C47218m extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f109887a;

        static {
            Covode.recordClassIndex(55831);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47218m(AbstractC12748a aVar) {
            super(0);
            this.f109887a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f109887a.bD_().f30985g;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.d$v */
    static final class C47227v extends AbstractC89220m implements AbstractC89171a<AbstractC47226u> {

        /* renamed from: a */
        final /* synthetic */ C47205d f109892a;

        static {
            Covode.recordClassIndex(55840);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47227v(C47205d dVar) {
            super(0);
            this.f109892a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC47226u invoke() {
            return C12801d.m23023b(this.f109892a, C89204ab.m154669a(AbstractC47226u.class));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.d$y */
    static final class C47231y extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ TuxStatusView f109899a;

        static {
            Covode.recordClassIndex(55844);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47231y(TuxStatusView tuxStatusView) {
            super(0);
            this.f109899a = tuxStatusView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f109899a.mo37867a();
            this.f109899a.setVisibility(0);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.d$a */
    public static final class C47206a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f109878a;

        static {
            Covode.recordClassIndex(55819);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47206a(AbstractC89277c cVar) {
            super(0);
            this.f109878a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f109878a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.d$b */
    public static final class C47207b extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f109879a;

        static {
            Covode.recordClassIndex(55820);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47207b(AbstractC12748a aVar) {
            super(0);
            this.f109879a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final Fragment invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f109879a);
            if (a != null) {
                return a;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.d$c */
    public static final class C47208c extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f109880a;

        static {
            Covode.recordClassIndex(55821);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47208c(AbstractC12748a aVar) {
            super(0);
            this.f109880a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f109880a);
            if (a != null) {
                C1182af viewModelStore = a.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.d$o */
    public static final class C47220o extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f109888a;

        static {
            Covode.recordClassIndex(55833);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47220o(AbstractC12748a aVar) {
            super(0);
            this.f109888a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final ActivityC0945e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f109888a);
            if (b != null) {
                return b;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.d$p */
    public static final class C47221p extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f109889a;

        static {
            Covode.recordClassIndex(55834);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47221p(AbstractC12748a aVar) {
            super(0);
            this.f109889a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f109889a);
            if (b != null) {
                C1182af viewModelStore = b.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.d$r */
    public static final class C47223r extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f109890a;

        static {
            Covode.recordClassIndex(55836);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47223r(AbstractC12748a aVar) {
            super(0);
            this.f109890a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f109890a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20583b(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.d$s */
    public static final class C47224s extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f109891a;

        static {
            Covode.recordClassIndex(55837);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47224s(AbstractC12748a aVar) {
            super(0);
            this.f109891a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f109891a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20584c(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.d$e */
    public static final class C47210e extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f109881a;

        static {
            Covode.recordClassIndex(55823);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47210e(AbstractC12748a aVar) {
            super(0);
            this.f109881a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f109881a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20583b(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.d$f */
    public static final class C47211f extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f109882a;

        static {
            Covode.recordClassIndex(55824);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47211f(AbstractC12748a aVar) {
            super(0);
            this.f109882a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f109882a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20584c(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    public C47205d() {
        C12814b bVar;
        AbstractC12848i.C12852d dVar = AbstractC12848i.C12852d.f31278a;
        AbstractC89277c a = C89204ab.m154669a(VideoCollectionContentViewModel.class);
        C47206a aVar = new C47206a(a);
        C47217l lVar = C47217l.INSTANCE;
        if (C89219l.m154714a(dVar, AbstractC12848i.C12849a.f31275a)) {
            bVar = new C12814b(a, aVar, C47219n.INSTANCE, new C47220o(this), new C47221p(this), C47222q.INSTANCE, lVar, new C47223r(this), new C47224s(this));
        } else if (C89219l.m154714a(dVar, AbstractC12848i.C12852d.f31278a)) {
            bVar = new C12814b(a, aVar, C47225t.INSTANCE, new C47207b(this), new C47208c(this), C47209d.INSTANCE, lVar, new C47210e(this), new C47211f(this));
        } else if (dVar == null || C89219l.m154714a(dVar, AbstractC12848i.C12850b.f31276a)) {
            bVar = new C12814b(a, aVar, C47212g.INSTANCE, new C47213h(this), new C47214i(this), new C47215j(this), lVar, new C47216k(this), new C47218m(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.f109877k = bVar;
        this.f109876j = C89250i.m154773a((AbstractC89171a) new C47227v(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.d$w */
    static final class View$OnClickListenerC47228w implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C47205d f109893a;

        static {
            Covode.recordClassIndex(55841);
        }

        View$OnClickListenerC47228w(C47205d dVar) {
            this.f109893a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            ((AbstractC47226u) this.f109893a.f109876j.getValue()).mo79644a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.d$z */
    static final class C47232z extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C47205d f109900a;

        /* renamed from: b */
        final /* synthetic */ TuxStatusView f109901b;

        static {
            Covode.recordClassIndex(55845);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47232z(C47205d dVar, TuxStatusView tuxStatusView) {
            super(1);
            this.f109900a = dVar;
            this.f109901b = tuxStatusView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            C89219l.m154721d(th, "");
            this.f109901b.setStatus(C79440a.m138169a(new TuxStatusView.C23263c(), new AbstractC89171a<C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.favorites.p2921c.C47205d.C47232z.C472331 */

                /* renamed from: a */
                final /* synthetic */ C47232z f109902a;

                static {
                    Covode.recordClassIndex(55846);
                }

                {
                    this.f109902a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C89391z invoke() {
                    this.f109902a.f109900a.mo79642v().mo79854b(true);
                    return C89391z.f203057a;
                }
            }));
            this.f109901b.setVisibility(0);
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: b */
    public final void mo20630b(View view) {
        C89219l.m154721d(view, "");
        View findViewById = view.findViewById(R.id.e7i);
        C89219l.m154716b(findViewById, "");
        TuxStatusView tuxStatusView = (TuxStatusView) findViewById;
        View findViewById2 = view.findViewById(R.id.eai);
        C89219l.m154716b(findViewById2, "");
        TextView textView = (TextView) view.findViewById(R.id.f4w);
        C89219l.m154716b(textView, "");
        String string = view.getContext().getString(R.string.bsw);
        C89219l.m154716b(string, "");
        String a = C1764a.m5928a(string, Arrays.copyOf(new Object[]{"0"}, 1));
        C89219l.m154716b(a, "");
        textView.setText(a);
        textView.setOnClickListener(new View$OnClickListenerC47228w(this));
        Context context = view.getContext();
        VideoCollectionContentViewModel v = mo79642v();
        AbstractC89290k kVar = C47234e.f109903a;
        C47229x xVar = new C47229x(findViewById2, tuxStatusView, context, textView);
        AssemViewModel.m23030a(v, kVar, null, new C47232z(this, tuxStatusView), new C47231y(tuxStatusView), xVar, 2);
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.d$x */
    static final class C47229x extends AbstractC89220m implements AbstractC89172b<List<? extends C47797a>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ View f109894a;

        /* renamed from: b */
        final /* synthetic */ TuxStatusView f109895b;

        /* renamed from: c */
        final /* synthetic */ Context f109896c;

        /* renamed from: d */
        final /* synthetic */ TextView f109897d;

        static {
            Covode.recordClassIndex(55842);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47229x(View view, TuxStatusView tuxStatusView, Context context, TextView textView) {
            super(1);
            this.f109894a = view;
            this.f109895b = tuxStatusView;
            this.f109896c = context;
            this.f109897d = textView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(List<? extends C47797a> list) {
            String str;
            String string;
            List<? extends C47797a> list2 = list;
            C89219l.m154721d(list2, "");
            if (list2.isEmpty()) {
                this.f109894a.setVisibility(8);
                TuxStatusView tuxStatusView = this.f109895b;
                TuxStatusView.C23263c cVar = new TuxStatusView.C23263c();
                String string2 = this.f109896c.getString(R.string.bt9);
                C89219l.m154716b(string2, "");
                TuxStatusView.C23263c a = cVar.mo37879a(string2);
                String string3 = this.f109896c.getString(R.string.bt8);
                C89219l.m154716b(string3, "");
                tuxStatusView.setStatus(a.mo37878a((CharSequence) string3).mo37877a(C23005c.m43393a(C472301.f109898a)));
                this.f109895b.setVisibility(0);
            } else {
                this.f109894a.setVisibility(0);
                this.f109895b.setVisibility(8);
            }
            ArrayList arrayList = new ArrayList();
            for (T t : list2) {
                if (t.f110746b == 2) {
                    arrayList.add(t);
                }
            }
            ArrayList arrayList2 = arrayList;
            TextView textView = this.f109897d;
            C89219l.m154716b(textView, "");
            textView.setEnabled(!arrayList2.isEmpty());
            TextView textView2 = this.f109897d;
            C89219l.m154716b(textView2, "");
            Context context = this.f109896c;
            if (context == null || (string = context.getString(R.string.bsw)) == null) {
                str = null;
            } else {
                str = C1764a.m5928a(string, Arrays.copyOf(new Object[]{String.valueOf(arrayList2.size())}, 1));
                C89219l.m154716b(str, "");
            }
            textView2.setText(str);
            return C89391z.f203057a;
        }
    }
}
