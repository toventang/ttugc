package com.p2082ss.android.ugc.aweme.p2690cr.p2702e;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1733u.AbstractC23430a;
import com.p2082ss.android.ugc.aweme.p2690cr.p2695b.EnumC40332b;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import java.io.File;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.cr.e.a */
public abstract class AbstractC40358a implements AbstractC23430a {

    /* renamed from: a */
    public static final C40359a f94548a = new C40359a((byte) 0);

    /* renamed from: b */
    private AtomicBoolean f94549b = new AtomicBoolean(false);

    static {
        Covode.recordClassIndex(48159);
    }

    @Override // com.bytedance.p1733u.AbstractC23430a
    /* renamed from: d */
    public final boolean mo38201d() {
        return true;
    }

    /* renamed from: f */
    public String mo69499f() {
        return "";
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract String mo69500g();

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract EnumC40332b mo69501h();

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract boolean mo69503j();

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract long mo69504k();

    /* renamed from: com.ss.android.ugc.aweme.cr.e.a$a */
    public static final class C40359a {
        static {
            Covode.recordClassIndex(48160);
        }

        private C40359a() {
        }

        public /* synthetic */ C40359a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo69502i() {
        this.f94549b.set(true);
    }

    @Override // com.bytedance.p1733u.AbstractC23430a
    /* renamed from: a */
    public final String mo38198a() {
        return mo69501h().toString();
    }

    @Override // com.bytedance.p1733u.AbstractC23430a
    /* renamed from: b */
    public final boolean mo38199b() {
        boolean z;
        Throwable th;
        Exception e;
        if (this.f94549b.get()) {
            return false;
        }
        try {
            mo69502i();
            long currentTimeMillis = System.currentTimeMillis();
            z = mo69503j();
            try {
                C63244g.m114602a().mo73279g().mo69467a().mo69513b(mo69500g(), System.currentTimeMillis() - currentTimeMillis);
                mo69498a(z);
                return z;
            } catch (Exception e2) {
                e = e2;
                try {
                    C63244g.m114602a().mo73279g().mo69467a().mo69510a(mo69500g(), e);
                    mo69498a(z);
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    mo69498a(z);
                    throw th;
                }
            }
        } catch (Exception e3) {
            e = e3;
            z = false;
            C63244g.m114602a().mo73279g().mo69467a().mo69510a(mo69500g(), e);
            mo69498a(z);
            return false;
        } catch (Throwable th3) {
            th = th3;
            z = false;
            mo69498a(z);
            throw th;
        }
    }

    @Override // com.bytedance.p1733u.AbstractC23430a
    /* renamed from: e */
    public final long mo38202e() {
        long j = 0;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            j = mo69504k();
            mo69500g();
            Object[] objArr = new Object[1];
            double d = (double) j;
            Double.isNaN(d);
            objArr[0] = Double.valueOf(d / 1048576.0d);
            C89219l.m154716b(C1764a.m5928a("%.1fMB", Arrays.copyOf(objArr, 1)), "");
            File c = mo38200c();
            C89219l.m154716b(c, "");
            c.getPath();
            C63244g.m114602a().mo73279g().mo69467a().mo69509a(mo69500g(), System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e) {
            C63244g.m114602a().mo73279g().mo69467a().mo69510a(mo69500g(), e);
        }
        return j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo69498a(boolean z) {
        this.f94549b.set(false);
    }
}
