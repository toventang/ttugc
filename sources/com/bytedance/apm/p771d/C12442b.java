package com.bytedance.apm.p771d;

import com.bytedance.covode.number.Covode;
import com.bytedance.monitor.p1546a.p1548b.AbstractRunnableC21452e;
import com.bytedance.monitor.p1546a.p1548b.C21435a;
import com.bytedance.monitor.p1546a.p1548b.EnumC21447b;
import com.bytedance.p802b.p841k.C13130f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.d.b */
public final class C12442b {

    /* renamed from: a */
    public boolean f30212a;

    /* renamed from: b */
    private final String f30213b;

    /* renamed from: c */
    private List<Object> f30214c;

    static {
        Covode.recordClassIndex(14252);
    }

    /* renamed from: com.bytedance.apm.d.b$a */
    public static class C12445a {

        /* renamed from: a */
        public static final C12442b f30223a = new C12442b((byte) 0);

        static {
            Covode.recordClassIndex(14255);
        }
    }

    private C12442b() {
        this.f30213b = "doctor";
        this.f30214c = new ArrayList();
        this.f30212a = false;
    }

    /* synthetic */ C12442b(byte b) {
        this();
    }

    /* renamed from: a */
    public final void mo20275a(final String str, final String str2) {
        if (!C13130f.m23608a(this.f30214c)) {
            final ArrayList arrayList = new ArrayList(this.f30214c);
            C21435a.C21439a.f50832a.mo35034a(new AbstractRunnableC21452e() {
                /* class com.bytedance.apm.p771d.C12442b.C124431 */

                static {
                    Covode.recordClassIndex(14253);
                }

                @Override // com.bytedance.monitor.p1546a.p1548b.AbstractRunnableC21452e
                /* renamed from: a */
                public final String mo20277a() {
                    return "doctor";
                }

                @Override // com.bytedance.monitor.p1546a.p1548b.AbstractRunnableC21452e
                /* renamed from: b */
                public final EnumC21447b mo20278b() {
                    return EnumC21447b.LIGHT_WEIGHT;
                }

                public final void run() {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo20276a(final String str, final JSONObject jSONObject) {
        if (!C13130f.m23608a(this.f30214c) && jSONObject != null) {
            final ArrayList arrayList = new ArrayList(this.f30214c);
            C21435a.C21439a.f50832a.mo35034a(new AbstractRunnableC21452e() {
                /* class com.bytedance.apm.p771d.C12442b.C124442 */

                static {
                    Covode.recordClassIndex(14254);
                }

                @Override // com.bytedance.monitor.p1546a.p1548b.AbstractRunnableC21452e
                /* renamed from: a */
                public final String mo20277a() {
                    return "doctor";
                }

                @Override // com.bytedance.monitor.p1546a.p1548b.AbstractRunnableC21452e
                /* renamed from: b */
                public final EnumC21447b mo20278b() {
                    return EnumC21447b.LIGHT_WEIGHT;
                }

                public final void run() {
                    try {
                        JSONObject jSONObject = jSONObject.getJSONObject("DATA_DOCTOR");
                        jSONObject.put(str, System.currentTimeMillis());
                        jSONObject.optInt("DATA_ID");
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            it.next();
                        }
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }
}
