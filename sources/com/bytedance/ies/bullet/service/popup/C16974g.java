package com.bytedance.ies.bullet.service.popup;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.AbstractC16650k;
import java.util.Timer;
import java.util.TimerTask;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.service.popup.g */
public final class C16974g {

    /* renamed from: a */
    public View f40422a;

    /* renamed from: b */
    public Timer f40423b;

    /* renamed from: c */
    public TimerTask f40424c;

    /* renamed from: d */
    long f40425d = 500;

    /* renamed from: e */
    public Activity f40426e;

    /* renamed from: f */
    private ViewGroup f40427f;

    static {
        Covode.recordClassIndex(19416);
    }

    /* renamed from: com.bytedance.ies.bullet.service.popup.g$a */
    public static final class C16975a extends TimerTask {

        /* renamed from: a */
        final /* synthetic */ C16974g f40428a;

        static {
            Covode.recordClassIndex(19417);
        }

        public final void run() {
            this.f40428a.f40426e.runOnUiThread(new RunnableC16976a(this));
        }

        /* renamed from: com.bytedance.ies.bullet.service.popup.g$a$a */
        static final class RunnableC16976a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C16975a f40429a;

            static {
                Covode.recordClassIndex(19418);
            }

            RunnableC16976a(C16975a aVar) {
                this.f40429a = aVar;
            }

            public final void run() {
                AbstractC16650k kVar = null;
                this.f40429a.f40428a.f40423b = null;
                this.f40429a.f40428a.f40424c = null;
                View view = this.f40429a.f40428a.f40422a;
                if (view instanceof AbstractC16650k) {
                    kVar = view;
                }
                AbstractC16650k kVar2 = kVar;
                if (kVar2 != null) {
                    kVar2.mo26412a();
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C16975a(C16974g gVar) {
            this.f40428a = gVar;
        }
    }

    /* renamed from: a */
    public final void mo26804a() {
        TimerTask timerTask = this.f40424c;
        if (timerTask != null) {
            timerTask.cancel();
        }
        Timer timer = this.f40423b;
        if (timer != null) {
            timer.cancel();
        }
    }

    public C16974g(Activity activity, ViewGroup viewGroup) {
        C89219l.m154719c(activity, "");
        C89219l.m154719c(viewGroup, "");
        this.f40426e = activity;
        this.f40427f = viewGroup;
    }
}
