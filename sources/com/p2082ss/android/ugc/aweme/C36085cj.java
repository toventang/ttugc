package com.p2082ss.android.ugc.aweme;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sdk.p1625a.p1663n.C22507a;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.account.AgeGateService;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.services.BaseBindService;
import com.p2082ss.android.ugc.aweme.services.BindService;
import com.p2082ss.android.ugc.aweme.services.LoginService;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.ugc.aweme.cj */
public class C36085cj {

    /* renamed from: a */
    static List<IAccountService.AbstractC31272b> f85261a = new CopyOnWriteArrayList();

    /* renamed from: b */
    public static AbstractC33494an f85262b;

    /* renamed from: c */
    private static LoginService f85263c;

    /* renamed from: d */
    private static BindService f85264d;

    static {
        Covode.recordClassIndex(43338);
    }

    /* renamed from: b */
    public static String m73548b() {
        return f85262b.mo57069e().getCurUserId();
    }

    /* renamed from: c */
    public static AgeGateService m73549c() {
        return (AgeGateService) f85262b.mo57067c();
    }

    /* renamed from: d */
    public static boolean m73550d() {
        return f85262b.mo57069e().isLogin();
    }

    /* renamed from: e */
    public static void m73551e() {
        f85262b.mo57069e().accountUserClear();
    }

    /* renamed from: f */
    public static User m73552f() {
        return f85262b.mo57069e().getCurUser();
    }

    /* renamed from: g */
    public static LoginService m73553g() {
        if (f85263c == null) {
            f85263c = (LoginService) f85262b.mo57071g();
        }
        return f85263c;
    }

    /* renamed from: h */
    public static BaseBindService m73554h() {
        if (f85264d == null) {
            f85264d = (BindService) f85262b.mo57072h();
        }
        return f85264d;
    }

    /* renamed from: i */
    public static void m73555i() {
        for (IAccountService.AbstractC31272b bVar : f85261a) {
            bVar.onAccountResult(4, true, 0, null);
        }
    }

    /* renamed from: a */
    public static boolean m73547a() {
        if (m73553g().getLoginParam() == null || !m73553g().getLoginParam().f74959g) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m73542a(C22507a aVar) {
        f85262b.mo57069e().updateUserInfo(aVar);
    }

    /* renamed from: a */
    public static void m73543a(IAccountService.AbstractC31272b bVar) {
        MethodCollector.m26663i(10992);
        synchronized (C36085cj.class) {
            try {
                if (!f85261a.contains(bVar)) {
                    f85261a.add(bVar);
                }
            } finally {
                MethodCollector.m26664o(10992);
            }
        }
    }

    /* renamed from: a */
    public static void m73544a(User user) {
        for (IAccountService.AbstractC31272b bVar : f85261a) {
            bVar.onAccountResult(1, true, 0, user);
        }
    }

    /* renamed from: a */
    public static void m73545a(boolean z) {
        for (IAccountService.AbstractC31272b bVar : f85261a) {
            bVar.onAccountResult(3, z, 0, null);
        }
    }

    /* renamed from: a */
    public static void m73546a(boolean z, User user) {
        for (IAccountService.AbstractC31272b bVar : f85261a) {
            bVar.onAccountResult(2, z, 0, user);
        }
    }

    /* renamed from: a */
    public static void m73541a(int i, int i2, String str) {
        AbstractC33494an anVar = f85262b;
        if (anVar.f79568a != null) {
            anVar.f79568a.notifyProgress(i, i2, str);
        }
    }

    /* renamed from: a */
    public static void m73540a(int i, int i2, Object obj) {
        AbstractC33494an anVar = f85262b;
        if (i == 1) {
            if (anVar.f79568a != null) {
                anVar.f79568a.returnResult(i, i2, obj);
            }
        } else if (i == 15) {
            if (anVar.f79573f != null) {
                anVar.f79573f.returnResult(i, i2, obj);
                anVar.f79573f = null;
            }
        } else if (i == 16) {
            if (anVar.f79570c != null) {
                anVar.f79570c.returnResult(i, i2, obj);
            }
        } else if (i != 17) {
            if (anVar.f79569b != null) {
                anVar.f79569b.returnResult(i, i2, obj);
            }
            if (anVar.f79571d != null) {
                anVar.f79571d.returnResult(i, i2, obj);
            }
            if (anVar.f79572e != null) {
                anVar.f79572e.returnResult(i, i2, obj);
            }
        } else if (anVar.f79571d != null) {
            anVar.f79571d.returnResult(i, i2, obj);
        }
    }
}
