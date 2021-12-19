package com.bytedance.apm.agent.instrumentation.okhttp3;

import com.bytedance.covode.number.Covode;
import okhttp3.AbstractC90049e;
import okhttp3.AbstractC90191p;

public class OkHttpEventFactory implements AbstractC90191p.AbstractC90194a {
    public AbstractC90191p.AbstractC90194a originFactory;

    static {
        Covode.recordClassIndex(14047);
    }

    public OkHttpEventFactory(AbstractC90191p.AbstractC90194a aVar) {
        this.originFactory = aVar;
    }

    @Override // okhttp3.AbstractC90191p.AbstractC90194a
    public AbstractC90191p create(AbstractC90049e eVar) {
        AbstractC90191p pVar;
        AbstractC90191p.AbstractC90194a aVar = this.originFactory;
        if (aVar != null) {
            pVar = aVar.create(eVar);
        } else {
            pVar = null;
        }
        return new OkHttpEventListener(pVar);
    }
}
