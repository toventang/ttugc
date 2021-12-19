package com.facebook.imagepipeline.p1889n;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1835g.AbstractC24113i;
import com.facebook.imagepipeline.p1885j.C24456e;
import com.facebook.imagepipeline.p1890o.C24636b;
import java.io.FileInputStream;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.imagepipeline.n.ab */
public final class C24517ab extends AbstractC24514aa {
    static {
        Covode.recordClassIndex(28661);
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.p1889n.AbstractC24514aa
    /* renamed from: a */
    public final String mo40382a() {
        return "LocalFileFetchProducer";
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.p1889n.AbstractC24514aa
    /* renamed from: a */
    public final C24456e mo40380a(C24636b bVar) {
        MethodCollector.m26663i(7032);
        C24456e b = mo40383b(new FileInputStream(bVar.getSourceFile().toString()), (int) bVar.getSourceFile().length());
        MethodCollector.m26664o(7032);
        return b;
    }

    public C24517ab(Executor executor, AbstractC24113i iVar) {
        super(executor, iVar);
    }
}
