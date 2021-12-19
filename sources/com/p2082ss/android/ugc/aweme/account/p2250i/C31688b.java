package com.p2082ss.android.ugc.aweme.account.p2250i;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.i.b */
public final class C31688b extends AbstractC31689c {

    /* renamed from: a */
    public static final C31688b f75798a = new C31688b();

    /* renamed from: c */
    private static final String f75799c = "SwitchAccount";

    private C31688b() {
    }

    @Override // com.p2082ss.android.ugc.aweme.account.p2250i.AbstractC31689c
    /* renamed from: a */
    public final String mo57671a() {
        return f75799c;
    }

    static {
        Covode.recordClassIndex(38422);
    }

    /* renamed from: b */
    public static final void m66016b() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "switch account successfully");
        C31688b bVar = f75798a;
        String hashMap2 = hashMap.toString();
        C89219l.m154716b(hashMap2, "");
        bVar.mo57672b(hashMap2);
    }

    /* renamed from: a */
    public static final void m66014a(Integer num, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "switch account failed");
        hashMap.put("errorCode", String.valueOf(num));
        if (str == null) {
            str = "";
        }
        hashMap.put("errorMsg", str);
        C31688b bVar = f75798a;
        String hashMap2 = hashMap.toString();
        C89219l.m154716b(hashMap2, "");
        bVar.mo57672b(hashMap2);
    }

    /* renamed from: a */
    public static final void m66015a(String str, String str2, String str3, String str4) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str4, "");
        HashMap hashMap = new HashMap();
        hashMap.put("event", "start switch account");
        hashMap.put("from", str4);
        hashMap.put("extra", "from " + str + " to " + str2 + " with " + str3);
        C31688b bVar = f75798a;
        String hashMap2 = hashMap.toString();
        C89219l.m154716b(hashMap2, "");
        bVar.mo57672b(hashMap2);
    }
}
