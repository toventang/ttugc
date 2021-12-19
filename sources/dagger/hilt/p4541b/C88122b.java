package dagger.hilt.p4541b;

import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1182af;
import com.bytedance.covode.number.Covode;
import p4600h.AbstractC89244h;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: dagger.hilt.b.b */
public final class C88122b<VM extends AbstractC1174ac> implements AbstractC89244h<VM> {

    /* renamed from: a */
    private VM f200022a;

    /* renamed from: b */
    private final AbstractC89277c<VM> f200023b;

    /* renamed from: c */
    private final AbstractC89171a<C1182af> f200024c;

    /* renamed from: d */
    private final AbstractC89171a<C1175ad.AbstractC1177b> f200025d;

    static {
        Covode.recordClassIndex(104150);
    }

    @Override // p4600h.AbstractC89244h
    public final boolean isInitialized() {
        if (this.f200022a != null) {
            return true;
        }
        return false;
    }

    @Override // p4600h.AbstractC89244h
    public final /* synthetic */ Object getValue() {
        VM vm = this.f200022a;
        if (vm != null) {
            return vm;
        }
        VM vm2 = (VM) new C1175ad(this.f200024c.invoke(), this.f200025d.invoke()).mo3983a(C89170a.m154665a(this.f200023b));
        this.f200022a = vm2;
        C89219l.m154709a((Object) vm2, "");
        return vm2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.a<? extends androidx.lifecycle.af> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.a<? extends androidx.lifecycle.ad$b> */
    /* JADX WARN: Multi-variable type inference failed */
    public C88122b(AbstractC89277c<VM> cVar, AbstractC89171a<? extends C1182af> aVar, AbstractC89171a<? extends C1175ad.AbstractC1177b> aVar2) {
        C89219l.m154719c(cVar, "");
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(aVar2, "");
        this.f200023b = cVar;
        this.f200024c = aVar;
        this.f200025d = aVar2;
    }
}
