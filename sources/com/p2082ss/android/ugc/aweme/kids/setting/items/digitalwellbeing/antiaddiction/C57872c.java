package com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.antiaddiction;

import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.C27252o;
import com.p2082ss.android.p2085a.p2086a.p2087a.C29339a;
import com.p2082ss.android.ugc.aweme.AbstractC33485al;
import com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.antiaddiction.p3370b.C57868a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.antiaddiction.c */
public final class C57872c implements WeakHandler.IHandler, AbstractC33485al {

    /* renamed from: b */
    private static Integer f131942b;

    /* renamed from: c */
    private static Integer f131943c;

    /* renamed from: a */
    public ArrayList<AbstractC57874d> f131944a = new ArrayList<>();

    /* renamed from: d */
    private C27252o f131945d = new C27252o();

    /* renamed from: e */
    private WeakHandler f131946e = new WeakHandler(this);

    static {
        Covode.recordClassIndex(67882);
    }

    /* renamed from: c */
    public static int m104624c() {
        if (f131943c == null) {
            f131943c = 5000;
        }
        return f131943c.intValue();
    }

    public C57872c() {
        this.f131944a.clear();
        C57868a aVar = new C57868a();
        if (!this.f131944a.contains(aVar)) {
            this.f131944a.add(aVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC33485al
    /* renamed from: a */
    public final void mo59568a() {
        this.f131946e.removeMessages(100004);
        if (!this.f131946e.hasMessages(100003)) {
            this.f131946e.sendEmptyMessageDelayed(100003, (long) m104624c());
        }
        if (!this.f131945d.f64413a) {
            this.f131945d.mo45340b();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC33485al
    /* renamed from: b */
    public final void mo59569b() {
        int i;
        WeakHandler weakHandler = this.f131946e;
        if (f131942b == null) {
            if (C57862a.m104610b()) {
                i = 20000;
            } else {
                i = 30000;
            }
            f131942b = Integer.valueOf(i);
        }
        weakHandler.sendEmptyMessageDelayed(100004, (long) f131942b.intValue());
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        switch (message.what) {
            case 100003:
                this.f131946e.sendEmptyMessageDelayed(100003, (long) m104624c());
                final long a = this.f131945d.mo45339a(TimeUnit.MILLISECONDS);
                C29339a.m58752a(new Runnable() {
                    /* class com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.antiaddiction.C57872c.RunnableC578731 */

                    static {
                        Covode.recordClassIndex(67883);
                    }

                    public final void run() {
                        System.currentTimeMillis();
                        Iterator<AbstractC57874d> it = C57872c.this.f131944a.iterator();
                        while (it.hasNext()) {
                            it.next().mo95173a();
                        }
                    }
                });
                return;
            case 100004:
                this.f131946e.removeMessages(100003);
                this.f131945d.mo45342d();
                C57862a.m104609a().f131922b = "";
                C57862a.m104609a().f131921a = false;
                return;
            default:
                return;
        }
    }
}
