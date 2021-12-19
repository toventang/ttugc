package com.bytedance.scene;

import android.content.Intent;
import android.os.Messenger;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.scene.v */
public final class C22281v {

    /* renamed from: b */
    private static String f52703b = "SingeProcessMessengerHandler";

    /* renamed from: a */
    public Messenger f52704a;

    static {
        Covode.recordClassIndex(26097);
    }

    private C22281v(Messenger messenger) {
        this.f52704a = messenger;
    }

    /* renamed from: a */
    public static C22281v m41959a(Intent intent) {
        Messenger messenger = (Messenger) intent.getParcelableExtra(f52703b);
        if (messenger != null) {
            return new C22281v(messenger);
        }
        return null;
    }
}
