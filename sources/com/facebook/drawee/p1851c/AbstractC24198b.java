package com.facebook.drawee.p1851c;

import android.content.Context;
import android.graphics.drawable.Animatable;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1832d.AbstractC24093k;
import com.facebook.common.p1832d.C24088h;
import com.facebook.common.p1832d.C24091i;
import com.facebook.drawee.p1850b.C24194c;
import com.facebook.drawee.p1851c.AbstractC24198b;
import com.facebook.drawee.p1856g.C24253a;
import com.facebook.drawee.p1857h.AbstractC24255a;
import com.facebook.drawee.p1857h.AbstractC24258d;
import com.facebook.imagepipeline.p1891p.C24644b;
import com.facebook.p1844d.AbstractC24157c;
import com.facebook.p1844d.C24161f;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.facebook.drawee.c.b */
public abstract class AbstractC24198b<BUILDER extends AbstractC24198b<BUILDER, REQUEST, IMAGE, INFO>, REQUEST, IMAGE, INFO> implements AbstractC24258d {

    /* renamed from: n */
    private static final AbstractC24203d<Object> f57294n = new C24202c<Object>() {
        /* class com.facebook.drawee.p1851c.AbstractC24198b.C241991 */

        static {
            Covode.recordClassIndex(28330);
        }

        @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
        public final void onFinalImageSet(String str, Object obj, Animatable animatable) {
            if (animatable != null) {
                animatable.start();
            }
        }
    };

    /* renamed from: o */
    private static final NullPointerException f57295o = new NullPointerException("No image request was specified!");

    /* renamed from: r */
    private static final AtomicLong f57296r = new AtomicLong();

    /* renamed from: a */
    public final Context f57297a;

    /* renamed from: b */
    public Object f57298b;

    /* renamed from: c */
    public REQUEST f57299c;

    /* renamed from: d */
    public REQUEST f57300d;

    /* renamed from: e */
    public REQUEST[] f57301e;

    /* renamed from: f */
    public AbstractC24093k<AbstractC24157c<IMAGE>> f57302f;

    /* renamed from: g */
    public AbstractC24203d<? super INFO> f57303g;

    /* renamed from: h */
    public AbstractC24204e f57304h;

    /* renamed from: i */
    public boolean f57305i;

    /* renamed from: j */
    public boolean f57306j;

    /* renamed from: k */
    public boolean f57307k;

    /* renamed from: l */
    public String f57308l;

    /* renamed from: m */
    public AbstractC24255a f57309m;

    /* renamed from: p */
    private final Set<AbstractC24203d> f57310p;

    /* renamed from: q */
    private boolean f57311q;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract AbstractC24157c<IMAGE> mo39795a(AbstractC24255a aVar, REQUEST request, Object obj, EnumC24201a aVar2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract AbstractC24195a mo39798a();

    /* renamed from: d */
    protected static String m45918d() {
        return String.valueOf(f57296r.getAndIncrement());
    }

    static {
        Covode.recordClassIndex(28329);
    }

    /* renamed from: b */
    public final void mo39825b() {
        this.f57298b = null;
        this.f57299c = null;
        this.f57300d = null;
        this.f57301e = null;
        this.f57311q = true;
        this.f57303g = null;
        this.f57304h = null;
        this.f57305i = false;
        this.f57306j = false;
        this.f57309m = null;
        this.f57308l = null;
    }

    /* renamed from: com.facebook.drawee.c.b$a */
    public enum EnumC24201a {
        FULL_FETCH,
        DISK_CACHE,
        BITMAP_MEMORY_CACHE;

        static {
            Covode.recordClassIndex(28332);
        }
    }

    /* renamed from: c */
    public final AbstractC24195a mo39827e() {
        boolean z;
        REQUEST request;
        boolean z2 = false;
        if (this.f57301e == null || this.f57299c == null) {
            z = true;
        } else {
            z = false;
        }
        C24091i.m45623b(z, "Cannot specify both ImageRequest and FirstAvailableImageRequests!");
        if (this.f57302f == null || (this.f57301e == null && this.f57299c == null && this.f57300d == null)) {
            z2 = true;
        }
        C24091i.m45623b(z2, "Cannot specify DataSourceSupplier with other ImageRequests! Use one or the other.");
        if (this.f57299c == null && this.f57301e == null && (request = this.f57300d) != null) {
            this.f57299c = request;
            this.f57300d = null;
        }
        C24644b.m47156a();
        AbstractC24195a a = mo39798a();
        a.f57283o = this.f57307k;
        a.f57284p = this.f57308l;
        a.f57276h = this.f57304h;
        if (this.f57305i) {
            if (a.f57274f == null) {
                a.f57274f = new C24194c();
            }
            a.f57274f.f57266a = this.f57305i;
            if (a.f57275g == null) {
                a.f57275g = new C24253a(this.f57297a);
                if (a.f57275g != null) {
                    a.f57275g.f57509a = a;
                }
            }
        }
        Set<AbstractC24203d> set = this.f57310p;
        if (set != null) {
            for (AbstractC24203d dVar : set) {
                a.mo39808a(dVar);
            }
        }
        AbstractC24203d<? super INFO> dVar2 = this.f57303g;
        if (dVar2 != null) {
            a.mo39808a((AbstractC24203d) dVar2);
        }
        if (this.f57306j) {
            a.mo39808a((AbstractC24203d) f57294n);
        }
        C24644b.m47156a();
        return a;
    }

    /* renamed from: a */
    public final BUILDER mo39823a(REQUEST[] requestArr) {
        boolean z;
        if (requestArr == null || requestArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        C24091i.m45621a(z, "No requests specified!");
        this.f57301e = requestArr;
        this.f57311q = true;
        return this;
    }

    @Override // com.facebook.drawee.p1857h.AbstractC24258d
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ AbstractC24258d mo39824a(AbstractC24255a aVar) {
        this.f57309m = aVar;
        return this;
    }

    public AbstractC24198b(Context context, Set<AbstractC24203d> set) {
        this.f57297a = context;
        this.f57310p = set;
        mo39825b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final AbstractC24093k<AbstractC24157c<IMAGE>> mo39822a(AbstractC24255a aVar, String str) {
        AbstractC24093k<AbstractC24157c<IMAGE>> a;
        AbstractC24093k<AbstractC24157c<IMAGE>> kVar = this.f57302f;
        if (kVar != null) {
            return kVar;
        }
        REQUEST request = this.f57299c;
        if (request != null) {
            a = m45916a(aVar, str, request);
        } else {
            REQUEST[] requestArr = this.f57301e;
            if (requestArr != null) {
                boolean z = this.f57311q;
                ArrayList arrayList = new ArrayList(requestArr.length * 2);
                if (z) {
                    for (REQUEST request2 : requestArr) {
                        arrayList.add(m45917a(aVar, str, (Object) request2, EnumC24201a.BITMAP_MEMORY_CACHE));
                    }
                }
                for (REQUEST request3 : requestArr) {
                    arrayList.add(m45916a(aVar, str, request3));
                }
                a = C24161f.m45794a(arrayList);
            }
            return 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x002b: RETURN  
                  (wrap: com.facebook.d.d$1 : 0x0067: CONSTRUCTOR  (r2v0 com.facebook.d.d$1) = 
                  (wrap: java.lang.NullPointerException : 0x0063: SGET  (r0v3 java.lang.NullPointerException) =  com.facebook.drawee.c.b.o java.lang.NullPointerException)
                 call: com.facebook.d.d.1.<init>(java.lang.Throwable):void type: CONSTRUCTOR)
                 in method: com.facebook.drawee.c.b.a(com.facebook.drawee.h.a, java.lang.String):com.facebook.common.d.k<com.facebook.d.c<IMAGE>>, file: classes9.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:157)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0067: CONSTRUCTOR  (r2v0 com.facebook.d.d$1) = 
                  (wrap: java.lang.NullPointerException : 0x0063: SGET  (r0v3 java.lang.NullPointerException) =  com.facebook.drawee.c.b.o java.lang.NullPointerException)
                 call: com.facebook.d.d.1.<init>(java.lang.Throwable):void type: CONSTRUCTOR in method: com.facebook.drawee.c.b.a(com.facebook.drawee.h.a, java.lang.String):com.facebook.common.d.k<com.facebook.d.c<IMAGE>>, file: classes9.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:313)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 23 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.facebook.d.d, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 27 more
                */
            /*
            // Method dump skipped, instructions count: 107
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.drawee.p1851c.AbstractC24198b.mo39822a(com.facebook.drawee.h.a, java.lang.String):com.facebook.common.d.k");
        }

        /* renamed from: a */
        private AbstractC24093k<AbstractC24157c<IMAGE>> m45916a(AbstractC24255a aVar, String str, REQUEST request) {
            return m45917a(aVar, str, (Object) request, EnumC24201a.FULL_FETCH);
        }

        /* renamed from: a */
        private AbstractC24093k<AbstractC24157c<IMAGE>> m45917a(final AbstractC24255a aVar, final String str, final REQUEST request, final EnumC24201a aVar2) {
            final Object obj = this.f57298b;
            return new AbstractC24093k<AbstractC24157c<IMAGE>>() {
                /* class com.facebook.drawee.p1851c.AbstractC24198b.C242002 */

                static {
                    Covode.recordClassIndex(28331);
                }

                /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.facebook.drawee.c.b */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.facebook.common.p1832d.AbstractC24093k
                /* renamed from: b */
                public final /* synthetic */ Object mo34217b() {
                    return AbstractC24198b.this.mo39795a(aVar, request, obj, aVar2);
                }

                public final String toString() {
                    return C24088h.m45610a(this).mo39647a("request", request.toString()).toString();
                }
            };
        }
    }
