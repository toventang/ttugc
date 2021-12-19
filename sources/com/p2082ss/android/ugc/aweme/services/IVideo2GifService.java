package com.p2082ss.android.ugc.aweme.services;

import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.share.gif.VideoShare2GifEditContext;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.p3798a.p3799a.C70049a;

/* renamed from: com.ss.android.ugc.aweme.services.IVideo2GifService */
public interface IVideo2GifService {

    /* renamed from: com.ss.android.ugc.aweme.services.IVideo2GifService$ConvertListener */
    public interface ConvertListener {
        static {
            Covode.recordClassIndex(79649);
        }

        void onConfigured(C70049a aVar);

        void onDone(boolean z);

        void onStart();

        void onUpdateProgress(int i);
    }

    static {
        Covode.recordClassIndex(79648);
    }

    void convert2Gif(VideoShare2GifEditContext videoShare2GifEditContext, ConvertListener convertListener);

    Fragment getGifCutVideoFragment(VideoShare2GifEditContext videoShare2GifEditContext);
}
