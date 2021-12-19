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
import com.bytedance.ies.dmt.p1194ui.p1198d.C17191a;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20745e;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.base.p2379ui.SmartAvatarImageView;
import com.p2082ss.android.ugc.aweme.comment.page.tag.viewmodel.C36945f;
import com.p2082ss.android.ugc.aweme.comment.page.tag.viewmodel.FeedTaggedListViewModel;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.InteractionTagInfo;
import com.p2082ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import com.p2082ss.android.ugc.aweme.follow.NewFollowButton;
import com.p2082ss.android.ugc.aweme.follow.widet.C51086a;
import com.p2082ss.android.ugc.aweme.metrics.C59252q;
import com.p2082ss.android.ugc.aweme.metrics.C59256u;
import com.p2082ss.android.ugc.aweme.metrics.C59260v;
import com.p2082ss.android.ugc.aweme.notice.api.helper.IMainServiceHelper;
import com.p2082ss.android.ugc.aweme.p3070im.IIMAdapterService;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.service.IMAdapterServiceImpl;
import com.p2082ss.android.ugc.aweme.p3070im.service.IIMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56245a;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.services.MainServiceHelperImpl;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.aweme.utils.C80581io;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89388w;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.comment.page.tag.FeedTaggedListCell */
public final class FeedTaggedListCell extends PowerCell<C36888e> {

    /* renamed from: j */
    public static final C36614o f86582j = new C36614o((byte) 0);

    /* renamed from: a */
    public NewFollowButton f86583a;

    /* renamed from: b */
    public TuxButton f86584b;

    /* renamed from: k */
    private final C12814b f86585k;

    /* renamed from: l */
    private final AbstractC89244h f86586l;

    /* renamed from: m */
    private final AbstractC89244h f86587m;

    /* renamed from: n */
    private SmartImageView f86588n;

    /* renamed from: o */
    private TuxTextView f86589o;

    /* renamed from: p */
    private TuxTextView f86590p;

    /* renamed from: q */
    private TuxTextView f86591q;

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.FeedTaggedListCell$g */
    public static final class C36606g extends AbstractC89220m implements AbstractC89172b<C36945f, C36945f> {
        public static final C36606g INSTANCE = new C36606g();

        static {
            Covode.recordClassIndex(43938);
        }

        public C36606g() {
            super(1);
        }

        public final C36945f invoke(C36945f fVar) {
            C89219l.m154719c(fVar, "");
            return fVar;
        }
    }

    static {
        Covode.recordClassIndex(43931);
    }

    /* renamed from: c */
    private final C51086a m74436c() {
        return (C51086a) this.f86586l.getValue();
    }

    /* renamed from: a */
    public final FeedTaggedListViewModel mo64284a() {
        return (FeedTaggedListViewModel) this.f86585k.getValue();
    }

    /* renamed from: b */
    public final String mo64286b() {
        return (String) this.f86587m.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.FeedTaggedListCell$o */
    public static final class C36614o {
        static {
            Covode.recordClassIndex(43946);
        }

        private C36614o() {
        }

        public /* synthetic */ C36614o(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.FeedTaggedListCell$b */
    public static final class C36601b extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C36601b INSTANCE = new C36601b();

        static {
            Covode.recordClassIndex(43933);
        }

        public C36601b() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.FeedTaggedListCell$c */
    public static final class C36602c extends AbstractC89220m implements AbstractC89171a<C12874b<C36945f>> {
        public static final C36602c INSTANCE = new C36602c();

        static {
            Covode.recordClassIndex(43934);
        }

        public C36602c() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C36945f> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.FeedTaggedListCell$h */
    public static final class C36607h extends AbstractC89220m implements AbstractC89171a<C12874b<C36945f>> {
        public static final C36607h INSTANCE = new C36607h();

        static {
            Covode.recordClassIndex(43939);
        }

        public C36607h() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C36945f> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.FeedTaggedListCell$k */
    public static final class C36610k extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C36610k INSTANCE = new C36610k();

        static {
            Covode.recordClassIndex(43942);
        }

        public C36610k() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.FeedTaggedListCell$l */
    public static final class C36611l extends AbstractC89220m implements AbstractC89171a<C12874b<C36945f>> {
        public static final C36611l INSTANCE = new C36611l();

        static {
            Covode.recordClassIndex(43943);
        }

        public C36611l() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C36945f> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.FeedTaggedListCell$p */
    static final class C36615p extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        public static final C36615p f86600a = new C36615p();

        static {
            Covode.recordClassIndex(43947);
        }

        C36615p() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            return g.getCurUserId();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.FeedTaggedListCell$a */
    public static final class C36600a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f86592a;

        static {
            Covode.recordClassIndex(43932);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36600a(AbstractC89277c cVar) {
            super(0);
            this.f86592a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f86592a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.FeedTaggedListCell$q */
    static final class C36616q extends AbstractC89220m implements AbstractC89171a<C51086a> {

        /* renamed from: a */
        final /* synthetic */ FeedTaggedListCell f86601a;

        static {
            Covode.recordClassIndex(43948);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36616q(FeedTaggedListCell feedTaggedListCell) {
            super(0);
            this.f86601a = feedTaggedListCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C51086a invoke() {
            return new C51086a(FeedTaggedListCell.m74435b(this.f86601a), new C51086a.C51094g(this) {
                /* class com.p2082ss.android.ugc.aweme.comment.page.tag.FeedTaggedListCell.C36616q.C366171 */

                /* renamed from: a */
                final /* synthetic */ C36616q f86602a;

                static {
                    Covode.recordClassIndex(43949);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f86602a = r1;
                }

                @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.C51094g, com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51093f
                /* renamed from: a */
                public final void mo63346a(int i, User user) {
                    String str;
                    C36888e eVar;
                    C36889f fVar;
                    String str2;
                    String str3;
                    if (!(user == null || (eVar = (C36888e) this.f86602a.f86601a.f42160d) == null || (fVar = eVar.f86881b) == null)) {
                        if (user.getFollowStatus() == 0) {
                            str2 = "follow";
                        } else {
                            str2 = "follow_cancel";
                        }
                        C59260v vVar = new C59260v(str2);
                        String str4 = fVar.f86883b;
                        if (str4 == null) {
                            str4 = "";
                        }
                        C59260v a = vVar.mo96847a(str4);
                        a.f135409s = "tag";
                        a.f135405e = user.getUid();
                        Aweme aweme = fVar.f86882a;
                        if (aweme != null) {
                            str3 = aweme.getGroupId();
                        } else {
                            str3 = null;
                        }
                        a.f135406p = str3;
                        a.f135222V = user.getFollowStatus();
                        a.mo96792f();
                    }
                    FeedTaggedListViewModel a2 = this.f86602a.f86601a.mo64284a();
                    String b = this.f86602a.f86601a.mo64286b();
                    C89219l.m154716b(b, "");
                    if (i == 1) {
                        str = "click_follow";
                    } else {
                        str = "click_cancel_follow";
                    }
                    a2.mo64381a(b, str);
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.FeedTaggedListCell$d */
    public static final class C36603d extends AbstractC89220m implements AbstractC89171a<AbstractC12748a> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f86593a;

        static {
            Covode.recordClassIndex(43935);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36603d(PowerCell powerCell) {
            super(0);
            this.f86593a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC12748a invoke() {
            if (this.f86593a.mo28070i() instanceof AbstractC12748a) {
                AbstractC1204m i = this.f86593a.mo28070i();
                if (i != null) {
                    return (AbstractC12748a) i;
                }
                throw new C89388w("null cannot be cast to non-null type");
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.FeedTaggedListCell$e */
    public static final class C36604e extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f86594a;

        static {
            Covode.recordClassIndex(43936);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36604e(PowerCell powerCell) {
            super(0);
            this.f86594a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            if (this.f86594a.mo28070i() instanceof AbstractC12748a) {
                AbstractC1204m i = this.f86594a.mo28070i();
                if (i != null) {
                    return ((AbstractC12748a) i).getViewModelStore();
                }
                throw new C89388w("null cannot be cast to non-null type");
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.FeedTaggedListCell$f */
    public static final class C36605f extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f86595a;

        static {
            Covode.recordClassIndex(43937);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36605f(PowerCell powerCell) {
            super(0);
            this.f86595a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            if (this.f86595a.mo28070i() instanceof AbstractC12748a) {
                AbstractC1204m i = this.f86595a.mo28070i();
                if (i != null) {
                    return ((AbstractC12748a) i).mo20598q();
                }
                throw new C89388w("null cannot be cast to non-null type");
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.FeedTaggedListCell$i */
    public static final class C36608i extends AbstractC89220m implements AbstractC89171a<AbstractC1204m> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f86596a;

        static {
            Covode.recordClassIndex(43940);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36608i(PowerCell powerCell) {
            super(0);
            this.f86596a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC1204m invoke() {
            View view = this.f86596a.itemView;
            C89219l.m154709a((Object) view, "");
            Context context = view.getContext();
            if (context instanceof ActivityC0945e) {
                View view2 = this.f86596a.itemView;
                C89219l.m154709a((Object) view2, "");
                Context context2 = view2.getContext();
                if (context2 != null) {
                    return (ActivityC0945e) context2;
                }
                throw new C89388w("null cannot be cast to non-null type");
            } else if (context instanceof ContextWrapper) {
                View view3 = this.f86596a.itemView;
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
                View view4 = this.f86596a.itemView;
                C89219l.m154709a((Object) view4, "");
                throw new IllegalStateException(sb.append(view4.getContext()).append(" to activity.").toString());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.FeedTaggedListCell$j */
    public static final class C36609j extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f86597a;

        static {
            Covode.recordClassIndex(43941);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36609j(PowerCell powerCell) {
            super(0);
            this.f86597a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e eVar;
            View view = this.f86597a.itemView;
            C89219l.m154709a((Object) view, "");
            Context context = view.getContext();
            if (context instanceof ActivityC0945e) {
                View view2 = this.f86597a.itemView;
                C89219l.m154709a((Object) view2, "");
                Context context2 = view2.getContext();
                if (context2 != null) {
                    eVar = (ActivityC0945e) context2;
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            } else if (context instanceof ContextThemeWrapper) {
                View view3 = this.f86597a.itemView;
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
                View view4 = this.f86597a.itemView;
                C89219l.m154709a((Object) view4, "");
                throw new IllegalStateException(sb.append(view4.getContext()).append(" to activity.").toString());
            }
            C1182af viewModelStore = eVar.getViewModelStore();
            C89219l.m154709a((Object) viewModelStore, "");
            return viewModelStore;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.FeedTaggedListCell$m */
    public static final class C36612m extends AbstractC89220m implements AbstractC89171a<AbstractC1204m> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f86598a;

        static {
            Covode.recordClassIndex(43944);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36612m(PowerCell powerCell) {
            super(0);
            this.f86598a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC1204m invoke() {
            AbstractC1204m i = this.f86598a.mo28070i();
            if (i instanceof Fragment) {
                AbstractC1204m i2 = this.f86598a.mo28070i();
                if (i2 != null) {
                    return (Fragment) i2;
                }
                throw new C89388w("null cannot be cast to non-null type");
            } else if (i instanceof AbstractC12748a) {
                AbstractC1204m i3 = this.f86598a.mo28070i();
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

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.FeedTaggedListCell$n */
    public static final class C36613n extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f86599a;

        static {
            Covode.recordClassIndex(43945);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36613n(PowerCell powerCell) {
            super(0);
            this.f86599a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            Fragment a;
            C1182af viewModelStore;
            AbstractC1204m i = this.f86599a.mo28070i();
            if (i instanceof Fragment) {
                AbstractC1204m i2 = this.f86599a.mo28070i();
                if (i2 != null) {
                    a = (Fragment) i2;
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            } else if (i instanceof AbstractC12748a) {
                AbstractC1204m i3 = this.f86599a.mo28070i();
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

    public FeedTaggedListCell() {
        C12814b bVar;
        AbstractC12848i.C12852d dVar = AbstractC12848i.C12852d.f31278a;
        AbstractC89277c a = C89204ab.m154669a(FeedTaggedListViewModel.class);
        C36600a aVar = new C36600a(a);
        C36606g gVar = C36606g.INSTANCE;
        if (C89219l.m154714a(dVar, AbstractC12848i.C12849a.f31275a)) {
            bVar = new C12814b(a, aVar, C36607h.INSTANCE, new C36608i(this), new C36609j(this), C36610k.INSTANCE, gVar);
        } else if (C89219l.m154714a(dVar, AbstractC12848i.C12852d.f31278a)) {
            bVar = new C12814b(a, aVar, C36611l.INSTANCE, new C36612m(this), new C36613n(this), C36601b.INSTANCE, gVar);
        } else if (dVar == null || C89219l.m154714a(dVar, AbstractC12848i.C12850b.f31276a)) {
            bVar = new C12814b(a, aVar, C36602c.INSTANCE, new C36603d(this), new C36604e(this), new C36605f(this), gVar);
        } else {
            throw new IllegalArgumentException("Don't support this VMScope: " + dVar + " there");
        }
        this.f86585k = bVar;
        this.f86586l = C89250i.m154773a((AbstractC89171a) new C36616q(this));
        this.f86587m = C89250i.m154773a((AbstractC89171a) C36615p.f86600a);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: k */
    public final void mo28072k() {
        View view = this.itemView;
        C89219l.m154716b(view, "");
        SmartAvatarImageView smartAvatarImageView = (SmartAvatarImageView) view.findViewById(R.id.o3);
        C89219l.m154716b(smartAvatarImageView, "");
        this.f86588n = smartAvatarImageView;
        View view2 = this.itemView;
        C89219l.m154716b(view2, "");
        TuxTextView tuxTextView = (TuxTextView) view2.findViewById(R.id.f_9);
        C89219l.m154716b(tuxTextView, "");
        this.f86589o = tuxTextView;
        View view3 = this.itemView;
        C89219l.m154716b(view3, "");
        TuxTextView tuxTextView2 = (TuxTextView) view3.findViewById(R.id.dhh);
        C89219l.m154716b(tuxTextView2, "");
        this.f86590p = tuxTextView2;
        View view4 = this.itemView;
        C89219l.m154716b(view4, "");
        TuxTextView tuxTextView3 = (TuxTextView) view4.findViewById(R.id.ajg);
        C89219l.m154716b(tuxTextView3, "");
        this.f86591q = tuxTextView3;
        View view5 = this.itemView;
        C89219l.m154716b(view5, "");
        NewFollowButton newFollowButton = (NewFollowButton) view5.findViewById(R.id.b6b);
        C89219l.m154716b(newFollowButton, "");
        this.f86583a = newFollowButton;
        if (newFollowButton == null) {
            C89219l.m154710a("followBtn");
        }
        newFollowButton.setShouldShowMessageText(true);
        View view6 = this.itemView;
        C89219l.m154716b(view6, "");
        TuxButton tuxButton = (TuxButton) view6.findViewById(R.id.dho);
        C89219l.m154716b(tuxButton, "");
        this.f86584b = tuxButton;
        if (tuxButton == null) {
            C89219l.m154710a("removeBtn");
        }
        tuxButton.setOnClickListener(new View$OnClickListenerC36623w(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.FeedTaggedListCell$s */
    static final class View$OnClickListenerC36619s implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FeedTaggedListCell f86605a;

        /* renamed from: b */
        final /* synthetic */ User f86606b;

        static {
            Covode.recordClassIndex(43951);
        }

        View$OnClickListenerC36619s(FeedTaggedListCell feedTaggedListCell, User user) {
            this.f86605a = feedTaggedListCell;
            this.f86606b = user;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f86605a.mo64285a(this.f86606b);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ TuxButton m74434a(FeedTaggedListCell feedTaggedListCell) {
        TuxButton tuxButton = feedTaggedListCell.f86584b;
        if (tuxButton == null) {
            C89219l.m154710a("removeBtn");
        }
        return tuxButton;
    }

    /* renamed from: b */
    public static final /* synthetic */ NewFollowButton m74435b(FeedTaggedListCell feedTaggedListCell) {
        NewFollowButton newFollowButton = feedTaggedListCell.f86583a;
        if (newFollowButton == null) {
            C89219l.m154710a("followBtn");
        }
        return newFollowButton;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final View mo23349a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.i8, viewGroup, false);
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.FeedTaggedListCell$r */
    static final class View$OnClickListenerC36618r implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FeedTaggedListCell f86603a;

        /* renamed from: b */
        final /* synthetic */ User f86604b;

        static {
            Covode.recordClassIndex(43950);
        }

        View$OnClickListenerC36618r(FeedTaggedListCell feedTaggedListCell, User user) {
            this.f86603a = feedTaggedListCell;
            this.f86604b = user;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f86603a.mo64285a(this.f86604b);
            FeedTaggedListViewModel a = this.f86603a.mo64284a();
            String uid = this.f86604b.getUid();
            C89219l.m154716b(uid, "");
            a.mo64381a(uid, "click_head");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.FeedTaggedListCell$u */
    public static final class C36621u implements C51086a.AbstractC51091d {

        /* renamed from: a */
        final /* synthetic */ FeedTaggedListCell f86609a;

        /* renamed from: b */
        final /* synthetic */ C36888e f86610b;

        static {
            Covode.recordClassIndex(43953);
        }

        @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51091d
        /* renamed from: a */
        public final void mo63342a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51091d
        /* renamed from: b */
        public final void mo63344b() {
        }

        @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51091d
        /* renamed from: a */
        public final void mo63343a(FollowStatus followStatus) {
            C36889f fVar;
            Aweme aweme;
            InteractionTagInfo interactionTagInfo;
            List<InteractionTagUserInfo> taggedUsers;
            User user = this.f86610b.f86880a;
            if (followStatus != null) {
                FeedTaggedListCell.m74435b(this.f86609a).mo73175a(followStatus.followStatus, followStatus.followerStatus);
                C36888e eVar = this.f86610b;
                if (!(eVar == null || (fVar = eVar.f86881b) == null || (aweme = fVar.f86882a) == null || (interactionTagInfo = aweme.getInteractionTagInfo()) == null || (taggedUsers = interactionTagInfo.getTaggedUsers()) == null)) {
                    for (T t : taggedUsers) {
                        if (C89219l.m154714a((Object) t.getUid(), (Object) user.getUid())) {
                            t.setFollowStatus(followStatus.followStatus);
                        }
                    }
                }
            }
        }

        C36621u(FeedTaggedListCell feedTaggedListCell, C36888e eVar) {
            this.f86609a = feedTaggedListCell;
            this.f86610b = eVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.FeedTaggedListCell$v */
    public static final class View$OnAttachStateChangeListenerC36622v implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        final /* synthetic */ FeedTaggedListCell f86611a;

        /* renamed from: b */
        final /* synthetic */ C36888e f86612b;

        static {
            Covode.recordClassIndex(43954);
        }

        public final void onViewDetachedFromWindow(View view) {
        }

        public final void onViewAttachedToWindow(View view) {
            String str;
            String authorUid;
            FeedTaggedListViewModel a = this.f86611a.mo64284a();
            String uid = this.f86612b.f86880a.getUid();
            String str2 = "";
            C89219l.m154716b(uid, str2);
            C89219l.m154721d(uid, str2);
            if (!a.f86901j.contains(uid)) {
                a.f86901j.add(uid);
                C33744d a2 = new C33744d().mo59983a("to_user_id", uid);
                Aweme aweme = a.mo23342g().f86865a;
                if (aweme == null || (str = aweme.getAid()) == null) {
                    str = str2;
                }
                C33744d a3 = a2.mo59983a("group_id", str);
                Aweme aweme2 = a.mo23342g().f86865a;
                if (!(aweme2 == null || (authorUid = aweme2.getAuthorUid()) == null)) {
                    str2 = authorUid;
                }
                C39162r.m79460a("show_tagged_user", a3.mo59983a("author_id", str2).mo59983a("enter_from", a.mo23342g().f86867c).mo59983a("anchor_type", a.mo23342g().f86868d).f79943a);
            }
        }

        View$OnAttachStateChangeListenerC36622v(FeedTaggedListCell feedTaggedListCell, C36888e eVar) {
            this.f86611a = feedTaggedListCell;
            this.f86612b = eVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.FeedTaggedListCell$w */
    static final class View$OnClickListenerC36623w implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FeedTaggedListCell f86613a;

        static {
            Covode.recordClassIndex(43955);
        }

        View$OnClickListenerC36623w(FeedTaggedListCell feedTaggedListCell) {
            this.f86613a = feedTaggedListCell;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            FeedTaggedListViewModel a = this.f86613a.mo64284a();
            String b = this.f86613a.mo64286b();
            C89219l.m154716b(b, "");
            if (this.f86613a.mo64284a().f86902k) {
                str = "click_add_back";
            } else {
                str = "click_remove";
            }
            a.mo64381a(b, str);
            if (this.f86613a.mo64284a().f86902k) {
                this.f86613a.mo64284a().f86902k = false;
                FeedTaggedListCell.m74434a(this.f86613a).setText(R.string.g9u);
                return;
            }
            this.f86613a.mo64284a().f86902k = true;
            FeedTaggedListCell.m74434a(this.f86613a).setText(R.string.g9t);
            View view2 = this.f86613a.itemView;
            C89219l.m154716b(view2, "");
            new C23144b(view2).mo37640e(R.string.g9v).mo37637b();
        }
    }

    /* renamed from: a */
    public final void mo64285a(User user) {
        C36889f fVar;
        C36888e eVar = (C36888e) this.f42160d;
        if (!(eVar == null || (fVar = eVar.f86881b) == null)) {
            C59252q f = new C59252q().mo96749g(fVar.f86882a);
            String str = fVar.f86883b;
            if (str == null) {
                str = "";
            }
            f.mo96825o(str).mo96741a("tag").mo96792f();
        }
        View view = this.itemView;
        C89219l.m154716b(view, "");
        SmartRouter.buildRoute(view.getContext(), "aweme://user/profile/" + user.getUid()).withParam("sec_user_id", user.getSecUid()).open();
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.FeedTaggedListCell$t */
    static final class C36620t implements C51086a.AbstractC51090c {

        /* renamed from: a */
        final /* synthetic */ FeedTaggedListCell f86607a;

        /* renamed from: b */
        final /* synthetic */ User f86608b;

        static {
            Covode.recordClassIndex(43952);
        }

        C36620t(FeedTaggedListCell feedTaggedListCell, User user) {
            this.f86607a = feedTaggedListCell;
            this.f86608b = user;
        }

        @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51090c
        /* renamed from: a */
        public final boolean mo63341a(int i) {
            Boolean bool;
            C36889f fVar;
            String str;
            Aweme aweme;
            String str2;
            if (i != 2) {
                return false;
            }
            FeedTaggedListViewModel a = this.f86607a.mo64284a();
            String uid = this.f86608b.getUid();
            C89219l.m154716b(uid, "");
            a.mo64381a(uid, "click_chat");
            FeedTaggedListCell feedTaggedListCell = this.f86607a;
            User user = this.f86608b;
            IMainServiceHelper createIMainServiceHelperbyMonsterPlugin = MainServiceHelperImpl.createIMainServiceHelperbyMonsterPlugin(false);
            if (createIMainServiceHelperbyMonsterPlugin == null || !createIMainServiceHelperbyMonsterPlugin.shouldRedictToTipsPage() || createIMainServiceHelperbyMonsterPlugin.isChatFunOfflineUnder16()) {
                IIMAdapterService d = IMAdapterServiceImpl.m101068d();
                String str3 = null;
                if (d != null) {
                    bool = Boolean.valueOf(d.mo90129a());
                } else {
                    bool = null;
                }
                if (!bool.booleanValue()) {
                    return true;
                }
                C36888e eVar = (C36888e) feedTaggedListCell.f42160d;
                if (eVar != null) {
                    fVar = eVar.f86881b;
                } else {
                    fVar = null;
                }
                if (fVar != null) {
                    C59256u o = new C59256u().mo96834a(fVar.f86883b).mo96837o("tag");
                    o.f135352b = C59256u.EnumC59257a.ENTER_CHAT;
                    Aweme aweme2 = fVar.f86882a;
                    if (aweme2 != null) {
                        str2 = aweme2.getGroupId();
                    } else {
                        str2 = null;
                    }
                    C59256u r = o.mo96840r(str2);
                    r.f135222V = user.getFollowStatus();
                    r.mo96832a(user).mo96792f();
                }
                IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
                View view = feedTaggedListCell.itemView;
                C89219l.m154716b(view, "");
                C56245a.C56246a a2 = C56245a.C56247b.m102214a(view.getContext(), IMUser.fromUser(user));
                if (fVar != null) {
                    str = fVar.f86883b;
                } else {
                    str = null;
                }
                C56245a.C56246a b = a2.mo93274c(str).mo93271b("tag");
                if (!(fVar == null || (aweme = fVar.f86882a) == null)) {
                    str3 = aweme.getGroupId();
                }
                createIIMServicebyMonsterPlugin.startChat(b.mo93277e(str3).mo93275d(user.getFollowStatus()).f128281a);
                return true;
            }
            createIMainServiceHelperbyMonsterPlugin.goToTipsPage();
            return true;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final /* synthetic */ void mo23350a(C36888e eVar) {
        String nickname;
        String uniqueId;
        C36888e eVar2 = eVar;
        C89219l.m154721d(eVar2, "");
        User user = eVar2.f86880a;
        C20766v a = C20761r.m39060a(C34735v.m70965a(user.getAvatarThumb())).mo34179a("FeedTaggedListCell");
        SmartImageView smartImageView = this.f86588n;
        if (smartImageView == null) {
            C89219l.m154710a("avatarIv");
        }
        a.f49092E = smartImageView;
        C20745e.C20746a aVar = new C20745e.C20746a();
        aVar.f48957a = true;
        C20745e a2 = aVar.mo34169a();
        C89219l.m154716b(a2, "");
        a.f49126w = a2;
        a.f49106c = true;
        a.mo34186c();
        SmartImageView smartImageView2 = this.f86588n;
        if (smartImageView2 == null) {
            C89219l.m154710a("avatarIv");
        }
        smartImageView2.setOnClickListener(new View$OnClickListenerC36618r(this, user));
        this.itemView.setOnClickListener(new View$OnClickListenerC36619s(this, user));
        TuxTextView tuxTextView = this.f86591q;
        if (tuxTextView == null) {
            C89219l.m154710a("descTv");
        }
        tuxTextView.setVisibility(0);
        TuxTextView tuxTextView2 = this.f86591q;
        if (tuxTextView2 == null) {
            C89219l.m154710a("descTv");
        }
        C17191a.C17192a aVar2 = new C17191a.C17192a();
        FeedTaggedListViewModel a3 = mo64284a();
        C89219l.m154721d(user, "");
        if (a3.mo23343h()) {
            nickname = user.getUniqueId();
            C89219l.m154716b(nickname, "");
        } else {
            nickname = user.getNickname();
            C89219l.m154716b(nickname, "");
        }
        tuxTextView2.setText(aVar2.mo27177a(nickname).f40973a);
        TuxTextView tuxTextView3 = this.f86589o;
        if (tuxTextView3 == null) {
            C89219l.m154710a("userTv");
        }
        C17191a.C17192a aVar3 = new C17191a.C17192a();
        FeedTaggedListViewModel a4 = mo64284a();
        C89219l.m154721d(user, "");
        if (a4.mo23343h()) {
            uniqueId = user.getNickname();
            C89219l.m154716b(uniqueId, "");
        } else {
            uniqueId = user.getUniqueId();
            C89219l.m154716b(uniqueId, "");
        }
        tuxTextView3.setText(aVar3.mo27177a(uniqueId).f40973a);
        View view = this.itemView;
        C89219l.m154716b(view, "");
        Context context = view.getContext();
        String customVerify = user.getCustomVerify();
        String enterpriseVerifyReason = user.getEnterpriseVerifyReason();
        TuxTextView tuxTextView4 = this.f86589o;
        if (tuxTextView4 == null) {
            C89219l.m154710a("userTv");
        }
        C80581io.m139704a(context, customVerify, enterpriseVerifyReason, tuxTextView4);
        if (user.getFollowStatus() == 2) {
            TuxTextView tuxTextView5 = this.f86590p;
            if (tuxTextView5 == null) {
                C89219l.m154710a("relationTv");
            }
            tuxTextView5.setVisibility(0);
        } else {
            TuxTextView tuxTextView6 = this.f86590p;
            if (tuxTextView6 == null) {
                C89219l.m154710a("relationTv");
            }
            tuxTextView6.setVisibility(8);
        }
        if (C80580in.m139694g(user)) {
            TuxButton tuxButton = this.f86584b;
            if (tuxButton == null) {
                C89219l.m154710a("removeBtn");
            }
            tuxButton.setVisibility(0);
            NewFollowButton newFollowButton = this.f86583a;
            if (newFollowButton == null) {
                C89219l.m154710a("followBtn");
            }
            newFollowButton.setVisibility(8);
        } else if (user.getFollowStatus() == -1 || user.getFollowerStatus() == -1) {
            NewFollowButton newFollowButton2 = this.f86583a;
            if (newFollowButton2 == null) {
                C89219l.m154710a("followBtn");
            }
            newFollowButton2.setVisibility(8);
            TuxButton tuxButton2 = this.f86584b;
            if (tuxButton2 == null) {
                C89219l.m154710a("removeBtn");
            }
            tuxButton2.setVisibility(8);
        } else {
            NewFollowButton newFollowButton3 = this.f86583a;
            if (newFollowButton3 == null) {
                C89219l.m154710a("followBtn");
            }
            newFollowButton3.setVisibility(0);
            TuxButton tuxButton3 = this.f86584b;
            if (tuxButton3 == null) {
                C89219l.m154710a("removeBtn");
            }
            tuxButton3.setVisibility(8);
            m74436c().mo86508a(user);
            m74436c().f117879e = new C36620t(this, user);
            m74436c().f117878d = new C36621u(this, eVar2);
        }
        this.itemView.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC36622v(this, eVar2));
    }
}
