package com.bytedance.ies.xelement.defaultimpl.player.engine.p1369a.p1371b.p1373b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.C19194c;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19159d;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19161f;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19166k;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.C19169n;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.EnumC19157b;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.EnumC19167l;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.EnumC19170o;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.EnumC19172q;
import com.bytedance.ies.xelement.defaultimpl.player.engine.p1369a.p1371b.C19069a;
import com.bytedance.ies.xelement.defaultimpl.player.engine.p1369a.p1371b.C19106d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.b.b.a */
public final class C19103a implements AbstractC19159d, AbstractC19161f, AbstractC19166k {

    /* renamed from: a */
    public C19194c f45230a;

    /* renamed from: b */
    private C19194c f45231b;

    /* renamed from: c */
    private C19194c f45232c;

    /* renamed from: d */
    private C19194c f45233d;

    /* renamed from: e */
    private final C19069a f45234e;

    static {
        Covode.recordClassIndex(21866);
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19159d
    /* renamed from: a */
    public final void mo30453a(long j) {
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19159d
    /* renamed from: a */
    public final void mo30456a(C19169n nVar) {
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19161f
    /* renamed from: b */
    public final C19169n mo30465b(C19169n nVar) {
        return nVar;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19159d
    /* renamed from: b */
    public final void mo30459b() {
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19159d
    /* renamed from: b */
    public final void mo30460b(long j) {
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19159d
    /* renamed from: d */
    public final void mo30462d() {
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19159d
    /* renamed from: e */
    public final void mo30463e() {
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19161f
    /* renamed from: f */
    public final boolean mo30469f() {
        return false;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19166k
    /* renamed from: g */
    public final C19194c mo30402g() {
        return this.f45230a;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19161f
    /* renamed from: c */
    public final boolean mo30467c(C19194c cVar) {
        this.f45232c = cVar;
        return false;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19161f
    /* renamed from: d */
    public final boolean mo30468d(C19194c cVar) {
        this.f45233d = cVar;
        return false;
    }

    public C19103a(C19069a aVar) {
        C89219l.m154719c(aVar, "");
        this.f45234e = aVar;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19159d
    /* renamed from: a */
    public final void mo30454a(EnumC19157b bVar) {
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(bVar, "");
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19159d
    /* renamed from: a */
    public final void mo30455a(EnumC19167l lVar) {
        C89219l.m154719c(lVar, "");
        C89219l.m154719c(lVar, "");
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19161f
    /* renamed from: b */
    public final boolean mo30466b(C19194c cVar) {
        this.f45230a = cVar;
        return false;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19159d
    /* renamed from: a */
    public final void mo30457a(EnumC19170o oVar) {
        C89219l.m154719c(oVar, "");
        C89219l.m154719c(oVar, "");
        if (oVar == EnumC19170o.PLAYBACK_STATE_STOPPED) {
            C19106d h = this.f45234e.mo30419h();
            if (h.f45239a != null && h.mo30470a().mo30440j()) {
                this.f45233d = new C19194c("STOP_FROM_PLAY_COMPLETION");
            }
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19159d
    /* renamed from: a */
    public final void mo30458a(EnumC19172q qVar) {
        C89219l.m154719c(qVar, "");
        C89219l.m154719c(qVar, "");
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19161f
    /* renamed from: a */
    public final boolean mo30464a(C19194c cVar) {
        this.f45231b = cVar;
        return false;
    }
}
