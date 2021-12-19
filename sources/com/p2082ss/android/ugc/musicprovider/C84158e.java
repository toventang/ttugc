package com.p2082ss.android.ugc.musicprovider;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.component.music.MusicService;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.legoImp.ProviderConfigOutImpl;
import com.p2082ss.android.ugc.aweme.settings.C68759w;
import com.p2082ss.android.ugc.musicprovider.interfaces.IProviderConfigOut;
import com.toutiao.proxyserver.p4495g.C87327a;
import java.io.File;

/* renamed from: com.ss.android.ugc.musicprovider.e */
public class C84158e {

    /* renamed from: d */
    public static int f187823d = 30000;

    /* renamed from: e */
    public static long f187824e = ((long) C68759w.m121191a());

    /* renamed from: f */
    private static C84158e f187825f;

    /* renamed from: a */
    public AbstractC84159a f187826a;

    /* renamed from: b */
    public AbstractC84159a f187827b;

    /* renamed from: c */
    public Context f187828c;

    /* renamed from: g */
    private boolean f187829g;

    /* renamed from: com.ss.android.ugc.musicprovider.e$a */
    public interface AbstractC84159a {
        static {
            Covode.recordClassIndex(98058);
        }

        /* renamed from: a */
        String mo95715a();
    }

    /* renamed from: e */
    private AbstractC84159a m144736e() {
        if (this.f187826a == null) {
            mo128987b();
        }
        return this.f187826a;
    }

    /* renamed from: f */
    private AbstractC84159a m144737f() {
        if (this.f187827b == null) {
            mo128987b();
        }
        return this.f187827b;
    }

    /* renamed from: d */
    public final String mo128989d() {
        return m144737f().mo95715a();
    }

    static {
        Covode.recordClassIndex(98057);
    }

    /* renamed from: a */
    public static C84158e m144733a() {
        MethodCollector.m26663i(3026);
        if (f187825f == null) {
            synchronized (C84158e.class) {
                try {
                    if (f187825f == null) {
                        f187825f = new C84158e();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3026);
                    throw th;
                }
            }
        }
        C84158e eVar = f187825f;
        MethodCollector.m26664o(3026);
        return eVar;
    }

    /* renamed from: b */
    public final void mo128987b() {
        MethodCollector.m26663i(3084);
        if (!this.f187829g) {
            synchronized (this) {
                try {
                    if (!this.f187829g) {
                        IProviderConfigOut d = ProviderConfigOutImpl.m105245d();
                        if (d != null) {
                            this.f187828c = d.mo95714c();
                            this.f187826a = d.mo95712a();
                            this.f187827b = d.mo95713b();
                        }
                        this.f187829g = true;
                    }
                } finally {
                    MethodCollector.m26664o(3084);
                }
            }
            return;
        }
        MethodCollector.m26664o(3084);
    }

    /* renamed from: c */
    public final String mo128988c() {
        String a = m144736e().mo95715a();
        if (a.endsWith("/")) {
            return a;
        }
        return a + File.separator;
    }

    /* renamed from: c */
    private String m144734c(String str) {
        return mo128988c() + C84127b.m144669c(str);
    }

    /* renamed from: a */
    public final String mo128985a(String str) {
        return m144736e().mo95715a() + C84127b.m144669c(str);
    }

    /* renamed from: b */
    public final String mo128986b(String str) {
        if (!MusicService.m81198m().mo69317f()) {
            return m144734c(str);
        }
        return m144735d(str);
    }

    /* renamed from: d */
    private String m144735d(String str) {
        if (!TextUtils.isEmpty(str)) {
            return mo128988c() + C87327a.m151540a(str);
        }
        C51423a.m95787a("MusicProviderConfig getFilePathById music id is null");
        return "";
    }
}
