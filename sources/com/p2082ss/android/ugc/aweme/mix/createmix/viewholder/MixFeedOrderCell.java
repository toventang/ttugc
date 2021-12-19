package com.p2082ss.android.ugc.aweme.mix.createmix.viewholder;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1203l;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1182af;
import com.bytedance.assem.arch.core.AbstractC12748a;
import com.bytedance.assem.arch.extensions.C12777b;
import com.bytedance.assem.arch.viewModel.AbstractC12848i;
import com.bytedance.assem.arch.viewModel.C12814b;
import com.bytedance.assem.arch.viewModel.C12815c;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.C14518d;
import com.bytedance.ies.dmt.p1194ui.p1198d.C17191a;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.jedi.arch.AbstractC20362a;
import com.bytedance.jedi.arch.AbstractC20367ae;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.AbstractC20527q;
import com.bytedance.jedi.arch.AbstractC20534v;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20373ak;
import com.bytedance.jedi.arch.C20374al;
import com.bytedance.jedi.arch.C20375am;
import com.bytedance.jedi.arch.C20376an;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.p2082ss.android.ugc.aweme.mix.createmix.viewmodel.C59528a;
import com.p2082ss.android.ugc.aweme.mix.createmix.viewmodel.MixCreateViewModel;
import com.p2082ss.android.ugc.aweme.mix.mixdetail.AbstractC59733v;
import com.p2082ss.android.ugc.aweme.mix.mixdetail.AbstractC59861w;
import com.p2082ss.android.ugc.aweme.mix.mixdetail.viewholder.C59774b;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.p4565b.AbstractC88412b;
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

/* renamed from: com.ss.android.ugc.aweme.mix.createmix.viewholder.MixFeedOrderCell */
public final class MixFeedOrderCell extends PowerCell<C59774b> implements AbstractC20527q, AbstractC59861w {

    /* renamed from: a */
    private final C12814b f135792a;

    /* renamed from: b */
    private final AbstractC89244h f135793b;

    /* renamed from: j */
    private final C59506p f135794j;

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.viewholder.MixFeedOrderCell$g */
    public static final class C59497g extends AbstractC89220m implements AbstractC89172b<C59528a, C59528a> {
        public static final C59497g INSTANCE = new C59497g();

        static {
            Covode.recordClassIndex(69891);
        }

        public C59497g() {
            super(1);
        }

        public final C59528a invoke(C59528a aVar) {
            C89219l.m154719c(aVar, "");
            return aVar;
        }
    }

    static {
        Covode.recordClassIndex(69884);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.viewholder.MixFeedOrderCell$p */
    public static final class C59506p extends AbstractC1196i {
        static {
            Covode.recordClassIndex(69900);
        }

        @Override // androidx.lifecycle.AbstractC1196i
        /* renamed from: a */
        public final void mo4012a(AbstractC1203l lVar) {
            C89219l.m154721d(lVar, "");
        }

        @Override // androidx.lifecycle.AbstractC1196i
        /* renamed from: b */
        public final void mo4013b(AbstractC1203l lVar) {
            C89219l.m154721d(lVar, "");
        }

        C59506p() {
        }

        @Override // androidx.lifecycle.AbstractC1196i
        /* renamed from: a */
        public final AbstractC1196i.EnumC1199b mo4011a() {
            return AbstractC1196i.EnumC1199b.DESTROYED;
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20534v
    public final AbstractC1204m getLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20534v getLifecycleOwnerHolder() {
        return this;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public final /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20367ae<AbstractC20477i> getReceiverHolder() {
        return this;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: k */
    public final void mo28072k() {
        super.mo28072k();
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.viewholder.MixFeedOrderCell$b */
    public static final class C59492b extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C59492b INSTANCE = new C59492b();

        static {
            Covode.recordClassIndex(69886);
        }

        public C59492b() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.viewholder.MixFeedOrderCell$c */
    public static final class C59493c extends AbstractC89220m implements AbstractC89171a<C12874b<C59528a>> {
        public static final C59493c INSTANCE = new C59493c();

        static {
            Covode.recordClassIndex(69887);
        }

        public C59493c() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C59528a> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.viewholder.MixFeedOrderCell$h */
    public static final class C59498h extends AbstractC89220m implements AbstractC89171a<C12874b<C59528a>> {
        public static final C59498h INSTANCE = new C59498h();

        static {
            Covode.recordClassIndex(69892);
        }

        public C59498h() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C59528a> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.viewholder.MixFeedOrderCell$k */
    public static final class C59501k extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C59501k INSTANCE = new C59501k();

        static {
            Covode.recordClassIndex(69895);
        }

        public C59501k() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.viewholder.MixFeedOrderCell$l */
    public static final class C59502l extends AbstractC89220m implements AbstractC89171a<C12874b<C59528a>> {
        public static final C59502l INSTANCE = new C59502l();

        static {
            Covode.recordClassIndex(69896);
        }

        public C59502l() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C59528a> invoke() {
            return new C12874b<>();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.mix.mixdetail.AbstractC59861w
    /* renamed from: b */
    public final void mo97099b() {
        this.itemView.setBackgroundColor(0);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, androidx.lifecycle.AbstractC1204m
    public final AbstractC1196i getLifecycle() {
        AbstractC1196i lifecycle;
        AbstractC1204m i = mo28070i();
        if (i == null || (lifecycle = i.getLifecycle()) == null) {
            return this.f135794j;
        }
        return lifecycle;
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.viewholder.MixFeedOrderCell$a */
    public static final class C59491a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f135795a;

        static {
            Covode.recordClassIndex(69885);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59491a(AbstractC89277c cVar) {
            super(0);
            this.f135795a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f135795a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.viewholder.MixFeedOrderCell$o */
    static final class C59505o extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        final /* synthetic */ MixFeedOrderCell f135803a;

        static {
            Covode.recordClassIndex(69899);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59505o(MixFeedOrderCell mixFeedOrderCell) {
            super(0);
            this.f135803a = mixFeedOrderCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            View view = this.f135803a.itemView;
            C89219l.m154716b(view, "");
            return Integer.valueOf(view.getResources().getColor(R.color.k));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.mix.mixdetail.AbstractC59861w
    /* renamed from: a */
    public final void mo97098a() {
        this.itemView.setBackgroundColor(((Number) this.f135793b.getValue()).intValue());
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.viewholder.MixFeedOrderCell$d */
    public static final class C59494d extends AbstractC89220m implements AbstractC89171a<AbstractC12748a> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f135796a;

        static {
            Covode.recordClassIndex(69888);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59494d(PowerCell powerCell) {
            super(0);
            this.f135796a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC12748a invoke() {
            if (this.f135796a.mo28070i() instanceof AbstractC12748a) {
                AbstractC1204m i = this.f135796a.mo28070i();
                if (i != null) {
                    return (AbstractC12748a) i;
                }
                throw new C89388w("null cannot be cast to non-null type");
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.viewholder.MixFeedOrderCell$e */
    public static final class C59495e extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f135797a;

        static {
            Covode.recordClassIndex(69889);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59495e(PowerCell powerCell) {
            super(0);
            this.f135797a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            if (this.f135797a.mo28070i() instanceof AbstractC12748a) {
                AbstractC1204m i = this.f135797a.mo28070i();
                if (i != null) {
                    return ((AbstractC12748a) i).getViewModelStore();
                }
                throw new C89388w("null cannot be cast to non-null type");
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.viewholder.MixFeedOrderCell$f */
    public static final class C59496f extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f135798a;

        static {
            Covode.recordClassIndex(69890);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59496f(PowerCell powerCell) {
            super(0);
            this.f135798a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            if (this.f135798a.mo28070i() instanceof AbstractC12748a) {
                AbstractC1204m i = this.f135798a.mo28070i();
                if (i != null) {
                    return ((AbstractC12748a) i).mo20598q();
                }
                throw new C89388w("null cannot be cast to non-null type");
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.viewholder.MixFeedOrderCell$i */
    public static final class C59499i extends AbstractC89220m implements AbstractC89171a<AbstractC1204m> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f135799a;

        static {
            Covode.recordClassIndex(69893);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59499i(PowerCell powerCell) {
            super(0);
            this.f135799a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC1204m invoke() {
            View view = this.f135799a.itemView;
            C89219l.m154709a((Object) view, "");
            Context context = view.getContext();
            if (context instanceof ActivityC0945e) {
                View view2 = this.f135799a.itemView;
                C89219l.m154709a((Object) view2, "");
                Context context2 = view2.getContext();
                if (context2 != null) {
                    return (ActivityC0945e) context2;
                }
                throw new C89388w("null cannot be cast to non-null type");
            } else if (context instanceof ContextWrapper) {
                View view3 = this.f135799a.itemView;
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
                View view4 = this.f135799a.itemView;
                C89219l.m154709a((Object) view4, "");
                throw new IllegalStateException(sb.append(view4.getContext()).append(" to activity.").toString());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.viewholder.MixFeedOrderCell$j */
    public static final class C59500j extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f135800a;

        static {
            Covode.recordClassIndex(69894);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59500j(PowerCell powerCell) {
            super(0);
            this.f135800a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e eVar;
            View view = this.f135800a.itemView;
            C89219l.m154709a((Object) view, "");
            Context context = view.getContext();
            if (context instanceof ActivityC0945e) {
                View view2 = this.f135800a.itemView;
                C89219l.m154709a((Object) view2, "");
                Context context2 = view2.getContext();
                if (context2 != null) {
                    eVar = (ActivityC0945e) context2;
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            } else if (context instanceof ContextThemeWrapper) {
                View view3 = this.f135800a.itemView;
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
                View view4 = this.f135800a.itemView;
                C89219l.m154709a((Object) view4, "");
                throw new IllegalStateException(sb.append(view4.getContext()).append(" to activity.").toString());
            }
            C1182af viewModelStore = eVar.getViewModelStore();
            C89219l.m154709a((Object) viewModelStore, "");
            return viewModelStore;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.viewholder.MixFeedOrderCell$m */
    public static final class C59503m extends AbstractC89220m implements AbstractC89171a<AbstractC1204m> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f135801a;

        static {
            Covode.recordClassIndex(69897);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59503m(PowerCell powerCell) {
            super(0);
            this.f135801a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC1204m invoke() {
            AbstractC1204m i = this.f135801a.mo28070i();
            if (i instanceof Fragment) {
                AbstractC1204m i2 = this.f135801a.mo28070i();
                if (i2 != null) {
                    return (Fragment) i2;
                }
                throw new C89388w("null cannot be cast to non-null type");
            } else if (i instanceof AbstractC12748a) {
                AbstractC1204m i3 = this.f135801a.mo28070i();
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

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.viewholder.MixFeedOrderCell$n */
    public static final class C59504n extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f135802a;

        static {
            Covode.recordClassIndex(69898);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59504n(PowerCell powerCell) {
            super(0);
            this.f135802a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            Fragment a;
            C1182af viewModelStore;
            AbstractC1204m i = this.f135802a.mo28070i();
            if (i instanceof Fragment) {
                AbstractC1204m i2 = this.f135802a.mo28070i();
                if (i2 != null) {
                    a = (Fragment) i2;
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            } else if (i instanceof AbstractC12748a) {
                AbstractC1204m i3 = this.f135802a.mo28070i();
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

    public MixFeedOrderCell() {
        C12814b bVar;
        AbstractC12848i.C12849a aVar = AbstractC12848i.C12849a.f31275a;
        AbstractC89277c a = C89204ab.m154669a(MixCreateViewModel.class);
        C59491a aVar2 = new C59491a(a);
        C59497g gVar = C59497g.INSTANCE;
        if (C89219l.m154714a(aVar, AbstractC12848i.C12849a.f31275a)) {
            bVar = new C12814b(a, aVar2, C59498h.INSTANCE, new C59499i(this), new C59500j(this), C59501k.INSTANCE, gVar);
        } else if (C89219l.m154714a(aVar, AbstractC12848i.C12852d.f31278a)) {
            bVar = new C12814b(a, aVar2, C59502l.INSTANCE, new C59503m(this), new C59504n(this), C59492b.INSTANCE, gVar);
        } else if (aVar == null || C89219l.m154714a(aVar, AbstractC12848i.C12850b.f31276a)) {
            bVar = new C12814b(a, aVar2, C59493c.INSTANCE, new C59494d(this), new C59495e(this), new C59496f(this), gVar);
        } else {
            throw new IllegalArgumentException("Don't support this VMScope: " + aVar + " there");
        }
        this.f135792a = bVar;
        this.f135793b = C89250i.m154773a((AbstractC89171a) new C59505o(this));
        this.f135794j = new C59506p();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final View mo23349a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        return mo28064a(viewGroup, R.layout.akq);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final /* synthetic */ void mo23350a(C59774b bVar) {
        UrlModel urlModel;
        C59774b bVar2 = bVar;
        C89219l.m154721d(bVar2, "");
        View view = this.itemView;
        C89219l.m154716b(view, "");
        RemoteImageView remoteImageView = (RemoteImageView) view.findViewById(R.id.afs);
        C59774b bVar3 = (C59774b) this.f42160d;
        if (bVar3 != null) {
            urlModel = bVar3.f136163b;
        } else {
            urlModel = null;
        }
        C34577e.m70592a(remoteImageView, urlModel);
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
        View view6 = this.itemView;
        C89219l.m154716b(view6, "");
        ImageView imageView = (ImageView) view6.findViewById(R.id.bx0);
        C89219l.m154716b(imageView, "");
        imageView.setVisibility(0);
        View view7 = this.itemView;
        C89219l.m154716b(view7, "");
        ((ImageView) view7.findViewById(R.id.bx0)).setOnTouchListener(new View$OnTouchListenerC59507q(this));
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20527q.C20528a.m38714a(vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.viewholder.MixFeedOrderCell$q */
    static final class View$OnTouchListenerC59507q implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ MixFeedOrderCell f135804a;

        static {
            Covode.recordClassIndex(69901);
        }

        View$OnTouchListenerC59507q(MixFeedOrderCell mixFeedOrderCell) {
            this.f135804a = mixFeedOrderCell;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            C89219l.m154716b(motionEvent, "");
            if (motionEvent.getActionMasked() != 0) {
                return false;
            }
            ((AbstractC59733v) C14518d.m26527b(this.f135804a, C89204ab.m154669a(AbstractC59733v.class))).mo97093a(this.f135804a);
            return false;
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20527q.C20528a.m38708a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20527q.C20528a.m38709a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, C20370ah<C20374al<A, B>> ahVar, AbstractC89187q<? super AbstractC20477i, ? super A, ? super B, C89391z> qVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(qVar, "");
        return AbstractC20527q.C20528a.m38711a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, T> AbstractC88412b asyncSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends AbstractC20362a<? extends T>> kVar, C20370ah<C20373ak<AbstractC20362a<T>>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super Throwable, C89391z> mVar, AbstractC89172b<? super AbstractC20477i, C89391z> bVar, AbstractC89183m<? super AbstractC20477i, ? super T, C89391z> mVar2) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        return AbstractC20527q.C20528a.m38710a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B, C> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, C20370ah<C20375am<A, B, C>> ahVar, AbstractC89188r<? super AbstractC20477i, ? super A, ? super B, ? super C, C89391z> rVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(rVar, "");
        return AbstractC20527q.C20528a.m38712a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B, C, D> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, AbstractC89290k<S, ? extends D> kVar4, C20370ah<C20376an<A, B, C, D>> ahVar, AbstractC89189s<? super AbstractC20477i, ? super A, ? super B, ? super C, ? super D, C89391z> sVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(kVar4, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(sVar, "");
        return AbstractC20527q.C20528a.m38713a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
