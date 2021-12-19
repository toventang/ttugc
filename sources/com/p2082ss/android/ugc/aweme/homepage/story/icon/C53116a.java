package com.p2082ss.android.ugc.aweme.homepage.story.icon;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.services.story.IStoryDraftService;
import com.p2082ss.android.ugc.aweme.services.story.event.ScheduleInfo;
import com.p2082ss.android.ugc.aweme.story.draft.StoryDraftServiceImpl;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.homepage.story.icon.a */
public final class C53116a implements IStoryDraftService {

    /* renamed from: a */
    public static final C53116a f122145a = new C53116a();

    /* renamed from: b */
    private final /* synthetic */ IStoryDraftService f122146b;

    @Override // com.p2082ss.android.ugc.aweme.services.story.IStoryDraftService
    public final void checkIfStoryDraftExisted(AbstractC89172b<? super Boolean, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        this.f122146b.checkIfStoryDraftExisted(bVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.story.IStoryDraftService
    public final String getDraftDirPath(C43223c cVar) {
        C89219l.m154721d(cVar, "");
        return this.f122146b.getDraftDirPath(cVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.story.IStoryDraftService
    public final List<C43223c> queryDraftList() {
        return this.f122146b.queryDraftList();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.story.IStoryDraftService
    public final void queryDraftList(AbstractC89172b<? super List<? extends C43223c>, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        this.f122146b.queryDraftList(bVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.story.IStoryDraftService
    public final void restoreScheduleInfoFromDraft(AbstractC89172b<? super List<ScheduleInfo>, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        this.f122146b.restoreScheduleInfoFromDraft(bVar);
    }

    static {
        Covode.recordClassIndex(62664);
    }

    private C53116a() {
        IStoryDraftService a = StoryDraftServiceImpl.m134289a();
        C89219l.m154716b(a, "");
        this.f122146b = a;
    }
}
