package com.p2082ss.android.ugc.aweme.feed.p2948h;

import android.content.SharedPreferences;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.p2141e.AbstractC29907c;
import com.p2082ss.android.ugc.aweme.framework.p3009d.C51427a;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.feed.h.a */
public class C49610a {

    /* renamed from: b */
    private static final String f114153b = C49610a.class.getSimpleName();

    /* renamed from: c */
    private static final Comparator<C49613a> f114154c = new Comparator<C49613a>() {
        /* class com.p2082ss.android.ugc.aweme.feed.p2948h.C49610a.C496111 */

        static {
            Covode.recordClassIndex(58457);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(C49613a aVar, C49613a aVar2) {
            C49613a aVar3 = aVar;
            C49613a aVar4 = aVar2;
            if (aVar3.f114161b == aVar4.f114161b) {
                return 0;
            }
            if (aVar3.f114161b > aVar4.f114161b) {
                return -1;
            }
            return 1;
        }
    };

    /* renamed from: d */
    private static AbstractC29907c<C49610a> f114155d = new AbstractC29907c<C49610a>() {
        /* class com.p2082ss.android.ugc.aweme.feed.p2948h.C49610a.C496122 */

        static {
            Covode.recordClassIndex(58458);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.p2082ss.android.p2141e.AbstractC29907c
        /* renamed from: a */
        public final /* synthetic */ C49610a mo52218a() {
            return new C49610a((byte) 0);
        }
    };

    /* renamed from: a */
    public List<C49613a> f114156a;

    /* renamed from: e */
    private final SharedPreferences f114157e;

    /* renamed from: f */
    private long f114158f;

    /* renamed from: g */
    private long f114159g;

    /* renamed from: com.ss.android.ugc.aweme.feed.h.a$a */
    public static class C49613a {

        /* renamed from: a */
        public String f114160a;

        /* renamed from: b */
        long f114161b;

        static {
            Covode.recordClassIndex(58459);
        }

        C49613a() {
        }

        public final int hashCode() {
            return super.hashCode();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final JSONObject mo81406a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("aid", this.f114160a);
                jSONObject.put("time", this.f114161b);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return jSONObject;
        }

        /* synthetic */ C49613a(byte b) {
            this();
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C49613a) || !C13627m.m24499a(((C49613a) obj).f114160a, this.f114160a)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    public static C49610a m93030a() {
        return f114155d.mo52219b();
    }

    static {
        Covode.recordClassIndex(58456);
    }

    /* renamed from: c */
    private void m93031c() {
        JSONArray jSONArray = new JSONArray();
        for (C49613a aVar : this.f114156a) {
            jSONArray.put(aVar.mo81406a());
        }
        this.f114157e.edit().putString("push_list", jSONArray.toString()).apply();
    }

    private C49610a() {
        this.f114156a = new ArrayList();
        this.f114158f = 604800000;
        SharedPreferences a = C34822d.m71158a(C51427a.f118503a, "app_push_info", 0);
        this.f114157e = a;
        String string = a.getString("push_list", "[]");
        this.f114156a.clear();
        try {
            JSONArray jSONArray = new JSONArray(string);
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        C49613a aVar = new C49613a();
                        aVar.f114160a = optJSONObject.optString("aid", "");
                        aVar.f114161b = optJSONObject.optLong("time", 0);
                        if (!this.f114156a.contains(aVar)) {
                            this.f114156a.add(aVar);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public final boolean mo81404b() {
        C49613a aVar;
        long currentTimeMillis = System.currentTimeMillis();
        boolean z = false;
        if (currentTimeMillis - this.f114159g <= 5000) {
            return false;
        }
        this.f114159g = currentTimeMillis;
        Collections.sort(this.f114156a, f114154c);
        int size = this.f114156a.size() - 1;
        while (size >= 0) {
            do {
                aVar = this.f114156a.get(size);
            } while (aVar == null);
            if (currentTimeMillis <= this.f114158f + aVar.f114161b) {
                break;
            }
            this.f114156a.remove(size);
            size--;
            z = true;
        }
        if (z) {
            m93031c();
        }
        return z;
    }

    /* synthetic */ C49610a(byte b) {
        this();
    }

    /* renamed from: a */
    public final void mo81403a(String str, long j) {
        MethodCollector.m26663i(5531);
        if (C13627m.m24498a(str)) {
            MethodCollector.m26664o(5531);
            return;
        }
        C49613a aVar = new C49613a((byte) 0);
        aVar.f114161b = j;
        aVar.f114160a = str;
        synchronized (this) {
            try {
                if (!this.f114156a.contains(aVar)) {
                    this.f114156a.add(aVar);
                }
                if (!mo81404b()) {
                    m93031c();
                }
            } finally {
                MethodCollector.m26664o(5531);
            }
        }
    }
}
