package com.snapchat.kit.sdk;

import com.bytedance.covode.number.Covode;

public interface SnapKitComponent extends SnapKitProvidingComponent {
    static {
        Covode.recordClassIndex(35116);
    }

    void inject(AbstractActivityC28935a aVar);

    void inject(ActivityC29063d dVar);
}
