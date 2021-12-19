package com.p2082ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.aa */
public final class C69752aa extends C74330z {

    /* renamed from: a */
    private final List<C74330z> f155885a = new ArrayList();

    static {
        Covode.recordClassIndex(82158);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.C74330z
    /* renamed from: a */
    public final void mo110116a() {
        for (C74330z zVar : new ArrayList(this.f155885a)) {
            zVar.mo110116a();
        }
        super.mo110116a();
    }

    /* renamed from: a */
    public final void mo110117a(C74330z zVar) {
        this.f155885a.add(zVar);
    }

    /* renamed from: b */
    public final void mo110118b(C74330z zVar) {
        this.f155885a.remove(zVar);
    }
}
