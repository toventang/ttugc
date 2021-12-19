package com.bytedance.p802b.p806b.p807a;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.apm.p771d.C12441a;
import com.bytedance.common.utility.C13624l;
import com.bytedance.covode.number.Covode;
import com.bytedance.p802b.p806b.p807a.C12937c;
import com.bytedance.p802b.p806b.p807a.C12948d;
import com.bytedance.p802b.p806b.p807a.p808a.C12928a;
import com.bytedance.p802b.p806b.p807a.p809b.C12931a;
import com.bytedance.p802b.p806b.p807a.p809b.C12932b;
import com.bytedance.p802b.p806b.p807a.p809b.C12933c;
import com.bytedance.p802b.p806b.p807a.p810c.C12945c;
import com.bytedance.p802b.p806b.p807a.p811d.C12957c;
import com.bytedance.p802b.p806b.p807a.p812e.C12972c;
import com.bytedance.p802b.p821e.p822a.C13037a;
import com.bytedance.p802b.p830h.AbstractC13094b;
import com.bytedance.p802b.p830h.AbstractC13095c;
import com.bytedance.p802b.p841k.C13113a;
import com.bytedance.p802b.p841k.C13129e;
import com.bytedance.p802b.p841k.C13131g;
import com.bytedance.p802b.p841k.C13132h;
import com.bytedance.p802b.p841k.p843b.C13118b;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: com.bytedance.b.b.a.e */
public final class C12969e implements AbstractC13095c {

    /* renamed from: a */
    public static volatile C12969e f31592a = new C12969e();

    /* renamed from: b */
    private C12945c f31593b;

    /* renamed from: c */
    private C12928a f31594c;

    /* renamed from: d */
    private volatile boolean f31595d;

    private C12969e() {
    }

    static {
        Covode.recordClassIndex(14805);
    }

    /* renamed from: a */
    private synchronized void m23289a() {
        String str;
        String str2;
        JSONObject a;
        if (!this.f31595d) {
            C12932b a2 = C12932b.m23210a();
            C12931a aVar = new C12931a();
            aVar.f31483j = "Android";
            aVar.f31484k = "android";
            aVar.f31485l = Build.VERSION.RELEASE;
            aVar.f31486m = Build.VERSION.SDK_INT;
            aVar.f31487n = Build.MODEL;
            aVar.f31488o = Build.BRAND;
            aVar.f31489p = Build.MANUFACTURER;
            aVar.f31490q = C13037a.m23436d();
            aVar.f31491r = C13037a.m23432a();
            if (!C13132h.f31978d || TextUtils.isEmpty(C13132h.f31979e)) {
                if (C13132h.m23617c()) {
                    if (C13132h.m23617c()) {
                        str = "miui_" + C13132h.m23613a("ro.miui.ui.version.name") + "_" + Build.VERSION.INCREMENTAL;
                    } else {
                        str = "";
                    }
                } else if (Build.DISPLAY.contains("Flyme") || "flyme".equals(Build.USER)) {
                    str = Build.DISPLAY;
                    if (str == null || !str.toLowerCase(Locale.getDefault()).contains("flyme")) {
                        str = "";
                    }
                } else if (!C13132h.m23614a()) {
                    if (Build.VERSION.SDK_INT >= 21) {
                        str2 = C13132h.m23613a("ro.build.version.emui");
                    } else {
                        str2 = C13132h.m23615b();
                    }
                    if (str2 == null || !str2.toLowerCase(Locale.getDefault()).contains("emotionui")) {
                        str = "";
                    } else {
                        str = str2 + "_" + Build.DISPLAY;
                    }
                    if (TextUtils.isEmpty(str)) {
                        String a3 = C13132h.m23613a("ro.vivo.os.build.display.id");
                        if (!TextUtils.isEmpty(a3) && a3.toLowerCase(Locale.getDefault()).contains(C13132h.f31976b)) {
                            str = C13132h.m23613a("ro.vivo.os.build.display.id") + "_" + C13132h.m23613a("ro.vivo.product.version");
                        } else if (TextUtils.isEmpty(Build.DISPLAY) || !Build.DISPLAY.toLowerCase(Locale.getDefault()).contains(C13132h.f31975a)) {
                            String str3 = Build.MANUFACTURER + Build.BRAND;
                            if (!TextUtils.isEmpty(str3)) {
                                String lowerCase = str3.toLowerCase(Locale.getDefault());
                                if (lowerCase.contains("360") || lowerCase.contains("qiku")) {
                                    str = C13132h.m23613a("ro.build.uiversion") + "_" + Build.DISPLAY;
                                }
                            }
                            if (!TextUtils.isEmpty(C13132h.m23613a("ro.letv.release.version"))) {
                                str = "eui_" + C13132h.m23613a("ro.letv.release.version") + "_" + Build.DISPLAY;
                            } else {
                                str = "";
                            }
                            if (TextUtils.isEmpty(str)) {
                                C13132h.f31978d = true;
                                str = Build.DISPLAY;
                            }
                        } else {
                            str = Build.DISPLAY + "_" + C13132h.m23613a("ro.gn.sv.version");
                        }
                    }
                } else if (C13132h.m23614a()) {
                    str = "coloros_" + C13132h.m23613a("ro.build.version.opporom") + "_" + Build.DISPLAY;
                } else {
                    str = "";
                }
                C13132h.f31979e = str;
            } else {
                str = C13132h.f31979e;
            }
            aVar.f31492s = str;
            aVar.f31497x = String.valueOf(C12975f.m23299a("release_build"));
            aVar.f31496w = C13037a.m23434b();
            aVar.f31476c = C13037a.m23438f();
            aVar.f31474a = C13037a.m23437e();
            aVar.f31495v = C13037a.m23448p();
            aVar.f31477d = String.valueOf(C13037a.m23439g());
            aVar.f31481h = C13037a.m23440h();
            aVar.f31480g = String.valueOf(C13037a.m23441i());
            aVar.f31478e = C13037a.m23442j();
            aVar.f31482i = C13037a.m23443k();
            aVar.f31493t = C13113a.f31955g.getPackageName();
            aVar.f31472B = aVar.f31477d;
            aVar.f31479f = C13037a.m23444l();
            aVar.f31473C = C13037a.f31822d;
            JSONObject jSONObject = new JSONObject();
            try {
                C13129e.m23601a(jSONObject, C13037a.m23445m());
                if (jSONObject.has("version_code")) {
                    jSONObject.remove("version_code");
                }
                if (jSONObject.has("app_version")) {
                    jSONObject.remove("app_version");
                }
                if (jSONObject.has("uid")) {
                    jSONObject.remove("uid");
                }
                if (jSONObject.has("update_version_code")) {
                    jSONObject.remove("update_version_code");
                }
                if (jSONObject.has("manifest_version_code")) {
                    jSONObject.remove("manifest_version_code");
                }
            } catch (Exception e) {
                C13118b.m23586a("APM", "header json exception" + e.toString());
            }
            aVar.f31499z = jSONObject;
            aVar.f31494u = "5.0.19.3-rc.31";
            if (C13037a.m23435c()) {
                C12933c cVar = C12933c.C12935a.f31506a;
                cVar.mo20781a();
                if (cVar.f31503a != null) {
                    cVar.f31503a.listFiles(
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0316: INVOKE  
                          (wrap: java.io.File : 0x030f: IGET  (r1v46 java.io.File) = (r2v25 'cVar' com.bytedance.b.b.a.b.c) com.bytedance.b.b.a.b.c.a java.io.File)
                          (wrap: com.bytedance.b.b.a.b.c$1 : 0x0313: CONSTRUCTOR  (r0v138 com.bytedance.b.b.a.b.c$1) = (r2v25 'cVar' com.bytedance.b.b.a.b.c) call: com.bytedance.b.b.a.b.c.1.<init>(com.bytedance.b.b.a.b.c):void type: CONSTRUCTOR)
                         type: VIRTUAL call: java.io.File.listFiles(java.io.FileFilter):java.io.File[] in method: com.bytedance.b.b.a.e.a():void, file: classes.dex
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
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0313: CONSTRUCTOR  (r0v138 com.bytedance.b.b.a.b.c$1) = (r2v25 'cVar' com.bytedance.b.b.a.b.c) call: com.bytedance.b.b.a.b.c.1.<init>(com.bytedance.b.b.a.b.c):void type: CONSTRUCTOR in method: com.bytedance.b.b.a.e.a():void, file: classes.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                        	... 35 more
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.b.b.a.b.c, state: GENERATED_AND_UNLOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                        	... 41 more
                        */
                    /*
                    // Method dump skipped, instructions count: 983
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p802b.p806b.p807a.C12969e.m23289a():void");
                }

                /* renamed from: a */
                private static C13624l.EnumC13625a m23288a(Context context) {
                    if (C58029j.f132252d != C13624l.EnumC13625a.UNKNOWN && C58029j.m104846b() && !C58029j.m104847c()) {
                        return C58029j.f132252d;
                    }
                    C13624l.EnumC13625a c = C13624l.m24487c(context);
                    C58029j.f132252d = c;
                    return c;
                }

                /* renamed from: a */
                public final synchronized void mo20825a(C12928a aVar) {
                    this.f31594c = aVar;
                    if (aVar != null) {
                        C12957c.C12958a.f31568a.f31566l = aVar;
                        C12937c.C12942a.f31517a.mo20784a(aVar.f31464g);
                        C12937c cVar = C12937c.C12942a.f31517a;
                        long j = aVar.f31458a;
                        if (j > 0) {
                            cVar.f31508a = j;
                        }
                        C12972c cVar2 = C12972c.f31599a;
                        int i = aVar.f31465h;
                        int i2 = aVar.f31466i;
                        if (i > 0 && i2 > 0) {
                            cVar2.f31602d = i;
                            cVar2.f31603e = i2;
                        }
                    }
                }

                @Override // com.bytedance.p802b.p830h.AbstractC13095c
                /* renamed from: a */
                public final void mo20826a(AbstractC13094b bVar) {
                    if (!this.f31595d) {
                        m23289a();
                    }
                    JSONObject c = bVar.mo20772c();
                    if (C12927a.f31457b.contains(bVar.mo20770a()) || "tracing".equals(bVar.mo20770a())) {
                        m23290a(c, false);
                    } else {
                        m23290a(c, true);
                    }
                    this.f31593b.mo20796a(c);
                    if (C13037a.m23579r()) {
                        C12441a.m22401a(bVar.mo20770a(), c, true);
                    }
                }

                /* renamed from: a */
                private static void m23290a(JSONObject jSONObject, boolean z) {
                    int a;
                    try {
                        if (!TextUtils.isEmpty(C13037a.m23447o())) {
                            jSONObject.put("session_id", C13037a.m23447o());
                        }
                        if (jSONObject.isNull("network_type")) {
                            C13624l.EnumC13625a a2 = m23288a(C13113a.f31955g);
                            jSONObject.put("network_type", a2.getValue());
                            if ((a2.is2G() || a2.is3GOrHigher()) && (a = C13131g.m23610a(C13113a.f31955g)) != -10000) {
                                jSONObject.put("network_type_code", a);
                            }
                        }
                        if (jSONObject.isNull("timestamp") || jSONObject.optLong("timestamp") <= 0) {
                            jSONObject.put("timestamp", System.currentTimeMillis());
                        }
                        if (jSONObject.isNull("sid")) {
                            jSONObject.put("sid", C13037a.m23432a());
                        }
                        jSONObject.put("process_name", C13037a.m23436d());
                        if (z) {
                            jSONObject.put("seq_no", C12948d.C12949a.f31532a.mo20799a());
                        }
                    } catch (Exception unused) {
                    }
                }
            }
