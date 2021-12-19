package com.p2082ss.android.ugc.aweme.video.simkit.p4219a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.playerkit.p3555a.AbstractC63101e;
import com.p2082ss.android.ugc.aweme.playerkit.p3555a.C63102f;
import com.p2082ss.android.ugc.aweme.request_combine.common.ServerPortraitCollections;
import com.p2082ss.android.ugc.aweme.requestcombine.IServerPortraitService;
import com.p2082ss.android.ugc.aweme.simkit.config.p3907a.C74610a;
import com.p2082ss.android.ugc.aweme.video.simkit.p4219a.p4220a.p4221a.AbstractC80969a;
import com.p2082ss.android.ugc.aweme.video.simkit.p4219a.p4220a.p4221a.AbstractC80971b;
import com.p2082ss.android.ugc.aweme.video.simkit.p4219a.p4220a.p4221a.AbstractC80973c;
import com.p2082ss.android.ugc.aweme.video.simkit.p4219a.p4220a.p4221a.AbstractC80975d;
import com.p2082ss.android.ugc.aweme.video.simkit.p4219a.p4223b.C80984a;

/* renamed from: com.ss.android.ugc.aweme.video.simkit.a.a */
public final class C80968a extends C74610a {

    /* renamed from: a */
    private C63102f f181008a;

    static {
        Covode.recordClassIndex(94278);
    }

    @Override // com.p2082ss.android.ugc.aweme.simkit.config.p3907a.C74610a, com.p2082ss.android.ugc.aweme.simkit.api.IDimensionBitrateCurveConfig
    /* renamed from: a */
    public final boolean mo117320a() {
        return AbstractC80971b.C80972a.f181011a;
    }

    @Override // com.p2082ss.android.ugc.aweme.simkit.config.p3907a.C74610a, com.p2082ss.android.ugc.aweme.simkit.api.IDimensionBitrateCurveConfig
    /* renamed from: b */
    public final C63102f mo117321b() {
        IServerPortraitService d = ServerPortraitCollections.m118773d();
        if (this.f181008a == null) {
            C63102f.C63104b bVar = new C63102f.C63104b();
            bVar.f143414a = AbstractC80973c.C80974a.f181013a;
            bVar.f143415b = AbstractC80969a.C80970a.f181010a;
            bVar.f143416c = d.mo105954a();
            bVar.f143418e = AbstractC80975d.C80976a.f181015a;
            AbstractC63101e[] eVarArr = C80984a.f181022a;
            for (AbstractC63101e eVar : eVarArr) {
                if (!bVar.f143419f.contains(eVar)) {
                    bVar.f143419f.add(eVar);
                }
            }
            if ((bVar.f143414a == null || bVar.f143414a.mo46684a() == 0) && ((bVar.f143415b == null || bVar.f143415b.mo46684a() == 0) && C63102f.C63104b.m114037a())) {
                throw new RuntimeException("globalConditionListJson/additionalConditionListJson must not be null at the same time!");
            } else if ((bVar.f143418e == null || bVar.f143418e.mo46684a() == 0) && C63102f.C63104b.m114037a()) {
                throw new RuntimeException("priorityList must not be null!");
            } else {
                C63102f fVar = new C63102f(bVar.f143414a, bVar.f143415b, bVar.f143416c, bVar.f143418e, bVar.f143419f, (byte) 0);
                fVar.f143405d = bVar.f143417d;
                this.f181008a = fVar;
            }
        }
        this.f181008a.f143404c = d.mo105954a();
        return this.f181008a;
    }
}
