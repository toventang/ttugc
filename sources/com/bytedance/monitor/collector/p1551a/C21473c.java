package com.bytedance.monitor.collector.p1551a;

import android.content.pm.ServiceInfo;
import android.os.IBinder;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;

/* renamed from: com.bytedance.monitor.collector.a.c */
public final class C21473c {

    /* renamed from: f */
    private static Field f50897f;

    /* renamed from: g */
    private static Field f50898g;

    /* renamed from: h */
    private static Field f50899h;

    /* renamed from: i */
    private static Field f50900i;

    /* renamed from: j */
    private static Field f50901j;

    /* renamed from: k */
    private static Field f50902k;

    /* renamed from: a */
    public String f50903a;

    /* renamed from: b */
    public int f50904b;

    /* renamed from: c */
    public long f50905c;

    /* renamed from: d */
    public String f50906d;

    /* renamed from: e */
    public String f50907e;

    static {
        Covode.recordClassIndex(25100);
    }

    public C21473c() {
    }

    public final String toString() {
        return "ServiceFollowBean{mServiceName='" + this.f50903a + '\'' + ", mWhat=" + this.f50904b + ", mTimeStamp=" + this.f50905c + ", mToken='" + this.f50906d + '\'' + ", mThreadName='" + this.f50907e + '\'' + '}';
    }

    /* renamed from: a */
    public static C21473c m40335a(Message message) {
        try {
            switch (message.what) {
                case 114:
                    if (f50897f == null) {
                        f50897f = C21471a.m40330a(message.obj.getClass(), "info");
                    }
                    if (f50898g == null) {
                        f50898g = C21471a.m40330a(message.obj.getClass(), "token");
                    }
                    ServiceInfo serviceInfo = (ServiceInfo) f50897f.get(message.obj);
                    String str = null;
                    if (serviceInfo != null) {
                        str = serviceInfo.name;
                    }
                    return new C21473c(str, message.what, System.currentTimeMillis(), f50898g.get(message.obj).toString());
                case 115:
                    if (f50899h == null) {
                        f50899h = C21471a.m40330a(message.obj.getClass(), "token");
                    }
                    IBinder iBinder = (IBinder) f50899h.get(message.obj);
                    if (iBinder != null) {
                        return new C21473c(C21474d.f50908a.mo35071a(iBinder), message.what, System.currentTimeMillis(), iBinder.toString());
                    }
                    break;
                case 116:
                    return new C21473c(C21474d.f50908a.mo35071a((IBinder) message.obj), message.what, System.currentTimeMillis(), message.obj.toString());
                case 117:
                case 118:
                case 119:
                case 120:
                default:
                    throw new IllegalArgumentException("message.what = " + message.what + " is not excepted!");
                case 121:
                    if (f50900i == null) {
                        f50900i = C21471a.m40330a(message.obj.getClass(), "token");
                    }
                    IBinder iBinder2 = (IBinder) f50900i.get(message.obj);
                    if (iBinder2 != null) {
                        return new C21473c(C21474d.f50908a.mo35071a(iBinder2), message.what, System.currentTimeMillis(), iBinder2.toString());
                    }
                    break;
                case 122:
                    if (f50901j == null) {
                        f50901j = C21471a.m40330a(message.obj.getClass(), "token");
                    }
                    IBinder iBinder3 = (IBinder) f50901j.get(message.obj);
                    if (iBinder3 != null) {
                        return new C21473c(C21474d.f50908a.mo35071a(iBinder3), message.what, System.currentTimeMillis(), iBinder3.toString());
                    }
                    break;
                case 123:
                    if (f50902k == null) {
                        f50902k = C21471a.m40330a(message.obj.getClass(), "token");
                    }
                    IBinder iBinder4 = (IBinder) f50902k.get(message.obj);
                    if (iBinder4 != null) {
                        return new C21473c(C21474d.f50908a.mo35071a(iBinder4), message.what, System.currentTimeMillis(), iBinder4.toString());
                    }
                    break;
            }
        } catch (Throwable unused) {
        }
        return new C21473c("unknow", message.what, System.currentTimeMillis(), "unknow");
    }

    private C21473c(String str, int i, long j, String str2) {
        this.f50903a = str;
        this.f50904b = i;
        this.f50905c = j;
        this.f50906d = str2;
        this.f50907e = Thread.currentThread().getName();
    }
}
