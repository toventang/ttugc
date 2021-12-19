package android.p003ss.com.vboost.p005b;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.VibrationEffect;
import android.os.Vibrator;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: android.ss.com.vboost.b.j */
public class C0021j {

    /* renamed from: a */
    public static Vibrator f88a = null;

    /* renamed from: b */
    public static boolean f89b = false;

    /* renamed from: c */
    private static final String f90c = C0021j.class.getSimpleName();

    /* renamed from: a */
    public static void m57a() {
        Vibrator vibrator = f88a;
        if (vibrator != null) {
            f89b = true;
            vibrator.cancel();
        }
    }

    static {
        Covode.recordClassIndex(24);
    }

    /* renamed from: a */
    public static String m56a(String str) {
        try {
            File file = new File(str);
            FileReader fileReader = new FileReader(file);
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), "utf-8");
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                int read = inputStreamReader.read();
                if (read != -1) {
                    stringBuffer.append((char) read);
                } else {
                    fileReader.close();
                    inputStreamReader.close();
                    return stringBuffer.toString();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static void m58a(float f) {
        if (f88a != null) {
            if (Build.VERSION.SDK_INT >= 26) {
                int i = (int) (255.0f * f);
                long j = (long) (f * 300.0f);
                if (i > 0) {
                    if (i > 255) {
                        i = 255;
                    }
                    f88a.vibrate(VibrationEffect.createOneShot(j, i));
                }
            } else if (Build.VERSION.SDK_INT >= 24) {
                long j2 = (long) (f * 90.0f);
                f88a.vibrate(new long[]{5, j2, 5, j2}, 2);
                new Timer().schedule(new TimerTask() {
                    /* class android.p003ss.com.vboost.p005b.C0021j.C00221 */

                    static {
                        Covode.recordClassIndex(25);
                    }

                    public final void run() {
                        C0021j.f88a.cancel();
                    }
                }, 300);
            }
        }
    }

    /* renamed from: a */
    public static Object m55a(Context context, String str) {
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
    public static void m59a(float f, float f2) {
        if (f88a != null) {
            int i = (int) f2;
            if (Build.VERSION.SDK_INT >= 26) {
                int i2 = (int) (f * 255.0f);
                if (i2 > 0) {
                    if (i2 > 255) {
                        i2 = 255;
                    }
                    f88a.vibrate(VibrationEffect.createOneShot((long) i, i2));
                }
            } else if (Build.VERSION.SDK_INT >= 24) {
                long j = (long) (f * 90.0f);
                f88a.vibrate(new long[]{5, j, 5, j}, 2);
                new Timer().schedule(new TimerTask() {
                    /* class android.p003ss.com.vboost.p005b.C0021j.C00232 */

                    static {
                        Covode.recordClassIndex(26);
                    }

                    public final void run() {
                        C0021j.f88a.cancel();
                    }
                }, (long) i);
            }
        }
    }
}
