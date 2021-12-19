package com.bytedance.android.monitor.webview;

import android.webkit.WebView;
import com.bytedance.android.monitor.p704b.AbstractC11911e;
import com.bytedance.android.monitor.p704b.AbstractC11912f;
import com.bytedance.android.monitor.p706d.C11917a;
import com.bytedance.android.monitor.p706d.C11918b;
import com.bytedance.android.monitor.p708f.C11929a;
import com.bytedance.android.monitor.p714l.C11950d;
import com.bytedance.android.monitor.webview.p723c.p724a.AbstractC12023a;
import com.bytedance.android.monitor.webview.p723c.p724a.AbstractC12024b;
import com.bytedance.android.monitor.webview.p723c.p724a.AbstractC12025c;
import com.bytedance.android.monitor.webview.p723c.p725b.C12028b;
import com.bytedance.android.monitor.webview.p723c.p725b.C12030c;
import com.bytedance.covode.number.Covode;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.monitor.webview.n */
public final class C12053n {

    /* renamed from: a */
    C12028b f28895a;

    /* renamed from: b */
    public C12056o f28896b;

    /* renamed from: c */
    Map<String, AbstractC12024b> f28897c = new HashMap();

    /* renamed from: d */
    private C12030c f28898d;

    /* renamed from: e */
    private C11917a f28899e;

    static {
        Covode.recordClassIndex(13781);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C12030c mo19342a() {
        if (this.f28898d == null) {
            this.f28898d = new C12030c(this.f28895a, "perf");
        }
        return this.f28898d;
    }

    /* renamed from: a */
    public final void mo19347a(String str) {
        mo19342a().mo19270a(str);
    }

    /* renamed from: b */
    public final boolean mo19350b(String str) {
        if (!mo19342a().f28822m.contains(str)) {
            return true;
        }
        if ("blank".equals(str) || "performance".equals(str) || "resource_performance".equals(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo19343a(WebView webView) {
        C12030c a = mo19342a();
        m21449a(webView, a);
        mo19342a().mo19264m();
        this.f28896b.mo19352a(webView, a);
    }

    /* renamed from: a */
    public final void mo19346a(C11917a aVar) {
        this.f28899e = aVar;
        mo19342a().f28801f = aVar;
        for (AbstractC12024b bVar : this.f28897c.values()) {
            if (bVar instanceof AbstractC12025c) {
                ((AbstractC12025c) bVar).f28801f = aVar;
            }
        }
    }

    /* renamed from: a */
    public final void mo19348a(Map<String, Integer> map) {
        if (map != null) {
            for (String str : map.keySet()) {
                int intValue = map.get(str).intValue();
                C12028b bVar = this.f28895a;
                C11950d.m21100a(bVar.f28809o, str, Integer.valueOf(intValue));
            }
        }
    }

    /* renamed from: a */
    public final void mo19349a(JSONObject jSONObject) {
        this.f28895a.mo19268b(jSONObject);
    }

    /* renamed from: a */
    public static void m21449a(WebView webView, AbstractC12025c cVar) {
        AbstractC11911e i;
        if (webView != null && cVar != null && cVar.mo19263l() && (i = C12044i.f28863b.mo19309i(webView)) != null) {
            i.mo19114a(cVar);
        }
    }

    /* renamed from: a */
    public final void mo19344a(WebView webView, String str, JSONObject jSONObject) {
        mo19345a(webView, str, jSONObject, null);
    }

    /* renamed from: a */
    public final void mo19345a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2) {
        C12028b bVar = this.f28895a;
        C120541 r1 = new AbstractC12025c(bVar, str, bVar.f28531c, jSONObject2, str, null) {
            /* class com.bytedance.android.monitor.webview.C12053n.C120541 */

            /* renamed from: a */
            final /* synthetic */ JSONObject f28900a;

            /* renamed from: b */
            final /* synthetic */ String f28901b;

            /* renamed from: c */
            final /* synthetic */ C11918b f28902c = null;

            static {
                Covode.recordClassIndex(13782);
            }

            @Override // com.bytedance.android.monitor.p704b.AbstractC11913g
            /* renamed from: f */
            public final AbstractC11912f mo19123f() {
                return this.f28902c;
            }

            @Override // com.bytedance.android.monitor.webview.p723c.p724a.AbstractC12025c
            /* renamed from: k */
            public final AbstractC12023a mo19122e() {
                if (this.f28900a == null) {
                    return null;
                }
                return new AbstractC12023a(this.f28901b) {
                    /* class com.bytedance.android.monitor.webview.C12053n.C120541.C120551 */

                    static {
                        Covode.recordClassIndex(13783);
                    }

                    @Override // com.bytedance.android.monitor.webview.p723c.p724a.AbstractC12023a
                    /* renamed from: b */
                    public final void mo19261b() {
                    }

                    @Override // com.bytedance.android.monitor.p704b.AbstractC11907a
                    /* renamed from: a */
                    public final void mo19117a(JSONObject jSONObject) {
                        C11950d.m21102a(jSONObject, C120541.this.f28900a);
                    }

                    {
                        this.f28795c = true;
                    }
                };
            }

            {
                this.f28900a = r6;
                this.f28901b = r7;
            }
        };
        r1.f28801f = this.f28899e;
        r1.mo19265b(jSONObject);
        m21449a(webView, r1);
    }

    C12053n(WebView webView, String str, String str2, String str3, long j, long j2, JSONObject jSONObject) {
        C12028b bVar = new C12028b();
        this.f28895a = bVar;
        SoftReference<WebView> softReference = new SoftReference<>(webView);
        bVar.f28806l = softReference;
        C11929a.m21042a(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001d: INVOKE  
              (wrap: com.bytedance.android.monitor.webview.c.b.b$1 : 0x001a: CONSTRUCTOR  (r0v1 com.bytedance.android.monitor.webview.c.b.b$1) = (r3v0 'bVar' com.bytedance.android.monitor.webview.c.b.b) call: com.bytedance.android.monitor.webview.c.b.b.1.<init>(com.bytedance.android.monitor.webview.c.b.b):void type: CONSTRUCTOR)
             type: STATIC call: com.bytedance.android.monitor.f.a.a(java.lang.Runnable):void in method: com.bytedance.android.monitor.webview.n.<init>(android.webkit.WebView, java.lang.String, java.lang.String, java.lang.String, long, long, org.json.JSONObject):void, file: classes10.dex
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
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001a: CONSTRUCTOR  (r0v1 com.bytedance.android.monitor.webview.c.b.b$1) = (r3v0 'bVar' com.bytedance.android.monitor.webview.c.b.b) call: com.bytedance.android.monitor.webview.c.b.b.1.<init>(com.bytedance.android.monitor.webview.c.b.b):void type: CONSTRUCTOR in method: com.bytedance.android.monitor.webview.n.<init>(android.webkit.WebView, java.lang.String, java.lang.String, java.lang.String, long, long, org.json.JSONObject):void, file: classes10.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 14 more
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.android.monitor.webview.c.b.b, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 20 more
            */
        /*
        // Method dump skipped, instructions count: 107
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.monitor.webview.C12053n.<init>(android.webkit.WebView, java.lang.String, java.lang.String, java.lang.String, long, long, org.json.JSONObject):void");
    }
}
