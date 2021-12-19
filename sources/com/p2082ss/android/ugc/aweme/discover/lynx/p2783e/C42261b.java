package com.p2082ss.android.ugc.aweme.discover.lynx.p2783e;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.p1184ui.common.BulletContainerView;
import com.p2082ss.android.ugc.aweme.discover.lynx.C42184a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.lynx.e.b */
public final class C42261b extends FrameLayout {

    /* renamed from: b */
    public static final C42262a f98470b = new C42262a((byte) 0);

    /* renamed from: a */
    public int f98471a;

    static {
        Covode.recordClassIndex(50203);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.lynx.e.b$a */
    public static final class C42262a {
        static {
            Covode.recordClassIndex(50204);
        }

        private C42262a() {
        }

        public /* synthetic */ C42262a(byte b) {
            this();
        }
    }

    public final int getHybirdType() {
        return this.f98471a;
    }

    /* renamed from: b */
    public final boolean mo71458b() {
        if (getHybirdType() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo71459c() {
        View childAt;
        if (mo71458b()) {
            childAt = getChildAt(1);
        } else {
            childAt = getChildAt(0);
        }
        if (childAt != null) {
            return true;
        }
        return false;
    }

    public final BulletContainerView getBulletContainerView() {
        BulletContainerView bulletContainerView = null;
        if (getChildCount() <= 0) {
            return null;
        }
        View childAt = getChildAt(0);
        if (childAt instanceof BulletContainerView) {
            bulletContainerView = childAt;
        }
        return bulletContainerView;
    }

    public final View getHybirdContainerView() {
        if (mo71458b()) {
            View childAt = getChildAt(1);
            C89219l.m154716b(childAt, "");
            return childAt;
        }
        View childAt2 = getChildAt(0);
        C89219l.m154716b(childAt2, "");
        return childAt2;
    }

    /* renamed from: a */
    public final void mo71455a() {
        View childAt = getChildAt(1);
        View childAt2 = getChildAt(0);
        if (childAt != null && childAt2 != null) {
            if (mo71458b()) {
                childAt2.setVisibility(8);
                childAt.setVisibility(0);
                return;
            }
            childAt2.setVisibility(0);
            childAt.setVisibility(8);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42261b(Context context) {
        super(context);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(8143);
        addView(C42184a.m84437a(context));
        addView(C42184a.m84438b(context));
        MethodCollector.m26664o(8143);
    }

    /* renamed from: a */
    public final void mo71456a(View view) {
        MethodCollector.m26663i(8141);
        C89219l.m154721d(view, "");
        removeViewAt(1);
        if (view.getParent() != null) {
            ViewParent parent = view.getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeView(view);
            } else {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                MethodCollector.m26664o(8141);
                throw nullPointerException;
            }
        }
        addView(view, 1);
        MethodCollector.m26664o(8141);
    }

    /* renamed from: a */
    public final void mo71457a(BulletContainerView bulletContainerView) {
        MethodCollector.m26663i(7995);
        C89219l.m154721d(bulletContainerView, "");
        BulletContainerView bulletContainerView2 = getBulletContainerView();
        if (bulletContainerView2 != null) {
            bulletContainerView2.mo25721a();
        }
        removeView(getBulletContainerView());
        if (bulletContainerView.getParent() != null) {
            ViewParent parent = bulletContainerView.getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeView(bulletContainerView);
            } else {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                MethodCollector.m26664o(7995);
                throw nullPointerException;
            }
        }
        addView(bulletContainerView, 0);
        MethodCollector.m26664o(7995);
    }
}
