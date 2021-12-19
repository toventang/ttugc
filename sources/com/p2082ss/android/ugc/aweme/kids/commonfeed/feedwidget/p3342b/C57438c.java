package com.p2082ss.android.ugc.aweme.kids.commonfeed.feedwidget.p3342b;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.base.C34602l;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.b.c */
public final class C57438c extends FrameLayout {

    /* renamed from: a */
    private SmartImageView f130957a;

    /* renamed from: b */
    private SmartImageView f130958b;

    /* renamed from: c */
    private HashMap f130959c;

    static {
        Covode.recordClassIndex(67367);
    }

    /* renamed from: a */
    private View m104112a(int i) {
        if (this.f130959c == null) {
            this.f130959c = new HashMap();
        }
        View view = (View) this.f130959c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f130959c.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void setOnActionClickListener(View.OnClickListener onClickListener) {
        ((SmartImageView) m104112a(R.id.c1t)).setOnClickListener(onClickListener);
    }

    public final void setActionIcon(C34602l lVar) {
        C89219l.m154721d(lVar, "");
        C20766v a = C20761r.m39060a(lVar);
        a.f49124u = Bitmap.Config.ARGB_8888;
        SmartImageView smartImageView = this.f130958b;
        if (smartImageView == null) {
            C89219l.m154710a("actionIconView");
        }
        a.f49092E = smartImageView;
        a.mo34186c();
    }

    public final void setIcon(C34602l lVar) {
        C89219l.m154721d(lVar, "");
        C20766v a = C20761r.m39060a(lVar);
        a.f49124u = Bitmap.Config.ARGB_8888;
        SmartImageView smartImageView = this.f130957a;
        if (smartImageView == null) {
            C89219l.m154710a("iconView");
        }
        a.f49092E = smartImageView;
        a.mo34186c();
    }

    public final void setSubtitle(String str) {
        TuxTextView tuxTextView = (TuxTextView) m104112a(R.id.c1v);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(str);
    }

    public final void setTitle(String str) {
        TuxTextView tuxTextView = (TuxTextView) m104112a(R.id.c1w);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C57438c(Context context) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(5043);
        View a = C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.acq, this, true);
        View findViewById = a.findViewById(R.id.c1u);
        C89219l.m154716b(findViewById, "");
        this.f130957a = (SmartImageView) findViewById;
        View findViewById2 = a.findViewById(R.id.c1t);
        C89219l.m154716b(findViewById2, "");
        this.f130958b = (SmartImageView) findViewById2;
        MethodCollector.m26664o(5043);
    }

    public /* synthetic */ C57438c(Context context, byte b) {
        this(context);
    }
}
