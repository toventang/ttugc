package com.facebook.imagepipeline.p1889n;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1835g.AbstractC24113i;
import com.facebook.imagepipeline.p1885j.C24456e;
import com.facebook.imagepipeline.p1890o.C24636b;
import java.io.IOException;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.imagepipeline.n.w */
public final class C24625w extends AbstractC24514aa {

    /* renamed from: a */
    private final AssetManager f58526a;

    static {
        Covode.recordClassIndex(28769);
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.p1889n.AbstractC24514aa
    /* renamed from: a */
    public final String mo40382a() {
        return "LocalAssetFetchProducer";
    }

    /* renamed from: c */
    private static String m47127c(C24636b bVar) {
        return bVar.mSourceUri.getPath().substring(1);
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.p1889n.AbstractC24514aa
    /* renamed from: a */
    public final C24456e mo40380a(C24636b bVar) {
        MethodCollector.m26663i(8101);
        C24456e b = mo40383b(this.f58526a.open(m47127c(bVar), 2), m47126b(bVar));
        MethodCollector.m26664o(8101);
        return b;
    }

    /* renamed from: b */
    private int m47126b(C24636b bVar) {
        MethodCollector.m26663i(8104);
        AssetFileDescriptor assetFileDescriptor = null;
        try {
            assetFileDescriptor = this.f58526a.openFd(m47127c(bVar));
            int length = (int) assetFileDescriptor.getLength();
            try {
                assetFileDescriptor.close();
            } catch (IOException unused) {
            }
            MethodCollector.m26664o(8104);
            return length;
        } catch (IOException unused2) {
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException unused3) {
                }
            }
            MethodCollector.m26664o(8104);
            return -1;
        } catch (Throwable th) {
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException unused4) {
                }
            }
            MethodCollector.m26664o(8104);
            throw th;
        }
    }

    public C24625w(Executor executor, AbstractC24113i iVar, AssetManager assetManager) {
        super(executor, iVar);
        this.f58526a = assetManager;
    }
}
