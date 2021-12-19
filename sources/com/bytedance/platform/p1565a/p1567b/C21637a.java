package com.bytedance.platform.p1565a.p1567b;

import android.content.Intent;
import android.content.pm.ServiceInfo;
import android.os.IBinder;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.platform.p1565a.p1566a.C21625b;
import com.bytedance.platform.p1565a.p1566a.C21630g;
import com.bytedance.platform.p1565a.p1567b.p1570c.C21660e;
import java.lang.reflect.Field;

/* renamed from: com.bytedance.platform.a.b.a */
public final class C21637a {

    /* renamed from: g */
    private static Field f51324g;

    /* renamed from: h */
    private static Field f51325h;

    /* renamed from: i */
    private static Field f51326i;

    /* renamed from: j */
    private static Field f51327j;

    /* renamed from: k */
    private static Field f51328k;

    /* renamed from: l */
    private static Field f51329l;

    /* renamed from: m */
    private static Field f51330m;

    /* renamed from: a */
    public String f51331a;

    /* renamed from: b */
    public String f51332b;

    /* renamed from: c */
    private int f51333c;

    /* renamed from: d */
    private long f51334d;

    /* renamed from: e */
    private String f51335e = Thread.currentThread().getName();

    /* renamed from: f */
    private int f51336f;

    static {
        Covode.recordClassIndex(25278);
    }

    public final String toString() {
        String str;
        int i = this.f51336f;
        if (i == 0) {
            str = "Not_Followed";
        } else if (i == 9527) {
            str = "System";
        } else if (i == 9528) {
            str = "Schedule";
        } else {
            str = "Error:" + this.f51336f;
        }
        return "ServiceFollowBean{mServiceName='" + this.f51331a + '\'' + ", mWhat=" + this.f51333c + ", mTimeStamp=" + this.f51334d + ", mToken='" + this.f51332b + '\'' + ", mThreadName='" + this.f51335e + '\'' + ", mHandleFlag=" + str + '}';
    }

    /* renamed from: a */
    public static C21637a m40590a(Message message) {
        try {
            switch (message.what) {
                case 113:
                    Object obj = message.obj;
                    if (f51330m == null) {
                        f51330m = C21625b.m40575a(obj.getClass(), "intent");
                    }
                    Intent intent = (Intent) f51330m.get(obj);
                    if (intent != null) {
                        intent.getComponent().getClassName();
                        C21630g.m40583a(C21630g.EnumC21632a.ERROR);
                        return new C21637a(intent.getComponent().getClassName(), message.what, System.currentTimeMillis(), "null", 0);
                    }
                    break;
                case 114:
                    if (f51324g == null) {
                        f51324g = C21625b.m40575a(message.obj.getClass(), "info");
                    }
                    if (f51325h == null) {
                        f51325h = C21625b.m40575a(message.obj.getClass(), "token");
                    }
                    ServiceInfo serviceInfo = (ServiceInfo) f51324g.get(message.obj);
                    String str = null;
                    if (serviceInfo != null) {
                        str = serviceInfo.name;
                    }
                    return new C21637a(str, message.what, System.currentTimeMillis(), f51325h.get(message.obj).toString(), message.arg2);
                case 115:
                    if (f51326i == null) {
                        f51326i = C21625b.m40575a(message.obj.getClass(), "token");
                    }
                    IBinder iBinder = (IBinder) f51326i.get(message.obj);
                    if (iBinder != null) {
                        return new C21637a(C21660e.f51404a.mo35323a(iBinder), message.what, System.currentTimeMillis(), iBinder.toString(), message.arg2);
                    }
                    break;
                case 116:
                    return new C21637a(C21660e.f51404a.mo35323a((IBinder) message.obj), message.what, System.currentTimeMillis(), message.obj.toString(), message.arg2);
                case 117:
                case 118:
                case 119:
                case 120:
                default:
                    throw new IllegalArgumentException("message.what = " + message.what + " is not excepted!");
                case 121:
                    if (f51327j == null) {
                        f51327j = C21625b.m40575a(message.obj.getClass(), "token");
                    }
                    IBinder iBinder2 = (IBinder) f51327j.get(message.obj);
                    if (iBinder2 != null) {
                        return new C21637a(C21660e.f51404a.mo35323a(iBinder2), message.what, System.currentTimeMillis(), iBinder2.toString(), message.arg2);
                    }
                    break;
                case 122:
                    if (f51328k == null) {
                        f51328k = C21625b.m40575a(message.obj.getClass(), "token");
                    }
                    IBinder iBinder3 = (IBinder) f51328k.get(message.obj);
                    if (iBinder3 != null) {
                        return new C21637a(C21660e.f51404a.mo35323a(iBinder3), message.what, System.currentTimeMillis(), iBinder3.toString(), message.arg2);
                    }
                    break;
                case 123:
                    if (f51329l == null) {
                        f51329l = C21625b.m40575a(message.obj.getClass(), "token");
                    }
                    IBinder iBinder4 = (IBinder) f51329l.get(message.obj);
                    if (iBinder4 != null) {
                        return new C21637a(C21660e.f51404a.mo35323a(iBinder4), message.what, System.currentTimeMillis(), iBinder4.toString(), message.arg2);
                    }
                    break;
            }
        } catch (Throwable unused) {
        }
        return new C21637a("unknow", message.what, System.currentTimeMillis(), "unknow", message.arg2);
    }

    private C21637a(String str, int i, long j, String str2, int i2) {
        this.f51331a = str;
        this.f51333c = i;
        this.f51334d = j;
        this.f51332b = str2;
        this.f51336f = i2;
    }
}
