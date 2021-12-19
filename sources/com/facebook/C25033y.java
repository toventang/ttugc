package com.facebook;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.C24912q;
import com.facebook.internal.p1894a.p1896b.C24677a;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.util.Map;

/* renamed from: com.facebook.y */
final class C25033y extends FilterOutputStream implements AbstractC25035z {

    /* renamed from: a */
    public final C24912q f59382a;

    /* renamed from: b */
    public long f59383b;

    /* renamed from: c */
    public long f59384c;

    /* renamed from: d */
    private final Map<GraphRequest, C24004aa> f59385d;

    /* renamed from: e */
    private final long f59386e = C24872m.m47695f();

    /* renamed from: f */
    private long f59387f;

    /* renamed from: g */
    private C24004aa f59388g;

    static {
        Covode.recordClassIndex(30366);
    }

    /* renamed from: a */
    private void m48002a() {
        if (this.f59383b > this.f59387f) {
            for (C24912q.AbstractC24913a aVar : this.f59382a.f59149e) {
                if (aVar instanceof C24912q.AbstractC24914b) {
                    Handler handler = this.f59382a.f59145a;
                    final C24912q.AbstractC24914b bVar = (C24912q.AbstractC24914b) aVar;
                    if (handler != null) {
                        handler.post(new Runnable() {
                            /* class com.facebook.C25033y.RunnableC250341 */

                            static {
                                Covode.recordClassIndex(30367);
                            }

                            public final void run() {
                                C24677a.m47209a(this);
                            }
                        });
                    }
                }
            }
            this.f59387f = this.f59383b;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.io.FilterOutputStream, java.lang.AutoCloseable
    public final void close() {
        super.close();
        for (C24004aa aaVar : this.f59385d.values()) {
            aaVar.mo39488a();
        }
        m48002a();
    }

    @Override // com.facebook.AbstractC25035z
    /* renamed from: a */
    public final void mo40926a(GraphRequest graphRequest) {
        C24004aa aaVar;
        if (graphRequest != null) {
            aaVar = this.f59385d.get(graphRequest);
        } else {
            aaVar = null;
        }
        this.f59388g = aaVar;
    }

    @Override // java.io.OutputStream, java.io.FilterOutputStream
    public final void write(int i) {
        MethodCollector.m26663i(7960);
        this.out.write(i);
        m48003a(1);
        MethodCollector.m26664o(7960);
    }

    @Override // java.io.OutputStream, java.io.FilterOutputStream
    public final void write(byte[] bArr) {
        MethodCollector.m26663i(7825);
        this.out.write(bArr);
        m48003a((long) bArr.length);
        MethodCollector.m26664o(7825);
    }

    /* renamed from: a */
    private void m48003a(long j) {
        C24004aa aaVar = this.f59388g;
        if (aaVar != null) {
            aaVar.f56826b += j;
            if (aaVar.f56826b >= aaVar.f56827c + aaVar.f56825a || aaVar.f56826b >= aaVar.f56828d) {
                aaVar.mo39488a();
            }
        }
        long j2 = this.f59383b + j;
        this.f59383b = j2;
        if (j2 >= this.f59387f + this.f59386e || j2 >= this.f59384c) {
            m48002a();
        }
    }

    @Override // java.io.OutputStream, java.io.FilterOutputStream
    public final void write(byte[] bArr, int i, int i2) {
        MethodCollector.m26663i(7959);
        this.out.write(bArr, i, i2);
        m48003a((long) i2);
        MethodCollector.m26664o(7959);
    }

    C25033y(OutputStream outputStream, C24912q qVar, Map<GraphRequest, C24004aa> map, long j) {
        super(outputStream);
        MethodCollector.m26663i(7693);
        this.f59382a = qVar;
        this.f59385d = map;
        this.f59384c = j;
        MethodCollector.m26664o(7693);
    }
}
