package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.xbridge.base.p1291a.C18411b;
import com.bytedance.router.SmartRouter;
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.status.loading.TuxDualBallView;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.C43612a;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.ToastContent;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.C43831a;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.BillInfoRequest;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.OrderShopDigest;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.ShopOrder;
import com.p2082ss.android.ugc.aweme.ecommerce.common.AbstractActivityC44311b;
import com.p2082ss.android.ugc.aweme.ecommerce.router.C45264j;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import com.p2082ss.android.ugc.aweme.utils.C80537hk;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89561bs;
import kotlinx.coroutines.C89624i;
import kotlinx.coroutines.internal.C89652o;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.TransparentLoadingOSPActivity */
public final class TransparentLoadingOSPActivity extends AbstractActivityC44311b {

    /* renamed from: a */
    public OrderSubmitRequestParam f101887a;

    /* renamed from: b */
    public HashMap<String, Object> f101888b;

    /* renamed from: c */
    public String f101889c = "";

    /* renamed from: d */
    public String f101890d = "";

    /* renamed from: e */
    public String f101891e = "";

    /* renamed from: f */
    public String f101892f;

    /* renamed from: h */
    private SparseArray f101893h;

    static {
        Covode.recordClassIndex(51981);
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.common.AbstractActivityC44311b, com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f101893h;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.common.AbstractActivityC44311b, com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f101893h == null) {
            this.f101893h = new SparseArray();
        }
        View view = (View) this.f101893h.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f101893h.put(i, findViewById);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.TransparentLoadingOSPActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.TransparentLoadingOSPActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.TransparentLoadingOSPActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onBackPressed() {
        super.onBackPressed();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
        TuxDualBallView tuxDualBallView = (TuxDualBallView) _$_findCachedViewById(R.id.eqw);
        C89219l.m154716b(tuxDualBallView, "");
        tuxDualBallView.setVisibility(0);
        ((TuxDualBallView) _$_findCachedViewById(R.id.eqw)).mo37884b();
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

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.ecommerce.common.AbstractActivityC44311b, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        String string;
        String string2;
        String string3;
        Object obj;
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.TransparentLoadingOSPActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.b46);
        String str = "0";
        if (bundle == null) {
            string = m86703a(getIntent(), "requestParams");
            string2 = m86703a(getIntent(), "trackParams");
            string3 = m86703a(getIntent(), "repoId");
            String a = m86703a(getIntent(), "buy_type");
            if (a != null) {
                str = a;
            }
            this.f101891e = str;
            this.f101890d = m86703a(getIntent(), "_originalSchema");
            this.f101892f = m86703a(getIntent(), "cart_storage_key");
        } else {
            string = bundle.getString("requestParams");
            string2 = bundle.getString("trackParams");
            string3 = bundle.getString("repoId");
            this.f101890d = bundle.getString("_originalSchema");
            String string4 = bundle.getString("buy_type");
            if (string4 != null) {
                str = string4;
            }
            this.f101891e = str;
            this.f101892f = m86703a(getIntent(), "cart_storage_key");
        }
        if (string == null) {
            try {
                if (this.f101892f != null) {
                    Object a2 = C18411b.m34269a(this).mo29433a(this.f101892f);
                    if (!(a2 instanceof String)) {
                        a2 = null;
                    }
                    string = (String) a2;
                }
            } catch (Exception e) {
                C22708a.m42800a(e.toString());
            }
        }
        if (string3 == null) {
            string3 = "default_repo_id" + UUID.randomUUID();
        }
        this.f101889c = string3;
        this.f101887a = (OrderSubmitRequestParam) C80342dg.m139301a(string, OrderSubmitRequestParam.class);
        try {
            obj = C45264j.m87844a().mo46670a(string2, HashMap.class);
        } catch (Exception unused) {
            obj = null;
        }
        this.f101888b = (HashMap) obj;
        OrderSubmitRequestParam orderSubmitRequestParam = this.f101887a;
        HashMap<String, Object> hashMap = this.f101888b;
        if (hashMap == null) {
            hashMap = new HashMap<>();
        }
        C89219l.m154721d(hashMap, "");
        if (orderSubmitRequestParam != null) {
            AbstractC89568bz unused2 = C89624i.m155555a(C89561bs.f203280a, C89652o.f203399a, null, new C43717a(orderSubmitRequestParam, null, this, hashMap), 2);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.TransparentLoadingOSPActivity", "onCreate", false);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.TransparentLoadingOSPActivity$a */
    static final class C43717a extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f101894a;

        /* renamed from: b */
        final /* synthetic */ OrderSubmitRequestParam f101895b;

        /* renamed from: c */
        final /* synthetic */ TransparentLoadingOSPActivity f101896c;

        /* renamed from: d */
        final /* synthetic */ HashMap f101897d;

        static {
            Covode.recordClassIndex(51982);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43717a(OrderSubmitRequestParam orderSubmitRequestParam, AbstractC89124d dVar, TransparentLoadingOSPActivity transparentLoadingOSPActivity, HashMap hashMap) {
            super(2, dVar);
            this.f101895b = orderSubmitRequestParam;
            this.f101896c = transparentLoadingOSPActivity;
            this.f101897d = hashMap;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C43717a(this.f101895b, dVar, this.f101896c, this.f101897d);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C43717a) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            int i;
            List<ShopOrder> list;
            T t;
            ExceptionUX exceptionUX;
            Integer exceptionUXType;
            String str;
            T t2;
            ExceptionUX exceptionUX2;
            ToastContent toastContent;
            T t3;
            ExceptionUX exceptionUX3;
            ToastContent toastContent2;
            T t4;
            Object obj2 = obj;
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i2 = this.f101894a;
            if (i2 == 0) {
                C89382r.m154942a(obj2);
                List<OrderShopDigest> orderShopDigest = this.f101895b.getOrderShopDigest();
                String addressId = this.f101895b.getAddressId();
                Integer e = C89361p.m154863e(this.f101896c.f101891e);
                if (e != null) {
                    i = e.intValue();
                } else {
                    i = 0;
                }
                BillInfoRequest billInfoRequest = new BillInfoRequest(addressId, i, orderShopDigest, true, true, true, true, null, null, this.f101895b.getToAutoClaimVoucherTypeIDs(), true, null, null, null, this.f101895b.getActivityIds(), 12288, null);
                C43831a a = C43831a.C43832a.m86766a(this.f101896c.f101889c);
                HashMap hashMap = this.f101897d;
                this.f101894a = 1;
                obj2 = a.mo74466a(billInfoRequest, true, hashMap, false, this);
                if (obj2 == aVar) {
                    return aVar;
                }
            } else if (i2 == 1) {
                C89382r.m154942a(obj2);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C43612a aVar2 = (C43612a) obj2;
            String str2 = null;
            if (aVar2 == null || (t4 = aVar2.data) == null) {
                list = null;
            } else {
                list = t4.getShopOrders();
            }
            if (!(list != null || aVar2 == null || (t = aVar2.data) == null || (exceptionUX = t.getExceptionUX()) == null || (exceptionUXType = exceptionUX.getExceptionUXType()) == null || exceptionUXType.intValue() != 0)) {
                if (aVar2 == null || (t3 = aVar2.data) == null || (exceptionUX3 = t3.getExceptionUX()) == null || (toastContent2 = exceptionUX3.getToastContent()) == null) {
                    str = null;
                } else {
                    str = toastContent2.getMessage();
                }
                if (C80537hk.m139613a(str)) {
                    TuxDualBallView tuxDualBallView = (TuxDualBallView) this.f101896c._$_findCachedViewById(R.id.eqw);
                    C89219l.m154716b(tuxDualBallView, "");
                    tuxDualBallView.setVisibility(8);
                    C23144b a2 = new C23144b(this.f101896c).mo37632a();
                    if (!(aVar2 == null || (t2 = aVar2.data) == null || (exceptionUX2 = t2.getExceptionUX()) == null || (toastContent = exceptionUX2.getToastContent()) == null)) {
                        str2 = toastContent.getMessage();
                    }
                    a2.mo37635a(str2).mo37637b();
                    if (this.f101896c.f101892f != null) {
                        C18411b.m34269a(this.f101896c).mo29436b(this.f101896c.f101892f);
                    }
                    this.f101896c.finish();
                    return C89391z.f203057a;
                }
            }
            String str3 = "bill_info_resp_" + System.currentTimeMillis();
            C18411b.m34269a(this.f101896c).mo29435a(str3, C80342dg.m139300a().mo46674b(aVar2));
            TransparentLoadingOSPActivity transparentLoadingOSPActivity = this.f101896c;
            SmartRouter.buildRoute(transparentLoadingOSPActivity, Uri.parse(transparentLoadingOSPActivity.f101890d).buildUpon().appendQueryParameter("bill_info_resp_key", str3).appendQueryParameter("_cartPrefetchBill", "1").toString()).open();
            TuxDualBallView tuxDualBallView2 = (TuxDualBallView) this.f101896c._$_findCachedViewById(R.id.eqw);
            C89219l.m154716b(tuxDualBallView2, "");
            tuxDualBallView2.setVisibility(8);
            this.f101896c.finish();
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private static String m86703a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
