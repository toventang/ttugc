package com.bytedance.platform.p1565a.p1567b.p1570c;

import android.app.Service;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.p1565a.p1566a.C21624a;
import com.bytedance.platform.p1565a.p1566a.C21625b;
import com.bytedance.platform.p1565a.p1567b.C21637a;
import com.bytedance.platform.p1565a.p1567b.p1568a.C21638a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.platform.a.b.c.e */
public final class C21660e implements Handler.Callback {

    /* renamed from: a */
    public static C21660e f51404a = new C21660e();

    /* renamed from: e */
    private static Map<IBinder, Service> f51405e;

    /* renamed from: b */
    public List<C21637a> f51406b = new ArrayList();

    /* renamed from: c */
    public boolean f51407c;

    /* renamed from: d */
    public Handler.Callback f51408d;

    static {
        Covode.recordClassIndex(25301);
    }

    private C21660e() {
    }

    public final boolean handleMessage(Message message) {
        if (C21638a.m40592b(message)) {
            if (message.arg2 == 9529) {
                return true;
            }
            try {
                this.f51406b.add(C21637a.m40590a(message));
                if (this.f51406b.size() > 100) {
                    this.f51406b.subList(0, 50).clear();
                }
            } catch (Throwable unused) {
            }
            message.arg2 = 9529;
        }
        Handler.Callback callback = this.f51408d;
        if (callback != null) {
            return callback.handleMessage(message);
        }
        return false;
    }

    /* renamed from: a */
    public final synchronized String mo35323a(IBinder iBinder) {
        String str;
        MethodCollector.m26663i(1027);
        if (f51405e == null) {
            try {
                Object a = C21624a.m40571a();
                f51405e = (Map) C21625b.m40575a(a.getClass(), "mServices").get(a);
            } catch (Throwable unused) {
            }
        }
        Map<IBinder, Service> map = f51405e;
        str = null;
        if (!(map == null || map.get(iBinder) == null)) {
            str = f51405e.get(iBinder).getClass().getName();
        }
        if (str == null) {
            this.f51407c = true;
        }
        MethodCollector.m26664o(1027);
        return str;
    }
}
