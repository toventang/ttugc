package com.bytedance.p802b.p824f.p825a;

import com.bytedance.apm.C12450f;
import com.bytedance.apm.block.C12387e;
import com.bytedance.apm.block.C12388f;
import com.bytedance.apm.block.C12392i;
import com.bytedance.apm.config.AbstractC12425f;
import com.bytedance.apm.config.C12424e;
import com.bytedance.covode.number.Covode;
import com.bytedance.monitor.collector.AbstractC21475b;
import com.bytedance.monitor.collector.C21501k;
import com.bytedance.p802b.p824f.p825a.p826a.AbstractC13069b;
import com.bytedance.p802b.p824f.p825a.p826a.C13065a;
import com.bytedance.p802b.p831i.p832a.C13096a;
import org.json.JSONObject;

/* renamed from: com.bytedance.b.f.a.d */
public final class C13074d implements AbstractC12425f {

    /* renamed from: a */
    C12424e f31874a;

    static {
        Covode.recordClassIndex(14910);
    }

    public C13074d() {
        C13065a.m23491a().mo20920b();
        C13065a.m23491a().mo20918a(new AbstractC13069b() {
            /* class com.bytedance.p802b.p824f.p825a.C13074d.C130751 */

            static {
                Covode.recordClassIndex(14911);
            }

            @Override // com.bytedance.p802b.p824f.p825a.p826a.AbstractC13069b
            /* renamed from: a */
            public final void mo20917a(JSONObject jSONObject) {
                JSONObject a;
                boolean z;
                boolean z2;
                boolean z3;
                boolean z4;
                boolean z5;
                boolean z6;
                boolean z7;
                boolean z8;
                boolean z9;
                boolean z10;
                int i;
                C13074d dVar = C13074d.this;
                if (!(jSONObject == null || (a = C13096a.m23549a(jSONObject, "smooth")) == null)) {
                    dVar.f31874a = new C12424e();
                    boolean z11 = false;
                    if (a.optInt("enable_stack_sampling", 0) == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    dVar.f31874a.f30144a = z;
                    if (a.optInt("enable_trace", 0) == 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    dVar.f31874a.f30145b = z2;
                    dVar.f31874a.f30146c = a.optLong("atrace_tag", 0);
                    if (a.optInt("block_dump_stack_enable", 1) == 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    dVar.f31874a.f30147d = z3;
                    if (a.optInt("enable_gfx_monitor", 0) == 1) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    dVar.f31874a.f30148e = z4;
                    dVar.f31874a.f30149f = a.optInt("block_monitor_mode", 1001);
                    if (a.optInt("serious_block_enable_upload", 1) == 1) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    dVar.f31874a.f30150g = z5;
                    dVar.f31874a.f30151h = a.optLong("serious_block_threshold", 4000);
                    if (a.optInt("slow_method_enable_upload", 0) == 1) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    dVar.f31874a.f30152i = z6;
                    if (a.optInt("drop_enable_upload", 1) == 1) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    dVar.f31874a.f30153j = z7;
                    if (a.optInt("enable_upload", 0) == 1) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    dVar.f31874a.f30154k = z8;
                    dVar.f31874a.f30155l = a.optLong("block_threshold", 2500);
                    long j = 1000;
                    dVar.f31874a.f30156m = a.optLong("drop_threshold", 1000);
                    if (a.optInt("block_enable_upload", 0) == 1) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    dVar.f31874a.f30157n = z9;
                    dVar.f31874a.f30158o = a.optBoolean("drop_slow_method_switch", false);
                    if (a.optInt("enable_slow_method_ext", 0) == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    dVar.f31874a.f30159p = z10;
                    dVar.f31874a.f30160q = a.optJSONObject("scene_enable_upload");
                    C12424e eVar = dVar.f31874a;
                    if (eVar != null) {
                        long j2 = eVar.f30156m;
                        if (j2 >= 70) {
                            j = j2;
                        }
                        C12392i.f29901e = j;
                        C12388f.m22257a();
                        C21501k.m40384a().f51027e = true;
                        C12388f a2 = C12388f.m22257a();
                        int i2 = eVar.f30149f;
                        if (i2 == 11) {
                            i = 2;
                        } else if (i2 == 101) {
                            i = 3;
                        } else if (i2 != 1001) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        a2.f29896a = i;
                        C21501k a3 = C21501k.m40384a();
                        int i3 = a2.f29896a;
                        if (a3.f51027e) {
                            for (AbstractC21475b bVar : a3.f51024b) {
                                if (bVar != null) {
                                    bVar.mo35074a(i3);
                                }
                            }
                        }
                        C12450f.m22414a(eVar);
                        if (eVar.f30152i && eVar.f30158o) {
                            z11 = true;
                        }
                        C12387e.m22255a(z11, eVar.f30156m, eVar.f30159p);
                    }
                }
            }
        });
    }
}
