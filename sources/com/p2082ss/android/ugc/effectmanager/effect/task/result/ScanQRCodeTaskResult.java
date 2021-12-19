package com.p2082ss.android.ugc.effectmanager.effect.task.result;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.task.BaseTaskResult;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;

/* renamed from: com.ss.android.ugc.effectmanager.effect.task.result.ScanQRCodeTaskResult */
public class ScanQRCodeTaskResult extends BaseTaskResult {
    public final Effect effect;
    public final ExceptionResult exception;

    static {
        Covode.recordClassIndex(95678);
    }

    public ScanQRCodeTaskResult(Effect effect2, ExceptionResult exceptionResult) {
        this.effect = effect2;
        this.exception = exceptionResult;
    }
}
