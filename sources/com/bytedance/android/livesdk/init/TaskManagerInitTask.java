package com.bytedance.android.livesdk.init;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.android.live.annotation.AbstractC2916a;
import com.bytedance.android.livesdk.livesetting.performance.ThreadPoolOptExperiment;
import com.bytedance.android.livesdk.p667x.AbstractC11587a;
import com.bytedance.common.utility.p907b.ThreadFactoryC13589b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1204e.p1205a.C17305a;
import com.p2082ss.android.socialbase.downloader.p2188j.ThreadFactoryC30513a;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

@AbstractC2916a(mo7569a = 4)
public class TaskManagerInitTask extends AbstractC11587a {
    static {
        Covode.recordClassIndex(9906);
    }

    @Override // com.bytedance.android.livesdk.p667x.AbstractC11587a
    public String getTaskName() {
        return "task_manager_init_task";
    }

    @Override // com.bytedance.android.livesdk.p667x.AbstractC11587a
    public List<Integer> preTasks() {
        return Arrays.asList(0);
    }

    @Override // com.bytedance.android.livesdk.p667x.AbstractC11587a
    public void run() {
        Executor com_bytedance_android_livesdk_init_TaskManagerInitTask_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newCachedThreadPool;
        if (ThreadPoolOptExperiment.INSTANCE.isEnableAll()) {
            com_bytedance_android_livesdk_init_TaskManagerInitTask_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newCachedThreadPool = C40780g.m82241a();
        } else {
            com_bytedance_android_livesdk_init_TaskManagerInitTask_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newCachedThreadPool = m17354x71cf59f0(new ThreadFactoryC13589b("live-work-threads"));
        }
        C17305a.C17307a aVar = new C17305a.C17307a();
        if (com_bytedance_android_livesdk_init_TaskManagerInitTask_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newCachedThreadPool == null) {
            com_bytedance_android_livesdk_init_TaskManagerInitTask_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newCachedThreadPool = C17305a.f41576a;
        }
        aVar.f41584a = com_bytedance_android_livesdk_init_TaskManagerInitTask_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newCachedThreadPool;
        C17305a a = C17305a.m32043a();
        a.f41580e = aVar.f41584a;
        C17305a.f41578c = new Handler(Looper.getMainLooper());
        a.f41579d = true;
    }

    /* renamed from: com_bytedance_android_livesdk_init_TaskManagerInitTask_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newCachedThreadPool */
    public static ExecutorService m17354x71cf59f0(ThreadFactory threadFactory) {
        if ((threadFactory instanceof ThreadFactoryC13589b) || (threadFactory instanceof ThreadFactoryC30513a)) {
            return C40780g.m82241a();
        }
        return Executors.newCachedThreadPool(threadFactory);
    }
}
