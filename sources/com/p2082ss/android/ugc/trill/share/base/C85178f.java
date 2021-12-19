package com.p2082ss.android.ugc.trill.share.base;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.p1733u.AbstractC23430a;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73955am;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import java.io.File;

/* renamed from: com.ss.android.ugc.trill.share.base.f */
public final class C85178f implements AbstractC23430a {

    /* renamed from: a */
    private final String f190592a = C73955am.m130069d(C17867d.m33078a());

    static {
        Covode.recordClassIndex(99222);
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
        C80720e.m139938e(this.f190592a);
        return true;
    }

    @Override // com.bytedance.p1733u.AbstractC23430a
    /* renamed from: c */
    public final File mo38200c() {
        return new File(this.f190592a);
    }

    @Override // com.bytedance.p1733u.AbstractC23430a
    /* renamed from: e */
    public final long mo38202e() {
        return C80720e.m139933d(this.f190592a);
    }
}
