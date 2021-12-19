package com.google.android.gms.common.api.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.util.p1939a.ThreadFactoryC25598c;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.common.api.internal.bo */
public final class C25405bo {

    /* renamed from: a */
    static final ExecutorService f60279a = new ThreadPoolExecutor(0, 4, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC25598c("GAC_Transform"));

    static {
        Covode.recordClassIndex(30804);
    }
}
