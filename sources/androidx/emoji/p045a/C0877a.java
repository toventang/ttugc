package androidx.emoji.p045a;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.inputmethod.EditorInfo;
import androidx.core.p036g.C0697g;
import androidx.p025c.C0486b;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: androidx.emoji.a.a */
public final class C0877a {

    /* renamed from: h */
    private static final Object f3180h = new Object();

    /* renamed from: i */
    private static volatile C0877a f3181i;

    /* renamed from: a */
    public final C0878a f3182a;

    /* renamed from: b */
    final AbstractC0884f f3183b;

    /* renamed from: c */
    final boolean f3184c;

    /* renamed from: d */
    final boolean f3185d;

    /* renamed from: e */
    final int[] f3186e;

    /* renamed from: f */
    public final boolean f3187f;

    /* renamed from: g */
    public final int f3188g;

    /* renamed from: j */
    private final ReadWriteLock f3189j;

    /* renamed from: k */
    private final Set<AbstractC0882d> f3190k;

    /* renamed from: l */
    private int f3191l = 3;

    /* renamed from: m */
    private final Handler f3192m;

    /* renamed from: n */
    private final int f3193n;

    /* renamed from: androidx.emoji.a.a$d */
    public static abstract class AbstractC0882d {
        static {
            Covode.recordClassIndex(968);
        }

        /* renamed from: a */
        public void mo3175a() {
        }
    }

    /* renamed from: androidx.emoji.a.a$f */
    public interface AbstractC0884f {
        static {
            Covode.recordClassIndex(970);
        }

        /* renamed from: a */
        void mo3177a(AbstractC0885g gVar);
    }

    /* renamed from: androidx.emoji.a.a$g */
    public static abstract class AbstractC0885g {
        static {
            Covode.recordClassIndex(971);
        }

        /* renamed from: a */
        public abstract void mo3173a(C0903g gVar);

        /* renamed from: a */
        public abstract void mo3174a(Throwable th);
    }

    /* renamed from: androidx.emoji.a.a$h */
    static class C0886h {
        static {
            Covode.recordClassIndex(972);
        }

        C0886h() {
        }

        /* renamed from: a */
        static AbstractC0891d m3075a(C0887b bVar) {
            return new C0905h(bVar);
        }
    }

    /* renamed from: androidx.emoji.a.a$a */
    public static class C0878a {

        /* renamed from: a */
        final C0877a f3194a;

        static {
            Covode.recordClassIndex(964);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public CharSequence mo3170a(CharSequence charSequence, int i, int i2, int i3, boolean z) {
            return charSequence;
        }

        /* renamed from: a */
        public void mo3172a(EditorInfo editorInfo) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3171a() {
            this.f3194a.mo3167b();
        }

        C0878a(C0877a aVar) {
            this.f3194a = aVar;
        }
    }

    static {
        Covode.recordClassIndex(963);
    }

    /* renamed from: d */
    public final boolean mo3169d() {
        if (mo3168c() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: androidx.emoji.a.a$b */
    static final class C0879b extends C0878a {

        /* renamed from: b */
        volatile C0888c f3195b;

        /* renamed from: c */
        volatile C0903g f3196c;

        static {
            Covode.recordClassIndex(965);
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.emoji.p045a.C0877a.C0878a
        /* renamed from: a */
        public final void mo3171a() {
            try {
                this.f3194a.f3183b.mo3177a(new AbstractC0885g() {
                    /* class androidx.emoji.p045a.C0877a.C0879b.C08801 */

                    static {
                        Covode.recordClassIndex(966);
                    }

                    @Override // androidx.emoji.p045a.C0877a.AbstractC0885g
                    /* renamed from: a */
                    public final void mo3174a(Throwable th) {
                        C0879b.this.f3194a.mo3166a(th);
                    }

                    @Override // androidx.emoji.p045a.C0877a.AbstractC0885g
                    /* renamed from: a */
                    public final void mo3173a(C0903g gVar) {
                        C0879b bVar = C0879b.this;
                        bVar.f3196c = gVar;
                        bVar.f3195b = new C0888c(bVar.f3196c, new C0886h(), bVar.f3194a.f3185d, bVar.f3194a.f3186e);
                        bVar.f3194a.mo3167b();
                    }
                });
            } catch (Throwable th) {
                this.f3194a.mo3166a(th);
            }
        }

        C0879b(C0877a aVar) {
            super(aVar);
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.emoji.p045a.C0877a.C0878a
        /* renamed from: a */
        public final void mo3172a(EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.f3196c.f3251a.mo3824a());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.f3194a.f3184c);
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.emoji.p045a.C0877a.C0878a
        /* renamed from: a */
        public final CharSequence mo3170a(CharSequence charSequence, int i, int i2, int i3, boolean z) {
            return this.f3195b.mo3182a(charSequence, i, i2, i3, z);
        }
    }

    /* renamed from: a */
    public static C0877a m3052a() {
        boolean z;
        C0877a aVar;
        synchronized (f3180h) {
            if (f3181i != null) {
                z = true;
            } else {
                z = false;
            }
            C0697g.m2455a(z, "EmojiCompat is not initialized. Please call EmojiCompat.init() first");
            aVar = f3181i;
        }
        return aVar;
    }

    /* renamed from: c */
    public final int mo3168c() {
        this.f3189j.readLock().lock();
        try {
            return this.f3191l;
        } finally {
            this.f3189j.readLock().unlock();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.emoji.a.a$e */
    public static class RunnableC0883e implements Runnable {

        /* renamed from: a */
        private final List<AbstractC0882d> f3206a;

        /* renamed from: b */
        private final Throwable f3207b;

        /* renamed from: c */
        private final int f3208c;

        static {
            Covode.recordClassIndex(969);
        }

        public final void run() {
            int size = this.f3206a.size();
            int i = 0;
            if (this.f3208c != 1) {
                while (i < size) {
                    this.f3206a.get(i);
                    i++;
                }
                return;
            }
            while (i < size) {
                this.f3206a.get(i).mo3175a();
                i++;
            }
        }

        RunnableC0883e(Collection<AbstractC0882d> collection, int i) {
            this(collection, i, null);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: androidx.emoji.a.a$d[] */
        /* JADX WARN: Multi-variable type inference failed */
        RunnableC0883e(AbstractC0882d dVar, int i) {
            this(Arrays.asList(C0697g.m2453a(dVar, "initCallback cannot be null")), i, null);
        }

        RunnableC0883e(Collection<AbstractC0882d> collection, int i, Throwable th) {
            C0697g.m2453a(collection, "initCallbacks cannot be null");
            this.f3206a = new ArrayList(collection);
            this.f3208c = i;
            this.f3207b = th;
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo3167b() {
        ArrayList arrayList = new ArrayList();
        this.f3189j.writeLock().lock();
        try {
            this.f3191l = 1;
            arrayList.addAll(this.f3190k);
            this.f3190k.clear();
            this.f3189j.writeLock().unlock();
            this.f3192m.post(new RunnableC0883e(arrayList, this.f3191l));
        } catch (Throwable th) {
            this.f3189j.writeLock().unlock();
            throw th;
        }
    }

    /* renamed from: androidx.emoji.a.a$c */
    public static abstract class AbstractC0881c {

        /* renamed from: a */
        public final AbstractC0884f f3198a;

        /* renamed from: b */
        public boolean f3199b;

        /* renamed from: c */
        boolean f3200c;

        /* renamed from: d */
        int[] f3201d;

        /* renamed from: e */
        Set<AbstractC0882d> f3202e;

        /* renamed from: f */
        boolean f3203f;

        /* renamed from: g */
        int f3204g = -16711936;

        /* renamed from: h */
        int f3205h;

        static {
            Covode.recordClassIndex(967);
        }

        protected AbstractC0881c(AbstractC0884f fVar) {
            C0697g.m2453a(fVar, "metadataLoader cannot be null.");
            this.f3198a = fVar;
        }
    }

    /* renamed from: a */
    public final CharSequence mo3162a(CharSequence charSequence) {
        int length;
        if (charSequence == null) {
            length = 0;
        } else {
            length = charSequence.length();
        }
        return mo3163a(charSequence, length);
    }

    /* renamed from: a */
    public static C0877a m3053a(AbstractC0881c cVar) {
        if (f3181i == null) {
            synchronized (f3180h) {
                if (f3181i == null) {
                    f3181i = new C0877a(cVar);
                }
            }
        }
        return f3181i;
    }

    private C0877a(AbstractC0881c cVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f3189j = reentrantReadWriteLock;
        this.f3184c = cVar.f3199b;
        this.f3185d = cVar.f3200c;
        this.f3186e = cVar.f3201d;
        this.f3187f = cVar.f3203f;
        this.f3188g = cVar.f3204g;
        this.f3183b = cVar.f3198a;
        int i = cVar.f3205h;
        this.f3193n = i;
        this.f3192m = new Handler(Looper.getMainLooper());
        C0486b bVar = new C0486b();
        this.f3190k = bVar;
        if (cVar.f3202e != null && !cVar.f3202e.isEmpty()) {
            bVar.addAll(cVar.f3202e);
        }
        int i2 = Build.VERSION.SDK_INT;
        C0879b bVar2 = new C0879b(this);
        this.f3182a = bVar2;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.f3191l = 0;
            } catch (Throwable th) {
                this.f3189j.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (mo3168c() == 0) {
            bVar2.mo3171a();
        }
    }

    /* renamed from: a */
    public final void mo3165a(AbstractC0882d dVar) {
        C0697g.m2453a(dVar, "initCallback cannot be null");
        this.f3189j.writeLock().lock();
        try {
            int i = this.f3191l;
            if (i != 1) {
                if (i != 2) {
                    this.f3190k.add(dVar);
                }
            }
            this.f3192m.post(new RunnableC0883e(dVar, this.f3191l));
        } finally {
            this.f3189j.writeLock().unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo3166a(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f3189j.writeLock().lock();
        try {
            this.f3191l = 2;
            arrayList.addAll(this.f3190k);
            this.f3190k.clear();
            this.f3189j.writeLock().unlock();
            this.f3192m.post(new RunnableC0883e(arrayList, this.f3191l, th));
        } catch (Throwable th2) {
            this.f3189j.writeLock().unlock();
            throw th2;
        }
    }

    /* renamed from: a */
    public final CharSequence mo3163a(CharSequence charSequence, int i) {
        return mo3164a(charSequence, 0, i, Integer.MAX_VALUE, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0048, code lost:
        if (r2 != false) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0055, code lost:
        if (java.lang.Character.isLowSurrogate(r1) != false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x008b, code lost:
        if (java.lang.Character.isHighSurrogate(r1) != false) goto L_0x00a0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0046 A[LOOP:2: B:25:0x0046->B:36:0x006a, LOOP_START, PHI: r2 r3 
      PHI: (r2v5 boolean) = (r2v4 boolean), (r2v6 boolean) binds: [B:23:0x0042, B:36:0x006a] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r3v5 int) = (r3v4 int), (r3v8 int) binds: [B:23:0x0042, B:36:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0044 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m3054a(android.view.inputmethod.InputConnection r10, android.text.Editable r11, int r12, int r13, boolean r14) {
        /*
        // Method dump skipped, instructions count: 239
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji.p045a.C0877a.m3054a(android.view.inputmethod.InputConnection, android.text.Editable, int, int, boolean):boolean");
    }

    /* renamed from: a */
    public final CharSequence mo3164a(CharSequence charSequence, int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        C0697g.m2455a(mo3169d(), "Not initialized yet");
        C0697g.m2451a(i, "start cannot be negative");
        C0697g.m2451a(i2, "end cannot be negative");
        C0697g.m2451a(i3, "maxEmojiCount cannot be negative");
        if (i <= i2) {
            z = true;
        } else {
            z = false;
        }
        C0697g.m2454a(z, (Object) "start should be <= than end");
        if (charSequence == null) {
            return charSequence;
        }
        if (i <= charSequence.length()) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0697g.m2454a(z2, (Object) "start should be < than charSequence length");
        if (i2 <= charSequence.length()) {
            z3 = true;
        } else {
            z3 = false;
        }
        C0697g.m2454a(z3, (Object) "end should be < than charSequence length");
        if (charSequence.length() == 0 || i == i2) {
            return charSequence;
        }
        if (i4 == 1) {
            z4 = true;
        } else if (i4 != 2) {
            z4 = this.f3184c;
        } else {
            z4 = false;
        }
        return this.f3182a.mo3170a(charSequence, i, i2, i3, z4);
    }
}
