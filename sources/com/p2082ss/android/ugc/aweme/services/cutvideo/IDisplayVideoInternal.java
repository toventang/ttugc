package com.p2082ss.android.ugc.aweme.services.cutvideo;

import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.services.cutvideo.IDisplayVideoInternal */
public interface IDisplayVideoInternal {
    static {
        Covode.recordClassIndex(79757);
    }

    IDisplayVideo getProxy();

    void init(ViewGroup viewGroup);

    void setProxy(IDisplayVideo iDisplayVideo);
}
