package com.p2082ss.android.ugc.aweme.share.improve.p3755a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3252c.C56216k;
import com.p2082ss.android.ugc.aweme.p3070im.service.share.AbstractC56262a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.o */
public final class C69089o extends C69083k implements AbstractC56262a {

    /* renamed from: b */
    private final Aweme f154526b;

    /* renamed from: c */
    private final String f154527c;

    /* renamed from: d */
    private final String f154528d;

    static {
        Covode.recordClassIndex(81403);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h, com.p2082ss.android.ugc.aweme.share.improve.p3755a.C69083k
    /* renamed from: b */
    public final int mo61918b() {
        if (C56216k.m102132b()) {
            return R.string.bdl;
        }
        return super.mo61918b();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69089o(Aweme aweme, String str, String str2) {
        super(aweme, str, str2);
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f154526b = aweme;
        this.f154527c = str;
        this.f154528d = str2;
    }
}
