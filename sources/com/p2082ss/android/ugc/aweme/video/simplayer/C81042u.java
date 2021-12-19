package com.p2082ss.android.ugc.aweme.video.simplayer;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.video.config.C80716a;
import com.p2082ss.android.ugc.playerkit.model.C84209m;
import com.p2082ss.android.ugc.playerkit.model.C84223u;
import com.p2082ss.android.ugc.playerkit.p4321a.AbstractC84179d;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84241i;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.video.simplayer.u */
public final /* synthetic */ class C81042u implements AbstractC84179d {

    /* renamed from: a */
    private final boolean f181156a;

    /* renamed from: b */
    private final C84241i f181157b;

    /* renamed from: c */
    private final boolean f181158c;

    static {
        Covode.recordClassIndex(94361);
    }

    C81042u(boolean z, C84241i iVar, boolean z2) {
        this.f181156a = z;
        this.f181157b = iVar;
        this.f181158c = z2;
    }

    @Override // com.p2082ss.android.ugc.playerkit.p4321a.AbstractC84179d
    /* renamed from: a */
    public final Object mo124484a() {
        C84223u uVar;
        boolean z = this.f181156a;
        C84241i iVar = this.f181157b;
        boolean z2 = this.f181158c;
        if (z || !C80716a.C80717a.f180462a.mo123865b().PreloadProcessDataExperiment() || C81027s.f181143b == null || (uVar = C81027s.f181143b.get(iVar)) == null) {
            return C80716a.C80717a.f180462a.mo123864a().createVideoUrlProcessor().mo124207a(iVar, C84209m.EnumC84214e.TT, z, z2);
        }
        return uVar;
    }
}
