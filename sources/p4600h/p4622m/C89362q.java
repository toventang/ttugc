package p4600h.p4622m;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: h.m.q */
public class C89362q {
    static {
        Covode.recordClassIndex(105446);
    }

    /* renamed from: a */
    public static final <T> void m154851a(Appendable appendable, T t, AbstractC89172b<? super T, ? extends CharSequence> bVar) {
        C89219l.m154721d(appendable, "");
        if (bVar != null) {
            appendable.append((CharSequence) bVar.invoke(t));
        } else if (t == null || (t instanceof CharSequence)) {
            appendable.append(t);
        } else if (t instanceof Character) {
            appendable.append(t.charValue());
        } else {
            appendable.append(String.valueOf(t));
        }
    }
}
