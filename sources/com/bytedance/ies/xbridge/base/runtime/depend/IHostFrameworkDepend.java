package com.bytedance.ies.xbridge.base.runtime.depend;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.model.p1341b.C18742c;
import java.util.List;
import org.json.JSONObject;

public interface IHostFrameworkDepend {
    static {
        Covode.recordClassIndex(21132);
    }

    void addObserverEvent(C18742c cVar, String str, List<String> list, List<? extends JSONObject> list2);

    String getContainerID(C18742c cVar);
}
