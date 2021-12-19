package com.bytedance.monitor.collector;

import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;

/* renamed from: com.bytedance.monitor.collector.i */
public final class C21498i {

    /* renamed from: a */
    private static MessageQueue f51003a;

    /* renamed from: b */
    private static Field f51004b;

    /* renamed from: c */
    private static Field f51005c;

    static {
        Covode.recordClassIndex(25125);
    }

    /* renamed from: a */
    public static MessageQueue m40383a() {
        if (f51003a == null && Looper.getMainLooper() != null) {
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper == Looper.myLooper()) {
                f51003a = Looper.myQueue();
            } else if (Build.VERSION.SDK_INT >= 23) {
                f51003a = mainLooper.getQueue();
            } else {
                try {
                    Field declaredField = mainLooper.getClass().getDeclaredField("mQueue");
                    declaredField.setAccessible(true);
                    f51003a = (MessageQueue) declaredField.get(mainLooper);
                } catch (Throwable unused) {
                }
            }
        }
        return f51003a;
    }

    /* renamed from: a */
    protected static Message m40381a(Message message) {
        Field field = f51005c;
        if (field == null) {
            try {
                Field declaredField = Class.forName("android.os.Message").getDeclaredField("next");
                f51005c = declaredField;
                declaredField.setAccessible(true);
                return (Message) f51005c.get(message);
            } catch (Exception unused) {
                return null;
            }
        } else {
            try {
                return (Message) field.get(message);
            } catch (Exception unused2) {
                return null;
            }
        }
    }

    /* renamed from: a */
    public static Message m40382a(MessageQueue messageQueue) {
        Field field = f51004b;
        if (field == null) {
            try {
                Field declaredField = Class.forName("android.os.MessageQueue").getDeclaredField("mMessages");
                f51004b = declaredField;
                declaredField.setAccessible(true);
                return (Message) f51004b.get(messageQueue);
            } catch (Exception unused) {
                return null;
            }
        } else {
            try {
                return (Message) field.get(messageQueue);
            } catch (Exception unused2) {
                return null;
            }
        }
    }
}
