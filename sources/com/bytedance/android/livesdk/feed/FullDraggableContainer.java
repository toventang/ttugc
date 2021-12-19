package com.bytedance.android.livesdk.feed;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.p030b.C0622a;
import androidx.core.p037h.C0774e;
import androidx.core.p037h.C0792v;
import androidx.drawerlayout.widget.DrawerLayout;
import com.bytedance.android.livesdk.feed.C8590g;
import com.bytedance.android.livesdk.livesetting.feed.LiveDrawerDraggableEnable;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Objects;

public class FullDraggableContainer extends FrameLayout implements C8590g.AbstractC8591a {

    /* renamed from: a */
    private final C8590g f20939a;

    /* renamed from: b */
    private DrawerLayout f20940b;

    /* renamed from: c */
    private boolean f20941c;

    static {
        Covode.recordClassIndex(9320);
    }

    public View getDrawerMainContainer() {
        return this;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    /* access modifiers changed from: protected */
    public List<DrawerLayout.AbstractC0843c> getDrawerListeners() {
        try {
            Field declaredField = DrawerLayout.class.getDeclaredField("mListeners");
            declaredField.setAccessible(true);
            return (List) declaredField.get(this.f20940b);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.bytedance.android.livesdk.feed.C8590g.AbstractC8591a
    /* renamed from: a */
    public final void mo14774a() {
        List<DrawerLayout.AbstractC0843c> drawerListeners = getDrawerListeners();
        if (drawerListeners != null) {
            for (int size = drawerListeners.size() - 1; size >= 0; size--) {
                drawerListeners.get(size).onDrawerStateChanged(1);
            }
        }
    }

    public void setDrawerLayout(DrawerLayout drawerLayout) {
        this.f20940b = drawerLayout;
    }

    public void setClearScreen(boolean z) {
        this.f20939a.f21240m = z;
    }

    public void setDrawerEnable(boolean z) {
        this.f20941c = !z;
    }

    @Override // com.bytedance.android.livesdk.feed.C8590g.AbstractC8591a
    /* renamed from: a */
    public final boolean mo14776a(int i) {
        DrawerLayout drawerLayout = this.f20940b;
        if (drawerLayout == null) {
            return false;
        }
        return drawerLayout.isDrawerOpen(i);
    }

    @Override // com.bytedance.android.livesdk.feed.C8590g.AbstractC8591a
    /* renamed from: d */
    public final void mo14779d(int i) {
        DrawerLayout drawerLayout = this.f20940b;
        if (drawerLayout != null) {
            drawerLayout.closeDrawer(i, true);
        }
    }

    /* renamed from: a */
    private int m16675a(View view) {
        if (this.f20940b == null) {
            return 0;
        }
        return C0774e.m2693a(((DrawerLayout.C0844d) view.getLayoutParams()).f3113a, C0792v.m2768e(this.f20940b));
    }

    @Override // com.bytedance.android.livesdk.feed.C8590g.AbstractC8591a
    /* renamed from: b */
    public final boolean mo14777b(int i) {
        DrawerLayout drawerLayout = this.f20940b;
        if (drawerLayout == null || drawerLayout.getDrawerLockMode(i) != 0 || m16676e(i) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private View m16676e(int i) {
        DrawerLayout drawerLayout = this.f20940b;
        if (drawerLayout == null) {
            return null;
        }
        int a = C0774e.m2693a(i, C0792v.m2768e(drawerLayout)) & 7;
        int childCount = this.f20940b.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.f20940b.getChildAt(i2);
            if ((m16675a(childAt) & 7) == a) {
                return childAt;
            }
        }
        return null;
    }

    @Override // com.bytedance.android.livesdk.feed.C8590g.AbstractC8591a
    /* renamed from: c */
    public final void mo14778c(int i) {
        if (this.f20940b != null) {
            C6501b.C6502a.m13948a("livesdk_explore_click").mo12639a().mo12651a("ops_type", "draw").mo12655b();
            this.f20940b.openDrawer(i, true);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (!LiveDrawerDraggableEnable.INSTANCE.getValue() || this.f20941c) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        C8590g gVar = this.f20939a;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (actionMasked == 0) {
            gVar.f21230c = x;
            gVar.f21232e = x;
            gVar.f21231d = y;
            return false;
        } else if (actionMasked != 2) {
            return false;
        } else {
            gVar.f21232e = x;
            float f = x - gVar.f21230c;
            float f2 = y - gVar.f21231d;
            if ((!gVar.f21229b || f <= 0.0f) && (gVar.f21229b || f >= 0.0f)) {
                z = false;
            } else {
                z = true;
            }
            if (Math.abs(f) <= ((float) (gVar.f21233f * 2)) || Math.abs(f) <= Math.abs(f2) || !gVar.mo14895a(f) || !z || gVar.f21240m) {
                return false;
            }
            double abs = (double) Math.abs(f);
            double abs2 = (double) Math.abs(f2);
            double sqrt = Math.sqrt(3.0d);
            Double.isNaN(abs2);
            if (abs > abs2 * sqrt) {
                return true;
            }
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        if (r2 != 3) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
        // Method dump skipped, instructions count: 250
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.feed.FullDraggableContainer.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public FullDraggableContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    @Override // com.bytedance.android.livesdk.feed.C8590g.AbstractC8591a
    /* renamed from: a */
    public final void mo14775a(int i, float f) {
        if (this.f20940b != null) {
            View e = m16676e(i);
            float a = C0622a.m2311a(f / ((float) ((View) Objects.requireNonNull(e)).getWidth()), 0.0f, 1.0f);
            try {
                Method declaredMethod = DrawerLayout.class.getDeclaredMethod("moveDrawerToOffset", View.class, Float.TYPE);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(this.f20940b, e, Float.valueOf(a));
                e.setVisibility(0);
                this.f20940b.invalidate();
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    private FullDraggableContainer(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(9087);
        this.f20939a = new C8590g(context, this);
        MethodCollector.m26664o(9087);
    }
}
