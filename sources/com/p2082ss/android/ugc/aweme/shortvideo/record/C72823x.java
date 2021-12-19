package com.p2082ss.android.ugc.aweme.shortvideo.record;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.medialib.RecordInvoker;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.record.x */
public final /* synthetic */ class C72823x implements RecordInvoker.OnCherEffectParmaCallback {

    /* renamed from: a */
    private final C72809t f163411a;

    static {
        Covode.recordClassIndex(85509);
    }

    C72823x(C72809t tVar) {
        this.f163411a = tVar;
    }

    @Override // com.p2082ss.android.medialib.RecordInvoker.OnCherEffectParmaCallback
    public final void onCherEffect(String[] strArr, double[] dArr, boolean[] zArr) {
        this.f163411a.mo115140b(strArr, dArr, zArr);
    }
}
