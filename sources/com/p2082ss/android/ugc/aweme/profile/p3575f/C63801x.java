package com.p2082ss.android.ugc.aweme.profile.p3575f;

import com.bytedance.covode.number.Covode;
import com.bytedance.ttnet.p1701b.C22931b;
import com.p2082ss.android.ugc.aweme.account.login.C31975q;
import com.p2082ss.android.ugc.aweme.account.login.C32816w;
import com.p2082ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.p2082ss.android.ugc.aweme.account.login.rememberaccount.C32052a;
import com.p2082ss.android.ugc.aweme.profile.model.UserPermissionData;
import com.p2082ss.android.ugc.aweme.user.C80053c;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import p4600h.p4601a.C89070n;
import p4600h.p4602b.C89090a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.f.x */
public final class C63801x {

    /* renamed from: a */
    public static final C63801x f144624a = new C63801x();

    private C63801x() {
    }

    static {
        Covode.recordClassIndex(75129);
    }

    /* renamed from: a */
    public static JSONArray m115394a(List<C80053c> list) {
        String permissions;
        String str;
        C89219l.m154721d(list, "");
        JSONArray jSONArray = new JSONArray();
        int size = list.size();
        int i = 0;
        while (i < size) {
            C80053c cVar = list.get(i);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("user_id", cVar.f179384a);
            List<BaseLoginMethod> b = C31975q.m66353b(cVar.f179384a);
            if (!b.isEmpty()) {
                jSONObject.put("login_platform", C32052a.m66445a((BaseLoginMethod) C89070n.m154553a((Iterable) b, (Comparator) new C63802a()).get(0)));
            }
            i++;
            jSONObject.put("order", i);
            UserPermissionData.UserPermissionInfo b2 = C32816w.C32817a.m67395b();
            if (b2 == null || (permissions = b2.getPermissions()) == null || permissions.length() == 0) {
                jSONObject.put("age_gate_region", "");
                jSONObject.put("has_permission", "");
            } else {
                Iterator<Map.Entry<String, Boolean>> it = b2.permissionsMap().entrySet().iterator();
                while (it.hasNext()) {
                    it.next();
                    String userPermissionRequestType = UserPermissionData.UserPermissionRequestType.DEFAULT_TYPE.toString();
                    if (b2.permissionsMap().containsKey(userPermissionRequestType)) {
                        if (C89219l.m154714a((Object) b2.permissionsMap().get(userPermissionRequestType), (Object) true)) {
                            str = "1";
                        } else {
                            str = "0";
                        }
                        jSONObject.put("has_permission", str);
                    }
                }
                jSONObject.put("age_gate_region", b2.getAgeGateRegion());
            }
            jSONObject.put("current_user_store_region", C22931b.f54196b);
            jSONArray.put(jSONObject.toString());
        }
        return jSONArray;
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.f.x$a */
    public static final class C63802a<T> implements Comparator {
        static {
            Covode.recordClassIndex(75130);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C89090a.m154604a(t2.getLastActiveTime(), t.getLastActiveTime());
        }
    }
}
