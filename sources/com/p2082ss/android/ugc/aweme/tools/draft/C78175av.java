package com.p2082ss.android.ugc.aweme.tools.draft;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.av */
public final class C78175av implements AbstractC78207bb {

    /* renamed from: a */
    private final C43223c f175573a;

    /* renamed from: b */
    private AbstractC89183m<? super Boolean, ? super String, C89391z> f175574b;

    /* renamed from: c */
    private AbstractC89171a<C89391z> f175575c;

    static {
        Covode.recordClassIndex(91290);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.draft.AbstractC78207bb
    /* renamed from: a */
    public final void mo122037a() {
        C69905c cVar = this.f175573a.f100906f;
        C89219l.m154716b(cVar, "");
        if (C78177ax.m136665a(cVar)) {
            C43223c cVar2 = this.f175573a;
            C69905c cVar3 = cVar2.f100906f;
            C89219l.m154716b(cVar3, "");
            cVar2.f100908h = C78177ax.m136666b(cVar3);
            C73991bj.m130131b("draft_music_process, Local Music exist, path: " + this.f175573a.f100908h);
            AbstractC89183m<? super Boolean, ? super String, C89391z> mVar = this.f175574b;
            if (mVar != null) {
                mVar.invoke(true, null);
            }
            AbstractC89171a<C89391z> aVar = this.f175575c;
            if (aVar != null) {
                aVar.invoke();
                return;
            }
            return;
        }
        C73991bj.m130131b("draft_music_process, Local Music not exist, path: " + this.f175573a.f100908h);
        AbstractC89183m<? super Boolean, ? super String, C89391z> mVar2 = this.f175574b;
        if (mVar2 != null) {
            mVar2.invoke(false, null);
        }
        AbstractC89171a<C89391z> aVar2 = this.f175575c;
        if (aVar2 != null) {
            aVar2.invoke();
        }
    }

    public C78175av(C43223c cVar, AbstractC89183m<? super Boolean, ? super String, C89391z> mVar, AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(cVar, "");
        this.f175573a = cVar;
        this.f175574b = mVar;
        this.f175575c = aVar;
    }
}
