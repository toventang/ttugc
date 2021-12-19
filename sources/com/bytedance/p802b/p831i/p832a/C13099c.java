package com.bytedance.p802b.p831i.p832a;

import android.os.Debug;
import android.text.TextUtils;
import com.bytedance.apm.p789q.C12577c;
import com.bytedance.covode.number.Covode;
import com.bytedance.p802b.p834j.C13104c;
import com.bytedance.p802b.p834j.p838d.AbstractC13106a;
import com.bytedance.p802b.p834j.p839e.AbstractC13111b;
import com.bytedance.p802b.p841k.C13130f;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.b.i.a.c */
public class C13099c implements AbstractC13111b {

    /* renamed from: g */
    private static volatile C13099c f31937g;

    /* renamed from: a */
    private CopyOnWriteArraySet<String> f31938a = new CopyOnWriteArraySet<>();

    /* renamed from: b */
    private ConcurrentHashMap<String, String> f31939b = new ConcurrentHashMap<>();

    /* renamed from: c */
    private long f31940c;

    /* renamed from: d */
    private boolean f31941d;

    /* renamed from: e */
    private long f31942e;

    /* renamed from: f */
    private long f31943f;

    static {
        Covode.recordClassIndex(14935);
    }

    private C13099c() {
    }

    /* renamed from: a */
    public static C13099c m23558a() {
        if (f31937g == null) {
            synchronized (C13099c.class) {
                if (f31937g == null) {
                    f31937g = new C13099c();
                }
            }
        }
        return f31937g;
    }

    /* renamed from: b */
    public final String mo20938b() {
        String a = C13130f.m23607a(this.f31938a.toArray(), "#");
        if (!TextUtils.isEmpty(a)) {
            return a;
        }
        AbstractC13106a aVar = (AbstractC13106a) C13104c.m23566a(AbstractC13106a.class);
        if (aVar != null) {
            return aVar.mo20902b();
        }
        return "";
    }

    /* renamed from: c */
    public final JSONObject mo20939c() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, String> entry : this.f31939b.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: d */
    public final JSONObject mo20940d() {
        boolean z;
        try {
            JSONObject jSONObject = new JSONObject();
            this.f31940c = Debug.getNativeHeapAllocatedSize() / 1048576;
            Runtime runtime = Runtime.getRuntime();
            long maxMemory = runtime.maxMemory();
            long freeMemory = runtime.freeMemory();
            long j = runtime.totalMemory();
            this.f31942e = maxMemory / 1048576;
            long j2 = j - freeMemory;
            this.f31943f = j2 / 1048576;
            if (((float) j2) > ((float) maxMemory) * 0.95f) {
                z = true;
            } else {
                z = false;
            }
            this.f31941d = z;
            jSONObject.put("apm_native_heap_size", this.f31940c);
            jSONObject.put("apm_java_heap_leak", this.f31941d);
            jSONObject.put("apm_java_heap_used", this.f31943f);
            jSONObject.put("apm_java_heap_max", this.f31942e);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final JSONObject mo20937a(boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, String> entry : this.f31939b.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            if (z) {
                C12577c.C12579a.f30614a.mo20404a(jSONObject, false);
                C12577c.C12579a.f30614a.mo20405b(jSONObject, false);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
