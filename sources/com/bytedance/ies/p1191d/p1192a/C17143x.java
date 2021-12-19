package com.bytedance.ies.p1191d.p1192a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1191d.p1192a.AbstractC17117i;
import com.bytedance.ies.p1191d.p1192a.AbstractC17126n;
import com.bytedance.ies.p1191d.p1192a.C17144y;
import java.lang.ref.WeakReference;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.d.a.x */
public final class C17143x implements AbstractC17124l {

    /* renamed from: a */
    private C17144y f40762a;

    /* renamed from: b */
    private final WeakReference<AbstractC17126n> f40763b;

    /* renamed from: c */
    private final AbstractC17125m f40764c;

    static {
        Covode.recordClassIndex(19600);
    }

    @Override // com.bytedance.ies.p1191d.p1192a.AbstractC17124l
    /* renamed from: a */
    public final void mo27038a() {
        C17144y yVar = this.f40762a;
        if (yVar != null) {
            C89219l.m154719c(this, "");
            yVar.f40766a.remove(this);
        }
    }

    /* renamed from: a */
    private void m31666a(C17147z zVar) {
        C89219l.m154719c(zVar, "");
        C17144y a = this.f40764c.mo26984a(zVar, this);
        this.f40762a = a;
        if (a != null) {
            a.mo27044a(this);
        }
    }

    @Override // com.bytedance.ies.p1191d.p1192a.AbstractC17083aa
    /* renamed from: a */
    public final void mo26987a(AbstractC17117i.C17120c cVar) {
        C17144y.EnumC17146b bVar;
        C89219l.m154719c(cVar, "");
        C17144y yVar = this.f40762a;
        if (yVar == null || (bVar = yVar.f40768c) == null) {
            bVar = C17144y.EnumC17146b.FALLBACK;
        }
        cVar.f40735f = bVar.ordinal();
        AbstractC17126n nVar = this.f40763b.get();
        if (nVar == null) {
            return;
        }
        if (nVar instanceof AbstractC17126n.C17127a) {
            ((AbstractC17126n.C17127a) nVar).mo13352a(cVar);
        } else {
            nVar.mo26540a(cVar.mo27031b());
        }
    }

    @Override // com.bytedance.ies.p1191d.p1192a.AbstractC17083aa
    /* renamed from: a */
    public final void mo26988a(Throwable th) {
        C89219l.m154719c(th, "");
        AbstractC17126n nVar = this.f40763b.get();
        if (nVar != null) {
            nVar.mo13353a(th);
        }
    }

    @Override // com.bytedance.ies.p1191d.p1192a.AbstractC17124l
    /* renamed from: a */
    public final void mo27039a(JSONObject jSONObject) {
        C89219l.m154719c(jSONObject, "");
        m31666a(new C17147z(jSONObject));
    }

    public C17143x(AbstractC17125m mVar, AbstractC17126n nVar) {
        C89219l.m154719c(mVar, "");
        C89219l.m154719c(nVar, "");
        this.f40764c = mVar;
        this.f40763b = new WeakReference<>(nVar);
    }
}
