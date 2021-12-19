package com.p2082ss.android.ugc.aweme.video.preload.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.p2441cf.p2442a.C35469d;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.video.preload.model.PreloadStrategyConfig */
public class PreloadStrategyConfig {
    @AbstractC27891c(mo46611a = "danger_buffer_threshold")
    private int dangerBufferThreshold;
    @AbstractC27891c(mo46611a = "enable_buffer_threshold")
    private int enableBufferPreload;
    @AbstractC27891c(mo46611a = "network_lower")
    private long networkLower;
    @AbstractC27891c(mo46611a = "network_upper")
    private long networkUpper;
    @AbstractC27891c(mo46611a = "secure_buffer_threshold")
    private int secureBufferThreshold;
    @AbstractC27891c(mo46611a = "tasks")
    public List<PreloadTask> tasks;

    static {
        Covode.recordClassIndex(94224);
    }

    public static PreloadStrategyConfig getDefault() {
        return C80924a.f180922a;
    }

    public int getDangerBufferThreshold() {
        return this.dangerBufferThreshold;
    }

    public long getNetworkLower() {
        return this.networkLower;
    }

    public long getNetworkUpper() {
        return this.networkUpper;
    }

    public int getSecureBufferThreshold() {
        return this.secureBufferThreshold;
    }

    public boolean isEnableBufferPreload() {
        if (this.enableBufferPreload == 1) {
            return true;
        }
        return false;
    }

    public List<PreloadTask> getTasks() {
        if (this.tasks == null) {
            this.tasks = Collections.emptyList();
        }
        return this.tasks;
    }

    public String taskToJson() {
        return C35469d.m72530a().mo46674b(this.tasks);
    }

    /* renamed from: com.ss.android.ugc.aweme.video.preload.model.PreloadStrategyConfig$a */
    static class C80924a {

        /* renamed from: a */
        public static final PreloadStrategyConfig f180922a;

        static {
            Covode.recordClassIndex(94225);
            PreloadStrategyConfig preloadStrategyConfig = new PreloadStrategyConfig();
            f180922a = preloadStrategyConfig;
            preloadStrategyConfig.tasks = Collections.singletonList(new PreloadTask());
        }
    }

    public void clearFlag() {
        List<PreloadTask> list = this.tasks;
        if (list != null) {
            for (PreloadTask preloadTask : list) {
                preloadTask.alreadyPreload = false;
            }
        }
    }

    public String toString() {
        return "PreloadStrategyConfig{tasks=" + C35469d.m72530a().mo46674b(this.tasks) + '}';
    }

    public static PreloadStrategyConfig convertOldConfig(int i, int i2) {
        PreloadStrategyConfig preloadStrategyConfig = new PreloadStrategyConfig();
        preloadStrategyConfig.tasks = Collections.singletonList(new PreloadTask(i, i2));
        return preloadStrategyConfig;
    }
}
