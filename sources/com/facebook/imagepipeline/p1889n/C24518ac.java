package com.facebook.imagepipeline.p1889n;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1835g.AbstractC24113i;
import com.facebook.imagepipeline.p1885j.C24456e;
import com.facebook.imagepipeline.p1890o.C24636b;
import java.io.IOException;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.imagepipeline.n.ac */
public final class C24518ac extends AbstractC24514aa {

    /* renamed from: a */
    private final Resources f58231a;

    static {
        Covode.recordClassIndex(28662);
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.p1889n.AbstractC24514aa
    /* renamed from: a */
    public final String mo40382a() {
        return "LocalResourceFetchProducer";
    }

    /* renamed from: c */
    private static int m46862c(C24636b bVar) {
        return Integer.parseInt(bVar.mSourceUri.getPath().substring(1));
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.p1889n.AbstractC24514aa
    /* renamed from: a */
    public final C24456e mo40380a(C24636b bVar) {
        MethodCollector.m26663i(7488);
        C24456e b = mo40383b(this.f58231a.openRawResource(m46862c(bVar)), m46861b(bVar));
        MethodCollector.m26664o(7488);
        return b;
    }

    /* renamed from: b */
    private int m46861b(C24636b bVar) {
        MethodCollector.m26663i(7667);
        AssetFileDescriptor assetFileDescriptor = null;
        try {
            assetFileDescriptor = this.f58231a.openRawResourceFd(m46862c(bVar));
            int length = (int) assetFileDescriptor.getLength();
            try {
                assetFileDescriptor.close();
            } catch (IOException unused) {
            }
            MethodCollector.m26664o(7667);
            return length;
        } catch (Resources.NotFoundException unused2) {
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException unused3) {
                }
            }
            MethodCollector.m26664o(7667);
            return -1;
        } catch (Throwable th) {
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException unused4) {
                }
            }
            MethodCollector.m26664o(7667);
            throw th;
        }
    }

    public C24518ac(Executor executor, AbstractC24113i iVar, Resources resources) {
        super(executor, iVar);
        this.f58231a = resources;
    }
}
