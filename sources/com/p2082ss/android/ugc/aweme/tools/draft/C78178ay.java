package com.p2082ss.android.ugc.aweme.tools.draft;

import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.ay */
public final class C78178ay {

    /* renamed from: a */
    public static final C78178ay f175580a = new C78178ay();

    private C78178ay() {
    }

    static {
        Covode.recordClassIndex(91293);
    }

    /* renamed from: a */
    public static final AbstractC78207bb m136667a(ActivityC0945e eVar, C43223c cVar, AbstractC89183m<? super Boolean, ? super String, C89391z> mVar, AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(aVar, "");
        C69905c cVar2 = cVar.f100906f;
        if (cVar2 == null) {
            return new C78206ba();
        }
        if (cVar2.musicType == MusicModel.MusicType.LOCAL.ordinal()) {
            return new C78175av(cVar, mVar, aVar);
        }
        DraftOnlineMusicProcessor draftOnlineMusicProcessor = new DraftOnlineMusicProcessor(cVar, mVar, aVar);
        eVar.getLifecycle().mo4012a(draftOnlineMusicProcessor);
        return draftOnlineMusicProcessor;
    }
}
