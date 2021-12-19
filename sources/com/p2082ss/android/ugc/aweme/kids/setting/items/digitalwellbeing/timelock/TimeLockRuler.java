package com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.base.p2379ui.session.AbstractC34709b;
import com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode.C57878a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;

/* renamed from: com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.TimeLockRuler */
public class TimeLockRuler {
    public static boolean sLastContentFilterState;

    static {
        Covode.recordClassIndex(67899);
    }

    public static boolean isSelfContentFilterOn() {
        return false;
    }

    public static boolean isTeenModeON() {
        return false;
    }

    public static boolean isTeenagerAbEnable() {
        return true;
    }

    public static int getLockTimeInMin() {
        return C57878a.m104639b();
    }

    public static boolean isContentFilterOn() {
        boolean isSelfContentFilterOn = isSelfContentFilterOn();
        sLastContentFilterState = isSelfContentFilterOn;
        return isSelfContentFilterOn;
    }

    public static boolean isRuleValid() {
        return C57878a.m104640c();
    }

    public static boolean isSelfTimeLockOn() {
        return C57878a.m104638a();
    }

    public static boolean isTimeLockOn() {
        return isSelfTimeLockOn();
    }

    public static String getContentFilterFlagText() {
        return Integer.toString(getContentFilterFlag());
    }

    public static int getTeenageModeStatus() {
        if (isContentFilterOn()) {
            return 1;
        }
        return 0;
    }

    public static int getContentFilterFlag() {
        if (!isContentFilterOn()) {
            return 0;
        }
        if (isTeenagerAbEnable()) {
            return 2;
        }
        return 1;
    }

    public static void disableStartActivityIfNeeded(Activity activity) {
        if (isTeenModeON() && activity != null && !activity.isFinishing()) {
            activity.finish();
        }
    }

    public static boolean isEnableShowTeenageTip(int i) {
        if (!isTeenModeON()) {
            return false;
        }
        new C79459a(C17867d.m33078a()).mo123050a(i).mo123053a();
        return true;
    }

    public static void doTeenagerModeAction(Context context, String str, final Runnable runnable) {
        if (isSelfContentFilterOn()) {
            C57887b.m104657a(new AbstractC34709b<Boolean>() {
                /* class com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.TimeLockRuler.C578851 */

                static {
                    Covode.recordClassIndex(67900);
                }

                @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.session.AbstractC34709b
                /* renamed from: a */
                public final /* synthetic */ void mo61385a() {
                    runnable.run();
                }
            }, str);
        } else {
            runnable.run();
        }
    }
}
