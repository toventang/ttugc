package com.bytedance.android.livesdk.container.util;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.bytedance.android.live.uikit.p411c.C6229a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.container.util.b */
public final class C8299b {

    /* renamed from: a */
    public static final C8299b f20568a = new C8299b();

    private C8299b() {
    }

    static {
        Covode.recordClassIndex(9136);
    }

    /* renamed from: com.bytedance.android.livesdk.container.util.b$a  reason: invalid class name */
    public static final class animationAnimation$AnimationListenerC8300a implements Animation.AnimationListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f20569a;

        static {
            Covode.recordClassIndex(9137);
        }

        public final void onAnimationRepeat(Animation animation) {
        }

        public final void onAnimationStart(Animation animation) {
        }

        animationAnimation$AnimationListenerC8300a(AbstractC89171a aVar) {
            this.f20569a = aVar;
        }

        public final void onAnimationEnd(Animation animation) {
            AbstractC89171a aVar = this.f20569a;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.container.util.b$b  reason: invalid class name */
    public static final class animationAnimation$AnimationListenerC8301b implements Animation.AnimationListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f20570a;

        static {
            Covode.recordClassIndex(9138);
        }

        public final void onAnimationRepeat(Animation animation) {
        }

        public final void onAnimationStart(Animation animation) {
        }

        public animationAnimation$AnimationListenerC8301b(AbstractC89171a aVar) {
            this.f20570a = aVar;
        }

        public final void onAnimationEnd(Animation animation) {
            AbstractC89171a aVar = this.f20570a;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* renamed from: a */
    public static final void m16455a(View view, String str, boolean z) {
        MethodCollector.m26663i(7974);
        C89219l.m154721d(str, "");
        if (view == null) {
            MethodCollector.m26664o(7974);
            return;
        }
        int hashCode = str.hashCode();
        int i = R.anim.el;
        if (hashCode != -1383228885) {
            if (hashCode == 3387192) {
                str.equals("none");
            } else if (hashCode == 108511772 && str.equals("right")) {
                if (!z && C6229a.m13521a(view.getContext())) {
                    i = R.anim.em;
                }
                view.startAnimation(AnimationUtils.loadAnimation(view.getContext(), i));
                MethodCollector.m26664o(7974);
                return;
            }
        } else if (str.equals("bottom")) {
            i = R.anim.ek;
            view.startAnimation(AnimationUtils.loadAnimation(view.getContext(), i));
            MethodCollector.m26664o(7974);
            return;
        }
        MethodCollector.m26664o(7974);
    }

    /* renamed from: a */
    public static final void m16456a(View view, String str, boolean z, AbstractC89171a<C89391z> aVar) {
        MethodCollector.m26663i(8125);
        C89219l.m154721d(str, "");
        if (view == null) {
            MethodCollector.m26664o(8125);
        } else if (view.getAnimation() != null) {
            MethodCollector.m26664o(8125);
        } else {
            int hashCode = str.hashCode();
            int i = R.anim.ep;
            if (hashCode != -1383228885) {
                if (hashCode == 3387192) {
                    str.equals("none");
                } else if (hashCode == 108511772 && str.equals("right")) {
                    if (!z && C6229a.m13521a(view.getContext())) {
                        i = R.anim.en;
                    }
                    Animation loadAnimation = AnimationUtils.loadAnimation(view.getContext(), i);
                    loadAnimation.setAnimationListener(new animationAnimation$AnimationListenerC8300a(aVar));
                    view.startAnimation(loadAnimation);
                    MethodCollector.m26664o(8125);
                    return;
                }
            } else if (str.equals("bottom")) {
                i = R.anim.eo;
                Animation loadAnimation2 = AnimationUtils.loadAnimation(view.getContext(), i);
                loadAnimation2.setAnimationListener(new animationAnimation$AnimationListenerC8300a(aVar));
                view.startAnimation(loadAnimation2);
                MethodCollector.m26664o(8125);
                return;
            }
            aVar.invoke();
            MethodCollector.m26664o(8125);
        }
    }
}
