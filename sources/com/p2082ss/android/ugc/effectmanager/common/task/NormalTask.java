package com.p2082ss.android.ugc.effectmanager.common.task;

import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.effectmanager.common.task.NormalTask */
public abstract class NormalTask implements ITask {
    private final Handler handler;
    private boolean isCanceled;
    private String taskId;

    static {
        Covode.recordClassIndex(95499);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.common.task.ITask
    public void cancel() {
        this.isCanceled = true;
    }

    public final Handler getHandler() {
        return this.handler;
    }

    /* access modifiers changed from: protected */
    public final boolean isCanceled() {
        return this.isCanceled;
    }

    /* access modifiers changed from: protected */
    public final String getTaskId() {
        String str = this.taskId;
        if (str == null) {
            return "";
        }
        return str;
    }

    /* access modifiers changed from: protected */
    public final void setCanceled(boolean z) {
        this.isCanceled = z;
    }

    public NormalTask(Handler handler2, String str) {
        this.handler = handler2;
        this.taskId = str;
    }

    public final void sendMessage(int i, BaseTaskResult baseTaskResult) {
        Message obtainMessage;
        C89219l.m154719c(baseTaskResult, "");
        baseTaskResult.setTaskID(this.taskId);
        Handler handler2 = this.handler;
        if (handler2 != null && (obtainMessage = handler2.obtainMessage(i)) != null) {
            obtainMessage.obj = baseTaskResult;
            obtainMessage.sendToTarget();
        }
    }
}
