package com.bytedance.ies.powerpermissions.p1239b;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.powerpermissions.b.a */
public final class C17747a {

    /* renamed from: a */
    public static final C17747a f42424a = new C17747a();

    private C17747a() {
    }

    static {
        Covode.recordClassIndex(20311);
    }

    /* renamed from: a */
    private static boolean m32889a() {
        return Keva.getRepo("FriendsSharePreferences").getBoolean("read_contact_denied", false);
    }

    /* renamed from: b */
    private static void m32891b() {
        Keva.getRepo("FriendsSharePreferences").storeBoolean("read_contact_denied", true);
    }

    /* renamed from: a */
    public static boolean m32890a(String str) {
        C89219l.m154719c(str, "");
        if (C89219l.m154714a((Object) str, (Object) "android.permission.READ_CONTACTS")) {
            return m32889a();
        }
        return Keva.getRepo("permission_store").getBoolean(str, false);
    }

    /* renamed from: b */
    public static void m32892b(String str) {
        C89219l.m154719c(str, "");
        if (C89219l.m154714a((Object) str, (Object) "android.permission.READ_CONTACTS")) {
            m32891b();
        } else {
            Keva.getRepo("permission_store").storeBoolean(str, true);
        }
    }
}
