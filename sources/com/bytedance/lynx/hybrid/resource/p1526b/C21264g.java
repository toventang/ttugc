package com.bytedance.lynx.hybrid.resource.p1526b;

import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.p1524j.C21210c;
import com.bytedance.lynx.hybrid.p1524j.EnumC21209b;
import com.bytedance.lynx.hybrid.resource.C21335j;
import com.bytedance.lynx.hybrid.resource.p1527c.C21268a;
import com.bytedance.lynx.hybrid.resource.p1527c.C21274b;
import com.bytedance.lynx.hybrid.resource.p1528d.C21294e;
import com.bytedance.lynx.hybrid.resource.p1528d.EnumC21293d;
import com.bytedance.lynx.hybrid.resource.p1535i.C21334c;
import com.kakao.usermgmt.StringSet;
import java.io.InputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.lynx.hybrid.resource.b.g */
public final class C21264g extends AbstractC21247c {
    static {
        Covode.recordClassIndex(24880);
    }

    @Override // com.bytedance.lynx.hybrid.resource.p1526b.AbstractC21247c
    /* renamed from: a */
    public final C21294e mo34838a(C21294e eVar, C21248d dVar) {
        C89219l.m154719c(eVar, "");
        C89219l.m154719c(dVar, "");
        new C21334c();
        C21294e b = m39969b(eVar, dVar);
        if (b instanceof C21335j) {
            ((C21335j) b).f50661c = true;
            b.mo34901a(eVar.f50545l);
        }
        return b;
    }

    /* renamed from: b */
    private static C21294e m39969b(C21294e eVar, C21248d dVar) {
        Integer num = dVar.f50514e;
        if (num != null && num.intValue() == 2) {
            if (eVar instanceof C21335j) {
                ((C21335j) eVar).mo34938c("memory dynamic is 2");
            }
            C21210c.m39925a("MemoryLoader:return null because dynamic is 2", (EnumC21209b) null, (String) null, 6);
            return null;
        } else if (dVar.f50516g.length() != 0 && dVar.f50517h.length() != 0) {
            return C21268a.C21270b.f50477a.mo34848b(C21274b.m39976a(dVar));
        } else {
            if (eVar instanceof C21335j) {
                ((C21335j) eVar).mo34938c("memory channel/bundle is empty");
            }
            C21210c.m39925a("MemoryLoader:return null because channel or bundle is empty", (EnumC21209b) null, (String) null, 6);
            return null;
        }
    }

    @Override // com.bytedance.lynx.hybrid.resource.p1526b.AbstractC21247c
    /* renamed from: a */
    public final void mo34839a(C21294e eVar, C21248d dVar, AbstractC89172b<? super C21294e, C89391z> bVar, AbstractC89172b<? super Throwable, C89391z> bVar2) {
        C89219l.m154719c(eVar, "");
        C89219l.m154719c(dVar, "");
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(bVar2, "");
        new C21334c();
        C21294e b = m39969b(eVar, dVar);
        if (b == null) {
            JSONArray jSONArray = eVar.f50545l;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(StringSet.name, "Memory");
            jSONObject.put("status", "fail");
            jSONObject.put("message", "not found");
            jSONArray.put(jSONObject);
            bVar2.invoke(new Throwable("memory loader return null"));
            return;
        }
        if (b instanceof C21335j) {
            ((C21335j) b).f50661c = true;
        }
        InputStream a = b.mo34899a();
        if (a == null || a.available() <= 0) {
            if (eVar instanceof C21335j) {
                ((C21335j) eVar).mo34938c("memory size 0");
            }
            JSONArray jSONArray2 = eVar.f50545l;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(StringSet.name, "Memory");
            jSONObject2.put("status", "failed");
            jSONObject2.put("message", "size 0");
            jSONArray2.put(jSONObject2);
            eVar.mo34901a(jSONArray2);
            bVar2.invoke(new Throwable("memory loader size is 0"));
            return;
        }
        try {
            if (!(b.f50549p == EnumC21293d.BUILTIN || a == null)) {
                a.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        JSONArray jSONArray3 = eVar.f50545l;
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(StringSet.name, "Memory");
        jSONObject3.put("status", "success");
        jSONArray3.put(jSONObject3);
        eVar.mo34901a(jSONArray3);
        b.mo34901a(eVar.f50545l);
        bVar.invoke(b);
    }
}
