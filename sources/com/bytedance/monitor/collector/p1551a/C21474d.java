package com.bytedance.monitor.collector.p1551a;

import android.app.Service;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.monitor.p1546a.C21429a;
import java.util.Map;

/* renamed from: com.bytedance.monitor.collector.a.d */
public final class C21474d implements Handler.Callback {

    /* renamed from: a */
    public static C21474d f50908a = new C21474d();

    /* renamed from: b */
    public static C21473c f50909b = null;

    /* renamed from: d */
    private static Map<IBinder, Service> f50910d;

    /* renamed from: c */
    public Handler.Callback f50911c;

    private C21474d() {
    }

    static {
        Covode.recordClassIndex(25101);
    }

    public final boolean handleMessage(Message message) {
        try {
            if (C21472b.f50896a.contains(Integer.valueOf(message.what))) {
                f50909b = C21473c.m40335a(message);
            }
        } catch (Throwable unused) {
        }
        Handler.Callback callback = this.f50911c;
        if (callback != null) {
            return callback.handleMessage(message);
        }
        return false;
    }

    /* renamed from: a */
    public final synchronized String mo35071a(IBinder iBinder) {
        String str;
        if (f50910d == null) {
            try {
                Object b = C21429a.m40230b();
                f50910d = (Map) C21471a.m40330a(b.getClass(), "mServices").get(b);
            } catch (Throwable unused) {
            }
        }
        Map<IBinder, Service> map = f50910d;
        str = null;
        if (!(map == null || map.get(iBinder) == null)) {
            str = f50910d.get(iBinder).getClass().getName();
        }
        return str;
    }
}
