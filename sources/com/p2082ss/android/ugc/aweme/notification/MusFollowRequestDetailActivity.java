package com.p2082ss.android.ugc.aweme.notification;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.AbstractC1391ab;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.dmt.p1194ui.titlebar.AbstractC17250a;
import com.bytedance.ies.dmt.p1194ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.base.p2379ui.C34692l;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import com.p2082ss.android.ugc.aweme.framework.p3007b.C51425a;
import com.p2082ss.android.ugc.aweme.inbox.p3269d.C56386j;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.notice.api.C61542b;
import com.p2082ss.android.ugc.aweme.notice.api.p3510b.C61546b;
import com.p2082ss.android.ugc.aweme.notification.adapter.C61817c;
import com.p2082ss.android.ugc.aweme.notification.followrequest.AbstractC62004a;
import com.p2082ss.android.ugc.aweme.notification.followrequest.model.C62020a;
import com.p2082ss.android.ugc.aweme.notification.followrequest.p3526a.AbstractC62006b;
import com.p2082ss.android.ugc.aweme.notification.followrequest.p3526a.C62005a;
import com.p2082ss.android.ugc.aweme.notification.utils.C62278q;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3251b.C56196c;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89037ac;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.MusFollowRequestDetailActivity */
public final class MusFollowRequestDetailActivity extends ActivityC17312a implements SwipeRefreshLayout.AbstractC1559b, AbstractC39063h.AbstractC39067a, AbstractC62004a, AbstractC62006b, AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    public static final C61661a f139968a = new C61661a((byte) 0);

    /* renamed from: b */
    private C61817c f139969b;

    /* renamed from: c */
    private final AbstractC89244h f139970c = C89250i.m154773a((AbstractC89171a) new C61664d(this));

    /* renamed from: d */
    private final AbstractC89244h f139971d = C89250i.m154773a((AbstractC89171a) new C61665e(this));

    /* renamed from: e */
    private SparseArray f139972e;

    static {
        Covode.recordClassIndex(72389);
    }

    /* renamed from: b */
    private final C62005a m111669b() {
        return (C62005a) this.f139970c.getValue();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f139972e;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f139972e == null) {
            this.f139972e = new SparseArray();
        }
        View view = (View) this.f139972e.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f139972e.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.followrequest.p3526a.AbstractC62006b
    /* renamed from: a */
    public final void mo99809a(List<User> list, int i) {
        C89219l.m154721d(list, "");
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(79, new RunnableC90250g(MusFollowRequestDetailActivity.class, "onUserPageHandleRequest", C61546b.class, ThreadMode.MAIN, 0, false));
        hashMap.put(63, new RunnableC90250g(MusFollowRequestDetailActivity.class, "onRefreshMessageButton", C56196c.class, ThreadMode.MAIN, 0, false));
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.notification.MusFollowRequestDetailActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.notification.MusFollowRequestDetailActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.notification.MusFollowRequestDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.MusFollowRequestDetailActivity$a */
    public static final class C61661a {
        static {
            Covode.recordClassIndex(72390);
        }

        private C61661a() {
        }

        public /* synthetic */ C61661a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m111678a(Fragment fragment, Integer num) {
            C89219l.m154721d(fragment, "");
            Intent intent = new Intent(fragment.getContext(), MusFollowRequestDetailActivity.class);
            intent.putExtra("unread_count", num);
            fragment.startActivityForResult(intent, 1024);
        }
    }

    /* renamed from: c */
    private static boolean m111670c() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.MusFollowRequestDetailActivity$d */
    static final class C61664d extends AbstractC89220m implements AbstractC89171a<C62005a> {

        /* renamed from: a */
        final /* synthetic */ MusFollowRequestDetailActivity f139975a;

        static {
            Covode.recordClassIndex(72393);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61664d(MusFollowRequestDetailActivity musFollowRequestDetailActivity) {
            super(0);
            this.f139975a = musFollowRequestDetailActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C62005a invoke() {
            C62005a aVar = new C62005a();
            aVar.mo67838a(new C62020a());
            aVar.mo67839a_(this.f139975a);
            return aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.MusFollowRequestDetailActivity$e */
    static final class C61665e extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        final /* synthetic */ MusFollowRequestDetailActivity f139976a;

        static {
            Covode.recordClassIndex(72394);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61665e(MusFollowRequestDetailActivity musFollowRequestDetailActivity) {
            super(0);
            this.f139976a = musFollowRequestDetailActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(this.f139976a.getIntent().getIntExtra("unread_count", 0));
        }
    }

    /* renamed from: d */
    private final void m111671d() {
        C61817c cVar = this.f139969b;
        if (cVar == null) {
            C89219l.m154710a("mAdapter");
        }
        cVar.ap_();
        C61817c cVar2 = this.f139969b;
        if (cVar2 == null) {
            C89219l.m154710a("mAdapter");
        }
        cVar2.mo67829d(false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
        m111669b().ck_();
        EventBus.m156962a().mo145395b(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h.AbstractC39067a
    /* renamed from: l */
    public final void mo62679l() {
        long currentTimeMillis;
        C62005a b = m111669b();
        C62020a aVar = (C62020a) b.f92286h;
        if (aVar != null) {
            T t = aVar.mData;
            if (t != null) {
                currentTimeMillis = t.minTime;
            } else {
                currentTimeMillis = System.currentTimeMillis() / 1000;
            }
            aVar.f140754a = currentTimeMillis;
            aVar.f140755b = 1;
            aVar.f140757d = false;
            aVar.f140756c = true;
            aVar.mo100073a(aVar.f140754a, aVar.f140755b, 20);
        }
        b.mo57527b();
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

    @Override // com.p2082ss.android.ugc.aweme.notification.followrequest.p3526a.AbstractC62006b, com.p2082ss.android.ugc.aweme.notification.followrequest.AbstractC62004a
    /* renamed from: a */
    public final void mo99808a() {
        C61817c cVar = this.f139969b;
        if (cVar == null) {
            C89219l.m154710a("mAdapter");
        }
        cVar.mo67810f();
        C61817c cVar2 = this.f139969b;
        if (cVar2 == null) {
            C89219l.m154710a("mAdapter");
        }
        if (cVar2.f92274v) {
            C61817c cVar3 = this.f139969b;
            if (cVar3 == null) {
                C89219l.m154710a("mAdapter");
            }
            cVar3.mo67829d(false);
            C61817c cVar4 = this.f139969b;
            if (cVar4 == null) {
                C89219l.m154710a("mAdapter");
            }
            cVar4.notifyDataSetChanged();
            m111671d();
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) _$_findCachedViewById(R.id.edb);
        C89219l.m154716b(swipeRefreshLayout, "");
        swipeRefreshLayout.setRefreshing(false);
        C61817c cVar5 = this.f139969b;
        if (cVar5 == null) {
            C89219l.m154710a("mAdapter");
        }
        if (cVar5.getItemCount() == 0) {
            ((DmtStatusView) _$_findCachedViewById(R.id.e7i)).mo27385g();
        }
        T t = m111669b().f92286h;
        C89219l.m154716b(t, "");
        C56386j.m102361a((BaseResponse) t.mData);
        C56386j.m102360a(0);
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.AbstractC1559b
    public final void onRefresh() {
        if (!C58029j.f132253e || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132253e = m111670c();
        }
        if (C58029j.f132253e) {
            C61817c cVar = this.f139969b;
            if (cVar == null) {
                C89219l.m154710a("mAdapter");
            }
            if (cVar.getItemCount() == 0) {
                ((DmtStatusView) _$_findCachedViewById(R.id.e7i)).mo27384f();
            }
            C62005a b = m111669b();
            C62020a aVar = (C62020a) b.f92286h;
            if (aVar != null) {
                aVar.f140754a = System.currentTimeMillis() / 1000;
                aVar.f140755b = 1;
                aVar.f140757d = false;
                aVar.f140756c = false;
                aVar.mo100073a(aVar.f140754a, aVar.f140755b, 20);
            }
            b.mo57527b();
            C56386j.m102359a();
            return;
        }
        C61817c cVar2 = this.f139969b;
        if (cVar2 == null) {
            C89219l.m154710a("mAdapter");
        }
        if (cVar2.getItemCount() == 0) {
            C1731i.m5631a(100).mo5534a(new C61670g(this), C1731i.f5564c, null);
        }
        C56386j.f128613a = null;
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.MusFollowRequestDetailActivity$b */
    public static final class C61662b implements AbstractC17251a {

        /* renamed from: a */
        final /* synthetic */ MusFollowRequestDetailActivity f139973a;

        static {
            Covode.recordClassIndex(72391);
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: b */
        public final void mo27340b(View view) {
            C89219l.m154721d(view, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C61662b(MusFollowRequestDetailActivity musFollowRequestDetailActivity) {
            this.f139973a = musFollowRequestDetailActivity;
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: a */
        public final void mo27339a(View view) {
            C89219l.m154721d(view, "");
            this.f139973a.finish();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.MusFollowRequestDetailActivity$c */
    static final class View$OnClickListenerC61663c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MusFollowRequestDetailActivity f139974a;

        static {
            Covode.recordClassIndex(72392);
        }

        View$OnClickListenerC61663c(MusFollowRequestDetailActivity musFollowRequestDetailActivity) {
            this.f139974a = musFollowRequestDetailActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f139974a.onRefresh();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.MusFollowRequestDetailActivity$f */
    static final class C61666f extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        public static final C61666f f139977a = new C61666f();

        static {
            Covode.recordClassIndex(72395);
        }

        C61666f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(C616671.f139978a);
            baseActivityViewModel2.config(C616682.f139979a);
            baseActivityViewModel2.config(C616693.f139980a);
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.followrequest.p3526a.AbstractC62006b
    /* renamed from: b */
    public final void mo99812b(boolean z) {
        if (z) {
            C61817c cVar = this.f139969b;
            if (cVar == null) {
                C89219l.m154710a("mAdapter");
            }
            cVar.ao_();
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onRefreshMessageButton(C56196c cVar) {
        C89219l.m154721d(cVar, "");
        C61817c cVar2 = this.f139969b;
        if (cVar2 == null) {
            C89219l.m154710a("mAdapter");
        }
        cVar2.notifyDataSetChanged();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.MusFollowRequestDetailActivity$g */
    public static final class C61670g<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ MusFollowRequestDetailActivity f139981a;

        static {
            Covode.recordClassIndex(72399);
        }

        C61670g(MusFollowRequestDetailActivity musFollowRequestDetailActivity) {
            this.f139981a = musFollowRequestDetailActivity;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            if (!this.f139981a.isDestroyed()) {
                ((DmtStatusView) this.f139981a._$_findCachedViewById(R.id.e7i)).mo27387h();
                new C23144b(this.f139981a).mo37640e(R.string.dcq).mo37637b();
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.followrequest.p3526a.AbstractC62006b
    /* renamed from: a */
    public final void mo99811a(boolean z) {
        if (z) {
            C61817c cVar = this.f139969b;
            if (cVar == null) {
                C89219l.m154710a("mAdapter");
            }
            cVar.mo67824j();
            return;
        }
        C61817c cVar2 = this.f139969b;
        if (cVar2 == null) {
            C89219l.m154710a("mAdapter");
        }
        if (cVar2.f92274v) {
            C61817c cVar3 = this.f139969b;
            if (cVar3 == null) {
                C89219l.m154710a("mAdapter");
            }
            cVar3.mo67829d(false);
            C61817c cVar4 = this.f139969b;
            if (cVar4 == null) {
                C89219l.m154710a("mAdapter");
            }
            cVar4.notifyDataSetChanged();
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) _$_findCachedViewById(R.id.edb);
        C89219l.m154716b(swipeRefreshLayout, "");
        swipeRefreshLayout.setRefreshing(false);
        C61817c cVar5 = this.f139969b;
        if (cVar5 == null) {
            C89219l.m154710a("mAdapter");
        }
        if (cVar5.getItemCount() == 0) {
            ((DmtStatusView) _$_findCachedViewById(R.id.e7i)).mo27387h();
        }
        T t = m111669b().f92286h;
        C89219l.m154716b(t, "");
        C56386j.m102361a((BaseResponse) t.mData);
        C56386j.m102360a(0);
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.notification.MusFollowRequestDetailActivity", "onCreate", true);
        activityConfiguration(C61666f.f139977a);
        super.onCreate(bundle);
        C56386j.m102362a(C56386j.EnumC56387a.DETAIL_TYPE_FOLLOW_REQUEST, 0, "");
        setContentView(R.layout.jy);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.dgw);
        C89219l.m154716b(recyclerView, "");
        RecyclerView.AbstractC1356f itemAnimator = recyclerView.getItemAnimator();
        Objects.requireNonNull(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
        ((AbstractC1391ab) itemAnimator).f4621m = false;
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(R.id.dgw);
        C89219l.m154716b(recyclerView2, "");
        recyclerView2.setLayoutManager(new WrapLinearLayoutManager());
        ((RecyclerView) _$_findCachedViewById(R.id.dgw)).mo4415b(new C34692l((int) C13628n.m24520b(this, 1.0f), 0));
        ((RecyclerView) _$_findCachedViewById(R.id.dgw)).mo4405a(new C51425a(this));
        ((DmtStatusView) _$_findCachedViewById(R.id.e7i)).setBuilder(DmtStatusView.C17269a.m31905a(this).mo27397a().mo27399a(R.string.bg, R.string.et5).mo27400a(2131233181, R.string.gzs, R.string.gzr, R.string.gzy, new View$OnClickListenerC61663c(this)));
        C62278q.m112666a((RecyclerView) _$_findCachedViewById(R.id.dgw), (SwipeRefreshLayout) _$_findCachedViewById(R.id.edb));
        ((SwipeRefreshLayout) _$_findCachedViewById(R.id.edb)).setOnRefreshListener(this);
        ((AbstractC17250a) _$_findCachedViewById(R.id.eiz)).setTitle(R.string.bg);
        ((TextTitleBar) _$_findCachedViewById(R.id.eiz)).setOnTitleBarClickListener(new C61662b(this));
        C61817c cVar = new C61817c(this);
        this.f139969b = cVar;
        cVar.f140326a = ((Number) this.f139971d.getValue()).intValue();
        C61817c cVar2 = this.f139969b;
        if (cVar2 == null) {
            C89219l.m154710a("mAdapter");
        }
        cVar2.mo67813a((AbstractC39063h.AbstractC39067a) this);
        C61817c cVar3 = this.f139969b;
        if (cVar3 == null) {
            C89219l.m154710a("mAdapter");
        }
        cVar3.mo67829d(true);
        C61817c cVar4 = this.f139969b;
        if (cVar4 == null) {
            C89219l.m154710a("mAdapter");
        }
        cVar4.ap_();
        RecyclerView recyclerView3 = (RecyclerView) _$_findCachedViewById(R.id.dgw);
        C89219l.m154716b(recyclerView3, "");
        C61817c cVar5 = this.f139969b;
        if (cVar5 == null) {
            C89219l.m154710a("mAdapter");
        }
        recyclerView3.setAdapter(cVar5);
        ((DmtStatusView) _$_findCachedViewById(R.id.e7i)).mo27384f();
        onRefresh();
        EventBus.m156966a(EventBus.m156962a(), this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.notification.MusFollowRequestDetailActivity", "onCreate", false);
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onUserPageHandleRequest(C61546b bVar) {
        Integer valueOf;
        C89219l.m154721d(bVar, "");
        if (bVar.f139698b == -101) {
            C61817c cVar = this.f139969b;
            if (cVar == null) {
                C89219l.m154710a("mAdapter");
            }
            String str = bVar.f139697a;
            C89219l.m154721d(str, "");
            List e = cVar.mo63369e();
            C89219l.m154716b(e, "");
            Iterable m = C89070n.m154593m(e);
            ArrayList arrayList = new ArrayList();
            for (Object obj : m) {
                T t = ((C89037ac) obj).f202767b;
                C89219l.m154716b(t, "");
                if (C89219l.m154714a((Object) t.getUid(), (Object) str)) {
                    arrayList.add(obj);
                }
            }
            C89037ac acVar = (C89037ac) C89070n.m154583g((List) arrayList);
            if (!(acVar == null || (valueOf = Integer.valueOf(acVar.f202766a)) == null)) {
                cVar.mo93501d(valueOf.intValue());
                return;
            }
            return;
        }
        C61817c cVar2 = this.f139969b;
        if (cVar2 == null) {
            C89219l.m154710a("mAdapter");
        }
        List e2 = cVar2.mo63369e();
        C89219l.m154716b(e2, "");
        Iterable m2 = C89070n.m154593m(e2);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : m2) {
            T t2 = ((C89037ac) obj2).f202767b;
            C89219l.m154716b(t2, "");
            if (C89219l.m154714a((Object) t2.getUid(), (Object) bVar.f139697a)) {
                arrayList2.add(obj2);
            }
        }
        C89037ac acVar2 = (C89037ac) C89070n.m154583g((List) arrayList2);
        if (acVar2 != null) {
            int i = bVar.f139698b;
            if (i == -100) {
                T t3 = acVar2.f202767b;
                C89219l.m154716b(t3, "");
                t3.setFollowerStatus(1);
            } else if (i == 4) {
                T t4 = acVar2.f202767b;
                C89219l.m154716b(t4, "");
                t4.setFollowStatus(4);
            } else if (i == 0) {
                T t5 = acVar2.f202767b;
                C89219l.m154716b(t5, "");
                t5.setFollowStatus(0);
            } else if (i == 1) {
                T t6 = acVar2.f202767b;
                C89219l.m154716b(t6, "");
                t6.setFollowStatus(1);
            } else if (i == 2) {
                T t7 = acVar2.f202767b;
                C89219l.m154716b(t7, "");
                t7.setFollowStatus(2);
            }
            C61817c cVar3 = this.f139969b;
            if (cVar3 == null) {
                C89219l.m154710a("mAdapter");
            }
            cVar3.notifyItemChanged(acVar2.f202766a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.followrequest.p3526a.AbstractC62006b
    /* renamed from: a */
    public final void mo99810a(List<User> list, boolean z, boolean z2) {
        C89219l.m154721d(list, "");
        if (z) {
            if (!list.isEmpty() && z2) {
                C61817c cVar = this.f139969b;
                if (cVar == null) {
                    C89219l.m154710a("mAdapter");
                }
                cVar.aq_();
            } else {
                m111671d();
            }
            C61817c cVar2 = this.f139969b;
            if (cVar2 == null) {
                C89219l.m154710a("mAdapter");
            }
            cVar2.mo62376b(list);
            return;
        }
        C61817c cVar3 = this.f139969b;
        if (cVar3 == null) {
            C89219l.m154710a("mAdapter");
        }
        cVar3.mo67829d(true);
        if (!z2) {
            m111671d();
        } else {
            C61817c cVar4 = this.f139969b;
            if (cVar4 == null) {
                C89219l.m154710a("mAdapter");
            }
            cVar4.aq_();
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) _$_findCachedViewById(R.id.edb);
        C89219l.m154716b(swipeRefreshLayout, "");
        swipeRefreshLayout.setRefreshing(false);
        C61817c cVar5 = this.f139969b;
        if (cVar5 == null) {
            C89219l.m154710a("mAdapter");
        }
        cVar5.f140326a = C61542b.m111458a(12);
        C61817c cVar6 = this.f139969b;
        if (cVar6 == null) {
            C89219l.m154710a("mAdapter");
        }
        cVar6.mo62377b_(list);
        ((DmtStatusView) _$_findCachedViewById(R.id.e7i)).mo27382d();
        T t = m111669b().f92286h;
        C89219l.m154716b(t, "");
        C56386j.m102361a((BaseResponse) t.mData);
        C56386j.m102360a(list.size());
    }
}
