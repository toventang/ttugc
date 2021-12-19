package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.p3104ui.view;

import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.core.content.C0643b;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17301b;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17303d;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.data.model.C54006a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.p3103a.AbstractC54002g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.p3103a.EnumC54001f;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55099j;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55185ag;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.ui.view.a */
public final class C54072a {
    static {
        Covode.recordClassIndex(63748);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.ui.view.a$a */
    public static final class C54073a implements AbstractC54002g {

        /* renamed from: a */
        final /* synthetic */ GroupChatBlockedView f123925a;

        static {
            Covode.recordClassIndex(63749);
        }

        public C54073a(GroupChatBlockedView groupChatBlockedView) {
            this.f123925a = groupChatBlockedView;
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.ui.view.a$a$a */
        public static final class C54074a extends ClickableSpan {

            /* renamed from: a */
            final /* synthetic */ C54006a f123926a;

            /* renamed from: b */
            final /* synthetic */ int f123927b;

            static {
                Covode.recordClassIndex(63750);
            }

            public final void onClick(View view) {
                C89219l.m154721d(view, "");
                C55099j.f126093b.mo92008b(this.f123926a.getUid());
                C55185ag.m100886a(this.f123926a.getUid());
            }

            public final void updateDrawState(TextPaint textPaint) {
                C89219l.m154721d(textPaint, "");
                textPaint.setColor(this.f123927b);
                textPaint.setTypeface(C17301b.m32033a().mo27611a(C17303d.f41573g));
                textPaint.setUnderlineText(false);
            }

            C54074a(C54006a aVar, int i) {
                this.f123926a = aVar;
                this.f123927b = i;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.p3103a.AbstractC54002g
        /* renamed from: a */
        public final void mo91093a(C54006a aVar, EnumC54001f fVar) {
            C89219l.m154721d(aVar, "");
            C89219l.m154721d(fVar, "");
            if (C54076b.f123929a[fVar.ordinal()] == 1) {
                String displayName = aVar.getDisplayName();
                if (displayName == null) {
                    displayName = "";
                }
                String string = this.f123925a.getContext().getString(R.string.c65, displayName);
                C89219l.m154716b(string, "");
                SpannableString spannableString = new SpannableString(string);
                int a = C89361p.m154888a((CharSequence) string, displayName, 0, false, 6);
                spannableString.setSpan(new C54074a(aVar, C0643b.m2378c(this.f123925a.getContext(), R.color.bx)), a, displayName.length() + a, 34);
                TuxTextView tuxTextView = (TuxTextView) this.f123925a.mo9603b(R.id.ev5);
                tuxTextView.setMovementMethod(LinkMovementMethod.getInstance());
                tuxTextView.setHighlightColor(C0643b.m2378c(tuxTextView.getContext(), R.color.c9));
                tuxTextView.setText(spannableString);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.ui.view.a$b */
    public static final class View$OnClickListenerC54075b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f123928a;

        static {
            Covode.recordClassIndex(63751);
        }

        public View$OnClickListenerC54075b(AbstractC89171a aVar) {
            this.f123928a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f123928a.invoke();
        }
    }
}
