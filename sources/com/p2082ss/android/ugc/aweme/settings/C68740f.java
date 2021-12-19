package com.p2082ss.android.ugc.aweme.settings;

import android.net.Uri;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.p1172f.p1177b.C16857a;
import com.p2082ss.android.ugc.aweme.setting.C68719x;
import com.p2082ss.android.ugc.aweme.settings.C68738e;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.settings.f */
public final class C68740f {

    /* renamed from: a */
    public static final C68740f f153769a = new C68740f();

    private C68740f() {
    }

    static {
        Covode.recordClassIndex(81009);
    }

    /* renamed from: a */
    public static int m121172a() {
        C68738e.C68739a aVar = C68738e.f153765b;
        if (aVar != null) {
            return aVar.f153768b;
        }
        return LiveFeedRefreshTimeSetting.DEFAULT;
    }

    /* renamed from: a */
    public static String m121173a(String str, String str2) {
        String d = C68719x.m121155d();
        if (d == null) {
            return null;
        }
        Uri parse = Uri.parse(d);
        if (str == null) {
            C89219l.m154716b(parse, "");
            str = C16857a.m31078a(parse, "enter_from");
        }
        C89219l.m154716b(parse, "");
        return C16857a.m31077a(parse, C89070n.m154522b("enter_from", "enter_method")).buildUpon().appendQueryParameter("enter_from", str).appendQueryParameter("enter_method", str2).build().toString();
    }
}
