package com.p2082ss.android.ugc.aweme.metrics;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c;

/* renamed from: com.ss.android.ugc.aweme.metrics.x */
public final class C59262x extends AbstractC59233c {

    /* renamed from: a */
    public String f135422a;

    /* renamed from: b */
    public String f135423b;

    /* renamed from: c */
    public String f135424c;

    /* renamed from: d */
    public String f135425d;

    /* renamed from: e */
    public String f135426e;

    /* renamed from: p */
    private boolean f135427p;

    /* renamed from: q */
    private String f135428q;

    static {
        Covode.recordClassIndex(69625);
    }

    public C59262x() {
        super("launch_log");
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c
    /* renamed from: a */
    public final void mo69786a() {
        String str;
        mo96790a("launch_method", this.f135422a, AbstractC59233c.AbstractC59234a.f135177a);
        mo96790a("push_id", this.f135428q, AbstractC59233c.AbstractC59234a.f135177a);
        mo96790a("enter_to", this.f135423b, AbstractC59233c.AbstractC59234a.f135177a);
        mo96790a("red_badge_number", this.f135424c, AbstractC59233c.AbstractC59234a.f135177a);
        mo96790a("is_cold_launch", this.f135425d, AbstractC59233c.AbstractC59234a.f135177a);
        if (this.f135427p) {
            str = "1";
        } else {
            str = "0";
        }
        mo96786a("is_share_link_launch", str);
        if (!TextUtils.isEmpty(this.f135426e)) {
            mo96790a("launch_from", this.f135426e, AbstractC59233c.AbstractC59234a.f135177a);
        }
    }
}
