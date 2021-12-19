package com.p2082ss.android.ugc.aweme.friends.widget.contact;

import androidx.recyclerview.widget.C1445j;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.friends.widget.contact.b */
public final class C51778b extends C1445j.AbstractC1451e<AbstractC51770a> {
    static {
        Covode.recordClassIndex(61143);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // androidx.recyclerview.widget.C1445j.AbstractC1451e
    /* renamed from: a */
    public final /* synthetic */ boolean mo4953a(AbstractC51770a aVar, AbstractC51770a aVar2) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        return C89219l.m154714a(aVar, aVar2);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // androidx.recyclerview.widget.C1445j.AbstractC1451e
    /* renamed from: b */
    public final /* synthetic */ boolean mo4954b(AbstractC51770a aVar, AbstractC51770a aVar2) {
        AbstractC51770a aVar3 = aVar;
        AbstractC51770a aVar4 = aVar2;
        C89219l.m154721d(aVar3, "");
        C89219l.m154721d(aVar4, "");
        if ((aVar3 instanceof C51781e) && (aVar4 instanceof C51781e)) {
            return C89219l.m154714a(((C51781e) aVar3).f119341b, ((C51781e) aVar4).f119341b);
        }
        if (!(aVar3 instanceof C51795h) || !(aVar4 instanceof C51795h)) {
            if (aVar3.f119323a == aVar4.f119323a) {
                return true;
            }
            return false;
        } else if (((C51795h) aVar3).f119361b == ((C51795h) aVar4).f119361b) {
            return true;
        } else {
            return false;
        }
    }
}
