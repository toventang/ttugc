package com.p2082ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.api.AbstractC33617c;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.discover.model.LazyParseTask */
public interface LazyParseTask<T extends AbstractC33617c> {
    static {
        Covode.recordClassIndex(50465);
    }

    Callable<T> getLazyParseCallable();

    void setLazyParseCallable(Callable<T> callable);
}
