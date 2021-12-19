package com.bytedance.common.jato.fdio;

import android.os.Build;
import com.bytedance.common.jato.C13558e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashMap;
import java.util.Map;

public class FDIOPreloaderManager {
    private static Map<String, AbstractC13574b> sCacheMap = new HashMap();

    private static native void nativePreloadAll(String str);

    static {
        Covode.recordClassIndex(15579);
    }

    private static void nativeIsMincoreValid(int i) {
        C13558e.m24362b().execute(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0009: INVOKE  
              (wrap: java.util.concurrent.ExecutorService : 0x0000: INVOKE  (r1v0 java.util.concurrent.ExecutorService) =  type: STATIC call: com.bytedance.common.jato.e.b():java.util.concurrent.ExecutorService)
              (wrap: com.bytedance.common.jato.fdio.a$6 : 0x0006: CONSTRUCTOR  (r0v0 com.bytedance.common.jato.fdio.a$6) = (r2v0 'i' int) call: com.bytedance.common.jato.fdio.a.6.<init>(int):void type: CONSTRUCTOR)
             type: INTERFACE call: java.util.concurrent.ExecutorService.execute(java.lang.Runnable):void in method: com.bytedance.common.jato.fdio.FDIOPreloaderManager.nativeIsMincoreValid(int):void, file: classes.dex
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
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0006: CONSTRUCTOR  (r0v0 com.bytedance.common.jato.fdio.a$6) = (r2v0 'i' int) call: com.bytedance.common.jato.fdio.a.6.<init>(int):void type: CONSTRUCTOR in method: com.bytedance.common.jato.fdio.FDIOPreloaderManager.nativeIsMincoreValid(int):void, file: classes.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 14 more
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.common.jato.fdio.a, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 20 more
            */
        /*
            java.util.concurrent.ExecutorService r1 = com.bytedance.common.jato.C13558e.m24362b()
            com.bytedance.common.jato.fdio.a$6 r0 = new com.bytedance.common.jato.fdio.a$6
            r0.<init>(r2)
            r1.execute(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.jato.fdio.FDIOPreloaderManager.nativeIsMincoreValid(int):void");
    }

    private static void nativePreloadCost(int i) {
        C13558e.m24362b().execute(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0009: INVOKE  
              (wrap: java.util.concurrent.ExecutorService : 0x0000: INVOKE  (r1v0 java.util.concurrent.ExecutorService) =  type: STATIC call: com.bytedance.common.jato.e.b():java.util.concurrent.ExecutorService)
              (wrap: com.bytedance.common.jato.fdio.a$5 : 0x0006: CONSTRUCTOR  (r0v0 com.bytedance.common.jato.fdio.a$5) = (r2v0 'i' int) call: com.bytedance.common.jato.fdio.a.5.<init>(int):void type: CONSTRUCTOR)
             type: INTERFACE call: java.util.concurrent.ExecutorService.execute(java.lang.Runnable):void in method: com.bytedance.common.jato.fdio.FDIOPreloaderManager.nativePreloadCost(int):void, file: classes.dex
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
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0006: CONSTRUCTOR  (r0v0 com.bytedance.common.jato.fdio.a$5) = (r2v0 'i' int) call: com.bytedance.common.jato.fdio.a.5.<init>(int):void type: CONSTRUCTOR in method: com.bytedance.common.jato.fdio.FDIOPreloaderManager.nativePreloadCost(int):void, file: classes.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 14 more
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.common.jato.fdio.a, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 20 more
            */
        /*
            java.util.concurrent.ExecutorService r1 = com.bytedance.common.jato.C13558e.m24362b()
            com.bytedance.common.jato.fdio.a$5 r0 = new com.bytedance.common.jato.fdio.a$5
            r0.<init>(r2)
            r1.execute(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.jato.fdio.FDIOPreloaderManager.nativePreloadCost(int):void");
    }

    public static synchronized void preloadAll(String str) {
        synchronized (FDIOPreloaderManager.class) {
            MethodCollector.m26663i(9471);
            nativePreloadAll(str);
            MethodCollector.m26664o(9471);
        }
    }

    public static synchronized AbstractC13574b getAndRemove(String str) {
        synchronized (FDIOPreloaderManager.class) {
            MethodCollector.m26663i(9470);
            if (!sCacheMap.containsKey(str)) {
                MethodCollector.m26664o(9470);
                return null;
            }
            AbstractC13574b bVar = sCacheMap.get(str);
            sCacheMap.remove(str);
            MethodCollector.m26664o(9470);
            return bVar;
        }
    }

    public static synchronized FDIOCollector getCollector(String str) {
        synchronized (FDIOPreloaderManager.class) {
            MethodCollector.m26663i(9468);
            if (Build.VERSION.SDK_INT <= 22) {
                MethodCollector.m26664o(9468);
                return null;
            } else if (sCacheMap.containsKey(str)) {
                FDIOCollector fDIOCollector = (FDIOCollector) sCacheMap.get(str);
                MethodCollector.m26664o(9468);
                return fDIOCollector;
            } else {
                FDIOCollector fDIOCollector2 = new FDIOCollector();
                sCacheMap.put(str, fDIOCollector2);
                MethodCollector.m26664o(9468);
                return fDIOCollector2;
            }
        }
    }

    public static synchronized AbstractC13574b getPreloader(String str) {
        synchronized (FDIOPreloaderManager.class) {
            MethodCollector.m26663i(9469);
            if (Build.VERSION.SDK_INT <= 22) {
                MethodCollector.m26664o(9469);
                return null;
            } else if (sCacheMap.containsKey(str)) {
                AbstractC13574b bVar = sCacheMap.get(str);
                MethodCollector.m26664o(9469);
                return bVar;
            } else {
                FDIOPreloader fDIOPreloader = new FDIOPreloader();
                sCacheMap.put(str, fDIOPreloader);
                MethodCollector.m26664o(9469);
                return fDIOPreloader;
            }
        }
    }

    private static void nativeCollectPageSize(int i, int i2) {
        C13558e.m24362b().execute(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0009: INVOKE  
              (wrap: java.util.concurrent.ExecutorService : 0x0000: INVOKE  (r1v0 java.util.concurrent.ExecutorService) =  type: STATIC call: com.bytedance.common.jato.e.b():java.util.concurrent.ExecutorService)
              (wrap: com.bytedance.common.jato.fdio.a$3 : 0x0006: CONSTRUCTOR  (r0v0 com.bytedance.common.jato.fdio.a$3) = (r2v0 'i' int), (r3v0 'i2' int) call: com.bytedance.common.jato.fdio.a.3.<init>(int, int):void type: CONSTRUCTOR)
             type: INTERFACE call: java.util.concurrent.ExecutorService.execute(java.lang.Runnable):void in method: com.bytedance.common.jato.fdio.FDIOPreloaderManager.nativeCollectPageSize(int, int):void, file: classes.dex
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
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0006: CONSTRUCTOR  (r0v0 com.bytedance.common.jato.fdio.a$3) = (r2v0 'i' int), (r3v0 'i2' int) call: com.bytedance.common.jato.fdio.a.3.<init>(int, int):void type: CONSTRUCTOR in method: com.bytedance.common.jato.fdio.FDIOPreloaderManager.nativeCollectPageSize(int, int):void, file: classes.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 14 more
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.common.jato.fdio.a, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 20 more
            */
        /*
            java.util.concurrent.ExecutorService r1 = com.bytedance.common.jato.C13558e.m24362b()
            com.bytedance.common.jato.fdio.a$3 r0 = new com.bytedance.common.jato.fdio.a$3
            r0.<init>(r2, r3)
            r1.execute(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.jato.fdio.FDIOPreloaderManager.nativeCollectPageSize(int, int):void");
    }

    private static void nativePreloadPageSize(int i, int i2) {
        C13558e.m24362b().execute(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0009: INVOKE  
              (wrap: java.util.concurrent.ExecutorService : 0x0000: INVOKE  (r1v0 java.util.concurrent.ExecutorService) =  type: STATIC call: com.bytedance.common.jato.e.b():java.util.concurrent.ExecutorService)
              (wrap: com.bytedance.common.jato.fdio.a$4 : 0x0006: CONSTRUCTOR  (r0v0 com.bytedance.common.jato.fdio.a$4) = (r2v0 'i' int), (r3v0 'i2' int) call: com.bytedance.common.jato.fdio.a.4.<init>(int, int):void type: CONSTRUCTOR)
             type: INTERFACE call: java.util.concurrent.ExecutorService.execute(java.lang.Runnable):void in method: com.bytedance.common.jato.fdio.FDIOPreloaderManager.nativePreloadPageSize(int, int):void, file: classes.dex
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
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0006: CONSTRUCTOR  (r0v0 com.bytedance.common.jato.fdio.a$4) = (r2v0 'i' int), (r3v0 'i2' int) call: com.bytedance.common.jato.fdio.a.4.<init>(int, int):void type: CONSTRUCTOR in method: com.bytedance.common.jato.fdio.FDIOPreloaderManager.nativePreloadPageSize(int, int):void, file: classes.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 14 more
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.common.jato.fdio.a, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 20 more
            */
        /*
            java.util.concurrent.ExecutorService r1 = com.bytedance.common.jato.C13558e.m24362b()
            com.bytedance.common.jato.fdio.a$4 r0 = new com.bytedance.common.jato.fdio.a$4
            r0.<init>(r2, r3)
            r1.execute(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.jato.fdio.FDIOPreloaderManager.nativePreloadPageSize(int, int):void");
    }
}
