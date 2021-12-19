package com.p2082ss.android.ugc.aweme.tools.extract.video;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.C69831ai;
import com.p2082ss.android.ugc.aweme.tools.extract.C78507ab;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p077b.C1743j;

/* renamed from: com.ss.android.ugc.aweme.tools.extract.video.d */
public final /* synthetic */ class C78569d implements AbstractC1729g {

    /* renamed from: a */
    private final C78567b f176562a;

    /* renamed from: b */
    private final C69831ai f176563b;

    /* renamed from: c */
    private final Object f176564c;

    static {
        Covode.recordClassIndex(91703);
    }

    public C78569d(C78567b bVar, C69831ai aiVar, Object obj) {
        this.f176562a = bVar;
        this.f176563b = aiVar;
        this.f176564c = obj;
    }

    @Override // p077b.AbstractC1729g
    public final Object then(C1731i iVar) {
        C69831ai aiVar = this.f176563b;
        Object obj = this.f176564c;
        if (iVar.mo5544c()) {
            C78507ab.m137073a(aiVar, obj, (Integer) -1001, (Boolean) false, "");
        }
        C1743j jVar = new C1743j();
        C1731i.m5640b(new CallableC78572g(obj, jVar), C1731i.f5563b);
        return jVar.f5610a;
    }
}
