package com.p2082ss.android.ugc.aweme.account.login.authorize.p2255a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.login.C32079s;
import com.p2082ss.android.ugc.aweme.account.p2233a.p2235b.C31376a;
import com.p2082ss.android.ugc.aweme.common.C39162r;

/* renamed from: com.ss.android.ugc.aweme.account.login.authorize.a.a */
public final class C31869a {
    static {
        Covode.recordClassIndex(38613);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.authorize.a.a$1 */
    static /* synthetic */ class C318701 {

        /* renamed from: a */
        static final /* synthetic */ int[] f76165a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        static {
            /*
                r0 = 38614(0x96d6, float:5.411E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.ss.android.ugc.aweme.account.login.authorize.a.a$a[] r0 = com.p2082ss.android.ugc.aweme.account.login.authorize.p2255a.C31869a.EnumC31871a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.p2082ss.android.ugc.aweme.account.login.authorize.p2255a.C31869a.C318701.f76165a = r2
                com.ss.android.ugc.aweme.account.login.authorize.a.a$a r0 = com.p2082ss.android.ugc.aweme.account.login.authorize.p2255a.C31869a.EnumC31871a.SUCCESS     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.p2082ss.android.ugc.aweme.account.login.authorize.p2255a.C31869a.C318701.f76165a     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.ss.android.ugc.aweme.account.login.authorize.a.a$a r0 = com.p2082ss.android.ugc.aweme.account.login.authorize.p2255a.C31869a.EnumC31871a.FAILURE     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = com.p2082ss.android.ugc.aweme.account.login.authorize.p2255a.C31869a.C318701.f76165a     // Catch:{ NoSuchFieldError -> 0x002e }
                com.ss.android.ugc.aweme.account.login.authorize.a.a$a r0 = com.p2082ss.android.ugc.aweme.account.login.authorize.p2255a.C31869a.EnumC31871a.CANCEL     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.account.login.authorize.p2255a.C31869a.C318701.<clinit>():void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.authorize.a.a$a */
    public enum EnumC31871a {
        SUCCESS,
        FAILURE,
        CANCEL;

        static {
            Covode.recordClassIndex(38615);
        }
    }

    /* renamed from: a */
    public static void m66221a(EnumC31871a aVar, String str, String str2) {
        int i = C318701.f76165a[aVar.ordinal()];
        int i2 = 2;
        if (i == 2) {
            i2 = 0;
        } else if (i != 3) {
            i2 = 1;
        }
        C39162r.m79460a("token_response", new C31376a().mo57399a("enter_method", C32079s.f76561a).mo57399a("enter_from", C32079s.f76562b).mo57399a("platform", str2).mo57397a("status", i2).mo57399a("fail_info", str).mo57397a("_perf_monitor", 1).f75156a);
    }
}
