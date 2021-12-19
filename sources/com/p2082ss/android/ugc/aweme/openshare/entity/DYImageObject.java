package com.p2082ss.android.ugc.aweme.openshare.entity;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.openshare.entity.DYImageObject */
public class DYImageObject implements AbstractC62726a {
    public ArrayList<String> mImagePaths;

    static {
        Covode.recordClassIndex(73542);
    }

    @Override // com.p2082ss.android.ugc.aweme.openshare.entity.AbstractC62726a
    public boolean checkArgs() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.openshare.entity.AbstractC62726a
    public int type() {
        return 2;
    }

    public DYImageObject() {
    }

    @Override // com.p2082ss.android.ugc.aweme.openshare.entity.AbstractC62726a
    public void serialize(Bundle bundle) {
        bundle.putStringArrayList("AWEME_EXTRA_IMAGE_MESSAGE_PATH", this.mImagePaths);
    }

    public DYImageObject(ArrayList<String> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        this.mImagePaths = arrayList2;
        arrayList2.addAll(arrayList);
    }

    @Override // com.p2082ss.android.ugc.aweme.openshare.entity.AbstractC62726a
    public void unserialize(Bundle bundle) {
        this.mImagePaths = bundle.getStringArrayList("AWEME_EXTRA_IMAGE_MESSAGE_PATH");
    }
}
