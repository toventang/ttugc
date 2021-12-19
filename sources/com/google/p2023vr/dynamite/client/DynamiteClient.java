package com.google.p2023vr.dynamite.client;

import android.content.Context;
import android.util.ArrayMap;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import dalvik.system.DexClassLoader;

/* renamed from: com.google.vr.dynamite.client.DynamiteClient */
public final class DynamiteClient {

    /* renamed from: a */
    private static final ArrayMap<C28050f, C28049e> f65813a = new ArrayMap<>();

    private DynamiteClient() {
    }

    static {
        Covode.recordClassIndex(33698);
    }

    private static synchronized C28049e getRemoteLibraryLoaderFromInfo(C28050f fVar) {
        synchronized (DynamiteClient.class) {
            MethodCollector.m26663i(12439);
            ArrayMap<C28050f, C28049e> arrayMap = f65813a;
            C28049e eVar = arrayMap.get(fVar);
            if (eVar == null) {
                C28049e eVar2 = new C28049e(fVar);
                arrayMap.put(fVar, eVar2);
                MethodCollector.m26664o(12439);
                return eVar2;
            }
            MethodCollector.m26664o(12439);
            return eVar;
        }
    }

    public static synchronized ClassLoader getRemoteDexClassLoader(Context context, String str) {
        synchronized (DynamiteClient.class) {
            MethodCollector.m26663i(12177);
            Context remoteContext = getRemoteContext(context, str, null);
            if (remoteContext == null) {
                MethodCollector.m26664o(12177);
                return null;
            }
            try {
                DexClassLoader dexClassLoader = new DexClassLoader(remoteContext.getPackageCodePath(), context.getCodeCacheDir().getAbsolutePath(), remoteContext.getApplicationInfo().nativeLibraryDir, context.getClassLoader());
                MethodCollector.m26664o(12177);
                return dexClassLoader;
            } catch (RuntimeException unused) {
                MethodCollector.m26664o(12177);
                return null;
            }
        }
    }

    public static synchronized ClassLoader getRemoteClassLoader(Context context, String str, String str2) {
        synchronized (DynamiteClient.class) {
            MethodCollector.m26663i(12173);
            Context remoteContext = getRemoteContext(context, str, str2);
            if (remoteContext == null) {
                MethodCollector.m26664o(12173);
                return null;
            }
            ClassLoader classLoader = remoteContext.getClassLoader();
            MethodCollector.m26664o(12173);
            return classLoader;
        }
    }

    public static synchronized Context getRemoteContext(Context context, String str, String str2) {
        Context b;
        synchronized (DynamiteClient.class) {
            MethodCollector.m26663i(12438);
            C28050f fVar = new C28050f(str, str2);
            try {
                b = getRemoteLibraryLoaderFromInfo(fVar).mo47137b(context);
                MethodCollector.m26664o(12438);
            } catch (C28048d unused) {
                String.valueOf(String.valueOf(fVar)).length();
                MethodCollector.m26664o(12438);
                return null;
            }
        }
        return b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0042, code lost:
        java.lang.String.valueOf(java.lang.String.valueOf(r5)).length();
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(12045);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0051, code lost:
        return 0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[ExcHandler: RemoteException | d | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError (unused java.lang.Throwable), SYNTHETIC, Splitter:B:10:0x0039] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized long loadNativeRemoteLibrary(android.content.Context r8, java.lang.String r9, java.lang.String r10) {
        /*
            java.lang.Class<com.google.vr.dynamite.client.DynamiteClient> r7 = com.google.p2023vr.dynamite.client.DynamiteClient.class
            monitor-enter(r7)
            r6 = 12045(0x2f0d, float:1.6879E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r6)     // Catch:{ all -> 0x0052 }
            com.google.vr.dynamite.client.f r5 = new com.google.vr.dynamite.client.f     // Catch:{ all -> 0x0052 }
            r5.<init>(r9, r10)     // Catch:{ all -> 0x0052 }
            com.google.vr.dynamite.client.e r1 = getRemoteLibraryLoaderFromInfo(r5)     // Catch:{ all -> 0x0052 }
            r3 = 0
            android.content.Context r0 = r1.mo47137b(r8)
            com.google.vr.dynamite.client.ILoadedInstanceCreator r2 = r1.mo47136a(r8)
            com.google.vr.dynamite.client.IObjectWrapper r1 = com.google.p2023vr.dynamite.client.ObjectWrapper.m56152a(r0)
            com.google.vr.dynamite.client.IObjectWrapper r0 = com.google.p2023vr.dynamite.client.ObjectWrapper.m56152a(r8)
            com.google.vr.dynamite.client.INativeLibraryLoader r0 = r2.newNativeLibraryLoader(r1, r0)
            if (r0 != 0) goto L_0x0039
            java.lang.String r0 = java.lang.String.valueOf(r5)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r0.length()
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r6)
            monitor-exit(r7)
            return r3
        L_0x0039:
            long r0 = r0.initializeAndLoadNativeLibrary(r10)     // Catch:{ RemoteException | d | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError -> 0x0042, RemoteException | d | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError -> 0x0042, RemoteException | d | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError -> 0x0042, RemoteException | d | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError -> 0x0042, RemoteException | d | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError -> 0x0042 }
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r6)
            monitor-exit(r7)
            return r0
        L_0x0042:
            java.lang.String r0 = java.lang.String.valueOf(r5)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r0.length()
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r6)
            monitor-exit(r7)
            return r3
        L_0x0052:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p2023vr.dynamite.client.DynamiteClient.loadNativeRemoteLibrary(android.content.Context, java.lang.String, java.lang.String):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0041, code lost:
        java.lang.String.valueOf(java.lang.String.valueOf(r4)).length();
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(9896);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0050, code lost:
        return -1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[ExcHandler: RemoteException | d | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError (unused java.lang.Throwable), SYNTHETIC, Splitter:B:10:0x0038] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized int checkVersion(android.content.Context r7, java.lang.String r8, java.lang.String r9, java.lang.String r10) {
        /*
            java.lang.Class<com.google.vr.dynamite.client.DynamiteClient> r6 = com.google.p2023vr.dynamite.client.DynamiteClient.class
            monitor-enter(r6)
            r5 = 9896(0x26a8, float:1.3867E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r5)     // Catch:{ all -> 0x0051 }
            com.google.vr.dynamite.client.f r4 = new com.google.vr.dynamite.client.f     // Catch:{ all -> 0x0051 }
            r4.<init>(r8, r9)     // Catch:{ all -> 0x0051 }
            com.google.vr.dynamite.client.e r1 = getRemoteLibraryLoaderFromInfo(r4)     // Catch:{ all -> 0x0051 }
            r3 = -1
            android.content.Context r0 = r1.mo47137b(r7)
            com.google.vr.dynamite.client.ILoadedInstanceCreator r2 = r1.mo47136a(r7)
            com.google.vr.dynamite.client.IObjectWrapper r1 = com.google.p2023vr.dynamite.client.ObjectWrapper.m56152a(r0)
            com.google.vr.dynamite.client.IObjectWrapper r0 = com.google.p2023vr.dynamite.client.ObjectWrapper.m56152a(r7)
            com.google.vr.dynamite.client.INativeLibraryLoader r0 = r2.newNativeLibraryLoader(r1, r0)
            if (r0 != 0) goto L_0x0038
            java.lang.String r0 = java.lang.String.valueOf(r4)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r0.length()
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r5)
            monitor-exit(r6)
            return r3
        L_0x0038:
            int r0 = r0.checkVersion(r10)     // Catch:{ RemoteException | d | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError -> 0x0041, RemoteException | d | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError -> 0x0041, RemoteException | d | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError -> 0x0041, RemoteException | d | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError -> 0x0041, RemoteException | d | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError -> 0x0041 }
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r5)
            monitor-exit(r6)
            return r0
        L_0x0041:
            java.lang.String r0 = java.lang.String.valueOf(r4)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r0.length()
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r5)
            monitor-exit(r6)
            return r3
        L_0x0051:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p2023vr.dynamite.client.DynamiteClient.checkVersion(android.content.Context, java.lang.String, java.lang.String, java.lang.String):int");
    }
}
