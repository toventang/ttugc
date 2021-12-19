package com.p2082ss.android.vesdk;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ttve.monitor.C30693g;
import java.util.HashMap;

/* renamed from: com.ss.android.vesdk.VESensService */
public class VESensService implements Runnable {
    public static String SENS_SERVICE_TYPE_CAMERA = "camera";
    public static String SENS_SERVICE_TYPE_MIC = "mic";
    private static VESensService mSensService = new VESensService();
    private int lastObjectID = 0;
    private int mCheckIntervalMs = 1000;
    private Thread mCheckThread = null;
    private boolean mInit = false;
    private HashMap<Integer, C85379az> mObjectMap = new HashMap<>();
    private AbstractC85267c mStatusChangeHander = null;

    /* renamed from: com.ss.android.vesdk.VESensService$c */
    public interface AbstractC85267c {
        static {
            Covode.recordClassIndex(99362);
        }
    }

    /* renamed from: com.ss.android.vesdk.VESensService$a */
    public enum EnumC85265a {
        ACTION_TYPE_CRASH(1),
        ACTION_TYPE_ALOG(2),
        ACTION_TYPE_CRASH_ALOG(3),
        ACTION_TYPE_SLARDAR(4),
        ACTION_TYPE_SLARDAR_CRASH(5),
        ACTION_TYPE_SLARDAR_ALOG(6),
        ACTION_TYPE_SLARDAR_ALOG_CRASH(7);
        
        public int value;

        public final int getActionType() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(99360);
        }

        private EnumC85265a(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.vesdk.VESensService$b */
    public enum EnumC85266b {
        PRIVACY_STATUS_RELEASE(0),
        PRIVACY_STATUS_USING(1);
        

        /* renamed from: a */
        private int f190813a;

        public final int getStatus() {
            return this.f190813a;
        }

        static {
            Covode.recordClassIndex(99361);
        }

        private EnumC85266b(int i) {
            this.f190813a = i;
        }
    }

    public static VESensService getInstance() {
        return mSensService;
    }

    static {
        Covode.recordClassIndex(99359);
    }

    private VESensService() {
    }

    private int allocateObjectID() {
        int i;
        MethodCollector.m26663i(5304);
        synchronized (this) {
            try {
                i = this.lastObjectID;
                this.lastObjectID = i + 1;
            } finally {
                MethodCollector.m26664o(5304);
            }
        }
        return i;
    }

    public boolean init() {
        if (this.mInit) {
            return true;
        }
        Thread thread = new Thread(this);
        this.mCheckThread = thread;
        this.mInit = true;
        thread.start();
        return true;
    }

    public void uninit() {
        MethodCollector.m26663i(5423);
        this.mInit = false;
        try {
            this.mCheckThread.join();
            MethodCollector.m26664o(5423);
        } catch (InterruptedException e) {
            e.printStackTrace();
            MethodCollector.m26664o(5423);
        }
    }

    public void run() {
        MethodCollector.m26663i(5680);
        long j = 0;
        while (this.mInit) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - j < ((long) this.mCheckIntervalMs)) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException unused) {
                }
            } else {
                synchronized (this) {
                    try {
                        for (C85379az azVar : this.mObjectMap.values()) {
                            if (azVar.f191113c != azVar.f191114d && currentTimeMillis - azVar.f191115e > ((long) azVar.f191116f)) {
                                String str = "Check Object Status illegal, name: " + azVar.f191111a + ", expect status:" + azVar.f191114d + ", status:" + azVar.f191113c;
                                if (azVar.f191113c != EnumC85266b.PRIVACY_STATUS_RELEASE && !azVar.f191118h) {
                                    azVar.f191118h = true;
                                    if ((azVar.f191117g.value & EnumC85265a.ACTION_TYPE_ALOG.value) != 0) {
                                        C85315al.m146642d("VESensService", str);
                                    }
                                    if ((azVar.f191117g.value & EnumC85265a.ACTION_TYPE_SLARDAR.value) != 0) {
                                        C30693g.m63057a(new VESensException(str));
                                    }
                                    if ((azVar.f191117g.value & EnumC85265a.ACTION_TYPE_CRASH.value) != 0) {
                                        RuntimeException runtimeException = new RuntimeException(str);
                                        MethodCollector.m26664o(5680);
                                        throw runtimeException;
                                    }
                                }
                            }
                        }
                    } catch (Throwable th) {
                        MethodCollector.m26664o(5680);
                        throw th;
                    }
                }
                j = currentTimeMillis;
            }
        }
        MethodCollector.m26664o(5680);
    }

    public void setObjectStatusCheckInterval(int i) {
        this.mCheckIntervalMs = i;
    }

    public void unregisterSensCheckObject(int i) {
        MethodCollector.m26663i(5429);
        synchronized (this) {
            try {
                this.mObjectMap.remove(Integer.valueOf(i));
            } finally {
                MethodCollector.m26664o(5429);
            }
        }
    }

    public int getIDWithName(String str) {
        for (C85379az azVar : this.mObjectMap.values()) {
            if (str.equals(azVar.f191111a)) {
                return azVar.f191112b;
            }
        }
        return -1;
    }

    public int registerSensCheckObject(String str) {
        MethodCollector.m26663i(5426);
        Integer.valueOf(0);
        synchronized (this) {
            try {
                for (C85379az azVar : this.mObjectMap.values()) {
                    if (str.equals(azVar.f191111a)) {
                        return azVar.f191112b;
                    }
                }
                Integer valueOf = Integer.valueOf(allocateObjectID());
                this.mObjectMap.put(valueOf, new C85379az(valueOf.intValue(), str));
                int intValue = valueOf.intValue();
                MethodCollector.m26664o(5426);
                return intValue;
            } finally {
                MethodCollector.m26664o(5426);
            }
        }
    }

    public void registerSensObjectStatusChangedHandler(int i, AbstractC85267c cVar) {
        this.mStatusChangeHander = cVar;
    }

    public void setObjectStatusCheckThreshold(int i, int i2) {
        MethodCollector.m26663i(5546);
        synchronized (this) {
            try {
                C85379az azVar = this.mObjectMap.get(Integer.valueOf(i));
                if (azVar != null) {
                    azVar.f191116f = i2;
                }
            } finally {
                MethodCollector.m26664o(5546);
            }
        }
    }

    public void setSensCheckObjExpectStatus(int i, EnumC85266b bVar) {
        MethodCollector.m26663i(5542);
        synchronized (this) {
            try {
                C85379az azVar = this.mObjectMap.get(Integer.valueOf(i));
                if (azVar != null) {
                    azVar.f191114d = bVar;
                    azVar.f191115e = System.currentTimeMillis();
                    azVar.f191118h = false;
                }
            } finally {
                MethodCollector.m26664o(5542);
            }
        }
    }

    public void setSensCheckObjStatus(int i, EnumC85266b bVar) {
        MethodCollector.m26663i(5540);
        synchronized (this) {
            try {
                C85379az azVar = this.mObjectMap.get(Integer.valueOf(i));
                if (azVar != null) {
                    azVar.f191113c = bVar;
                }
            } finally {
                MethodCollector.m26664o(5540);
            }
        }
    }

    public void setStatusAbnormalAction(int i, EnumC85265a aVar) {
        MethodCollector.m26663i(5676);
        synchronized (this) {
            try {
                C85379az azVar = this.mObjectMap.get(Integer.valueOf(i));
                if (azVar != null) {
                    azVar.f191117g = aVar;
                }
            } finally {
                MethodCollector.m26664o(5676);
            }
        }
    }
}
