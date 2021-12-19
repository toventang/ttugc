package com.samsung.sdk.sperf;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public class BoostObject {
    private static int[] priority;

    /* renamed from: id */
    private int f68363id;
    private int[] levels;
    private int[] timeouts;

    static {
        Covode.recordClassIndex(35072);
        int[] iArr = new int[11];
        priority = iArr;
        iArr[0] = 1;
        iArr[1] = 0;
        iArr[2] = 1;
        iArr[3] = 0;
        iArr[4] = 1;
        iArr[5] = 0;
        iArr[6] = 1;
        iArr[7] = 0;
        iArr[8] = 1;
        iArr[9] = 1;
        iArr[10] = 2;
    }

    public BoostObject() {
        this.f68363id = -1;
        this.levels = new int[11];
        this.timeouts = new int[11];
        int i = 0;
        do {
            this.levels[i] = 64532198;
            this.timeouts[i] = 64532198;
            i++;
        } while (i < 11);
    }

    private BoostObject(int[] iArr, int[] iArr2) {
        this.f68363id = -1;
        this.levels = new int[iArr.length];
        this.timeouts = new int[iArr2.length];
        for (int i = 0; i < iArr.length; i++) {
            this.levels[i] = iArr[i];
        }
        for (int i2 = 0; i2 < iArr2.length; i2++) {
            this.timeouts[i2] = iArr2[i2];
        }
    }

    public boolean combineBoostObject(BoostObject boostObject) {
        if (boostObject == null) {
            return false;
        }
        for (int i = 0; i < this.levels.length; i++) {
            try {
                int level = boostObject.getLevel(i);
                if (level != 64532198) {
                    int[] iArr = this.levels;
                    if (iArr[i] != 64532198) {
                        int[] iArr2 = this.timeouts;
                        if (iArr2[i] != 64532198) {
                            int[] iArr3 = priority;
                            if (iArr3[i] == 0 && iArr[i] < level) {
                                iArr[i] = level;
                                iArr2[i] = boostObject.getTimeout(i);
                            } else if (iArr3[i] == 1 && iArr[i] > level) {
                                iArr[i] = level;
                                iArr2[i] = boostObject.getTimeout(i);
                            } else if (iArr3[i] == 2) {
                                iArr[i] = level;
                                iArr2[i] = boostObject.getTimeout(i);
                            }
                        }
                    }
                    iArr[i] = level;
                    this.timeouts[i] = boostObject.getTimeout(i);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                e.printStackTrace();
                SPerfUtil.log("Combine Boost Object has array out of bounds on type : " + i);
                return false;
            }
        }
        return true;
    }

    public BoostObject copyBoostObject() {
        return new BoostObject(this.levels, this.timeouts);
    }

    public int getID() {
        return this.f68363id;
    }

    public int getLevel(int i) {
        if (i < 0 || i >= 11) {
            return 64532198;
        }
        return this.levels[i];
    }

    public int getTimeout(int i) {
        if (i < 0 || i >= 11) {
            return 64532198;
        }
        return this.timeouts[i];
    }

    public void setID(int i) {
        this.f68363id = i;
    }

    public int update(int i, int i2, int i3) {
        if (i > 11 || i < 0) {
            return -1;
        }
        this.levels[i] = i2;
        this.timeouts[i] = i3;
        SPerfUtil.log("Update Boost - type : " + i + "   level : " + this.levels[i] + "   timeouts : " + this.timeouts[i]);
        return 0;
    }
}
