package com.p2082ss.android.ugc.aweme.story.edit.p4028a;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p2082ss.android.ugc.aweme.account.model.AbstractC32846a;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.editSticker.interact.view.AbstractC45921f;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.p3810c.C70982a;
import com.p2082ss.android.ugc.tools.p4340c.C84402a;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.edit.a.c */
public final class C76746c extends FrameLayout implements AbstractC45921f {

    /* renamed from: a */
    private final View f172257a;

    /* renamed from: b */
    private HashMap f172258b;

    static {
        Covode.recordClassIndex(89742);
    }

    /* renamed from: a */
    private View m134333a(int i) {
        if (this.f172258b == null) {
            this.f172258b = new HashMap();
        }
        View view = (View) this.f172258b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f172258b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.view.AbstractC45921f
    /* renamed from: a */
    public final void mo77332a(boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.view.AbstractC45921f
    /* renamed from: b */
    public final void mo77333b(boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.view.AbstractC45921f
    public final View getContentView() {
        return this.f172257a;
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.view.AbstractC45921f
    /* renamed from: c */
    public final void mo77334c(boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        setVisibility(i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C76746c(Context context) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        UrlModel urlModel = null;
        MethodCollector.m26663i(5517);
        this.f172257a = this;
        addView(C1764a.m5927a(LayoutInflater.from(context), R.layout.bj_, this, false));
        AbstractC32846a e = C63244g.m114602a().mo73255A().mo93906e();
        if ((e != null ? e.mo58663f() : urlModel) != null) {
            UrlModel f = e.mo58663f();
            Context context2 = getContext();
            C89219l.m154716b(context2, "");
            int a = (int) C84912r.m145930a(context2, 49.0f);
            Context context3 = getContext();
            C89219l.m154716b(context3, "");
            C84402a.m145169a((SimpleDraweeView) m134333a(R.id.bsa), f, a, (int) C84912r.m145930a(context3, 49.0f));
        } else {
            C84402a.m145165a((SimpleDraweeView) m134333a(R.id.bsa), 2131232314);
        }
        TuxTextView tuxTextView = (TuxTextView) m134333a(R.id.ert);
        if (tuxTextView != null) {
            AbstractC32846a e2 = C63244g.m114602a().mo73255A().mo93906e();
            Resources resources = getResources();
            C89219l.m154716b(resources, "");
            tuxTextView.setText(C70982a.m125335a(e2, resources));
            MethodCollector.m26664o(5517);
            return;
        }
        MethodCollector.m26664o(5517);
    }

    public /* synthetic */ C76746c(Context context, byte b) {
        this(context);
    }
}
