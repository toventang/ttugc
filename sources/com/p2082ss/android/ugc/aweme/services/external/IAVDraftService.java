package com.p2082ss.android.ugc.aweme.services.external;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.draft.model.DraftDBSaveResult;
import com.p2082ss.android.ugc.aweme.services.draft.IDraftService;
import com.p2082ss.android.ugc.aweme.services.effect.IEffectService;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* renamed from: com.ss.android.ugc.aweme.services.external.IAVDraftService */
public interface IAVDraftService {
    public static final Companion Companion = Companion.$$INSTANCE;

    static {
        Covode.recordClassIndex(79785);
    }

    void deleteDraft(int i, C43223c cVar);

    List<C43223c> draftList(boolean z);

    ExecutorService executor();

    String getDBCreationTime();

    String getDBEventAsJSON();

    String getReadableDBPath();

    void loadAwemeDraftThumbCover(C43223c cVar, IEffectService.OnVideoCoverCallback onVideoCoverCallback);

    C43223c queryDraft(int i, String str);

    int queryDraftListCount(boolean z);

    List<Integer> queryUserDraftCounts(boolean z);

    void registerListener(IDraftService.DraftListener draftListener);

    Dialog restoreDialog(Activity activity, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2);

    DraftDBSaveResult saveDraft(C43223c cVar);

    void saveDraftForLocalFile(String str, Intent intent, IDraftService.DraftSaveListener draftSaveListener);

    Fragment showDetailDraft(C43223c cVar);

    void unregisterListener(IDraftService.DraftListener draftListener);

    /* renamed from: com.ss.android.ugc.aweme.services.external.IAVDraftService$Companion */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        static {
            Covode.recordClassIndex(79786);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.services.external.IAVDraftService$DefaultImpls */
    public static final class DefaultImpls {
        static {
            Covode.recordClassIndex(79787);
        }

        public static /* synthetic */ int queryDraftListCount$default(IAVDraftService iAVDraftService, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = true;
                }
                return iAVDraftService.queryDraftListCount(z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: queryDraftListCount");
        }

        public static /* synthetic */ List queryUserDraftCounts$default(IAVDraftService iAVDraftService, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = true;
                }
                return iAVDraftService.queryUserDraftCounts(z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: queryUserDraftCounts");
        }
    }
}
