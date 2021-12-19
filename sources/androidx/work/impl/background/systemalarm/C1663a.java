package androidx.work.impl.background.systemalarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.work.AbstractC1600g;
import androidx.work.impl.C1687f;
import androidx.work.impl.p073b.AbstractC1638e;
import androidx.work.impl.p073b.C1637d;
import androidx.work.impl.utils.C1693a;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;

/* renamed from: androidx.work.impl.background.systemalarm.a */
final class C1663a {

    /* renamed from: a */
    private static final String f5364a = AbstractC1600g.m5318a("Alarms");

    static {
        Covode.recordClassIndex(1827);
    }

    /* renamed from: a */
    private static Object m5489a(Context context, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    return context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            return context.getSystemService(str);
        } else if (!C58027i.f132246a) {
            return context.getSystemService(str);
        } else {
            synchronized (ClipboardManager.class) {
                systemService = context.getSystemService(str);
                if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                    try {
                        Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                        declaredField.setAccessible(true);
                        declaredField.set(systemService, new C58027i.HandlerC58028a((Handler) declaredField.get(systemService)));
                    } catch (Exception e) {
                        C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                    }
                }
                C58027i.f132246a = false;
            }
            return systemService;
        }
    }

    /* renamed from: a */
    static void m5491a(Context context, String str, int i) {
        AlarmManager alarmManager = (AlarmManager) m5489a(context, "alarm");
        PendingIntent service = PendingIntent.getService(context, i, C1664b.m5498b(context, str), 536870912);
        if (service != null && alarmManager != null) {
            AbstractC1600g.m5317a();
            C1764a.m5928a("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", new Object[]{str, Integer.valueOf(i)});
            alarmManager.cancel(service);
        }
    }

    /* renamed from: a */
    private static void m5492a(Context context, String str, int i, long j) {
        AlarmManager alarmManager = (AlarmManager) m5489a(context, "alarm");
        PendingIntent service = PendingIntent.getService(context, i, C1664b.m5498b(context, str), 1073741824);
        if (alarmManager != null) {
            int i2 = Build.VERSION.SDK_INT;
            alarmManager.setExact(0, j, service);
        }
    }

    /* renamed from: a */
    public static void m5490a(Context context, C1687f fVar, String str, long j) {
        AbstractC1638e l = fVar.f5432c.mo5369l();
        C1637d a = l.mo5416a(str);
        if (a != null) {
            m5491a(context, str, a.f5298b);
            m5492a(context, str, a.f5298b, j);
            return;
        }
        int a2 = new C1693a(context).mo5479a();
        l.mo5417a(new C1637d(str, a2));
        m5492a(context, str, a2, j);
    }
}
