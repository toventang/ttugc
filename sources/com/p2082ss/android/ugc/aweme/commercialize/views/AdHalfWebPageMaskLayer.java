package com.p2082ss.android.ugc.aweme.commercialize.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageMaskLayer */
public final class AdHalfWebPageMaskLayer extends FrameLayout implements View.OnTouchListener {

    /* renamed from: b */
    public static final C38789b f91584b = new C38789b((byte) 0);

    /* renamed from: a */
    public boolean f91585a;

    /* renamed from: c */
    private AbstractC38788a f91586c;

    /* renamed from: d */
    private long f91587d;

    /* renamed from: e */
    private float f91588e;

    /* renamed from: f */
    private float f91589f;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageMaskLayer$a */
    public interface AbstractC38788a {
        static {
            Covode.recordClassIndex(46333);
        }

        /* renamed from: a */
        void mo67354a();

        /* renamed from: a */
        void mo67355a(boolean z);

        /* renamed from: b */
        void mo67356b();
    }

    static {
        Covode.recordClassIndex(46332);
    }

    public AdHalfWebPageMaskLayer(Context context) {
        this(context, (AttributeSet) null, 6);
    }

    public AdHalfWebPageMaskLayer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageMaskLayer$b */
    public static final class C38789b {
        static {
            Covode.recordClassIndex(46334);
        }

        private C38789b() {
        }

        public /* synthetic */ C38789b(byte b) {
            this();
        }
    }

    public final AbstractC38788a getCallback() {
        return this.f91586c;
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageMaskLayer$c */
    static final class RunnableC38790c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdHalfWebPageMaskLayer f91590a;

        static {
            Covode.recordClassIndex(46335);
        }

        RunnableC38790c(AdHalfWebPageMaskLayer adHalfWebPageMaskLayer) {
            this.f91590a = adHalfWebPageMaskLayer;
        }

        public final void run() {
            this.f91590a.setVisibility(8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageMaskLayer$d */
    static final class RunnableC38791d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdHalfWebPageMaskLayer f91591a;

        static {
            Covode.recordClassIndex(46336);
        }

        RunnableC38791d(AdHalfWebPageMaskLayer adHalfWebPageMaskLayer) {
            this.f91591a = adHalfWebPageMaskLayer;
        }

        public final void run() {
            this.f91591a.setVisibility(0);
        }
    }

    /* renamed from: b */
    public final void mo67347b() {
        setVisibility(8);
        setAlpha(0.0f);
        this.f91585a = false;
        this.f91586c = null;
    }

    /* renamed from: c */
    public final void mo67348c() {
        AbstractC38788a aVar;
        if (this.f91585a && (aVar = this.f91586c) != null) {
            aVar.mo67354a();
        }
    }

    /* renamed from: a */
    public final void mo67345a() {
        animate().alpha(0.8f).withStartAction(new RunnableC38791d(this)).setDuration(100).start();
        AbstractC38788a aVar = this.f91586c;
        if (aVar != null) {
            aVar.mo67354a();
        }
        this.f91585a = true;
    }

    public final void setCallback(AbstractC38788a aVar) {
        this.f91586c = aVar;
    }

    public final void setShowing(boolean z) {
        this.f91585a = z;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C89219l.m154721d(motionEvent, "");
        requestDisallowInterceptTouchEvent(true);
        return true;
    }

    /* renamed from: a */
    public final void mo67346a(boolean z) {
        animate().alpha(0.0f).withEndAction(new RunnableC38790c(this)).setDuration(100).start();
        AbstractC38788a aVar = this.f91586c;
        if (aVar != null) {
            aVar.mo67355a(z);
        }
        this.f91585a = false;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        AbstractC38788a aVar;
        C89219l.m154721d(view, "");
        C89219l.m154721d(motionEvent, "");
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f91587d = System.currentTimeMillis();
            this.f91588e = motionEvent.getX();
            this.f91589f = motionEvent.getY();
        } else if (action == 1) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (System.currentTimeMillis() - this.f91587d <= 100) {
                float f = this.f91588e;
                float f2 = this.f91589f;
                float abs = Math.abs(f - x);
                float abs2 = Math.abs(f2 - y);
                if (abs <= 50.0f && abs2 <= 50.0f && (aVar = this.f91586c) != null) {
                    aVar.mo67356b();
                }
            }
        }
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AdHalfWebPageMaskLayer(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(8858);
        setBackgroundColor(-16777216);
        setOnTouchListener(this);
        mo67347b();
        MethodCollector.m26664o(8858);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ AdHalfWebPageMaskLayer(Context context, AttributeSet attributeSet, int i) {
        this(context, (i & 2) != 0 ? null : attributeSet, (byte) 0);
    }
}
