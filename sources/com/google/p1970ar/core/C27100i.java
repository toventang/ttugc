package com.google.p1970ar.core;

import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.p1970ar.core.exceptions.UnavailableDeviceNotCompatibleException;
import com.google.p1970ar.core.exceptions.UnavailableUserDeclinedInstallationException;

/* access modifiers changed from: package-private */
/* renamed from: com.google.ar.core.i */
public final class C27100i {
    static {
        Covode.recordClassIndex(32680);
    }

    /* renamed from: a */
    static PendingIntent m53866a(Context context) {
        RuntimeException runtimeException;
        MethodCollector.m26663i(8952);
        Bundle call = context.getContentResolver().call(new Uri.Builder().scheme("content").authority("com.google.ar.core.services.arcorecontentprovider").path("").build(), "getSetupIntent", context.getPackageName(), (Bundle) null);
        if (call == null) {
            MethodCollector.m26664o(8952);
            return null;
        }
        try {
            PendingIntent pendingIntent = (PendingIntent) call.getParcelable("intent");
            if (pendingIntent != null) {
                MethodCollector.m26664o(8952);
                return pendingIntent;
            }
            String string = call.getString("exceptionType", "");
            if (string.isEmpty()) {
                MethodCollector.m26664o(8952);
                return null;
            } else if (string.equals(UnavailableDeviceNotCompatibleException.class.getName())) {
                UnavailableDeviceNotCompatibleException unavailableDeviceNotCompatibleException = new UnavailableDeviceNotCompatibleException();
                MethodCollector.m26664o(8952);
                throw unavailableDeviceNotCompatibleException;
            } else if (!string.equals(UnavailableUserDeclinedInstallationException.class.getName())) {
                Class<? extends U> asSubclass = Class.forName(string).asSubclass(RuntimeException.class);
                String string2 = call.getString("exceptionText", null);
                if (string2 != null) {
                    runtimeException = (RuntimeException) asSubclass.getConstructor(String.class).newInstance(string2);
                } else {
                    runtimeException = (RuntimeException) asSubclass.getConstructor(new Class[0]).newInstance(new Object[0]);
                }
                MethodCollector.m26664o(8952);
                throw runtimeException;
            } else {
                UnavailableUserDeclinedInstallationException unavailableUserDeclinedInstallationException = new UnavailableUserDeclinedInstallationException();
                MethodCollector.m26664o(8952);
                throw unavailableUserDeclinedInstallationException;
            }
        } catch (ReflectiveOperationException | RuntimeException unused) {
            MethodCollector.m26664o(8952);
            return null;
        }
    }
}
