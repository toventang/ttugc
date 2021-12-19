package com.bytedance.android.livesdk.chatroom.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bytedance.android.livesdk.chatroom.behavior.ScrollHeaderBehavior;
import com.bytedance.android.livesdk.chatroom.behavior.SuctionBottomBehavior;
import com.bytedance.covode.number.Covode;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

public final class LiveCoordinatorLayout extends CoordinatorLayout {

    /* renamed from: h */
    private float f20195h;

    /* renamed from: i */
    private float f20196i;

    /* renamed from: j */
    private float f20197j;

    /* renamed from: k */
    private View f20198k;

    /* renamed from: l */
    private View f20199l;

    /* renamed from: m */
    private boolean f20200m;

    /* renamed from: n */
    private boolean f20201n;

    static {
        Covode.recordClassIndex(8958);
    }

    public LiveCoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public final float getTopFadingEdgeStrength() {
        return 0.0f;
    }

    /* access modifiers changed from: protected */
    public final float getBottomFadingEdgeStrength() {
        View view = this.f20199l;
        if (view == null) {
            C89219l.m154710a("bottom");
        }
        int translationY = (int) view.getTranslationY();
        View view2 = this.f20199l;
        if (view2 == null) {
            C89219l.m154710a("bottom");
        }
        if (translationY > (-view2.getHeight())) {
            return 1.0f;
        }
        return 0.0f;
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C89219l.m154716b(childAt, "");
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
            CoordinatorLayout.AbstractC0557b bVar = ((CoordinatorLayout.C0560e) layoutParams).f2416a;
            if (bVar instanceof ScrollHeaderBehavior) {
                this.f20198k = childAt;
            }
            if (bVar instanceof SuctionBottomBehavior) {
                this.f20199l = childAt;
                this.f20201n = ((SuctionBottomBehavior) bVar).f18254b;
            }
        }
    }

    /* renamed from: a */
    private final void m16262a(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C89219l.m154721d(motionEvent, "");
        this.f20197j = motionEvent.getY();
        if (motionEvent.getAction() == 0) {
            this.f20196i = motionEvent.getY();
            this.f20200m = false;
        } else if (motionEvent.getAction() == 2) {
            float f = this.f20197j - this.f20196i;
            this.f20195h = f;
            if (f > 0.0f) {
                View view = this.f20198k;
                if (view == null) {
                    C89219l.m154710a("header");
                }
                if (!view.canScrollVertically(-1)) {
                    View view2 = this.f20198k;
                    if (view2 == null) {
                        C89219l.m154710a("header");
                    }
                    if ((view2.getMeasuredHeight() == getMeasuredHeight() || !this.f20201n) && !this.f20200m) {
                        m16262a(false);
                    }
                }
                this.f20200m = true;
                m16262a(true);
            }
            if (this.f20195h < 0.0f) {
                View view3 = this.f20199l;
                if (view3 == null) {
                    C89219l.m154710a("bottom");
                }
                int translationY = (int) view3.getTranslationY();
                View view4 = this.f20199l;
                if (view4 == null) {
                    C89219l.m154710a("bottom");
                }
                if (translationY == (-view4.getHeight())) {
                    View view5 = this.f20198k;
                    if (view5 == null) {
                        C89219l.m154710a("header");
                    }
                    if (!view5.canScrollVertically(1) && !this.f20200m) {
                        m16262a(false);
                    }
                }
                this.f20200m = true;
                m16262a(true);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    private /* synthetic */ LiveCoordinatorLayout(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private LiveCoordinatorLayout(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        setWillNotDraw(false);
    }
}
