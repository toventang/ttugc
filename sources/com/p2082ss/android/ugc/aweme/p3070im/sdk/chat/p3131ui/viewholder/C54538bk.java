package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.p1399im.core.proto.ReferenceInfo;
import com.bytedance.tux.p1722h.C23155d;
import com.bytedance.tux.tag.C23316a;
import com.p2082ss.android.ugc.aweme.emoji.p2906i.p2913c.C46579b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.ReferenceInfoHint;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.ShareAwemeContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.TextContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.reply.p3123ui.ReplyMessageLayout;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.C53701d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3136d.C54438a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55231t;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.p3184b.C55193c;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3252c.C56205f;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.bk */
public class C54538bk extends AbstractC54482a<TextContent> {

    /* renamed from: C */
    public static final C54539a f124991C = new C54539a((byte) 0);

    /* renamed from: A */
    public ReplyMessageLayout f124992A;

    /* renamed from: B */
    public ReplyMessageLayout f124993B;

    /* renamed from: a */
    private TextView f124994a;

    /* renamed from: x */
    public Barrier f124995x;

    /* renamed from: y */
    public View f124996y;

    /* renamed from: z */
    public View.OnClickListener f124997z;

    static {
        Covode.recordClassIndex(64249);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.bk$a */
    public static final class C54539a {
        static {
            Covode.recordClassIndex(64250);
        }

        private C54539a() {
        }

        public /* synthetic */ C54539a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C23316a m100000a(Context context, String str) {
            int i;
            int i2;
            C89219l.m154721d(context, "");
            C23316a aVar = new C23316a(context);
            if (str == null) {
                str = "";
            }
            aVar.mo37996a(str);
            aVar.mo37993a();
            aVar.mo37995a(Integer.valueOf((int) R.raw.icon_play_fill));
            Integer a = C23155d.m43641a(context, R.attr.h);
            int i3 = 0;
            if (a != null) {
                i = a.intValue();
            } else {
                i = 0;
            }
            aVar.mo38000e(i);
            Integer a2 = C23155d.m43641a(context, R.attr.bj);
            if (a2 != null) {
                i2 = a2.intValue();
            } else {
                i2 = 0;
            }
            aVar.mo37994a(i2);
            Integer a3 = C23155d.m43641a(context, R.attr.bj);
            if (a3 != null) {
                i3 = a3.intValue();
            }
            aVar.mo37997b(i3);
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            aVar.f54754a = C89241a.m154730a(TypedValue.applyDimension(1, 4.0f, system.getDisplayMetrics()));
            return aVar;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54482a
    /* renamed from: a */
    public void mo91007a() {
        Drawable background;
        super.mo91007a();
        this.f124994a = (TextView) mo91563a(R.id.cmk);
        this.f124996y = (View) mo91563a(R.id.acq);
        this.f124992A = (ReplyMessageLayout) mo91563a(R.id.di7);
        this.f124993B = (ReplyMessageLayout) mo91563a(R.id.di8);
        Barrier barrier = (Barrier) mo91563a(R.id.acu);
        this.f124995x = barrier;
        if (barrier != null) {
            barrier.setReferencedIds(new int[]{R.id.fa1, R.id.di8, R.id.acq, R.id.cd2});
        }
        View view = this.f124996y;
        if (view != null) {
            this.f124819o = C54438a.C54439a.m99780a(view);
        }
        if (this.f124819o != null && (background = this.f124819o.f124697c.getBackground()) != null) {
            int i = Build.VERSION.SDK_INT;
            background.setAutoMirrored(true);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54482a
    /* renamed from: a */
    public void mo91564a(View.OnClickListener onClickListener) {
        C89219l.m154721d(onClickListener, "");
        super.mo91564a(onClickListener);
        this.f124997z = onClickListener;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54538bk(View view, EnumC53772b bVar) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(bVar, "");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C23316a mo91626a(ReferenceInfo referenceInfo, Context context) {
        BaseContent baseContent;
        C89219l.m154721d(referenceInfo, "");
        C89219l.m154721d(context, "");
        ReferenceInfoHint a = C55193c.m100906a(referenceInfo);
        if (a != null) {
            baseContent = a.getParsedContent();
        } else {
            baseContent = null;
        }
        if (!(baseContent instanceof ShareAwemeContent)) {
            baseContent = null;
        }
        ShareAwemeContent shareAwemeContent = (ShareAwemeContent) baseContent;
        if (shareAwemeContent != null) {
            return C54539a.m100000a(context, shareAwemeContent.getAuthorUsername());
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54482a
    /* renamed from: a */
    public final void mo91568a(C19538ai aiVar, ReferenceInfo referenceInfo) {
        C89219l.m154721d(aiVar, "");
        ReplyMessageLayout replyMessageLayout = this.f124992A;
        if (replyMessageLayout != null) {
            replyMessageLayout.setVisibility(8);
        }
        ReplyMessageLayout replyMessageLayout2 = this.f124993B;
        if (replyMessageLayout2 != null) {
            replyMessageLayout2.setVisibility(8);
        }
        if (referenceInfo == null) {
            return;
        }
        if (C56205f.m102121a() == 1 || C56205f.m102121a() == 3) {
            ReplyMessageLayout replyMessageLayout3 = this.f124992A;
            if (replyMessageLayout3 != null) {
                replyMessageLayout3.setVisibility(0);
            }
            ReplyMessageLayout replyMessageLayout4 = this.f124992A;
            if (replyMessageLayout4 != null) {
                View view = ((AbstractC54482a) this).itemView;
                C89219l.m154716b(view, "");
                Context context = view.getContext();
                C89219l.m154716b(context, "");
                replyMessageLayout4.mo91389a(aiVar, referenceInfo, mo91626a(referenceInfo, context), this.f124997z);
            }
        } else if (C56205f.m102121a() == 2 || C56205f.m102121a() == 4) {
            ReplyMessageLayout replyMessageLayout5 = this.f124993B;
            if (replyMessageLayout5 != null) {
                replyMessageLayout5.setVisibility(0);
            }
            ReplyMessageLayout replyMessageLayout6 = this.f124993B;
            if (replyMessageLayout6 != null) {
                replyMessageLayout6.mo91389a(aiVar, referenceInfo, null, this.f124997z);
            }
        }
    }

    /* renamed from: a */
    public void mo91008a(C19538ai aiVar, C19538ai aiVar2, TextContent textContent, int i) {
        C89219l.m154721d(aiVar, "");
        super.mo91008a(aiVar, aiVar2, (BaseContent) textContent, i);
        if (textContent != null && textContent.getText() != null) {
            long length = (long) textContent.getText().length();
            TextView textView = this.f124994a;
            if (textView != null) {
                textView.setText(textContent.getText());
            }
            if (length <= 1024) {
                C46579b.m89899a(this.f124994a);
            }
            if (textContent.isDefault()) {
                View view = ((AbstractC54482a) this).itemView;
                C89219l.m154716b(view, "");
                int c = C0643b.m2378c(view.getContext(), R.color.bh);
                TextView textView2 = this.f124994a;
                String text = textContent.getText();
                if (TextUtils.isEmpty(text)) {
                    textView2.setText("");
                } else {
                    SpannableString spannableString = new SpannableString(text);
                    String string = C17867d.m33078a().getString(R.string.cdi);
                    if (text.contains(string)) {
                        C53701d.C53704b bVar = new C53701d.C53704b(c);
                        int indexOf = text.indexOf(string);
                        spannableString.setSpan(bVar, indexOf, string.length() + indexOf, 33);
                    }
                    textView2.setText(spannableString);
                }
            }
            this.f124819o.mo91505a(50331648, 1);
            this.f124819o.mo91505a(50331649, Boolean.valueOf(C55231t.m101002b(aiVar, textContent)));
        }
    }
}
