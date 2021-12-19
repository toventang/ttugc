package com.bytedance.vcloud.networkpredictor;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

public class SpeedPredictorNotifyInfo {
    public long code;
    public ISpeedRecordOld mSpeedRecord;
    public Map<String, Integer> mStreamIdMediaTypeMap;
    public long parameter;
    public int what;

    static {
        Covode.recordClassIndex(27627);
    }

    public SpeedPredictorNotifyInfo() {
        this.what = -1;
        this.code = -1;
        this.parameter = -1;
    }

    public SpeedPredictorNotifyInfo(int i, ISpeedRecordOld iSpeedRecordOld, HashMap<String, Integer> hashMap) {
        this.what = i;
        this.code = -1;
        this.parameter = -1;
        this.mSpeedRecord = iSpeedRecordOld;
        this.mStreamIdMediaTypeMap = hashMap;
    }
}
