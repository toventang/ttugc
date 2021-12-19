package p4646ms.p4647bd.p4648o;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ms.bd.o.y1 */
public class C89956y1 {

    /* renamed from: a */
    private static volatile C89956y1 f203839a;

    /* renamed from: b */
    private int f203840b = 0;

    /* renamed from: c */
    private Throwable f203841c = null;

    static {
        Covode.recordClassIndex(106053);
    }

    private C89956y1() {
    }

    /* renamed from: a */
    public static List<Method> m156080a(Class cls, String str) {
        ArrayList arrayList = new ArrayList();
        if (cls != null && !TextUtils.isEmpty(str)) {
            Method[] declaredMethods = cls.getDeclaredMethods();
            for (Method method : declaredMethods) {
                if (method != null && method.getName().equals(str)) {
                    arrayList.add(method);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static C89956y1 m156081a() {
        MethodCollector.m26663i(208);
        if (f203839a == null) {
            synchronized (C89956y1.class) {
                try {
                    if (f203839a == null) {
                        f203839a = new C89956y1();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(208);
                    throw th;
                }
            }
        }
        C89956y1 y1Var = f203839a;
        MethodCollector.m26664o(208);
        return y1Var;
    }

    /* renamed from: b */
    public final synchronized void mo144481b() {
        MethodCollector.m26663i(210);
        if (this.f203841c == null) {
            int i = this.f203840b;
            this.f203840b = i + 1;
            if (i >= 30) {
                this.f203840b = 0;
                this.f203841c = new Throwable();
                MethodCollector.m26664o(210);
                return;
            }
        }
        MethodCollector.m26664o(210);
    }

    /* renamed from: c */
    public final synchronized Throwable mo144482c() {
        Throwable th;
        MethodCollector.m26663i(211);
        th = this.f203841c;
        MethodCollector.m26664o(211);
        return th;
    }
}
