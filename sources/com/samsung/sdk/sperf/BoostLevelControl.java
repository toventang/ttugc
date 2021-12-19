package com.samsung.sdk.sperf;

import com.bytedance.covode.number.Covode;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.HashMap;

/* access modifiers changed from: package-private */
public class BoostLevelControl {
    private static int boostResourceCount;
    private static BoostResource[] boostResources = new BoostResource[11];
    private static BoostLevelControl instance;
    private static boolean isBoostLevelIntialized;
    private HashMap<Integer, BoostObject> scenarioBoostObjectMap = new HashMap<>();

    static {
        Covode.recordClassIndex(35071);
    }

    private BoostLevelControl(SessionControl sessionControl) {
        int i;
        IOException e;
        int[] iArr = {64532198, 64532198, 64532198, 64532198, 64532198};
        int[] iArr2 = {64532198, 64532198, 64532198, 64532198, 64532198};
        int[] iArr3 = {64532198, 64532198, 64532198, 64532198, 64532198};
        int[] iArr4 = {64532198, 64532198, 64532198, 64532198, 64532198};
        int[] iArr5 = {64532198, 64532198, 64532198, 64532198, 64532198};
        int[] iArr6 = {64532198, 64532198, 64532198, 64532198, 64532198};
        int[] iArr7 = {0, 4};
        int[] iArr8 = {-20, -10, 0, 10, 20};
        int i2 = -1;
        try {
            DataOutputStream dataOutputStream = sessionControl.getDataOutputStream();
            DataInputStream dataInputStream = sessionControl.getDataInputStream();
            if (dataOutputStream != null && dataInputStream != null) {
                dataOutputStream.writeInt(Integer.reverseBytes(10));
                dataOutputStream.flush();
                Integer.reverseBytes(dataInputStream.readInt());
                Integer.reverseBytes(dataInputStream.readInt());
                Integer.reverseBytes(dataInputStream.readInt());
                i = Integer.reverseBytes(dataInputStream.readInt());
                i = i == -1 ? 99999999 : i;
                int i3 = 0;
                while (true) {
                    try {
                        iArr[i3] = Integer.reverseBytes(dataInputStream.readInt());
                        i3++;
                        if (i3 >= 5) {
                            break;
                        }
                    } catch (IOException e2) {
                        e = e2;
                        e.printStackTrace();
                        setBoostResource(6, iArr7, i);
                        setBoostResource(7, iArr7, 99999999);
                        setBoostResource(8, new int[]{70, 74, 30}, i);
                        setBoostResource(9, iArr8, i);
                        setBoostResource(10, new int[]{1}, i);
                        boostResources[8].setDefaultLevel(0);
                        boostResources[9].setDefaultLevel(2);
                        initScenarioBoostObject();
                        isBoostLevelIntialized = true;
                    }
                }
                int i4 = 0;
                while (true) {
                    iArr3[i4] = Integer.reverseBytes(dataInputStream.readInt());
                    i4++;
                    if (i4 >= 5) {
                        break;
                    }
                }
                int i5 = 0;
                while (true) {
                    iArr5[i5] = Integer.reverseBytes(dataInputStream.readInt());
                    i5++;
                    if (i5 >= 5) {
                        try {
                            break;
                        } catch (IOException e3) {
                            e = e3;
                            i2 = i;
                            i = i2;
                            e.printStackTrace();
                            setBoostResource(6, iArr7, i);
                            setBoostResource(7, iArr7, 99999999);
                            setBoostResource(8, new int[]{70, 74, 30}, i);
                            setBoostResource(9, iArr8, i);
                            setBoostResource(10, new int[]{1}, i);
                            boostResources[8].setDefaultLevel(0);
                            boostResources[9].setDefaultLevel(2);
                            initScenarioBoostObject();
                            isBoostLevelIntialized = true;
                        }
                    }
                }
                setBoostResource(0, iArr, i);
                setBoostResource(2, iArr3, i);
                setBoostResource(4, iArr5, i);
                int reverseBytes = Integer.reverseBytes(dataInputStream.readInt());
                int reverseBytes2 = Integer.reverseBytes(dataInputStream.readInt());
                int reverseBytes3 = Integer.reverseBytes(dataInputStream.readInt());
                i = Integer.reverseBytes(dataInputStream.readInt());
                i = i == -1 ? 99999999 : i;
                int i6 = 0;
                do {
                    iArr2[i6] = Integer.reverseBytes(dataInputStream.readInt());
                    i6++;
                } while (i6 < 5);
                int i7 = 0;
                do {
                    iArr4[i7] = Integer.reverseBytes(dataInputStream.readInt());
                    i7++;
                } while (i7 < 5);
                int i8 = 0;
                do {
                    iArr6[i8] = Integer.reverseBytes(dataInputStream.readInt());
                    i8++;
                } while (i8 < 5);
                setBoostResource(1, iArr2, i);
                setBoostResource(3, iArr4, i);
                setBoostResource(5, iArr6, i);
                SPerfUtil.log("Get message : ");
                SPerfUtil.log("numCpuLevels = " + reverseBytes + ", numGpuLevels = " + reverseBytes2 + ", numBusLevels = " + reverseBytes3);
                SPerfUtil.log("cpus : " + iArr2[0] + " " + iArr2[1] + " " + iArr2[2] + " " + iArr2[3] + " " + iArr2[4]);
                SPerfUtil.log("gpus : " + iArr4[0] + " " + iArr4[1] + " " + iArr4[2] + " " + iArr4[3] + " " + iArr4[4]);
                SPerfUtil.log("buses: " + iArr6[0] + " " + iArr6[1] + " " + iArr6[2] + " " + iArr6[3] + " " + iArr6[4]);
                setBoostResource(6, iArr7, i);
                setBoostResource(7, iArr7, 99999999);
                setBoostResource(8, new int[]{70, 74, 30}, i);
                setBoostResource(9, iArr8, i);
                setBoostResource(10, new int[]{1}, i);
                boostResources[8].setDefaultLevel(0);
                boostResources[9].setDefaultLevel(2);
                initScenarioBoostObject();
                isBoostLevelIntialized = true;
            }
        } catch (IOException e4) {
            e = e4;
            i = i2;
            e.printStackTrace();
            setBoostResource(6, iArr7, i);
            setBoostResource(7, iArr7, 99999999);
            setBoostResource(8, new int[]{70, 74, 30}, i);
            setBoostResource(9, iArr8, i);
            setBoostResource(10, new int[]{1}, i);
            boostResources[8].setDefaultLevel(0);
            boostResources[9].setDefaultLevel(2);
            initScenarioBoostObject();
            isBoostLevelIntialized = true;
        }
    }

    public static BoostLevelControl createInstance(SessionControl sessionControl) {
        if (instance == null) {
            instance = new BoostLevelControl(sessionControl);
            if (!isBoostLevelIntialized || boostResourceCount <= 0) {
                instance = null;
            }
        }
        return instance;
    }

    public static BoostResource getBoostResource(int i) {
        if (i < 0 || i >= 11) {
            return null;
        }
        return boostResources[i];
    }

    public static int getRealBoostLevel(int i, int i2) {
        if (instance != null && i2 >= 0 && i2 < 11) {
            return boostResources[i2].getRealBoostLevel(i);
        }
        return -1;
    }

    public static int getRealBoostLevel(BoostObject boostObject, int i) {
        if (instance != null && i >= 0 && i < 11) {
            return boostResources[i].getRealBoostLevel(boostObject.getLevel(i));
        }
        return -1;
    }

    private void initScenarioBoostObject() {
        BoostObject boostObject = new BoostObject();
        boostObject.update(0, 2, 64532198);
        boostObject.update(6, 1, 64532198);
        this.scenarioBoostObjectMap.put(64, boostObject);
        BoostObject boostObject2 = new BoostObject();
        boostObject2.update(2, 2, 64532198);
        this.scenarioBoostObjectMap.put(128, boostObject2);
        BoostObject boostObject3 = new BoostObject();
        boostObject3.update(4, 2, 64532198);
        this.scenarioBoostObjectMap.put(256, boostObject3);
    }

    public static int setBoostResource(int i, int[] iArr, int i2) {
        if (i < 0 || i >= 11 || boostResources[i] != null) {
            return -1;
        }
        SPerfUtil.log("====setBoostResource==== type : " + i);
        boostResourceCount = boostResourceCount + 1;
        boostResources[i] = new BoostResource(iArr, i2);
        return boostResourceCount;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        if (r3 != null) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.samsung.sdk.sperf.BoostObject getBoostObjectByScenario(int r6, int r7) {
        /*
            r5 = this;
            r4 = 0
            r2 = 64
            r3 = r4
        L_0x0004:
            r0 = r2 & r6
            if (r0 != r2) goto L_0x0027
            java.util.HashMap<java.lang.Integer, com.samsung.sdk.sperf.BoostObject> r1 = r5.scenarioBoostObjectMap
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r1.get(r0)
            com.samsung.sdk.sperf.BoostObject r0 = (com.samsung.sdk.sperf.BoostObject) r0
            if (r0 == 0) goto L_0x0024
            if (r3 != 0) goto L_0x001d
            com.samsung.sdk.sperf.BoostObject r3 = new com.samsung.sdk.sperf.BoostObject
            r3.<init>()
        L_0x001d:
            boolean r0 = r3.combineBoostObject(r0)
            if (r0 != 0) goto L_0x0027
            return r4
        L_0x0024:
            if (r3 == 0) goto L_0x0027
            goto L_0x001d
        L_0x0027:
            int r2 = r2 << 1
            r0 = 256(0x100, float:3.59E-43)
            if (r2 > r0) goto L_0x002e
            goto L_0x0004
        L_0x002e:
            if (r3 != 0) goto L_0x0031
            return r4
        L_0x0031:
            r2 = 0
        L_0x0032:
            int r1 = r3.getLevel(r2)
            r0 = 64532198(0x3d8aee6, float:1.2735494E-36)
            if (r1 == r0) goto L_0x003e
            r3.update(r2, r1, r7)
        L_0x003e:
            int r2 = r2 + 1
            r0 = 11
            if (r2 >= r0) goto L_0x0045
            goto L_0x0032
        L_0x0045:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.samsung.sdk.sperf.BoostLevelControl.getBoostObjectByScenario(int, int):com.samsung.sdk.sperf.BoostObject");
    }

    public int updateBoost(int i, int i2, int i3, BoostObject boostObject) {
        StringBuilder sb;
        if (i >= 0) {
            BoostResource[] boostResourceArr = boostResources;
            if (i >= boostResourceArr.length || boostObject == null || boostResourceArr[i] == null) {
                return -1;
            }
            int adjustLevel = boostResourceArr[i].adjustLevel(i2);
            int adjustTimeout = boostResources[i].adjustTimeout(i3);
            if (adjustLevel != i2) {
                sb = new StringBuilder();
                sb.append("Requested Boost Level is not available : ");
                sb.append(i2);
            } else if (adjustTimeout == i3) {
                return boostObject.update(i, adjustLevel, adjustTimeout);
            } else {
                sb = new StringBuilder();
                sb.append("Requested Boost timeout is not available : ");
                sb.append(i3);
            }
            SPerfUtil.log(sb.toString());
            return -1;
        }
        return -1;
    }
}
