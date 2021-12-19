package com.p2082ss.android.ugc.aweme.tcm.impl.view;

import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.content.C0643b;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.ies.dmt.p1194ui.widget.DmtTextView;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.tcm.impl.view.TcmCheckLayout */
public final class TcmCheckLayout extends FrameLayout {
    static {
        Covode.recordClassIndex(90842);
    }

    public TcmCheckLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: com.ss.android.ugc.aweme.tcm.impl.view.TcmCheckLayout$a */
    static final class View$OnClickListenerC77780a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TcmCheckLayout f174414a;

        static {
            Covode.recordClassIndex(90843);
        }

        View$OnClickListenerC77780a(TcmCheckLayout tcmCheckLayout) {
            this.f174414a = tcmCheckLayout;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Context context = this.f174414a.getContext();
            C89219l.m154716b(context, "");
            String string = context.getResources().getString(R.string.h7m);
            C89219l.m154716b(string, "");
            Context context2 = this.f174414a.getContext();
            C89219l.m154716b(context2, "");
            String string2 = context2.getResources().getString(R.string.gcf);
            C89219l.m154716b(string2, "");
            Context context3 = this.f174414a.getContext();
            C89219l.m154716b(context3, "");
            String string3 = context3.getResources().getString(R.string.gas);
            C89219l.m154716b(string3, "");
            SpannableString spannableString = new SpannableString(string);
            int a = C89361p.m154888a((CharSequence) string, string2, 0, false, 6);
            int length = string2.length() + a;
            int a2 = C89361p.m154888a((CharSequence) string, string3, 0, false, 6);
            int length2 = string3.length() + a2;
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2) && a >= 0 && a < string.length()) {
                spannableString.setSpan(new StyleSpan(1), a, length, 17);
                spannableString.setSpan(new ClickableSpan(this, "https://ads.tiktok.com/help/article?aid=6684149081637388293") {
                    /* class com.p2082ss.android.ugc.aweme.tcm.impl.view.TcmCheckLayout.View$OnClickListenerC77780a.C777811 */

                    /* renamed from: a */
                    final /* synthetic */ View$OnClickListenerC77780a f174415a;

                    static {
                        Covode.recordClassIndex(90844);
                    }

                    public final void onClick(View view) {
                        C89219l.m154721d(view, "");
                        SmartRouter.buildRoute(this.f174415a.f174414a.getContext(), "aweme://webview/").withParam("url", "https://ads.tiktok.com/help/article?aid=6684149081637388293").open();
                    }

                    public final void updateDrawState(TextPaint textPaint) {
                        C89219l.m154721d(textPaint, "");
                        textPaint.setColor(C0643b.m2378c(this.f174415a.f174414a.getContext(), R.color.a2));
                        textPaint.setUnderlineText(false);
                    }

                    {
                        this.f174415a = r1;
                    }
                }, a, length, 17);
            }
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string3) && a2 >= 0 && a2 < string.length()) {
                spannableString.setSpan(new StyleSpan(1), a2, length2, 17);
                spannableString.setSpan(new ClickableSpan(this, "https://www.tiktok.com/community-guidelines?lang=en") {
                    /* class com.p2082ss.android.ugc.aweme.tcm.impl.view.TcmCheckLayout.View$OnClickListenerC77780a.C777822 */

                    /* renamed from: a */
                    final /* synthetic */ View$OnClickListenerC77780a f174417a;

                    static {
                        Covode.recordClassIndex(90845);
                    }

                    public final void onClick(View view) {
                        C89219l.m154721d(view, "");
                        SmartRouter.buildRoute(this.f174417a.f174414a.getContext(), "aweme://webview/").withParam("url", "https://www.tiktok.com/community-guidelines?lang=en").open();
                    }

                    public final void updateDrawState(TextPaint textPaint) {
                        C89219l.m154721d(textPaint, "");
                        textPaint.setColor(C0643b.m2378c(this.f174417a.f174414a.getContext(), R.color.a2));
                        textPaint.setUnderlineText(false);
                    }

                    {
                        this.f174417a = r1;
                    }
                }, a2, length2, 17);
            }
            DmtTextView dmtTextView = new DmtTextView(this.f174414a.getContext());
            dmtTextView.setText(spannableString);
            dmtTextView.setMovementMethod(new LinkMovementMethod());
            dmtTextView.setGravity(17);
            C17197a.C17200a aVar = new C17197a.C17200a(this.f174414a.getContext());
            aVar.f41059E = true;
            aVar.f41070a = null;
            aVar.f41064J = dmtTextView;
            Context context4 = this.f174414a.getContext();
            C89219l.m154716b(context4, "");
            aVar.mo27192a(context4.getResources().getString(R.string.bx), (DialogInterface.OnClickListener) DialogInterface$OnClickListenerC777833.f174419a, false).mo27193a().mo27185c();
            C39162r.m79460a("show_video_review_detail", new C33744d().f79943a);
        }
    }

    private /* synthetic */ TcmCheckLayout(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private TcmCheckLayout(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(12009);
        MethodCollector.m26664o(12009);
    }
}
