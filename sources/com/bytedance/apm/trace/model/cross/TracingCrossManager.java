package com.bytedance.apm.trace.model.cross;

import com.bytedance.apm.trace.p790a.C12608d;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TracingCrossManager {
    private static Map<Long, C12608d> sCrossTracingContext = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(14460);
    }

    public static void unRegisterCross(long j) {
        sCrossTracingContext.remove(Long.valueOf(j));
    }

    public static void registerCross(long j, C12608d dVar) {
        sCrossTracingContext.put(Long.valueOf(j), dVar);
    }

    public static void onPassBackAsChild(String str, String str2, ArrayList<NativeSpan> arrayList) {
        C12608d dVar = sCrossTracingContext.get(Long.valueOf(Long.parseLong(str)));
        if (dVar != null) {
            sCrossTracingContext.remove(Long.valueOf(Long.parseLong(str)));
            dVar.mo20423a(str2, arrayList);
        }
    }

    public static void onPassBackAsReference(String str, String str2, ArrayList<NativeSpan> arrayList) {
        C12608d dVar = sCrossTracingContext.get(Long.valueOf(Long.parseLong(str)));
        if (dVar != null) {
            sCrossTracingContext.remove(Long.valueOf(Long.parseLong(str)));
            dVar.mo20424b(str2, arrayList);
        }
    }
}
