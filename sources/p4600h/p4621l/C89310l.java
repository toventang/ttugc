package p4600h.p4621l;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4604a.C89099b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: h.l.l */
public class C89310l {
    static {
        Covode.recordClassIndex(105394);
    }

    /* renamed from: h.l.l$a */
    public static final class C89311a implements AbstractC89306h<T> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89183m f202965a;

        static {
            Covode.recordClassIndex(105395);
        }

        @Override // p4600h.p4621l.AbstractC89306h
        /* renamed from: a */
        public final Iterator<T> mo2926a() {
            AbstractC89183m mVar = this.f202965a;
            C89219l.m154721d(mVar, "");
            C89307i iVar = new C89307i();
            iVar.f202961a = C89099b.m154607a(mVar, iVar, iVar);
            return iVar;
        }

        public C89311a(AbstractC89183m mVar) {
            this.f202965a = mVar;
        }
    }

    /* renamed from: a */
    public static final <T> AbstractC89306h<T> m154791a(AbstractC89183m<? super AbstractC89308j<? super T>, ? super AbstractC89124d<? super C89391z>, ? extends Object> mVar) {
        C89219l.m154721d(mVar, "");
        return new C89311a(mVar);
    }
}
