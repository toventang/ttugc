package com.bytedance.p1436j.p1437a.p1443f;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.service.base.C16610ap;
import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import com.bytedance.ies.bullet.service.base.p1163a.AbstractC16584o;
import com.bytedance.ies.bullet.service.base.p1168e.C16638b;
import com.bytedance.ies.bullet.service.base.resourceloader.config.C16667j;
import com.lynx.tasm.provider.AbstractC28843b;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4610e.C89145b;
import p4600h.p4610e.C89146c;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.j.a.f.c */
public final class C20110c extends AbstractC28843b {

    /* renamed from: a */
    private final AbstractC16584o f47865a;

    static {
        Covode.recordClassIndex(23618);
    }

    public C20110c(AbstractC16584o oVar) {
        C89219l.m154719c(oVar, "");
        this.f47865a = oVar;
    }

    /* renamed from: com.bytedance.j.a.f.c$a */
    static final class C20111a extends AbstractC89220m implements AbstractC89172b<C16610ap, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC28843b.AbstractC28844a f47866a;

        static {
            Covode.recordClassIndex(23619);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20111a(AbstractC28843b.AbstractC28844a aVar) {
            super(1);
            this.f47866a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C16610ap apVar) {
            final C16610ap apVar2 = apVar;
            C89219l.m154719c(apVar2, "");
            C1731i.m5636a(new Callable<C1731i<C89391z>>(this) {
                /* class com.bytedance.p1436j.p1437a.p1443f.C20110c.C20111a.CallableC201121 */

                /* renamed from: a */
                final /* synthetic */ C20111a f47867a;

                static {
                    Covode.recordClassIndex(23620);
                }

                {
                    this.f47867a = r1;
                }

                /* access modifiers changed from: package-private */
                /* renamed from: com.bytedance.j.a.f.c$a$1$a */
                public static final class CallableC20115a<V> implements Callable<C89391z> {

                    /* renamed from: a */
                    final /* synthetic */ byte[] f47872a;

                    /* renamed from: b */
                    final /* synthetic */ InputStream f47873b;

                    /* renamed from: c */
                    final /* synthetic */ CallableC201121 f47874c;

                    static {
                        Covode.recordClassIndex(23623);
                    }

                    CallableC20115a(byte[] bArr, InputStream inputStream, CallableC201121 r3) {
                        this.f47872a = bArr;
                        this.f47873b = inputStream;
                        this.f47874c = r3;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ C89391z call() {
                        AbstractC28843b.AbstractC28844a aVar = this.f47874c.f47867a.f47866a;
                        if (aVar == null) {
                            return null;
                        }
                        aVar.mo48672a(this.f47872a);
                        return C89391z.f203057a;
                    }
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public C1731i<C89391z> call() {
                    C1731i<C89391z> iVar;
                    MethodCollector.m26663i(12524);
                    try {
                        InputStream a = apVar2.mo25913a();
                        if (a != null) {
                            try {
                                InputStream inputStream = a;
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
                                    long unused = C89145b.m154635a(inputStream, byteArrayOutputStream2, 8192);
                                    iVar = C1731i.m5636a(new CallableC20115a(byteArrayOutputStream2.toByteArray(), inputStream, this), C1731i.f5564c);
                                    C89146c.m154636a(byteArrayOutputStream, null);
                                    C89146c.m154636a(a, null);
                                } catch (Throwable th) {
                                    C89146c.m154636a(byteArrayOutputStream, th);
                                    MethodCollector.m26664o(12524);
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                C89146c.m154636a(a, th);
                                MethodCollector.m26664o(12524);
                                throw th2;
                            }
                        } else {
                            iVar = C1731i.m5636a(new Callable<C89391z>(this) {
                                /* class com.bytedance.p1436j.p1437a.p1443f.C20110c.C20111a.CallableC201121.CallableC201131 */

                                /* renamed from: a */
                                final /* synthetic */ CallableC201121 f47869a;

                                static {
                                    Covode.recordClassIndex(23621);
                                }

                                {
                                    this.f47869a = r1;
                                }

                                /* Return type fixed from 'java.lang.Object' to match base method */
                                @Override // java.util.concurrent.Callable
                                public final /* synthetic */ C89391z call() {
                                    AbstractC28843b.AbstractC28844a aVar = this.f47869a.f47867a.f47866a;
                                    if (aVar == null) {
                                        return null;
                                    }
                                    aVar.mo48671a("file not found");
                                    return C89391z.f203057a;
                                }
                            }, C1731i.f5564c);
                        }
                    } catch (Throwable th3) {
                        iVar = C1731i.m5636a(new Callable<C89391z>(this) {
                            /* class com.bytedance.p1436j.p1437a.p1443f.C20110c.C20111a.CallableC201121.CallableC201142 */

                            /* renamed from: a */
                            final /* synthetic */ CallableC201121 f47870a;

                            static {
                                Covode.recordClassIndex(23622);
                            }

                            {
                                this.f47870a = r1;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            @Override // java.util.concurrent.Callable
                            public final /* synthetic */ C89391z call() {
                                AbstractC28843b.AbstractC28844a aVar = this.f47870a.f47867a.f47866a;
                                if (aVar == null) {
                                    return null;
                                }
                                aVar.mo48671a("stream write error, " + th3.getMessage());
                                return C89391z.f203057a;
                            }
                        }, C1731i.f5564c);
                    }
                    MethodCollector.m26664o(12524);
                    return iVar;
                }
            }, C1731i.f5562a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.j.a.f.c$b */
    static final class C20116b extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC28843b.AbstractC28844a f47875a;

        static {
            Covode.recordClassIndex(23624);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20116b(AbstractC28843b.AbstractC28844a aVar) {
            super(1);
            this.f47875a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            Throwable th2 = th;
            C89219l.m154719c(th2, "");
            AbstractC28843b.AbstractC28844a aVar = this.f47875a;
            if (aVar != null) {
                aVar.mo48671a("template load error, " + th2.getMessage());
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.lynx.tasm.provider.AbstractC28843b
    /* renamed from: a */
    public final void mo33448a(String str, AbstractC28843b.AbstractC28844a aVar) {
        C89219l.m154719c(str, "");
        IResourceLoaderService iResourceLoaderService = (IResourceLoaderService) this.f47865a.mo25790b_(IResourceLoaderService.class);
        if (iResourceLoaderService != null) {
            C16667j jVar = new C16667j();
            jVar.mo26454d("template");
            jVar.f39851s = this.f47865a;
            Uri parse = Uri.parse(str);
            C89219l.m154709a((Object) parse, "");
            jVar.f39855w = new C16638b(parse);
            iResourceLoaderService.loadAsync(str, jVar, new C20111a(aVar), new C20116b(aVar));
        } else if (aVar != null) {
            aVar.mo48671a("ResourceLoader Not Found!");
        }
    }
}
