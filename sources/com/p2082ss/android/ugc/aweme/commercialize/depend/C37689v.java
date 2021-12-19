package com.p2082ss.android.ugc.aweme.commercialize.depend;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.p995g.C14759i;
import com.bytedance.ies.android.base.runtime.depend.INetworkDepend;
import com.bytedance.ies.android.base.runtime.p1119a.AbstractC16092a;
import com.bytedance.ies.android.base.runtime.p1119a.AbstractC16093b;
import com.bytedance.ies.android.base.runtime.p1119a.C16094c;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedFile;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.mime.TypedString;
import com.bytedance.ttnet.p1703d.C22944d;
import com.p2082ss.android.common.util.C29844g;
import java.io.File;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p4600h.C89386u;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.commercialize.depend.v */
public final class C37689v implements INetworkDepend {

    /* renamed from: a */
    public static final C37690a f89042a = new C37690a((byte) 0);

    static {
        Covode.recordClassIndex(45122);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.depend.v$a */
    public static final class C37690a {
        static {
            Covode.recordClassIndex(45123);
        }

        private C37690a() {
        }

        public /* synthetic */ C37690a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.depend.v$c */
    public static final class C37692c extends AbstractC16093b {

        /* renamed from: a */
        final /* synthetic */ LinkedHashMap f89050a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89236c f89051b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89238e f89052c;

        /* renamed from: d */
        final /* synthetic */ C89233z.C89238e f89053d;

        /* renamed from: e */
        final /* synthetic */ C89233z.C89238e f89054e;

        static {
            Covode.recordClassIndex(45125);
        }

        @Override // com.bytedance.ies.android.base.runtime.p1119a.AbstractC16093b
        /* renamed from: a */
        public final LinkedHashMap<String, String> mo25543a() {
            return this.f89050a;
        }

        @Override // com.bytedance.ies.android.base.runtime.p1119a.AbstractC16093b
        /* renamed from: c */
        public final String mo25545c() {
            return this.f89053d.element;
        }

        @Override // com.bytedance.ies.android.base.runtime.p1119a.AbstractC16093b
        /* renamed from: d */
        public final Throwable mo25546d() {
            return this.f89054e.element;
        }

        @Override // com.bytedance.ies.android.base.runtime.p1119a.AbstractC16093b
        /* renamed from: b */
        public final Integer mo25544b() {
            return Integer.valueOf(this.f89051b.element);
        }

        C37692c(LinkedHashMap linkedHashMap, C89233z.C89236c cVar, C89233z.C89238e eVar, C89233z.C89238e eVar2, C89233z.C89238e eVar3) {
            this.f89050a = linkedHashMap;
            this.f89051b = cVar;
            this.f89052c = eVar;
            this.f89053d = eVar2;
            this.f89054e = eVar3;
        }
    }

    /* renamed from: c */
    private static C22944d m76188c(C16094c cVar) {
        C22944d dVar = new C22944d();
        dVar.f35400c = cVar.f38761g;
        dVar.f35401d = cVar.f38762h;
        dVar.f35402e = cVar.f38763i;
        return dVar;
    }

    /* renamed from: d */
    private static C89386u<String, String, LinkedHashMap<String, String>> m76189d(C16094c cVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Pair<String, String> a = C14759i.m27066a(new C29844g(cVar.f38765k).mo52126a(), linkedHashMap);
        return new C89386u<>(a.first, a.second, linkedHashMap);
    }

    /* renamed from: a */
    private static List<C22027b> m76185a(C16094c cVar) {
        ArrayList arrayList = new ArrayList();
        LinkedHashMap<String, String> linkedHashMap = cVar.f38755a;
        if (linkedHashMap != null) {
            for (Map.Entry<String, String> entry : linkedHashMap.entrySet()) {
                arrayList.add(new C22027b(entry.getKey(), entry.getValue()));
            }
        }
        String str = cVar.f38759e;
        if (str != null) {
            arrayList.add(new C22027b("Content-Encoding", str));
        }
        String str2 = cVar.f38760f;
        if (str2 != null) {
            arrayList.add(new C22027b("Content-Type", str2));
        }
        return arrayList;
    }

    /* renamed from: b */
    private static TypedOutput m76187b(C16094c cVar) {
        LinkedHashMap<String, File> linkedHashMap = cVar.f38764j;
        if (linkedHashMap != null && (!linkedHashMap.isEmpty())) {
            MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
            Map<String, String> map = cVar.f38757c;
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    multipartTypedOutput.addPart(entry.getKey(), new TypedString(entry.getValue()));
                }
            }
            for (Map.Entry<String, File> entry2 : linkedHashMap.entrySet()) {
                multipartTypedOutput.addPart(entry2.getKey(), new TypedFile(null, entry2.getValue()));
            }
            return multipartTypedOutput;
        } else if (cVar.f38758d != null) {
            return new TypedByteArray(cVar.f38760f, cVar.f38758d, new String[0]);
        } else {
            return null;
        }
    }

    /* renamed from: a */
    private static void m76186a(InputStream inputStream, WeakReference<AbstractC21983b<TypedInput>> weakReference) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (Throwable unused) {
            }
        }
        if (weakReference != null) {
            try {
                AbstractC21983b<TypedInput> bVar = weakReference.get();
                if (bVar != null) {
                    C89219l.m154716b(bVar, "");
                    if (!bVar.isCanceled()) {
                        bVar.cancel();
                    }
                }
            } catch (Throwable unused2) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c6, code lost:
        if (r11 == null) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01b0, code lost:
        if (r4 != null) goto L_0x01cf;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0097 A[Catch:{ all -> 0x01c8 }] */
    @Override // com.bytedance.ies.android.base.runtime.depend.INetworkDepend
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.ies.android.base.runtime.p1119a.AbstractC16092a requestForStream(com.bytedance.ies.android.base.runtime.p1119a.EnumC16098e r24, com.bytedance.ies.android.base.runtime.p1119a.C16094c r25) {
        /*
        // Method dump skipped, instructions count: 478
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.commercialize.depend.C37689v.requestForStream(com.bytedance.ies.android.base.runtime.a.e, com.bytedance.ies.android.base.runtime.a.c):com.bytedance.ies.android.base.runtime.a.a");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00bf, code lost:
        if (r11 == null) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0184, code lost:
        if (r1 != null) goto L_0x01a3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0094 A[Catch:{ all -> 0x019c }] */
    @Override // com.bytedance.ies.android.base.runtime.depend.INetworkDepend
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.ies.android.base.runtime.p1119a.AbstractC16093b requestForString(com.bytedance.ies.android.base.runtime.p1119a.EnumC16098e r23, com.bytedance.ies.android.base.runtime.p1119a.C16094c r24) {
        /*
        // Method dump skipped, instructions count: 430
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.commercialize.depend.C37689v.requestForString(com.bytedance.ies.android.base.runtime.a.e, com.bytedance.ies.android.base.runtime.a.c):com.bytedance.ies.android.base.runtime.a.b");
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.depend.v$b */
    public static final class C37691b extends AbstractC16092a {

        /* renamed from: a */
        final /* synthetic */ C37689v f89043a;

        /* renamed from: b */
        final /* synthetic */ LinkedHashMap f89044b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89236c f89045c;

        /* renamed from: d */
        final /* synthetic */ C89233z.C89238e f89046d;

        /* renamed from: e */
        final /* synthetic */ C89233z.C89238e f89047e;

        /* renamed from: f */
        final /* synthetic */ C89233z.C89238e f89048f;

        /* renamed from: g */
        final /* synthetic */ C89233z.C89238e f89049g;

        static {
            Covode.recordClassIndex(45124);
        }

        C37691b(C37689v vVar, LinkedHashMap linkedHashMap, C89233z.C89236c cVar, C89233z.C89238e eVar, C89233z.C89238e eVar2, C89233z.C89238e eVar3, C89233z.C89238e eVar4) {
            this.f89043a = vVar;
            this.f89044b = linkedHashMap;
            this.f89045c = cVar;
            this.f89046d = eVar;
            this.f89047e = eVar2;
            this.f89048f = eVar3;
            this.f89049g = eVar4;
        }
    }
}
