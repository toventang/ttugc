package com.p2082ss.android.ugc.aweme.account.util;

import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.account.agegate.util.C31566h;
import com.p2082ss.android.ugc.aweme.account.login.p2257b.C31893a;
import com.p2082ss.android.ugc.aweme.account.p2273m.C32837b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.account.util.z */
public final /* synthetic */ class C33060z implements AbstractC1729g {

    /* renamed from: a */
    private final boolean f78612a;

    static {
        Covode.recordClassIndex(39867);
    }

    C33060z(boolean z) {
        this.f78612a = z;
    }

    @Override // p077b.AbstractC1729g
    public final Object then(C1731i iVar) {
        String str;
        boolean z = this.f78612a;
        if (iVar.mo5544c() || iVar.mo5539b() || !(((C31893a) iVar.mo5545d()).f76202a == 0 || ((C31893a) iVar.mo5545d()).f76202a == 5)) {
            int i = 1;
            C31566h.f75504c = true;
            C33743c a = new C33743c().mo59976a(StringSet.type, "/aweme/v3/user/info/sync/").mo59974a("error_message", Integer.valueOf(((C31893a) iVar.mo5545d()).f76202a));
            if (z) {
                i = 2;
            }
            C33743c a2 = a.mo59974a("status", Integer.valueOf(i));
            if (((C31893a) iVar.mo5545d()).f76204c != null) {
                str = ((C31893a) iVar.mo5545d()).f76204c.getImprId();
            } else {
                str = "";
            }
            C32837b.m67404a("compliance_api_status", "", a2.mo59976a("tns_logId", str).mo59977a());
        } else if (iVar.mo5535a() && (((C31893a) iVar.mo5545d()).f76202a == 0 || ((C31893a) iVar.mo5545d()).f76202a == 5)) {
            C31566h.f75504c = false;
            C32837b.m67404a("compliance_api_status", "", new C33743c().mo59976a(StringSet.type, "/aweme/v3/user/info/sync/").mo59974a("status", (Integer) 0).mo59977a());
        }
        return C1731i.m5640b(CallableC33030ab.f78576a, C1731i.f5562a);
    }
}
