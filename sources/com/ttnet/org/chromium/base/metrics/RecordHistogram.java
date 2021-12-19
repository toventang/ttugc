package com.ttnet.org.chromium.base.metrics;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class RecordHistogram {

    /* renamed from: a */
    static final /* synthetic */ boolean f198393a = true;

    /* renamed from: b */
    private static Throwable f198394b;

    /* renamed from: c */
    private static Map<String, Long> f198395c = Collections.synchronizedMap(new HashMap());

    private static native int nativeGetHistogramTotalCountForTesting(String str);

    private static native int nativeGetHistogramValueCountForTesting(String str, int i);

    private static native long nativeRecordBooleanHistogram(String str, long j, boolean z);

    private static native long nativeRecordCustomCountHistogram(String str, long j, int i, int i2, int i3, int i4);

    private static native long nativeRecordCustomTimesHistogramMilliseconds(String str, long j, int i, int i2, int i3, int i4);

    private static native long nativeRecordEnumeratedHistogram(String str, long j, int i, int i2);

    private static native long nativeRecordLinearCountHistogram(String str, long j, int i, int i2, int i3, int i4);

    private static native long nativeRecordSparseHistogram(String str, long j, int i);

    static {
        Covode.recordClassIndex(103409);
    }

    /* renamed from: a */
    private static long m151815a(String str) {
        Long l = f198395c.get(str);
        if (l == null) {
            return 0;
        }
        return l.longValue();
    }

    /* renamed from: a */
    public static void m151816a(String str, boolean z) {
        MethodCollector.m26663i(6776);
        if (f198394b != null) {
            MethodCollector.m26664o(6776);
            return;
        }
        long a = m151815a(str);
        long nativeRecordBooleanHistogram = nativeRecordBooleanHistogram(str, a, z);
        if (nativeRecordBooleanHistogram != a) {
            f198395c.put(str, Long.valueOf(nativeRecordBooleanHistogram));
        }
        MethodCollector.m26664o(6776);
    }
}
