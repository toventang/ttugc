package com.bytedance.librarian;

import android.content.Context;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.application.C33912n;

public class Librarian {

    /* renamed from: a */
    static Context f48891a;

    /* renamed from: b */
    static volatile String f48892b;

    /* renamed from: c */
    static LibrarianMonitor f48893c;

    /* renamed from: d */
    private static final Object f48894d = new Object();

    /* renamed from: b */
    public static void m38965b(String str, boolean z, Context context) {
        m38964a(str, z, context);
    }

    /* renamed from: a */
    public static void m38962a(String str) {
        m38964a(str, false, (Context) null);
    }

    /* renamed from: a */
    public static void m38963a(String str, Context context) {
        m38964a(str, true, context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0014, code lost:
        if (r4 == null) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0016, code lost:
        com.bytedance.librarian.Librarian.f48891a = r3;
        com.bytedance.librarian.Librarian.f48892b = r4;
        com.bytedance.librarian.Librarian.f48893c = r5;
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(4483);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        r1 = new java.lang.IllegalStateException("context or version is null in init");
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(4483);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        if (r3 == null) goto L_0x0020;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m38961a(android.content.Context r3, java.lang.String r4, com.bytedance.librarian.LibrarianMonitor r5) {
        /*
            r2 = 4483(0x1183, float:6.282E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r2)
            java.lang.Object r1 = com.bytedance.librarian.Librarian.f48894d
            monitor-enter(r1)
            java.lang.String r0 = com.bytedance.librarian.Librarian.f48892b     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x0011
            monitor-exit(r1)     // Catch:{ all -> 0x002b }
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r2)
            return
        L_0x0011:
            monitor-exit(r1)
            if (r3 == 0) goto L_0x0020
            if (r4 == 0) goto L_0x0020
            com.bytedance.librarian.Librarian.f48891a = r3
            com.bytedance.librarian.Librarian.f48892b = r4
            com.bytedance.librarian.Librarian.f48893c = r5
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r2)
            return
        L_0x0020:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "context or version is null in init"
            r1.<init>(r0)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r2)
            throw r1
        L_0x002b:
            r0 = move-exception
            monitor-exit(r1)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.librarian.Librarian.m38961a(android.content.Context, java.lang.String, com.bytedance.librarian.LibrarianMonitor):void");
    }

    /* renamed from: a */
    public static void m38964a(String str, boolean z, Context context) {
        MethodCollector.m26663i(4491);
        C33912n.m69444a(context, str, false, true);
        if (z && f48891a == null) {
            f48891a = context;
        }
        LibrarianImpl librarianImpl = LibrarianImpl.f48895a;
        if (librarianImpl != null) {
            librarianImpl.mo34112a(str, false);
        } else {
            LibrarianMonitor librarianMonitor = f48893c;
            if (librarianMonitor != null) {
                librarianMonitor.mo34116a(str);
            } else {
                System.loadLibrary(str);
            }
        }
        C33912n.m69444a(context, str, false, false);
        MethodCollector.m26664o(4491);
    }
}
