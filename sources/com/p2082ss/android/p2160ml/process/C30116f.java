package com.p2082ss.android.p2160ml.process;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2160ml.process.p2161a.C30098a;
import com.p2082ss.android.p2160ml.process.p2161a.C30099b;
import com.p2082ss.android.p2160ml.process.p2161a.C30100c;
import com.p2082ss.android.p2160ml.process.p2161a.C30101d;
import com.p2082ss.android.p2160ml.process.p2161a.C30102e;
import com.p2082ss.android.p2160ml.process.p2161a.C30103f;
import com.p2082ss.android.p2160ml.process.p2161a.C30104g;
import com.p2082ss.android.p2160ml.process.p2161a.C30105h;
import com.p2082ss.android.p2160ml.process.p2161a.C30106i;
import com.p2082ss.android.p2160ml.process.p2161a.C30107j;
import com.p2082ss.android.p2160ml.process.p2161a.C30108k;
import com.p2082ss.android.p2160ml.process.p2161a.C30109l;
import com.p2082ss.android.p2160ml.process.p2161a.C30110m;
import com.p2082ss.android.p2160ml.process.p2161a.C30111n;
import java.util.HashMap;

/* renamed from: com.ss.android.ml.process.f */
public final class C30116f {

    /* renamed from: a */
    public static C30116f f71846a = new C30116f();

    /* renamed from: b */
    private HashMap<String, AbstractC30115e> f71847b;

    static {
        Covode.recordClassIndex(36615);
    }

    public C30116f() {
        HashMap<String, AbstractC30115e> hashMap = new HashMap<>();
        this.f71847b = hashMap;
        hashMap.put("log", new C30102e());
        this.f71847b.put("log1p", new C30101d());
        this.f71847b.put("sigmoid", new C30110m());
        this.f71847b.put("div", new C30098a());
        this.f71847b.put("max", new C30103f());
        this.f71847b.put("min", new C30104g());
        this.f71847b.put("normalize", new C30105h());
        this.f71847b.put("standardize", new C30111n());
        this.f71847b.put("predict_regression", new C30109l());
        this.f71847b.put("predict_bin", new C30107j());
        this.f71847b.put("onehotEncode", new C30106i());
        this.f71847b.put("predict_multi", new C30108k());
        this.f71847b.put("embedding", new C30099b());
        this.f71847b.put("embedding_vector", new C30100c());
    }

    /* renamed from: a */
    public final AbstractC30115e mo53498a(String str) {
        return this.f71847b.get(str);
    }
}
