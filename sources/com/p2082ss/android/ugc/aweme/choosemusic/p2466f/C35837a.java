package com.p2082ss.android.ugc.aweme.choosemusic.p2466f;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.f.a */
public final class C35837a extends PopupWindow {

    /* renamed from: a */
    public final Runnable f84602a = new RunnableC35838a(this);

    /* renamed from: b */
    public final RemoteImageView f84603b;

    /* renamed from: c */
    public final View f84604c;

    static {
        Covode.recordClassIndex(43076);
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.f.a$a */
    static final class RunnableC35838a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C35837a f84605a;

        static {
            Covode.recordClassIndex(43077);
        }

        RunnableC35838a(C35837a aVar) {
            this.f84605a = aVar;
        }

        public final void run() {
            this.f84605a.dismiss();
        }
    }

    public final void dismiss() {
        if (isShowing()) {
            super.dismiss();
        }
    }

    public C35837a(Context context) {
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(1892);
        View inflate = LayoutInflater.from(context).inflate(R.layout.am4, (ViewGroup) null);
        C89219l.m154716b(inflate, "");
        this.f84604c = inflate;
        setContentView(inflate);
        View findViewById = inflate.findViewById(R.id.bxp);
        C89219l.m154716b(findViewById, "");
        this.f84603b = (RemoteImageView) findViewById;
        setWidth(-2);
        setHeight(-2);
        setAnimationStyle(R.style.fo);
        setBackgroundDrawable(new ColorDrawable(0));
        inflate.measure(0, 0);
        MethodCollector.m26664o(1892);
    }
}
