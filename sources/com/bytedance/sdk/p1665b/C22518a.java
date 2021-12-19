package com.bytedance.sdk.p1665b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sdk.p1665b.p1666a.AbstractC22521a;
import com.bytedance.sdk.p1665b.p1666a.AbstractC22522b;
import com.bytedance.sdk.p1665b.p1666a.AbstractC22523c;
import com.bytedance.sdk.p1665b.p1666a.C22524d;
import com.bytedance.sdk.p1665b.p1667b.C22533d;

/* renamed from: com.bytedance.sdk.b.a */
public class C22518a {

    /* renamed from: a */
    public static volatile C22524d f53231a;

    /* renamed from: b */
    private static volatile AbstractC22526b f53232b;

    /* renamed from: com.bytedance.sdk.b.a$a */
    public interface AbstractC22520a {
        static {
            Covode.recordClassIndex(26336);
        }
    }

    static {
        Covode.recordClassIndex(26334);
    }

    private C22518a() {
    }

    /* renamed from: b */
    public static AbstractC22523c m42478b() {
        m42486j();
        return f53231a.f53236c;
    }

    /* renamed from: c */
    public static Context m42479c() {
        m42486j();
        return f53231a.f53234a;
    }

    /* renamed from: f */
    public static AbstractC22522b m42482f() {
        m42486j();
        return f53231a.f53237d;
    }

    /* renamed from: g */
    public static AbstractC22521a m42483g() {
        m42486j();
        return f53231a.f53238e;
    }

    /* renamed from: h */
    public static String m42484h() {
        m42486j();
        return f53231a.f53240g;
    }

    /* renamed from: i */
    public static C22533d m42485i() {
        m42486j();
        return f53231a.f53243j;
    }

    /* renamed from: d */
    public static AbstractC22526b m42480d() {
        m42486j();
        m42477a();
        return f53232b;
    }

    /* renamed from: e */
    public static boolean m42481e() {
        m42486j();
        if (f53231a.f53235b) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public static boolean m42486j() {
        if (f53231a == null) {
            throw new IllegalStateException("MobileDataSDK:sdk init fail, init config is null");
        } else if (f53231a.f53234a != null) {
            return true;
        } else {
            throw new IllegalStateException("MobileDataSDK:context == null");
        }
    }

    /* renamed from: a */
    public static void m42477a() {
        MethodCollector.m26663i(2969);
        if (f53232b == null) {
            synchronized (C22518a.class) {
                try {
                    if (f53232b == null) {
                        f53232b = new C22534c();
                    }
                } finally {
                    MethodCollector.m26664o(2969);
                }
            }
            return;
        }
        MethodCollector.m26664o(2969);
    }
}
