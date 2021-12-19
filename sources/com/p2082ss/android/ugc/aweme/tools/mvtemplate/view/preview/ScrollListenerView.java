package com.p2082ss.android.ugc.aweme.tools.mvtemplate.view.preview;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.HorizontalScrollView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.view.preview.ScrollListenerView */
public final class ScrollListenerView extends HorizontalScrollView {

    /* renamed from: b */
    public static int f177596b = 2;

    /* renamed from: c */
    public static final C79014a f177597c = new C79014a((byte) 0);

    /* renamed from: a */
    public boolean f177598a;

    /* renamed from: d */
    private AbstractC79015b f177599d;

    /* renamed from: e */
    private int f177600e;

    /* renamed from: f */
    private final Handler f177601f = new Handler(Looper.getMainLooper(), new C79016c(this));

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.view.preview.ScrollListenerView$b */
    public interface AbstractC79015b {
        static {
            Covode.recordClassIndex(92180);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.view.preview.ScrollListenerView$a */
    public static final class C79014a {
        static {
            Covode.recordClassIndex(92179);
        }

        private C79014a() {
        }

        public /* synthetic */ C79014a(byte b) {
            this();
        }
    }

    public final AbstractC79015b getOnScrollListener() {
        return this.f177599d;
    }

    /* renamed from: a */
    public final void mo122831a() {
        this.f177601f.removeMessages(1);
        this.f177601f.sendEmptyMessageDelayed(1, 80);
    }

    static {
        Covode.recordClassIndex(92178);
    }

    public final void setOnScrollListener(AbstractC79015b bVar) {
        this.f177599d = bVar;
    }

    public final void setScrollState(int i) {
        if (this.f177600e != i) {
            this.f177600e = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.view.preview.ScrollListenerView$c */
    public static final class C79016c implements Handler.Callback {

        /* renamed from: a */
        final /* synthetic */ ScrollListenerView f177602a;

        /* renamed from: b */
        private int f177603b = Integer.MIN_VALUE;

        static {
            Covode.recordClassIndex(92181);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C79016c(ScrollListenerView scrollListenerView) {
            this.f177602a = scrollListenerView;
        }

        public final boolean handleMessage(Message message) {
            C89219l.m154721d(message, "");
            if (message.what != 1) {
                return false;
            }
            int scrollY = this.f177602a.getScrollY();
            if (this.f177602a.f177598a || this.f177603b != scrollY) {
                this.f177603b = scrollY;
                this.f177602a.mo122831a();
            } else {
                this.f177603b = Integer.MIN_VALUE;
                this.f177602a.setScrollState(0);
            }
            return true;
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C89219l.m154721d(motionEvent, "");
        m137839a(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: a */
    private final void m137839a(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 1 || action == 3) {
            this.f177598a = false;
            mo122831a();
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C89219l.m154721d(motionEvent, "");
        if (motionEvent.getAction() == 0) {
            this.f177598a = true;
        }
        m137839a(motionEvent);
        return super.onInterceptTouchEvent(motionEvent);
    }

    public ScrollListenerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(5427);
        MethodCollector.m26664o(5427);
    }

    /* access modifiers changed from: protected */
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (this.f177598a) {
            setScrollState(1);
            return;
        }
        setScrollState(f177596b);
        mo122831a();
    }
}
