package com.p2082ss.android.ugc.aweme.comment.page.tag;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
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
import com.bytedance.router.OnActivityResultCallback;
import com.p2082ss.android.ugc.aweme.comment.CommentServiceImpl;
import com.p2082ss.android.ugc.aweme.comment.page.tag.viewmodel.C36945f;
import com.p2082ss.android.ugc.aweme.comment.page.tag.viewmodel.FeedTaggedListViewModel;
import com.p2082ss.android.ugc.aweme.comment.services.CommentService;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.p2082ss.android.ugc.aweme.feed.model.InteractionTagInfo;
import com.p2082ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.C89388w;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.comment.page.tag.FeedTaggedEditCell */
public final class FeedTaggedEditCell extends PowerCell<C36863c> {

    /* renamed from: a */
    private final C12814b f86571a;

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.FeedTaggedEditCell$g */
    public static final class C36590g extends AbstractC89220m implements AbstractC89172b<C36945f, C36945f> {
        public static final C36590g INSTANCE = new C36590g();

        static {
            Covode.recordClassIndex(43921);
        }

        public C36590g() {
            super(1);
        }

        public final C36945f invoke(C36945f fVar) {
            C89219l.m154719c(fVar, "");
            return fVar;
        }
    }

    static {
        Covode.recordClassIndex(43914);
    }

    /* renamed from: a */
    public final FeedTaggedListViewModel mo64281a() {
        return (FeedTaggedListViewModel) this.f86571a.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.FeedTaggedEditCell$b */
    public static final class C36585b extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C36585b INSTANCE = new C36585b();

        static {
            Covode.recordClassIndex(43916);
        }

        public C36585b() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.FeedTaggedEditCell$c */
    public static final class C36586c extends AbstractC89220m implements AbstractC89171a<C12874b<C36945f>> {
        public static final C36586c INSTANCE = new C36586c();

        static {
            Covode.recordClassIndex(43917);
        }

        public C36586c() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C36945f> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.FeedTaggedEditCell$h */
    public static final class C36591h extends AbstractC89220m implements AbstractC89171a<C12874b<C36945f>> {
        public static final C36591h INSTANCE = new C36591h();

        static {
            Covode.recordClassIndex(43922);
        }

        public C36591h() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C36945f> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.FeedTaggedEditCell$k */
    public static final class C36594k extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C36594k INSTANCE = new C36594k();

        static {
            Covode.recordClassIndex(43925);
        }

        public C36594k() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.FeedTaggedEditCell$l */
    public static final class C36595l extends AbstractC89220m implements AbstractC89171a<C12874b<C36945f>> {
        public static final C36595l INSTANCE = new C36595l();

        static {
            Covode.recordClassIndex(43926);
        }

        public C36595l() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C36945f> invoke() {
            return new C12874b<>();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: k */
    public final void mo28072k() {
        super.mo28072k();
        this.itemView.setOnClickListener(new View$OnClickListenerC36598o(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.FeedTaggedEditCell$a */
    public static final class C36584a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f86572a;

        static {
            Covode.recordClassIndex(43915);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36584a(AbstractC89277c cVar) {
            super(0);
            this.f86572a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f86572a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.FeedTaggedEditCell$d */
    public static final class C36587d extends AbstractC89220m implements AbstractC89171a<AbstractC12748a> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f86573a;

        static {
            Covode.recordClassIndex(43918);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36587d(PowerCell powerCell) {
            super(0);
            this.f86573a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC12748a invoke() {
            if (this.f86573a.mo28070i() instanceof AbstractC12748a) {
                AbstractC1204m i = this.f86573a.mo28070i();
                if (i != null) {
                    return (AbstractC12748a) i;
                }
                throw new C89388w("null cannot be cast to non-null type");
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.FeedTaggedEditCell$e */
    public static final class C36588e extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f86574a;

        static {
            Covode.recordClassIndex(43919);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36588e(PowerCell powerCell) {
            super(0);
            this.f86574a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            if (this.f86574a.mo28070i() instanceof AbstractC12748a) {
                AbstractC1204m i = this.f86574a.mo28070i();
                if (i != null) {
                    return ((AbstractC12748a) i).getViewModelStore();
                }
                throw new C89388w("null cannot be cast to non-null type");
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.FeedTaggedEditCell$f */
    public static final class C36589f extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f86575a;

        static {
            Covode.recordClassIndex(43920);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36589f(PowerCell powerCell) {
            super(0);
            this.f86575a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            if (this.f86575a.mo28070i() instanceof AbstractC12748a) {
                AbstractC1204m i = this.f86575a.mo28070i();
                if (i != null) {
                    return ((AbstractC12748a) i).mo20598q();
                }
                throw new C89388w("null cannot be cast to non-null type");
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.FeedTaggedEditCell$i */
    public static final class C36592i extends AbstractC89220m implements AbstractC89171a<AbstractC1204m> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f86576a;

        static {
            Covode.recordClassIndex(43923);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36592i(PowerCell powerCell) {
            super(0);
            this.f86576a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC1204m invoke() {
            View view = this.f86576a.itemView;
            C89219l.m154709a((Object) view, "");
            Context context = view.getContext();
            if (context instanceof ActivityC0945e) {
                View view2 = this.f86576a.itemView;
                C89219l.m154709a((Object) view2, "");
                Context context2 = view2.getContext();
                if (context2 != null) {
                    return (ActivityC0945e) context2;
                }
                throw new C89388w("null cannot be cast to non-null type");
            } else if (context instanceof ContextWrapper) {
                View view3 = this.f86576a.itemView;
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
                View view4 = this.f86576a.itemView;
                C89219l.m154709a((Object) view4, "");
                throw new IllegalStateException(sb.append(view4.getContext()).append(" to activity.").toString());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.FeedTaggedEditCell$j */
    public static final class C36593j extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f86577a;

        static {
            Covode.recordClassIndex(43924);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36593j(PowerCell powerCell) {
            super(0);
            this.f86577a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e eVar;
            View view = this.f86577a.itemView;
            C89219l.m154709a((Object) view, "");
            Context context = view.getContext();
            if (context instanceof ActivityC0945e) {
                View view2 = this.f86577a.itemView;
                C89219l.m154709a((Object) view2, "");
                Context context2 = view2.getContext();
                if (context2 != null) {
                    eVar = (ActivityC0945e) context2;
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            } else if (context instanceof ContextThemeWrapper) {
                View view3 = this.f86577a.itemView;
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
                View view4 = this.f86577a.itemView;
                C89219l.m154709a((Object) view4, "");
                throw new IllegalStateException(sb.append(view4.getContext()).append(" to activity.").toString());
            }
            C1182af viewModelStore = eVar.getViewModelStore();
            C89219l.m154709a((Object) viewModelStore, "");
            return viewModelStore;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.FeedTaggedEditCell$m */
    public static final class C36596m extends AbstractC89220m implements AbstractC89171a<AbstractC1204m> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f86578a;

        static {
            Covode.recordClassIndex(43927);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36596m(PowerCell powerCell) {
            super(0);
            this.f86578a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC1204m invoke() {
            AbstractC1204m i = this.f86578a.mo28070i();
            if (i instanceof Fragment) {
                AbstractC1204m i2 = this.f86578a.mo28070i();
                if (i2 != null) {
                    return (Fragment) i2;
                }
                throw new C89388w("null cannot be cast to non-null type");
            } else if (i instanceof AbstractC12748a) {
                AbstractC1204m i3 = this.f86578a.mo28070i();
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

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.FeedTaggedEditCell$n */
    public static final class C36597n extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f86579a;

        static {
            Covode.recordClassIndex(43928);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36597n(PowerCell powerCell) {
            super(0);
            this.f86579a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            Fragment a;
            C1182af viewModelStore;
            AbstractC1204m i = this.f86579a.mo28070i();
            if (i instanceof Fragment) {
                AbstractC1204m i2 = this.f86579a.mo28070i();
                if (i2 != null) {
                    a = (Fragment) i2;
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            } else if (i instanceof AbstractC12748a) {
                AbstractC1204m i3 = this.f86579a.mo28070i();
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

    public FeedTaggedEditCell() {
        C12814b bVar;
        AbstractC12848i.C12852d dVar = AbstractC12848i.C12852d.f31278a;
        AbstractC89277c a = C89204ab.m154669a(FeedTaggedListViewModel.class);
        C36584a aVar = new C36584a(a);
        C36590g gVar = C36590g.INSTANCE;
        if (C89219l.m154714a(dVar, AbstractC12848i.C12849a.f31275a)) {
            bVar = new C12814b(a, aVar, C36591h.INSTANCE, new C36592i(this), new C36593j(this), C36594k.INSTANCE, gVar);
        } else if (C89219l.m154714a(dVar, AbstractC12848i.C12852d.f31278a)) {
            bVar = new C12814b(a, aVar, C36595l.INSTANCE, new C36596m(this), new C36597n(this), C36585b.INSTANCE, gVar);
        } else if (dVar == null || C89219l.m154714a(dVar, AbstractC12848i.C12850b.f31276a)) {
            bVar = new C12814b(a, aVar, C36586c.INSTANCE, new C36587d(this), new C36588e(this), new C36589f(this), gVar);
        } else {
            throw new IllegalArgumentException("Don't support this VMScope: " + dVar + " there");
        }
        this.f86571a = bVar;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final View mo23349a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.i7, viewGroup, false);
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.FeedTaggedEditCell$o */
    static final class View$OnClickListenerC36598o implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FeedTaggedEditCell f86580a;

        /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.FeedTaggedEditCell$o$a */
        static final class C36599a implements OnActivityResultCallback {

            /* renamed from: a */
            public static final C36599a f86581a = new C36599a();

            static {
                Covode.recordClassIndex(43930);
            }

            C36599a() {
            }

            @Override // com.bytedance.router.OnActivityResultCallback
            public final void onActivityResult(int i, int i2, Intent intent) {
            }
        }

        static {
            Covode.recordClassIndex(43929);
        }

        View$OnClickListenerC36598o(FeedTaggedEditCell feedTaggedEditCell) {
            this.f86580a = feedTaggedEditCell;
        }

        public final void onClick(View view) {
            C36889f fVar;
            int i;
            List<InteractionTagUserInfo> list;
            InteractionTagInfo interactionTagInfo;
            AwemeStatus status;
            ClickAgent.onClick(view);
            C36863c cVar = (C36863c) this.f86580a.f42160d;
            if (!(cVar == null || (fVar = cVar.f86848a) == null)) {
                CommentService e = CommentServiceImpl.m73664e();
                View view2 = this.f86580a.itemView;
                C89219l.m154716b(view2, "");
                Context context = view2.getContext();
                C89219l.m154716b(context, "");
                String str = fVar.f86883b;
                if (str == null) {
                    str = "";
                }
                Aweme aweme = fVar.f86882a;
                Aweme aweme2 = fVar.f86882a;
                if (aweme2 == null || (status = aweme2.getStatus()) == null) {
                    i = 0;
                } else {
                    i = status.getPrivateStatus();
                }
                Aweme aweme3 = fVar.f86882a;
                if (aweme3 == null || (interactionTagInfo = aweme3.getInteractionTagInfo()) == null) {
                    list = null;
                } else {
                    list = interactionTagInfo.getTaggedUsers();
                }
                e.mo63289a(context, str, aweme, i, list, C36599a.f86581a);
            }
            this.f86580a.mo64281a().mo64381a("", "click_edit");
            this.f86580a.mo64281a().mo20662a(FeedTaggedListViewModel.C36901b.f86907a);
        }
    }
}
