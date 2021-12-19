package com.bytedance.ies.bullet.kit.p1148a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.kit.p1148a.p1150b.C16329a;
import com.bytedance.ies.bullet.service.base.AbstractC16654o;
import com.bytedance.ies.bullet.service.base.C16607an;
import com.bytedance.ies.bullet.service.base.p1164b.C16622e;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import p077b.C1731i;
import p4600h.p4601a.C89064i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.kit.a.i */
public final class C16349i extends InputStream {

    /* renamed from: a */
    private C16607an f39292a = new C16607an("bdx_resourceloader_comsume", null, null, 254);

    /* renamed from: b */
    private boolean f39293b = true;

    /* renamed from: c */
    private List<Byte> f39294c = new ArrayList();

    /* renamed from: d */
    private boolean f39295d = true;

    /* renamed from: e */
    private final C16342f f39296e;

    /* renamed from: f */
    private final InputStream f39297f;

    static {
        Covode.recordClassIndex(18642);
    }

    @Override // java.io.InputStream
    public final int available() {
        try {
            return this.f39297f.available();
        } catch (Exception e) {
            m30369a(e);
            throw e;
        }
    }

    public final boolean markSupported() {
        try {
            return this.f39297f.markSupported();
        } catch (Exception e) {
            m30369a(e);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final void reset() {
        try {
            this.f39297f.reset();
        } catch (Exception e) {
            m30369a(e);
            throw e;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public final void close() {
        try {
            this.f39297f.close();
            if (this.f39293b) {
                C16607an anVar = this.f39292a;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("res_state", "success");
                jSONObject.put("res_from", this.f39296e.mo26372b());
                anVar.f39742g = jSONObject;
                AbstractC16654o oVar = (AbstractC16654o) C16622e.C16623a.m30858a().mo26346a(AbstractC16654o.class);
                if (oVar != null) {
                    oVar.mo26319a(this.f39292a);
                }
                if (C89219l.m154714a((Object) this.f39296e.f39280g, (Object) "template") && this.f39295d) {
                    C16329a aVar = C16329a.C16331b.f39233a;
                    String str = this.f39296e.f39275b;
                    if (str == null) {
                        str = "";
                    }
                    List<Byte> list = this.f39294c;
                    C89219l.m154719c(str, "");
                    C89219l.m154719c(list, "");
                    if (str.length() != 0 && !list.isEmpty()) {
                        C1731i.m5640b(new C16329a.CallableC16333d(aVar, list, str), C1731i.f5562a);
                    }
                }
            }
        } catch (Exception e) {
            m30369a(e);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        MethodCollector.m26663i(7047);
        try {
            int read = this.f39297f.read();
            if (!this.f39296e.f39281h) {
                this.f39295d = false;
                MethodCollector.m26664o(7047);
                return read;
            }
            if (read != -1 && C16329a.C16331b.f39233a.mo25905a(this.f39296e.f39275b) == null) {
                try {
                    this.f39294c.add(Byte.valueOf((byte) read));
                } catch (OutOfMemoryError unused) {
                    this.f39294c.clear();
                    this.f39295d = false;
                }
            }
            MethodCollector.m26664o(7047);
            return read;
        } catch (Exception e) {
            m30369a(e);
            MethodCollector.m26664o(7047);
            throw e;
        }
    }

    public final void mark(int i) {
        try {
            this.f39297f.mark(i);
        } catch (Exception e) {
            m30369a(e);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        try {
            return this.f39297f.skip(j);
        } catch (Exception e) {
            m30369a(e);
            throw e;
        }
    }

    /* renamed from: a */
    private final void m30369a(Exception exc) {
        this.f39293b = false;
        C16607an anVar = this.f39292a;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("res_state", "failed");
        jSONObject.put("res_from", this.f39296e.mo26372b());
        jSONObject.put("res_message", exc.getMessage());
        anVar.f39742g = jSONObject;
        AbstractC16654o oVar = (AbstractC16654o) C16622e.C16623a.m30858a().mo26346a(AbstractC16654o.class);
        if (oVar != null) {
            oVar.mo26319a(this.f39292a);
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        MethodCollector.m26663i(7049);
        try {
            int read = this.f39297f.read(bArr);
            if (!this.f39296e.f39281h) {
                this.f39295d = false;
                MethodCollector.m26664o(7049);
                return read;
            }
            if (bArr != null && bArr.length != 0 && read > 0 && C16329a.C16331b.f39233a.mo25905a(this.f39296e.f39275b) == null) {
                try {
                    if (read == bArr.length) {
                        this.f39294c.addAll(C89064i.m154486a(bArr));
                    } else {
                        this.f39294c.addAll(C89064i.m154486a(bArr).subList(0, read));
                    }
                } catch (OutOfMemoryError unused) {
                    this.f39294c.clear();
                    this.f39295d = false;
                }
            }
            MethodCollector.m26664o(7049);
            return read;
        } catch (Exception e) {
            m30369a(e);
            MethodCollector.m26664o(7049);
            throw e;
        }
    }

    public C16349i(C16342f fVar, InputStream inputStream) {
        C89219l.m154719c(fVar, "");
        C89219l.m154719c(inputStream, "");
        MethodCollector.m26663i(7339);
        this.f39296e = fVar;
        this.f39297f = inputStream;
        MethodCollector.m26664o(7339);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        MethodCollector.m26663i(7196);
        try {
            int read = this.f39297f.read(bArr, i, i2);
            if (!this.f39296e.f39281h) {
                this.f39295d = false;
                MethodCollector.m26664o(7196);
                return read;
            }
            if (bArr != null && bArr.length != 0 && read > 0 && C16329a.C16331b.f39233a.mo25905a(this.f39296e.f39275b) == null) {
                try {
                    if (read == bArr.length) {
                        this.f39294c.addAll(C89064i.m154486a(bArr));
                    } else {
                        this.f39294c.addAll(C89064i.m154486a(bArr).subList(0, read));
                    }
                } catch (OutOfMemoryError unused) {
                    this.f39294c.clear();
                    this.f39295d = false;
                }
            }
            MethodCollector.m26664o(7196);
            return read;
        } catch (Exception e) {
            m30369a(e);
            MethodCollector.m26664o(7196);
            throw e;
        }
    }
}
