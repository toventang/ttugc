package com.bytedance.ies.web.jsbridge2;

import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.web.jsbridge2.AbstractC18334e;
import com.bytedance.ies.web.jsbridge2.AbstractC18347m;
import com.bytedance.ies.web.jsbridge2.C18309ac;
import com.bytedance.ies.web.jsbridge2.TimeLineEvent;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ies.web.jsbridge2.w */
public class C18364w {

    /* renamed from: a */
    public static volatile C18315ad f43928a;

    /* renamed from: f */
    public static List<TimeLineEvent> f43929f = new CopyOnWriteArrayList();

    /* renamed from: g */
    static AbstractC18366a f43930g;

    /* renamed from: j */
    private static final Object f43931j = new Object();

    /* renamed from: b */
    public final AbstractC18329b f43932b;

    /* renamed from: c */
    public final WebView f43933c;

    /* renamed from: d */
    public AbstractC18360t f43934d;

    /* renamed from: e */
    public volatile boolean f43935e = false;

    /* renamed from: h */
    private final C18345k f43936h;

    /* renamed from: i */
    private final List<AbstractC18358r> f43937i;

    /* renamed from: com.bytedance.ies.web.jsbridge2.w$a */
    public interface AbstractC18366a {
        static {
            Covode.recordClassIndex(21038);
        }

        /* renamed from: a */
        boolean mo29406a(EnumC18325aj ajVar);
    }

    /* renamed from: com.bytedance.ies.web.jsbridge2.w$b */
    public interface AbstractC18367b {
        static {
            Covode.recordClassIndex(21039);
        }

        /* renamed from: a */
        void mo29407a();
    }

    /* renamed from: a */
    public final <T> void mo29404a(String str, T t) {
        m34184b();
        this.f43932b.mo29337a(str, (Object) t);
    }

    /* renamed from: b */
    private void m34184b() {
        if (this.f43935e) {
            C18344j.m34123a((RuntimeException) new IllegalStateException("JsBridge2 is already released!!!"));
        }
    }

    static {
        Covode.recordClassIndex(21036);
    }

    /* renamed from: a */
    public final void mo29403a() {
        if (!this.f43935e) {
            this.f43932b.mo29330c();
            this.f43935e = true;
            for (AbstractC18358r rVar : this.f43937i) {
                if (rVar != null) {
                    rVar.mo29393a();
                }
            }
        }
    }

    /* renamed from: a */
    public static C18345k m34179a(WebView webView) {
        return new C18345k(webView);
    }

    /* renamed from: a */
    public static C18345k m34180a(C18364w wVar) {
        C18345k kVar = new C18345k(wVar.f43936h);
        kVar.f43899o = true;
        kVar.f43893i = false;
        return kVar;
    }

    C18364w(C18345k kVar) {
        C18309ac acVar;
        ArrayList arrayList = new ArrayList();
        this.f43937i = arrayList;
        boolean z = false;
        this.f43936h = kVar;
        new TimeLineEvent.C18302a().mo29301a(TimeLineEvent.C18303b.f43772u, Boolean.valueOf(kVar.f43893i)).mo29301a(TimeLineEvent.C18303b.f43690F, Boolean.valueOf(f43928a != null ? true : z)).mo29302a(TimeLineEvent.C18303b.f43737ak, kVar.f43903s);
        if (!kVar.f43893i || f43928a == null) {
            acVar = null;
        } else {
            acVar = f43928a.mo29318a(kVar.f43896l, kVar.f43903s);
        }
        if (kVar.f43885a != null) {
            C18327al alVar = new C18327al();
            this.f43932b = alVar;
            alVar.mo29334a(kVar, acVar);
        } else {
            AbstractC18329b bVar = kVar.f43887c;
            this.f43932b = bVar;
            bVar.mo29334a(kVar, acVar);
        }
        this.f43933c = kVar.f43885a;
        arrayList.add(kVar.f43895k);
        C18344j.f43884a = kVar.f43891g;
        C18324ai.f43830a = kVar.f43892h;
    }

    /* renamed from: a */
    public final C18364w mo29400a(String str, AbstractC18334e.AbstractC18336b bVar) {
        m34184b();
        this.f43932b.f43850l.mo29360a(str, bVar);
        AbstractC18360t tVar = this.f43934d;
        if (tVar != null) {
            tVar.mo29395a(str);
        }
        return this;
    }

    /* renamed from: b */
    public final C18364w mo29405b(String str, AbstractC18337f<?, ?> fVar) {
        m34184b();
        this.f43932b.f43850l.mo29361a(str, fVar);
        AbstractC18360t tVar = this.f43934d;
        if (tVar != null) {
            tVar.mo29395a(str);
        }
        return this;
    }

    /* renamed from: a */
    public final C18364w mo29401a(String str, AbstractC18337f<?, ?> fVar) {
        return mo29405b(str, fVar);
    }

    /* renamed from: a */
    private static void m34182a(C18309ac acVar, Set<String> set) {
        if (acVar != null) {
            Map<String, List<C18309ac.C18313b>> map = acVar.f43791a;
            if (!map.isEmpty()) {
                for (Map.Entry<String, List<C18309ac.C18313b>> entry : map.entrySet()) {
                    Iterator<C18309ac.C18313b> it = entry.getValue().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (it.next().f43802b != EnumC18323ah.PUBLIC) {
                                set.add(entry.getKey());
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final C18364w mo29402a(String str, final C18364w wVar) {
        AbstractC18360t tVar;
        this.f43932b.mo29336a(str, wVar.f43932b.f43850l);
        AbstractC18360t tVar2 = this.f43934d;
        if (!(tVar2 == null || (tVar = wVar.f43934d) == null)) {
            tVar2.mo29394a(tVar);
        }
        this.f43937i.add(new AbstractC18358r() {
            /* class com.bytedance.ies.web.jsbridge2.C18364w.C183651 */

            static {
                Covode.recordClassIndex(21037);
            }

            @Override // com.bytedance.ies.web.jsbridge2.AbstractC18358r
            /* renamed from: a */
            public final void mo29393a() {
                wVar.mo29403a();
            }
        });
        return this;
    }

    /* renamed from: a */
    public static Set<String> m34181a(List<String> list, AbstractC18347m.AbstractC18348a aVar, String str) {
        String concat;
        if (list == null || list.isEmpty()) {
            return null;
        }
        HashSet hashSet = new HashSet();
        if (f43928a != null) {
            for (String str2 : list) {
                m34182a(f43928a.mo29318a(str2, null), hashSet);
            }
        }
        if (hashSet.isEmpty() && !TextUtils.isEmpty(str)) {
            try {
                String a = aVar.mo29390a("com.bytedance.ies.web.jsbridge2.PermissionConfigRepository.permission_config_response", "");
                if (a != null && !a.isEmpty()) {
                    JSONArray jSONArray = new JSONObject(a).getJSONObject("data").getJSONObject("packages").getJSONArray(str);
                    for (String str3 : list) {
                        for (int i = 0; i < jSONArray.length(); i++) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i);
                            String string = jSONObject.getString("channel");
                            if ("host".equals(str3)) {
                                concat = "_jsb_auth";
                            } else {
                                concat = "_jsb_auth.".concat(String.valueOf(str3));
                            }
                            if (string.equals(concat)) {
                                Iterator<String> keys = jSONObject.getJSONObject("content").keys();
                                while (keys.hasNext()) {
                                    hashSet.add(keys.next());
                                }
                            }
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }
        return hashSet;
    }

    /* renamed from: a */
    public static void m34183a(boolean z, AbstractC18347m mVar, AbstractC18367b bVar, AbstractC18366a aVar) {
        MethodCollector.m26663i(8704);
        f43930g = aVar;
        if (f43928a == null) {
            synchronized (f43931j) {
                try {
                    if (f43928a == null) {
                        f43928a = new C18315ad(mVar);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(8704);
                    throw th;
                }
            }
        }
        if (z) {
            C18315ad adVar = f43928a;
            new TimeLineEvent.C18302a().mo29301a(TimeLineEvent.C18303b.f43689E, (Object) true).mo29302a(TimeLineEvent.C18303b.f43727aa, f43929f);
            String jSONObject = adVar.mo29319a().toString();
            adVar.f43809b.mo29380a(adVar.f43811d, "application/json", jSONObject.getBytes(), 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0053: INVOKE  
                  (wrap: com.bytedance.ies.web.jsbridge2.m : 0x0044: IGET  (r4v0 com.bytedance.ies.web.jsbridge2.m) = (r6v0 'adVar' com.bytedance.ies.web.jsbridge2.ad) com.bytedance.ies.web.jsbridge2.ad.b com.bytedance.ies.web.jsbridge2.m)
                  (wrap: java.lang.String : 0x0046: IGET  (r3v0 java.lang.String) = (r6v0 'adVar' com.bytedance.ies.web.jsbridge2.ad) com.bytedance.ies.web.jsbridge2.ad.d java.lang.String)
                  ("application/json")
                  (wrap: byte[] : 0x004a: INVOKE  (r1v2 byte[]) = (r5v0 'jSONObject' java.lang.String) type: VIRTUAL call: java.lang.String.getBytes():byte[])
                  (wrap: com.bytedance.ies.web.jsbridge2.ad$1 : 0x0050: CONSTRUCTOR  (r0v6 com.bytedance.ies.web.jsbridge2.ad$1) = 
                  (r6v0 'adVar' com.bytedance.ies.web.jsbridge2.ad)
                  (r10v0 'bVar' com.bytedance.ies.web.jsbridge2.w$b)
                  (r5v0 'jSONObject' java.lang.String)
                 call: com.bytedance.ies.web.jsbridge2.ad.1.<init>(com.bytedance.ies.web.jsbridge2.ad, com.bytedance.ies.web.jsbridge2.w$b, java.lang.String):void type: CONSTRUCTOR)
                 type: INTERFACE call: com.bytedance.ies.web.jsbridge2.m.a(java.lang.String, java.lang.String, byte[], com.bytedance.ies.web.jsbridge2.m$b):void in method: com.bytedance.ies.web.jsbridge2.w.a(boolean, com.bytedance.ies.web.jsbridge2.m, com.bytedance.ies.web.jsbridge2.w$b, com.bytedance.ies.web.jsbridge2.w$a):void, file: classes6.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
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
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0050: CONSTRUCTOR  (r0v6 com.bytedance.ies.web.jsbridge2.ad$1) = 
                  (r6v0 'adVar' com.bytedance.ies.web.jsbridge2.ad)
                  (r10v0 'bVar' com.bytedance.ies.web.jsbridge2.w$b)
                  (r5v0 'jSONObject' java.lang.String)
                 call: com.bytedance.ies.web.jsbridge2.ad.1.<init>(com.bytedance.ies.web.jsbridge2.ad, com.bytedance.ies.web.jsbridge2.w$b, java.lang.String):void type: CONSTRUCTOR in method: com.bytedance.ies.web.jsbridge2.w.a(boolean, com.bytedance.ies.web.jsbridge2.m, com.bytedance.ies.web.jsbridge2.w$b, com.bytedance.ies.web.jsbridge2.w$a):void, file: classes6.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 21 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.ies.web.jsbridge2.ad, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 27 more
                */
            /*
                r7 = 8704(0x2200, float:1.2197E-41)
                com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r7)
                com.bytedance.ies.web.jsbridge2.C18364w.f43930g = r11
                com.bytedance.ies.web.jsbridge2.ad r0 = com.bytedance.ies.web.jsbridge2.C18364w.f43928a
                if (r0 != 0) goto L_0x0021
                java.lang.Object r1 = com.bytedance.ies.web.jsbridge2.C18364w.f43931j
                monitor-enter(r1)
                com.bytedance.ies.web.jsbridge2.ad r0 = com.bytedance.ies.web.jsbridge2.C18364w.f43928a     // Catch:{ all -> 0x001b }
                if (r0 != 0) goto L_0x0019
                com.bytedance.ies.web.jsbridge2.ad r0 = new com.bytedance.ies.web.jsbridge2.ad     // Catch:{ all -> 0x001b }
                r0.<init>(r9)     // Catch:{ all -> 0x001b }
                com.bytedance.ies.web.jsbridge2.C18364w.f43928a = r0     // Catch:{ all -> 0x001b }
            L_0x0019:
                monitor-exit(r1)     // Catch:{ all -> 0x001b }
                goto L_0x0021
            L_0x001b:
                r0 = move-exception
                monitor-exit(r1)
                com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r7)
                throw r0
            L_0x0021:
                if (r8 == 0) goto L_0x005a
                com.bytedance.ies.web.jsbridge2.ad r6 = com.bytedance.ies.web.jsbridge2.C18364w.f43928a
                com.bytedance.ies.web.jsbridge2.TimeLineEvent$a r2 = new com.bytedance.ies.web.jsbridge2.TimeLineEvent$a
                r2.<init>()
                java.lang.String r1 = com.bytedance.ies.web.jsbridge2.TimeLineEvent.C18303b.f43689E
                r0 = 1
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                com.bytedance.ies.web.jsbridge2.TimeLineEvent$a r2 = r2.mo29301a(r1, r0)
                java.lang.String r1 = com.bytedance.ies.web.jsbridge2.TimeLineEvent.C18303b.f43727aa
                java.util.List<com.bytedance.ies.web.jsbridge2.TimeLineEvent> r0 = com.bytedance.ies.web.jsbridge2.C18364w.f43929f
                r2.mo29302a(r1, r0)
                org.json.JSONObject r0 = r6.mo29319a()
                java.lang.String r5 = r0.toString()
                com.bytedance.ies.web.jsbridge2.m r4 = r6.f43809b
                java.lang.String r3 = r6.f43811d
                java.lang.String r2 = "application/json"
                byte[] r1 = r5.getBytes()
                com.bytedance.ies.web.jsbridge2.ad$1 r0 = new com.bytedance.ies.web.jsbridge2.ad$1
                r0.<init>(r10, r5)
                r4.mo29380a(r3, r2, r1, r0)
                com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r7)
                return
            L_0x005a:
                com.bytedance.ies.web.jsbridge2.ad r0 = com.bytedance.ies.web.jsbridge2.C18364w.f43928a
                r0.mo29321a(r10)
                com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.web.jsbridge2.C18364w.m34183a(boolean, com.bytedance.ies.web.jsbridge2.m, com.bytedance.ies.web.jsbridge2.w$b, com.bytedance.ies.web.jsbridge2.w$a):void");
        }
    }
