package org.chromium.diagnosis;

import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.cronet.p985a.AbstractC14644a;
import com.ttnet.org.chromium.net.AbstractC87536c;
import com.ttnet.org.chromium.net.AbstractC87671w;
import java.util.List;
import org.chromium.CronetClient;

public class CronetDiagnosisRequestImpl implements AbstractC14644a {
    private static final String TAG = CronetDiagnosisRequestImpl.class.getSimpleName();
    private static AbstractC87536c sCronetEngine;
    public AbstractC14644a.AbstractC14645a mCallback;
    private C90230a mCronetCallback = new C90230a();
    private AbstractC87671w mRequest;

    private AbstractC87536c getCronetEngine() {
        try {
            loadCronetKernel();
        } catch (Throwable unused) {
        }
        return CronetClient.getCronetEngine();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.p985a.AbstractC14644a
    public void cancel() {
        AbstractC87671w wVar = this.mRequest;
        if (wVar != null) {
            wVar.mo141915b();
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.p985a.AbstractC14644a
    public void start() {
        AbstractC87671w wVar = this.mRequest;
        if (wVar != null) {
            wVar.mo141913a();
        }
    }

    static {
        Covode.recordClassIndex(106489);
    }

    private static void loadCronetKernel() {
        Reflect.m24529on(Class.forName("com.bytedance.ttnet.TTNetInit").newInstance()).call("preInitCronetKernel");
    }

    /* renamed from: org.chromium.diagnosis.CronetDiagnosisRequestImpl$a */
    class C90230a implements AbstractC87671w.AbstractC87673b {
        static {
            Covode.recordClassIndex(106490);
        }

        C90230a() {
        }

        @Override // com.ttnet.org.chromium.net.AbstractC87671w.AbstractC87673b
        /* renamed from: a */
        public final void mo142095a(String str) {
            CronetDiagnosisRequestImpl.this.mCallback.mo23613a(str);
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.p985a.AbstractC14644a
    public void doExtraCommand(String str, String str2) {
        AbstractC87671w wVar = this.mRequest;
        if (wVar != null) {
            wVar.mo141914a(str, str2);
        }
    }

    public CronetDiagnosisRequestImpl(AbstractC14644a.AbstractC14645a aVar, int i, List<String> list, int i2, int i3) {
        this.mCallback = aVar;
        if (sCronetEngine == null) {
            sCronetEngine = getCronetEngine();
        }
        AbstractC87536c cVar = sCronetEngine;
        if (cVar != null) {
            AbstractC87671w.AbstractC87672a a = cVar.mo141713a(this.mCronetCallback);
            a.mo142001a(i).mo142002a(list).mo142004b(i2).mo142005c(i3);
            this.mRequest = a.mo142003a();
            return;
        }
        throw new UnsupportedOperationException("Can not get cronet engine.");
    }
}
