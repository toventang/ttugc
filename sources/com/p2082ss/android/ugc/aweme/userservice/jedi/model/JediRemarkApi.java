package com.p2082ss.android.ugc.aweme.userservice.jedi.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.profile.model.CommitRemarkNameResponse;
import p4560f.p4561a.AbstractC88979t;
import p4640l.p4644b.AbstractC89719c;
import p4640l.p4644b.AbstractC89721e;
import p4640l.p4644b.AbstractC89731o;

/* renamed from: com.ss.android.ugc.aweme.userservice.jedi.model.JediRemarkApi */
public interface JediRemarkApi {

    /* renamed from: a */
    public static final C80120a f179524a = C80120a.f179525a;

    static {
        Covode.recordClassIndex(93361);
    }

    @AbstractC89731o(mo144285a = "/aweme/v1/user/remark/name/")
    @AbstractC89721e
    AbstractC88979t<CommitRemarkNameResponse> commitRemarkName(@AbstractC89719c(mo144273a = "remark_name") String str, @AbstractC89719c(mo144273a = "user_id") String str2, @AbstractC89719c(mo144273a = "sec_user_id") String str3);

    /* renamed from: com.ss.android.ugc.aweme.userservice.jedi.model.JediRemarkApi$a */
    public static final class C80120a {

        /* renamed from: a */
        static final /* synthetic */ C80120a f179525a = new C80120a();

        private C80120a() {
        }

        static {
            Covode.recordClassIndex(93362);
        }
    }
}
