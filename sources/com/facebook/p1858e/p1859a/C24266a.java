package com.facebook.p1858e.p1859a;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.facebook.C24872m;
import com.facebook.internal.C24693ad;
import com.facebook.internal.C24699ae;
import com.facebook.internal.C24768q;
import com.facebook.internal.C24770r;
import com.facebook.internal.EnumC24692ac;
import com.facebook.internal.p1894a.p1896b.C24677a;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;
import java.util.EnumMap;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.e.a.a */
public class C24266a {

    /* renamed from: a */
    private static final String f57526a = C24266a.class.getCanonicalName();

    /* renamed from: b */
    private static HashMap<String, NsdManager.RegistrationListener> f57527b = new HashMap<>();

    static {
        Covode.recordClassIndex(28398);
    }

    /* renamed from: a */
    public static String m46115a() {
        if (C24677a.m47209a(C24266a.class)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("device", Build.DEVICE);
                jSONObject.put("model", Build.MODEL);
            } catch (JSONException unused) {
            }
            return jSONObject.toString();
        } catch (Throwable th) {
            C24677a.m47208a(th, C24266a.class);
            return null;
        }
    }

    /* renamed from: b */
    public static boolean m46118b() {
        if (C24677a.m47209a(C24266a.class)) {
            return false;
        }
        try {
            C24699ae.m47299a();
            C24768q a = C24770r.m47425a(C24872m.f59041a);
            int i = Build.VERSION.SDK_INT;
            if (a == null || !a.f58757e.contains(EnumC24692ac.Enabled)) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            C24677a.m47208a(th, C24266a.class);
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m46116a(String str) {
        if (C24677a.m47209a(C24266a.class)) {
            return false;
        }
        try {
            if (m46118b()) {
                return m46120d(str);
            }
            return false;
        } catch (Throwable th) {
            C24677a.m47208a(th, C24266a.class);
            return false;
        }
    }

    /* renamed from: c */
    public static void m46119c(String str) {
        if (!C24677a.m47209a(C24266a.class)) {
            try {
                if (!C24677a.m47209a(C24266a.class)) {
                    try {
                        NsdManager.RegistrationListener registrationListener = f57527b.get(str);
                        if (registrationListener != null) {
                            C24699ae.m47299a();
                            try {
                                ((NsdManager) m46114a(C24872m.f59047g, "servicediscovery")).unregisterService(registrationListener);
                            } catch (IllegalArgumentException e) {
                                C24693ad.m47255a(f57526a, (Exception) e);
                            }
                            f57527b.remove(str);
                        }
                    } catch (Throwable th) {
                        C24677a.m47208a(th, C24266a.class);
                    }
                }
            } catch (Throwable th2) {
                C24677a.m47208a(th2, C24266a.class);
            }
        }
    }

    /* renamed from: b */
    public static Bitmap m46117b(String str) {
        Bitmap bitmap;
        int i;
        MethodCollector.m26663i(5557);
        if (C24677a.m47209a(C24266a.class)) {
            MethodCollector.m26664o(5557);
            return null;
        }
        try {
            EnumMap enumMap = new EnumMap(EncodeHintType.class);
            enumMap.put((Object) EncodeHintType.MARGIN, (Object) 2);
            try {
                BitMatrix encode = new MultiFormatWriter().encode(str, BarcodeFormat.QR_CODE, 200, 200, enumMap);
                int height = encode.getHeight();
                int width = encode.getWidth();
                int[] iArr = new int[(height * width)];
                for (int i2 = 0; i2 < height; i2++) {
                    int i3 = i2 * width;
                    for (int i4 = 0; i4 < width; i4++) {
                        int i5 = i3 + i4;
                        if (encode.get(i4, i2)) {
                            i = -16777216;
                        } else {
                            i = -1;
                        }
                        iArr[i5] = i;
                    }
                }
                bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                try {
                    bitmap.setPixels(iArr, 0, width, 0, 0, width, height);
                } catch (WriterException unused) {
                }
            } catch (WriterException unused2) {
                bitmap = null;
            }
            MethodCollector.m26664o(5557);
            return bitmap;
        } catch (Throwable th) {
            C24677a.m47208a(th, C24266a.class);
            MethodCollector.m26664o(5557);
            return null;
        }
    }

    /* renamed from: d */
    private static boolean m46120d(final String str) {
        if (C24677a.m47209a(C24266a.class)) {
            return false;
        }
        try {
            if (f57527b.containsKey(str)) {
                return true;
            }
            final String a = C1764a.m5928a("%s_%s_%s", new Object[]{"fbsdk", C1764a.m5928a("%s-%s", new Object[]{"android", "9.0.0".replace('.', '|')}), str});
            NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
            nsdServiceInfo.setServiceType("_fb._tcp.");
            nsdServiceInfo.setServiceName(a);
            nsdServiceInfo.setPort(80);
            C24699ae.m47299a();
            C242671 r1 = new NsdManager.RegistrationListener() {
                /* class com.facebook.p1858e.p1859a.C24266a.C242671 */

                static {
                    Covode.recordClassIndex(28399);
                }

                public final void onServiceUnregistered(NsdServiceInfo nsdServiceInfo) {
                }

                public final void onUnregistrationFailed(NsdServiceInfo nsdServiceInfo, int i) {
                }

                public final void onServiceRegistered(NsdServiceInfo nsdServiceInfo) {
                    if (!a.equals(nsdServiceInfo.getServiceName())) {
                        C24266a.m46119c(str);
                    }
                }

                public final void onRegistrationFailed(NsdServiceInfo nsdServiceInfo, int i) {
                    C24266a.m46119c(str);
                }
            };
            f57527b.put(str, r1);
            ((NsdManager) m46114a(C24872m.f59047g, "servicediscovery")).registerService(nsdServiceInfo, 1, r1);
            return true;
        } catch (Throwable th) {
            C24677a.m47208a(th, C24266a.class);
            return false;
        }
    }

    /* renamed from: a */
    private static Object m46114a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(5858);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(5858);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
