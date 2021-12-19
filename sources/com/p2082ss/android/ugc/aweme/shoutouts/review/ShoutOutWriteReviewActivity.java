package com.p2082ss.android.ugc.aweme.shoutouts.review;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.AbstractC0976n;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.shoutouts.model.C74437a;
import com.p2082ss.android.ugc.aweme.shoutouts.model.ShoutoutsCreatePermissionCheckApi;
import com.p2082ss.android.ugc.aweme.shoutouts.p3902b.C74387a;
import com.p2082ss.android.ugc.aweme.shoutouts.review.View$OnClickListenerC74531b;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.AbstractC88406ae;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shoutouts.review.ShoutOutWriteReviewActivity */
public final class ShoutOutWriteReviewActivity extends ActivityC17312a {

    /* renamed from: a */
    public DmtStatusView f167490a;

    /* renamed from: b */
    private SparseArray f167491b;

    static {
        Covode.recordClassIndex(87289);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f167491b;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f167491b == null) {
            this.f167491b = new SparseArray();
        }
        View view = (View) this.f167491b.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f167491b.put(i, findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.review.ShoutOutWriteReviewActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.review.ShoutOutWriteReviewActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.review.ShoutOutWriteReviewActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.ShoutOutWriteReviewActivity$a */
    public static final class C74488a implements View$OnClickListenerC74531b.AbstractC74533b {

        /* renamed from: a */
        final /* synthetic */ ShoutOutWriteReviewActivity f167492a;

        static {
            Covode.recordClassIndex(87290);
        }

        @Override // com.p2082ss.android.ugc.aweme.shoutouts.review.View$OnClickListenerC74531b.AbstractC74533b
        /* renamed from: a */
        public final void mo117173a() {
            this.f167492a.finish();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C74488a(ShoutOutWriteReviewActivity shoutOutWriteReviewActivity) {
            this.f167492a = shoutOutWriteReviewActivity;
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void finish() {
        super.finish();
        overridePendingTransition(0, 0);
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

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.ShoutOutWriteReviewActivity$b */
    public static final class C74489b implements AbstractC88406ae<C74437a> {

        /* renamed from: a */
        final /* synthetic */ ShoutOutWriteReviewActivity f167493a;

        /* renamed from: b */
        final /* synthetic */ String f167494b;

        /* renamed from: c */
        final /* synthetic */ String f167495c;

        static {
            Covode.recordClassIndex(87291);
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onSubscribe(AbstractC88412b bVar) {
            C89219l.m154721d(bVar, "");
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onError(Throwable th) {
            C89219l.m154721d(th, "");
            this.f167493a.finish();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.AbstractC88406ae
        public final /* synthetic */ void onSuccess(C74437a aVar) {
            C74437a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            if (aVar2.f167397a == 3004041) {
                DmtStatusView dmtStatusView = this.f167493a.f167490a;
                if (dmtStatusView == null) {
                    C89219l.m154710a("loadingView");
                }
                dmtStatusView.setVisibility(8);
                this.f167493a.finish();
                ShoutOutWriteReviewActivity shoutOutWriteReviewActivity = this.f167493a;
                String str = this.f167494b;
                if (str == null) {
                    C89219l.m154715b();
                }
                String str2 = aVar2.f167399c;
                String str3 = this.f167495c;
                C89219l.m154721d(shoutOutWriteReviewActivity, "");
                C74387a.m130855b(shoutOutWriteReviewActivity, "https://www.tiktok.com/web-inapp/shoutouts/order/comment?__status_bar=true&hide_nav_bar=1&should_full_screen=1&product_id=" + str + "&rating_id=" + str2 + "&order_id=" + str3 + "&user=consumer&enter_from=" + "chat");
                return;
            }
            ShoutOutWriteReviewActivity shoutOutWriteReviewActivity2 = this.f167493a;
            String str4 = this.f167494b;
            String str5 = this.f167495c;
            DmtStatusView dmtStatusView2 = shoutOutWriteReviewActivity2.f167490a;
            if (dmtStatusView2 == null) {
                C89219l.m154710a("loadingView");
            }
            dmtStatusView2.setVisibility(8);
            AbstractC0976n a = shoutOutWriteReviewActivity2.getSupportFragmentManager().mo3552a();
            C74488a aVar3 = new C74488a(shoutOutWriteReviewActivity2);
            C89219l.m154721d(aVar3, "");
            View$OnClickListenerC74531b bVar = new View$OnClickListenerC74531b(str4, str5, (byte) 0);
            bVar.f167593b = aVar3;
            a.mo3453a(R.id.dnb, bVar).mo3473c();
        }

        C74489b(ShoutOutWriteReviewActivity shoutOutWriteReviewActivity, String str, String str2) {
            this.f167493a = shoutOutWriteReviewActivity;
            this.f167494b = str;
            this.f167495c = str2;
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.review.ShoutOutWriteReviewActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.azl);
        View findViewById = findViewById(R.id.cfy);
        C89219l.m154716b(findViewById, "");
        DmtStatusView dmtStatusView = (DmtStatusView) findViewById;
        this.f167490a = dmtStatusView;
        if (dmtStatusView == null) {
            C89219l.m154710a("loadingView");
        }
        dmtStatusView.setBuilder(DmtStatusView.C17269a.m31905a(this));
        DmtStatusView dmtStatusView2 = this.f167490a;
        if (dmtStatusView2 == null) {
            C89219l.m154710a("loadingView");
        }
        dmtStatusView2.mo27384f();
        String a = m130921a(getIntent(), "product_id");
        String a2 = m130921a(getIntent(), "order_id");
        if (a == null || a2 == null) {
            finish();
        }
        Object a3 = RetrofitFactory.m33635a().mo28817b(C29736b.f70924e).mo28832d().mo28858a(ShoutoutsCreatePermissionCheckApi.class);
        C89219l.m154716b(a3, "");
        ((ShoutoutsCreatePermissionCheckApi) a3).checkPermission(a, a2).mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo116431a_(new C74489b(this, a, a2));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.review.ShoutOutWriteReviewActivity", "onCreate", false);
    }

    /* renamed from: a */
    private static String m130921a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
