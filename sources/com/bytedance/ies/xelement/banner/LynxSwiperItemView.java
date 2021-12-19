package com.bytedance.ies.xelement.banner;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.p037h.C0792v;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.p2052ui.view.C28698a;
import com.lynx.tasm.behavior.p2052ui.view.UIView;
import java.lang.ref.WeakReference;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;

public final class LynxSwiperItemView extends UIView {
    static {
        Covode.recordClassIndex(21763);
    }

    /* renamed from: a */
    public final void mo30193a() {
        View view = this.mView;
        C89219l.m154709a((Object) view, "");
        if (((C28698a) view).getParent() instanceof ViewGroup) {
            View view2 = this.mView;
            C89219l.m154709a((Object) view2, "");
            ViewParent parent = ((C28698a) view2).getParent();
            if (parent != null) {
                ViewGroup viewGroup = (ViewGroup) parent;
                if (getOverflow() != 0) {
                    viewGroup.setClipChildren(false);
                }
                C0792v.m2745a(this.mView, getBoundRectForOverflow());
                return;
            }
            throw new C89388w("null cannot be cast to non-null type");
        }
    }

    /* renamed from: com.bytedance.ies.xelement.banner.LynxSwiperItemView$a */
    static final class View$OnAttachStateChangeListenerC19013a implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        private WeakReference<LynxSwiperItemView> f44982a;

        static {
            Covode.recordClassIndex(21766);
        }

        public final void onViewDetachedFromWindow(View view) {
            C89219l.m154719c(view, "");
        }

        public View$OnAttachStateChangeListenerC19013a(LynxSwiperItemView lynxSwiperItemView) {
            C89219l.m154719c(lynxSwiperItemView, "");
            this.f44982a = new WeakReference<>(lynxSwiperItemView);
        }

        public final void onViewAttachedToWindow(View view) {
            C89219l.m154719c(view, "");
            WeakReference<LynxSwiperItemView> weakReference = this.f44982a;
            if (weakReference == null) {
                C89219l.m154707a();
            }
            LynxSwiperItemView lynxSwiperItemView = weakReference.get();
            if (lynxSwiperItemView != null) {
                lynxSwiperItemView.mo30193a();
            }
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public final void setOverflow(int i) {
        super.setOverflow(i);
        ((C28698a) this.mView).addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC19013a(this));
        mo30193a();
    }
}
