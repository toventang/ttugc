package com.p2082ss.android.ugc.aweme.detail.p2751ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.lancet.C58030k;

/* renamed from: com.ss.android.ugc.aweme.detail.ui.FadeImageView */
public class FadeImageView extends ImageView {

    /* renamed from: a */
    public AbstractC41344a f96503a;

    /* renamed from: b */
    private boolean f96504b;

    /* renamed from: com.ss.android.ugc.aweme.detail.ui.FadeImageView$a */
    public interface AbstractC41344a {
        static {
            Covode.recordClassIndex(49238);
        }
    }

    static {
        Covode.recordClassIndex(49237);
    }

    public boolean isSelected() {
        return this.f96504b;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C58030k.m104850a(this);
    }

    public void setListener(AbstractC41344a aVar) {
        this.f96503a = aVar;
    }

    public void setSelected(boolean z) {
        this.f96504b = z;
    }

    public FadeImageView(Context context) {
        this(context, null);
    }

    public FadeImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private FadeImageView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(13106);
        MethodCollector.m26664o(13106);
    }
}
