package androidx.p043e.p044a;

import android.os.Build;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import androidx.core.p037h.C0792v;
import androidx.p043e.p044a.AbstractC0855b;
import androidx.p043e.p044a.C0847a;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* renamed from: androidx.e.a.b */
public abstract class AbstractC0855b<T extends AbstractC0855b<T>> implements C0847a.AbstractC0849b {

    /* renamed from: a */
    public static final AbstractC0873d f3138a = new AbstractC0873d("translationX") {
        /* class androidx.p043e.p044a.AbstractC0855b.C08561 */

        static {
            Covode.recordClassIndex(942);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.p043e.p044a.AbstractC0874c
        /* renamed from: a */
        public final /* synthetic */ float mo3153a(View view) {
            return view.getTranslationX();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, float] */
        @Override // androidx.p043e.p044a.AbstractC0874c
        /* renamed from: a */
        public final /* synthetic */ void mo3154a(View view, float f) {
            view.setTranslationX(f);
        }
    };

    /* renamed from: b */
    public static final AbstractC0873d f3139b = new AbstractC0873d("translationY") {
        /* class androidx.p043e.p044a.AbstractC0855b.C08677 */

        static {
            Covode.recordClassIndex(953);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.p043e.p044a.AbstractC0874c
        /* renamed from: a */
        public final /* synthetic */ float mo3153a(View view) {
            return view.getTranslationY();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, float] */
        @Override // androidx.p043e.p044a.AbstractC0874c
        /* renamed from: a */
        public final /* synthetic */ void mo3154a(View view, float f) {
            view.setTranslationY(f);
        }
    };

    /* renamed from: c */
    public static final AbstractC0873d f3140c = new AbstractC0873d("translationZ") {
        /* class androidx.p043e.p044a.AbstractC0855b.C08688 */

        static {
            Covode.recordClassIndex(954);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.p043e.p044a.AbstractC0874c
        /* renamed from: a */
        public final /* synthetic */ float mo3153a(View view) {
            View view2 = view;
            if (Build.VERSION.SDK_INT >= 21) {
                return view2.getTranslationZ();
            }
            return 0.0f;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, float] */
        @Override // androidx.p043e.p044a.AbstractC0874c
        /* renamed from: a */
        public final /* synthetic */ void mo3154a(View view, float f) {
            C0792v.m2758b(view, f);
        }
    };

    /* renamed from: d */
    public static final AbstractC0873d f3141d = new AbstractC0873d("scaleX") {
        /* class androidx.p043e.p044a.AbstractC0855b.C08699 */

        static {
            Covode.recordClassIndex(955);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.p043e.p044a.AbstractC0874c
        /* renamed from: a */
        public final /* synthetic */ float mo3153a(View view) {
            return view.getScaleX();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, float] */
        @Override // androidx.p043e.p044a.AbstractC0874c
        /* renamed from: a */
        public final /* synthetic */ void mo3154a(View view, float f) {
            view.setScaleX(f);
        }
    };

    /* renamed from: e */
    public static final AbstractC0873d f3142e = new AbstractC0873d("scaleY") {
        /* class androidx.p043e.p044a.AbstractC0855b.C085710 */

        static {
            Covode.recordClassIndex(943);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.p043e.p044a.AbstractC0874c
        /* renamed from: a */
        public final /* synthetic */ float mo3153a(View view) {
            return view.getScaleY();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, float] */
        @Override // androidx.p043e.p044a.AbstractC0874c
        /* renamed from: a */
        public final /* synthetic */ void mo3154a(View view, float f) {
            view.setScaleY(f);
        }
    };

    /* renamed from: f */
    public static final AbstractC0873d f3143f = new AbstractC0873d("rotation") {
        /* class androidx.p043e.p044a.AbstractC0855b.C085811 */

        static {
            Covode.recordClassIndex(944);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.p043e.p044a.AbstractC0874c
        /* renamed from: a */
        public final /* synthetic */ float mo3153a(View view) {
            return view.getRotation();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, float] */
        @Override // androidx.p043e.p044a.AbstractC0874c
        /* renamed from: a */
        public final /* synthetic */ void mo3154a(View view, float f) {
            view.setRotation(f);
        }
    };

    /* renamed from: g */
    public static final AbstractC0873d f3144g = new AbstractC0873d("rotationX") {
        /* class androidx.p043e.p044a.AbstractC0855b.C085912 */

        static {
            Covode.recordClassIndex(945);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.p043e.p044a.AbstractC0874c
        /* renamed from: a */
        public final /* synthetic */ float mo3153a(View view) {
            return view.getRotationX();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, float] */
        @Override // androidx.p043e.p044a.AbstractC0874c
        /* renamed from: a */
        public final /* synthetic */ void mo3154a(View view, float f) {
            view.setRotationX(f);
        }
    };

    /* renamed from: h */
    public static final AbstractC0873d f3145h = new AbstractC0873d("rotationY") {
        /* class androidx.p043e.p044a.AbstractC0855b.C086013 */

        static {
            Covode.recordClassIndex(946);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.p043e.p044a.AbstractC0874c
        /* renamed from: a */
        public final /* synthetic */ float mo3153a(View view) {
            return view.getRotationY();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, float] */
        @Override // androidx.p043e.p044a.AbstractC0874c
        /* renamed from: a */
        public final /* synthetic */ void mo3154a(View view, float f) {
            view.setRotationY(f);
        }
    };

    /* renamed from: i */
    public static final AbstractC0873d f3146i = new AbstractC0873d("x") {
        /* class androidx.p043e.p044a.AbstractC0855b.C086114 */

        static {
            Covode.recordClassIndex(947);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.p043e.p044a.AbstractC0874c
        /* renamed from: a */
        public final /* synthetic */ float mo3153a(View view) {
            return view.getX();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, float] */
        @Override // androidx.p043e.p044a.AbstractC0874c
        /* renamed from: a */
        public final /* synthetic */ void mo3154a(View view, float f) {
            view.setX(f);
        }
    };

    /* renamed from: j */
    public static final AbstractC0873d f3147j = new AbstractC0873d("y") {
        /* class androidx.p043e.p044a.AbstractC0855b.C08622 */

        static {
            Covode.recordClassIndex(948);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.p043e.p044a.AbstractC0874c
        /* renamed from: a */
        public final /* synthetic */ float mo3153a(View view) {
            return view.getY();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, float] */
        @Override // androidx.p043e.p044a.AbstractC0874c
        /* renamed from: a */
        public final /* synthetic */ void mo3154a(View view, float f) {
            view.setY(f);
        }
    };

    /* renamed from: k */
    public static final AbstractC0873d f3148k = new AbstractC0873d("z") {
        /* class androidx.p043e.p044a.AbstractC0855b.C08633 */

        static {
            Covode.recordClassIndex(949);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.p043e.p044a.AbstractC0874c
        /* renamed from: a */
        public final /* synthetic */ float mo3153a(View view) {
            return C0792v.m2789w(view);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, float] */
        @Override // androidx.p043e.p044a.AbstractC0874c
        /* renamed from: a */
        public final /* synthetic */ void mo3154a(View view, float f) {
            C0792v.m2765c(view, f);
        }
    };

    /* renamed from: l */
    public static final AbstractC0873d f3149l = new AbstractC0873d("alpha") {
        /* class androidx.p043e.p044a.AbstractC0855b.C08644 */

        static {
            Covode.recordClassIndex(950);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.p043e.p044a.AbstractC0874c
        /* renamed from: a */
        public final /* synthetic */ float mo3153a(View view) {
            return view.getAlpha();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, float] */
        @Override // androidx.p043e.p044a.AbstractC0874c
        /* renamed from: a */
        public final /* synthetic */ void mo3154a(View view, float f) {
            view.setAlpha(f);
        }
    };

    /* renamed from: m */
    public static final AbstractC0873d f3150m = new AbstractC0873d("scrollX") {
        /* class androidx.p043e.p044a.AbstractC0855b.C08655 */

        static {
            Covode.recordClassIndex(951);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.p043e.p044a.AbstractC0874c
        /* renamed from: a */
        public final /* synthetic */ float mo3153a(View view) {
            return (float) view.getScrollX();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, float] */
        @Override // androidx.p043e.p044a.AbstractC0874c
        /* renamed from: a */
        public final /* synthetic */ void mo3154a(View view, float f) {
            view.setScrollX((int) f);
        }
    };

    /* renamed from: n */
    public static final AbstractC0873d f3151n = new AbstractC0873d("scrollY") {
        /* class androidx.p043e.p044a.AbstractC0855b.C08666 */

        static {
            Covode.recordClassIndex(952);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.p043e.p044a.AbstractC0874c
        /* renamed from: a */
        public final /* synthetic */ float mo3153a(View view) {
            return (float) view.getScrollY();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, float] */
        @Override // androidx.p043e.p044a.AbstractC0874c
        /* renamed from: a */
        public final /* synthetic */ void mo3154a(View view, float f) {
            view.setScrollY((int) f);
        }
    };

    /* renamed from: o */
    float f3152o;

    /* renamed from: p */
    float f3153p = Float.MAX_VALUE;

    /* renamed from: q */
    boolean f3154q;

    /* renamed from: r */
    final Object f3155r;

    /* renamed from: s */
    final AbstractC0874c f3156s;

    /* renamed from: t */
    public boolean f3157t;

    /* renamed from: u */
    float f3158u = Float.MAX_VALUE;

    /* renamed from: v */
    float f3159v = (-Float.MAX_VALUE);

    /* renamed from: w */
    public float f3160w;

    /* renamed from: x */
    private long f3161x;

    /* renamed from: y */
    private final ArrayList<AbstractC0871b> f3162y = new ArrayList<>();

    /* renamed from: z */
    private final ArrayList<AbstractC0872c> f3163z = new ArrayList<>();

    /* renamed from: androidx.e.a.b$b */
    public interface AbstractC0871b {
        static {
            Covode.recordClassIndex(957);
        }

        /* renamed from: a */
        void mo3155a();
    }

    /* renamed from: androidx.e.a.b$c */
    public interface AbstractC0872c {
        static {
            Covode.recordClassIndex(958);
        }

        /* renamed from: a */
        void mo3156a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract boolean mo3151b(long j);

    /* renamed from: androidx.e.a.b$a */
    static class C0870a {

        /* renamed from: a */
        float f3164a;

        /* renamed from: b */
        float f3165b;

        static {
            Covode.recordClassIndex(956);
        }

        C0870a() {
        }
    }

    /* renamed from: b */
    public final void mo3150b() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
        } else if (this.f3157t) {
            m3001c();
        }
    }

    /* renamed from: c */
    private void m3001c() {
        this.f3157t = false;
        C0847a.m2992a().mo3138a(this);
        this.f3161x = 0;
        this.f3154q = false;
        for (int i = 0; i < this.f3162y.size(); i++) {
            if (this.f3162y.get(i) != null) {
                this.f3162y.get(i).mo3155a();
            }
        }
        m3000a(this.f3162y);
    }

    /* renamed from: a */
    public void mo3148a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        } else if (!this.f3157t) {
            this.f3157t = true;
            if (!this.f3154q) {
                this.f3153p = this.f3156s.mo3153a(this.f3155r);
            }
            float f = this.f3153p;
            if (f > this.f3158u || f < this.f3159v) {
                throw new IllegalArgumentException("Starting value need to be in between min value and max value");
            }
            C0847a a = C0847a.m2992a();
            if (a.f3124c.size() == 0) {
                a.mo3139b().mo3142a();
            }
            if (!a.f3124c.contains(this)) {
                a.f3124c.add(this);
            }
        }
    }

    static {
        Covode.recordClassIndex(941);
    }

    /* renamed from: androidx.e.a.b$d */
    public static abstract class AbstractC0873d extends AbstractC0874c<View> {
        static {
            Covode.recordClassIndex(959);
        }

        private AbstractC0873d(String str) {
            super(str);
        }

        /* synthetic */ AbstractC0873d(String str, byte b) {
            this(str);
        }
    }

    /* renamed from: a */
    public final T mo3145a(float f) {
        this.f3152o = f;
        return this;
    }

    /* renamed from: b */
    public final T mo3149b(float f) {
        this.f3158u = f;
        return this;
    }

    /* renamed from: c */
    public final T mo3152c(float f) {
        this.f3159v = f;
        return this;
    }

    /* renamed from: a */
    public final T mo3146a(AbstractC0871b bVar) {
        if (!this.f3162y.contains(bVar)) {
            this.f3162y.add(bVar);
        }
        return this;
    }

    /* renamed from: a */
    private static <T> void m3000a(ArrayList<T> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    /* renamed from: d */
    private void m3002d(float f) {
        this.f3156s.mo3154a(this.f3155r, f);
        for (int i = 0; i < this.f3163z.size(); i++) {
            if (this.f3163z.get(i) != null) {
                this.f3163z.get(i).mo3156a();
            }
        }
        m3000a(this.f3163z);
    }

    /* renamed from: a */
    public final T mo3147a(AbstractC0872c cVar) {
        if (!this.f3157t) {
            if (!this.f3163z.contains(cVar)) {
                this.f3163z.add(cVar);
            }
            return this;
        }
        throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
    }

    @Override // androidx.p043e.p044a.C0847a.AbstractC0849b
    /* renamed from: a */
    public final boolean mo3141a(long j) {
        long j2 = this.f3161x;
        if (j2 == 0) {
            this.f3161x = j;
            m3002d(this.f3153p);
            return false;
        }
        this.f3161x = j;
        boolean b = mo3151b(j - j2);
        float min = Math.min(this.f3153p, this.f3158u);
        this.f3153p = min;
        float max = Math.max(min, this.f3159v);
        this.f3153p = max;
        m3002d(max);
        if (b) {
            m3001c();
        }
        return b;
    }

    <K> AbstractC0855b(K k, AbstractC0874c<K> cVar) {
        this.f3155r = k;
        this.f3156s = cVar;
        if (cVar == f3143f || cVar == f3144g || cVar == f3145h) {
            this.f3160w = 0.1f;
        } else if (cVar == f3149l) {
            this.f3160w = 0.00390625f;
        } else if (cVar == f3141d || cVar == f3142e) {
            this.f3160w = 0.00390625f;
        } else {
            this.f3160w = 1.0f;
        }
    }
}
