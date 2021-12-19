package kotlinx.coroutines.android;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import kotlinx.coroutines.AbstractC89548bh;
import kotlinx.coroutines.AbstractC89671m;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89127f;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89271h;

/* renamed from: kotlinx.coroutines.android.a */
public final class C89518a extends AbstractC89522b {
    private volatile C89518a _immediate;

    /* renamed from: a */
    public final C89518a f203229a;

    /* renamed from: c */
    public final Handler f203230c;

    /* renamed from: d */
    private final String f203231d;

    /* renamed from: e */
    private final boolean f203232e;

    static {
        Covode.recordClassIndex(105609);
    }

    public final int hashCode() {
        return System.identityHashCode(this.f203230c);
    }

    /* renamed from: kotlinx.coroutines.android.a$a */
    public static final class C89519a implements AbstractC89548bh {

        /* renamed from: a */
        final /* synthetic */ C89518a f203233a;

        /* renamed from: b */
        final /* synthetic */ Runnable f203234b;

        static {
            Covode.recordClassIndex(105610);
        }

        @Override // kotlinx.coroutines.AbstractC89548bh
        public final void cQ_() {
            this.f203233a.f203230c.removeCallbacks(this.f203234b);
        }

        C89519a(C89518a aVar, Runnable runnable) {
            this.f203233a = aVar;
            this.f203234b = runnable;
        }
    }

    /* renamed from: kotlinx.coroutines.android.a$b */
    public static final class RunnableC89520b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C89518a f203235a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89671m f203236b;

        static {
            Covode.recordClassIndex(105611);
        }

        public RunnableC89520b(C89518a aVar, AbstractC89671m mVar) {
            this.f203235a = aVar;
            this.f203236b = mVar;
        }

        public final void run() {
            this.f203236b.mo144212a(this.f203235a, C89391z.f203057a);
        }
    }

    @Override // kotlinx.coroutines.AbstractC89507ah
    public final String toString() {
        String str = this.f203231d;
        if (str == null) {
            return this.f203230c.toString();
        }
        if (this.f203232e) {
            return this.f203231d + " [immediate]";
        }
        return str;
    }

    /* renamed from: kotlinx.coroutines.android.a$c */
    static final class C89521c extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C89518a f203237a;

        /* renamed from: b */
        final /* synthetic */ Runnable f203238b;

        static {
            Covode.recordClassIndex(105612);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C89521c(C89518a aVar, Runnable runnable) {
            super(1);
            this.f203237a = aVar;
            this.f203238b = runnable;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            this.f203237a.f203230c.removeCallbacks(this.f203238b);
            return C89391z.f203057a;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C89518a) || ((C89518a) obj).f203230c != this.f203230c) {
            return false;
        }
        return true;
    }

    @Override // kotlinx.coroutines.AbstractC89507ah
    public final boolean isDispatchNeeded(AbstractC89127f fVar) {
        if (!this.f203232e || (!C89219l.m154714a(Looper.myLooper(), this.f203230c.getLooper()))) {
            return true;
        }
        return false;
    }

    public C89518a(Handler handler, String str) {
        this(handler, str, false);
    }

    @Override // kotlinx.coroutines.AbstractC89507ah
    public final void dispatch(AbstractC89127f fVar, Runnable runnable) {
        this.f203230c.post(runnable);
    }

    @Override // kotlinx.coroutines.android.AbstractC89522b, kotlinx.coroutines.AbstractC89534ax
    public final AbstractC89548bh invokeOnTimeout(long j, Runnable runnable) {
        this.f203230c.postDelayed(runnable, C89271h.m154770b(j, 4611686018427387903L));
        return new C89519a(this, runnable);
    }

    @Override // kotlinx.coroutines.AbstractC89534ax
    public final void scheduleResumeAfterDelay(long j, AbstractC89671m<? super C89391z> mVar) {
        RunnableC89520b bVar = new RunnableC89520b(this, mVar);
        this.f203230c.postDelayed(bVar, C89271h.m154770b(j, 4611686018427387903L));
        mVar.mo144211a((AbstractC89172b<? super Throwable, C89391z>) new C89521c(this, bVar));
    }

    private C89518a(Handler handler, String str, boolean z) {
        super((byte) 0);
        C89518a aVar;
        this.f203230c = handler;
        this.f203231d = str;
        this.f203232e = z;
        if (z) {
            aVar = this;
        } else {
            aVar = null;
        }
        this._immediate = aVar;
        C89518a aVar2 = this._immediate;
        if (aVar2 == null) {
            aVar2 = new C89518a(handler, str, true);
            this._immediate = aVar2;
        }
        this.f203229a = aVar2;
    }
}
