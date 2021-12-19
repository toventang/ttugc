package com.bytedance.helios.sdk.p1092a;

import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.HeliosEnvImpl;
import com.bytedance.helios.sdk.utils.HandlerThreadC15486g;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.helios.sdk.a.a */
public final class C15348a {

    /* renamed from: a */
    public static final C15348a f37434a = new C15348a();

    /* renamed from: b */
    private static final List<String> f37435b = HeliosEnvImpl.INSTANCE.getInterestedAppOps();

    /* renamed from: c */
    private static final boolean f37436c = HeliosEnvImpl.INSTANCE.getAppOpsIgnoreKnownApi();

    /* renamed from: d */
    private static final Set<String> f37437d = new LinkedHashSet();

    private C15348a() {
    }

    /* renamed from: com.bytedance.helios.sdk.a.a$a */
    static final class RunnableC15349a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f37438a;

        /* renamed from: b */
        final /* synthetic */ Throwable f37439b;

        /* renamed from: c */
        final /* synthetic */ int f37440c = 3;

        /* renamed from: d */
        final /* synthetic */ boolean f37441d;

        static {
            Covode.recordClassIndex(17600);
        }

        RunnableC15349a(String str, Throwable th, boolean z) {
            this.f37438a = str;
            this.f37439b = th;
            this.f37441d = z;
        }

        public final void run() {
            C15348a.m28247a(this.f37438a, this.f37439b, this.f37440c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.helios.sdk.a.a$b */
    public static final class RunnableC15350b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f37442a;

        /* renamed from: b */
        final /* synthetic */ Throwable f37443b;

        /* renamed from: c */
        final /* synthetic */ int f37444c;

        static {
            Covode.recordClassIndex(17601);
        }

        RunnableC15350b(String str, Throwable th, int i) {
            this.f37442a = str;
            this.f37443b = th;
            this.f37444c = i;
        }

        public final void run() {
            C15348a.m28247a(this.f37442a, this.f37443b, this.f37444c);
        }
    }

    static {
        Covode.recordClassIndex(17599);
    }

    /* renamed from: a */
    public static void m28246a(String str, int i, Throwable th) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(th, "");
        HandlerThreadC15486g.m28499b().post(new RunnableC15350b(str, th, i));
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x016c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m28247a(java.lang.String r30, java.lang.Throwable r31, int r32) {
        /*
        // Method dump skipped, instructions count: 367
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.helios.sdk.p1092a.C15348a.m28247a(java.lang.String, java.lang.Throwable, int):void");
    }
}
