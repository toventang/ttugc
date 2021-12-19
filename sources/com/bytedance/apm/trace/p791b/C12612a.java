package com.bytedance.apm.trace.p791b;

import com.bytedance.apm.C12397c;
import com.bytedance.apm.p767c.p768a.C12401a;
import com.bytedance.apm.p767c.p769b.C12412f;
import com.bytedance.apm.p788p.C12560b;
import com.bytedance.apm.p789q.C12582f;
import com.bytedance.covode.number.Covode;
import com.bytedance.p802b.p831i.p832a.C13098b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.trace.b.a */
public final class C12612a implements C12560b.AbstractC12565b {

    /* renamed from: a */
    public final HashMap<String, C12614a> f30672a;

    /* renamed from: b */
    private boolean f30673b;

    static {
        Covode.recordClassIndex(14429);
    }

    /* renamed from: com.bytedance.apm.trace.b.a$b */
    public static class C12615b {

        /* renamed from: a */
        public static final C12612a f30681a = new C12612a((byte) 0);

        static {
            Covode.recordClassIndex(14432);
        }
    }

    private C12612a() {
        this.f30672a = new HashMap<>();
        this.f30673b = true;
        C12560b.C12564a.f30567a.mo20384a(this);
    }

    /* synthetic */ C12612a(byte b) {
        this();
    }

    @Override // com.bytedance.apm.p788p.C12560b.AbstractC12565b
    /* renamed from: a */
    public final void mo20219a(long j) {
        float f;
        if (!this.f30672a.isEmpty()) {
            Iterator<Map.Entry<String, C12614a>> it = this.f30672a.entrySet().iterator();
            int i = C12582f.f30617b;
            while (it.hasNext()) {
                Map.Entry<String, C12614a> next = it.next();
                String key = next.getKey();
                C12614a value = next.getValue();
                boolean z = false;
                if (j - value.f30679c > 120000) {
                    it.remove();
                    if (value.f30680d > 0) {
                        f = value.f30678b / ((float) value.f30680d);
                    } else {
                        f = -1.0f;
                    }
                    if (C12397c.m22288e()) {
                        String[] strArr = new String[1];
                        String str = "aggregate fps: " + key + " , value: " + f;
                    }
                    if (f > 0.0f) {
                        float f2 = (float) i;
                        if (f > f2) {
                            f = f2;
                        }
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("fps", (double) f);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("scene", key);
                            C12412f fVar = new C12412f("fps", key, jSONObject, jSONObject2, null, (byte) 0);
                            C13098b.m23557a(fVar, true);
                            JSONObject jSONObject3 = fVar.f30015f;
                            jSONObject3.put("refresh_rate", i);
                            if (this.f30673b) {
                                this.f30673b = false;
                                jSONObject3.put("device_max_refresh_rate", C12582f.f30618c);
                                if (!C12582f.f30619d) {
                                    z = true;
                                }
                                jSONObject3.put("refresh_rate_restricted", z);
                            }
                            C12401a.m22303b().mo20179a(fVar);
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo20425a(final String str, final float f) {
        C12560b.C12564a.f30567a.mo20387a(new Runnable() {
            /* class com.bytedance.apm.trace.p791b.C12612a.RunnableC126131 */

            static {
                Covode.recordClassIndex(14430);
            }

            public final void run() {
                C12614a aVar = C12612a.this.f30672a.get(str);
                if (aVar == null) {
                    C12612a.this.f30672a.put(str, new C12614a(str, f));
                    return;
                }
                aVar.f30678b += f;
                aVar.f30680d++;
            }
        });
    }

    /* renamed from: com.bytedance.apm.trace.b.a$a */
    static class C12614a {

        /* renamed from: a */
        public String f30677a;

        /* renamed from: b */
        public float f30678b;

        /* renamed from: c */
        long f30679c = System.currentTimeMillis();

        /* renamed from: d */
        int f30680d = 1;

        static {
            Covode.recordClassIndex(14431);
        }

        C12614a(String str, float f) {
            this.f30677a = str;
            this.f30678b = f;
        }
    }
}
