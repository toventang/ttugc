package com.bytedance.lynx.hybrid.resource;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lynx.hybrid.resource.p1527c.C21268a;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import p077b.C1731i;
import p4600h.p4601a.C89064i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.lynx.hybrid.resource.k */
public final class C21336k extends InputStream {

    /* renamed from: a */
    private boolean f50667a = true;

    /* renamed from: b */
    private List<Byte> f50668b = new ArrayList();

    /* renamed from: c */
    private boolean f50669c = true;

    /* renamed from: d */
    private final C21335j f50670d;

    /* renamed from: e */
    private final InputStream f50671e;

    static {
        Covode.recordClassIndex(24954);
    }

    @Override // java.io.InputStream
    public final int available() {
        try {
            return this.f50671e.available();
        } catch (Exception e) {
            this.f50667a = false;
            throw e;
        }
    }

    public final boolean markSupported() {
        try {
            return this.f50671e.markSupported();
        } catch (Exception e) {
            this.f50667a = false;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final void reset() {
        try {
            this.f50671e.reset();
        } catch (Exception e) {
            this.f50667a = false;
            throw e;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public final void close() {
        try {
            this.f50671e.close();
            if (this.f50667a && C89219l.m154714a((Object) this.f50670d.f50665g, (Object) "template") && this.f50669c) {
                C21268a aVar = C21268a.C21270b.f50477a;
                String str = this.f50670d.f50660b;
                if (str == null) {
                    str = "";
                }
                List<Byte> list = this.f50668b;
                C89219l.m154719c(str, "");
                C89219l.m154719c(list, "");
                if (str.length() != 0 && !list.isEmpty()) {
                    C1731i.m5636a(new C21268a.CallableC21272d(aVar, list, str), C1731i.f5562a);
                }
            }
        } catch (Exception e) {
            this.f50667a = false;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        MethodCollector.m26663i(5048);
        try {
            int read = this.f50671e.read();
            if (!this.f50670d.f50666h) {
                this.f50669c = false;
                MethodCollector.m26664o(5048);
                return read;
            }
            if (read != -1 && C21268a.C21270b.f50477a.mo34847a(this.f50670d.f50660b) == null) {
                try {
                    this.f50668b.add(Byte.valueOf((byte) read));
                } catch (OutOfMemoryError unused) {
                    this.f50668b.clear();
                    this.f50669c = false;
                }
            }
            MethodCollector.m26664o(5048);
            return read;
        } catch (Exception e) {
            this.f50667a = false;
            MethodCollector.m26664o(5048);
            throw e;
        }
    }

    public final void mark(int i) {
        try {
            this.f50671e.mark(i);
        } catch (Exception e) {
            this.f50667a = false;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        try {
            return this.f50671e.skip(j);
        } catch (Exception e) {
            this.f50667a = false;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        MethodCollector.m26663i(5051);
        try {
            int read = this.f50671e.read(bArr);
            if (!this.f50670d.f50666h) {
                this.f50669c = false;
                MethodCollector.m26664o(5051);
                return read;
            }
            if (bArr != null && bArr.length != 0 && read > 0 && C21268a.C21270b.f50477a.mo34847a(this.f50670d.f50660b) == null) {
                try {
                    if (read == bArr.length) {
                        this.f50668b.addAll(C89064i.m154486a(bArr));
                    } else {
                        this.f50668b.addAll(C89064i.m154486a(bArr).subList(0, read));
                    }
                } catch (OutOfMemoryError unused) {
                    this.f50668b.clear();
                    this.f50669c = false;
                }
            }
            MethodCollector.m26664o(5051);
            return read;
        } catch (Exception e) {
            this.f50667a = false;
            MethodCollector.m26664o(5051);
            throw e;
        }
    }

    public C21336k(C21335j jVar, InputStream inputStream) {
        C89219l.m154719c(jVar, "");
        C89219l.m154719c(inputStream, "");
        MethodCollector.m26663i(5101);
        this.f50670d = jVar;
        this.f50671e = inputStream;
        MethodCollector.m26664o(5101);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        MethodCollector.m26663i(5058);
        try {
            int read = this.f50671e.read(bArr, i, i2);
            if (!this.f50670d.f50666h) {
                this.f50669c = false;
                MethodCollector.m26664o(5058);
                return read;
            }
            if (bArr != null && bArr.length != 0 && read > 0 && C21268a.C21270b.f50477a.mo34847a(this.f50670d.f50660b) == null) {
                try {
                    if (read == bArr.length) {
                        this.f50668b.addAll(C89064i.m154486a(bArr));
                    } else {
                        this.f50668b.addAll(C89064i.m154486a(bArr).subList(0, read));
                    }
                } catch (OutOfMemoryError unused) {
                    this.f50668b.clear();
                    this.f50669c = false;
                }
            }
            MethodCollector.m26664o(5058);
            return read;
        } catch (Exception e) {
            this.f50667a = false;
            MethodCollector.m26664o(5058);
            throw e;
        }
    }
}
