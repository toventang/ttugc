package com.p2082ss.android.ugc.aweme.compliance.protection.antiaddiction;

import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.C27252o;
import com.p2082ss.android.p2085a.p2086a.p2087a.C29339a;
import com.p2082ss.android.ugc.aweme.AbstractC33485al;
import com.p2082ss.android.ugc.aweme.compliance.protection.antiaddiction.p2672b.C40047a;
import com.p2082ss.android.ugc.aweme.compliance.protection.antiaddiction.p2672b.C40051b;
import com.p2082ss.android.ugc.aweme.compliance.protection.antiaddiction.p2672b.C40052c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.ugc.aweme.compliance.protection.antiaddiction.c */
public final class C40055c implements WeakHandler.IHandler, AbstractC33485al {

    /* renamed from: b */
    private static Integer f94090b;

    /* renamed from: c */
    private static Integer f94091c;

    /* renamed from: a */
    public final ArrayList<AbstractC40057d> f94092a;

    /* renamed from: d */
    private final C27252o f94093d = new C27252o();

    /* renamed from: e */
    private final WeakHandler f94094e = new WeakHandler(this);

    static {
        Covode.recordClassIndex(47826);
    }

    /* renamed from: c */
    public static int m81014c() {
        if (f94091c == null) {
            f94091c = 5000;
        }
        return f94091c.intValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC33485al
    /* renamed from: b */
    public final void mo59569b() {
        WeakHandler weakHandler = this.f94094e;
        if (f94090b == null) {
            f94090b = 30000;
        }
        weakHandler.sendEmptyMessageDelayed(100004, (long) f94090b.intValue());
    }

    public C40055c() {
        ArrayList<AbstractC40057d> arrayList = new ArrayList<>();
        this.f94092a = arrayList;
        arrayList.clear();
        m81013a(new C40047a());
        m81013a(new C40051b());
        m81013a(new C40052c());
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC33485al
    /* renamed from: a */
    public final void mo59568a() {
        this.f94094e.removeMessages(100004);
        if (!this.f94094e.hasMessages(100003)) {
            this.f94094e.sendEmptyMessageDelayed(100003, (long) m81014c());
        }
        if (!this.f94093d.f64413a) {
            this.f94093d.mo45340b();
        }
    }

    /* renamed from: a */
    private void m81013a(AbstractC40057d dVar) {
        if (!this.f94092a.contains(dVar)) {
            this.f94092a.add(dVar);
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        switch (message.what) {
            case 100003:
                this.f94094e.sendEmptyMessageDelayed(100003, (long) m81014c());
                final long a = this.f94093d.mo45339a(TimeUnit.MILLISECONDS);
                C29339a.m58752a(new Runnable() {
                    /* class com.p2082ss.android.ugc.aweme.compliance.protection.antiaddiction.C40055c.RunnableC400561 */

                    static {
                        Covode.recordClassIndex(47827);
                    }

                    public final void run() {
                        long currentTimeMillis = System.currentTimeMillis();
                        Iterator<AbstractC40057d> it = C40055c.this.f94092a.iterator();
                        while (it.hasNext()) {
                            it.next().mo69199a(currentTimeMillis, a);
                        }
                    }
                });
                return;
            case 100004:
                this.f94094e.removeMessages(100003);
                this.f94093d.mo45342d();
                C40046b.m81004a().f94081f = "";
                C40046b.m81004a().f94080e = false;
                Iterator<AbstractC40057d> it = this.f94092a.iterator();
                while (it.hasNext()) {
                    AbstractC40057d next = it.next();
                    if (next instanceof C40051b) {
                        ((C40051b) next).f94087a.f94071c = 0;
                        return;
                    }
                }
                return;
            default:
                return;
        }
    }
}
