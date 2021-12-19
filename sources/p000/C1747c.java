package p000;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.AbstractC27255q;
import com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f;
import com.p2082ss.android.ugc.aweme.services.effect.EffectService;
import com.p2082ss.android.ugc.aweme.services.effect.IEffectService;

/* renamed from: c */
public final class C1747c {

    /* renamed from: a */
    public static AbstractC46415f f5612a;

    /* renamed from: b */
    public static final C1748a f5613b = new C1748a();

    /* renamed from: c */
    public static final C1747c f5614c = new C1747c();

    /* renamed from: c$a */
    public static final class C1748a implements AbstractC27255q<IEffectService> {

        /* renamed from: a */
        public IEffectService f5615a;

        static {
            Covode.recordClassIndex(1918);
        }

        C1748a() {
        }

        /* renamed from: a */
        public final IEffectService mo5560b() {
            if (this.f5615a == null) {
                this.f5615a = EffectService.getInstance();
            }
            return this.f5615a;
        }
    }

    private C1747c() {
    }

    static {
        Covode.recordClassIndex(1917);
    }
}
