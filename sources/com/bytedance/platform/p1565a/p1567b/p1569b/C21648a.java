package com.bytedance.platform.p1565a.p1567b.p1569b;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import com.bytedance.platform.p1565a.p1566a.C21625b;
import com.bytedance.platform.p1565a.p1566a.C21630g;
import com.bytedance.platform.p1565a.p1566a.C21633h;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* renamed from: com.bytedance.platform.a.b.b.a */
public final class C21648a {

    /* renamed from: a */
    public static C21648a f51368a = new C21648a();

    /* renamed from: b */
    public static Method f51369b;

    /* renamed from: c */
    public static MessageQueue f51370c;

    /* renamed from: d */
    private static Object f51371d;

    /* renamed from: e */
    private static Field f51372e;

    /* renamed from: f */
    private static Field f51373f;

    /* renamed from: g */
    private static Field f51374g;

    /* renamed from: h */
    private static Field f51375h;

    /* renamed from: i */
    private static Field f51376i;

    /* renamed from: j */
    private int f51377j;

    /* renamed from: k */
    private int f51378k = -1;

    /* renamed from: l */
    private HandlerC21649a f51379l;

    /* renamed from: m */
    private Method f51380m;

    static {
        Covode.recordClassIndex(25289);
    }

    /* renamed from: a */
    public final int mo35296a() {
        try {
            if (f51370c == null || f51372e == null || f51373f == null || f51371d == null || f51374g == null || f51375h == null || f51376i == null) {
                f51370c = (MessageQueue) C21625b.m40575a(Looper.class, "mQueue").get(Looper.getMainLooper());
                f51372e = C21625b.m40575a(MessageQueue.class, "mMessages");
                f51373f = C21625b.m40575a(MessageQueue.class, "mNextBarrierToken");
                Object a = C21633h.m40584a(Class.forName("android.view.WindowManagerGlobal"), "getInstance", new Object[0]);
                f51371d = a;
                f51374g = C21625b.m40575a(a.getClass(), "mRoots");
                f51375h = C21625b.m40575a(Class.forName("android.view.ViewRootImpl"), "mTraversalBarrier");
                f51376i = C21625b.m40575a(Message.class, "next");
                C21630g.m40583a(C21630g.EnumC21632a.INFO);
            }
            if (f51369b == null) {
                f51369b = C21625b.m40576a(MessageQueue.class, "removeSyncBarrier", Integer.TYPE);
            }
            if (this.f51379l == null) {
                this.f51379l = new HandlerC21649a(Looper.getMainLooper());
            }
            return 0;
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: com.bytedance.platform.a.b.b.a$a */
    public class HandlerC21649a extends Handler {
        static {
            Covode.recordClassIndex(25290);
        }

        public final void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 1001) {
                try {
                    int i = message.arg1;
                    Method method = C21648a.f51369b;
                    MessageQueue messageQueue = C21648a.f51370c;
                    Object[] objArr = {Integer.valueOf(i)};
                    Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{messageQueue, objArr}, 110000, "java.lang.Object", true, "com_bytedance_platform_horae_java_impl_barrier_BarrierMonitor$BarrierHandler_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                    if (((Boolean) a.first).booleanValue()) {
                        Object obj = a.second;
                    } else {
                        C15346a.m28242a(method.invoke(messageQueue, objArr), method, new Object[]{messageQueue, objArr}, "com_bytedance_platform_horae_java_impl_barrier_BarrierMonitor$BarrierHandler_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                    }
                    "force remove lost barrier for:".concat(String.valueOf(i));
                    C21630g.m40583a(C21630g.EnumC21632a.WARNING);
                } catch (Exception e) {
                    "delete barrier message throwable !!!".concat(String.valueOf(e));
                    C21630g.m40583a(C21630g.EnumC21632a.WARNING);
                    e.printStackTrace();
                }
            }
        }

        public HandlerC21649a(Looper looper) {
            super(looper);
        }
    }

    /* renamed from: a */
    private static int m40600a(int i) {
        Object obj = f51374g.get(f51371d);
        if (obj instanceof ArrayList) {
            ArrayList arrayList = (ArrayList) obj;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                Object obj2 = arrayList.get(i2);
                if (((Integer) f51375h.get(obj2)).intValue() == i) {
                    "mTraversalBarrier == token : for viewRoot:".concat(String.valueOf(obj2));
                    C21630g.m40583a(C21630g.EnumC21632a.DEBUG);
                    return -1;
                }
            }
            return 0;
        }
        " mRoots type is:".concat(String.valueOf(obj));
        C21630g.m40583a(C21630g.EnumC21632a.ERROR);
        return -1;
    }

    /* renamed from: a */
    public final int mo35297a(WeakReference<Message> weakReference) {
        try {
            Message message = weakReference.get();
            ArrayList arrayList = new ArrayList();
            Message message2 = message;
            int i = 0;
            int i2 = -1;
            while (message2 != null && i < 5 && message2.getTarget() == null && message2.arg1 >= 0) {
                if (message2.arg1 > 0) {
                    message2.getWhen();
                    C21630g.m40583a(C21630g.EnumC21632a.DEBUG);
                }
                i2 = message2.arg1;
                arrayList.add(Integer.valueOf(i2));
                message2 = (Message) f51376i.get(message2);
                i++;
            }
            int size = arrayList.size();
            if (size <= 0) {
                return -1;
            }
            int i3 = 0;
            while (m40600a(((Integer) arrayList.get(i3)).intValue()) >= 0) {
                i3++;
                if (i3 >= size) {
                    if (this.f51378k != i2) {
                        this.f51377j = 0;
                        this.f51378k = i2;
                    }
                    int intValue = ((Integer) f51373f.get(f51370c)).intValue();
                    C21630g.m40583a(C21630g.EnumC21632a.INFO);
                    if (i2 < intValue) {
                        this.f51377j++;
                    }
                    if (this.f51377j < 2) {
                        C21630g.m40583a(C21630g.EnumC21632a.INFO);
                        return -1;
                    }
                    "firstMsg:".concat(String.valueOf(message));
                    C21630g.m40583a(C21630g.EnumC21632a.WARNING);
                    int i4 = 1001;
                    this.f51379l.removeMessages(1001);
                    int i5 = 0;
                    int i6 = -1;
                    while (true) {
                        int intValue2 = ((Integer) arrayList.get(i5)).intValue();
                        if (intValue2 < intValue) {
                            Message obtainMessage = this.f51379l.obtainMessage(i4, intValue2, 0);
                            if (Build.VERSION.SDK_INT >= 22) {
                                obtainMessage.setAsynchronous(true);
                            } else {
                                if (this.f51380m == null) {
                                    this.f51380m = C21633h.m40586a((Class<?>) Message.class, "setAsynchronous", Boolean.TYPE);
                                }
                                try {
                                    Method method = this.f51380m;
                                    Object[] objArr = {true};
                                    Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obtainMessage, objArr}, 110000, "java.lang.Object", true, "com_bytedance_platform_horae_java_impl_barrier_BarrierMonitor_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                                    if (((Boolean) a.first).booleanValue()) {
                                        Object obj = a.second;
                                    } else {
                                        C15346a.m28242a(method.invoke(obtainMessage, objArr), method, new Object[]{obtainMessage, objArr}, "com_bytedance_platform_horae_java_impl_barrier_BarrierMonitor_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                                    }
                                } catch (Throwable unused) {
                                }
                            }
                            this.f51379l.sendMessage(obtainMessage);
                            i6 = intValue2;
                        }
                        i5++;
                        i4 = 1001;
                        if (i5 >= size) {
                            this.f51377j = 0;
                            this.f51378k = -1;
                            return i6;
                        }
                    }
                }
            }
            return -1;
        } catch (Throwable unused2) {
            C21630g.m40583a(C21630g.EnumC21632a.WARNING);
            return -1;
        }
    }
}
