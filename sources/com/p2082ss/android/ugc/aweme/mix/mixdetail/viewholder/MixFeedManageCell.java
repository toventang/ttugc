package com.p2082ss.android.ugc.aweme.mix.mixdetail.viewholder;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1182af;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.assem.arch.core.AbstractC12748a;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.extensions.C12777b;
import com.bytedance.assem.arch.extensions.C12793o;
import com.bytedance.assem.arch.extensions.C12794p;
import com.bytedance.assem.arch.extensions.C12795q;
import com.bytedance.assem.arch.extensions.C12796r;
import com.bytedance.assem.arch.viewModel.AbstractC12846h;
import com.bytedance.assem.arch.viewModel.AbstractC12848i;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.C12814b;
import com.bytedance.assem.arch.viewModel.C12815c;
import com.bytedance.assem.arch.viewModel.C12854k;
import com.bytedance.assem.arch.viewModel.C12856l;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.p1198d.C17191a;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.tiktok.proxy.AbstractC22876d;
import com.bytedance.tiktok.proxy.AbstractC22878f;
import com.bytedance.tiktok.proxy.AbstractC22880h;
import com.bytedance.tux.input.TuxCheckBox;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.p2082ss.android.ugc.aweme.mix.mixdetail.AbstractC59861w;
import com.p2082ss.android.ugc.aweme.mix.mixdetail.viewmodel.C59853a;
import com.p2082ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosManageViewModel;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
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

/* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewholder.MixFeedManageCell */
public final class MixFeedManageCell extends PowerCell<C59774b> implements AbstractC12846h, AbstractC59861w {

    /* renamed from: a */
    final AbstractC89244h f136143a;

    /* renamed from: b */
    public boolean f136144b;

    /* renamed from: j */
    private final C12814b f136145j;

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewholder.MixFeedManageCell$g */
    public static final class C59758g extends AbstractC89220m implements AbstractC89172b<C59853a, C59853a> {
        public static final C59758g INSTANCE = new C59758g();

        static {
            Covode.recordClassIndex(70161);
        }

        public C59758g() {
            super(1);
        }

        public final C59853a invoke(C59853a aVar) {
            C89219l.m154719c(aVar, "");
            return aVar;
        }
    }

    static {
        Covode.recordClassIndex(70154);
    }

    /* renamed from: c */
    public final MixVideosManageViewModel mo97221c() {
        return (MixVideosManageViewModel) this.f136145j.getValue();
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

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewholder.MixFeedManageCell$b */
    public static final class C59753b extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C59753b INSTANCE = new C59753b();

        static {
            Covode.recordClassIndex(70156);
        }

        public C59753b() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewholder.MixFeedManageCell$c */
    public static final class C59754c extends AbstractC89220m implements AbstractC89171a<C12874b<C59853a>> {
        public static final C59754c INSTANCE = new C59754c();

        static {
            Covode.recordClassIndex(70157);
        }

        public C59754c() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C59853a> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewholder.MixFeedManageCell$h */
    public static final class C59759h extends AbstractC89220m implements AbstractC89171a<C12874b<C59853a>> {
        public static final C59759h INSTANCE = new C59759h();

        static {
            Covode.recordClassIndex(70162);
        }

        public C59759h() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C59853a> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewholder.MixFeedManageCell$k */
    public static final class C59762k extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C59762k INSTANCE = new C59762k();

        static {
            Covode.recordClassIndex(70165);
        }

        public C59762k() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewholder.MixFeedManageCell$l */
    public static final class C59763l extends AbstractC89220m implements AbstractC89171a<C12874b<C59853a>> {
        public static final C59763l INSTANCE = new C59763l();

        static {
            Covode.recordClassIndex(70166);
        }

        public C59763l() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C59853a> invoke() {
            return new C12874b<>();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.mix.mixdetail.AbstractC59861w
    /* renamed from: b */
    public final void mo97099b() {
        this.itemView.setBackgroundColor(0);
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewholder.MixFeedManageCell$q */
    static final class RunnableC59769q implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MixFeedManageCell f136157a;

        static {
            Covode.recordClassIndex(70172);
        }

        RunnableC59769q(MixFeedManageCell mixFeedManageCell) {
            this.f136157a = mixFeedManageCell;
        }

        public final void run() {
            this.f136157a.mo97099b();
            this.f136157a.f136144b = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewholder.MixFeedManageCell$a */
    public static final class C59752a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f136146a;

        static {
            Covode.recordClassIndex(70155);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59752a(AbstractC89277c cVar) {
            super(0);
            this.f136146a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f136146a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewholder.MixFeedManageCell$o */
    static final class C59766o extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        final /* synthetic */ MixFeedManageCell f136154a;

        static {
            Covode.recordClassIndex(70169);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59766o(MixFeedManageCell mixFeedManageCell) {
            super(0);
            this.f136154a = mixFeedManageCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            View view = this.f136154a.itemView;
            C89219l.m154716b(view, "");
            return Integer.valueOf(view.getResources().getColor(R.color.j));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: k */
    public final void mo28072k() {
        MixVideosManageViewModel c;
        super.mo28072k();
        mo20510a(c, C59775c.f136167a, C59776d.f136168a, C12856l.m23102a(mo97221c().f31149c), null, new C59770r(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewholder.MixFeedManageCell$d */
    public static final class C59755d extends AbstractC89220m implements AbstractC89171a<AbstractC12748a> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f136147a;

        static {
            Covode.recordClassIndex(70158);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59755d(PowerCell powerCell) {
            super(0);
            this.f136147a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC12748a invoke() {
            if (this.f136147a.mo28070i() instanceof AbstractC12748a) {
                AbstractC1204m i = this.f136147a.mo28070i();
                if (i != null) {
                    return (AbstractC12748a) i;
                }
                throw new C89388w("null cannot be cast to non-null type");
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewholder.MixFeedManageCell$e */
    public static final class C59756e extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f136148a;

        static {
            Covode.recordClassIndex(70159);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59756e(PowerCell powerCell) {
            super(0);
            this.f136148a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            if (this.f136148a.mo28070i() instanceof AbstractC12748a) {
                AbstractC1204m i = this.f136148a.mo28070i();
                if (i != null) {
                    return ((AbstractC12748a) i).getViewModelStore();
                }
                throw new C89388w("null cannot be cast to non-null type");
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewholder.MixFeedManageCell$f */
    public static final class C59757f extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f136149a;

        static {
            Covode.recordClassIndex(70160);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59757f(PowerCell powerCell) {
            super(0);
            this.f136149a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            if (this.f136149a.mo28070i() instanceof AbstractC12748a) {
                AbstractC1204m i = this.f136149a.mo28070i();
                if (i != null) {
                    return ((AbstractC12748a) i).mo20598q();
                }
                throw new C89388w("null cannot be cast to non-null type");
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.mix.mixdetail.AbstractC59861w
    /* renamed from: a */
    public final void mo97098a() {
        View view = this.itemView;
        View view2 = this.itemView;
        C89219l.m154716b(view2, "");
        view.setBackgroundColor(view2.getResources().getColor(R.color.k));
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewholder.MixFeedManageCell$i */
    public static final class C59760i extends AbstractC89220m implements AbstractC89171a<AbstractC1204m> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f136150a;

        static {
            Covode.recordClassIndex(70163);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59760i(PowerCell powerCell) {
            super(0);
            this.f136150a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC1204m invoke() {
            View view = this.f136150a.itemView;
            C89219l.m154709a((Object) view, "");
            Context context = view.getContext();
            if (context instanceof ActivityC0945e) {
                View view2 = this.f136150a.itemView;
                C89219l.m154709a((Object) view2, "");
                Context context2 = view2.getContext();
                if (context2 != null) {
                    return (ActivityC0945e) context2;
                }
                throw new C89388w("null cannot be cast to non-null type");
            } else if (context instanceof ContextWrapper) {
                View view3 = this.f136150a.itemView;
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
                View view4 = this.f136150a.itemView;
                C89219l.m154709a((Object) view4, "");
                throw new IllegalStateException(sb.append(view4.getContext()).append(" to activity.").toString());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewholder.MixFeedManageCell$j */
    public static final class C59761j extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f136151a;

        static {
            Covode.recordClassIndex(70164);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59761j(PowerCell powerCell) {
            super(0);
            this.f136151a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e eVar;
            View view = this.f136151a.itemView;
            C89219l.m154709a((Object) view, "");
            Context context = view.getContext();
            if (context instanceof ActivityC0945e) {
                View view2 = this.f136151a.itemView;
                C89219l.m154709a((Object) view2, "");
                Context context2 = view2.getContext();
                if (context2 != null) {
                    eVar = (ActivityC0945e) context2;
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            } else if (context instanceof ContextThemeWrapper) {
                View view3 = this.f136151a.itemView;
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
                View view4 = this.f136151a.itemView;
                C89219l.m154709a((Object) view4, "");
                throw new IllegalStateException(sb.append(view4.getContext()).append(" to activity.").toString());
            }
            C1182af viewModelStore = eVar.getViewModelStore();
            C89219l.m154709a((Object) viewModelStore, "");
            return viewModelStore;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewholder.MixFeedManageCell$m */
    public static final class C59764m extends AbstractC89220m implements AbstractC89171a<AbstractC1204m> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f136152a;

        static {
            Covode.recordClassIndex(70167);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59764m(PowerCell powerCell) {
            super(0);
            this.f136152a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC1204m invoke() {
            AbstractC1204m i = this.f136152a.mo28070i();
            if (i instanceof Fragment) {
                AbstractC1204m i2 = this.f136152a.mo28070i();
                if (i2 != null) {
                    return (Fragment) i2;
                }
                throw new C89388w("null cannot be cast to non-null type");
            } else if (i instanceof AbstractC12748a) {
                AbstractC1204m i3 = this.f136152a.mo28070i();
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

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewholder.MixFeedManageCell$n */
    public static final class C59765n extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f136153a;

        static {
            Covode.recordClassIndex(70168);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59765n(PowerCell powerCell) {
            super(0);
            this.f136153a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            Fragment a;
            C1182af viewModelStore;
            AbstractC1204m i = this.f136153a.mo28070i();
            if (i instanceof Fragment) {
                AbstractC1204m i2 = this.f136153a.mo28070i();
                if (i2 != null) {
                    a = (Fragment) i2;
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            } else if (i instanceof AbstractC12748a) {
                AbstractC1204m i3 = this.f136153a.mo28070i();
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

    public MixFeedManageCell() {
        C12814b bVar;
        AbstractC12848i.C12849a aVar = AbstractC12848i.C12849a.f31275a;
        AbstractC89277c a = C89204ab.m154669a(MixVideosManageViewModel.class);
        C59752a aVar2 = new C59752a(a);
        C59758g gVar = C59758g.INSTANCE;
        if (C89219l.m154714a(aVar, AbstractC12848i.C12849a.f31275a)) {
            bVar = new C12814b(a, aVar2, C59759h.INSTANCE, new C59760i(this), new C59761j(this), C59762k.INSTANCE, gVar);
        } else if (C89219l.m154714a(aVar, AbstractC12848i.C12852d.f31278a)) {
            bVar = new C12814b(a, aVar2, C59763l.INSTANCE, new C59764m(this), new C59765n(this), C59753b.INSTANCE, gVar);
        } else if (aVar == null || C89219l.m154714a(aVar, AbstractC12848i.C12850b.f31276a)) {
            bVar = new C12814b(a, aVar2, C59754c.INSTANCE, new C59755d(this), new C59756e(this), new C59757f(this), gVar);
        } else {
            throw new IllegalArgumentException("Don't support this VMScope: " + aVar + " there");
        }
        this.f136145j = bVar;
        this.f136143a = C89250i.m154773a((AbstractC89171a) new C59766o(this));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final View mo23349a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        return mo28064a(viewGroup, R.layout.akr);
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewholder.MixFeedManageCell$p */
    static final class C59767p extends AbstractC89220m implements AbstractC89172b<C59853a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ MixFeedManageCell f136155a;

        static {
            Covode.recordClassIndex(70170);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59767p(MixFeedManageCell mixFeedManageCell) {
            super(1);
            this.f136155a = mixFeedManageCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0095, code lost:
            if (r1 == null) goto L_0x0097;
         */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ p4600h.C89391z invoke(com.p2082ss.android.ugc.aweme.mix.mixdetail.viewmodel.C59853a r8) {
            /*
            // Method dump skipped, instructions count: 181
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.mix.mixdetail.viewholder.MixFeedManageCell.C59767p.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final /* synthetic */ void mo23350a(C59774b bVar) {
        C59774b bVar2 = bVar;
        C89219l.m154721d(bVar2, "");
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
        m109262a(mo97221c(), new C59767p(this));
    }

    /* renamed from: a */
    public static <VM1 extends AssemViewModel<S1>, S1 extends AbstractC12853j, R> R m109262a(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC12846h.C12847a.m23091a(vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewholder.MixFeedManageCell$r */
    static final class C59770r extends AbstractC89220m implements AbstractC89187q<AbstractC22876d, C12776a<? extends Boolean>, List<? extends Aweme>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ MixFeedManageCell f136158a;

        static {
            Covode.recordClassIndex(70173);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59770r(MixFeedManageCell mixFeedManageCell) {
            super(3);
            this.f136158a = mixFeedManageCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(AbstractC22876d dVar, C12776a<? extends Boolean> aVar, List<? extends Aweme> list) {
            C12776a<? extends Boolean> aVar2 = aVar;
            List<? extends Aweme> list2 = list;
            C89219l.m154721d(dVar, "");
            C89219l.m154721d(aVar2, "");
            if (!aVar2.f31085a.booleanValue()) {
                View view = this.f136158a.itemView;
                C89219l.m154716b(view, "");
                TuxCheckBox tuxCheckBox = (TuxCheckBox) view.findViewById(R.id.bgr);
                C89219l.m154716b(tuxCheckBox, "");
                tuxCheckBox.setVisibility(0);
                MixFeedManageCell.m109262a(this.f136158a.mo97221c(), new AbstractC89172b<C59853a, C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.mix.mixdetail.viewholder.MixFeedManageCell.C59770r.C597711 */

                    /* renamed from: a */
                    final /* synthetic */ C59770r f136159a;

                    static {
                        Covode.recordClassIndex(70174);
                    }

                    {
                        this.f136159a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0035, code lost:
                        if (r1 == null) goto L_0x0037;
                     */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final /* synthetic */ p4600h.C89391z invoke(com.p2082ss.android.ugc.aweme.mix.mixdetail.viewmodel.C59853a r7) {
                        /*
                        // Method dump skipped, instructions count: 117
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.mix.mixdetail.viewholder.MixFeedManageCell.C59770r.C597711.invoke(java.lang.Object):java.lang.Object");
                    }
                });
            } else {
                View view2 = this.f136158a.itemView;
                C89219l.m154716b(view2, "");
                TuxCheckBox tuxCheckBox2 = (TuxCheckBox) view2.findViewById(R.id.bgr);
                C89219l.m154716b(tuxCheckBox2, "");
                tuxCheckBox2.setVisibility(8);
                View view3 = this.f136158a.itemView;
                C89219l.m154716b(view3, "");
                ImageView imageView = (ImageView) view3.findViewById(R.id.bx0);
                C89219l.m154716b(imageView, "");
                imageView.setVisibility(0);
            }
            String str = null;
            if (list2 != null) {
                ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().getAid());
                }
                ArrayList arrayList2 = arrayList;
                if (arrayList2 != null) {
                    C59774b bVar = (C59774b) this.f136158a.f42160d;
                    if (bVar != null) {
                        str = bVar.f136162a;
                    }
                    if (arrayList2.contains(str) && !this.f136158a.f136144b) {
                        this.f136158a.f136144b = true;
                        MixFeedManageCell mixFeedManageCell = this.f136158a;
                        mixFeedManageCell.itemView.setBackgroundColor(((Number) mixFeedManageCell.f136143a.getValue()).intValue());
                        mixFeedManageCell.itemView.postDelayed(new RunnableC59769q(mixFeedManageCell), InteractFirstFrameTimeOutDurationSetting.DEFAULT);
                    }
                }
            }
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
