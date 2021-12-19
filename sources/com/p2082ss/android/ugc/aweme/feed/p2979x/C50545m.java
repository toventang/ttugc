package com.p2082ss.android.ugc.aweme.feed.p2979x;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.common.AbstractC39159o;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39105f;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.x.m */
public final class C50545m {
    static {
        Covode.recordClassIndex(59692);
    }

    /* renamed from: c */
    public static Aweme m94766c(Aweme aweme) {
        if (aweme == null) {
            return null;
        }
        if (aweme.isForwardAweme()) {
            return aweme.getForwardItem();
        }
        return aweme;
    }

    /* renamed from: d */
    public static boolean m94767d(Aweme aweme) {
        if (aweme == null || aweme.getAwemeType() != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static String m94769f(Aweme aweme) {
        if (aweme != null) {
            return aweme.getAid();
        }
        return "";
    }

    /* renamed from: a */
    public static boolean m94762a(Aweme aweme) {
        User author;
        if (aweme == null || (author = aweme.getAuthor()) == null) {
            return false;
        }
        return TextUtils.equals(author.getUid(), C31575b.m65865g().getCurUser().getUid());
    }

    /* renamed from: b */
    public static boolean m94765b(Aweme aweme) {
        if (aweme == null || aweme.getHotListStruct() == null || aweme.getHotListStruct().getType() != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static boolean m94768e(Aweme aweme) {
        if (aweme == null || aweme.getStatus() == null) {
            return false;
        }
        return aweme.getStatus().isDelete();
    }

    /* renamed from: g */
    public static boolean m94770g(Aweme aweme) {
        if (aweme == null || aweme.getAwemeRiskModel() == null) {
            return false;
        }
        if (aweme.getAwemeRiskModel().isWarn() || aweme.getAwemeRiskModel().isNotice()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static Aweme m94761a(String str) {
        Aweme b = AwemeService.m70060b().mo60684b(str);
        if (b != null) {
            return b;
        }
        Aweme a = AwemeService.m70060b().mo60679a(str);
        if (a != null) {
            return a;
        }
        C51423a.m95791b(6, "DeleteAweme", "getAweme " + str + " is null, mock one");
        Aweme aweme = new Aweme();
        aweme.setAid(str);
        return aweme;
    }

    /* renamed from: a */
    public static int m94760a(List<Aweme> list, Aweme aweme) {
        if (!(aweme == null || aweme.getAid() == null || list == null || list.isEmpty())) {
            String aid = aweme.getAid();
            for (int i = 0; i < list.size(); i++) {
                Aweme aweme2 = list.get(i);
                if (aweme2 != null && aid.equals(aweme2.getAid())) {
                    return i;
                }
            }
        }
        return -1;
    }

    /* renamed from: b */
    public static int m94764b(List<Aweme> list, Aweme aweme) {
        if (!(aweme == null || aweme.getAid() == null || list == null || list.isEmpty())) {
            String aid = aweme.getAid();
            for (int size = list.size() - 1; size >= 0; size--) {
                Aweme aweme2 = list.get(size);
                if (aweme2 != null && aid.equals(aweme2.getAid())) {
                    return size;
                }
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static boolean m94763a(Collection<Aweme> collection, Aweme aweme, List<AbstractC39159o> list) {
        if (aweme == null || aweme.getAid() == null || collection == null || collection.isEmpty()) {
            C51423a.m95784a(6, "DeleteAweme", "aweme is null or items is null, delete failed");
            return true;
        }
        int i = -1;
        String aid = aweme.getAid();
        Iterator<Aweme> it = collection.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Aweme next = it.next();
            if (next != null && aid.equals(next.getAid())) {
                if (!aweme.isLiveNoDeduplicate()) {
                    it.remove();
                    break;
                } else if (TextUtils.equals(aweme.getUniqueId(), next.getUniqueId())) {
                    it.remove();
                    break;
                }
            }
            i2++;
        }
        i = i2;
        C51423a.m95791b(6, "DeleteAweme", "delete aweme : " + aid + ", index is " + i);
        if (i < 0) {
            return false;
        }
        if (!C13603b.m24435a((Collection) list)) {
            for (AbstractC39159o oVar : list) {
                if (oVar instanceof AbstractC39105f) {
                    ((AbstractC39105f) oVar).mo59498a(i);
                }
            }
        }
        return true;
    }
}
