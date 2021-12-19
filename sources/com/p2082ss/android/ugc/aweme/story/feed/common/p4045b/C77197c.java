package com.p2082ss.android.ugc.aweme.story.feed.common.p4045b;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1722h.C23155d;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.feed.common.b.c */
public final class C77197c {

    /* renamed from: a */
    public static final C77197c f173188a = new C77197c();

    private C77197c() {
    }

    /* renamed from: com.ss.android.ugc.aweme.story.feed.common.b.c$a */
    static final class RunnableC77198a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f173189a;

        static {
            Covode.recordClassIndex(90210);
        }

        RunnableC77198a(View view) {
            this.f173189a = view;
        }

        public final void run() {
            this.f173189a.setVisibility(8);
        }
    }

    static {
        Covode.recordClassIndex(90209);
    }

    /* renamed from: a */
    public static void m134965a(View view, EnumC77199d dVar, float f, String str) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(dVar, "");
        view.setVisibility(0);
        if (dVar.getShowIcon()) {
            TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.bh1);
            C89219l.m154716b(tuxIconView, "");
            tuxIconView.setVisibility(0);
            ((TuxIconView) view.findViewById(R.id.bh1)).setIconRes(dVar.getIconRes());
        } else {
            TuxIconView tuxIconView2 = (TuxIconView) view.findViewById(R.id.bh1);
            C89219l.m154716b(tuxIconView2, "");
            tuxIconView2.setVisibility(8);
        }
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.text);
        C89219l.m154716b(tuxTextView, "");
        Context context = view.getContext();
        C89219l.m154716b(context, "");
        tuxTextView.setText(dVar.getText(context, f));
        if (dVar.getShowRetry()) {
            TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.djd);
            C89219l.m154716b(tuxTextView2, "");
            tuxTextView2.setVisibility(0);
            TuxTextView tuxTextView3 = (TuxTextView) view.findViewById(R.id.text);
            C89219l.m154716b(tuxTextView3, "");
            tuxTextView3.setText(str);
        } else {
            TuxTextView tuxTextView4 = (TuxTextView) view.findViewById(R.id.djd);
            C89219l.m154716b(tuxTextView4, "");
            tuxTextView4.setVisibility(8);
        }
        if (dVar.getShowXIcon()) {
            TuxIconView tuxIconView3 = (TuxIconView) view.findViewById(R.id.fjv);
            C89219l.m154716b(tuxIconView3, "");
            tuxIconView3.setVisibility(0);
        } else {
            TuxIconView tuxIconView4 = (TuxIconView) view.findViewById(R.id.fjv);
            C89219l.m154716b(tuxIconView4, "");
            tuxIconView4.setVisibility(8);
        }
        Context context2 = view.getContext();
        C89219l.m154716b(context2, "");
        Integer a = C23155d.m43641a(context2, dVar.getBackgroundColor());
        if (a != null) {
            ((RelativeLayout) view.findViewById(R.id.d_7)).setBackgroundColor(a.intValue());
        }
        if (dVar == EnumC77199d.UPLOAD_SUCCESS) {
            view.postDelayed(new RunnableC77198a(view), 3000);
        }
    }
}
