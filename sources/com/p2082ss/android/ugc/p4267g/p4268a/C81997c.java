package com.p2082ss.android.ugc.p4267g.p4268a;

import com.bytedance.covode.number.Covode;
import com.bytedance.netecho.NetechoConfig;
import com.p2082ss.android.ugc.p4267g.p4268a.p4269a.C81987b;
import com.p2082ss.android.ugc.p4267g.p4268a.p4269a.C81989d;
import com.p2082ss.android.ugc.p4267g.p4268a.p4271c.C82001b;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.g.a.c */
public final class C81997c {

    /* renamed from: a */
    static ConcurrentHashMap<Long, C82001b> f183510a = new ConcurrentHashMap<>();

    /* renamed from: b */
    public static final C81997c f183511b = new C81997c();

    /* renamed from: c */
    private static volatile AtomicLong f183512c = new AtomicLong(10);

    private C81997c() {
    }

    static {
        Covode.recordClassIndex(95812);
        NetechoConfig.INSTANCE.setLoadLibrary(C819981.f183513a);
    }

    /* renamed from: a */
    public static void m141957a(long j) {
        C82001b bVar = f183510a.get(Long.valueOf(j));
        if (bVar != null) {
            bVar.mo127167a();
            f183510a.remove(Long.valueOf(j));
        }
        C82003d.m141961a(j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.g.a.c$a */
    public static final class C81999a extends AbstractC89220m implements AbstractC89172b<Long, C89391z> {

        /* renamed from: a */
        final /* synthetic */ long f183514a;

        /* renamed from: b */
        final /* synthetic */ C81987b f183515b;

        /* renamed from: c */
        final /* synthetic */ C81989d f183516c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89183m f183517d;

        /* renamed from: e */
        final /* synthetic */ AbstractC89172b f183518e;

        static {
            Covode.recordClassIndex(95814);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81999a(long j, C81987b bVar, C81989d dVar, AbstractC89183m mVar, AbstractC89172b bVar2) {
            super(1);
            this.f183514a = j;
            this.f183515b = bVar;
            this.f183516c = dVar;
            this.f183517d = mVar;
            this.f183518e = bVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x006f, code lost:
            if (r1 <= r9.f183474f) goto L_0x0071;
         */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0044 A[Catch:{ all -> 0x00df }] */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0076 A[Catch:{ all -> 0x00df }] */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x00b5 A[Catch:{ all -> 0x00df }] */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x00cc A[Catch:{ all -> 0x00df }] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ p4600h.C89391z invoke(java.lang.Long r17) {
            /*
            // Method dump skipped, instructions count: 226
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.p4267g.p4268a.C81997c.C81999a.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: a */
    public static long m141955a(C81987b bVar, C81989d dVar, AbstractC89183m<? super EnumC81991b, ? super HashMap<String, HashMap<String, Object>>, C89391z> mVar, AbstractC89172b<? super HashMap<String, Object>, C89391z> bVar2) {
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(dVar, "");
        C89219l.m154719c(mVar, "");
        C89219l.m154719c(bVar2, "");
        long incrementAndGet = f183512c.incrementAndGet();
        f183510a.put(Long.valueOf(incrementAndGet), m141956a(incrementAndGet, bVar, dVar, mVar, bVar2));
        return incrementAndGet;
    }

    /* renamed from: a */
    private static C82001b m141956a(long j, C81987b bVar, C81989d dVar, AbstractC89183m<? super EnumC81991b, ? super HashMap<String, HashMap<String, Object>>, C89391z> mVar, AbstractC89172b<? super HashMap<String, Object>, C89391z> bVar2) {
        C82001b bVar3 = new C82001b();
        bVar3.mo127168a((long) bVar.f183469a, new C81999a(j, bVar, dVar, mVar, bVar2));
        return bVar3;
    }
}
