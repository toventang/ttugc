package com.p2082ss.android.ugc.aweme.recommend.users.profile.powerlist;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
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
import com.bytedance.ies.powerlist.PowerCell;
import com.p2082ss.android.ugc.aweme.friends.service.C51648a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.recommend.users.profile.p3671ui.C66737f;
import com.p2082ss.android.ugc.aweme.recommend.users.profile.p3671ui.UserProfilePublishListRecommendUserVM;
import com.p2082ss.android.ugc.aweme.social.widget.C74743a;
import com.p2082ss.android.ugc.aweme.social.widget.card.AbstractC74788j;
import com.p2082ss.android.ugc.aweme.social.widget.card.C74787i;
import com.p2082ss.android.ugc.aweme.social.widget.card.EnumC74790k;
import com.p2082ss.android.ugc.aweme.social.widget.card.p3920a.C74762g;
import com.p2082ss.android.ugc.aweme.social.widget.card.p3920a.C74765i;
import com.p2082ss.android.ugc.aweme.social.widget.card.p3920a.EnumC74754a;
import com.p2082ss.android.ugc.aweme.social.widget.card.p3920a.EnumC74760e;
import com.p2082ss.android.ugc.aweme.social.widget.card.p3920a.EnumC74761f;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import java.util.List;
import java.util.Objects;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4589j.C88934a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89387v;
import p4600h.C89388w;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.powerlist.RecommendPermissionCell */
public final class RecommendPermissionCell extends PowerCell<C66693a> {

    /* renamed from: a */
    final C12814b f149829a;

    /* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.powerlist.RecommendPermissionCell$g */
    public static final class C66662g extends AbstractC89220m implements AbstractC89172b<C66737f, C66737f> {
        public static final C66662g INSTANCE = new C66662g();

        static {
            Covode.recordClassIndex(78229);
        }

        public C66662g() {
            super(1);
        }

        public final C66737f invoke(C66737f fVar) {
            C89219l.m154719c(fVar, "");
            return fVar;
        }
    }

    static {
        Covode.recordClassIndex(78222);
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.powerlist.RecommendPermissionCell$b */
    public static final class C66657b extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C66657b INSTANCE = new C66657b();

        static {
            Covode.recordClassIndex(78224);
        }

        public C66657b() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.powerlist.RecommendPermissionCell$c */
    public static final class C66658c extends AbstractC89220m implements AbstractC89171a<C12874b<C66737f>> {
        public static final C66658c INSTANCE = new C66658c();

        static {
            Covode.recordClassIndex(78225);
        }

        public C66658c() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C66737f> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.powerlist.RecommendPermissionCell$h */
    public static final class C66663h extends AbstractC89220m implements AbstractC89171a<C12874b<C66737f>> {
        public static final C66663h INSTANCE = new C66663h();

        static {
            Covode.recordClassIndex(78230);
        }

        public C66663h() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C66737f> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.powerlist.RecommendPermissionCell$k */
    public static final class C66666k extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C66666k INSTANCE = new C66666k();

        static {
            Covode.recordClassIndex(78233);
        }

        public C66666k() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.powerlist.RecommendPermissionCell$l */
    public static final class C66667l extends AbstractC89220m implements AbstractC89171a<C12874b<C66737f>> {
        public static final C66667l INSTANCE = new C66667l();

        static {
            Covode.recordClassIndex(78234);
        }

        public C66667l() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C66737f> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.powerlist.RecommendPermissionCell$a */
    public static final class C66656a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f149830a;

        static {
            Covode.recordClassIndex(78223);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66656a(AbstractC89277c cVar) {
            super(0);
            this.f149830a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f149830a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.powerlist.RecommendPermissionCell$d */
    public static final class C66659d extends AbstractC89220m implements AbstractC89171a<AbstractC12748a> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f149831a;

        static {
            Covode.recordClassIndex(78226);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66659d(PowerCell powerCell) {
            super(0);
            this.f149831a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC12748a invoke() {
            if (this.f149831a.mo28070i() instanceof AbstractC12748a) {
                AbstractC1204m i = this.f149831a.mo28070i();
                if (i != null) {
                    return (AbstractC12748a) i;
                }
                throw new C89388w("null cannot be cast to non-null type");
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.powerlist.RecommendPermissionCell$e */
    public static final class C66660e extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f149832a;

        static {
            Covode.recordClassIndex(78227);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66660e(PowerCell powerCell) {
            super(0);
            this.f149832a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            if (this.f149832a.mo28070i() instanceof AbstractC12748a) {
                AbstractC1204m i = this.f149832a.mo28070i();
                if (i != null) {
                    return ((AbstractC12748a) i).getViewModelStore();
                }
                throw new C89388w("null cannot be cast to non-null type");
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.powerlist.RecommendPermissionCell$f */
    public static final class C66661f extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f149833a;

        static {
            Covode.recordClassIndex(78228);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66661f(PowerCell powerCell) {
            super(0);
            this.f149833a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            if (this.f149833a.mo28070i() instanceof AbstractC12748a) {
                AbstractC1204m i = this.f149833a.mo28070i();
                if (i != null) {
                    return ((AbstractC12748a) i).mo20598q();
                }
                throw new C89388w("null cannot be cast to non-null type");
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.powerlist.RecommendPermissionCell$i */
    public static final class C66664i extends AbstractC89220m implements AbstractC89171a<AbstractC1204m> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f149834a;

        static {
            Covode.recordClassIndex(78231);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66664i(PowerCell powerCell) {
            super(0);
            this.f149834a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC1204m invoke() {
            View view = this.f149834a.itemView;
            C89219l.m154709a((Object) view, "");
            Context context = view.getContext();
            if (context instanceof ActivityC0945e) {
                View view2 = this.f149834a.itemView;
                C89219l.m154709a((Object) view2, "");
                Context context2 = view2.getContext();
                if (context2 != null) {
                    return (ActivityC0945e) context2;
                }
                throw new C89388w("null cannot be cast to non-null type");
            } else if (context instanceof ContextWrapper) {
                View view3 = this.f149834a.itemView;
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
                View view4 = this.f149834a.itemView;
                C89219l.m154709a((Object) view4, "");
                throw new IllegalStateException(sb.append(view4.getContext()).append(" to activity.").toString());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.powerlist.RecommendPermissionCell$j */
    public static final class C66665j extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f149835a;

        static {
            Covode.recordClassIndex(78232);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66665j(PowerCell powerCell) {
            super(0);
            this.f149835a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e eVar;
            View view = this.f149835a.itemView;
            C89219l.m154709a((Object) view, "");
            Context context = view.getContext();
            if (context instanceof ActivityC0945e) {
                View view2 = this.f149835a.itemView;
                C89219l.m154709a((Object) view2, "");
                Context context2 = view2.getContext();
                if (context2 != null) {
                    eVar = (ActivityC0945e) context2;
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            } else if (context instanceof ContextThemeWrapper) {
                View view3 = this.f149835a.itemView;
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
                View view4 = this.f149835a.itemView;
                C89219l.m154709a((Object) view4, "");
                throw new IllegalStateException(sb.append(view4.getContext()).append(" to activity.").toString());
            }
            C1182af viewModelStore = eVar.getViewModelStore();
            C89219l.m154709a((Object) viewModelStore, "");
            return viewModelStore;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.powerlist.RecommendPermissionCell$m */
    public static final class C66668m extends AbstractC89220m implements AbstractC89171a<AbstractC1204m> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f149836a;

        static {
            Covode.recordClassIndex(78235);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66668m(PowerCell powerCell) {
            super(0);
            this.f149836a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC1204m invoke() {
            AbstractC1204m i = this.f149836a.mo28070i();
            if (i instanceof Fragment) {
                AbstractC1204m i2 = this.f149836a.mo28070i();
                if (i2 != null) {
                    return (Fragment) i2;
                }
                throw new C89388w("null cannot be cast to non-null type");
            } else if (i instanceof AbstractC12748a) {
                AbstractC1204m i3 = this.f149836a.mo28070i();
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

    /* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.powerlist.RecommendPermissionCell$n */
    public static final class C66669n extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f149837a;

        static {
            Covode.recordClassIndex(78236);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66669n(PowerCell powerCell) {
            super(0);
            this.f149837a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            Fragment a;
            C1182af viewModelStore;
            AbstractC1204m i = this.f149837a.mo28070i();
            if (i instanceof Fragment) {
                AbstractC1204m i2 = this.f149837a.mo28070i();
                if (i2 != null) {
                    a = (Fragment) i2;
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            } else if (i instanceof AbstractC12748a) {
                AbstractC1204m i3 = this.f149837a.mo28070i();
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

    public RecommendPermissionCell() {
        C12814b bVar;
        AbstractC12848i.C12852d dVar = AbstractC12848i.C12852d.f31278a;
        AbstractC89277c a = C89204ab.m154669a(UserProfilePublishListRecommendUserVM.class);
        C66656a aVar = new C66656a(a);
        C66662g gVar = C66662g.INSTANCE;
        if (C89219l.m154714a(dVar, AbstractC12848i.C12849a.f31275a)) {
            bVar = new C12814b(a, aVar, C66663h.INSTANCE, new C66664i(this), new C66665j(this), C66666k.INSTANCE, gVar);
        } else if (C89219l.m154714a(dVar, AbstractC12848i.C12852d.f31278a)) {
            bVar = new C12814b(a, aVar, C66667l.INSTANCE, new C66668m(this), new C66669n(this), C66657b.INSTANCE, gVar);
        } else if (dVar == null || C89219l.m154714a(dVar, AbstractC12848i.C12850b.f31276a)) {
            bVar = new C12814b(a, aVar, C66658c.INSTANCE, new C66659d(this), new C66660e(this), new C66661f(this), gVar);
        } else {
            throw new IllegalArgumentException("Don't support this VMScope: " + dVar + " there");
        }
        this.f149829a = bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.powerlist.RecommendPermissionCell$o */
    public static final class C66670o implements AbstractC74788j {

        /* renamed from: a */
        final /* synthetic */ RecommendPermissionCell f149838a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f149839b;

        static {
            Covode.recordClassIndex(78237);
        }

        @Override // com.p2082ss.android.ugc.aweme.social.widget.card.AbstractC74788j
        /* renamed from: d */
        public final void mo86630d(int i) {
        }

        @Override // com.p2082ss.android.ugc.aweme.social.widget.card.AbstractC74788j
        /* renamed from: a */
        public final void mo86627a(User user) {
            C89219l.m154721d(user, "");
            C89219l.m154721d(user, "");
        }

        @Override // com.p2082ss.android.ugc.aweme.social.widget.card.AbstractC74788j
        /* renamed from: a */
        public final void mo86629a(EnumC74790k kVar) {
            C89219l.m154721d(kVar, "");
            C89219l.m154721d(kVar, "");
        }

        C66670o(RecommendPermissionCell recommendPermissionCell, ViewGroup viewGroup) {
            this.f149838a = recommendPermissionCell;
            this.f149839b = viewGroup;
        }

        @Override // com.p2082ss.android.ugc.aweme.social.widget.card.AbstractC74788j
        /* renamed from: a */
        public final void mo86628a(EnumC74761f fVar, EnumC74760e eVar, List<? extends User> list) {
            int adapterPosition;
            C89219l.m154721d(fVar, "");
            C89219l.m154721d(eVar, "");
            if (eVar == EnumC74760e.ON_AUTHORIZE) {
                if (fVar == EnumC74761f.CONTACT) {
                    adapterPosition = this.f149838a.getAdapterPosition() - 1;
                } else {
                    adapterPosition = this.f149838a.getAdapterPosition();
                }
                UserProfilePublishListRecommendUserVM userProfilePublishListRecommendUserVM = (UserProfilePublishListRecommendUserVM) this.f149838a.f149829a.getValue();
                Context context = this.f149839b.getContext();
                C89219l.m154716b(context, "");
                C89219l.m154721d(fVar, "");
                C89219l.m154721d(context, "");
                C89233z.C89236c cVar = new C89233z.C89236c();
                cVar.element = adapterPosition;
                if (fVar == EnumC74761f.FACEBOOK) {
                    C51648a aVar = C51648a.f118980a;
                    User b = C80580in.m139683b();
                    C89219l.m154716b(b, "");
                    String uid = b.getUid();
                    C89219l.m154716b(uid, "");
                    AbstractC88412b a = aVar.mo87301a(uid, 6).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new UserProfilePublishListRecommendUserVM.C66700e(userProfilePublishListRecommendUserVM, context, cVar, adapterPosition), new UserProfilePublishListRecommendUserVM.C66701f(context));
                    C89219l.m154716b(a, "");
                    C88934a.m154195a(a, userProfilePublishListRecommendUserVM.f149864k);
                } else if (fVar == EnumC74761f.CONTACT) {
                    AbstractC88412b a2 = C51648a.f118980a.mo87314b(6).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new UserProfilePublishListRecommendUserVM.C66702g(userProfilePublishListRecommendUserVM, context, cVar, adapterPosition), new UserProfilePublishListRecommendUserVM.C66703h(context));
                    C89219l.m154716b(a2, "");
                    C88934a.m154195a(a2, userProfilePublishListRecommendUserVM.f149864k);
                }
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final View mo23349a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        C74787i iVar = C74787i.f168102a;
        Context context = viewGroup.getContext();
        Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        return iVar.mo117802a(new C74743a((ActivityC0945e) context, null, null, null, 14), 1, new C74765i.C74766a().mo117828a(C89041ag.m154412a(C89387v.m154943a("enter_from", "others_homepage"))).mo117824a(new C74762g(C89041ag.m154421a(C89387v.m154943a(EnumC74761f.CONTACT, EnumC74754a.RECTANGLE), C89387v.m154943a(EnumC74761f.FACEBOOK, EnumC74754a.RECTANGLE)))).mo117826a(new C66670o(this, viewGroup)).mo117829a());
    }
}
