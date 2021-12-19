package com.p2082ss.android.ugc.aweme.discover.mob;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c;
import com.p2082ss.android.ugc.aweme.metrics.AbstractC59255t;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.discover.mob.g */
public class C42455g extends AbstractC59255t {

    /* renamed from: b */
    private int f98967b;

    /* renamed from: c */
    private String f98968c;

    /* renamed from: d */
    private String f98969d;

    /* renamed from: e */
    private String f98970e;

    /* renamed from: f */
    private String f98971f;

    /* renamed from: g */
    private String f98972g;

    /* renamed from: h */
    private String f98973h;

    static {
        Covode.recordClassIndex(50403);
    }

    @Override // com.p2082ss.android.ugc.aweme.metrics.AbstractC59255t
    public HashMap<String, String> buildParams() {
        appendParam("order", String.valueOf(this.f98967b), AbstractC59233c.AbstractC59234a.f135177a);
        appendParam("search_keyword", this.f98968c, AbstractC59233c.AbstractC59234a.f135177a);
        appendParam("enter_from", this.f98970e, AbstractC59233c.AbstractC59234a.f135177a);
        appendParam("enter_method", this.f98971f, AbstractC59233c.AbstractC59234a.f135177a);
        if (!TextUtils.isEmpty(this.f98972g)) {
            appendParam("search_result_id", this.f98972g, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f98973h)) {
            appendParam("list_item_id", this.f98973h, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (!TextUtils.isEmpty(this.f98969d)) {
            appendParam("request_id", this.f98969d, AbstractC59233c.AbstractC59234a.f135177a);
            appendParam("log_pb", C48027ac.C48028a.f111257a.mo80055a(this.f98969d), AbstractC59233c.AbstractC59234a.f135177a);
        }
        return this.f135346a;
    }

    public C42455g setEnterFrom(String str) {
        this.f98970e = str;
        return this;
    }

    public C42455g setEnterMethod(String str) {
        this.f98971f = str;
        return this;
    }

    public C42455g setListItemId(String str) {
        this.f98973h = str;
        return this;
    }

    public C42455g setOrder(int i) {
        this.f98967b = i;
        return this;
    }

    public C42455g setRid(String str) {
        this.f98969d = str;
        return this;
    }

    public C42455g setSearchKeyword(String str) {
        this.f98968c = str;
        return this;
    }

    public C42455g setSearchResultId(String str) {
        this.f98972g = str;
        return this;
    }
}
