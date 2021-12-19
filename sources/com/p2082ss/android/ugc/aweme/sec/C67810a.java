package com.p2082ss.android.ugc.aweme.sec;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.mobsec.metasec.p1545ov.C21423b;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.account.guestmode.GuestModeServiceImpl;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.sec.captcha.C67822a;
import com.p2082ss.android.ugc.aweme.sec.captcha.SecCaptcha;
import com.p2082ss.android.ugc.aweme.sec.p3707a.C67812a;
import com.p2082ss.android.ugc.aweme.sec.p3708b.C67814a;
import com.p2082ss.android.ugc.aweme.secapi.AbstractC67839b;
import com.p2082ss.android.ugc.aweme.secapi.p3710a.EnumC67838a;
import com.p2082ss.android.ugc.aweme.services.MandatoryLoginService;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import java.util.ArrayList;
import java.util.Iterator;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sec.a */
public final class C67810a {

    /* renamed from: a */
    static boolean f151971a;

    /* renamed from: b */
    static C21423b f151972b;

    /* renamed from: c */
    static SecCaptcha f151973c;

    /* renamed from: d */
    static C67812a f151974d;

    /* renamed from: e */
    public static final C67810a f151975e = new C67810a();

    /* renamed from: f */
    private static ArrayList<String> f151976f = new ArrayList<>();

    /* renamed from: g */
    private static String f151977g;

    /* renamed from: h */
    private static String f151978h;

    /* renamed from: i */
    private static String f151979i;

    /* renamed from: j */
    private static String f151980j;

    /* renamed from: k */
    private static boolean f151981k;

    /* renamed from: l */
    private static boolean f151982l;

    private C67810a() {
    }

    static {
        Covode.recordClassIndex(79469);
    }

    /* renamed from: c */
    private static boolean m119999c() {
        ITpcConsentService.EnumC39272a f = C39223a.m79604r().mo68643f();
        if (f == ITpcConsentService.EnumC39272a.US || f == ITpcConsentService.EnumC39272a.EU) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m119994a() {
        EnumC67838a aVar;
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        if (g.isLogin()) {
            if (C80580in.m139689d()) {
                aVar = EnumC67838a.COLLECT_MODE_KIDS;
            } else {
                aVar = EnumC67838a.COLLECT_MODE_ALL;
            }
            m119995a(aVar);
        } else if (GuestModeServiceImpl.m65990d().mo57219c()) {
            m119995a(EnumC67838a.COLLECT_MODE_EEA_GUEST);
        } else if (m119999c()) {
            if (MandatoryLoginService.createIMandatoryLoginServicebyMonsterPlugin(false).shouldShowForcedLogin()) {
                m119995a(EnumC67838a.COLLECT_MODE_INIT);
            } else {
                m119995a(EnumC67838a.COLLECT_MODE_EEA_GUEST);
            }
        } else if (C39223a.m79604r().mo68642e()) {
            m119995a(EnumC67838a.COLLECT_MODE_EEA_GUEST);
        } else {
            m119995a(EnumC67838a.COLLECT_MODE_INIT);
        }
    }

    /* renamed from: b */
    public static final void m119998b() {
        MethodCollector.m26663i(12376);
        if (f151981k || f151982l) {
            String str = f151977g;
            if (str == null) {
                C89219l.m154710a("currentDid");
            }
            String str2 = f151978h;
            if (str2 == null) {
                C89219l.m154710a("currentIid");
            }
            if (f151981k) {
                str = f151979i;
                if (str == null) {
                    C89219l.m154710a("targetDid");
                }
                f151981k = false;
            }
            if (f151982l) {
                str2 = f151980j;
                if (str2 == null) {
                    C89219l.m154710a("targetIid");
                }
                f151982l = false;
            }
            m119997a(str, str2);
        }
        synchronized (f151975e) {
            try {
                ArrayList<String> arrayList = f151976f;
                if (!arrayList.isEmpty()) {
                    Iterator<String> it = arrayList.iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        C89219l.m154716b(next, "");
                        m119996a(next);
                    }
                }
            } finally {
                MethodCollector.m26664o(12376);
            }
        }
    }

    /* renamed from: a */
    private static void m119995a(EnumC67838a aVar) {
        if (aVar != null) {
            int i = C67813b.f151991a[aVar.ordinal()];
            if (i == 1) {
                C21423b bVar = f151972b;
                if (bVar != null) {
                    bVar.mo35024a(5);
                }
            } else if (i == 2) {
                C21423b bVar2 = f151972b;
                if (bVar2 != null) {
                    bVar2.mo35024a(10);
                }
            } else if (i != 3) {
                if (i == 4) {
                    if (m119999c()) {
                        C21423b bVar3 = f151972b;
                        if (bVar3 != null) {
                            bVar3.mo35024a(503);
                            return;
                        }
                        return;
                    }
                    C21423b bVar4 = f151972b;
                    if (bVar4 != null) {
                        bVar4.mo35024a(603);
                    }
                }
            } else if (m119999c()) {
                C21423b bVar5 = f151972b;
                if (bVar5 != null) {
                    bVar5.mo35024a(10);
                }
            } else {
                C21423b bVar6 = f151972b;
                if (bVar6 != null) {
                    bVar6.mo35024a(503);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sec.a$a */
    static final class C67811a<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ AbstractC67839b f151983a;

        /* renamed from: b */
        final /* synthetic */ boolean f151984b;

        /* renamed from: c */
        final /* synthetic */ String f151985c;

        /* renamed from: d */
        final /* synthetic */ int f151986d;

        /* renamed from: e */
        final /* synthetic */ String f151987e;

        /* renamed from: f */
        final /* synthetic */ String f151988f;

        /* renamed from: g */
        final /* synthetic */ Context f151989g;

        static {
            Covode.recordClassIndex(79470);
        }

        C67811a(AbstractC67839b bVar, boolean z, String str, int i, String str2, String str3, Context context) {
            this.f151983a = bVar;
            this.f151984b = z;
            this.f151985c = str;
            this.f151986d = i;
            this.f151987e = str2;
            this.f151988f = str3;
            this.f151989g = context;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            String str;
            String str2;
            long currentTimeMillis = System.currentTimeMillis();
            String a = this.f151983a.mo98926a();
            if (a == null) {
                a = "";
            }
            C67814a.m120000a("SecCaptcha", "initSCCheckUtil getSessionTime = " + (System.currentTimeMillis() - currentTimeMillis));
            long currentTimeMillis2 = System.currentTimeMillis();
            C21423b bVar = C67810a.f151972b;
            if (bVar != null) {
                bVar.mo35028d(a);
            }
            C67814a.m120000a("DmtSec", "init setSessionTime = " + (System.currentTimeMillis() - currentTimeMillis2));
            if (AppLog.getServerDeviceId() != null) {
                str = AppLog.getServerDeviceId();
            } else {
                str = "";
            }
            if (AppLog.getInstallId() != null) {
                str2 = AppLog.getInstallId();
            } else {
                str2 = "";
            }
            C67810a.m119994a();
            C21423b bVar2 = C67810a.f151972b;
            if (bVar2 != null) {
                bVar2.mo35026b(str);
            }
            C21423b bVar3 = C67810a.f151972b;
            if (bVar3 != null) {
                bVar3.mo35027c(str2);
            }
            if (this.f151984b) {
                C51423a.m95791b(4, "Sec", "initCaptchaParams:did = " + str + "  iid = " + str2 + "  sid = " + a);
                String str3 = this.f151985c;
                int i = this.f151986d;
                String str4 = this.f151987e;
                C89219l.m154716b(str2, "");
                C89219l.m154716b(str, "");
                C67822a aVar = new C67822a(str3, i, str4, str2, str, this.f151988f, a, (byte) 0);
                long currentTimeMillis3 = System.currentTimeMillis();
                Context applicationContext = this.f151989g.getApplicationContext();
                if (C58003a.f132201c && applicationContext == null) {
                    applicationContext = C58003a.f132199a;
                }
                C89219l.m154716b(applicationContext, "");
                C67810a.f151973c = new SecCaptcha(applicationContext, aVar, this.f151983a);
                C67814a.m120000a("DmtSec", "init createSecCaptchaTime = " + (System.currentTimeMillis() - currentTimeMillis3));
            }
            C67810a.f151971a = true;
            C51423a.m95791b(4, "Sec", "secInitSuccessFlag");
            C67810a.m119998b();
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static final synchronized void m119996a(String str) {
        synchronized (C67810a.class) {
            MethodCollector.m26663i(12378);
            C89219l.m154721d(str, "");
            C67814a.m120000a("DmtSec", "report .... scene = " + str + ", initSuccess = " + f151971a);
            if (f151971a) {
                long currentTimeMillis = System.currentTimeMillis();
                C67812a aVar = f151974d;
                if (aVar == null) {
                    C89219l.m154710a("report");
                }
                C89219l.m154721d(str, "");
                C89219l.m154721d(aVar, "");
                C89219l.m154721d(str, "");
                C67814a.m120000a("DataReport", "report .... scene = ".concat(String.valueOf(str)));
                C21423b bVar = aVar.f151990a;
                if (bVar != null) {
                    bVar.mo35025a(str);
                }
                C67814a.m120000a("DmtSec", "report time = " + (System.currentTimeMillis() - currentTimeMillis));
                MethodCollector.m26664o(12378);
                return;
            }
            f151976f.add(str);
            MethodCollector.m26664o(12378);
        }
    }

    /* renamed from: a */
    public static final void m119997a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        if (f151971a) {
            f151977g = str;
            f151978h = str2;
            long currentTimeMillis = System.currentTimeMillis();
            C21423b bVar = f151972b;
            if (bVar != null) {
                bVar.mo35026b(str);
            }
            C21423b bVar2 = f151972b;
            if (bVar2 != null) {
                bVar2.mo35027c(str2);
            }
            C67814a.m120000a("DmtSec", "updateDeviceIdAndInstallId setParamsTime = " + (System.currentTimeMillis() - currentTimeMillis) + ", deviceId = " + str + ", iid = " + str2);
            SecCaptcha secCaptcha = f151973c;
            if (secCaptcha == null) {
                C89219l.m154710a("captcha");
            }
            secCaptcha.mo106920a(str, str2);
            return;
        }
        f151980j = str2;
        f151979i = str;
        f151982l = true;
        f151981k = true;
    }
}
