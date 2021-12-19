package com.bytedance.apm.p773f;

import android.content.Intent;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import com.bytedance.covode.number.Covode;
import com.bytedance.monitor.p1546a.C21429a;
import com.bytedance.monitor.p1546a.C21434b;
import java.lang.reflect.Field;
import java.util.List;

/* renamed from: com.bytedance.apm.f.f */
public final class C12470f {
    static {
        Covode.recordClassIndex(14280);
    }

    /* renamed from: a */
    public static Intent m22433a() {
        int i;
        try {
            MessageQueue messageQueue = (MessageQueue) C21434b.m40239a(Looper.getMainLooper(), "mQueue");
            synchronized (messageQueue) {
                Message message = (Message) C21434b.m40239a(messageQueue, "mMessages");
                if (message != null && message.getTarget() == C21429a.m40228a() && C21429a.m40229a(message)) {
                    int i2 = message.what;
                    if (i2 == 100 || i2 == 159) {
                        return m22434a(message);
                    }
                }
                Field a = C21434b.m40241a((Class<?>) Message.class, "next");
                a.setAccessible(true);
                while (message != null) {
                    Message message2 = (Message) C21434b.m40240a(a, message);
                    if (message2 != null && message2.getTarget() == C21429a.m40228a() && C21429a.m40229a(message) && ((i = message.what) == 100 || i == 159)) {
                        return m22434a(message);
                    }
                    message = message2;
                }
                return null;
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static Intent m22434a(Message message) {
        int i = message.what;
        if (i != 100) {
            if (i != 121) {
                if (i != 159) {
                    switch (i) {
                        case 113:
                            return m22437d(message);
                        case 114:
                        case 115:
                            break;
                        default:
                            return null;
                    }
                }
            }
            return m22436c(message);
        }
        return m22435b(message);
    }

    /* renamed from: c */
    private static Intent m22436c(Message message) {
        String str;
        if (message.what == 114 || message.what == 121) {
            str = "intent";
        } else if (message.what == 115) {
            str = "args";
        } else {
            str = "";
        }
        if (str.isEmpty() || message.obj == null) {
            return null;
        }
        try {
            return (Intent) C21434b.m40239a(message.obj, str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    private static Intent m22437d(Message message) {
        String str;
        if (message.what == 113) {
            str = "intent";
        } else {
            str = "";
        }
        if (str.isEmpty() || message.obj == null) {
            return null;
        }
        try {
            return (Intent) C21434b.m40239a(message.obj, str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static Intent m22435b(Message message) {
        Object obj = message.obj;
        if (Build.VERSION.SDK_INT < 28 && message.what == 100) {
            try {
                return (Intent) C21434b.m40239a(obj, "intent");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                return null;
            }
        } else if (Build.VERSION.SDK_INT < 28 || message.what != 159) {
            return null;
        } else {
            try {
                List list = (List) C21434b.m40239a(obj, "mActivityCallbacks");
                if (list == null) {
                    return null;
                }
                for (int i = 0; i < list.size(); i++) {
                    Object obj2 = list.get(i);
                    if (obj2 != null) {
                        return (Intent) C21434b.m40239a(obj2, "mIntent");
                    }
                }
                return null;
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
                return null;
            }
        }
    }
}
