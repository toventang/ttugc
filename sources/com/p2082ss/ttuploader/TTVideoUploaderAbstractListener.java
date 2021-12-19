package com.p2082ss.ttuploader;

import com.bytedance.covode.number.Covode;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.ttuploader.TTVideoUploaderAbstractListener */
public abstract class TTVideoUploaderAbstractListener {
    static {
        Covode.recordClassIndex(101497);
    }

    public void onEventLog(JSONObject jSONObject) {
    }

    public void onEventLogMap(Map<String, String> map) {
    }

    public void onSpeedVidContext(int i, int i2, String str) {
    }

    public void onVidContext(String str) {
    }

    public boolean switchNetType(int i) {
        return false;
    }
}
