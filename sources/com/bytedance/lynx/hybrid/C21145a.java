package com.bytedance.lynx.hybrid;

import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.android.monitorV2.lynx.C12155c;
import com.bytedance.android.monitorV2.lynx.p742b.C12152b;
import com.bytedance.android.monitorV2.lynx.p743c.p745b.C12166b;
import com.bytedance.android.monitorV2.p728a.AbstractC12067b;
import com.bytedance.android.monitorV2.p731d.C12081a;
import com.bytedance.android.monitorV2.p731d.C12086e;
import com.bytedance.android.monitorV2.p731d.C12087f;
import com.bytedance.android.monitorV2.p731d.C12088g;
import com.bytedance.android.monitorV2.p731d.C12089h;
import com.bytedance.android.monitorV2.p737i.C12115b;
import com.bytedance.android.monitorV2.p739k.C12118a;
import com.bytedance.android.monitorV2.webview.AbstractC12208d;
import com.bytedance.android.monitorV2.webview.C12230n;
import com.bytedance.bridge.magpie.C13427b;
import com.bytedance.bridge.magpie.impl.lynx.C13463b;
import com.bytedance.bridge.magpie.impl.lynx.LynxBridgeModule;
import com.bytedance.bridge.magpie.impl.p887a.AbstractC13454a;
import com.bytedance.bridge.magpie.impl.p887a.C13455b;
import com.bytedance.bridge.magpie.p885d.AbstractC13448g;
import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.p1515a.AbstractC21154h;
import com.bytedance.lynx.hybrid.p1515a.EnumC21149c;
import com.bytedance.lynx.hybrid.p1522h.C21196a;
import com.bytedance.lynx.hybrid.service.AbstractC21360c;
import com.bytedance.lynx.hybrid.service.AbstractC21365f;
import com.lynx.tasm.C28820n;
import com.lynx.tasm.LynxView;
import java.lang.ref.WeakReference;
import org.json.JSONObject;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.lynx.hybrid.a */
public final class C21145a implements AbstractC21365f {

    /* renamed from: a */
    public AbstractC21360c f50171a;

    /* renamed from: b */
    public WeakReference<AbstractC21154h> f50172b;

    /* renamed from: c */
    private C13427b f50173c = new C13427b();

    /* renamed from: d */
    private AbstractC13448g f50174d;

    static {
        Covode.recordClassIndex(24761);
    }

    @Override // com.bytedance.lynx.hybrid.service.AbstractC21366g
    /* renamed from: a */
    public final void mo34706a() {
        AbstractC13448g gVar = this.f50174d;
        if (gVar != null) {
            gVar.mo21677b();
        }
    }

    /* renamed from: com.bytedance.lynx.hybrid.a$a */
    public static final class C21146a implements AbstractC13454a {

        /* renamed from: a */
        final /* synthetic */ C21145a f50175a;

        static {
            Covode.recordClassIndex(24762);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C21146a(C21145a aVar) {
            this.f50175a = aVar;
        }

        @Override // com.bytedance.bridge.magpie.impl.p887a.AbstractC13454a
        /* renamed from: b */
        public final void mo21683b(C13455b bVar) {
            EnumC21149c cVar;
            EnumC21149c cVar2;
            AbstractC21154h hVar;
            C21196a hybridContext;
            AbstractC21195h hVar2;
            AbstractC21154h hVar3;
            AbstractC21154h hVar4;
            C21196a hybridContext2;
            AbstractC21195h hVar5;
            C89219l.m154719c(bVar, "");
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f50175a.f50172b != null) {
                WeakReference<AbstractC21154h> weakReference = this.f50175a.f50172b;
                AbstractC21154h hVar6 = null;
                if (weakReference != null && weakReference.get() != null && !TextUtils.isEmpty(bVar.f32778a)) {
                    WeakReference<AbstractC21154h> weakReference2 = this.f50175a.f50172b;
                    if (weakReference2 == null || (hVar4 = weakReference2.get()) == null || (hybridContext2 = hVar4.getHybridContext()) == null || (hVar5 = hybridContext2.f50282h) == null) {
                        cVar = null;
                    } else {
                        cVar = hVar5.mo34744a();
                    }
                    if (cVar == EnumC21149c.LYNX) {
                        WeakReference<AbstractC21154h> weakReference3 = this.f50175a.f50172b;
                        if (weakReference3 != null) {
                            hVar3 = weakReference3.get();
                        } else {
                            hVar3 = null;
                        }
                        if (hVar3 instanceof LynxView) {
                            m39819b(bVar, elapsedRealtime);
                            return;
                        }
                    }
                    WeakReference<AbstractC21154h> weakReference4 = this.f50175a.f50172b;
                    if (weakReference4 == null || (hVar = weakReference4.get()) == null || (hybridContext = hVar.getHybridContext()) == null || (hVar2 = hybridContext.f50282h) == null) {
                        cVar2 = null;
                    } else {
                        cVar2 = hVar2.mo34744a();
                    }
                    if (cVar2 == EnumC21149c.WEB) {
                        WeakReference<AbstractC21154h> weakReference5 = this.f50175a.f50172b;
                        if (weakReference5 != null) {
                            hVar6 = weakReference5.get();
                        }
                        if (hVar6 instanceof WebView) {
                            m39818a(bVar, elapsedRealtime);
                        }
                    }
                }
            }
        }

        @Override // com.bytedance.bridge.magpie.impl.p887a.AbstractC13454a
        /* renamed from: a */
        public final void mo21682a(C13455b bVar) {
            EnumC21149c cVar;
            EnumC21149c cVar2;
            AbstractC21154h hVar;
            AbstractC21154h hVar2;
            C21196a hybridContext;
            AbstractC21195h hVar3;
            AbstractC21154h hVar4;
            AbstractC21154h hVar5;
            C12152b a;
            C12166b c;
            AbstractC21154h hVar6;
            C21196a hybridContext2;
            AbstractC21195h hVar7;
            C89219l.m154719c(bVar, "");
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f50175a.f50172b != null) {
                WeakReference<AbstractC21154h> weakReference = this.f50175a.f50172b;
                AbstractC21154h hVar8 = null;
                if (weakReference != null && weakReference.get() != null && !TextUtils.isEmpty(bVar.f32778a)) {
                    WeakReference<AbstractC21154h> weakReference2 = this.f50175a.f50172b;
                    if (weakReference2 == null || (hVar6 = weakReference2.get()) == null || (hybridContext2 = hVar6.getHybridContext()) == null || (hVar7 = hybridContext2.f50282h) == null) {
                        cVar = null;
                    } else {
                        cVar = hVar7.mo34744a();
                    }
                    int i = 3;
                    if (cVar == EnumC21149c.LYNX) {
                        WeakReference<AbstractC21154h> weakReference3 = this.f50175a.f50172b;
                        if (weakReference3 != null) {
                            hVar4 = weakReference3.get();
                        } else {
                            hVar4 = null;
                        }
                        if (hVar4 instanceof LynxView) {
                            C12088g gVar = new C12088g();
                            gVar.f28998e = bVar.f32778a;
                            Integer num = bVar.f32779b;
                            if (num != null) {
                                i = num.intValue();
                            }
                            gVar.f28996c = i;
                            gVar.f28997d = bVar.f32780c;
                            C12155c cVar3 = C12155c.f29212j;
                            WeakReference<AbstractC21154h> weakReference4 = this.f50175a.f50172b;
                            if (weakReference4 == null || (hVar5 = weakReference4.get()) == null) {
                                throw new C89388w("null cannot be cast to non-null type");
                            }
                            LynxView lynxView = (LynxView) hVar5;
                            C89219l.m154719c(lynxView, "");
                            C89219l.m154719c(gVar, "");
                            C12115b.m21583b("LynxViewMonitor", "reportJsbError");
                            if (!(!C12155c.m21709a().mo19475i() || (a = cVar3.f29217c.mo19514a(lynxView)) == null || (c = cVar3.f29218d.mo19536b(lynxView)) == null)) {
                                c.mo19442a(cVar3.mo19528b(lynxView), cVar3.mo19519a(lynxView));
                                cVar3.mo19521a((C12155c) lynxView, (LynxView) c, (C12166b) C12118a.m21594a(lynxView), (C12081a) gVar, (AbstractC12067b) a, (C12152b) null);
                            }
                            m39819b(bVar, elapsedRealtime);
                            return;
                        }
                    }
                    WeakReference<AbstractC21154h> weakReference5 = this.f50175a.f50172b;
                    if (weakReference5 == null || (hVar2 = weakReference5.get()) == null || (hybridContext = hVar2.getHybridContext()) == null || (hVar3 = hybridContext.f50282h) == null) {
                        cVar2 = null;
                    } else {
                        cVar2 = hVar3.mo34744a();
                    }
                    if (cVar2 == EnumC21149c.WEB) {
                        WeakReference<AbstractC21154h> weakReference6 = this.f50175a.f50172b;
                        if (weakReference6 != null) {
                            hVar8 = weakReference6.get();
                        }
                        if (hVar8 instanceof WebView) {
                            C12086e eVar = new C12086e();
                            eVar.f28982c = bVar.f32778a;
                            Integer num2 = bVar.f32779b;
                            if (num2 != null) {
                                i = num2.intValue();
                            }
                            eVar.f28980a = i;
                            eVar.f28981b = bVar.f32780c;
                            AbstractC12208d a2 = C12230n.m21942a();
                            WeakReference<AbstractC21154h> weakReference7 = this.f50175a.f50172b;
                            if (weakReference7 == null || (hVar = weakReference7.get()) == null) {
                                throw new C89388w("null cannot be cast to non-null type");
                            }
                            a2.mo19575a((WebView) hVar, eVar);
                            m39818a(bVar, elapsedRealtime);
                        }
                    }
                }
            }
        }

        /* renamed from: a */
        private final void m39818a(C13455b bVar, long j) {
            int i;
            long j2;
            AbstractC21154h hVar;
            C12087f fVar = new C12087f();
            fVar.f28987a = bVar.f32778a;
            Integer num = bVar.f32779b;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 3;
            }
            fVar.f28988b = i;
            fVar.f28989c = bVar.f32780c;
            Long l = bVar.f32782e;
            if (l != null) {
                j2 = l.longValue();
            } else {
                j2 = 0;
            }
            fVar.f28992f = j2;
            if (fVar.f28992f != 0) {
                fVar.f28993g = j;
                fVar.f28991e = fVar.f28993g - fVar.f28992f;
            }
            AbstractC12208d a = C12230n.m21942a();
            WeakReference<AbstractC21154h> weakReference = this.f50175a.f50172b;
            if (weakReference == null || (hVar = weakReference.get()) == null) {
                throw new C89388w("null cannot be cast to non-null type");
            }
            a.mo19576a((WebView) hVar, fVar);
        }

        /* renamed from: b */
        private final void m39819b(C13455b bVar, long j) {
            int i;
            long j2;
            AbstractC21154h hVar;
            C12089h hVar2 = new C12089h();
            hVar2.f29001b = bVar.f32778a;
            Integer num = bVar.f32779b;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 3;
            }
            hVar2.f29002c = i;
            hVar2.f29003d = bVar.f32780c;
            Long l = bVar.f32782e;
            if (l != null) {
                j2 = l.longValue();
            } else {
                j2 = 0;
            }
            hVar2.f29006g = j2;
            if (hVar2.f29006g != 0) {
                hVar2.f29007h = j;
                hVar2.f29005f = hVar2.f29007h - hVar2.f29006g;
            }
            C12155c cVar = C12155c.f29212j;
            WeakReference<AbstractC21154h> weakReference = this.f50175a.f50172b;
            if (weakReference == null || (hVar = weakReference.get()) == null) {
                throw new C89388w("null cannot be cast to non-null type");
            }
            cVar.mo19520a((LynxView) hVar, hVar2);
        }
    }

    @Override // com.bytedance.lynx.hybrid.service.AbstractC21366g
    /* renamed from: a */
    public final void mo34709a(String str) {
        C89219l.m154719c(str, "");
        AbstractC13448g gVar = this.f50174d;
        if (gVar != null) {
            gVar.mo21676a(str);
        }
    }

    @Override // com.bytedance.lynx.hybrid.service.AbstractC21366g
    /* renamed from: b */
    public final boolean mo34711b(String str) {
        AbstractC13448g gVar = this.f50174d;
        if (gVar == null || !gVar.mo21678b(str)) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.lynx.hybrid.service.AbstractC21366g
    /* renamed from: c */
    public final void mo34712c(String str) {
        C89219l.m154719c(str, "");
        AbstractC13448g gVar = this.f50174d;
        if (gVar != null) {
            gVar.mo21679c(str);
        }
    }

    @Override // com.bytedance.lynx.hybrid.service.AbstractC21365f
    /* renamed from: a */
    public final void mo34710a(String str, JSONObject jSONObject) {
        C89219l.m154719c(str, "");
        this.f50173c.mo21647a(str, jSONObject);
    }

    @Override // com.bytedance.lynx.hybrid.service.AbstractC21364e
    /* renamed from: a */
    public final void mo34708a(Object obj, String str) {
        C13427b bVar = this.f50173c;
        C28820n nVar = (C28820n) obj;
        C89219l.m154719c(nVar, "");
        C13463b bVar2 = new C13463b(bVar.f32730a);
        C89219l.m154719c(nVar, "");
        nVar.mo49939a(bVar2.f32799a, LynxBridgeModule.class, bVar2.f32800b);
        bVar.f32730a.f32696e = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0049  */
    @Override // com.bytedance.lynx.hybrid.service.AbstractC21364e
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo34707a(android.content.Context r7, com.bytedance.lynx.hybrid.p1515a.AbstractC21154h r8, com.bytedance.lynx.hybrid.p1515a.C21160n r9) {
        /*
        // Method dump skipped, instructions count: 157
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lynx.hybrid.C21145a.mo34707a(android.content.Context, com.bytedance.lynx.hybrid.a.h, com.bytedance.lynx.hybrid.a.n):void");
    }
}
