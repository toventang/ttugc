package com.p2082ss.android.ugc.aweme.commercialize.tasks.p2616a;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.p1270b.C18141a;
import com.bytedance.ies.ugc.aweme.rich.p1271c.p1272a.AbstractC18142a;
import com.bytedance.ies.ugc.aweme.rich.p1271c.p1272a.AbstractC18144c;
import com.p2082ss.android.ugc.aweme.commercialize.p2539d.AbstractC37639a;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize.tasks.C38497a;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38659ay;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.landpage.AdLandPageServiceImpl;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89376n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.commercialize.tasks.a.a */
public abstract class AbstractC38498a extends AbstractC18142a {

    /* renamed from: A */
    public final String f90938A;

    /* renamed from: B */
    public final String f90939B;

    /* renamed from: C */
    public final boolean f90940C;

    /* renamed from: D */
    public final String f90941D;

    /* renamed from: E */
    public final String f90942E;

    /* renamed from: F */
    public final String f90943F;

    /* renamed from: G */
    public final boolean f90944G;

    /* renamed from: H */
    public final String f90945H;

    /* renamed from: I */
    public final int f90946I;

    /* renamed from: J */
    public final int f90947J;

    /* renamed from: K */
    public final int f90948K;

    /* renamed from: L */
    public final boolean f90949L;

    /* renamed from: M */
    public final int f90950M;

    /* renamed from: N */
    public final String f90951N;

    /* renamed from: d */
    public final String f90952d;

    /* renamed from: e */
    public final String f90953e = AdLandPageServiceImpl.m104886b().mo95564a();

    /* renamed from: f */
    public final String f90954f;

    /* renamed from: g */
    public final boolean f90955g;

    /* renamed from: h */
    public final int f90956h;

    /* renamed from: i */
    public final String f90957i;

    /* renamed from: j */
    public final long f90958j;

    /* renamed from: k */
    public final String f90959k;

    /* renamed from: l */
    public final long f90960l;

    /* renamed from: m */
    public final String f90961m;

    /* renamed from: n */
    public final String f90962n;

    /* renamed from: o */
    public final int f90963o;

    /* renamed from: p */
    public final String f90964p;

    /* renamed from: q */
    public final boolean f90965q;

    /* renamed from: r */
    public final String f90966r;

    /* renamed from: s */
    public final String f90967s;

    /* renamed from: t */
    public final String f90968t;

    /* renamed from: u */
    public final String f90969u;

    /* renamed from: v */
    public final String f90970v;

    /* renamed from: w */
    public final String f90971w;

    /* renamed from: x */
    public final int f90972x;

    /* renamed from: y */
    public final int f90973y;

    /* renamed from: z */
    public final boolean f90974z;

    static {
        Covode.recordClassIndex(46024);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final Intent mo67052c() {
        String str;
        Intent a = C38497a.f90936a.mo65610a(this.f43206b);
        a.setData(Uri.parse(this.f90952d));
        boolean z = true;
        if (!TextUtils.isEmpty(this.f90954f)) {
            a.putExtra("title", this.f90954f);
        } else {
            a.putExtra("title", " ");
            a.putExtra("use_webview_title", true);
        }
        a.putExtra("show_report", this.f90955g);
        if (!TextUtils.isEmpty(this.f90959k)) {
            a.putExtra("bundle_download_app_log_extra", this.f90959k);
        }
        a.putExtra("bundle_app_ad_from", this.f90956h);
        String str2 = this.f90957i;
        if (str2 != null) {
            a.putExtra("enter_from", str2);
        }
        long j = this.f90958j;
        if (j != 0) {
            a.putExtra("ad_id", j);
            a.putExtra("ad_type", this.f90962n);
            a.putExtra("ad_system_origin", this.f90963o);
            a.putExtra("bundle_download_app_extra", String.valueOf(this.f90958j));
            a.putExtra("landing_page_info", this.f90964p);
        }
        String a2 = C38497a.f90936a.mo65611a();
        if (!TextUtils.isEmpty(a2)) {
            a.putExtra("ad_js_url", a2);
        }
        a.putExtra("bundle_disable_download_dialog", this.f90965q);
        if (!TextUtils.isEmpty(this.f90966r)) {
            a.putExtra("bundle_is_from_app_ad", true);
            a.putExtra("bundle_download_url", this.f90966r);
            a.putExtra("aweme_package_name", this.f90967s);
            a.putExtra("bundle_ad_quick_app_url", this.f90968t);
            boolean isEmpty = TextUtils.isEmpty(this.f90969u);
            if (isEmpty) {
                str = this.f90971w;
            } else if (!isEmpty) {
                str = this.f90969u;
            } else {
                throw new C89376n();
            }
            a.putExtra("bundle_download_app_name", str);
            a.putExtra("bundle_download_mode", this.f90972x);
            a.putExtra("bundle_link_mode", this.f90973y);
            a.putExtra("bundle_support_multiple_download", this.f90974z);
            a.putExtra("bundle_web_url", this.f90970v);
            a.putExtra("bundle_web_title", this.f90971w);
            String str3 = this.f90938A;
            if (C37699a.m76283b(str3)) {
                String builder = Uri.parse(AbstractC37639a.AbstractC37640a.f89002a).buildUpon().toString();
                C89219l.m154716b(builder, "");
                str3 = C89361p.m154869a(str3, "__back_url__", builder, false);
            }
            a.putExtra("bundle_open_url", str3);
        }
        a.putExtra("aweme_json_extra", this.f90939B);
        long j2 = this.f90960l;
        if (j2 != 0) {
            a.putExtra("aweme_group_id", String.valueOf(j2));
        }
        long j3 = this.f90958j;
        if (j3 != 0) {
            a.putExtra("aweme_creative_id", String.valueOf(j3));
        }
        if (!TextUtils.isEmpty(this.f90967s)) {
            a.putExtra("aweme_package_name", this.f90967s);
        }
        if (this.f90940C) {
            a.putExtra("bundle_webview_background", C0643b.m2378c(this.f43206b, R.color.l));
        } else {
            a.putExtra("bundle_webview_background", -1);
        }
        a.putExtra("aweme_id", this.f90942E);
        a.putExtra("owner_id", this.f90943F);
        a.putExtra("bundle_forbidden_jump", true);
        a.putExtra("use_ordinary_web", this.f90944G);
        a.addFlags(268435456);
        a.putExtra("preload_channel_name", this.f90941D);
        a.putExtra("preload_scene", "feed");
        a.putExtra("preload_web_status", this.f90946I);
        a.putExtra("preload_is_web_url", this.f90947J);
        a.putExtra("web_type", this.f90948K);
        a.putExtra("enable_web_report", this.f90949L);
        if (this.f90950M != 1) {
            z = false;
        }
        a.putExtra("webview_progress_bar", z);
        a.putExtra("commerce_enter_from", this.f90951N);
        C18141a b = this.f43207c.mo28929b();
        if (b instanceof AwemeRawAd) {
            C38659ay.f91340a = (AwemeRawAd) b;
        }
        return a;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractC38498a(AbstractC18144c cVar, Bundle bundle) {
        super(cVar, bundle);
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(bundle, "");
        String string = bundle.getString("real_web_url", "");
        C89219l.m154716b(string, "");
        this.f90952d = string;
        this.f90954f = bundle.getString("title");
        this.f90955g = bundle.getBoolean("show_report");
        this.f90956h = bundle.getInt("app_ad_from");
        this.f90957i = bundle.getString("enter_from");
        this.f90958j = bundle.getLong("creative_id", 0);
        String string2 = bundle.getString("log_extra", "");
        C89219l.m154716b(string2, "");
        this.f90959k = string2;
        this.f90960l = bundle.getLong("group_id", 0);
        String string3 = bundle.getString("log_tag", "draw_ad");
        C89219l.m154716b(string3, "");
        this.f90961m = string3;
        this.f90962n = bundle.getString("ad_type");
        this.f90963o = bundle.getInt("ad_system_origin");
        this.f90964p = bundle.getString("landing_page_info");
        this.f90965q = bundle.getBoolean("disable_download_dialog");
        this.f90966r = bundle.getString("download_url");
        this.f90967s = bundle.getString("aweme_package_name");
        this.f90968t = bundle.getString("ad_quick_app_url");
        this.f90969u = bundle.getString("download_app_name");
        String string4 = bundle.getString("web_url", "");
        C89219l.m154716b(string4, "");
        this.f90970v = string4;
        this.f90971w = bundle.getString("web_title");
        this.f90972x = bundle.getInt("download_mode");
        this.f90973y = bundle.getInt("link_mode");
        this.f90974z = bundle.getBoolean("support_multiple_download");
        String string5 = bundle.getString("open_url", "");
        C89219l.m154716b(string5, "");
        this.f90938A = string5;
        String string6 = bundle.getString("aweme_json_extra", "");
        C89219l.m154716b(string6, "");
        this.f90939B = string6;
        this.f90940C = bundle.getBoolean("use_default_color");
        this.f90941D = bundle.getString("channel_name");
        String string7 = bundle.getString("aweme_id", "");
        C89219l.m154716b(string7, "");
        this.f90942E = string7;
        String string8 = bundle.getString("owner_id", "");
        C89219l.m154716b(string8, "");
        this.f90943F = string8;
        this.f90944G = bundle.getBoolean("use_ordinary_web");
        String string9 = bundle.getString("site_id", "");
        C89219l.m154716b(string9, "");
        this.f90945H = string9;
        this.f90946I = bundle.getInt("preload_web_status");
        this.f90947J = bundle.getInt("preload_is_web_url");
        this.f90948K = bundle.getInt("web_type");
        this.f90949L = bundle.getBoolean("enable_web_report");
        this.f90950M = bundle.getInt("webview_progress_bar");
        String string10 = bundle.getString("commerce_enter_from", "feedad");
        C89219l.m154716b(string10, "");
        this.f90951N = string10;
    }
}
