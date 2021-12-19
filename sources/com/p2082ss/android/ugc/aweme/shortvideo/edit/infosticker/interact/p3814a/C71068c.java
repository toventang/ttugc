package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3814a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.editSticker.compile.C45859b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.C71076a;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.a.c */
public final /* synthetic */ class C71068c implements AbstractC1729g {

    /* renamed from: a */
    private final C71065a f159158a;

    static {
        Covode.recordClassIndex(83567);
    }

    public C71068c(C71065a aVar) {
        this.f159158a = aVar;
    }

    @Override // p077b.AbstractC1729g
    public final Object then(C1731i iVar) {
        C71065a aVar = this.f159158a;
        if (iVar.mo5545d() != null) {
            return new C71076a(((C71069d) aVar.f159182l).mo112299u(), (C45859b) iVar.mo5545d());
        }
        return null;
    }
}
