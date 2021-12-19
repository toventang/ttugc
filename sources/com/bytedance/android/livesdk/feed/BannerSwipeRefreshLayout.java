package com.bytedance.android.livesdk.feed;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.uikit.p409a.C6210b;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

public class BannerSwipeRefreshLayout extends C6210b {

    /* renamed from: m */
    ViewPager f20928m;

    /* renamed from: n */
    View f20929n;

    /* renamed from: o */
    public RecyclerView f20930o;

    /* renamed from: p */
    private List<RecyclerView> f20931p = new ArrayList();

    /* renamed from: q */
    private int f20932q;

    /* renamed from: r */
    private boolean f20933r;

    /* renamed from: s */
    private float f20934s;

    /* renamed from: t */
    private float f20935t;

    /* renamed from: u */
    private float f20936u;

    /* renamed from: v */
    private float f20937v;

    /* renamed from: w */
    private int f20938w;

    /* renamed from: com.bytedance.android.livesdk.feed.BannerSwipeRefreshLayout$a */
    public interface AbstractC8469a {
        static {
            Covode.recordClassIndex(9318);
        }
    }

    static {
        Covode.recordClassIndex(9317);
    }

    @Override // com.bytedance.android.live.uikit.p409a.C6210b
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f;
        float f2;
        try {
            if (!((this.f20928m == null || this.f20929n == null) && this.f20930o == null)) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    float x = motionEvent.getX();
                    this.f20934s = x;
                    this.f20936u = x;
                    float y = motionEvent.getY();
                    this.f20935t = y;
                    this.f20937v = y;
                    this.f20933r = false;
                    this.f20938w = motionEvent.getPointerId(0);
                } else if (action == 2) {
                    if (this.f20933r) {
                        return false;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(this.f20938w);
                    float x2 = motionEvent.getX(findPointerIndex);
                    float abs = Math.abs(x2 - this.f20936u);
                    float y2 = motionEvent.getY(findPointerIndex);
                    float abs2 = Math.abs(y2 - this.f20937v);
                    ViewPager viewPager = this.f20928m;
                    if (viewPager == null || this.f20929n == null) {
                        RecyclerView recyclerView = this.f20930o;
                        if (recyclerView != null) {
                            if ((x2 - this.f20936u <= 0.0f || recyclerView.getScrollX() != 0) && abs > ((float) this.f20932q) && abs * 0.5f > abs2 && ((float) this.f20930o.getBottom()) > y2) {
                                this.f20933r = true;
                                return false;
                            }
                            int i = this.f20932q;
                            if (abs2 < ((float) (i + 100))) {
                                return false;
                            }
                            float f3 = this.f20934s;
                            if (x2 - f3 > 0.0f) {
                                f = f3 + ((float) i);
                            } else {
                                f = f3 - ((float) i);
                            }
                            this.f20936u = f;
                            this.f20937v = y2;
                        }
                    } else {
                        if (x2 - this.f20936u > 0.0f && viewPager.getCurrentItem() == 0) {
                            C3854a.m9453a(4, "onInterceptTouchEvent", "do nothing");
                        } else if (abs > ((float) this.f20932q) && abs * 0.5f > abs2 && ((float) this.f20929n.getBottom()) > y2) {
                            this.f20933r = true;
                            return false;
                        }
                        int i2 = this.f20932q;
                        if (abs2 < ((float) (i2 + 100))) {
                            return false;
                        }
                        float f4 = this.f20934s;
                        if (x2 - f4 > 0.0f) {
                            f2 = f4 + ((float) i2);
                        } else {
                            f2 = f4 - ((float) i2);
                        }
                        this.f20936u = f2;
                        this.f20937v = y2;
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
        this.f20932q = ViewConfiguration.get(context).getScaledPagingTouchSlop();
        this.f20933r = false;
    }
}
