package com.facebook.p1814a;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.facebook.C24006ab;
import com.facebook.C24872m;
import com.facebook.internal.C24693ad;
import com.facebook.internal.p1894a.p1896b.C24677a;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;

/* renamed from: com.facebook.a.m */
public final class C23998m {

    /* renamed from: a */
    public C23973h f56808a;

    static {
        Covode.recordClassIndex(28119);
    }

    /* renamed from: e */
    public final void mo39479e() {
        this.f56808a.mo39461c();
    }

    /* renamed from: a */
    public final void mo39473a() {
        if (C24006ab.m45407b()) {
            this.f56808a.mo39460b();
        }
    }

    /* renamed from: b */
    public final void mo39476b() {
        if (C24006ab.m45407b()) {
            this.f56808a.mo39462f();
        }
    }

    /* renamed from: c */
    public final void mo39477c() {
        if (C24006ab.m45407b()) {
            this.f56808a.mo39462f();
        }
    }

    /* renamed from: d */
    public final void mo39478d() {
        if (C24006ab.m45407b()) {
            this.f56808a.mo39462f();
        }
    }

    private C23998m(C23973h hVar) {
        this.f56808a = hVar;
    }

    public C23998m(Context context) {
        this(new C23973h(context, null));
    }

    /* renamed from: a */
    public final void mo39474a(double d) {
        if (C24006ab.m45407b()) {
            C23973h hVar = this.f56808a;
            if (!C24677a.m47209a(hVar)) {
                try {
                    Double.valueOf(d);
                } catch (Throwable th) {
                    C24677a.m47208a(th, hVar);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo39475a(Bundle bundle) {
        if ((bundle.getInt("previous") & 2) != 0 || C24006ab.m45407b()) {
            this.f56808a.mo39462f();
        }
    }

    /* renamed from: a */
    public static void m45380a(Map<String, String> map) {
        String[] strArr;
        if (!C24677a.m47209a(C24002p.class)) {
            try {
                if (!C24002p.f56818a.get()) {
                    C24002p.m45397b();
                }
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey();
                    String b = C24693ad.m47265b(C24002p.m45396a(key, map.get(key).trim()));
                    if (C24002p.f56819b.containsKey(key)) {
                        String str = C24002p.f56819b.get(key);
                        if (str != null) {
                            strArr = str.split(",");
                        } else {
                            strArr = new String[0];
                        }
                        HashSet hashSet = new HashSet(Arrays.asList(strArr));
                        if (!hashSet.contains(b)) {
                            StringBuilder sb = new StringBuilder();
                            if (strArr.length == 0) {
                                sb.append(b);
                            } else if (strArr.length < 5) {
                                sb.append(str).append(",").append(b);
                            } else {
                                int i = 1;
                                do {
                                    sb.append(strArr[i]).append(",");
                                    i++;
                                } while (i < 5);
                                sb.append(b);
                                hashSet.remove(strArr[0]);
                            }
                            C24002p.f56819b.put(key, sb.toString());
                        } else {
                            return;
                        }
                    } else {
                        C24002p.f56819b.put(key, b);
                    }
                }
                String a = C24693ad.m47238a(C24002p.f56819b);
                if (!C24677a.m47209a(C24002p.class)) {
                    try {
                        C24872m.m47689c().execute(
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00c7: INVOKE  
                              (wrap: java.util.concurrent.Executor : 0x00be: INVOKE  (r1v2 java.util.concurrent.Executor) =  type: STATIC call: com.facebook.m.c():java.util.concurrent.Executor)
                              (wrap: com.facebook.a.p$1 : 0x00c4: CONSTRUCTOR  (r0v11 com.facebook.a.p$1) = ("com.facebook.appevents.UserDataStore.internalUserData"), (r2v0 'a' java.lang.String) call: com.facebook.a.p.1.<init>(java.lang.String, java.lang.String):void type: CONSTRUCTOR)
                             type: INTERFACE call: java.util.concurrent.Executor.execute(java.lang.Runnable):void in method: com.facebook.a.m.a(java.util.Map<java.lang.String, java.lang.String>):void, file: classes6.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                            	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:306)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:69)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                            	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:306)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:69)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
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
                            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00c4: CONSTRUCTOR  (r0v11 com.facebook.a.p$1) = ("com.facebook.appevents.UserDataStore.internalUserData"), (r2v0 'a' java.lang.String) call: com.facebook.a.p.1.<init>(java.lang.String, java.lang.String):void type: CONSTRUCTOR in method: com.facebook.a.m.a(java.util.Map<java.lang.String, java.lang.String>):void, file: classes6.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                            	... 34 more
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.facebook.a.p, state: GENERATED_AND_UNLOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                            	... 40 more
                            */
                        /*
                        // Method dump skipped, instructions count: 217
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.facebook.p1814a.C23998m.m45380a(java.util.Map):void");
                    }

                    public C23998m(Context context, String str) {
                        this(new C23973h(context, str));
                    }

                    public C23998m(String str, String str2) {
                        this(new C23973h(str, str2, null));
                    }
                }
