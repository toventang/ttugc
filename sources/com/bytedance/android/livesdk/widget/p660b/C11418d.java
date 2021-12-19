package com.bytedance.android.livesdk.widget.p660b;

import android.os.Handler;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7703a;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.android.livesdk.widget.p660b.C11381c;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.widget.b.d */
public final class C11418d {

    /* renamed from: a */
    public boolean f27375a;

    /* renamed from: b */
    public boolean f27376b;

    /* renamed from: c */
    public Runnable f27377c = new RunnableC11420b(this);

    /* renamed from: d */
    public Runnable f27378d = new RunnableC11419a(this);

    /* renamed from: e */
    public long f27379e = InteractFirstFrameTimeOutDurationSetting.INSTANCE.getValue();

    /* renamed from: f */
    public AbstractC7703a f27380f;

    /* renamed from: g */
    public Handler f27381g;

    static {
        Covode.recordClassIndex(13074);
    }

    /* renamed from: com.bytedance.android.livesdk.widget.b.d$b */
    static final class RunnableC11420b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C11418d f27383a;

        static {
            Covode.recordClassIndex(13076);
        }

        RunnableC11420b(C11418d dVar) {
            this.f27383a = dVar;
        }

        public final void run() {
            C11381c cVar;
            C3854a.m9453a(4, "WidgetLoadState", "widget state loadWidgetP1Runnable call");
            AbstractC7703a aVar = this.f27383a.f27380f;
            if (aVar != null && (cVar = aVar.f19104D) != null) {
                cVar.f27340a.mo13070a(C11381c.AbstractC11382a.C11386d.f27345a);
            }
        }
    }

    /* renamed from: b */
    public final void mo18257b() {
        Handler handler = this.f27381g;
        if (handler != null) {
            handler.removeCallbacks(this.f27377c);
        }
        Handler handler2 = this.f27381g;
        if (handler2 != null) {
            handler2.removeCallbacks(this.f27378d);
        }
        this.f27381g = null;
        this.f27380f = null;
    }

    /* renamed from: com.bytedance.android.livesdk.widget.b.d$a */
    static final class RunnableC11419a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C11418d f27382a;

        static {
            Covode.recordClassIndex(13075);
        }

        RunnableC11419a(C11418d dVar) {
            this.f27382a = dVar;
        }

        public final void run() {
            C11381c cVar;
            C11381c cVar2;
            C3854a.m9453a(4, "WidgetLoadState", "widget state loadWidgetP2Runnable call");
            AbstractC7703a aVar = this.f27382a.f27380f;
            if (!(aVar == null || (cVar2 = aVar.f19104D) == null)) {
                cVar2.f27340a.mo13070a(C11381c.AbstractC11382a.C11384b.f27343a);
            }
            AbstractC7703a aVar2 = this.f27382a.f27380f;
            if (aVar2 != null && (cVar = aVar2.f19104D) != null) {
                cVar.f27340a.mo13070a(C11381c.AbstractC11382a.C11383a.f27342a);
            }
        }
    }

    /* renamed from: a */
    public final void mo18256a() {
        C11381c cVar;
        Handler handler = this.f27381g;
        if (handler != null) {
            handler.removeCallbacks(this.f27377c);
        }
        Handler handler2 = this.f27381g;
        if (handler2 != null) {
            handler2.removeCallbacks(this.f27378d);
        }
        AbstractC7703a aVar = this.f27380f;
        if (!(aVar == null || (cVar = aVar.f19104D) == null)) {
            cVar.mo18255a();
        }
        this.f27375a = false;
        this.f27376b = false;
    }

    public C11418d(AbstractC7703a aVar, Handler handler) {
        this.f27380f = aVar;
        this.f27381g = handler;
    }
}
