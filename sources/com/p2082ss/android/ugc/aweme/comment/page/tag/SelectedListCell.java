package com.p2082ss.android.ugc.aweme.comment.page.tag;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1182af;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.AbstractC12748a;
import com.bytedance.assem.arch.extensions.C12777b;
import com.bytedance.assem.arch.viewModel.AbstractC12848i;
import com.bytedance.assem.arch.viewModel.C12814b;
import com.bytedance.assem.arch.viewModel.C12815c;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.comment.page.tag.viewmodel.C36943d;
import com.p2082ss.android.ugc.aweme.comment.page.tag.viewmodel.VideoTagFriendsListViewModel;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89388w;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.comment.page.tag.SelectedListCell */
public final class SelectedListCell extends PowerCell<C36890g> {

    /* renamed from: a */
    private final C12814b f86616a;

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.SelectedListCell$g */
    public static final class C36631g extends AbstractC89220m implements AbstractC89172b<C36943d, C36943d> {
        public static final C36631g INSTANCE = new C36631g();

        static {
            Covode.recordClassIndex(43967);
        }

        public C36631g() {
            super(1);
        }

        public final C36943d invoke(C36943d dVar) {
            C89219l.m154719c(dVar, "");
            return dVar;
        }
    }

    static {
        Covode.recordClassIndex(43960);
    }

    /* renamed from: a */
    public final VideoTagFriendsListViewModel mo64293a() {
        return (VideoTagFriendsListViewModel) this.f86616a.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.SelectedListCell$b */
    public static final class C36626b extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C36626b INSTANCE = new C36626b();

        static {
            Covode.recordClassIndex(43962);
        }

        public C36626b() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.SelectedListCell$c */
    public static final class C36627c extends AbstractC89220m implements AbstractC89171a<C12874b<C36943d>> {
        public static final C36627c INSTANCE = new C36627c();

        static {
            Covode.recordClassIndex(43963);
        }

        public C36627c() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C36943d> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.SelectedListCell$h */
    public static final class C36632h extends AbstractC89220m implements AbstractC89171a<C12874b<C36943d>> {
        public static final C36632h INSTANCE = new C36632h();

        static {
            Covode.recordClassIndex(43968);
        }

        public C36632h() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C36943d> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.SelectedListCell$k */
    public static final class C36635k extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C36635k INSTANCE = new C36635k();

        static {
            Covode.recordClassIndex(43971);
        }

        public C36635k() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.SelectedListCell$l */
    public static final class C36636l extends AbstractC89220m implements AbstractC89171a<C12874b<C36943d>> {
        public static final C36636l INSTANCE = new C36636l();

        static {
            Covode.recordClassIndex(43972);
        }

        public C36636l() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C36943d> invoke() {
            return new C12874b<>();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: k */
    public final void mo28072k() {
        this.itemView.setOnClickListener(new View$OnClickListenerC36639o(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.SelectedListCell$a */
    public static final class C36625a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f86617a;

        static {
            Covode.recordClassIndex(43961);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36625a(AbstractC89277c cVar) {
            super(0);
            this.f86617a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f86617a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.SelectedListCell$d */
    public static final class C36628d extends AbstractC89220m implements AbstractC89171a<AbstractC12748a> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f86618a;

        static {
            Covode.recordClassIndex(43964);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36628d(PowerCell powerCell) {
            super(0);
            this.f86618a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC12748a invoke() {
            if (this.f86618a.mo28070i() instanceof AbstractC12748a) {
                AbstractC1204m i = this.f86618a.mo28070i();
                if (i != null) {
                    return (AbstractC12748a) i;
                }
                throw new C89388w("null cannot be cast to non-null type");
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.SelectedListCell$e */
    public static final class C36629e extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f86619a;

        static {
            Covode.recordClassIndex(43965);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36629e(PowerCell powerCell) {
            super(0);
            this.f86619a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            if (this.f86619a.mo28070i() instanceof AbstractC12748a) {
                AbstractC1204m i = this.f86619a.mo28070i();
                if (i != null) {
                    return ((AbstractC12748a) i).getViewModelStore();
                }
                throw new C89388w("null cannot be cast to non-null type");
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.SelectedListCell$f */
    public static final class C36630f extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f86620a;

        static {
            Covode.recordClassIndex(43966);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36630f(PowerCell powerCell) {
            super(0);
            this.f86620a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            if (this.f86620a.mo28070i() instanceof AbstractC12748a) {
                AbstractC1204m i = this.f86620a.mo28070i();
                if (i != null) {
                    return ((AbstractC12748a) i).mo20598q();
                }
                throw new C89388w("null cannot be cast to non-null type");
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.SelectedListCell$i */
    public static final class C36633i extends AbstractC89220m implements AbstractC89171a<AbstractC1204m> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f86621a;

        static {
            Covode.recordClassIndex(43969);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36633i(PowerCell powerCell) {
            super(0);
            this.f86621a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC1204m invoke() {
            View view = this.f86621a.itemView;
            C89219l.m154709a((Object) view, "");
            Context context = view.getContext();
            if (context instanceof ActivityC0945e) {
                View view2 = this.f86621a.itemView;
                C89219l.m154709a((Object) view2, "");
                Context context2 = view2.getContext();
                if (context2 != null) {
                    return (ActivityC0945e) context2;
                }
                throw new C89388w("null cannot be cast to non-null type");
            } else if (context instanceof ContextWrapper) {
                View view3 = this.f86621a.itemView;
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
                View view4 = this.f86621a.itemView;
                C89219l.m154709a((Object) view4, "");
                throw new IllegalStateException(sb.append(view4.getContext()).append(" to activity.").toString());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.SelectedListCell$j */
    public static final class C36634j extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f86622a;

        static {
            Covode.recordClassIndex(43970);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36634j(PowerCell powerCell) {
            super(0);
            this.f86622a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e eVar;
            View view = this.f86622a.itemView;
            C89219l.m154709a((Object) view, "");
            Context context = view.getContext();
            if (context instanceof ActivityC0945e) {
                View view2 = this.f86622a.itemView;
                C89219l.m154709a((Object) view2, "");
                Context context2 = view2.getContext();
                if (context2 != null) {
                    eVar = (ActivityC0945e) context2;
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            } else if (context instanceof ContextThemeWrapper) {
                View view3 = this.f86622a.itemView;
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
                View view4 = this.f86622a.itemView;
                C89219l.m154709a((Object) view4, "");
                throw new IllegalStateException(sb.append(view4.getContext()).append(" to activity.").toString());
            }
            C1182af viewModelStore = eVar.getViewModelStore();
            C89219l.m154709a((Object) viewModelStore, "");
            return viewModelStore;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.SelectedListCell$m */
    public static final class C36637m extends AbstractC89220m implements AbstractC89171a<AbstractC1204m> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f86623a;

        static {
            Covode.recordClassIndex(43973);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36637m(PowerCell powerCell) {
            super(0);
            this.f86623a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC1204m invoke() {
            AbstractC1204m i = this.f86623a.mo28070i();
            if (i instanceof Fragment) {
                AbstractC1204m i2 = this.f86623a.mo28070i();
                if (i2 != null) {
                    return (Fragment) i2;
                }
                throw new C89388w("null cannot be cast to non-null type");
            } else if (i instanceof AbstractC12748a) {
                AbstractC1204m i3 = this.f86623a.mo28070i();
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

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.SelectedListCell$n */
    public static final class C36638n extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f86624a;

        static {
            Covode.recordClassIndex(43974);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36638n(PowerCell powerCell) {
            super(0);
            this.f86624a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            Fragment a;
            C1182af viewModelStore;
            AbstractC1204m i = this.f86624a.mo28070i();
            if (i instanceof Fragment) {
                AbstractC1204m i2 = this.f86624a.mo28070i();
                if (i2 != null) {
                    a = (Fragment) i2;
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            } else if (i instanceof AbstractC12748a) {
                AbstractC1204m i3 = this.f86624a.mo28070i();
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

    public SelectedListCell() {
        C12814b bVar;
        AbstractC12848i.C12852d dVar = AbstractC12848i.C12852d.f31278a;
        AbstractC89277c a = C89204ab.m154669a(VideoTagFriendsListViewModel.class);
        C36625a aVar = new C36625a(a);
        C36631g gVar = C36631g.INSTANCE;
        if (C89219l.m154714a(dVar, AbstractC12848i.C12849a.f31275a)) {
            bVar = new C12814b(a, aVar, C36632h.INSTANCE, new C36633i(this), new C36634j(this), C36635k.INSTANCE, gVar);
        } else if (C89219l.m154714a(dVar, AbstractC12848i.C12852d.f31278a)) {
            bVar = new C12814b(a, aVar, C36636l.INSTANCE, new C36637m(this), new C36638n(this), C36626b.INSTANCE, gVar);
        } else if (dVar == null || C89219l.m154714a(dVar, AbstractC12848i.C12850b.f31276a)) {
            bVar = new C12814b(a, aVar, C36627c.INSTANCE, new C36628d(this), new C36629e(this), new C36630f(this), gVar);
        } else {
            throw new IllegalArgumentException("Don't support this VMScope: " + dVar + " there");
        }
        this.f86616a = bVar;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final View mo23349a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.j3, viewGroup, false);
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.SelectedListCell$o */
    static final class View$OnClickListenerC36639o implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SelectedListCell f86625a;

        static {
            Covode.recordClassIndex(43975);
        }

        View$OnClickListenerC36639o(SelectedListCell selectedListCell) {
            this.f86625a = selectedListCell;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C36890g gVar = (C36890g) this.f86625a.f42160d;
            if (gVar != null) {
                this.f86625a.mo64293a().mo64384a(gVar.f86884a, false);
                this.f86625a.mo64293a().mo64383a(gVar.f86884a, "remove");
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final /* synthetic */ void mo23350a(C36890g gVar) {
        C36890g gVar2 = gVar;
        C89219l.m154721d(gVar2, "");
        View view = this.itemView;
        C34577e.m70592a((RemoteImageView) view.findViewById(R.id.ob), gVar2.f86884a.getDisplayAvatar());
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.ef4);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(mo64293a().mo64382a(gVar2.f86884a));
    }
}
