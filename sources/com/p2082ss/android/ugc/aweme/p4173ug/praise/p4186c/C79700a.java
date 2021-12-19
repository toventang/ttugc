package com.p2082ss.android.ugc.aweme.p4173ug.praise.p4186c;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.FeedbackConf;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p2082ss.android.ugc.aweme.p2479ck.C36125t;
import com.p2082ss.android.ugc.aweme.p4173ug.praise.AbstractC79681a;
import com.p2082ss.android.ugc.aweme.p4173ug.praise.C79684b;
import com.p2082ss.android.ugc.aweme.setting.services.C68432f;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89378p;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ug.praise.c.a */
public final class C79700a extends AbstractC79681a {
    static {
        Covode.recordClassIndex(92917);
    }

    @Override // com.p2082ss.android.ugc.aweme.p4173ug.praise.AbstractC79681a
    /* renamed from: b */
    public final AbstractC79681a.C79682a mo123223b() {
        String string = this.f178793c.getString(R.string.hat);
        C89219l.m154716b(string, "");
        String string2 = this.f178793c.getString(R.string.haq);
        C89219l.m154716b(string2, "");
        String string3 = this.f178793c.getString(R.string.har);
        C89219l.m154716b(string3, "");
        String string4 = this.f178793c.getString(R.string.has);
        C89219l.m154716b(string4, "");
        C89219l.m154716b("com.ss.android.ugc.tiktok.livewallpaper", "");
        return new AbstractC79681a.C79682a(string, string2, string3, string4, "com.ss.android.ugc.tiktok.livewallpaper");
    }

    @Override // com.p2082ss.android.ugc.aweme.p4173ug.praise.AbstractC79681a
    /* renamed from: c */
    public final void mo123224c() {
        try {
            IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
            C89219l.m154716b(iESSettingsProxy, "");
            FeedbackConf feedbackConf = iESSettingsProxy.getFeedbackConf();
            C89219l.m154716b(feedbackConf, "");
            String feHelp = feedbackConf.getFeHelp();
            C89219l.m154716b(feHelp, "");
            C36125t.m73598a(C36125t.m73591a(), C68432f.f153189a.mo108858a(feHelp, C89041ag.m154412a(new C89378p("feedback_id", "15203"))));
        } catch (C16041a unused) {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C79700a(Context context) {
        super(context, C79684b.EnumC79686b.WALLPAPER);
        C89219l.m154721d(context, "");
    }
}
