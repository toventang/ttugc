package com.bytedance.ies.xbridge.base.runtime.depend;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.base.runtime.p1292a.C18426f;
import com.bytedance.ies.xbridge.model.p1341b.C18742c;
import java.util.Map;
import p4600h.C89391z;

public interface IHostLogDepend {
    static {
        Covode.recordClassIndex(21133);
    }

    void handleReportADLog(C18742c cVar, String str, C18426f fVar, IReportADLogResultCallback iReportADLogResultCallback, EnumC18483e eVar);

    void onEventV3Map(String str, Map<String, String> map);

    void putCommonParams(Map<String, String> map, boolean z);

    C89391z reportJSBError(C18742c cVar, Map<String, ? extends Object> map);

    C89391z reportJSBFetchError(C18742c cVar, Map<String, ? extends Object> map);
}
