package org.greenrobot.eventbus;

import android.os.Looper;
import com.bytedance.covode.number.Covode;
import java.util.logging.Level;

/* renamed from: org.greenrobot.eventbus.l */
public interface AbstractC90255l {
    static {
        Covode.recordClassIndex(106526);
    }

    /* renamed from: a */
    void mo145405a(Level level, String str);

    /* renamed from: a */
    void mo145406a(Level level, String str, Throwable th);

    /* renamed from: org.greenrobot.eventbus.l$a */
    public static class C90256a {
        static {
            Covode.recordClassIndex(106527);
        }

        /* renamed from: a */
        static Object m157001a() {
            try {
                return Looper.getMainLooper();
            } catch (RuntimeException unused) {
                return null;
            }
        }
    }

    /* renamed from: org.greenrobot.eventbus.l$b */
    public static class C90257b implements AbstractC90255l {
        static {
            Covode.recordClassIndex(106528);
        }

        @Override // org.greenrobot.eventbus.AbstractC90255l
        /* renamed from: a */
        public final void mo145405a(Level level, String str) {
            System.out.println("[" + level + "] " + str);
        }

        @Override // org.greenrobot.eventbus.AbstractC90255l
        /* renamed from: a */
        public final void mo145406a(Level level, String str, Throwable th) {
            System.out.println("[" + level + "] " + str);
            th.printStackTrace(System.out);
        }
    }
}
