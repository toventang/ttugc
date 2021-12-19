package androidx.work.impl.utils;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;

/* renamed from: androidx.work.impl.utils.c */
public class C1711c {

    /* renamed from: a */
    private Context f5519a;

    /* renamed from: b */
    private SharedPreferences f5520b;

    static {
        Covode.recordClassIndex(1878);
    }

    /* renamed from: a */
    public final boolean mo5509a() {
        return m5608b().getBoolean("reschedule_needed", false);
    }

    /* renamed from: b */
    private SharedPreferences m5608b() {
        SharedPreferences sharedPreferences;
        synchronized (C1711c.class) {
            if (this.f5520b == null) {
                this.f5520b = C34822d.m71158a(this.f5519a, "androidx.work.util.preferences", 0);
            }
            sharedPreferences = this.f5520b;
        }
        return sharedPreferences;
    }

    public C1711c(Context context) {
        this.f5519a = context;
    }

    /* renamed from: a */
    public final void mo5508a(boolean z) {
        m5608b().edit().putBoolean("reschedule_needed", z).apply();
    }
}
