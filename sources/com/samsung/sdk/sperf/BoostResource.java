package com.samsung.sdk.sperf;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public class BoostResource {
    private int defaultLevel = 64532198;
    private int[] levelTable;
    private int maxTimeout = 64532198;

    static {
        Covode.recordClassIndex(35073);
    }

    public BoostResource(int[] iArr, int i) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            SPerfUtil.log("Table[" + i2 + "] : " + iArr[i2]);
        }
        SPerfUtil.log("Timeout : " + i);
        this.levelTable = iArr;
        this.maxTimeout = i;
    }

    public int adjustLevel(int i) {
        int[] iArr = this.levelTable;
        if (iArr.length <= 0) {
            return 64532198;
        }
        if (i < 0) {
            SPerfUtil.log("");
            return 64532198;
        } else if (i >= iArr.length) {
            return 64532198;
        } else {
            return i;
        }
    }

    public int adjustTimeout(int i) {
        if (i < 0) {
            return 64532198;
        }
        int i2 = this.maxTimeout;
        return i > i2 ? i2 : i;
    }

    public boolean check(int i, int i2) {
        if (i2 <= 0 || i2 > this.maxTimeout) {
            return false;
        }
        int i3 = 0;
        while (true) {
            int[] iArr = this.levelTable;
            if (i3 >= iArr.length) {
                return false;
            }
            if (iArr[i3] == i) {
                return true;
            }
            i3++;
        }
    }

    public int getDefaultLevel() {
        return this.defaultLevel;
    }

    public int getRealBoostLevel(int i) {
        int[] iArr = this.levelTable;
        if (iArr != null && i >= 0 && i < iArr.length) {
            return iArr[i];
        }
        return -1;
    }

    public void setDefaultLevel(int i) {
        this.defaultLevel = i;
    }
}
