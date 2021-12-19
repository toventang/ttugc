package com.google.firebase.iid;

import android.content.Intent;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.p1940d.AbstractC25631h;
import com.google.android.gms.p1940d.C25635k;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.firebase.iid.t */
final class C27805t implements AbstractC27754a {

    /* renamed from: a */
    private final ExecutorService f65321a;

    static {
        Covode.recordClassIndex(33393);
    }

    C27805t(ExecutorService executorService) {
        this.f65321a = executorService;
    }

    /* renamed from: b */
    static Bundle m55589b(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.google.firebase.iid.AbstractC27754a
    /* renamed from: a */
    public final AbstractC25631h<Integer> mo46406a(Intent intent) {
        return C25635k.m49513a(this.f65321a, new CallableC27806u(intent));
    }

    /* renamed from: a */
    static String m55588a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
