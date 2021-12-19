package com.bytedance.tux.table.p1726a;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.tux.table.a.a */
public final class C23275a extends LinearLayout {

    /* renamed from: a */
    public View f55180a;

    /* renamed from: b */
    private HashMap f55181b;

    static {
        Covode.recordClassIndex(27225);
    }

    /* renamed from: a */
    public final View mo37908a(int i) {
        if (this.f55181b == null) {
            this.f55181b = new HashMap();
        }
        View view = (View) this.f55181b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f55181b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final View getCustomView$tux_release() {
        return this.f55180a;
    }

    public final TuxTextView getLabelTv$tux_release() {
        return (TuxTextView) mo37908a(R.id.c2l);
    }

    public final CharSequence getLabel() {
        TuxTextView tuxTextView = (TuxTextView) mo37908a(R.id.c2l);
        C89219l.m154709a((Object) tuxTextView, "");
        return tuxTextView.getText();
    }

    public final boolean getWithIcon$tux_release() {
        TuxIconView tuxIconView = (TuxIconView) mo37908a(R.id.icon_iv);
        C89219l.m154709a((Object) tuxIconView, "");
        if (tuxIconView.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final void setCustomView$tux_release(View view) {
        this.f55180a = view;
    }

    public final void setFont(int i) {
        ((TuxTextView) mo37908a(R.id.c2l)).setTuxFont(i);
    }

    public final void setIconColor(int i) {
        ((TuxIconView) mo37908a(R.id.icon_iv)).setTintColor(i);
    }

    public final void setIconRes(int i) {
        ((TuxIconView) mo37908a(R.id.icon_iv)).setIconRes(i);
    }

    public final void setTextColor(int i) {
        ((TuxTextView) mo37908a(R.id.c2l)).setTextColor(i);
    }

    public final void setLabel(CharSequence charSequence) {
        TuxTextView tuxTextView = (TuxTextView) mo37908a(R.id.c2l);
        C89219l.m154709a((Object) tuxTextView, "");
        tuxTextView.setText(charSequence);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C23275a(Context context) {
        super(context, null, R.attr.cc);
        C89219l.m154719c(context, "");
        MethodCollector.m26663i(8588);
        C1764a.m5927a(LayoutInflater.from(context), R.layout.w, this, true);
        TuxTextView tuxTextView = (TuxTextView) mo37908a(R.id.c2l);
        tuxTextView.setMaxLines(1);
        tuxTextView.setSingleLine();
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        MethodCollector.m26664o(8588);
    }

    public /* synthetic */ C23275a(Context context, byte b) {
        this(context);
    }
}
