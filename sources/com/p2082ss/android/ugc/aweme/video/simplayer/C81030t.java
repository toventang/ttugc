package com.p2082ss.android.ugc.aweme.video.simplayer;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81964c;
import com.p2082ss.android.ugc.playerkit.p4321a.AbstractC84179d;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84241i;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.video.simplayer.t */
public final /* synthetic */ class C81030t implements AbstractC84179d {

    /* renamed from: a */
    private final C84241i f181148a;

    static {
        Covode.recordClassIndex(94348);
    }

    C81030t(C84241i iVar) {
        this.f181148a = iVar;
    }

    @Override // com.p2082ss.android.ugc.playerkit.p4321a.AbstractC84179d
    /* renamed from: a */
    public final Object mo124484a() {
        Integer valueOf;
        C84241i iVar = this.f181148a;
        int i = -1;
        if (iVar != null) {
            AbstractC81964c hitBitrate = iVar.getHitBitrate();
            if (hitBitrate == null || (valueOf = Integer.valueOf(hitBitrate.getQualityType())) == null) {
                valueOf = -1;
            }
            i = valueOf.intValue();
        }
        return Integer.valueOf(i);
    }
}
