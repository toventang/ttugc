package com.p2082ss.android.ugc.aweme.video.preload.enginepreloader;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.video.preload.api.AbstractC80859l;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84241i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.video.preload.enginepreloader.i */
public final class C80902i implements AbstractC80897f {

    /* renamed from: a */
    EnumC80913n f180894a = EnumC80913n.Busy;

    /* renamed from: b */
    final C80898g f180895b;

    /* renamed from: c */
    private C84241i f180896c;

    static {
        Covode.recordClassIndex(94201);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.enginepreloader.AbstractC80897f
    /* renamed from: a */
    public final void mo124294a() {
        this.f180896c = null;
        m140379a(EnumC80913n.Busy);
    }

    public C80902i(AbstractC80859l lVar) {
        this.f180895b = new C80898g(lVar);
    }

    /* renamed from: a */
    private final void m140379a(EnumC80913n nVar) {
        MethodCollector.m26663i(76);
        if (nVar == this.f180894a) {
            MethodCollector.m26664o(76);
            return;
        }
        synchronized (this) {
            try {
                this.f180894a = nVar;
                if (nVar == EnumC80913n.Busy) {
                    this.f180895b.mo124299c();
                } else if (nVar == EnumC80913n.Idle) {
                    this.f180895b.mo124298b();
                }
            } finally {
                MethodCollector.m26664o(76);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.enginepreloader.AbstractC80897f
    /* renamed from: a */
    public final void mo124295a(C84241i iVar, int i) {
        C89219l.m154719c(iVar, "");
        String dashVideoId = iVar.getDashVideoId();
        if (dashVideoId != null) {
            dashVideoId.length();
        }
        iVar.getSourceId();
        if (this.f180895b.mo124297a(iVar)) {
            this.f180895b.mo124295a(iVar, i);
            return;
        }
        this.f180896c = iVar;
        m140379a(EnumC80913n.Busy);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.enginepreloader.AbstractC80897f
    /* renamed from: a */
    public final void mo124296a(C84241i iVar, EnumC80893b bVar) {
        C89219l.m154719c(iVar, "");
        C89219l.m154719c(bVar, "");
        iVar.getSourceId();
        if (this.f180895b.mo124297a(iVar)) {
            this.f180895b.mo124296a(iVar, bVar);
        } else if (C89219l.m154714a(iVar, this.f180896c)) {
            this.f180896c = null;
            m140379a(EnumC80913n.Idle);
        }
    }
}
