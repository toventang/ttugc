package com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3241ui.view;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.base.Widget;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.view.a */
public final class C56034a extends LinearLayout {

    /* renamed from: a */
    public static final C56035a f127767a = new C56035a((byte) 0);

    /* renamed from: b */
    private Widget f127768b;

    static {
        Covode.recordClassIndex(65829);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.view.a$a */
    public static final class C56035a {
        static {
            Covode.recordClassIndex(65830);
        }

        private C56035a() {
        }

        public /* synthetic */ C56035a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Widget widget = this.f127768b;
        if (widget != null) {
            widget.destroy();
        }
    }

    public final void setWidget(Widget widget) {
        C89219l.m154721d(widget, "");
        this.f127768b = widget;
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i) {
        Widget widget;
        super.onWindowVisibilityChanged(i);
        if (i == 0 && (widget = this.f127768b) != null) {
            widget.resume();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C56034a(Context context) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(1884);
        View.inflate(context, R.layout.a7q, this);
        MethodCollector.m26664o(1884);
    }

    public /* synthetic */ C56034a(Context context, byte b) {
        this(context);
    }
}
