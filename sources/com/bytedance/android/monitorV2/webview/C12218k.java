package com.bytedance.android.monitorV2.webview;

import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.android.monitorV2.p728a.AbstractC12070e;
import com.bytedance.android.monitorV2.p728a.AbstractC12071f;
import com.bytedance.android.monitorV2.p731d.C12081a;
import com.bytedance.android.monitorV2.p731d.C12082b;
import com.bytedance.android.monitorV2.p733f.C12093a;
import com.bytedance.android.monitorV2.p737i.C12115b;
import com.bytedance.android.monitorV2.p740l.C12130f;
import com.bytedance.android.monitorV2.webview.p749c.p750a.AbstractC12199a;
import com.bytedance.android.monitorV2.webview.p749c.p750a.AbstractC12200b;
import com.bytedance.android.monitorV2.webview.p749c.p750a.AbstractC12201c;
import com.bytedance.android.monitorV2.webview.p749c.p751b.C12204b;
import com.bytedance.android.monitorV2.webview.p749c.p751b.C12206c;
import com.bytedance.covode.number.Covode;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.monitorV2.webview.k */
public final class C12218k {

    /* renamed from: a */
    public C12204b f29406a;

    /* renamed from: b */
    public C12234o f29407b;

    /* renamed from: c */
    Map<String, AbstractC12200b> f29408c = new HashMap();

    /* renamed from: d */
    public C12081a f29409d;

    /* renamed from: e */
    private C12206c f29410e;

    static {
        Covode.recordClassIndex(13949);
    }

    /* renamed from: a */
    public final void mo19652a(JSONObject jSONObject) {
        C12204b bVar = this.f29406a;
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            C12130f.m21651a(bVar.f29350o, next, C12130f.m21659e(jSONObject, next));
        }
    }

    /* renamed from: b */
    public final void mo19653b() {
        mo19645a().f29359i = System.currentTimeMillis();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C12206c mo19645a() {
        if (this.f29410e == null) {
            this.f29410e = new C12206c(this.f29406a, "perf");
        }
        return this.f29410e;
    }

    /* renamed from: b */
    public final boolean mo19654b(String str) {
        if (!mo19645a().f29364n.contains(str)) {
            return true;
        }
        if ("blank".equals(str) || "performance".equals(str) || "resource_performance".equals(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo19646a(WebView webView) {
        C12206c a = mo19645a();
        m21863a(webView, a);
        mo19645a().mo19592l();
        C12093a.m21524a(new Runnable(webView, a) {
            /* class com.bytedance.android.monitorV2.webview.C12234o.RunnableC122351 */

            /* renamed from: a */
            final /* synthetic */ WebView f29484a;

            /* renamed from: b */
            final /* synthetic */ AbstractC12201c f29485b;

            static {
                Covode.recordClassIndex(13966);
            }

            public final void run() {
                List<Object> list = C12234o.this.f29482l.get(this.f29484a);
                if (list != null) {
                    Iterator<Object> it = list.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                }
            }

            {
                this.f29484a = r2;
                this.f29485b = r3;
            }
        });
    }

    /* renamed from: a */
    public final void mo19649a(C12081a aVar) {
        this.f29409d = aVar;
        mo19645a().f29342f = aVar;
        for (AbstractC12200b bVar : this.f29408c.values()) {
            if (bVar instanceof AbstractC12201c) {
                ((AbstractC12201c) bVar).f29342f = aVar;
            }
        }
    }

    /* renamed from: a */
    public final void mo19650a(String str) {
        C12206c a = mo19645a();
        if (!TextUtils.isEmpty(str)) {
            C12130f.m21649a(a.f29363m, str, C12130f.m21647a(a.f29363m, str) + 1);
            a.f29364n.add(str);
            C12115b.m21581a("WebPerfReportData", "addCount: ".concat(String.valueOf(str)));
        }
    }

    /* renamed from: a */
    public final void mo19651a(Map<String, Integer> map) {
        if (map != null) {
            for (String str : map.keySet()) {
                int intValue = map.get(str).intValue();
                C12204b bVar = this.f29406a;
                C12130f.m21651a(bVar.f29351p, str, Integer.valueOf(intValue));
            }
        }
    }

    /* renamed from: a */
    public static void m21863a(WebView webView, AbstractC12201c cVar) {
        AbstractC12070e i;
        if (webView != null && cVar != null && cVar.mo19591k() && (i = C12230n.f29449b.mo19637i(webView)) != null) {
            i.mo19421a(cVar);
        }
    }

    /* renamed from: a */
    public final void mo19647a(WebView webView, String str, JSONObject jSONObject) {
        mo19648a(webView, str, jSONObject, null, null);
    }

    /* renamed from: a */
    public final void mo19648a(WebView webView, final String str, JSONObject jSONObject, final JSONObject jSONObject2, final C12082b bVar) {
        C122191 r1 = new AbstractC12201c(this.f29406a, "web", str) {
            /* class com.bytedance.android.monitorV2.webview.C12218k.C122191 */

            static {
                Covode.recordClassIndex(13950);
            }

            @Override // com.bytedance.android.monitorV2.p728a.AbstractC12072g
            /* renamed from: f */
            public final AbstractC12071f mo19425f() {
                return bVar;
            }

            @Override // com.bytedance.android.monitorV2.webview.p749c.p750a.AbstractC12201c
            /* renamed from: j */
            public final AbstractC12199a mo19424e() {
                if (jSONObject2 == null) {
                    return null;
                }
                return new AbstractC12199a(str) {
                    /* class com.bytedance.android.monitorV2.webview.C12218k.C122191.C122201 */

                    static {
                        Covode.recordClassIndex(13951);
                    }

                    @Override // com.bytedance.android.monitorV2.webview.p749c.p750a.AbstractC12199a
                    /* renamed from: b */
                    public final void mo19590b() {
                    }

                    @Override // com.bytedance.android.monitorV2.p728a.AbstractC12066a
                    /* renamed from: a */
                    public final void mo19417a(JSONObject jSONObject) {
                        C12130f.m21653a(jSONObject, jSONObject2);
                    }

                    {
                        this.f29336c = true;
                    }
                };
            }
        };
        r1.f29342f = this.f29409d;
        r1.mo19593a(jSONObject);
        m21863a(webView, r1);
    }

    C12218k(WebView webView, String str, String str2, String str3, long j, long j2, JSONObject jSONObject) {
        C12204b bVar = new C12204b();
        this.f29406a = bVar;
        SoftReference<WebView> softReference = new SoftReference<>(webView);
        bVar.f29346k = softReference;
        C12093a.m21524a(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001d: INVOKE  
              (wrap: com.bytedance.android.monitorV2.webview.c.b.b$1 : 0x001a: CONSTRUCTOR  (r0v1 com.bytedance.android.monitorV2.webview.c.b.b$1) = (r3v0 'bVar' com.bytedance.android.monitorV2.webview.c.b.b) call: com.bytedance.android.monitorV2.webview.c.b.b.1.<init>(com.bytedance.android.monitorV2.webview.c.b.b):void type: CONSTRUCTOR)
             type: STATIC call: com.bytedance.android.monitorV2.f.a.a(java.lang.Runnable):void in method: com.bytedance.android.monitorV2.webview.k.<init>(android.webkit.WebView, java.lang.String, java.lang.String, java.lang.String, long, long, org.json.JSONObject):void, file: classes10.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
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
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001a: CONSTRUCTOR  (r0v1 com.bytedance.android.monitorV2.webview.c.b.b$1) = (r3v0 'bVar' com.bytedance.android.monitorV2.webview.c.b.b) call: com.bytedance.android.monitorV2.webview.c.b.b.1.<init>(com.bytedance.android.monitorV2.webview.c.b.b):void type: CONSTRUCTOR in method: com.bytedance.android.monitorV2.webview.k.<init>(android.webkit.WebView, java.lang.String, java.lang.String, java.lang.String, long, long, org.json.JSONObject):void, file: classes10.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 14 more
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.android.monitorV2.webview.c.b.b, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 20 more
            */
        /*
        // Method dump skipped, instructions count: 107
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.monitorV2.webview.C12218k.<init>(android.webkit.WebView, java.lang.String, java.lang.String, java.lang.String, long, long, org.json.JSONObject):void");
    }
}
