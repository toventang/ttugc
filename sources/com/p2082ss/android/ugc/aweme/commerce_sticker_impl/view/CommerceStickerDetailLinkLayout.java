package com.p2082ss.android.ugc.aweme.commerce_sticker_impl.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.commerce_sticker_api.p2529a.AbstractC37569a;
import com.p2082ss.android.ugc.aweme.commerce_sticker_impl.p2531a.C37572a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.sticker.model.C75441c;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commerce_sticker_impl.view.CommerceStickerDetailLinkLayout */
public final class CommerceStickerDetailLinkLayout extends FrameLayout {

    /* renamed from: a */
    private HashMap f88811a;

    static {
        Covode.recordClassIndex(44987);
    }

    public CommerceStickerDetailLinkLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: a */
    public final View mo65438a(int i) {
        if (this.f88811a == null) {
            this.f88811a = new HashMap();
        }
        View view = (View) this.f88811a.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f88811a.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: com.ss.android.ugc.aweme.commerce_sticker_impl.view.CommerceStickerDetailLinkLayout$a */
    static final class View$OnClickListenerC37581a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CommerceStickerDetailLinkLayout f88812a;

        /* renamed from: b */
        final /* synthetic */ C75441c f88813b;

        static {
            Covode.recordClassIndex(44988);
        }

        View$OnClickListenerC37581a(CommerceStickerDetailLinkLayout commerceStickerDetailLinkLayout, C75441c cVar) {
            this.f88812a = commerceStickerDetailLinkLayout;
            this.f88813b = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C39162r.m79460a("click_link", new C33744d().mo59983a("enter_from", "prop_page").mo59983a(StringSet.type, "web_link").mo59983a("prop_id", this.f88813b.getId()).f79943a);
            AbstractC37569a a = C37572a.m75786a();
            if (a != null) {
                Context context = this.f88812a.getContext();
                C89219l.m154716b(context, "");
                a.mo65411a(context, this.f88813b.getDetailOpenUrl(), this.f88813b.getDetailWebUrl(), this.f88813b.getDetailWebUrlTitle(), "click_variable_button", this.f88813b.getId());
            }
        }
    }

    private /* synthetic */ CommerceStickerDetailLinkLayout(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private CommerceStickerDetailLinkLayout(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(747);
        C1764a.m5927a(LayoutInflater.from(context), R.layout.r6, this, true);
        MethodCollector.m26664o(747);
    }
}
