package com.p2082ss.android.ugc.aweme.simkit.impl.bitrateselector;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63032b;
import com.p2082ss.android.ugc.aweme.player.sdk.p3553b.C63059e;
import com.p2082ss.android.ugc.aweme.simkit.impl.bitrateselector.C74648d;
import com.p2082ss.android.ugc.playerkit.session.C84229a;
import com.p2082ss.android.ugc.playerkit.session.Session;
import com.p2082ss.android.ugc.playerkit.videoview.p4326a.C84254d;

/* renamed from: com.ss.android.ugc.aweme.simkit.impl.bitrateselector.i */
public final class C74656i implements AbstractC63032b {
    static {
        Covode.recordClassIndex(87479);
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63032b
    /* renamed from: a */
    public final boolean mo101044a(int i, int i2, C63059e eVar) {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63032b
    /* renamed from: b */
    public final boolean mo101045b(int i, int i2, C63059e eVar) {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63033c
    /* renamed from: a */
    public final void mo101043a(int i, int i2, C63059e.C63060a aVar) {
        if (aVar != null && !aVar.f143268q) {
            Session c = C84229a.f188297a.mo129052c(aVar.f143265n);
            if (c != null) {
                c.sourceId = aVar.f143265n;
                c.speed = aVar.f143266o;
                c.bitrate = aVar.f143252a;
                c.calcBitrate = aVar.f143269r;
            }
            if (aVar.f143265n != null) {
                C84229a aVar2 = C84229a.f188297a;
                String str = aVar.f143265n;
                C84254d dVar = new C84254d();
                dVar.f188436e = aVar.f143271t;
                dVar.f183437d = aVar.f143269r;
                dVar.f183436c = aVar.f143270s;
                dVar.f183434a = new C74648d.C74649a.C74650a(aVar);
                aVar2.mo129048a(str, dVar);
            }
            C84229a.f188297a.mo129049a(aVar.f143256e, aVar.f143258g);
        }
    }
}
