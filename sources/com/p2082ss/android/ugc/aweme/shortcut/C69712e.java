package com.p2082ss.android.ugc.aweme.shortcut;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.text.TextUtils;
import com.C1764a;
import com.bytedance.android.livesdkapi.C11755f;
import com.bytedance.android.livesdkapi.service.AbstractC11846d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.p1007g.p1009b.C14852a;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.UgShortcutInfo;
import com.p2082ss.android.ugc.aweme.shortcut.ShortcutProxyActivity;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortcut.e */
public final class C69712e {

    /* renamed from: a */
    static Class<?> f155623a;

    /* renamed from: b */
    public static final C69712e f155624b = new C69712e();

    private C69712e() {
    }

    /* renamed from: f */
    private static boolean m123130f() {
        Boolean a = C14852a.m27274a();
        C89219l.m154716b(a, "");
        return a.booleanValue();
    }

    static {
        Covode.recordClassIndex(82090);
        AbstractC11846d a = C11755f.m20713a();
        if (a != null) {
            a.mo12997a(C697131.f155625a);
        }
    }

    /* renamed from: b */
    static int m123126b() {
        UgShortcutInfo shortcutInfo;
        try {
            IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
            C89219l.m154716b(iESSettingsProxy, "");
            UgAwemeActivitySetting awemeActivitySetting = iESSettingsProxy.getAwemeActivitySetting();
            if (awemeActivitySetting == null || (shortcutInfo = awemeActivitySetting.getShortcutInfo()) == null) {
                return 6;
            }
            return shortcutInfo.getWithdrawalReqInterval();
        } catch (Exception unused) {
            return 6;
        }
    }

    /* renamed from: c */
    private static String m123127c() {
        UgShortcutInfo shortcutInfo;
        try {
            IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
            C89219l.m154716b(iESSettingsProxy, "");
            UgAwemeActivitySetting awemeActivitySetting = iESSettingsProxy.getAwemeActivitySetting();
            if (awemeActivitySetting == null || (shortcutInfo = awemeActivitySetting.getShortcutInfo()) == null) {
                return null;
            }
            return shortcutInfo.getWillGetMost();
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: d */
    private static String m123128d() {
        UgShortcutInfo shortcutInfo;
        try {
            IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
            C89219l.m154716b(iESSettingsProxy, "");
            UgAwemeActivitySetting awemeActivitySetting = iESSettingsProxy.getAwemeActivitySetting();
            if (awemeActivitySetting == null || (shortcutInfo = awemeActivitySetting.getShortcutInfo()) == null) {
                return null;
            }
            return shortcutInfo.getH5Link();
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: a */
    static boolean m123125a() {
        boolean z;
        UgShortcutInfo ugShortcutInfo;
        boolean z2;
        Boolean overallSwitch;
        try {
            IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
            C89219l.m154716b(iESSettingsProxy, "");
            UgAwemeActivitySetting awemeActivitySetting = iESSettingsProxy.getAwemeActivitySetting();
            if (awemeActivitySetting == null || (overallSwitch = awemeActivitySetting.getOverallSwitch()) == null) {
                z = false;
            } else {
                z = overallSwitch.booleanValue();
            }
            IESSettingsProxy iESSettingsProxy2 = C52912c.f121688a.f121689b;
            C89219l.m154716b(iESSettingsProxy2, "");
            UgAwemeActivitySetting awemeActivitySetting2 = iESSettingsProxy2.getAwemeActivitySetting();
            if (awemeActivitySetting2 != null) {
                ugShortcutInfo = awemeActivitySetting2.getShortcutInfo();
            } else {
                ugShortcutInfo = null;
            }
            if (ugShortcutInfo != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z || !z2) {
                return false;
            }
            return true;
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortcut.e$a */
    public static final class CallableC69714a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ boolean f155626a;

        /* renamed from: b */
        final /* synthetic */ Context f155627b;

        /* renamed from: c */
        final /* synthetic */ ShortcutManager f155628c;

        static {
            Covode.recordClassIndex(82092);
        }

        CallableC69714a(boolean z, Context context, ShortcutManager shortcutManager) {
            this.f155626a = z;
            this.f155627b = context;
            this.f155628c = shortcutManager;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:20:0x00b3, code lost:
            if ((java.lang.System.currentTimeMillis() - com.p2082ss.android.ugc.aweme.shortcut.C69711d.f155618a.getLong("key_last_request_time", 0)) < java.util.concurrent.TimeUnit.HOURS.toMillis((long) com.p2082ss.android.ugc.aweme.shortcut.C69712e.m123126b())) goto L_0x003d;
         */
        @Override // java.util.concurrent.Callable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object call() {
            /*
            // Method dump skipped, instructions count: 182
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortcut.C69712e.CallableC69714a.call():java.lang.Object");
        }
    }

    /* renamed from: e */
    private static String m123129e() {
        String str;
        UgShortcutInfo shortcutInfo;
        try {
            IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
            C89219l.m154716b(iESSettingsProxy, "");
            UgAwemeActivitySetting awemeActivitySetting = iESSettingsProxy.getAwemeActivitySetting();
            if (awemeActivitySetting == null || (shortcutInfo = awemeActivitySetting.getShortcutInfo()) == null) {
                str = null;
            } else {
                str = shortcutInfo.getMoneySymbol();
            }
            if (!TextUtils.isEmpty(str)) {
                if (C69711d.m123120a() != 0) {
                    double a = (double) C69711d.m123120a();
                    Double.isNaN(a);
                    double d = a / 100.0d;
                    if (d >= 99.0d) {
                        if (str == null) {
                            C89219l.m154715b();
                        }
                        String a2 = C1764a.m5928a(str, Arrays.copyOf(new Object[]{"99+"}, 1));
                        C89219l.m154716b(a2, "");
                        return a2;
                    } else if (d < 10.0d || d >= 99.0d) {
                        if (str == null) {
                            C89219l.m154715b();
                        }
                        String a3 = C1764a.m5928a(str, Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1));
                        C89219l.m154716b(a3, "");
                        return a3;
                    } else {
                        long a4 = C69711d.m123120a() / 100;
                        if (str == null) {
                            C89219l.m154715b();
                        }
                        String a5 = C1764a.m5928a(str, Arrays.copyOf(new Object[]{Long.valueOf(a4)}, 1));
                        C89219l.m154716b(a5, "");
                        return a5;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return "";
    }

    /* renamed from: a */
    public static void m123124a(boolean z) {
        if (Build.VERSION.SDK_INT >= 25) {
            Context a = C17867d.m33078a();
            ShortcutManager shortcutManager = (ShortcutManager) a.getSystemService(ShortcutManager.class);
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            if (!g.isLogin()) {
                try {
                    C89219l.m154716b(shortcutManager, "");
                    shortcutManager.setDynamicShortcuts(new ArrayList());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                C1731i.m5640b(new CallableC69714a(z, a, shortcutManager), C1731i.f5562a);
            }
        }
    }

    /* renamed from: a */
    public static void m123123a(Context context, ShortcutManager shortcutManager) {
        ArrayList arrayList = new ArrayList();
        if (m123125a() && m123130f() && !C80580in.m139687c()) {
            String d = m123128d();
            String c = m123127c();
            if (!TextUtils.isEmpty(c) && !TextUtils.isEmpty(d)) {
                Intent a = ShortcutProxyActivity.C69705a.m123119a(context, EnumC69719h.WILL_GET_MOST);
                a.putExtra("open_url", d);
                ShortcutInfo.Builder builder = new ShortcutInfo.Builder(context, EnumC69719h.WILL_GET_MOST.toString());
                if (c == null) {
                    C89219l.m154715b();
                }
                ShortcutInfo build = builder.setShortLabel(c).setLongLabel(c).setIcon(Icon.createWithResource(context, 2131231548)).setIntent(a).build();
                C89219l.m154716b(build, "");
                arrayList.add(build);
            }
        }
        if (m123125a() && m123130f()) {
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            if (g.isLogin() && !C80580in.m139687c()) {
                String d2 = m123128d();
                String e = m123129e();
                if (!TextUtils.isEmpty(e) && !TextUtils.isEmpty(d2)) {
                    Intent a2 = ShortcutProxyActivity.C69705a.m123119a(context, EnumC69719h.WITHDRAWAL);
                    a2.putExtra("open_url", d2);
                    ShortcutInfo.Builder builder2 = new ShortcutInfo.Builder(context, EnumC69719h.WITHDRAWAL.toString());
                    if (e == null) {
                        C89219l.m154715b();
                    }
                    ShortcutInfo build2 = builder2.setShortLabel(e).setLongLabel(e).setIcon(Icon.createWithResource(context, 2131231551)).setIntent(a2).build();
                    C89219l.m154716b(build2, "");
                    arrayList.add(build2);
                }
            }
        }
        if (arrayList.size() < 4 && !C80580in.m139687c()) {
            ShortcutInfo build3 = new ShortcutInfo.Builder(context, EnumC69719h.NOTIFICATION.toString()).setShortLabel(context.getString(R.string.di_)).setLongLabel(context.getString(R.string.di_)).setIcon(Icon.createWithResource(context, 2131231549)).setIntent(ShortcutProxyActivity.C69705a.m123119a(context, EnumC69719h.NOTIFICATION)).build();
            C89219l.m154716b(build3, "");
            arrayList.add(build3);
        }
        if (arrayList.size() < 4) {
            ShortcutInfo build4 = new ShortcutInfo.Builder(context, EnumC69719h.SHOOTING.toString()).setShortLabel(context.getString(R.string.aui)).setLongLabel(context.getString(R.string.aui)).setIcon(Icon.createWithResource(context, 2131231550)).setIntent(ShortcutProxyActivity.C69705a.m123119a(context, EnumC69719h.SHOOTING)).build();
            C89219l.m154716b(build4, "");
            arrayList.add(build4);
        }
        if (arrayList.size() < 4) {
            ShortcutInfo build5 = new ShortcutInfo.Builder(context, EnumC69719h.DISCOVER.toString()).setShortLabel(context.getString(R.string.b7l)).setLongLabel(context.getString(R.string.b7l)).setIcon(Icon.createWithResource(context, 2131231547)).setIntent(ShortcutProxyActivity.C69705a.m123119a(context, EnumC69719h.DISCOVER)).build();
            C89219l.m154716b(build5, "");
            arrayList.add(build5);
        }
        if (arrayList.size() != 0) {
            try {
                shortcutManager.setDynamicShortcuts(arrayList);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
