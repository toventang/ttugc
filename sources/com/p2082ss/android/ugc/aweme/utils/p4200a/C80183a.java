package com.p2082ss.android.ugc.aweme.utils.p4200a;

import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.util.ArrayMap;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.aweme.utils.a.a */
public final class C80183a implements Handler.Callback {

    /* renamed from: a */
    private Reflect f179633a;

    /* renamed from: b */
    private Field f179634b;

    static {
        Covode.recordClassIndex(93451);
    }

    public final boolean handleMessage(Message message) {
        if (message == null) {
            return false;
        }
        int i = message.what;
        if (i == 103 || i == 104) {
            try {
                if (m139002a(m139001a(message))) {
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    /* renamed from: a */
    private IBinder m139001a(Message message) {
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                if (this.f179634b == null) {
                    this.f179634b = Class.forName("com.android.internal.os.SomeArgs").getDeclaredField("arg1");
                }
                return (IBinder) this.f179634b.get(message.obj);
            } catch (Exception unused) {
            }
        } else {
            if (message.obj instanceof IBinder) {
                return (IBinder) message.obj;
            }
            return null;
        }
    }

    /* renamed from: a */
    private boolean m139002a(IBinder iBinder) {
        try {
            if (this.f179633a == null) {
                this.f179633a = Reflect.m24528on(Class.forName("android.app.ActivityThread")).call("currentActivityThread");
            }
            int i = Build.VERSION.SDK_INT;
            ArrayMap arrayMap = (ArrayMap) this.f179633a.field("mActivities", new Class[0]).get();
            if (arrayMap == null || arrayMap.containsKey(iBinder)) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
        }
    }
}
