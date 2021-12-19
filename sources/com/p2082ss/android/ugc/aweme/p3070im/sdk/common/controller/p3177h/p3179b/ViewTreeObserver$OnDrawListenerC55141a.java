package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3177h.p3179b;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.h.b.a */
public final class ViewTreeObserver$OnDrawListenerC55141a implements ViewTreeObserver.OnDrawListener {

    /* renamed from: c */
    public static final C55142a f126178c = new C55142a((byte) 0);

    /* renamed from: a */
    public final View f126179a;

    /* renamed from: b */
    public final AbstractC55143b f126180b;

    /* renamed from: d */
    private final Handler f126181d = new Handler(Looper.getMainLooper());

    /* renamed from: e */
    private boolean f126182e;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.h.b.a$b */
    public interface AbstractC55143b {
        static {
            Covode.recordClassIndex(64871);
        }

        /* renamed from: a */
        void mo92065a();
    }

    static {
        Covode.recordClassIndex(64869);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.h.b.a$a */
    public static final class C55142a {
        static {
            Covode.recordClassIndex(64870);
        }

        private C55142a() {
        }

        public /* synthetic */ C55142a(byte b) {
            this();
        }

        /* renamed from: a */
        public static ViewTreeObserver$OnDrawListenerC55141a m100854a(View view, AbstractC55143b bVar) {
            C89219l.m154721d(view, "");
            C89219l.m154721d(bVar, "");
            return new ViewTreeObserver$OnDrawListenerC55141a(view, bVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.h.b.a$c */
    static final class RunnableC55144c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ViewTreeObserver$OnDrawListenerC55141a f126183a;

        static {
            Covode.recordClassIndex(64872);
        }

        RunnableC55144c(ViewTreeObserver$OnDrawListenerC55141a aVar) {
            this.f126183a = aVar;
        }

        public final void run() {
            this.f126183a.f126180b.mo92065a();
        }
    }

    public final void onDraw() {
        if (!this.f126182e) {
            this.f126182e = true;
            this.f126181d.postAtFrontOfQueue(new RunnableC55144c(this));
            this.f126181d.post(new RunnableC55145d(this));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.h.b.a$d */
    static final class RunnableC55145d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ViewTreeObserver$OnDrawListenerC55141a f126184a;

        static {
            Covode.recordClassIndex(64873);
        }

        RunnableC55145d(ViewTreeObserver$OnDrawListenerC55141a aVar) {
            this.f126184a = aVar;
        }

        public final void run() {
            ViewTreeObserver viewTreeObserver = this.f126184a.f126179a.getViewTreeObserver();
            C89219l.m154716b(viewTreeObserver, "");
            if (viewTreeObserver.isAlive()) {
                this.f126184a.f126179a.getViewTreeObserver().removeOnDrawListener(this.f126184a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.h.b.a$e */
    public static final class View$OnAttachStateChangeListenerC55146e implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        final /* synthetic */ ViewTreeObserver$OnDrawListenerC55141a f126185a;

        static {
            Covode.recordClassIndex(64874);
        }

        public final void onViewDetachedFromWindow(View view) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        View$OnAttachStateChangeListenerC55146e(ViewTreeObserver$OnDrawListenerC55141a aVar) {
            this.f126185a = aVar;
        }

        public final void onViewAttachedToWindow(View view) {
            ViewTreeObserver viewTreeObserver = this.f126185a.f126179a.getViewTreeObserver();
            C89219l.m154716b(viewTreeObserver, "");
            if (viewTreeObserver.isAlive()) {
                this.f126185a.f126179a.getViewTreeObserver().addOnDrawListener(this.f126185a);
            }
            this.f126185a.f126179a.removeOnAttachStateChangeListener(this);
        }
    }

    public ViewTreeObserver$OnDrawListenerC55141a(View view, AbstractC55143b bVar) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(bVar, "");
        this.f126179a = view;
        this.f126180b = bVar;
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        C89219l.m154716b(viewTreeObserver, "");
        if (!viewTreeObserver.isAlive() || !view.isAttachedToWindow()) {
            view.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC55146e(this));
        } else {
            view.getViewTreeObserver().addOnDrawListener(this);
        }
    }
}
