package com.bytedance.bdlocation.service;

import android.location.Location;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class QPSController {
    private final Object lock = new Object();
    private Map<Long, C13187a> mQps = new ConcurrentHashMap();

    /* renamed from: com.bytedance.bdlocation.service.QPSController$a */
    public static class C13187a {

        /* renamed from: a */
        public int f32201a;

        /* renamed from: b */
        public int f32202b;

        static {
            Covode.recordClassIndex(15135);
        }
    }

    static {
        Covode.recordClassIndex(15134);
    }

    public C13187a getQPS(long j) {
        C13187a aVar;
        MethodCollector.m26663i(3780);
        synchronized (this.lock) {
            try {
                aVar = this.mQps.get(Long.valueOf(j));
            } finally {
                MethodCollector.m26664o(3780);
            }
        }
        return aVar;
    }

    public void stopLocation(long j) {
        MethodCollector.m26663i(3777);
        synchronized (this.lock) {
            try {
                this.mQps.remove(Long.valueOf(j));
            } finally {
                MethodCollector.m26664o(3777);
            }
        }
    }

    public void callback(Location location) {
        MethodCollector.m26663i(3635);
        synchronized (this.lock) {
            try {
                for (Map.Entry<Long, C13187a> entry : this.mQps.entrySet()) {
                    entry.getValue().f32201a++;
                }
            } finally {
                MethodCollector.m26664o(3635);
            }
        }
    }

    public void callbackError(Throwable th) {
        MethodCollector.m26663i(3773);
        synchronized (this.lock) {
            try {
                for (Map.Entry<Long, C13187a> entry : this.mQps.entrySet()) {
                    entry.getValue().f32202b++;
                }
            } finally {
                MethodCollector.m26664o(3773);
            }
        }
    }

    public void startLocation(long j) {
        MethodCollector.m26663i(3624);
        synchronized (this.lock) {
            try {
                this.mQps.put(Long.valueOf(j), new C13187a());
            } finally {
                MethodCollector.m26664o(3624);
            }
        }
    }
}
