package com.bytedance.lynx.hybrid.resource.p1529e;

import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.resource.config.C21284j;
import com.bytedance.lynx.hybrid.resource.p1528d.C21294e;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.lynx.hybrid.resource.e.a */
public final class C21300a {

    /* renamed from: a */
    public static final C21300a f50568a = new C21300a();

    private C21300a() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.lynx.hybrid.resource.e.a$a */
    public static final class CallableC21301a<V> implements Callable<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C21294e f50569a;

        /* renamed from: b */
        final /* synthetic */ C21284j f50570b;

        /* renamed from: c */
        final /* synthetic */ String f50571c;

        static {
            Covode.recordClassIndex(24919);
        }

        CallableC21301a(C21294e eVar, C21284j jVar, String str) {
            this.f50569a = eVar;
            this.f50570b = jVar;
            this.f50571c = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ C89391z call() {
            C21300a.m40013a(this.f50569a, this.f50570b, false, this.f50571c);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.lynx.hybrid.resource.e.a$b */
    public static final class CallableC21302b<V> implements Callable<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C21294e f50572a;

        /* renamed from: b */
        final /* synthetic */ C21284j f50573b;

        static {
            Covode.recordClassIndex(24920);
        }

        CallableC21302b(C21294e eVar, C21284j jVar) {
            this.f50572a = eVar;
            this.f50573b = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ C89391z call() {
            C21300a.m40013a(this.f50572a, this.f50573b, true, null);
            return C89391z.f203057a;
        }
    }

    static {
        Covode.recordClassIndex(24918);
    }

    /* renamed from: a */
    public static void m40011a(C21294e eVar, C21284j jVar) {
        C89219l.m154719c(eVar, "");
        C89219l.m154719c(jVar, "");
        C1731i.m5636a(new CallableC21302b(eVar, jVar), C1731i.f5562a);
    }

    /* renamed from: a */
    public static void m40012a(C21294e eVar, C21284j jVar, String str) {
        C89219l.m154719c(eVar, "");
        C89219l.m154719c(jVar, "");
        C89219l.m154719c(str, "");
        C1731i.m5636a(new CallableC21301a(eVar, jVar, str), C1731i.f5562a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0101, code lost:
        if (r1 != 4) goto L_0x000e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0037  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m40013a(com.bytedance.lynx.hybrid.resource.p1528d.C21294e r7, com.bytedance.lynx.hybrid.resource.config.C21284j r8, boolean r9, java.lang.String r10) {
        /*
        // Method dump skipped, instructions count: 303
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lynx.hybrid.resource.p1529e.C21300a.m40013a(com.bytedance.lynx.hybrid.resource.d.e, com.bytedance.lynx.hybrid.resource.config.j, boolean, java.lang.String):void");
    }
}
