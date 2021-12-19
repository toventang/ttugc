package com.p2082ss.android.pushmanager.setting;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.push.p1590c.AbstractC21779j;
import com.bytedance.push.settings.AliveOnlineSettings;
import com.bytedance.push.settings.C21895h;
import com.bytedance.push.settings.LocalSettings;
import com.bytedance.push.settings.PushOnlineSettings;
import com.p2082ss.android.message.C30061a;
import com.p2082ss.android.pushmanager.setting.PushMultiProcessSharedProvider;

/* renamed from: com.ss.android.pushmanager.setting.b */
public class C30221b implements AbstractC21779j {

    /* renamed from: a */
    private static C30221b f72081a;

    /* renamed from: b */
    private PushMultiProcessSharedProvider.C30219b f72082b = PushMultiProcessSharedProvider.m61123a(C30061a.f71748a);

    static {
        Covode.recordClassIndex(36728);
    }

    @Override // com.bytedance.push.p1590c.AbstractC21779j
    /* renamed from: a */
    public final void mo35442a() {
        m61151e().mo35570b();
    }

    private C30221b() {
    }

    /* renamed from: d */
    public static String m61150d() {
        return m61153g().mo35598b();
    }

    /* renamed from: e */
    public static AliveOnlineSettings m61151e() {
        return (AliveOnlineSettings) C21895h.m41120a(C30061a.f71748a, AliveOnlineSettings.class);
    }

    /* renamed from: f */
    public static PushOnlineSettings m61152f() {
        return (PushOnlineSettings) C21895h.m41120a(C30061a.f71748a, PushOnlineSettings.class);
    }

    /* renamed from: g */
    public static LocalSettings m61153g() {
        return (LocalSettings) C21895h.m41120a(C30061a.f71748a, LocalSettings.class);
    }

    /* renamed from: h */
    public static boolean m61154h() {
        return m61152f().mo35602a();
    }

    /* renamed from: c */
    public static boolean m61149c() {
        if (!m61153g().mo35600c() || !m61154h()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static C30221b m61148b() {
        MethodCollector.m26663i(2921);
        if (f72081a == null) {
            synchronized (C30221b.class) {
                try {
                    if (f72081a == null) {
                        f72081a = new C30221b();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(2921);
                    throw th;
                }
            }
        }
        C30221b bVar = f72081a;
        MethodCollector.m26664o(2921);
        return bVar;
    }

    @Override // com.bytedance.push.p1590c.AbstractC21779j
    /* renamed from: b */
    public final void mo35445b(boolean z) {
        m61153g().mo35597a(z);
    }

    @Override // com.bytedance.push.p1590c.AbstractC21779j
    /* renamed from: a */
    public final void mo35443a(String str) {
        m61151e().mo35568a(str);
    }

    @Override // com.bytedance.push.p1590c.AbstractC21779j
    /* renamed from: a */
    public final void mo35444a(boolean z) {
        m61152f().mo35604b(z);
    }
}
