package com.p2082ss.android.ugc.aweme.specact.pendant.p3940h;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.UgActivityTasks;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.UgFrequentLimit;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.UgNewFeedPendant;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.UrlModel;
import com.p2082ss.android.ugc.aweme.pendant.C62766b;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.specact.pendant.h.a */
public final class C75060a {

    /* renamed from: a */
    public static final C75060a f168710a = new C75060a();

    private C75060a() {
    }

    static {
        Covode.recordClassIndex(87932);
    }

    /* renamed from: a */
    public static UgAwemeActivitySetting m131794a() {
        try {
            IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
            C89219l.m154716b(iESSettingsProxy, "");
            return iESSettingsProxy.getAwemeActivitySetting();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static String m131799c(UgActivityTasks ugActivityTasks) {
        C89219l.m154721d(ugActivityTasks, "");
        try {
            String taskId = ugActivityTasks.getTaskId();
            C89219l.m154716b(taskId, "");
            return taskId;
        } catch (C16041a unused) {
            return "";
        }
    }

    /* renamed from: d */
    public static String m131802d(UgAwemeActivitySetting ugAwemeActivitySetting) {
        C89219l.m154721d(ugAwemeActivitySetting, "");
        try {
            return ugAwemeActivitySetting.getActivityId();
        } catch (C16041a unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m131795a(UgActivityTasks ugActivityTasks) {
        C89219l.m154721d(ugActivityTasks, "");
        try {
            return ugActivityTasks.getFinishPush();
        } catch (C16041a unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static int m131797b(UgActivityTasks ugActivityTasks) {
        C89219l.m154721d(ugActivityTasks, "");
        try {
            Integer time = ugActivityTasks.getTime();
            C89219l.m154716b(time, "");
            return time.intValue();
        } catch (C16041a unused) {
            return 0;
        }
    }

    /* renamed from: c */
    public static boolean m131800c(UgAwemeActivitySetting ugAwemeActivitySetting) {
        C89219l.m154721d(ugAwemeActivitySetting, "");
        try {
            return TextUtils.isEmpty(ugAwemeActivitySetting.getActivityId());
        } catch (C16041a unused) {
            return true;
        }
    }

    /* renamed from: d */
    private static int m131801d(UgActivityTasks ugActivityTasks) {
        C89219l.m154721d(ugActivityTasks, "");
        try {
            Integer taskType = ugActivityTasks.getTaskType();
            C89219l.m154716b(taskType, "");
            return taskType.intValue();
        } catch (C16041a unused) {
            return -1;
        }
    }

    /* renamed from: h */
    public static String m131806h(UgAwemeActivitySetting ugAwemeActivitySetting) {
        if (ugAwemeActivitySetting == null) {
            return "";
        }
        try {
            UgNewFeedPendant newFeedPendant = ugAwemeActivitySetting.getNewFeedPendant();
            if (newFeedPendant == null) {
                return "";
            }
            String h5Link = newFeedPendant.getH5Link();
            if (h5Link == null) {
                return "";
            }
            return h5Link;
        } catch (C16041a unused) {
            return "";
        }
    }

    /* renamed from: i */
    public static String m131807i(UgAwemeActivitySetting ugAwemeActivitySetting) {
        if (ugAwemeActivitySetting == null) {
            return "";
        }
        try {
            UgNewFeedPendant newFeedPendant = ugAwemeActivitySetting.getNewFeedPendant();
            if (newFeedPendant == null) {
                return "";
            }
            String timerLink = newFeedPendant.getTimerLink();
            if (timerLink == null) {
                return "";
            }
            return timerLink;
        } catch (C16041a unused) {
            return "";
        }
    }

    /* renamed from: j */
    public static List<String> m131808j(UgAwemeActivitySetting ugAwemeActivitySetting) {
        List<String> promotionIds;
        if (ugAwemeActivitySetting != null) {
            try {
                UgNewFeedPendant newFeedPendant = ugAwemeActivitySetting.getNewFeedPendant();
                if (!(newFeedPendant == null || (promotionIds = newFeedPendant.getPromotionIds()) == null)) {
                    return promotionIds;
                }
            } catch (Throwable unused) {
                return new ArrayList();
            }
        }
        return new ArrayList();
    }

    /* renamed from: k */
    public static boolean m131809k(UgAwemeActivitySetting ugAwemeActivitySetting) {
        Boolean showInFollow;
        if (ugAwemeActivitySetting == null) {
            return false;
        }
        try {
            UgNewFeedPendant newFeedPendant = ugAwemeActivitySetting.getNewFeedPendant();
            if (newFeedPendant == null || (showInFollow = newFeedPendant.getShowInFollow()) == null) {
                return false;
            }
            return showInFollow.booleanValue();
        } catch (C16041a unused) {
            return false;
        }
    }

    /* renamed from: l */
    public static boolean m131810l(UgAwemeActivitySetting ugAwemeActivitySetting) {
        Boolean miniPendantClosable;
        if (ugAwemeActivitySetting == null) {
            return false;
        }
        try {
            UgNewFeedPendant newFeedPendant = ugAwemeActivitySetting.getNewFeedPendant();
            if (newFeedPendant == null || (miniPendantClosable = newFeedPendant.getMiniPendantClosable()) == null) {
                return false;
            }
            return miniPendantClosable.booleanValue();
        } catch (C16041a unused) {
            return false;
        }
    }

    /* renamed from: m */
    public static String m131811m(UgAwemeActivitySetting ugAwemeActivitySetting) {
        if (ugAwemeActivitySetting == null) {
            return "";
        }
        try {
            UgNewFeedPendant newFeedPendant = ugAwemeActivitySetting.getNewFeedPendant();
            if (newFeedPendant == null) {
                return "";
            }
            String timerLottieFileMd5 = newFeedPendant.getTimerLottieFileMd5();
            if (timerLottieFileMd5 == null) {
                return "";
            }
            return timerLottieFileMd5;
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: n */
    public static List<String> m131812n(UgAwemeActivitySetting ugAwemeActivitySetting) {
        List<String> barColor;
        if (ugAwemeActivitySetting != null) {
            try {
                UgNewFeedPendant newFeedPendant = ugAwemeActivitySetting.getNewFeedPendant();
                if (!(newFeedPendant == null || (barColor = newFeedPendant.getBarColor()) == null)) {
                    return barColor;
                }
            } catch (Throwable unused) {
                return new ArrayList();
            }
        }
        return new ArrayList();
    }

    /* renamed from: o */
    public static List<String> m131813o(UgAwemeActivitySetting ugAwemeActivitySetting) {
        List<String> bgColor;
        if (ugAwemeActivitySetting != null) {
            try {
                UgNewFeedPendant newFeedPendant = ugAwemeActivitySetting.getNewFeedPendant();
                if (!(newFeedPendant == null || (bgColor = newFeedPendant.getBgColor()) == null)) {
                    return bgColor;
                }
            } catch (Throwable unused) {
                return new ArrayList();
            }
        }
        return new ArrayList();
    }

    /* renamed from: r */
    public static List<String> m131816r(UgAwemeActivitySetting ugAwemeActivitySetting) {
        List<String> timerLottieFileZip;
        if (ugAwemeActivitySetting != null) {
            try {
                UgNewFeedPendant newFeedPendant = ugAwemeActivitySetting.getNewFeedPendant();
                if (!(newFeedPendant == null || (timerLottieFileZip = newFeedPendant.getTimerLottieFileZip()) == null)) {
                    return timerLottieFileZip;
                }
            } catch (Throwable unused) {
                return new ArrayList();
            }
        }
        return new ArrayList();
    }

    /* renamed from: s */
    public static int m131817s(UgAwemeActivitySetting ugAwemeActivitySetting) {
        C89219l.m154721d(ugAwemeActivitySetting, "");
        try {
            UgNewFeedPendant newFeedPendant = ugAwemeActivitySetting.getNewFeedPendant();
            C89219l.m154716b(newFeedPendant, "");
            Integer disappearAfter = newFeedPendant.getDisappearAfter();
            C89219l.m154716b(disappearAfter, "");
            return disappearAfter.intValue();
        } catch (C16041a unused) {
            return 3;
        }
    }

    /* renamed from: t */
    public static int m131818t(UgAwemeActivitySetting ugAwemeActivitySetting) {
        C89219l.m154721d(ugAwemeActivitySetting, "");
        try {
            UgNewFeedPendant newFeedPendant = ugAwemeActivitySetting.getNewFeedPendant();
            C89219l.m154716b(newFeedPendant, "");
            Integer dismissAfter = newFeedPendant.getDismissAfter();
            if (dismissAfter != null) {
                return dismissAfter.intValue();
            }
            return 0;
        } catch (C16041a unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public static boolean m131796a(UgAwemeActivitySetting ugAwemeActivitySetting) {
        C89219l.m154721d(ugAwemeActivitySetting, "");
        try {
            Boolean overallSwitch = ugAwemeActivitySetting.getOverallSwitch();
            C89219l.m154716b(overallSwitch, "");
            return overallSwitch.booleanValue();
        } catch (C16041a unused) {
            return true;
        }
    }

    /* renamed from: b */
    public static int m131798b(UgAwemeActivitySetting ugAwemeActivitySetting) {
        C89219l.m154721d(ugAwemeActivitySetting, "");
        try {
            Integer pendantVersion = ugAwemeActivitySetting.getPendantVersion();
            C89219l.m154716b(pendantVersion, "");
            return pendantVersion.intValue();
        } catch (C16041a unused) {
            return 0;
        }
    }

    /* renamed from: f */
    public static UgActivityTasks m131804f(UgAwemeActivitySetting ugAwemeActivitySetting) {
        C89219l.m154721d(ugAwemeActivitySetting, "");
        try {
            for (UgActivityTasks ugActivityTasks : ugAwemeActivitySetting.getActivityTasks()) {
                C89219l.m154716b(ugActivityTasks, "");
                if (m131801d(ugActivityTasks) == 3) {
                    return ugActivityTasks;
                }
            }
        } catch (C16041a unused) {
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        if (r0 != null) goto L_0x0011;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m131805g(com.p2082ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting r3) {
        /*
            java.lang.String r2 = ""
            if (r3 == 0) goto L_0x0010
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgNewFeedPendant r0 = r3.getNewFeedPendant()     // Catch:{ a -> 0x0022 }
            if (r0 == 0) goto L_0x0010
            java.lang.String r0 = r0.getH5Link()     // Catch:{ a -> 0x0022 }
            if (r0 != 0) goto L_0x0011
        L_0x0010:
            r0 = r2
        L_0x0011:
            android.net.Uri r1 = android.net.Uri.parse(r0)     // Catch:{ a -> 0x0022 }
            java.lang.String r0 = "event_keyword"
            java.lang.String r0 = r1.getQueryParameter(r0)     // Catch:{ a -> 0x0022 }
            if (r0 != 0) goto L_0x001e
            r0 = r2
        L_0x001e:
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, r2)     // Catch:{ a -> 0x0022 }
            r2 = r0
        L_0x0022:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.specact.pendant.p3940h.C75060a.m131805g(com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting):java.lang.String");
    }

    /* renamed from: p */
    public static String m131814p(UgAwemeActivitySetting ugAwemeActivitySetting) {
        UgNewFeedPendant ugNewFeedPendant;
        if (ugAwemeActivitySetting != null) {
            try {
                ugNewFeedPendant = ugAwemeActivitySetting.getNewFeedPendant();
            } catch (Exception unused) {
                return "";
            }
        } else {
            ugNewFeedPendant = null;
        }
        if (ugNewFeedPendant == null) {
            C89219l.m154715b();
        }
        UrlModel urlModel = ugNewFeedPendant.getResourceUrl().get(0);
        C89219l.m154716b(urlModel, "");
        String str = urlModel.getUrlList().get(0);
        C89219l.m154716b(str, "");
        return str;
    }

    /* renamed from: q */
    public static String m131815q(UgAwemeActivitySetting ugAwemeActivitySetting) {
        UgNewFeedPendant ugNewFeedPendant;
        if (ugAwemeActivitySetting != null) {
            try {
                ugNewFeedPendant = ugAwemeActivitySetting.getNewFeedPendant();
            } catch (Exception unused) {
                return "";
            }
        } else {
            ugNewFeedPendant = null;
        }
        if (ugNewFeedPendant == null) {
            C89219l.m154715b();
        }
        UrlModel urlModel = ugNewFeedPendant.getResourceUrl().get(1);
        C89219l.m154716b(urlModel, "");
        String str = urlModel.getUrlList().get(0);
        C89219l.m154716b(str, "");
        return str;
    }

    /* renamed from: v */
    public static boolean m131820v(UgAwemeActivitySetting ugAwemeActivitySetting) {
        C89219l.m154721d(ugAwemeActivitySetting, "");
        try {
            UgNewFeedPendant newFeedPendant = ugAwemeActivitySetting.getNewFeedPendant();
            C89219l.m154716b(newFeedPendant, "");
            Integer showTimes = newFeedPendant.getShowTimes();
            C89219l.m154716b(showTimes, "");
            if (!C62766b.C62768b.f142302a.mo100737a(showTimes.intValue(), C17867d.m33078a())) {
                return false;
            }
            return true;
        } catch (C16041a unused) {
            return true;
        }
    }

    /* renamed from: e */
    public static List<UgActivityTasks> m131803e(UgAwemeActivitySetting ugAwemeActivitySetting) {
        C89219l.m154721d(ugAwemeActivitySetting, "");
        try {
            List<UgActivityTasks> activityTasks = ugAwemeActivitySetting.getActivityTasks();
            ArrayList arrayList = new ArrayList();
            if (activityTasks != null && (!activityTasks.isEmpty())) {
                for (UgActivityTasks ugActivityTasks : activityTasks) {
                    C89219l.m154716b(ugActivityTasks, "");
                    if (m131801d(ugActivityTasks) == 1 && C89219l.m154714a((Object) ugActivityTasks.getShow(), (Object) true) && ugActivityTasks.getTime() != null) {
                        arrayList.add(ugActivityTasks);
                    }
                }
            }
            return arrayList;
        } catch (Throwable unused) {
            return new ArrayList();
        }
    }

    /* renamed from: u */
    public static boolean m131819u(UgAwemeActivitySetting ugAwemeActivitySetting) {
        C89219l.m154721d(ugAwemeActivitySetting, "");
        try {
            UgNewFeedPendant newFeedPendant = ugAwemeActivitySetting.getNewFeedPendant();
            C89219l.m154716b(newFeedPendant, "");
            UgFrequentLimit frequentLimit = newFeedPendant.getFrequentLimit();
            C89219l.m154716b(frequentLimit, "");
            Integer daysWindow = frequentLimit.getDaysWindow();
            UgNewFeedPendant newFeedPendant2 = ugAwemeActivitySetting.getNewFeedPendant();
            C89219l.m154716b(newFeedPendant2, "");
            UgFrequentLimit frequentLimit2 = newFeedPendant2.getFrequentLimit();
            C89219l.m154716b(frequentLimit2, "");
            Integer maxClose = frequentLimit2.getMaxClose();
            UgNewFeedPendant newFeedPendant3 = ugAwemeActivitySetting.getNewFeedPendant();
            C89219l.m154716b(newFeedPendant3, "");
            UgFrequentLimit frequentLimit3 = newFeedPendant3.getFrequentLimit();
            C89219l.m154716b(frequentLimit3, "");
            Integer daysNoShow = frequentLimit3.getDaysNoShow();
            C62766b bVar = C62766b.C62768b.f142302a;
            C89219l.m154716b(daysWindow, "");
            int intValue = daysWindow.intValue();
            C89219l.m154716b(maxClose, "");
            int intValue2 = maxClose.intValue();
            C89219l.m154716b(daysNoShow, "");
            if (!bVar.mo100736a(intValue, intValue2, daysNoShow.intValue())) {
                return false;
            }
            return true;
        } catch (C16041a unused) {
            return true;
        }
    }
}
