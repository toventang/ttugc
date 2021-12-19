package com.p2082ss.android.ugc.aweme.notice.api.p3514e;

import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.IIMService;
import com.p2082ss.android.websocket.internal.AbstractC85632a;
import com.p2082ss.android.websocket.p4394a.p4397c.AbstractC85631b;
import com.p2082ss.android.websocket.p4394a.p4397c.C85630a;

/* renamed from: com.ss.android.ugc.aweme.notice.api.e.l */
public final class C61590l implements AbstractC85631b {

    /* renamed from: a */
    private final AbstractC85631b f139758a = new C61586h();

    /* renamed from: b */
    private final AbstractC85631b f139759b = new C61581c();

    /* renamed from: c */
    private final AbstractC85631b f139760c;

    /* renamed from: d */
    private final AbstractC85631b f139761d = new C61585g();

    /* renamed from: e */
    private final AbstractC85631b f139762e;

    /* renamed from: f */
    private final AbstractC85631b f139763f;

    /* renamed from: g */
    private final AbstractC85631b f139764g;

    /* renamed from: h */
    private final AbstractC85631b f139765h;

    /* renamed from: i */
    private final AbstractC85631b f139766i;

    /* renamed from: j */
    private final AbstractC85631b f139767j;

    /* renamed from: k */
    private SparseArray<AbstractC85631b> f139768k;

    static {
        Covode.recordClassIndex(72268);
    }

    public C61590l() {
        if (SettingsManager.m29616a().mo25400a("ws_check_anr_enable", true)) {
            this.f139760c = new C61574ab();
        } else {
            IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
            if (createIIMServicebyMonsterPlugin != null) {
                this.f139760c = createIIMServicebyMonsterPlugin.getImParser();
            } else {
                this.f139760c = new C85630a();
            }
        }
        this.f139762e = new C61582d();
        this.f139763f = new C61588j();
        this.f139768k = new SparseArray<>();
        this.f139764g = new C61589k();
        this.f139765h = new C61584f();
        this.f139766i = new C61572a();
        this.f139767j = new C61592n();
    }

    @Override // com.p2082ss.android.websocket.p4394a.p4397c.AbstractC85631b
    /* renamed from: a */
    public final Object mo92083a(AbstractC85632a aVar) {
        if (aVar.getMethod() == 1 && aVar.getService() == 1) {
            return this.f139758a.mo92083a(aVar);
        }
        if ((aVar.getMethod() == 1 && aVar.getService() == 5) || (aVar.getMethod() == 1 && aVar.getService() == 1015)) {
            return this.f139760c.mo92083a(aVar);
        }
        if (aVar.getMethod() == 1 && aVar.getService() == 6) {
            return this.f139759b.mo92083a(aVar);
        }
        if (aVar.getMethod() == 1 && aVar.getService() == 7) {
            return this.f139761d.mo92083a(aVar);
        }
        if (aVar.getMethod() == 1 && aVar.getService() == 1010) {
            return this.f139762e.mo92083a(aVar);
        }
        if (aVar.getMethod() == 1 && aVar.getService() == 20003) {
            return this.f139763f.mo92083a(aVar);
        }
        if (aVar.getMethod() == 2 && aVar.getService() == 6) {
            return this.f139764g.mo92083a(aVar);
        }
        if (aVar.getMethod() == 1778 && aVar.getService() == 1777) {
            return this.f139765h.mo92083a(aVar);
        }
        if ((aVar.getMethod() == 1 && aVar.getService() == 20164) || (aVar.getMethod() == 1 && aVar.getService() == 20047)) {
            return this.f139766i.mo92083a(aVar);
        }
        if (aVar.getMethod() == 1 && aVar.getService() == 50000) {
            return this.f139767j.mo92083a(aVar);
        }
        AbstractC85631b bVar = this.f139768k.get(aVar.getService());
        if (bVar != null) {
            return bVar.mo92083a(aVar);
        }
        return null;
    }
}
