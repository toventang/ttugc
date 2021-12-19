package com.p2082ss.android.ugc.aweme.services.external.p3712ui;

import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.services.videochoose.IVideoChoose;
import com.p2082ss.android.ugc.aweme.share.gif.VideoShare2GifEditContext;

/* renamed from: com.ss.android.ugc.aweme.services.external.ui.IVideo2GifUIService */
public interface IVideo2GifUIService {
    static {
        Covode.recordClassIndex(79866);
    }

    IVideoChoose toMusVideoChooseFragment(ActivityC0945e eVar, Fragment fragment, IVideoChoose.Callback callback, Integer num);

    Fragment video2GifFragment(VideoShare2GifEditContext videoShare2GifEditContext);
}
