package com.p2082ss.android.ugc.aweme.services.publish;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.story.p4047g.p4048a.p4049a.C77262a;

/* renamed from: com.ss.android.ugc.aweme.services.publish.IPublishService */
public interface IPublishService {

    /* renamed from: com.ss.android.ugc.aweme.services.publish.IPublishService$OnGetRecoverDraftCallback */
    public interface OnGetRecoverDraftCallback {
        static {
            Covode.recordClassIndex(79942);
        }

        void onFail();

        void onSuccess(C43223c cVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.services.publish.IPublishService$OnPublishCallback */
    public interface OnPublishCallback {
        static {
            Covode.recordClassIndex(79943);
        }

        void onStartPublish();

        void onStopPublish();
    }

    /* renamed from: com.ss.android.ugc.aweme.services.publish.IPublishService$profileLivePublishCallback */
    public interface profileLivePublishCallback {
        static {
            Covode.recordClassIndex(79944);
        }

        void onPublish(String str);
    }

    static {
        Covode.recordClassIndex(79941);
    }

    void cancelSynthetise(Context context);

    boolean checkIsAlreadyPublished(Context context);

    void getRecoverDraftIfHave(Context context, OnGetRecoverDraftCallback onGetRecoverDraftCallback);

    Class<? extends Service> getShortVideoPublishServiceClass();

    void hideUploadRecoverWindow(Context context, boolean z);

    boolean inPublishPage(Context context);

    boolean isPublishServiceRunning(Context context);

    boolean isVideoPublishPreviewActivity(Context context);

    boolean processPublish(ActivityC0945e eVar, Intent intent);

    void publishFromDraft(ActivityC0945e eVar, C43223c cVar);

    C77262a queryKnowFriends(int i, int i2);

    void setUploadRecoverPath(String str);

    void showUploadRecoverIfNeed(boolean z, ActivityC0945e eVar);

    void startPublish(ActivityC0945e eVar, Bundle bundle);

    void uploadRecoverPopViewSetVisibility(boolean z);
}
