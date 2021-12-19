package com.p2082ss.mediakit.net;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.mediakit.net.AVMDLDNSManager */
public class AVMDLDNSManager {
    public static Map<Integer, CreateConstructor> dnsMap;
    private static AVMDLDNSManager mInstance;

    static {
        Covode.recordClassIndex(101220);
    }

    private AVMDLDNSManager() {
        dnsMap = new HashMap();
        initDnsMap();
    }

    public static AVMDLDNSManager getInstance() {
        MethodCollector.m26663i(11243);
        if (mInstance == null) {
            synchronized (AVMDLDNSManager.class) {
                try {
                    if (mInstance == null) {
                        try {
                            mInstance = new AVMDLDNSManager();
                        } catch (Exception e) {
                            e.printStackTrace();
                            mInstance = null;
                        }
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(11243);
                    throw th;
                }
            }
        }
        AVMDLDNSManager aVMDLDNSManager = mInstance;
        MethodCollector.m26664o(11243);
        return aVMDLDNSManager;
    }

    private void initDnsMap() {
        DefaultConstructor defaultConstructor = new DefaultConstructor();
        dnsMap.put(1, defaultConstructor);
        dnsMap.put(2, defaultConstructor);
        dnsMap.put(3, defaultConstructor);
    }

    public synchronized CreateConstructor getCreateConstructor(int i) {
        MethodCollector.m26663i(11094);
        if (dnsMap.containsKey(Integer.valueOf(i))) {
            CreateConstructor createConstructor = dnsMap.get(Integer.valueOf(i));
            MethodCollector.m26664o(11094);
            return createConstructor;
        }
        MethodCollector.m26664o(11094);
        return null;
    }

    public synchronized void registerDnsConstructor(int i, CreateConstructor createConstructor) {
        MethodCollector.m26663i(10948);
        try {
            dnsMap.put(Integer.valueOf(i), createConstructor);
            MethodCollector.m26664o(10948);
        } catch (Exception e) {
            e.printStackTrace();
            MethodCollector.m26664o(10948);
        }
    }
}
