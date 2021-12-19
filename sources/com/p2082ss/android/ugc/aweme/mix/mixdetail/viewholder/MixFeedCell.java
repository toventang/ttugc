package com.p2082ss.android.ugc.aweme.mix.mixdetail.viewholder;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1182af;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.AbstractC12748a;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.extensions.C12777b;
import com.bytedance.assem.arch.extensions.C12793o;
import com.bytedance.assem.arch.extensions.C12794p;
import com.bytedance.assem.arch.extensions.C12795q;
import com.bytedance.assem.arch.extensions.C12796r;
import com.bytedance.assem.arch.viewModel.AbstractC12818f;
import com.bytedance.assem.arch.viewModel.AbstractC12846h;
import com.bytedance.assem.arch.viewModel.AbstractC12848i;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.C12814b;
import com.bytedance.assem.arch.viewModel.C12815c;
import com.bytedance.assem.arch.viewModel.C12854k;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.p1198d.C17191a;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.tiktok.proxy.AbstractC22876d;
import com.bytedance.tiktok.proxy.AbstractC22878f;
import com.bytedance.tiktok.proxy.AbstractC22880h;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.p2082ss.android.ugc.aweme.mix.mixdetail.AbstractC59861w;
import com.p2082ss.android.ugc.aweme.mix.mixdetail.viewmodel.C59857d;
import com.p2082ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewholder.MixFeedCell */
public final class MixFeedCell extends PowerCell<C59774b> implements AbstractC12846h, AbstractC59861w {

    /* renamed from: a */
    private final C12814b f136128a;

    /* renamed from: b */
    private final AbstractC89244h f136129b;

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewholder.MixFeedCell$g */
    public static final class C59740g extends AbstractC89220m implements AbstractC89172b<C59857d, C59857d> {
        public static final C59740g INSTANCE = new C59740g();

        static {
            Covode.recordClassIndex(70142);
        }

        public C59740g() {
            super(1);
        }

        public final C59857d invoke(C59857d dVar) {
            C89219l.m154719c(dVar, "");
            return dVar;
        }
    }

    static {
        Covode.recordClassIndex(70135);
    }

    /* renamed from: c */
    public final MixVideosViewModel mo97218c() {
        return (MixVideosViewModel) this.f136128a.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public final boolean getHasSubscribedForReused() {
        return false;
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public final AbstractC1204m getHostLifecycleOwner() {
        return null;
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public final AbstractC22876d getReceiverForHostVM() {
        return null;
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: j */
    public final int mo28071j() {
        return R.layout.akp;
    }

    @Override // com.bytedance.tiktok.proxy.AbstractC22878f
    public final AbstractC1204m getActualLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public final AbstractC22878f getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // com.bytedance.tiktok.proxy.AbstractC22880h
    public final AbstractC22876d getActualReceiver() {
        return this;
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public final AbstractC22880h<AbstractC22876d> getActualReceiverHolder() {
        return this;
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewholder.MixFeedCell$b */
    public static final class C59735b extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C59735b INSTANCE = new C59735b();

        static {
            Covode.recordClassIndex(70137);
        }

        public C59735b() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewholder.MixFeedCell$c */
    public static final class C59736c extends AbstractC89220m implements AbstractC89171a<C12874b<C59857d>> {
        public static final C59736c INSTANCE = new C59736c();

        static {
            Covode.recordClassIndex(70138);
        }

        public C59736c() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C59857d> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewholder.MixFeedCell$h */
    public static final class C59741h extends AbstractC89220m implements AbstractC89171a<C12874b<C59857d>> {
        public static final C59741h INSTANCE = new C59741h();

        static {
            Covode.recordClassIndex(70143);
        }

        public C59741h() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C59857d> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewholder.MixFeedCell$k */
    public static final class C59744k extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C59744k INSTANCE = new C59744k();

        static {
            Covode.recordClassIndex(70146);
        }

        public C59744k() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewholder.MixFeedCell$l */
    public static final class C59745l extends AbstractC89220m implements AbstractC89171a<C12874b<C59857d>> {
        public static final C59745l INSTANCE = new C59745l();

        static {
            Covode.recordClassIndex(70147);
        }

        public C59745l() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C59857d> invoke() {
            return new C12874b<>();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.mix.mixdetail.AbstractC59861w
    /* renamed from: b */
    public final void mo97099b() {
        this.itemView.setBackgroundColor(0);
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewholder.MixFeedCell$a */
    public static final class C59734a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f136130a;

        static {
            Covode.recordClassIndex(70136);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59734a(AbstractC89277c cVar) {
            super(0);
            this.f136130a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f136130a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewholder.MixFeedCell$o */
    static final class C59748o extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        final /* synthetic */ MixFeedCell f136138a;

        static {
            Covode.recordClassIndex(70150);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59748o(MixFeedCell mixFeedCell) {
            super(0);
            this.f136138a = mixFeedCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            View view = this.f136138a.itemView;
            C89219l.m154716b(view, "");
            return Integer.valueOf(view.getResources().getColor(R.color.j));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.mix.mixdetail.AbstractC59861w
    /* renamed from: a */
    public final void mo97098a() {
        this.itemView.setBackgroundColor(((Number) this.f136129b.getValue()).intValue());
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewholder.MixFeedCell$d */
    public static final class C59737d extends AbstractC89220m implements AbstractC89171a<AbstractC12748a> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f136131a;

        static {
            Covode.recordClassIndex(70139);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59737d(PowerCell powerCell) {
            super(0);
            this.f136131a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC12748a invoke() {
            if (this.f136131a.mo28070i() instanceof AbstractC12748a) {
                AbstractC1204m i = this.f136131a.mo28070i();
                if (i != null) {
                    return (AbstractC12748a) i;
                }
                throw new C89388w("null cannot be cast to non-null type");
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewholder.MixFeedCell$e */
    public static final class C59738e extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f136132a;

        static {
            Covode.recordClassIndex(70140);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59738e(PowerCell powerCell) {
            super(0);
            this.f136132a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            if (this.f136132a.mo28070i() instanceof AbstractC12748a) {
                AbstractC1204m i = this.f136132a.mo28070i();
                if (i != null) {
                    return ((AbstractC12748a) i).getViewModelStore();
                }
                throw new C89388w("null cannot be cast to non-null type");
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewholder.MixFeedCell$f */
    public static final class C59739f extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f136133a;

        static {
            Covode.recordClassIndex(70141);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59739f(PowerCell powerCell) {
            super(0);
            this.f136133a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            if (this.f136133a.mo28070i() instanceof AbstractC12748a) {
                AbstractC1204m i = this.f136133a.mo28070i();
                if (i != null) {
                    return ((AbstractC12748a) i).mo20598q();
                }
                throw new C89388w("null cannot be cast to non-null type");
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: k */
    public final void mo28072k() {
        super.mo28072k();
        mo97099b();
        AbstractC12818f.C12819a.m23063a(this, mo97218c(), C59773a.f136161a, (C12854k) null, new C59750q(this), 6);
        this.itemView.setOnClickListener(new View$OnClickListenerC59751r(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewholder.MixFeedCell$i */
    public static final class C59742i extends AbstractC89220m implements AbstractC89171a<AbstractC1204m> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f136134a;

        static {
            Covode.recordClassIndex(70144);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59742i(PowerCell powerCell) {
            super(0);
            this.f136134a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC1204m invoke() {
            View view = this.f136134a.itemView;
            C89219l.m154709a((Object) view, "");
            Context context = view.getContext();
            if (context instanceof ActivityC0945e) {
                View view2 = this.f136134a.itemView;
                C89219l.m154709a((Object) view2, "");
                Context context2 = view2.getContext();
                if (context2 != null) {
                    return (ActivityC0945e) context2;
                }
                throw new C89388w("null cannot be cast to non-null type");
            } else if (context instanceof ContextWrapper) {
                View view3 = this.f136134a.itemView;
                C89219l.m154709a((Object) view3, "");
                Context context3 = view3.getContext();
                if (context3 != null) {
                    Context baseContext = ((ContextWrapper) context3).getBaseContext();
                    if (baseContext != null) {
                        return (ActivityC0945e) baseContext;
                    }
                    throw new C89388w("null cannot be cast to non-null type");
                }
                throw new C89388w("null cannot be cast to non-null type");
            } else {
                StringBuilder sb = new StringBuilder("can not convert ");
                View view4 = this.f136134a.itemView;
                C89219l.m154709a((Object) view4, "");
                throw new IllegalStateException(sb.append(view4.getContext()).append(" to activity.").toString());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewholder.MixFeedCell$j */
    public static final class C59743j extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f136135a;

        static {
            Covode.recordClassIndex(70145);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59743j(PowerCell powerCell) {
            super(0);
            this.f136135a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e eVar;
            View view = this.f136135a.itemView;
            C89219l.m154709a((Object) view, "");
            Context context = view.getContext();
            if (context instanceof ActivityC0945e) {
                View view2 = this.f136135a.itemView;
                C89219l.m154709a((Object) view2, "");
                Context context2 = view2.getContext();
                if (context2 != null) {
                    eVar = (ActivityC0945e) context2;
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            } else if (context instanceof ContextThemeWrapper) {
                View view3 = this.f136135a.itemView;
                C89219l.m154709a((Object) view3, "");
                Context context3 = view3.getContext();
                if (context3 != null) {
                    Context baseContext = ((ContextThemeWrapper) context3).getBaseContext();
                    if (baseContext != null) {
                        eVar = (ActivityC0945e) baseContext;
                    } else {
                        throw new C89388w("null cannot be cast to non-null type");
                    }
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            } else {
                StringBuilder sb = new StringBuilder("can not convert ");
                View view4 = this.f136135a.itemView;
                C89219l.m154709a((Object) view4, "");
                throw new IllegalStateException(sb.append(view4.getContext()).append(" to activity.").toString());
            }
            C1182af viewModelStore = eVar.getViewModelStore();
            C89219l.m154709a((Object) viewModelStore, "");
            return viewModelStore;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewholder.MixFeedCell$m */
    public static final class C59746m extends AbstractC89220m implements AbstractC89171a<AbstractC1204m> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f136136a;

        static {
            Covode.recordClassIndex(70148);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59746m(PowerCell powerCell) {
            super(0);
            this.f136136a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC1204m invoke() {
            AbstractC1204m i = this.f136136a.mo28070i();
            if (i instanceof Fragment) {
                AbstractC1204m i2 = this.f136136a.mo28070i();
                if (i2 != null) {
                    return (Fragment) i2;
                }
                throw new C89388w("null cannot be cast to non-null type");
            } else if (i instanceof AbstractC12748a) {
                AbstractC1204m i3 = this.f136136a.mo28070i();
                if (i3 != null) {
                    Fragment a = C12777b.m22999a((AbstractC1204m) ((AbstractC12748a) i3));
                    if (a != null) {
                        return a;
                    }
                    throw new IllegalStateException("can not find fragment.");
                }
                throw new C89388w("null cannot be cast to non-null type");
            } else {
                throw new IllegalStateException("can not find fragment.");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewholder.MixFeedCell$n */
    public static final class C59747n extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f136137a;

        static {
            Covode.recordClassIndex(70149);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59747n(PowerCell powerCell) {
            super(0);
            this.f136137a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            Fragment a;
            C1182af viewModelStore;
            AbstractC1204m i = this.f136137a.mo28070i();
            if (i instanceof Fragment) {
                AbstractC1204m i2 = this.f136137a.mo28070i();
                if (i2 != null) {
                    a = (Fragment) i2;
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            } else if (i instanceof AbstractC12748a) {
                AbstractC1204m i3 = this.f136137a.mo28070i();
                if (i3 != null) {
                    a = C12777b.m22999a((AbstractC1204m) ((AbstractC12748a) i3));
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            } else {
                throw new IllegalStateException("can not find fragment.");
            }
            if (a != null && (viewModelStore = a.getViewModelStore()) != null) {
                return viewModelStore;
            }
            throw new IllegalStateException("can not get viewModelStore due to null fragment.");
        }
    }

    public MixFeedCell() {
        C12814b bVar;
        AbstractC12848i.C12849a aVar = AbstractC12848i.C12849a.f31275a;
        AbstractC89277c a = C89204ab.m154669a(MixVideosViewModel.class);
        C59734a aVar2 = new C59734a(a);
        C59740g gVar = C59740g.INSTANCE;
        if (C89219l.m154714a(aVar, AbstractC12848i.C12849a.f31275a)) {
            bVar = new C12814b(a, aVar2, C59741h.INSTANCE, new C59742i(this), new C59743j(this), C59744k.INSTANCE, gVar);
        } else if (C89219l.m154714a(aVar, AbstractC12848i.C12852d.f31278a)) {
            bVar = new C12814b(a, aVar2, C59745l.INSTANCE, new C59746m(this), new C59747n(this), C59735b.INSTANCE, gVar);
        } else if (aVar == null || C89219l.m154714a(aVar, AbstractC12848i.C12850b.f31276a)) {
            bVar = new C12814b(a, aVar2, C59736c.INSTANCE, new C59737d(this), new C59738e(this), new C59739f(this), gVar);
        } else {
            throw new IllegalArgumentException("Don't support this VMScope: " + aVar + " there");
        }
        this.f136128a = bVar;
        this.f136129b = C89250i.m154773a((AbstractC89171a) new C59748o(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewholder.MixFeedCell$p */
    static final class C59749p extends AbstractC89220m implements AbstractC89172b<C59857d, C89391z> {

        /* renamed from: a */
        final /* synthetic */ MixFeedCell f136139a;

        /* renamed from: b */
        final /* synthetic */ C59774b f136140b;

        static {
            Covode.recordClassIndex(70151);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59749p(MixFeedCell mixFeedCell, C59774b bVar) {
            super(1);
            this.f136139a = mixFeedCell;
            this.f136140b = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C59857d dVar) {
            C59857d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            C12776a<Aweme> aVar = dVar2.f136334b;
            if (aVar == null || aVar.f31085a == null || !C89219l.m154714a((Object) dVar2.f136334b.f31085a.getAid(), (Object) this.f136140b.f136162a)) {
                this.f136139a.mo97099b();
            } else {
                this.f136139a.mo97098a();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewholder.MixFeedCell$r */
    static final class View$OnClickListenerC59751r implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MixFeedCell f136142a;

        static {
            Covode.recordClassIndex(70153);
        }

        View$OnClickListenerC59751r(MixFeedCell mixFeedCell) {
            this.f136142a = mixFeedCell;
        }

        public final void onClick(View view) {
            Aweme aweme;
            ClickAgent.onClick(view);
            MixVideosViewModel c = this.f136142a.mo97218c();
            C59774b bVar = (C59774b) this.f136142a.f42160d;
            if (!(bVar == null || (aweme = bVar.f136166e) == null)) {
                c.mo20671d().mo20680a();
                c.mo20662a(new MixVideosViewModel.C59849x(c, aweme));
            }
            this.f136142a.mo97098a();
            MixVideosViewModel c2 = this.f136142a.mo97218c();
            c2.mo20667b(new MixVideosViewModel.C59850y(c2));
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final /* synthetic */ void mo23350a(C59774b bVar) {
        C59774b bVar2 = bVar;
        C89219l.m154721d(bVar2, "");
        MixVideosViewModel c = mo97218c();
        C59749p pVar = new C59749p(this, bVar2);
        C89219l.m154721d(c, "");
        C89219l.m154721d(pVar, "");
        AbstractC12846h.C12847a.m23091a(c, pVar);
        View view = this.itemView;
        C89219l.m154716b(view, "");
        C34577e.m70592a((RemoteImageView) view.findViewById(R.id.afs), bVar2.f136163b);
        String str = bVar2.f136164c;
        if (str == null || str.length() <= 0) {
            View view2 = this.itemView;
            C89219l.m154716b(view2, "");
            TuxTextView tuxTextView = (TuxTextView) view2.findViewById(R.id.ckt);
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setVisibility(8);
        } else {
            View view3 = this.itemView;
            C89219l.m154716b(view3, "");
            TuxTextView tuxTextView2 = (TuxTextView) view3.findViewById(R.id.ckt);
            C89219l.m154716b(tuxTextView2, "");
            tuxTextView2.setVisibility(0);
            View view4 = this.itemView;
            C89219l.m154716b(view4, "");
            TuxTextView tuxTextView3 = (TuxTextView) view4.findViewById(R.id.ckt);
            C89219l.m154716b(tuxTextView3, "");
            C17191a.C17192a aVar = new C17191a.C17192a();
            String str2 = bVar2.f136164c;
            if (str2 == null) {
                str2 = "";
            }
            tuxTextView3.setText(aVar.mo27177a(str2).f40973a);
        }
        View view5 = this.itemView;
        C89219l.m154716b(view5, "");
        TuxTextView tuxTextView4 = (TuxTextView) view5.findViewById(R.id.cku);
        C89219l.m154716b(tuxTextView4, "");
        Resources resources = C17867d.m33078a().getResources();
        AwemeStatistics statistics = bVar2.f136166e.getStatistics();
        C89219l.m154716b(statistics, "");
        tuxTextView4.setText(resources.getQuantityString(R.plurals.fd, (int) statistics.getPlayCount(), bVar2.f136165d));
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewholder.MixFeedCell$q */
    static final class C59750q extends AbstractC89220m implements AbstractC89183m<AbstractC22876d, C12776a<? extends Aweme>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ MixFeedCell f136141a;

        static {
            Covode.recordClassIndex(70152);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59750q(MixFeedCell mixFeedCell) {
            super(2);
            this.f136141a = mixFeedCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC22876d dVar, C12776a<? extends Aweme> aVar) {
            C12776a<? extends Aweme> aVar2 = aVar;
            C89219l.m154721d(dVar, "");
            String str = null;
            if (!(aVar2 == null || aVar2.f31085a == null)) {
                String aid = aVar2.f31085a.getAid();
                C59774b bVar = (C59774b) this.f136141a.f42160d;
                if (bVar != null) {
                    str = bVar.f136162a;
                }
                if (C89219l.m154714a((Object) aid, (Object) str)) {
                    this.f136141a.mo97098a();
                    return C89391z.f203057a;
                }
            }
            this.f136141a.mo97099b();
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: a */
    public final <S extends AbstractC12853j> void mo20508a(AssemViewModel<S> assemViewModel, C12854k<S> kVar, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89183m<? super AbstractC22876d, ? super S, C89391z> mVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC12846h.C12847a.m23092a(this, assemViewModel, kVar, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: b */
    public final <S extends AbstractC12853j, A> void mo20515b(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, C12854k<C12793o<A>> kVar2, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89183m<? super AbstractC22876d, ? super A, C89391z> mVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(mVar, "");
        AbstractC12846h.C12847a.m23097b(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: a */
    public final <S extends AbstractC12853j, A> void mo20509a(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, C12854k<C12793o<A>> kVar2, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89183m<? super AbstractC22876d, ? super A, C89391z> mVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(mVar, "");
        AbstractC12846h.C12847a.m23093a(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: a */
    public final <S extends AbstractC12853j, A, B> void mo20510a(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, C12854k<C12794p<A, B>> kVar3, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89187q<? super AbstractC22876d, ? super A, ? super B, C89391z> qVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(qVar, "");
        AbstractC12846h.C12847a.m23094a(this, assemViewModel, kVar, kVar2, kVar3, bVar, qVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: a */
    public final <S extends AbstractC12853j, A, B, C> void mo20511a(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, C12854k<C12795q<A, B, C>> kVar4, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89188r<? super AbstractC22876d, ? super A, ? super B, ? super C, C89391z> rVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(kVar4, "");
        C89219l.m154721d(rVar, "");
        AbstractC12846h.C12847a.m23095a(this, assemViewModel, kVar, kVar2, kVar3, kVar4, bVar, rVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: a */
    public final <S extends AbstractC12853j, A, B, C, D> void mo20512a(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, AbstractC89290k<S, ? extends D> kVar4, C12854k<C12796r<A, B, C, D>> kVar5, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89189s<? super AbstractC22876d, ? super A, ? super B, ? super C, ? super D, C89391z> sVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(kVar4, "");
        C89219l.m154721d(kVar5, "");
        C89219l.m154721d(sVar, "");
        AbstractC12846h.C12847a.m23096a(this, assemViewModel, kVar, kVar2, kVar3, kVar4, kVar5, bVar, sVar);
    }
}
