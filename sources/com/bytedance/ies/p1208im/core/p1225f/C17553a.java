package com.bytedance.ies.p1208im.core.p1225f;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.C17415a;
import com.bytedance.ies.p1208im.core.p1224e.C17535m;
import com.bytedance.p1399im.core.p1407c.AbstractC19508c;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.im.core.f.a */
public final class C17553a implements AbstractC19508c {

    /* renamed from: a */
    public static final C17553a f41998a = new C17553a();

    private C17553a() {
    }

    static {
        Covode.recordClassIndex(20042);
    }

    @Override // com.bytedance.p1399im.core.p1407c.AbstractC19508c
    /* renamed from: a */
    public final void mo27951a(String str, JSONObject jSONObject) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(jSONObject, "");
        C17535m.m32505a(str, jSONObject);
        C17415a.m32255b().mo27837b(str, jSONObject);
    }

    @Override // com.bytedance.p1399im.core.p1407c.AbstractC19508c
    /* renamed from: a */
    public final void mo27950a(String str, String str2, Throwable th) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C17415a.m32255b().mo27836b(str, str2);
        if (th != null) {
            C17415a.m32255b().mo27834a(th);
        }
    }

    @Override // com.bytedance.p1399im.core.p1407c.AbstractC19508c
    /* renamed from: b */
    public final void mo27952b(String str, String str2, Throwable th) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C17415a.m32255b().mo27836b(str, str2);
        if (th != null) {
            C17415a.m32255b().mo27834a(th);
        }
    }
}
