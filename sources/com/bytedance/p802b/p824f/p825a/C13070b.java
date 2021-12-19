package com.bytedance.p802b.p824f.p825a;

import com.bytedance.covode.number.Covode;
import com.bytedance.p802b.p813c.p814a.C12983b;
import com.bytedance.p802b.p813c.p814a.C12989d;
import com.bytedance.p802b.p813c.p814a.C12994f;
import com.bytedance.p802b.p813c.p815b.AbstractC13000b;
import com.bytedance.p802b.p813c.p815b.C12999a;
import com.bytedance.p802b.p813c.p815b.C13001c;
import com.bytedance.p802b.p824f.p825a.p826a.AbstractC13069b;
import com.bytedance.p802b.p824f.p825a.p826a.C13065a;
import com.bytedance.p802b.p831i.p832a.C13096a;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.bytedance.b.f.a.b */
public final class C13070b implements AbstractC13000b {

    /* renamed from: a */
    C12999a f31869a;

    /* renamed from: b */
    C13001c f31870b;

    static {
        Covode.recordClassIndex(14906);
    }

    public C13070b() {
        C13065a.m23491a().mo20920b();
        C13065a.m23491a().mo20918a(new AbstractC13069b() {
            /* class com.bytedance.p802b.p824f.p825a.C13070b.C130711 */

            static {
                Covode.recordClassIndex(14907);
            }

            @Override // com.bytedance.p802b.p824f.p825a.p826a.AbstractC13069b
            /* renamed from: a */
            public final void mo20917a(JSONObject jSONObject) {
                boolean z;
                boolean z2;
                boolean z3;
                boolean z4;
                C13070b bVar = C13070b.this;
                if (jSONObject != null) {
                    JSONObject a = C13096a.m23549a(jSONObject, "cpu");
                    if (a != null) {
                        bVar.f31869a = new C12999a();
                        if (a.optInt("enable_upload", 0) == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        bVar.f31869a.f31669d = z;
                        long optLong = a.optLong("front_collect_interval", 0);
                        if (optLong > 0) {
                            bVar.f31869a.f31666a = optLong;
                        }
                        long optLong2 = a.optLong("back_collect_interval", 0);
                        if (optLong2 > 0) {
                            bVar.f31869a.f31667b = optLong2;
                        }
                        long optLong3 = a.optLong("monitor_interval", 0);
                        if (optLong3 > 0) {
                            bVar.f31869a.f31668c = optLong3;
                        }
                        bVar.f31870b = new C13001c();
                        if (a.optInt("exception_switch", 0) == 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        bVar.f31870b.f31670a = z2;
                        double optDouble = a.optDouble("exception_process_back_max_speed", 0.0d);
                        if (optDouble > 0.0d) {
                            bVar.f31870b.f31672c = optDouble;
                        }
                        double optDouble2 = a.optDouble("exception_process_fore_max_speed", 0.0d);
                        if (optDouble > 0.0d) {
                            bVar.f31870b.f31673d = optDouble2;
                        }
                        if (a.optInt("main_thread_collect_enabled", 0) == 1) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        bVar.f31870b.f31671b = z3;
                        if (a.optInt("exception_collect_all_process", 0) == 1) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        bVar.f31870b.f31675f = z4;
                        double optDouble3 = a.optDouble("exception_thread_max_usage", 0.0d);
                        if (optDouble3 > 0.0d) {
                            bVar.f31870b.f31674e = optDouble3;
                        }
                        JSONObject optJSONObject = a.optJSONObject("exception_fore_max_speed_scene");
                        HashMap hashMap = new HashMap();
                        if (optJSONObject != null) {
                            Iterator<String> keys = optJSONObject.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                double optDouble4 = optJSONObject.optDouble(next, 0.0d);
                                if (optDouble4 > 0.0d) {
                                    hashMap.put(next, Double.valueOf(optDouble4));
                                }
                            }
                        }
                        bVar.f31870b.f31677h = hashMap;
                        JSONObject optJSONObject2 = a.optJSONObject("exception_back_max_speed_scene");
                        HashMap hashMap2 = new HashMap();
                        if (optJSONObject2 != null) {
                            Iterator<String> keys2 = optJSONObject2.keys();
                            while (keys2.hasNext()) {
                                String next2 = keys2.next();
                                double optDouble5 = optJSONObject2.optDouble(next2, 0.0d);
                                if (optDouble5 > 0.0d) {
                                    hashMap2.put(next2, Double.valueOf(optDouble5));
                                }
                            }
                        }
                        bVar.f31870b.f31676g = hashMap2;
                    }
                    C12983b bVar2 = C12983b.C12986a.f31626a;
                    C12999a aVar = bVar.f31869a;
                    if (aVar != null) {
                        C12994f.m23321a();
                        C12989d dVar = bVar2.f31618b;
                        if (dVar.f31635b.compareAndSet(false, true)) {
                            dVar.f31639f = aVar;
                            dVar.f31636c = 
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x012d: IPUT  
                                  (wrap: com.bytedance.b.c.a.d$1 : 0x012a: CONSTRUCTOR  (r0v10 com.bytedance.b.c.a.d$1) = (r3v0 'dVar' com.bytedance.b.c.a.d) call: com.bytedance.b.c.a.d.1.<init>(com.bytedance.b.c.a.d):void type: CONSTRUCTOR)
                                  (r3v0 'dVar' com.bytedance.b.c.a.d)
                                 com.bytedance.b.c.a.d.c com.bytedance.b.k.d.a in method: com.bytedance.b.f.a.b.1.a(org.json.JSONObject):void, file: classes.dex
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
                                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x012a: CONSTRUCTOR  (r0v10 com.bytedance.b.c.a.d$1) = (r3v0 'dVar' com.bytedance.b.c.a.d) call: com.bytedance.b.c.a.d.1.<init>(com.bytedance.b.c.a.d):void type: CONSTRUCTOR in method: com.bytedance.b.f.a.b.1.a(org.json.JSONObject):void, file: classes.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:428)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                                	... 31 more
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.b.c.a.d, state: GENERATED_AND_UNLOADED
                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                                	... 35 more
                                */
                            /*
                            // Method dump skipped, instructions count: 368
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p802b.p824f.p825a.C13070b.C130711.mo20917a(org.json.JSONObject):void");
                        }
                    });
                }
            }
