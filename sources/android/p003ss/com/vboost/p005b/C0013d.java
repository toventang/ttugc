package android.p003ss.com.vboost.p005b;

import android.content.Context;
import android.p003ss.com.vboost.p005b.C0015e;
import android.p003ss.com.vboost.p008e.C0059a;
import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: android.ss.com.vboost.b.d */
public class C0013d {

    /* renamed from: a */
    public static AbstractC0012c f47a;

    /* renamed from: b */
    private static final String f48b = C0013d.class.getSimpleName();

    /* renamed from: a */
    public static void m27a() {
        f47a.mo13b();
    }

    static {
        Covode.recordClassIndex(16);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.ss.com.vboost.b.d$1 */
    public static /* synthetic */ class C00141 {

        /* renamed from: a */
        static final /* synthetic */ int[] f49a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        static {
            /*
                r0 = 17
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                android.ss.com.vboost.b.e$a[] r0 = android.p003ss.com.vboost.p005b.C0015e.EnumC0016a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                android.p003ss.com.vboost.p005b.C0013d.C00141.f49a = r2
                android.ss.com.vboost.b.e$a r0 = android.p003ss.com.vboost.p005b.C0015e.EnumC0016a.MTK     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = android.p003ss.com.vboost.p005b.C0013d.C00141.f49a     // Catch:{ NoSuchFieldError -> 0x0022 }
                android.ss.com.vboost.b.e$a r0 = android.p003ss.com.vboost.p005b.C0015e.EnumC0016a.QCOM     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = android.p003ss.com.vboost.p005b.C0013d.C00141.f49a     // Catch:{ NoSuchFieldError -> 0x002d }
                android.ss.com.vboost.b.e$a r0 = android.p003ss.com.vboost.p005b.C0015e.EnumC0016a.CHRY     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.p003ss.com.vboost.p005b.C0013d.C00141.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static boolean m28a(Context context) {
        C0015e.EnumC0016a a = C0015e.m31a();
        if (C0059a.m96a()) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("vboostPlatform", a.name());
                C0059a.m95a("vboost_event_launch", jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        int i = C00141.f49a[a.ordinal()];
        if (i == 1) {
            f47a = new C0017f();
        } else if (i == 2) {
            f47a = new C0020i();
        } else if (i == 3) {
            f47a = new C0011b();
        }
        AbstractC0012c cVar = f47a;
        if (cVar == null || !cVar.mo12a(context)) {
            return false;
        }
        if (C0059a.m96a()) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("vboostPlatform", a.name());
                C0059a.m95a("vboost_event_active", jSONObject2);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        return true;
    }
}
