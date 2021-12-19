package com.p2082ss.android.ugc.effectmanager.common.utils;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.ss.android.ugc.effectmanager.common.utils.TaskUtil */
public final class TaskUtil {
    public static final TaskUtil INSTANCE = new TaskUtil();

    /* renamed from: id */
    private static final AtomicLong f183430id = new AtomicLong(0);

    private TaskUtil() {
    }

    public final String generateTaskId() {
        return String.valueOf(f183430id.incrementAndGet());
    }

    static {
        Covode.recordClassIndex(95526);
    }
}
