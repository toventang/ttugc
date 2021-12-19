package com.p2082ss.android.ugc.aweme.mediachoose.p3436a;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1453f.AbstractC20179a;
import com.p2082ss.android.ugc.aweme.mediachoose.AbstractC59174d;
import com.p2082ss.android.ugc.aweme.mediachoose.AbstractC59178e;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.C59187c;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.util.List;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.mediachoose.a.a */
public final class C59144a extends AbstractC20179a<C59155e, C59154d, C59155e, C59154d> {
    static {
        Covode.recordClassIndex(69502);
    }

    @Override // com.bytedance.jedi.p1445a.p1453f.AbstractC20181b
    /* renamed from: b */
    public final /* synthetic */ Object mo33483b(Object obj) {
        C89219l.m154721d(obj, "");
        return obj;
    }

    /* renamed from: com.ss.android.ugc.aweme.mediachoose.a.a$a */
    static final class C59145a<T> implements AbstractC88983w {

        /* renamed from: a */
        final /* synthetic */ C59155e f134578a;

        static {
            Covode.recordClassIndex(69503);
        }

        C59145a(C59155e eVar) {
            this.f134578a = eVar;
        }

        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(final AbstractC88982v<C59154d> vVar) {
            C89219l.m154721d(vVar, "");
            C59187c.f134693a.mo96691a(this.f134578a.f134593a, this.f134578a.f134594b, this.f134578a.f134595c, new AbstractC59178e(this) {
                /* class com.p2082ss.android.ugc.aweme.mediachoose.p3436a.C59144a.C59145a.C591461 */

                /* renamed from: a */
                final /* synthetic */ C59145a f134579a;

                static {
                    Covode.recordClassIndex(69504);
                }

                {
                    this.f134579a = r1;
                }

                /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: f.a.v */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.p2082ss.android.ugc.aweme.mediachoose.AbstractC59178e
                /* renamed from: a */
                public final void mo96652a(boolean z, int i, List<MediaModel> list, AbstractC59174d dVar) {
                    C89219l.m154721d(dVar, "");
                    AbstractC88982v vVar = vVar;
                    C89219l.m154716b(vVar, "");
                    if (!vVar.isDisposed()) {
                        if (list != null) {
                            vVar.mo143031a(new C59154d(this.f134579a.f134578a, list));
                        } else {
                            vVar.mo143024a((Throwable) new IllegalStateException("query media failed"));
                        }
                        vVar.mo143023a();
                    }
                }
            });
        }
    }

    /* Return type fixed from 'f.a.t' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.p1445a.p1453f.AbstractC20179a
    /* renamed from: a */
    public final /* synthetic */ AbstractC88979t<C59154d> mo33481a(C59155e eVar) {
        C59155e eVar2 = eVar;
        C89219l.m154721d(eVar2, "");
        AbstractC88979t a = AbstractC88979t.m154294a(new C59145a(eVar2));
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.bytedance.jedi.p1445a.p1453f.AbstractC20181b
    /* renamed from: a */
    public final /* synthetic */ Object mo33482a(Object obj, Object obj2) {
        C89219l.m154721d(obj, "");
        C89219l.m154721d(obj2, "");
        return obj2;
    }
}
