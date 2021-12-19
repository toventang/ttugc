package com.bytedance.android.livesdk.chatroom.behavior;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

public final class SuctionBottomBehavior extends CoordinatorLayout.AbstractC0557b<View> {

    /* renamed from: d */
    public static final C7364a f18252d = new C7364a((byte) 0);

    /* renamed from: a */
    public boolean f18253a;

    /* renamed from: b */
    public boolean f18254b;

    /* renamed from: c */
    public int f18255c = 1;

    /* renamed from: e */
    private int f18256e;

    /* renamed from: f */
    private boolean f18257f = true;

    /* renamed from: g */
    private final long f18258g = 500;

    /* renamed from: h */
    private final C7365b f18259h = new C7365b(this);

    static {
        Covode.recordClassIndex(8130);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.behavior.SuctionBottomBehavior$a */
    public static final class C7364a {
        static {
            Covode.recordClassIndex(8131);
        }

        private C7364a() {
        }

        public /* synthetic */ C7364a(byte b) {
            this();
        }
    }

    public SuctionBottomBehavior() {
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.behavior.SuctionBottomBehavior$b */
    public static final class C7365b implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ SuctionBottomBehavior f18260a;

        static {
            Covode.recordClassIndex(8132);
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C7365b(SuctionBottomBehavior suctionBottomBehavior) {
            this.f18260a = suctionBottomBehavior;
        }

        public final void onAnimationCancel(Animator animator) {
            this.f18260a.f18253a = false;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f18260a.f18253a = false;
        }

        public final void onAnimationStart(Animator animator) {
            this.f18260a.f18253a = true;
        }
    }

    /* renamed from: c */
    private static boolean m15267c(View view, int i) {
        if (((int) view.getTranslationY()) >= 0 && i < 0) {
            return false;
        }
        if (((int) view.getTranslationY()) > (-view.getMeasuredHeight()) || i <= 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SuctionBottomBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C89219l.m154721d(context, "");
        C89219l.m154721d(attributeSet, "");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.k8});
        C89219l.m154716b(obtainStyledAttributes, "");
        this.f18255c = obtainStyledAttributes.getInt(0, 1);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: b */
    private final void m15266b(View view, int i) {
        if (view.animate() != null && this.f18253a) {
            view.animate().cancel();
        }
        float translationY = view.getTranslationY() - ((float) i);
        if (translationY < ((float) (-view.getHeight()))) {
            translationY = -((float) view.getHeight());
        } else if (translationY > 0.0f) {
            translationY = 0.0f;
        }
        view.setTranslationY(translationY);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public final boolean mo2524a(CoordinatorLayout coordinatorLayout, View view, int i) {
        int i2;
        C89219l.m154721d(coordinatorLayout, "");
        C89219l.m154721d(view, "");
        view.layout(0, coordinatorLayout.getMeasuredHeight(), view.getMeasuredWidth(), coordinatorLayout.getMeasuredHeight() + view.getMeasuredHeight());
        if (this.f18257f) {
            view.animate().setDuration(this.f18258g).translationY(-((float) view.getMeasuredHeight())).withLayer().setListener(this.f18259h).start();
            this.f18257f = false;
        } else if (this.f18253a && this.f18256e != view.getMeasuredHeight()) {
            view.animate().cancel();
            view.animate().setDuration((long) ((Math.abs(((float) view.getMeasuredHeight()) + view.getTranslationY()) / ((float) view.getMeasuredHeight())) * ((float) this.f18258g))).setListener(this.f18259h).translationY(-((float) view.getMeasuredHeight())).start();
        } else if (!(this.f18256e != (-((int) view.getTranslationY())) || (i2 = this.f18256e) == 0 || i2 == view.getMeasuredHeight())) {
            view.setTranslationY(-((float) view.getMeasuredHeight()));
        }
        this.f18256e = view.getMeasuredHeight();
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public final boolean mo2531a(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        C89219l.m154721d(coordinatorLayout, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(view2, "");
        C89219l.m154721d(view3, "");
        if (!this.f18254b || (i & 2) == 0) {
            return false;
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public final void mo2522a(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        C89219l.m154721d(coordinatorLayout, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(view2, "");
        C89219l.m154721d(iArr, "");
        if (view2 instanceof RecyclerView) {
            if (this.f18255c == 2) {
                RecyclerView recyclerView = (RecyclerView) view2;
                RecyclerView.AbstractC1362i layoutManager = recyclerView.getLayoutManager();
                Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                int n = ((LinearLayoutManager) layoutManager).mo4374n();
                RecyclerView.AbstractC1350a adapter = recyclerView.getAdapter();
                if (adapter == null) {
                    C89219l.m154715b();
                }
                C89219l.m154716b(adapter, "");
                if (n != adapter.getItemCount() - 1) {
                    return;
                }
            }
            if (m15267c(view, i2)) {
                m15266b(view, i2);
                iArr[1] = i2;
            }
        } else if (m15267c(view, i2)) {
            m15266b(view, i2);
            iArr[1] = i2;
        }
    }
}
