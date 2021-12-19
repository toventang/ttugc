package com.p2082ss.android.ugc.aweme.feed.p2969u;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.C33748g;
import com.p2082ss.android.ugc.aweme.feed.api.AwemeStatsApi;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.feed.u.b */
final /* synthetic */ class CallableC49965b implements Callable {

    /* renamed from: a */
    private final Object[] f115168a;

    static {
        Covode.recordClassIndex(59077);
    }

    CallableC49965b(Object[] objArr) {
        this.f115168a = objArr;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C49966c cVar = (C49966c) this.f115168a[0];
        if (C33748g.m69093a()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(cVar.f115179a)) {
            hashMap.put("item_id", cVar.f115179a);
        }
        if (cVar.f115180b > 0) {
            hashMap.put("share_delta", String.valueOf(cVar.f115180b));
        }
        if (cVar.f115181c > 0) {
            hashMap.put("play_delta", String.valueOf(cVar.f115181c));
        }
        if (cVar.f115182d > 0) {
            hashMap.put("download_delta", String.valueOf(cVar.f115182d));
        }
        if (cVar.f115183e >= 0) {
            hashMap.put("aweme_type", String.valueOf(cVar.f115183e));
        }
        if (cVar.f115184f >= 0) {
            hashMap.put("tab_type", String.valueOf(cVar.f115184f));
        }
        if (cVar.f115185g > 0) {
            hashMap.put("item_type", String.valueOf(cVar.f115185g));
        }
        String str = cVar.f115186h;
        if (str != null) {
            hashMap.put("stats_channel", str);
        }
        if (cVar.f115187i >= 0) {
            hashMap.put("follow_status", String.valueOf(cVar.f115187i));
        }
        if (cVar.f115188j >= 0) {
            hashMap.put("follower_status", String.valueOf(cVar.f115188j));
        }
        if (!TextUtils.isEmpty(cVar.f115189k)) {
            hashMap.put("origin_item_id", cVar.f115189k);
        }
        if (!TextUtils.isEmpty(cVar.f115190l)) {
            hashMap.put("origin_author_id", cVar.f115190l);
        }
        if (cVar.f115191m >= 0) {
            hashMap.put("origin_follow_status", String.valueOf(cVar.f115191m));
        }
        if (cVar.f115192n >= 0) {
            hashMap.put("impr_order", String.valueOf(cVar.f115192n));
        }
        if (cVar.f115193o >= 0) {
            hashMap.put("last_impr_order", String.valueOf(cVar.f115193o));
        }
        String str2 = cVar.f115194p;
        if (str2 != null) {
            hashMap.put("order", str2);
        }
        String str3 = cVar.f115195q;
        if (str3 != null) {
            hashMap.put("request_id", str3);
        }
        if (cVar.f115196r > -1) {
            hashMap.put("session_id", String.valueOf(cVar.f115196r));
        }
        if (cVar.f115197s >= 0) {
            hashMap.put("origin_follower_status", String.valueOf(cVar.f115197s));
        }
        hashMap.put("sync_origin", String.valueOf(cVar.f115198t));
        hashMap.put("pre_item_id", cVar.f115199u);
        hashMap.put("pre_item_playtime", cVar.f115200v);
        hashMap.put("pre_hot_sentence", cVar.f115201w);
        if (!TextUtils.isEmpty(cVar.f115202x)) {
            hashMap.put("creative_id", cVar.f115202x);
        }
        if (!TextUtils.isEmpty(cVar.f115204z)) {
            hashMap.put("ad_id", cVar.f115204z);
        }
        if (!TextUtils.isEmpty(cVar.f115203y)) {
            hashMap.put("log_extra", cVar.f115203y);
        }
        if (!TextUtils.isEmpty(cVar.f115169A)) {
            hashMap.put("user_agent", cVar.f115169A);
        }
        if (!TextUtils.isEmpty(cVar.f115170B)) {
            hashMap.put("access", cVar.f115170B);
        }
        if (!TextUtils.isEmpty(cVar.f115172D)) {
            hashMap.put("google_aid", cVar.f115172D);
        }
        if (!TextUtils.isEmpty(cVar.f115171C)) {
            hashMap.put("package", cVar.f115171C);
        }
        if (!TextUtils.isEmpty(cVar.f115173E)) {
            hashMap.put("previous_page", cVar.f115173E);
        }
        if (!TextUtils.isEmpty(cVar.f115174F)) {
            hashMap.put("enter_from", cVar.f115174F);
        }
        if (cVar.f115175G == 1) {
            hashMap.put("is_ba", String.valueOf(cVar.f115175G));
        }
        if (!TextUtils.isEmpty(cVar.f115176H)) {
            hashMap.put("item_distribute_source", cVar.f115176H);
        }
        hashMap.put("is_ad", String.valueOf(cVar.f115177I));
        if (cVar.f115178J > 0) {
            hashMap.put("item_source_category", String.valueOf(cVar.f115178J));
        }
        hashMap.put("first_install_time", C52912c.f121688a.f121689b.getFirstInstallTime().toString());
        hashMap.put("action_time", String.valueOf(System.currentTimeMillis() / 1000));
        AwemeStatsApi.f111976a.awemeStatsReport(hashMap).get();
        return null;
    }
}
