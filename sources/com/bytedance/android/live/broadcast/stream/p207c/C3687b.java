package com.bytedance.android.live.broadcast.stream.p207c;

import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.broadcast.stream.c.b */
public class C3687b implements Handler.Callback {

    /* renamed from: a */
    public Handler f10148a;

    /* renamed from: b */
    private boolean f10149b;

    /* renamed from: c */
    private final long f10150c;

    /* renamed from: d */
    private AbstractC3686a f10151d;

    /* renamed from: e */
    private int f10152e;

    static {
        Covode.recordClassIndex(4199);
    }

    /* renamed from: a */
    public final void mo8956a() {
        if (!this.f10149b) {
            this.f10152e = 2;
            m9144b(0);
            this.f10149b = true;
        }
    }

    /* renamed from: b */
    public final void mo8958b() {
        if (this.f10149b) {
            m9143a(2, 0);
        }
    }

    /* renamed from: c */
    public final void mo8959c() {
        if (this.f10149b) {
            m9143a(3, 0);
        }
    }

    public C3687b(AbstractC3686a aVar) {
        this(aVar, (byte) 0);
    }

    public boolean handleMessage(Message message) {
        if (102 != message.what) {
            return true;
        }
        m9144b(0);
        return true;
    }

    /* renamed from: b */
    private void m9144b(int i) {
        this.f10148a.removeMessages(102);
        this.f10151d.mo8582a(this.f10152e, i);
        if (4 != this.f10152e) {
            this.f10148a.sendEmptyMessageDelayed(102, this.f10150c);
        }
    }

    /* renamed from: a */
    public final void mo8957a(int i) {
        if (this.f10149b) {
            this.f10148a.removeMessages(102);
            this.f10149b = false;
            m9143a(4, i);
        }
    }

    /* renamed from: a */
    private void m9143a(int i, int i2) {
        this.f10152e = i;
        m9144b(i2);
    }

    private C3687b(AbstractC3686a aVar, byte b) {
        this.f10152e = 1;
        this.f10148a = new Handler(this);
        this.f10150c = 5000;
        this.f10151d = aVar;
    }
}
