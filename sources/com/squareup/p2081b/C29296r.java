package com.squareup.p2081b;

import android.graphics.Bitmap;
import android.net.NetworkInfo;
import com.bytedance.covode.number.Covode;
import com.squareup.p2081b.AbstractC29285j;
import com.squareup.p2081b.AbstractC29315y;
import com.squareup.p2081b.C29299t;
import java.io.IOException;
import java.io.InputStream;

/* access modifiers changed from: package-private */
/* renamed from: com.squareup.b.r */
public final class C29296r extends AbstractC29315y {

    /* renamed from: a */
    private final AbstractC29285j f69511a;

    /* renamed from: b */
    private final C29255aa f69512b;

    static {
        Covode.recordClassIndex(35645);
    }

    /* access modifiers changed from: package-private */
    @Override // com.squareup.p2081b.AbstractC29315y
    /* renamed from: a */
    public final int mo51104a() {
        return 2;
    }

    /* access modifiers changed from: package-private */
    @Override // com.squareup.p2081b.AbstractC29315y
    /* renamed from: b */
    public final boolean mo51106b() {
        return true;
    }

    /* renamed from: com.squareup.b.r$a */
    static class C29297a extends IOException {
        static {
            Covode.recordClassIndex(35646);
        }

        public C29297a(String str) {
            super(str);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.squareup.p2081b.AbstractC29315y
    /* renamed from: a */
    public final boolean mo51105a(NetworkInfo networkInfo) {
        if (networkInfo == null || networkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    @Override // com.squareup.p2081b.AbstractC29315y
    /* renamed from: a */
    public final boolean mo51062a(C29312w wVar) {
        String scheme = wVar.f69562d.getScheme();
        if ("http".equals(scheme) || "https".equals(scheme)) {
            return true;
        }
        return false;
    }

    @Override // com.squareup.p2081b.AbstractC29315y
    /* renamed from: b */
    public final AbstractC29315y.C29316a mo51063b(C29312w wVar) {
        C29299t.EnumC29305d dVar;
        AbstractC29285j.C29286a a = this.f69511a.mo51057a(wVar.f69562d, wVar.f69561c);
        if (a.f69482c) {
            dVar = C29299t.EnumC29305d.DISK;
        } else {
            dVar = C29299t.EnumC29305d.NETWORK;
        }
        Bitmap bitmap = a.f69481b;
        if (bitmap != null) {
            return new AbstractC29315y.C29316a(bitmap, dVar);
        }
        InputStream inputStream = a.f69480a;
        if (inputStream == null) {
            return null;
        }
        if (dVar == C29299t.EnumC29305d.DISK && a.f69483d == 0) {
            C29262ae.m58612a(inputStream);
            throw new C29297a("Received response with 0 content-length header.");
        }
        if (dVar == C29299t.EnumC29305d.NETWORK && a.f69483d > 0) {
            C29255aa aaVar = this.f69512b;
            aaVar.f69389c.sendMessage(aaVar.f69389c.obtainMessage(4, Long.valueOf(a.f69483d)));
        }
        return new AbstractC29315y.C29316a(inputStream, dVar);
    }

    public C29296r(AbstractC29285j jVar, C29255aa aaVar) {
        this.f69511a = jVar;
        this.f69512b = aaVar;
    }
}
