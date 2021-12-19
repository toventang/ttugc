package com.p2082ss.android.ugc.aweme.services.story;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.services.story.event.ScheduleInfo;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.ss.android.ugc.aweme.services.story.IStoryDraftService */
public interface IStoryDraftService {
    static {
        Covode.recordClassIndex(79984);
    }

    void checkIfStoryDraftExisted(AbstractC89172b<? super Boolean, C89391z> bVar);

    String getDraftDirPath(C43223c cVar);

    List<C43223c> queryDraftList();

    void queryDraftList(AbstractC89172b<? super List<? extends C43223c>, C89391z> bVar);

    void restoreScheduleInfoFromDraft(AbstractC89172b<? super List<ScheduleInfo>, C89391z> bVar);
}
