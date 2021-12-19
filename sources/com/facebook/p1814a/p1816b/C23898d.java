package com.facebook.p1814a.p1816b;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.facebook.C24872m;
import com.facebook.internal.C24699ae;
import com.facebook.internal.p1894a.p1896b.C24677a;
import com.facebook.p1814a.C23964g;
import com.facebook.p1814a.p1816b.p1817a.C23880a;
import com.facebook.p1814a.p1816b.p1817a.C23888f;
import com.facebook.p1814a.p1820e.C23929b;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.a.b.d */
public class C23898d {

    /* renamed from: a */
    private static final String f56583a = C23898d.class.getCanonicalName();

    static {
        Covode.recordClassIndex(28019);
    }

    /* renamed from: com.facebook.a.b.d$a */
    public static class View$OnTouchListenerC23899a implements View.OnTouchListener {

        /* renamed from: a */
        public boolean f56584a;

        /* renamed from: b */
        private C23880a f56585b;

        /* renamed from: c */
        private WeakReference<View> f56586c;

        /* renamed from: d */
        private WeakReference<View> f56587d;

        /* renamed from: e */
        private View.OnTouchListener f56588e;

        static {
            Covode.recordClassIndex(28020);
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            C23880a aVar;
            if (motionEvent.getAction() == 1 && (aVar = this.f56585b) != null) {
                final String str = aVar.f56526a;
                final Bundle a = C23894c.m45184a(this.f56585b, this.f56587d.get(), this.f56586c.get());
                if (a.containsKey("_valueToSum")) {
                    a.putDouble("_valueToSum", C23929b.m45240a(a.getString("_valueToSum")));
                }
                a.putString("_is_fb_codeless", "1");
                C24872m.m47689c().execute(new Runnable() {
                    /* class com.facebook.p1814a.p1816b.C23898d.View$OnTouchListenerC23899a.RunnableC239001 */

                    static {
                        Covode.recordClassIndex(28021);
                    }

                    public final void run() {
                        if (!C24677a.m47209a(this)) {
                            try {
                                C24699ae.m47299a();
                                C23964g.m45317a(C24872m.f59047g).f56728a.mo39460b();
                            } catch (Throwable th) {
                                C24677a.m47208a(th, this);
                            }
                        }
                    }
                });
            }
            View.OnTouchListener onTouchListener = this.f56588e;
            if (onTouchListener == null || !onTouchListener.onTouch(view, motionEvent)) {
                return false;
            }
            return true;
        }

        public View$OnTouchListenerC23899a(C23880a aVar, View view, View view2) {
            if (aVar != null && view != null && view2 != null) {
                this.f56588e = C23888f.m45166h(view2);
                this.f56585b = aVar;
                this.f56586c = new WeakReference<>(view2);
                this.f56587d = new WeakReference<>(view);
                this.f56584a = true;
            }
        }
    }

    /* renamed from: a */
    public static View$OnTouchListenerC23899a m45198a(C23880a aVar, View view, View view2) {
        if (C24677a.m47209a(C23898d.class)) {
            return null;
        }
        try {
            return new View$OnTouchListenerC23899a(aVar, view, view2);
        } catch (Throwable th) {
            C24677a.m47208a(th, C23898d.class);
            return null;
        }
    }
}
