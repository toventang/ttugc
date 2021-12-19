package com.p2082ss.android.ugc.aweme.common.keyboard;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.utils.p4203d.C80329c;

/* renamed from: com.ss.android.ugc.aweme.common.keyboard.MeasureLinearLayout */
public class MeasureLinearLayout extends LinearLayout {

    /* renamed from: a */
    private C39140a f92349a;

    /* renamed from: b */
    private int f92350b;

    /* renamed from: c */
    private int f92351c;

    static {
        Covode.recordClassIndex(46758);
    }

    public C39140a getKeyBoardObservable() {
        return this.f92349a;
    }

    /* renamed from: a */
    public final void mo67898a() {
        if (C80329c.m139264b()) {
            this.f92350b++;
        }
    }

    public void setKeyBoardObservable(C39140a aVar) {
        this.f92349a = aVar;
    }

    public MeasureLinearLayout(Context context) {
        this(context, null);
    }

    public MeasureLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        MethodCollector.m26663i(13314);
        int i3 = this.f92351c;
        int i4 = this.f92350b;
        if (i3 == i4) {
            this.f92349a.mo67902a(getContext(), i2);
        } else {
            this.f92351c = i4;
        }
        super.onMeasure(i, i2);
        MethodCollector.m26664o(13314);
    }

    private MeasureLinearLayout(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(13253);
        this.f92349a = new C39140a();
        MethodCollector.m26664o(13253);
    }
}
