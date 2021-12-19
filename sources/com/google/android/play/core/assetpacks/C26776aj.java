package com.google.android.play.core.assetpacks;

import android.os.ParcelFileDescriptor;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.play.core.p1963b.AbstractC26916bg;
import com.google.android.play.core.p1963b.C26958r;
import com.google.android.play.core.tasks.AbstractC27059a;
import com.google.android.play.core.tasks.AbstractC27060b;
import com.google.android.play.core.tasks.AbstractC27062d;
import com.google.android.play.core.tasks.C27063e;
import com.google.android.play.core.tasks.C27064f;
import com.google.android.play.core.tasks.C27076r;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.play.core.assetpacks.aj */
final class C26776aj {

    /* renamed from: a */
    private final AbstractC26916bg<AbstractC26857dj> f63450a;

    static {
        Covode.recordClassIndex(32251);
    }

    C26776aj(AbstractC26916bg<AbstractC26857dj> bgVar) {
        this.f63450a = bgVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final InputStream mo44479a(int i, String str, String str2, int i2) {
        MethodCollector.m26663i(12397);
        AbstractC27062d<ParcelFileDescriptor> b = this.f63450a.mo44603a().mo44509b(i, str, str2, i2);
        try {
            C26958r.m53562a(b, "Task must not be null");
            if (!b.mo44773a()) {
                C27076r rVar = new C27076r((byte) 0);
                b.mo44772a(C27063e.f64041b, (AbstractC27060b<? super ParcelFileDescriptor>) rVar);
                b.mo44771a(C27063e.f64041b, (AbstractC27059a) rVar);
                rVar.f64062a.await();
            }
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) C27064f.m53802a((AbstractC27062d) b);
            if (parcelFileDescriptor == null || parcelFileDescriptor.getFileDescriptor() == null) {
                C26787au auVar = new C26787au(C1764a.m5928a("Corrupted ParcelFileDescriptor, session %s packName %s sliceId %s, chunkNumber %s", new Object[]{Integer.valueOf(i), str, str2, Integer.valueOf(i2)}), i);
                MethodCollector.m26664o(12397);
                throw auVar;
            }
            ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
            MethodCollector.m26664o(12397);
            return autoCloseInputStream;
        } catch (ExecutionException e) {
            C26787au auVar2 = new C26787au(C1764a.m5928a("Error opening chunk file, session %s packName %s sliceId %s, chunkNumber %s", new Object[]{Integer.valueOf(i), str, str2, Integer.valueOf(i2)}), e, i);
            MethodCollector.m26664o(12397);
            throw auVar2;
        } catch (InterruptedException e2) {
            C26787au auVar3 = new C26787au("Extractor was interrupted while waiting for chunk file.", e2, i);
            MethodCollector.m26664o(12397);
            throw auVar3;
        }
    }
}
