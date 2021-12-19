package com.bytedance.lighten.p1477a;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.p1477a.p1478a.C20714a;
import com.bytedance.lighten.p1477a.p1479b.C20720b;
import com.bytedance.lighten.p1477a.p1479b.C20721c;
import com.bytedance.lighten.p1477a.p1479b.C20722d;
import java.io.File;

/* renamed from: com.bytedance.lighten.a.r */
public final class C20761r {

    /* renamed from: a */
    public static final AbstractC20759p f48991a;

    /* renamed from: b */
    public static volatile AbstractC20753j f48992b;

    /* renamed from: c */
    public static volatile boolean f48993c;

    /* renamed from: d */
    public static String f48994d;

    /* renamed from: e */
    private static volatile C20762s f48995e;

    /* renamed from: b */
    public static AbstractC20723c m39063b() {
        if (!f48993c) {
            return null;
        }
        return f48991a.getCache();
    }

    /* renamed from: a */
    public static C20762s m39055a() {
        if (f48995e == null) {
            if (f48992b != null) {
                f48995e = f48992b.mo34170a();
            } else {
                throw new IllegalStateException("Lighten:lighten is not initialized, call Lighten.init");
            }
        }
        return f48995e;
    }

    static {
        Covode.recordClassIndex(24334);
        AbstractC20759p a = C20720b.m39012a();
        if (a == null && (a = C20721c.m39013a()) == null && (a = C20722d.m39014a()) == null) {
            a = 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001e: CONSTRUCTOR  (r0v4 'a' com.bytedance.lighten.a.p) =  call: com.bytedance.lighten.a.b.a.1.<init>():void type: CONSTRUCTOR in method: com.bytedance.lighten.a.r.<clinit>():void, file: classes9.dex
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
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.lighten.a.b.a, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 19 more
                */
            /*
                r0 = 24334(0x5f0e, float:3.4099E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bytedance.lighten.a.p r0 = com.bytedance.lighten.p1477a.p1479b.C20720b.m39012a()
                if (r0 == 0) goto L_0x000e
            L_0x000b:
                com.bytedance.lighten.p1477a.C20761r.f48991a = r0
                return
            L_0x000e:
                com.bytedance.lighten.a.p r0 = com.bytedance.lighten.p1477a.p1479b.C20721c.m39013a()
                if (r0 == 0) goto L_0x0015
                goto L_0x000b
            L_0x0015:
                com.bytedance.lighten.a.p r0 = com.bytedance.lighten.p1477a.p1479b.C20722d.m39014a()
                if (r0 == 0) goto L_0x001c
                goto L_0x000b
            L_0x001c:
                com.bytedance.lighten.a.b.a$1 r0 = new com.bytedance.lighten.a.b.a$1
                r0.<init>()
                goto L_0x000b
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lighten.p1477a.C20761r.<clinit>():void");
        }

        /* renamed from: a */
        public static C20766v m39056a(int i) {
            return f48991a.load(i);
        }

        /* renamed from: a */
        public static C20766v m39057a(Uri uri) {
            return f48991a.load(uri);
        }

        /* renamed from: c */
        public static void m39066c(C20765u uVar) {
            if (f48993c && uVar != null) {
                f48991a.download(uVar);
            }
        }

        /* renamed from: b */
        public static void m39064b(int i) {
            if (f48993c) {
                f48991a.trimMemory(i);
            }
        }

        /* renamed from: a */
        public static C20766v m39058a(C20714a aVar) {
            return f48991a.load(aVar);
        }

        /* renamed from: b */
        public static void m39065b(C20765u uVar) {
            if (f48993c && uVar != null) {
                f48991a.loadBitmap(uVar);
            }
        }

        /* renamed from: a */
        public static C20766v m39059a(File file) {
            if (!file.exists()) {
                return C20766v.f49087P;
            }
            return f48991a.load(file);
        }

        /* renamed from: a */
        public static C20766v m39060a(Object obj) {
            return f48991a.load(obj);
        }

        /* renamed from: a */
        public static C20766v m39061a(String str) {
            if (TextUtils.isEmpty(str)) {
                return C20766v.f49087P;
            }
            return f48991a.load(str);
        }

        /* renamed from: a */
        static void m39062a(C20765u uVar) {
            if (f48993c && uVar != null) {
                f48991a.display(uVar);
            }
        }
    }
