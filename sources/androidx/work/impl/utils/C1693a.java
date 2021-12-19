package androidx.work.impl.utils;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;

/* renamed from: androidx.work.impl.utils.a */
public class C1693a {

    /* renamed from: a */
    private final Context f5478a;

    /* renamed from: b */
    private SharedPreferences f5479b;

    /* renamed from: c */
    private boolean f5480c;

    static {
        Covode.recordClassIndex(1860);
    }

    /* renamed from: b */
    private void m5560b() {
        if (!this.f5480c) {
            this.f5479b = C34822d.m71158a(this.f5478a, "androidx.work.util.id", 0);
            this.f5480c = true;
        }
    }

    /* renamed from: a */
    public final int mo5479a() {
        int a;
        synchronized (C1693a.class) {
            m5560b();
            a = m5558a("next_alarm_manager_id");
        }
        return a;
    }

    public C1693a(Context context) {
        this.f5478a = context;
    }

    /* renamed from: a */
    private int m5558a(String str) {
        int i = 0;
        int i2 = this.f5479b.getInt(str, 0);
        if (i2 != Integer.MAX_VALUE) {
            i = i2 + 1;
        }
        m5559a(str, i);
        return i2;
    }

    /* renamed from: a */
    private void m5559a(String str, int i) {
        this.f5479b.edit().putInt(str, i).apply();
    }

    /* renamed from: a */
    public final int mo5480a(int i, int i2) {
        synchronized (C1693a.class) {
            m5560b();
            int a = m5558a("next_job_scheduler_id");
            if (a >= i) {
                if (a <= i2) {
                    i = a;
                }
            }
            m5559a("next_job_scheduler_id", i + 1);
        }
        return i;
    }
}
