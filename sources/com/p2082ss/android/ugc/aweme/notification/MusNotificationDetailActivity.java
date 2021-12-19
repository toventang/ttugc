package com.p2082ss.android.ugc.aweme.notification;

import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.recyclerview.widget.AbstractC1391ab;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.dmt.p1194ui.titlebar.AbstractC17250a;
import com.bytedance.ies.dmt.p1194ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.input.TuxSwitch;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.navigation.p1723a.C23187b;
import com.bytedance.tux.navigation.p1723a.C23194g;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.sheet.sheet.C23226a;
import com.bytedance.tux.status.TuxStatusView;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.ugc.aweme.analysis.AbstractC33501c;
import com.p2082ss.android.ugc.aweme.analysis.Analysis;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.p2379ui.C34692l;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c;
import com.p2082ss.android.ugc.aweme.framework.p3007b.C51425a;
import com.p2082ss.android.ugc.aweme.inbox.p3269d.C56386j;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.notice.api.C61542b;
import com.p2082ss.android.ugc.aweme.notice.api.bean.C61558j;
import com.p2082ss.android.ugc.aweme.notice.api.bean.C61562n;
import com.p2082ss.android.ugc.aweme.notice.api.bean.EnumC61551c;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p2082ss.android.ugc.aweme.notification.adapter.C61849h;
import com.p2082ss.android.ugc.aweme.notification.api.NotificationApi;
import com.p2082ss.android.ugc.aweme.notification.bean.C61882n;
import com.p2082ss.android.ugc.aweme.notification.bean.C61883o;
import com.p2082ss.android.ugc.aweme.notification.bean.MusNotificationDetailArg;
import com.p2082ss.android.ugc.aweme.notification.model.MusNewNotificationModel;
import com.p2082ss.android.ugc.aweme.notification.p3518a.AbstractC61760c;
import com.p2082ss.android.ugc.aweme.notification.p3518a.AbstractC61766f;
import com.p2082ss.android.ugc.aweme.notification.p3518a.C61784l;
import com.p2082ss.android.ugc.aweme.notification.p3518a.C61790m;
import com.p2082ss.android.ugc.aweme.notification.p3525f.C62002c;
import com.p2082ss.android.ugc.aweme.notification.p3535vm.NotificationDetailVM;
import com.p2082ss.android.ugc.aweme.notification.redpoint.C62221f;
import com.p2082ss.android.ugc.aweme.setting.p3716d.C68070e;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4166g.C79440a;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.notification.MusNotificationDetailActivity */
public final class MusNotificationDetailActivity extends ActivityC17312a implements SwipeRefreshLayout.AbstractC1559b, AbstractC33501c, AbstractC39063h.AbstractC39067a, AbstractC39102c<BaseNotice>, AbstractC90252i, AbstractC90253j {

    /* renamed from: b */
    public static final C61712a f140059b = new C61712a((byte) 0);

    /* renamed from: a */
    public boolean f140060a;

    /* renamed from: c */
    private final AbstractC89244h f140061c = RouteArgExtension.INSTANCE.navArg(this);

    /* renamed from: d */
    private final C61790m f140062d = C61790m.f140277b;

    /* renamed from: e */
    private AbstractC61760c f140063e;

    /* renamed from: f */
    private AbstractC61766f f140064f;

    /* renamed from: g */
    private AbstractC61766f f140065g;

    /* renamed from: h */
    private C61849h f140066h;

    /* renamed from: i */
    private C62002c f140067i;

    /* renamed from: j */
    private MusNewNotificationModel f140068j;

    /* renamed from: k */
    private final AbstractC89244h f140069k = C89250i.m154773a((AbstractC89171a) new C61730m(this));

    /* renamed from: l */
    private final AbstractC89244h f140070l = C89250i.m154773a((AbstractC89171a) C61713b.f140073a);

    /* renamed from: m */
    private boolean f140071m;

    /* renamed from: n */
    private SparseArray f140072n;

    /* renamed from: com.ss.android.ugc.aweme.notification.MusNotificationDetailActivity$f */
    static final class C61719f<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C61719f f140089a = new C61719f();

        static {
            Covode.recordClassIndex(72450);
        }

        C61719f() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(72442);
    }

    /* renamed from: d */
    private final NotificationDetailVM m111746d() {
        return (NotificationDetailVM) this.f140069k.getValue();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f140072n;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f140072n == null) {
            this.f140072n = new SparseArray();
        }
        View view = (View) this.f140072n.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f140072n.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final C88411a mo99854a() {
        return (C88411a) this.f140070l.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: a */
    public final void mo59511a(Exception exc) {
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: b */
    public final void mo59515b() {
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    public final void bl_() {
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: c */
    public final void mo59523c(List<BaseNotice> list, boolean z) {
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(52, new RunnableC90250g(MusNotificationDetailActivity.class, "onSwitchBusinessAccountSuccessEvent", C68070e.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.notification.MusNotificationDetailActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.notification.MusNotificationDetailActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.notification.MusNotificationDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.MusNotificationDetailActivity$a */
    public static final class C61712a {
        static {
            Covode.recordClassIndex(72443);
        }

        private C61712a() {
        }

        public /* synthetic */ C61712a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.MusNotificationDetailActivity$b */
    static final class C61713b extends AbstractC89220m implements AbstractC89171a<C88411a> {

        /* renamed from: a */
        public static final C61713b f140073a = new C61713b();

        static {
            Covode.recordClassIndex(72444);
        }

        C61713b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C88411a invoke() {
            return new C88411a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.MusNotificationDetailActivity$l */
    static final /* synthetic */ class C61729l extends C89217j implements AbstractC89171a<C89391z> {
        static {
            Covode.recordClassIndex(72460);
        }

        C61729l(MusNotificationDetailActivity musNotificationDetailActivity) {
            super(0, musNotificationDetailActivity, MusNotificationDetailActivity.class, "onRefresh", "onRefresh()V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            ((MusNotificationDetailActivity) this.receiver).onRefresh();
            return C89391z.f203057a;
        }
    }

    /* renamed from: i */
    private static boolean m111748i() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    public final void aW_() {
        C61849h hVar = this.f140066h;
        if (hVar == null) {
            C89219l.m154710a("mAdapter");
        }
        hVar.ao_();
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.MusNotificationDetailActivity$h */
    static final class C61721h extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ MusNotificationDetailActivity f140095a;

        /* renamed from: b */
        final /* synthetic */ View f140096b;

        static {
            Covode.recordClassIndex(72452);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61721h(MusNotificationDetailActivity musNotificationDetailActivity, View view) {
            super(0);
            this.f140095a = musNotificationDetailActivity;
            this.f140096b = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f140095a.f140060a = true;
            View view = this.f140096b;
            C89219l.m154716b(view, "");
            C23226a.C23228b.m43787a(view);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.MusNotificationDetailActivity$m */
    static final class C61730m extends AbstractC89220m implements AbstractC89171a<NotificationDetailVM> {

        /* renamed from: a */
        final /* synthetic */ MusNotificationDetailActivity f140105a;

        static {
            Covode.recordClassIndex(72461);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61730m(MusNotificationDetailActivity musNotificationDetailActivity) {
            super(0);
            this.f140105a = musNotificationDetailActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ NotificationDetailVM invoke() {
            MusNotificationDetailActivity musNotificationDetailActivity = this.f140105a;
            C89219l.m154721d(musNotificationDetailActivity, "");
            AbstractC1174ac a = C1181ae.m3881a(musNotificationDetailActivity, (C1175ad.AbstractC1177b) null).mo3983a(NotificationDetailVM.class);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    /* renamed from: c */
    private final MusNotificationDetailArg m111745c() {
        MusNotificationDetailArg musNotificationDetailArg = (MusNotificationDetailArg) this.f140061c.getValue();
        if (musNotificationDetailArg == null) {
            return new MusNotificationDetailArg(0, 0, null, null, null, 31, null);
        }
        return musNotificationDetailArg;
    }

    /* renamed from: h */
    private final C61784l m111747h() {
        C61784l lVar = new C61784l(m111745c().groupType, m111745c().title, m111745c().tabName);
        lVar.mo99871a(m111746d());
        return lVar;
    }

    /* renamed from: j */
    private final void m111749j() {
        C61849h hVar = this.f140066h;
        if (hVar == null) {
            C89219l.m154710a("mAdapter");
        }
        hVar.ap_();
        C61849h hVar2 = this.f140066h;
        if (hVar2 == null) {
            C89219l.m154710a("mAdapter");
        }
        hVar2.mo67829d(false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
        C62002c cVar = this.f140067i;
        if (cVar == null) {
            C89219l.m154710a("mNoticePresenter");
        }
        cVar.ck_();
        mo99854a().dispose();
    }

    @Override // com.p2082ss.android.ugc.aweme.analysis.AbstractC33501c
    /* renamed from: F */
    public final Analysis mo59595F() {
        Analysis analysis = new Analysis();
        int i = m111745c().groupType;
        String str = "fans";
        if (i == 2) {
            str = UGCMonitor.EVENT_COMMENT;
        } else if (i == 3) {
            str = "like";
        } else if (i == 6) {
            str = "at";
        }
        Analysis labelName = analysis.setLabelName(str);
        C89219l.m154716b(labelName, "");
        return labelName;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h.AbstractC39067a
    /* renamed from: l */
    public final void mo62679l() {
        C62002c cVar = this.f140067i;
        if (cVar == null) {
            C89219l.m154710a("mNoticePresenter");
        }
        cVar.mo57616a(4, Integer.valueOf(m111745c().groupType), null);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStop() {
        C15477a.m28478d(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: f */
    public final void mo59525f() {
        C61849h hVar = this.f140066h;
        if (hVar == null) {
            C89219l.m154710a("mAdapter");
        }
        if (hVar.f92274v) {
            C61849h hVar2 = this.f140066h;
            if (hVar2 == null) {
                C89219l.m154710a("mAdapter");
            }
            hVar2.mo67829d(false);
            C61849h hVar3 = this.f140066h;
            if (hVar3 == null) {
                C89219l.m154710a("mAdapter");
            }
            hVar3.notifyDataSetChanged();
            m111749j();
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) _$_findCachedViewById(R.id.cva);
        C89219l.m154716b(swipeRefreshLayout, "");
        swipeRefreshLayout.setRefreshing(false);
        C61849h hVar4 = this.f140066h;
        if (hVar4 == null) {
            C89219l.m154710a("mAdapter");
        }
        if (hVar4.getItemCount() == 0) {
            TuxStatusView tuxStatusView = (TuxStatusView) _$_findCachedViewById(R.id.e7i);
            TuxStatusView.C23263c cVar = new TuxStatusView.C23263c();
            AbstractC61766f fVar = this.f140064f;
            if (fVar == null) {
                C89219l.m154710a("mDetailProxy");
            }
            TuxStatusView.C23263c a = cVar.mo37879a(fVar.mo99869b());
            AbstractC61766f fVar2 = this.f140064f;
            if (fVar2 == null) {
                C89219l.m154710a("mDetailProxy");
            }
            tuxStatusView.setStatus(a.mo37878a((CharSequence) fVar2.mo99870c()));
            TuxStatusView tuxStatusView2 = (TuxStatusView) _$_findCachedViewById(R.id.e7i);
            C89219l.m154716b(tuxStatusView2, "");
            tuxStatusView2.setVisibility(0);
        }
        C56386j.m102360a(0);
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.AbstractC1559b
    public final void onRefresh() {
        if (!C58029j.f132253e || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132253e = m111748i();
        }
        if (C58029j.f132253e) {
            C61849h hVar = this.f140066h;
            if (hVar == null) {
                C89219l.m154710a("mAdapter");
            }
            if (hVar.getItemCount() == 0) {
                ((TuxStatusView) _$_findCachedViewById(R.id.e7i)).mo37867a();
                TuxStatusView tuxStatusView = (TuxStatusView) _$_findCachedViewById(R.id.e7i);
                C89219l.m154716b(tuxStatusView, "");
                tuxStatusView.setVisibility(0);
            }
            C62002c cVar = this.f140067i;
            if (cVar == null) {
                C89219l.m154710a("mNoticePresenter");
            }
            cVar.mo57616a(1, Integer.valueOf(m111745c().groupType), null);
            C56386j.m102359a();
            return;
        }
        C61849h hVar2 = this.f140066h;
        if (hVar2 == null) {
            C89219l.m154710a("mAdapter");
        }
        if (hVar2.getItemCount() == 0) {
            C1731i.m5631a(100).mo5534a(new C61727k(this), C1731i.f5564c, null);
        }
        C56386j.f128613a = null;
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onSwitchBusinessAccountSuccessEvent(C68070e eVar) {
        finish();
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.MusNotificationDetailActivity$c */
    public static final class C61714c implements AbstractC17251a {

        /* renamed from: a */
        final /* synthetic */ MusNotificationDetailActivity f140074a;

        static {
            Covode.recordClassIndex(72445);
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: b */
        public final void mo27340b(View view) {
            C89219l.m154721d(view, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C61714c(MusNotificationDetailActivity musNotificationDetailActivity) {
            this.f140074a = musNotificationDetailActivity;
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: a */
        public final void mo27339a(View view) {
            C89219l.m154721d(view, "");
            this.f140074a.finish();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: c */
    public final void mo59522c(Exception exc) {
        C61849h hVar = this.f140066h;
        if (hVar == null) {
            C89219l.m154710a("mAdapter");
        }
        hVar.mo67824j();
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.MusNotificationDetailActivity$j */
    static final class C61723j extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        public static final C61723j f140100a = new C61723j();

        static {
            Covode.recordClassIndex(72454);
        }

        C61723j() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(C617241.f140101a);
            baseActivityViewModel2.config(C617252.f140102a);
            baseActivityViewModel2.config(C617263.f140103a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.MusNotificationDetailActivity$d */
    static final class View$OnClickListenerC61715d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MusNotificationDetailActivity f140075a;

        /* renamed from: b */
        final /* synthetic */ TuxSwitch f140076b;

        /* renamed from: c */
        final /* synthetic */ String f140077c;

        /* renamed from: d */
        final /* synthetic */ TextView f140078d;

        /* renamed from: e */
        final /* synthetic */ C89233z.C89238e f140079e;

        static {
            Covode.recordClassIndex(72446);
        }

        View$OnClickListenerC61715d(MusNotificationDetailActivity musNotificationDetailActivity, TuxSwitch tuxSwitch, String str, TextView textView, C89233z.C89238e eVar) {
            this.f140075a = musNotificationDetailActivity;
            this.f140076b = tuxSwitch;
            this.f140077c = str;
            this.f140078d = textView;
            this.f140079e = eVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            TuxSwitch tuxSwitch = this.f140076b;
            C89219l.m154716b(tuxSwitch, "");
            final boolean isChecked = tuxSwitch.isChecked();
            this.f140075a.mo99854a().mo142945a(NotificationApi.m111994a().setSubscribeMarketingStatus(!isChecked).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new AbstractC88433f(this) {
                /* class com.p2082ss.android.ugc.aweme.notification.MusNotificationDetailActivity.View$OnClickListenerC61715d.C617161 */

                /* renamed from: a */
                final /* synthetic */ View$OnClickListenerC61715d f140080a;

                static {
                    Covode.recordClassIndex(72447);
                }

                {
                    this.f140080a = r1;
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88433f
                public final /* synthetic */ void accept(Object obj) {
                    String str;
                    String str2;
                    C33744d dVar = new C33744d();
                    TuxSwitch tuxSwitch = this.f140080a.f140076b;
                    C89219l.m154716b(tuxSwitch, "");
                    if (tuxSwitch.isChecked()) {
                        str = "subscribed";
                    } else {
                        str = "unsubscribed";
                    }
                    C33744d a = dVar.mo59983a("status_type", str);
                    TuxSwitch tuxSwitch2 = this.f140080a.f140076b;
                    C89219l.m154716b(tuxSwitch2, "");
                    if (tuxSwitch2.isChecked()) {
                        str2 = "on";
                    } else {
                        str2 = "off";
                    }
                    C39162r.m79460a("click_inbox_notification_setting", a.mo59983a("to_status", str2).mo59983a("channel_type", this.f140080a.f140077c).f79943a);
                    TextView textView = this.f140080a.f140078d;
                    C89219l.m154716b(textView, "");
                    TuxSwitch tuxSwitch3 = this.f140080a.f140076b;
                    C89219l.m154716b(tuxSwitch3, "");
                    String str3 = null;
                    if (tuxSwitch3.isChecked()) {
                        T t = this.f140080a.f140079e.element;
                        if (t != null) {
                            str3 = t.f140498d;
                        }
                    } else {
                        T t2 = this.f140080a.f140079e.element;
                        if (t2 != null) {
                            str3 = t2.f140497c;
                        }
                    }
                    textView.setText(str3);
                }
            }, new AbstractC88433f(this) {
                /* class com.p2082ss.android.ugc.aweme.notification.MusNotificationDetailActivity.View$OnClickListenerC61715d.C617172 */

                /* renamed from: a */
                final /* synthetic */ View$OnClickListenerC61715d f140081a;

                static {
                    Covode.recordClassIndex(72448);
                }

                {
                    this.f140081a = r1;
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88433f
                public final /* synthetic */ void accept(Object obj) {
                    new C23144b(this.f140081a.f140075a).mo37640e(R.string.bop).mo37637b();
                    TuxSwitch tuxSwitch = this.f140081a.f140076b;
                    C89219l.m154716b(tuxSwitch, "");
                    tuxSwitch.setChecked(!isChecked);
                }
            }));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.MusNotificationDetailActivity$g */
    static final class View$OnClickListenerC61720g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MusNotificationDetailActivity f140090a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89238e f140091b;

        /* renamed from: c */
        final /* synthetic */ C23226a.C23227a f140092c;

        /* renamed from: d */
        final /* synthetic */ TuxSwitch f140093d;

        /* renamed from: e */
        final /* synthetic */ String f140094e;

        static {
            Covode.recordClassIndex(72451);
        }

        View$OnClickListenerC61720g(MusNotificationDetailActivity musNotificationDetailActivity, C89233z.C89238e eVar, C23226a.C23227a aVar, TuxSwitch tuxSwitch, String str) {
            this.f140090a = musNotificationDetailActivity;
            this.f140091b = eVar;
            this.f140092c = aVar;
            this.f140093d = tuxSwitch;
            this.f140094e = str;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            if (this.f140091b.element != null) {
                this.f140092c.f55057a.show(this.f140090a.getSupportFragmentManager(), "notification_marketing_subscribe");
                C33744d dVar = new C33744d();
                TuxSwitch tuxSwitch = this.f140093d;
                C89219l.m154716b(tuxSwitch, "");
                if (tuxSwitch.isChecked()) {
                    str = "subscribed";
                } else {
                    str = "unsubscribed";
                }
                C39162r.m79460a("show_inbox_notification_setting", dVar.mo59983a("status_type", str).mo59983a("channel_type", this.f140094e).f79943a);
                return;
            }
            new C23144b(this.f140090a).mo37640e(R.string.bop).mo37637b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.MusNotificationDetailActivity$i */
    static final class DialogInterface$OnDismissListenerC61722i implements DialogInterface.OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ MusNotificationDetailActivity f140097a;

        /* renamed from: b */
        final /* synthetic */ TuxSwitch f140098b;

        /* renamed from: c */
        final /* synthetic */ String f140099c;

        static {
            Covode.recordClassIndex(72453);
        }

        DialogInterface$OnDismissListenerC61722i(MusNotificationDetailActivity musNotificationDetailActivity, TuxSwitch tuxSwitch, String str) {
            this.f140097a = musNotificationDetailActivity;
            this.f140098b = tuxSwitch;
            this.f140099c = str;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            String str;
            String str2;
            C33744d dVar = new C33744d();
            TuxSwitch tuxSwitch = this.f140098b;
            C89219l.m154716b(tuxSwitch, "");
            if (tuxSwitch.isChecked()) {
                str = "subscribed";
            } else {
                str = "unsubscribed";
            }
            C33744d a = dVar.mo59983a("status_type", str).mo59983a("channel_type", this.f140099c);
            if (this.f140097a.f140060a) {
                str2 = "button";
            } else {
                str2 = "other";
            }
            C39162r.m79460a("close_inbox_notification_setting", a.mo59983a("action_type", str2).f79943a);
            this.f140097a.f140060a = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.MusNotificationDetailActivity$k */
    public static final class C61727k<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ MusNotificationDetailActivity f140104a;

        static {
            Covode.recordClassIndex(72458);
        }

        C61727k(MusNotificationDetailActivity musNotificationDetailActivity) {
            this.f140104a = musNotificationDetailActivity;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            if (!this.f140104a.isDestroyed()) {
                ((TuxStatusView) this.f140104a._$_findCachedViewById(R.id.e7i)).setStatus(C79440a.m138169a(new TuxStatusView.C23263c(), new AbstractC89171a<C89391z>(this.f140104a) {
                    /* class com.p2082ss.android.ugc.aweme.notification.MusNotificationDetailActivity.C61727k.C617281 */

                    static {
                        Covode.recordClassIndex(72459);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // p4600h.p4611f.p4612a.AbstractC89171a
                    public final /* synthetic */ C89391z invoke() {
                        ((MusNotificationDetailActivity) this.receiver).onRefresh();
                        return C89391z.f203057a;
                    }
                }));
                TuxStatusView tuxStatusView = (TuxStatusView) this.f140104a._$_findCachedViewById(R.id.e7i);
                C89219l.m154716b(tuxStatusView, "");
                tuxStatusView.setVisibility(0);
                new C23144b(this.f140104a).mo37640e(R.string.dcq).mo37637b();
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: b */
    public final void mo59516b(Exception exc) {
        C61849h hVar = this.f140066h;
        if (hVar == null) {
            C89219l.m154710a("mAdapter");
        }
        if (hVar.f92274v) {
            C61849h hVar2 = this.f140066h;
            if (hVar2 == null) {
                C89219l.m154710a("mAdapter");
            }
            hVar2.mo67829d(false);
            C61849h hVar3 = this.f140066h;
            if (hVar3 == null) {
                C89219l.m154710a("mAdapter");
            }
            hVar3.notifyDataSetChanged();
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) _$_findCachedViewById(R.id.cva);
        C89219l.m154716b(swipeRefreshLayout, "");
        swipeRefreshLayout.setRefreshing(false);
        C61849h hVar4 = this.f140066h;
        if (hVar4 == null) {
            C89219l.m154710a("mAdapter");
        }
        if (hVar4.getItemCount() == 0) {
            ((TuxStatusView) _$_findCachedViewById(R.id.e7i)).setStatus(C79440a.m138169a(new TuxStatusView.C23263c(), new C61729l(this)));
            TuxStatusView tuxStatusView = (TuxStatusView) _$_findCachedViewById(R.id.e7i);
            C89219l.m154716b(tuxStatusView, "");
            tuxStatusView.setVisibility(0);
        }
        C56386j.m102360a(0);
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.MusNotificationDetailActivity$e */
    static final class C61718e<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C23226a.C23227a f140083a;

        /* renamed from: b */
        final /* synthetic */ TuxNavBar.C23179a f140084b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89238e f140085c;

        /* renamed from: d */
        final /* synthetic */ TuxSwitch f140086d;

        /* renamed from: e */
        final /* synthetic */ TextView f140087e;

        /* renamed from: f */
        final /* synthetic */ TextView f140088f;

        static {
            Covode.recordClassIndex(72449);
        }

        C61718e(C23226a.C23227a aVar, TuxNavBar.C23179a aVar2, C89233z.C89238e eVar, TuxSwitch tuxSwitch, TextView textView, TextView textView2) {
            this.f140083a = aVar;
            this.f140084b = aVar2;
            this.f140085c = eVar;
            this.f140086d = tuxSwitch;
            this.f140087e = textView;
            this.f140088f = textView2;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            boolean z;
            String str2;
            Integer num;
            C61883o oVar = (C61883o) obj;
            C23226a.C23227a aVar = this.f140083a;
            TuxNavBar.C23179a aVar2 = this.f140084b;
            C23194g gVar = new C23194g();
            C61882n nVar = oVar.f140501a;
            if (nVar == null || (str = nVar.f140499a) == null) {
                str = "";
            }
            aVar.mo37818a(aVar2.mo37731a(gVar.mo37753a(str)));
            C89233z.C89238e eVar = this.f140085c;
            C61882n nVar2 = oVar.f140501a;
            String str3 = null;
            eVar.element = nVar2 != null ? (T) nVar2.f140500b : null;
            TuxSwitch tuxSwitch = this.f140086d;
            C89219l.m154716b(tuxSwitch, "");
            T t = this.f140085c.element;
            if (t == null || (num = t.f140495a) == null || num.intValue() != 0) {
                z = false;
            } else {
                z = true;
            }
            tuxSwitch.setChecked(z);
            TextView textView = this.f140087e;
            C89219l.m154716b(textView, "");
            T t2 = this.f140085c.element;
            if (t2 != null) {
                str2 = t2.f140496b;
            } else {
                str2 = null;
            }
            textView.setText(str2);
            TextView textView2 = this.f140088f;
            C89219l.m154716b(textView2, "");
            TuxSwitch tuxSwitch2 = this.f140086d;
            C89219l.m154716b(tuxSwitch2, "");
            if (tuxSwitch2.isChecked()) {
                T t3 = this.f140085c.element;
                if (t3 != null) {
                    str3 = t3.f140498d;
                }
            } else {
                T t4 = this.f140085c.element;
                if (t4 != null) {
                    str3 = t4.f140497c;
                }
            }
            textView2.setText(str3);
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        EnumC61551c cVar;
        AbstractC61760c cVar2;
        boolean z;
        String str;
        AbstractC61760c cVar3;
        MethodCollector.m26663i(3402);
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.notification.MusNotificationDetailActivity", "onCreate", true);
        activityConfiguration(C61723j.f140100a);
        super.onCreate(bundle);
        C56386j.m102362a(C56386j.EnumC56387a.DETAIL_TYPE_NOTIFICATION, m111745c().groupType, m111745c().nid);
        setContentView(R.layout.k0);
        C61558j e = C62221f.m112529e(m111745c().groupType);
        if (e != null) {
            cVar = e.f139729a;
        } else {
            cVar = null;
        }
        if (cVar == EnumC61551c.AfterClick) {
            C61542b.m111470d(m111745c().groupType);
            m111745c();
            AbstractC81915c.m141874a(new C61562n());
        }
        if (m111745c().groupType == -1) {
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.notification.MusNotificationDetailActivity", "onCreate", false);
            MethodCollector.m26664o(3402);
            return;
        }
        if (C61790m.f140276a.get(Integer.valueOf(m111745c().groupType)) == null || (cVar3 = C61790m.f140276a.get(Integer.valueOf(m111745c().groupType))) == null || cVar3.mo99864a() == null) {
            cVar2 = m111747h();
            z = true;
        } else {
            cVar2 = C61790m.f140276a.get(Integer.valueOf(m111745c().groupType));
            if (cVar2 == null) {
                C89219l.m154715b();
            }
            z = false;
        }
        AbstractC61760c cVar4 = cVar2;
        this.f140063e = cVar4;
        if (cVar4 == null) {
            C89219l.m154710a("mDelegate");
        }
        cVar4.mo99871a(m111746d());
        AbstractC61760c cVar5 = this.f140063e;
        if (cVar5 == null) {
            C89219l.m154710a("mDelegate");
        }
        AbstractC61766f a = cVar5.mo99864a();
        if (a == null) {
            C89219l.m154715b();
        }
        this.f140064f = a;
        if (!z) {
            a = m111747h().mo99864a();
            if (a == null) {
                C89219l.m154715b();
            }
        } else if (a == null) {
            C89219l.m154710a("mDetailProxy");
        }
        this.f140065g = a;
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.cv1);
        C89219l.m154716b(recyclerView, "");
        RecyclerView.AbstractC1356f itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator != null) {
            ((AbstractC1391ab) itemAnimator).f4621m = false;
            RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(R.id.cv1);
            C89219l.m154716b(recyclerView2, "");
            recyclerView2.setLayoutManager(new LinearLayoutManager());
            ((RecyclerView) _$_findCachedViewById(R.id.cv1)).mo4415b(new C34692l((int) C13628n.m24520b(this, 1.0f), 0));
            ((RecyclerView) _$_findCachedViewById(R.id.cv1)).mo4405a(new C51425a(this));
            ((SwipeRefreshLayout) _$_findCachedViewById(R.id.cva)).setOnRefreshListener(this);
            AbstractC17250a aVar = (AbstractC17250a) _$_findCachedViewById(R.id.eiz);
            AbstractC61766f fVar = this.f140064f;
            if (fVar == null) {
                C89219l.m154710a("mDetailProxy");
            }
            aVar.setTitle(fVar.mo99866a());
            ((TextTitleBar) _$_findCachedViewById(R.id.eiz)).setOnTitleBarClickListener(new C61714c(this));
            if (m111745c().groupType == 81) {
                View inflate = View.inflate(this, R.layout.kh, null);
                TuxSwitch tuxSwitch = (TuxSwitch) inflate.findViewById(R.id.cvb);
                TextView textView = (TextView) inflate.findViewById(R.id.cvd);
                TextView textView2 = (TextView) inflate.findViewById(R.id.cul);
                ((TextTitleBar) _$_findCachedViewById(R.id.eiz)).setEndBtnVisibility(0);
                int i = m111745c().groupType;
                if (i == 81) {
                    str = "promote_assistant";
                } else if (i != 82) {
                    str = "other";
                } else {
                    str = "business_account";
                }
                C89233z.C89238e eVar = new C89233z.C89238e();
                eVar.element = null;
                tuxSwitch.setOnClickListener(new View$OnClickListenerC61715d(this, tuxSwitch, str, textView2, eVar));
                C23226a.C23227a aVar2 = new C23226a.C23227a();
                C89219l.m154716b(inflate, "");
                C23226a.C23227a a2 = aVar2.mo37816a(inflate).mo37812a(0).mo37815a(new DialogInterface$OnDismissListenerC61722i(this, tuxSwitch, str));
                TuxNavBar.C23179a aVar3 = new TuxNavBar.C23179a();
                aVar3.f54919d = true;
                mo99854a().mo142945a(NotificationApi.m111994a().getSubscribeMarketingStatus().mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C61718e(a2, aVar3.mo37733b(new C23187b().mo37738a(R.raw.icon_x_mark_small).mo37741a((AbstractC89171a<C89391z>) new C61721h(this, inflate))), eVar, tuxSwitch, textView, textView2), C61719f.f140089a));
                ((TextTitleBar) _$_findCachedViewById(R.id.eiz)).setEndBtnClickListener(new View$OnClickListenerC61720g(this, eVar, a2, tuxSwitch, str));
            }
            AbstractC61766f fVar2 = this.f140064f;
            if (fVar2 == null) {
                C89219l.m154710a("mDetailProxy");
            }
            AbstractC61766f fVar3 = this.f140065g;
            if (fVar3 == null) {
                C89219l.m154710a("mTemplateProxy");
            }
            this.f140066h = new C61849h(fVar2, fVar3, m111745c().unReadMessageCount);
            this.f140067i = new C62002c();
            MusNewNotificationModel musNewNotificationModel = new MusNewNotificationModel();
            this.f140068j = musNewNotificationModel;
            musNewNotificationModel.setCurrentNoticeGroup(m111745c().groupType);
            C62002c cVar6 = this.f140067i;
            if (cVar6 == null) {
                C89219l.m154710a("mNoticePresenter");
            }
            MusNewNotificationModel musNewNotificationModel2 = this.f140068j;
            if (musNewNotificationModel2 == null) {
                C89219l.m154710a("mNoticeModel");
            }
            cVar6.mo67838a((AbstractC39085b) musNewNotificationModel2);
            C62002c cVar7 = this.f140067i;
            if (cVar7 == null) {
                C89219l.m154710a("mNoticePresenter");
            }
            cVar7.mo67839a_(this);
            C61849h hVar = this.f140066h;
            if (hVar == null) {
                C89219l.m154710a("mAdapter");
            }
            hVar.mo67813a((AbstractC39063h.AbstractC39067a) this);
            C61849h hVar2 = this.f140066h;
            if (hVar2 == null) {
                C89219l.m154710a("mAdapter");
            }
            hVar2.mo67829d(true);
            C61849h hVar3 = this.f140066h;
            if (hVar3 == null) {
                C89219l.m154710a("mAdapter");
            }
            hVar3.ap_();
            RecyclerView recyclerView3 = (RecyclerView) _$_findCachedViewById(R.id.cv1);
            C89219l.m154716b(recyclerView3, "");
            C61849h hVar4 = this.f140066h;
            if (hVar4 == null) {
                C89219l.m154710a("mAdapter");
            }
            recyclerView3.setAdapter(hVar4);
            ((TuxStatusView) _$_findCachedViewById(R.id.e7i)).mo37867a();
            TuxStatusView tuxStatusView = (TuxStatusView) _$_findCachedViewById(R.id.e7i);
            C89219l.m154716b(tuxStatusView, "");
            tuxStatusView.setVisibility(0);
            onRefresh();
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.notification.MusNotificationDetailActivity", "onCreate", false);
            MethodCollector.m26664o(3402);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
        MethodCollector.m26664o(3402);
        throw nullPointerException;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: b */
    public final void mo59517b(List<BaseNotice> list, boolean z) {
        if (list == null || list.isEmpty()) {
            z = false;
        }
        if (!z) {
            m111749j();
        } else {
            C61849h hVar = this.f140066h;
            if (hVar == null) {
                C89219l.m154710a("mAdapter");
            }
            hVar.aq_();
        }
        C61849h hVar2 = this.f140066h;
        if (hVar2 == null) {
            C89219l.m154710a("mAdapter");
        }
        hVar2.mo62376b(list);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: a */
    public final void mo59512a(List<BaseNotice> list, boolean z) {
        C61849h hVar = this.f140066h;
        if (hVar == null) {
            C89219l.m154710a("mAdapter");
        }
        hVar.mo67829d(true);
        int i = 0;
        if (this.f140071m) {
            C61849h hVar2 = this.f140066h;
            if (hVar2 == null) {
                C89219l.m154710a("mAdapter");
            }
            hVar2.f140413a = 0;
        }
        this.f140071m = true;
        if (!z) {
            m111749j();
        } else {
            C61849h hVar3 = this.f140066h;
            if (hVar3 == null) {
                C89219l.m154710a("mAdapter");
            }
            hVar3.aq_();
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) _$_findCachedViewById(R.id.cva);
        C89219l.m154716b(swipeRefreshLayout, "");
        swipeRefreshLayout.setRefreshing(false);
        C61849h hVar4 = this.f140066h;
        if (hVar4 == null) {
            C89219l.m154710a("mAdapter");
        }
        hVar4.mo62377b_(list);
        TuxStatusView tuxStatusView = (TuxStatusView) _$_findCachedViewById(R.id.e7i);
        C89219l.m154716b(tuxStatusView, "");
        tuxStatusView.setVisibility(8);
        if (list != null) {
            i = list.size();
        }
        C56386j.m102360a(i);
    }
}
