package com.p2082ss.android.ugc.aweme.discover.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17300a;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17303d;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.views.DialogC81459o;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.widget.d */
public final class DialogC43041d extends DialogC81459o {

    /* renamed from: a */
    public TextView f100340a;

    /* renamed from: b */
    public TextView f100341b;

    /* renamed from: c */
    public ViewGroup f100342c;

    /* renamed from: d */
    private TextView f100343d;

    /* renamed from: e */
    private String f100344e = "";

    /* renamed from: f */
    private String f100345f = "";

    /* renamed from: g */
    private String f100346g = "";

    /* renamed from: h */
    private String f100347h = "";

    static {
        Covode.recordClassIndex(51189);
    }

    /* renamed from: a */
    public final DialogC43041d mo73236a(String str) {
        C89219l.m154721d(str, "");
        this.f100344e = str;
        return this;
    }

    /* renamed from: b */
    public final DialogC43041d mo73237b(String str) {
        C89219l.m154721d(str, "");
        this.f100345f = str;
        return this;
    }

    /* renamed from: c */
    public final DialogC43041d mo73238c(String str) {
        C89219l.m154721d(str, "");
        this.f100346g = str;
        return this;
    }

    /* renamed from: d */
    public final DialogC43041d mo73239d(String str) {
        C89219l.m154721d(str, "");
        this.f100347h = str;
        return this;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogC43041d(Context context) {
        super(context, R.style.fl, true, false, false);
        C89219l.m154721d(context, "");
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        Window window;
        if (Build.VERSION.SDK_INT >= 21 && (window = getWindow()) != null) {
            window.addFlags(Integer.MIN_VALUE);
        }
        super.onCreate(bundle);
        setContentView(R.layout.atx);
        TextView textView = (TextView) findViewById(R.id.a0w);
        this.f100340a = textView;
        if (textView != null) {
            textView.setText(this.f100346g);
        }
        TextView textView2 = (TextView) findViewById(R.id.dk5);
        this.f100341b = textView2;
        if (textView2 != null) {
            textView2.setText(this.f100347h);
        }
        TextView textView3 = (TextView) findViewById(R.id.title);
        this.f100343d = textView3;
        if (textView3 != null) {
            textView3.setText(this.f100344e);
        }
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.eac);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(this.f100345f);
        Typeface a = C17300a.m32029a().mo27610a(C17303d.f41568b);
        if (a != null) {
            TextView textView4 = this.f100343d;
            if (textView4 != null) {
                textView4.setTypeface(a);
            }
            TextView textView5 = this.f100341b;
            if (textView5 != null) {
                textView5.setTypeface(a);
            }
        }
        this.f100342c = (FrameLayout) findViewById(R.id.dnk);
    }
}
