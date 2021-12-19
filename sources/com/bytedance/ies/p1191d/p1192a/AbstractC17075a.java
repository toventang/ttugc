package com.bytedance.ies.p1191d.p1192a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1191d.p1192a.AbstractC17107b;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.d.a.a */
public abstract class AbstractC17075a<T extends AbstractC17107b> {

    /* renamed from: a */
    public AbstractC17115g f40634a;

    /* renamed from: b */
    public Executor f40635b;

    /* renamed from: c */
    public AbstractC17117i f40636c;

    /* renamed from: d */
    public AbstractC17114f f40637d;

    /* renamed from: e */
    public List<? extends AbstractC17129p> f40638e;

    /* renamed from: f */
    public AbstractC17116h f40639f;

    /* renamed from: g */
    public AbstractC17122k f40640g;

    /* renamed from: h */
    public boolean f40641h;

    /* renamed from: i */
    public int f40642i = 32;

    /* renamed from: j */
    public WeakReference<AbstractC89171a<C89391z>> f40643j;

    /* renamed from: k */
    public Map<String, AbstractC89171a<Boolean>> f40644k;

    /* renamed from: l */
    private final String f40645l;

    static {
        Covode.recordClassIndex(19532);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo26983a(String str, AbstractC17121j jVar, AbstractC17113e eVar);

    /* renamed from: a */
    public final T mo26982a() {
        AbstractC17114f fVar = this.f40637d;
        if (fVar != null) {
            AbstractC17117i iVar = this.f40636c;
            if (iVar != null) {
                Executor executor = this.f40635b;
                if (executor != null) {
                    AbstractC17122k kVar = this.f40640g;
                    if (kVar != null) {
                        C89219l.m154719c(kVar, "");
                        C17130q.f40738a = kVar;
                    }
                    C17108c cVar = new C17108c(executor, fVar, this.f40639f);
                    C17084ab abVar = new C17084ab(this.f40634a, iVar, executor, this.f40642i);
                    T a = mo26983a(this.f40645l, new C17139w(abVar, cVar, this.f40639f, this.f40644k, this.f40638e, this.f40643j), cVar);
                    if (this.f40641h) {
                        String str = this.f40645l + "@" + a.hashCode();
                        C89219l.m154719c(str, "");
                        cVar.f40717d = str;
                        cVar.f40716c = true;
                        C17098ah<String, C17144y> ahVar = abVar.f40654a;
                        C89219l.m154719c(str, "");
                        C89219l.m154719c(ahVar, "");
                        ((ConcurrentHashMap) C17136v.f40748b.getValue()).put(str, ahVar);
                    }
                    return a;
                }
                throw new IllegalStateException("workerExecutor must be provided.".toString());
            }
            throw new IllegalStateException("networkExecutor must be provided.".toString());
        }
        throw new IllegalStateException("configProvider must be provided.".toString());
    }

    /* renamed from: a */
    public final AbstractC17075a<T> mo26976a(AbstractC17114f fVar) {
        C89219l.m154719c(fVar, "");
        this.f40637d = fVar;
        return this;
    }

    public AbstractC17075a(String str) {
        C89219l.m154719c(str, "");
        this.f40645l = str;
    }

    /* renamed from: a */
    public final AbstractC17075a<T> mo26977a(AbstractC17115g gVar) {
        C89219l.m154719c(gVar, "");
        this.f40634a = gVar;
        return this;
    }

    /* renamed from: a */
    public final AbstractC17075a<T> mo26978a(AbstractC17116h hVar) {
        C89219l.m154719c(hVar, "");
        this.f40639f = hVar;
        return this;
    }

    /* renamed from: a */
    public final AbstractC17075a<T> mo26979a(AbstractC17117i iVar) {
        C89219l.m154719c(iVar, "");
        this.f40636c = iVar;
        return this;
    }

    /* renamed from: a */
    public final AbstractC17075a<T> mo26980a(AbstractC17122k kVar) {
        C89219l.m154719c(kVar, "");
        this.f40640g = kVar;
        return this;
    }

    /* renamed from: a */
    public final AbstractC17075a<T> mo26981a(Executor executor) {
        C89219l.m154719c(executor, "");
        this.f40635b = executor;
        return this;
    }
}
