package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.IOException;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.google.firebase.messaging.m */
public final /* synthetic */ class CallableC27875m implements Callable {

    /* renamed from: a */
    private final C27874l f65459a;

    static {
        Covode.recordClassIndex(33468);
    }

    CallableC27875m(C27874l lVar) {
        this.f65459a = lVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        MethodCollector.m26663i(11621);
        C27874l lVar = this.f65459a;
        String.valueOf(String.valueOf(lVar.f65456a)).length();
        byte[] a = lVar.mo46568a();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(a, 0, a.length);
        if (decodeByteArray != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                String.valueOf(String.valueOf(lVar.f65456a)).length();
            }
            MethodCollector.m26664o(11621);
            return decodeByteArray;
        }
        String valueOf = String.valueOf(lVar.f65456a);
        IOException iOException = new IOException(new StringBuilder(String.valueOf(valueOf).length() + 24).append("Failed to decode image: ").append(valueOf).toString());
        MethodCollector.m26664o(11621);
        throw iOException;
    }
}
