package com.p2082ss.android.ugc.aweme.simkit.impl.bitrateselector;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63032b;
import com.p2082ss.android.ugc.aweme.player.sdk.p3553b.C63059e;
import com.p2082ss.android.ugc.aweme.simkit.AbstractC74608c;
import com.p2082ss.android.ugc.aweme.simkit.AbstractC74616d;
import com.p2082ss.android.ugc.aweme.simkit.ISimKitConfig;
import com.p2082ss.android.ugc.aweme.simkit.api.ICommonConfig;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.simkit.impl.bitrateselector.g */
public final class C74654g implements AbstractC63032b {

    /* renamed from: a */
    private final String f167804a = "aweme/v1/play";

    /* renamed from: b */
    private final String f167805b = "aweme/v2/play";

    /* renamed from: c */
    private final boolean f167806c;

    /* renamed from: d */
    private final long f167807d;

    /* renamed from: e */
    private final long f167808e;

    static {
        Covode.recordClassIndex(87477);
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63033c
    /* renamed from: a */
    public final void mo101043a(int i, int i2, C63059e.C63060a aVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63032b
    /* renamed from: a */
    public final boolean mo101044a(int i, int i2, C63059e eVar) {
        return false;
    }

    public C74654g() {
        AbstractC74608c a = AbstractC74616d.m131036a();
        C89219l.m154709a((Object) a, "");
        ISimKitConfig b = a.mo117290b();
        C89219l.m154709a((Object) b, "");
        this.f167806c = b.getSimPlayerExperiment().enableCdnUrlExpiredExperiment();
        AbstractC74608c a2 = AbstractC74616d.m131036a();
        C89219l.m154709a((Object) a2, "");
        ISimKitConfig b2 = a2.mo117290b();
        C89219l.m154709a((Object) b2, "");
        this.f167807d = b2.getSimPlayerExperiment().cdnUrlExpiredOffset();
        AbstractC74608c a3 = AbstractC74616d.m131036a();
        C89219l.m154709a((Object) a3, "");
        ISimKitConfig b3 = a3.mo117290b();
        C89219l.m154709a((Object) b3, "");
        ICommonConfig commonConfig = b3.getCommonConfig();
        C89219l.m154709a((Object) commonConfig, "");
        this.f167808e = (long) commonConfig.getDefaultCDNTimeoutTime();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ab, code lost:
        if (p4600h.p4622m.C89361p.m154929e((java.lang.CharSequence) r1, (java.lang.CharSequence) r16.f167805b) != false) goto L_0x00ad;
     */
    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63032b
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo101045b(int r17, int r18, com.p2082ss.android.ugc.aweme.player.sdk.p3553b.C63059e r19) {
        /*
        // Method dump skipped, instructions count: 370
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.simkit.impl.bitrateselector.C74654g.mo101045b(int, int, com.ss.android.ugc.aweme.player.sdk.b.e):boolean");
    }
}
