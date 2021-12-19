package com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBarMaskView */
public final class VideoSeekBarMaskView extends FrameLayout {

    /* renamed from: a */
    public boolean f116465a;

    /* renamed from: b */
    private VideoSeekBar f116466b;

    /* renamed from: c */
    private MutableSeekBar f116467c;

    /* renamed from: d */
    private Rect f116468d;

    /* renamed from: e */
    private float f116469e;

    /* renamed from: f */
    private float f116470f;

    /* renamed from: g */
    private boolean f116471g;

    /* renamed from: h */
    private int f116472h;

    /* renamed from: i */
    private float f116473i;

    static {
        Covode.recordClassIndex(59568);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBarMaskView$a */
    public static final class C50433a {

        /* renamed from: a */
        public static final C50433a f116474a = new C50433a();

        private C50433a() {
        }

        static {
            Covode.recordClassIndex(59569);
        }

        /* renamed from: a */
        public static boolean m94588a() {
            if (SettingsManager.m29616a().mo25394a("increase_seek_bar_touch_area", 0) > 0) {
                return true;
            }
            return false;
        }
    }

    public final float getLastDownRawX() {
        return this.f116469e;
    }

    public final float getLastDownRawY() {
        return this.f116470f;
    }

    public final float getMoveDx() {
        return this.f116473i;
    }

    public final MutableSeekBar getMutableSeekBar() {
        return this.f116467c;
    }

    public final boolean getNeedHandleMove() {
        return this.f116471g;
    }

    public final Rect getSeekBarRect() {
        return this.f116468d;
    }

    public final int getTouchSlop() {
        return this.f116472h;
    }

    public final VideoSeekBar getVideoSeekBar() {
        return this.f116466b;
    }

    public final void setDownInRect(boolean z) {
        this.f116465a = z;
    }

    public final void setLastDownRawX(float f) {
        this.f116469e = f;
    }

    public final void setLastDownRawY(float f) {
        this.f116470f = f;
    }

    public final void setMoveDx(float f) {
        this.f116473i = f;
    }

    public final void setMutableSeekBar(MutableSeekBar mutableSeekBar) {
        this.f116467c = mutableSeekBar;
    }

    public final void setNeedHandleMove(boolean z) {
        this.f116471g = z;
    }

    public final void setSeekBarRect(Rect rect) {
        this.f116468d = rect;
    }

    public final void setTouchSlop(int i) {
        this.f116472h = i;
    }

    public final void setVideoSeekBar(VideoSeekBar videoSeekBar) {
        this.f116466b = videoSeekBar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public VideoSeekBarMaskView(Context context) {
        this(context, null);
        C89219l.m154721d(context, "");
    }

    public final boolean canScrollHorizontally(int i) {
        if (!C50433a.m94588a() || !this.f116465a || this.f116473i <= 10.0f) {
            return super.canScrollHorizontally(i);
        }
        return true;
    }

    public final boolean canScrollVertically(int i) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (getChildAt(i2).canScrollVertically(i)) {
                return true;
            }
        }
        return super.canScrollVertically(i);
    }

    public final void setSeekBarView(VideoSeekBar videoSeekBar) {
        MutableSeekBar mutableSeekBar;
        C89219l.m154721d(videoSeekBar, "");
        this.f116466b = videoSeekBar;
        if (videoSeekBar != null) {
            mutableSeekBar = videoSeekBar.getMutableSeekBar();
        } else {
            mutableSeekBar = null;
        }
        this.f116467c = mutableSeekBar;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        VideoSeekBar videoSeekBar;
        VideoSeekBar videoSeekBar2;
        Integer valueOf;
        if (!C50433a.m94588a() || (((videoSeekBar = this.f116466b) != null && videoSeekBar.getVisibility() == 8) || ((videoSeekBar2 = this.f116466b) != null && videoSeekBar2.getVisibility() == 4))) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        Rect rect = new Rect();
        this.f116468d = rect;
        MutableSeekBar mutableSeekBar = this.f116467c;
        if (mutableSeekBar != null) {
            mutableSeekBar.getGlobalVisibleRect(rect);
        }
        if (!(motionEvent == null || (valueOf = Integer.valueOf(motionEvent.getAction())) == null)) {
            if (valueOf.intValue() == 0) {
                float rawX = motionEvent.getRawX();
                float rawY = motionEvent.getRawY();
                float a = (float) SettingsManager.m29616a().mo25394a("increase_seek_bar_touch_area", 0);
                Rect rect2 = this.f116468d;
                if (rect2 == null || rawX < ((float) rect2.left) || rawX > ((float) rect2.right) || rawY < ((float) rect2.top) - a || rawY > ((float) rect2.bottom) + a) {
                    this.f116465a = false;
                } else {
                    this.f116465a = true;
                    this.f116469e = motionEvent.getRawX();
                    this.f116470f = motionEvent.getRawY();
                    VideoSeekBar videoSeekBar3 = this.f116466b;
                    if (videoSeekBar3 != null) {
                        videoSeekBar3.mo85635a(motionEvent);
                    }
                    MutableSeekBar mutableSeekBar2 = this.f116467c;
                    if (mutableSeekBar2 != null) {
                        mutableSeekBar2.onTouchEvent(motionEvent);
                    }
                }
            } else if (valueOf.intValue() == 2) {
                if (this.f116465a) {
                    float abs = Math.abs(this.f116469e - motionEvent.getRawX());
                    float abs2 = Math.abs(this.f116470f - motionEvent.getRawY());
                    this.f116473i = abs;
                    if (abs > ((float) this.f116472h) && abs > abs2) {
                        this.f116471g = true;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        return true;
                    }
                }
            } else if (valueOf.intValue() == 1 || valueOf.intValue() == 3) {
                if (this.f116465a && this.f116471g) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
                this.f116465a = false;
                this.f116471g = false;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        VideoSeekBar videoSeekBar;
        VideoSeekBar videoSeekBar2;
        Integer valueOf;
        if (!C50433a.m94588a() || (((videoSeekBar = this.f116466b) != null && videoSeekBar.getVisibility() == 8) || ((videoSeekBar2 = this.f116466b) != null && videoSeekBar2.getVisibility() == 4))) {
            return super.onTouchEvent(motionEvent);
        }
        if (!(motionEvent == null || (valueOf = Integer.valueOf(motionEvent.getAction())) == null)) {
            if (valueOf.intValue() == 2) {
                if (Math.abs(this.f116469e - motionEvent.getRawX()) > ((float) this.f116472h)) {
                    VideoSeekBar videoSeekBar3 = this.f116466b;
                    if (videoSeekBar3 != null) {
                        videoSeekBar3.mo85635a(motionEvent);
                    }
                    MutableSeekBar mutableSeekBar = this.f116467c;
                    if (mutableSeekBar != null) {
                        mutableSeekBar.onTouchEvent(motionEvent);
                    }
                    this.f116471g = true;
                }
            } else if (valueOf.intValue() == 1 || valueOf.intValue() == 3) {
                if (this.f116471g) {
                    VideoSeekBar videoSeekBar4 = this.f116466b;
                    if (videoSeekBar4 != null) {
                        videoSeekBar4.mo85635a(motionEvent);
                    }
                    MutableSeekBar mutableSeekBar2 = this.f116467c;
                    if (mutableSeekBar2 != null) {
                        mutableSeekBar2.onTouchEvent(motionEvent);
                    }
                }
                this.f116465a = false;
                this.f116471g = false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public VideoSeekBarMaskView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
        C89219l.m154721d(context, "");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private VideoSeekBarMaskView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(4976);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        C89219l.m154716b(viewConfiguration, "");
        this.f116472h = viewConfiguration.getScaledTouchSlop();
        MethodCollector.m26664o(4976);
    }
}
