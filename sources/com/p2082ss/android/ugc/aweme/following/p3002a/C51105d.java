package com.p2082ss.android.ugc.aweme.following.p3002a;

import androidx.recyclerview.widget.C1445j;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.friends.model.RecommendContact;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.following.a.d */
public final class C51105d extends C1445j.AbstractC1451e<Object> {
    static {
        Covode.recordClassIndex(60302);
    }

    @Override // androidx.recyclerview.widget.C1445j.AbstractC1451e
    /* renamed from: a */
    public final boolean mo4953a(Object obj, Object obj2) {
        C89219l.m154721d(obj, "");
        C89219l.m154721d(obj2, "");
        if (!(obj instanceof C51107f) || !(obj2 instanceof C51107f)) {
            if ((obj instanceof C51108g) && (obj2 instanceof C51108g)) {
                C51108g gVar = (C51108g) obj;
                C51108g gVar2 = (C51108g) obj2;
                if (gVar.f117933a != gVar2.f117933a || !C89219l.m154714a((Object) gVar.f117934b.getUid(), (Object) gVar2.f117934b.getUid())) {
                    return false;
                }
                return true;
            } else if (!(obj instanceof C51106e) || !(obj2 instanceof C51106e)) {
                if (!(obj instanceof RecommendContact) || !(obj2 instanceof RecommendContact)) {
                    return false;
                }
                return C89219l.m154714a(((RecommendContact) obj).getType(), ((RecommendContact) obj2).getType());
            } else if (((C51106e) obj).f117928a == ((C51106e) obj2).f117928a) {
                return true;
            } else {
                return false;
            }
        } else if (((C51107f) obj).f117931a == ((C51107f) obj2).f117931a) {
            return true;
        } else {
            return false;
        }
    }

    @Override // androidx.recyclerview.widget.C1445j.AbstractC1451e
    /* renamed from: b */
    public final boolean mo4954b(Object obj, Object obj2) {
        C89219l.m154721d(obj, "");
        C89219l.m154721d(obj2, "");
        if (!(obj instanceof C51107f) || !(obj2 instanceof C51107f)) {
            if ((obj instanceof C51108g) && (obj2 instanceof C51108g)) {
                C51108g gVar = (C51108g) obj;
                C51108g gVar2 = (C51108g) obj2;
                if (gVar.f117933a != gVar2.f117933a || !C89219l.m154714a(gVar.f117934b, gVar2.f117934b)) {
                    return false;
                }
                return true;
            } else if (!(obj instanceof C51106e) || !(obj2 instanceof C51106e)) {
                if (!(obj instanceof RecommendContact) || !(obj2 instanceof RecommendContact)) {
                    return false;
                }
                return C89219l.m154714a(((RecommendContact) obj).getType(), ((RecommendContact) obj2).getType());
            } else if (((C51106e) obj).f117928a == ((C51106e) obj2).f117928a) {
                return true;
            } else {
                return false;
            }
        } else if (((C51107f) obj).f117931a == ((C51107f) obj2).f117931a) {
            return true;
        } else {
            return false;
        }
    }
}
