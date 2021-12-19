package com.p2082ss.android.ugc.aweme.openshare.entity;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.openshare.entity.a */
public interface AbstractC62726a {
    static {
        Covode.recordClassIndex(73546);
    }

    boolean checkArgs();

    void serialize(Bundle bundle);

    int type();

    void unserialize(Bundle bundle);
}
