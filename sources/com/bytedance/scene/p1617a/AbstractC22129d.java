package com.bytedance.scene.p1617a;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.p1622d.C22160b;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.scene.a.d */
public abstract class AbstractC22129d {

    /* renamed from: a */
    public ViewGroup f52312a;

    static {
        Covode.recordClassIndex(25933);
    }

    /* renamed from: a */
    public abstract void mo36311a(C22116a aVar, C22116a aVar2, Runnable runnable, C22160b bVar);

    /* renamed from: b */
    public abstract void mo36312b(C22116a aVar, C22116a aVar2, Runnable runnable, C22160b bVar);

    /* renamed from: a */
    public static void m41610a(final View view, C22160b bVar, final Runnable runnable) {
        if (view == view.getRootView()) {
            final ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
            viewTreeObserver.addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                /* class com.bytedance.scene.p1617a.AbstractC22129d.ViewTreeObserver$OnPreDrawListenerC221367 */

                static {
                    Covode.recordClassIndex(25940);
                }

                public final boolean onPreDraw() {
                    if (atomicBoolean.get()) {
                        return false;
                    }
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.removeOnPreDrawListener(this);
                        return true;
                    }
                    view.getViewTreeObserver().removeOnPreDrawListener(this);
                    return true;
                }
            });
            final ViewTreeObserver$OnGlobalLayoutListenerC221378 r2 = new ViewTreeObserver.OnGlobalLayoutListener() {
                /* class com.bytedance.scene.p1617a.AbstractC22129d.ViewTreeObserver$OnGlobalLayoutListenerC221378 */

                static {
                    Covode.recordClassIndex(25941);
                }

                public final void onGlobalLayout() {
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.removeGlobalOnLayoutListener(this);
                    } else {
                        view.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                    }
                    atomicBoolean.set(false);
                    runnable.run();
                }
            };
            bVar.mo36343a(new C22160b.AbstractC22161a() {
                /* class com.bytedance.scene.p1617a.AbstractC22129d.C221389 */

                static {
                    Covode.recordClassIndex(25942);
                }

                @Override // com.bytedance.scene.p1622d.C22160b.AbstractC22161a
                /* renamed from: a */
                public final void mo36323a() {
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.removeGlobalOnLayoutListener(r2);
                    } else {
                        view.getViewTreeObserver().removeGlobalOnLayoutListener(r2);
                    }
                    atomicBoolean.set(false);
                    runnable.run();
                }
            });
            viewTreeObserver.addOnGlobalLayoutListener(r2);
            return;
        }
        throw new IllegalArgumentException("Need View.getRootView()");
    }
}
