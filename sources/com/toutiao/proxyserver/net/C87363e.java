package com.toutiao.proxyserver.net;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.retrofit2.mime.TypedInput;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import okhttp3.AbstractC90031ad;
import okhttp3.C90029ac;
import okhttp3.C90198s;

/* renamed from: com.toutiao.proxyserver.net.e */
public final class C87363e implements Closeable {

    /* renamed from: a */
    public final C87361d f198028a;

    /* renamed from: b */
    public final int f198029b;

    /* renamed from: c */
    public final List<C87360c> f198030c = new ArrayList();

    /* renamed from: d */
    public final C22099u<?> f198031d;

    /* renamed from: e */
    public final C90029ac f198032e;

    static {
        Covode.recordClassIndex(103260);
    }

    /* renamed from: a */
    public final boolean mo141404a() {
        int i = this.f198029b;
        if (i < 200 || i >= 300) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final String mo141405b() {
        if (this.f198031d != null) {
            return "HTTP/1.1";
        }
        return this.f198032e.f204106b.toString();
    }

    /* renamed from: c */
    public final String mo141406c() {
        C22099u<?> uVar = this.f198031d;
        if (uVar != null) {
            return uVar.f52261a.f52041c;
        }
        return this.f198032e.f204108d;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InputStream in;
        C22099u<?> uVar = this.f198031d;
        if (uVar != null) {
            TypedInput typedInput = uVar.f52261a.f52043e;
            if (typedInput != null && (in = typedInput.mo11577in()) != null) {
                in.close();
                return;
            }
            return;
        }
        C90029ac acVar = this.f198032e;
        if (acVar != null) {
            acVar.close();
        }
    }

    /* renamed from: d */
    public final InputStream mo141408d() {
        C22099u<?> uVar = this.f198031d;
        if (uVar != null) {
            TypedInput typedInput = uVar.f52261a.f52043e;
            if (typedInput == null) {
                return null;
            }
            try {
                return typedInput.mo11577in();
            } catch (IOException unused) {
                return null;
            }
        } else {
            AbstractC90031ad adVar = this.f198032e.f204111g;
            if (adVar == null) {
                return null;
            }
            return adVar.byteStream();
        }
    }

    public final String toString() {
        return "HttpResponse{request=" + this.f198028a + ", code=" + this.f198029b + ", headers=" + this.f198030c + '}';
    }

    /* renamed from: a */
    public final String mo141402a(String str) {
        return mo141403a(str, null);
    }

    /* renamed from: a */
    public final String mo141403a(String str, String str2) {
        for (C87360c cVar : this.f198030c) {
            if (cVar.f198014a.equalsIgnoreCase(str)) {
                return cVar.f198015b;
            }
        }
        return str2;
    }

    C87363e(C22099u<?> uVar, C87361d dVar) {
        this.f198028a = dVar;
        this.f198031d = uVar;
        this.f198032e = null;
        this.f198029b = uVar.f52261a.f52040b;
        List<C22027b> list = uVar.f52261a.f52042d;
        if (list != null) {
            for (C22027b bVar : list) {
                if (!(bVar.f52037a.length() == 0 || bVar.f52038b.length() == 0)) {
                    this.f198030c.add(new C87360c(bVar.f52037a, bVar.f52038b));
                }
            }
        }
    }

    C87363e(C90029ac acVar, C87361d dVar) {
        this.f198028a = dVar;
        this.f198032e = acVar;
        this.f198031d = null;
        this.f198029b = acVar.f204107c;
        C90198s sVar = acVar.f204110f;
        if (sVar != null) {
            int length = sVar.f204855a.length / 2;
            for (int i = 0; i < length; i++) {
                if (!(sVar.mo145027a(i).length() == 0 || sVar.mo145031b(i).length() == 0)) {
                    this.f198030c.add(new C87360c(sVar.mo145027a(i), sVar.mo145031b(i)));
                }
            }
        }
    }
}
