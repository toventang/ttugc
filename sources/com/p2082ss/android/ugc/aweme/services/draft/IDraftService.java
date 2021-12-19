package com.p2082ss.android.ugc.aweme.services.draft;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.AbstractC43215m;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.draft.model.DraftDBSaveResult;
import com.p2082ss.android.ugc.aweme.draft.model.DraftFileSaveResult;
import com.p2082ss.android.ugc.aweme.draft.model.DraftSaveResult;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* renamed from: com.ss.android.ugc.aweme.services.draft.IDraftService */
public interface IDraftService {

    /* renamed from: com.ss.android.ugc.aweme.services.draft.IDraftService$DraftCopyListener */
    public interface DraftCopyListener {
        static {
            Covode.recordClassIndex(79763);
        }

        void onDraftCopyFailed(DraftFileSaveResult draftFileSaveResult);

        void onDraftCopySuccess();
    }

    /* renamed from: com.ss.android.ugc.aweme.services.draft.IDraftService$DraftListener */
    public interface DraftListener {
        static {
            Covode.recordClassIndex(79764);
        }

        void onDraftCheckedChanged(C43223c cVar, boolean z);

        void onDraftClean();

        void onDraftDelete(C43223c cVar);

        void onDraftUpdate(C43223c cVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.services.draft.IDraftService$DraftListenerAdapter */
    public static class DraftListenerAdapter implements DraftListener {
        static {
            Covode.recordClassIndex(79765);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.draft.IDraftService.DraftListener
        public void onDraftCheckedChanged(C43223c cVar, boolean z) {
        }

        @Override // com.p2082ss.android.ugc.aweme.services.draft.IDraftService.DraftListener
        public void onDraftClean() {
        }

        @Override // com.p2082ss.android.ugc.aweme.services.draft.IDraftService.DraftListener
        public void onDraftDelete(C43223c cVar) {
        }

        @Override // com.p2082ss.android.ugc.aweme.services.draft.IDraftService.DraftListener
        public void onDraftUpdate(C43223c cVar) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.services.draft.IDraftService$DraftSaveListener */
    public interface DraftSaveListener {
        static {
            Covode.recordClassIndex(79766);
        }

        void onDraftSaveFailed(DraftSaveResult draftSaveResult);

        void onDraftSaveSuccess();
    }

    static {
        Covode.recordClassIndex(79762);
    }

    String calculateDraftDir(C43223c cVar);

    void delete(C43223c cVar);

    void enterDraftBox(Activity activity);

    void enterDraftBoxWithArgs(Activity activity, Bundle bundle);

    ExecutorService getDraftExecutor();

    void notifyDraftCheckedChanged(C43223c cVar, boolean z);

    void notifyDraftClean();

    void notifyDraftDelete(C43223c cVar);

    void notifyDraftUpdate(C43223c cVar);

    List<C43223c> queryAllDraftList(boolean z);

    C43223c queryDraft(String str);

    C43223c queryDraftWithUserId(String str);

    List<C43223c> queryList();

    List<C43223c> queryListWithFilter(boolean z, AbstractC43215m mVar);

    int queryMyDraftCount();

    int queryMyDraftCount(AbstractC43215m mVar);

    void registerDraftListener(DraftListener draftListener);

    DraftDBSaveResult save(C43223c cVar);

    void unregisterDraftListener(DraftListener draftListener);
}
