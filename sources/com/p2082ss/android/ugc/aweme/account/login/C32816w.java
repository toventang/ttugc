package com.p2082ss.android.ugc.aweme.account.login;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.profile.model.UserPermissionData;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.w */
public final class C32816w {

    /* renamed from: a */
    public static final Keva f78184a = Keva.getRepo("check_multi_account_repo");

    /* renamed from: b */
    public static final C32817a f78185b = new C32817a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.account.login.w$a */
    public static final class C32817a {
        static {
            Covode.recordClassIndex(39597);
        }

        private C32817a() {
        }

        /* renamed from: a */
        public static boolean m67394a() {
            if (!C31575b.m65865g().isLogin()) {
                return false;
            }
            return C32816w.f78184a.getBoolean("use_current_user_info", false);
        }

        /* renamed from: b */
        public static UserPermissionData.UserPermissionInfo m67395b() {
            if (!C32816w.f78184a.contains("user_permission_info")) {
                return null;
            }
            HashMap hashMap = new HashMap();
            m67393a(new JSONObject(C32816w.f78184a.getString("user_permission_info", "")), hashMap);
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            String curUserId = g.getCurUserId();
            if (!hashMap.containsKey(curUserId)) {
                return null;
            }
            C27910f fVar = new C27910f();
            Object obj = hashMap.get(curUserId);
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
            return (UserPermissionData.UserPermissionInfo) fVar.mo46670a((String) obj, UserPermissionData.UserPermissionInfo.class);
        }

        public /* synthetic */ C32817a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m67393a(JSONObject jSONObject, HashMap<String, Object> hashMap) {
            Iterator<String> keys = jSONObject.keys();
            C89219l.m154716b(keys, "");
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.get(next));
            }
        }
    }

    static {
        Covode.recordClassIndex(39596);
    }
}
