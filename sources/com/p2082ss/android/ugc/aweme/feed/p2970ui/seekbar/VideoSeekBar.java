package com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import androidx.core.content.C0643b;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p084a.p088b.C1862a;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.p2974a.C50443c;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBar */
public final class VideoSeekBar extends LinearLayout {

    /* renamed from: a */
    public static final C50429a f116449a = new C50429a((byte) 0);

    /* renamed from: b */
    private int f116450b;

    /* renamed from: c */
    private int f116451c;

    /* renamed from: d */
    private int f116452d;

    /* renamed from: e */
    private MutableSeekBar f116453e;

    /* renamed from: f */
    private Float f116454f;

    /* renamed from: g */
    private AbstractC50431c f116455g;

    /* renamed from: h */
    private AbstractC50430b f116456h;

    /* renamed from: i */
    private int f116457i;

    /* renamed from: j */
    private int f116458j;

    /* renamed from: k */
    private final int f116459k;

    /* renamed from: l */
    private final int f116460l;

    /* renamed from: m */
    private final int f116461m;

    /* renamed from: n */
    private int f116462n;

    /* renamed from: o */
    private float f116463o;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBar$b */
    public interface AbstractC50430b {
        static {
            Covode.recordClassIndex(59565);
        }

        /* renamed from: a */
        void mo85656a(MotionEvent motionEvent);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBar$c */
    public interface AbstractC50431c {
        static {
            Covode.recordClassIndex(59566);
        }

        /* renamed from: a */
        void mo85657a(int i);

        /* renamed from: a */
        void mo85658a(SeekBar seekBar);

        /* renamed from: b */
        void mo85659b(SeekBar seekBar);
    }

    static {
        Covode.recordClassIndex(59563);
    }

    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBar$a */
    public static final class C50429a {
        static {
            Covode.recordClassIndex(59564);
        }

        private C50429a() {
        }

        public /* synthetic */ C50429a(byte b) {
            this();
        }
    }

    public final AbstractC50430b getMOnDispatchTouchEventListener() {
        return this.f116456h;
    }

    public final AbstractC50431c getMOnSeekBarChangeListener() {
        return this.f116455g;
    }

    public final Float getMProgress() {
        return this.f116454f;
    }

    public final int getMScreenWidth() {
        return this.f116457i;
    }

    public final MutableSeekBar getMutableSeekBar() {
        return this.f116453e;
    }

    public final float getProgressHeight() {
        return this.f116463o;
    }

    public final int getSeekBarShowType() {
        return this.f116458j;
    }

    public final void setMOnDispatchTouchEventListener(AbstractC50430b bVar) {
        this.f116456h = bVar;
    }

    public final void setMOnSeekBarChangeListener(AbstractC50431c cVar) {
        this.f116455g = cVar;
    }

    public final void setMProgress(Float f) {
        this.f116454f = f;
    }

    public final void setMScreenWidth(int i) {
        this.f116457i = i;
    }

    public final void setProgress(float f) {
        mo85636a(f);
    }

    public final void setProgressHeight(float f) {
        this.f116463o = f;
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBar$d */
    public static final class C50432d implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        final /* synthetic */ VideoSeekBar f116464a;

        static {
            Covode.recordClassIndex(59567);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C50432d(VideoSeekBar videoSeekBar) {
            this.f116464a = videoSeekBar;
        }

        public final void onStartTrackingTouch(SeekBar seekBar) {
            AbstractC50431c mOnSeekBarChangeListener = this.f116464a.getMOnSeekBarChangeListener();
            if (mOnSeekBarChangeListener != null) {
                mOnSeekBarChangeListener.mo85658a(seekBar);
            }
        }

        public final void onStopTrackingTouch(SeekBar seekBar) {
            AbstractC50431c mOnSeekBarChangeListener = this.f116464a.getMOnSeekBarChangeListener();
            if (mOnSeekBarChangeListener != null) {
                mOnSeekBarChangeListener.mo85659b(seekBar);
            }
        }

        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            AbstractC50431c mOnSeekBarChangeListener = this.f116464a.getMOnSeekBarChangeListener();
            if (mOnSeekBarChangeListener != null) {
                mOnSeekBarChangeListener.mo85657a(i);
            }
        }
    }

    public VideoSeekBar(Context context) {
        this(context, null);
    }

    public final void setOnDispatchTouchEventListener(AbstractC50430b bVar) {
        C89219l.m154721d(bVar, "");
        this.f116456h = bVar;
    }

    public final void setOnSeekBarChangeListener(AbstractC50431c cVar) {
        C89219l.m154721d(cVar, "");
        this.f116455g = cVar;
    }

    public final void setPauseStatus(boolean z) {
        MutableSeekBar mutableSeekBar = this.f116453e;
        if (mutableSeekBar != null) {
            mutableSeekBar.setPauseStatus(z);
        }
    }

    /* renamed from: a */
    public final C89391z mo85635a(MotionEvent motionEvent) {
        AbstractC50430b bVar = this.f116456h;
        if (bVar == null) {
            return null;
        }
        bVar.mo85656a(motionEvent);
        return C89391z.f203057a;
    }

    /* renamed from: a */
    public final void mo85636a(float f) {
        this.f116454f = Float.valueOf(f);
        MutableSeekBar mutableSeekBar = this.f116453e;
        if (mutableSeekBar != null) {
            mutableSeekBar.setProgress((int) (f * 100.0f));
        }
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        if (this.f116458j == 2) {
            return false;
        }
        mo85635a(motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: a */
    private final void m94581a(int i) {
        this.f116463o = (float) this.f116450b;
        int i2 = this.f116451c;
        float f = (float) i2;
        this.f116462n = this.f116460l;
        if (i == 1) {
            this.f116463o = (float) i2;
            f = (float) this.f116452d;
            this.f116462n = this.f116459k;
        }
        MutableSeekBar mutableSeekBar = this.f116453e;
        if (mutableSeekBar != null) {
            C50443c.m94605a(mutableSeekBar);
            MutableSeekBar.m94580a(mutableSeekBar, Integer.valueOf(this.f116462n), null, Float.valueOf(this.f116463o), 10);
            MutableSeekBar.m94579a(mutableSeekBar, Float.valueOf(f), Integer.valueOf(this.f116462n));
        }
    }

    public final void setSeekBarShowType(int i) {
        MutableSeekBar mutableSeekBar;
        if (this.f116458j != i) {
            this.f116458j = i;
            if (i == 0) {
                MutableSeekBar mutableSeekBar2 = this.f116453e;
                if (mutableSeekBar2 != null) {
                    mutableSeekBar2.setVisibility(0);
                    m94581a(0);
                    mutableSeekBar2.setCanDrag(true);
                }
            } else if (i == 1) {
                MutableSeekBar mutableSeekBar3 = this.f116453e;
                if (mutableSeekBar3 != null) {
                    mutableSeekBar3.setVisibility(0);
                    m94581a(1);
                    mutableSeekBar3.setCanDrag(true);
                }
            } else if (i == 2 && (mutableSeekBar = this.f116453e) != null) {
                mutableSeekBar.setCanDrag(false);
                mutableSeekBar.setVisibility(8);
            }
        }
    }

    public VideoSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private VideoSeekBar(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        ViewGroup.LayoutParams layoutParams;
        MethodCollector.m26663i(5443);
        this.f116450b = (int) C13628n.m24520b(getContext(), 2.0f);
        this.f116451c = (int) C13628n.m24520b(getContext(), 4.0f);
        this.f116452d = (int) C13628n.m24520b(getContext(), 13.0f);
        this.f116458j = 2;
        Context context2 = getContext();
        if (context2 == null) {
            C89219l.m154715b();
        }
        this.f116459k = C0643b.m2378c(context2, R.color.l);
        Context context3 = getContext();
        if (context3 == null) {
            C89219l.m154715b();
        }
        int c = C0643b.m2378c(context3, R.color.ac);
        this.f116460l = c;
        Context context4 = getContext();
        if (context4 == null) {
            C89219l.m154715b();
        }
        int c2 = C0643b.m2378c(context4, R.color.a7);
        this.f116461m = c2;
        this.f116462n = c;
        this.f116463o = (float) this.f116450b;
        try {
            this.f116457i = C13628n.m24504a(context);
            View a = C1862a.m6032a(context, R.layout.tk, this, true);
            bringToFront();
            MutableSeekBar mutableSeekBar = (MutableSeekBar) a.findViewById(R.id.dtt);
            this.f116453e = mutableSeekBar;
            if (!(mutableSeekBar == null || (layoutParams = mutableSeekBar.getLayoutParams()) == null)) {
                layoutParams.height = (int) C13628n.m24520b(context, 20.0f);
            }
            MutableSeekBar mutableSeekBar2 = this.f116453e;
            if (mutableSeekBar2 != null) {
                MutableSeekBar.m94580a(mutableSeekBar2, Integer.valueOf(this.f116462n), Integer.valueOf(c2), Float.valueOf(this.f116463o), 8);
                MutableSeekBar.m94579a(mutableSeekBar2, Float.valueOf((float) this.f116451c), Integer.valueOf(this.f116462n));
            }
            MutableSeekBar mutableSeekBar3 = this.f116453e;
            if (mutableSeekBar3 != null) {
                mutableSeekBar3.setCustomOnSeekBarChangeListener(new C50432d(this));
                MethodCollector.m26664o(5443);
                return;
            }
            MethodCollector.m26664o(5443);
        } catch (Throwable th) {
            C51423a.m95790a(th);
            MethodCollector.m26664o(5443);
        }
    }
}
