package com.p2082ss.android.ugc.aweme.following.p3003ui;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import androidx.viewpager.widget.ViewPager;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.tablayout.DmtTabLayout;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20371ai;
import com.bytedance.jedi.ext.adapter.C20624b;
import com.bytedance.keva.Keva;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.arch.AbstractC34488b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.p2634f.C39115e;
import com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50540h;
import com.p2082ss.android.ugc.aweme.following.p3003ui.adapter.C51186c;
import com.p2082ss.android.ugc.aweme.following.p3003ui.viewmodel.FollowRelationState;
import com.p2082ss.android.ugc.aweme.following.p3003ui.viewmodel.FollowRelationTabViewModel;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.friends.service.C51648a;
import com.p2082ss.android.ugc.aweme.i18n.C53437b;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.C63973ae;
import com.p2082ss.android.ugc.aweme.recommend.users.C66652b;
import com.p2082ss.android.ugc.aweme.userservice.UserService;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.following.ui.b */
public final class View$OnClickListenerC51194b extends AbstractC34488b implements View.OnClickListener, ViewPager.AbstractC1579e, ScrollableLayout.AbstractC39210b {

    /* renamed from: n */
    public static final C51196b f118087n = new C51196b((byte) 0);

    /* renamed from: b */
    public boolean f118088b;

    /* renamed from: c */
    public String f118089c;

    /* renamed from: d */
    public User f118090d;

    /* renamed from: e */
    public int f118091e;

    /* renamed from: j */
    public int f118092j;

    /* renamed from: k */
    public int f118093k;

    /* renamed from: l */
    public final List<String> f118094l = new ArrayList();

    /* renamed from: m */
    public List<String> f118095m = new ArrayList();

    /* renamed from: o */
    private C51186c f118096o;

    /* renamed from: p */
    private String f118097p;

    /* renamed from: q */
    private boolean f118098q = true;

    /* renamed from: r */
    private final List<Fragment> f118099r = new ArrayList();

    /* renamed from: s */
    private final AbstractC89244h f118100s;

    /* renamed from: t */
    private SparseArray f118101t;

    static {
        Covode.recordClassIndex(60397);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.arch.AbstractC34488b
    /* renamed from: a */
    public final View mo60929a(int i) {
        if (this.f118101t == null) {
            this.f118101t = new SparseArray();
        }
        View view = (View) this.f118101t.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f118101t.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.arch.AbstractC34488b
    /* renamed from: a */
    public final void mo60930a() {
        SparseArray sparseArray = this.f118101t;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.AbstractC39210b
    /* renamed from: a */
    public final void mo62628a(float f, float f2) {
    }

    @Override // com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.AbstractC39210b
    public final boolean av_() {
        return false;
    }

    /* renamed from: b */
    public final FollowRelationTabViewModel mo86613b() {
        return (FollowRelationTabViewModel) this.f118100s.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.AbstractC39210b
    /* renamed from: b */
    public final void mo62635b(int i, int i2) {
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.arch.AbstractC34488b
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo60930a();
    }

    @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
    public final void onPageScrolled(int i, float f, int i2) {
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.b$b */
    public static final class C51196b {
        static {
            Covode.recordClassIndex(60399);
        }

        private C51196b() {
        }

        public /* synthetic */ C51196b(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        User user = this.f118090d;
        if (user != null) {
            this.f118092j = user.getFollowingCount();
            this.f118093k = m95605a(user);
        }
        mo86614c();
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.b$a */
    public static final class C51195a extends AbstractC89220m implements AbstractC89171a<FollowRelationTabViewModel> {

        /* renamed from: a */
        final /* synthetic */ Fragment f118102a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f118103b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f118104c;

        static {
            Covode.recordClassIndex(60398);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C51195a(Fragment fragment, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f118102a = fragment;
            this.f118103b = cVar;
            this.f118104c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationTabViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.following.p3003ui.viewmodel.FollowRelationTabViewModel invoke() {
            /*
                r3 = this;
                androidx.fragment.app.Fragment r0 = r3.f118102a
                androidx.fragment.app.e r1 = r0.requireActivity()
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a
                androidx.lifecycle.ad r2 = androidx.lifecycle.C1181ae.m3881a(r1, r0)
                h.k.c r0 = r3.f118104c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                java.lang.String r1 = r0.getName()
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154709a(r1, r0)
                h.k.c r0 = r3.f118103b
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r0 = m95614xe1bf327c(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.following.p3003ui.View$OnClickListenerC51194b.C51195a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_following_ui_FollowRelationTabFragment$$special$$inlined$activityViewModel$1_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m95614xe1bf327c(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    public View$OnClickListenerC51194b() {
        AbstractC89277c a = C89204ab.m154669a(FollowRelationTabViewModel.class);
        this.f118100s = C89250i.m154773a((AbstractC89171a) new C51195a(this, a, a));
    }

    /* renamed from: e */
    private final void m95607e() {
        if (!this.f118088b || C51648a.f118980a.mo87338r()) {
            TuxIconView tuxIconView = (TuxIconView) mo60929a(R.id.gq);
            C89219l.m154716b(tuxIconView, "");
            tuxIconView.setVisibility(8);
            return;
        }
        TuxIconView tuxIconView2 = (TuxIconView) mo60929a(R.id.gq);
        C89219l.m154716b(tuxIconView2, "");
        tuxIconView2.setVisibility(0);
    }

    /* renamed from: c */
    public final void mo86614c() {
        int i;
        View view;
        View view2;
        DmtTabLayout dmtTabLayout = (DmtTabLayout) mo60929a(R.id.ee7);
        C51186c cVar = this.f118096o;
        if (cVar == null) {
            C89219l.m154710a("mAdapter");
        }
        Iterator<Fragment> it = cVar.f118068b.iterator();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = -1;
            if (!it.hasNext()) {
                i3 = -1;
                break;
            } else if (it.next() instanceof C51274p) {
                break;
            } else {
                i3++;
            }
        }
        DmtTabLayout.C17294f b = dmtTabLayout.mo27529b(i3);
        TextView textView = null;
        if (b != null) {
            view = b.f41525f;
        } else {
            view = null;
        }
        if (!(view instanceof TextView)) {
            view = null;
        }
        TextView textView2 = (TextView) view;
        if (textView2 != null) {
            textView2.setText(C17867d.m33078a().getString(R.string.bzd) + " " + C53437b.m98615a((long) this.f118092j));
        }
        DmtTabLayout dmtTabLayout2 = (DmtTabLayout) mo60929a(R.id.ee7);
        C51186c cVar2 = this.f118096o;
        if (cVar2 == null) {
            C89219l.m154710a("mAdapter");
        }
        Iterator<Fragment> it2 = cVar2.f118068b.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            } else if (it2.next() instanceof C51222g) {
                i = i2;
                break;
            } else {
                i2++;
            }
        }
        DmtTabLayout.C17294f b2 = dmtTabLayout2.mo27529b(i);
        if (b2 != null) {
            view2 = b2.f41525f;
        } else {
            view2 = null;
        }
        if (view2 instanceof TextView) {
            textView = view2;
        }
        TextView textView3 = textView;
        if (textView3 != null) {
            textView3.setText(C17867d.m33078a().getString(R.string.bz_) + " " + C53437b.m98615a((long) this.f118093k));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.b$c */
    static final class C51197c implements DmtTabLayout.AbstractC17288b {

        /* renamed from: a */
        public static final C51197c f118105a = new C51197c();

        static {
            Covode.recordClassIndex(60400);
        }

        C51197c() {
        }

        @Override // com.bytedance.ies.dmt.p1194ui.widget.tablayout.DmtTabLayout.AbstractC17288b
        /* renamed from: a */
        public final void mo27573a(DmtTabLayout.C17294f fVar) {
            if (fVar != null) {
                fVar.f41520a = "from_click";
            }
            fVar.mo27592a();
        }
    }

    /* renamed from: a */
    public static int m95605a(User user) {
        if (C63973ae.m115689a(user)) {
            return user.getFansCount();
        }
        return user.getFollowerCount();
    }

    /* renamed from: b */
    private static String m95606b(int i) {
        return "android:switcher:2131370289:" + i;
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.b$h */
    static final class C51203h extends AbstractC89220m implements AbstractC89172b<FollowRelationState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC51194b f118111a;

        /* renamed from: b */
        final /* synthetic */ View f118112b;

        static {
            Covode.recordClassIndex(60406);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51203h(View$OnClickListenerC51194b bVar, View view) {
            super(1);
            this.f118111a = bVar;
            this.f118112b = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(FollowRelationState followRelationState) {
            C89219l.m154721d(followRelationState, "");
            if (this.f118111a.getActivity() instanceof FollowRelationTabActivity) {
                C39115e.m79412a(this.f118111a.getActivity(), this.f118111a.mo60929a(R.id.pi));
                ActivityC0945e activity = this.f118111a.getActivity();
                if (activity == null) {
                    C89219l.m154715b();
                }
                activity.finish();
            } else {
                this.f118111a.onDestroy();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.b$g */
    static final class C51202g<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC51194b f118110a;

        static {
            Covode.recordClassIndex(60405);
        }

        C51202g(View$OnClickListenerC51194b bVar) {
            this.f118110a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            User curUser = g.getCurUser();
            String str = this.f118110a.f118089c;
            C89219l.m154716b(curUser, "");
            if (C89219l.m154714a((Object) str, (Object) curUser.getUid())) {
                this.f118110a.f118092j = curUser.getFollowingCount();
                User user = this.f118110a.f118090d;
                if (user != null) {
                    user.setFollowingCount(this.f118110a.f118092j);
                }
                C51423a.m95784a(4, "FollowRelationTabFragment", C80580in.m139699l(curUser));
                this.f118110a.mo86614c();
            }
        }
    }

    public final void onClick(View view) {
        String str;
        ClickAgent.onClick(view);
        if (view != null) {
            int id = view.getId();
            if (id == R.id.pi) {
                withState(mo86613b(), new C51203h(this, view));
            } else if (id == R.id.gq) {
                ViewPager viewPager = (ViewPager) mo60929a(R.id.fgn);
                C89219l.m154716b(viewPager, "");
                if (viewPager.getCurrentItem() == 0) {
                    str = "following";
                } else {
                    str = "fans";
                }
                SmartRouter.buildRoute(getActivity(), "//friends/find").withParam("previous_page", str).open();
                C39162r.m79460a("click_add_friends", new C33744d().mo59983a("enter_from", str).f79943a);
            }
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d7, code lost:
        if (r3.equals(r1) != false) goto L_0x004a;
     */
    @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onPageSelected(int r7) {
        /*
        // Method dump skipped, instructions count: 272
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.following.p3003ui.View$OnClickListenerC51194b.onPageSelected(int):void");
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.b$f */
    static final class C51200f extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC51194b f118108a;

        static {
            Covode.recordClassIndex(60403);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51200f(View$OnClickListenerC51194b bVar) {
            super(2);
            this.f118108a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, String str) {
            AbstractC20477i iVar2 = iVar;
            C89219l.m154721d(iVar2, "");
            C89219l.m154721d(str, "");
            iVar2.withState(this.f118108a.mo86613b(), new AbstractC89172b<FollowRelationState, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.following.p3003ui.View$OnClickListenerC51194b.C51200f.C512011 */

                /* renamed from: a */
                final /* synthetic */ C51200f f118109a;

                static {
                    Covode.recordClassIndex(60404);
                }

                {
                    this.f118109a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(FollowRelationState followRelationState) {
                    FollowRelationState followRelationState2 = followRelationState;
                    C89219l.m154721d(followRelationState2, "");
                    int indexOf = this.f118109a.f118108a.f118095m.indexOf(followRelationState2.getTabIndex());
                    if (indexOf > 0) {
                        ViewPager viewPager = (ViewPager) this.f118109a.f118108a.mo60929a(R.id.fgn);
                        C89219l.m154716b(viewPager, "");
                        viewPager.setCurrentItem(indexOf);
                    }
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.b$e */
    static final class C51199e extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC51194b f118107a;

        static {
            Covode.recordClassIndex(60402);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51199e(View$OnClickListenerC51194b bVar) {
            super(2);
            this.f118107a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Integer num) {
            num.intValue();
            C89219l.m154721d(iVar, "");
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            User curUser = g.getCurUser();
            String str = this.f118107a.f118089c;
            C89219l.m154716b(curUser, "");
            if (C89219l.m154714a((Object) str, (Object) curUser.getUid())) {
                View$OnClickListenerC51194b bVar = this.f118107a;
                IAccountUserService g2 = C31575b.m65865g();
                C89219l.m154716b(g2, "");
                User curUser2 = g2.getCurUser();
                C89219l.m154716b(curUser2, "");
                bVar.f118093k = View$OnClickListenerC51194b.m95605a(curUser2);
                User user = this.f118107a.f118090d;
                if (user != null) {
                    user.setFollowerCount(this.f118107a.f118093k);
                }
                C51423a.m95784a(4, "FollowRelationTabFragment", C80580in.m139699l(curUser));
                this.f118107a.mo86614c();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.b$d */
    static final class C51198d extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC51194b f118106a;

        static {
            Covode.recordClassIndex(60401);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51198d(View$OnClickListenerC51194b bVar) {
            super(2);
            this.f118106a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Integer num) {
            User user;
            View view;
            int intValue = num.intValue();
            C89219l.m154721d(iVar, "");
            if (intValue > 0 && !this.f118106a.f118088b && (user = this.f118106a.f118090d) != null && !TextUtils.isEmpty(user.getRecommendReasonRelation()) && Pattern.compile("<b>").matcher(user.getRecommendReasonRelation()).find()) {
                this.f118106a.f118091e = intValue;
                this.f118106a.f118094l.set(0, C17867d.m33078a().getString(R.string.asc) + " " + C53437b.m98615a((long) intValue));
                DmtTabLayout.C17294f b = ((DmtTabLayout) this.f118106a.mo60929a(R.id.ee7)).mo27529b(0);
                if (b != null) {
                    view = b.f41525f;
                } else {
                    view = null;
                }
                if (view instanceof TextView) {
                    ((TextView) view).setText(this.f118106a.f118094l.get(0));
                }
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean g;
        String str;
        Resources resources;
        int i;
        boolean z;
        String str2;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f118089c = arguments.getString("uid");
            this.f118097p = arguments.getString("follow_relation_type");
        }
        String str3 = this.f118089c;
        IAccountUserService g2 = C31575b.m65865g();
        C89219l.m154716b(g2, "");
        this.f118088b = TextUtils.equals(str3, g2.getCurUserId());
        User user = C50540h.f116811c;
        this.f118090d = user;
        if (user != null) {
            this.f118092j = user.getFollowingCount();
            this.f118093k = m95605a(user);
        }
        User user2 = this.f118090d;
        if (user2 != null) {
            if (!TextUtils.isEmpty(C80580in.m139684b(user2))) {
                TuxTextView tuxTextView = (TuxTextView) mo60929a(R.id.title_tv);
                C89219l.m154716b(tuxTextView, "");
                tuxTextView.setText(C80580in.m139684b(user2));
            } else {
                TuxTextView tuxTextView2 = (TuxTextView) mo60929a(R.id.title_tv);
                C89219l.m154716b(tuxTextView2, "");
                tuxTextView2.setText(user2.getNickname());
            }
        }
        this.f118099r.clear();
        Fragment a = getChildFragmentManager().mo3551a(m95606b(this.f118099r.size()));
        if (a == null) {
            a = new C51274p();
        }
        a.setArguments(getArguments());
        this.f118099r.add(a);
        this.f118094l.add(C17867d.m33078a().getString(R.string.bzd) + " " + C53437b.m98615a((long) this.f118092j));
        this.f118095m.add("following_relation");
        Fragment a2 = getChildFragmentManager().mo3551a(m95606b(this.f118099r.size()));
        if (a2 == null) {
            a2 = new C51222g();
        }
        a2.setArguments(getArguments());
        this.f118099r.add(a2);
        this.f118094l.add(C17867d.m33078a().getString(R.string.bz_) + " " + C53437b.m98615a((long) this.f118093k));
        this.f118095m.add("follower_relation");
        if (!C66652b.f149825a.mo105656b()) {
            if (this.f118088b) {
                g = C66652b.f149825a.mo105659e();
            } else {
                g = C66652b.f149825a.mo105661g();
            }
            if (g) {
                Fragment a3 = getChildFragmentManager().mo3551a(m95606b(this.f118099r.size()));
                if (a3 == null) {
                    a3 = new C51398z();
                }
                a3.setArguments(getArguments());
                this.f118099r.add(a3);
                List<String> list = this.f118094l;
                ActivityC0945e activity = getActivity();
                if (activity == null || (resources = activity.getResources()) == null || (str = resources.getString(R.string.g8f)) == null) {
                    str = "";
                }
                C89219l.m154716b(str, "");
                list.add(str);
                this.f118095m.add("suggest_user");
            }
        }
        AbstractC0952i childFragmentManager = getChildFragmentManager();
        C89219l.m154716b(childFragmentManager, "");
        this.f118096o = new C51186c(childFragmentManager, this.f118099r, this.f118094l);
        ViewPager viewPager = (ViewPager) mo60929a(R.id.fgn);
        C89219l.m154716b(viewPager, "");
        C51186c cVar = this.f118096o;
        if (cVar == null) {
            C89219l.m154710a("mAdapter");
        }
        viewPager.setAdapter(cVar);
        ((ViewPager) mo60929a(R.id.fgn)).addOnPageChangeListener(this);
        ViewPager viewPager2 = (ViewPager) mo60929a(R.id.fgn);
        C89219l.m154716b(viewPager2, "");
        viewPager2.setOffscreenPageLimit(3);
        if (C89070n.m154556a((Iterable) this.f118095m, (Object) this.f118097p)) {
            i = C89070n.m154546a((List) this.f118095m, (Object) this.f118097p);
        } else {
            i = 0;
        }
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f118098q = z;
        ViewPager viewPager3 = (ViewPager) mo60929a(R.id.fgn);
        C89219l.m154716b(viewPager3, "");
        viewPager3.setCurrentItem(i);
        C51186c cVar2 = this.f118096o;
        if (cVar2 == null) {
            C89219l.m154710a("mAdapter");
        }
        cVar2.mo86609c(i);
        m95607e();
        mo86613b().mo86732b(TextUtils.equals(this.f118095m.get(i), "following_relation"));
        DmtTabLayout dmtTabLayout = (DmtTabLayout) mo60929a(R.id.ee7);
        C89219l.m154716b(dmtTabLayout, "");
        ((DmtTabLayout) mo60929a(R.id.ee7)).setBackgroundColor(C0643b.m2378c(dmtTabLayout.getContext(), R.color.nc));
        ((DmtTabLayout) mo60929a(R.id.ee7)).setCustomTabViewResId(R.layout.ant);
        ((DmtTabLayout) mo60929a(R.id.ee7)).setAutoFillWhenScrollable(true);
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        int a4 = C89241a.m154730a(TypedValue.applyDimension(1, 12.0f, system.getDisplayMetrics()));
        Resources system2 = Resources.getSystem();
        C89219l.m154709a((Object) system2, "");
        ((DmtTabLayout) mo60929a(R.id.ee7)).mo27519a(a4, C89241a.m154730a(TypedValue.applyDimension(1, 12.0f, system2.getDisplayMetrics())));
        ((DmtTabLayout) mo60929a(R.id.ee7)).setupWithViewPager((ViewPager) mo60929a(R.id.fgn));
        ((DmtTabLayout) mo60929a(R.id.ee7)).setOnTabClickListener(C51197c.f118105a);
        ((TuxIconView) mo60929a(R.id.pi)).setOnClickListener(this);
        ((TuxIconView) mo60929a(R.id.gq)).setOnClickListener(this);
        if (C89219l.m154714a((Object) this.f118095m.get(i), (Object) "following_relation")) {
            str2 = "following_list";
        } else {
            str2 = "follower_list";
        }
        C51648a.f118980a.mo87304a(3, str2, "auto", C20624b.m38846b(this));
        StringBuilder sb = new StringBuilder("permission_dialog");
        IAccountUserService g3 = C31575b.m65865g();
        C89219l.m154716b(g3, "");
        Keva.getRepo(sb.append(g3.getCurUserId()).toString()).storeBoolean("is_my_self", this.f118088b);
        AbstractC88412b unused = selectSubscribe(mo86613b(), C51204c.f118113a, new C20370ah(), new C51198d(this));
        FollowRelationTabViewModel b = mo86613b();
        AbstractC89290k kVar = C51219d.f118143a;
        C20370ah ahVar = new C20370ah();
        ahVar.f48254e = false;
        ahVar.f48253d = true;
        selectSubscribe(b, kVar, ahVar, new C51199e(this));
        selectSubscribe(mo86613b(), C51220e.f118144a, C20371ai.m38578b(), new C51200f(this));
        UserService.m138861d().mo123566b().observe(this, new C51202g(this));
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        return C1764a.m5927a(layoutInflater, R.layout.an3, viewGroup, false);
    }
}
