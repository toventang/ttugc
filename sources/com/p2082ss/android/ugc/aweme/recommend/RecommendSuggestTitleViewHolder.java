package com.p2082ss.android.ugc.aweme.recommend;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.following.p3002a.C51107f;
import com.p2082ss.android.ugc.aweme.music.p3481ui.C61156d;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.recommend.RecommendSuggestTitleViewHolder */
public final class RecommendSuggestTitleViewHolder extends JediSimpleViewHolder<C51107f> implements AbstractC33974au {

    /* renamed from: f */
    public final ImageView f149729f;

    /* renamed from: g */
    private final TextView f149730g;

    /* renamed from: j */
    private final Context f149731j;

    static {
        Covode.recordClassIndex(78159);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /* renamed from: a */
    public final /* synthetic */ void mo33817a(C51107f fVar) {
        C51107f fVar2 = fVar;
        C89219l.m154721d(fVar2, "");
        this.f149730g.setText(fVar2.f117932b);
        this.f149729f.setOnClickListener(new View$OnClickListenerC66606a(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.RecommendSuggestTitleViewHolder$a */
    static final class View$OnClickListenerC66606a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RecommendSuggestTitleViewHolder f149732a;

        static {
            Covode.recordClassIndex(78160);
        }

        View$OnClickListenerC66606a(RecommendSuggestTitleViewHolder recommendSuggestTitleViewHolder) {
            this.f149732a = recommendSuggestTitleViewHolder;
        }

        /* renamed from: com.ss.android.ugc.aweme.recommend.RecommendSuggestTitleViewHolder$a$a */
        public static final class C66607a extends ClickableSpan {

            /* renamed from: a */
            final /* synthetic */ Dialog f149733a;

            /* renamed from: b */
            final /* synthetic */ View$OnClickListenerC66606a f149734b;

            static {
                Covode.recordClassIndex(78161);
            }

            public final void onClick(View view) {
                C89219l.m154721d(view, "");
                Dialog dialog = this.f149733a;
                if (dialog != null && dialog.isShowing()) {
                    this.f149733a.dismiss();
                }
                SmartRouter.buildRoute(this.f149734b.f149732a.f149729f.getContext(), "//privacy/suggest_account").withParam("enter_from", "following_list").withParam("previous_page", "personal_homepage").withParam("is_rec", 1).open();
            }

            public final void updateDrawState(TextPaint textPaint) {
                C89219l.m154721d(textPaint, "");
                Context context = this.f149734b.f149732a.f149729f.getContext();
                C89219l.m154716b(context, "");
                textPaint.setColor(context.getResources().getColor(R.color.bx));
                textPaint.setUnderlineText(false);
            }

            C66607a(Dialog dialog, View$OnClickListenerC66606a aVar) {
                this.f149733a = dialog;
                this.f149734b = aVar;
            }
        }

        public final void onClick(View view) {
            MethodCollector.m26663i(9111);
            ClickAgent.onClick(view);
            if (this.f149732a.f149729f.getContext() != null) {
                View inflate = LayoutInflater.from(this.f149732a.f149729f.getContext()).inflate(R.layout.apg, (ViewGroup) null);
                View findViewById = inflate.findViewById(R.id.ew2);
                C89219l.m154716b(findViewById, "");
                TextView textView = (TextView) findViewById;
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                Context context = this.f149732a.f149729f.getContext();
                C89219l.m154716b(context, "");
                textView.setHighlightColor(context.getResources().getColor(R.color.c9));
                Context context2 = this.f149732a.f149729f.getContext();
                if (context2 == null) {
                    C89219l.m154715b();
                    NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.app.Activity");
                    MethodCollector.m26664o(9111);
                    throw nullPointerException;
                }
                C89219l.m154716b(inflate, "");
                Dialog a = C61156d.m110775a((Activity) context2, inflate, R.style.v8);
                Context context3 = this.f149732a.f149729f.getContext();
                C89219l.m154716b(context3, "");
                String string = context3.getResources().getString(R.string.cv8);
                C89219l.m154716b(string, "");
                Context context4 = this.f149732a.f149729f.getContext();
                C89219l.m154716b(context4, "");
                String string2 = context4.getResources().getString(R.string.c_e, string);
                C89219l.m154716b(string2, "");
                int a2 = C89361p.m154888a((CharSequence) string2, string, 0, false, 6);
                int length = string.length() + a2;
                SpannableString spannableString = new SpannableString(string2);
                if (!TextUtils.isEmpty(string2) && !TextUtils.isEmpty(string) && a2 >= 0) {
                    spannableString.setSpan(new C66607a(a, this), a2, length, 34);
                    spannableString.setSpan(new StyleSpan(1), a2, length, 34);
                }
                textView.setText(spannableString);
                a.show();
            }
            C39162r.m79460a("click_suggested_account_information", new C33744d().mo59983a("previous_page", "personal_homepage").mo59983a("enter_from", "following_list").f79943a);
            MethodCollector.m26664o(9111);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecommendSuggestTitleViewHolder(View view, Context context) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(context, "");
        this.f149731j = context;
        View findViewById = view.findViewById(R.id.f66);
        C89219l.m154716b(findViewById, "");
        this.f149730g = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.bkm);
        C89219l.m154716b(findViewById2, "");
        this.f149729f = (ImageView) findViewById2;
    }
}
