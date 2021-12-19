package com.samsung.sdk.sperf;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class CustomParams {
    private static SPerfManager sPerfManager;
    private BoostObject boostObj;
    private boolean isBoostObjUpdated;

    static {
        Covode.recordClassIndex(35074);
    }

    protected static int getBoostType(int i) {
        return (i == 8 || i == 9) ? 1 : 0;
    }

    public int add(int i, int i2, int i3) {
        int i4;
        MethodCollector.m26663i(5352);
        synchronized (this) {
            try {
                if (this.boostObj == null) {
                    this.boostObj = new BoostObject();
                    this.isBoostObjUpdated = false;
                }
                if (sPerfManager == null) {
                    SPerfManager createInstance = SPerfManager.createInstance(null);
                    sPerfManager = createInstance;
                    if (createInstance == null) {
                        i4 = -1;
                    }
                }
                i4 = sPerfManager.updateBoost(i, i2, i3, this.boostObj);
                if (i4 >= 0) {
                    this.isBoostObjUpdated = true;
                }
            } finally {
                MethodCollector.m26664o(5352);
            }
        }
        return i4;
    }

    /* access modifiers changed from: protected */
    public BoostObject getBoostObject() {
        if (!this.isBoostObjUpdated) {
            return null;
        }
        return this.boostObj;
    }
}
