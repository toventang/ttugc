package com.bytedance.sdk.p1625a.p1650j.p1651a;

import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1650j.p1651a.AbstractC22460e;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.sdk.a.j.a.c */
public abstract class AbstractRunnableC22458c implements WeakHandler.IHandler, AbstractC22460e, Comparable<AbstractC22460e>, Runnable {

    /* renamed from: g */
    private static C22462f f53094g = C22462f.m42397a();

    /* renamed from: a */
    protected final AtomicBoolean f53095a = new AtomicBoolean(false);

    /* renamed from: b */
    protected final AtomicBoolean f53096b = new AtomicBoolean(false);

    /* renamed from: c */
    WeakHandler f53097c = new WeakHandler(Looper.getMainLooper(), this);

    /* renamed from: d */
    int f53098d;

    /* renamed from: e */
    public final String f53099e;

    /* renamed from: f */
    protected final AbstractC22460e.EnumC22461a f53100f;

    public void run() {
    }

    @Override // com.bytedance.sdk.p1625a.p1650j.p1651a.AbstractC22460e
    /* renamed from: d */
    public final AbstractC22460e.EnumC22461a mo36751d() {
        return this.f53100f;
    }

    @Override // com.bytedance.sdk.p1625a.p1650j.p1651a.AbstractC22460e
    /* renamed from: e */
    public final int mo36752e() {
        return this.f53098d;
    }

    /* renamed from: a */
    public final boolean mo36747a() {
        return this.f53096b.get();
    }

    /* renamed from: c */
    public final void mo36749c() {
        this.f53096b.compareAndSet(false, true);
    }

    /* renamed from: g */
    public final void mo36754g() {
        this.f53097c.removeMessages(0);
    }

    static {
        Covode.recordClassIndex(26274);
    }

    /* renamed from: f */
    public final void mo36753f() {
        mo36754g();
        this.f53097c.sendEmptyMessageDelayed(0, 1000);
    }

    /* renamed from: b */
    public final void mo36748b() {
        if (this.f53095a.compareAndSet(false, true)) {
            if (f53094g == null) {
                f53094g = C22462f.m42397a();
            }
            f53094g.mo36755a(this);
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        if (message != null) {
            try {
                int i = message.what;
                if (i == 0) {
                    f53094g.mo36756b();
                } else if (i == 1) {
                    f53094g.mo36757c();
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(AbstractC22460e eVar) {
        AbstractC22460e eVar2 = eVar;
        AbstractC22460e.EnumC22461a aVar = this.f53100f;
        AbstractC22460e.EnumC22461a d = eVar2.mo36751d();
        if (aVar == null) {
            aVar = AbstractC22460e.EnumC22461a.NORMAL;
        }
        if (d == null) {
            d = AbstractC22460e.EnumC22461a.NORMAL;
        }
        if (aVar == d) {
            return this.f53098d - eVar2.mo36752e();
        }
        return d.ordinal() - aVar.ordinal();
    }

    public AbstractRunnableC22458c(String str, AbstractC22460e.EnumC22461a aVar) {
        this.f53100f = aVar;
        this.f53099e = C13627m.m24498a(null) ? getClass().getSimpleName() : str;
    }
}
