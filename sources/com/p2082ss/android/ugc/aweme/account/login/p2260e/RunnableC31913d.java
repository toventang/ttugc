package com.p2082ss.android.ugc.aweme.account.login.p2260e;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.account.login.e.d */
public final /* synthetic */ class RunnableC31913d implements Runnable {

    /* renamed from: a */
    private final C31910a f76250a;

    /* renamed from: b */
    private final String f76251b;

    static {
        Covode.recordClassIndex(38657);
    }

    RunnableC31913d(C31910a aVar, String str) {
        this.f76250a = aVar;
        this.f76251b = str;
    }

    public final void run() {
        C31910a aVar = this.f76250a;
        String str = this.f76251b;
        aVar.f76239a.setText(str);
        if (!TextUtils.isEmpty(str)) {
            aVar.f76239a.setSelection(str.length());
        }
    }
}
