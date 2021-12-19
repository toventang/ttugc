package androidx.legacy.p061a;

import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;

/* renamed from: androidx.legacy.a.a */
public abstract class AbstractC1160a extends BroadcastReceiver {

    /* renamed from: a */
    private static final SparseArray<PowerManager.WakeLock> f3921a = new SparseArray<>();

    /* renamed from: b */
    private static int f3922b = 1;

    static {
        Covode.recordClassIndex(1253);
    }

    /* renamed from: a */
    public static boolean m3847a(Intent intent) {
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return false;
        }
        SparseArray<PowerManager.WakeLock> sparseArray = f3921a;
        synchronized (sparseArray) {
            PowerManager.WakeLock wakeLock = sparseArray.get(intExtra);
            if (wakeLock == null) {
                return true;
            }
            wakeLock.release();
            sparseArray.remove(intExtra);
            return true;
        }
    }

    /* renamed from: a */
    public static ComponentName m3845a(Context context, Intent intent) {
        SparseArray<PowerManager.WakeLock> sparseArray = f3921a;
        synchronized (sparseArray) {
            int i = f3922b;
            int i2 = i + 1;
            f3922b = i2;
            if (i2 <= 0) {
                f3922b = 1;
            }
            intent.putExtra("androidx.contentpager.content.wakelockid", i);
            ComponentName b = mo42984b(context, intent);
            if (b == null) {
                return null;
            }
            PowerManager.WakeLock newWakeLock = ((PowerManager) m3846a(context, "power")).newWakeLock(1, "androidx.core:wake:" + b.flattenToShortString());
            newWakeLock.setReferenceCounted(false);
            newWakeLock.acquire(60000);
            sparseArray.put(i, newWakeLock);
            return b;
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003d */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.ComponentName mo42984b(android.content.Context r9, android.content.Intent r10) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.legacy.p061a.AbstractC1160a.mo42984b(android.content.Context, android.content.Intent):android.content.ComponentName");
    }

    /* renamed from: a */
    private static Object m3846a(Context context, String str) {
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
}
