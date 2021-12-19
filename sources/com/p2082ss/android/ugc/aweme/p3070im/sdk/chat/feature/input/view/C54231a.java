package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.view.AbstractC54232b;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.view.a */
public class C54231a extends FrameLayout implements AbstractC54232b {

    /* renamed from: a */
    protected int f124246a;

    /* renamed from: b */
    protected AbstractC54232b.AbstractC54233a f124247b;

    /* renamed from: c */
    protected final SparseArray<View> f124248c;

    static {
        Covode.recordClassIndex(63920);
    }

    /* renamed from: b */
    public final int mo91327b() {
        return this.f124246a;
    }

    /* renamed from: a */
    public final boolean mo91326a() {
        if (this.f124246a != -1) {
            return true;
        }
        return false;
    }

    public void setOnPanelChangeListener(AbstractC54232b.AbstractC54233a aVar) {
        this.f124247b = aVar;
    }

    /* renamed from: a */
    public final void mo91325a(View view) {
        if (this.f124248c.get(1) == null) {
            this.f124248c.put(1, view);
            addView(view, new ViewGroup.LayoutParams(-1, -1));
            view.setVisibility(8);
        }
    }

    /* renamed from: a */
    public void mo91312a(int i) {
        if (this.f124246a != i) {
            if (i == -1) {
                setVisibility(8);
                this.f124246a = i;
                AbstractC54232b.AbstractC54233a aVar = this.f124247b;
                if (aVar != null) {
                    aVar.mo91202a(i, null);
                    return;
                }
                return;
            }
            View view = this.f124248c.get(i);
            if (view != null) {
                setVisibility(0);
                int size = this.f124248c.size();
                for (int i2 = 0; i2 < size; i2++) {
                    int keyAt = this.f124248c.keyAt(i2);
                    if (keyAt != i) {
                        this.f124248c.get(keyAt).setVisibility(8);
                    }
                }
                view.setVisibility(0);
                this.f124246a = i;
                AbstractC54232b.AbstractC54233a aVar2 = this.f124247b;
                if (aVar2 != null) {
                    aVar2.mo91202a(i, view);
                }
            }
        }
    }

    public C54231a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public C54231a(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(4393);
        this.f124246a = -1;
        this.f124248c = new SparseArray<>();
        MethodCollector.m26664o(4393);
    }
}
