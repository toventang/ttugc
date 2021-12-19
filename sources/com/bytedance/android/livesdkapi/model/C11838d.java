package com.bytedance.android.livesdkapi.model;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.AbstractC2994b;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.p425aa.C6544e;
import com.bytedance.android.livesdk.p561j.C9024ar;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;

/* renamed from: com.bytedance.android.livesdkapi.model.d */
public class C11838d {

    /* renamed from: a */
    public String f28202a = "half_screen";

    /* renamed from: b */
    public long f28203b;

    /* renamed from: c */
    public long f28204c;

    /* renamed from: d */
    public long f28205d;

    /* renamed from: e */
    public int f28206e;

    /* renamed from: f */
    public int f28207f;

    /* renamed from: g */
    public String f28208g;

    /* renamed from: h */
    public String f28209h;

    /* renamed from: i */
    public String f28210i = "";

    /* renamed from: j */
    public String f28211j = "";

    /* renamed from: k */
    public String f28212k = "";

    /* renamed from: l */
    public String f28213l = "";

    /* renamed from: m */
    public boolean f28214m = true;

    /* renamed from: n */
    public final String f28215n;

    /* renamed from: o */
    public String f28216o = "1";

    /* renamed from: p */
    public long f28217p;

    /* renamed from: q */
    public String f28218q;

    /* renamed from: r */
    public boolean f28219r;

    /* renamed from: s */
    public String f28220s;

    static {
        Covode.recordClassIndex(13540);
    }

    /* renamed from: a */
    public final String mo18910a() {
        AbstractC2994b a;
        if (C11115u.m19743a().mo17915b() == null || (a = C11115u.m19743a().mo17915b().mo13147a()) == null) {
            return "";
        }
        if (a.getId() == this.f28204c) {
            return "anchor";
        }
        if (a.getUserAttr() != null && a.getUserAttr().f23192b) {
            return "admin";
        }
        if (this.f28219r) {
            return "guest_viewer";
        }
        return "viewer";
    }

    /* renamed from: a */
    public final String mo18911a(String str) {
        String str2;
        String str3;
        String str4 = "";
        if (TextUtils.isEmpty(str)) {
            return str4;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.appendQueryParameter("room_id", String.valueOf(this.f28203b));
        buildUpon.appendQueryParameter("anchor_id", String.valueOf(this.f28204c));
        if (TextUtils.isEmpty(this.f28208g)) {
            buildUpon.appendQueryParameter("reported_user_id", String.valueOf(this.f28205d));
        } else {
            buildUpon.appendQueryParameter("sec_reported_user_id", this.f28208g);
        }
        if (DataChannelGlobal.f42558d.mo28324b(C9024ar.class) != null) {
            str4 = ((Hashtag) DataChannelGlobal.f42558d.mo28324b(C9024ar.class)).title;
            str2 = String.valueOf(((Hashtag) DataChannelGlobal.f42558d.mo28324b(C9024ar.class)).f23083id);
        } else {
            str2 = str4;
        }
        buildUpon.appendQueryParameter("to_user_id", String.valueOf(this.f28205d));
        buildUpon.appendQueryParameter("admin_type", mo18910a());
        buildUpon.appendQueryParameter("report_type", this.f28215n);
        buildUpon.appendQueryParameter("request_page", this.f28209h);
        buildUpon.appendQueryParameter("enter_from_merge", this.f28210i);
        buildUpon.appendQueryParameter("enter_method", this.f28211j);
        if (this.f28214m) {
            str3 = "0";
        } else {
            str3 = "1";
        }
        buildUpon.appendQueryParameter("landscape", str3);
        buildUpon.appendQueryParameter("action_type", this.f28212k);
        buildUpon.appendQueryParameter("event_page", "live_detail");
        buildUpon.appendQueryParameter("hashtag_type", str4);
        buildUpon.appendQueryParameter("hashtag_id", str2);
        buildUpon.appendQueryParameter("event_page", "live_detail");
        buildUpon.appendQueryParameter("page_style", this.f28202a);
        buildUpon.appendQueryParameter("timestamp", String.valueOf(System.currentTimeMillis()));
        if (!TextUtils.isEmpty(this.f28220s)) {
            buildUpon.appendQueryParameter("scene", this.f28220s);
        }
        if (!TextUtils.isEmpty(this.f28213l)) {
            buildUpon.appendQueryParameter("request_id", this.f28213l);
        }
        if ("report_message".equals(this.f28215n)) {
            buildUpon.appendQueryParameter("chat_type", String.valueOf(this.f28216o));
            long j = this.f28217p;
            if (j > 0) {
                buildUpon.appendQueryParameter("msg_id", String.valueOf(j));
            }
            if (!TextUtils.isEmpty(this.f28218q)) {
                buildUpon.appendQueryParameter("content", this.f28218q);
            }
        }
        if (!TextUtils.isEmpty(C6544e.m13988b())) {
            buildUpon.appendQueryParameter("toplive_position", C6544e.m13988b());
        }
        return buildUpon.toString();
    }

    public C11838d(long j, long j2, long j3, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f28203b = j;
        this.f28204c = j2;
        this.f28205d = j3;
        this.f28208g = str;
        this.f28209h = str2;
        this.f28215n = str6;
        this.f28210i = str3;
        this.f28211j = str4;
        this.f28212k = str5;
        this.f28213l = str7;
    }

    public C11838d(long j, long j2, long j3, String str, String str2, long j4, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.f28203b = j;
        this.f28204c = j2;
        this.f28205d = j3;
        this.f28208g = str;
        this.f28209h = str2;
        this.f28217p = j4;
        this.f28218q = str3;
        this.f28215n = str7;
        this.f28216o = str8;
        this.f28213l = str4;
        this.f28210i = str5;
        this.f28211j = str6;
    }
}
