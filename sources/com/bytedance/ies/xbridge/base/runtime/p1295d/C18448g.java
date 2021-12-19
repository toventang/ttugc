package com.bytedance.ies.xbridge.base.runtime.p1295d;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.p995g.C14758h;
import com.bytedance.frameworks.baselib.network.http.p995g.C14759i;
import com.bytedance.ies.xbridge.base.runtime.p1293b.AbstractC18427a;
import com.bytedance.ies.xbridge.base.runtime.p1293b.AbstractC18428b;
import com.bytedance.ies.xbridge.base.runtime.p1293b.C18429c;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedFile;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.mime.TypedString;
import com.bytedance.ttnet.p1703d.C22944d;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p4600h.C89386u;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.bytedance.ies.xbridge.base.runtime.d.g */
public final class C18448g {

    /* renamed from: a */
    public static final C18448g f44075a = new C18448g();

    /* renamed from: com.bytedance.ies.xbridge.base.runtime.d.g$a */
    public static final class C18449a extends AbstractC18427a {

        /* renamed from: a */
        final /* synthetic */ LinkedHashMap f44076a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89236c f44077b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89238e f44078c;

        /* renamed from: d */
        final /* synthetic */ C89233z.C89238e f44079d;

        /* renamed from: e */
        final /* synthetic */ C89233z.C89238e f44080e;

        /* renamed from: f */
        final /* synthetic */ C89233z.C89238e f44081f;

        static {
            Covode.recordClassIndex(21123);
        }

        @Override // com.bytedance.ies.xbridge.base.runtime.p1293b.AbstractC18427a
        /* renamed from: b */
        public final LinkedHashMap<String, String> mo29454b() {
            return this.f44076a;
        }

        @Override // com.bytedance.ies.xbridge.base.runtime.p1293b.AbstractC18427a
        /* renamed from: a */
        public final InputStream mo29453a() {
            return this.f44078c.element;
        }

        @Override // com.bytedance.ies.xbridge.base.runtime.p1293b.AbstractC18427a
        /* renamed from: c */
        public final int mo29455c() {
            return this.f44077b.element;
        }

        @Override // com.bytedance.ies.xbridge.base.runtime.p1293b.AbstractC18427a
        /* renamed from: d */
        public final String mo29456d() {
            return this.f44079d.element;
        }

        @Override // com.bytedance.ies.xbridge.base.runtime.p1293b.AbstractC18427a
        /* renamed from: e */
        public final Throwable mo29457e() {
            return this.f44080e.element;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|(1:3)|4|5|(1:16)(2:9|(2:11|13)(1:17))) */
        /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000b */
        @Override // com.bytedance.ies.xbridge.base.runtime.p1293b.AbstractC18427a
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo29458f() {
            /*
                r2 = this;
                h.f.b.z$e r0 = r2.f44078c     // Catch:{ all -> 0x000b }
                T r0 = r0.element     // Catch:{ all -> 0x000b }
                java.io.InputStream r0 = (java.io.InputStream) r0     // Catch:{ all -> 0x000b }
                if (r0 == 0) goto L_0x000b
                r0.close()     // Catch:{ all -> 0x000b }
            L_0x000b:
                h.f.b.z$e r0 = r2.f44081f     // Catch:{ all -> 0x0029 }
                T r0 = r0.element     // Catch:{ all -> 0x0029 }
                java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0     // Catch:{ all -> 0x0029 }
                if (r0 == 0) goto L_0x0029
                java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x0029 }
                com.bytedance.retrofit2.b r1 = (com.bytedance.retrofit2.AbstractC21983b) r1     // Catch:{ all -> 0x0029 }
                if (r1 == 0) goto L_0x0029
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154709a(r1, r0)     // Catch:{ all -> 0x0029 }
                boolean r0 = r1.isCanceled()     // Catch:{ all -> 0x0029 }
                if (r0 != 0) goto L_0x0029
                r1.cancel()     // Catch:{ all -> 0x0029 }
            L_0x0029:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xbridge.base.runtime.p1295d.C18448g.C18449a.mo29458f():void");
        }

        C18449a(LinkedHashMap linkedHashMap, C89233z.C89236c cVar, C89233z.C89238e eVar, C89233z.C89238e eVar2, C89233z.C89238e eVar3, C89233z.C89238e eVar4) {
            this.f44076a = linkedHashMap;
            this.f44077b = cVar;
            this.f44078c = eVar;
            this.f44079d = eVar2;
            this.f44080e = eVar3;
            this.f44081f = eVar4;
        }
    }

    /* renamed from: com.bytedance.ies.xbridge.base.runtime.d.g$b */
    public static final class C18450b extends AbstractC18428b {

        /* renamed from: a */
        final /* synthetic */ LinkedHashMap f44082a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89236c f44083b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89238e f44084c;

        /* renamed from: d */
        final /* synthetic */ C89233z.C89238e f44085d;

        /* renamed from: e */
        final /* synthetic */ C89233z.C89238e f44086e;

        static {
            Covode.recordClassIndex(21124);
        }

        @Override // com.bytedance.ies.xbridge.base.runtime.p1293b.AbstractC18428b
        /* renamed from: b */
        public final LinkedHashMap<String, String> mo29460b() {
            return this.f44082a;
        }

        @Override // com.bytedance.ies.xbridge.base.runtime.p1293b.AbstractC18428b
        /* renamed from: a */
        public final String mo29459a() {
            return this.f44084c.element;
        }

        @Override // com.bytedance.ies.xbridge.base.runtime.p1293b.AbstractC18428b
        /* renamed from: d */
        public final String mo29462d() {
            return this.f44085d.element;
        }

        @Override // com.bytedance.ies.xbridge.base.runtime.p1293b.AbstractC18428b
        /* renamed from: e */
        public final Throwable mo29463e() {
            return this.f44086e.element;
        }

        @Override // com.bytedance.ies.xbridge.base.runtime.p1293b.AbstractC18428b
        /* renamed from: c */
        public final Integer mo29461c() {
            return Integer.valueOf(this.f44083b.element);
        }

        C18450b(LinkedHashMap linkedHashMap, C89233z.C89236c cVar, C89233z.C89238e eVar, C89233z.C89238e eVar2, C89233z.C89238e eVar3) {
            this.f44082a = linkedHashMap;
            this.f44083b = cVar;
            this.f44084c = eVar;
            this.f44085d = eVar2;
            this.f44086e = eVar3;
        }
    }

    private C18448g() {
    }

    static {
        Covode.recordClassIndex(21122);
    }

    /* renamed from: a */
    private static C89386u<String, String, LinkedHashMap<String, String>> m34312a(C18429c cVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Pair<String, String> a = C14759i.m27066a(new C14758h(cVar.f44049k).mo23776a(), linkedHashMap);
        return new C89386u<>(a.first, a.second, linkedHashMap);
    }

    /* renamed from: c */
    private static C22944d m34315c(C18429c cVar) {
        C22944d dVar = new C22944d();
        dVar.f35400c = cVar.f44045g;
        dVar.f35401d = cVar.f44046h;
        dVar.f35402e = cVar.f44047i;
        return dVar;
    }

    /* renamed from: b */
    private static List<C22027b> m34314b(C18429c cVar) {
        ArrayList arrayList = new ArrayList();
        LinkedHashMap<String, String> linkedHashMap = cVar.f44039a;
        if (linkedHashMap != null) {
            for (Map.Entry<String, String> entry : linkedHashMap.entrySet()) {
                arrayList.add(new C22027b(entry.getKey(), entry.getValue()));
            }
        }
        String str = cVar.f44043e;
        if (str != null) {
            arrayList.add(new C22027b("Content-Encoding", str));
        }
        String str2 = cVar.f44044f;
        if (str2 != null) {
            arrayList.add(new C22027b("Content-Type", str2));
        }
        return arrayList;
    }

    /* renamed from: d */
    private static TypedOutput m34316d(C18429c cVar) {
        LinkedHashMap<String, File> linkedHashMap = cVar.f44048j;
        if (linkedHashMap != null && (!linkedHashMap.isEmpty())) {
            MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
            Map<String, String> map = cVar.f44041c;
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    multipartTypedOutput.addPart(entry.getKey(), new TypedString(entry.getValue()));
                }
            }
            for (Map.Entry<String, File> entry2 : linkedHashMap.entrySet()) {
                multipartTypedOutput.addPart(entry2.getKey(), new TypedFile(null, entry2.getValue()));
            }
            return multipartTypedOutput;
        } else if (cVar.f44042d != null) {
            return new TypedByteArray(cVar.f44044f, cVar.f44042d, new String[0]);
        } else {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b9, code lost:
        if (r11 == null) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00e2, code lost:
        if (r11 != null) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00e4, code lost:
        r2.element = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r6 = r11.execute();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00eb, code lost:
        if (r6 == null) goto L_0x01d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ed, code lost:
        r2.element = r6.mo35904a();
        r9.element = r6.f52262b;
        r5 = r6.mo35905b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00fd, code lost:
        if (r5 == null) goto L_0x01d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ff, code lost:
        r7 = r5.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0107, code lost:
        if (r7.hasNext() == false) goto L_0x0120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0109, code lost:
        r5 = r7.next();
        p4600h.p4611f.p4613b.C89219l.m154709a((java.lang.Object) r5, "");
        r6 = r5.f52037a;
        p4600h.p4611f.p4613b.C89219l.m154709a((java.lang.Object) r6, "");
        r5 = r5.f52038b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0119, code lost:
        if (r5 != null) goto L_0x011c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x011b, code lost:
        r5 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x011c, code lost:
        r10.put(r6, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0120, code lost:
        r3 = p4600h.C89391z.f203057a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0124, code lost:
        r5 = move-exception;
        r5 = (T) r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0125, code lost:
        r1.element = (T) (r5.getClass().toString() + ":" + r5.getMessage() + "," + r5.getStatusCode());
        r2.element = r5.getStatusCode();
        r0.element = r5;
        r3 = p4600h.C89391z.f203057a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x015f, code lost:
        r5 = move-exception;
        r5 = (T) r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0160, code lost:
        r1.element = (T) (r5.getClass().toString() + ":" + r5.getMessage() + ',' + -1001);
        r2.element = -1001;
        r0.element = r5;
        r3 = p4600h.C89391z.f203057a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0196, code lost:
        r5 = move-exception;
        r5 = (T) r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0197, code lost:
        r1.element = (T) (r5.getClass().toString() + ":" + r5.getMessage() + "," + r5.getStatusCode());
        r2.element = r5.getStatusCode();
        r0.element = r5;
        r3 = p4600h.C89391z.f203057a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x01d0, code lost:
        if (r3 == null) goto L_0x01d2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bytedance.ies.xbridge.base.runtime.p1293b.AbstractC18428b m34311a(com.bytedance.ies.xbridge.base.runtime.p1293b.EnumC18434f r19, com.bytedance.ies.xbridge.base.runtime.p1293b.C18429c r20, com.bytedance.ies.xbridge.base.runtime.depend.IHostNetworkDepend r21) {
        /*
        // Method dump skipped, instructions count: 506
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xbridge.base.runtime.p1295d.C18448g.m34311a(com.bytedance.ies.xbridge.base.runtime.b.f, com.bytedance.ies.xbridge.base.runtime.b.c, com.bytedance.ies.xbridge.base.runtime.depend.IHostNetworkDepend):com.bytedance.ies.xbridge.base.runtime.b.b");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0167, code lost:
        if (r0 != null) goto L_0x0186;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bytedance.ies.xbridge.base.runtime.p1293b.AbstractC18427a m34313b(com.bytedance.ies.xbridge.base.runtime.p1293b.EnumC18434f r20, com.bytedance.ies.xbridge.base.runtime.p1293b.C18429c r21, com.bytedance.ies.xbridge.base.runtime.depend.IHostNetworkDepend r22) {
        /*
        // Method dump skipped, instructions count: 402
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xbridge.base.runtime.p1295d.C18448g.m34313b(com.bytedance.ies.xbridge.base.runtime.b.f, com.bytedance.ies.xbridge.base.runtime.b.c, com.bytedance.ies.xbridge.base.runtime.depend.IHostNetworkDepend):com.bytedance.ies.xbridge.base.runtime.b.a");
    }
}
