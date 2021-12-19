package com.p2082ss.android.ugc.aweme.ecommerce.preloader;

import android.net.Uri;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.p1477a.C20758o;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20764t;
import com.bytedance.lighten.p1477a.p1478a.C20714a;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.Image;
import com.p2082ss.android.ugc.aweme.utils.C80538hl;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.AbstractC89587ci;
import kotlinx.coroutines.C89546bf;
import kotlinx.coroutines.C89561bs;
import kotlinx.coroutines.C89624i;
import kotlinx.coroutines.internal.C89652o;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.preloader.c */
public final class C45090c {

    /* renamed from: e */
    public static final C45091a f105131e = new C45091a((byte) 0);

    /* renamed from: a */
    public List<String> f105132a;

    /* renamed from: b */
    public boolean f105133b;

    /* renamed from: c */
    public long f105134c;

    /* renamed from: d */
    public int f105135d;

    /* renamed from: f */
    private long f105136f = SystemClock.uptimeMillis();

    /* renamed from: g */
    private long f105137g;

    /* renamed from: h */
    private String f105138h = "";

    /* renamed from: i */
    private Integer f105139i;

    /* renamed from: j */
    private C20758o f105140j;

    /* renamed from: k */
    private boolean f105141k;

    /* renamed from: l */
    private String f105142l;

    static {
        Covode.recordClassIndex(53521);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.preloader.c$a */
    public static final class C45091a {
        static {
            Covode.recordClassIndex(53522);
        }

        private C45091a() {
        }

        public /* synthetic */ C45091a(byte b) {
            this();
        }
    }

    /* renamed from: b */
    private final void m87738b() {
        AbstractC89568bz unused = C89624i.m155555a(C89561bs.f203280a, C89546bf.f203267b, null, new C45092b(this, null), 2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
        if (r2 == null) goto L_0x0055;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo76182a() {
        /*
        // Method dump skipped, instructions count: 205
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.preloader.C45090c.mo76182a():void");
    }

    /* renamed from: a */
    public final void mo76183a(int i) {
        this.f105139i = Integer.valueOf(i);
    }

    /* renamed from: a */
    public final void mo76184a(C20714a aVar) {
        List<String> list;
        if (aVar != null) {
            list = aVar.f48941a;
        } else {
            list = null;
        }
        this.f105132a = list;
        m87738b();
    }

    /* renamed from: a */
    public final void mo76185a(C20758o oVar) {
        this.f105137g = SystemClock.uptimeMillis();
        this.f105140j = oVar;
        this.f105141k = true;
        this.f105135d++;
        AbstractC89568bz unused = C89624i.m155555a(C89561bs.f203280a, C89546bf.f203267b, null, new C45094c(this, null), 2);
    }

    /* renamed from: a */
    public final void mo76186a(Image image) {
        List<String> list;
        if (image != null) {
            list = image.getUrls();
        } else {
            list = null;
        }
        this.f105132a = list;
        m87738b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.preloader.c$b */
    public static final class C45092b extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f105143a;

        /* renamed from: b */
        final /* synthetic */ C45090c f105144b;

        static {
            Covode.recordClassIndex(53523);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45092b(C45090c cVar, AbstractC89124d dVar) {
            super(2, dVar);
            this.f105144b = cVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C45092b(this.f105144b, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C45092b) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            T t;
            T t2;
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f105143a;
            if (i == 0) {
                C89382r.m154942a(obj);
                List<String> list = this.f105144b.f105132a;
                if (list != null) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            t2 = null;
                            break;
                        }
                        t2 = it.next();
                        if (C20764t.m39067a(t2)) {
                            break;
                        }
                    }
                    t = t2;
                } else {
                    t = null;
                }
                final boolean a = C80538hl.m139614a(t);
                AbstractC89587ci ciVar = C89652o.f203399a;
                C450931 r0 = new AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object>(this, null) {
                    /* class com.p2082ss.android.ugc.aweme.ecommerce.preloader.C45090c.C45092b.C450931 */

                    /* renamed from: a */
                    int f105145a;

                    /* renamed from: b */
                    final /* synthetic */ C45092b f105146b;

                    static {
                        Covode.recordClassIndex(53524);
                    }

                    {
                        this.f105146b = r2;
                    }

                    @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                    public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                        C89219l.m154721d(dVar, "");
                        return 

                        /* access modifiers changed from: package-private */
                        /* renamed from: com.ss.android.ugc.aweme.ecommerce.preloader.c$c */
                        public static final class C45094c extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

                            /* renamed from: a */
                            int f105148a;

                            /* renamed from: b */
                            final /* synthetic */ C45090c f105149b;

                            static {
                                Covode.recordClassIndex(53525);
                            }

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            C45094c(C45090c cVar, AbstractC89124d dVar) {
                                super(2, dVar);
                                this.f105149b = cVar;
                            }

                            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                            public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                                C89219l.m154721d(dVar, "");
                                return new C45094c(this.f105149b, dVar);
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                            @Override // p4600h.p4611f.p4612a.AbstractC89183m
                            public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
                                return ((C45094c) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
                            }

                            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                            public final Object invokeSuspend(Object obj) {
                                boolean z;
                                long j;
                                EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
                                int i = this.f105148a;
                                if (i == 0) {
                                    C89382r.m154942a(obj);
                                    final C89233z.C89237d dVar = new C89233z.C89237d();
                                    dVar.element = 0;
                                    List<String> list = this.f105149b.f105132a;
                                    if (list != null) {
                                        Iterator<T> it = list.iterator();
                                        while (it.hasNext()) {
                                            try {
                                                File b = C20761r.m39063b().mo34142b(Uri.parse(it.next()));
                                                if (b != null) {
                                                    j = b.length();
                                                } else {
                                                    j = 0;
                                                }
                                                dVar.element = j;
                                            } catch (Throwable unused) {
                                            }
                                            if (dVar.element > 0) {
                                                z = true;
                                                continue;
                                            } else {
                                                z = false;
                                                continue;
                                            }
                                            if (z) {
                                                break;
                                            }
                                        }
                                    }
                                    AbstractC89587ci ciVar = C89652o.f203399a;
                                    C450951 r1 = new AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object>(this, null) {
                                        /* class com.p2082ss.android.ugc.aweme.ecommerce.preloader.C45090c.C45094c.C450951 */

                                        /* renamed from: a */
                                        int f105150a;

                                        /* renamed from: b */
                                        final /* synthetic */ C45094c f105151b;

                                        static {
                                            Covode.recordClassIndex(53526);
                                        }

                                        {
                                            this.f105151b = r2;
                                        }

                                        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                                        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                                            C89219l.m154721d(dVar, "");
                                            return 

                                            /* renamed from: a */
                                            public final void mo76187a(String str) {
                                                C89219l.m154721d(str, "");
                                                this.f105138h = str;
                                            }

                                            /* renamed from: a */
                                            public final void mo76188a(Throwable th) {
                                                String message;
                                                this.f105137g = SystemClock.uptimeMillis();
                                                this.f105141k = false;
                                                if (!(th == null || (message = th.getMessage()) == null)) {
                                                    int min = Math.min(128, message.length());
                                                    Objects.requireNonNull(message, "null cannot be cast to non-null type java.lang.String");
                                                    String substring = message.substring(0, min);
                                                    C89219l.m154716b(substring, "");
                                                    this.f105142l = substring;
                                                }
                                                this.f105135d += 2;
                                                mo76182a();
                                            }
                                        }
