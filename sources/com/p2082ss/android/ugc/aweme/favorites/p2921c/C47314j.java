package com.p2082ss.android.ugc.aweme.favorites.p2921c;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1182af;
import androidx.recyclerview.widget.LinearLayoutManager;
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
import com.bytedance.assem.arch.viewModel.C12815c;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import com.p2082ss.android.ugc.aweme.favorites.api.C47192d;
import com.p2082ss.android.ugc.aweme.favorites.viewmodel.C47799b;
import com.p2082ss.android.ugc.aweme.favorites.viewmodel.C47803e;
import com.p2082ss.android.ugc.aweme.favorites.viewmodel.VideoCollectionListViewModel;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.trill.R;
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
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.favorites.c.j */
public final class C47314j extends AbstractC12769a {

    /* renamed from: j */
    private final C12814b f110032j;

    /* renamed from: k */
    private final AbstractC89244h f110033k;

    /* renamed from: l */
    private final C12786i f110034l;

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.j$l */
    public static final class C47332l extends AbstractC89220m implements AbstractC89172b<C47803e, C47803e> {
        public static final C47332l INSTANCE = new C47332l();

        static {
            Covode.recordClassIndex(55945);
        }

        public C47332l() {
            super(1);
        }

        public final C47803e invoke(C47803e eVar) {
            C89219l.m154719c(eVar, "");
            return eVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.j$y */
    public interface AbstractC47347y extends AbstractC12800c {
        static {
            Covode.recordClassIndex(55960);
        }

        /* renamed from: a */
        void mo79690a();

        /* renamed from: a */
        void mo79691a(C47192d dVar);
    }

    static {
        Covode.recordClassIndex(55927);
    }

    /* renamed from: v */
    public final VideoCollectionListViewModel mo79681v() {
        return (VideoCollectionListViewModel) this.f110032j.getValue();
    }

    /* renamed from: w */
    public final AbstractC47347y mo79682w() {
        return (AbstractC47347y) this.f110033k.getValue();
    }

    /* renamed from: x */
    public final C47344w mo79683x() {
        return (C47344w) this.f110034l.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.j$h */
    public static final class C47328h extends AbstractC89220m implements AbstractC89171a<AbstractC12748a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f110050a;

        static {
            Covode.recordClassIndex(55941);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47328h(AbstractC12748a aVar) {
            super(0);
            this.f110050a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC12748a invoke() {
            return this.f110050a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.j$d */
    public static final class C47324d extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C47324d INSTANCE = new C47324d();

        static {
            Covode.recordClassIndex(55937);
        }

        public C47324d() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.j$g */
    public static final class C47327g extends AbstractC89220m implements AbstractC89171a<C12874b<C47803e>> {
        public static final C47327g INSTANCE = new C47327g();

        static {
            Covode.recordClassIndex(55940);
        }

        public C47327g() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C47803e> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.j$i */
    public static final class C47329i extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f110051a;

        static {
            Covode.recordClassIndex(55942);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47329i(AbstractC12748a aVar) {
            super(0);
            this.f110051a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            return this.f110051a.getViewModelStore();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.j$j */
    public static final class C47330j extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f110052a;

        static {
            Covode.recordClassIndex(55943);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47330j(AbstractC12748a aVar) {
            super(0);
            this.f110052a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            return this.f110052a.mo20598q();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.j$n */
    public static final class C47334n extends AbstractC89220m implements AbstractC89171a<C12874b<C47803e>> {
        public static final C47334n INSTANCE = new C47334n();

        static {
            Covode.recordClassIndex(55947);
        }

        public C47334n() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C47803e> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.j$q */
    public static final class C47337q extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C47337q INSTANCE = new C47337q();

        static {
            Covode.recordClassIndex(55950);
        }

        public C47337q() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.j$t */
    public static final class C47340t extends AbstractC89220m implements AbstractC89171a<C12874b<C47803e>> {
        public static final C47340t INSTANCE = new C47340t();

        static {
            Covode.recordClassIndex(55953);
        }

        public C47340t() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C47803e> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.j$w */
    public static final class C47344w implements AbstractC12779c {

        /* renamed from: a */
        public final boolean f110067a;

        /* renamed from: b */
        public final String f110068b;

        static {
            Covode.recordClassIndex(55957);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C47344w)) {
                return false;
            }
            C47344w wVar = (C47344w) obj;
            return this.f110067a == wVar.f110067a && C89219l.m154714a(this.f110068b, wVar.f110068b);
        }

        public final int hashCode() {
            boolean z = this.f110067a;
            if (z) {
                z = true;
            }
            int i = z ? 1 : 0;
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = i * 31;
            String str = this.f110068b;
            return i4 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            return "Config(moveToCollection=" + this.f110067a + ", excludeId=" + this.f110068b + ")";
        }

        private /* synthetic */ C47344w() {
            this(false, null);
        }

        public C47344w(boolean z, String str) {
            this.f110067a = z;
            this.f110068b = str;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.j$aa */
    static final class C47316aa extends AbstractC89220m implements AbstractC89171a<AbstractC47347y> {

        /* renamed from: a */
        final /* synthetic */ C47314j f110036a;

        static {
            Covode.recordClassIndex(55929);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47316aa(C47314j jVar) {
            super(0);
            this.f110036a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC47347y invoke() {
            return C12801d.m23023b(this.f110036a, C89204ab.m154669a(AbstractC47347y.class));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.j$ab */
    static final class C47317ab implements AbstractC39063h.AbstractC39067a {

        /* renamed from: a */
        final /* synthetic */ C47348z f110037a;

        /* renamed from: b */
        final /* synthetic */ C47314j f110038b;

        static {
            Covode.recordClassIndex(55930);
        }

        C47317ab(C47348z zVar, C47314j jVar) {
            this.f110037a = zVar;
            this.f110038b = jVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h.AbstractC39067a
        /* renamed from: l */
        public final void mo62679l() {
            C47314j.m22977a(this.f110038b.mo79681v(), new AbstractC89172b<C47803e, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.favorites.p2921c.C47314j.C47317ab.C473181 */

                /* renamed from: a */
                final /* synthetic */ C47317ab f110039a;

                static {
                    Covode.recordClassIndex(55931);
                }

                {
                    this.f110039a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C47803e eVar) {
                    C47803e eVar2 = eVar;
                    C89219l.m154721d(eVar2, "");
                    if (eVar2.f110756c) {
                        this.f110039a.f110037a.ao_();
                        this.f110039a.f110038b.mo79681v().mo79858a(false, this.f110039a.f110038b.mo79683x().f110068b);
                    }
                    return C89391z.f203057a;
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.j$ad */
    static final class C47320ad extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ RecyclerView f110043a;

        /* renamed from: b */
        final /* synthetic */ C47348z f110044b;

        static {
            Covode.recordClassIndex(55933);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47320ad(RecyclerView recyclerView, C47348z zVar) {
            super(0);
            this.f110043a = recyclerView;
            this.f110044b = zVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f110043a.setVisibility(8);
            this.f110044b.mo67810f();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.j$k */
    public static final class C47331k extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f110053a;

        static {
            Covode.recordClassIndex(55944);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47331k(AbstractC12748a aVar) {
            super(0);
            this.f110053a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f110053a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.j$m */
    public static final class C47333m extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f110054a;

        static {
            Covode.recordClassIndex(55946);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47333m(AbstractC12748a aVar) {
            super(0);
            this.f110054a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f110054a.bD_().f30985g;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.j$a */
    public static final class C47315a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f110035a;

        static {
            Covode.recordClassIndex(55928);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47315a(AbstractC89277c cVar) {
            super(0);
            this.f110035a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f110035a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.j$b */
    public static final class C47322b extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f110046a;

        static {
            Covode.recordClassIndex(55935);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47322b(AbstractC12748a aVar) {
            super(0);
            this.f110046a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final Fragment invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f110046a);
            if (a != null) {
                return a;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.j$c */
    public static final class C47323c extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f110047a;

        static {
            Covode.recordClassIndex(55936);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47323c(AbstractC12748a aVar) {
            super(0);
            this.f110047a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f110047a);
            if (a != null) {
                C1182af viewModelStore = a.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.j$o */
    public static final class C47335o extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f110055a;

        static {
            Covode.recordClassIndex(55948);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47335o(AbstractC12748a aVar) {
            super(0);
            this.f110055a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final ActivityC0945e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f110055a);
            if (b != null) {
                return b;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.j$p */
    public static final class C47336p extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f110056a;

        static {
            Covode.recordClassIndex(55949);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47336p(AbstractC12748a aVar) {
            super(0);
            this.f110056a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f110056a);
            if (b != null) {
                C1182af viewModelStore = b.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.j$r */
    public static final class C47338r extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f110057a;

        static {
            Covode.recordClassIndex(55951);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47338r(AbstractC12748a aVar) {
            super(0);
            this.f110057a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f110057a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20583b(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.j$s */
    public static final class C47339s extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f110058a;

        static {
            Covode.recordClassIndex(55952);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47339s(AbstractC12748a aVar) {
            super(0);
            this.f110058a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f110058a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20584c(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.j$u */
    public static final class C47341u extends AbstractC89220m implements AbstractC89171a<C47344w> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f110059a;

        /* renamed from: b */
        final /* synthetic */ String f110060b;

        static {
            Covode.recordClassIndex(55954);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47341u(AbstractC12748a aVar, String str) {
            super(0);
            this.f110059a = aVar;
            this.f110060b = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.favorites.c.j$w, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.favorites.p2921c.C47314j.C47344w invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.f110059a
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bD_()
                com.bytedance.assem.arch.core.d r2 = r0.f30984f
                java.lang.Class<com.ss.android.ugc.aweme.favorites.c.j$w> r1 = com.p2082ss.android.ugc.aweme.favorites.p2921c.C47314j.C47344w.class
                java.lang.String r0 = r3.f110060b
                java.lang.Object r0 = r2.mo20603a(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.favorites.p2921c.C47314j.C47341u.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.j$e */
    public static final class C47325e extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f110048a;

        static {
            Covode.recordClassIndex(55938);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47325e(AbstractC12748a aVar) {
            super(0);
            this.f110048a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f110048a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20583b(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.j$f */
    public static final class C47326f extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f110049a;

        static {
            Covode.recordClassIndex(55939);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47326f(AbstractC12748a aVar) {
            super(0);
            this.f110049a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f110049a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20584c(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    public C47314j() {
        C12814b bVar;
        AbstractC12848i.C12852d dVar = AbstractC12848i.C12852d.f31278a;
        AbstractC89277c a = C89204ab.m154669a(VideoCollectionListViewModel.class);
        C47315a aVar = new C47315a(a);
        C47332l lVar = C47332l.INSTANCE;
        if (C89219l.m154714a(dVar, AbstractC12848i.C12849a.f31275a)) {
            bVar = new C12814b(a, aVar, C47334n.INSTANCE, new C47335o(this), new C47336p(this), C47337q.INSTANCE, lVar, new C47338r(this), new C47339s(this));
        } else if (C89219l.m154714a(dVar, AbstractC12848i.C12852d.f31278a)) {
            bVar = new C12814b(a, aVar, C47340t.INSTANCE, new C47322b(this), new C47323c(this), C47324d.INSTANCE, lVar, new C47325e(this), new C47326f(this));
        } else if (dVar == null || C89219l.m154714a(dVar, AbstractC12848i.C12850b.f31276a)) {
            bVar = new C12814b(a, aVar, C47327g.INSTANCE, new C47328h(this), new C47329i(this), new C47330j(this), lVar, new C47331k(this), new C47333m(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.f110032j = bVar;
        this.f110033k = C89250i.m154773a((AbstractC89171a) new C47316aa(this));
        this.f110034l = new C12786i(bW_(), new C47341u(this, null));
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.j$z */
    final class C47348z extends AbstractC39060f<C47799b> {
        static {
            Covode.recordClassIndex(55961);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C47348z() {
        }

        @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
        /* renamed from: c */
        public final int mo60936c(int i) {
            List e = mo63369e();
            C89219l.m154716b(e, "");
            C47799b bVar = (C47799b) C89070n.m154561b(e, i);
            if (bVar != null) {
                return bVar.f110749b;
            }
            return 2;
        }

        @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
        /* renamed from: a */
        public final RecyclerView.ViewHolder mo60184a(ViewGroup viewGroup, int i) {
            C89219l.m154721d(viewGroup, "");
            if (i == 0) {
                return new C47345x(C47314j.this, viewGroup);
            }
            if (i == 2) {
                return new C47342v(C47314j.this, viewGroup);
            }
            throw new Exception("not match view type");
        }

        @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
        /* renamed from: a */
        public final void mo60186a(RecyclerView.ViewHolder viewHolder, int i) {
            int i2;
            long j;
            UrlModel urlModel;
            List<String> urlList;
            String str;
            Long l;
            List e = mo63369e();
            if (e != null && C89070n.m154561b(e, i) != null) {
                if (viewHolder instanceof C47345x) {
                    C47345x xVar = (C47345x) viewHolder;
                    xVar.itemView.setOnClickListener(new C47345x.View$OnClickListenerC47346a(xVar));
                } else if (viewHolder instanceof C47342v) {
                    C47342v vVar = (C47342v) viewHolder;
                    C47192d dVar = ((C47799b) mo63369e().get(i)).f110748a;
                    String str2 = "";
                    C89219l.m154721d(dVar, str2);
                    vVar.f110061a.setText(dVar.f109843b);
                    TextView textView = vVar.f110061a;
                    if (C80471gb.m139483a(vVar.f110064d.az_())) {
                        i2 = 4;
                    } else {
                        i2 = 3;
                    }
                    textView.setTextDirection(i2);
                    C47192d.C47193a aVar = dVar.f109846e;
                    if (aVar == null || (l = aVar.f109847a) == null) {
                        j = 0;
                    } else {
                        j = l.longValue();
                    }
                    TextView textView2 = vVar.f110063c;
                    Context context = vVar.f110063c.getContext();
                    C89219l.m154716b(context, str2);
                    textView2.setText(context.getResources().getQuantityString(R.plurals.ck, (int) j, String.valueOf(j)));
                    List<UrlModel> list = dVar.f109844c;
                    if (!(list == null || (urlModel = (UrlModel) C89070n.m154561b((List) list, 0)) == null || (urlList = urlModel.getUrlList()) == null || (str = (String) C89070n.m154561b((List) urlList, 0)) == null)) {
                        str2 = str;
                    }
                    C20766v a = C20761r.m39061a(str2);
                    a.f49092E = vVar.f110062b;
                    a.mo34186c();
                    vVar.itemView.setOnClickListener(new C47342v.View$OnClickListenerC47343a(vVar, dVar));
                } else {
                    throw new Exception("not match view type");
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.j$x */
    final class C47345x extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ C47314j f110069a;

        static {
            Covode.recordClassIndex(55958);
        }

        /* renamed from: com.ss.android.ugc.aweme.favorites.c.j$x$a */
        static final class View$OnClickListenerC47346a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C47345x f110070a;

            static {
                Covode.recordClassIndex(55959);
            }

            View$OnClickListenerC47346a(C47345x xVar) {
                this.f110070a = xVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                this.f110070a.f110069a.mo79682w().mo79690a();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47345x(C47314j jVar, ViewGroup viewGroup) {
            super(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.zy, viewGroup, false));
            C89219l.m154721d(viewGroup, "");
            this.f110069a = jVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.j$ae */
    static final class C47321ae extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ RecyclerView f110045a;

        static {
            Covode.recordClassIndex(55934);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47321ae(RecyclerView recyclerView) {
            super(1);
            this.f110045a = recyclerView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            C89219l.m154721d(th, "");
            this.f110045a.setVisibility(8);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.j$v */
    final class C47342v extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final TextView f110061a;

        /* renamed from: b */
        public final SmartImageView f110062b;

        /* renamed from: c */
        public final TextView f110063c;

        /* renamed from: d */
        final /* synthetic */ C47314j f110064d;

        static {
            Covode.recordClassIndex(55955);
        }

        /* renamed from: com.ss.android.ugc.aweme.favorites.c.j$v$a */
        static final class View$OnClickListenerC47343a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C47342v f110065a;

            /* renamed from: b */
            final /* synthetic */ C47192d f110066b;

            static {
                Covode.recordClassIndex(55956);
            }

            View$OnClickListenerC47343a(C47342v vVar, C47192d dVar) {
                this.f110065a = vVar;
                this.f110066b = dVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                this.f110065a.f110064d.mo79682w().mo79691a(this.f110066b);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47342v(C47314j jVar, ViewGroup viewGroup) {
            super(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a02, viewGroup, false));
            C89219l.m154721d(viewGroup, "");
            this.f110064d = jVar;
            View findViewById = this.itemView.findViewById(R.id.cpj);
            C89219l.m154716b(findViewById, "");
            this.f110061a = (TextView) findViewById;
            View findViewById2 = this.itemView.findViewById(R.id.afn);
            C89219l.m154716b(findViewById2, "");
            this.f110062b = (SmartImageView) findViewById2;
            View findViewById3 = this.itemView.findViewById(R.id.fed);
            C89219l.m154716b(findViewById3, "");
            this.f110063c = (TextView) findViewById3;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.j$ac */
    static final class C47319ac extends AbstractC89220m implements AbstractC89172b<List<? extends C47799b>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C47314j f110040a;

        /* renamed from: b */
        final /* synthetic */ C47348z f110041b;

        /* renamed from: c */
        final /* synthetic */ RecyclerView f110042c;

        static {
            Covode.recordClassIndex(55932);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47319ac(C47314j jVar, C47348z zVar, RecyclerView recyclerView) {
            super(1);
            this.f110040a = jVar;
            this.f110041b = zVar;
            this.f110042c = recyclerView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(List<? extends C47799b> list) {
            List<? extends C47799b> list2 = list;
            C89219l.m154721d(list2, "");
            this.f110041b.aq_();
            this.f110042c.setVisibility(0);
            List e = this.f110041b.mo63369e();
            if (e != null) {
                e.clear();
            }
            if (!this.f110040a.mo79683x().f110067a) {
                this.f110041b.mo63358a(new C47799b(new C47192d(null, null, null, null, 31), 0));
            }
            this.f110041b.mo63366c(list2);
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: b */
    public final void mo20630b(View view) {
        C89219l.m154721d(view, "");
        RecyclerView recyclerView = (RecyclerView) view;
        C47348z zVar = new C47348z();
        zVar.mo67813a((AbstractC39063h.AbstractC39067a) new C47317ab(zVar, this));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(zVar);
        VideoCollectionListViewModel v = mo79681v();
        AbstractC89290k kVar = C47349k.f110072a;
        C47319ac acVar = new C47319ac(this, zVar, recyclerView);
        AssemViewModel.m23030a(v, kVar, null, new C47321ae(recyclerView), new C47320ad(recyclerView, zVar), acVar, 2);
        mo79681v().mo79858a(true, mo79683x().f110068b);
    }
}
