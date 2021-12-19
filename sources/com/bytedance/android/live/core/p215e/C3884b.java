package com.bytedance.android.live.core.p215e;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.core.e.b */
public final class C3884b {

    /* renamed from: c */
    public static final C3884b f10739c = new C3884b(EnumC3885a.RUNNING, null);

    /* renamed from: d */
    public static final C3884b f10740d = new C3884b(EnumC3885a.SUCCESS, null);

    /* renamed from: a */
    public EnumC3885a f10741a;

    /* renamed from: b */
    public Throwable f10742b;

    /* renamed from: a */
    public final boolean mo9243a() {
        if (this.f10741a == EnumC3885a.RUNNING) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo9244b() {
        if (this.f10741a == EnumC3885a.FAILED) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(4413);
    }

    /* renamed from: com.bytedance.android.live.core.e.b$a */
    public enum EnumC3885a {
        RUNNING(0),
        SUCCESS(1),
        FAILED(-1);
        
        public final int mStatus;

        static {
            Covode.recordClassIndex(4414);
        }

        private EnumC3885a(int i) {
            this.mStatus = i;
        }
    }

    /* renamed from: a */
    public static C3884b m9500a(Throwable th) {
        return new C3884b(EnumC3885a.FAILED, th);
    }

    private C3884b(EnumC3885a aVar, Throwable th) {
        this.f10741a = aVar;
        this.f10742b = th;
    }
}
