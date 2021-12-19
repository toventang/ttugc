package com.p2082ss.android.ugc.aweme.view;

import android.content.Context;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.core.p037h.AbstractC0786p;
import androidx.core.p037h.C0787q;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.AbstractC28528p;
import com.lynx.tasm.behavior.p2052ui.list.UIList;
import com.p2082ss.android.ugc.aweme.utils.C80330da;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.view.NestedScrollUIList */
public class NestedScrollUIList extends UIList {

    /* renamed from: i */
    public final AbstractC28520j f181230i;

    static {
        Covode.recordClassIndex(94415);
    }

    /* renamed from: com.ss.android.ugc.aweme.view.NestedScrollUIList$a */
    public static final class C81089a extends RecyclerView implements AbstractC0786p {

        /* renamed from: O */
        private final C0787q f181231O = new C0787q();

        /* renamed from: P */
        private boolean f181232P;

        /* renamed from: Q */
        private int f181233Q;

        /* renamed from: R */
        private final Choreographer f181234R;

        /* renamed from: S */
        private final Choreographer.FrameCallback f181235S;

        static {
            Covode.recordClassIndex(94416);
        }

        @Override // androidx.core.p037h.AbstractC0785o
        /* renamed from: a */
        public final boolean mo2474a(View view, View view2, int i, int i2) {
            C89219l.m154721d(view, "");
            C89219l.m154721d(view2, "");
            return (i & 2) != 0;
        }

        public final Choreographer getChoreographer() {
            return this.f181234R;
        }

        public final boolean getNeedScroll() {
            return this.f181232P;
        }

        public final Choreographer.FrameCallback getScrollFrameCallback() {
            return this.f181235S;
        }

        public final int getScrollPixel() {
            return this.f181233Q;
        }

        public final int getNestedScrollAxes() {
            return this.f181231O.mo2913a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.f181234R.removeFrameCallback(this.f181235S);
            this.f181232P = false;
        }

        /* renamed from: q */
        public final void mo5599q() {
            try {
                if (this.f181232P) {
                    int i = this.f181233Q;
                    if (i != 0) {
                        scrollBy(0, i);
                        this.f181234R.postFrameCallback(this.f181235S);
                    }
                }
            } catch (Exception unused) {
                this.f181234R.removeFrameCallback(this.f181235S);
                this.f181232P = false;
                this.f181233Q = 0;
            }
        }

        public final void setNeedScroll(boolean z) {
            this.f181232P = z;
        }

        public final void setScrollPixel(int i) {
            this.f181233Q = i;
        }

        /* renamed from: com.ss.android.ugc.aweme.view.NestedScrollUIList$a$a */
        static final class Choreographer$FrameCallbackC81090a implements Choreographer.FrameCallback {

            /* renamed from: a */
            final /* synthetic */ C81089a f181236a;

            static {
                Covode.recordClassIndex(94417);
            }

            Choreographer$FrameCallbackC81090a(C81089a aVar) {
                this.f181236a = aVar;
            }

            public final void doFrame(long j) {
                this.f181236a.mo5599q();
            }
        }

        @Override // androidx.core.p037h.AbstractC0784n
        public final void onStopNestedScroll(View view) {
            C89219l.m154721d(view, "");
            stopNestedScroll();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C81089a(Context context) {
            super(context);
            C89219l.m154721d(context, "");
            Choreographer instance = Choreographer.getInstance();
            C89219l.m154716b(instance, "");
            this.f181234R = instance;
            this.f181235S = new Choreographer$FrameCallbackC81090a(this);
        }

        @Override // androidx.recyclerview.widget.RecyclerView
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            ViewParent parent = getParent();
            if (!(parent instanceof View)) {
                parent = null;
            }
            while (true) {
                View view = (View) parent;
                if (view == null) {
                    break;
                } else if (view instanceof RecyclerView) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    break;
                } else {
                    parent = view.getParent();
                    if (!(parent instanceof View)) {
                        parent = null;
                    }
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // androidx.core.p037h.AbstractC0785o
        /* renamed from: b */
        public final void mo2476b(View view, int i) {
            C89219l.m154721d(view, "");
            this.f181231O.mo2914a(i);
            mo2900a(i);
        }

        @Override // androidx.core.p037h.AbstractC0784n
        public final void onNestedScrollAccepted(View view, View view2, int i) {
            C89219l.m154721d(view, "");
            C89219l.m154721d(view2, "");
            this.f181231O.mo2915a(i, 0);
            startNestedScroll(2);
        }

        @Override // androidx.core.p037h.AbstractC0785o
        /* renamed from: b */
        public final void mo2477b(View view, View view2, int i, int i2) {
            C89219l.m154721d(view, "");
            C89219l.m154721d(view2, "");
            this.f181231O.mo2915a(i, i2);
        }

        @Override // androidx.core.p037h.AbstractC0784n
        public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
            C89219l.m154721d(view, "");
            C89219l.m154721d(iArr, "");
            mo2472a(view, i, i2, iArr, 0);
        }

        @Override // androidx.core.p037h.AbstractC0784n
        public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
            C89219l.m154721d(view, "");
            mo2471a(view, i, i2, i3, i4, 0);
        }

        @Override // androidx.core.p037h.AbstractC0785o
        /* renamed from: a */
        public final void mo2472a(View view, int i, int i2, int[] iArr, int i3) {
            C89219l.m154721d(view, "");
            C89219l.m154721d(iArr, "");
            mo4408a(i, i2, iArr, (int[]) null, i3);
        }

        @Override // androidx.core.p037h.AbstractC0785o
        /* renamed from: a */
        public final void mo2471a(View view, int i, int i2, int i3, int i4, int i5) {
            C89219l.m154721d(view, "");
            if (i5 != 1) {
                int scrollY = getScrollY();
                int scrollX = getScrollX();
                scrollBy(i3, i4);
                int scrollX2 = getScrollX() - scrollX;
                int scrollY2 = getScrollY() - scrollY;
                mo4407a(scrollX2, scrollY2, i3 - scrollX2, i4 - scrollY2, i5);
            }
        }

        @Override // androidx.core.p037h.AbstractC0786p
        /* renamed from: a */
        public final void mo2912a(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            C89219l.m154721d(view, "");
            C89219l.m154721d(iArr, "");
            mo2471a(view, i, i2, i3, i4, i5);
        }
    }

    public NestedScrollUIList(AbstractC28520j jVar) {
        super(jVar);
        this.f181230i = jVar;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.list.UIList
    /* renamed from: a */
    public final RecyclerView mo49549a(Context context) {
        C89219l.m154721d(context, "");
        C81089a aVar = new C81089a(context);
        C80330da.C80331a.m139266a("eoy_list").mo123698a(aVar);
        return aVar;
    }

    @AbstractC28528p
    public final void autoScroll(ReadableMap readableMap, Callback callback) {
        C89219l.m154721d(readableMap, "");
        C89219l.m154721d(callback, "");
        try {
            View view = this.mView;
            if (!(view instanceof C81089a)) {
                view = null;
            }
            C81089a aVar = (C81089a) view;
            if (aVar != null) {
                aVar.setScrollPixel(readableMap.getInt("rate") / 60);
                aVar.setNeedScroll(readableMap.getBoolean("start", false));
                aVar.getChoreographer().removeFrameCallback(aVar.getScrollFrameCallback());
                if (aVar.getNeedScroll()) {
                    aVar.mo5599q();
                }
            }
            callback.invoke(0);
        } catch (Exception unused) {
            callback.invoke(1, "something went wrong.. see logs");
        }
    }
}
