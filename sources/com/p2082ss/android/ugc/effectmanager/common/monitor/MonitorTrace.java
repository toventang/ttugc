package com.p2082ss.android.ugc.effectmanager.common.monitor;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.utils.TimeUtils;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.effectmanager.common.monitor.MonitorTrace */
public final class MonitorTrace {
    private long duration;

    /* renamed from: id */
    private final String f183429id;
    private boolean isTraceEnded;
    private final List<String> stepList = new ArrayList();
    private long traceBeginTimeMills;

    static {
        Covode.recordClassIndex(95487);
    }

    public final long getDuration() {
        return this.duration;
    }

    public final String getId() {
        return this.f183429id;
    }

    public final List<String> getStepList() {
        return this.stepList;
    }

    public final void begin() {
        if (!this.stepList.isEmpty()) {
            this.stepList.clear();
        }
        this.isTraceEnded = false;
        this.traceBeginTimeMills = SystemClock.uptimeMillis();
        addStep(">>>>>>> Trace Begin <<<<<<<");
    }

    public final void end() {
        addStep(">>>>>>> Trace End <<<<<<<");
        this.isTraceEnded = true;
        this.duration = SystemClock.uptimeMillis() - this.traceBeginTimeMills;
    }

    public MonitorTrace(String str) {
        this.f183429id = str;
    }

    public final void addStep(String str) {
        C89219l.m154719c(str, "");
        if (!this.isTraceEnded) {
            this.stepList.add(TimeUtils.INSTANCE.currentTime() + " [" + this.f183429id + "]->" + str + " \n");
        }
    }
}
