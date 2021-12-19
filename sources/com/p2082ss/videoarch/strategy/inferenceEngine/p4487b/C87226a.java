package com.p2082ss.videoarch.strategy.inferenceEngine.p4487b;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.p2082ss.videoarch.strategy.inferenceEngine.p4487b.p4488a.C87228a;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.videoarch.strategy.inferenceEngine.b.a */
public class C87226a {

    /* renamed from: a */
    public static int f197556a = 600;

    /* renamed from: b */
    public static int f197557b = 1000;

    /* renamed from: c */
    public static int f197558c = 20;

    /* renamed from: d */
    public static double f197559d = 0.1d;

    /* renamed from: e */
    int f197560e;

    /* renamed from: f */
    public int f197561f = f197556a;

    /* renamed from: g */
    public int f197562g = f197557b;

    /* renamed from: h */
    public double f197563h = f197559d;

    /* renamed from: i */
    public int f197564i = 1000;

    /* renamed from: j */
    public int[] f197565j = {8, 7, 6, 5, 4, 3, 2};

    /* renamed from: k */
    public ConcurrentHashMap<Integer, Pair> f197566k = new ConcurrentHashMap<>();

    /* renamed from: l */
    public String f197567l = null;

    /* renamed from: m */
    public Map<String, C87228a> f197568m = new LinkedHashMap<String, C87228a>() {
        /* class com.p2082ss.videoarch.strategy.inferenceEngine.p4487b.C87226a.C872271 */

        static {
            Covode.recordClassIndex(103030);
        }

        /* access modifiers changed from: protected */
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, C87228a> entry) {
            if (size() > 20) {
                return true;
            }
            return false;
        }
    };

    static {
        Covode.recordClassIndex(103029);
    }

    /* renamed from: a */
    public static JSONObject m151264a(JSONObject jSONObject, String str) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject optJSONObject;
        JSONObject jSONObject4 = null;
        if (jSONObject == null) {
            return null;
        }
        if (!jSONObject.has("LowLatencyFlvDefaultStrategy") || (optJSONObject = jSONObject.optJSONObject("LowLatencyFlvDefaultStrategy")) == null || !optJSONObject.has("netEffectiveConnectionTypeStrategy")) {
            jSONObject2 = null;
        } else {
            jSONObject2 = optJSONObject.optJSONObject("netEffectiveConnectionTypeStrategy");
        }
        if (str.length() == 0) {
            return null;
        }
        try {
            jSONObject3 = new JSONObject(str);
        } catch (JSONException e) {
            e.printStackTrace();
            jSONObject3 = null;
        }
        if (jSONObject3 == null) {
            return null;
        }
        int optInt = jSONObject3.optInt("net_effective_connection_type");
        if (optInt == 1) {
            optInt = 7;
        }
        if (jSONObject2 == null || !jSONObject2.has(String.valueOf(optInt))) {
            return null;
        }
        try {
            jSONObject4 = jSONObject2.getJSONObject(String.valueOf(optInt));
            return jSONObject4;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return jSONObject4;
        }
    }

    /* renamed from: a */
    public final <T> T mo141100a(T t, String str, String str2) {
        JSONObject jSONObject;
        int i;
        double d;
        String str3;
        C87228a aVar;
        if (str2.length() == 0) {
            return t;
        }
        JSONObject jSONObject2 = null;
        try {
            jSONObject = new JSONObject(str2);
        } catch (JSONException e) {
            e.printStackTrace();
            jSONObject = null;
        }
        if (jSONObject == null) {
            return t;
        }
        int optInt = jSONObject.optInt("net_effective_connection_type");
        if (optInt == 1) {
            optInt = 7;
        }
        Pair pair = this.f197566k.get(Integer.valueOf(optInt));
        if (pair == null) {
            return t;
        }
        try {
            jSONObject2 = new JSONObject(str);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        if (jSONObject2 == null) {
            return t;
        }
        int i2 = 0;
        if (jSONObject2.has("retryTotalCount")) {
            i = jSONObject2.optInt("retryTotalCount");
        } else {
            i = 0;
        }
        if (jSONObject2.has("stallTotalCount")) {
            i2 = jSONObject2.optInt("stallTotalCount");
        }
        if (i != this.f197560e || (str3 = this.f197567l) == null || (aVar = this.f197568m.get(str3)) == null) {
            d = 1.0d;
        } else {
            i2 = aVar.f197571b;
            i = aVar.f197572c;
            double d2 = this.f197563h;
            double currentTimeMillis = (double) (System.currentTimeMillis() - aVar.f197573d);
            Double.isNaN(currentTimeMillis);
            double d3 = d2 * currentTimeMillis;
            double d4 = (double) this.f197564i;
            Double.isNaN(d4);
            d = 1.0d / Math.exp(d3 / d4);
        }
        double d5 = (double) i;
        Double.isNaN(d5);
        double d6 = (double) i2;
        Double.isNaN(d6);
        int i3 = (int) ((d5 * 0.41935483870967744d) + (d6 * 0.5806451612903226d));
        int intValue = ((Integer) pair.second).intValue() - ((Integer) pair.first).intValue();
        if (i3 < f197558c) {
            double d7 = (double) intValue;
            Double.isNaN(d7);
            intValue = (int) (((1.0d / (Math.exp((double) (-i3)) + 1.0d)) - 0.5d) * 2.0d * d7);
        }
        double d8 = (double) intValue;
        Double.isNaN(d8);
        return (T) Long.valueOf((long) (((Integer) pair.first).intValue() + ((int) (d * d8))));
    }
}
