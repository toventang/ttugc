package com.p2082ss.android.ugc.aweme.ttep.filter;

import androidx.appcompat.app.ActivityC0218d;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.filter.p942a.AbstractC14210a;
import com.bytedance.creativex.recorder.filter.p942a.C14212b;
import com.bytedance.creativex.recorder.filter.p943b.C14223a;
import com.bytedance.creativex.recorder.filter.p943b.C14225c;
import com.bytedance.p1559o.C21582f;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ttep.filter.TTEPFilterLogicComponent */
public final class TTEPFilterLogicComponent extends C14225c<AbstractC14210a> implements AbstractC14210a {
    static {
        Covode.recordClassIndex(92449);
    }

    @Override // com.bytedance.creativex.recorder.filter.p943b.C14225c, com.bytedance.creativex.recorder.filter.p942a.AbstractC14210a
    public final void setFilterChosen(FilterBean filterBean, String str, boolean z, boolean z2, boolean z3) {
        C89219l.m154721d(filterBean, "");
    }

    @Override // com.bytedance.creativex.recorder.filter.p943b.C14225c, com.bytedance.creativex.recorder.filter.p942a.AbstractC14210a
    public final void setFilterScroll(FilterBean filterBean, FilterBean filterBean2, float f) {
        C89219l.m154721d(filterBean, "");
        C89219l.m154721d(filterBean2, "");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TTEPFilterLogicComponent(C21582f fVar, ActivityC0218d dVar, C14225c.C14226a aVar, AbstractC89172b<? super C14212b, C14212b> bVar, AbstractC89171a<Boolean> aVar2, AbstractC89172b<? super C14223a, C89391z> bVar2) {
        super(fVar, dVar, aVar, bVar, aVar2, bVar2);
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(aVar, "");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TTEPFilterLogicComponent(C21582f fVar, ActivityC0218d dVar, C14225c.C14226a aVar, AbstractC89172b bVar, AbstractC89171a aVar2, AbstractC89172b bVar2, int i, C89214g gVar) {
        this(fVar, dVar, aVar, (i & 8) != 0 ? null : bVar, (i & 16) != 0 ? null : aVar2, (i & 32) == 0 ? bVar2 : null);
    }
}
