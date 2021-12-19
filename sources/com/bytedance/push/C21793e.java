package com.bytedance.push;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.p1588a.C21758a;
import com.bytedance.push.p1590c.AbstractC21777h;
import com.bytedance.push.p1591d.C21789a;
import com.bytedance.push.p1597h.C21835a;
import com.bytedance.push.p1598i.RunnableC21844g;
import com.bytedance.push.p1599j.C21849b;
import com.bytedance.push.p1600k.C21856b;
import com.bytedance.push.third.PushManager;
import com.p2082ss.android.message.C30061a;
import com.p2082ss.android.message.C30066d;
import com.p2082ss.android.message.p2159a.C30062a;
import com.p2082ss.android.p2203ug.bus.C30980b;
import com.p2082ss.android.pushmanager.C30205a;
import com.p2082ss.android.pushmanager.p2172a.C30209b;
import com.p2082ss.android.pushmanager.p2173b.C30213a;
import com.p2082ss.android.pushmanager.setting.C30220a;
import com.p2082ss.android.pushmanager.setting.C30221b;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.bytedance.push.e */
public final class C21793e implements AbstractC21777h {

    /* renamed from: a */
    private C21767c f51638a;

    /* renamed from: b */
    private AtomicBoolean f51639b = new AtomicBoolean(false);

    /* renamed from: c */
    private AtomicBoolean f51640c = new AtomicBoolean(false);

    static {
        Covode.recordClassIndex(25442);
    }

    @Override // com.bytedance.push.p1590c.AbstractC21777h
    /* renamed from: a */
    public final void mo35436a(C21767c cVar) {
        if (!this.f51639b.getAndSet(true)) {
            this.f51638a = cVar;
            C21856b.f51776a = cVar.f51586f;
            if (!TextUtils.isEmpty(cVar.f51594n)) {
                C30205a.f72047a = cVar.f51594n;
            }
            C30062a.f71750a = this.f51638a.f51588h;
            C30061a.m60799a(this.f51638a.f51581a);
            C21835a aVar = new C21835a(this.f51638a);
            C21798f.f51646a.mo35446a(cVar, aVar);
            C21789a aVar2 = new C21789a(this.f51638a);
            C30980b.m63695a(C30209b.AbstractC30210a.class, 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0043: INVOKE  
                  (wrap: java.lang.Class : 0x003c: CONST_CLASS   com.ss.android.pushmanager.a.b$a.class)
                  (wrap: com.bytedance.push.d.b$1 : 0x0040: CONSTRUCTOR  (r0v12 com.bytedance.push.d.b$1) = (r5v0 'cVar' com.bytedance.push.c) call: com.bytedance.push.d.b.1.<init>(com.bytedance.push.c):void type: CONSTRUCTOR)
                 type: STATIC call: com.ss.android.ug.bus.b.a(java.lang.Class, com.ss.android.ug.bus.a):void in method: com.bytedance.push.e.a(com.bytedance.push.c):void, file: classes2.dex
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
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0040: CONSTRUCTOR  (r0v12 com.bytedance.push.d.b$1) = (r5v0 'cVar' com.bytedance.push.c) call: com.bytedance.push.d.b.1.<init>(com.bytedance.push.c):void type: CONSTRUCTOR in method: com.bytedance.push.e.a(com.bytedance.push.c):void, file: classes2.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 21 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.push.d.b, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 27 more
                */
            /*
            // Method dump skipped, instructions count: 198
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.push.C21793e.mo35436a(com.bytedance.push.c):void");
        }

        @Override // com.bytedance.push.p1590c.AbstractC21777h
        /* renamed from: a */
        public final void mo35437a(Map<String, String> map) {
            final Application application = this.f51638a.f51581a;
            if (C30062a.m60803a(application)) {
                new StringBuilder("ssidsMap = [").append(map).append("] forceUpdate = false");
                if (map != null && !map.isEmpty()) {
                    String str = map.get("device_id");
                    String str2 = map.get("install_id");
                    if (!C13627m.m24498a(map.get("clientudid")) && !C13627m.m24498a(str) && !C13627m.m24498a(str2)) {
                        C30221b.m61148b();
                        C30220a a = C30220a.m61144a();
                        Logger.debug();
                        try {
                            a.f72080a.mo53660a().mo53656a("ssids", C13627m.m24496a(map)).mo53657a();
                        } catch (Exception unused) {
                        }
                        final C21798f fVar = C21798f.f51646a;
                        if (this.f51640c.compareAndSet(false, true)) {
                            C21758a.m40727a(this.f51638a.f51581a).mo35395b();
                            if (C21856b.f51776a) {
                                if (!PushManager.inst().checkThirdPushConfig("BDPush", this.f51638a.f51581a)) {
                                    throw new IllegalArgumentException("configuration error，please filter \"BDPush\" in logcat to correct the error");
                                }
                            }
                            C30066d.m60817a().mo53432a(new Runnable() {
                                /* class com.bytedance.push.C21793e.RunnableC217952 */

                                static {
                                    Covode.recordClassIndex(25444);
                                }

                                public final void run() {
                                    Context context = application;
                                    if (C30062a.m60803a(context)) {
                                        C30213a.m61113a(context);
                                    }
                                    try {
                                        C30221b.m61148b();
                                        String a = C30221b.m61153g().mo35595a();
                                        if (!C13627m.m24498a(a)) {
                                            C21798f.m40814b();
                                            new JSONObject(a);
                                            C30221b.m61148b();
                                            C30221b.m61153g().mo35596a("");
                                        }
                                    } catch (Throwable unused) {
                                    }
                                }
                            }, TimeUnit.SECONDS.toMillis(15));
                            fVar.mo35449f().mo35431a(application, this.f51638a.f51590j);
                            C30066d.m60817a().mo53432a(new Runnable() {
                                /* class com.bytedance.push.C21793e.RunnableC217941 */

                                static {
                                    Covode.recordClassIndex(25443);
                                }

                                public final void run() {
                                    fVar.mo35449f().mo35430a(application);
                                }
                            }, TimeUnit.SECONDS.toMillis(15));
                            C21849b bVar = new C21849b(fVar, this.f51638a.f51604x);
                            bVar.f51762b.mo35416c(
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00d8: INVOKE  
                                  (wrap: com.bytedance.push.c.b : 0x00d1: IGET  (r1v5 com.bytedance.push.c.b) = (r3v3 'bVar' com.bytedance.push.j.b) com.bytedance.push.j.b.b com.bytedance.push.c.b)
                                  (wrap: com.bytedance.push.j.b$1 : 0x00d5: CONSTRUCTOR  (r0v29 com.bytedance.push.j.b$1) = (r3v3 'bVar' com.bytedance.push.j.b) call: com.bytedance.push.j.b.1.<init>(com.bytedance.push.j.b):void type: CONSTRUCTOR)
                                 type: INTERFACE call: com.bytedance.push.c.b.c(com.ss.android.ug.bus.c$a):void in method: com.bytedance.push.e.a(java.util.Map<java.lang.String, java.lang.String>):void, file: classes2.dex
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
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
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
                                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00d5: CONSTRUCTOR  (r0v29 com.bytedance.push.j.b$1) = (r3v3 'bVar' com.bytedance.push.j.b) call: com.bytedance.push.j.b.1.<init>(com.bytedance.push.j.b):void type: CONSTRUCTOR in method: com.bytedance.push.e.a(java.util.Map<java.lang.String, java.lang.String>):void, file: classes2.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                                	... 40 more
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.push.j.b, state: GENERATED_AND_UNLOADED
                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                                	... 46 more
                                */
                            /*
                            // Method dump skipped, instructions count: 270
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.push.C21793e.mo35437a(java.util.Map):void");
                        }

                        @Override // com.bytedance.push.p1590c.AbstractC21777h
                        /* renamed from: a */
                        public final void mo35435a(Context context, JSONObject jSONObject) {
                            new RunnableC21844g(context, jSONObject, this.f51638a.f51603w).run();
                        }
                    }
