package com.p2082ss.android.ugc.aweme.simkit.impl.bitrateselector;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63032b;
import com.p2082ss.android.ugc.aweme.player.sdk.p3553b.C63059e;
import java.util.List;
import p4600h.p4601a.C89070n;

/* renamed from: com.ss.android.ugc.aweme.simkit.impl.bitrateselector.c */
public final class C74647c implements AbstractC63032b {

    /* renamed from: a */
    public static final C74647c f167791a = new C74647c();

    /* renamed from: b */
    private static final List<AbstractC63032b> f167792b = C89070n.m154524c(new C74664q(), new C74659l(), new C74670u(), new C74654g(), new C74671v(), new C74656i());

    private C74647c() {
    }

    static {
        Covode.recordClassIndex(87470);
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63033c
    /* renamed from: a */
    public final void mo101043a(int i, int i2, C63059e.C63060a aVar) {
        for (AbstractC63032b bVar : f167792b) {
            bVar.mo101043a(i, i2, aVar);
        }
        if (aVar != null) {
            Integer.valueOf(aVar.f143252a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63032b
    /* renamed from: b */
    public final boolean mo101045b(int i, int i2, C63059e eVar) {
        for (AbstractC63032b bVar : f167792b) {
            if (bVar.mo101045b(i, i2, eVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63032b
    /* renamed from: a */
    public final boolean mo101044a(int i, int i2, C63059e eVar) {
        for (AbstractC63032b bVar : f167792b) {
            if (bVar.mo101044a(i, i2, eVar)) {
                return true;
            }
        }
        return false;
    }
}
