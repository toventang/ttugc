package p4646ms.p4647bd.p4648o;

import android.content.ClipboardManager;
import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.C15346a;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p4646ms.p4647bd.p4648o.C89868b;

/* access modifiers changed from: package-private */
/* renamed from: ms.bd.o.e1 */
public final class C89882e1 extends C89868b.AbstractC89869a {
    static {
        Covode.recordClassIndex(105979);
    }

    C89882e1() {
    }

    /* renamed from: a */
    private static Object m155958a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(827);
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
                    MethodCollector.m26664o(827);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* access modifiers changed from: protected */
    @Override // p4646ms.p4647bd.p4648o.C89868b.AbstractC89869a
    /* renamed from: a */
    public final Object mo35029a(long j, String str, Object obj) {
        String str2;
        Object trim;
        Object invoke;
        MethodCollector.m26663i(635);
        try {
            Context applicationContext = C89865a.f203764a.f203765b.getApplicationContext();
            if (C58003a.f132201c) {
                if (applicationContext == null) {
                    applicationContext = C58003a.f132199a;
                }
            }
            WifiInfo connectionInfo = ((WifiManager) m155958a(applicationContext, (String) C89889h.m155966a(16777217, 0, 0, "6fdb41", new byte[]{48, 109, 17, 31}))).getConnectionInfo();
            Method declaredMethod = connectionInfo.getClass().getDeclaredMethod(new String(C89873c0.m155948a((String) C89889h.m155966a(16777217, 0, 0, "67166b", new byte[]{113, 98, 20, 23, 94, 33, 97, 79, 55, 54, 115, 100, 20, 22, 95, 33, 98, 68, 54, 51, 112, 102, 21, 17}))), new Class[0]);
            declaredMethod.setAccessible(true);
            Object[] objArr = new Object[0];
            Pair<Boolean, Object> a = C15346a.m28238a(declaredMethod, new Object[]{connectionInfo, objArr}, 110000, "java.lang.Object", true, "ms_bd_o_e1_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            if (((Boolean) a.first).booleanValue()) {
                invoke = a.second;
            } else {
                invoke = declaredMethod.invoke(connectionInfo, objArr);
                C15346a.m28242a(invoke, declaredMethod, new Object[]{connectionInfo, objArr}, "ms_bd_o_e1_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            }
            str2 = Integer.toString(((Integer) invoke).intValue());
        } catch (Throwable unused) {
            str2 = null;
        }
        if (TextUtils.isEmpty(str2)) {
            trim = C89889h.m155966a(16777217, 0, 0, "3813bd", new byte[]{114});
        } else {
            trim = str2.trim();
        }
        MethodCollector.m26664o(635);
        return trim;
    }
}
