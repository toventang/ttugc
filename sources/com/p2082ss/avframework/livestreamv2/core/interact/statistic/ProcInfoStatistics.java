package com.p2082ss.avframework.livestreamv2.core.interact.statistic;

import android.content.Context;
import android.os.Process;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.avframework.livestreamv2.core.interact.statistic.ProcInfoStatistics */
public class ProcInfoStatistics {
    private long appCpuTime;
    private short appCpuUsage;
    private boolean hasInit = true;
    private Context mContext;
    private long totalCpuTime;
    private short totalCpuUsage;
    private long usedCpuTime;

    static {
        Covode.recordClassIndex(100446);
    }

    public void release() {
        this.mContext = null;
    }

    public void setCpuCheckPoint() {
        this.totalCpuTime = MonitorUtils.getTotalCPUTime();
        this.usedCpuTime = MonitorUtils.getUsedCPUTime();
        this.appCpuTime = MonitorUtils.getAppCPUTime(Process.myPid());
    }

    public ProcInfo getProcInfo() {
        short s;
        long totalCPUTime = MonitorUtils.getTotalCPUTime();
        long usedCPUTime = MonitorUtils.getUsedCPUTime();
        long appCPUTime = MonitorUtils.getAppCPUTime(Process.myPid());
        float f = (float) (totalCPUTime - this.totalCpuTime);
        float f2 = (float) (usedCPUTime - this.usedCpuTime);
        float f3 = (float) (appCPUTime - this.appCpuTime);
        if (f > 0.0f) {
            if (f3 > 0.0f) {
                this.appCpuUsage = (short) Math.round((f3 / f) * 100.0f);
            }
            if (f2 > 0.0f) {
                this.totalCpuUsage = (short) Math.round((f2 / f) * 100.0f);
            }
        }
        ProcInfo procInfo = new ProcInfo();
        short s2 = -1;
        if (this.hasInit) {
            s = this.appCpuUsage;
        } else {
            s = -1;
        }
        procInfo.appCpuUsed = s;
        if (this.hasInit) {
            s2 = this.totalCpuUsage;
        }
        procInfo.totalCpuUsed = s2;
        Context context = this.mContext;
        if (context != null) {
            procInfo.appUsedMemory = (float) MonitorUtils.getPidMemorySize(Process.myPid(), context);
            procInfo.systemUsedMemory = (float) MonitorUtils.getSysUsedMemory(context);
        }
        this.totalCpuTime = totalCPUTime;
        this.usedCpuTime = usedCPUTime;
        this.appCpuTime = appCPUTime;
        return procInfo;
    }

    /* renamed from: com.ss.avframework.livestreamv2.core.interact.statistic.ProcInfoStatistics$ProcInfo */
    public class ProcInfo {
        public short appCpuUsed;
        public float appUsedMemory;
        public float systemUsedMemory;
        public short totalCpuUsed;

        static {
            Covode.recordClassIndex(100447);
        }

        public ProcInfo() {
        }
    }

    public ProcInfoStatistics(Context context) {
        this.mContext = context;
        setCpuCheckPoint();
    }
}
