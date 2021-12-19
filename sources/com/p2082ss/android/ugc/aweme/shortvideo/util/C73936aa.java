package com.p2082ss.android.ugc.aweme.shortvideo.util;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.property.C65395ch;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.aa */
public final class C73936aa {

    /* renamed from: a */
    private final ShortVideoContext f166014a;

    static {
        Covode.recordClassIndex(86686);
    }

    /* renamed from: a */
    public final boolean mo116384a() {
        if (!m130029b() || this.f166014a.f155827l == null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private final boolean m130029b() {
        if (!this.f166014a.mo110022c() && C65395ch.m117095a() && !this.f166014a.f155817b.mo109889b() && !this.f166014a.f155817b.mo109890c()) {
            return true;
        }
        return false;
    }

    public C73936aa(ShortVideoContext shortVideoContext) {
        C89219l.m154721d(shortVideoContext, "");
        this.f166014a = shortVideoContext;
    }
}
