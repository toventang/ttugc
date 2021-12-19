package com.bytedance.ies.p1191d.p1192a;

import com.bytedance.covode.number.Covode;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.d.a.b */
public abstract class AbstractC17107b implements AbstractC17125m {

    /* renamed from: a */
    public boolean f40710a = true;

    /* renamed from: b */
    public final String f40711b;

    /* renamed from: c */
    public final AbstractC17121j f40712c;

    /* renamed from: d */
    public final AbstractC17113e f40713d;

    static {
        Covode.recordClassIndex(19564);
    }

    @Override // com.bytedance.ies.p1191d.p1192a.AbstractC17125m
    /* renamed from: a */
    public final void mo26985a(String str) {
        C89219l.m154719c(str, "");
        if (this.f40710a) {
            this.f40712c.mo27033a(str);
        }
    }

    @Override // com.bytedance.ies.p1191d.p1192a.AbstractC17125m
    /* renamed from: b */
    public final List<C17144y> mo26986b(String str) {
        C89219l.m154719c(str, "");
        if (this.f40710a) {
            return this.f40712c.mo27035b(str);
        }
        return null;
    }

    @Override // com.bytedance.ies.p1191d.p1192a.AbstractC17125m
    /* renamed from: a */
    public final C17144y mo26984a(C17147z zVar, AbstractC17083aa aaVar) {
        C89219l.m154719c(zVar, "");
        C89219l.m154719c(aaVar, "");
        if (this.f40710a) {
            return this.f40712c.mo27032a(zVar, aaVar);
        }
        return this.f40712c.mo27034b(zVar, aaVar);
    }

    public AbstractC17107b(String str, AbstractC17121j jVar, AbstractC17113e eVar) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(jVar, "");
        C89219l.m154719c(eVar, "");
        this.f40711b = str;
        this.f40712c = jVar;
        this.f40713d = eVar;
    }
}
