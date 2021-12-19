package com.p2082ss.android.ugc.gamora.editor.toolbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.toolbar.EditProcessBarView */
public final class EditProcessBarView extends FrameLayout {

    /* renamed from: a */
    public ProgressBar f185695a;

    /* renamed from: b */
    public ProgressBar f185696b;

    /* renamed from: c */
    public ProgressBar f185697c;

    /* renamed from: d */
    final ValueAnimator f185698d;

    /* renamed from: e */
    private int f185699e;

    static {
        Covode.recordClassIndex(96974);
    }

    public EditProcessBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final int getTotalPage() {
        return this.f185699e;
    }

    public final ProgressBar getProcessBarView1() {
        ProgressBar progressBar = this.f185695a;
        if (progressBar == null) {
            C89219l.m154710a("processBarView1");
        }
        return progressBar;
    }

    public final ProgressBar getProcessBarView2() {
        ProgressBar progressBar = this.f185696b;
        if (progressBar == null) {
            C89219l.m154710a("processBarView2");
        }
        return progressBar;
    }

    public final ProgressBar getProcessBarView3() {
        ProgressBar progressBar = this.f185697c;
        if (progressBar == null) {
            C89219l.m154710a("processBarView3");
        }
        return progressBar;
    }

    public final void setTotalPage(int i) {
        this.f185699e = i;
    }

    public final void setProcessBarView1(ProgressBar progressBar) {
        C89219l.m154721d(progressBar, "");
        this.f185695a = progressBar;
    }

    public final void setProcessBarView2(ProgressBar progressBar) {
        C89219l.m154721d(progressBar, "");
        this.f185696b = progressBar;
    }

    public final void setProcessBarView3(ProgressBar progressBar) {
        C89219l.m154721d(progressBar, "");
        this.f185697c = progressBar;
    }

    private /* synthetic */ EditProcessBarView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private EditProcessBarView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(11515);
        this.f185699e = 2;
        ValueAnimator ofInt = ValueAnimator.ofInt(1, 10);
        C89219l.m154716b(ofInt, "");
        this.f185698d = ofInt;
        MethodCollector.m26664o(11515);
    }
}
