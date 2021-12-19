package com.p2082ss.android.ugc.aweme.commerce_sticker_impl.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.p2479ck.C36131u;
import com.p2082ss.android.ugc.aweme.sticker.model.C75441c;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commerce_sticker_impl.view.CommerceStickerDetailAuthorLayout */
public final class CommerceStickerDetailAuthorLayout extends FrameLayout {

    /* renamed from: a */
    private HashMap f88806a;

    static {
        Covode.recordClassIndex(44983);
    }

    public CommerceStickerDetailAuthorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: a */
    private View m75800a(int i) {
        if (this.f88806a == null) {
            this.f88806a = new HashMap();
        }
        View view = (View) this.f88806a.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f88806a.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final boolean mo65434a(C75441c cVar) {
        String adOwnerName;
        setVisibility(8);
        LinearLayout linearLayout = (LinearLayout) m75800a(R.id.cz);
        C89219l.m154716b(linearLayout, "");
        linearLayout.setVisibility(8);
        if (cVar == null || (adOwnerName = cVar.getAdOwnerName()) == null || adOwnerName.length() == 0) {
            return false;
        }
        C39162r.m79460a("show_aduser_head", new C33744d().mo59983a("enter_from", "prop_page").mo59983a("to_user_id", cVar.getAdOwnerId()).mo59983a("prop_id", cVar.getId()).f79943a);
        setVisibility(0);
        LinearLayout linearLayout2 = (LinearLayout) m75800a(R.id.cz);
        C89219l.m154716b(linearLayout2, "");
        linearLayout2.setVisibility(0);
        TuxTextView tuxTextView = (TuxTextView) m75800a(R.id.cy);
        if (tuxTextView != null) {
            tuxTextView.setText(adOwnerName);
        }
        TuxTextView tuxTextView2 = (TuxTextView) m75800a(R.id.cy);
        if (tuxTextView2 != null) {
            tuxTextView2.setOnClickListener(new View$OnClickListenerC37580a(this, cVar));
        }
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.commerce_sticker_impl.view.CommerceStickerDetailAuthorLayout$a */
    static final class View$OnClickListenerC37580a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CommerceStickerDetailAuthorLayout f88807a;

        /* renamed from: b */
        final /* synthetic */ C75441c f88808b;

        static {
            Covode.recordClassIndex(44984);
        }

        View$OnClickListenerC37580a(CommerceStickerDetailAuthorLayout commerceStickerDetailAuthorLayout, C75441c cVar) {
            this.f88807a = commerceStickerDetailAuthorLayout;
            this.f88808b = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C39162r.m79460a("click_aduser_head", new C33744d().mo59983a("enter_from", "prop_page").mo59983a("to_user_id", this.f88808b.getAdOwnerId()).mo59983a("prop_id", this.f88808b.getId()).f79943a);
            C39162r.m79460a("enter_personal_detail", new C33744d().mo59983a("enter_from", "prop_page").mo59983a("to_user_id", this.f88808b.getAdOwnerId()).mo59983a("prop_id", this.f88808b.getId()).f79943a);
            SmartRouter.buildRoute(this.f88807a.getContext(), C36131u.m73602a("aweme://user/profile/" + this.f88808b.getAdOwnerId()).mo63248a("sec_user_id", this.f88808b.getSecAdOwnerId()).mo63249a()).open();
        }
    }

    private /* synthetic */ CommerceStickerDetailAuthorLayout(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private CommerceStickerDetailAuthorLayout(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(908);
        C1764a.m5927a(LayoutInflater.from(context), R.layout.r0, this, true);
        MethodCollector.m26664o(908);
    }
}
