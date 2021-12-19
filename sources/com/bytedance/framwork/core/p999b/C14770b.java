package com.bytedance.framwork.core.p999b;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.framwork.core.p999b.p1001b.C14771a;
import com.bytedance.framwork.core.p999b.p1002c.C14779d;
import com.bytedance.framwork.core.p999b.p1003d.AbstractC14785b;
import com.bytedance.framwork.core.p999b.p1004e.C14796b;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.framwork.core.b.b */
public final class C14770b implements AbstractC14785b {

    /* renamed from: a */
    public int f35986a = 120;

    /* renamed from: b */
    public int f35987b = 100;

    /* renamed from: c */
    public String f35988c;

    /* renamed from: d */
    public Context f35989d;

    /* renamed from: e */
    public JSONObject f35990e;

    /* renamed from: f */
    public volatile boolean f35991f;

    /* renamed from: g */
    private long f35992g;

    /* renamed from: h */
    private C14772c f35993h;

    /* renamed from: i */
    private volatile boolean f35994i = true;

    /* renamed from: j */
    private long f35995j;

    /* renamed from: k */
    private long f35996k;

    static {
        Covode.recordClassIndex(16870);
    }

    /* renamed from: a */
    public final void mo23793a() {
        this.f35994i = true;
        this.f35996k = 0;
    }

    /* renamed from: b */
    private boolean m27112b() {
        int i = this.f35987b;
        List<C14771a> a = this.f35993h.mo23800a(Integer.parseInt(this.f35988c), i);
        if (C14796b.m27161a(a)) {
            return true;
        }
        long j = -1;
        boolean z = false;
        try {
            JSONArray jSONArray = new JSONArray();
            LinkedList linkedList = new LinkedList();
            for (C14771a aVar : a) {
                long j2 = aVar.f35997a;
                if (j2 > j) {
                    j = j2;
                }
                String str = aVar.f36001e;
                linkedList.add(aVar);
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    jSONObject.put("log_id", j2);
                    jSONObject.put("d_s_t", System.currentTimeMillis());
                    jSONArray.put(jSONObject);
                } catch (Throwable unused) {
                }
            }
            z = m27111a(jSONArray);
            if (z) {
                mo23795b(j);
            }
        } catch (Throwable unused2) {
        }
        return z;
    }

    /* renamed from: b */
    public final int mo23795b(long j) {
        return this.f35993h.mo23799a(this.f35988c, j);
    }

    /* renamed from: c */
    public final void mo23796c(long j) {
        this.f35994i = false;
        this.f35995j = System.currentTimeMillis();
        this.f35996k = j;
    }

    /* renamed from: a */
    private boolean m27111a(JSONArray jSONArray) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (jSONArray.length() == 0) {
                return false;
            }
            jSONObject.put("data", jSONArray);
            JSONObject jSONObject2 = this.f35990e;
            if (jSONObject2 == null) {
                return true;
            }
            jSONObject.put("header", jSONObject2);
            String str = this.f35988c;
            String jSONObject3 = jSONObject.toString();
            if (TextUtils.isEmpty(jSONObject3)) {
                return false;
            }
            return C14779d.f36033b.get(str).mo23805b(jSONObject3);
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.bytedance.framwork.core.p999b.p1003d.AbstractC14785b
    /* renamed from: a */
    public final void mo23794a(long j) {
        long j2 = this.f35996k;
        if (j2 > 0 && j - this.f35995j > j2) {
            mo23793a();
        }
        if (this.f35994i && !this.f35991f) {
            long currentTimeMillis = System.currentTimeMillis();
            long a = (long) this.f35993h.mo23798a(this.f35988c);
            if (a <= 0) {
                return;
            }
            if (a > ((long) this.f35987b) || (currentTimeMillis - this.f35992g) / 1000 > ((long) this.f35986a)) {
                this.f35992g = currentTimeMillis;
                m27112b();
            }
        }
    }

    public C14770b(Context context, String str) {
        this.f35989d = context;
        this.f35993h = C14772c.m27118a(context);
        this.f35988c = str;
    }
}
