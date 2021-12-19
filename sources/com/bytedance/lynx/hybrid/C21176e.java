package com.bytedance.lynx.hybrid;

import android.content.Context;
import android.net.Uri;
import com.bytedance.android.monitorV2.webview.AbstractC12208d;
import com.bytedance.android.monitorV2.webview.C12188a;
import com.bytedance.android.monitorV2.webview.C12230n;
import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.C21170d;
import com.bytedance.lynx.hybrid.p1515a.AbstractC21152f;
import com.bytedance.lynx.hybrid.p1515a.AbstractC21154h;
import com.bytedance.lynx.hybrid.p1515a.AbstractC21155i;
import com.bytedance.lynx.hybrid.p1515a.C21147a;
import com.bytedance.lynx.hybrid.p1519e.C21182b;
import com.bytedance.lynx.hybrid.p1522h.C21196a;
import com.bytedance.lynx.hybrid.p1522h.C21197b;
import com.bytedance.lynx.hybrid.p1524j.C21210c;
import com.bytedance.lynx.hybrid.p1524j.EnumC21209b;
import com.bytedance.lynx.hybrid.service.p1538c.EnumC21362b;
import com.bytedance.lynx.hybrid.webkit.C21394d;
import com.bytedance.lynx.hybrid.webkit.C21395e;
import com.bytedance.lynx.hybrid.webkit.p1539a.p1540a.C21370a;
import com.bytedance.lynx.hybrid.webkit.p1539a.p1540a.C21377c;
import com.bytedance.lynx.hybrid.webkit.p1539a.p1540a.C21383d;
import com.bytedance.lynx.hybrid.webkit.p1539a.p1540a.C21384e;
import com.bytedance.webx.AbstractC23547a;
import com.bytedance.webx.C23612h;
import com.bytedance.webx.p1756e.p1757a.C23593e;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.lynx.hybrid.e */
public final class C21176e {

    /* renamed from: a */
    public static final String f50230a = f50230a;

    /* renamed from: b */
    public static C21163c f50231b;

    /* renamed from: c */
    public static AtomicBoolean f50232c = new AtomicBoolean(false);

    /* renamed from: d */
    public static final AtomicBoolean f50233d = new AtomicBoolean(false);

    /* renamed from: e */
    public static AbstractC89171a<C89391z> f50234e;

    /* renamed from: f */
    public static AtomicBoolean f50235f = new AtomicBoolean(false);

    /* renamed from: g */
    public static AbstractC12208d.C12209a f50236g;

    /* renamed from: h */
    public static final Map<Integer, WeakReference<C21218m>> f50237h = new LinkedHashMap();

    /* renamed from: i */
    public static final C21177a f50238i = new C21177a((byte) 0);

    /* renamed from: com.bytedance.lynx.hybrid.e$a */
    public static final class C21177a {
        static {
            Covode.recordClassIndex(24793);
        }

        /* renamed from: com.bytedance.lynx.hybrid.e$a$b */
        public static final class C21180b extends C23612h.AbstractC23617d {
            static {
                Covode.recordClassIndex(24796);
            }

            C21180b() {
            }

            @Override // com.bytedance.webx.C23612h.AbstractC23617d
            /* renamed from: a */
            public final void mo26815a(C23612h.C23613a aVar) {
                C89219l.m154719c(aVar, "");
                aVar.mo39036a(C21370a.class);
            }
        }

        private C21177a() {
        }

        /* renamed from: c */
        private static boolean m39877c() {
            if (!C21176e.f50235f.compareAndSet(false, true)) {
                return true;
            }
            try {
                AbstractC89171a<C89391z> aVar = C21176e.f50234e;
                if (aVar != null) {
                    aVar.invoke();
                }
                return true;
            } catch (Exception unused) {
                C21210c.m39924a("Call PrepareBlock failed, please check your code.", EnumC21209b.E, C21176e.f50230a);
                C21176e.f50231b = null;
                C21176e.f50232c.set(false);
                C21176e.f50233d.set(false);
                C21176e.f50234e = null;
                C21176e.f50235f.set(false);
                return false;
            }
        }

        /* renamed from: a */
        public static void m39873a() {
            AbstractC21155i iVar;
            if (m39877c()) {
                C21163c cVar = C21176e.f50231b;
                AbstractC21155i iVar2 = null;
                if (cVar == null || cVar.f50195c == null) {
                    C21210c.m39924a("LynxConfig cannot be null, Please set value by HybridKit.setLynxConfig", EnumC21209b.E, C21176e.f50230a);
                    return;
                }
                C21163c cVar2 = C21176e.f50231b;
                if (cVar2 == null || cVar2.f50196d == null) {
                    C21210c.m39924a("ResourceConfig cannot be null, Please set value by HybridKit.setResourceConfig", EnumC21209b.E, C21176e.f50230a);
                    return;
                }
                m39878d();
                C21163c cVar3 = C21176e.f50231b;
                if (cVar3 != null) {
                    iVar2 = cVar3.f50195c;
                }
                if (iVar2 instanceof C21182b) {
                    C21163c cVar4 = C21176e.f50231b;
                    if (cVar4 == null || (iVar = cVar4.f50195c) == null) {
                        throw new C89388w("null cannot be cast to non-null type");
                    }
                    C21205j.m39918a((C21182b) iVar);
                }
            }
        }

        /* renamed from: b */
        public static void m39876b() {
            if (C21176e.f50233d.compareAndSet(false, true) && m39877c()) {
                m39878d();
                AbstractC12208d.C12209a d = C12230n.m21942a().mo19571d();
                C21176e.f50236g = d;
                d.mo19599a(new C12188a());
                d.mo19598a();
                d.mo19601a(C21395e.class.getName());
                C12230n.m21942a().mo19570a(C21176e.f50236g);
                C23612h.m44649a(C21170d.C21171a.m39868a().mo34735a());
                C23612h.m44650a("hybrid_webx_webkit", C23593e.class, new C21180b());
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0045, code lost:
            if (r3.mo34956a(com.bytedance.lynx.hybrid.service.IResourceService.class, r1) == null) goto L_0x0047;
         */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static void m39878d() {
            /*
            // Method dump skipped, instructions count: 211
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lynx.hybrid.C21176e.C21177a.m39878d():void");
        }

        public /* synthetic */ C21177a(byte b) {
            this();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.lynx.hybrid.e$a$a */
        public static final class C21178a implements C23612h.AbstractC23616c {

            /* renamed from: a */
            final /* synthetic */ C21394d f50239a;

            static {
                Covode.recordClassIndex(24794);
            }

            C21178a(C21394d dVar) {
                this.f50239a = dVar;
            }

            @Override // com.bytedance.webx.C23612h.AbstractC23616c
            /* renamed from: a */
            public final void mo34738a(AbstractC23547a<Object> aVar) {
                if (!(aVar instanceof C21377c)) {
                    aVar = null;
                }
                C21377c cVar = (C21377c) aVar;
                if (cVar != null) {
                    C211791 r1 = new C21377c.AbstractC21379b(this) {
                        /* class com.bytedance.lynx.hybrid.C21176e.C21177a.C21178a.C211791 */

                        /* renamed from: a */
                        final /* synthetic */ C21178a f50240a;

                        /* renamed from: b */
                        private final C21384e f50241b;

                        /* renamed from: c */
                        private final C21383d f50242c;

                        static {
                            Covode.recordClassIndex(24795);
                        }

                        @Override // com.bytedance.lynx.hybrid.webkit.p1539a.p1540a.C21377c.AbstractC21379b
                        /* renamed from: a */
                        public final C21384e mo34739a() {
                            return this.f50241b;
                        }

                        @Override // com.bytedance.lynx.hybrid.webkit.p1539a.p1540a.C21377c.AbstractC21379b
                        /* renamed from: b */
                        public final C21383d mo34740b() {
                            return this.f50242c;
                        }

                        /* JADX WARN: Incorrect args count in method signature: ()V */
                        {
                            this.f50240a = r2;
                            C21384e eVar = r2.f50239a.f50750a;
                            this.f50241b = eVar == null ? new C21384e() : eVar;
                            C21383d dVar = r2.f50239a.f50751b;
                            this.f50242c = dVar == null ? new C21383d() : dVar;
                        }
                    };
                    C89219l.m154719c(r1, "");
                    cVar.f50731a = r1;
                }
            }
        }

        /* renamed from: a */
        public static EnumC21362b m39872a(Uri uri) {
            String host;
            C89219l.m154719c(uri, "");
            if (uri.isHierarchical() && (host = uri.getHost()) != null) {
                C89219l.m154709a((Object) host, "");
                if (C89361p.m154908a((CharSequence) host, (CharSequence) "lynxview", false)) {
                    return EnumC21362b.LYNX;
                }
                if (C89361p.m154908a((CharSequence) host, (CharSequence) "webview", false)) {
                    return EnumC21362b.WEB;
                }
            }
            return EnumC21362b.UNKNOWN;
        }

        /* renamed from: a */
        public static void m39874a(String str, Object obj) {
            C89219l.m154719c(str, "");
            C89219l.m154719c(obj, "");
            C21147a aVar = C21170d.C21171a.m39868a().f50223d;
            if (aVar != null) {
                aVar.put(str, obj);
            }
        }

        /* renamed from: a */
        public static AbstractC21154h m39871a(C21197b bVar, C21196a aVar, Context context, AbstractC21152f fVar) {
            C89219l.m154719c(bVar, "");
            C89219l.m154719c(aVar, "");
            C89219l.m154719c(context, "");
            return m39875b(bVar, aVar, context, fVar);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:46:0x00fb, code lost:
            if (r1.f50746a == true) goto L_0x00fd;
         */
        /* JADX WARNING: Removed duplicated region for block: B:114:0x0215  */
        /* JADX WARNING: Removed duplicated region for block: B:117:0x0220  */
        /* JADX WARNING: Removed duplicated region for block: B:120:0x022c  */
        /* JADX WARNING: Removed duplicated region for block: B:123:0x02c7  */
        /* JADX WARNING: Removed duplicated region for block: B:129:0x02e1  */
        /* JADX WARNING: Removed duplicated region for block: B:132:0x02ec  */
        /* JADX WARNING: Removed duplicated region for block: B:135:0x0325  */
        /* JADX WARNING: Removed duplicated region for block: B:136:0x0327  */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x011f  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static com.bytedance.lynx.hybrid.p1515a.AbstractC21154h m39875b(com.bytedance.lynx.hybrid.p1522h.C21197b r17, com.bytedance.lynx.hybrid.p1522h.C21196a r18, android.content.Context r19, com.bytedance.lynx.hybrid.p1515a.AbstractC21152f r20) {
            /*
            // Method dump skipped, instructions count: 1182
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lynx.hybrid.C21176e.C21177a.m39875b(com.bytedance.lynx.hybrid.h.b, com.bytedance.lynx.hybrid.h.a, android.content.Context, com.bytedance.lynx.hybrid.a.f):com.bytedance.lynx.hybrid.a.h");
        }
    }

    static {
        Covode.recordClassIndex(24792);
    }
}
