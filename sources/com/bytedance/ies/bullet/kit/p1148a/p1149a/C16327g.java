package com.bytedance.ies.bullet.kit.p1148a.p1149a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.p1148a.C16342f;
import com.bytedance.ies.bullet.kit.p1148a.C16365p;
import com.bytedance.ies.bullet.kit.p1148a.p1150b.C16329a;
import com.bytedance.ies.bullet.kit.p1148a.p1150b.C16335b;
import com.bytedance.ies.bullet.service.base.C16610ap;
import com.bytedance.ies.bullet.service.base.EnumC16609ao;
import com.bytedance.ies.bullet.service.base.p1163a.AbstractC16576j;
import com.kakao.usermgmt.StringSet;
import java.io.InputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.kit.a.a.g */
public final class C16327g extends AbstractC16310c {
    static {
        Covode.recordClassIndex(18620);
    }

    @Override // com.bytedance.ies.bullet.kit.p1148a.p1149a.AbstractC16310c
    /* renamed from: a */
    public final C16610ap mo25895a(C16610ap apVar, C16311d dVar) {
        C89219l.m154719c(apVar, "");
        C89219l.m154719c(dVar, "");
        C16365p pVar = new C16365p();
        C16610ap b = m30335b(apVar, dVar);
        if (b instanceof C16342f) {
            ((C16342f) b).f39276c = true;
            b.mo26373b(apVar.f39752l);
            b.mo26371a(apVar.f39753m);
            JSONObject jSONObject = b.f39752l.f39743h;
            if (jSONObject != null) {
                jSONObject.put("me_total", pVar.mo25950b());
            }
        }
        return b;
    }

    /* renamed from: b */
    private final C16610ap m30335b(C16610ap apVar, C16311d dVar) {
        Integer num = dVar.f39842j;
        if (num != null && num.intValue() == 2) {
            if (apVar instanceof C16342f) {
                ((C16342f) apVar).mo25916c("memory dynamic is 2");
            }
            AbstractC16576j.C16578b.m30778a(this, "MemoryLoader:return null because dynamic is 2", null, null, 6);
            return null;
        } else if (dVar.f39844l.length() != 0 && dVar.f39845m.length() != 0) {
            return C16329a.C16331b.f39233a.mo25906b(C16335b.m30344a(apVar, dVar));
        } else {
            if (apVar instanceof C16342f) {
                ((C16342f) apVar).mo25916c("memory channel/bundle is empty");
            }
            AbstractC16576j.C16578b.m30778a(this, "MemoryLoader:return null because channel or bundle is empty", null, null, 6);
            return null;
        }
    }

    @Override // com.bytedance.ies.bullet.kit.p1148a.p1149a.AbstractC16310c
    /* renamed from: a */
    public final void mo25896a(C16610ap apVar, C16311d dVar, AbstractC89172b<? super C16610ap, C89391z> bVar, AbstractC89172b<? super Throwable, C89391z> bVar2) {
        C89219l.m154719c(apVar, "");
        C89219l.m154719c(dVar, "");
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(bVar2, "");
        C16365p pVar = new C16365p();
        C16610ap b = m30335b(apVar, dVar);
        if (b == null) {
            JSONObject jSONObject = apVar.f39752l.f39743h;
            if (jSONObject != null) {
                jSONObject.put("me_total", pVar.mo25950b());
            }
            JSONArray jSONArray = apVar.f39753m;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(StringSet.name, "Memory");
            jSONObject2.put("status", "fail");
            jSONObject2.put("message", "not found");
            jSONArray.put(jSONObject2);
            bVar2.invoke(new Throwable("memory loader return null"));
            return;
        }
        if (b instanceof C16342f) {
            ((C16342f) b).f39276c = true;
        }
        b.mo26373b(apVar.f39752l);
        JSONObject jSONObject3 = b.f39752l.f39743h;
        if (jSONObject3 != null) {
            jSONObject3.put("me_total", pVar.mo25950b());
        }
        InputStream a = b.mo25913a();
        if (a == null || a.available() <= 0) {
            if (apVar instanceof C16342f) {
                ((C16342f) apVar).mo25916c("memory size 0");
            }
            JSONArray jSONArray2 = apVar.f39753m;
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put(StringSet.name, "Memory");
            jSONObject4.put("status", "failed");
            jSONObject4.put("message", "size 0");
            jSONArray2.put(jSONObject4);
            apVar.mo26371a(jSONArray2);
            bVar2.invoke(new Throwable("memory loader size is 0"));
            return;
        }
        try {
            if (!(b.f39757q == EnumC16609ao.BUILTIN || a == null)) {
                a.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        JSONArray jSONArray3 = apVar.f39753m;
        JSONObject jSONObject5 = new JSONObject();
        jSONObject5.put(StringSet.name, "Memory");
        jSONObject5.put("status", "success");
        jSONArray3.put(jSONObject5);
        apVar.mo26371a(jSONArray3);
        b.mo26371a(apVar.f39753m);
        bVar.invoke(b);
    }
}
