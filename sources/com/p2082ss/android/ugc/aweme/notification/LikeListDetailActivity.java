package com.p2082ss.android.ugc.aweme.notification;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.AbstractC1214u;
import androidx.recyclerview.widget.AbstractC1391ab;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.dmt.p1194ui.widget.AutoRTLImageView;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.C34692l;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c;
import com.p2082ss.android.ugc.aweme.framework.p3007b.C51425a;
import com.p2082ss.android.ugc.aweme.inbox.p3269d.C56386j;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.notification.adapter.C61813b;
import com.p2082ss.android.ugc.aweme.notification.bean.C61868c;
import com.p2082ss.android.ugc.aweme.notification.model.LikeListModel;
import com.p2082ss.android.ugc.aweme.notification.p3525f.C62000a;
import com.p2082ss.android.ugc.aweme.notification.utils.C62265i;
import com.p2082ss.android.ugc.aweme.p2479ck.C36125t;
import com.p2082ss.android.ugc.aweme.p2479ck.C36131u;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3251b.C56196c;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4166g.C79440a;
import com.p2082ss.android.ugc.aweme.userservice.UserService;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
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
import p4600h.EnumC89331m;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.LikeListDetailActivity */
public final class LikeListDetailActivity extends ActivityC17312a implements AbstractC39063h.AbstractC39067a, AbstractC39102c<C61868c>, AbstractC90252i, AbstractC90253j {

    /* renamed from: c */
    public static final C61640a f139934c = new C61640a((byte) 0);

    /* renamed from: o */
    private static final int f139935o = ((int) C13628n.m24520b(C17867d.m33078a(), 8.0f));

    /* renamed from: a */
    final AbstractC89244h f139936a = RouteArgExtension.INSTANCE.optionalArgNotNull(this, C61650j.f139958a, "is_new", Boolean.class);

    /* renamed from: b */
    final AbstractC89244h f139937b = RouteArgExtension.INSTANCE.optionalArgNotNull(this, C61651k.f139959a, "last_read_time", Long.class);

    /* renamed from: d */
    private final AbstractC89244h f139938d = C89250i.m154774a(EnumC89331m.NONE, C61645e.f139953a);

    /* renamed from: e */
    private final AbstractC89244h f139939e = C89250i.m154774a(EnumC89331m.NONE, new C61653m(this));

    /* renamed from: f */
    private final AbstractC89244h f139940f = RouteArgExtension.INSTANCE.optionalArg(this, C61652l.f139960a, "nid", String.class);

    /* renamed from: g */
    private final AbstractC89244h f139941g = RouteArgExtension.INSTANCE.optionalArg(this, C61646f.f139954a, "aweme_id", String.class);

    /* renamed from: h */
    private final AbstractC89244h f139942h = RouteArgExtension.INSTANCE.optionalArg(this, C61654n.f139962a, "ref_id", String.class);

    /* renamed from: i */
    private final AbstractC89244h f139943i = RouteArgExtension.INSTANCE.optionalArgNotNull(this, C61649i.f139957a, "digg_type", Integer.class);

    /* renamed from: j */
    private final AbstractC89244h f139944j = RouteArgExtension.INSTANCE.optionalArg(this, C61655o.f139963a, "second_title", String.class);

    /* renamed from: k */
    private final AbstractC89244h f139945k = RouteArgExtension.INSTANCE.optionalArg(this, C61647g.f139955a, "cover", UrlModel.class);

    /* renamed from: l */
    private final AbstractC89244h f139946l = RouteArgExtension.INSTANCE.optionalArg(this, C61648h.f139956a, "cover_url", String.class);

    /* renamed from: m */
    private final AbstractC89244h f139947m = RouteArgExtension.INSTANCE.optionalArg(this, C61656p.f139964a, "tab_name", String.class);

    /* renamed from: n */
    private List<C61868c> f139948n;

    /* renamed from: p */
    private SparseArray f139949p;

    /* renamed from: j */
    private final C62000a m111649j() {
        return (C62000a) this.f139939e.getValue();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f139949p;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f139949p == null) {
            this.f139949p = new SparseArray();
        }
        View view = (View) this.f139949p.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f139949p.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final C61813b mo99800a() {
        return (C61813b) this.f139938d.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: a */
    public final void mo59511a(Exception exc) {
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    public final void bl_() {
    }

    /* renamed from: c */
    public final String mo99802c() {
        return (String) this.f139941g.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: c */
    public final void mo59523c(List<C61868c> list, boolean z) {
    }

    /* renamed from: d */
    public final String mo99803d() {
        return (String) this.f139942h.getValue();
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(63, new RunnableC90250g(LikeListDetailActivity.class, "onRefreshMessageButton", C56196c.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    /* renamed from: h */
    public final int mo99804h() {
        return ((Number) this.f139943i.getValue()).intValue();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.notification.LikeListDetailActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.notification.LikeListDetailActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.notification.LikeListDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.LikeListDetailActivity$a */
    public static final class C61640a {
        static {
            Covode.recordClassIndex(72368);
        }

        private C61640a() {
        }

        public /* synthetic */ C61640a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m111668a(Context context, String str, String str2, String str3, boolean z, int i, long j, String str4, UrlModel urlModel, String str5) {
            C89219l.m154721d(context, "");
            if (str2 != null && str2.length() != 0 && str3 != null && str3.length() != 0) {
                Intent intent = new Intent(context, LikeListDetailActivity.class);
                intent.putExtra("nid", str);
                intent.putExtra("aweme_id", str2);
                intent.putExtra("ref_id", str3);
                intent.putExtra("is_new", z);
                intent.putExtra("digg_type", i);
                intent.putExtra("last_read_time", j);
                intent.putExtra("second_title", str4);
                if (str5 == null) {
                    str5 = "";
                }
                intent.putExtra("tab_name", str5);
                if (urlModel != null) {
                    intent.putExtra("cover", urlModel);
                }
                C84349a.m145093a(intent, context);
                context.startActivity(intent);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.LikeListDetailActivity$e */
    static final class C61645e extends AbstractC89220m implements AbstractC89171a<C61813b> {

        /* renamed from: a */
        public static final C61645e f139953a = new C61645e();

        static {
            Covode.recordClassIndex(72373);
        }

        C61645e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C61813b invoke() {
            return new C61813b((byte) 0);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    public final void aW_() {
        mo99800a().ao_();
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.LikeListDetailActivity$s */
    static final /* synthetic */ class C61660s extends C89217j implements AbstractC89171a<C89391z> {
        static {
            Covode.recordClassIndex(72388);
        }

        C61660s(LikeListDetailActivity likeListDetailActivity) {
            super(0, likeListDetailActivity, LikeListDetailActivity.class, "doRefresh", "doRefresh()V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            ((LikeListDetailActivity) this.receiver).mo99805i();
            return C89391z.f203057a;
        }
    }

    /* renamed from: k */
    private static boolean m111650k() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: n */
    private final void m111652n() {
        mo99800a().ap_();
        mo99800a().mo67829d(false);
    }

    static {
        Covode.recordClassIndex(72367);
    }

    /* renamed from: m */
    private static boolean m111651m() {
        if (C58029j.f132253e && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132253e;
        }
        boolean k = m111650k();
        C58029j.f132253e = k;
        return k;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: b */
    public final void mo59515b() {
        TuxStatusView tuxStatusView = (TuxStatusView) _$_findCachedViewById(R.id.e7i);
        C89219l.m154716b(tuxStatusView, "");
        tuxStatusView.setVisibility(0);
        ((TuxStatusView) _$_findCachedViewById(R.id.e7i)).mo37867a();
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h.AbstractC39067a
    /* renamed from: l */
    public final void mo62679l() {
        C62000a j = m111649j();
        LikeListModel likeListModel = (LikeListModel) j.f92286h;
        if (likeListModel != null) {
            likeListModel.loadMore();
        }
        j.mo57527b();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
        m111649j().ck_();
        EventBus.m156962a().mo145395b(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.LikeListDetailActivity$m */
    static final class C61653m extends AbstractC89220m implements AbstractC89171a<C62000a> {

        /* renamed from: a */
        final /* synthetic */ LikeListDetailActivity f139961a;

        static {
            Covode.recordClassIndex(72381);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61653m(LikeListDetailActivity likeListDetailActivity) {
            super(0);
            this.f139961a = likeListDetailActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C62000a invoke() {
            C62000a aVar = new C62000a();
            String d = this.f139961a.mo99803d();
            if (d == null) {
                d = "";
            }
            aVar.mo67838a(new LikeListModel(d, ((Boolean) this.f139961a.f139936a.getValue()).booleanValue(), this.f139961a.mo99804h(), ((Number) this.f139961a.f139937b.getValue()).longValue()));
            aVar.mo67839a_(this.f139961a);
            return aVar;
        }
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

    /* renamed from: com.ss.android.ugc.aweme.notification.LikeListDetailActivity$d */
    static final class C61644d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ LikeListDetailActivity f139952a;

        static {
            Covode.recordClassIndex(72372);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61644d(LikeListDetailActivity likeListDetailActivity) {
            super(0);
            this.f139952a = likeListDetailActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C36131u a = C36131u.m73602a("aweme://aweme/detail/" + this.f139952a.mo99802c()).mo63248a("refer", "message");
            if (this.f139952a.mo99804h() == 3) {
                a.mo63248a("cid", this.f139952a.mo99803d());
            }
            C36125t.m73598a(C36125t.m73591a(), a.mo63249a());
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: f */
    public final void mo59525f() {
        if (mo99800a().f92274v) {
            mo99800a().mo67829d(false);
            mo99800a().notifyDataSetChanged();
            m111652n();
        }
        if (mo99800a().getItemCount() == 0) {
            TuxStatusView tuxStatusView = (TuxStatusView) _$_findCachedViewById(R.id.e7i);
            C89219l.m154716b(tuxStatusView, "");
            tuxStatusView.setVisibility(0);
            TuxStatusView.C23263c cVar = new TuxStatusView.C23263c();
            String string = getString(R.string.cej);
            C89219l.m154716b(string, "");
            TuxStatusView.C23263c a = cVar.mo37879a(string);
            String string2 = getString(R.string.cei);
            C89219l.m154716b(string2, "");
            ((TuxStatusView) _$_findCachedViewById(R.id.e7i)).setStatus(a.mo37878a((CharSequence) string2));
        }
        C56386j.m102360a(0);
    }

    /* renamed from: i */
    public final void mo99805i() {
        if (m111651m()) {
            if (mo99800a().getItemCount() == 0) {
                TuxStatusView tuxStatusView = (TuxStatusView) _$_findCachedViewById(R.id.e7i);
                C89219l.m154716b(tuxStatusView, "");
                tuxStatusView.setVisibility(0);
                ((TuxStatusView) _$_findCachedViewById(R.id.e7i)).mo37867a();
            }
            m111649j().mo100051e();
            C56386j.m102359a();
            return;
        }
        if (mo99800a().getItemCount() == 0) {
            C1731i.m5631a(100).mo5534a(new C61642c(this), C1731i.f5564c, null);
        }
        C56386j.f128613a = null;
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.LikeListDetailActivity$f */
    static final class C61646f extends AbstractC89220m implements AbstractC89172b<Boolean, String> {

        /* renamed from: a */
        public static final C61646f f139954a = new C61646f();

        static {
            Covode.recordClassIndex(72374);
        }

        C61646f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ String invoke(Boolean bool) {
            bool.booleanValue();
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.LikeListDetailActivity$g */
    static final class C61647g extends AbstractC89220m implements AbstractC89172b<Boolean, UrlModel> {

        /* renamed from: a */
        public static final C61647g f139955a = new C61647g();

        static {
            Covode.recordClassIndex(72375);
        }

        C61647g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ UrlModel invoke(Boolean bool) {
            bool.booleanValue();
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.LikeListDetailActivity$h */
    static final class C61648h extends AbstractC89220m implements AbstractC89172b<Boolean, String> {

        /* renamed from: a */
        public static final C61648h f139956a = new C61648h();

        static {
            Covode.recordClassIndex(72376);
        }

        C61648h() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ String invoke(Boolean bool) {
            bool.booleanValue();
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.LikeListDetailActivity$l */
    static final class C61652l extends AbstractC89220m implements AbstractC89172b<Boolean, String> {

        /* renamed from: a */
        public static final C61652l f139960a = new C61652l();

        static {
            Covode.recordClassIndex(72380);
        }

        C61652l() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ String invoke(Boolean bool) {
            bool.booleanValue();
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.LikeListDetailActivity$n */
    static final class C61654n extends AbstractC89220m implements AbstractC89172b<Boolean, String> {

        /* renamed from: a */
        public static final C61654n f139962a = new C61654n();

        static {
            Covode.recordClassIndex(72382);
        }

        C61654n() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ String invoke(Boolean bool) {
            bool.booleanValue();
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.LikeListDetailActivity$o */
    static final class C61655o extends AbstractC89220m implements AbstractC89172b<Boolean, String> {

        /* renamed from: a */
        public static final C61655o f139963a = new C61655o();

        static {
            Covode.recordClassIndex(72383);
        }

        C61655o() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ String invoke(Boolean bool) {
            bool.booleanValue();
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.LikeListDetailActivity$p */
    static final class C61656p extends AbstractC89220m implements AbstractC89172b<Boolean, String> {

        /* renamed from: a */
        public static final C61656p f139964a = new C61656p();

        static {
            Covode.recordClassIndex(72384);
        }

        C61656p() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ String invoke(Boolean bool) {
            bool.booleanValue();
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: c */
    public final void mo59522c(Exception exc) {
        mo99800a().mo67824j();
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.LikeListDetailActivity$b */
    static final class View$OnClickListenerC61641b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LikeListDetailActivity f139950a;

        static {
            Covode.recordClassIndex(72369);
        }

        View$OnClickListenerC61641b(LikeListDetailActivity likeListDetailActivity) {
            this.f139950a = likeListDetailActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f139950a.finish();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.LikeListDetailActivity$i */
    static final class C61649i extends AbstractC89220m implements AbstractC89172b<Boolean, Integer> {

        /* renamed from: a */
        public static final C61649i f139957a = new C61649i();

        static {
            Covode.recordClassIndex(72377);
        }

        C61649i() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Integer invoke(Boolean bool) {
            bool.booleanValue();
            return 1;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.LikeListDetailActivity$j */
    static final class C61650j extends AbstractC89220m implements AbstractC89172b<Boolean, Boolean> {

        /* renamed from: a */
        public static final C61650j f139958a = new C61650j();

        static {
            Covode.recordClassIndex(72378);
        }

        C61650j() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Boolean bool) {
            bool.booleanValue();
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.LikeListDetailActivity$k */
    static final class C61651k extends AbstractC89220m implements AbstractC89172b<Boolean, Long> {

        /* renamed from: a */
        public static final C61651k f139959a = new C61651k();

        static {
            Covode.recordClassIndex(72379);
        }

        C61651k() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Long invoke(Boolean bool) {
            bool.booleanValue();
            return 0L;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.LikeListDetailActivity$q */
    static final class C61657q extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        public static final C61657q f139965a = new C61657q();

        static {
            Covode.recordClassIndex(72385);
        }

        C61657q() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(C616581.f139966a);
            return C89391z.f203057a;
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onRefreshMessageButton(C56196c cVar) {
        C89219l.m154721d(cVar, "");
        mo99800a().notifyDataSetChanged();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.LikeListDetailActivity$c */
    public static final class C61642c<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ LikeListDetailActivity f139951a;

        static {
            Covode.recordClassIndex(72370);
        }

        C61642c(LikeListDetailActivity likeListDetailActivity) {
            this.f139951a = likeListDetailActivity;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            if (!this.f139951a.isDestroyed()) {
                TuxStatusView tuxStatusView = (TuxStatusView) this.f139951a._$_findCachedViewById(R.id.e7i);
                C89219l.m154716b(tuxStatusView, "");
                tuxStatusView.setVisibility(0);
                ((TuxStatusView) this.f139951a._$_findCachedViewById(R.id.e7i)).setStatus(C79440a.m138169a(new TuxStatusView.C23263c(), new AbstractC89171a<C89391z>(this.f139951a) {
                    /* class com.p2082ss.android.ugc.aweme.notification.LikeListDetailActivity.C61642c.C616431 */

                    static {
                        Covode.recordClassIndex(72371);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // p4600h.p4611f.p4612a.AbstractC89171a
                    public final /* synthetic */ C89391z invoke() {
                        ((LikeListDetailActivity) this.receiver).mo99805i();
                        return C89391z.f203057a;
                    }
                }));
                new C23144b(this.f139951a).mo37640e(R.string.dcq).mo37637b();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.LikeListDetailActivity$r */
    static final class C61659r<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ LikeListDetailActivity f139967a;

        static {
            Covode.recordClassIndex(72387);
        }

        C61659r(LikeListDetailActivity likeListDetailActivity) {
            this.f139967a = likeListDetailActivity;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            String str;
            FollowStatus followStatus = (FollowStatus) obj;
            if (followStatus != null) {
                C61813b a = this.f139967a.mo99800a();
                C89219l.m154721d(followStatus, "");
                List<T> e = a.mo63369e();
                if (e != null) {
                    Iterator<T> it = e.iterator();
                    int i = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        T next = it.next();
                        if (next != null) {
                            str = next.getUid();
                        } else {
                            str = null;
                        }
                        if (!C89219l.m154714a((Object) str, (Object) followStatus.userId)) {
                            i++;
                        } else if (i >= 0) {
                            T t = e.get(i);
                            C89219l.m154716b(t, "");
                            t.setFollowStatus(followStatus.followStatus);
                            a.notifyItemChanged(i);
                        }
                    }
                    IMService.createIIMServicebyMonsterPlugin(false).storeFollowStatus(followStatus);
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: b */
    public final void mo59516b(Exception exc) {
        if (mo99800a().f92274v) {
            mo99800a().mo67829d(false);
            mo99800a().notifyDataSetChanged();
        }
        if (mo99800a().getItemCount() == 0) {
            TuxStatusView tuxStatusView = (TuxStatusView) _$_findCachedViewById(R.id.e7i);
            C89219l.m154716b(tuxStatusView, "");
            tuxStatusView.setVisibility(0);
            ((TuxStatusView) _$_findCachedViewById(R.id.e7i)).setStatus(C79440a.m138169a(new TuxStatusView.C23263c(), new C61660s(this)));
        }
        C56386j.m102360a(0);
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.notification.LikeListDetailActivity", "onCreate", true);
        activityConfiguration(C61657q.f139965a);
        super.onCreate(bundle);
        C56386j.m102362a(C56386j.EnumC56387a.DETAIL_TYPE_LIKE_LIST, mo99804h(), (String) this.f139940f.getValue());
        setContentView(R.layout.jz);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.cv1);
        C89219l.m154716b(recyclerView, "");
        RecyclerView.AbstractC1356f itemAnimator = recyclerView.getItemAnimator();
        Objects.requireNonNull(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
        ((AbstractC1391ab) itemAnimator).f4621m = false;
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(R.id.cv1);
        C89219l.m154716b(recyclerView2, "");
        recyclerView2.setLayoutManager(new LinearLayoutManager());
        ((RecyclerView) _$_findCachedViewById(R.id.cv1)).mo4415b(new C34692l((int) C13628n.m24520b(this, 1.0f), 0));
        ((RecyclerView) _$_findCachedViewById(R.id.cv1)).mo4405a(new C51425a(this));
        ((AutoRTLImageView) _$_findCachedViewById(R.id.pi)).setOnClickListener(new View$OnClickListenerC61641b(this));
        String c = mo99802c();
        if (!(c == null || c.length() == 0)) {
            mo99800a().f140314a = (UrlModel) this.f139945k.getValue();
            mo99800a().f140315b = (String) this.f139946l.getValue();
            mo99800a().f140316c = (String) this.f139944j.getValue();
            C61813b a = mo99800a();
            C61644d dVar = new C61644d(this);
            C89219l.m154721d(dVar, "");
            a.f140317d = dVar;
        }
        mo99800a().mo67813a((AbstractC39063h.AbstractC39067a) this);
        mo99800a().mo67829d(true);
        mo99800a().ap_();
        RecyclerView recyclerView3 = (RecyclerView) _$_findCachedViewById(R.id.cv1);
        C89219l.m154716b(recyclerView3, "");
        recyclerView3.setAdapter(mo99800a());
        TuxStatusView tuxStatusView = (TuxStatusView) _$_findCachedViewById(R.id.e7i);
        C89219l.m154716b(tuxStatusView, "");
        tuxStatusView.setVisibility(0);
        ((TuxStatusView) _$_findCachedViewById(R.id.e7i)).mo37867a();
        mo99805i();
        UserService.m138861d().mo123566b().observe(this, new C61659r(this));
        EventBus.m156966a(EventBus.m156962a(), this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.notification.LikeListDetailActivity", "onCreate", false);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: b */
    public final void mo59517b(List<C61868c> list, boolean z) {
        Object obj;
        if (list == null || list.isEmpty() || !z) {
            m111652n();
        } else {
            mo99800a().aq_();
        }
        mo99800a().f140318e = m111649j().mo100050d();
        C61813b a = mo99800a();
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                User user = it.next().f140452a;
                if (user != null) {
                    arrayList.add(user);
                }
            }
            obj = C89070n.m154585g((Collection) arrayList);
        } else {
            obj = new ArrayList();
        }
        a.mo63366c((List) obj);
        this.f139948n = list;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: a */
    public final void mo59512a(List<C61868c> list, boolean z) {
        int i;
        ArrayList arrayList;
        mo99800a().mo67829d(true);
        if (!z) {
            m111652n();
        } else {
            mo99800a().aq_();
        }
        int i2 = 0;
        if (m111649j().mo100050d() == 0) {
            i = f139935o;
        } else {
            i = 0;
        }
        ((FrameLayout) _$_findCachedViewById(R.id.cuo)).setPadding(0, i, 0, 0);
        mo99800a().f140318e = m111649j().mo100050d();
        C61813b a = mo99800a();
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(it.next().f140452a);
            }
            arrayList = arrayList2;
        } else {
            arrayList = C89086z.INSTANCE;
        }
        a.mo62377b_(arrayList);
        this.f139948n = list;
        TuxStatusView tuxStatusView = (TuxStatusView) _$_findCachedViewById(R.id.e7i);
        C89219l.m154716b(tuxStatusView, "");
        tuxStatusView.setVisibility(8);
        if (list != null) {
            i2 = list.size();
        }
        C56386j.m102360a(i2);
    }

    /* renamed from: a */
    public final void mo99801a(int i, String str, User user) {
        String str2;
        T t;
        String str3;
        String str4;
        C33744d a = new C33744d().mo59983a("action_type", str).mo59983a("enter_from", "notification_page").mo59983a("account_type", "like").mo59980a("client_order", i).mo59983a("tab_name", (String) this.f139947m.getValue());
        Long l = null;
        if (user != null) {
            str2 = user.getUid();
        } else {
            str2 = null;
        }
        C33744d a2 = a.mo59983a("from_user_id", str2).mo59983a("button_type", C62265i.m112641a(this, user)).mo59983a("group_id", mo99802c());
        List<C61868c> list = this.f139948n;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                User user2 = t.f140452a;
                if (user2 != null) {
                    str3 = user2.getUid();
                } else {
                    str3 = null;
                }
                if (user != null) {
                    str4 = user.getUid();
                } else {
                    str4 = null;
                }
                if (C89219l.m154714a((Object) str3, (Object) str4)) {
                    break;
                }
            }
            T t2 = t;
            if (t2 != null) {
                l = Long.valueOf(t2.f140453b);
            }
        }
        C39162r.m79460a("notification_message_folded_message", a2.mo59982a("message_time", l).f79943a);
    }
}
