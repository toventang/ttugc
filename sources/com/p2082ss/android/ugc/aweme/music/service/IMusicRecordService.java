package com.p2082ss.android.ugc.aweme.music.service;

import android.app.Activity;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* renamed from: com.ss.android.ugc.aweme.music.service.IMusicRecordService */
public interface IMusicRecordService {

    /* renamed from: com.ss.android.ugc.aweme.music.service.IMusicRecordService$a */
    public interface AbstractC61062a {
        static {
            Covode.recordClassIndex(71656);
        }
    }

    static {
        Covode.recordClassIndex(71655);
    }

    void startRecord(AbstractC1204m mVar, Activity activity, MusicModel musicModel, String str, String str2, AbstractC61062a aVar, int i, boolean z);
}
