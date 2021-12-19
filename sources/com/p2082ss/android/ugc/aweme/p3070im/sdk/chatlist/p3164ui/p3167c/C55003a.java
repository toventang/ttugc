package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3164ui.p3167c;

import androidx.recyclerview.widget.C1445j;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.focused.p3152ui.p3153a.C54899b;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3261k.AbstractC56237a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.ui.c.a */
public final class C55003a extends C1445j.AbstractC1451e<AbstractC56237a> {
    static {
        Covode.recordClassIndex(64729);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // androidx.recyclerview.widget.C1445j.AbstractC1451e
    /* renamed from: a */
    public final /* synthetic */ boolean mo4953a(AbstractC56237a aVar, AbstractC56237a aVar2) {
        AbstractC56237a aVar3 = aVar;
        AbstractC56237a aVar4 = aVar2;
        C89219l.m154721d(aVar3, "");
        C89219l.m154721d(aVar4, "");
        return C89219l.m154714a((Object) aVar3.bL_(), (Object) aVar4.bL_());
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // androidx.recyclerview.widget.C1445j.AbstractC1451e
    /* renamed from: b */
    public final /* synthetic */ boolean mo4954b(AbstractC56237a aVar, AbstractC56237a aVar2) {
        AbstractC56237a aVar3 = aVar;
        AbstractC56237a aVar4 = aVar2;
        C89219l.m154721d(aVar3, "");
        C89219l.m154721d(aVar4, "");
        if (!(aVar3 instanceof C54899b) || !(aVar4 instanceof C54899b)) {
            return C89219l.m154714a(aVar3, aVar4);
        }
        if (aVar3.f128238q == aVar4.f128238q && aVar3.f128239r == aVar4.f128239r) {
            return true;
        }
        return false;
    }
}
