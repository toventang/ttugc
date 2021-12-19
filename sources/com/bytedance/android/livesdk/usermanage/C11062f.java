package com.bytedance.android.livesdk.usermanage;

import com.bytedance.android.live.broadcast.api.p185c.C3049b;
import com.bytedance.android.live.broadcast.api.p185c.C3051c;
import com.bytedance.android.live.p405s.AbstractC6100b;
import com.bytedance.android.live.p405s.p406a.C6099c;
import com.bytedance.android.livesdk.p425aa.C6497a;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.usermanage.f */
public final class C11062f {

    /* renamed from: a */
    public static final C11062f f26620a = new C11062f();

    private C11062f() {
    }

    static {
        Covode.recordClassIndex(12683);
    }

    /* renamed from: com.bytedance.android.livesdk.usermanage.f$c */
    static final class C11065c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ WeakReference f26623a;

        /* renamed from: b */
        final /* synthetic */ boolean f26624b;

        /* renamed from: c */
        final /* synthetic */ long f26625c;

        /* renamed from: d */
        final /* synthetic */ long f26626d;

        static {
            Covode.recordClassIndex(12686);
        }

        C11065c(WeakReference weakReference, boolean z, long j, long j2) {
            this.f26623a = weakReference;
            this.f26624b = z;
            this.f26625c = j;
            this.f26626d = j2;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            AbstractC6100b bVar = (AbstractC6100b) this.f26623a.get();
            if (bVar != null) {
                bVar.mo11965b(this.f26624b);
            }
            C11062f.m19694a(this.f26624b, this.f26625c, this.f26626d);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.usermanage.f$e */
    static final class C11067e<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ WeakReference f26631a;

        /* renamed from: b */
        final /* synthetic */ boolean f26632b;

        /* renamed from: c */
        final /* synthetic */ long f26633c;

        /* renamed from: d */
        final /* synthetic */ long f26634d;

        static {
            Covode.recordClassIndex(12688);
        }

        C11067e(WeakReference weakReference, boolean z, long j, long j2) {
            this.f26631a = weakReference;
            this.f26632b = z;
            this.f26633c = j;
            this.f26634d = j2;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            AbstractC6100b bVar = (AbstractC6100b) this.f26631a.get();
            if (bVar != null) {
                bVar.mo11965b(this.f26632b);
            }
            C11062f.m19694a(this.f26632b, this.f26633c, this.f26634d);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.usermanage.f$a */
    static final class C11063a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ WeakReference f26621a;

        static {
            Covode.recordClassIndex(12684);
        }

        C11063a(WeakReference weakReference) {
            this.f26621a = weakReference;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            int i;
            C6099c cVar = (C6099c) obj;
            AbstractC6100b bVar = (AbstractC6100b) this.f26621a.get();
            if (bVar != null) {
                bVar.mo11966d();
            }
            AbstractC6100b bVar2 = (AbstractC6100b) this.f26621a.get();
            if (bVar2 != null) {
                bVar2.mo11964b(cVar, null);
            }
            if (cVar != null) {
                C6497a b = C3051c.C3052a.m8360b("ttlive_fetch_ban");
                if (cVar.f14684b != null) {
                    i = cVar.f14684b.size();
                } else {
                    i = 0;
                }
                b.mo12627a("list_size", Integer.valueOf(i)).mo12632a();
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.usermanage.f$b */
    static final class C11064b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ WeakReference f26622a;

        static {
            Covode.recordClassIndex(12685);
        }

        C11064b(WeakReference weakReference) {
            this.f26622a = weakReference;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th;
            Throwable th2 = (Throwable) obj;
            AbstractC6100b bVar = (AbstractC6100b) this.f26622a.get();
            if (bVar != null) {
                bVar.mo11966d();
            }
            AbstractC6100b bVar2 = (AbstractC6100b) this.f26622a.get();
            if (bVar2 != null) {
                if (!(th2 instanceof Exception)) {
                    th = null;
                } else {
                    th = th2;
                }
                bVar2.mo11964b(null, (Exception) th);
            }
            C89219l.m154716b(th2, "");
            C3049b.C3050a.m8357a("ttlive_fetch_ban", th2).mo12632a();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.usermanage.f$d */
    static final class C11066d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ WeakReference f26627a;

        /* renamed from: b */
        final /* synthetic */ boolean f26628b;

        /* renamed from: c */
        final /* synthetic */ long f26629c;

        /* renamed from: d */
        final /* synthetic */ long f26630d;

        static {
            Covode.recordClassIndex(12687);
        }

        C11066d(WeakReference weakReference, boolean z, long j, long j2) {
            this.f26627a = weakReference;
            this.f26628b = z;
            this.f26629c = j;
            this.f26630d = j2;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th;
            Throwable th2 = (Throwable) obj;
            AbstractC6100b bVar = (AbstractC6100b) this.f26627a.get();
            if (bVar != null) {
                boolean z = this.f26628b;
                if (!(th2 instanceof Exception)) {
                    th = null;
                } else {
                    th = th2;
                }
                bVar.mo11963a(z, (Exception) th);
            }
            boolean z2 = this.f26628b;
            long j = this.f26629c;
            long j2 = this.f26630d;
            C89219l.m154716b(th2, "");
            C11062f.m19695a(z2, j, j2, th2);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.usermanage.f$f */
    static final class C11068f<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ WeakReference f26635a;

        /* renamed from: b */
        final /* synthetic */ boolean f26636b;

        /* renamed from: c */
        final /* synthetic */ long f26637c;

        /* renamed from: d */
        final /* synthetic */ long f26638d;

        static {
            Covode.recordClassIndex(12689);
        }

        C11068f(WeakReference weakReference, boolean z, long j, long j2) {
            this.f26635a = weakReference;
            this.f26636b = z;
            this.f26637c = j;
            this.f26638d = j2;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th;
            Throwable th2 = (Throwable) obj;
            AbstractC6100b bVar = (AbstractC6100b) this.f26635a.get();
            if (bVar != null) {
                boolean z = this.f26636b;
                if (!(th2 instanceof Exception)) {
                    th = null;
                } else {
                    th = th2;
                }
                bVar.mo11963a(z, (Exception) th);
            }
            boolean z2 = this.f26636b;
            long j = this.f26637c;
            long j2 = this.f26638d;
            C89219l.m154716b(th2, "");
            C11062f.m19695a(z2, j, j2, th2);
        }
    }

    /* renamed from: a */
    public static void m19694a(boolean z, long j, long j2) {
        C6497a b;
        if (z) {
            b = C3051c.C3052a.m8360b("ttlive_add_ban");
        } else {
            b = C3051c.C3052a.m8360b("ttlive_delete_ban");
        }
        b.mo12628a("room_id", Long.valueOf(j)).mo12628a("user_id", Long.valueOf(j2)).mo12632a();
    }

    /* renamed from: a */
    public static void m19695a(boolean z, long j, long j2, Throwable th) {
        C6497a a;
        if (z) {
            a = C3049b.C3050a.m8357a("ttlive_add_ban", th);
        } else {
            a = C3049b.C3050a.m8357a("ttlive_delete_ban", th);
        }
        a.mo12628a("room_id", Long.valueOf(j)).mo12628a("user_id", Long.valueOf(j2)).mo12632a();
    }
}
