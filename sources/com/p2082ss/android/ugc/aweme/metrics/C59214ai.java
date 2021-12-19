package com.p2082ss.android.ugc.aweme.metrics;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c;
import com.p2082ss.android.ugc.aweme.p4173ug.UgCommonServiceImpl;
import com.p2082ss.android.ugc.aweme.push.C65724g;

/* renamed from: com.ss.android.ugc.aweme.metrics.ai */
public final class C59214ai extends AbstractC59233c {

    /* renamed from: A */
    private String f134855A;

    /* renamed from: B */
    private String f134856B;

    /* renamed from: a */
    public String f134857a;

    /* renamed from: b */
    public String f134858b;

    /* renamed from: c */
    public String f134859c;

    /* renamed from: d */
    public String f134860d;

    /* renamed from: e */
    public int f134861e;

    /* renamed from: p */
    public String f134862p;

    /* renamed from: q */
    public String f134863q;

    /* renamed from: r */
    private String f134864r;

    /* renamed from: s */
    private String f134865s;

    /* renamed from: t */
    private String f134866t;

    /* renamed from: u */
    private String f134867u;

    /* renamed from: v */
    private boolean f134868v;

    /* renamed from: w */
    private String f134869w;

    /* renamed from: x */
    private String f134870x;

    /* renamed from: y */
    private String f134871y;

    /* renamed from: z */
    private int f134872z;

    static {
        Covode.recordClassIndex(69577);
    }

    public C59214ai() {
        super("shoot");
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c
    /* renamed from: a */
    public final void mo69786a() {
        mo96790a("shoot_way", this.f134857a, AbstractC59233c.AbstractC59234a.f135177a);
        if (!TextUtils.isEmpty(this.f134863q)) {
            mo96786a("enter_from", this.f134863q);
        }
        if (!TextUtils.isEmpty(this.f134864r)) {
            mo96790a("music_id", this.f134864r, AbstractC59233c.AbstractC59234a.f135178b);
        }
        if (!TextUtils.isEmpty(this.f134858b)) {
            mo96790a("group_id", this.f134858b, AbstractC59233c.AbstractC59234a.f135178b);
        }
        if (!TextUtils.isEmpty(this.f134865s)) {
            mo96790a("tag_id", this.f134865s, AbstractC59233c.AbstractC59234a.f135178b);
        }
        if (!TextUtils.isEmpty(this.f134866t)) {
            mo96790a("sticker_id", this.f134866t, AbstractC59233c.AbstractC59234a.f135178b);
        }
        mo96790a("content_type", this.f134859c, AbstractC59233c.AbstractC59234a.f135177a);
        mo96790a("content_cnt", String.valueOf(this.f134861e), AbstractC59233c.AbstractC59234a.f135177a);
        mo96790a("creation_id", this.f134862p, AbstractC59233c.AbstractC59234a.f135177a);
        mo96790a("content_source", this.f134860d, AbstractC59233c.AbstractC59234a.f135177a);
        mo96786a("is_reposted", new StringBuilder().append(this.f134872z).toString());
        mo96786a("repost_from_group_id", this.f134855A);
        mo96786a("repost_from_user_id", this.f134856B);
        if (this.f134868v) {
            mo96790a("log_pb", this.f134867u, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (C65724g.m117661a().mo104866a(this.f134858b)) {
            mo96790a("previous_page", "push", AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f134869w)) {
            mo96786a("coupon_code", this.f134869w);
        }
        if (!TextUtils.isEmpty(this.f134870x)) {
            mo96786a("supplier_id", this.f134870x);
        }
        if (!TextUtils.isEmpty(this.f134871y)) {
            mo96786a("order_id", this.f134871y);
        }
        UgCommonServiceImpl.m138290j().mo123092a().mo123113a("shoot", "");
    }
}
