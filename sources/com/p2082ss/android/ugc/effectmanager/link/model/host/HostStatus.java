package com.p2082ss.android.ugc.effectmanager.link.model.host;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.effectmanager.link.model.host.HostStatus */
public class HostStatus {
    public long duration;
    public Exception exception;
    public Host host;
    public boolean isSuccess;
    public long sendTime;
    public int status;
    public String traceCode;
    public String url;

    static {
        Covode.recordClassIndex(95767);
    }

    public String toString() {
        return "HostStatus{url='" + this.url + '\'' + ", host=" + this.host.toString() + ", status=" + this.status + ", duration=" + this.duration + ", sendTime=" + this.sendTime + ", traceCode='" + this.traceCode + '\'' + ", exception=" + this.exception + ", isSuccess=" + this.isSuccess + '}';
    }

    public HostStatus(String str, Host host2, int i, long j, long j2, String str2, Exception exc, boolean z) {
        this.url = str;
        this.host = host2;
        this.status = i;
        this.duration = j;
        this.sendTime = j2;
        this.traceCode = str2;
        this.exception = exc;
        this.isSuccess = z;
    }
}
