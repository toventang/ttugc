package com.facebook;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.x */
final class C25032x extends OutputStream implements AbstractC25035z {

    /* renamed from: a */
    public final Map<GraphRequest, C24004aa> f59377a = new HashMap();

    /* renamed from: b */
    public int f59378b;

    /* renamed from: c */
    private final Handler f59379c;

    /* renamed from: d */
    private GraphRequest f59380d;

    /* renamed from: e */
    private C24004aa f59381e;

    static {
        Covode.recordClassIndex(30365);
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        mo40925a(1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        mo40925a((long) bArr.length);
    }

    C25032x(Handler handler) {
        MethodCollector.m26663i(7517);
        this.f59379c = handler;
        MethodCollector.m26664o(7517);
    }

    @Override // com.facebook.AbstractC25035z
    /* renamed from: a */
    public final void mo40926a(GraphRequest graphRequest) {
        C24004aa aaVar;
        this.f59380d = graphRequest;
        if (graphRequest != null) {
            aaVar = this.f59377a.get(graphRequest);
        } else {
            aaVar = null;
        }
        this.f59381e = aaVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo40925a(long j) {
        if (this.f59381e == null) {
            C24004aa aaVar = new C24004aa(this.f59379c, this.f59380d);
            this.f59381e = aaVar;
            this.f59377a.put(this.f59380d, aaVar);
        }
        this.f59381e.mo39489a(j);
        this.f59378b = (int) (((long) this.f59378b) + j);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        mo40925a((long) i2);
    }
}
