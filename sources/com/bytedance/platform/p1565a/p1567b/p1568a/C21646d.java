package com.bytedance.platform.p1565a.p1567b.p1568a;

import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.platform.p1565a.p1566a.C21624a;
import com.bytedance.platform.p1565a.p1567b.C21637a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.platform.a.b.a.d */
public final class C21646d implements Handler.Callback {

    /* renamed from: a */
    public static C21646d f51361a = new C21646d();

    /* renamed from: b */
    public List<C21637a> f51362b = new ArrayList();

    /* renamed from: c */
    public Handler.Callback f51363c;

    static {
        Covode.recordClassIndex(25287);
    }

    private C21646d() {
    }

    /* renamed from: a */
    public final void mo35294a(C21637a aVar) {
        this.f51362b.add(aVar);
    }

    public final boolean handleMessage(Message message) {
        if (message.arg2 == 1000089) {
            Handler.Callback callback = this.f51363c;
            if (callback != null) {
                return callback.handleMessage(message);
            }
            return false;
        } else if (C21638a.m40592b(message)) {
            RunnableC21643c a = RunnableC21643c.m40597a();
            Message obtain = Message.obtain(message);
            Message obtain2 = Message.obtain(a.f51349b);
            obtain2.obj = obtain;
            a.f51349b.sendMessageAtTime(obtain2, message.getWhen());
            return true;
        } else if (message.getTarget() == C21624a.m40572b() && C21638a.f51338b.contains(Integer.valueOf(message.what))) {
            C21638a.m40591a(Message.obtain(message));
            return true;
        } else {
            Handler.Callback callback2 = this.f51363c;
            if (callback2 != null) {
                return callback2.handleMessage(message);
            }
            return false;
        }
    }
}
