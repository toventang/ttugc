package com.p2082ss.android.ugc.aweme.effectplatform;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.effectplatform.q */
public abstract class AbstractC46431q implements ICheckChannelListener {

    /* renamed from: b */
    public final ICheckChannelListener f108189b;

    static {
        Covode.recordClassIndex(55012);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
    public void checkChannelFailed(ExceptionResult exceptionResult) {
        this.f108189b.checkChannelFailed(exceptionResult);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
    public void checkChannelSuccess(boolean z) {
        this.f108189b.checkChannelSuccess(z);
    }

    public AbstractC46431q(ICheckChannelListener iCheckChannelListener) {
        C89219l.m154721d(iCheckChannelListener, "");
        this.f108189b = iCheckChannelListener;
    }
}
