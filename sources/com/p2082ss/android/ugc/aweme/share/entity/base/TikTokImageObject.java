package com.p2082ss.android.ugc.aweme.share.entity.base;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.openshare.entity.AbstractC62726a;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.share.entity.base.TikTokImageObject */
public class TikTokImageObject implements AbstractC62726a {
    public ArrayList<String> mImagePaths;

    static {
        Covode.recordClassIndex(81227);
    }

    @Override // com.p2082ss.android.ugc.aweme.openshare.entity.AbstractC62726a
    public boolean checkArgs() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.openshare.entity.AbstractC62726a
    public int type() {
        return 2;
    }

    public TikTokImageObject() {
    }

    @Override // com.p2082ss.android.ugc.aweme.openshare.entity.AbstractC62726a
    public void serialize(Bundle bundle) {
        bundle.putStringArrayList("AWEME_EXTRA_IMAGE_MESSAGE_PATH", this.mImagePaths);
    }

    public TikTokImageObject(ArrayList<String> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        this.mImagePaths = arrayList2;
        arrayList2.addAll(arrayList);
    }

    @Override // com.p2082ss.android.ugc.aweme.openshare.entity.AbstractC62726a
    public void unserialize(Bundle bundle) {
        this.mImagePaths = bundle.getStringArrayList("AWEME_EXTRA_IMAGE_MESSAGE_PATH");
    }
}
