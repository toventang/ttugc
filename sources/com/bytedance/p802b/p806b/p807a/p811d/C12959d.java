package com.bytedance.p802b.p806b.p807a.p811d;

import com.bytedance.covode.number.Covode;
import com.bytedance.p802b.p806b.p807a.p810c.C12943a;
import com.bytedance.p802b.p806b.p807a.p811d.C12950a;
import com.bytedance.p802b.p806b.p807a.p812e.AbstractC12974d;
import com.bytedance.p802b.p841k.C13120c;
import com.bytedance.p802b.p841k.p845d.AbstractRunnableC13123a;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.bytedance.b.b.a.d.d */
public final class C12959d implements AbstractC12974d {

    /* renamed from: a */
    LinkedHashMap<AbstractC12964f, ConcurrentLinkedQueue<C12962b>> f31569a;

    /* renamed from: b */
    public AbstractRunnableC13123a f31570b;

    /* renamed from: c */
    public long f31571c;

    /* renamed from: d */
    public long f31572d;

    /* renamed from: e */
    long f31573e;

    static {
        Covode.recordClassIndex(14795);
    }

    @Override // com.bytedance.p802b.p806b.p807a.p812e.AbstractC12974d
    /* renamed from: c */
    public final String mo20787c() {
        return "second_log_dir";
    }

    /* renamed from: com.bytedance.b.b.a.d.d$a */
    public static class C12961a {

        /* renamed from: a */
        public static final C12959d f31575a = new C12959d((byte) 0);

        static {
            Covode.recordClassIndex(14797);
        }
    }

    /* renamed from: e */
    private static boolean m23262e() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo20819b() {
        this.f31573e = 1;
        this.f31571c = 30000;
    }

    private C12959d() {
        this.f31569a = new LinkedHashMap<>();
        this.f31571c = 30000;
        this.f31572d = 0;
        this.f31573e = 1;
    }

    @Override // com.bytedance.p802b.p806b.p807a.p812e.AbstractC12974d
    /* renamed from: d */
    public final long mo20788d() {
        File[] b = C12950a.C12952a.f31541a.mo20806b();
        long j = 0;
        if (b == null) {
            return 0;
        }
        for (File file : b) {
            j += file.length();
        }
        return j;
    }

    /* renamed from: a */
    public static boolean m23261a() {
        if (C58029j.f132253e && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132253e;
        }
        boolean e = m23262e();
        C58029j.f132253e = e;
        return e;
    }

    /* synthetic */ C12959d(byte b) {
        this();
    }

    /* renamed from: a */
    private static void m23260a(List<C12943a> list) {
        for (C12943a aVar : list) {
            try {
                if (aVar.f31521d != null) {
                    C13120c.m23592b(aVar.f31521d);
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.bytedance.p802b.p806b.p807a.p812e.AbstractC12974d
    /* renamed from: b */
    public final void mo20786b(long j) {
        File[] b = C12950a.C12952a.f31541a.mo20806b();
        if (b != null) {
            for (File file : b) {
                if (C12950a.m23239c(file) <= j) {
                    C13120c.m23592b(file);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if ((java.lang.System.currentTimeMillis() - r2.f31565k.get()) <= r2.mo20817d()) goto L_0x001d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo20818a(java.util.List<com.bytedance.p802b.p806b.p807a.p810c.C12943a> r21, int r22) {
        /*
        // Method dump skipped, instructions count: 377
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p802b.p806b.p807a.p811d.C12959d.mo20818a(java.util.List, int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.b.b.a.d.d$b */
    public static final class C12962b {

        /* renamed from: a */
        byte[] f31576a;

        /* renamed from: b */
        int f31577b;

        /* renamed from: c */
        long f31578c;

        static {
            Covode.recordClassIndex(14798);
        }

        C12962b(byte[] bArr, int i, long j) {
            this.f31576a = bArr;
            this.f31577b = i;
            this.f31578c = j;
        }
    }
}
