package com.p2082ss.android.ugc.awemepushlib.manager;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.p910e.C13611a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.statisticlogger.C18205a;
import com.bytedance.push.C21761b;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.common.p2132c.C29819a;
import com.p2082ss.android.newmedia.redbadge.C30173b;
import com.p2082ss.android.push.window.oppo.C30198c;
import com.p2082ss.android.pushmanager.p2172a.C30206a;
import com.p2082ss.android.pushmanager.p2173b.C30213a;
import com.p2082ss.android.pushmanager.p2173b.C30215b;
import com.p2082ss.android.pushmanager.setting.C30221b;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.framework.p3009d.C51427a;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.aweme.p2482cn.C36145b;
import com.p2082ss.android.ugc.awemepushlib.interaction.C81862f;
import com.p2082ss.android.ugc.awemepushlib.interaction.C81867i;
import com.p2082ss.android.ugc.awemepushlib.p4245a.C81806a;
import com.p2082ss.android.ugc.awemepushlib.p4251f.C81832a;
import java.text.SimpleDateFormat;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.awemepushlib.manager.a */
public class C81900a {

    /* renamed from: r */
    private static volatile C81900a f183082r;

    /* renamed from: s */
    private static final SimpleDateFormat f183083s = new SimpleDateFormat("yyyy-MM-dd");

    /* renamed from: u */
    private static int f183084u = 0;

    /* renamed from: v */
    private static boolean f183085v = false;

    /* renamed from: a */
    public String f183086a;

    /* renamed from: b */
    public boolean f183087b;

    /* renamed from: c */
    public boolean f183088c;

    /* renamed from: d */
    public String f183089d;

    /* renamed from: e */
    public long f183090e;

    /* renamed from: f */
    public int f183091f;

    /* renamed from: g */
    public int f183092g;

    /* renamed from: h */
    public int f183093h;

    /* renamed from: i */
    protected C30206a f183094i;

    /* renamed from: j */
    public int f183095j;

    /* renamed from: k */
    public int f183096k;

    /* renamed from: l */
    public int f183097l;

    /* renamed from: m */
    protected boolean f183098m;

    /* renamed from: n */
    public int f183099n;

    /* renamed from: o */
    private int f183100o = -1;

    /* renamed from: p */
    private volatile boolean f183101p;

    /* renamed from: q */
    private volatile boolean f183102q;

    /* renamed from: t */
    private SharedPreferences f183103t;

    /* renamed from: g */
    private SharedPreferences m141828g() {
        m141829h();
        return this.f183103t;
    }

    /* renamed from: d */
    private int m141825d() {
        if (this.f183087b) {
            return f183084u;
        }
        return 1;
    }

    static {
        Covode.recordClassIndex(95317);
    }

    /* renamed from: e */
    private String m141826e() {
        if (this.f183086a == null) {
            this.f183086a = C81862f.m141759a().getDefaultUninstallQuestionUrl();
        }
        return this.f183086a;
    }

    public C81900a() {
        int i = 1;
        this.f183087b = true;
        this.f183088c = true;
        this.f183089d = "";
        this.f183090e = 6000;
        this.f183094i = new C30206a();
        this.f183095j = 1;
        this.f183096k = 1;
        this.f183097l = -1;
        this.f183098m = true;
        this.f183099n = m141825d() != 1 ? 0 : i;
    }

    /* renamed from: a */
    public static C81900a m141823a() {
        MethodCollector.m26663i(12325);
        if (f183082r == null) {
            synchronized (C81900a.class) {
                try {
                    if (f183082r == null) {
                        f183082r = new C81900a();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(12325);
                    throw th;
                }
            }
        }
        C81900a aVar = f183082r;
        MethodCollector.m26664o(12325);
        return aVar;
    }

    /* renamed from: f */
    private void m141827f() {
        SharedPreferences.Editor edit = m141828g().edit();
        edit.putInt("keep_notify_count", this.f183092g);
        edit.putInt("max_notify_count", this.f183091f);
        edit.putInt("notify_fresh_period", this.f183093h);
        edit.putString("notify_message_ids", this.f183094i.mo53634a());
        C13611a.m24460a(edit);
    }

    /* renamed from: h */
    private void m141829h() {
        MethodCollector.m26663i(12956);
        if (!this.f183102q) {
            synchronized (this) {
                try {
                    if (!this.f183102q) {
                        this.f183103t = C34822d.m71158a(C51427a.f118503a, "app_setting", 0);
                        this.f183102q = true;
                    }
                } finally {
                    MethodCollector.m26664o(12956);
                }
            }
            return;
        }
        MethodCollector.m26664o(12956);
    }

    /* renamed from: b */
    public final void mo125554b() {
        this.f183092g = m141828g().getInt("keep_notify_count", 0);
        this.f183091f = m141828g().getInt("max_notify_count", 0);
        this.f183093h = m141828g().getInt("notify_fresh_period", 0);
        this.f183094i.mo53635a(m141828g().getString("notify_message_ids", ""));
    }

    /* renamed from: c */
    public final boolean mo125557c() {
        MethodCollector.m26663i(12865);
        if (!this.f183101p) {
            synchronized (this) {
                try {
                    if (!this.f183101p) {
                        this.f183088c = C36145b.m73641b().mo63270b(C17867d.m33078a(), "is_allow_oppo_push", true);
                        this.f183101p = true;
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(12865);
                    throw th;
                }
            }
        }
        boolean z = this.f183088c;
        MethodCollector.m26664o(12865);
        return z;
    }

    /* renamed from: a */
    public final boolean mo125553a(Context context) {
        if (!m141830h(context) || this.f183099n > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo125550a(long j) {
        m141828g().edit().putLong("last_notify_time", j).apply();
    }

    /* renamed from: d */
    public final boolean mo125559d(Context context) {
        if (m141830h(context)) {
            return this.f183098m;
        }
        return false;
    }

    /* renamed from: e */
    public final synchronized void mo125560e(Context context) {
        MethodCollector.m26663i(12864);
        if (m141830h(context)) {
            this.f183087b = true;
            MethodCollector.m26664o(12864);
            return;
        }
        this.f183087b = false;
        MethodCollector.m26664o(12864);
    }

    /* renamed from: h */
    private synchronized boolean m141830h(Context context) {
        boolean booleanValue;
        int i;
        MethodCollector.m26663i(12440);
        try {
            boolean z = true;
            if (this.f183097l == -1) {
                SharedPreferences a = C34822d.m71158a(context, "push_setting", 0);
                if (this.f183087b) {
                    i = 1;
                } else {
                    i = 0;
                }
                this.f183097l = a.getInt("allow_settings_notify_enable", i);
            }
            if (this.f183097l <= 0) {
                z = false;
            }
            booleanValue = Boolean.valueOf(z).booleanValue();
            MethodCollector.m26664o(12440);
        } catch (Exception unused) {
            boolean booleanValue2 = Boolean.TRUE.booleanValue();
            MethodCollector.m26664o(12440);
            return booleanValue2;
        }
        return booleanValue;
    }

    /* renamed from: b */
    public final void mo125555b(Context context) {
        if (context != null) {
            int i = 0;
            SharedPreferences a = C34822d.m71158a(context, "push_setting", 0);
            if (a != null) {
                if (m141825d() == 1) {
                    i = 1;
                }
                this.f183099n = a.getInt("shut_push_on_stop_service", i);
                this.f183097l = a.getInt("allow_settings_notify_enable", this.f183087b ? 1 : 0);
                this.f183098m = a.getBoolean("notify_enabled", true);
                this.f183086a = a.getString("uninstall_question_url", C81862f.m141759a().getDefaultUninstallQuestionUrl());
                this.f183096k = a.getInt("push_clear_switch", 1);
                this.f183089d = a.getString("aweme_push_config", "");
                try {
                    JSONObject jSONObject = new JSONObject(this.f183089d);
                    this.f183090e = (long) jSONObject.optInt("float_window_show_time");
                    this.f183095j = jSONObject.optInt("oppo_unify_style");
                    this.f183096k = jSONObject.optInt("push_clear_switch", this.f183096k);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: c */
    public final synchronized boolean mo125558c(Context context) {
        boolean booleanValue;
        MethodCollector.m26663i(12779);
        try {
            boolean z = true;
            if (this.f183100o == -1) {
                if (f183085v) {
                    this.f183100o = C34822d.m71158a(context, "push_setting", 0).getInt("confirm_push", 0);
                } else {
                    this.f183100o = 1;
                }
            }
            if (this.f183100o <= 0) {
                z = false;
            }
            booleanValue = Boolean.valueOf(z).booleanValue();
            MethodCollector.m26664o(12779);
        } catch (Exception unused) {
            boolean booleanValue2 = Boolean.TRUE.booleanValue();
            MethodCollector.m26664o(12779);
            return booleanValue2;
        }
        return booleanValue;
    }

    /* renamed from: f */
    public final void mo125561f(Context context) {
        if (C81867i.m141781a()) {
            C21761b.m40732a(context).mo35444a(mo125553a(context));
            C21761b.m40732a(context).mo35443a(m141826e());
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("port", AppLog.getHttpMonitorPort());
                C29819a.m60077a("http_monitor_port_ug", jSONObject);
            } catch (Throwable unused) {
            }
            Map<String, String> b = C18205a.m33879b();
            if (!C81832a.m141719a(b)) {
                C81832a.m141715a(new RunnableC81902c(b));
            }
            C30213a.m61113a(context);
            C30173b.m61015a(context).mo53575b(C31575b.m65865g().getSessionKey());
        }
    }

    /* renamed from: g */
    public final void mo125562g(Context context) {
        SharedPreferences.Editor edit;
        if (!C81806a.m141693c()) {
            m141827f();
        }
        if (context != null && (edit = C34822d.m71158a(context, "push_setting", 0).edit()) != null) {
            edit.putInt("shut_push_on_stop_service", this.f183099n);
            edit.putInt("allow_settings_notify_enable", this.f183097l);
            edit.putBoolean("notify_enabled", this.f183098m);
            edit.putString("uninstall_question_url", this.f183086a);
            edit.putString("aweme_push_config", this.f183089d);
            if (!C81806a.m141692b()) {
                C30198c a = C30198c.m61083a(context);
                edit.putString("tt_push_pop_window_rule", a.f72023f);
                a.mo53626a();
            }
            C13611a.m24460a(edit);
        }
    }

    /* renamed from: b */
    public final void mo125556b(Context context, boolean z) {
        this.f183098m = z;
        SharedPreferences.Editor edit = C34822d.m71158a(context, "push_setting", 0).edit();
        edit.putBoolean("notify_enabled", this.f183098m);
        C13611a.m24460a(edit);
    }

    /* renamed from: a */
    public final synchronized void mo125551a(Context context, boolean z) {
        MethodCollector.m26663i(12783);
        try {
            if (this.f183100o != z) {
                this.f183100o = z ? 1 : 0;
                boolean z2 = false;
                SharedPreferences.Editor edit = C34822d.m71158a(context, "push_setting", 0).edit();
                edit.putInt("confirm_push", this.f183100o);
                C13611a.m24460a(edit);
                C30215b.m61118a();
                if (this.f183100o > 0) {
                    z2 = true;
                }
                C30221b.m61148b().mo35445b(z2);
            }
            MethodCollector.m26664o(12783);
        } catch (Exception unused) {
            MethodCollector.m26664o(12783);
        }
    }

    /* renamed from: a */
    public final boolean mo125552a(long j, long j2) {
        C30206a.C30208a b;
        C30206a aVar = this.f183094i;
        aVar.getClass();
        C30206a.C30208a aVar2 = new C30206a.C30208a();
        aVar2.f72051a = Long.valueOf(j);
        aVar2.f72052b = j2;
        boolean a = this.f183094i.mo53636a(aVar2);
        if (a && (b = this.f183094i.mo53637b(aVar2)) != null) {
            Logger.debug();
            if (aVar2.f72052b - b.f72052b > 43200000) {
                a = false;
            }
        }
        Logger.debug();
        this.f183094i.mo53638c(aVar2);
        m141827f();
        return a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x011b, code lost:
        if (r4 != false) goto L_0x0057;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m141824a(android.content.Context r8, org.json.JSONObject r9) {
        /*
        // Method dump skipped, instructions count: 379
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.awemepushlib.manager.C81900a.m141824a(android.content.Context, org.json.JSONObject):boolean");
    }
}
