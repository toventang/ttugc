package com.bytedance.tux.extension.player.p1718a;

import android.view.View;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.tux.extension.player.a.a */
public abstract class AbstractView$OnClickListenerC23076a implements View.OnClickListener {

    /* renamed from: b */
    public static final C23077a f54629b = new C23077a((byte) 0);

    /* renamed from: a */
    public boolean f54630a = true;

    /* renamed from: c */
    private final long f54631c = 300;

    /* renamed from: d */
    private final Runnable f54632d = new RunnableC23078b(this);

    static {
        Covode.recordClassIndex(27000);
    }

    /* renamed from: a */
    public abstract void mo37516a(View view);

    /* renamed from: com.bytedance.tux.extension.player.a.a$a */
    public static final class C23077a {
        static {
            Covode.recordClassIndex(27001);
        }

        private C23077a() {
        }

        public /* synthetic */ C23077a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.tux.extension.player.a.a$b */
    static final class RunnableC23078b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractView$OnClickListenerC23076a f54633a;

        static {
            Covode.recordClassIndex(27002);
        }

        RunnableC23078b(AbstractView$OnClickListenerC23076a aVar) {
            this.f54633a = aVar;
        }

        public final void run() {
            this.f54633a.f54630a = true;
        }
    }

    public void onClick(View view) {
        C89219l.m154719c(view, "");
        if (this.f54630a) {
            this.f54630a = false;
            view.postDelayed(this.f54632d, this.f54631c);
            mo37516a(view);
        }
    }
}
