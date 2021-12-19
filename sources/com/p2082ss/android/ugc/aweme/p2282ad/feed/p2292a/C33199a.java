package com.p2082ss.android.ugc.aweme.p2282ad.feed.p2292a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.p2292a.AbstractC33200b;
import com.p2082ss.android.ugc.aweme.video.AbstractC80747i;
import com.p2082ss.android.ugc.aweme.video.C81079v;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ad.feed.a.a */
public final class C33199a extends AbstractC33200b {

    /* renamed from: d */
    private long f78891d = -1;

    /* renamed from: e */
    private volatile boolean f78892e;

    static {
        Covode.recordClassIndex(40022);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.p2292a.AbstractC33200b
    /* renamed from: a */
    public final long mo59124a() {
        return this.f78891d;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.p2292a.AbstractC33200b
    /* renamed from: b */
    public final void mo59129b() {
        this.f78891d = -1;
        this.f78892e = false;
        C89219l.m154721d("reset", "");
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.p2292a.AbstractC33200b
    /* renamed from: a */
    public final void mo59126a(boolean z) {
        this.f78892e = z;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.p2292a.AbstractC33200b
    /* renamed from: a */
    public final boolean mo59127a(Aweme aweme) {
        if (!AbstractC33200b.C33201a.m68064a(aweme) || this.f78891d < 0 || !this.f78892e) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.p2292a.AbstractC33200b
    /* renamed from: a */
    public final void mo59125a(Aweme aweme, boolean z) {
        String aid;
        String str;
        long n;
        if (AbstractC33200b.C33201a.m68064a(aweme)) {
            String str2 = null;
            if (aweme != null && (aid = aweme.getAid()) != null && aid.length() != 0) {
                if (aweme != null) {
                    str = aweme.getAid();
                } else {
                    str = null;
                }
                AbstractC80747i O = C81079v.m140776O();
                C89219l.m154716b(O, "");
                VideoUrlModel q = O.mo123894q();
                if (q != null) {
                    str2 = q.getSourceId();
                }
                if (C89219l.m154714a((Object) str, (Object) str2)) {
                    if (z) {
                        n = 0;
                    } else {
                        AbstractC80747i O2 = C81079v.m140776O();
                        C89219l.m154716b(O2, "");
                        n = O2.mo123891n();
                    }
                    this.f78891d = n;
                    C89219l.m154721d("savePausePosition, mPausePositon:" + this.f78891d, "");
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.p2292a.AbstractC33200b
    /* renamed from: a */
    public final boolean mo59128a(Aweme aweme, int i) {
        boolean z;
        if (!AbstractC33200b.C33201a.m68064a(aweme)) {
            return false;
        }
        AbstractC80747i O = C81079v.m140776O();
        if (aweme != null) {
            C89219l.m154716b(O, "");
            if (O.mo123894q() != null && i <= 0) {
                String aid = aweme.getAid();
                VideoUrlModel q = O.mo123894q();
                C89219l.m154716b(q, "");
                boolean z2 = !TextUtils.equals(aid, q.getSourceId());
                if (AbstractC33200b.f78893a || AbstractC33200b.f78894b) {
                    String aid2 = aweme.getAid();
                    VideoUrlModel q2 = O.mo123894q();
                    C89219l.m154716b(q2, "");
                    if (TextUtils.equals(aid2, q2.getSourceId())) {
                        z = true;
                        if (!z2 || z) {
                            return true;
                        }
                        return false;
                    }
                }
                z = false;
                if (!z2) {
                }
                return true;
            }
        }
        return false;
    }
}
