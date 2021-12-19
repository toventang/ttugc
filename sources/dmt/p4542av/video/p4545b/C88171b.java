package dmt.p4542av.video.p4545b;

import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.editor.preview.AbstractC14088a;
import com.p2082ss.android.ugc.asve.editor.AbstractC31077h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: dmt.av.video.b.b */
public final class C88171b implements AbstractC88175e {

    /* renamed from: a */
    public static final C88172a f200124a = new C88172a((byte) 0);

    /* renamed from: b */
    private final List<AbstractC88174d> f200125b = new ArrayList();

    static {
        Covode.recordClassIndex(104206);
    }

    /* renamed from: dmt.av.video.b.b$a */
    public static final class C88172a {
        static {
            Covode.recordClassIndex(104207);
        }

        private C88172a() {
        }

        public /* synthetic */ C88172a(byte b) {
            this();
        }
    }

    @Override // dmt.p4542av.video.p4545b.AbstractC88175e
    /* renamed from: a */
    public final AbstractC31077h mo142715a(AbstractC14088a aVar) {
        T t;
        AbstractC31077h a;
        C89219l.m154721d(aVar, "");
        Iterator<T> it = this.f200125b.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (t.mo142717a(aVar) != null) {
                break;
            }
        }
        T t2 = t;
        if (t2 == null || (a = t2.mo142717a(aVar)) == null) {
            return new C88173c().mo142717a(aVar);
        }
        return a;
    }

    @Override // dmt.p4542av.video.p4545b.AbstractC88175e
    /* renamed from: a */
    public final void mo142716a(AbstractC88174d dVar, int i) {
        C89219l.m154721d(dVar, "");
        if (i >= 0) {
            this.f200125b.add(i, dVar);
        } else {
            this.f200125b.add(dVar);
        }
    }
}
