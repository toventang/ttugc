package com.p2082ss.android.ugc.aweme.deeplink.actions;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.deeplink.C41059q;
import com.p2082ss.android.ugc.aweme.deeplink.actions.p2732a.AbstractC41008b;
import java.util.HashMap;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.deeplink.actions.UserProfileAction */
public final class UserProfileAction extends AbstractC41008b<C89391z> {
    static {
        Covode.recordClassIndex(48875);
    }

    @Override // com.p2082ss.android.ugc.aweme.deeplink.actions.p2732a.AbstractC41008b
    public final C89378p<String, HashMap<String, Object>> buildInnerUrl(String str, HashMap<String, Object> hashMap) {
        String str2;
        String str3 = "";
        C89219l.m154721d(str, str3);
        C89219l.m154721d(hashMap, str3);
        Uri parse = Uri.parse(str);
        Object obj = hashMap.get("id");
        if (obj == null && (obj = hashMap.get("uid")) == null) {
            obj = hashMap.get("user_id");
        }
        Object obj2 = hashMap.get("unique_id");
        if (obj != null) {
            str2 = obj.toString();
        } else {
            str2 = null;
        }
        String a = C41059q.C41060a.m82713a(str2, parse);
        Object obj3 = hashMap.get("invitation_id");
        C89378p[] pVarArr = new C89378p[4];
        String str4 = obj;
        if (obj == null) {
            str4 = str3;
        }
        pVarArr[0] = C89387v.m154943a("uid", str4);
        if (a == null) {
            a = str3;
        }
        pVarArr[1] = C89387v.m154943a("sec_user_id", a);
        if (obj2 == null) {
            obj2 = str3;
        }
        pVarArr[2] = C89387v.m154943a("unique_id", obj2);
        String str5 = str3;
        if (obj3 != null) {
            str5 = obj3;
        }
        pVarArr[3] = C89387v.m154943a("invitation_id", str5);
        return new C89378p<>("//user/profile", C89041ag.m154428c(pVarArr));
    }
}
