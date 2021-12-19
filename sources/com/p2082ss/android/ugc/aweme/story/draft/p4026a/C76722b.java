package com.p2082ss.android.ugc.aweme.story.draft.p4026a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.draft.model.DraftFileSaveException;
import com.p2082ss.android.ugc.aweme.draft.model.DraftFileSaveResult;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.p3789ab.AbstractC69768a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3789ab.C69779j;
import com.p2082ss.android.ugc.aweme.story.base.p4021b.C76615b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.story.draft.a.b */
public class C76722b implements AbstractC69768a {

    /* renamed from: a */
    private final AbstractC89244h f172222a = C89250i.m154773a((AbstractC89171a) C76723a.f172226a);

    /* renamed from: b */
    public final String f172223b;

    /* renamed from: c */
    public final VideoPublishEditModel f172224c;

    /* renamed from: d */
    public final C43223c f172225d;

    static {
        Covode.recordClassIndex(89718);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final DraftFileSaveException mo120445b() {
        return (DraftFileSaveException) this.f172222a.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.story.draft.a.b$a */
    static final class C76723a extends AbstractC89220m implements AbstractC89171a<DraftFileSaveException> {

        /* renamed from: a */
        public static final C76723a f172226a = new C76723a();

        static {
            Covode.recordClassIndex(89719);
        }

        C76723a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ DraftFileSaveException invoke() {
            return new DraftFileSaveException(0, null, 3, null);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3789ab.AbstractC69768a
    /* renamed from: a */
    public DraftFileSaveResult mo110127a() {
        C69779j.m123305a(this.f172224c);
        return new DraftFileSaveResult(0, null, 3, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo120444a(String str) {
        C89219l.m154721d(str, "");
        return C89361p.m154908a((CharSequence) str, (CharSequence) this.f172223b, false);
    }

    public C76722b(VideoPublishEditModel videoPublishEditModel, C43223c cVar) {
        C89219l.m154721d(videoPublishEditModel, "");
        C89219l.m154721d(cVar, "");
        this.f172224c = videoPublishEditModel;
        this.f172225d = cVar;
        this.f172223b = C76615b.m134199a(videoPublishEditModel.sessionId, null);
    }
}
