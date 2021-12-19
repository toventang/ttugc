package com.p2082ss.android.ugc.aweme.account.login;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.ext.C18097a;
import com.p2082ss.android.ugc.aweme.account.login.p2257b.C31893a;
import java.util.HashMap;
import java.util.Map;
import p077b.C1731i;
import p4640l.p4644b.AbstractC89720d;
import p4640l.p4644b.AbstractC89721e;
import p4640l.p4644b.AbstractC89731o;

/* renamed from: com.ss.android.ugc.aweme.account.login.MusLoginManager */
public final class MusLoginManager {

    /* renamed from: a */
    public static final String f76003a = "https://api.tiktokv.com";

    /* renamed from: b */
    private MusLoginApi f76004b = ((MusLoginApi) C18097a.m33698a(f76003a, MusLoginApi.class));

    /* renamed from: com.ss.android.ugc.aweme.account.login.MusLoginManager$MusLoginApi */
    public interface MusLoginApi {
        static {
            Covode.recordClassIndex(38540);
        }

        @AbstractC89731o(mo144285a = "/aweme/v3/user/info/sync/")
        @AbstractC89721e
        C1731i<C31893a> syncUserInfo(@AbstractC89720d Map<String, String> map);
    }

    static {
        Covode.recordClassIndex(38539);
    }

    /* renamed from: a */
    public final C1731i<C31893a> mo57744a(HashMap<String, String> hashMap) {
        return this.f76004b.syncUserInfo(hashMap);
    }
}
