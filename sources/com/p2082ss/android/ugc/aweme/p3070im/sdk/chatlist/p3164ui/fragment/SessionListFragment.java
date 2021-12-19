package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3164ui.fragment;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.p025c.C0484a;
import androidx.recyclerview.widget.C1428g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.ies.foundation.fragment.BaseFragmentViewModel;
import com.bytedance.ies.foundation.fragment.C17372a;
import com.bytedance.ies.p1208im.core.api.C17419b;
import com.bytedance.ies.p1208im.core.api.p1213c.AbstractC17446a;
import com.bytedance.ies.powerpage.AbstractC17736b;
import com.bytedance.ies.powerpage.AbstractC17738c;
import com.bytedance.ies.powerpage.p1235a.AbstractC17735a;
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
import com.bytedance.keva.Keva;
import com.bytedance.nita.p1555c.HandlerC21534a;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.router.arg.RouteArgInjector;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.status.TuxStatusView;
import com.bytedance.tux.tooltip.C23342c;
import com.bytedance.tux.tooltip.EnumC23352h;
import com.bytedance.tux.tooltip.p1727a.p1729b.C23329a;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34478k;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.emoji.p2898c.C46455a;
import com.p2082ss.android.ugc.aweme.emoji.sysemoji.C46597h;
import com.p2082ss.android.ugc.aweme.emoji.systembigemoji.C46616a;
import com.p2082ss.android.ugc.aweme.framework.p3007b.C51425a;
import com.p2082ss.android.ugc.aweme.friends.AbstractC51485d;
import com.p2082ss.android.ugc.aweme.friends.service.C51648a;
import com.p2082ss.android.ugc.aweme.friends.service.FriendsServiceImpl;
import com.p2082ss.android.ugc.aweme.friends.service.IFriendsService;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.metrics.C59256u;
import com.p2082ss.android.ugc.aweme.music.p3481ui.C61156d;
import com.p2082ss.android.ugc.aweme.notice.api.C61542b;
import com.p2082ss.android.ugc.aweme.p2304af.C33429a;
import com.p2082ss.android.ugc.aweme.p2436cc.C35434c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.TopChatNoticeSourceType;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.selectmsg.C54314c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.p3083c.C53697j;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.controller.helper.C54883e;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.controller.helper.SessionListNavArg;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.controller.p3150b.C54868b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.recommend.p3154a.p3155a.C54916a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.recommend.p3156b.p3157a.C54919a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.recommend.p3159c.p3160a.C54922a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.recommend.p3159c.p3161b.C54931b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.recommend.viewmodel.RecommendFriendInDMViewModel;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.topnotice.p3163ui.C54956a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.topnotice.p3163ui.EnumC54957b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.topnotice.viewmodel.SessionListTopNoticeViewModel;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3145a.C54823a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3145a.C54833b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3164ui.p3166b.C55000a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3164ui.p3168d.C55004a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3170a.C55050c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55076b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55097i;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55102l;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3177h.p3179b.AbstractC55147b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55197c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55213i;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55231t;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.ImTextTitleBar;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.p3198a.C55341b;
import com.p2082ss.android.ugc.aweme.p3070im.service.IIMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3251b.C56195b;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3251b.C56196c;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.push.C65691a;
import com.p2082ss.android.ugc.aweme.recommend.C66623g;
import com.p2082ss.android.ugc.aweme.recommend.users.IRecommendUsersService;
import com.p2082ss.android.ugc.aweme.recommend.users.IRecommendUsersServiceImpl;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4166g.C79440a;
import com.p2082ss.android.ugc.aweme.utils.C80330da;
import com.p2082ss.android.ugc.aweme.utils.C80409eu;
import com.p2082ss.android.ugc.aweme.utils.C80428fg;
import com.p2082ss.android.ugc.aweme.utils.C80440fo;
import com.p2082ss.android.ugc.aweme.utils.C80538hl;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89517an;
import kotlinx.coroutines.C89536ay;
import kotlinx.coroutines.C89624i;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89290k;
import p4600h.p4622m.C89361p;

@AbstractC17735a(mo28211a = SessionListFragment$$Activity.class)
/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.ui.fragment.SessionListFragment */
public final class SessionListFragment extends C17372a implements AbstractC17736b, AbstractC20527q, AbstractC34478k<User>, C54931b.AbstractC54932a, AbstractC90252i, AbstractC90253j {

    /* renamed from: i */
    public static final C55019a f125945i = new C55019a((byte) 0);

    /* renamed from: e */
    public C55004a f125946e;

    /* renamed from: f */
    public String f125947f = "";

    /* renamed from: g */
    public final SessionListTopNoticeViewModel f125948g = new SessionListTopNoticeViewModel(null, null, null, null, null, null, 63);

    /* renamed from: h */
    public final RecommendFriendInDMViewModel f125949h = new RecommendFriendInDMViewModel();

    /* renamed from: j */
    private final C53697j f125950j = new C53697j();

    /* renamed from: k */
    private final C54883e f125951k = new C54883e();

    /* renamed from: l */
    private final AbstractC89244h f125952l = RouteArgExtension.INSTANCE.navArg(this);

    /* renamed from: m */
    private final AbstractC89244h f125953m = C89250i.m154773a((AbstractC89171a) C55034n.f125974a);

    /* renamed from: n */
    private final AbstractC89244h f125954n = C89250i.m154773a((AbstractC89171a) new C55026h(this));

    /* renamed from: o */
    private final AbstractC89244h f125955o = C89250i.m154773a((AbstractC89171a) new C55047w(this));

    /* renamed from: p */
    private final AbstractC89244h f125956p = C89250i.m154773a((AbstractC89171a) new C55044u(this));

    /* renamed from: q */
    private final AbstractC89244h f125957q = C89250i.m154773a((AbstractC89171a) new C55040r(this));

    /* renamed from: r */
    private final AbstractC89244h f125958r = C89250i.m154773a((AbstractC89171a) new C55025g(this));

    /* renamed from: s */
    private final RecyclerView.AbstractC1371n f125959s = new C55043t(this);

    /* renamed from: t */
    private HashMap f125960t;

    static {
        Covode.recordClassIndex(64745);
    }

    /* renamed from: h */
    private final SessionListNavArg m100643h() {
        return (SessionListNavArg) this.f125952l.getValue();
    }

    /* renamed from: i */
    private final C55341b m100644i() {
        return (C55341b) this.f125954n.getValue();
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a
    /* renamed from: a */
    public final View mo27715a(int i) {
        if (this.f125960t == null) {
            this.f125960t = new HashMap();
        }
        View view = (View) this.f125960t.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f125960t.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34478k
    /* renamed from: a */
    public final void mo60911a(FollowStatus followStatus, String str, String str2) {
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a
    public final void bx_() {
        HashMap hashMap = this.f125960t;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a
    /* renamed from: c */
    public final Keva mo64296c() {
        return (Keva) this.f125953m.getValue();
    }

    /* renamed from: d */
    public final C54956a mo91976d() {
        return (C54956a) this.f125955o.getValue();
    }

    /* renamed from: e */
    public final C55000a mo91977e() {
        return (C55000a) this.f125956p.getValue();
    }

    /* renamed from: f */
    public final C54922a mo91978f() {
        return (C54922a) this.f125957q.getValue();
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(63, new RunnableC90250g(SessionListFragment.class, "onRefreshMessageButton", C56196c.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // com.bytedance.ies.powerpage.AbstractC17736b
    public final void onActivityResult_Activity(int i, int i2, Intent intent) {
        AbstractC17738c.m32873a(this, i, i2, intent);
    }

    @Override // com.bytedance.ies.powerpage.AbstractC17736b
    public final void onBackPressed_Activity() {
        AbstractC17738c.m32872a(this);
    }

    @Override // com.bytedance.ies.powerpage.AbstractC17736b
    public final void onBeforeActivityCreated(Activity activity) {
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.ui.fragment.SessionListFragment$a */
    public static final class C55019a {
        static {
            Covode.recordClassIndex(64747);
        }

        private C55019a() {
        }

        public /* synthetic */ C55019a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.ui.fragment.SessionListFragment$j */
    public static final class C55028j extends RecyclerView.AbstractC1371n {
        static {
            Covode.recordClassIndex(64756);
        }

        C55028j() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4753a(RecyclerView recyclerView, int i) {
            C89219l.m154721d(recyclerView, "");
            super.mo4753a(recyclerView, i);
            if (i == 0) {
                C55097i.m100774c();
            }
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

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.ui.fragment.SessionListFragment$n */
    static final class C55034n extends AbstractC89220m implements AbstractC89171a<Keva> {

        /* renamed from: a */
        public static final C55034n f125974a = new C55034n();

        static {
            Covode.recordClassIndex(64762);
        }

        C55034n() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepo("im_session_group_repo");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C55231t.m100998a();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.ui.fragment.SessionListFragment$v */
    static final class RunnableC55045v implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SessionListFragment f125987a;

        static {
            Covode.recordClassIndex(64773);
        }

        RunnableC55045v(SessionListFragment sessionListFragment) {
            this.f125987a = sessionListFragment;
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.ui.fragment.SessionListFragment$v$a */
        public static final class C55046a implements C23342c.AbstractC23345c {

            /* renamed from: a */
            final /* synthetic */ RunnableC55045v f125988a;

            static {
                Covode.recordClassIndex(64774);
            }

            @Override // com.bytedance.tux.tooltip.C23342c.AbstractC23345c
            public final void onShow() {
                this.f125988a.f125987a.mo64296c().storeBoolean("im_key_guide_show", true);
            }

            C55046a(RunnableC55045v vVar) {
                this.f125988a = vVar;
            }
        }

        public final void run() {
            if (this.f125987a.getContext() != null && (!this.f125987a.mo64296c().getBoolean("im_key_guide_show", false))) {
                Context context = this.f125987a.getContext();
                if (context == null) {
                    C89219l.m154715b();
                }
                C89219l.m154716b(context, "");
                C23329a aVar = new C23329a(context);
                ImTextTitleBar imTextTitleBar = (ImTextTitleBar) this.f125987a.mo27715a(R.id.eiz);
                C89219l.m154716b(imTextTitleBar, "");
                View rightView = imTextTitleBar.getRightView();
                C89219l.m154716b(rightView, "");
                ((C23329a) aVar.mo38041b(rightView).mo38027a().mo38034a(EnumC23352h.BOTTOM)).mo38023e(R.string.c8e).mo38033a(new C55046a(this)).mo38012d().mo38001a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.ui.fragment.SessionListFragment$i */
    static final class RunnableC55027i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SessionListFragment f125968a;

        static {
            Covode.recordClassIndex(64755);
        }

        RunnableC55027i(SessionListFragment sessionListFragment) {
            this.f125968a = sessionListFragment;
        }

        public final void run() {
            SessionListFragment.m100642a(this.f125968a).mo91960a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.ui.fragment.SessionListFragment$m */
    public static final class C55033m implements ImTextTitleBar.AbstractC55309a {

        /* renamed from: a */
        final /* synthetic */ SessionListFragment f125973a;

        static {
            Covode.recordClassIndex(64761);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.ImTextTitleBar.AbstractC55309a
        /* renamed from: b */
        public final void mo91164b() {
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.ImTextTitleBar.AbstractC55309a
        /* renamed from: c */
        public final void mo91165c() {
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.ImTextTitleBar.AbstractC55309a
        /* renamed from: a */
        public final void mo91162a() {
            ActivityC0945e activity = this.f125973a.getActivity();
            if (activity != null) {
                activity.finish();
                C65691a.m117584a(activity);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C55033m(SessionListFragment sessionListFragment) {
            this.f125973a = sessionListFragment;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.ImTextTitleBar.AbstractC55309a
        /* renamed from: a */
        public final void mo91163a(int i) {
            SessionListFragment sessionListFragment = this.f125973a;
            IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
            Context requireContext = sessionListFragment.requireContext();
            C89219l.m154716b(requireContext, "");
            createIIMServicebyMonsterPlugin.enterCreateChatPage(requireContext, new Bundle());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.ui.fragment.SessionListFragment$r */
    static final class C55040r extends AbstractC89220m implements AbstractC89171a<C54922a> {

        /* renamed from: a */
        final /* synthetic */ SessionListFragment f125982a;

        static {
            Covode.recordClassIndex(64768);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55040r(SessionListFragment sessionListFragment) {
            super(0);
            this.f125982a = sessionListFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C54922a invoke() {
            return new C54922a(this.f125982a.f125949h);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.ui.fragment.SessionListFragment$w */
    static final class C55047w extends AbstractC89220m implements AbstractC89171a<C54956a> {

        /* renamed from: a */
        final /* synthetic */ SessionListFragment f125989a;

        static {
            Covode.recordClassIndex(64775);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55047w(SessionListFragment sessionListFragment) {
            super(0);
            this.f125989a = sessionListFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C54956a invoke() {
            return new C54956a(TopChatNoticeSourceType.INBOX, this.f125989a.f125948g);
        }
    }

    /* renamed from: j */
    private static boolean m100645j() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.ui.fragment.SessionListFragment$h */
    static final class C55026h extends AbstractC89220m implements AbstractC89171a<C55341b> {

        /* renamed from: a */
        final /* synthetic */ SessionListFragment f125967a;

        static {
            Covode.recordClassIndex(64754);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55026h(SessionListFragment sessionListFragment) {
            super(0);
            this.f125967a = sessionListFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C55341b invoke() {
            ActivityC0945e requireActivity = this.f125967a.requireActivity();
            C89219l.m154716b(requireActivity, "");
            return new C55341b(requireActivity);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.ui.fragment.SessionListFragment$u */
    static final class C55044u extends AbstractC89220m implements AbstractC89171a<C55000a> {

        /* renamed from: a */
        final /* synthetic */ SessionListFragment f125986a;

        static {
            Covode.recordClassIndex(64772);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55044u(SessionListFragment sessionListFragment) {
            super(0);
            this.f125986a = sessionListFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C55000a invoke() {
            ActivityC0945e requireActivity = this.f125986a.requireActivity();
            C89219l.m154716b(requireActivity, "");
            return new C55000a(new C54868b(requireActivity, "chat_list", ""));
        }
    }

    /* renamed from: k */
    private static boolean m100646k() {
        if (C58029j.f132253e && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132253e;
        }
        boolean j = m100645j();
        C58029j.f132253e = j;
        return j;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.ui.fragment.SessionListFragment$k */
    public static final class C55029k implements C80440fo.AbstractC80442a {

        /* renamed from: a */
        final /* synthetic */ SessionListFragment f125969a;

        static {
            Covode.recordClassIndex(64757);
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.ui.fragment.SessionListFragment$k$a */
        static final class RunnableC55030a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C54919a f125970a;

            static {
                Covode.recordClassIndex(64758);
            }

            RunnableC55030a(C54919a aVar) {
                this.f125970a = aVar;
            }

            public final void run() {
                IFriendsService u = FriendsServiceImpl.m96115u();
                boolean z = true;
                if (this.f125970a.f125729c == 1) {
                    C54833b.m100430a("contact", u.mo87322d().mo86984c());
                    return;
                }
                AbstractC51485d g = u.mo87327g();
                String obj = C55197c.m100919b().toString();
                if (!g.mo86991a() || !C80538hl.m139614a(g.mo86987a(obj))) {
                    z = false;
                }
                C54833b.m100430a("fb", z);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C55029k(SessionListFragment sessionListFragment) {
            this.f125969a = sessionListFragment;
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.C80440fo.AbstractC80442a
        /* renamed from: a */
        public final void mo86642a(int i, C80440fo foVar) {
            C89219l.m154721d(foVar, "");
            T t = this.f125969a.mo91978f().f4921a.f4672f.get(i);
            if (t != null && t.f125727a == 2) {
                foVar.mo123741a(String.valueOf(t.f125729c), new RunnableC55030a(t));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.ui.fragment.SessionListFragment$l */
    public static final class C55031l implements C80440fo.AbstractC80442a {

        /* renamed from: a */
        final /* synthetic */ SessionListFragment f125971a;

        static {
            Covode.recordClassIndex(64759);
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.ui.fragment.SessionListFragment$l$a */
        static final class RunnableC55032a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ User f125972a;

            static {
                Covode.recordClassIndex(64760);
            }

            RunnableC55032a(User user) {
                this.f125972a = user;
            }

            public final void run() {
                C59256u a = new C59256u().mo96839q("notification_page").mo96834a("message_rec");
                a.f135350a = C59256u.EnumC59259c.CARD;
                a.f135352b = C59256u.EnumC59257a.SHOW;
                a.mo96832a(this.f125972a).mo96841s(this.f125972a.getRequestId()).mo96792f();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C55031l(SessionListFragment sessionListFragment) {
            this.f125971a = sessionListFragment;
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.C80440fo.AbstractC80442a
        /* renamed from: a */
        public final void mo86642a(int i, C80440fo foVar) {
            User user;
            C89219l.m154721d(foVar, "");
            T t = this.f125971a.mo91978f().f4921a.f4672f.get(i);
            if (t != null && t.f125727a == 3 && (user = t.f125728b) != null) {
                String uid = user.getUid();
                C89219l.m154716b(uid, "");
                foVar.mo123741a(uid, new RunnableC55032a(user));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.ui.fragment.SessionListFragment$g */
    static final class C55025g extends AbstractC89220m implements AbstractC89171a<C1428g> {

        /* renamed from: a */
        final /* synthetic */ SessionListFragment f125966a;

        static {
            Covode.recordClassIndex(64753);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55025g(SessionListFragment sessionListFragment) {
            super(0);
            this.f125966a = sessionListFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1428g invoke() {
            return new C1428g(this.f125966a.mo91976d(), this.f125966a.mo91977e(), this.f125966a.mo91978f());
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f125950j.mo90242b();
        long c = this.f125950j.mo90243c();
        CharSequence b = C55197c.m100919b();
        C89219l.m154716b(b, "");
        String obj = b.toString();
        C0484a aVar = new C0484a();
        aVar.put("user_id", obj);
        aVar.put("duration", String.valueOf(c));
        C39162r.m79460a("leave_chat_list", aVar);
        bx_();
    }

    /* renamed from: l */
    private final void m100647l() {
        String str;
        int i;
        String str2;
        String str3;
        Integer messageCount;
        SessionListNavArg h = m100643h();
        if (h == null || (str = h.getEnterFrom()) == null) {
            str = "";
        }
        SessionListNavArg h2 = m100643h();
        if (h2 == null || (messageCount = h2.getMessageCount()) == null) {
            i = 0;
        } else {
            i = messageCount.intValue();
        }
        SessionListNavArg h3 = m100643h();
        if (h3 == null || (str2 = h3.getEnterMethod()) == null) {
            str2 = "";
        }
        SessionListNavArg h4 = m100643h();
        if (h4 == null || (str3 = h4.getNoticeType()) == null) {
            str3 = "";
        }
        C54823a.m100426a(str, i, str2, str3);
        if (m100643h() != null) {
            C54883e eVar = this.f125951k;
            ActivityC0945e requireActivity = requireActivity();
            C89219l.m154716b(requireActivity, "");
            eVar.mo91898a(requireActivity, m100643h());
        }
    }

    /* renamed from: g */
    public final void mo91979g() {
        getActivity();
        if (m100646k()) {
            if (mo91977e().mo91959a()) {
                TuxStatusView tuxStatusView = (TuxStatusView) mo27715a(R.id.e7i);
                C89219l.m154716b(tuxStatusView, "");
                tuxStatusView.setVisibility(0);
                ((TuxStatusView) mo27715a(R.id.e7i)).mo37867a();
            }
            C55231t.m100998a();
            AbstractC81915c.m141874a(new C56195b());
        } else if (mo91977e().mo91959a()) {
            AbstractC89568bz unused = C89624i.m155555a(C89517an.m155448a(C33429a.f79465a), null, null, new C55041s(this, null), 3);
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        EventBus.m156962a().mo145395b(this);
        C55097i.m100773b();
        C54314c.m99607a();
        C55004a aVar = this.f125946e;
        if (aVar == null) {
            C89219l.m154710a("mSessionListView");
        }
        if (EventBus.m156962a().mo145393a(aVar)) {
            EventBus.m156962a().mo145395b(aVar);
        }
        C55000a aVar2 = aVar.f125908c;
        Iterator<T> it = aVar2.f125902b.iterator();
        while (it.hasNext()) {
            it.next().mo91969c();
        }
        C89070n.m154537a((List) aVar2.f125902b, (AbstractC89172b) C55000a.C55002b.f125904a);
        C89517an.m155450b(aVar.f125906a);
        C55102l a = C55102l.C55104a.m100801a();
        if (a != null) {
            C55004a aVar3 = this.f125946e;
            if (aVar3 == null) {
                C89219l.m154710a("mSessionListView");
            }
            a.mo92013b(aVar3);
        }
        RecyclerView recyclerView = (RecyclerView) mo27715a(R.id.dwb);
        if (recyclerView != null) {
            recyclerView.setAdapter(null);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.recommend.p3159c.p3161b.C54931b.AbstractC54932a
    /* renamed from: a */
    public final void mo91927a() {
        MethodCollector.m26663i(4982);
        C54916a.m100541b();
        if (getActivity() != null) {
            View inflate = LayoutInflater.from(getActivity()).inflate(R.layout.a4l, (ViewGroup) null);
            C89219l.m154716b(inflate, "");
            View findViewById = inflate.findViewById(R.id.f50);
            C89219l.m154716b(findViewById, "");
            TextView textView = (TextView) findViewById;
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setHighlightColor(C0643b.m2378c(textView.getContext(), R.color.c9));
            ActivityC0945e activity = getActivity();
            if (activity == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(activity, "");
            Dialog a = C61156d.m110775a(activity, inflate, R.style.yc);
            String string = getResources().getString(R.string.cv8);
            C89219l.m154716b(string, "");
            String string2 = getResources().getString(R.string.c_e, string);
            C89219l.m154716b(string2, "");
            int a2 = C89361p.m154888a((CharSequence) string2, string, 0, false, 6);
            int length = string.length() + a2;
            SpannableString spannableString = new SpannableString(string2);
            if (!TextUtils.isEmpty(string2) && !TextUtils.isEmpty(string) && a2 >= 0) {
                spannableString.setSpan(new C55039q(a, textView, this), a2, length, 34);
                spannableString.setSpan(new StyleSpan(1), a2, length, 34);
            }
            textView.setText(spannableString);
            a.show();
        }
        MethodCollector.m26664o(4982);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.ui.fragment.SessionListFragment$t */
    public static final class C55043t extends RecyclerView.AbstractC1371n {

        /* renamed from: a */
        final /* synthetic */ SessionListFragment f125985a;

        static {
            Covode.recordClassIndex(64771);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C55043t(SessionListFragment sessionListFragment) {
            this.f125985a = sessionListFragment;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4753a(RecyclerView recyclerView, int i) {
            C89219l.m154721d(recyclerView, "");
            if (i == 2) {
                this.f125985a.mo91975a(recyclerView);
            } else if (i == 0) {
                this.f125985a.mo91975a(recyclerView);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.ui.fragment.SessionListFragment$b */
    static final class C55020b<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ SessionListFragment f125961a;

        static {
            Covode.recordClassIndex(64748);
        }

        C55020b(SessionListFragment sessionListFragment) {
            this.f125961a = sessionListFragment;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            SmartRouter.buildRoute(this.f125961a.requireContext(), "aweme://push_setting_manager").open();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.ui.fragment.SessionListFragment$c */
    static final class C55021c<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ SessionListFragment f125962a;

        static {
            Covode.recordClassIndex(64749);
        }

        C55021c(SessionListFragment sessionListFragment) {
            this.f125962a = sessionListFragment;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C80428fg.m139434b(this.f125962a.requireContext());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.ui.fragment.SessionListFragment$o */
    static final class C55035o extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        public static final C55035o f125975a = new C55035o();

        static {
            Covode.recordClassIndex(64763);
        }

        C55035o() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(C550361.f125976a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.ui.fragment.SessionListFragment$p */
    static final class C55037p extends AbstractC89220m implements AbstractC89172b<BaseFragmentViewModel, C89391z> {

        /* renamed from: a */
        public static final C55037p f125977a = new C55037p();

        static {
            Covode.recordClassIndex(64765);
        }

        C55037p() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseFragmentViewModel baseFragmentViewModel) {
            BaseFragmentViewModel baseFragmentViewModel2 = baseFragmentViewModel;
            C89219l.m154721d(baseFragmentViewModel2, "");
            baseFragmentViewModel2.config(C550381.f125978a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C55004a m100642a(SessionListFragment sessionListFragment) {
        C55004a aVar = sessionListFragment.f125946e;
        if (aVar == null) {
            C89219l.m154710a("mSessionListView");
        }
        return aVar;
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        C89219l.m154721d(context, "");
        super.onAttach(context);
        AbstractC55147b.f126186a.mo92071a("chat_list");
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onRefreshMessageButton(C56196c cVar) {
        C89219l.m154721d(cVar, "");
        mo91978f().notifyDataSetChanged();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.ui.fragment.SessionListFragment$q */
    public static final class C55039q extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ Dialog f125979a;

        /* renamed from: b */
        final /* synthetic */ TextView f125980b;

        /* renamed from: c */
        final /* synthetic */ SessionListFragment f125981c;

        static {
            Covode.recordClassIndex(64767);
        }

        public final void updateDrawState(TextPaint textPaint) {
            C89219l.m154721d(textPaint, "");
            textPaint.setColor(C0643b.m2378c(this.f125980b.getContext(), R.color.bx));
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            C89219l.m154721d(view, "");
            Dialog dialog = this.f125979a;
            if (dialog != null && dialog.isShowing()) {
                this.f125979a.dismiss();
            }
            SmartRouter.buildRoute(this.f125981c.getActivity(), "//privacy/suggest_account").withParam("enter_from", "message").withParam("previous_page", this.f125981c.f125947f).withParam("is_rec", 1).open();
        }

        C55039q(Dialog dialog, TextView textView, SessionListFragment sessionListFragment) {
            this.f125979a = dialog;
            this.f125980b = textView;
            this.f125981c = sessionListFragment;
        }
    }

    /* renamed from: a */
    public final void mo91975a(RecyclerView recyclerView) {
        int i;
        boolean canScrollVertically = recyclerView.canScrollVertically(-1);
        View a = mo27715a(R.id.cjm);
        C89219l.m154716b(a, "");
        if (canScrollVertically) {
            i = 0;
        } else {
            i = 8;
        }
        a.setVisibility(i);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.ui.fragment.SessionListFragment$d */
    static final class C55022d<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ SessionListFragment f125963a;

        static {
            Covode.recordClassIndex(64750);
        }

        C55022d(SessionListFragment sessionListFragment) {
            this.f125963a = sessionListFragment;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            if (obj == EnumC54957b.EmptyTopNoticeView) {
                this.f125963a.mo91976d().mo5018a(C89086z.INSTANCE);
                return;
            }
            ((RecyclerView) this.f125963a.mo27715a(R.id.dwb)).mo4413b(0);
            this.f125963a.mo91976d().mo5018a(C89070n.m154516a(obj));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.ui.fragment.SessionListFragment$e */
    static final class C55023e<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ SessionListFragment f125964a;

        static {
            Covode.recordClassIndex(64751);
        }

        C55023e(SessionListFragment sessionListFragment) {
            this.f125964a = sessionListFragment;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                TuxStatusView tuxStatusView = (TuxStatusView) this.f125964a.mo27715a(R.id.e7i);
                C89219l.m154716b(tuxStatusView, "");
                tuxStatusView.setVisibility(0);
                ((TuxStatusView) this.f125964a.mo27715a(R.id.e7i)).mo37867a();
                return;
            }
            SessionListFragment.m100642a(this.f125964a).mo91960a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.ui.fragment.SessionListFragment$f */
    static final class C55024f<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ SessionListFragment f125965a;

        static {
            Covode.recordClassIndex(64752);
        }

        C55024f(SessionListFragment sessionListFragment) {
            this.f125965a = sessionListFragment;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            List list = (List) obj;
            SessionListFragment sessionListFragment = this.f125965a;
            C89219l.m154716b(list, "");
            List<T> g = C89070n.m154585g((Collection) list);
            if (g.size() == 1 && g.get(0).f125727a == 1) {
                g.remove(0);
            }
            sessionListFragment.mo91978f().mo5019a(g, new RunnableC55027i(sessionListFragment));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        String str;
        super.onActivityCreated(bundle);
        mo27717b(C55035o.f125975a);
        C55076b.m100725d().setupStatusBar(getActivity());
        C55341b i = m100644i();
        SessionListNavArg h = m100643h();
        if (h != null) {
            str = h.getJumpedFromInviteId();
        } else {
            str = null;
        }
        i.mo92405a(str);
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C35434c.m72461a("im_chat_list");
        super.onCreate(bundle);
        mo27716a(C55037p.f125977a);
        C17419b.m32261a().mo27887a(AbstractC17446a.EnumC17447a.ENTER_SESSION_LIST);
        C55097i.m100769a();
        m100647l();
        EventBus.m156966a(EventBus.m156962a(), this);
    }

    @Override // com.bytedance.ies.powerpage.AbstractC17736b
    public final void onNewIntent(Intent intent) {
        String str;
        ActivityC0945e requireActivity = requireActivity();
        C89219l.m154716b(requireActivity, "");
        requireActivity.setIntent(intent);
        RouteArgInjector.INSTANCE.inject(this);
        m100647l();
        C55341b i = m100644i();
        SessionListNavArg h = m100643h();
        if (h != null) {
            str = h.getJumpedFromInviteId();
        } else {
            str = null;
        }
        i.mo92405a(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.ui.fragment.SessionListFragment$s */
    public static final class C55041s extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f125983a;

        /* renamed from: b */
        final /* synthetic */ SessionListFragment f125984b;

        static {
            Covode.recordClassIndex(64769);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55041s(SessionListFragment sessionListFragment, AbstractC89124d dVar) {
            super(2, dVar);
            this.f125984b = sessionListFragment;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C55041s(this.f125984b, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C55041s) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f125983a;
            if (i == 0) {
                C89382r.m154942a(obj);
                this.f125983a = 1;
                if (C89536ay.m155464a(100, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                C89382r.m154942a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (!this.f125984b.f41692a || !this.f125984b.mo91977e().mo91959a()) {
                return C89391z.f203057a;
            }
            TuxStatusView tuxStatusView = (TuxStatusView) this.f125984b.mo27715a(R.id.e7i);
            C89219l.m154716b(tuxStatusView, "");
            tuxStatusView.setVisibility(0);
            ((TuxStatusView) this.f125984b.mo27715a(R.id.e7i)).setStatus(C79440a.m138169a(new TuxStatusView.C23263c(), new AbstractC89171a<C89391z>(this.f125984b) {
                /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3164ui.fragment.SessionListFragment.C55041s.C550421 */

                static {
                    Covode.recordClassIndex(64770);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C89391z invoke() {
                    ((SessionListFragment) this.receiver).mo91979g();
                    return C89391z.f203057a;
                }
            }));
            new C23144b(this.f125984b).mo37640e(R.string.dcq).mo37637b();
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20527q.C20528a.m38714a(vm1, bVar);
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        AbstractC55147b.f126186a.mo92070a(view, "chat_list");
        ((ImTextTitleBar) mo27715a(R.id.eiz)).setOnTitlebarClickListener(new C55033m(this));
        if (C55213i.m100955a()) {
            ((ImTextTitleBar) mo27715a(R.id.eiz)).setRightIcon(R.raw.icon_create_group);
            ((ImTextTitleBar) mo27715a(R.id.eiz)).post(new RunnableC55045v(this));
        } else {
            ((ImTextTitleBar) mo27715a(R.id.eiz)).setRightIcon(R.raw.icon_plus_small);
        }
        RecyclerView recyclerView = (RecyclerView) mo27715a(R.id.dwb);
        C89219l.m154716b(recyclerView, "");
        getActivity();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        ((RecyclerView) mo27715a(R.id.dwb)).setItemViewCacheSize(4);
        ((RecyclerView) mo27715a(R.id.dwb)).mo4405a(new C51425a(getActivity()));
        ((RecyclerView) mo27715a(R.id.dwb)).mo4405a(this.f125959s);
        mo91978f().f125731b = this;
        mo91978f().f125732c = this;
        RecyclerView recyclerView2 = (RecyclerView) mo27715a(R.id.dwb);
        C89219l.m154716b(recyclerView2, "");
        recyclerView2.setAdapter((C1428g) this.f125958r.getValue());
        mo27715a(R.id.cjm).setBackgroundColor(C17867d.m33078a().getResources().getColor(R.color.b7));
        C80330da.C80331a.m139266a("conversation_list").mo123698a((RecyclerView) mo27715a(R.id.dwb));
        ((RecyclerView) mo27715a(R.id.dwb)).mo4405a(new C55028j());
        RecyclerView recyclerView3 = (RecyclerView) mo27715a(R.id.dwb);
        C89219l.m154716b(recyclerView3, "");
        new C80440fo(recyclerView3, new C55029k(this));
        RecyclerView recyclerView4 = (RecyclerView) mo27715a(R.id.dwb);
        C89219l.m154716b(recyclerView4, "");
        new C80440fo(recyclerView4, new C55031l(this));
        C54922a f = mo91978f();
        C55000a e = mo91977e();
        TuxStatusView tuxStatusView = (TuxStatusView) mo27715a(R.id.e7i);
        C89219l.m154716b(tuxStatusView, "");
        C55004a aVar = new C55004a(f, e, tuxStatusView);
        this.f125946e = aVar;
        String str = this.f125947f;
        C89219l.m154721d(str, "");
        aVar.f125907b = str;
        C55102l a = C55102l.C55104a.m100801a();
        if (a != null) {
            C55004a aVar2 = this.f125946e;
            if (aVar2 == null) {
                C89219l.m154710a("mSessionListView");
            }
            a.mo92009a(aVar2);
        }
        mo91979g();
        this.f125949h.f125757c.observe(this, new C55024f(this));
        this.f125949h.f125758d.observe(this, new C55023e(this));
        this.f125948g.f125833e.observe(this, new C55020b(this));
        this.f125948g.f125835g.observe(this, new C55021c(this));
        this.f125948g.f125837i.observe(this, new C55022d(this));
        this.f125949h.mo91929a();
        this.f125948g.mo91942a(C61542b.m111458a(99), C80428fg.m139432a(requireContext()));
        AbstractC0952i fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
            C89219l.m154716b(fragmentManager, "");
            createIIMServicebyMonsterPlugin.tryShowingChatPrivacyPanel("chat_list", fragmentManager, null);
        }
        if (!C80580in.m139687c()) {
            C56244a.m102190b("AwemeImManager", "lazyFetch");
            C46597h.f108651e.mo79192c();
            C46455a.f108228a.mo78986a();
            if (!C55050c.m100668a()) {
                C46616a.m89980a(false);
            }
        }
        Context context = getContext();
        if (context != null) {
            C51648a aVar3 = C51648a.f118980a;
            C89219l.m154716b(context, "");
            aVar3.mo87304a(3, "chat_list", "auto", context);
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20527q.C20528a.m38708a(this, jediViewModel, ahVar, mVar);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        C53697j jVar = this.f125950j;
        jVar.f123212a = 0;
        jVar.f123213b = 0;
        this.f125950j.mo90241a();
        return C1764a.m5927a(layoutInflater, R.layout.a4r, viewGroup, false);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object, int] */
    @Override // com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34478k
    /* renamed from: a */
    public final /* synthetic */ void mo60910a(int i, User user, int i2) {
        C59256u.EnumC59257a aVar;
        User user2 = user;
        C54916a.m100541b();
        if (user2 != null) {
            switch (i) {
                case HandlerC21534a.f51116a:
                    C54833b.C54837d dVar = C54833b.C54837d.f125607a;
                    C89219l.m154721d(dVar, "");
                    C0484a aVar2 = new C0484a();
                    aVar2.put("enter_from", "message_rec");
                    dVar.invoke("follow", aVar2);
                    C59256u a = new C59256u().mo96839q("notification_page").mo96834a("message_rec");
                    a.f135350a = C59256u.EnumC59259c.CARD;
                    if (user2.getFollowStatus() == 0) {
                        aVar = C59256u.EnumC59257a.FOLLOW;
                    } else {
                        aVar = C59256u.EnumC59257a.FOLLOW_CANCEL;
                    }
                    a.f135352b = aVar;
                    a.mo96832a(user2).mo96841s(user2.getRequestId()).mo96792f();
                    return;
                case 101:
                    C59256u a2 = new C59256u().mo96839q("notification_page").mo96834a("message_rec");
                    a2.f135350a = C59256u.EnumC59259c.CARD;
                    a2.f135352b = C59256u.EnumC59257a.ENTER_PROFILE;
                    a2.mo96832a(user2).mo96841s(user2.getRequestId()).mo96792f();
                    C33744d a3 = new C33744d().mo59983a("enter_from", "message_rec");
                    C80409eu.m139390a(a3, user2);
                    C39162r.m79460a("enter_personal_detail", a3.f79943a);
                    SmartRouter.buildRoute(getContext(), "aweme://user/profile/" + user2.getUid()).withParam("sec_user_id", user2.getSecUid()).withParam("from_recommend_card", 1).withParam("enter_from", "message_rec").withParam("recommend_from_type", "list").withParam("extra_mutual_relation", user2.getMutualStruct()).withParam("extra_from_mutual", true).withParam("recommend_enter_profile_params", new C66623g("message_rec", "notification_page", C59256u.EnumC59259c.CARD, user2.getRecType(), C66623g.C66624a.m118386a(user2), user2.getUid(), null, null, user2.getRequestId(), null, user2.getFriendTypeStr(), user2.getSocialInfo())).open();
                    return;
                case 102:
                    C59256u a4 = new C59256u().mo96839q("notification_page").mo96834a("message_rec");
                    a4.f135350a = C59256u.EnumC59259c.CARD;
                    a4.f135352b = C59256u.EnumC59257a.CLOSE;
                    a4.mo96832a(user2).mo96841s(user2.getRequestId()).mo96792f();
                    RecommendFriendInDMViewModel recommendFriendInDMViewModel = this.f125949h;
                    C89219l.m154721d(user2, "");
                    IRecommendUsersService j = IRecommendUsersServiceImpl.m118438j();
                    if (j != null) {
                        String uid = user2.getUid();
                        C89219l.m154716b(uid, "");
                        j.mo105655a(uid, user2.getSecUid());
                    }
                    List<C54919a> value = recommendFriendInDMViewModel.f125757c.getValue();
                    if (value != null) {
                        C89070n.m154537a((List) value, (AbstractC89172b) new RecommendFriendInDMViewModel.C54934a(user2));
                    }
                    recommendFriendInDMViewModel.f125757c.postValue(value);
                    return;
                default:
                    return;
            }
        }
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
