package com.p2082ss.android.ugc.aweme.services.video;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.model.Challenge;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p2082ss.android.ugc.aweme.shortvideo.AbstractC74304x;
import com.p2082ss.android.ugc.aweme.shortvideo.C69831ai;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72630h;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.C72678q;
import java.util.List;
import org.json.JSONObject;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.ss.android.ugc.aweme.services.video.IAVPublishService */
public interface IAVPublishService {

    /* renamed from: com.ss.android.ugc.aweme.services.video.IAVPublishService$LiveThumCallback */
    public interface LiveThumCallback {
        static {
            Covode.recordClassIndex(80010);
        }

        void onCallback(String str, String str2);

        void publishSuccess(String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.services.video.IAVPublishService$OnPublishCallback */
    public interface OnPublishCallback {
        static {
            Covode.recordClassIndex(80011);
        }

        void onStartPublish(AbstractC72630h hVar);

        void onStopPublish();
    }

    /* renamed from: com.ss.android.ugc.aweme.services.video.IAVPublishService$onLivePublishCallback */
    public interface onLivePublishCallback {
        static {
            Covode.recordClassIndex(80012);
        }

        void onLivePublishCallback(JSONObject jSONObject);
    }

    static {
        Covode.recordClassIndex(80009);
    }

    void addChallenge(Challenge challenge);

    void addMusic(MusicModel musicModel);

    void addMyVideoChain(Activity activity, String str, String str2, String str3, String str4, String str5, String str6, int i, int i2);

    void addPublishCallback(AbstractC74304x<C69831ai> xVar, String str);

    void cancelRestoreOnMain();

    void cancelRestoreOnMain(Activity activity);

    void cancelSynthetise(Context context);

    boolean checkIsAlreadyPublished(Context context);

    boolean containEmoji(String str);

    boolean enableShowPrePublishUserSwitch();

    boolean endWithHashTag(String str);

    int getAddVideosExperiConsuSideCode();

    List<C72678q> getAllPublishModel();

    Bitmap getCover(C72678q qVar);

    AVChallenge getCurChallenge();

    C69905c getCurMusic();

    String getCurrentPublishTaskId();

    Boolean getHasOpenCommercialSoundPage();

    boolean getKitManageRegister();

    onLivePublishCallback getLivePublishCallback();

    LiveThumCallback getLiveThumCallback();

    int getParallelPublishTaskSize();

    ViewGroup getPublishAddVideoContainer(Activity activity);

    C72678q getPublishModel(String str);

    String getShootWay();

    void hideUploadRecoverWindow(Context context, boolean z);

    boolean inPublishPage(Context context);

    Boolean isFromCommercialSoundPage();

    boolean isInShoutout();

    boolean isParallelPublishEnabled();

    boolean isParallelPublishTaskFinished();

    boolean isPhotoMvModeMusic();

    boolean isPublishServiceRunning(Context context);

    boolean isPublishable();

    boolean isPublishing();

    boolean needRestore();

    boolean processPublish(ActivityC0945e eVar, Intent intent);

    void publishFromDraft(ActivityC0945e eVar, C43223c cVar);

    void removePublishCallback(AbstractC74304x<C69831ai> xVar);

    void resetNewCreateWay();

    boolean restoreWorkExperimentDisableCover();

    void setCurMusic(MusicModel musicModel);

    void setCurMusic(MusicModel musicModel, Boolean bool, Boolean bool2);

    void setDestroyFlag(Activity activity);

    void setFakeMusic(MusicModel musicModel);

    void setFromCommercialSoundPage(boolean z);

    void setHasOpenCommercialSoundPage(boolean z);

    void setHashTagRegex(String str);

    void setKitManageRegister(boolean z);

    void setMusicChooseType(int i);

    void setPublishStatus(int i);

    void showLighteningPublishSuccessPopWindow(ActivityC0945e eVar, Aweme aweme);

    void showLivePublishFailedPopwindow(ActivityC0945e eVar, String str);

    void showLivePublishSuccessPopwindow(ActivityC0945e eVar, String str, String str2);

    void showRestoreWorkDialog(Activity activity, String str);

    void showUploadRecoverIfNeed(boolean z, ActivityC0945e eVar, String str, String str2, String str3);

    void showUploadingDialog();

    void startPublish(ActivityC0945e eVar, Bundle bundle);

    void tryRestorePublish(ActivityC0945e eVar, AbstractC89172b<Boolean, Void> bVar);

    void uploadRecoverPopViewSetVisibility(boolean z);

    boolean usedBusiSticker();
}
