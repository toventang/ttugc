package com.p2082ss.android.ugc.aweme.deeplink.actions;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.deeplink.actions.p2732a.AbstractC41008b;
import java.util.HashMap;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.deeplink.actions.EOYAction */
public final class EOYAction extends AbstractC41008b<C89391z> {
    static {
        Covode.recordClassIndex(48869);
    }

    @Override // com.p2082ss.android.ugc.aweme.deeplink.actions.p2732a.AbstractC41008b
    public final C89378p<String, HashMap<String, Object>> buildInnerUrl(String str, HashMap<String, Object> hashMap) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(hashMap, "");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("outerUrl", str);
        return new C89378p<>("//eoy/", hashMap2);
    }
}
