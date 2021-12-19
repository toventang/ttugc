package com.p2082ss.optimizer.live.sdk.dns.p4403b;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.optimizer.live.sdk.dns.AbstractC86156d;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.optimizer.live.sdk.dns.b.b */
public class C86153b {

    /* renamed from: a */
    public static int f192126a = 600;

    /* renamed from: b */
    public static int f192127b = 1000;

    /* renamed from: c */
    public static int f192128c = 20;

    /* renamed from: d */
    public static double f192129d = 0.1d;

    /* renamed from: n */
    private static C86153b f192130n;

    /* renamed from: e */
    public AbstractC86156d f192131e;

    /* renamed from: f */
    public String f192132f;

    /* renamed from: g */
    public Map<String, C86152a> f192133g = new LinkedHashMap<String, C86152a>() {
        /* class com.p2082ss.optimizer.live.sdk.dns.p4403b.C86153b.C861541 */

        static {
            Covode.recordClassIndex(101296);
        }

        /* access modifiers changed from: protected */
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, C86152a> entry) {
            if (size() > 20) {
                return true;
            }
            return false;
        }
    };

    /* renamed from: h */
    public int[] f192134h = {8, 7, 6, 5, 4, 3, 2};

    /* renamed from: i */
    public ConcurrentHashMap<Integer, Pair> f192135i = new ConcurrentHashMap<>();

    /* renamed from: j */
    public int f192136j = f192126a;

    /* renamed from: k */
    public int f192137k = f192127b;

    /* renamed from: l */
    public double f192138l = f192129d;

    /* renamed from: m */
    public int f192139m = 1000;

    static {
        Covode.recordClassIndex(101295);
    }

    /* renamed from: a */
    public static C86153b m147958a() {
        MethodCollector.m26663i(2895);
        if (f192130n == null) {
            synchronized (C86153b.class) {
                try {
                    if (f192130n == null) {
                        f192130n = new C86153b();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(2895);
                    throw th;
                }
            }
        }
        C86153b bVar = f192130n;
        MethodCollector.m26664o(2895);
        return bVar;
    }

    /* renamed from: a */
    public final JSONObject mo136433a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        AbstractC86156d dVar = this.f192131e;
        JSONObject jSONObject3 = null;
        if (dVar == null) {
            return null;
        }
        String str = (String) dVar.mo16644a("TTNet_NQE_INFO", "");
        if (str.length() == 0) {
            return null;
        }
        try {
            jSONObject2 = new JSONObject(str);
        } catch (JSONException e) {
            e.printStackTrace();
            jSONObject2 = null;
        }
        if (jSONObject2 == null) {
            return null;
        }
        int optInt = jSONObject2.optInt("net_effective_connection_type");
        if (optInt == 1) {
            optInt = 7;
        }
        if (jSONObject == null || !jSONObject.has(String.valueOf(optInt))) {
            return null;
        }
        try {
            jSONObject3 = jSONObject.getJSONObject(String.valueOf(optInt));
            return jSONObject3;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return jSONObject3;
        }
    }

    /* renamed from: a */
    public final long mo136432a(long j, int i, int i2) {
        double d;
        String str;
        C86152a aVar;
        AbstractC86156d dVar = this.f192131e;
        if (dVar == null) {
            return j;
        }
        String str2 = (String) dVar.mo16644a("TTNet_NQE_INFO", "");
        if (str2.length() == 0) {
            return j;
        }
        try {
            int optInt = new JSONObject(str2).optInt("net_effective_connection_type");
            if (optInt == 1) {
                optInt = 7;
            }
            Pair pair = this.f192135i.get(Integer.valueOf(optInt));
            if (pair == null) {
                return j;
            }
            if (i2 != 0 || (str = this.f192132f) == null || (aVar = this.f192133g.get(str)) == null) {
                d = 1.0d;
            } else {
                i = aVar.f192123b;
                i2 = aVar.f192124c;
                double d2 = this.f192138l;
                double currentTimeMillis = (double) (System.currentTimeMillis() - aVar.f192125d);
                Double.isNaN(currentTimeMillis);
                double d3 = d2 * currentTimeMillis;
                double d4 = (double) this.f192139m;
                Double.isNaN(d4);
                d = 1.0d / Math.exp(d3 / d4);
            }
            double d5 = (double) i2;
            Double.isNaN(d5);
            double d6 = (double) i;
            Double.isNaN(d6);
            int i3 = (int) ((d5 * 0.41935483870967744d) + (d6 * 0.5806451612903226d));
            int intValue = ((Integer) pair.second).intValue() - ((Integer) pair.first).intValue();
            if (i3 < f192128c) {
                double d7 = (double) intValue;
                Double.isNaN(d7);
                intValue = (int) (((1.0d / (Math.exp((double) (-i3)) + 1.0d)) - 0.5d) * 2.0d * d7);
            }
            double d8 = (double) intValue;
            Double.isNaN(d8);
            return (long) (((Integer) pair.first).intValue() + ((int) (d * d8)));
        } catch (JSONException e) {
            e.printStackTrace();
            return j;
        }
    }
}
