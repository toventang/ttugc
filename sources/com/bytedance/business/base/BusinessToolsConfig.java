package com.bytedance.business.base;

import com.bytedance.business.p889a.C13464a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class BusinessToolsConfig {
    private static volatile BusinessToolsConfig mBusinessToolsConfig;
    private int aid;
    private int appVersionCode;
    private String appVersionName;
    private boolean isDebug;
    private C13464a mBugReportConfig;

    static {
        Covode.recordClassIndex(15466);
    }

    public int getAid() {
        return this.aid;
    }

    public int getAppVersionCode() {
        return this.appVersionCode;
    }

    public String getAppVersionName() {
        return this.appVersionName;
    }

    public C13464a getBugReportConfig() {
        return this.mBugReportConfig;
    }

    public boolean isDebug() {
        return this.isDebug;
    }

    public void setAid(int i) {
        this.aid = i;
    }

    public void setAppVersionCode(int i) {
        this.appVersionCode = i;
    }

    public void setAppVersionName(String str) {
        this.appVersionName = str;
    }

    public void setBugReportConfig(C13464a aVar) {
        this.mBugReportConfig = aVar;
    }

    public void setDebug(boolean z) {
        this.isDebug = z;
    }

    private BusinessToolsConfig(String str, int i, int i2, boolean z) {
        this.appVersionName = str;
        this.appVersionCode = i;
        this.aid = i2;
        this.isDebug = z;
    }

    public static BusinessToolsConfig getInstance(String str, int i, int i2, boolean z) {
        MethodCollector.m26663i(10421);
        if (mBusinessToolsConfig == null) {
            synchronized (BusinessToolsConfig.class) {
                try {
                    if (mBusinessToolsConfig == null) {
                        mBusinessToolsConfig = new BusinessToolsConfig(str, i, i2, z);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(10421);
                    throw th;
                }
            }
        }
        BusinessToolsConfig businessToolsConfig = mBusinessToolsConfig;
        MethodCollector.m26664o(10421);
        return businessToolsConfig;
    }
}
