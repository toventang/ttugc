package com.p2082ss.android.ugc.aweme.discover.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.p2378v4.widget.SwipeRefreshLayout;

/* renamed from: com.ss.android.ugc.aweme.discover.widget.BannerSwipeRefreshLayout */
public class BannerSwipeRefreshLayout extends SwipeRefreshLayout {

    /* renamed from: n */
    private View f100292n;

    /* renamed from: o */
    private int f100293o;

    /* renamed from: p */
    private boolean f100294p;

    /* renamed from: q */
    private float f100295q;

    /* renamed from: r */
    private float f100296r;

    /* renamed from: s */
    private float f100297s;

    /* renamed from: t */
    private int f100298t;

    static {
        Covode.recordClassIndex(51171);
    }

    public void setHeader(View view) {
        this.f100292n = view;
    }

    public BannerSwipeRefreshLayout(Context context) {
        this(context, null);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.p2378v4.widget.SwipeRefreshLayout
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f;
        try {
            if (this.f100292n != null) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    float x = motionEvent.getX();
                    this.f100295q = x;
                    this.f100296r = x;
                    this.f100297s = motionEvent.getY();
                    this.f100294p = false;
                    this.f100298t = motionEvent.getPointerId(0);
                } else if (action == 2) {
                    if (this.f100294p) {
                        return false;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(this.f100298t);
                    float x2 = motionEvent.getX(findPointerIndex);
                    float abs = Math.abs(x2 - this.f100296r);
                    float y = motionEvent.getY(findPointerIndex);
                    float abs2 = Math.abs(y - this.f100297s);
                    if (abs <= ((float) this.f100293o) || abs * 0.5f <= abs2 || ((float) this.f100292n.getBottom()) <= y) {
                        if (x2 - this.f100296r > 0.0f) {
                            f = this.f100295q + ((float) this.f100293o);
                        } else {
                            f = this.f100295q - ((float) this.f100293o);
                        }
                        this.f100296r = f;
                        this.f100297s = y;
                    } else {
                        this.f100294p = true;
                        return false;
                    }
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public BannerSwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f100293o = ViewConfiguration.get(context).getScaledPagingTouchSlop();
        this.f100294p = false;
        setDoNotCatchException(true);
    }
}
