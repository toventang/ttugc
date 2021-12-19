package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3136d;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.d.a */
public final class C54438a {

    /* renamed from: d */
    public static final C54439a f124694d = new C54439a((byte) 0);

    /* renamed from: a */
    public View.OnClickListener f124695a;

    /* renamed from: b */
    public List<View.OnTouchListener> f124696b;

    /* renamed from: c */
    public final View f124697c;

    static {
        Covode.recordClassIndex(64143);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.d.a$a */
    public static final class C54439a {
        static {
            Covode.recordClassIndex(64144);
        }

        private C54439a() {
        }

        public /* synthetic */ C54439a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C54438a m99780a(View view) {
            C89219l.m154721d(view, "");
            return new C54438a(view, (byte) 0);
        }
    }

    private C54438a(View view) {
        this.f124697c = view;
        this.f124696b = new ArrayList();
    }

    /* renamed from: a */
    public final void mo91506a(View.OnClickListener onClickListener) {
        if (onClickListener == null) {
            C56244a.m102192d("ContentViewContainer", "ContentViewContainer setOnClick null? why?");
        }
        this.f124695a = onClickListener;
    }

    /* renamed from: a */
    public final void mo91507a(View.OnLongClickListener onLongClickListener) {
        this.f124697c.setOnLongClickListener(onLongClickListener);
    }

    /* renamed from: a */
    public final void mo91508a(View.OnTouchListener onTouchListener) {
        if (onTouchListener != null) {
            List<View.OnTouchListener> list = this.f124696b;
            if (!list.contains(onTouchListener)) {
                list.add(onTouchListener);
            }
        }
    }

    public /* synthetic */ C54438a(View view, byte b) {
        this(view);
    }

    /* renamed from: a */
    public final void mo91505a(int i, Object obj) {
        this.f124697c.setTag(i, obj);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.d.a$b */
    public static final class View$OnTouchListenerC54440b implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ C54438a f124698a;

        /* renamed from: b */
        final /* synthetic */ GestureDetector f124699b;

        static {
            Covode.recordClassIndex(64145);
        }

        public View$OnTouchListenerC54440b(C54438a aVar, GestureDetector gestureDetector) {
            this.f124698a = aVar;
            this.f124699b = gestureDetector;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            boolean onTouchEvent = this.f124699b.onTouchEvent(motionEvent);
            Iterator<T> it = this.f124698a.f124696b.iterator();
            while (it.hasNext()) {
                it.next().onTouch(view, motionEvent);
            }
            return onTouchEvent;
        }
    }
}
