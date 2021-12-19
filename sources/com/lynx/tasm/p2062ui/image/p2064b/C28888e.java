package com.lynx.tasm.p2062ui.image.p2064b;

import android.content.Context;
import android.net.Uri;
import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Map;

/* renamed from: com.lynx.tasm.ui.image.b.e */
public class C28888e {

    /* renamed from: b */
    private static volatile C28888e f68257b;

    /* renamed from: a */
    private Map<String, Integer> f68258a = new C0484a();

    static {
        Covode.recordClassIndex(35011);
    }

    private C28888e() {
    }

    /* renamed from: a */
    public static C28888e m57867a() {
        MethodCollector.m26663i(7278);
        if (f68257b == null) {
            synchronized (C28888e.class) {
                try {
                    if (f68257b == null) {
                        f68257b = new C28888e();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(7278);
                    throw th;
                }
            }
        }
        C28888e eVar = f68257b;
        MethodCollector.m26664o(7278);
        return eVar;
    }

    /* renamed from: b */
    public final Uri mo50102b(Context context, String str) {
        int a = mo50101a(context, str);
        if (a > 0) {
            return new Uri.Builder().scheme("res").path(String.valueOf(a)).build();
        }
        return Uri.EMPTY;
    }

    /* renamed from: a */
    public final int mo50101a(Context context, String str) {
        MethodCollector.m26663i(7421);
        if (str == null || str.isEmpty()) {
            MethodCollector.m26664o(7421);
            return 0;
        }
        String replace = str.toLowerCase().replace("-", "_");
        try {
            int parseInt = Integer.parseInt(replace);
            MethodCollector.m26664o(7421);
            return parseInt;
        } catch (NumberFormatException unused) {
            synchronized (this) {
                if (this.f68258a.containsKey(replace)) {
                    int intValue = this.f68258a.get(replace).intValue();
                    MethodCollector.m26664o(7421);
                    return intValue;
                }
                int identifier = context.getResources().getIdentifier(replace, "drawable", context.getPackageName());
                this.f68258a.put(replace, Integer.valueOf(identifier));
                MethodCollector.m26664o(7421);
                return identifier;
            }
        } catch (Throwable th) {
            MethodCollector.m26664o(7421);
            throw th;
        }
    }
}
