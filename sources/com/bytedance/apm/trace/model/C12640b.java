package com.bytedance.apm.trace.model;

import android.text.TextUtils;
import com.bytedance.apm.p788p.C12560b;
import com.bytedance.apm.p789q.C12585h;
import com.bytedance.apm.trace.p790a.AbstractC12605a;
import com.bytedance.apm.trace.p790a.AbstractC12607c;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1748w.p1749a.C23544a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.trace.model.b */
public final class C12640b implements AbstractC12605a, AbstractC12607c {

    /* renamed from: a */
    public final long f30780a;

    /* renamed from: b */
    public final AbstractC12639a f30781b;

    /* renamed from: c */
    public boolean f30782c;

    /* renamed from: d */
    private final String f30783d;

    /* renamed from: e */
    private final String f30784e;

    /* renamed from: f */
    private long f30785f;

    /* renamed from: g */
    private long f30786g;

    /* renamed from: h */
    private String f30787h;

    /* renamed from: i */
    private Map<String, String> f30788i;

    /* renamed from: j */
    private List<C23544a> f30789j;

    /* renamed from: k */
    private long f30790k;

    /* renamed from: l */
    private long f30791l;

    static {
        Covode.recordClassIndex(14457);
    }

    /* renamed from: a */
    public final JSONObject mo20450a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("log_type", this.f30784e);
            jSONObject.put("span_id", new StringBuilder().append(this.f30780a).toString());
            jSONObject.put("operation_name", this.f30783d);
            if (this.f30785f != 0) {
                jSONObject.put("parent_id", new StringBuilder().append(this.f30785f).toString());
            }
            if (this.f30786g != 0) {
                jSONObject.put("reference_id", new StringBuilder().append(this.f30786g).toString());
            }
            jSONObject.put("start_timestamp", this.f30790k);
            jSONObject.put("finish_timestamp", this.f30791l);
            Map<String, String> map = this.f30788i;
            if (map != null && !map.isEmpty()) {
                jSONObject.put("tags", new JSONObject(this.f30788i));
            }
            if (!C12585h.m22682a(this.f30789j)) {
                JSONArray jSONArray = new JSONArray();
                for (C23544a aVar : this.f30789j) {
                    jSONArray.put(aVar.mo38629a());
                }
                jSONObject.put("logs", jSONArray);
            }
            jSONObject.put("thread_id", this.f30787h);
            jSONObject.put("is_finished", 1);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.bytedance.apm.trace.p790a.AbstractC12606b
    /* renamed from: a */
    public final AbstractC12605a mo20418a(long j) {
        this.f30785f = j;
        return this;
    }

    @Override // com.bytedance.apm.trace.p790a.AbstractC12606b
    /* renamed from: b */
    public final AbstractC12605a mo20421b(long j) {
        this.f30786g = j;
        return this;
    }

    @Override // com.bytedance.apm.trace.p790a.AbstractC12606b
    /* renamed from: a */
    public final AbstractC12605a mo20419a(String str) {
        this.f30787h = str;
        return this;
    }

    @Override // com.bytedance.apm.trace.p790a.AbstractC12606b
    /* renamed from: a */
    public final AbstractC12605a mo20420a(String str, String str2) {
        this.f30781b.mo20449a(str);
        if (this.f30788i == null) {
            this.f30788i = new HashMap();
        }
        if (TextUtils.equals(str, "error")) {
            this.f30782c = true;
        }
        this.f30788i.put(str, str2);
        return this;
    }

    @Override // com.bytedance.apm.trace.p790a.AbstractC12607c
    /* renamed from: a */
    public final void mo20422a(long j, long j2) {
        String str = this.f30787h;
        if (str == null || str.isEmpty()) {
            this.f30787h = Thread.currentThread().getName();
        }
        this.f30790k = j;
        this.f30791l = j2;
        C12560b.C12564a.f30567a.mo20387a(new Runnable() {
            /* class com.bytedance.apm.trace.model.C12640b.RunnableC126411 */

            static {
                Covode.recordClassIndex(14458);
            }

            public final void run() {
                C12640b.this.mo20450a();
            }
        });
    }

    public C12640b(String str, String str2, AbstractC12639a aVar, long j) {
        this.f30783d = str;
        this.f30781b = aVar;
        this.f30784e = str2;
        this.f30780a = j;
    }
}
