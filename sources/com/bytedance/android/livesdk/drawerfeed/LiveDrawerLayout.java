package com.bytedance.android.livesdk.drawerfeed;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.drawerlayout.widget.DrawerLayout;
import com.bytedance.covode.number.Covode;

public class LiveDrawerLayout extends DrawerLayout {

    /* renamed from: a */
    public boolean f20794a;

    /* renamed from: b */
    public boolean f20795b;

    /* renamed from: c */
    private int f20796c;

    /* renamed from: d */
    private int f20797d;

    /* renamed from: e */
    private float f20798e;

    /* renamed from: f */
    private float f20799f;

    static {
        Covode.recordClassIndex(9253);
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout
    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
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
                this.f20798e = x;
                this.f20799f = y;
            } else if (action == 2) {
                float f = this.f20798e;
                if (x > f && !this.f20794a) {
                    return false;
                }
                int abs = (int) Math.abs(x - f);
                int abs2 = (int) Math.abs(y - this.f20799f);
                int i = (abs * abs) + (abs2 * abs2);
                int i2 = this.f20797d;
                if (i > i2 * i2) {
                    if (!this.f20794a && abs < abs2 * 4) {
                        return false;
                    }
                    if (this.f20794a) {
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

    public LiveDrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private LiveDrawerLayout(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        float f = context.getResources().getDisplayMetrics().density;
        this.f20797d = viewConfiguration.getScaledTouchSlop();
        this.f20796c = (int) ((f * 20.0f) + 0.5f);
        addDrawerListener(new DrawerLayout.AbstractC0843c() {
            /* class com.bytedance.android.livesdk.drawerfeed.LiveDrawerLayout.C84101 */

            static {
                Covode.recordClassIndex(9254);
            }

            @Override // androidx.drawerlayout.widget.DrawerLayout.AbstractC0843c
            public final void onDrawerOpened(View view) {
                LiveDrawerLayout.this.f20794a = true;
            }

            @Override // androidx.drawerlayout.widget.DrawerLayout.AbstractC0843c
            public final void onDrawerStateChanged(int i) {
                if (i == 0) {
                    LiveDrawerLayout.this.f20795b = false;
                }
            }

            @Override // androidx.drawerlayout.widget.DrawerLayout.AbstractC0843c
            public final void onDrawerClosed(View view) {
                LiveDrawerLayout.this.f20794a = false;
                LiveDrawerLayout.this.f20795b = false;
            }

            @Override // androidx.drawerlayout.widget.DrawerLayout.AbstractC0843c
            public final void onDrawerSlide(View view, float f) {
                LiveDrawerLayout.this.f20795b = true;
            }
        });
    }
}
