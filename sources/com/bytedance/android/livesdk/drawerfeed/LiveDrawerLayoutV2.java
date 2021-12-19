package com.bytedance.android.livesdk.drawerfeed;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.customview.p040a.C0827a;
import androidx.drawerlayout.widget.DrawerLayout;
import com.bytedance.android.livesdk.livesetting.feed.LiveDrawerDraggableEnable;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;

public class LiveDrawerLayoutV2 extends DrawerLayout {

    /* renamed from: a */
    public boolean f20801a;

    /* renamed from: b */
    public boolean f20802b;

    /* renamed from: c */
    private int f20803c;

    /* renamed from: d */
    private float f20804d;

    /* renamed from: e */
    private float f20805e;

    static {
        Covode.recordClassIndex(9255);
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!LiveDrawerDraggableEnable.INSTANCE.getValue()) {
            if (this.f20802b || isDrawerOpen(8388613)) {
                return super.onTouchEvent(motionEvent);
            }
            closeDrawer(8388613);
            return false;
        } else if (isDrawerOpen(8388613)) {
            return super.onTouchEvent(motionEvent);
        } else {
            closeDrawer(8388613);
            return false;
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f20804d = x;
                this.f20805e = y;
            } else if (action == 2) {
                float f = this.f20804d;
                if (x > f && !this.f20801a) {
                    return false;
                }
                int abs = (int) Math.abs(x - f);
                int abs2 = (int) Math.abs(y - this.f20805e);
                int i = (abs * abs) + (abs2 * abs2);
                int i2 = this.f20803c;
                if (i > i2 * i2 * 2) {
                    if (!this.f20801a && abs < abs2 * 4) {
                        return false;
                    }
                    if (this.f20801a) {
                        if (abs > abs2 * 4) {
                            return true;
                        }
                        return false;
                    }
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void setRightEdgePercentage(float f) {
        if (f >= 0.0f && f <= 1.0f) {
            try {
                Field declaredField = getClass().getSuperclass().getDeclaredField("mRightCallback");
                declaredField.setAccessible(true);
                C0827a.AbstractC0830a aVar = (C0827a.AbstractC0830a) declaredField.get(this);
                Field declaredField2 = aVar.getClass().getDeclaredField("mPeekRunnable");
                declaredField2.setAccessible(true);
                declaredField2.set(aVar, null);
                Field declaredField3 = getClass().getSuperclass().getDeclaredField("mLeftCallback");
                declaredField3.setAccessible(true);
                C0827a.AbstractC0830a aVar2 = (C0827a.AbstractC0830a) declaredField3.get(this);
                Field declaredField4 = aVar2.getClass().getDeclaredField("mPeekRunnable");
                declaredField4.setAccessible(true);
                declaredField4.set(aVar2, null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public LiveDrawerLayoutV2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private LiveDrawerLayoutV2(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        float f = context.getResources().getDisplayMetrics().density;
        this.f20803c = viewConfiguration.getScaledTouchSlop();
        setRightEdgePercentage(0.0f);
        addDrawerListener(new DrawerLayout.AbstractC0843c() {
            /* class com.bytedance.android.livesdk.drawerfeed.LiveDrawerLayoutV2.C84111 */

            static {
                Covode.recordClassIndex(9256);
            }

            @Override // androidx.drawerlayout.widget.DrawerLayout.AbstractC0843c
            public final void onDrawerSlide(View view, float f) {
            }

            @Override // androidx.drawerlayout.widget.DrawerLayout.AbstractC0843c
            public final void onDrawerClosed(View view) {
                LiveDrawerLayoutV2.this.f20801a = false;
            }

            @Override // androidx.drawerlayout.widget.DrawerLayout.AbstractC0843c
            public final void onDrawerOpened(View view) {
                LiveDrawerLayoutV2.this.f20801a = true;
            }

            @Override // androidx.drawerlayout.widget.DrawerLayout.AbstractC0843c
            public final void onDrawerStateChanged(int i) {
                if (i == 0) {
                    LiveDrawerLayoutV2.this.f20802b = false;
                } else {
                    LiveDrawerLayoutV2.this.f20802b = true;
                }
            }
        });
    }
}
