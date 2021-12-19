package com.p2082ss.android.ugc.aweme.story.edit.p4028a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p2082ss.android.ugc.aweme.account.model.AbstractC32846a;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.editSticker.interact.view.AbstractC45921f;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.AvatarWithBorderView;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.p3810c.C70982a;
import com.p2082ss.android.ugc.tools.p4340c.C84402a;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.edit.a.d */
public final class C76747d extends FrameLayout implements AbstractC45921f {

    /* renamed from: a */
    private final View f172259a;

    /* renamed from: b */
    private HashMap f172260b;

    static {
        Covode.recordClassIndex(89743);
    }

    /* renamed from: a */
    private View m134337a(int i) {
        if (this.f172260b == null) {
            this.f172260b = new HashMap();
        }
        View view = (View) this.f172260b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f172260b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.view.AbstractC45921f
    /* renamed from: c */
    public final void mo77334c(boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.view.AbstractC45921f
    public final View getContentView() {
        return this.f172259a;
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.view.AbstractC45921f
    /* renamed from: a */
    public final void mo77332a(boolean z) {
        int i;
        LinearLayout linearLayout = (LinearLayout) m134337a(R.id.bc0);
        C89219l.m154716b(linearLayout, "");
        if (z) {
            i = 0;
        } else {
            i = 4;
        }
        linearLayout.setVisibility(i);
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.view.AbstractC45921f
    /* renamed from: b */
    public final void mo77333b(boolean z) {
        int i;
        LinearLayout linearLayout = (LinearLayout) m134337a(R.id.bbz);
        C89219l.m154716b(linearLayout, "");
        int i2 = 0;
        if (z) {
            i = 0;
        } else {
            i = 4;
        }
        linearLayout.setVisibility(i);
        FrameLayout frameLayout = (FrameLayout) m134337a(R.id.cnb);
        C89219l.m154716b(frameLayout, "");
        if (!z) {
            i2 = 4;
        }
        frameLayout.setVisibility(i2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C76747d(Context context) {
        super(context, null, 0);
        UrlModel urlModel;
        Drawable drawable;
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(6640);
        this.f172259a = this;
        addView(C1764a.m5927a(LayoutInflater.from(context), R.layout.bja, this, false));
        ((AvatarWithBorderView) m134337a(R.id.f_7)).setBorderColor(R.color.l);
        AbstractC32846a e = C63244g.m114602a().mo73255A().mo93906e();
        if (e == null || e.mo58663f() == null) {
            C84402a.m145165a((SimpleDraweeView) m134337a(R.id.f_7), 2131232314);
        } else {
            UrlModel f = e.mo58663f();
            Context context2 = getContext();
            C89219l.m154716b(context2, "");
            int a = (int) C84912r.m145930a(context2, 49.0f);
            Context context3 = getContext();
            C89219l.m154716b(context3, "");
            C84402a.m145169a((SimpleDraweeView) m134337a(R.id.f_7), f, a, (int) C84912r.m145930a(context3, 49.0f));
        }
        TuxTextView tuxTextView = (TuxTextView) m134337a(R.id.ert);
        C89219l.m154716b(tuxTextView, "");
        StringBuilder sb = new StringBuilder("@");
        AbstractC32846a e2 = C63244g.m114602a().mo73255A().mo93906e();
        Resources resources = getResources();
        C89219l.m154716b(resources, "");
        tuxTextView.setText(sb.append(C70982a.m125335a(e2, resources)).toString());
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) m134337a(R.id.cxl);
        if (e != null) {
            urlModel = e.mo58663f();
        } else {
            urlModel = null;
        }
        C84402a.m145169a(simpleDraweeView, urlModel, 27, 27);
        C84402a.m145165a((SimpleDraweeView) m134337a(R.id.cna), 2131232312);
        if (Build.VERSION.SDK_INT >= 21) {
            drawable = getResources().getDrawable(2131232303, null);
            C89219l.m154716b(drawable, "");
        } else {
            drawable = getResources().getDrawable(2131232303);
            C89219l.m154716b(drawable, "");
        }
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        ((TuxTextView) m134337a(R.id.erm)).setCompoundDrawables(drawable, null, null, null);
        TuxTextView tuxTextView2 = (TuxTextView) m134337a(R.id.erm);
        C89219l.m154716b(tuxTextView2, "");
        StringBuilder sb2 = new StringBuilder();
        Context context4 = getContext();
        C89219l.m154716b(context4, "");
        tuxTextView2.setText(sb2.append(C70982a.m125334a(context4, C63244g.m114602a().mo73255A().mo93906e())).toString());
        MethodCollector.m26664o(6640);
    }

    public /* synthetic */ C76747d(Context context, byte b) {
        this(context);
    }
}
