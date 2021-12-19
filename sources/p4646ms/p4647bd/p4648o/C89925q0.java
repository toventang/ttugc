package p4646ms.p4647bd.p4648o;

import android.content.ClipboardManager;
import android.content.Context;
import android.net.DhcpInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.lang.reflect.Field;
import org.json.JSONArray;
import p4646ms.p4647bd.p4648o.C89868b;

/* access modifiers changed from: package-private */
/* renamed from: ms.bd.o.q0 */
public final class C89925q0 extends C89868b.AbstractC89869a {
    static {
        Covode.recordClassIndex(106022);
    }

    C89925q0() {
    }

    /* renamed from: a */
    private static Object m156035a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(1202);
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
                    MethodCollector.m26664o(1202);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    @Override // p4646ms.p4647bd.p4648o.C89868b.AbstractC89869a
    /* renamed from: a */
    public final Object mo35029a(long j, String str, Object obj) {
        MethodCollector.m26663i(1192);
        JSONArray jSONArray = new JSONArray();
        Context applicationContext = C89865a.f203764a.f203765b.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        try {
            DhcpInfo dhcpInfo = ((WifiManager) m156035a(applicationContext, (String) C89889h.m155966a(16777217, 0, 0, "dbd541", new byte[]{98, 105, 17, 72}))).getDhcpInfo();
            jSONArray.put((dhcpInfo.dns1 & 255) + ((String) C89889h.m155966a(16777217, 0, 0, "398184", new byte[]{108})) + ((dhcpInfo.dns1 >> 8) & 255) + ((String) C89889h.m155966a(16777217, 0, 0, "e57eb4", new byte[]{58})) + ((dhcpInfo.dns1 >> 16) & 255) + ((String) C89889h.m155966a(16777217, 0, 0, "81e19a", new byte[]{103})) + ((dhcpInfo.dns1 >> 24) & 255));
            jSONArray.put((dhcpInfo.dns2 & 255) + ((String) C89889h.m155966a(16777217, 0, 0, "a08bbf", new byte[]{62})) + ((dhcpInfo.dns2 >> 8) & 255) + ((String) C89889h.m155966a(16777217, 0, 0, "fdb0af", new byte[]{57})) + ((dhcpInfo.dns2 >> 16) & 255) + ((String) C89889h.m155966a(16777217, 0, 0, "980f85", new byte[]{102})) + ((dhcpInfo.dns2 >> 24) & 255));
        } catch (Throwable unused) {
            C89889h.m155966a(16777217, 0, 0, "a37fa5", new byte[]{125, 56, 76, 45, 90, 46});
        }
        String jSONArray2 = jSONArray.toString();
        MethodCollector.m26664o(1192);
        return jSONArray2;
    }
}
