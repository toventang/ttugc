package com.lynx.tasm.behavior.p2052ui.list;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.p2052ui.view.C28698a;
import com.lynx.tasm.behavior.p2052ui.view.C28699b;
import com.lynx.tasm.behavior.p2052ui.view.UIComponent;

/* renamed from: com.lynx.tasm.behavior.ui.list.g */
public final class View$OnAttachStateChangeListenerC28640g extends RecyclerView.AbstractC1371n implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    public C28642a f67438a;

    /* renamed from: b */
    C28643b f67439b = new C28643b();

    /* renamed from: c */
    C28643b f67440c = new C28643b();

    /* renamed from: d */
    private UIList f67441d;

    /* renamed from: e */
    private int f67442e = -1;

    /* renamed from: f */
    private int f67443f = -1;

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.tasm.behavior.ui.list.g$b */
    public static class C28643b {

        /* renamed from: a */
        public UIComponent f67447a;

        /* renamed from: b */
        public int f67448b = -1;

        static {
            Covode.recordClassIndex(34702);
        }
    }

    static {
        Covode.recordClassIndex(34699);
    }

    public final void onViewDetachedFromWindow(View view) {
    }

    /* renamed from: a */
    public final void mo49578a() {
        C28644h hVar;
        int i;
        C28644h hVar2;
        int i2 = 0;
        if (this.f67439b.f67448b != -1) {
            int e = this.f67441d.f67361c.mo49596e(this.f67439b.f67448b + 1);
            if (e == -1 || (hVar2 = (C28644h) ((RecyclerView) this.f67441d.mView).mo4451f(e)) == null) {
                i = 0;
            } else {
                i = Math.min(0, hVar2.itemView.getTop() - ((C28698a) this.f67439b.f67447a.mView).getBottom());
            }
            ((C28698a) this.f67439b.f67447a.mView).setTranslationY((float) i);
        }
        if (this.f67440c.f67448b != -1) {
            int d = this.f67441d.f67361c.mo49595d(this.f67440c.f67448b - 1);
            if (!(d == -1 || (hVar = (C28644h) ((RecyclerView) this.f67441d.mView).mo4451f(d)) == null)) {
                i2 = Math.max(0, hVar.itemView.getBottom() - ((C28698a) this.f67440c.f67447a.mView).getTop());
            }
            ((C28698a) this.f67440c.f67447a.mView).setTranslationY((float) i2);
        }
    }

    /* renamed from: a */
    private static ViewGroup m57276a(View view) {
        MethodCollector.m26663i(887);
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        MethodCollector.m26664o(887);
        return viewGroup;
    }

    View$OnAttachStateChangeListenerC28640g(UIList uIList) {
        this.f67441d = uIList;
        this.f67438a = new C28642a(uIList.mContext);
        ((RecyclerView) uIList.mView).mo4405a(this);
        ((RecyclerView) uIList.mView).addOnAttachStateChangeListener(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo49579a(C28643b bVar) {
        if (UIList.f67360h) {
            LLog.m56859a("UIList", "cleanOldStickyItem position " + bVar.f67448b);
        }
        m57276a(bVar.f67447a.mView);
        if (this.f67441d.f67361c.f67457d) {
            this.f67441d.mo49529b(bVar.f67447a);
        } else {
            this.f67441d.mo49527a(bVar.f67447a);
        }
        bVar.f67448b = -1;
        bVar.f67447a = null;
    }

    public final void onViewAttachedToWindow(View view) {
        MethodCollector.m26663i(874);
        if (this.f67438a.indexOfChild(view) >= 0) {
            MethodCollector.m26664o(874);
            return;
        }
        C28642a aVar = this.f67438a;
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int indexOfChild = viewGroup.indexOfChild(view);
        viewGroup.removeViewAt(indexOfChild);
        aVar.addView(view, new FrameLayout.LayoutParams(-1, -1));
        viewGroup.addView(aVar, indexOfChild);
        MethodCollector.m26664o(874);
    }

    /* renamed from: a */
    private void m57277a(RecyclerView recyclerView) {
        int i;
        int i2;
        RecyclerView.AbstractC1362i layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            int[] a = staggeredGridLayoutManager.mo4790a((int[]) null);
            int[] b = staggeredGridLayoutManager.mo4791b((int[]) null);
            i = Integer.MAX_VALUE;
            for (int i3 : a) {
                i = Math.min(i, i3);
            }
            i2 = Integer.MIN_VALUE;
            for (int i4 : b) {
                i2 = Math.max(i2, i4);
            }
        } else {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            i = linearLayoutManager.mo4371k();
            i2 = linearLayoutManager.mo4373m();
        }
        int d = this.f67441d.f67361c.mo49595d(i);
        int e = this.f67441d.f67361c.mo49596e(i2);
        if (!this.f67441d.f67361c.mo49593b(d)) {
            this.f67442e = -1;
        } else if (this.f67442e != d) {
            this.f67442e = d;
            if (UIList.f67360h) {
                LLog.m56856a(4, "UIList", C1764a.m5928a("new sticky-top position %d", new Object[]{Integer.valueOf(this.f67442e)}));
            }
        }
        if (!this.f67441d.f67361c.mo49594c(e)) {
            this.f67443f = -1;
        } else if (this.f67443f != e) {
            this.f67443f = e;
            if (UIList.f67360h) {
                LLog.m56856a(4, "UIList", C1764a.m5928a("new sticky-bottom position %d", new Object[]{Integer.valueOf(this.f67443f)}));
            }
        }
        if (!(this.f67439b.f67448b == -1 || this.f67439b.f67448b == this.f67442e)) {
            mo49579a(this.f67439b);
        }
        if (!(this.f67440c.f67448b == -1 || this.f67440c.f67448b == this.f67443f)) {
            mo49579a(this.f67440c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.tasm.behavior.ui.list.g$a */
    public class C28642a extends FrameLayout {
        static {
            Covode.recordClassIndex(34701);
        }

        public C28642a(Context context) {
            super(context);
            MethodCollector.m26663i(2128);
            MethodCollector.m26664o(2128);
        }

        /* access modifiers changed from: protected */
        public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
            if (view instanceof C28699b) {
                view.measure(view.getMeasuredWidth(), view.getMeasuredHeight());
            } else {
                super.measureChildWithMargins(view, i, i2, i3, i4);
            }
        }

        /* access modifiers changed from: protected */
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            MethodCollector.m26663i(2138);
            super.onLayout(z, i, i2, i3, i4);
            View$OnAttachStateChangeListenerC28640g.this.mo49578a();
            MethodCollector.m26664o(2138);
        }
    }

    /* renamed from: b */
    public final void mo49580b(RecyclerView recyclerView, int i) {
        if (i > 0) {
            m57279a(this.f67440c, false);
        } else if (i < 0) {
            m57279a(this.f67439b, true);
        }
        m57277a(recyclerView);
        m57278a(this.f67439b, this.f67442e, true);
        m57278a(this.f67440c, this.f67443f, false);
        mo49578a();
    }

    /* renamed from: a */
    private void m57279a(C28643b bVar, boolean z) {
        C28644h hVar;
        if (bVar.f67448b != -1 && (hVar = (C28644h) ((RecyclerView) this.f67441d.mView).mo4451f(bVar.f67448b)) != null) {
            if (hVar.f67449a.f67451b != null) {
                if (this.f67441d.f67361c.f67457d) {
                    this.f67441d.mo49529b(hVar.f67449a.f67451b);
                }
                hVar.mo49586a();
            }
            int top = hVar.f67449a.getTop();
            T t = bVar.f67447a.mView;
            if (z) {
                if (top <= t.getTop()) {
                    return;
                }
            } else if (top >= t.getTop()) {
                return;
            }
            if (UIList.f67360h) {
                LLog.m56860b("UIList", "restoreToHolderIfNeed stickyItem position" + bVar.f67448b);
            }
            m57276a(bVar.f67447a.mView);
            hVar.mo49588a(bVar.f67447a);
            bVar.f67448b = -1;
            bVar.f67447a = null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
    /* renamed from: a */
    public final void mo4754a(final RecyclerView recyclerView, int i, int i2) {
        if (i2 == 0) {
            recyclerView.post(new Runnable() {
                /* class com.lynx.tasm.behavior.p2052ui.list.View$OnAttachStateChangeListenerC28640g.RunnableC286411 */

                static {
                    Covode.recordClassIndex(34700);
                }

                public final void run() {
                    View$OnAttachStateChangeListenerC28640g.this.mo49580b(recyclerView, 0);
                }
            });
        } else {
            mo49580b(recyclerView, i2);
        }
    }

    /* renamed from: a */
    private void m57278a(C28643b bVar, int i, boolean z) {
        boolean z2;
        int i2;
        if (i != -1 && i != bVar.f67448b) {
            RecyclerView recyclerView = (RecyclerView) this.f67441d.mView;
            C28644h hVar = (C28644h) recyclerView.mo4451f(i);
            if (hVar == null) {
                hVar = (C28644h) recyclerView.getAdapter().createViewHolder(recyclerView, recyclerView.getAdapter().getItemViewType(i));
                if (this.f67441d.f67361c.f67457d) {
                    this.f67441d.f67361c.mo49591a(hVar, i);
                } else {
                    this.f67441d.f67361c.bindViewHolder(hVar, i);
                }
            } else if (!z) {
                if (z || hVar.f67449a.getBottom() <= this.f67438a.getHeight()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (0 == 0 && !z2) {
                    return;
                }
            } else if (hVar.f67449a.getTop() >= 0) {
                return;
            }
            UIComponent uIComponent = hVar.f67449a.f67451b;
            if (uIComponent != null) {
                hVar.mo49586a();
                if (z) {
                    i2 = 48;
                } else {
                    i2 = 80;
                }
                this.f67438a.addView(uIComponent.mView, new FrameLayout.LayoutParams(-2, -2, i2));
                bVar.f67447a = uIComponent;
                bVar.f67448b = i;
                if (UIList.f67360h) {
                    LLog.m56860b("UIList", "finish moveSticky ".concat(String.valueOf(i)));
                }
            }
        }
    }
}
