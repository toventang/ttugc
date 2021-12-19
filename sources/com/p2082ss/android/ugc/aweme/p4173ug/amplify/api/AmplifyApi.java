package com.p2082ss.android.ugc.aweme.p4173ug.amplify.api;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88410b;
import p4640l.p4644b.AbstractC89719c;
import p4640l.p4644b.AbstractC89721e;
import p4640l.p4644b.AbstractC89731o;
import p4640l.p4644b.AbstractC89740x;

/* renamed from: com.ss.android.ugc.aweme.ug.amplify.api.AmplifyApi */
public interface AmplifyApi {

    /* renamed from: a */
    public static final C79564a f178544a = C79564a.f178545a;

    static {
        Covode.recordClassIndex(92770);
    }

    @AbstractC89731o
    @AbstractC89721e
    AbstractC88410b confirmAction(@AbstractC89740x String str, @AbstractC89719c(mo144273a = "select_type") String str2);

    @AbstractC89731o(mo144285a = "/aweme/v2/ug/ugc/permission/user/perm/refuse")
    AbstractC88410b refuseAction();

    /* renamed from: com.ss.android.ugc.aweme.ug.amplify.api.AmplifyApi$a */
    public static final class C79564a {

        /* renamed from: a */
        static final /* synthetic */ C79564a f178545a = new C79564a();

        private C79564a() {
        }

        static {
            Covode.recordClassIndex(92771);
        }
    }
}
