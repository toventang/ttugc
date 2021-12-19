package com.appsflyer.internal;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import com.appsflyer.AndroidUtils;
import com.bytedance.covode.number.Covode;

public class EventDataCollector {

    /* renamed from: ι */
    private final Context f6954;

    static {
        Covode.recordClassIndex(2541);
    }

    public long bootTime() {
        return System.currentTimeMillis() - SystemClock.elapsedRealtime();
    }

    public String signature() {
        return AndroidUtils.signature(this.f6954.getPackageManager(), this.f6954.getPackageName());
    }

    public String disk() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
        int i = Build.VERSION.SDK_INT;
        long blockSizeLong = statFs.getBlockSizeLong();
        long blockCountLong = statFs.getBlockCountLong() * blockSizeLong;
        double pow = Math.pow(2.0d, 20.0d);
        double availableBlocksLong = (double) (statFs.getAvailableBlocksLong() * blockSizeLong);
        Double.isNaN(availableBlocksLong);
        long j = (long) (availableBlocksLong / pow);
        double d = (double) blockCountLong;
        Double.isNaN(d);
        return new StringBuilder().append(j).append("/").append((long) (d / pow)).toString();
    }

    public EventDataCollector(Context context) {
        this.f6954 = context;
    }
}
