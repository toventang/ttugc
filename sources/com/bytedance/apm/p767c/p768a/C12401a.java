package com.bytedance.apm.p767c.p768a;

import com.bytedance.apm.C12397c;
import com.bytedance.apm.p767c.AbstractC12398a;
import com.bytedance.apm.p767c.AbstractC12406b;
import com.bytedance.apm.p776h.C12485d;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.c.a.a */
public class C12401a extends AbstractC12398a<AbstractC12406b> {

    /* renamed from: d */
    private static volatile C12401a f29964d;

    /* renamed from: c */
    public AbstractC12402b f29965c;

    static {
        Covode.recordClassIndex(14208);
    }

    private C12401a() {
    }

    /* renamed from: b */
    public static C12401a m22303b() {
        if (f29964d == null) {
            synchronized (C12401a.class) {
                if (f29964d == null) {
                    f29964d = new C12401a();
                }
            }
        }
        return f29964d;
    }

    @Override // com.bytedance.apm.p767c.AbstractC12398a
    /* renamed from: e */
    public final void mo20184e(AbstractC12406b bVar) {
        JSONObject a = bVar.mo20188a();
        boolean a2 = bVar.mo20189a(a);
        if (C12397c.m22288e()) {
            try {
                C12485d.m22449a("logType: " + bVar.mo20190b() + ", subType: " + bVar.mo20191c() + "data: " + a, " ,sample: ".concat(String.valueOf(a2)));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (a2 || bVar.mo20192d()) {
            m22293a(bVar.mo20190b(), bVar.mo20191c(), a, a2, false);
            if (this.f29965c != null) {
                bVar.mo20190b();
                bVar.mo20191c();
            }
        }
    }
}
