package com.p2082ss.android.ugc.aweme.services.videochoose;

import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.services.videochoose.IVideoChoose */
public interface IVideoChoose {

    /* renamed from: com.ss.android.ugc.aweme.services.videochoose.IVideoChoose$Callback */
    public interface Callback {
        static {
            Covode.recordClassIndex(80042);
        }

        void onData(String str);
    }

    static {
        Covode.recordClassIndex(80041);
    }

    Fragment fragment();

    void loadData();
}
