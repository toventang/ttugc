package com.p2082ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.property.C65391cd;
import com.p2082ss.android.ugc.aweme.record.AbstractC66811e;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import p4600h.p4611f.p4613b.C89219l;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.services.InternalMaxDurationResolverImpl */
public final class InternalMaxDurationResolverImpl implements AbstractC66811e {
    static {
        Covode.recordClassIndex(79653);
    }

    @Override // com.p2082ss.android.ugc.aweme.record.AbstractC66811e
    public final long resolveMaxDurationFor3MinWithMusic(ShortVideoContext shortVideoContext, long j) {
        C89219l.m154721d(shortVideoContext, "");
        return j;
    }

    @Override // com.p2082ss.android.ugc.aweme.record.AbstractC66811e
    public final long getMaxShootingDuration() {
        return MaxShootingDuration.INSTANCE.getLength();
    }

    @Override // com.p2082ss.android.ugc.aweme.record.AbstractC66811e
    public final long getMaxShootingDuration(boolean z, ShortVideoContext shortVideoContext) {
        C89219l.m154721d(shortVideoContext, "");
        if (z) {
            return 15000;
        }
        if (shortVideoContext.f155763X != 11) {
            return MaxShootingDuration.INSTANCE.getLength();
        }
        return C65391cd.m117088a();
    }
}
