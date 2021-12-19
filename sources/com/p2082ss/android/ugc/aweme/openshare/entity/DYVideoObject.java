package com.p2082ss.android.ugc.aweme.openshare.entity;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.openshare.entity.DYVideoObject */
public class DYVideoObject implements AbstractC62726a {
    public ArrayList<String> mVideoPaths;

    static {
        Covode.recordClassIndex(73545);
    }

    @Override // com.p2082ss.android.ugc.aweme.openshare.entity.AbstractC62726a
    public boolean checkArgs() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.openshare.entity.AbstractC62726a
    public int type() {
        return 3;
    }

    @Override // com.p2082ss.android.ugc.aweme.openshare.entity.AbstractC62726a
    public void serialize(Bundle bundle) {
        bundle.putStringArrayList("AWEME_EXTRA_VIDEO_MESSAGE_PATH", this.mVideoPaths);
    }

    @Override // com.p2082ss.android.ugc.aweme.openshare.entity.AbstractC62726a
    public void unserialize(Bundle bundle) {
        this.mVideoPaths = bundle.getStringArrayList("AWEME_EXTRA_VIDEO_MESSAGE_PATH");
    }
}
