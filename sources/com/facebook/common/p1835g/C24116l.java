package com.facebook.common.p1835g;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1832d.C24091i;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.facebook.common.g.l */
public final class C24116l {

    /* renamed from: a */
    private final int f57045a;

    /* renamed from: b */
    private final AbstractC24104a f57046b;

    static {
        Covode.recordClassIndex(28244);
    }

    public C24116l(AbstractC24104a aVar) {
        this(aVar, (byte) 0);
    }

    private C24116l(AbstractC24104a aVar, byte b) {
        C24091i.m45620a(true);
        this.f57045a = 16384;
        this.f57046b = aVar;
    }

    /* renamed from: a */
    public final long mo39694a(InputStream inputStream, OutputStream outputStream) {
        MethodCollector.m26663i(10652);
        byte[] bArr = (byte[]) this.f57046b.mo39664a(this.f57045a);
        long j = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, this.f57045a);
                if (read == -1) {
                    return j;
                }
                outputStream.write(bArr, 0, read);
                j += (long) read;
            } finally {
                this.f57046b.mo39665a(bArr);
                MethodCollector.m26664o(10652);
            }
        }
    }
}
