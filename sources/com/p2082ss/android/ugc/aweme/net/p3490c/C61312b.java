package com.p2082ss.android.ugc.aweme.net.p3490c;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.C14731e;
import com.bytedance.ttnet.p1703d.C22940b;
import com.p2082ss.android.common.applog.AppLog;

/* renamed from: com.ss.android.ugc.aweme.net.c.b */
public final class C61312b implements C14731e.AbstractC14733b<C22940b> {
    static {
        Covode.recordClassIndex(71942);
    }

    @Override // com.bytedance.frameworks.baselib.network.http.C14731e.AbstractC14733b
    /* renamed from: b */
    public final String mo23731b(String str) {
        return str;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.C14731e.AbstractC14733b
    /* renamed from: a */
    public final String mo23730a(String str) {
        if (str == null) {
            return str;
        }
        if (str.contains("/get_domains/") || str.contains("/ttnet_crash/")) {
            return AppLog.addCommonParams(str, true);
        }
        return str;
    }
}
