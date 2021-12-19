package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import kotlinx.coroutines.internal.C89659v;

/* renamed from: kotlinx.coroutines.bo */
public final class C89555bo {

    /* renamed from: a */
    public static final C89659v f203274a = new C89659v("REMOVED_TASK");

    /* renamed from: b */
    public static final C89659v f203275b = new C89659v("CLOSED_EMPTY");

    /* renamed from: a */
    public static final long m155490a(long j) {
        if (j <= 0) {
            return 0;
        }
        if (j >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return j * 1000000;
    }

    static {
        Covode.recordClassIndex(105646);
    }
}
