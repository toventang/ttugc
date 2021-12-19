package com.p2082ss.android.ugc.aweme.feed;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.awemeservice.RequestIdService;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2969u.C49955a;
import com.p2082ss.android.ugc.aweme.feed.p2969u.C49966c;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.tcm.impl.service.TcmServiceImpl;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;

/* renamed from: com.ss.android.ugc.aweme.feed.c */
public final class C49291c {

    /* renamed from: a */
    public static String f113297a;

    /* renamed from: b */
    public static String f113298b = "";

    /* renamed from: c */
    private static C49955a f113299c;

    /* renamed from: d */
    private static String f113300d;

    /* renamed from: e */
    private static Long f113301e = Long.valueOf(System.currentTimeMillis());

    /* renamed from: f */
    private static int f113302f = -1;

    /* renamed from: g */
    private static String f113303g = "";

    static {
        Covode.recordClassIndex(58089);
    }

    /* renamed from: a */
    private static String m92328a(Aweme aweme) {
        return RequestIdService.m70076a().mo60695b(aweme, 0).optString("order");
    }

    /* renamed from: a */
    public static void m92329a(int i, String str, int i2) {
        AbstractC88979t.m154294a(new C49417d(i, str, i2)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143300g();
    }

    /* renamed from: a */
    public static void m92330a(String str, int i, String str2, int i2, Aweme aweme, String str3) {
        int i3;
        int i4;
        User author;
        int i5 = -1;
        if (aweme == null || (author = aweme.getAuthor()) == null) {
            i3 = -1;
            i4 = -1;
        } else {
            i4 = author.getFollowStatus();
            i3 = author.getFollowerStatus();
        }
        if (f113299c == null) {
            f113299c = new C49955a();
        }
        C49966c.C49967a aVar = new C49966c.C49967a();
        aVar.f115215a = str2;
        aVar.f115217c = 1;
        aVar.f115223i = i4;
        aVar.f115224j = i3;
        aVar.f115219e = i2;
        if (!(aweme == null || !aweme.isForwardAweme() || aweme.getForwardItem() == null)) {
            aVar.f115225k = aweme.getForwardItem().getAid();
            aVar.f115226l = aweme.getForwardItem().getAuthorUid();
            aVar.f115227m = aweme.getForwardItem().getFollowStatus();
            aVar.f115233s = aweme.getForwardItem().getAuthor().getFollowerStatus();
            aVar.f115234t = false;
        }
        if (!TextUtils.isEmpty(f113300d) && !TextUtils.isEmpty(f113297a)) {
            aVar.mo85006a(f113300d);
            aVar.mo85009b(f113297a);
            if (!TextUtils.isEmpty(f113298b)) {
                aVar.mo85010c(f113298b);
            }
        }
        aVar.mo85011d(str);
        if (TcmServiceImpl.m135859j().mo121256a(aweme, str)) {
            aVar.f115206B = 1;
        } else {
            aVar.f115206B = 0;
        }
        f113300d = str2;
        if (i == 0) {
            if (aweme != null && (aweme.getAwemeType() != 40 || !aweme.getAuthorUid().equalsIgnoreCase(f113303g))) {
                aVar.f115229o = f113302f;
                aVar.f115228n = aweme.getAwemePosition();
                f113302f = aweme.getAwemePosition();
                aVar.f115230p = m92328a(aweme);
                aVar.f115231q = str3;
                aVar.f115232r = f113301e.longValue();
                aVar.mo85012e(aweme.getItemDistributeSource());
                aVar.f115207C = aweme.getItemSourceCategory();
                aVar.mo85007a(aweme.isAd());
                if (aweme.getAwemeType() == 40) {
                    f113303g = aweme.getAuthorUid();
                } else {
                    f113303g = "";
                }
            }
            i5 = 0;
        } else if (i == 1) {
            i5 = 1;
        } else if (i == 2 || i == 7) {
            i5 = 2;
        } else if (i == 22) {
            i5 = 10;
        } else if (i == 27) {
            i5 = 12;
        } else if (i == 5000) {
            i5 = 7;
        } else if (i != 8000) {
            if (i != 1000) {
                if (i != 1001) {
                    if (i != 2000) {
                        if (i != 2001) {
                            if (i == 3002) {
                                i5 = 5;
                            } else if (i == 3003) {
                                i5 = 9;
                            } else if (i == 4000) {
                                i5 = 6;
                            } else if (i == 4001) {
                                i5 = 8;
                            }
                        }
                    }
                }
                i5 = 4;
            }
            i5 = 3;
        } else {
            i5 = 20;
        }
        aVar.f115220f = i5;
        f113299c.sendRequest(aVar.mo85008a());
    }
}
