package com.bytedance.lynx.hybrid;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.view.View;
import com.bytedance.android.monitorV2.lynx.jsb.C12178a;
import com.bytedance.android.monitorV2.lynx.p742b.C12152b;
import com.bytedance.android.monitorV2.p738j.C12116a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lynx.hybrid.C21170d;
import com.bytedance.lynx.hybrid.p1515a.AbstractC21152f;
import com.bytedance.lynx.hybrid.p1515a.AbstractC21154h;
import com.bytedance.lynx.hybrid.p1515a.C21160n;
import com.bytedance.lynx.hybrid.p1519e.C21186c;
import com.bytedance.lynx.hybrid.p1519e.C21187d;
import com.bytedance.lynx.hybrid.p1521g.C21192a;
import com.bytedance.lynx.hybrid.p1522h.C21196a;
import com.bytedance.lynx.hybrid.p1524j.C21210c;
import com.bytedance.lynx.hybrid.p1524j.C21213f;
import com.bytedance.lynx.hybrid.p1524j.EnumC21209b;
import com.bytedance.lynx.hybrid.resource.config.C21284j;
import com.bytedance.lynx.hybrid.resource.p1528d.C21294e;
import com.bytedance.lynx.hybrid.resource.p1528d.EnumC21293d;
import com.bytedance.lynx.hybrid.service.AbstractC21365f;
import com.bytedance.lynx.hybrid.service.IResourceService;
import com.bytedance.lynx.hybrid.service.p1537b.C21353c;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.tasm.C28816j;
import com.lynx.tasm.C28820n;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.TemplateData;
import com.lynx.tasm.behavior.shadow.text.C28573r;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4610e.C89145b;
import p4600h.p4610e.C89146c;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.lynx.hybrid.m */
public final class C21218m extends LynxView implements AbstractC21154h {

    /* renamed from: d */
    public static final String f50362d = f50362d;

    /* renamed from: e */
    public static final C21220a f50363e = new C21220a((byte) 0);

    /* renamed from: a */
    public C21217l f50364a;

    /* renamed from: b */
    public C21161b f50365b;

    /* renamed from: c */
    public AbstractC21152f f50366c;

    /* renamed from: f */
    private String f50367f;

    /* renamed from: g */
    private byte[] f50368g;

    /* renamed from: h */
    private IResourceService f50369h;

    /* renamed from: i */
    private C21160n f50370i;

    /* renamed from: j */
    private C12152b f50371j;

    /* renamed from: k */
    private C21196a f50372k;

    /* renamed from: com.bytedance.lynx.hybrid.m$a */
    public static final class C21220a {
        static {
            Covode.recordClassIndex(24836);
        }

        private C21220a() {
        }

        public /* synthetic */ C21220a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.lynx.hybrid.p1515a.AbstractC21154h
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ View mo34724a() {
        return this;
    }

    @Override // com.bytedance.lynx.hybrid.p1515a.AbstractC21154h
    public final C21196a getHybridContext() {
        return this.f50372k;
    }

    @Override // com.bytedance.lynx.hybrid.p1515a.AbstractC21154h
    /* renamed from: b */
    public final void mo34727b() {
        String str = this.f50367f;
        if (str == null) {
            C89219l.m154707a();
        }
        mo34725a(str);
    }

    static {
        Covode.recordClassIndex(24834);
    }

    @Override // com.bytedance.lynx.hybrid.p1515a.AbstractC21154h, com.lynx.tasm.LynxView
    public final void destroy() {
        String str;
        C21217l lVar = this.f50364a;
        if (!(lVar == null || (str = lVar.f50342c) == null || str.length() == 0 || C21186c.f50263b.get(str) == null)) {
            Integer num = C21186c.f50263b.get(str);
            if (num == null) {
                C89219l.m154707a();
            }
            int intValue = num.intValue() - 1;
            if (intValue <= 0) {
                C21186c.f50262a.remove(str);
                C21186c.f50263b.remove(str);
            } else {
                C21186c.f50263b.put(str, Integer.valueOf(intValue));
            }
        }
        AbstractC21152f fVar = this.f50366c;
        if (fVar != null) {
            fVar.mo25385c();
        }
        super.destroy();
    }

    public final void setHybridContext(C21196a aVar) {
        C89219l.m154719c(aVar, "");
        this.f50372k = aVar;
    }

    @Override // com.bytedance.lynx.hybrid.p1515a.AbstractC21154h, com.lynx.tasm.LynxView
    public final void updateData(Map<String, ? extends Object> map) {
        C89219l.m154719c(map, "");
        updateData(TemplateData.m56772a(map));
    }

    /* renamed from: b */
    private final void m39937b(String str) {
        TemplateData templateData;
        C21217l lVar;
        C21192a aVar;
        this.f50367f = str;
        C21217l lVar2 = this.f50364a;
        if ((lVar2 == null || (aVar = lVar2.f50358s) == null || (templateData = aVar.f50277a) == null) && ((lVar = this.f50364a) == null || (templateData = lVar.f50350k) == null)) {
            templateData = TemplateData.m56770a();
        }
        renderTemplateUrl(str, templateData);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.lynx.hybrid.m$c */
    public static final class C21224c extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C21218m f50384a;

        /* renamed from: b */
        final /* synthetic */ String f50385b;

        static {
            Covode.recordClassIndex(24840);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21224c(C21218m mVar, String str) {
            super(1);
            this.f50384a = mVar;
            this.f50385b = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            Throwable th2 = th;
            C89219l.m154719c(th2, "");
            C21210c.m39924a("ResoureLoader template load error, " + th2.getMessage(), EnumC21209b.E, "LynxKit");
            AbstractC21152f fVar = this.f50384a.f50366c;
            if (fVar != null) {
                fVar.mo34719a(this.f50384a, this.f50385b, "ResoureLoader template load error, " + th2.getMessage());
            }
            C21161b bVar = this.f50384a.f50365b;
            if (bVar != null) {
                bVar.mo19151a(new C28816j("ResoureLoader template load error, " + th2.getMessage(), 100));
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.lynx.hybrid.m$b */
    public static final class C21221b extends AbstractC89220m implements AbstractC89172b<C21294e, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C21218m f50374a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89238e f50375b;

        /* renamed from: c */
        final /* synthetic */ String f50376c;

        static {
            Covode.recordClassIndex(24837);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21221b(C21218m mVar, C89233z.C89238e eVar, String str) {
            super(1);
            this.f50374a = mVar;
            this.f50375b = eVar;
            this.f50376c = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C21294e eVar) {
            T t;
            C21225n nVar;
            final C21294e eVar2 = eVar;
            C89219l.m154719c(eVar2, "");
            C21217l lVar = this.f50374a.f50364a;
            if (!(lVar == null || (nVar = lVar.f50349j) == null)) {
                C89219l.m154719c(nVar, "");
            }
            final C89233z.C89238e eVar3 = new C89233z.C89238e();
            eVar3.element = null;
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            final C89233z.C89234a aVar = new C89233z.C89234a();
            aVar.element = false;
            C1731i.m5636a(new Callable<Object>(this) {
                /* class com.bytedance.lynx.hybrid.C21218m.C21221b.CallableC212221 */

                /* renamed from: a */
                final /* synthetic */ C21221b f50377a;

                static {
                    Covode.recordClassIndex(24838);
                }

                {
                    this.f50377a = r1;
                }

                /* renamed from: com.bytedance.lynx.hybrid.m$b$1$a */
                static final class CallableC21223a<V> implements Callable<C89391z> {

                    /* renamed from: a */
                    final /* synthetic */ InputStream f50382a;

                    /* renamed from: b */
                    final /* synthetic */ CallableC212221 f50383b;

                    static {
                        Covode.recordClassIndex(24839);
                    }

                    CallableC21223a(InputStream inputStream, CallableC212221 r2) {
                        this.f50382a = inputStream;
                        this.f50383b = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ C89391z call() {
                        T t;
                        if (eVar2.f50549p != EnumC21293d.CDN || !C21170d.C21171a.m39868a().f50220a) {
                            t = eVar2.f50547n;
                        } else {
                            t = this.f50383b.f50377a.f50375b.element;
                        }
                        C21218m mVar = this.f50383b.f50377a.f50374a;
                        byte[] bArr = (byte[]) eVar3.element;
                        if (bArr == null) {
                            C89219l.m154707a();
                        }
                        mVar.mo34825a(bArr, t);
                        return C89391z.f203057a;
                    }
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Object obj;
                    MethodCollector.m26663i(7627);
                    try {
                        InputStream a = eVar2.mo34899a();
                        if (a != null) {
                            try {
                                InputStream inputStream = a;
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
                                    long unused = C89145b.m154635a(inputStream, byteArrayOutputStream2, 8192);
                                    eVar3.element = (T) byteArrayOutputStream2.toByteArray();
                                    if (!aVar.element) {
                                        countDownLatch.countDown();
                                        obj = C89391z.f203057a;
                                    } else {
                                        obj = C1731i.m5636a(new CallableC21223a(inputStream, this), C1731i.f5564c);
                                    }
                                    C89146c.m154636a(byteArrayOutputStream, null);
                                    C89146c.m154636a(a, null);
                                } catch (Throwable th) {
                                    C89146c.m154636a(byteArrayOutputStream, th);
                                    MethodCollector.m26664o(7627);
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                C89146c.m154636a(a, th);
                                MethodCollector.m26664o(7627);
                                throw th2;
                            }
                        } else {
                            C21210c.m39924a("ResourceLoader stream empty", EnumC21209b.E, "LynxKit");
                            AbstractC21152f fVar = this.f50377a.f50374a.f50366c;
                            if (fVar != null) {
                                fVar.mo34719a(this.f50377a.f50374a, this.f50377a.f50376c, "ResourceLoader stream empty");
                            }
                            C21161b bVar = this.f50377a.f50374a.f50365b;
                            if (bVar != null) {
                                bVar.mo19151a(new C28816j("ResourceLoader stream empty", 100));
                            }
                            countDownLatch.countDown();
                            obj = C89391z.f203057a;
                        }
                    } catch (Throwable th3) {
                        C21210c.m39924a("ResourceLoader stream write error, " + th3.getMessage(), EnumC21209b.E, "LynxKit");
                        AbstractC21152f fVar2 = this.f50377a.f50374a.f50366c;
                        if (fVar2 != null) {
                            fVar2.mo34719a(this.f50377a.f50374a, this.f50377a.f50376c, "ResourceLoader stream write error, " + th3.getMessage());
                        }
                        C21161b bVar2 = this.f50377a.f50374a.f50365b;
                        if (bVar2 != null) {
                            bVar2.mo19151a(new C28816j("ResourceLoader stream write error, " + th3.getMessage(), 100));
                        }
                        countDownLatch.countDown();
                        obj = C89391z.f203057a;
                    }
                    MethodCollector.m26664o(7627);
                    return obj;
                }
            }, C1731i.f5562a);
            try {
                countDownLatch.await(4, TimeUnit.SECONDS);
                if (eVar3.element == null) {
                    C21210c.m39925a("data cannot be null", (EnumC21209b) null, (String) null, 6);
                } else {
                    if (eVar2.f50549p != EnumC21293d.CDN || !C21170d.C21171a.m39868a().f50220a) {
                        t = eVar2.f50547n;
                    } else {
                        t = this.f50375b.element;
                    }
                    C21218m mVar = this.f50374a;
                    byte[] bArr = (byte[]) eVar3.element;
                    if (bArr == null) {
                        C89219l.m154707a();
                    }
                    mVar.mo34825a(bArr, t);
                }
            } catch (Throwable unused) {
                aVar.element = true;
                C21210c.m39925a("ResourceLoader load " + this.f50376c + " more than 4s, use async mode", (EnumC21209b) null, (String) null, 6);
            }
            return C89391z.f203057a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.lynx.hybrid.p1515a.AbstractC21154h
    /* renamed from: a */
    public final void mo34725a(String str) {
        C89219l.m154719c(str, "");
        AbstractC21152f fVar = this.f50366c;
        if (fVar != null) {
            fVar.mo25382a(this, str);
        }
        if (TextUtils.isEmpty(str)) {
            new AndroidRuntimeException("url cannot be empty").printStackTrace();
            AbstractC21152f fVar2 = this.f50366c;
            if (fVar2 != null) {
                fVar2.mo34719a(this, str, "url cannot be empty");
            }
        }
        if (this.f50369h == null) {
            m39937b(str);
            return;
        }
        C89233z.C89238e eVar = new C89233z.C89238e();
        eVar.element = str;
        IResourceService iResourceService = this.f50369h;
        if (iResourceService != null) {
            C21284j jVar = new C21284j();
            jVar.mo34890d("template");
            try {
                Uri parse = Uri.parse(str);
                T t = (T) parse.getQueryParameter("surl");
                if (t != null) {
                    C89219l.m154709a((Object) t, "");
                    jVar.mo34889c(t);
                    eVar.element = t;
                }
                String queryParameter = parse.getQueryParameter("channel");
                if (queryParameter != null) {
                    C89219l.m154709a((Object) queryParameter, "");
                    jVar.mo34887a(queryParameter);
                }
                String queryParameter2 = parse.getQueryParameter("bundle");
                if (queryParameter2 != null) {
                    C89219l.m154709a((Object) queryParameter2, "");
                    jVar.mo34888b(queryParameter2);
                }
                jVar.f50514e = 1;
                String queryParameter3 = parse.getQueryParameter("dynamic");
                if (queryParameter3 != null) {
                    C89219l.m154709a((Object) queryParameter3, "");
                    jVar.f50514e = Integer.valueOf(Integer.parseInt(queryParameter3));
                }
            } catch (Throwable th) {
                C21210c.m39927a(th, "lynxkit.load parse url error", (String) null, 4);
            }
            iResourceService.loadAsync(str, jVar, new C21221b(this, eVar, str), new C21224c(this, str));
        }
    }

    @Override // com.bytedance.lynx.hybrid.p1515a.AbstractC21154h
    /* renamed from: a */
    public final void mo34726a(String str, List<? extends Object> list) {
        C89219l.m154719c(str, "");
        if (list != null) {
            sendGlobalEvent(str, JavaOnlyArray.from(list));
        } else {
            sendGlobalEvent(str, new JavaOnlyArray());
        }
    }

    /* renamed from: a */
    public final void mo34825a(byte[] bArr, String str) {
        TemplateData templateData;
        C21192a aVar;
        C89219l.m154719c(bArr, "");
        this.f50368g = bArr;
        this.f50367f = str;
        C21217l lVar = this.f50364a;
        if (lVar == null || (aVar = lVar.f50358s) == null || (templateData = aVar.f50277a) == null) {
            C21217l lVar2 = this.f50364a;
            if (lVar2 != null) {
                templateData = lVar2.f50350k;
            } else {
                templateData = null;
            }
        }
        renderTemplateWithBaseUrl(bArr, templateData, str);
        AbstractC21152f fVar = this.f50366c;
        if (fVar != null) {
            fVar.mo25381a(this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21218m(Context context, C21196a aVar, C28820n nVar, C21217l lVar, AbstractC21152f fVar) {
        super(context, nVar);
        String str;
        AbstractC21365f fVar2;
        String str2;
        List<String> b;
        C89219l.m154719c(context, "");
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(nVar, "");
        C89219l.m154719c(lVar, "");
        this.f50372k = aVar;
        C12152b bVar = new C12152b(getHybridContext().f50281g, C212191.f50373a);
        bVar.f29208f = "spark";
        if ("spark".length() == 0) {
            str = "detect_when_load_success";
        } else {
            str = "detect_when_detach";
        }
        C89219l.m154719c(str, "");
        bVar.f29205c = str;
        this.f50371j = bVar;
        this.f50370i = (C21160n) getHybridContext().mo34746a(C21160n.class);
        this.f50369h = (IResourceService) C21353c.C21354a.m40102a().mo34955a(getHybridContext().f50281g, IResourceService.class);
        this.f50364a = lVar;
        this.f50367f = String.valueOf(lVar.f50361v);
        this.f50366c = fVar;
        C21161b bVar2 = new C21161b(this.f50364a, this.f50369h);
        bVar2.f50189c = fVar;
        this.f50365b = bVar2;
        addLynxViewClient(bVar2);
        C21217l lVar2 = this.f50364a;
        setGlobalProps(TemplateData.m56772a(lVar2 != null ? lVar2.f50354o : null));
        C21217l lVar3 = this.f50364a;
        if (!(lVar3 == null || (str2 = lVar3.f50360u) == null || str2.length() == 0 || str2 == null || (b = C89361p.m154915b(str2, new String[]{","})) == null)) {
            for (T t : b) {
                if (!C28573r.m57145a((String) t)) {
                    C28573r.m57142a(C21187d.m39885a().getAssets(), t, "font/");
                }
            }
        }
        C12152b bVar3 = this.f50371j;
        if (bVar3 != null) {
            C12116a.m21585a(this, bVar3);
        }
        C12178a aVar2 = (C12178a) getHybridContext().mo34746a(C12178a.class);
        if (aVar2 != null) {
            aVar2.f29308a = this;
        }
        C21213f.m39930a(getHybridContext().f50280f, "lynx", this);
        C21217l lVar4 = this.f50364a;
        if (!(lVar4 == null || (fVar2 = lVar4.f50353n) == null)) {
            fVar2.mo34707a(context, this, this.f50370i);
        }
    }
}
