package com.p2082ss.android.ugc.aweme.discover.mob;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c;
import com.p2082ss.android.ugc.aweme.metrics.AbstractC59255t;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.discover.mob.b */
public class C42447b extends AbstractC59255t {

    /* renamed from: b */
    private String f98922b = "discovery";

    /* renamed from: c */
    private int f98923c;

    /* renamed from: d */
    private String f98924d;

    /* renamed from: e */
    private String f98925e;

    static {
        Covode.recordClassIndex(50395);
    }

    @Override // com.p2082ss.android.ugc.aweme.metrics.AbstractC59255t
    public HashMap<String, String> buildParams() {
        appendParam("banner_id", this.f98924d, AbstractC59233c.AbstractC59234a.f135178b);
        appendParam("enter_from", this.f98922b, AbstractC59233c.AbstractC59234a.f135177a);
        appendParam("tag_id", this.f98925e, AbstractC59233c.AbstractC59234a.f135177a);
        appendParam("client_order", String.valueOf(this.f98923c), AbstractC59233c.AbstractC59234a.f135177a);
        return this.f135346a;
    }

    public C42447b setBannerId(String str) {
        this.f98924d = str;
        return this;
    }

    public C42447b setClientOrder(int i) {
        this.f98923c = i;
        return this;
    }

    public C42447b setEnterFrom(String str) {
        this.f98922b = str;
        return this;
    }

    public C42447b setTagId(String str) {
        this.f98925e = str;
        return this;
    }
}
