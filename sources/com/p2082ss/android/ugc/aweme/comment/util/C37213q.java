package com.p2082ss.android.ugc.aweme.comment.util;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartCircleImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.google.gson.C28027t;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.anchor.C34671a;
import com.p2082ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.util.q */
public final class C37213q {

    /* renamed from: a */
    public static final C37213q f87738a = new C37213q();

    private C37213q() {
    }

    static {
        Covode.recordClassIndex(44568);
    }

    /* renamed from: a */
    private static List<UrlModel> m75203a(String str) {
        if (str == null) {
            return null;
        }
        try {
            C37212p pVar = (C37212p) C80342dg.m139300a().mo46670a(str, C37212p.class);
            if (pVar != null) {
                return pVar.getIconUrlList();
            }
            return null;
        } catch (C28027t e) {
            C51423a.m95790a((Throwable) e);
            return null;
        }
    }

    /* renamed from: a */
    public static String m75202a(AnchorCommonStruct anchorCommonStruct) {
        boolean z;
        if (anchorCommonStruct == null) {
            return "";
        }
        String extra = anchorCommonStruct.getExtra();
        if (extra == null || extra.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject(anchorCommonStruct.getExtra());
            if (jSONObject.optLong("linked_effect_id", 0) > 0) {
                return String.valueOf(jSONObject.optLong("linked_effect_id"));
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: b */
    public static Integer m75206b(AnchorCommonStruct anchorCommonStruct) {
        boolean z;
        if (anchorCommonStruct != null) {
            String extra = anchorCommonStruct.getExtra();
            if (extra == null || extra.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                try {
                    JSONObject jSONObject = new JSONObject(anchorCommonStruct.getExtra());
                    if (jSONObject.optInt("ngo_id", 0) > 0) {
                        return Integer.valueOf(jSONObject.optInt("ngo_id"));
                    }
                } catch (Exception unused) {
                }
            }
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.comment.util.q$a */
    public static final class View$OnClickListenerC37214a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Aweme f87739a;

        /* renamed from: b */
        final /* synthetic */ String f87740b;

        /* renamed from: c */
        final /* synthetic */ View f87741c;

        /* renamed from: d */
        final /* synthetic */ String f87742d;

        /* renamed from: e */
        final /* synthetic */ AnchorCommonStruct f87743e;

        static {
            Covode.recordClassIndex(44569);
        }

        View$OnClickListenerC37214a(Aweme aweme, String str, View view, String str2, AnchorCommonStruct anchorCommonStruct) {
            this.f87739a = aweme;
            this.f87740b = str;
            this.f87741c = view;
            this.f87742d = str2;
            this.f87743e = anchorCommonStruct;
        }

        public final void onClick(View view) {
            int i;
            ClickAgent.onClick(view);
            Aweme aweme = this.f87739a;
            if (aweme != null && !TextUtils.isEmpty(aweme.getAid())) {
                C89219l.m154716b(view, "");
                SmartRoute withParam = SmartRouter.buildRoute(view.getContext(), "aweme://donation/pannel").withParam("enter_method", "comment_click").withParam("enter_from", this.f87740b);
                View view2 = this.f87741c;
                if (view2 != null) {
                    i = view2.getHeight();
                } else {
                    i = 0;
                }
                withParam.withParam("height", i).withParam("log_pb", this.f87742d).withParam("aweme_id", this.f87739a.getAid()).withParam("sticker_id", C37213q.m75202a(this.f87743e)).withParam("ngo_id", C37213q.m75206b(this.f87743e)).open();
            }
        }
    }

    /* renamed from: a */
    private static void m75204a(SmartCircleImageView smartCircleImageView, SmartCircleImageView smartCircleImageView2, TextView textView) {
        smartCircleImageView.setImageResource(2131231199);
        smartCircleImageView2.setVisibility(8);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ((ConstraintLayout.C0547a) layoutParams).f2267e = R.id.o0;
        ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
        Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ((ConstraintLayout.C0547a) layoutParams2).f2278p = R.id.o0;
    }

    /* renamed from: a */
    public static void m75205a(String str, String str2, View view, Aweme aweme, View view2) {
        List<UrlModel> a;
        C89219l.m154721d(view, "");
        SmartCircleImageView smartCircleImageView = (SmartCircleImageView) view.findViewById(R.id.o0);
        SmartCircleImageView smartCircleImageView2 = (SmartCircleImageView) view.findViewById(R.id.o1);
        TextView textView = (TextView) view.findViewById(R.id.ajd);
        List<AnchorCommonStruct> a2 = C34671a.f81927a.mo61326a(aweme);
        if (a2 == null) {
            C89219l.m154715b();
        }
        AnchorCommonStruct anchorCommonStruct = a2.get(0);
        if (anchorCommonStruct == null) {
            C89219l.m154715b();
        }
        if (TextUtils.isEmpty(anchorCommonStruct.getExtra()) || (a = m75203a(anchorCommonStruct.getExtra())) == null || a.size() <= 1) {
            C89219l.m154716b(smartCircleImageView, "");
            C89219l.m154716b(smartCircleImageView2, "");
            C89219l.m154716b(textView, "");
            m75204a(smartCircleImageView, smartCircleImageView2, textView);
        } else {
            C20766v a3 = C20761r.m39060a(C34735v.m70965a(a.get(0))).mo34179a("CommentDonation");
            a3.f49115l = R.color.f;
            a3.f49092E = smartCircleImageView;
            a3.mo34186c();
            C20766v a4 = C20761r.m39060a(C34735v.m70965a(a.get(1))).mo34179a("CommentDonation");
            a4.f49115l = R.color.f;
            a4.f49092E = smartCircleImageView2;
            a4.mo34186c();
            C89219l.m154716b(smartCircleImageView2, "");
            smartCircleImageView2.setVisibility(0);
            C89219l.m154716b(textView, "");
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ((ConstraintLayout.C0547a) layoutParams).f2267e = R.id.o1;
            ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
            Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ((ConstraintLayout.C0547a) layoutParams2).f2278p = R.id.o1;
        }
        textView.setLayoutParams(textView.getLayoutParams());
        String keyword = anchorCommonStruct.getKeyword();
        if (keyword == null) {
            keyword = "";
        }
        textView.setText(keyword);
        view.setOnClickListener(new View$OnClickListenerC37214a(aweme, str2, view2, str, anchorCommonStruct));
    }
}
