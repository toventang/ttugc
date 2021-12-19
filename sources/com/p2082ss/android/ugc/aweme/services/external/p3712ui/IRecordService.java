package com.p2082ss.android.ugc.aweme.services.external.p3712ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.model.Challenge;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.ss.android.ugc.aweme.services.external.ui.IRecordService */
public interface IRecordService {

    /* renamed from: com.ss.android.ugc.aweme.services.external.ui.IRecordService$UICallback */
    public interface UICallback {

        /* renamed from: com.ss.android.ugc.aweme.services.external.ui.IRecordService$UICallback$DefaultImpls */
        public static final class DefaultImpls {
            static {
                Covode.recordClassIndex(79864);
            }

            public static boolean checkIsCanceled(UICallback uICallback) {
                return false;
            }
        }

        static {
            Covode.recordClassIndex(79863);
        }

        boolean checkIsCanceled();

        void postFail();

        void postSuccess();

        void preFail(int i);

        void preSuccess();
    }

    static {
        Covode.recordClassIndex(79862);
    }

    Intent getRecordBasicIntent(RecordConfig recordConfig);

    void preloadDuetLayout(int i, int i2, AbstractC89172b<? super Effect, C89391z> bVar);

    void recordActivityResult(Activity activity, int i, int i2, Intent intent);

    void startChangeBanMusic(Aweme aweme, Activity activity, ChangeBanMusicConfig changeBanMusicConfig, UICallback uICallback);

    void startDuet(Context context, RecordConfig recordConfig, DuetConfig duetConfig, UICallback uICallback, String str, String str2);

    void startReact(Context context, RecordConfig recordConfig, ReactConfig reactConfig, UICallback uICallback);

    void startRecord(Activity activity, RecordConfig recordConfig, MusicModel musicModel, boolean z);

    void startRecord(Context context, Intent intent);

    void startRecord(Context context, RecordConfig recordConfig);

    void startRecord(Context context, RecordConfig recordConfig, Uri uri);

    void startRecord(Context context, RecordConfig recordConfig, Challenge challenge);

    void startRecordMV(Context context, RecordConfig recordConfig, StickerDownloadConfig stickerDownloadConfig);

    void startRecordSlideShowPhotoMV(Context context, RecordConfig recordConfig, PhotoMvAnchorConfig photoMvAnchorConfig);

    void startSpecialPlusEntrance(Context context, RecordConfig recordConfig);

    void startStitch(Context context, Intent intent, StitchParams stitchParams);

    void startSuperEntrace(Activity activity, RecordConfig recordConfig);
}
