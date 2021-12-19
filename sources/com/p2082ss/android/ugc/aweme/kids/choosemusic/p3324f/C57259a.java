package com.p2082ss.android.ugc.aweme.kids.choosemusic.p3324f;

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

/* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.f.a */
public final class C57259a extends PopupWindow {

    /* renamed from: a */
    public final Runnable f130428a = new RunnableC57260a(this);

    /* renamed from: b */
    public final RemoteImageView f130429b;

    /* renamed from: c */
    public final View f130430c;

    static {
        Covode.recordClassIndex(67164);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.f.a$a */
    static final class RunnableC57260a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C57259a f130431a;

        static {
            Covode.recordClassIndex(67165);
        }

        RunnableC57260a(C57259a aVar) {
            this.f130431a = aVar;
        }

        public final void run() {
            this.f130431a.dismiss();
        }
    }

    public final void dismiss() {
        if (isShowing()) {
            super.dismiss();
        }
    }

    public C57259a(Context context) {
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(7660);
        View inflate = LayoutInflater.from(context).inflate(R.layout.am4, (ViewGroup) null);
        C89219l.m154716b(inflate, "");
        this.f130430c = inflate;
        setContentView(inflate);
        View findViewById = inflate.findViewById(R.id.bxp);
        C89219l.m154716b(findViewById, "");
        this.f130429b = (RemoteImageView) findViewById;
        setWidth(-2);
        setHeight(-2);
        setAnimationStyle(R.style.fo);
        setBackgroundDrawable(new ColorDrawable(0));
        inflate.measure(0, 0);
        MethodCollector.m26664o(7660);
    }
}
