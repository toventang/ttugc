package com.p2082ss.android.ugc.aweme.activity.processor;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.AbstractC17350d;
import com.bytedance.ies.foundation.base.AbstractC17362a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.activity.processor.g */
public final class C33080g extends AbstractC17350d {
    static {
        Covode.recordClassIndex(39892);
    }

    @Override // com.bytedance.ies.foundation.activity.AbstractC17315b, com.bytedance.ies.foundation.base.AbstractC17368c
    /* renamed from: a */
    public final void mo27647a(int i, int i2, Intent intent) {
        super.mo27647a(i, i2, intent);
        List<AbstractC17362a> b = mo27704b().mo27699b();
        ArrayList<C33079f> arrayList = new ArrayList();
        for (T t : b) {
            if (t instanceof C33079f) {
                arrayList.add(t);
            }
        }
        for (C33079f fVar : arrayList) {
            fVar.f78640a.mo57337a(i, i2, intent);
        }
    }
}
