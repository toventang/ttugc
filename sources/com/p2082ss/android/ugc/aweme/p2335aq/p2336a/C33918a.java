package com.p2082ss.android.ugc.aweme.p2335aq.p2336a;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.google.gson.p2019b.C27895a;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.C33594aj;
import com.p2082ss.android.ugc.aweme.app.C33842s;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.p4243y.C81779c;
import com.p2082ss.android.ugc.aweme.p4243y.C81783d;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.aq.a.a */
public final class C33918a {

    /* renamed from: a */
    public static final int f80227a = R.id.e0x;

    /* renamed from: b */
    public static final int f80228b = R.id.bi0;

    /* renamed from: c */
    public static int f80229c = 1;

    /* renamed from: d */
    public static volatile C81779c f80230d;

    /* renamed from: d */
    public static C81783d m69456d() {
        C81779c b = m69453b();
        if (b == null) {
            return null;
        }
        return b.f182871e;
    }

    /* renamed from: e */
    private static boolean m69457e() {
        if (m69453b() == null || !m69450a()) {
            return false;
        }
        return true;
    }

    static {
        Covode.recordClassIndex(40837);
    }

    /* renamed from: a */
    public static boolean m69450a() {
        if (m69453b() == null || !m69453b().f182870d) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m69455c() {
        if (m69453b() == null || m69453b().f182871e == null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static C81779c m69453b() {
        if (f80230d != null) {
            return f80230d;
        }
        String c = C33842s.C33843a.f80132a.mo60077u().mo59941c();
        if (TextUtils.isEmpty(c)) {
            return null;
        }
        try {
            f80230d = (C81779c) new C27910f().mo46670a(c, C81779c.class);
        } catch (Exception unused) {
            f80230d = null;
        }
        return f80230d;
    }

    /* renamed from: a */
    private static ArrayList<String> m69449a(String str) {
        if (str == null || str.isEmpty()) {
            return new ArrayList<>();
        }
        ArrayList<String> arrayList = new ArrayList<>();
        String[] split = str.split(",");
        for (String str2 : split) {
            if (!arrayList.contains(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static boolean m69454b(Aweme aweme) {
        String str;
        List<String> list;
        if (m69457e() && aweme != null) {
            String stickerIDs = aweme.getStickerIDs();
            C81779c b = m69453b();
            if (b != null) {
                List<String> list2 = b.f182876j;
                if (list2 != null) {
                    Iterator<String> it = list2.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                    ArrayList<String> a = m69449a(stickerIDs);
                    Iterator<String> it2 = a.iterator();
                    while (it2.hasNext()) {
                        it2.next();
                    }
                    for (String str2 : a) {
                        if (list2.contains(str2)) {
                            return true;
                        }
                    }
                }
                if (!(aweme.getUploadMiscInfoStruct() == null || (str = aweme.getUploadMiscInfoStruct().mvThemeId) == null || (list = b.f182878l) == null)) {
                    Iterator<String> it3 = list.iterator();
                    while (it3.hasNext()) {
                        it3.next();
                    }
                    if (list.contains(str)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m69452a(Aweme aweme) {
        if (!(!m69457e() || aweme == null || aweme.getAuthor() == null)) {
            if (C31575b.m65865g().isMe(aweme.getAuthor().getUid())) {
                User curUser = C31575b.m65865g().getCurUser();
                if (curUser != null && !curUser.isSecret()) {
                    List list = null;
                    C33842s sVar = C33842s.C33843a.f80132a;
                    if (sVar.f80110e == null) {
                        sVar.f80110e = new C33594aj<>("festival_share_donation_list", "");
                    }
                    try {
                        list = (List) new C27910f().mo46671a(sVar.f80110e.mo59941c(), new C27895a<List<String>>() {
                            /* class com.p2082ss.android.ugc.aweme.p2335aq.p2336a.C33918a.C339191 */

                            static {
                                Covode.recordClassIndex(40838);
                            }
                        }.type);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    if (C13603b.m24435a((Collection) list) || !list.contains(aweme.getAid())) {
                        return false;
                    }
                    return true;
                }
                return false;
            } else if (aweme.getAuthor().isSecret() || !m69454b(aweme)) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m69451a(long j, long j2) {
        boolean z;
        boolean z2;
        Calendar instance = Calendar.getInstance();
        Calendar instance2 = Calendar.getInstance();
        instance.setTimeInMillis(j);
        instance2.setTimeInMillis(j2);
        int i = instance.get(1);
        int i2 = instance2.get(1);
        if (i2 > i) {
            z = true;
        } else {
            z = false;
        }
        if (i2 != i || instance2.get(6) - instance.get(6) <= 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z || z2) {
            return true;
        }
        return false;
    }
}
