package com.p2082ss.android.ugc.tools.view.widget.p4368b;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.view.widget.b.c */
public final class C85028c extends FrameLayout {

    /* renamed from: a */
    private View f190233a;

    static {
        Covode.recordClassIndex(99049);
    }

    /* access modifiers changed from: protected */
    public final View getProgress() {
        return this.f190233a;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        View view = this.f190233a;
        if (view != null) {
            view.setVisibility(getVisibility());
        }
    }

    public final FrameLayout.LayoutParams getProgressLayoutParams() {
        ViewGroup.LayoutParams layoutParams;
        View view = this.f190233a;
        FrameLayout.LayoutParams layoutParams2 = null;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            layoutParams2 = layoutParams;
        }
        return layoutParams2;
    }

    /* access modifiers changed from: protected */
    public final void setProgress(View view) {
        this.f190233a = view;
    }

    public final void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.f190233a;
        if (view != null) {
            view.setVisibility(i);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C85028c(Context context) {
        super(context, null);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(11370);
        this.f190233a = C1764a.m5927a(LayoutInflater.from(context), R.layout.b3t, this, true).findViewById(R.id.anz);
        MethodCollector.m26664o(11370);
    }

    public /* synthetic */ C85028c(Context context, byte b) {
        this(context);
    }
}
