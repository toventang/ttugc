package com.p2082ss.android.ugc.aweme.base.p2379ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.covode.number.Covode;
import com.bytedance.p890c.p891a.p892a.p893a.C13468b;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import dmt.viewpager.DmtRtlViewPager;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.base.ui.ScrollableViewPager */
public class ScrollableViewPager extends DmtRtlViewPager {

    /* renamed from: a */
    public int f81885a;

    /* renamed from: b */
    public boolean f81886b = true;

    /* renamed from: c */
    public boolean f81887c = true;

    /* renamed from: d */
    float f81888d;

    /* renamed from: e */
    float f81889e;

    /* renamed from: f */
    public AbstractC34662a f81890f = new AbstractC34662a() {
        /* class com.p2082ss.android.ugc.aweme.base.p2379ui.ScrollableViewPager.C346611 */

        static {
            Covode.recordClassIndex(41641);
        }

        @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.ScrollableViewPager.AbstractC34662a
        /* renamed from: a */
        public final boolean mo61309a(int i) {
            return true;
        }

        @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.ScrollableViewPager.AbstractC34662a
        /* renamed from: a */
        public final boolean mo61308a(float f, float f2) {
            if (Math.abs(f) <= ((float) ScrollableViewPager.this.f81885a) || Math.abs(f) <= Math.abs(f2)) {
                return false;
            }
            return true;
        }
    };

    /* renamed from: m */
    private boolean f81891m;

    /* renamed from: n */
    private AbstractC34691k f81892n;

    /* renamed from: o */
    private boolean f81893o;

    static {
        Covode.recordClassIndex(41640);
    }

    /* renamed from: com.ss.android.ugc.aweme.base.ui.ScrollableViewPager$a */
    public interface AbstractC34662a {

        /* renamed from: b */
        public static final int f81895b = C34728n.m70946a(8.0d);

        /* renamed from: a */
        boolean mo61308a(float f, float f2);

        /* renamed from: a */
        boolean mo61309a(int i);

        static {
            Covode.recordClassIndex(41642);
        }
    }

    /* renamed from: a */
    private void m70784a() {
        this.f81885a = C34728n.m70946a(8.0d);
        setDefaultGutterSize(0);
    }

    public int getItemCount() {
        PagerAdapter adapter = getAdapter();
        if (adapter == null) {
            return 0;
        }
        return adapter.getCount();
    }

    public void setBlockCanScroll(boolean z) {
        this.f81893o = z;
    }

    public void setEnableDispatchTouchEventCheck(boolean z) {
        this.f81891m = z;
    }

    public void setOnFlingEndListener(AbstractC34691k kVar) {
        this.f81892n = kVar;
    }

    public void setPagingMainValve(boolean z) {
        this.f81887c = z;
    }

    public ScrollableViewPager(Context context) {
        super(context);
        m70784a();
    }

    @Override // dmt.viewpager.DmtViewPager
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f81887c && this.f81886b && this.f81891m) {
            if (motionEvent.getAction() == 0) {
                this.f81888d = motionEvent.getX();
                this.f81889e = motionEvent.getY();
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                m70785a(motionEvent);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // dmt.viewpager.DmtViewPager, dmt.viewpager.DmtRtlViewPager
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if ((this.f81887c && this.f81886b && m70785a(motionEvent)) || motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // dmt.viewpager.DmtViewPager, dmt.viewpager.DmtRtlViewPager
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if ((this.f81887c && this.f81886b && m70785a(motionEvent)) || motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0080, code lost:
        if (r5 == false) goto L_0x0082;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m70785a(android.view.MotionEvent r9) {
        /*
        // Method dump skipped, instructions count: 141
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.base.p2379ui.ScrollableViewPager.m70785a(android.view.MotionEvent):boolean");
    }

    public ScrollableViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m70784a();
    }

    @Override // android.view.View, dmt.viewpager.DmtViewPager, android.view.ViewGroup
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        try {
            super.addFocusables(arrayList, i, i2);
        } catch (Exception e) {
            C51423a.m95790a((Throwable) e);
            C13468b.m24210a(e);
        }
    }

    @Override // dmt.viewpager.DmtViewPager
    /* renamed from: a */
    public final boolean mo61298a(View view, boolean z, int i, int i2, int i3) {
        if (this.f81893o || !C34729o.m70957a(view) || !super.mo61298a(view, z, i, i2, i3)) {
            return false;
        }
        return true;
    }
}
