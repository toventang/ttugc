package com.bytedance.android.livesdk.firstrecharge;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.wallet.AbstractC6360g;
import com.bytedance.android.live.wallet.C6336e;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.chatroom.C7411d;
import com.bytedance.android.livesdk.gift.model.C8852p;
import com.bytedance.android.livesdk.gift.model.C8857u;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.gift.p543a.AbstractC8783b;
import com.bytedance.android.livesdk.gift.p548d.C8803g;
import com.bytedance.android.livesdk.livesetting.gift.LiveFirstRechargeEnableV2Setting;
import com.bytedance.android.livesdk.livesetting.gift.LiveFirstRechargeGiftIapidSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveFirstRechargeGiftPidSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveFirstRechargeTitle;
import com.bytedance.android.livesdk.livesetting.gift.LiveFirstRechargeWebUrlLynx;
import com.bytedance.android.livesdk.model.C9904t;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.service.C10630a;
import com.bytedance.android.livesdk.service.assets.GiftManager;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.utils.p653a.C11200a;
import com.bytedance.android.livesdk.wallet.C11314c;
import com.bytedance.android.livesdk.wallet.C11315d;
import com.bytedance.android.livesdk.wallet.C11318g;
import com.bytedance.android.livesdk.wallet.p657a.C11310a;
import com.bytedance.android.livesdkapi.depend.p680d.p682b.AbstractC11636c;
import com.bytedance.android.livesdkapi.p690f.C11756a;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.firstrecharge.d */
public final class C8729d implements AbstractC8783b {

    /* renamed from: u */
    public static final C8729d f21542u = C8732c.f21566a;

    /* renamed from: v */
    public static final C8730a f21543v = new C8730a((byte) 0);

    /* renamed from: a */
    public long f21544a;

    /* renamed from: b */
    public long f21545b;

    /* renamed from: c */
    public int f21546c;

    /* renamed from: d */
    public C8852p f21547d;

    /* renamed from: e */
    public long f21548e;

    /* renamed from: f */
    public boolean f21549f;

    /* renamed from: g */
    public boolean f21550g;

    /* renamed from: h */
    public String f21551h;

    /* renamed from: i */
    public C8803g f21552i;

    /* renamed from: j */
    public final ArrayList<String> f21553j;

    /* renamed from: k */
    public C11314c f21554k;

    /* renamed from: l */
    public boolean f21555l;

    /* renamed from: m */
    public String f21556m;

    /* renamed from: n */
    public WeakReference<Activity> f21557n;

    /* renamed from: o */
    public String f21558o;

    /* renamed from: p */
    public boolean f21559p;

    /* renamed from: q */
    public C8726a f21560q;

    /* renamed from: r */
    public C11314c f21561r;

    /* renamed from: s */
    public Application.ActivityLifecycleCallbacks f21562s;

    /* renamed from: t */
    public AbstractC6360g f21563t;

    /* renamed from: w */
    private final C88411a f21564w;

    /* renamed from: com.bytedance.android.livesdk.firstrecharge.d$b */
    public enum EnumC8731b {
        StyleUnknown,
        StyleWithoutDiamond,
        StyleShowDiamond;

        static {
            Covode.recordClassIndex(9605);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.firstrecharge.d$i */
    public static final class C8739i<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C8739i f21576a = new C8739i();

        static {
            Covode.recordClassIndex(9613);
        }

        C8739i() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: h */
    public static C9904t m17036h() {
        return null;
    }

    /* renamed from: com.bytedance.android.livesdk.firstrecharge.d$a */
    public static final class C8730a {
        static {
            Covode.recordClassIndex(9604);
        }

        private C8730a() {
        }

        public /* synthetic */ C8730a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.firstrecharge.d$c */
    static final class C8732c {

        /* renamed from: a */
        static final C8729d f21566a = new C8729d((byte) 0);

        /* renamed from: b */
        public static final C8732c f21567b = new C8732c();

        private C8732c() {
        }

        static {
            Covode.recordClassIndex(9606);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.firstrecharge.d$f */
    public static final class RunnableC8736f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C8729d f21571a;

        /* renamed from: b */
        final /* synthetic */ Context f21572b;

        /* renamed from: c */
        final /* synthetic */ String f21573c;

        static {
            Covode.recordClassIndex(9610);
        }

        RunnableC8736f(C8729d dVar, Context context, String str) {
            this.f21571a = dVar;
            this.f21572b = context;
            this.f21573c = str;
        }

        public final void run() {
            this.f21571a.mo15004a(this.f21572b, false, this.f21573c);
        }
    }

    /* renamed from: b */
    public final boolean mo15007b() {
        C8726a aVar = this.f21560q;
        if (aVar != null) {
            return aVar.f21534a;
        }
        return false;
    }

    /* renamed from: i */
    public final long mo15013i() {
        C8857u uVar;
        C8852p pVar = this.f21547d;
        if (pVar == null || (uVar = pVar.f21747b) == null) {
            return 0;
        }
        return uVar.f21775a;
    }

    /* renamed from: k */
    public final void mo15015k() {
        if (!this.f21549f) {
            this.f21550g = true;
        }
        this.f21549f = true;
    }

    /* renamed from: l */
    public final long mo15016l() {
        C8857u uVar;
        C8852p pVar = this.f21547d;
        if (pVar == null || (uVar = pVar.f21747b) == null) {
            return 0;
        }
        return uVar.f21776b;
    }

    static {
        Covode.recordClassIndex(9603);
    }

    /* renamed from: d */
    public final boolean mo15009d() {
        if (this.f21559p) {
            return false;
        }
        C8726a aVar = this.f21560q;
        if ((aVar == null || !aVar.f21534a || !LiveFirstRechargeEnableV2Setting.INSTANCE.getValue()) && !mo15010e()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final boolean mo15010e() {
        C9904t g = mo15012g();
        C9904t h = m17036h();
        if (this.f21559p) {
            return false;
        }
        if (g != null && g.f24008m) {
            return true;
        }
        if (h == null || !h.f24008m) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo15011f() {
        C8726a aVar = this.f21560q;
        if (aVar != null && aVar.f21534a) {
            return true;
        }
        C9904t g = mo15012g();
        if (g == null || !g.f24008m) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public final C9904t mo15012g() {
        C8857u uVar;
        C8852p pVar = this.f21547d;
        if (pVar == null || (uVar = pVar.f21747b) == null) {
            return null;
        }
        long j = uVar.f21775a;
        if (j == 0) {
            return null;
        }
        return GiftManager.inst().findGiftById(j);
    }

    /* renamed from: m */
    public final EnumC8731b mo15017m() {
        C8726a aVar = this.f21560q;
        if (aVar == null || aVar.f21537d == 0) {
            return EnumC8731b.StyleUnknown;
        }
        C8726a aVar2 = this.f21560q;
        if (aVar2 == null || aVar2.f21537d != 1) {
            return EnumC8731b.StyleShowDiamond;
        }
        return EnumC8731b.StyleWithoutDiamond;
    }

    /* renamed from: c */
    public final void mo15008c() {
        this.f21564w.mo142945a(((FirstRechargeApi) C5805e.m12718a().mo11572a(FirstRechargeApi.class)).syncFirstRechargeInfo(12L, C6336e.f15839g.f15841a).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C8738h(this), C8739i.f21576a));
    }

    /* renamed from: j */
    public final void mo15014j() {
        this.f21564w.mo142945a(AbstractC88979t.m154307b(f21542u.f21548e - (C11200a.m19851a() / 1000), TimeUnit.SECONDS).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143289d(new C8737g(this)));
    }

    private C8729d() {
        this.f21564w = new C88411a();
        String str = "";
        this.f21551h = str;
        ArrayList<String> arrayList = new ArrayList<>();
        this.f21553j = arrayList;
        this.f21554k = new C11314c();
        this.f21556m = str;
        this.f21558o = str;
        this.f21562s = new C8733d(this);
        this.f21563t = new C8734e(this);
        this.f21554k.f27056b = LiveFirstRechargeGiftIapidSetting.INSTANCE.getValue();
        this.f21554k.f27055a = LiveFirstRechargeGiftPidSetting.INSTANCE.getValue();
        String str2 = this.f21554k.f27056b;
        arrayList.add(str2 != null ? str2 : str);
    }

    /* renamed from: a */
    public final void mo15001a() {
        Integer num;
        ((IWalletService) C6193a.m13435a(IWalletService.class)).walletCenter().mo12379d();
        C6779a.m14563a().mo13053a(new C8742g());
        mo15015k();
        C6779a.m14563a().mo13053a(new C8741f());
        C11226ao.m19882a(C3966y.m9669e(), (int) R.string.e7r);
        this.f21555l = true;
        Context e = C3966y.m9669e();
        C89219l.m154716b(e, "");
        if (m17035a(e) instanceof Application) {
            Context e2 = C3966y.m9669e();
            C89219l.m154716b(e2, "");
            Context a = m17035a(e2);
            Objects.requireNonNull(a, "null cannot be cast to non-null type android.app.Application");
            ((Application) a).unregisterActivityLifecycleCallbacks(this.f21562s);
        }
        ((IWalletService) C6193a.m13435a(IWalletService.class)).walletCenter().mo12379d();
        C6779a.m14563a().mo13053a(new C8741f());
        C11226ao.m19882a(C3966y.m9669e(), (int) R.string.e7r);
        C89378p[] pVarArr = new C89378p[8];
        pVarArr[0] = C89387v.m154943a("pay_method", "google_pay");
        pVarArr[1] = C89387v.m154943a("charge_style", "window");
        pVarArr[2] = C89387v.m154943a("charge_reason", this.f21551h);
        pVarArr[3] = C89387v.m154943a("request_page", "live_detail");
        pVarArr[4] = C89387v.m154943a("panel_type", "first_charge");
        C11314c cVar = this.f21561r;
        if (cVar != null) {
            num = Integer.valueOf(cVar.f27058d);
        } else {
            num = null;
        }
        pVarArr[5] = C89387v.m154943a("recharge_package", String.valueOf(num));
        pVarArr[6] = C89387v.m154943a("is_first_recharge", "1");
        pVarArr[7] = C89387v.m154943a("second_entrance", "other_recharge");
        Map<String, String> b = C89041ag.m154427b(pVarArr);
        C7411d a2 = C7411d.m15284a();
        C89219l.m154716b(a2, "");
        if (!C13627m.m24498a(a2.mo13614e())) {
            C7411d a3 = C7411d.m15284a();
            C89219l.m154716b(a3, "");
            String e3 = a3.mo13614e();
            C89219l.m154716b(e3, "");
            b.put("enter_live_method", e3);
        }
        C6501b.C6502a.m13948a("livesdk_recharge_success").mo12652a(b).mo12639a().mo12655b();
    }

    public /* synthetic */ C8729d(byte b) {
        this();
    }

    /* renamed from: com.bytedance.android.livesdk.firstrecharge.d$e */
    public static final class C8734e implements AbstractC6360g {

        /* renamed from: a */
        final /* synthetic */ C8729d f21569a;

        static {
            Covode.recordClassIndex(9608);
        }

        /* renamed from: com.bytedance.android.livesdk.firstrecharge.d$e$a */
        public static final class C8735a implements AbstractC11636c {

            /* renamed from: a */
            final /* synthetic */ C8734e f21570a;

            static {
                Covode.recordClassIndex(9609);
            }

            @Override // com.bytedance.android.livesdkapi.depend.p680d.p682b.AbstractC11636c
            /* renamed from: a */
            public final void mo12314a(Throwable th) {
                C89219l.m154721d(th, "");
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C8735a(C8734e eVar) {
                this.f21570a = eVar;
            }

            @Override // com.bytedance.android.livesdkapi.depend.p680d.p682b.AbstractC11636c
            /* renamed from: a */
            public final void mo12313a(long j) {
                C6779a.m14563a().mo13053a(new C11315d(true, (int) (j - ((long) this.f21570a.f21569a.f21546c))));
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C8734e(C8729d dVar) {
            this.f21569a = dVar;
        }

        /* renamed from: a */
        private static Context m17054a(Context context) {
            Context applicationContext = context.getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                return C58003a.f132199a;
            }
            return applicationContext;
        }

        @Override // com.bytedance.android.live.wallet.AbstractC6360g
        /* renamed from: a */
        public final void mo12414a(int i, Object obj) {
            Activity activity;
            Application application;
            if (i == 1) {
                String str = null;
                if (!(obj instanceof List)) {
                    obj = null;
                }
                List<C11314c> list = (List) obj;
                if (list == null) {
                    return;
                }
                if (!(!list.isEmpty()) || !TextUtils.equals(this.f21569a.f21554k.f27056b, ((C11314c) list.get(0)).f27056b)) {
                    if (!list.isEmpty()) {
                        C11314c cVar = this.f21569a.f21561r;
                        if (cVar != null) {
                            str = cVar.f27056b;
                        }
                        if (TextUtils.equals(str, ((C11314c) list.get(0)).f27056b)) {
                            C11314c cVar2 = this.f21569a.f21561r;
                            if (cVar2 != null) {
                                cVar2.f27057c = ((C11314c) list.get(0)).f27057c;
                            }
                            C11314c cVar3 = this.f21569a.f21561r;
                            if (cVar3 != null) {
                                cVar3.f27062h = ((C11314c) list.get(0)).f27062h;
                            }
                            C11314c cVar4 = this.f21569a.f21561r;
                            if (cVar4 != null) {
                                cVar4.f27061g = ((C11314c) list.get(0)).f27061g;
                                return;
                            }
                            return;
                        }
                    }
                    C6336e eVar = C6336e.f15839g;
                    C89219l.m154721d(list, "");
                    if (!(list.isEmpty() || eVar.f15843c.isEmpty() || (!eVar.f15842b.isEmpty()))) {
                        for (C11314c cVar5 : list) {
                            for (T t : eVar.f15843c) {
                                if (C13627m.m24499a(t.f27056b, cVar5.f27056b)) {
                                    t.f27057c = cVar5.f27057c;
                                    t.f27062h = cVar5.f27062h;
                                    t.f27061g = cVar5.f27061g;
                                }
                            }
                        }
                        eVar.mo12390a(eVar.f15843c);
                        return;
                    }
                    return;
                }
                this.f21569a.f21554k.f27057c = ((C11314c) list.get(0)).f27057c;
                this.f21569a.f21554k.f27062h = ((C11314c) list.get(0)).f27062h;
                this.f21569a.f21554k.f27061g = ((C11314c) list.get(0)).f27061g;
                C6336e eVar2 = C6336e.f15839g;
                String str2 = this.f21569a.f21554k.f27061g;
                if (str2 == null) {
                    str2 = "";
                }
                eVar2.mo12389a(str2);
                C6336e eVar3 = C6336e.f15839g;
                C11314c cVar6 = this.f21569a.f21554k;
                C89219l.m154721d(cVar6, "");
                eVar3.f15844d = cVar6;
                this.f21569a.mo15008c();
                if (C6336e.f15839g.mo12388a().isEmpty()) {
                    C6336e eVar4 = C6336e.f15839g;
                    long j = this.f21569a.f21544a;
                    long j2 = this.f21569a.f21545b;
                    if (eVar4.f15841a.length() != 0) {
                        long j3 = 0;
                        if (C6336e.C6337a.m13682a()) {
                            j3 = 8;
                        }
                        ((IWalletService) C6193a.m13435a(IWalletService.class)).walletCenter().mo12365a(eVar4.f15841a, j, j2, j3).mo143254a(new C6336e.C6339c(eVar4), C6336e.C6340d.f15850a);
                    }
                }
            } else if (i == 2) {
                WeakReference<Activity> weakReference = this.f21569a.f21557n;
                if (!(weakReference == null || (activity = weakReference.get()) == null || (application = activity.getApplication()) == null)) {
                    application.unregisterActivityLifecycleCallbacks(this.f21569a.f21562s);
                }
            } else if (i == 3) {
                ((IWalletService) C6193a.m13435a(IWalletService.class)).walletCenter().mo12370a(new C8735a(this));
            }
        }

        @Override // com.bytedance.android.live.wallet.AbstractC6360g
        /* renamed from: a */
        public final void mo12413a(int i, int i2, int i3, Exception exc, C11318g gVar) {
            Activity activity;
            WeakReference<Activity> weakReference;
            Activity activity2;
            C89219l.m154721d(gVar, "");
            if (i == 2) {
                WeakReference<Activity> weakReference2 = this.f21569a.f21557n;
                if (!(weakReference2 == null || (activity = weakReference2.get()) == null)) {
                    ((IWalletService) C6193a.m13435a(IWalletService.class)).handleExceptionForAll(new C11310a(i, i2, i3, exc, true, "", 0, false), activity);
                }
                Context e = C3966y.m9669e();
                C89219l.m154716b(e, "");
                if (m17054a(e) instanceof Application) {
                    Context e2 = C3966y.m9669e();
                    C89219l.m154716b(e2, "");
                    Context a = m17054a(e2);
                    Objects.requireNonNull(a, "null cannot be cast to non-null type android.app.Application");
                    ((Application) a).unregisterActivityLifecycleCallbacks(this.f21569a.f21562s);
                }
                ((IWalletService) C6193a.m13435a(IWalletService.class)).walletCenter().mo12374b(this);
            } else if (i == 3 && (weakReference = this.f21569a.f21557n) != null && (activity2 = weakReference.get()) != null) {
                ((IWalletService) C6193a.m13435a(IWalletService.class)).handleExceptionForAll(new C11310a(i, i2, i3, exc, true, "", 0, false), activity2);
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.firstrecharge.d$d */
    public static final class C8733d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a */
        final /* synthetic */ C8729d f21568a;

        static {
            Covode.recordClassIndex(9607);
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
        C8733d(C8729d dVar) {
            this.f21568a = dVar;
        }

        public final void onActivityResumed(Activity activity) {
            Integer num;
            String str;
            C89219l.m154721d(activity, "");
            ComponentName componentName = activity.getComponentName();
            C89219l.m154716b(componentName, "");
            if (C13627m.m24499a("com.android.billingclient.api.ProxyBillingActivity", componentName.getClassName())) {
                C6501b a = C6501b.C6502a.m13948a("livesdk_recharge_pay");
                C89378p[] pVarArr = new C89378p[8];
                pVarArr[0] = C89387v.m154943a("request_page", "live_detail");
                pVarArr[1] = C89387v.m154943a("charge_reason", this.f21568a.f21551h);
                pVarArr[2] = C89387v.m154943a("charge_style", "window");
                pVarArr[3] = C89387v.m154943a("panel_type", "first_charge");
                pVarArr[4] = C89387v.m154943a("pay_method", "google_pay");
                C11314c cVar = this.f21568a.f21561r;
                if (cVar != null) {
                    num = Integer.valueOf(cVar.f27058d);
                } else {
                    num = null;
                }
                pVarArr[5] = C89387v.m154943a("recharge_package", String.valueOf(num));
                AbstractC2953a a2 = C6193a.m13435a(IGiftService.class);
                C89219l.m154716b(a2, "");
                if (((IGiftService) a2).isFirstRecharge()) {
                    str = "1";
                } else {
                    str = "0";
                }
                pVarArr[6] = C89387v.m154943a("is_first_recharge", str);
                pVarArr[7] = C89387v.m154943a("second_entrance", "other_recharge");
                a.mo12652a(C89041ag.m154421a(pVarArr)).mo12639a().mo12655b();
            }
        }
    }

    /* renamed from: a */
    private static Context m17035a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.firstrecharge.d$g */
    public static final class C8737g<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C8729d f21574a;

        static {
            Covode.recordClassIndex(9611);
        }

        C8737g(C8729d dVar) {
            this.f21574a = dVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f21574a.f21559p = true;
            C6779a.m14563a().mo13053a(new C10630a());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.firstrecharge.d$h */
    public static final class C8738h<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C8729d f21575a;

        static {
            Covode.recordClassIndex(9612);
        }

        C8738h(C8729d dVar) {
            this.f21575a = dVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C8726a aVar;
            C11314c cVar;
            String str;
            C8726a aVar2;
            C5832d dVar = (C5832d) obj;
            C8729d dVar2 = this.f21575a;
            String str2 = null;
            if (dVar != null) {
                aVar = (C8726a) dVar.data;
            } else {
                aVar = null;
            }
            dVar2.f21560q = aVar;
            C8729d dVar3 = this.f21575a;
            if (dVar == null || (aVar2 = (C8726a) dVar.data) == null) {
                cVar = null;
            } else {
                cVar = aVar2.f21535b;
            }
            dVar3.f21561r = cVar;
            this.f21575a.f21553j.clear();
            ArrayList<String> arrayList = this.f21575a.f21553j;
            C11314c cVar2 = this.f21575a.f21561r;
            if (cVar2 == null || (str = cVar2.f27056b) == null) {
                str = "";
            }
            arrayList.add(str);
            C11314c cVar3 = this.f21575a.f21561r;
            if (cVar3 != null) {
                str2 = cVar3.f27056b;
            }
            if (!TextUtils.isEmpty(str2)) {
                ((IWalletService) C6193a.m13435a(IWalletService.class)).walletCenter().mo12372a(this.f21575a.f21553j);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo15005a(List<GiftPage> list) {
        C8852p pVar;
        long j;
        if (!(list == null || list.isEmpty() || (pVar = this.f21547d) == null)) {
            for (GiftPage giftPage : list) {
                Iterator<C9904t> it = giftPage.gifts.iterator();
                while (true) {
                    if (it.hasNext()) {
                        C9904t next = it.next();
                        C89219l.m154716b(next, "");
                        long j2 = next.f23999d;
                        C8857u uVar = pVar.f21747b;
                        if (uVar != null) {
                            j = uVar.f21775a;
                        } else {
                            j = 0;
                        }
                        if (j2 == j) {
                            return next.f24008m;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.gift.p543a.AbstractC8783b
    /* renamed from: b */
    public final void mo15006b(Context context, String str) {
        mo15004a(context, true, str);
    }

    /* renamed from: a */
    public final void mo15003a(Context context, String str) {
        if (this.f21555l) {
            C11226ao.m19882a(C3966y.m9669e(), (int) R.string.gic);
        } else if (C3966y.m9670f()) {
            mo15004a(context, false, str);
        } else {
            C11756a aVar = new C11756a(1);
            C8803g gVar = new C8803g();
            this.f21552i = gVar;
            gVar.f21680b = "first_recharge";
            C8803g gVar2 = this.f21552i;
            if (gVar2 != null) {
                gVar2.f21682d = new RunnableC8736f(this, context, str);
            }
            C6779a.m14563a().mo13053a(aVar);
        }
    }

    @Override // com.bytedance.android.livesdk.gift.p543a.AbstractC8783b
    /* renamed from: a */
    public final void mo15002a(long j, long j2) {
        this.f21553j.clear();
        ArrayList<String> arrayList = this.f21553j;
        String str = this.f21554k.f27056b;
        if (str == null) {
            str = "";
        }
        arrayList.add(str);
        this.f21544a = j;
        this.f21545b = j2;
        if (!C6336e.C6337a.m13682a()) {
            ((IWalletService) C6193a.m13435a(IWalletService.class)).walletCenter().mo12367a(this.f21563t);
            ((IWalletService) C6193a.m13435a(IWalletService.class)).walletCenter().mo12372a(this.f21553j);
        }
        this.f21559p = false;
        this.f21547d = null;
        this.f21564w.mo142944a();
        this.f21560q = null;
    }

    /* renamed from: a */
    public final void mo15004a(Context context, boolean z, String str) {
        C11314c cVar;
        C11314c cVar2;
        String str2;
        Integer num;
        String str3;
        String str4;
        if (context instanceof Activity) {
            C11314c cVar3 = this.f21561r;
            if (cVar3 != null) {
                Integer num2 = null;
                String str5 = cVar3.f27057c;
                if (!(str5 == null || str5.length() == 0 || (((cVar = this.f21561r) != null && cVar.f27058d == 0) || ((cVar2 = this.f21561r) != null && cVar2.f27059e == 0)))) {
                    C8740e.m17060a(this.f21558o);
                    String value = LiveFirstRechargeWebUrlLynx.INSTANCE.getValue();
                    try {
                        Uri.Builder buildUpon = Uri.parse(value).buildUpon();
                        buildUpon.appendQueryParameter("gift_enter_from", this.f21558o);
                        C11314c cVar4 = this.f21561r;
                        if (cVar4 == null || (str4 = cVar4.f27057c) == null) {
                            str2 = null;
                        } else {
                            str2 = str4.toString();
                        }
                        buildUpon.appendQueryParameter("price", str2);
                        C11314c cVar5 = this.f21561r;
                        if (cVar5 != null) {
                            num = Integer.valueOf(cVar5.f27058d);
                        } else {
                            num = null;
                        }
                        buildUpon.appendQueryParameter("diamond_count", String.valueOf(num));
                        C11314c cVar6 = this.f21561r;
                        if (cVar6 != null) {
                            num2 = Integer.valueOf(cVar6.f27059e);
                        }
                        buildUpon.appendQueryParameter("giving_count", String.valueOf(num2));
                        buildUpon.appendQueryParameter("charge_reason", str);
                        String str6 = "1";
                        if (z) {
                            str3 = str6;
                        } else {
                            str3 = "0";
                        }
                        buildUpon.appendQueryParameter("recall", str3);
                        buildUpon.appendQueryParameter("pay_method", "google_pay");
                        if (!LiveFirstRechargeTitle.INSTANCE.getValue()) {
                            str6 = "0";
                        }
                        buildUpon.appendQueryParameter("title_ab", str6);
                        String uri = buildUpon.build().toString();
                        C89219l.m154716b(uri, "");
                        value = uri;
                    } catch (Exception unused) {
                    }
                    ((IActionHandlerService) C6193a.m13435a(IActionHandlerService.class)).handle(context, value);
                    return;
                }
            }
            C11226ao.m19882a(C3966y.m9669e(), (int) R.string.gic);
        }
    }
}
