package com.p1795d.p1796a.p1797a.p1798a.p1807h;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p1795d.p1796a.p1797a.p1798a.p1802c.C23787c;
import com.p1795d.p1796a.p1797a.p1798a.p1803d.AbstractC23792a;
import com.p1795d.p1796a.p1797a.p1798a.p1803d.C23794b;
import com.p1795d.p1796a.p1797a.p1798a.p1804e.C23798b;
import com.p1795d.p1796a.p1797a.p1798a.p1804e.C23800c;
import com.p1795d.p1796a.p1797a.p1798a.p1804e.C23802e;
import com.p1795d.p1796a.p1797a.p1798a.p1807h.C23822b;
import com.p1795d.p1796a.p1797a.p1798a.p1807h.p1808a.C23818c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.d.a.a.a.h.a */
public final class C23810a implements AbstractC23792a.AbstractC23793a {

    /* renamed from: a */
    public static C23810a f56319a = new C23810a();

    /* renamed from: b */
    public static Handler f56320b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    static Handler f56321c = null;

    /* renamed from: j */
    static final Runnable f56322j = new Runnable() {
        /* class com.p1795d.p1796a.p1797a.p1798a.p1807h.C23810a.RunnableC238122 */

        static {
            Covode.recordClassIndex(27920);
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x005b  */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x003e A[EDGE_INSN: B:50:0x003e->B:12:0x003e ?: BREAK  , SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            // Method dump skipped, instructions count: 344
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p1795d.p1796a.p1797a.p1798a.p1807h.C23810a.RunnableC238122.run():void");
        }
    };

    /* renamed from: k */
    static final Runnable f56323k = new Runnable() {
        /* class com.p1795d.p1796a.p1797a.p1798a.p1807h.C23810a.RunnableC238133 */

        static {
            Covode.recordClassIndex(27921);
        }

        public final void run() {
            if (C23810a.f56321c != null) {
                C23810a.f56321c.post(C23810a.f56322j);
                C23810a.f56321c.postDelayed(C23810a.f56323k, 200);
            }
        }
    };

    /* renamed from: d */
    public List<Object> f56324d = new ArrayList();

    /* renamed from: e */
    int f56325e;

    /* renamed from: f */
    C23794b f56326f = new C23794b();

    /* renamed from: g */
    C23822b f56327g = new C23822b();

    /* renamed from: h */
    C23824c f56328h = new C23824c(new C23818c());

    /* renamed from: i */
    long f56329i;

    static {
        Covode.recordClassIndex(27918);
    }

    C23810a() {
    }

    /* renamed from: a */
    public static void m45014a() {
        if (f56321c == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f56321c = handler;
            handler.post(f56322j);
            f56321c.postDelayed(f56323k, 200);
        }
    }

    /* renamed from: b */
    public static void m45015b() {
        Handler handler = f56321c;
        if (handler != null) {
            handler.removeCallbacks(f56323k);
            f56321c = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo39275a(long j) {
        if (this.f56324d.size() > 0) {
            Iterator<Object> it = this.f56324d.iterator();
            while (it.hasNext()) {
                it.next();
                TimeUnit.NANOSECONDS.toMillis(j);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo39276a(View view, AbstractC23792a aVar, JSONObject jSONObject, EnumC23825d dVar) {
        aVar.mo39262a(view, jSONObject, this, dVar == EnumC23825d.PARENT_VIEW);
    }

    @Override // com.p1795d.p1796a.p1797a.p1798a.p1803d.AbstractC23792a.AbstractC23793a
    /* renamed from: a */
    public final void mo39263a(View view, AbstractC23792a aVar, JSONObject jSONObject) {
        String str;
        if (C23802e.m44999c(view) == null) {
            C23822b bVar = this.f56327g;
            EnumC23825d dVar = bVar.f56343d.contains(view) ? EnumC23825d.PARENT_VIEW : bVar.f56347h ? EnumC23825d.OBSTRUCTION_VIEW : EnumC23825d.UNDERLYING_VIEW;
            if (dVar != EnumC23825d.UNDERLYING_VIEW) {
                JSONObject a = aVar.mo39261a(view);
                C23798b.m44986a(jSONObject, a);
                C23822b bVar2 = this.f56327g;
                if (!(bVar2.f56340a.size() == 0 || (str = bVar2.f56340a.get(view)) == null)) {
                    bVar2.f56340a.remove(view);
                    if (str != null) {
                        C23798b.m44984a(a, str);
                        this.f56327g.f56347h = true;
                        this.f56325e++;
                    }
                }
                C23822b bVar3 = this.f56327g;
                C23822b.C23823a aVar2 = bVar3.f56341b.get(view);
                if (aVar2 != null) {
                    bVar3.f56341b.remove(view);
                    C23787c cVar = aVar2.f56348a;
                    JSONArray jSONArray = new JSONArray();
                    for (String str2 : aVar2.f56349b) {
                        jSONArray.put(str2);
                    }
                    try {
                        a.put("isFriendlyObstructionFor", jSONArray);
                        a.put("friendlyObstructionClass", cVar.f56280b);
                        a.put("friendlyObstructionPurpose", cVar.f56281c);
                        a.put("friendlyObstructionReason", cVar.f56282d);
                    } catch (JSONException unused) {
                        C23800c.m44990b("Error with setting friendly obstruction");
                    }
                }
                mo39276a(view, aVar, a, dVar);
                this.f56325e++;
            }
        }
    }
}
