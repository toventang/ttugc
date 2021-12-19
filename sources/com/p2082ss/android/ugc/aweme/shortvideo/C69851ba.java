package com.p2082ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.AbstractC27242j;
import com.p2082ss.android.ugc.aweme.p2730de.C40971f;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3827b.C71427b;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ba */
final /* synthetic */ class C69851ba implements AbstractC88983w {

    /* renamed from: a */
    private final C69844av f156096a;

    /* renamed from: b */
    private final ShortVideoContext f156097b;

    /* renamed from: c */
    private final String f156098c;

    static {
        Covode.recordClassIndex(82259);
    }

    C69851ba(C69844av avVar, ShortVideoContext shortVideoContext, String str) {
        this.f156096a = avVar;
        this.f156097b = shortVideoContext;
        this.f156098c = str;
    }

    @Override // p4560f.p4561a.AbstractC88983w
    public final void subscribe(AbstractC88982v vVar) {
        C69844av avVar = this.f156096a;
        ShortVideoContext shortVideoContext = this.f156097b;
        String str = this.f156098c;
        C71427b.m126143a(shortVideoContext);
        if (avVar.f156075a.mo56984i()) {
            C40971f.m82489a("fail to stopRecord before goNext(Normal)");
        }
        vVar.mo143031a(AbstractC27242j.fromNullable(C69844av.m123414a(shortVideoContext, str)));
        vVar.mo143023a();
    }
}
