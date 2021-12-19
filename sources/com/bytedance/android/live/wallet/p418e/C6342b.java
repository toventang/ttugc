package com.bytedance.android.live.wallet.p418e;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live.p172a.p173a.C2908a;
import com.bytedance.android.live.p172a.p173a.p175b.C2912a;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.wallet.AbstractC6332d;
import com.bytedance.android.live.wallet.C6336e;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.p416c.C6331c;
import com.bytedance.android.live.wallet.p419f.p420a.C6351d;
import com.bytedance.android.livesdk.livesetting.recharge.LiveWebRechargeAuditing;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdk.wallet.C11314c;
import com.bytedance.android.livesdkapi.depend.p680d.p682b.AbstractC11636c;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1114a.AbstractC16042a;
import com.bytedance.ies.web.p1285a.C18288a;
import com.bytedance.ies.web.p1285a.C18297h;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.wallet.e.b */
public final class C6342b extends C6341a {

    /* renamed from: e */
    public C6351d f15855e;

    /* renamed from: f */
    private final Application.ActivityLifecycleCallbacks f15856f = new C6343a(this);

    /* renamed from: g */
    private final C6346d f15857g;

    static {
        Covode.recordClassIndex(7064);
    }

    /* renamed from: d */
    private void m13696d() {
        C6351d dVar = this.f15855e;
        if (dVar != null) {
            dVar.mo12412f();
        }
        this.f15855e = null;
    }

    /* renamed from: com.bytedance.android.live.wallet.e.b$a */
    public static final class C6343a implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a */
        final /* synthetic */ C6342b f15858a;

        static {
            Covode.recordClassIndex(7065);
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            C89219l.m154721d(activity, "");
        }

        public final void onActivityDestroyed(Activity activity) {
            C89219l.m154721d(activity, "");
        }

        public final void onActivityPaused(Activity activity) {
            C89219l.m154721d(activity, "");
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(bundle, "");
        }

        public final void onActivityStarted(Activity activity) {
            C89219l.m154721d(activity, "");
        }

        public final void onActivityStopped(Activity activity) {
            C89219l.m154721d(activity, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C6343a(C6342b bVar) {
            this.f15858a = bVar;
        }

        public final void onActivityResumed(Activity activity) {
            C6351d dVar;
            Integer num;
            C89219l.m154721d(activity, "");
            ComponentName componentName = activity.getComponentName();
            C89219l.m154716b(componentName, "");
            if (C13627m.m24499a(componentName.getClassName(), "com.android.billingclient.api.ProxyBillingActivity") && (dVar = this.f15858a.f15855e) != null) {
                HashMap hashMap = new HashMap();
                C11314c cVar = dVar.f15869b;
                if (cVar != null) {
                    num = Integer.valueOf(cVar.f27058d);
                } else {
                    num = null;
                }
                hashMap.put("recharge_package", String.valueOf(num));
                hashMap.put("pay_method", C6336e.C6337a.m13683b());
                hashMap.put("request_page", "my_profile");
                C6501b.C6502a.m13948a("livesdk_recharge_pay").mo12652a((Map<String, String>) hashMap).mo12655b();
            }
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.e.b$b */
    public static final class C6344b implements AbstractC11636c {

        /* renamed from: a */
        final /* synthetic */ int f15859a;

        /* renamed from: b */
        final /* synthetic */ long f15860b;

        static {
            Covode.recordClassIndex(7066);
        }

        @Override // com.bytedance.android.livesdkapi.depend.p680d.p682b.AbstractC11636c
        /* renamed from: a */
        public final void mo12314a(Throwable th) {
            int i;
            C89219l.m154721d(th, "");
            if (th instanceof C2908a) {
                i = ((C2908a) th).getErrorCode();
            } else {
                i = 61;
            }
            C6331c.m13650a("ttlive_update_wallet_info_order", i, -1, "update info fail");
        }

        @Override // com.bytedance.android.livesdkapi.depend.p680d.p682b.AbstractC11636c
        /* renamed from: a */
        public final void mo12313a(long j) {
            HashMap hashMap = new HashMap();
            long j2 = (long) this.f15859a;
            long j3 = this.f15860b;
            if (j2 + j3 == j) {
                C6331c.m13652a("ttlive_update_wallet_info_order", hashMap);
                return;
            }
            hashMap.put("originCoins", Long.valueOf(j3));
            hashMap.put("preCoins", Integer.valueOf(this.f15859a));
            hashMap.put("serverCoins", Long.valueOf(j));
            C6331c.m13651a("ttlive_update_wallet_info_order", 62, -1, "update info fail", hashMap);
        }

        C6344b(int i, long j) {
            this.f15859a = i;
            this.f15860b = j;
        }
    }

    @Override // com.bytedance.android.live.wallet.p418e.C6341a, com.bytedance.android.live.wallet.p419f.p421b.AbstractC6359c
    /* renamed from: b */
    public final void mo12261b(int i) {
        Application application;
        Integer num;
        AbstractC6332d walletCenter = ((IWalletService) C6193a.m13435a(IWalletService.class)).walletCenter();
        C89219l.m154716b(walletCenter, "");
        ((IWalletService) C6193a.m13435a(IWalletService.class)).walletCenter().mo12370a(new C6344b(i, walletCenter.mo12373b()));
        HashMap hashMap = new HashMap();
        hashMap.put("request_page", "my_profile");
        hashMap.put("pay_method", C6336e.C6337a.m13683b());
        C6351d dVar = this.f15855e;
        if (dVar != null) {
            C11314c cVar = dVar.f15869b;
            if (cVar != null) {
                num = Integer.valueOf(cVar.f27058d);
            } else {
                num = null;
            }
            hashMap.put("recharge_package", String.valueOf(num));
        }
        C6501b.C6502a.m13948a("livesdk_recharge_success").mo12652a((Map<String, String>) hashMap).mo12655b();
        ActivityC0945e a = C11279p.m20001a(this.f15853c);
        if (!(a == null || (application = a.getApplication()) == null)) {
            application.unregisterActivityLifecycleCallbacks(this.f15856f);
        }
        try {
            mo12394b().put("code", 0);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        this.f15854d.mo29249a(mo12391a().f43669b, mo12394b());
        m13696d();
    }

    @Override // com.bytedance.android.live.wallet.p418e.C6341a, com.bytedance.ies.web.p1285a.AbstractC18293d
    public final void call(C18297h hVar, JSONObject jSONObject) {
        C11314c a;
        Application application;
        C89219l.m154721d(hVar, "");
        C89219l.m154721d(jSONObject, "");
        super.call(hVar, jSONObject);
        if (this.f15855e == null) {
            this.f15855e = this.f15857g.mo12403a(this.f15853c);
        }
        C6351d dVar = this.f15855e;
        if (dVar != null) {
            dVar.mo10297a((AbstractC16042a) this);
            dVar.mo12411e();
        }
        mo12391a().f43676i = false;
        JSONObject jSONObject2 = mo12391a().f43671d.getJSONObject("args");
        String string = jSONObject2.getString("iap_id");
        String string2 = jSONObject2.getString("diamond_id");
        HashMap hashMap = new HashMap();
        C89219l.m154716b(string, "");
        hashMap.put("iabId", string);
        C89219l.m154716b(string2, "");
        hashMap.put("diamondId", string2);
        hashMap.put("methodName", "ChargeMethod");
        C3868c.m9491a("ttlive_wallet_H5_query", 0, hashMap);
        ActivityC0945e a2 = C11279p.m20001a(this.f15853c);
        if (!(a2 == null || (application = a2.getApplication()) == null)) {
            application.registerActivityLifecycleCallbacks(this.f15856f);
        }
        C6351d dVar2 = this.f15855e;
        if (dVar2 == null || (a = dVar2.mo12405a(string)) == null) {
            mo12282a(new Exception("diamond isn null"), 0);
            return;
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("recharge_package", String.valueOf(a.f27058d));
        hashMap2.put("request_page", "my_profile");
        hashMap2.put("pay_method", C6336e.C6337a.m13683b());
        C6501b.C6502a.m13948a("livesdk_recharge_click").mo12652a((Map<String, String>) hashMap2).mo12655b();
        C6351d dVar3 = this.f15855e;
        if (dVar3 != null) {
            dVar3.mo12407a(a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6342b(Context context, C18288a aVar, C6346d dVar) {
        super(context, aVar);
        C89219l.m154721d(context, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(dVar, "");
        this.f15857g = dVar;
    }

    @Override // com.bytedance.android.live.wallet.p418e.C6341a, com.bytedance.android.live.wallet.p419f.p421b.AbstractC6359c
    /* renamed from: a */
    public final void mo12257a(int i, int i2, int i3, Exception exc) {
        ActivityC0945e a;
        Application application;
        int i4;
        C89219l.m154721d(exc, "");
        try {
            JSONObject b = mo12394b();
            if (LiveWebRechargeAuditing.INSTANCE.getValue()) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            b.put("is_outside_channel", i4);
            mo12394b().put("code", -1);
            mo12394b().put("charge_error_code", i2);
            mo12394b().put("msg", "");
            if (i2 == 31) {
                mo12394b().put("source", 1);
            } else {
                mo12394b().put("source", i);
            }
            if (!(exc instanceof C2912a) || i2 != 31) {
                if (i == 3 && i2 == 41) {
                    mo12394b().put("charge_error_code", 1);
                }
                this.f15854d.mo29249a(mo12391a().f43669b, mo12394b());
                m13696d();
                a = C11279p.m20001a(this.f15853c);
                if (a != null && (application = a.getApplication()) != null) {
                    application.unregisterActivityLifecycleCallbacks(this.f15856f);
                    return;
                }
            }
            mo12394b().put("msg", ((C2912a) exc).getPrompt());
            mo12394b().put("charge_error_code", ((C2908a) exc).getErrorCode());
            this.f15854d.mo29249a(mo12391a().f43669b, mo12394b());
            m13696d();
            a = C11279p.m20001a(this.f15853c);
            if (a != null) {
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
