package com.lynx.tasm.behavior.p2050c;

import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.C28529q;

/* renamed from: com.lynx.tasm.behavior.c.k */
public abstract class AbstractC28493k {

    /* renamed from: b */
    public final C28494a f67006b;

    static {
        Covode.recordClassIndex(34491);
    }

    /* renamed from: a */
    public abstract void mo49012a(AbstractC28493k kVar);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo48990a(C28529q qVar);

    /* renamed from: com.lynx.tasm.behavior.c.k$a */
    public static class C28494a {

        /* renamed from: a */
        public final int f67007a;

        /* renamed from: b */
        private final int f67008b;

        /* renamed from: c */
        private final boolean f67009c;

        static {
            Covode.recordClassIndex(34492);
        }

        public int hashCode() {
            return (this.f67008b * 31) + this.f67007a;
        }

        public boolean equals(Object obj) {
            if (!this.f67009c) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C28494a)) {
                return false;
            }
            C28494a aVar = (C28494a) obj;
            if (this.f67007a == aVar.f67007a && this.f67008b == aVar.f67008b) {
                return true;
            }
            return false;
        }

        public C28494a(int i, int i2, boolean z) {
            this.f67007a = i;
            this.f67008b = i2;
            this.f67009c = z;
        }
    }

    /* renamed from: b */
    public final void mo49013b(C28529q qVar) {
        try {
            mo48990a(qVar);
        } catch (Exception e) {
            LLog.m56860b("lynx_UIOperation", "UIOperation exception: " + Log.getStackTraceString(e));
            qVar.f67111c.mo48666a(e);
        }
    }

    protected AbstractC28493k(int i, int i2, boolean z) {
        this.f67006b = new C28494a(i, i2, z);
    }
}
