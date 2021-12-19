package com.p2082ss.mediakit.medialoader;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.ss.mediakit.medialoader.AVMDLDataLoaderNotifyInfo */
public class AVMDLDataLoaderNotifyInfo {
    public long code;
    public JSONObject jsonLog;
    public String logExtraJsonStr;
    public String logInfo;
    public String logType;
    public long parameter;
    public int what;

    static {
        Covode.recordClassIndex(101210);
    }

    public AVMDLDataLoaderNotifyInfo() {
        this.what = -1;
        this.code = -1;
        this.parameter = -1;
    }

    public void logToJson() {
        if (this.logInfo != null) {
            this.jsonLog = null;
            try {
                this.jsonLog = new JSONObject(this.logInfo);
            } catch (Exception unused) {
                this.jsonLog = null;
            }
        }
    }

    public AVMDLDataLoaderNotifyInfo(int i, int i2, String str) {
        this.what = i;
        this.code = (long) i2;
        this.parameter = -1;
        this.logInfo = str;
    }
}
