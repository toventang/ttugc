package com.p2082ss.android.ugc.aweme.opensdkservice;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.opensdkservice.HandleMediaListener */
public interface HandleMediaListener {
    static {
        Covode.recordClassIndex(73531);
    }

    void onArgsError();

    void onGetImagePath(ArrayList<String> arrayList);

    void onGetVideoPath(ArrayList<String> arrayList);
}
