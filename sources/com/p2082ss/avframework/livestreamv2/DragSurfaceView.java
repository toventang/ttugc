package com.p2082ss.avframework.livestreamv2;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.avframework.livestreamv2.DragSurfaceView */
public class DragSurfaceView extends SurfaceView implements View.OnTouchListener {
    private int lastX;
    private int lastY;
    private Activity mActivity;
    private boolean mDragable;
    private boolean mIsFirstTouch = true;
    private boolean mIsScale;
    private onUpdataLocationListener mLocationListener;
    int offset = 20;
    private int oriBottom;
    private int oriLeft;
    private int oriRight;
    private int oriTop;
    private int screenHeight;
    private int screenWidth;
    private int viewOrigHeight;
    private int viewOrigWidth;

    /* renamed from: com.ss.avframework.livestreamv2.DragSurfaceView$onUpdataLocationListener */
    public interface onUpdataLocationListener {
        static {
            Covode.recordClassIndex(100006);
        }

        void onUpdateLocation(float f, float f2, float f3, float f4);
    }

    static {
        Covode.recordClassIndex(100004);
    }

    private void initView() {
        setFocusable(true);
        setLongClickable(true);
        setClickable(true);
        super.setOnTouchListener(this);
    }

    private int getTitleTopHeight() {
        Rect rect = new Rect();
        Activity activity = (Activity) getContext();
        this.mActivity = activity;
        try {
            activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            return rect.top;
        } catch (NullPointerException unused) {
            return 0;
        }
    }

    private ViewGroup.LayoutParams getNewLayoutParams() {
        if (getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) getLayoutParams();
            layoutParams.leftMargin = this.oriLeft;
            layoutParams.topMargin = this.oriTop;
            layoutParams.width = this.oriRight - this.oriLeft;
            layoutParams.height = this.oriBottom - this.oriTop;
            return layoutParams;
        } else if (!(getLayoutParams() instanceof FrameLayout.LayoutParams)) {
            return null;
        } else {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) getLayoutParams();
            layoutParams2.leftMargin = this.oriLeft;
            layoutParams2.topMargin = this.oriTop;
            layoutParams2.width = this.oriRight - this.oriLeft;
            layoutParams2.height = this.oriBottom - this.oriTop;
            return layoutParams2;
        }
    }

    public void setDragable(boolean z) {
        this.mDragable = z;
    }

    public void setUpdateLocationListener(onUpdataLocationListener onupdatalocationlistener) {
        this.mLocationListener = onupdatalocationlistener;
    }

    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        super.setOnTouchListener(new DragSurfaceView$$Lambda$0(this, onTouchListener));
    }

    public DragSurfaceView(Context context) {
        super(context);
        MethodCollector.m26663i(1012);
        initView();
        MethodCollector.m26664o(1012);
    }

    private boolean onTouchInternal(View view, MotionEvent motionEvent) {
        return onTouch(view, motionEvent);
    }

    public DragSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(1018);
        initView();
        MethodCollector.m26664o(1018);
    }

    private void scaleView(View view, int i) {
        int i2 = (this.viewOrigHeight * i) / this.viewOrigWidth;
        int i3 = this.oriRight + i;
        this.oriRight = i3;
        int i4 = this.oriBottom + i2;
        this.oriBottom = i4;
        int i5 = this.screenWidth;
        int i6 = this.offset;
        if (i3 > i5 - i6 || i4 > this.screenHeight - i6 || (i3 - this.oriLeft) - (i6 * 2) < 200 || (i4 - this.oriTop) - (i6 * 2) < 200) {
            this.oriRight = i3 - i;
            this.oriBottom = i4 - i2;
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.mIsFirstTouch) {
            this.viewOrigHeight = view.getHeight();
            this.viewOrigWidth = view.getWidth();
            this.screenHeight = (getResources().getDisplayMetrics().heightPixels - 40) - getTitleTopHeight();
            this.screenWidth = getResources().getDisplayMetrics().widthPixels;
            this.mIsFirstTouch = false;
        }
        if (!this.mDragable) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.oriLeft = view.getLeft();
            this.oriRight = view.getRight();
            this.oriTop = view.getTop();
            this.oriBottom = view.getBottom();
            this.lastY = (int) motionEvent.getRawY();
            this.lastX = (int) motionEvent.getRawX();
            this.mIsScale = isScale(view, (int) motionEvent.getX(), (int) motionEvent.getY());
        } else if (action == 2) {
            int rawX = ((int) motionEvent.getRawX()) - this.lastX;
            int rawY = ((int) motionEvent.getRawY()) - this.lastY;
            if (this.mIsScale) {
                scaleView(view, rawX);
            } else {
                moveView(view, rawX, rawY);
            }
            view.layout(this.oriLeft, this.oriTop, this.oriRight, this.oriBottom);
            this.lastX = (int) motionEvent.getRawX();
            this.lastY = (int) motionEvent.getRawY();
            onUpdataLocationListener onupdatalocationlistener = this.mLocationListener;
            if (onupdatalocationlistener != null) {
                int i = this.screenWidth;
                int i2 = this.screenHeight;
                onupdatalocationlistener.onUpdateLocation((((float) this.oriLeft) * 1.0f) / ((float) i), (((float) this.oriRight) * 1.0f) / ((float) i), (((float) this.oriTop) * 1.0f) / ((float) i2), (((float) this.oriBottom) * 1.0f) / ((float) i2));
            }
        } else if (action == 1) {
            ViewGroup.LayoutParams newLayoutParams = getNewLayoutParams();
            if (newLayoutParams != null) {
                view.setLayoutParams(newLayoutParams);
            }
            this.mIsScale = false;
        }
        invalidate();
        return true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ boolean lambda$setOnTouchListener$0$DragSurfaceView(View.OnTouchListener onTouchListener, View view, MotionEvent motionEvent) {
        boolean onTouch = onTouchListener.onTouch(view, motionEvent);
        onTouchInternal(view, motionEvent);
        return onTouch;
    }

    private boolean isScale(View view, int i, int i2) {
        int left = view.getLeft();
        int right = view.getRight();
        int bottom = view.getBottom();
        int top = view.getTop();
        if ((right - left) - i >= 80 || (bottom - top) - i2 >= 80) {
            return false;
        }
        return true;
    }

    private void moveView(View view, int i, int i2) {
        int i3 = this.oriLeft;
        int i4 = i3 + i;
        int i5 = this.offset;
        if (i4 > i5) {
            int i6 = this.oriRight;
            if (i6 + i < this.screenWidth - i5) {
                this.oriLeft = i3 + i;
                this.oriRight = i6 + i;
            }
        }
        int i7 = this.oriTop;
        if (i7 + i2 > i5) {
            int i8 = this.oriBottom;
            if (i8 + i2 < this.screenHeight - i5) {
                this.oriTop = i7 + i2;
                this.oriBottom = i8 + i2;
            }
        }
    }

    public DragSurfaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MethodCollector.m26663i(1023);
        initView();
        MethodCollector.m26664o(1023);
    }
}
