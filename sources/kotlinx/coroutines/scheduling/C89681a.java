package kotlinx.coroutines.scheduling;

import com.bytedance.covode.number.Covode;
import kotlinx.coroutines.scheduling.CoroutineScheduler;

/* renamed from: kotlinx.coroutines.scheduling.a */
public final /* synthetic */ class C89681a {

    /* renamed from: a */
    public static final /* synthetic */ int[] f203437a;

    static {
        Covode.recordClassIndex(105775);
        int[] iArr = new int[CoroutineScheduler.EnumC89680c.values().length];
        f203437a = iArr;
        iArr[CoroutineScheduler.EnumC89680c.PARKING.ordinal()] = 1;
        iArr[CoroutineScheduler.EnumC89680c.BLOCKING.ordinal()] = 2;
        iArr[CoroutineScheduler.EnumC89680c.CPU_ACQUIRED.ordinal()] = 3;
        iArr[CoroutineScheduler.EnumC89680c.DORMANT.ordinal()] = 4;
        iArr[CoroutineScheduler.EnumC89680c.TERMINATED.ordinal()] = 5;
    }
}
