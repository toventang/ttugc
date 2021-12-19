package com.p2082ss.videoarch.strategy.p4482a.p4483a;

import android.text.TextUtils;
import android.util.ArrayMap;
import com.bytedance.covode.number.Covode;
import com.p2082ss.videoarch.strategy.AbstractC87196a;
import com.p2082ss.videoarch.strategy.AbstractC87199b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.videoarch.strategy.a.a.a */
public class C87197a {

    /* renamed from: a */
    public List<String> f197432a = new ArrayList();

    /* renamed from: b */
    public AbstractC87199b f197433b = null;

    /* renamed from: c */
    public AbstractC87196a f197434c;

    /* renamed from: d */
    public Map<String, Integer> f197435d = new ArrayMap();

    /* renamed from: e */
    public Map<String, JSONObject> f197436e = new ArrayMap();

    /* renamed from: f */
    public Map<String, C87198a> f197437f;

    /* renamed from: g */
    public long f197438g = 300000;

    /* renamed from: h */
    public int f197439h = 50;

    /* renamed from: i */
    private final String f197440i = "quic";

    static {
        Covode.recordClassIndex(103000);
    }

    /* renamed from: a */
    public final void mo141064a() {
        for (String str : this.f197437f.keySet()) {
            C87198a aVar = this.f197437f.get(str);
            if (aVar != null) {
                long j = aVar.f197442b;
                if (j > 0 && System.currentTimeMillis() - j > this.f197438g) {
                    this.f197437f.remove(str);
                }
            }
        }
    }

    public C87197a(AbstractC87199b bVar) {
        if (bVar != null) {
            this.f197433b = bVar;
        }
    }

    /* renamed from: a */
    public final void mo141065a(String str) {
        String optString;
        AbstractC87196a aVar = this.f197434c;
        if (aVar != null) {
            String str2 = (String) aVar.mo16647a("live_stream_strategy_preconnect_protocol", "{}");
            this.f197432a = (List) this.f197434c.mo16647a("live_stream_strategy_preconnect_domains", new ArrayList());
            String str3 = (String) this.f197434c.mo16647a("live_stream_strategy_peconnect_params", "{}");
            this.f197438g = ((Long) this.f197434c.mo16647a("live_stream_strategy_peconnect_result_ttl", 300000L)).longValue();
            this.f197439h = ((Integer) this.f197434c.mo16647a("live_stream_strategy_peconnect_result_capacity", 50)).intValue();
            this.f197437f = new ArrayMap(this.f197439h);
            new StringBuilder("preconnect protocol info: ").append(str2).append(", domains: ").append(this.f197432a).append(", params: ").append(str3).append(", ttl: ").append(this.f197438g).append(", result capacity: ").append(this.f197439h);
            if (str2 != null) {
                try {
                    JSONObject jSONObject = new JSONObject(str2);
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        this.f197435d.put(next, Integer.valueOf(jSONObject.optInt(next)));
                        if (!(str3 == null || (optString = new JSONObject(str3).optString(next)) == null)) {
                            JSONObject jSONObject2 = new JSONObject(optString);
                            if (next.equals("quic") && !TextUtils.isEmpty(str)) {
                                jSONObject2.put("scfg_address", str);
                            }
                            this.f197436e.put(next, jSONObject2);
                        }
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: com.ss.videoarch.strategy.a.a.a$a */
    public class C87198a {

        /* renamed from: a */
        public JSONObject f197441a;

        /* renamed from: b */
        public long f197442b;

        static {
            Covode.recordClassIndex(103001);
        }

        public C87198a(JSONObject jSONObject, long j) {
            this.f197441a = jSONObject;
            this.f197442b = j;
        }
    }
}
