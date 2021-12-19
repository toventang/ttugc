package com.p2082ss.android.ugc.aweme.share.improve.p3755a.p3756a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.commerce_challenge_impl.service.CommerceChallengeServiceImpl;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.C39163s;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.discover.model.Challenge;
import com.p2082ss.android.ugc.aweme.share.C68863ah;
import com.p2082ss.android.ugc.aweme.share.improve.p3755a.C68993ai;
import com.p2082ss.android.ugc.aweme.share.qrcode.DialogC69376a;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.a.a */
public final class C68968a extends C68993ai {

    /* renamed from: b */
    public final Challenge f154290b;

    /* renamed from: c */
    public final boolean f154291c;

    /* renamed from: d */
    public final String f154292d;

    /* renamed from: e */
    public final String f154293e;

    /* renamed from: f */
    public final String f154294f;

    static {
        Covode.recordClassIndex(81282);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h, com.p2082ss.android.ugc.aweme.share.improve.p3755a.C68993ai
    /* renamed from: a */
    public final void mo61915a(Context context, SharePackage sharePackage) {
        int i;
        C89219l.m154721d(context, "");
        C89219l.m154721d(sharePackage, "");
        C39162r.m79460a("click_qr_code", new C33744d().mo59983a("tag_id", this.f154290b.getCid()).mo59983a("platform", "scan").mo59983a("qr_code_type", "shaped").mo59983a("enter_from", "challenge").f79943a);
        if (CommerceChallengeServiceImpl.m75741e().mo65392b(this.f154290b)) {
            i = 23;
        } else {
            i = 2;
        }
        long displayCount = this.f154290b.getDisplayCount();
        String cid = this.f154290b.getCid();
        C89219l.m154716b(cid, "");
        new DialogC69376a(context, "#" + this.f154290b.getChallengeName(), displayCount, "hash_tag", i, cid, (byte) 0).show();
        C39162r.onEvent(new MobClick().setEventName("share_challenge").setLabelName("qr_code").setExtValueString(this.f154290b.getCid()).setJsonObject(new C39163s().mo67941a("request_id", this.f154293e).mo67941a("challenge_id", this.f154292d).mo67941a("process_id", this.f154294f).mo67942a()));
        C39162r.m79460a("share_tag", new C33744d().mo59983a("tag_id", this.f154292d).mo59983a("platform", "qr_code").mo59983a("share_mode", "normal_share").mo59983a("process_id", this.f154294f).f79943a);
        C68863ah.f154028b.mo109361a("qr_code", 0);
    }

    public C68968a(Challenge challenge, boolean z, String str, String str2, String str3) {
        C89219l.m154721d(challenge, "");
        this.f154290b = challenge;
        this.f154291c = z;
        this.f154292d = str;
        this.f154293e = str2;
        this.f154294f = str3;
    }
}
