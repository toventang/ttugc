package com.p2082ss.android.ugc.aweme.tools.beauty.impl.view;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4088c.AbstractC77872c;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.AbstractC77967m;
import com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78049b;
import com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78056f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.impl.view.f */
public final class C78011f {

    /* renamed from: a */
    public AbstractC77967m f175002a;

    /* renamed from: b */
    public C77988a f175003b;

    /* renamed from: c */
    public AbstractC78056f.AbstractC78058b f175004c;

    /* renamed from: d */
    public AbstractC77872c f175005d;

    static {
        Covode.recordClassIndex(91101);
    }

    /* renamed from: a */
    public final void mo121715a(BeautyCategory beautyCategory) {
        C89219l.m154721d(beautyCategory, "");
        C77988a aVar = this.f175003b;
        if (aVar != null) {
            C89219l.m154721d(beautyCategory, "");
            AbstractC78049b bVar = aVar.f174956a;
            if (bVar != null) {
                bVar.mo121777a(beautyCategory);
            }
        }
        AbstractC78056f.AbstractC78058b bVar2 = this.f175004c;
        if (bVar2 != null) {
            bVar2.mo22668a(beautyCategory);
        }
    }

    public C78011f(AbstractC77967m mVar, C77988a aVar, AbstractC78056f.AbstractC78058b bVar, AbstractC77872c cVar) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(cVar, "");
        this.f175002a = mVar;
        this.f175003b = aVar;
        this.f175004c = bVar;
        this.f175005d = cVar;
    }
}
