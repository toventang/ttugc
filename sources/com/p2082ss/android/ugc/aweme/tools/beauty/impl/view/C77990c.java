package com.p2082ss.android.ugc.aweme.tools.beauty.impl.view;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4088c.AbstractC77873d;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4088c.AbstractC77874e;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.AbstractC77967m;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.C77903b;
import com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78049b;
import com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78056f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.impl.view.c */
public final class C77990c {

    /* renamed from: a */
    public AbstractC77967m f174963a;

    /* renamed from: b */
    public AbstractC78056f.AbstractC78058b f174964b;

    /* renamed from: c */
    public AbstractC78056f.AbstractC78057a f174965c;

    /* renamed from: d */
    C78012g f174966d;

    /* renamed from: e */
    private C77988a f174967e;

    static {
        Covode.recordClassIndex(91080);
    }

    /* renamed from: b */
    public final C77903b mo121683b() {
        return this.f174963a.mo121615g();
    }

    /* renamed from: a */
    public final void mo121677a() {
        AbstractC77873d dVar = (AbstractC77873d) this.f174966d.mo121716a(AbstractC77873d.class);
        if (dVar != null) {
            dVar.mo121497b();
        }
    }

    /* renamed from: c */
    public final void mo121686c(ComposerBeauty composerBeauty) {
        C77988a aVar = this.f174967e;
        if (aVar != null) {
            aVar.mo121674a(composerBeauty);
        }
    }

    /* renamed from: b */
    public final boolean mo121685b(String str) {
        C89219l.m154721d(str, "");
        return this.f174963a.mo121604b(str);
    }

    /* renamed from: d */
    public final String mo121687d(ComposerBeauty composerBeauty) {
        C89219l.m154721d(composerBeauty, "");
        return this.f174963a.mo121618h(composerBeauty);
    }

    /* renamed from: e */
    public final void mo121688e(ComposerBeauty composerBeauty) {
        C89219l.m154721d(composerBeauty, "");
        this.f174963a.mo121606c(composerBeauty);
    }

    /* renamed from: a */
    public final void mo121678a(ComposerBeauty composerBeauty) {
        C89219l.m154721d(composerBeauty, "");
        AbstractC78056f.AbstractC78058b bVar = this.f174964b;
        if (bVar != null) {
            bVar.mo22665a(composerBeauty);
        }
    }

    /* renamed from: b */
    public final void mo121684b(ComposerBeauty composerBeauty) {
        C89219l.m154721d(composerBeauty, "");
        C77988a aVar = this.f174967e;
        if (aVar != null) {
            C89219l.m154721d(composerBeauty, "");
            AbstractC78049b bVar = aVar.f174956a;
            if (bVar != null) {
                bVar.mo121776a(composerBeauty);
            }
        }
    }

    /* renamed from: a */
    public final void mo121679a(String str) {
        C89219l.m154721d(str, "");
        C77988a aVar = this.f174967e;
        if (aVar != null) {
            C89219l.m154721d(str, "");
            AbstractC78049b bVar = aVar.f174956a;
            if (bVar != null) {
                bVar.mo121782b(str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo121681a(boolean z) {
        AbstractC77874e eVar = (AbstractC77874e) this.f174966d.mo121716a(AbstractC77874e.class);
        if (eVar != null) {
            eVar.mo121501a(z);
        }
    }

    /* renamed from: a */
    public final void mo121680a(String str, boolean z) {
        C89219l.m154721d(str, "");
        this.f174963a.mo121593a(str, z);
    }

    /* renamed from: a */
    public final int[] mo121682a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        AbstractC78056f.AbstractC78057a aVar = this.f174965c;
        if (aVar != null) {
            return aVar.mo121552a(str, str2);
        }
        return null;
    }

    public C77990c(AbstractC77967m mVar, AbstractC78056f.AbstractC78058b bVar, AbstractC78056f.AbstractC78057a aVar, C77988a aVar2, C78012g gVar) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(gVar, "");
        this.f174963a = mVar;
        this.f174964b = bVar;
        this.f174965c = aVar;
        this.f174967e = aVar2;
        this.f174966d = gVar;
    }
}
