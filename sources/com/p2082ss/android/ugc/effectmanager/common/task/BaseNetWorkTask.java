package com.p2082ss.android.ugc.effectmanager.common.task;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.EffectRequest;
import com.p2082ss.android.ugc.effectmanager.common.exception.StatusCodeException;
import com.p2082ss.android.ugc.effectmanager.common.listener.IJsonConverter;
import com.p2082ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import com.p2082ss.android.ugc.effectmanager.common.network.EffectNetWorkerWrapper;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.effectmanager.common.task.BaseNetWorkTask */
public abstract class BaseNetWorkTask<T, F extends BaseNetResponse> extends NewNormalTask<T> {
    private final IJsonConverter jsonConverter;
    private final EffectNetWorkerWrapper netWorkerWrapper;

    static {
        Covode.recordClassIndex(95490);
    }

    /* access modifiers changed from: protected */
    public abstract EffectRequest builRequest();

    /* access modifiers changed from: protected */
    public int getFailCode() {
        return 10002;
    }

    /* access modifiers changed from: protected */
    public abstract Class<F> getRealNetResponseClass();

    /* access modifiers changed from: protected */
    public int getRetryCount() {
        return 1;
    }

    /* access modifiers changed from: protected */
    public abstract void onFail(ExceptionResult exceptionResult);

    /* access modifiers changed from: protected */
    public abstract void onSuccess(F f);

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.ss.android.ugc.effectmanager.common.task.BaseNetWorkTask<T, F extends com.ss.android.ugc.effectmanager.common.model.BaseNetResponse> */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.effectmanager.common.task.NewNormalTask
    public void execute() {
        BaseNetResponse execute;
        int retryCount = getRetryCount();
        while (true) {
            int i = retryCount - 1;
            if (retryCount != 0) {
                try {
                    if (!isCanceled()) {
                        EffectRequest builRequest = builRequest();
                        EffectNetWorkerWrapper effectNetWorkerWrapper = this.netWorkerWrapper;
                        if (effectNetWorkerWrapper != null && (execute = effectNetWorkerWrapper.execute(builRequest, this.jsonConverter, getRealNetResponseClass())) != null && execute.checkValue()) {
                            onSuccess(execute);
                            return;
                        } else if (i == 0) {
                            onFail(new ExceptionResult(getFailCode()));
                            return;
                        } else {
                            retryCount = i;
                        }
                    } else {
                        return;
                    }
                } catch (Exception e) {
                    if (i == 0 || (e instanceof StatusCodeException)) {
                        onFail(new ExceptionResult(e));
                        e.printStackTrace();
                    }
                }
            } else {
                return;
            }
        }
        onFail(new ExceptionResult(e));
        e.printStackTrace();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseNetWorkTask(EffectNetWorkerWrapper effectNetWorkerWrapper, IJsonConverter iJsonConverter, Handler handler, String str) {
        super(handler, str);
        C89219l.m154719c(iJsonConverter, "");
        C89219l.m154719c(str, "");
        this.netWorkerWrapper = effectNetWorkerWrapper;
        this.jsonConverter = iJsonConverter;
    }
}
