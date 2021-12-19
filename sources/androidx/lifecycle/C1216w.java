package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.FragmentC1220x;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.lifecycle.w */
public final class C1216w implements AbstractC1204m {

    /* renamed from: i */
    public static final C1216w f4006i = new C1216w();

    /* renamed from: a */
    int f4007a;

    /* renamed from: b */
    int f4008b;

    /* renamed from: c */
    boolean f4009c = true;

    /* renamed from: d */
    boolean f4010d = true;

    /* renamed from: e */
    Handler f4011e;

    /* renamed from: f */
    final C1205n f4012f = new C1205n(this);

    /* renamed from: g */
    Runnable f4013g = new Runnable() {
        /* class androidx.lifecycle.C1216w.RunnableC12171 */

        static {
            Covode.recordClassIndex(1324);
        }

        public final void run() {
            C1216w wVar = C1216w.this;
            if (wVar.f4008b == 0) {
                wVar.f4009c = true;
                wVar.f4012f.mo4016a(AbstractC1196i.EnumC1198a.ON_PAUSE);
            }
            C1216w.this.mo4030a();
        }
    };

    /* renamed from: h */
    FragmentC1220x.AbstractC1221a f4014h = new FragmentC1220x.AbstractC1221a() {
        /* class androidx.lifecycle.C1216w.C12182 */

        static {
            Covode.recordClassIndex(1325);
        }

        @Override // androidx.lifecycle.FragmentC1220x.AbstractC1221a
        /* renamed from: a */
        public final void mo4032a() {
            C1216w wVar = C1216w.this;
            wVar.f4007a++;
            if (wVar.f4007a == 1 && wVar.f4010d) {
                wVar.f4012f.mo4016a(AbstractC1196i.EnumC1198a.ON_START);
                wVar.f4010d = false;
            }
        }

        @Override // androidx.lifecycle.FragmentC1220x.AbstractC1221a
        /* renamed from: b */
        public final void mo4033b() {
            C1216w wVar = C1216w.this;
            wVar.f4008b++;
            if (wVar.f4008b != 1) {
                return;
            }
            if (wVar.f4009c) {
                wVar.f4012f.mo4016a(AbstractC1196i.EnumC1198a.ON_RESUME);
                wVar.f4009c = false;
                return;
            }
            wVar.f4011e.removeCallbacks(wVar.f4013g);
        }
    };

    @Override // androidx.lifecycle.AbstractC1204m
    public final AbstractC1196i getLifecycle() {
        return this.f4012f;
    }

    static {
        Covode.recordClassIndex(1323);
    }

    private C1216w() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4030a() {
        if (this.f4007a == 0 && this.f4009c) {
            this.f4012f.mo4016a(AbstractC1196i.EnumC1198a.ON_STOP);
            this.f4010d = true;
        }
    }
}
