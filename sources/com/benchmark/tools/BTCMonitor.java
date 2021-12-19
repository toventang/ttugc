package com.benchmark.tools;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public final class BTCMonitor {

    public interface IMonitor {
        static {
            Covode.recordClassIndex(2882);
        }

        void monitorLog(String str, JSONObject jSONObject);
    }

    static {
        Covode.recordClassIndex(2881);
    }
}
