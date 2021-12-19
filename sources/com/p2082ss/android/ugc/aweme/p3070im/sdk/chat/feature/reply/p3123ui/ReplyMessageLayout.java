package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.reply.p3123ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Animatable;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.p1399im.core.proto.MessageStatus;
import com.bytedance.p1399im.core.proto.ReferenceInfo;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.tag.C23316a;
import com.facebook.imagepipeline.p1885j.AbstractC24457f;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.ReferenceInfoHint;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.ShareAwemeContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.p3083c.C53660b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55085g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.AbstractC55207e;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55197c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.p3184b.C55193c;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.ui.ReplyMessageLayout */
public final class ReplyMessageLayout extends LinearLayout {

    /* renamed from: a */
    private final AbstractC89244h f124394a;

    /* renamed from: b */
    private final AbstractC89244h f124395b;

    /* renamed from: c */
    private final AbstractC89244h f124396c;

    /* renamed from: d */
    private final AbstractC89244h f124397d;

    /* renamed from: e */
    private final boolean f124398e;

    /* renamed from: f */
    private final int f124399f;

    /* renamed from: g */
    private final int f124400g;

    /* renamed from: h */
    private final int f124401h;

    /* renamed from: i */
    private View.OnClickListener f124402i;

    /* renamed from: j */
    private CharSequence f124403j;

    static {
        Covode.recordClassIndex(64001);
    }

    public ReplyMessageLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private final TuxIconView getCloseButton() {
        return (TuxIconView) this.f124397d.getValue();
    }

    private final CardView getQuoteLine() {
        return (CardView) this.f124395b.getValue();
    }

    private final TextView getTextView() {
        return (TextView) this.f124396c.getValue();
    }

    public final RemoteImageView getVideoCover() {
        return (RemoteImageView) this.f124394a.getValue();
    }

    public final View.OnClickListener getCloseButtonOnClick() {
        return this.f124402i;
    }

    public final CharSequence getReplyText() {
        return this.f124403j;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.ui.ReplyMessageLayout$b */
    static final class C54307b extends AbstractC89220m implements AbstractC89171a<TuxIconView> {

        /* renamed from: a */
        final /* synthetic */ ReplyMessageLayout f124405a;

        static {
            Covode.recordClassIndex(64003);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54307b(ReplyMessageLayout replyMessageLayout) {
            super(0);
            this.f124405a = replyMessageLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxIconView invoke() {
            return this.f124405a.findViewById(R.id.a78);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.ui.ReplyMessageLayout$c */
    static final class C54308c extends AbstractC89220m implements AbstractC89171a<CardView> {

        /* renamed from: a */
        final /* synthetic */ ReplyMessageLayout f124406a;

        static {
            Covode.recordClassIndex(64004);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54308c(ReplyMessageLayout replyMessageLayout) {
            super(0);
            this.f124406a = replyMessageLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ CardView invoke() {
            return this.f124406a.findViewById(R.id.ddp);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.ui.ReplyMessageLayout$e */
    static final class C54310e extends AbstractC89220m implements AbstractC89171a<TextView> {

        /* renamed from: a */
        final /* synthetic */ ReplyMessageLayout f124408a;

        static {
            Covode.recordClassIndex(64006);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54310e(ReplyMessageLayout replyMessageLayout) {
            super(0);
            this.f124408a = replyMessageLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TextView invoke() {
            return this.f124408a.findViewById(R.id.dia);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.ui.ReplyMessageLayout$f */
    static final class C54311f extends AbstractC89220m implements AbstractC89171a<RemoteImageView> {

        /* renamed from: a */
        final /* synthetic */ ReplyMessageLayout f124409a;

        static {
            Covode.recordClassIndex(64007);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54311f(ReplyMessageLayout replyMessageLayout) {
            super(0);
            this.f124409a = replyMessageLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ RemoteImageView invoke() {
            return this.f124409a.findViewById(R.id.fc8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.ui.ReplyMessageLayout$d */
    public static final class C54309d implements AbstractC55207e {

        /* renamed from: a */
        final /* synthetic */ ReplyMessageLayout f124407a;

        static {
            Covode.recordClassIndex(64005);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.AbstractC55207e
        /* renamed from: a */
        public final void mo90228a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
        @Override // com.facebook.drawee.p1851c.AbstractC24203d
        public final /* synthetic */ void onFinalImageSet(String str, AbstractC24457f fVar, Animatable animatable) {
            mo90228a();
        }

        @Override // com.facebook.drawee.p1851c.AbstractC24203d
        public final void onIntermediateImageFailed(String str, Throwable th) {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object] */
        @Override // com.facebook.drawee.p1851c.AbstractC24203d
        public final /* bridge */ /* synthetic */ void onIntermediateImageSet(String str, AbstractC24457f fVar) {
        }

        @Override // com.facebook.drawee.p1851c.AbstractC24203d
        public final void onRelease(String str) {
        }

        @Override // com.facebook.drawee.p1851c.AbstractC24203d
        public final void onSubmit(String str, Object obj) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C54309d(ReplyMessageLayout replyMessageLayout) {
            this.f124407a = replyMessageLayout;
        }

        @Override // com.facebook.drawee.p1851c.AbstractC24203d
        public final void onFailure(String str, Throwable th) {
            this.f124407a.getVideoCover().setBackgroundResource(R.drawable.auu);
            if (th != null) {
                C56244a.m102187a("ReplyMessageLayout", th);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.ui.ReplyMessageLayout$a */
    static final class View$OnClickListenerC54306a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ReplyMessageLayout f124404a;

        static {
            Covode.recordClassIndex(64002);
        }

        View$OnClickListenerC54306a(ReplyMessageLayout replyMessageLayout) {
            this.f124404a = replyMessageLayout;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f124404a.performClick();
        }
    }

    public final void setCloseButtonOnClick(View.OnClickListener onClickListener) {
        int i;
        TuxIconView closeButton = getCloseButton();
        C89219l.m154716b(closeButton, "");
        if (onClickListener != null) {
            i = 0;
        } else {
            i = 8;
        }
        closeButton.setVisibility(i);
        getCloseButton().setOnClickListener(onClickListener);
        this.f124402i = onClickListener;
    }

    public final void setReplyText(CharSequence charSequence) {
        TextView textView = getTextView();
        if (!C89219l.m154714a(textView.getText(), charSequence)) {
            textView.setText(charSequence);
            textView.requestLayout();
        }
        this.f124403j = charSequence;
    }

    public final void setReplyMessage(C19538ai aiVar) {
        C89219l.m154721d(aiVar, "");
        m99601a(C55085g.m100751a(String.valueOf(aiVar.getSender()), aiVar.getSecSender()), aiVar, null, EnumC53772b.C53814f.m99071b(aiVar), null, true);
    }

    private /* synthetic */ ReplyMessageLayout(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ReplyMessageLayout(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        int i = 0;
        MethodCollector.m26663i(5486);
        this.f124394a = C89250i.m154773a((AbstractC89171a) new C54311f(this));
        this.f124395b = C89250i.m154773a((AbstractC89171a) new C54308c(this));
        this.f124396c = C89250i.m154773a((AbstractC89171a) new C54310e(this));
        this.f124397d = C89250i.m154773a((AbstractC89171a) new C54307b(this));
        LinearLayout.inflate(context, R.layout.a7l, this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.nw, R.attr.a8l, R.attr.a9m, R.attr.ac2});
        try {
            boolean z = obtainStyledAttributes.getBoolean(3, true);
            this.f124398e = z;
            int color = obtainStyledAttributes.getColor(1, -16777216);
            this.f124399f = color;
            int color2 = obtainStyledAttributes.getColor(2, -16777216);
            this.f124400g = color2;
            int color3 = obtainStyledAttributes.getColor(0, -16777216);
            this.f124401h = color3;
            obtainStyledAttributes.recycle();
            CardView quoteLine = getQuoteLine();
            quoteLine.setCardBackgroundColor(color);
            quoteLine.setVisibility(!z ? 8 : i);
            getCloseButton().setTintColor(color3);
            TextView textView = getTextView();
            textView.setTextColor(color2);
            textView.setOnClickListener(new View$OnClickListenerC54306a(this));
            MethodCollector.m26664o(5486);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            MethodCollector.m26664o(5486);
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo91389a(C19538ai aiVar, ReferenceInfo referenceInfo, C23316a aVar, View.OnClickListener onClickListener) {
        String str;
        String str2;
        BaseContent baseContent;
        BaseContent baseContent2;
        C89219l.m154721d(aiVar, "");
        C89219l.m154721d(referenceInfo, "");
        ReferenceInfoHint a = C55193c.m100906a(referenceInfo);
        if (a != null) {
            str = a.getRefmsg_uid();
        } else {
            str = null;
        }
        ReferenceInfoHint a2 = C55193c.m100906a(referenceInfo);
        if (a2 != null) {
            str2 = a2.getRefmsg_sec_uid();
        } else {
            str2 = null;
        }
        IMUser a3 = C55085g.m100751a(str, str2);
        ReferenceInfoHint a4 = C55193c.m100906a(referenceInfo);
        if (a4 != null) {
            baseContent = a4.getParsedContent();
        } else {
            baseContent = null;
        }
        if (referenceInfo.referenced_message_status == MessageStatus.DELETED) {
            String string = getContext().getString(R.string.cgi);
            C89219l.m154716b(string, "");
            setReplyText(string);
            RemoteImageView videoCover = getVideoCover();
            C89219l.m154716b(videoCover, "");
            videoCover.setVisibility(8);
        } else {
            m99601a(a3, aiVar, referenceInfo, baseContent, aVar, false);
        }
        ReferenceInfoHint a5 = C55193c.m100906a(referenceInfo);
        if (a5 != null) {
            baseContent2 = a5.getParsedContent();
        } else {
            baseContent2 = null;
        }
        if (!(baseContent2 instanceof ShareAwemeContent)) {
            baseContent2 = null;
        }
        ShareAwemeContent shareAwemeContent = (ShareAwemeContent) baseContent2;
        if (shareAwemeContent == null) {
            setOnClickListener(null);
        } else if (!shareAwemeContent.showQuoteHint()) {
            setTag(50331648, 50);
            setTag(67108864, shareAwemeContent.getItemId());
            setTag(134217728, referenceInfo.referenced_message_id);
            setOnClickListener(onClickListener);
        } else {
            setOnClickListener(null);
        }
    }

    /* renamed from: a */
    private final void m99601a(IMUser iMUser, C19538ai aiVar, ReferenceInfo referenceInfo, BaseContent baseContent, C23316a aVar, boolean z) {
        String str;
        if (C55197c.m100918a(iMUser)) {
            str = getContext().getString(R.string.cg8);
        } else if (iMUser == null || (str = iMUser.getDisplayName()) == null) {
            str = "";
        }
        C89219l.m154716b(str, "");
        RemoteImageView videoCover = getVideoCover();
        C89219l.m154716b(videoCover, "");
        int i = 8;
        String str2 = null;
        Long l = null;
        if (baseContent instanceof ShareAwemeContent) {
            ShareAwemeContent shareAwemeContent = (ShareAwemeContent) baseContent;
            if (!shareAwemeContent.showQuoteHint() && !z) {
                if (aVar == null) {
                    setReplyText(str + ':');
                    RemoteImageView videoCover2 = getVideoCover();
                    C89219l.m154716b(videoCover2, "");
                    if (referenceInfo != null) {
                        l = referenceInfo.referenced_message_id;
                    }
                    String conversationId = aiVar.getConversationId();
                    C89219l.m154716b(conversationId, "");
                    C53660b.m98938a(videoCover2, l, conversationId, shareAwemeContent, new C54309d(this));
                    i = 0;
                } else {
                    SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) (str + ':'));
                    C89219l.m154716b(append, "");
                    int length = append.length();
                    append.append((CharSequence) " ");
                    append.setSpan(aVar, length, append.length(), 17);
                    setReplyText(append);
                }
                videoCover.setVisibility(i);
            }
        }
        StringBuilder append2 = new StringBuilder().append(str).append(": ");
        if (baseContent != null) {
            str2 = baseContent.getQuoteHint(getContext());
        }
        setReplyText(append2.append(str2).toString());
        videoCover.setVisibility(i);
    }
}
