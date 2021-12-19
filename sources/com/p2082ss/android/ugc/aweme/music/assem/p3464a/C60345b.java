package com.p2082ss.android.ugc.aweme.music.assem.p3464a;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1182af;
import com.bytedance.assem.arch.core.AbstractC12748a;
import com.bytedance.assem.arch.core.AbstractC12766p;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.C12752d;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.extensions.C12777b;
import com.bytedance.assem.arch.service.C12801d;
import com.bytedance.assem.arch.viewModel.AbstractC12818f;
import com.bytedance.assem.arch.viewModel.AbstractC12848i;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.C12814b;
import com.bytedance.assem.arch.viewModel.C12815c;
import com.bytedance.assem.arch.viewModel.C12856l;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.music.assem.AbstractC60416h;
import com.p2082ss.android.ugc.aweme.music.assem.C60343a;
import com.p2082ss.android.ugc.aweme.music.assem.LegacyCommunicateViewModel;
import com.p2082ss.android.ugc.aweme.music.assem.list.C60622s;
import com.p2082ss.android.ugc.aweme.music.assem.list.OriginMusicListViewModel;
import com.p2082ss.android.ugc.aweme.music.assem.list.cell.C60603d;
import com.p2082ss.android.ugc.trill.R;
import dagger.hilt.android.internal.p4539b.C88098a;
import java.util.List;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.music.assem.a.b */
public final class C60345b extends AbstractC60344a {

    /* renamed from: j */
    public boolean f137534j;

    /* renamed from: k */
    public View f137535k;

    /* renamed from: l */
    private final C12814b f137536l;

    /* renamed from: m */
    private final C12814b f137537m;

    /* renamed from: com.ss.android.ugc.aweme.music.assem.a.b$j */
    public static final class C60372j extends AbstractC89220m implements AbstractC89172b<C60622s, C60622s> {
        public static final C60372j INSTANCE = new C60372j();

        static {
            Covode.recordClassIndex(70921);
        }

        public C60372j() {
            super(1);
        }

        public final C60622s invoke(C60622s sVar) {
            C89219l.m154719c(sVar, "");
            return sVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.a.b$m */
    public static final class C60375m extends AbstractC89220m implements AbstractC89172b<C60343a, C60343a> {
        public static final C60375m INSTANCE = new C60375m();

        static {
            Covode.recordClassIndex(70924);
        }

        public C60375m() {
            super(1);
        }

        public final C60343a invoke(C60343a aVar) {
            C89219l.m154719c(aVar, "");
            return aVar;
        }
    }

    static {
        Covode.recordClassIndex(70894);
    }

    /* renamed from: v */
    private final OriginMusicListViewModel m110058v() {
        return (OriginMusicListViewModel) this.f137536l.getValue();
    }

    /* renamed from: w */
    private final LegacyCommunicateViewModel m110059w() {
        return (LegacyCommunicateViewModel) this.f137537m.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.a.b$ab */
    public static final class C60348ab extends AbstractC89220m implements AbstractC89171a<AbstractC12748a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137539a;

        static {
            Covode.recordClassIndex(70897);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60348ab(AbstractC12748a aVar) {
            super(0);
            this.f137539a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC12748a invoke() {
            return this.f137539a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.a.b$g */
    public static final class C60369g extends AbstractC89220m implements AbstractC89171a<AbstractC12748a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137558a;

        static {
            Covode.recordClassIndex(70918);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60369g(AbstractC12748a aVar) {
            super(0);
            this.f137558a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC12748a invoke() {
            return this.f137558a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.a.b$aa */
    public static final class C60347aa extends AbstractC89220m implements AbstractC89171a<C12874b<C60343a>> {
        public static final C60347aa INSTANCE = new C60347aa();

        static {
            Covode.recordClassIndex(70896);
        }

        public C60347aa() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C60343a> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.a.b$ac */
    public static final class C60349ac extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137540a;

        static {
            Covode.recordClassIndex(70898);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60349ac(AbstractC12748a aVar) {
            super(0);
            this.f137540a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            return this.f137540a.getViewModelStore();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.a.b$ad */
    public static final class C60350ad extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137541a;

        static {
            Covode.recordClassIndex(70899);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60350ad(AbstractC12748a aVar) {
            super(0);
            this.f137541a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            return this.f137541a.mo20598q();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.a.b$ak */
    public static final class C60357ak extends AbstractC89220m implements AbstractC89171a<C12874b<C60622s>> {
        public static final C60357ak INSTANCE = new C60357ak();

        static {
            Covode.recordClassIndex(70906);
        }

        public C60357ak() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C60622s> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.a.b$f */
    public static final class C60368f extends AbstractC89220m implements AbstractC89171a<C12874b<C60622s>> {
        public static final C60368f INSTANCE = new C60368f();

        static {
            Covode.recordClassIndex(70917);
        }

        public C60368f() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C60622s> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.a.b$h */
    public static final class C60370h extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137559a;

        static {
            Covode.recordClassIndex(70919);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60370h(AbstractC12748a aVar) {
            super(0);
            this.f137559a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            return this.f137559a.getViewModelStore();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.a.b$n */
    public static final class C60376n extends AbstractC89220m implements AbstractC89171a<C12874b<C60343a>> {
        public static final C60376n INSTANCE = new C60376n();

        static {
            Covode.recordClassIndex(70925);
        }

        public C60376n() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C60343a> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.a.b$q */
    public static final class C60379q extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C60379q INSTANCE = new C60379q();

        static {
            Covode.recordClassIndex(70928);
        }

        public C60379q() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.a.b$t */
    public static final class C60382t extends AbstractC89220m implements AbstractC89171a<C12874b<C60343a>> {
        public static final C60382t INSTANCE = new C60382t();

        static {
            Covode.recordClassIndex(70931);
        }

        public C60382t() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C60343a> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.a.b$u */
    public static final class C60383u extends AbstractC89220m implements AbstractC89171a<C12874b<C60622s>> {
        public static final C60383u INSTANCE = new C60383u();

        static {
            Covode.recordClassIndex(70932);
        }

        public C60383u() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C60622s> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.a.b$x */
    public static final class C60386x extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C60386x INSTANCE = new C60386x();

        static {
            Covode.recordClassIndex(70935);
        }

        public C60386x() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.a.b$ae */
    public static final class C60351ae extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137542a;

        static {
            Covode.recordClassIndex(70900);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60351ae(AbstractC12748a aVar) {
            super(0);
            this.f137542a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f137542a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.a.b$ag */
    public static final class C60353ag extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137544a;

        static {
            Covode.recordClassIndex(70902);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60353ag(AbstractC12748a aVar) {
            super(0);
            this.f137544a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f137544a.bD_().f30985g;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.a.b$an */
    static final class C60360an extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C60345b f137550a;

        static {
            Covode.recordClassIndex(70909);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60360an(C60345b bVar) {
            super(0);
            this.f137550a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            View view = this.f137550a.f137535k;
            if (view != null) {
                view.setVisibility(4);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.a.b$i */
    public static final class C60371i extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137560a;

        static {
            Covode.recordClassIndex(70920);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60371i(AbstractC12748a aVar) {
            super(0);
            this.f137560a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f137560a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.a.b$k */
    public static final class C60373k extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137561a;

        static {
            Covode.recordClassIndex(70922);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60373k(AbstractC12748a aVar) {
            super(0);
            this.f137561a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f137561a.bD_().f30985g;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.a.b$a */
    public static final class C60346a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f137538a;

        static {
            Covode.recordClassIndex(70895);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60346a(AbstractC89277c cVar) {
            super(0);
            this.f137538a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f137538a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.a.b$af */
    public static final class C60352af extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137543a;

        static {
            Covode.recordClassIndex(70901);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60352af(AbstractC12748a aVar) {
            super(0);
            this.f137543a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final ActivityC0945e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f137543a);
            if (b != null) {
                return b;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.a.b$ah */
    public static final class C60354ah extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137545a;

        static {
            Covode.recordClassIndex(70903);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60354ah(AbstractC12748a aVar) {
            super(0);
            this.f137545a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f137545a);
            if (b != null) {
                C1182af viewModelStore = b.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.a.b$ai */
    public static final class C60355ai extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137546a;

        static {
            Covode.recordClassIndex(70904);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60355ai(AbstractC12748a aVar) {
            super(0);
            this.f137546a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f137546a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20583b(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.a.b$aj */
    public static final class C60356aj extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137547a;

        static {
            Covode.recordClassIndex(70905);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60356aj(AbstractC12748a aVar) {
            super(0);
            this.f137547a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f137547a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20584c(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.a.b$al */
    static final class C60358al extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ C60345b f137548a;

        static {
            Covode.recordClassIndex(70907);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60358al(C60345b bVar) {
            super(0);
            this.f137548a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1175ad.AbstractC1177b invoke() {
            Context az_ = this.f137548a.az_();
            Objects.requireNonNull(az_, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            C1175ad.AbstractC1177b a = C88098a.m153168a((ActivityC0945e) az_);
            if (a == null) {
                C89219l.m154715b();
            }
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.a.b$b */
    public static final class C60364b extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137554a;

        static {
            Covode.recordClassIndex(70913);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60364b(AbstractC12748a aVar) {
            super(0);
            this.f137554a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final Fragment invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f137554a);
            if (a != null) {
                return a;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.a.b$c */
    public static final class C60365c extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137555a;

        static {
            Covode.recordClassIndex(70914);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60365c(AbstractC12748a aVar) {
            super(0);
            this.f137555a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f137555a);
            if (a != null) {
                C1182af viewModelStore = a.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.a.b$l */
    public static final class C60374l extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f137562a;

        static {
            Covode.recordClassIndex(70923);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60374l(AbstractC89277c cVar) {
            super(0);
            this.f137562a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f137562a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.a.b$o */
    public static final class C60377o extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137563a;

        static {
            Covode.recordClassIndex(70926);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60377o(AbstractC12748a aVar) {
            super(0);
            this.f137563a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final ActivityC0945e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f137563a);
            if (b != null) {
                return b;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.a.b$p */
    public static final class C60378p extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137564a;

        static {
            Covode.recordClassIndex(70927);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60378p(AbstractC12748a aVar) {
            super(0);
            this.f137564a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f137564a);
            if (b != null) {
                C1182af viewModelStore = b.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.a.b$r */
    public static final class C60380r extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137565a;

        static {
            Covode.recordClassIndex(70929);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60380r(AbstractC12748a aVar) {
            super(0);
            this.f137565a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f137565a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20583b(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.a.b$s */
    public static final class C60381s extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137566a;

        static {
            Covode.recordClassIndex(70930);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60381s(AbstractC12748a aVar) {
            super(0);
            this.f137566a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f137566a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20584c(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.a.b$v */
    public static final class C60384v extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137567a;

        static {
            Covode.recordClassIndex(70933);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60384v(AbstractC12748a aVar) {
            super(0);
            this.f137567a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final Fragment invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f137567a);
            if (a != null) {
                return a;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.a.b$w */
    public static final class C60385w extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137568a;

        static {
            Covode.recordClassIndex(70934);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60385w(AbstractC12748a aVar) {
            super(0);
            this.f137568a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f137568a);
            if (a != null) {
                C1182af viewModelStore = a.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.a.b$d */
    public static final class C60366d extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137556a;

        static {
            Covode.recordClassIndex(70915);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60366d(AbstractC12748a aVar) {
            super(0);
            this.f137556a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f137556a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20583b(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.a.b$e */
    public static final class C60367e extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137557a;

        static {
            Covode.recordClassIndex(70916);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60367e(AbstractC12748a aVar) {
            super(0);
            this.f137557a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f137557a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20584c(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.a.b$y */
    public static final class C60387y extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137569a;

        static {
            Covode.recordClassIndex(70936);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60387y(AbstractC12748a aVar) {
            super(0);
            this.f137569a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f137569a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20583b(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.a.b$z */
    public static final class C60388z extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137570a;

        static {
            Covode.recordClassIndex(70937);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60388z(AbstractC12748a aVar) {
            super(0);
            this.f137570a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f137570a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20584c(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    public C60345b() {
        C12814b bVar;
        C12814b bVar2;
        AbstractC12848i.C12852d dVar = AbstractC12848i.C12852d.f31278a;
        C60358al alVar = new C60358al(this);
        AbstractC89277c a = C89204ab.m154669a(OriginMusicListViewModel.class);
        C60346a aVar = new C60346a(a);
        C60372j jVar = C60372j.INSTANCE;
        if (C89219l.m154714a(dVar, AbstractC12848i.C12849a.f31275a)) {
            bVar = new C12814b(a, aVar, C60383u.INSTANCE, new C60352af(this), new C60354ah(this), alVar, jVar, new C60355ai(this), new C60356aj(this));
        } else if (C89219l.m154714a(dVar, AbstractC12848i.C12852d.f31278a)) {
            bVar = new C12814b(a, aVar, C60357ak.INSTANCE, new C60364b(this), new C60365c(this), alVar, jVar, new C60366d(this), new C60367e(this));
        } else if (dVar == null || C89219l.m154714a(dVar, AbstractC12848i.C12850b.f31276a)) {
            bVar = new C12814b(a, aVar, C60368f.INSTANCE, new C60369g(this), new C60370h(this), alVar, jVar, new C60371i(this), new C60373k(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.f137536l = bVar;
        AbstractC12848i.C12852d dVar2 = AbstractC12848i.C12852d.f31278a;
        AbstractC89277c a2 = C89204ab.m154669a(LegacyCommunicateViewModel.class);
        C60374l lVar = new C60374l(a2);
        C60375m mVar = C60375m.INSTANCE;
        if (C89219l.m154714a(dVar2, AbstractC12848i.C12849a.f31275a)) {
            bVar2 = new C12814b(a2, lVar, C60376n.INSTANCE, new C60377o(this), new C60378p(this), C60379q.INSTANCE, mVar, new C60380r(this), new C60381s(this));
        } else if (C89219l.m154714a(dVar2, AbstractC12848i.C12852d.f31278a)) {
            bVar2 = new C12814b(a2, lVar, C60382t.INSTANCE, new C60384v(this), new C60385w(this), C60386x.INSTANCE, mVar, new C60387y(this), new C60388z(this));
        } else if (dVar2 == null || C89219l.m154714a(dVar2, AbstractC12848i.C12850b.f31276a)) {
            bVar2 = new C12814b(a2, lVar, C60347aa.INSTANCE, new C60348ab(this), new C60349ac(this), new C60350ad(this), mVar, new C60351ae(this), new C60353ag(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.f137537m = bVar2;
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.a.b$ap */
    static final class C60362ap extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C60345b f137552a;

        static {
            Covode.recordClassIndex(70911);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60362ap(C60345b bVar) {
            super(1);
            this.f137552a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            this.f137552a.f137534j = bool.booleanValue();
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: b */
    public final void mo20630b(View view) {
        View findViewById;
        MethodCollector.m26663i(9913);
        C89219l.m154721d(view, "");
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.ea0);
        if (viewStub != null) {
            findViewById = viewStub.inflate();
        } else {
            findViewById = view.findViewById(R.id.dlm);
        }
        this.f137535k = findViewById;
        if (findViewById != null) {
            findViewById.setVisibility(4);
        }
        AssemViewModel.m23030a(m110058v(), C60389c.f137571a, null, null, new C60360an(this), null, 22);
        AbstractC12818f.C12819a.m23063a(this, m110058v(), C60390d.f137572a, C12856l.m23100a(), new C60361ao(this), 4);
        C12801d.m23020a(this, C89204ab.m154669a(AbstractC60416h.class), C60391e.f137573a, new C60362ap(this));
        AbstractC12818f.C12819a.m23063a(this, m110059w(), C60392f.f137574a, C12856l.m23100a(), new C60363aq(this), 4);
        AbstractC12818f.C12819a.m23063a(this, m110059w(), C60393g.f137575a, C12856l.m23100a(), new C60359am(this), 4);
        MethodCollector.m26664o(9913);
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.a.b$am */
    static final class C60359am extends AbstractC89220m implements AbstractC89183m<AbstractC12766p, C12776a<? extends Object>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C60345b f137549a;

        static {
            Covode.recordClassIndex(70908);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60359am(C60345b bVar) {
            super(2);
            this.f137549a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC12766p pVar, C12776a<? extends Object> aVar) {
            C89219l.m154721d(pVar, "");
            View view = this.f137549a.f137535k;
            if (view != null) {
                view.setVisibility(4);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.a.b$ao */
    static final class C60361ao extends AbstractC89220m implements AbstractC89183m<AbstractC12766p, List<? extends C60603d>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C60345b f137551a;

        static {
            Covode.recordClassIndex(70910);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60361ao(C60345b bVar) {
            super(2);
            this.f137551a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC12766p pVar, List<? extends C60603d> list) {
            View view;
            List<? extends C60603d> list2 = list;
            C89219l.m154721d(pVar, "");
            if ((list2 == null || list2.isEmpty()) && (view = this.f137551a.f137535k) != null) {
                view.setVisibility(4);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.a.b$aq */
    static final class C60363aq extends AbstractC89220m implements AbstractC89183m<AbstractC12766p, C12776a<? extends Object>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C60345b f137553a;

        static {
            Covode.recordClassIndex(70912);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60363aq(C60345b bVar) {
            super(2);
            this.f137553a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC12766p pVar, C12776a<? extends Object> aVar) {
            View view;
            C89219l.m154721d(pVar, "");
            if (this.f137553a.f137534j && (view = this.f137553a.f137535k) != null) {
                view.setVisibility(0);
            }
            return C89391z.f203057a;
        }
    }
}
