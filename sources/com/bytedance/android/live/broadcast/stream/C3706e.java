package com.bytedance.android.live.broadcast.stream;

import android.content.Context;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.broadcast.stream.p205a.AbstractC3664a;
import com.bytedance.android.live.p250i.p251a.AbstractC4352a;
import com.bytedance.android.live.p250i.p251a.AbstractC4354b;
import com.bytedance.android.live.p250i.p251a.AbstractC4357d;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.livestreamv2.core.LiveCore;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.broadcast.stream.e */
public final class C3706e implements LiveCore.Builder.ILogMonitor {

    /* renamed from: a */
    public final Map<String, String> f10274a;

    /* renamed from: b */
    private final WeakReference<Context> f10275b;

    /* renamed from: c */
    private final AbstractC3664a f10276c;

    static {
        Covode.recordClassIndex(4219);
    }

    public C3706e(C3704d dVar) {
        C89219l.m154721d(dVar, "");
        this.f10275b = new WeakReference<>(dVar.f10207a);
        this.f10276c = dVar.f10224r;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f10274a = concurrentHashMap;
        AbstractC2953a a = C6193a.m13435a(AbstractC4357d.class);
        C89219l.m154716b(a, "");
        String a2 = ((AbstractC4357d) a).getCpuInfoFetcher().mo10102a();
        if (a2 != null) {
            concurrentHashMap.put("cpu_soc", a2);
        } else {
            AbstractC2953a a3 = C6193a.m13435a(AbstractC4357d.class);
            C89219l.m154716b(a3, "");
            ((AbstractC4357d) a3).getCpuInfoFetcher().mo10103a(new AbstractC4352a.AbstractC4353a(this) {
                /* class com.bytedance.android.live.broadcast.stream.C3706e.C37071 */

                /* renamed from: a */
                final /* synthetic */ C3706e f10277a;

                static {
                    Covode.recordClassIndex(4220);
                }

                {
                    this.f10277a = r1;
                }

                @Override // com.bytedance.android.live.p250i.p251a.AbstractC4352a.AbstractC4353a
                /* renamed from: a */
                public final void mo9023a(String str) {
                    Map<String, String> map = this.f10277a.f10274a;
                    C89219l.m154716b(str, "");
                    map.put("cpu_soc", str);
                }
            });
        }
        concurrentHashMap.put("rtmp_type", String.valueOf(dVar.f10209c));
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.LiveCore.Builder.ILogMonitor
    public final void onLogMonitor(String str, JSONObject jSONObject) {
        String a;
        for (String str2 : this.f10274a.keySet()) {
            if (jSONObject != null) {
                try {
                    jSONObject.put(str2, this.f10274a.get(str2));
                } catch (JSONException unused) {
                }
            }
        }
        AbstractC2953a a2 = C6193a.m13435a(AbstractC4357d.class);
        C89219l.m154716b(a2, "");
        AbstractC4354b gpuInfoFetcher = ((AbstractC4357d) a2).getGpuInfoFetcher();
        Context context = this.f10275b.get();
        if (!(gpuInfoFetcher == null || context == null || (a = gpuInfoFetcher.mo10104a(context)) == null || jSONObject == null)) {
            jSONObject.put("gpu_name", a);
        }
        this.f10276c.mo8572a(str, jSONObject);
    }
}
