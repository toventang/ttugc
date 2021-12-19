package com.bef.effectsdk.algorithm;

import com.bytedance.covode.number.Covode;

public class GeneralObjDetectResult {
    private ObjectInfo[] obj_infos;
    private String obj_infos_data;
    private int obj_num;
    private int res;

    static {
        Covode.recordClassIndex(2699);
    }

    /* renamed from: com_bef_effectsdk_algorithm_GeneralObjDetectResult_com_ss_android_ugc_aweme_lancet_LogLancet_d */
    public static int m7249xf458cd63(String str, String str2) {
        return 0;
    }

    public ObjectInfo[] getObjectInfos() {
        return this.obj_infos;
    }

    public String getObjectInfosData() {
        return this.obj_infos_data;
    }

    public int getObjectNum() {
        return this.obj_num;
    }

    public int getResult() {
        return this.res;
    }

    public GeneralObjDetectResult() {
        this.res = -1;
    }

    public void logData() {
        m7249xf458cd63("EffectSDK", "GeneralObjDetectResult res:" + this.res + " obj_num:" + this.obj_num);
        for (int i = 0; i < this.obj_num; i++) {
            this.obj_infos[i].logData();
        }
        m7249xf458cd63("EffectSDK", "GeneralObjDetectResult buffer:" + this.obj_infos_data);
    }

    public void ObjectInfosData(String str) {
        this.obj_infos_data = str;
    }

    public void setObjectInfos(ObjectInfo[] objectInfoArr) {
        this.obj_infos = objectInfoArr;
    }

    public void setObjectNum(int i) {
        this.obj_num = i;
    }

    public void setResult(int i) {
        this.res = i;
    }

    public GeneralObjDetectResult(int i, ObjectInfo[] objectInfoArr) {
        this.obj_num = i;
        this.obj_infos = objectInfoArr;
    }

    public GeneralObjDetectResult(int i, ObjectInfo[] objectInfoArr, String str) {
        this.obj_num = i;
        this.obj_infos = objectInfoArr;
        this.obj_infos_data = str;
    }
}
