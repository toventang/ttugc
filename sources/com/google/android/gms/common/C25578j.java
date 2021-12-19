package com.google.android.gms.common;

import android.content.Intent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.common.j */
public class C25578j extends Exception {

    /* renamed from: a */
    private final Intent f60652a;

    static {
        Covode.recordClassIndex(30985);
    }

    public Intent getIntent() {
        return new Intent(this.f60652a);
    }

    public C25578j(String str, Intent intent) {
        super(str);
        this.f60652a = intent;
    }
}
