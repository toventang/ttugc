package com.p2082ss.android.storageInit;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1733u.AbstractC23430a;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.storageInit.b */
public abstract class AbstractC30619b implements AbstractC23430a {

    /* renamed from: a */
    public static final C30620a f73163a = new C30620a((byte) 0);

    /* renamed from: b */
    private AtomicBoolean f73164b = new AtomicBoolean(false);

    static {
        Covode.recordClassIndex(37156);
    }

    @Override // com.bytedance.p1733u.AbstractC23430a
    /* renamed from: c */
    public File mo38200c() {
        return null;
    }

    @Override // com.bytedance.p1733u.AbstractC23430a
    /* renamed from: d */
    public boolean mo38201d() {
        return true;
    }

    /* renamed from: f */
    public abstract String mo54878f();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract boolean mo54879g();

    /* renamed from: com.ss.android.storageInit.b$a */
    public static final class C30620a {
        static {
            Covode.recordClassIndex(37157);
        }

        private C30620a() {
        }

        public /* synthetic */ C30620a(byte b) {
            this();
        }
    }

    /* renamed from: h */
    private void m62893h() {
        this.f73164b.set(false);
    }

    @Override // com.bytedance.p1733u.AbstractC23430a
    /* renamed from: a */
    public final String mo38198a() {
        return mo54878f();
    }

    @Override // com.bytedance.p1733u.AbstractC23430a
    /* renamed from: b */
    public final boolean mo38199b() {
        if (this.f73164b.get()) {
            return false;
        }
        try {
            this.f73164b.set(true);
            System.currentTimeMillis();
            mo54879g();
            System.currentTimeMillis();
            m62893h();
            return true;
        } catch (Exception unused) {
            m62893h();
            return false;
        } catch (Throwable th) {
            m62893h();
            throw th;
        }
    }
}
