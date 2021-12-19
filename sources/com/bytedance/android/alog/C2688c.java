package com.bytedance.android.alog;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* renamed from: com.bytedance.android.alog.c */
public final class C2688c {

    /* renamed from: a */
    public static Alog f8044a;

    static {
        Covode.recordClassIndex(3077);
    }

    /* renamed from: b */
    public static void m7780b() {
        Alog alog = f8044a;
        if (alog != null) {
            alog.mo7198b();
        }
    }

    /* renamed from: a */
    public static void m7777a() {
        MethodCollector.m26663i(2483);
        Alog.nativeSetDefaultInstance(0);
        f8044a.mo7194a();
        f8044a = null;
        MethodCollector.m26664o(2483);
    }

    /* renamed from: c */
    public static long m7781c() {
        MethodCollector.m26663i(2632);
        Alog alog = f8044a;
        if (alog == null) {
            MethodCollector.m26664o(2632);
            return 0;
        } else if (alog.f8006p != 0) {
            long nativeGetLegacyWriteFuncAddr = Alog.nativeGetLegacyWriteFuncAddr();
            MethodCollector.m26664o(2632);
            return nativeGetLegacyWriteFuncAddr;
        } else {
            MethodCollector.m26664o(2632);
            return 0;
        }
    }

    /* renamed from: a */
    public static void m7778a(int i, String str, String str2) {
        Alog alog = f8044a;
        if (alog != null) {
            alog.mo7196a(i, str, str2);
        }
    }

    /* renamed from: a */
    public static File[] m7779a(String str, String str2, long j, long j2) {
        String quote;
        Alog alog = f8044a;
        if (alog == null) {
            return new File[0];
        }
        String str3 = alog.f8000j;
        C2685a.f8036b = j;
        C2685a.f8037c = j2;
        C2685a.f8039e = null;
        C2685a.f8038d = null;
        if (j > j2) {
            C2685a.f8039e = "time interval is invalid";
            return new File[0];
        }
        File file = new File(str3);
        if (!file.exists() || !file.isDirectory()) {
            C2685a.f8039e = "log dir not exists";
            return new File[0];
        }
        if (!TextUtils.isEmpty(str)) {
            str = str.replace(':', '-');
        }
        StringBuilder sb = new StringBuilder("^\\d{4}_\\d{2}_\\d{2}_(\\d+)__");
        String str4 = "\\S+";
        if (TextUtils.isEmpty(str)) {
            quote = str4;
        } else {
            quote = Pattern.quote(str);
        }
        StringBuilder append = sb.append(quote).append("__");
        if (!TextUtils.isEmpty(str2)) {
            str4 = Pattern.quote(str2);
        }
        Pattern compile = Pattern.compile(append.append(str4).append("\\.alog\\.hot$").toString());
        ArrayList<String> arrayList = new ArrayList<>();
        File[] listFiles = file.listFiles(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x007f: INVOKE  (r1v5 'listFiles' java.io.File[]) = 
              (r3v0 'file' java.io.File)
              (wrap: com.bytedance.android.alog.a$1 : 0x007c: CONSTRUCTOR  (r4v3 com.bytedance.android.alog.a$1) = 
              (r5v0 'arrayList' java.util.ArrayList<java.lang.String>)
              (r6v0 'compile' java.util.regex.Pattern)
              (r15v0 'j2' long)
              (r13v0 'j' long)
             call: com.bytedance.android.alog.a.1.<init>(java.util.ArrayList, java.util.regex.Pattern, long, long):void type: CONSTRUCTOR)
             type: VIRTUAL call: java.io.File.listFiles(java.io.FilenameFilter):java.io.File[] in method: com.bytedance.android.alog.c.a(java.lang.String, java.lang.String, long, long):java.io.File[], file: classes.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
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
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x007c: CONSTRUCTOR  (r4v3 com.bytedance.android.alog.a$1) = 
              (r5v0 'arrayList' java.util.ArrayList<java.lang.String>)
              (r6v0 'compile' java.util.regex.Pattern)
              (r15v0 'j2' long)
              (r13v0 'j' long)
             call: com.bytedance.android.alog.a.1.<init>(java.util.ArrayList, java.util.regex.Pattern, long, long):void type: CONSTRUCTOR in method: com.bytedance.android.alog.c.a(java.lang.String, java.lang.String, long, long):java.io.File[], file: classes.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 26 more
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.android.alog.a, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 32 more
            */
        /*
        // Method dump skipped, instructions count: 161
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.alog.C2688c.m7779a(java.lang.String, java.lang.String, long, long):java.io.File[]");
    }
}
