package com.bytedance.android.p126a.p127a.p129b;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import com.bytedance.android.p126a.p127a.C2619c;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.bytedance.android.a.a.b.b */
public final class C2618b implements AbstractC2617a {

    /* renamed from: a */
    private Context f7865a;

    /* renamed from: b */
    private String f7866b;

    /* renamed from: c */
    private SharedPreferences f7867c;

    /* renamed from: d */
    private SharedPreferences.Editor f7868d;

    static {
        Covode.recordClassIndex(3006);
    }

    @Override // com.bytedance.android.p126a.p127a.p129b.AbstractC2617a
    /* renamed from: b */
    public final AbstractC2617a mo7122b() {
        SharedPreferences.Editor d = m7572d();
        if (d == null) {
            return this;
        }
        d.clear();
        return this;
    }

    @Override // com.bytedance.android.p126a.p127a.p129b.AbstractC2617a
    /* renamed from: c */
    public final void mo7125c() {
        SharedPreferences.Editor d = m7572d();
        if (d != null) {
            d.apply();
        }
    }

    /* renamed from: d */
    private SharedPreferences.Editor m7572d() {
        SharedPreferences e;
        MethodCollector.m26663i(3296);
        if (this.f7868d == null) {
            synchronized (this) {
                try {
                    if (this.f7868d == null && (e = m7573e()) != null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        this.f7868d = e.edit();
                        C2619c.m7582a().mo7129b(this.f7866b, SystemClock.uptimeMillis() - uptimeMillis);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3296);
                    throw th;
                }
            }
        }
        SharedPreferences.Editor editor = this.f7868d;
        MethodCollector.m26664o(3296);
        return editor;
    }

    /* renamed from: e */
    private SharedPreferences m7573e() {
        MethodCollector.m26663i(3299);
        if (this.f7867c == null) {
            synchronized (this) {
                try {
                    if (this.f7867c == null) {
                        try {
                            long uptimeMillis = SystemClock.uptimeMillis();
                            this.f7867c = C34822d.m71158a(this.f7865a, this.f7866b, 0);
                            C2619c.m7582a().mo7128a(this.f7866b, SystemClock.uptimeMillis() - uptimeMillis);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3299);
                    throw th;
                }
            }
        }
        SharedPreferences sharedPreferences = this.f7867c;
        MethodCollector.m26664o(3299);
        return sharedPreferences;
    }

    @Override // com.bytedance.android.p126a.p127a.p129b.AbstractC2617a
    /* renamed from: a */
    public final Map<String, ?> mo7121a() {
        SharedPreferences e = m7573e();
        if (e == null) {
            return Collections.emptyMap();
        }
        return e.getAll();
    }

    @Override // com.bytedance.android.p126a.p127a.p129b.AbstractC2617a
    /* renamed from: c */
    public final int mo7124c(String str) {
        SharedPreferences e = m7573e();
        if (e == null) {
            return 0;
        }
        return e.getInt(str, 0);
    }

    @Override // com.bytedance.android.p126a.p127a.p129b.AbstractC2617a
    /* renamed from: d */
    public final AbstractC2617a mo7126d(String str) {
        SharedPreferences.Editor d = m7572d();
        if (d == null) {
            return this;
        }
        d.remove(str);
        return this;
    }

    @Override // com.bytedance.android.p126a.p127a.p129b.AbstractC2617a
    /* renamed from: a */
    public final String mo7120a(String str) {
        SharedPreferences e = m7573e();
        if (e == null) {
            return null;
        }
        return e.getString(str, null);
    }

    @Override // com.bytedance.android.p126a.p127a.p129b.AbstractC2617a
    /* renamed from: b */
    public final AbstractC2617a mo7123b(String str) {
        SharedPreferences.Editor d = m7572d();
        if (d == null) {
            return this;
        }
        d.putInt(str, 2);
        return this;
    }

    public C2618b(Context context, String str) {
        this.f7865a = context;
        this.f7866b = str;
    }

    @Override // com.bytedance.android.p126a.p127a.p129b.AbstractC2617a
    /* renamed from: a */
    public final AbstractC2617a mo7119a(String str, String str2) {
        SharedPreferences.Editor d = m7572d();
        if (d == null) {
            return this;
        }
        d.putString(str, str2);
        return this;
    }
}
