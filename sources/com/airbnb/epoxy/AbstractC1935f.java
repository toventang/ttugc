package com.airbnb.epoxy;

import com.airbnb.epoxy.AbstractC1944n;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.airbnb.epoxy.f */
public abstract class AbstractC1935f<T extends AbstractC1944n> {
    static {
        Covode.recordClassIndex(2126);
    }

    public abstract void resetAutoModels();

    /* access modifiers changed from: protected */
    public void validateModelHashCodesHaveNotChanged(T t) {
        List<? extends AbstractC1956s<?>> list = t.getAdapter().f5822f.f5778f;
        for (int i = 0; i < list.size(); i++) {
            ((AbstractC1956s) list.get(i)).mo5791a("Model has changed since it was added to the controller.", i);
        }
    }

    /* access modifiers changed from: protected */
    public void setControllerToStageTo(AbstractC1956s<?> sVar, T t) {
        sVar.f5841d = t;
    }
}
