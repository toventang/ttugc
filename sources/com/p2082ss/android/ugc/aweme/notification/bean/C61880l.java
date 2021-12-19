package com.p2082ss.android.ugc.aweme.notification.bean;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.notification.bean.l */
public final class C61880l {

    /* renamed from: a */
    public String f140471a;

    /* renamed from: b */
    public String f140472b;

    /* renamed from: c */
    public int f140473c;

    /* renamed from: d */
    public String f140474d;

    /* renamed from: e */
    public String f140475e;

    /* renamed from: f */
    public String f140476f;

    /* renamed from: g */
    public long f140477g;

    /* renamed from: h */
    public String f140478h;

    /* renamed from: i */
    public String f140479i;

    /* renamed from: j */
    public String f140480j;

    /* renamed from: k */
    public int f140481k;

    /* renamed from: l */
    public LogPbBean f140482l;

    /* renamed from: m */
    public String f140483m;

    /* renamed from: n */
    public String f140484n;

    /* renamed from: o */
    public String f140485o;

    /* renamed from: p */
    public String f140486p;

    /* renamed from: q */
    public String f140487q;

    /* renamed from: r */
    public String f140488r;

    /* renamed from: s */
    public int f140489s = -1;

    /* renamed from: t */
    public String f140490t;

    /* renamed from: u */
    public String f140491u;

    /* renamed from: v */
    public String f140492v;

    /* renamed from: w */
    public String f140493w;

    /* renamed from: x */
    private Map<String, String> f140494x = new HashMap();

    static {
        Covode.recordClassIndex(72629);
    }

    /* renamed from: a */
    public final void mo99974a() {
        m112011a("action_type", this.f140471a);
        m112011a("account_type", this.f140472b);
        m112011a("client_order", String.valueOf(this.f140473c));
        m112011a("notice_type", this.f140474d);
        m112011a("notification_type", this.f140475e);
        m112011a("message_time", String.valueOf(this.f140477g));
        m112011a("from_user_id", this.f140478h);
        m112011a("from_item", this.f140479i);
        m112011a("from_item_id", this.f140480j);
        m112011a("is_together", String.valueOf(this.f140481k));
        m112011a("enter_from", this.f140485o);
        m112011a("with_follow_button", this.f140493w);
        m112011a("rec_type", this.f140492v);
        if (!TextUtils.isEmpty(this.f140484n)) {
            m112011a("scene_id", this.f140484n);
        }
        if (!TextUtils.isEmpty(this.f140487q)) {
            m112011a("tab_name", this.f140487q);
        }
        if (!TextUtils.isEmpty(this.f140483m)) {
            m112011a("timeline", this.f140483m);
        }
        if (!TextUtils.isEmpty(this.f140476f)) {
            m112011a("follow_button", this.f140476f);
        }
        if (!TextUtils.isEmpty(this.f140488r)) {
            m112011a("explain_relation", this.f140488r);
        }
        if (this.f140482l != null) {
            m112011a("log_pb", new C27910f().mo46674b(this.f140482l));
        }
        int i = this.f140489s;
        if (i != -1) {
            m112011a("is_read", String.valueOf(i));
        }
        if (!TextUtils.isEmpty(this.f140486p)) {
            m112011a("button_type", this.f140486p);
        }
        if (!TextUtils.isEmpty(this.f140490t)) {
            m112011a("group_id", this.f140490t);
            m112011a("story_type", this.f140491u);
        }
        C39162r.m79460a("notification_message_inner_message", this.f140494x);
    }

    /* renamed from: a */
    private void m112011a(String str, String str2) {
        this.f140494x.put(str, str2);
    }
}
