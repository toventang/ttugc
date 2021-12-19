package com.bytedance.keva;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.io.File;
import java.util.concurrent.Executor;

public class KevaBuilder {
    private static KevaBuilder mInstance = new KevaBuilder();
    Context mContext;
    Executor mExecutor;
    KevaMonitor mMonitor;
    String mPortedRepoName;
    IKevaPreLoader mPreLoader;
    File mWorkDir;

    static void clearInstance() {
        mInstance = null;
    }

    /* renamed from: com_bytedance_keva_KevaBuilder_com_ss_android_ugc_aweme_lancet_LogLancet_i */
    public static int m38926x292c21a7(String str, String str2) {
        return 0;
    }

    /* renamed from: com_bytedance_keva_KevaBuilder_com_ss_android_ugc_aweme_lancet_LogLancet_w */
    public static int m38927x292c21b5(String str, String str2) {
        return 0;
    }

    static {
        Covode.recordClassIndex(24218);
    }

    public static KevaBuilder getInstance() {
        KevaBuilder kevaBuilder = mInstance;
        if (kevaBuilder != null) {
            return kevaBuilder;
        }
        m38927x292c21b5("Keva", "have already did init, builder is invalid now!");
        return new KevaBuilder();
    }

    public KevaBuilder setContext(Context context) {
        this.mContext = context;
        return this;
    }

    public KevaBuilder setExecutor(Executor executor) {
        this.mExecutor = executor;
        return this;
    }

    public KevaBuilder setMonitor(KevaMonitor kevaMonitor) {
        this.mMonitor = kevaMonitor;
        return this;
    }

    public KevaBuilder setPortedRepoName(String str) {
        this.mPortedRepoName = str;
        return this;
    }

    public KevaBuilder setPreLoader(IKevaPreLoader iKevaPreLoader) {
        this.mPreLoader = iKevaPreLoader;
        return this;
    }

    public KevaBuilder setWorkDir(File file) {
        if (!file.exists()) {
            m38926x292c21a7("Keva", "work dir does not exist! try to create " + file.getPath());
            if (!file.mkdirs()) {
                m38927x292c21b5("Keva", "work dir fail to create!");
                return this;
            }
        }
        this.mWorkDir = file;
        return this;
    }
}
