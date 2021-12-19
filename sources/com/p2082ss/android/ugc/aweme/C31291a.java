package com.p2082ss.android.ugc.aweme;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17879g;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.app.accountsdk.AccountInitializer;
import com.p2082ss.android.ugc.aweme.framework.services.ServiceProvider;
import java.util.concurrent.ConcurrentHashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.a */
public final class C31291a {

    /* renamed from: a */
    public static Application f74991a;

    /* renamed from: b */
    public static AbstractC34907bq f74992b;

    /* renamed from: c */
    public static IAccountUserService.AbstractC31278a f74993c;

    /* renamed from: d */
    public static IAccountService.AbstractC31275e f74994d;

    /* renamed from: e */
    public static ConcurrentHashMap<Class<?>, ServiceProvider<?>> f74995e;

    /* renamed from: f */
    public static AbstractC34400b f74996f;

    /* renamed from: g */
    public static String f74997g;

    /* renamed from: h */
    public static String f74998h;

    /* renamed from: i */
    public static final C31291a f74999i = new C31291a();

    private C31291a() {
    }

    /* renamed from: a */
    public static Application m65462a() {
        Application application = f74991a;
        if (application == null) {
            C89219l.m154710a("sContext");
        }
        return application;
    }

    /* renamed from: b */
    public static AbstractC34907bq m65464b() {
        AbstractC34907bq bqVar = f74992b;
        if (bqVar == null) {
            C89219l.m154710a("sNetworkApi");
        }
        return bqVar;
    }

    static {
        Covode.recordClassIndex(37990);
        IAccountInitializer a = AccountInitializer.m68784a();
        if (a == null) {
            C89219l.m154715b();
        }
        Application a2 = C17879g.m33104a();
        C89219l.m154716b(a2, "");
        a.mo57063a(a2);
    }

    /* renamed from: a */
    public static final <T> T m65463a(Class<T> cls) {
        C89219l.m154721d(cls, "");
        ConcurrentHashMap<Class<?>, ServiceProvider<?>> concurrentHashMap = f74995e;
        if (concurrentHashMap == null) {
            C89219l.m154710a("sNeedServices");
        }
        if (concurrentHashMap.contains(cls)) {
            ConcurrentHashMap<Class<?>, ServiceProvider<?>> concurrentHashMap2 = f74995e;
            if (concurrentHashMap2 == null) {
                C89219l.m154710a("sNeedServices");
            }
            ServiceProvider<?> serviceProvider = concurrentHashMap2.get(cls);
            if (serviceProvider == null) {
                C89219l.m154715b();
            }
            return (T) serviceProvider.get();
        }
        AbstractC34400b bVar = f74996f;
        if (bVar == null) {
            C89219l.m154710a("sServiceProvider");
        }
        ServiceProvider<?> a = bVar.mo59922a(cls);
        if (a != null) {
            ConcurrentHashMap<Class<?>, ServiceProvider<?>> concurrentHashMap3 = f74995e;
            if (concurrentHashMap3 == null) {
                C89219l.m154710a("sNeedServices");
            }
            concurrentHashMap3.put(cls, a);
            return a.get();
        }
        throw new RuntimeException("You are not init and register " + cls.getCanonicalName() + " in AccountSdkInitializer");
    }
}
