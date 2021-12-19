package com.p2082ss.android.newmedia.redbadge.p2170b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.pushmanager.setting.PushMultiProcessSharedProvider;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;

/* renamed from: com.ss.android.newmedia.redbadge.b.a */
public final class C30179a {

    /* renamed from: b */
    private static volatile C30179a f71953b;

    /* renamed from: a */
    public PushMultiProcessSharedProvider.C30219b f71954a;

    /* renamed from: c */
    private Context f71955c;

    static {
        Covode.recordClassIndex(36681);
    }

    /* renamed from: b */
    public final String mo53586b() {
        return this.f71954a.mo53661a("desktop_red_badge_args", "");
    }

    /* renamed from: c */
    public final long mo53589c() {
        return this.f71954a.mo53659a("red_badge_last_request_time");
    }

    /* renamed from: d */
    public final int mo53592d() {
        return this.f71954a.mo53658a("red_badge_next_query_interval", 600);
    }

    /* renamed from: e */
    public final String mo53594e() {
        return this.f71954a.mo53661a("red_badge_last_time_paras", "");
    }

    /* renamed from: f */
    public final String mo53596f() {
        return this.f71954a.mo53661a("red_badge_last_last_time_paras", "");
    }

    /* renamed from: g */
    public final int mo53597g() {
        return this.f71954a.mo53658a("red_badge_launch_times", 0);
    }

    /* renamed from: h */
    public final int mo53598h() {
        return this.f71954a.mo53658a("red_badge_show_times", 0);
    }

    /* renamed from: a */
    public final boolean mo53585a() {
        return this.f71954a.mo53662a("is_desktop_red_badge_show", false);
    }

    /* renamed from: a */
    public final void mo53581a(int i) {
        this.f71954a.mo53660a().mo53654a("red_badge_next_query_interval", i).mo53657a();
    }

    private C30179a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        this.f71955c = applicationContext;
        this.f71954a = PushMultiProcessSharedProvider.m61123a(applicationContext);
    }

    /* renamed from: a */
    public static synchronized C30179a m61024a(Context context) {
        C30179a aVar;
        synchronized (C30179a.class) {
            MethodCollector.m26663i(13551);
            if (f71953b == null) {
                f71953b = new C30179a(context);
            }
            aVar = f71953b;
            MethodCollector.m26664o(13551);
        }
        return aVar;
    }

    /* renamed from: b */
    public final void mo53587b(int i) {
        this.f71954a.mo53660a().mo53654a("red_badge_launch_times", i).mo53657a();
    }

    /* renamed from: c */
    public final void mo53590c(int i) {
        this.f71954a.mo53660a().mo53654a("red_badge_show_times", i).mo53657a();
    }

    /* renamed from: d */
    public final void mo53593d(String str) {
        this.f71954a.mo53660a().mo53656a("rom", str).mo53657a();
    }

    /* renamed from: e */
    public final void mo53595e(String str) {
        this.f71954a.mo53660a().mo53656a("red_badge_last_valid_response", str).mo53657a();
    }

    /* renamed from: a */
    public final void mo53582a(long j) {
        this.f71954a.mo53660a().mo53655a("red_badge_last_request_time", j).mo53657a();
    }

    /* renamed from: b */
    public final void mo53588b(String str) {
        this.f71954a.mo53660a().mo53656a("red_badge_last_last_time_paras", str).mo53657a();
    }

    /* renamed from: c */
    public final void mo53591c(String str) {
        this.f71954a.mo53660a().mo53656a("session_key", str).mo53657a();
    }

    /* renamed from: a */
    public final void mo53583a(String str) {
        this.f71954a.mo53660a().mo53656a("red_badge_last_time_paras", str).mo53657a();
    }

    /* renamed from: a */
    public final void mo53584a(boolean z) {
        PushMultiProcessSharedProvider.C30218a a = this.f71954a.mo53660a();
        a.f72075b.put("is_desktop_red_badge_show", Boolean.valueOf(z));
        a.mo53657a();
    }
}
