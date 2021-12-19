package com.bytedance.scene.p1617a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build;
import android.view.View;
import androidx.core.p037h.C0792v;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.scene.p1622d.C22158a;
import com.bytedance.scene.p1622d.C22160b;

/* renamed from: com.bytedance.scene.a.e */
public abstract class AbstractC22139e extends AbstractC22129d {
    static {
        Covode.recordClassIndex(25943);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Animator mo36306a(C22116a aVar, C22116a aVar2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo36307a() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Animator mo36308b(C22116a aVar, C22116a aVar2);

    @Override // com.bytedance.scene.p1617a.AbstractC22129d
    /* renamed from: a */
    public final void mo36311a(final C22116a aVar, final C22116a aVar2, final Runnable runnable, C22160b bVar) {
        final C22158a.C22159a aVar3;
        final View view = aVar.f52296b;
        final View view2 = aVar2.f52296b;
        final C22158a.C22159a aVar4 = null;
        if (aVar.f52298d) {
            aVar3 = C22158a.m41636b(view);
        } else {
            C22158a.m41634a(view);
            aVar3 = null;
        }
        if (aVar2.f52298d) {
            aVar4 = C22158a.m41636b(view2);
        } else {
            C22158a.m41634a(view2);
        }
        view.setVisibility(0);
        final float k = C0792v.m2777k(view);
        if (k > 0.0f) {
            C0792v.m2739a(view, 0.0f);
        }
        final Animator a = mo36306a(aVar, aVar2);
        if (!mo36307a()) {
            a.setDuration(300);
        }
        a.addListener(new AnimatorListenerAdapter() {
            /* class com.bytedance.scene.p1617a.AbstractC22139e.C221401 */

            static {
                Covode.recordClassIndex(25944);
            }

            public final void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
            }

            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                if (!aVar2.f52298d) {
                    view.setVisibility(8);
                }
                float f = k;
                if (f > 0.0f) {
                    C0792v.m2739a(view, f);
                }
                if (aVar.f52298d) {
                    C22158a.m41635a(view, aVar3);
                } else {
                    C22158a.m41634a(view);
                }
                if (aVar2.f52298d) {
                    C22158a.m41635a(view2, aVar4);
                } else {
                    C22158a.m41634a(view2);
                }
                runnable.run();
            }
        });
        a.start();
        bVar.mo36343a(new C22160b.AbstractC22161a() {
            /* class com.bytedance.scene.p1617a.AbstractC22139e.C221412 */

            static {
                Covode.recordClassIndex(25945);
            }

            @Override // com.bytedance.scene.p1622d.C22160b.AbstractC22161a
            /* renamed from: a */
            public final void mo36323a() {
                a.end();
            }
        });
    }

    @Override // com.bytedance.scene.p1617a.AbstractC22129d
    /* renamed from: b */
    public final void mo36312b(final C22116a aVar, final C22116a aVar2, final Runnable runnable, C22160b bVar) {
        final C22158a.C22159a aVar3;
        final View view = aVar.f52296b;
        final View view2 = aVar2.f52296b;
        final C22158a.C22159a aVar4 = null;
        if (aVar.f52298d) {
            aVar3 = C22158a.m41636b(view);
        } else {
            C22158a.m41634a(view);
            aVar3 = null;
        }
        if (aVar2.f52298d) {
            aVar4 = C22158a.m41636b(view2);
        } else {
            C22158a.m41634a(view2);
        }
        view.setVisibility(0);
        int i = Build.VERSION.SDK_INT;
        this.f52312a.getOverlay().add(view);
        final Animator b = mo36308b(aVar, aVar2);
        if (!mo36307a()) {
            b.setDuration(300);
        }
        b.addListener(new AnimatorListenerAdapter() {
            /* class com.bytedance.scene.p1617a.AbstractC22139e.C221423 */

            static {
                Covode.recordClassIndex(25946);
            }

            public final void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
            }

            public final void onAnimationEnd(Animator animator) {
                MethodCollector.m26663i(2822);
                super.onAnimationEnd(animator);
                if (aVar.f52298d) {
                    C22158a.m41635a(view, aVar3);
                } else {
                    C22158a.m41634a(view);
                }
                if (aVar2.f52298d) {
                    C22158a.m41635a(view2, aVar4);
                } else {
                    C22158a.m41634a(view2);
                }
                int i = Build.VERSION.SDK_INT;
                AbstractC22139e.this.f52312a.getOverlay().remove(view);
                runnable.run();
                MethodCollector.m26664o(2822);
            }
        });
        b.start();
        bVar.mo36343a(new C22160b.AbstractC22161a() {
            /* class com.bytedance.scene.p1617a.AbstractC22139e.C221434 */

            static {
                Covode.recordClassIndex(25947);
            }

            @Override // com.bytedance.scene.p1622d.C22160b.AbstractC22161a
            /* renamed from: a */
            public final void mo36323a() {
                b.end();
            }
        });
    }
}
