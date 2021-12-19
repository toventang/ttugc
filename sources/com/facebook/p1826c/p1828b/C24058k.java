package com.facebook.p1826c.p1828b;

import com.bytedance.covode.number.Covode;
import com.facebook.common.p1833e.C24099a;
import com.facebook.common.p1835g.AbstractC24111h;
import com.facebook.common.p1835g.AbstractC24113i;
import com.facebook.common.p1836h.C24117a;
import com.facebook.imagepipeline.p1879d.AbstractC24395n;
import com.facebook.imagepipeline.p1879d.C24373e;
import com.facebook.imagepipeline.p1879d.C24404v;
import com.facebook.imagepipeline.p1885j.C24456e;
import com.facebook.p1825b.AbstractC24018a;
import com.facebook.p1826c.p1827a.AbstractC24026e;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p077b.C1731i;

/* renamed from: com.facebook.c.b.k */
public class C24058k extends C24373e {

    /* renamed from: a */
    public static final Class<?> f56987a = C24058k.class;

    /* renamed from: b */
    public final C24404v f56988b;

    /* renamed from: c */
    public final AbstractC24395n f56989c;

    /* renamed from: i */
    private final AbstractC24056i f56990i;

    /* renamed from: j */
    private final AbstractC24113i f56991j;

    /* renamed from: k */
    private final Executor f56992k;

    static {
        Covode.recordClassIndex(28184);
    }

    /* JADX INFO: finally extract failed */
    @Override // com.facebook.imagepipeline.p1879d.C24373e
    /* renamed from: a */
    public final AbstractC24111h mo39594a(AbstractC24026e eVar) {
        try {
            Class<?> cls = f56987a;
            C24099a.m45635a(cls, "Disk cache read for %s", eVar.toString());
            AbstractC24018a a = this.f56990i.mo39575a(eVar);
            if (a == null) {
                C24099a.m45635a(cls, "Disk cache miss for %s", eVar.toString());
                this.f56989c.mo34253g();
                return null;
            }
            C24099a.m45635a(cls, "Found entry in disk cache for %s", eVar.toString());
            this.f56989c.mo34252f();
            InputStream a2 = a.mo39538a();
            try {
                AbstractC24111h a3 = this.f56991j.mo39679a(a2, (int) a.mo39539b());
                a2.close();
                C24099a.m45635a(cls, "Successful read from disk cache for %s", eVar.toString());
                return a3;
            } catch (Throwable th) {
                a2.close();
                throw th;
            }
        } catch (IOException e) {
            C24099a.m45641a(f56987a, e, "Exception reading from cache for %s", eVar.toString());
            throw e;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public final AbstractC24111h mo39596b(AbstractC24026e eVar) {
        try {
            Class<?> cls = f56987a;
            C24099a.m45635a(cls, "Disk temp file cache read for %s", eVar.toString());
            AbstractC24056i iVar = this.f56990i;
            if (!(iVar instanceof AbstractC24060l)) {
                return null;
            }
            AbstractC24018a f = ((AbstractC24060l) iVar).mo39598f();
            if (f == null) {
                C24099a.m45635a(cls, "Disk temp file cache miss for %s", eVar.toString());
                return null;
            }
            C24099a.m45635a(cls, "Found temp file entry in disk cache for %s", eVar.toString());
            InputStream a = f.mo39538a();
            try {
                AbstractC24111h a2 = this.f56991j.mo39679a(a, (int) f.mo39539b());
                a.close();
                C24099a.m45635a(cls, "Successful read temp file from disk cache for %s", eVar.toString());
                return a2;
            } catch (Throwable th) {
                a.close();
                throw th;
            }
        } catch (IOException e) {
            C24099a.m45641a(f56987a, e, "Exception reading temp file from cache for %s", eVar.toString());
            return null;
        }
    }

    /* renamed from: b */
    private static C1731i<C24456e> m45565b(AbstractC24026e eVar, C24456e eVar2) {
        C24099a.m45635a(f56987a, "Found image for %s in staging area", eVar.toString());
        return C1731i.m5633a(eVar2);
    }

    @Override // com.facebook.imagepipeline.p1879d.C24373e
    /* renamed from: a */
    public final C1731i<C24456e> mo39593a(AbstractC24026e eVar, AtomicBoolean atomicBoolean) {
        C24456e b = this.f56988b.mo40213b(eVar);
        if (b != null) {
            return m45565b(eVar, b);
        }
        return m45564a(eVar, atomicBoolean, true);
    }

    /* renamed from: b */
    public final C1731i<C24456e> mo39595b(AbstractC24026e eVar, AtomicBoolean atomicBoolean) {
        C24456e b = this.f56988b.mo40213b(eVar);
        if (b != null) {
            return m45565b(eVar, b);
        }
        return m45564a(eVar, atomicBoolean, false);
    }

    /* renamed from: a */
    private C1731i<C24456e> m45564a(final AbstractC24026e eVar, final AtomicBoolean atomicBoolean, final boolean z) {
        try {
            return C1731i.m5640b(new Callable<C24456e>() {
                /* class com.facebook.p1826c.p1828b.C24058k.CallableC240591 */

                static {
                    Covode.recordClassIndex(28185);
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public C24456e call() {
                    if (!atomicBoolean.get()) {
                        C24456e b = C24058k.this.f56988b.mo40213b(eVar);
                        if (b != null) {
                            C24099a.m45635a(C24058k.f56987a, "Found image for %s in staging area", eVar.toString());
                        } else {
                            C24099a.m45635a(C24058k.f56987a, "Did not find image for %s in staging area", eVar.toString());
                            try {
                                AbstractC24111h a = C24058k.this.mo39594a(eVar);
                                if (a != null || z) {
                                    C24117a a2 = C24117a.m45706a(a);
                                    try {
                                        b = new C24456e(a2);
                                    } finally {
                                        C24117a.m45712c(a2);
                                    }
                                } else {
                                    AbstractC24111h b2 = C24058k.this.mo39596b(eVar);
                                    if (b2 != null) {
                                        C24117a a3 = C24117a.m45706a(b2);
                                        try {
                                            b = new C24061m(a3);
                                        } finally {
                                            C24117a.m45712c(a3);
                                        }
                                    }
                                    return b;
                                }
                            } catch (Exception unused) {
                                return null;
                            }
                        }
                        if (!Thread.interrupted()) {
                            return b;
                        }
                        C24099a.m45634a(C24058k.f56987a, "Host thread was interrupted, decreasing reference count");
                        b.close();
                        throw new InterruptedException();
                    }
                    throw new CancellationException();
                }
            }, this.f56992k);
        } catch (Exception e) {
            C24099a.m45641a(f56987a, e, "Failed to schedule disk-cache read for %s", eVar.toString());
            return C1731i.m5632a(e);
        }
    }
}
