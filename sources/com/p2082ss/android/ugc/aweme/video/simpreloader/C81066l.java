package com.p2082ss.android.ugc.aweme.video.simpreloader;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1733u.AbstractC23430a;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.aweme.video.preload.AbstractC80918i;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.video.simpreloader.l */
public final class C81066l implements AbstractC23430a {

    /* renamed from: a */
    private final AbstractC80918i f181185a;

    static {
        Covode.recordClassIndex(94387);
    }

    @Override // com.bytedance.p1733u.AbstractC23430a
    /* renamed from: a */
    public final String mo38198a() {
        return "CACHE";
    }

    @Override // com.bytedance.p1733u.AbstractC23430a
    /* renamed from: d */
    public final boolean mo38201d() {
        return false;
    }

    @Override // com.bytedance.p1733u.AbstractC23430a
    /* renamed from: b */
    public final boolean mo38199b() {
        this.f181185a.mo124078c();
        return true;
    }

    @Override // com.bytedance.p1733u.AbstractC23430a
    /* renamed from: c */
    public final File mo38200c() {
        return this.f181185a.mo124074b();
    }

    @Override // com.bytedance.p1733u.AbstractC23430a
    /* renamed from: e */
    public final long mo38202e() {
        File c = mo38200c();
        if (c == null || !c.exists()) {
            return 0;
        }
        return Math.max(C80720e.m139933d(c.getAbsolutePath()), 0L);
    }

    public C81066l(AbstractC80918i iVar) {
        this.f181185a = iVar;
    }
}
