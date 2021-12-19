package com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3241ui.view;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.base.Widget;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3238a.p3239a.C55968c;
import com.p2082ss.android.ugc.trill.R;
import java.util.Arrays;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.view.b */
public final class C56036b extends FrameLayout {

    /* renamed from: a */
    public static final C56037a f127769a = new C56037a((byte) 0);

    /* renamed from: b */
    private Widget f127770b;

    /* renamed from: c */
    private HashMap f127771c;

    static {
        Covode.recordClassIndex(65831);
    }

    /* renamed from: a */
    public final View mo92888a(int i) {
        if (this.f127771c == null) {
            this.f127771c = new HashMap();
        }
        View view = (View) this.f127771c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f127771c.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.view.b$a */
    public static final class C56037a {
        static {
            Covode.recordClassIndex(65832);
        }

        private C56037a() {
        }

        public /* synthetic */ C56037a(byte b) {
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
        Widget widget = this.f127770b;
        if (widget != null) {
            widget.destroy();
        }
    }

    public final void setWidget(Widget widget) {
        C89219l.m154721d(widget, "");
        this.f127770b = widget;
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i) {
        Widget widget;
        super.onWindowVisibilityChanged(i);
        if (i == 0 && (widget = this.f127770b) != null) {
            widget.resume();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C56036b(Context context) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(3011);
        View.inflate(context, R.layout.a7r, this);
        MethodCollector.m26664o(3011);
    }

    /* renamed from: a */
    public final void mo92889a(C55968c cVar) {
        String a;
        C89219l.m154721d(cVar, "");
        int i = cVar.f127628b;
        int i2 = R.raw.icon_person_arrow_left_right;
        if (i == 1) {
            i2 = R.raw.icon_two_person;
        }
        if (cVar.f127629c == 1 && cVar.f127628b == 1) {
            String string = getContext().getString(R.string.fqi);
            C89219l.m154716b(string, "");
            a = C1764a.m5928a(string, Arrays.copyOf(new Object[]{"@" + cVar.f127627a}, 1));
            C89219l.m154716b(a, "");
        } else if (cVar.f127629c == 1 && cVar.f127628b == 2) {
            String string2 = getContext().getString(R.string.fqj);
            C89219l.m154716b(string2, "");
            a = C1764a.m5928a(string2, Arrays.copyOf(new Object[]{"@" + cVar.f127627a}, 1));
            C89219l.m154716b(a, "");
        } else if (cVar.f127629c == 2 && cVar.f127628b == 1) {
            String string3 = getContext().getString(R.string.c_q);
            C89219l.m154716b(string3, "");
            a = C1764a.m5928a(string3, Arrays.copyOf(new Object[]{"@" + cVar.f127627a}, 1));
            C89219l.m154716b(a, "");
        } else if (cVar.f127629c == 2 && cVar.f127628b == 2) {
            String string4 = getContext().getString(R.string.c_r);
            C89219l.m154716b(string4, "");
            a = C1764a.m5928a(string4, Arrays.copyOf(new Object[]{"@" + cVar.f127627a}, 1));
            C89219l.m154716b(a, "");
        } else {
            String string5 = getContext().getString(R.string.fqi);
            C89219l.m154716b(string5, "");
            a = C1764a.m5928a(string5, Arrays.copyOf(new Object[]{"@" + cVar.f127627a}, 1));
            C89219l.m154716b(a, "");
        }
        ((TuxIconView) mo92888a(R.id.eib)).setIconRes(i2);
        TuxTextView tuxTextView = (TuxTextView) mo92888a(R.id.eic);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(a);
    }

    public /* synthetic */ C56036b(Context context, byte b) {
        this(context);
    }
}
