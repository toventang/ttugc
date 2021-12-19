package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import p4600h.C89391z;

/* renamed from: kotlinx.coroutines.ax */
public interface AbstractC89534ax {
    static {
        Covode.recordClassIndex(105625);
    }

    AbstractC89548bh invokeOnTimeout(long j, Runnable runnable);

    void scheduleResumeAfterDelay(long j, AbstractC89671m<? super C89391z> mVar);

    /* renamed from: kotlinx.coroutines.ax$a */
    public static final class C89535a {
        static {
            Covode.recordClassIndex(105626);
        }

        /* renamed from: a */
        public static AbstractC89548bh m155463a(long j, Runnable runnable) {
            return C89530au.f203249a.invokeOnTimeout(j, runnable);
        }
    }
}
