package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import kotlinx.coroutines.internal.C89644j;
import kotlinx.coroutines.internal.C89646l;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: kotlinx.coroutines.cj */
public final class C89588cj extends C89644j implements AbstractC89563bu {
    static {
        Covode.recordClassIndex(105679);
    }

    @Override // kotlinx.coroutines.AbstractC89563bu
    public final C89588cj getList() {
        return this;
    }

    @Override // kotlinx.coroutines.AbstractC89563bu
    public final boolean isActive() {
        return true;
    }

    @Override // kotlinx.coroutines.internal.C89646l
    public final String toString() {
        if (C89527ar.f203244b) {
            return mo144146a("Active");
        }
        return super.toString();
    }

    /* renamed from: a */
    public final String mo144146a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("List{");
        sb.append(str);
        sb.append("}[");
        Object g = mo144190g();
        if (g != null) {
            boolean z = true;
            for (C89646l lVar = (C89646l) g; !C89219l.m154714a(lVar, this); lVar = lVar.mo144191h()) {
                if (lVar instanceof AbstractC89583ce) {
                    if (z) {
                        z = false;
                    } else {
                        sb.append(", ");
                    }
                    sb.append(lVar);
                }
            }
            sb.append("]");
            String sb2 = sb.toString();
            C89219l.m154709a((Object) sb2, "");
            return sb2;
        }
        throw new C89388w("null cannot be cast to non-null type");
    }
}
