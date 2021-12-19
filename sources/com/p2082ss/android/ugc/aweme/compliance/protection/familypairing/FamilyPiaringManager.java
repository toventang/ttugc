package com.p2082ss.android.ugc.aweme.compliance.protection.familypairing;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.common.utility.C13607d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.ies.uikit.dialog.DialogC18267b;
import com.bytedance.keva.Keva;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.api.p2319b.C33615a;
import com.p2082ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService;
import com.p2082ss.android.ugc.aweme.compliance.protection.common.C40061a;
import com.p2082ss.android.ugc.aweme.compliance.protection.common.p2673a.C40067b;
import com.p2082ss.android.ugc.aweme.compliance.protection.common.p2673a.C40068c;
import com.p2082ss.android.ugc.aweme.compliance.protection.digitalwellbeing.C40074a;
import com.p2082ss.android.ugc.aweme.compliance.protection.digitalwellbeing.EnumC40076b;
import com.p2082ss.android.ugc.aweme.compliance.protection.familypairing.p2676a.C40088a;
import com.p2082ss.android.ugc.aweme.compliance.protection.restrictmode.C40091a;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.FEConfig;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.FeConfigCollection;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p2082ss.android.ugc.aweme.login.C58957c;
import com.p2082ss.android.ugc.aweme.p2929fe.method.C47959j;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89338d;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.compliance.protection.familypairing.FamilyPiaringManager */
public final class FamilyPiaringManager implements AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    public static C40067b f94144a;

    /* renamed from: b */
    public static final FamilyPiaringManager f94145b;

    /* renamed from: c */
    private static final AbstractC89244h f94146c = C89250i.m154773a((AbstractC89171a) C40084c.f94149a);

    /* renamed from: com.ss.android.ugc.aweme.compliance.protection.familypairing.FamilyPiaringManager$d */
    static final class DialogInterface$OnClickListenerC40085d implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC40085d f94150a = new DialogInterface$OnClickListenerC40085d();

        static {
            Covode.recordClassIndex(47859);
        }

        DialogInterface$OnClickListenerC40085d() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: f */
    private static Keva m81057f() {
        return (Keva) f94146c.getValue();
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(239, new RunnableC90250g(FamilyPiaringManager.class, "onParentalModeChanged", C47959j.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    private FamilyPiaringManager() {
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.protection.familypairing.FamilyPiaringManager$c */
    static final class C40084c extends AbstractC89220m implements AbstractC89171a<Keva> {

        /* renamed from: a */
        public static final C40084c f94149a = new C40084c();

        static {
            Covode.recordClassIndex(47858);
        }

        C40084c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepoSync("repo_parental_platform", 0);
        }
    }

    /* renamed from: a */
    public static IFamilyPairingService.EnumC39276a m81048a() {
        C40067b bVar;
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        if (!g.isLogin() || (bVar = f94144a) == null) {
            return IFamilyPairingService.EnumC39276a.NONE;
        }
        return m81051b(bVar);
    }

    /* renamed from: b */
    public static boolean m81052b() {
        C40068c cVar;
        Integer num;
        C40067b bVar = f94144a;
        if (bVar == null || (cVar = bVar.f94115b) == null || (num = cVar.f94117b) == null || num.intValue() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m81054c() {
        C40068c cVar;
        Integer num;
        C40067b bVar = f94144a;
        if (bVar == null || (cVar = bVar.f94115b) == null || (num = cVar.f94116a) == null || num.intValue() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static int m81055d() {
        C40068c cVar;
        Integer num;
        C40067b bVar = f94144a;
        if (bVar == null || (cVar = bVar.f94115b) == null || (num = cVar.f94116a) == null) {
            return 0;
        }
        return num.intValue();
    }

    /* renamed from: e */
    public static String m81056e() {
        try {
            IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
            C89219l.m154716b(iESSettingsProxy, "");
            FeConfigCollection feConfigCollection = iESSettingsProxy.getFeConfigCollection();
            C89219l.m154716b(feConfigCollection, "");
            FEConfig guardianEntrance = feConfigCollection.getGuardianEntrance();
            C89219l.m154716b(guardianEntrance, "");
            String schema = guardianEntrance.getSchema();
            C89219l.m154716b(schema, "");
            return schema;
        } catch (C16041a unused) {
            return "aweme://webview/?url=https%3A%2F%2Fwww.tiktok.com%2Ffalcon%2Fmain%2Fguardian_entrance%2F%3Fhide_nav_bar%3D1&hide_nav_bar=1";
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.compliance.protection.familypairing.FamilyPiaringManager$e */
    public static final class RunnableC40086e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ boolean f94151a;

        static {
            Covode.recordClassIndex(47860);
        }

        RunnableC40086e(boolean z) {
            this.f94151a = z;
        }

        public final void run() {
            int i;
            EnumC40076b bVar;
            if (C40091a.m81077a()) {
                if (this.f94151a) {
                    bVar = EnumC40076b.OPEN;
                } else {
                    bVar = EnumC40076b.CLOSE;
                }
                C40074a.m81037a(bVar);
            }
            C40061a.m81025e();
            Bundle bundle = new Bundle();
            bundle.putInt("filter_warn", C40061a.m81024d());
            AppLog.setCustomerHeader(bundle);
            if (this.f94151a) {
                i = R.string.fbz;
            } else {
                i = R.string.fby;
            }
            new C79459a(C17867d.m33078a()).mo123050a(i).mo123053a();
        }
    }

    static {
        Covode.recordClassIndex(47855);
        FamilyPiaringManager familyPiaringManager = new FamilyPiaringManager();
        f94145b = familyPiaringManager;
        EventBus.m156966a(EventBus.m156962a(), familyPiaringManager);
        if (m81057f().getBoolean("valid", false)) {
            familyPiaringManager.mo69223a(new C40067b(Integer.valueOf(m81057f().getInt("parentalGuardianMode", 0)), new C40068c(Integer.valueOf(m81057f().getInt("screenTimeManagement", 0)), Integer.valueOf(m81057f().getInt("teen_mode", 0)), Integer.valueOf(m81057f().getInt("searchRestriction", 0)))));
        }
    }

    /* renamed from: a */
    public final void mo69223a(C40067b bVar) {
        f94144a = bVar;
        m81053c(bVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.protection.familypairing.FamilyPiaringManager$b */
    public static final class C40083b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ Context f94148a;

        static {
            Covode.recordClassIndex(47857);
        }

        public C40083b(Context context) {
            this.f94148a = context;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C33615a.m68848a(this.f94148a, (Throwable) obj, (int) R.string.g1i);
        }
    }

    /* renamed from: a */
    public static void m81049a(boolean z) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            C89219l.m154716b(myLooper, "");
            new Handler(myLooper).post(new RunnableC40086e(z));
        }
    }

    /* renamed from: b */
    public static IFamilyPairingService.EnumC39276a m81051b(C40067b bVar) {
        Integer num;
        if (!(bVar == null || (num = bVar.f94114a) == null)) {
            if (num.intValue() == 0 || num.intValue() == 1) {
                return IFamilyPairingService.EnumC39276a.NONE;
            }
            if (num.intValue() == 2) {
                return IFamilyPairingService.EnumC39276a.CHILD;
            }
            if (num.intValue() == 3) {
                return IFamilyPairingService.EnumC39276a.PARENT;
            }
            if (num.intValue() == 4) {
                return IFamilyPairingService.EnumC39276a.UNLINK_LOCKED;
            }
        }
        return IFamilyPairingService.EnumC39276a.NONE;
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onParentalModeChanged(C47959j jVar) {
        C89219l.m154721d(jVar, "");
        if (TextUtils.equals("guardian_platform_open", jVar.f111077b.getString("eventName")) || TextUtils.equals("guardian_platform_close", jVar.f111077b.getString("eventName")) || TextUtils.equals("guardian_platform_child_unlink", jVar.f111077b.getString("eventName"))) {
            C40061a.m81020a(null);
        }
    }

    /* renamed from: a */
    public static boolean m81050a(String str) {
        if (TextUtils.isEmpty(str) || str == null || !C89361p.m154908a((CharSequence) str, (CharSequence) "/falcon/rn/guardian_child", true)) {
            return false;
        }
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        if (g.isLogin()) {
            return false;
        }
        C58957c.m108318a(C17873f.m33102j(), "qr_code_detail", "auto");
        new C79459a(C17867d.m33078a()).mo123050a(R.string.cy7).mo123053a();
        return true;
    }

    /* renamed from: c */
    private static void m81053c(C40067b bVar) {
        int i;
        int i2;
        int i3;
        Integer num;
        Integer num2;
        Integer num3;
        int i4 = 0;
        if (bVar == null) {
            m81057f().storeBoolean("valid", false);
            return;
        }
        m81057f().storeBoolean("valid", true);
        Keva f = m81057f();
        C40068c cVar = bVar.f94115b;
        if (cVar == null || (num3 = cVar.f94117b) == null) {
            i = 0;
        } else {
            i = num3.intValue();
        }
        f.storeInt("teen_mode", i);
        Keva f2 = m81057f();
        Integer num4 = bVar.f94114a;
        if (num4 != null) {
            i2 = num4.intValue();
        } else {
            i2 = 0;
        }
        f2.storeInt("parentalGuardianMode", i2);
        Keva f3 = m81057f();
        C40068c cVar2 = bVar.f94115b;
        if (cVar2 == null || (num2 = cVar2.f94116a) == null) {
            i3 = 0;
        } else {
            i3 = num2.intValue();
        }
        f3.storeInt("screenTimeManagement", i3);
        Keva f4 = m81057f();
        C40068c cVar3 = bVar.f94115b;
        if (!(cVar3 == null || (num = cVar3.f94118c) == null)) {
            i4 = num.intValue();
        }
        f4.storeInt("searchRestriction", i4);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.protection.familypairing.FamilyPiaringManager$a */
    public static final class C40082a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ Context f94147a;

        static {
            Covode.recordClassIndex(47856);
        }

        public C40082a(Context context) {
            this.f94147a = context;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            Integer e;
            C40088a aVar = (C40088a) obj;
            try {
                C89219l.m154716b(aVar, "");
                C89219l.m154721d(aVar, "");
                IAccountUserService g = C31575b.m65865g();
                C89219l.m154716b(g, "");
                String b = C13607d.m24442b(g.getCurUserId());
                if (!TextUtils.isEmpty(b) && !TextUtils.isEmpty(aVar.f94153b) && !TextUtils.isEmpty(aVar.f94154c)) {
                    C89219l.m154716b(b, "");
                    Charset charset = C89338d.f202990a;
                    if (b != null) {
                        byte[] bytes = b.getBytes(charset);
                        C89219l.m154716b(bytes, "");
                        SecretKeySpec secretKeySpec = new SecretKeySpec(bytes, "AES");
                        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
                        String str2 = aVar.f94154c;
                        Charset charset2 = C89338d.f202990a;
                        if (str2 != null) {
                            byte[] bytes2 = str2.getBytes(charset2);
                            C89219l.m154716b(bytes2, "");
                            instance.init(2, secretKeySpec, new IvParameterSpec(bytes2));
                            byte[] doFinal = instance.doFinal(C13607d.m24441a(aVar.f94153b));
                            if (!(doFinal == null || (e = C89361p.m154863e((str = new String(doFinal, C89338d.f202990a)))) == null || e.intValue() < 0 || e.intValue() > 9999 || str == null || str.length() == 0)) {
                                Context context = this.f94147a;
                                new DialogC18267b.C18268a(context).mo29153a(String.valueOf(context.getString(R.string.bel))).mo29156b(String.valueOf(str)).mo29152a(R.string.as0, DialogInterface$OnClickListenerC40085d.f94150a).mo29159c();
                                return;
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                }
                new C79459a(this.f94147a).mo123050a(R.string.dmo).mo123053a();
            } catch (Exception unused) {
                new C79459a(this.f94147a).mo123050a(R.string.dmo).mo123053a();
            }
        }
    }
}
