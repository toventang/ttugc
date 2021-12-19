package com.p2082ss.android.ugc.aweme.servicimpl;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.AbstractC27242j;
import com.p2082ss.android.ugc.aweme.p2730de.C40971f;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3827b.C71427b;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;

/* renamed from: com.ss.android.ugc.aweme.servicimpl.o */
final /* synthetic */ class C67930o implements AbstractC88983w {

    /* renamed from: a */
    private final C67925j f152174a;

    /* renamed from: b */
    private final ShortVideoContext f152175b;

    /* renamed from: c */
    private final String f152176c;

    static {
        Covode.recordClassIndex(80099);
    }

    C67930o(C67925j jVar, ShortVideoContext shortVideoContext, String str) {
        this.f152174a = jVar;
        this.f152175b = shortVideoContext;
        this.f152176c = str;
    }

    @Override // p4560f.p4561a.AbstractC88983w
    public final void subscribe(AbstractC88982v vVar) {
        C67925j jVar = this.f152174a;
        ShortVideoContext shortVideoContext = this.f152175b;
        String str = this.f152176c;
        C71427b.m126143a(shortVideoContext);
        if (jVar.f152153a.mo56984i()) {
            C40971f.m82489a("fail to stopRecord before goNext(Normal)");
        }
        vVar.mo143031a(AbstractC27242j.fromNullable(C67925j.m120204a(shortVideoContext, str)));
        vVar.mo143023a();
    }
}
