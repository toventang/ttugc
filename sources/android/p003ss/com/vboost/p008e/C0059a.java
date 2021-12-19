package android.p003ss.com.vboost.p008e;

import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: android.ss.com.vboost.e.a */
public final class C0059a {

    /* renamed from: a */
    public static AbstractC0060a f218a;

    /* renamed from: b */
    private static boolean f219b;

    /* renamed from: android.ss.com.vboost.e.a$a */
    public interface AbstractC0060a {
        static {
            Covode.recordClassIndex(63);
        }

        /* renamed from: a */
        void mo43a(String str, JSONObject jSONObject);
    }

    static {
        Covode.recordClassIndex(62);
    }

    /* renamed from: a */
    public static boolean m96a() {
        if (f218a != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m95a(String str, JSONObject jSONObject) {
        if (f218a != null) {
            try {
                jSONObject.put("sdkVersion", "2.0.0.8.d-rc.46-mt");
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (f219b) {
                f218a.mo43a(str, jSONObject);
            }
            f218a.mo43a(str, jSONObject);
        }
    }
}
