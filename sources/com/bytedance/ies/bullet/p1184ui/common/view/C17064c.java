package com.bytedance.ies.bullet.p1184ui.common.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.ui.common.view.c */
public final class C17064c extends FrameLayout {

    /* renamed from: a */
    private View f40612a;

    /* renamed from: b */
    private HashMap f40613b;

    static {
        Covode.recordClassIndex(19514);
    }

    /* renamed from: a */
    public final View mo26937a(int i) {
        if (this.f40613b == null) {
            this.f40613b = new HashMap();
        }
        View view = (View) this.f40613b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f40613b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final View getTitlebarRootView() {
        return this.f40612a;
    }

    public final void setTitlebarRootView(View view) {
        C89219l.m154719c(view, "");
        this.f40612a = view;
    }

    public final void setBackListener(View.OnClickListener onClickListener) {
        C89219l.m154719c(onClickListener, "");
        ((AutoRTLImageView) mo26937a(R.id.bsy)).setOnClickListener(onClickListener);
    }

    public final void setCloseAllListener(View.OnClickListener onClickListener) {
        C89219l.m154719c(onClickListener, "");
        ((AutoRTLImageView) mo26937a(R.id.bu6)).setOnClickListener(onClickListener);
    }

    public final void setEnableReFresh(boolean z) {
        int i;
        Button button = (Button) mo26937a(R.id.yk);
        C89219l.m154709a((Object) button, "");
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        button.setVisibility(i);
    }

    public final void setRefreshListener(View.OnClickListener onClickListener) {
        C89219l.m154719c(onClickListener, "");
        ((Button) mo26937a(R.id.yk)).setOnClickListener(onClickListener);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C17064c(Context context) {
        super(context, null, 0);
        C89219l.m154719c(context, "");
        MethodCollector.m26663i(5660);
        View a = C1764a.m5927a(LayoutInflater.from(context), R.layout.m_, this, true);
        C89219l.m154709a((Object) a, "");
        this.f40612a = a;
        MethodCollector.m26664o(5660);
    }

    public final void setTitleIfMissing(CharSequence charSequence) {
        C89219l.m154719c(charSequence, "");
        TextView textView = (TextView) mo26937a(R.id.f63);
        C89219l.m154709a((Object) textView, "");
        CharSequence text = textView.getText();
        C89219l.m154709a((Object) text, "");
        if (text.length() == 0) {
            TextView textView2 = (TextView) mo26937a(R.id.f63);
            C89219l.m154709a((Object) textView2, "");
            textView2.setText(charSequence);
        }
    }

    public /* synthetic */ C17064c(Context context, byte b) {
        this(context);
    }
}
