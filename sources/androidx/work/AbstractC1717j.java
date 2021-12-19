package androidx.work;

import android.content.Context;
import androidx.work.impl.C1687f;
import androidx.work.impl.utils.p076b.C1708b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58005c;

/* renamed from: androidx.work.j */
public abstract class AbstractC1717j {
    static {
        Covode.recordClassIndex(1886);
    }

    /* renamed from: a */
    public static AbstractC1717j m5620a() {
        C58005c.m104826a();
        C1687f b = C1687f.m5535b();
        if (b != null) {
            return b;
        }
        throw new IllegalStateException("WorkManager is not initialized properly.  The most likely cause is that you disabled WorkManagerInitializer in your manifest but forgot to call WorkManager#initialize in your Application#onCreate or a ContentProvider.");
    }

    /* renamed from: a */
    public static void m5621a(Context context, C1591b bVar) {
        synchronized (C1687f.f5429l) {
            if (C1687f.f5427j != null && C1687f.f5428k != null) {
                throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class levelJavadoc for more information.");
            } else if (C1687f.f5427j == null) {
                Context a = C1687f.m5534a(context);
                if (C1687f.f5428k == null) {
                    C1687f.f5428k = new C1687f(a, bVar, new C1708b());
                }
                C1687f.f5427j = C1687f.f5428k;
            }
        }
    }
}
