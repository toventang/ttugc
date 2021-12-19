package com.bytedance.framwork.core.p999b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.framwork.core.p999b.p1001b.C14771a;
import com.bytedance.framwork.core.p999b.p1003d.AbstractC14785b;
import com.bytedance.framwork.core.p999b.p1004e.C14796b;
import java.util.LinkedList;
import org.json.JSONObject;

/* renamed from: com.bytedance.framwork.core.b.d */
public final class C14781d implements AbstractC14785b {

    /* renamed from: a */
    public boolean f36036a = false;

    /* renamed from: b */
    private C14772c f36037b;

    /* renamed from: c */
    private final LinkedList<C14771a> f36038c = new LinkedList<>();

    /* renamed from: d */
    private final int f36039d = 5;

    /* renamed from: e */
    private long f36040e = 0;

    /* renamed from: f */
    private final int f36041f = 120000;

    /* renamed from: g */
    private String f36042g;

    static {
        Covode.recordClassIndex(16881);
    }

    /* renamed from: a */
    public final void mo23816a() {
        MethodCollector.m26663i(12848);
        synchronized (this.f36038c) {
            try {
                this.f36038c.clear();
            } finally {
                MethodCollector.m26664o(12848);
            }
        }
    }

    @Override // com.bytedance.framwork.core.p999b.p1003d.AbstractC14785b
    /* renamed from: a */
    public final void mo23794a(long j) {
        if (!this.f36036a) {
            m27145a(j, false);
        }
    }

    public C14781d(Context context, String str) {
        this.f36037b = C14772c.m27118a(context);
        this.f36042g = str;
    }

    /* renamed from: a */
    private boolean m27145a(long j, boolean z) {
        LinkedList linkedList;
        MethodCollector.m26663i(12847);
        int size = this.f36038c.size();
        if (size <= 0 || (!z && size < 5 && j - this.f36040e <= 120000)) {
            MethodCollector.m26664o(12847);
            return false;
        }
        this.f36040e = j;
        synchronized (this.f36038c) {
            try {
                linkedList = new LinkedList(this.f36038c);
                this.f36038c.clear();
            } catch (Throwable th) {
                MethodCollector.m26664o(12847);
                throw th;
            }
        }
        if (!C14796b.m27161a(linkedList)) {
            try {
                this.f36037b.mo23801a(this.f36042g, linkedList);
            } catch (Exception unused) {
            }
        }
        MethodCollector.m26664o(12847);
        return true;
    }

    /* renamed from: a */
    public final void mo23817a(String str, String str2, JSONObject jSONObject) {
        if (!this.f36036a && jSONObject != null) {
            C14771a aVar = new C14771a(this.f36042g, str, str2, jSONObject.toString(), System.currentTimeMillis());
            if (this.f36038c.size() >= 200) {
                m27145a(System.currentTimeMillis(), true);
            }
            this.f36038c.add(aVar);
        }
    }
}
