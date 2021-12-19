package com.facebook.imagepipeline.p1879d;

import com.bytedance.covode.number.Covode;
import com.facebook.common.p1832d.C24091i;
import com.facebook.common.p1833e.C24099a;
import com.facebook.common.p1835g.AbstractC24111h;
import com.facebook.common.p1835g.AbstractC24113i;
import com.facebook.common.p1835g.C24116l;
import com.facebook.common.p1836h.C24117a;
import com.facebook.imagepipeline.p1885j.C24456e;
import com.facebook.imagepipeline.p1891p.C24644b;
import com.facebook.p1825b.AbstractC24018a;
import com.facebook.p1826c.p1827a.AbstractC24026e;
import com.facebook.p1826c.p1827a.AbstractC24032k;
import com.facebook.p1826c.p1828b.AbstractC24056i;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p077b.C1731i;

/* renamed from: com.facebook.imagepipeline.d.e */
public class C24373e {

    /* renamed from: d */
    public static final Class<?> f57799d = C24373e.class;

    /* renamed from: a */
    private final AbstractC24113i f57800a;

    /* renamed from: b */
    private final Executor f57801b;

    /* renamed from: c */
    private final Executor f57802c;

    /* renamed from: e */
    public final AbstractC24056i f57803e;

    /* renamed from: f */
    public final C24116l f57804f;

    /* renamed from: g */
    public final C24404v f57805g = new C24404v();

    /* renamed from: h */
    public final AbstractC24395n f57806h;

    static {
        Covode.recordClassIndex(28516);
    }

    /* renamed from: a */
    public final C1731i<Void> mo40174a() {
        this.f57805g.mo40210a();
        try {
            return C1731i.m5640b(new Callable<Void>() {
                /* class com.facebook.imagepipeline.p1879d.C24373e.CallableC243785 */

                static {
                    Covode.recordClassIndex(28521);
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public Void call() {
                    C24373e.this.f57805g.mo40210a();
                    C24373e.this.f57803e.mo39579c();
                    return null;
                }
            }, this.f57802c);
        } catch (Exception e) {
            C24099a.m45641a(f57799d, e, "Failed to schedule disk-cache clear", new Object[0]);
            return C1731i.m5632a(e);
        }
    }

    /* renamed from: e */
    public final boolean mo40178e(AbstractC24026e eVar) {
        if (mo40176c(eVar)) {
            return true;
        }
        return mo40179f(eVar);
    }

    /* renamed from: c */
    public final boolean mo40176c(AbstractC24026e eVar) {
        if (this.f57805g.mo40215c(eVar) || this.f57803e.mo39580c(eVar)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final C1731i<Boolean> mo40177d(AbstractC24026e eVar) {
        if (mo40176c(eVar)) {
            return C1731i.m5633a((Object) true);
        }
        return mo39596b(eVar);
    }

    /* renamed from: b */
    private C1731i<Boolean> mo39596b(final AbstractC24026e eVar) {
        try {
            return C1731i.m5640b(new Callable<Boolean>() {
                /* class com.facebook.imagepipeline.p1879d.C24373e.CallableC243741 */

                static {
                    Covode.recordClassIndex(28517);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Boolean call() {
                    return Boolean.valueOf(C24373e.this.mo40179f(eVar));
                }
            }, this.f57801b);
        } catch (Exception e) {
            C24099a.m45641a(f57799d, e, "Failed to schedule disk-cache read for %s", eVar.mo39543a());
            return C1731i.m5632a(e);
        }
    }

    /* renamed from: f */
    public final boolean mo40179f(AbstractC24026e eVar) {
        C24456e b = this.f57805g.mo40213b(eVar);
        if (b != null) {
            b.close();
            C24099a.m45635a(f57799d, "Found image for %s in staging area", eVar.mo39543a());
            return true;
        }
        C24099a.m45635a(f57799d, "Did not find image for %s in staging area", eVar.mo39543a());
        try {
            return this.f57803e.mo39582d(eVar);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: g */
    public final C1731i<Void> mo40180g(final AbstractC24026e eVar) {
        C24091i.m45617a(eVar);
        this.f57805g.mo40212a(eVar);
        try {
            return C1731i.m5640b(new Callable<Void>() {
                /* class com.facebook.imagepipeline.p1879d.C24373e.CallableC243774 */

                static {
                    Covode.recordClassIndex(28520);
                }

                /* JADX INFO: finally extract failed */
                /* access modifiers changed from: private */
                /* renamed from: a */
                public Void call() {
                    try {
                        C24644b.m47156a();
                        C24373e.this.f57805g.mo40212a(eVar);
                        C24373e.this.f57803e.mo39578b(eVar);
                        C24644b.m47156a();
                        return null;
                    } catch (Throwable th) {
                        C24644b.m47156a();
                        throw th;
                    }
                }
            }, this.f57802c);
        } catch (Exception e) {
            C24099a.m45641a(f57799d, e, "Failed to schedule disk-cache remove for %s", eVar.mo39543a());
            return C1731i.m5632a(e);
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC24111h mo39594a(AbstractC24026e eVar) {
        try {
            Class<?> cls = f57799d;
            C24099a.m45635a(cls, "Disk cache read for %s", eVar.mo39543a());
            AbstractC24018a a = this.f57803e.mo39575a(eVar);
            if (a == null) {
                C24099a.m45635a(cls, "Disk cache miss for %s", eVar.mo39543a());
                this.f57806h.mo34253g();
                return null;
            }
            C24099a.m45635a(cls, "Found entry in disk cache for %s", eVar.mo39543a());
            this.f57806h.mo34252f();
            InputStream a2 = a.mo39538a();
            try {
                AbstractC24111h a3 = this.f57800a.mo39679a(a2, (int) a.mo39539b());
                a2.close();
                C24099a.m45635a(cls, "Successful read from disk cache for %s", eVar.mo39543a());
                return a3;
            } catch (Throwable th) {
                a2.close();
                throw th;
            }
        } catch (IOException e) {
            C24099a.m45641a(f57799d, e, "Exception reading from cache for %s", eVar.mo39543a());
            throw e;
        }
    }

    /* renamed from: b */
    private C1731i<C24456e> mo39595b(final AbstractC24026e eVar, final AtomicBoolean atomicBoolean) {
        try {
            return C1731i.m5640b(new Callable<C24456e>() {
                /* class com.facebook.imagepipeline.p1879d.C24373e.CallableC243752 */

                static {
                    Covode.recordClassIndex(28518);
                }

                /* JADX INFO: finally extract failed */
                /* access modifiers changed from: private */
                /* renamed from: a */
                public C24456e call() {
                    try {
                        C24644b.m47156a();
                        if (!atomicBoolean.get()) {
                            C24456e b = C24373e.this.f57805g.mo40213b(eVar);
                            if (b != null) {
                                C24099a.m45635a(C24373e.f57799d, "Found image for %s in staging area", eVar.mo39543a());
                            } else {
                                C24099a.m45635a(C24373e.f57799d, "Did not find image for %s in staging area", eVar.mo39543a());
                                try {
                                    C24117a a = C24117a.m45706a(C24373e.this.mo39594a(eVar));
                                    try {
                                        b = new C24456e(a);
                                    } finally {
                                        C24117a.m45712c(a);
                                    }
                                } catch (Exception unused) {
                                    C24644b.m47156a();
                                    return null;
                                }
                            }
                            if (Thread.interrupted()) {
                                C24099a.m45634a(C24373e.f57799d, "Host thread was interrupted, decreasing reference count");
                                b.close();
                                throw new InterruptedException();
                            }
                            C24644b.m47156a();
                            return b;
                        }
                        throw new CancellationException();
                    } catch (Throwable th) {
                        C24644b.m47156a();
                        throw th;
                    }
                }
            }, this.f57801b);
        } catch (Exception e) {
            C24099a.m45641a(f57799d, e, "Failed to schedule disk-cache read for %s", eVar.mo39543a());
            return C1731i.m5632a(e);
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public C1731i<C24456e> mo39593a(AbstractC24026e eVar, AtomicBoolean atomicBoolean) {
        try {
            C24644b.m47156a();
            C24456e b = this.f57805g.mo40213b(eVar);
            if (b != null) {
                C24099a.m45635a(f57799d, "Found image for %s in staging area", eVar.mo39543a());
                C1731i<C24456e> a = C1731i.m5633a(b);
                C24644b.m47156a();
                return a;
            }
            C1731i<C24456e> b2 = mo39595b(eVar, atomicBoolean);
            C24644b.m47156a();
            return b2;
        } catch (Throwable th) {
            C24644b.m47156a();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final void mo40175a(final AbstractC24026e eVar, C24456e eVar2) {
        try {
            C24644b.m47156a();
            C24091i.m45617a(eVar);
            C24091i.m45620a(C24456e.m46682e(eVar2));
            this.f57805g.mo40211a(eVar, eVar2);
            final C24456e a = C24456e.m46679a(eVar2);
            try {
                this.f57802c.execute(new Runnable() {
                    /* class com.facebook.imagepipeline.p1879d.C24373e.RunnableC243763 */

                    static {
                        Covode.recordClassIndex(28519);
                    }

                    public final void run() {
                        try {
                            C24644b.m47156a();
                            C24373e eVar = C24373e.this;
                            AbstractC24026e eVar2 = eVar;
                            C24456e eVar3 = a;
                            C24099a.m45635a(C24373e.f57799d, "About to write to disk-cache for key %s", eVar2.mo39543a());
                            try {
                                eVar.f57803e.mo39576a(eVar2, new AbstractC24032k(eVar3) {
                                    /* class com.facebook.imagepipeline.p1879d.C24373e.C243796 */

                                    /* renamed from: a */
                                    final /* synthetic */ C24456e f57818a;

                                    static {
                                        Covode.recordClassIndex(28522);
                                    }

                                    @Override // com.facebook.p1826c.p1827a.AbstractC24032k
                                    /* renamed from: a */
                                    public final void mo39548a(OutputStream outputStream) {
                                        C24373e.this.f57804f.mo39694a(this.f57818a.mo40301b(), outputStream);
                                    }

                                    {
                                        this.f57818a = r2;
                                    }
                                });
                                C24099a.m45635a(C24373e.f57799d, "Successful disk-cache write for key %s", eVar2.mo39543a());
                            } catch (IOException e) {
                                C24099a.m45641a(C24373e.f57799d, e, "Failed to write to disk-cache for key %s", eVar2.mo39543a());
                            }
                        } finally {
                            C24373e.this.f57805g.mo40214b(eVar, a);
                            C24456e.m46681d(a);
                            C24644b.m47156a();
                        }
                    }
                });
            } catch (Exception e) {
                C24099a.m45641a(f57799d, e, "Failed to schedule disk-cache write for %s", eVar.mo39543a());
                this.f57805g.mo40214b(eVar, eVar2);
                C24456e.m46681d(a);
            }
            C24644b.m47156a();
        } catch (Throwable th) {
            C24644b.m47156a();
            throw th;
        }
    }

    public C24373e(AbstractC24056i iVar, AbstractC24113i iVar2, C24116l lVar, Executor executor, Executor executor2, AbstractC24395n nVar) {
        this.f57803e = iVar;
        this.f57800a = iVar2;
        this.f57804f = lVar;
        this.f57801b = executor;
        this.f57802c = executor2;
        this.f57806h = nVar;
    }
}
