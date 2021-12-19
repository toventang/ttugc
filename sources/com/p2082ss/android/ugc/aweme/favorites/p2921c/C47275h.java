package com.p2082ss.android.ugc.aweme.favorites.p2921c;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1182af;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.AbstractC12748a;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.C12752d;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.extensions.AbstractC12779c;
import com.bytedance.assem.arch.extensions.C12777b;
import com.bytedance.assem.arch.extensions.C12786i;
import com.bytedance.assem.arch.p797d.AbstractC12769a;
import com.bytedance.assem.arch.service.AbstractC12800c;
import com.bytedance.assem.arch.service.C12801d;
import com.bytedance.assem.arch.viewModel.AbstractC12848i;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.C12814b;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.p1710c.C23005c;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.p1722h.C23163i;
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.ugc.aweme.favorites.api.C47192d;
import com.p2082ss.android.ugc.aweme.favorites.viewmodel.C47797a;
import com.p2082ss.android.ugc.aweme.favorites.viewmodel.C47802d;
import com.p2082ss.android.ugc.aweme.favorites.viewmodel.VideoCollectionContentViewModel;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4166g.C79440a;
import com.p2082ss.android.ugc.trill.R;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
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
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4615g.C89241a;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.favorites.c.h */
public final class C47275h extends AbstractC12769a {

    /* renamed from: j */
    private final C12786i f109969j = new C12786i(bW_(), new C47303r(this, null));

    /* renamed from: k */
    private final C12786i f109970k = new C12786i(bW_(), new C47304s(this, null));

    /* renamed from: l */
    private final C12814b f109971l;

    /* renamed from: m */
    private final AbstractC89244h f109972m;

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.h$j */
    public static final class C47295j extends AbstractC89220m implements AbstractC89172b<C47802d, C47802d> {
        public static final C47295j INSTANCE = new C47295j();

        static {
            Covode.recordClassIndex(55908);
        }

        public C47295j() {
            super(1);
        }

        public final C47802d invoke(C47802d dVar) {
            C89219l.m154719c(dVar, "");
            return dVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.h$u */
    public interface AbstractC47306u extends AbstractC12800c {
        static {
            Covode.recordClassIndex(55919);
        }

        /* renamed from: a */
        void mo79678a();

        /* renamed from: c */
        void mo79679c();

        /* renamed from: d */
        void mo79680d();
    }

    static {
        Covode.recordClassIndex(55888);
    }

    /* renamed from: v */
    public final C47192d mo79663v() {
        return (C47192d) this.f109969j.getValue();
    }

    /* renamed from: w */
    public final C47305t mo79664w() {
        return (C47305t) this.f109970k.getValue();
    }

    /* renamed from: x */
    public final VideoCollectionContentViewModel mo79665x() {
        return (VideoCollectionContentViewModel) this.f109971l.getValue();
    }

    /* renamed from: y */
    public final AbstractC47306u mo79666y() {
        return (AbstractC47306u) this.f109972m.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.h$g */
    public static final class C47292g extends AbstractC89220m implements AbstractC89171a<AbstractC12748a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f110002a;

        static {
            Covode.recordClassIndex(55905);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47292g(AbstractC12748a aVar) {
            super(0);
            this.f110002a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC12748a invoke() {
            return this.f110002a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.h$f */
    public static final class C47291f extends AbstractC89220m implements AbstractC89171a<C12874b<C47802d>> {
        public static final C47291f INSTANCE = new C47291f();

        static {
            Covode.recordClassIndex(55904);
        }

        public C47291f() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C47802d> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.h$h */
    public static final class C47293h extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f110003a;

        static {
            Covode.recordClassIndex(55906);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47293h(AbstractC12748a aVar) {
            super(0);
            this.f110003a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            return this.f110003a.getViewModelStore();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.h$l */
    public static final class C47297l extends AbstractC89220m implements AbstractC89171a<C12874b<C47802d>> {
        public static final C47297l INSTANCE = new C47297l();

        static {
            Covode.recordClassIndex(55910);
        }

        public C47297l() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C47802d> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.h$q */
    public static final class C47302q extends AbstractC89220m implements AbstractC89171a<C12874b<C47802d>> {
        public static final C47302q INSTANCE = new C47302q();

        static {
            Covode.recordClassIndex(55915);
        }

        public C47302q() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C47802d> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.h$t */
    public static final class C47305t implements AbstractC12779c {

        /* renamed from: a */
        public final boolean f110014a;

        static {
            Covode.recordClassIndex(55918);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C47305t) && this.f110014a == ((C47305t) obj).f110014a;
            }
            return true;
        }

        public final int hashCode() {
            boolean z = this.f110014a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final String toString() {
            return "Config(hasMoreCollection=" + this.f110014a + ")";
        }

        private /* synthetic */ C47305t() {
            this(false);
        }

        public C47305t(boolean z) {
            this.f110014a = z;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.h$i */
    public static final class C47294i extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f110004a;

        static {
            Covode.recordClassIndex(55907);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47294i(AbstractC12748a aVar) {
            super(0);
            this.f110004a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f110004a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.h$k */
    public static final class C47296k extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f110005a;

        static {
            Covode.recordClassIndex(55909);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47296k(AbstractC12748a aVar) {
            super(0);
            this.f110005a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f110005a.bD_().f30985g;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.h$w */
    static final class C47308w extends AbstractC89220m implements AbstractC89171a<AbstractC47306u> {

        /* renamed from: a */
        final /* synthetic */ C47275h f110016a;

        static {
            Covode.recordClassIndex(55921);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47308w(C47275h hVar) {
            super(0);
            this.f110016a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC47306u invoke() {
            return C12801d.m23023b(this.f110016a, C89204ab.m154669a(AbstractC47306u.class));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.h$a */
    public static final class C47276a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f109973a;

        static {
            Covode.recordClassIndex(55889);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47276a(AbstractC89277c cVar) {
            super(0);
            this.f109973a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f109973a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.h$b */
    public static final class C47287b extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f109998a;

        static {
            Covode.recordClassIndex(55900);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47287b(AbstractC12748a aVar) {
            super(0);
            this.f109998a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final Fragment invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f109998a);
            if (a != null) {
                return a;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.h$c */
    public static final class C47288c extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f109999a;

        static {
            Covode.recordClassIndex(55901);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47288c(AbstractC12748a aVar) {
            super(0);
            this.f109999a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f109999a);
            if (a != null) {
                C1182af viewModelStore = a.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.h$m */
    public static final class C47298m extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f110006a;

        static {
            Covode.recordClassIndex(55911);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47298m(AbstractC12748a aVar) {
            super(0);
            this.f110006a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final ActivityC0945e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f110006a);
            if (b != null) {
                return b;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.h$n */
    public static final class C47299n extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f110007a;

        static {
            Covode.recordClassIndex(55912);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47299n(AbstractC12748a aVar) {
            super(0);
            this.f110007a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f110007a);
            if (b != null) {
                C1182af viewModelStore = b.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.h$o */
    public static final class C47300o extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f110008a;

        static {
            Covode.recordClassIndex(55913);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47300o(AbstractC12748a aVar) {
            super(0);
            this.f110008a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f110008a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20583b(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.h$p */
    public static final class C47301p extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f110009a;

        static {
            Covode.recordClassIndex(55914);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47301p(AbstractC12748a aVar) {
            super(0);
            this.f110009a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f110009a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20584c(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.h$r */
    public static final class C47303r extends AbstractC89220m implements AbstractC89171a<C47192d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f110010a;

        /* renamed from: b */
        final /* synthetic */ String f110011b;

        static {
            Covode.recordClassIndex(55916);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47303r(AbstractC12748a aVar, String str) {
            super(0);
            this.f110010a = aVar;
            this.f110011b = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.favorites.api.d, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.favorites.api.C47192d invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.f110010a
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bD_()
                com.bytedance.assem.arch.core.d r2 = r0.f30984f
                java.lang.Class<com.ss.android.ugc.aweme.favorites.api.d> r1 = com.p2082ss.android.ugc.aweme.favorites.api.C47192d.class
                java.lang.String r0 = r3.f110011b
                java.lang.Object r0 = r2.mo20603a(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.favorites.p2921c.C47275h.C47303r.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.h$s */
    public static final class C47304s extends AbstractC89220m implements AbstractC89171a<C47305t> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f110012a;

        /* renamed from: b */
        final /* synthetic */ String f110013b;

        static {
            Covode.recordClassIndex(55917);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47304s(AbstractC12748a aVar, String str) {
            super(0);
            this.f110012a = aVar;
            this.f110013b = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.favorites.c.h$t, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.favorites.p2921c.C47275h.C47305t invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.f110012a
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bD_()
                com.bytedance.assem.arch.core.d r2 = r0.f30984f
                java.lang.Class<com.ss.android.ugc.aweme.favorites.c.h$t> r1 = com.p2082ss.android.ugc.aweme.favorites.p2921c.C47275h.C47305t.class
                java.lang.String r0 = r3.f110013b
                java.lang.Object r0 = r2.mo20606b(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.favorites.p2921c.C47275h.C47304s.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.h$v */
    static final class C47307v extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ C47275h f110015a;

        static {
            Covode.recordClassIndex(55920);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47307v(C47275h hVar) {
            super(0);
            this.f110015a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1175ad.AbstractC1177b invoke() {
            String str = this.f110015a.mo79663v().f109842a;
            if (str == null) {
                str = "";
            }
            return VideoCollectionContentViewModel.C47759a.m90805a(str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.h$d */
    public static final class C47289d extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f110000a;

        static {
            Covode.recordClassIndex(55902);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47289d(AbstractC12748a aVar) {
            super(0);
            this.f110000a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f110000a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20583b(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.h$e */
    public static final class C47290e extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f110001a;

        static {
            Covode.recordClassIndex(55903);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47290e(AbstractC12748a aVar) {
            super(0);
            this.f110001a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f110001a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20584c(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.h$y */
    static final class C47310y extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ TuxStatusView f110021a;

        /* renamed from: b */
        final /* synthetic */ View f110022b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89236c f110023c;

        /* renamed from: d */
        final /* synthetic */ View f110024d;

        /* renamed from: e */
        final /* synthetic */ View f110025e;

        /* renamed from: f */
        final /* synthetic */ TextView f110026f;

        /* renamed from: g */
        final /* synthetic */ View f110027g;

        static {
            Covode.recordClassIndex(55923);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47310y(TuxStatusView tuxStatusView, View view, C89233z.C89236c cVar, View view2, View view3, TextView textView, View view4) {
            super(0);
            this.f110021a = tuxStatusView;
            this.f110022b = view;
            this.f110023c = cVar;
            this.f110024d = view2;
            this.f110025e = view3;
            this.f110026f = textView;
            this.f110027g = view4;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C23163i.m43668b(this.f110021a, null, 0, null, null, false, 29);
            this.f110021a.mo37867a();
            this.f110021a.setVisibility(0);
            this.f110022b.setEnabled(false);
            this.f110023c.element = 0;
            this.f110024d.setVisibility(0);
            this.f110025e.setVisibility(0);
            this.f110026f.setVisibility(8);
            this.f110027g.setVisibility(8);
            return C89391z.f203057a;
        }
    }

    public C47275h() {
        C12814b bVar;
        AbstractC12848i.C12852d dVar = AbstractC12848i.C12852d.f31278a;
        C47307v vVar = new C47307v(this);
        AbstractC89277c a = C89204ab.m154669a(VideoCollectionContentViewModel.class);
        C47276a aVar = new C47276a(a);
        C47295j jVar = C47295j.INSTANCE;
        if (C89219l.m154714a(dVar, AbstractC12848i.C12849a.f31275a)) {
            bVar = new C12814b(a, aVar, C47297l.INSTANCE, new C47298m(this), new C47299n(this), vVar, jVar, new C47300o(this), new C47301p(this));
        } else if (C89219l.m154714a(dVar, AbstractC12848i.C12852d.f31278a)) {
            bVar = new C12814b(a, aVar, C47302q.INSTANCE, new C47287b(this), new C47288c(this), vVar, jVar, new C47289d(this), new C47290e(this));
        } else if (dVar == null || C89219l.m154714a(dVar, AbstractC12848i.C12850b.f31276a)) {
            bVar = new C12814b(a, aVar, C47291f.INSTANCE, new C47292g(this), new C47293h(this), vVar, jVar, new C47294i(this), new C47296k(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.f109971l = bVar;
        this.f109972m = C89250i.m154773a((AbstractC89171a) new C47308w(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.h$aa */
    static final class View$OnClickListenerC47277aa implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ActivityC0945e f109974a;

        static {
            Covode.recordClassIndex(55890);
        }

        View$OnClickListenerC47277aa(ActivityC0945e eVar) {
            this.f109974a = eVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f109974a.finish();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.h$ab */
    static final class View$OnClickListenerC47278ab implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C47275h f109975a;

        static {
            Covode.recordClassIndex(55891);
        }

        View$OnClickListenerC47278ab(C47275h hVar) {
            this.f109975a = hVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f109975a.mo79665x().mo79853a(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.h$ac */
    static final class View$OnClickListenerC47279ac implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C47275h f109976a;

        static {
            Covode.recordClassIndex(55892);
        }

        View$OnClickListenerC47279ac(C47275h hVar) {
            this.f109976a = hVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f109976a.mo79665x().mo79853a(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.h$ae */
    static final class View$OnClickListenerC47281ae implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C47275h f109979a;

        static {
            Covode.recordClassIndex(55894);
        }

        View$OnClickListenerC47281ae(C47275h hVar) {
            this.f109979a = hVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f109979a.mo79666y().mo79679c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.h$af */
    static final class View$OnClickListenerC47282af implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C47275h f109980a;

        static {
            Covode.recordClassIndex(55895);
        }

        View$OnClickListenerC47282af(C47275h hVar) {
            this.f109980a = hVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f109980a.mo79666y().mo79680d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.h$ad */
    static final class View$OnClickListenerC47280ad implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C47275h f109977a;

        /* renamed from: b */
        final /* synthetic */ ActivityC0945e f109978b;

        static {
            Covode.recordClassIndex(55893);
        }

        View$OnClickListenerC47280ad(C47275h hVar, ActivityC0945e eVar) {
            this.f109977a = hVar;
            this.f109978b = eVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C47305t w = this.f109977a.mo79664w();
            if (w == null || !w.f110014a) {
                new C23144b(this.f109978b).mo37640e(R.string.btc).mo37637b();
            } else {
                this.f109977a.mo79666y().mo79678a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.h$z */
    static final class C47311z extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C47275h f110028a;

        /* renamed from: b */
        final /* synthetic */ TuxStatusView f110029b;

        static {
            Covode.recordClassIndex(55924);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47311z(C47275h hVar, TuxStatusView tuxStatusView) {
            super(1);
            this.f110028a = hVar;
            this.f110029b = tuxStatusView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            C89219l.m154721d(th, "");
            C23163i.m43668b(this.f110029b, null, 0, null, null, false, 29);
            this.f110029b.setStatus(C79440a.m138169a(new TuxStatusView.C23263c(), new AbstractC89171a<C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.favorites.p2921c.C47275h.C47311z.C473121 */

                /* renamed from: a */
                final /* synthetic */ C47311z f110030a;

                static {
                    Covode.recordClassIndex(55925);
                }

                {
                    this.f110030a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C89391z invoke() {
                    this.f110030a.f110028a.mo79665x().mo79856d(true);
                    return C89391z.f203057a;
                }
            }));
            this.f110029b.setVisibility(0);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.h$ag */
    static final class C47283ag extends AbstractC89220m implements AbstractC89172b<List<? extends C47797a>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C47275h f109981a;

        /* renamed from: b */
        final /* synthetic */ TuxStatusView f109982b;

        /* renamed from: c */
        final /* synthetic */ Context f109983c;

        /* renamed from: d */
        final /* synthetic */ ActivityC0945e f109984d;

        /* renamed from: e */
        final /* synthetic */ View f109985e;

        /* renamed from: f */
        final /* synthetic */ TextView f109986f;

        /* renamed from: g */
        final /* synthetic */ TextView f109987g;

        /* renamed from: h */
        final /* synthetic */ View f109988h;

        /* renamed from: i */
        final /* synthetic */ View f109989i;

        /* renamed from: j */
        final /* synthetic */ TextView f109990j;

        /* renamed from: k */
        final /* synthetic */ View f109991k;

        /* renamed from: l */
        final /* synthetic */ TextView f109992l;

        /* renamed from: m */
        final /* synthetic */ TextView f109993m;

        /* renamed from: n */
        final /* synthetic */ RecyclerView f109994n;

        static {
            Covode.recordClassIndex(55896);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47283ag(C47275h hVar, TuxStatusView tuxStatusView, Context context, ActivityC0945e eVar, View view, TextView textView, TextView textView2, View view2, View view3, TextView textView3, View view4, TextView textView4, TextView textView5, RecyclerView recyclerView) {
            super(1);
            this.f109981a = hVar;
            this.f109982b = tuxStatusView;
            this.f109983c = context;
            this.f109984d = eVar;
            this.f109985e = view;
            this.f109986f = textView;
            this.f109987g = textView2;
            this.f109988h = view2;
            this.f109989i = view3;
            this.f109990j = textView3;
            this.f109991k = view4;
            this.f109992l = textView4;
            this.f109993m = textView5;
            this.f109994n = recyclerView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(List<? extends C47797a> list) {
            boolean z;
            int i;
            String str;
            int i2;
            int i3;
            int i4;
            int i5;
            boolean z2;
            float f;
            C47305t w;
            String string;
            List<? extends C47797a> list2 = list;
            C89219l.m154721d(list2, "");
            int i6 = 8;
            boolean z3 = true;
            int i7 = 0;
            if (list2.isEmpty()) {
                TuxStatusView tuxStatusView = this.f109982b;
                Resources system = Resources.getSystem();
                C89219l.m154709a((Object) system, "");
                C23163i.m43668b(tuxStatusView, null, Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 140.0f, system.getDisplayMetrics()))), null, null, false, 29);
                TuxStatusView tuxStatusView2 = this.f109982b;
                TuxStatusView.C23263c cVar = new TuxStatusView.C23263c();
                String string2 = this.f109983c.getString(R.string.bt2);
                C89219l.m154716b(string2, "");
                TuxStatusView.C23263c a = cVar.mo37879a(string2);
                String string3 = this.f109983c.getString(R.string.bt1);
                C89219l.m154716b(string3, "");
                TuxStatusView.C23263c a2 = a.mo37878a((CharSequence) string3).mo37877a(C23005c.m43393a(C472841.f109995a));
                a2.f55132j = new AbstractC89172b<TuxButton, C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.favorites.p2921c.C47275h.C47283ag.C472852 */

                    /* renamed from: a */
                    final /* synthetic */ C47283ag f109996a;

                    static {
                        Covode.recordClassIndex(55898);
                    }

                    {
                        this.f109996a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C89391z invoke(TuxButton tuxButton) {
                        TuxButton tuxButton2 = tuxButton;
                        C89219l.m154721d(tuxButton2, "");
                        tuxButton2.setButtonSize(3);
                        tuxButton2.setButtonVariant(1);
                        tuxButton2.setButtonStartIcon(Integer.valueOf((int) R.raw.icon_plus));
                        tuxButton2.setText(R.string.bt7);
                        tuxButton2.setOnClickListener(new View.OnClickListener(this) {
                            /* class com.p2082ss.android.ugc.aweme.favorites.p2921c.C47275h.C47283ag.C472852.View$OnClickListenerC472861 */

                            /* renamed from: a */
                            final /* synthetic */ C472852 f109997a;

                            static {
                                Covode.recordClassIndex(55899);
                            }

                            {
                                this.f109997a = r1;
                            }

                            public final void onClick(View view) {
                                ClickAgent.onClick(view);
                                SmartRouter.buildRoute(this.f109997a.f109996a.f109984d, "aweme://favorite/videos/collections/add/video").withParam("collectionId", this.f109997a.f109996a.f109981a.mo79663v().f109842a).withParam("from", "COLLECTION_CONTENT").open();
                            }
                        });
                        return C89391z.f203057a;
                    }
                };
                tuxStatusView2.setStatus(a2);
                this.f109982b.setVisibility(0);
                this.f109985e.setEnabled(false);
            } else {
                this.f109982b.setVisibility(8);
                this.f109985e.setEnabled(true);
            }
            this.f109986f.setText(this.f109981a.mo79663v().f109843b);
            boolean z4 = list2 instanceof Collection;
            if (!z4 || !list2.isEmpty()) {
                Iterator<T> it = list2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().f110746b != 0) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z = false;
            if (!z4 || !list2.isEmpty()) {
                Iterator<T> it2 = list2.iterator();
                i = 0;
                while (it2.hasNext()) {
                    if (it2.next().f110746b == 2 && (i = i + 1) < 0) {
                        C89070n.m154523b();
                    }
                }
            } else {
                i = 0;
            }
            TextView textView = this.f109987g;
            Context context = this.f109983c;
            ViewGroup.MarginLayoutParams marginLayoutParams = null;
            if (context == null || (string = context.getString(R.string.btk)) == null) {
                str = null;
            } else {
                str = C1764a.m5928a(string, Arrays.copyOf(new Object[]{String.valueOf(i)}, 1));
                C89219l.m154716b(str, "");
            }
            textView.setText(str);
            View view = this.f109988h;
            if (z) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            view.setVisibility(i2);
            View view2 = this.f109989i;
            if (z) {
                i3 = 8;
            } else {
                i3 = 0;
            }
            view2.setVisibility(i3);
            TextView textView2 = this.f109990j;
            if (z) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            textView2.setVisibility(i4);
            View view3 = this.f109991k;
            if (z) {
                i5 = 0;
            } else {
                i5 = 8;
            }
            view3.setVisibility(i5);
            View view4 = this.f109985e;
            if (!z) {
                i6 = 0;
            }
            view4.setVisibility(i6);
            TextView textView3 = this.f109992l;
            if (i > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            textView3.setEnabled(z2);
            TextView textView4 = this.f109992l;
            float f2 = 1.0f;
            if (!textView4.isEnabled() || (w = this.f109981a.mo79664w()) == null || !w.f110014a) {
                f = 0.4f;
            } else {
                f = 1.0f;
            }
            textView4.setAlpha(f);
            TextView textView5 = this.f109993m;
            if (i <= 0) {
                z3 = false;
            }
            textView5.setEnabled(z3);
            TextView textView6 = this.f109993m;
            if (!textView6.isEnabled()) {
                f2 = 0.4f;
            }
            textView6.setAlpha(f2);
            ViewGroup.LayoutParams layoutParams = this.f109994n.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = layoutParams;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
            if (marginLayoutParams2 != null) {
                if (z) {
                    i7 = this.f109991k.getHeight();
                }
                marginLayoutParams2.bottomMargin = i7;
                this.f109994n.setLayoutParams(marginLayoutParams2);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: b */
    public final void mo20630b(View view) {
        String str;
        String string;
        C89219l.m154721d(view, "");
        View findViewById = view.findViewById(R.id.duy);
        C89219l.m154716b(findViewById, "");
        TextView textView = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.a7o);
        C89219l.m154716b(findViewById2, "");
        RecyclerView recyclerView = (RecyclerView) findViewById2;
        View findViewById3 = view.findViewById(R.id.ci_);
        C89219l.m154716b(findViewById3, "");
        View findViewById4 = view.findViewById(R.id.cwv);
        C89219l.m154716b(findViewById4, "");
        TextView textView2 = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.cww);
        C89219l.m154716b(findViewById5, "");
        TextView textView3 = (TextView) findViewById5;
        View findViewById6 = view.findViewById(R.id.pf);
        C89219l.m154716b(findViewById6, "");
        View findViewById7 = view.findViewById(R.id.cpj);
        C89219l.m154716b(findViewById7, "");
        TextView textView4 = (TextView) findViewById7;
        View findViewById8 = view.findViewById(R.id.a0w);
        C89219l.m154716b(findViewById8, "");
        TextView textView5 = (TextView) findViewById8;
        View findViewById9 = view.findViewById(R.id.bht);
        C89219l.m154716b(findViewById9, "");
        View findViewById10 = view.findViewById(R.id.bhw);
        C89219l.m154716b(findViewById10, "");
        View findViewById11 = view.findViewById(R.id.e7i);
        C89219l.m154716b(findViewById11, "");
        TuxStatusView tuxStatusView = (TuxStatusView) findViewById11;
        ActivityC0945e b = C12777b.m23004b(this);
        if (b != null) {
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            float applyDimension = TypedValue.applyDimension(1, 120.0f, system.getDisplayMetrics());
            C89233z.C89236c cVar = new C89233z.C89236c();
            cVar.element = 0;
            recyclerView.mo4405a(new C47309x(cVar, applyDimension, findViewById9, textView4));
            textView4.setText(mo79663v().f109843b);
            findViewById6.setOnClickListener(new View$OnClickListenerC47277aa(b));
            findViewById9.setOnClickListener(new View$OnClickListenerC47278ab(this));
            textView5.setOnClickListener(new View$OnClickListenerC47279ac(this));
            Context az_ = az_();
            if (az_ == null || (string = az_.getString(R.string.btk)) == null) {
                str = null;
            } else {
                str = C1764a.m5928a(string, Arrays.copyOf(new Object[]{"0"}, 1));
                C89219l.m154716b(str, "");
            }
            textView.setText(str);
            textView2.setOnClickListener(new View$OnClickListenerC47280ad(this, b));
            textView3.setOnClickListener(new View$OnClickListenerC47281ae(this));
            findViewById10.setOnClickListener(new View$OnClickListenerC47282af(this));
            Context context = tuxStatusView.getContext();
            AssemViewModel.m23030a(mo79665x(), C47313i.f110031a, null, new C47311z(this, tuxStatusView), new C47310y(tuxStatusView, findViewById9, cVar, findViewById6, findViewById10, textView5, findViewById3), new C47283ag(this, tuxStatusView, context, b, findViewById9, textView4, textView, findViewById6, findViewById10, textView5, findViewById3, textView2, textView3, recyclerView), 2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.h$x */
    public static final class C47309x extends RecyclerView.AbstractC1371n {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89236c f110017a;

        /* renamed from: b */
        final /* synthetic */ float f110018b;

        /* renamed from: c */
        final /* synthetic */ View f110019c;

        /* renamed from: d */
        final /* synthetic */ TextView f110020d;

        static {
            Covode.recordClassIndex(55922);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
            float f;
            boolean z;
            C89219l.m154721d(recyclerView, "");
            this.f110017a.element += i2;
            if (((float) this.f110017a.element) > this.f110018b) {
                f = 1.0f;
            } else {
                f = ((float) this.f110017a.element) / this.f110018b;
            }
            this.f110019c.setAlpha(f);
            View view = this.f110019c;
            if (f > 0.0f) {
                z = true;
            } else {
                z = false;
            }
            view.setEnabled(z);
            this.f110020d.setAlpha(f);
        }

        C47309x(C89233z.C89236c cVar, float f, View view, TextView textView) {
            this.f110017a = cVar;
            this.f110018b = f;
            this.f110019c = view;
            this.f110020d = textView;
        }
    }
}
