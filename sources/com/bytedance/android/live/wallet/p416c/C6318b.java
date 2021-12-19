package com.bytedance.android.live.wallet.p416c;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.live.p172a.p173a.C2908a;
import com.bytedance.android.live.p172a.p173a.p175b.C2912a;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.wallet.AbstractC6315c;
import com.bytedance.android.live.wallet.AbstractC6360g;
import com.bytedance.android.live.wallet.C6336e;
import com.bytedance.android.live.wallet.api.C6304b;
import com.bytedance.android.live.wallet.api.IapApi;
import com.bytedance.android.live.wallet.base.C6313b;
import com.bytedance.android.live.wallet.base.C6314c;
import com.bytedance.android.live.wallet.base.PayOrderResultStruct;
import com.bytedance.android.live.wallet.base.SubOrderResultStruct;
import com.bytedance.android.live.wallet.base.p415a.C6312a;
import com.bytedance.android.livesdk.livesetting.other.LivePipoHostSetting;
import com.bytedance.android.livesdk.livesetting.other.LivePipoMonitorHostSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdk.util.rxutils.C11195i;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdk.wallet.C11311b;
import com.bytedance.android.livesdk.wallet.C11314c;
import com.bytedance.android.livesdk.wallet.C11318g;
import com.bytedance.android.livesdkapi.host.AbstractC11807g;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.p983b.C14621d;
import com.bytedance.globalpayment.AbstractC15106c;
import com.bytedance.globalpayment.C15073a;
import com.bytedance.globalpayment.iap.common.ability.C15124c;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import com.bytedance.globalpayment.payment.common.lib.p1072b.C15240a;
import com.bytedance.globalpayment.payment.common.lib.p1072b.C15243c;
import com.bytedance.globalpayment.payment.common.lib.p1075e.AbstractC15248a;
import com.bytedance.globalpayment.payment.common.lib.p1075e.AbstractC15249b;
import com.bytedance.globalpayment.payment.common.lib.p1076f.C15251a;
import com.p2082ss.android.deviceregister.DeviceRegisterManager;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import org.json.JSONObject;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.wallet.c.b */
public final class C6318b implements AbstractC6315c {

    /* renamed from: a */
    public AbstractC6360g f15809a;

    /* renamed from: b */
    public final C88411a f15810b = new C88411a();

    /* renamed from: c */
    private final int f15811c;

    static {
        Covode.recordClassIndex(7040);
    }

    /* renamed from: com.bytedance.android.live.wallet.c.b$d */
    static final class C6322d implements AbstractC15248a {

        /* renamed from: a */
        public static final C6322d f15818a = new C6322d();

        static {
            Covode.recordClassIndex(7044);
        }

        C6322d() {
        }

        @Override // com.bytedance.globalpayment.payment.common.lib.p1075e.AbstractC15248a
        /* renamed from: a */
        public final String mo12363a() {
            AbstractC6872f b = C11115u.m19743a().mo17915b();
            C89219l.m154716b(b, "");
            return String.valueOf(b.mo13161c());
        }
    }

    /* renamed from: a */
    public static String m13639a() {
        if (C11279p.m20013a((CharSequence) LivePipoHostSetting.INSTANCE.getValue())) {
            return LivePipoHostSetting.INSTANCE.getValue();
        }
        AbstractC2953a a = C6193a.m13435a(IHostApp.class);
        C89219l.m154716b(a, "");
        if (((IHostApp) a).isInMusicallyRegion()) {
            return "https://gp-va.tiktokv.com";
        }
        return "https://gp-sg.tiktokv.com";
    }

    public C6318b(int i) {
        this.f15811c = i;
    }

    @Override // com.bytedance.android.live.wallet.AbstractC6315c
    /* renamed from: b */
    public final void mo12355b(AbstractC6360g gVar) {
        this.f15809a = null;
        C6304b.m13621a().mo12344b(gVar);
        this.f15810b.mo142944a();
    }

    /* renamed from: com.bytedance.android.live.wallet.c.b$f */
    static final class C6324f<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C6318b f15820a;

        static {
            Covode.recordClassIndex(7046);
        }

        C6324f(C6318b bVar) {
            this.f15820a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            SubOrderResultStruct subOrderResultStruct = (SubOrderResultStruct) obj;
            AbstractC6360g gVar = this.f15820a.f15809a;
            if (gVar != null) {
                gVar.mo12414a(3, subOrderResultStruct.subChargeInfo.f15785a.f15786a);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.c.b$e */
    static final class C6323e<T, R> implements AbstractC88434g {

        /* renamed from: a */
        public static final C6323e f15819a = new C6323e();

        static {
            Covode.recordClassIndex(7045);
        }

        C6323e() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C5832d dVar = (C5832d) obj;
            C89219l.m154721d(dVar, "");
            if (((SubOrderResultStruct) dVar.data).status != 1) {
                return AbstractC88979t.m154302a(new Exception("retry"));
            }
            return AbstractC88979t.m154310b(dVar.data);
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.c.b$g */
    static final class C6325g<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C6318b f15821a;

        static {
            Covode.recordClassIndex(7047);
        }

        C6325g(C6318b bVar) {
            this.f15821a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th;
            Throwable th2 = (Throwable) obj;
            AbstractC6360g gVar = this.f15821a.f15809a;
            if (gVar != null) {
                if (!(th2 instanceof Exception)) {
                    th = null;
                } else {
                    th = th2;
                }
                Exception exc = (Exception) th;
                if (exc == null) {
                    exc = new Exception(th2);
                }
                gVar.mo12413a(3, 41, -1, exc, null);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.c.b$h */
    public static final class C6326h<T, R> implements AbstractC88434g {

        /* renamed from: a */
        public static final C6326h f15822a = new C6326h();

        static {
            Covode.recordClassIndex(7048);
        }

        C6326h() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C5832d dVar = (C5832d) obj;
            C89219l.m154721d(dVar, "");
            if (((PayOrderResultStruct) dVar.data).status != 1) {
                AbstractC88979t a = AbstractC88979t.m154302a(new Exception("retry"));
                C89219l.m154716b(a, "");
                return a;
            }
            AbstractC88979t b = AbstractC88979t.m154310b(dVar);
            C89219l.m154716b(b, "");
            return b;
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.c.b$i */
    public static final class C6327i<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C6318b f15823a;

        /* renamed from: b */
        final /* synthetic */ String f15824b;

        /* renamed from: c */
        final /* synthetic */ long f15825c;

        /* renamed from: d */
        final /* synthetic */ String f15826d;

        static {
            Covode.recordClassIndex(7049);
        }

        public C6327i(C6318b bVar, String str, long j, String str2) {
            this.f15823a = bVar;
            this.f15824b = str;
            this.f15825c = j;
            this.f15826d = str2;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final void accept(Object obj) {
            HashMap hashMap = new HashMap();
            hashMap.put("orderId", this.f15824b);
            hashMap.put("duration", Long.valueOf(SystemClock.uptimeMillis() - this.f15825c));
            C6331c.m13652a("ttlive_wallet_check_order", hashMap);
            AbstractC6360g gVar = this.f15823a.f15809a;
            if (gVar != null) {
                gVar.mo12414a(3, new C11311b(this.f15826d, this.f15824b));
            }
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.c.b$j */
    public static final class C6328j<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C6318b f15827a;

        /* renamed from: b */
        final /* synthetic */ String f15828b;

        /* renamed from: c */
        final /* synthetic */ String f15829c;

        static {
            Covode.recordClassIndex(7050);
        }

        public C6328j(C6318b bVar, String str, String str2) {
            this.f15827a = bVar;
            this.f15828b = str;
            this.f15829c = str2;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th;
            Throwable th2 = (Throwable) obj;
            C6331c.m13650a("ttlive_wallet_check_order", 41, -1, "check order fail");
            AbstractC6360g gVar = this.f15827a.f15809a;
            if (gVar != null) {
                if (!(th2 instanceof Exception)) {
                    th = null;
                } else {
                    th = th2;
                }
                Exception exc = (Exception) th;
                if (exc == null) {
                    exc = new Exception(th2);
                }
                gVar.mo12413a(3, 41, -1, exc, new C11318g(this.f15828b, this.f15829c));
            }
        }
    }

    @Override // com.bytedance.android.live.wallet.AbstractC6315c
    /* renamed from: b */
    public final void mo12356b(List<String> list) {
        C89219l.m154721d(list, "");
        IapPaymentMethod iapPaymentMethod = IapPaymentMethod.GOOGLE;
        if (C6336e.C6337a.m13682a()) {
            iapPaymentMethod = IapPaymentMethod.AMAZON;
        }
        if (!C13603b.m24435a((Collection) list)) {
            AbstractC15106c cVar = C15073a.f36793a;
            C89219l.m154716b(cVar, "");
            cVar.mo24361a().querySubscriptionDetails(iapPaymentMethod, list);
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.c.b$k */
    static final class C6329k<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C6318b f15830a;

        /* renamed from: b */
        final /* synthetic */ long f15831b;

        /* renamed from: c */
        final /* synthetic */ Activity f15832c;

        static {
            Covode.recordClassIndex(7051);
        }

        C6329k(C6318b bVar, long j, Activity activity) {
            this.f15830a = bVar;
            this.f15831b = j;
            this.f15832c = activity;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            boolean z;
            C6312a aVar = (C6312a) ((C5832d) obj).data;
            if (aVar.f15793g == 2) {
                z = true;
            } else {
                z = false;
            }
            C15124c cVar = new C15124c(this.f15831b);
            cVar.f36916a = aVar.f15790d;
            cVar.f36924i = "0";
            cVar.f36917b = aVar.f15789c;
            String str = aVar.f15788b;
            C89219l.m154716b(str, "");
            cVar.f36918c = Long.parseLong(str);
            AbstractC6872f b = C11115u.m19743a().mo17915b();
            C89219l.m154716b(b, "");
            cVar.f36920e = String.valueOf(b.mo13161c());
            cVar.f36919d = DeviceRegisterManager.getDeviceId();
            cVar.f36921f = aVar.f15787a;
            cVar.f36922g = z;
            cVar.f36925j = true;
            if (!C13627m.m24498a(aVar.f15792f)) {
                AbstractC15106c cVar2 = C15073a.f36793a;
                C89219l.m154716b(cVar2, "");
                cVar2.mo24361a().updateHost(aVar.f15792f);
            }
            C89219l.m154716b(cVar, "");
            C6318b.m13640a(cVar, this.f15832c);
            AbstractC6360g gVar = this.f15830a.f15809a;
            if (gVar != null) {
                gVar.mo12414a(5, aVar.f15794h);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.c.b$l */
    static final class C6330l<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C6318b f15833a;

        static {
            Covode.recordClassIndex(7052);
        }

        C6330l(C6318b bVar) {
            this.f15833a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            AbstractC6360g gVar;
            Throwable th = (Throwable) obj;
            if (th instanceof C2912a) {
                AbstractC6360g gVar2 = this.f15833a.f15809a;
                if (gVar2 != null) {
                    gVar2.mo12413a(2, 71, ((C2908a) th).getErrorCode(), (Exception) th, new C11318g("", ""));
                }
                C2912a aVar = (C2912a) th;
                C6316a.m13637a(71, aVar.getErrorCode(), aVar.getPrompt());
            } else if (th instanceof C14621d) {
                AbstractC6360g gVar3 = this.f15833a.f15809a;
                if (gVar3 != null) {
                    gVar3.mo12413a(2, 71, -1, (Exception) th, new C11318g("", ""));
                }
                C6316a.m13637a(71, -1, th.getMessage());
            } else if ((th instanceof Exception) && (gVar = this.f15833a.f15809a) != null) {
                gVar.mo12413a(2, 71, -1, (Exception) th, new C11318g("", ""));
            }
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.c.b$a */
    static final class C6319a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C6318b f15812a;

        /* renamed from: b */
        final /* synthetic */ long f15813b;

        /* renamed from: c */
        final /* synthetic */ Activity f15814c;

        static {
            Covode.recordClassIndex(7041);
        }

        C6319a(C6318b bVar, long j, Activity activity) {
            this.f15812a = bVar;
            this.f15813b = j;
            this.f15814c = activity;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Object obj2 = ((C5832d) obj).data;
            C89219l.m154716b(obj2, "");
            C6314c cVar = ((C6313b) obj2).f15795a;
            C15124c cVar2 = new C15124c(this.f15813b);
            C89219l.m154716b(cVar, "");
            cVar2.f36916a = cVar.f15798a;
            cVar2.f36924i = "0";
            cVar2.f36917b = cVar.f15800c;
            Long l = cVar.f15801d;
            C89219l.m154716b(l, "");
            cVar2.f36918c = l.longValue();
            AbstractC6872f b = C11115u.m19743a().mo17915b();
            C89219l.m154716b(b, "");
            cVar2.f36920e = String.valueOf(b.mo13161c());
            cVar2.f36919d = DeviceRegisterManager.getDeviceId();
            cVar2.f36921f = cVar.f15799b;
            if (!cVar.f15803f || !C11279p.m20013a((CharSequence) cVar.f15804g)) {
                C89219l.m154716b(cVar2, "");
                cVar2.f36925j = false;
                AbstractC15106c cVar3 = C15073a.f36793a;
                C89219l.m154716b(cVar3, "");
                cVar3.mo24361a().updateHost(C6318b.m13639a());
            } else {
                C89219l.m154716b(cVar2, "");
                cVar2.f36925j = true;
                AbstractC15106c cVar4 = C15073a.f36793a;
                C89219l.m154716b(cVar4, "");
                cVar4.mo24361a().updateHost(cVar.f15804g);
            }
            HashMap hashMap = new HashMap();
            String str = cVar.f15799b;
            C89219l.m154716b(str, "");
            hashMap.put("bizContent", str);
            hashMap.put("duration", Long.valueOf(SystemClock.uptimeMillis() - this.f15813b));
            C6331c.m13652a("ttlive_wallet_create_order", hashMap);
            C6318b.m13640a(cVar2, this.f15814c);
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.c.b$b */
    static final class C6320b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C6318b f15815a;

        /* renamed from: b */
        final /* synthetic */ C11314c f15816b;

        static {
            Covode.recordClassIndex(7042);
        }

        C6320b(C6318b bVar, C11314c cVar) {
            this.f15815a = bVar;
            this.f15816b = cVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            AbstractC6360g gVar;
            Throwable th = (Throwable) obj;
            if (th instanceof C2912a) {
                AbstractC6360g gVar2 = this.f15815a.f15809a;
                if (gVar2 != null) {
                    String str = this.f15816b.f27056b;
                    C89219l.m154716b(str, "");
                    gVar2.mo12413a(2, 31, ((C2908a) th).getErrorCode(), (Exception) th, new C11318g(str, ""));
                }
                C2912a aVar = (C2912a) th;
                C6316a.m13637a(31, aVar.getErrorCode(), aVar.getPrompt());
            } else if (th instanceof C14621d) {
                AbstractC6360g gVar3 = this.f15815a.f15809a;
                if (gVar3 != null) {
                    String str2 = this.f15816b.f27056b;
                    C89219l.m154716b(str2, "");
                    gVar3.mo12413a(2, 31, -1, (Exception) th, new C11318g(str2, ""));
                }
                C6316a.m13637a(31, -1, th.getMessage());
            } else if ((th instanceof Exception) && (gVar = this.f15815a.f15809a) != null) {
                String str3 = this.f15816b.f27056b;
                C89219l.m154716b(str3, "");
                gVar.mo12413a(2, 31, -1, (Exception) th, new C11318g(str3, ""));
            }
        }
    }

    @Override // com.bytedance.android.live.wallet.AbstractC6315c
    /* renamed from: a */
    public final synchronized void mo12351a(AbstractC6360g gVar) {
        String str;
        MethodCollector.m26663i(10351);
        if (gVar != null) {
            this.f15809a = gVar;
        }
        if (C6304b.m13621a().f15765b) {
            C6304b.m13621a().mo12340a(gVar);
            C6304b a = C6304b.m13621a();
            AbstractC6872f b = C11115u.m19743a().mo17915b();
            C89219l.m154716b(b, "");
            a.f15764a = String.valueOf(b.mo13161c());
            MethodCollector.m26664o(10351);
            return;
        }
        AbstractC15106c cVar = C15073a.f36793a;
        C89219l.m154716b(cVar, "");
        cVar.mo24361a().addIapObserver(C6304b.m13621a());
        AbstractC2953a a2 = C6193a.m13435a(IHostContext.class);
        C89219l.m154716b(a2, "");
        String iapKey = ((IHostContext) a2).getIapKey();
        String a3 = m13639a();
        HashMap hashMap = new HashMap();
        hashMap.put("iapKey", iapKey);
        hashMap.put("pipoHost", a3);
        C15251a aVar = new C15251a();
        aVar.f37233a = ((IHostContext) C6193a.m13435a(IHostContext.class)).appId();
        aVar.f37238f = ((IHostContext) C6193a.m13435a(IHostContext.class)).appName();
        AbstractC2953a a4 = C6193a.m13435a(IHostContext.class);
        C89219l.m154716b(a4, "");
        aVar.f37235c = ((IHostContext) a4).getLastVersionCode();
        AbstractC2953a a5 = C6193a.m13435a(IHostContext.class);
        C89219l.m154716b(a5, "");
        aVar.f37236d = ((IHostContext) a5).getUpdateVersionCode();
        AbstractC2953a a6 = C6193a.m13435a(IHostContext.class);
        C89219l.m154716b(a6, "");
        aVar.f37237e = ((IHostContext) a6).getChannel();
        aVar.f37239g = true;
        C15243c.C15244a aVar2 = new C15243c.C15244a();
        aVar2.f37224d = m13639a();
        aVar2.f37221a = iapKey;
        aVar2.f37225e = C6322d.f15818a;
        AbstractC2953a a7 = C6193a.m13435a(IHostContext.class);
        C89219l.m154716b(a7, "");
        if (((IHostContext) a7).isBoe()) {
            str = "10202010Wm7uNj";
        } else {
            str = "05816USpPkJiyBnttk";
        }
        aVar2.f37223c = str;
        if (C6336e.C6337a.m13682a()) {
            aVar2.f37228h = true;
            aVar2.f37227g = false;
            hashMap.put("pay_method", "amazon");
        } else {
            aVar2.f37228h = false;
            aVar2.f37227g = true;
            hashMap.put("pay_method", "GP");
        }
        C3868c.m9491a("ttlive_pipo_init", 0, hashMap);
        C15243c cVar2 = new C15243c(aVar2);
        C6304b.m13621a().mo12340a(gVar);
        C6304b a8 = C6304b.m13621a();
        AbstractC6872f b2 = C11115u.m19743a().mo17915b();
        C89219l.m154716b(b2, "");
        a8.f15764a = String.valueOf(b2.mo13161c());
        Context e = C3966y.m9669e();
        C89219l.m154716b(e, "");
        Context applicationContext = e.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        C89219l.m154716b(applicationContext, "");
        if (applicationContext instanceof Application) {
            C15240a.C15241a aVar3 = new C15240a.C15241a((Application) applicationContext, aVar);
            aVar3.f37190d = DeviceRegisterManager.getDeviceId();
            aVar3.f37205s = new C6321c(this);
            aVar3.f37193g = LivePipoMonitorHostSetting.INSTANCE.getValue();
            aVar3.f37204r = cVar2;
            aVar3.f37192f = m13639a();
            if (!aVar3.f37202p) {
                if (aVar3.f37194h == null && TextUtils.isEmpty(aVar3.f37192f) && TextUtils.isEmpty(aVar3.f37190d)) {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("region and  host is null,please set region or host!");
                    MethodCollector.m26664o(10351);
                    throw illegalArgumentException;
                } else if (TextUtils.isEmpty(aVar3.f37190d)) {
                    IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("did is null,please set did by com.bytedance.globalpayment.payment.common.lib.configuration.Configuration.Builder.withDid!");
                    MethodCollector.m26664o(10351);
                    throw illegalArgumentException2;
                } else if (TextUtils.isEmpty(aVar3.f37199m)) {
                    aVar3.f37199m = "en";
                }
            }
            C15073a.f36793a.mo24362a(new C15240a(aVar3));
            AbstractC15106c cVar3 = C15073a.f36793a;
            AbstractC2953a a9 = C6193a.m13435a(IHostAction.class);
            C89219l.m154716b(a9, "");
            cVar3.mo24363a(((IHostAction) a9).getTTSetting());
            C6304b.m13621a().f15765b = true;
        }
        MethodCollector.m26664o(10351);
    }

    @Override // com.bytedance.android.live.wallet.AbstractC6315c
    /* renamed from: a */
    public final void mo12354a(List<String> list) {
        C89219l.m154721d(list, "");
        IapPaymentMethod iapPaymentMethod = IapPaymentMethod.GOOGLE;
        if (C6336e.C6337a.m13682a()) {
            iapPaymentMethod = IapPaymentMethod.AMAZON;
        }
        if (!C13603b.m24435a((Collection) list)) {
            AbstractC15106c cVar = C15073a.f36793a;
            C89219l.m154716b(cVar, "");
            cVar.mo24361a().queryProductDetails(iapPaymentMethod, list, "0");
        }
    }

    /* renamed from: a */
    public static void m13640a(C15124c cVar, Activity activity) {
        AbstractC15106c cVar2 = C15073a.f36793a;
        C89219l.m154716b(cVar2, "");
        cVar2.mo24361a().newPay(activity, cVar);
    }

    /* renamed from: com.bytedance.android.live.wallet.c.b$c */
    static final class C6321c implements AbstractC15249b {

        /* renamed from: a */
        final /* synthetic */ C6318b f15817a;

        static {
            Covode.recordClassIndex(7043);
        }

        C6321c(C6318b bVar) {
            this.f15817a = bVar;
        }

        @Override // com.bytedance.globalpayment.payment.common.lib.p1075e.AbstractC15249b
        /* renamed from: a */
        public final void mo12362a(String str, JSONObject jSONObject) {
            C89219l.m154716b(str, "");
            C89219l.m154716b(jSONObject, "");
            HashMap hashMap = new HashMap();
            Iterator<String> keys = jSONObject.keys();
            C89219l.m154716b(keys, "");
            while (keys.hasNext()) {
                String next = keys.next();
                String string = jSONObject.getString(next);
                C89219l.m154716b(string, "");
                hashMap.put(next, string);
            }
            ((AbstractC11807g) C6193a.m13435a(AbstractC11807g.class)).mo18865a(str, hashMap);
        }
    }

    /* renamed from: a */
    public final void mo12361a(C11314c cVar, Activity activity) {
        AbstractC88979t<C5832d<C6313b>> createOrder;
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(activity, "");
        long uptimeMillis = SystemClock.uptimeMillis();
        if (cVar.f27064j == null || !C6336e.C6337a.m13682a()) {
            int i = cVar.f27055a;
            String str = cVar.f27061g;
            int i2 = this.f15811c;
            long j = cVar.f27062h;
            AbstractC2953a a = C6193a.m13435a(IGiftService.class);
            C89219l.m154716b(a, "");
            createOrder = ((IapApi) C5805e.m12718a().mo11572a(IapApi.class)).createOrder(3, i, str, i2, j, ((IGiftService) a).isFirstRecharge());
        } else {
            createOrder = ((IapApi) C5805e.m12718a().mo11572a(IapApi.class)).createAmazonOrder(6, cVar.f27055a, cVar.f27061g, this.f15811c, cVar.f27062h, cVar.f27064j.f27043b, cVar.f27064j.f27042a);
        }
        this.f15810b.mo142945a(createOrder.mo143271a(new C11191f()).mo143254a(new C6319a(this, uptimeMillis, activity), new C6320b(this, cVar)));
    }

    @Override // com.bytedance.android.live.wallet.AbstractC6315c
    /* renamed from: a */
    public final void mo12352a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f15810b.mo142945a(((IapApi) C5805e.m12718a().mo11572a(IapApi.class)).checkSubOrder(str, str2).mo143271a(new C11191f()).mo143267a((AbstractC88434g<? super R, ? extends AbstractC88984x<? extends R>>) C6323e.f15819a, false).mo143302g(C11195i.m19837a(InteractFirstFrameTimeOutDurationSetting.DEFAULT)).mo143254a(new C6324f(this), new C6325g(this)));
    }

    @Override // com.bytedance.android.live.wallet.AbstractC6315c
    /* renamed from: a */
    public final void mo12353a(String str, String str2, String str3, Activity activity) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(activity, "");
        long uptimeMillis = SystemClock.uptimeMillis();
        TimeZone timeZone = TimeZone.getDefault();
        C89219l.m154716b(timeZone, "");
        this.f15810b.mo142945a(((IapApi) C5805e.m12718a().mo11572a(IapApi.class)).subscribeOrder(str, str2, str3, timeZone.getID()).mo143271a(new C11191f()).mo143254a(new C6329k(this, uptimeMillis, activity), new C6330l(this)));
    }
}
