package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.bytedance.android.live.core.p218f.C3906af;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.base.p2379ui.SmartAvatarImageView;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.ShareLiveEventContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3136d.C54438a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3171b.C55059b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3172c.C55070h;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3172c.C55071i;
import com.p2082ss.android.ugc.aweme.utils.C80187aa;
import com.p2082ss.android.ugc.aweme.utils.C80581io;
import com.p2082ss.android.ugc.trill.R;
import java.net.URLDecoder;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.ae */
public class C54490ae extends AbstractC54482a<ShareLiveEventContent> {

    /* renamed from: a */
    private SmartAvatarImageView f124846a;

    /* renamed from: b */
    private TuxTextView f124847b;

    /* renamed from: x */
    private TuxTextView f124848x;

    /* renamed from: y */
    private TuxTextView f124849y;

    /* renamed from: z */
    private TuxTextView f124850z;

    static {
        Covode.recordClassIndex(64201);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54482a
    /* renamed from: a */
    public void mo91007a() {
        super.mo91007a();
        View findViewById = this.itemView.findViewById(R.id.acq);
        C89219l.m154716b(findViewById, "");
        this.f124819o = C54438a.C54439a.m99780a(findViewById);
        View findViewById2 = this.itemView.findViewById(R.id.axg);
        C89219l.m154716b(findViewById2, "");
        this.f124847b = (TuxTextView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.axd);
        C89219l.m154716b(findViewById3, "");
        this.f124846a = (SmartAvatarImageView) findViewById3;
        View findViewById4 = this.itemView.findViewById(R.id.axh);
        C89219l.m154716b(findViewById4, "");
        this.f124848x = (TuxTextView) findViewById4;
        View findViewById5 = this.itemView.findViewById(R.id.axf);
        C89219l.m154716b(findViewById5, "");
        this.f124849y = (TuxTextView) findViewById5;
        View findViewById6 = this.itemView.findViewById(R.id.eez);
        C89219l.m154716b(findViewById6, "");
        this.f124850z = (TuxTextView) findViewById6;
    }

    /* renamed from: a */
    private static long m99853a(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return Long.parseLong(str);
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54490ae(View view, EnumC53772b bVar) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(bVar, "");
    }

    /* renamed from: a */
    public void mo91008a(C19538ai aiVar, C19538ai aiVar2, ShareLiveEventContent shareLiveEventContent, int i) {
        C89219l.m154721d(aiVar, "");
        C89219l.m154721d(shareLiveEventContent, "");
        super.mo91008a(aiVar, aiVar2, (BaseContent) shareLiveEventContent, i);
        this.f124819o.mo91505a(50331648, 45);
        this.f124819o.mo91505a(67108864, shareLiveEventContent.getLinkUrl());
        this.f124819o.mo91505a(50331649, shareLiveEventContent);
        this.f124819o.mo91505a(150994945, false);
        String decode = URLDecoder.decode(shareLiveEventContent.getLinkUrl());
        C89219l.m154716b(decode, "");
        Uri parse = Uri.parse(decode);
        C89219l.m154709a((Object) parse, "");
        C55059b.m100692a(shareLiveEventContent.getEventId(), C3906af.m9538a(parse, "is_paid_event"), "show");
        if (C55070h.m100710a(shareLiveEventContent.getLinkUrl()) || (C55071i.m100714a(shareLiveEventContent.getOrganizerAvatar(), C55071i.m100718a()))) {
            this.f124819o.mo91505a(150994945, true);
            TuxTextView tuxTextView = this.f124847b;
            if (tuxTextView == null) {
                C89219l.m154710a("nameView");
            }
            tuxTextView.setText(R.string.cn_);
            C20766v a = C20761r.m39056a(2131232866);
            SmartAvatarImageView smartAvatarImageView = this.f124846a;
            if (smartAvatarImageView == null) {
                C89219l.m154710a("avatarView");
            }
            a.f49092E = smartAvatarImageView;
            a.mo34186c();
            return;
        }
        TuxTextView tuxTextView2 = this.f124847b;
        if (tuxTextView2 == null) {
            C89219l.m154710a("nameView");
        }
        tuxTextView2.setText(shareLiveEventContent.getTitle());
        TuxTextView tuxTextView3 = this.f124848x;
        if (tuxTextView3 == null) {
            C89219l.m154710a("timeView");
        }
        tuxTextView3.setText(C80187aa.C80188a.m139014e(m99853a(shareLiveEventContent.getStartTime())));
        TuxTextView tuxTextView4 = this.f124849y;
        if (tuxTextView4 == null) {
            C89219l.m154710a("hosterView");
        }
        tuxTextView4.setText(shareLiveEventContent.getOrganizerName());
        C20766v a2 = C20761r.m39060a(C34735v.m70965a(shareLiveEventContent.getOrganizerAvatar()));
        SmartAvatarImageView smartAvatarImageView2 = this.f124846a;
        if (smartAvatarImageView2 == null) {
            C89219l.m154710a("avatarView");
        }
        a2.f49092E = smartAvatarImageView2;
        a2.mo34186c();
        View view = this.itemView;
        C89219l.m154716b(view, "");
        Context context = view.getContext();
        String organizerVerifyReason = shareLiveEventContent.getOrganizerVerifyReason();
        String organizerEnterprise = shareLiveEventContent.getOrganizerEnterprise();
        TuxTextView tuxTextView5 = this.f124849y;
        if (tuxTextView5 == null) {
            C89219l.m154710a("hosterView");
        }
        C80581io.m139704a(context, organizerVerifyReason, organizerEnterprise, tuxTextView5);
    }
}
