package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.content.C0643b;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.LinkCard;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.LinkInfo;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.MessageTitle;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.NamedValue;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.SystemCardContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.SystemCardContentKt;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.Template;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.TextInfo;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.Title;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.VideoInfo;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.bh */
public final class C54531bh extends AbstractC54482a<SystemCardContent> {

    /* renamed from: a */
    public final View f124979a;

    static {
        Covode.recordClassIndex(64242);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.bh$a */
    static final class View$OnClickListenerC54532a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ View f124980a;

        /* renamed from: b */
        final /* synthetic */ LinkCard f124981b;

        static {
            Covode.recordClassIndex(64243);
        }

        View$OnClickListenerC54532a(View view, LinkCard linkCard) {
            this.f124980a = view;
            this.f124981b = linkCard;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            LinkInfo linkInfo = this.f124981b.getLinkInfo();
            Context context = this.f124980a.getContext();
            C89219l.m154716b(context, "");
            SystemCardContentKt.open(linkInfo, context);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.bh$b */
    static final class View$OnClickListenerC54533b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VideoInfo f124982a;

        /* renamed from: b */
        final /* synthetic */ C54531bh f124983b;

        static {
            Covode.recordClassIndex(64244);
        }

        View$OnClickListenerC54533b(VideoInfo videoInfo, C54531bh bhVar) {
            this.f124982a = videoInfo;
            this.f124983b = bhVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            LinkInfo linkInfo = this.f124982a.getLinkInfo();
            Context context = this.f124983b.f124979a.getContext();
            C89219l.m154716b(context, "");
            SystemCardContentKt.open(linkInfo, context);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54531bh(View view, EnumC53772b bVar) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(bVar, "");
        this.f124979a = view;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.im.core.d.ai, com.bytedance.im.core.d.ai, com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent, int] */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54482a
    /* renamed from: a */
    public final /* synthetic */ void mo91008a(C19538ai aiVar, C19538ai aiVar2, SystemCardContent systemCardContent, int i) {
        List<NamedValue> infos;
        MessageTitle title;
        MessageTitle title2;
        MessageTitle title3;
        MethodCollector.m26663i(5371);
        SystemCardContent systemCardContent2 = systemCardContent;
        C89219l.m154721d(aiVar, "");
        super.mo91008a(aiVar, aiVar2, systemCardContent2, i);
        if (systemCardContent2 != null) {
            RemoteImageView remoteImageView = (RemoteImageView) this.f124979a.findViewById(R.id.bk3);
            Title title4 = systemCardContent2.getTitle();
            Integer num = null;
            C34577e.m70592a(remoteImageView, title4 != null ? title4.getIcon() : null);
            TuxTextView tuxTextView = (TuxTextView) this.f124979a.findViewById(R.id.bk8);
            C89219l.m154716b(tuxTextView, "");
            Title title5 = systemCardContent2.getTitle();
            tuxTextView.setText(title5 != null ? title5.getTitle() : null);
            TuxTextView tuxTextView2 = (TuxTextView) this.f124979a.findViewById(R.id.bk7);
            TextInfo textInfo = systemCardContent2.getTextInfo();
            tuxTextView2.setText((textInfo == null || (title3 = textInfo.getTitle()) == null) ? null : title3.getTitle());
            TextInfo textInfo2 = systemCardContent2.getTextInfo();
            if (!(textInfo2 == null || (title2 = textInfo2.getTitle()) == null)) {
                num = Integer.valueOf(title2.getColorType());
            }
            tuxTextView2.setTextColor(SystemCardContentKt.colorTypeToColor(num));
            TextInfo textInfo3 = systemCardContent2.getTextInfo();
            if (!(textInfo3 == null || (title = textInfo3.getTitle()) == null || !title.getBold())) {
                tuxTextView2.setTuxFont(43);
            }
            VideoInfo videoInfo = systemCardContent2.getVideoInfo();
            boolean z = false;
            if (videoInfo == null) {
                RelativeLayout relativeLayout = (RelativeLayout) this.f124979a.findViewById(R.id.im_msg_card_video_container);
                C89219l.m154716b(relativeLayout, "");
                relativeLayout.setVisibility(8);
            } else {
                RelativeLayout relativeLayout2 = (RelativeLayout) this.f124979a.findViewById(R.id.im_msg_card_video_container);
                C89219l.m154716b(relativeLayout2, "");
                relativeLayout2.setVisibility(0);
                C34577e.m70592a((RemoteImageView) this.f124979a.findViewById(R.id.bk_), videoInfo.getCover());
                ((RelativeLayout) this.f124979a.findViewById(R.id.im_msg_card_video_container)).setOnClickListener(new View$OnClickListenerC54533b(videoInfo, this));
            }
            View view = this.f124979a;
            int i2 = R.id.im_msg_card_info_container;
            ((LinearLayout) view.findViewById(R.id.im_msg_card_info_container)).removeAllViews();
            TextInfo textInfo4 = systemCardContent2.getTextInfo();
            if (!(textInfo4 == null || (infos = textInfo4.getInfos()) == null)) {
                for (T t : infos) {
                    LinearLayout linearLayout = (LinearLayout) this.f124979a.findViewById(i2);
                    C89219l.m154716b(linearLayout, "");
                    Context context = linearLayout.getContext();
                    View a = C1764a.m5927a(LayoutInflater.from(linearLayout.getContext()), R.layout.a78, linearLayout, z);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) t.getName()).append((CharSequence) " ").append((CharSequence) t.getValue().getTips());
                    List<Template> template = t.getValue().getTemplate();
                    if (template == null) {
                        template = C89086z.INSTANCE;
                    }
                    for (Template template2 : template) {
                        String str = "{{" + template2.getKey() + "}}";
                        int a2 = C89361p.m154885a((CharSequence) spannableStringBuilder, str);
                        spannableStringBuilder.replace(a2, str.length() + a2, (CharSequence) template2.getName()).setSpan(new ForegroundColorSpan(SystemCardContentKt.colorTypeToColor(Integer.valueOf(template2.getExtra().getColorType()))), a2, template2.getName().length() + a2, 33);
                        if (template2.getExtra().getBold()) {
                            spannableStringBuilder.setSpan(new StyleSpan(1), a2, template2.getName().length() + a2, 33);
                        }
                    }
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(C0643b.m2378c(context, R.color.c5)), 0, t.getName().length() + 1, 33);
                    View findViewById = a.findViewById(R.id.bk0);
                    C89219l.m154716b(findViewById, "");
                    ((TuxTextView) findViewById).setText(spannableStringBuilder);
                    linearLayout.addView(a);
                    i2 = R.id.im_msg_card_info_container;
                    z = false;
                }
            }
            ((LinearLayout) this.f124979a.findViewById(R.id.bk1)).removeAllViews();
            List<LinkCard> linkCards = systemCardContent2.getLinkCards();
            if (linkCards != null) {
                for (T t2 : linkCards) {
                    LinearLayout linearLayout2 = (LinearLayout) this.f124979a.findViewById(R.id.bk1);
                    C89219l.m154716b(linearLayout2, "");
                    View a3 = C1764a.m5927a(LayoutInflater.from(linearLayout2.getContext()), R.layout.a79, linearLayout2, false);
                    View findViewById2 = a3.findViewById(R.id.bk6);
                    C89219l.m154716b(findViewById2, "");
                    ((TuxTextView) findViewById2).setText(t2.getName());
                    View findViewById3 = a3.findViewById(R.id.bk4);
                    C89219l.m154716b(findViewById3, "");
                    ((TuxTextView) findViewById3).setText(t2.getDesc());
                    a3.setOnClickListener(new View$OnClickListenerC54532a(a3, t2));
                    linearLayout2.addView(a3);
                }
                MethodCollector.m26664o(5371);
                return;
            }
            MethodCollector.m26664o(5371);
            return;
        }
        MethodCollector.m26664o(5371);
    }
}
