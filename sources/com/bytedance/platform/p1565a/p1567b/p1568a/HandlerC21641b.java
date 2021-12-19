package com.bytedance.platform.p1565a.p1567b.p1568a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.platform.p1565a.AbstractC21636b;
import com.bytedance.platform.p1565a.p1566a.C21630g;
import com.bytedance.platform.p1565a.p1567b.C21637a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.platform.a.b.a.b */
public final class HandlerC21641b extends Handler {

    /* renamed from: a */
    private Map<String, List<Message>> f51344a = new HashMap();

    static {
        Covode.recordClassIndex(25282);
    }

    public HandlerC21641b(Looper looper) {
        super(looper);
    }

    /* renamed from: a */
    private static void m40596a(C21637a aVar) {
        try {
            C21646d.f51361a.mo35294a(aVar);
            if (C21646d.f51361a.f51362b.size() > 100) {
                C21646d.f51361a.f51362b.subList(0, 50).clear();
            }
        } catch (Throwable unused) {
        }
    }

    public final void handleMessage(Message message) {
        super.handleMessage(message);
        if (message.obj instanceof Message) {
            final Message message2 = (Message) message.obj;
            if (C21638a.m40592b(message2)) {
                C21637a a = C21637a.m40590a(message2);
                if (TextUtils.isEmpty(a.f51331a)) {
                    List<Message> list = this.f51344a.get(a.f51332b);
                    if (list == null) {
                        list = new ArrayList<>();
                    }
                    list.add(message2);
                    this.f51344a.put(a.f51332b, list);
                    C21630g.m40583a(C21630g.EnumC21632a.ERROR);
                    return;
                }
                System.currentTimeMillis();
                int i = message2.what;
                AbstractC21636b bVar = RunnableC21643c.m40597a().f51352e;
                C21638a.m40591a(message2);
                m40596a(a);
                if (bVar != null) {
                    System.currentTimeMillis();
                }
                List<Message> list2 = this.f51344a.get(a.f51332b);
                if (list2 != null && message2.what == 114) {
                    for (Message message3 : list2) {
                        C21630g.m40583a(C21630g.EnumC21632a.ERROR);
                        C21637a a2 = C21637a.m40590a(message3);
                        "After father message now service follow bean is ".concat(String.valueOf(a2));
                        C21630g.m40583a(C21630g.EnumC21632a.ERROR);
                        System.currentTimeMillis();
                        int i2 = message3.what;
                        C21638a.m40591a(message3);
                        if (bVar != null) {
                            System.currentTimeMillis();
                        }
                        m40596a(a2);
                    }
                    list2.clear();
                }
                "Handle message ".concat(String.valueOf(message2));
                C21630g.m40583a(C21630g.EnumC21632a.ERROR);
                return;
            }
            new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new Runnable() {
                /* class com.bytedance.platform.p1565a.p1567b.p1568a.HandlerC21641b.RunnableC216421 */

                static {
                    Covode.recordClassIndex(25283);
                }

                public final void run() {
                    C21638a.m40591a(message2);
                }
            });
        }
    }
}
