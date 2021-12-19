package com.toutiao.proxyserver.net;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.C14731e;
import com.bytedance.frameworks.baselib.network.http.cronet.p986b.C14652c;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.AbstractC22058l;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.ttnet.p1703d.C22940b;
import com.toutiao.proxyserver.p4493e.C87312c;
import java.io.IOException;
import okhttp3.AbstractC90049e;
import okhttp3.C90029ac;

/* renamed from: com.toutiao.proxyserver.net.a */
public final class C87354a {

    /* renamed from: a */
    public final AbstractC21983b<?> f198002a;

    /* renamed from: b */
    public final C87361d f198003b;

    /* renamed from: c */
    public C87363e f198004c;

    /* renamed from: d */
    public long f198005d;

    /* renamed from: e */
    public long f198006e;

    /* renamed from: f */
    public boolean f198007f;

    /* renamed from: g */
    private final AbstractC90049e f198008g;

    static {
        Covode.recordClassIndex(103251);
    }

    /* renamed from: b */
    public final void mo141395b() {
        AbstractC21983b<?> bVar = this.f198002a;
        if (bVar != null) {
            bVar.cancel();
            return;
        }
        AbstractC90049e eVar = this.f198008g;
        if (eVar != null) {
            eVar.mo144710c();
        }
    }

    /* renamed from: a */
    public final C87363e mo141393a() {
        if (this.f198002a != null) {
            this.f198005d = System.currentTimeMillis();
            try {
                C22099u<?> execute = this.f198002a.execute();
                this.f198006e = System.currentTimeMillis();
                C87363e eVar = new C87363e(execute, this.f198003b);
                this.f198004c = eVar;
                return eVar;
            } catch (IOException e) {
                throw e;
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        } else if (this.f198008g == null) {
            return null;
        } else {
            try {
                this.f198005d = System.currentTimeMillis();
                C90029ac b = this.f198008g.mo144709b();
                this.f198006e = System.currentTimeMillis();
                C87363e eVar2 = new C87363e(b, this.f198003b);
                this.f198004c = eVar2;
                return eVar2;
            } catch (Exception e3) {
                if (!"Canceled".equalsIgnoreCase(e3.getMessage())) {
                    long currentTimeMillis = System.currentTimeMillis();
                    C87364f fVar = new C87364f();
                    fVar.f35362e = this.f198005d;
                    fVar.f35365h = currentTimeMillis;
                    long j = this.f198005d;
                    C14731e.m26986a(currentTimeMillis - j, j, this.f198003b.f198016a, "", fVar, e3);
                    C87312c.m151526d("HttpCall", "api_error, from okhttp connect: , netInfo: " + fVar + ", url: " + this.f198003b.f198016a + ", error: " + e3.getMessage(), null);
                }
                throw e3;
            }
        }
    }

    /* renamed from: a */
    public final String mo141394a(Exception exc) {
        C87363e eVar;
        String str;
        if (!(this.f198002a == null || (eVar = this.f198004c) == null)) {
            try {
                if (eVar.f198031d != null || !(exc instanceof C14652c)) {
                    str = null;
                } else {
                    str = ((C14652c) exc).getRequestLog();
                }
                if (!TextUtils.isEmpty(str) || this.f198004c.f198031d == null) {
                    return str;
                }
                AbstractC21983b<?> bVar = this.f198002a;
                if (!(bVar instanceof AbstractC22058l)) {
                    return str;
                }
                ((AbstractC22058l) bVar).doCollect();
                Object obj = this.f198004c.f198031d.f52261a.f52044f;
                if (obj instanceof C22940b) {
                    return ((C22940b) obj).f35382y;
                }
                return str;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    C87354a(AbstractC21983b<?> bVar, C87361d dVar) {
        this.f198002a = bVar;
        this.f198003b = dVar;
    }

    C87354a(AbstractC90049e eVar, C87361d dVar) {
        this.f198008g = eVar;
        this.f198003b = dVar;
    }
}
