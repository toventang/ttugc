package com.facebook.common.p1837i;

import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1832d.C24098m;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.facebook.common.i.a */
public final class C24123a {

    /* renamed from: a */
    public static final long f57058a = TimeUnit.MINUTES.toMillis(2);

    /* renamed from: f */
    private static C24123a f57059f;

    /* renamed from: b */
    public volatile StatFs f57060b;

    /* renamed from: c */
    public volatile StatFs f57061c;

    /* renamed from: d */
    public long f57062d;

    /* renamed from: e */
    public final Lock f57063e = new ReentrantLock();

    /* renamed from: g */
    private volatile File f57064g;

    /* renamed from: h */
    private volatile File f57065h;

    /* renamed from: i */
    private volatile boolean f57066i;

    static {
        Covode.recordClassIndex(28251);
    }

    protected C24123a() {
    }

    /* renamed from: a */
    public static synchronized C24123a m45726a() {
        C24123a aVar;
        synchronized (C24123a.class) {
            MethodCollector.m26663i(10322);
            if (f57059f == null) {
                f57059f = new C24123a();
            }
            aVar = f57059f;
            MethodCollector.m26664o(10322);
        }
        return aVar;
    }

    /* renamed from: c */
    public final void mo39706c() {
        this.f57060b = m45725a(this.f57060b, this.f57064g);
        this.f57061c = m45725a(this.f57061c, this.f57065h);
        this.f57062d = SystemClock.uptimeMillis();
    }

    /* renamed from: com.facebook.common.i.a$a */
    public enum EnumC24124a {
        INTERNAL,
        EXTERNAL;

        static {
            Covode.recordClassIndex(28252);
        }
    }

    /* renamed from: b */
    public final void mo39705b() {
        if (!this.f57066i) {
            this.f57063e.lock();
            try {
                if (!this.f57066i) {
                    this.f57064g = Environment.getDataDirectory();
                    this.f57065h = Environment.getExternalStorageDirectory();
                    mo39706c();
                    this.f57066i = true;
                }
            } finally {
                this.f57063e.unlock();
            }
        }
    }

    /* renamed from: a */
    private static StatFs m45725a(StatFs statFs, File file) {
        if (file == null || !file.exists()) {
            return null;
        }
        if (statFs == null) {
            try {
                return new StatFs(file.getAbsolutePath());
            } catch (IllegalArgumentException unused) {
                return null;
            } catch (Throwable th) {
                throw C24098m.m45632b(th);
            }
        } else {
            statFs.restat(file.getAbsolutePath());
            return statFs;
        }
    }
}
