package com.p2082ss.android.ugc.aweme.metrics;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c;
import com.p2082ss.android.ugc.aweme.utils.C80261bq;

/* renamed from: com.ss.android.ugc.aweme.metrics.l */
public final class C59247l extends AbstractC59233c {

    /* renamed from: a */
    public String f135247a;

    /* renamed from: b */
    public String f135248b;

    /* renamed from: c */
    private String f135249c;

    /* renamed from: d */
    private String f135250d;

    /* renamed from: e */
    private String f135251e;

    /* renamed from: p */
    private String f135252p;

    /* renamed from: q */
    private Aweme f135253q;

    /* renamed from: r */
    private String f135254r;

    static {
        Covode.recordClassIndex(69610);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c
    /* renamed from: a */
    public final void mo69786a() {
        mo96790a("group_id", this.f135249c, AbstractC59233c.AbstractC59234a.f135178b);
        mo96790a("author_id", this.f135250d, AbstractC59233c.AbstractC59234a.f135178b);
        Context a = C17867d.m33078a();
        if (a != null) {
            this.f135252p = String.valueOf(C80261bq.m139133f(a) / 1024);
        }
        mo96786a("memory_usage", this.f135252p);
        mo96786a("local_time_ms", String.valueOf(System.currentTimeMillis()));
        if (!TextUtils.isEmpty(this.f135247a)) {
            mo96790a("enter_method", this.f135247a, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f135169h)) {
            String str = this.f135169h;
            str.hashCode();
            switch (str.hashCode()) {
                case -1382453013:
                    if (str.equals("NOTIFICATION")) {
                        this.f135169h = "notice";
                        break;
                    }
                    break;
                case 2614219:
                    if (str.equals("USER")) {
                        this.f135169h = "profile";
                        break;
                    }
                    break;
                case 482617583:
                    if (str.equals("PUBLISH")) {
                        this.f135169h = "shoot";
                        break;
                    }
                    break;
                case 1055811561:
                    if (str.equals("DISCOVER")) {
                        this.f135169h = "discover";
                        break;
                    }
                    break;
            }
            mo96786a("enter_from", this.f135169h);
        }
        if (!TextUtils.isEmpty(this.f135251e)) {
            mo96786a("music_id", this.f135251e);
        }
        if (!TextUtils.isEmpty(this.f135254r)) {
            mo96786a("follow_status", this.f135254r);
        }
        if (!TextUtils.isEmpty(this.f135248b)) {
            mo96786a("notice_type", this.f135248b);
        }
    }

    /* renamed from: a */
    public final C59247l mo96816a(String str) {
        this.f135169h = str;
        return this;
    }

    public C59247l(String str) {
        super(str);
        this.f135172k = true;
    }

    /* renamed from: f */
    public final C59247l mo96817f(Aweme aweme) {
        if (aweme != null) {
            this.f135253q = aweme;
            this.f135249c = aweme.getAid();
            this.f135250d = aweme.getAuthorUid();
            this.f135254r = C59205aa.m108754a(aweme);
        }
        return this;
    }
}
