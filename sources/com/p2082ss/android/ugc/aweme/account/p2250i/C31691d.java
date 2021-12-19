package com.p2082ss.android.ugc.aweme.account.p2250i;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.i.d */
public final class C31691d extends AbstractC31689c {

    /* renamed from: a */
    public static final C31691d f75801a = new C31691d();

    @Override // com.p2082ss.android.ugc.aweme.account.p2250i.AbstractC31689c
    /* renamed from: a */
    public final String mo57671a() {
        return "VerifyCode";
    }

    private C31691d() {
    }

    static {
        Covode.recordClassIndex(38425);
    }

    /* renamed from: b */
    public static final void m66021b() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "on send code success");
        C31691d dVar = f75801a;
        String hashMap2 = hashMap.toString();
        C89219l.m154716b(hashMap2, "");
        dVar.mo57672b(hashMap2);
    }

    /* renamed from: a */
    public static final void m66020a(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "on send code error");
        if (str == null) {
            str = "";
        }
        hashMap.put("errorCode", str);
        if (str2 == null) {
            str2 = "";
        }
        hashMap.put("errorMsg", str2);
        C31691d dVar = f75801a;
        String hashMap2 = hashMap.toString();
        C89219l.m154716b(hashMap2, "");
        dVar.mo57672b(hashMap2);
    }
}
