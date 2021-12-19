package com.p2082ss.android.ugc.aweme.metrics;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.detail.C41223i;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.forward.statistics.ForwardStatisticsServiceImpl;
import com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c;
import com.p2082ss.android.ugc.aweme.p4235w.C81469a;
import com.p2082ss.android.ugc.aweme.push.C65724g;
import com.p2082ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.metrics.m */
public final class C59248m extends AbstractC59203a<C59248m> {

    /* renamed from: X */
    public String f135255X;

    /* renamed from: Y */
    public String f135256Y;

    /* renamed from: Z */
    public String f135257Z;

    /* renamed from: aa */
    public boolean f135258aa;

    /* renamed from: ab */
    public String f135259ab;

    /* renamed from: ac */
    private String f135260ac;

    /* renamed from: ad */
    private String f135261ad;

    /* renamed from: ae */
    private Aweme f135262ae;

    /* renamed from: af */
    private String f135263af;

    /* renamed from: ag */
    private String f135264ag;

    /* renamed from: ah */
    private int f135265ah;

    /* renamed from: ai */
    private String f135266ai;

    /* renamed from: aj */
    private String f135267aj;

    /* renamed from: ak */
    private boolean f135268ak;

    /* renamed from: al */
    private String f135269al;

    /* renamed from: am */
    private String f135270am;

    /* renamed from: e */
    public String f135271e;

    /* renamed from: p */
    public String f135272p;

    /* renamed from: q */
    public String f135273q;

    /* renamed from: r */
    public String f135274r;

    /* renamed from: s */
    public String f135275s;

    /* renamed from: t */
    public String f135276t;

    /* renamed from: u */
    public boolean f135277u;

    /* renamed from: v */
    public String f135278v;

    static {
        Covode.recordClassIndex(69611);
    }

    public C59248m() {
        super("enter_music_detail");
        this.f135172k = true;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c
    /* renamed from: a */
    public final void mo69786a() {
        String str;
        Aweme aweme;
        mo96790a("group_id", this.f135271e, AbstractC59233c.AbstractC59234a.f135178b);
        mo96790a("music_id", this.f135272p, AbstractC59233c.AbstractC59234a.f135178b);
        mo96790a("author_id", this.f135260ac, AbstractC59233c.AbstractC59234a.f135178b);
        mo96790a("category_name", this.f135259ab, AbstractC59233c.AbstractC59234a.f135177a);
        mo96790a("request_id", this.f135273q, AbstractC59233c.AbstractC59234a.f135178b);
        mo96786a("is_reposted", new StringBuilder().append(this.f135265ah).toString());
        mo96786a("repost_from_group_id", this.f135266ai);
        mo96786a("repost_from_user_id", this.f135267aj);
        if (!((BusinessComponentServiceUtils.getBusinessBridgeService().mo121231c().toUpperCase(Locale.ROOT).equals("US") && !C31575b.m65865g().isLogin()) || (aweme = this.f135262ae) == null || aweme.getStickerEntranceInfo() == null || this.f135221U.getStickerEntranceInfo().f169545id == null)) {
            mo96786a("from_prop_id", this.f135262ae.getStickerEntranceInfo().f169545id);
        }
        mo96788a(ForwardStatisticsServiceImpl.m95759b().mo86843a(this.f135262ae, this.f135261ad));
        if (C65724g.m117661a().mo104866a(this.f135271e)) {
            mo96790a("previous_page", "push", AbstractC59233c.AbstractC59234a.f135177a);
        } else if (!TextUtils.isEmpty(this.f135275s)) {
            mo96790a("previous_page", this.f135275s, AbstractC59233c.AbstractC59234a.f135177a);
            mo96790a("previous_page_position", this.f135276t, AbstractC59233c.AbstractC59234a.f135177a);
        }
        String str2 = "1";
        if (this.f135277u) {
            mo96790a("is_instructive", str2, AbstractC59233c.AbstractC59234a.f135177a);
            mo96790a("bottom_bar_show", str2, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (C59208ac.m108762a(this.f135169h)) {
            mo96794h(this.f135273q);
        }
        if (TextUtils.equals(this.f135169h, "homepage_fresh") || TextUtils.equals(this.f135169h, "homepage_channel")) {
            C81469a.m141252a();
        }
        if (!TextUtils.isEmpty(this.f135228x)) {
            mo96786a("tab_name", this.f135228x);
        }
        if (!TextUtils.isEmpty(this.f135255X)) {
            mo96790a(this.f135255X, this.f135256Y, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f135278v)) {
            mo96790a("playlist_type", this.f135278v, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f135263af)) {
            mo96790a("impr_type", this.f135263af, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f135264ag)) {
            mo96790a("compilation_id", this.f135264ag, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f135274r)) {
            mo96790a("process_id", this.f135274r, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (mo96806h() && !TextUtils.isEmpty(this.f135257Z)) {
            mo96786a("enter_position", this.f135257Z);
        }
        mo96786a("impr_id", this.f135273q);
        if (C41223i.f96336a) {
            mo96786a("is_fullscreen", str2);
        }
        if (TextUtils.equals("homepage_familiar", this.f135169h)) {
            if (this.f135268ak) {
                str = "follow";
            } else {
                str = "unfollow";
            }
            mo96786a("relation_type", str);
            mo96786a("video_type", this.f135269al);
            mo96786a("rec_uid", this.f135270am);
        }
        if (!this.f135258aa) {
            str2 = "0";
        }
        mo96786a("ugc_to_pgc_meta", str2);
    }

    /* renamed from: o */
    public final C59248m mo96819o(String str) {
        this.f135169h = str;
        return this;
    }

    /* renamed from: f */
    public final C59248m mo96749g(Aweme aweme) {
        String valueOf;
        super.mo96749g(aweme);
        if (aweme != null) {
            this.f135262ae = aweme;
            this.f135273q = C59208ac.m108763b(aweme);
            this.f135271e = aweme.getAid();
            this.f135260ac = aweme.getAuthorUid();
            if (aweme.getMusic() == null) {
                valueOf = "";
            } else {
                valueOf = String.valueOf(aweme.getMusic().getId());
            }
            this.f135272p = valueOf;
            this.f135263af = C59208ac.m108776j(aweme);
            if (aweme.getMixInfo() != null) {
                this.f135264ag = aweme.getMixInfo().mixId;
            }
            this.f135268ak = C80580in.m139680a(aweme);
            this.f135269al = C59208ac.m108777k(aweme);
            this.f135270am = C59208ac.m108778l(aweme);
        }
        return this;
    }
}
