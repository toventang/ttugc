package com.p2082ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.ugc.effectplatform.p4440a.p4443c.AbstractC86697a;
import java.io.InputStream;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.effectmanager.knadapt.InputStreamByteRead */
public final class InputStreamByteRead implements AbstractC86697a {
    private final InputStream inputStream;

    static {
        Covode.recordClassIndex(95719);
    }

    @Override // com.p2082ss.ugc.effectplatform.p4440a.p4443c.AbstractC86697a
    public final void close() {
        this.inputStream.close();
    }

    @Override // com.p2082ss.ugc.effectplatform.p4440a.p4443c.AbstractC86697a
    public final boolean available() {
        if (this.inputStream.available() >= 0) {
            return true;
        }
        return false;
    }

    public InputStreamByteRead(InputStream inputStream2) {
        C89219l.m154719c(inputStream2, "");
        this.inputStream = inputStream2;
    }

    @Override // com.p2082ss.ugc.effectplatform.p4440a.p4443c.AbstractC86697a
    public final int read(byte[] bArr, int i, int i2) {
        MethodCollector.m26663i(2245);
        C89219l.m154719c(bArr, "");
        int read = this.inputStream.read(bArr, i, i2);
        MethodCollector.m26664o(2245);
        return read;
    }
}
