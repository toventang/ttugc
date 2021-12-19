package com.p2082ss.android.ugc.aweme.choosemusic.model.p2474a;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1453f.AbstractC20179a;
import com.p2082ss.android.ugc.aweme.choosemusic.api.ChooseMusicApi;
import com.p2082ss.android.ugc.aweme.choosemusic.model.C35888ah;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.model.a.b */
public final class C35869b extends AbstractC20179a<C35877e, C35876d, C35877e, C35876d> {
    static {
        Covode.recordClassIndex(43109);
    }

    @Override // com.bytedance.jedi.p1445a.p1453f.AbstractC20181b
    /* renamed from: b */
    public final /* synthetic */ Object mo33483b(Object obj) {
        C89219l.m154721d(obj, "");
        return obj;
    }

    /* Return type fixed from 'f.a.t' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.p1445a.p1453f.AbstractC20179a
    /* renamed from: a */
    public final /* synthetic */ AbstractC88979t<C35876d> mo33481a(C35877e eVar) {
        C35877e eVar2 = eVar;
        C89219l.m154721d(eVar2, "");
        AbstractC88979t a = AbstractC88979t.m154294a(new C35870a(eVar2));
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.model.a.b$a */
    static final class C35870a<T> implements AbstractC88983w {

        /* renamed from: a */
        final /* synthetic */ C35877e f84658a;

        static {
            Covode.recordClassIndex(43110);
        }

        C35870a(C35877e eVar) {
            this.f84658a = eVar;
        }

        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(final AbstractC88982v<C35876d> vVar) {
            C89219l.m154721d(vVar, "");
            ChooseMusicApi.m72938a(Integer.valueOf(this.f84658a.f84669a), this.f84658a.f84670b, this.f84658a.f84671c, this.f84658a.f84672d).mo5532a(new AbstractC1729g(this) {
                /* class com.p2082ss.android.ugc.aweme.choosemusic.model.p2474a.C35869b.C35870a.C358711 */

                /* renamed from: a */
                final /* synthetic */ C35870a f84659a;

                static {
                    Covode.recordClassIndex(43111);
                }

                {
                    this.f84659a = r1;
                }

                /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: f.a.v */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // p077b.AbstractC1729g
                public final /* synthetic */ Object then(C1731i iVar) {
                    C89219l.m154716b(iVar, "");
                    if (iVar.mo5535a()) {
                        AbstractC88982v vVar = vVar;
                        C35877e eVar = this.f84659a.f84658a;
                        Object d = iVar.mo5545d();
                        C89219l.m154716b(d, "");
                        vVar.mo143031a(new C35876d(eVar, (C35888ah) d));
                    } else if (iVar.mo5539b()) {
                        vVar.mo143024a((Throwable) new IllegalStateException("query music canceled: " + this.f84659a.f84658a));
                    } else if (iVar.mo5544c()) {
                        vVar.mo143024a((Throwable) new IllegalStateException("query music faulted: " + this.f84659a.f84658a));
                    } else {
                        vVar.mo143024a((Throwable) new IllegalStateException("query music unknown: " + this.f84659a.f84658a));
                    }
                    vVar.mo143023a();
                    return C89391z.f203057a;
                }
            });
        }
    }

    @Override // com.bytedance.jedi.p1445a.p1453f.AbstractC20181b
    /* renamed from: a */
    public final /* synthetic */ Object mo33482a(Object obj, Object obj2) {
        C89219l.m154721d(obj, "");
        C89219l.m154721d(obj2, "");
        return obj2;
    }
}
