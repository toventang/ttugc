package com.facebook.imagepipeline.p1889n;

import android.content.ContentResolver;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1835g.AbstractC24113i;
import com.facebook.imagepipeline.p1885j.C24456e;
import com.facebook.imagepipeline.p1890o.C24636b;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.imagepipeline.n.ao */
public final class C24548ao extends AbstractC24514aa {

    /* renamed from: a */
    private final ContentResolver f58307a;

    static {
        Covode.recordClassIndex(28692);
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.p1889n.AbstractC24514aa
    /* renamed from: a */
    public final String mo40382a() {
        return "QualifiedResourceFetchProducer";
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.p1889n.AbstractC24514aa
    /* renamed from: a */
    public final C24456e mo40380a(C24636b bVar) {
        MethodCollector.m26663i(3852);
        C24456e b = mo40383b(this.f58307a.openInputStream(bVar.mSourceUri), -1);
        MethodCollector.m26664o(3852);
        return b;
    }

    public C24548ao(Executor executor, AbstractC24113i iVar, ContentResolver contentResolver) {
        super(executor, iVar);
        this.f58307a = contentResolver;
    }
}
