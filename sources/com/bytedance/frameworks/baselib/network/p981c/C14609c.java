package com.bytedance.frameworks.baselib.network.p981c;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.p995g.C14758h;
import com.bytedance.frameworks.baselib.network.http.p995g.C14759i;
import com.bytedance.retrofit2.client.Request;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.frameworks.baselib.network.c.c */
public class C14609c {

    /* renamed from: c */
    private static volatile C14609c f35335c;

    /* renamed from: f */
    private static final String f35336f = C14609c.class.getSimpleName();

    /* renamed from: a */
    public volatile boolean f35337a;

    /* renamed from: b */
    public List<AbstractC14608b> f35338b = new CopyOnWriteArrayList();

    /* renamed from: d */
    private volatile String f35339d;

    /* renamed from: e */
    private List<String> f35340e = new CopyOnWriteArrayList();

    static {
        Covode.recordClassIndex(16700);
    }

    private C14609c() {
    }

    /* renamed from: a */
    public static C14609c m26706a() {
        MethodCollector.m26663i(10216);
        if (f35335c == null) {
            synchronized (C14609c.class) {
                try {
                    if (f35335c == null) {
                        f35335c = new C14609c();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(10216);
                    throw th;
                }
            }
        }
        C14609c cVar = f35335c;
        MethodCollector.m26664o(10216);
        return cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.frameworks.baselib.network.c.c$a */
    public class C14610a implements Comparator<AbstractC14608b> {
        static {
            Covode.recordClassIndex(16701);
        }

        C14610a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(AbstractC14608b bVar, AbstractC14608b bVar2) {
            return bVar.f35329a - bVar2.f35329a;
        }
    }

    /* renamed from: a */
    public final void mo23495a(String str) {
        if (this.f35337a && !TextUtils.isEmpty(str)) {
            try {
                m26709c(str);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public final void mo23496b(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f35340e.clear();
            try {
                JSONArray jSONArray = new JSONArray(str);
                for (int i = 0; i < jSONArray.length(); i++) {
                    this.f35340e.add(jSONArray.getString(i));
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    private static JSONArray m26707a(List<C14607a> list) {
        long j;
        JSONArray jSONArray = new JSONArray();
        for (C14607a aVar : list) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("hit", aVar.f35324a);
                jSONObject.put("priority", aVar.f35325b);
                if (aVar.f35326c < 0 || aVar.f35327d < 0 || aVar.f35326c > aVar.f35327d) {
                    j = -1;
                } else {
                    j = aVar.f35327d - aVar.f35326c;
                }
                jSONObject.put("consume", j);
                jSONArray.put(jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONArray;
    }

    /* renamed from: c */
    private synchronized void m26709c(String str) {
        MethodCollector.m26663i(10374);
        if (TextUtils.isEmpty(this.f35339d) || !this.f35339d.equals(str)) {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String string = jSONObject.getString("action");
                int i2 = jSONObject.getInt("act_priority");
                if (i2 >= 0) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("param");
                    int optInt = jSONObject.optInt("set_req_priority", i2);
                    if (optInt == -1) {
                        optInt = Integer.MAX_VALUE;
                    }
                    AbstractC14608b a = AbstractC14608b.m26698a(string, i2, optInt, jSONObject2);
                    if (a != null) {
                        arrayList.add(a);
                    }
                }
            }
            Collections.sort(arrayList, new C14610a());
            this.f35338b.clear();
            this.f35338b.addAll(arrayList);
            this.f35339d = str;
            MethodCollector.m26664o(10374);
            return;
        }
        MethodCollector.m26664o(10374);
    }

    /* renamed from: a */
    public final Request mo23494a(Request request) {
        List<String> value;
        if (!this.f35337a) {
            return null;
        }
        String url = request.getUrl();
        if (TextUtils.isEmpty(url)) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Pair<String, String> b = C14759i.m27070b(url, linkedHashMap);
            if (linkedHashMap.isEmpty() || !m26708a(request, linkedHashMap)) {
                return null;
            }
            C14758h hVar = new C14758h(((String) b.first) + ((String) b.second));
            if (!linkedHashMap.isEmpty()) {
                for (Map.Entry<String, List<String>> entry : linkedHashMap.entrySet()) {
                    if (!(entry == null || entry.getKey() == null || (value = entry.getValue()) == null || value.isEmpty())) {
                        for (String str : value) {
                            hVar.mo23779a(entry.getKey(), str);
                        }
                    }
                }
            }
            Request.C22024a newBuilder = request.newBuilder();
            newBuilder.mo35838a(hVar.mo23776a());
            return newBuilder.mo35840a();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    private boolean m26708a(Request request, Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        request.setQueryFilterPriority(0);
        for (AbstractC14608b bVar : this.f35338b) {
            if (bVar.mo23492a(request, map, arrayList)) {
                z = true;
            }
        }
        if (request.getMetrics() != null) {
            request.getMetrics().f52172O = m26707a(arrayList);
        }
        return z;
    }
}
