package p4646ms.p4647bd.p4648o;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;

/* renamed from: ms.bd.o.e0 */
public class C89879e0 {

    /* renamed from: b */
    protected String f203767b = "";

    /* renamed from: c */
    protected String f203768c = "";

    /* renamed from: d */
    protected String f203769d = "";

    /* renamed from: e */
    protected String f203770e = "";

    /* renamed from: f */
    protected String f203771f = "";

    /* renamed from: g */
    protected String f203772g = "";

    /* renamed from: h */
    protected String f203773h = "";

    /* renamed from: i */
    protected String f203774i = "";

    /* renamed from: j */
    protected String f203775j = "";

    /* renamed from: k */
    protected int f203776k = -1;

    /* renamed from: l */
    public int f203777l = -1;

    /* renamed from: m */
    public int f203778m = 0;

    /* renamed from: n */
    protected Map<String, String> f203779n = new HashMap();

    /* renamed from: o */
    protected Map<String, String> f203780o = new HashMap();

    /* renamed from: ms.bd.o.e0$a */
    public static abstract class AbstractC89880a<T extends AbstractC89881b> extends C89879e0 implements AbstractC89881b {
        static {
            Covode.recordClassIndex(105977);
        }

        public AbstractC89880a(String str, String str2) {
            this.f203767b = str;
            this.f203775j = str2;
            this.f203778m = 5;
            if (TextUtils.isEmpty(str) || "0".equals(str) || TextUtils.isEmpty(str2)) {
                throw new IllegalArgumentException("appID or license must be set.");
            }
        }

        /* renamed from: a */
        public final T mo144451a(String str) {
            this.f203768c = str;
            return this;
        }

        /* renamed from: b */
        public final T mo144452b() {
            this.f203776k = 0;
            return this;
        }

        /* renamed from: c */
        public final C89879e0 mo144453c() {
            if (this.f203776k != -1) {
                return this;
            }
            throw new IllegalArgumentException("MSConfig init error");
        }
    }

    /* renamed from: ms.bd.o.e0$b */
    public interface AbstractC89881b {
        static {
            Covode.recordClassIndex(105978);
        }
    }

    static {
        Covode.recordClassIndex(105976);
    }

    /* renamed from: a */
    private static String mo144451a(String str) {
        return str == null ? "" : str.trim();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo144450a() {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(mo144451a(this.f203767b));
        jSONArray.put(mo144451a(this.f203774i));
        jSONArray.put(mo144451a(this.f203773h));
        jSONArray.put(mo144451a(this.f203775j));
        jSONArray.put(mo144451a(this.f203768c));
        jSONArray.put(mo144451a(this.f203769d));
        jSONArray.put(mo144451a(this.f203770e));
        jSONArray.put(mo144451a(this.f203771f));
        jSONArray.put(mo144451a(this.f203772g));
        jSONArray.put(String.valueOf(this.f203776k));
        jSONArray.put(String.valueOf(this.f203777l));
        jSONArray.put(String.valueOf(this.f203778m));
        JSONArray jSONArray2 = new JSONArray();
        for (Map.Entry<String, String> entry : this.f203779n.entrySet()) {
            if (!TextUtils.isEmpty(entry.getKey())) {
                jSONArray2.put(mo144451a(entry.getKey()));
                jSONArray2.put(mo144451a(entry.getValue()));
            }
        }
        jSONArray.put(jSONArray2);
        JSONArray jSONArray3 = new JSONArray();
        for (Map.Entry<String, String> entry2 : this.f203780o.entrySet()) {
            if (!TextUtils.isEmpty(entry2.getKey())) {
                jSONArray3.put(mo144451a(entry2.getKey()));
                jSONArray3.put(mo144451a(entry2.getValue()));
            }
        }
        jSONArray.put(jSONArray3);
        return jSONArray.toString();
    }
}
