package com.p2082ss.android.ugc.aweme.video.simplayer;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.video.config.C80716a;
import com.p2082ss.android.ugc.playerkit.p4321a.AbstractC84179d;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.video.simplayer.x */
public final /* synthetic */ class C81045x implements AbstractC84179d {

    /* renamed from: a */
    private final String f181161a;

    /* renamed from: b */
    private final boolean f181162b;

    /* renamed from: c */
    private final long f181163c;

    static {
        Covode.recordClassIndex(94364);
    }

    C81045x(String str, boolean z, long j) {
        this.f181161a = str;
        this.f181162b = z;
        this.f181163c = j;
    }

    @Override // com.p2082ss.android.ugc.playerkit.p4321a.AbstractC84179d
    /* renamed from: a */
    public final Object mo124484a() {
        return C80716a.C80717a.f180462a.mo123864a().getDashProcessUrlData(this.f181161a, this.f181162b, this.f181163c);
    }
}
