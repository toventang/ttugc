package com.p2082ss.android.ugc.aweme.services.recording;

import androidx.fragment.app.AbstractC0952i;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.LiveData;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p2082ss.android.ugc.aweme.framework.services.IStickerService;
import com.p2082ss.android.ugc.aweme.shortvideo.p3892x.AbstractC74317i;
import com.p2082ss.android.ugc.aweme.shortvideo.p3892x.AbstractC74319k;

/* renamed from: com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel */
public interface IRecordingOperationPanel {
    static {
        Covode.recordClassIndex(79956);
    }

    SimpleDraweeView backgroundView();

    void closeCamera(PrivacyCert privacyCert);

    void closeRecording();

    AbstractC74317i filterModule();

    AbstractC0952i fragmentManager();

    int getCameraPos();

    AbstractC1196i getLifecycle();

    LiveData<Float> getZoomEvent();

    void onGameStickerChosen(IStickerService.FaceSticker faceSticker, String str);

    void onHidePanel(String str);

    void onShowPanel(String str);

    void onStickerCancel(IStickerService.FaceSticker faceSticker, String str);

    void onStickerChosen(IStickerService.FaceSticker faceSticker, String str);

    void openCamera(PrivacyCert privacyCert);

    void setCameraPos(int i, PrivacyCert privacyCert);

    void updateLiveBackgroundView();

    AbstractC74319k videoRecorder();
}
