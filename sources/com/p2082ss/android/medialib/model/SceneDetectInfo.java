package com.p2082ss.android.medialib.model;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.medialib.model.SceneDetectInfo */
public class SceneDetectInfo {
    int choose;
    SceneDetectItem[] mSceneDetectItems;

    static {
        Covode.recordClassIndex(36488);
    }

    public int getChoose() {
        return this.choose;
    }

    public SceneDetectItem[] getSceneDetectItems() {
        return this.mSceneDetectItems;
    }

    public void setChoose(int i) {
        this.choose = i;
    }

    public void setSceneDetectItems(SceneDetectItem[] sceneDetectItemArr) {
        this.mSceneDetectItems = sceneDetectItemArr;
    }
}
