package com.bytedance.boost_multidex;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;
import java.io.File;
import java.io.IOException;

public class OptimizeService extends IntentService {
    static volatile boolean sAlreadyOpt;
    File mDexDir;
    File mOptDexDir;
    File mRootDir;
    File mZipDir;

    static {
        Covode.recordClassIndex(15330);
    }

    public OptimizeService() {
        super("OptimizeService");
        if (Monitor.get() == null) {
            Monitor.init(null);
        }
        Monitor.get().logDebug("Starting OptimizeService");
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x0208  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0230 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void handleOptimize() {
        /*
        // Method dump skipped, instructions count: 685
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.boost_multidex.OptimizeService.handleOptimize():void");
    }

    public static void startOptimizeService(Context context) {
        m24018x48f26dfd(context, new Intent(context, OptimizeService.class));
    }

    public void onCreate() {
        super.onCreate();
        try {
            File filesDir = getFilesDir();
            if (!filesDir.exists()) {
                Utility.mkdirChecked(filesDir);
            }
            File ensureDirCreated = Utility.ensureDirCreated(filesDir, "boost_multidex");
            this.mRootDir = ensureDirCreated;
            this.mDexDir = Utility.ensureDirCreated(ensureDirCreated, "dex_cache");
            this.mOptDexDir = Utility.ensureDirCreated(this.mRootDir, "odex_cache");
            this.mZipDir = Utility.ensureDirCreated(this.mRootDir, "zip_cache");
        } catch (IOException e) {
            Monitor.get().logError("fail to create files", e);
            sAlreadyOpt = true;
        }
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        if (intent != null) {
            try {
                handleOptimize();
            } catch (IOException e) {
                Monitor.get().logError("fail to handle opt", e);
            }
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        ServiceLifecycle.onStartCommand(this, intent, i, i2);
        return super.onStartCommand(intent, i, i2);
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003d */
    /* renamed from: com_bytedance_boost_multidex_OptimizeService_com_ss_android_ugc_aweme_lancet_StartServiceLancet_startService */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.ComponentName m24018x48f26dfd(android.content.Context r9, android.content.Intent r10) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.boost_multidex.OptimizeService.m24018x48f26dfd(android.content.Context, android.content.Intent):android.content.ComponentName");
    }
}
