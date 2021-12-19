package com.p2082ss.android.ugc.effectmanager.common.task;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.effectmanager.common.task.BaseTaskResult */
public class BaseTaskResult {
    private String taskID;

    static {
        Covode.recordClassIndex(95491);
    }

    public String getTaskID() {
        return this.taskID;
    }

    public void setTaskID(String str) {
        this.taskID = str;
    }
}
