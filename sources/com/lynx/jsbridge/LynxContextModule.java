package com.lynx.jsbridge;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.AbstractC28520j;

public class LynxContextModule extends LynxModule {
    protected AbstractC28520j mLynxContext;

    static {
        Covode.recordClassIndex(34310);
    }

    public LynxContextModule(AbstractC28520j jVar) {
        super(jVar);
        this.mLynxContext = jVar;
    }

    public LynxContextModule(AbstractC28520j jVar, Object obj) {
        super(jVar, obj);
        this.mLynxContext = jVar;
    }
}
