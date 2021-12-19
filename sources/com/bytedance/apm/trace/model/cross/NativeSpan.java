package com.bytedance.apm.trace.model.cross;

import com.bytedance.apm.trace.model.AbstractC12639a;
import com.bytedance.apm.trace.model.C12640b;
import com.bytedance.apm.trace.p790a.AbstractC12607c;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

public class NativeSpan {
    private long finishTime;
    private boolean isErrorSpan;
    private boolean isFinish;
    private String parentId;
    private String referenceId;
    private String spanId;
    private String spanName;
    private long startTime;
    private Map<String, String> tags;
    private String threadName;

    static {
        Covode.recordClassIndex(14459);
    }

    public long getFinishTime() {
        return this.finishTime;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public String toString() {
        return "NativeSpan{, spanName='" + this.spanName + '\'' + ", spanId=" + this.spanId + ", parentId=" + this.parentId + ", referenceId=" + this.referenceId + ", startTime=" + this.startTime + ", finishTime=" + this.finishTime + ", threadName='" + this.threadName + '\'' + ", tags=" + this.tags + ", isErrorSpan=" + this.isErrorSpan + ", isFinish=" + this.isFinish + '}';
    }

    public AbstractC12607c parseToSpan(AbstractC12639a aVar) {
        if (!this.isFinish) {
            return null;
        }
        C12640b bVar = new C12640b(this.spanName, "tracer_window_span", aVar, Long.parseLong(this.spanId));
        String str = this.parentId;
        if (str != null && !str.isEmpty()) {
            bVar.mo20418a(Long.parseLong(this.parentId));
        }
        String str2 = this.referenceId;
        if (str2 != null && !str2.isEmpty()) {
            bVar.mo20421b(Long.parseLong(this.referenceId));
        }
        bVar.mo20419a(this.threadName);
        for (Map.Entry<String, String> entry : this.tags.entrySet()) {
            bVar.mo20420a(entry.getKey(), entry.getValue());
        }
        return bVar;
    }

    public NativeSpan(String str, String str2, String str3, String str4, long j, long j2, String str5, HashMap<String, String> hashMap, boolean z, boolean z2) {
        this.spanName = str;
        this.spanId = str2;
        this.parentId = str3;
        this.referenceId = str4;
        this.startTime = j;
        this.finishTime = j2;
        this.threadName = str5;
        this.tags = hashMap;
        this.isErrorSpan = z;
        this.isFinish = z2;
    }
}
