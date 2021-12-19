package com.p2082ss.android.ugc.aweme.legoImp.task;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.platform.p1565a.p1567b.p1568a.C21638a;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.e */
final /* synthetic */ class C58431e implements C21638a.AbstractC21640b {

    /* renamed from: a */
    static final C21638a.AbstractC21640b f133038a = new C58431e();

    static {
        Covode.recordClassIndex(68686);
    }

    private C58431e() {
    }

    @Override // com.bytedance.platform.p1565a.p1567b.p1568a.C21638a.AbstractC21640b
    /* renamed from: a */
    public final boolean mo35288a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (String str2 : HoraeInitTask.f132840a) {
            if (str.contains(str2)) {
                return true;
            }
        }
        return false;
    }
}
