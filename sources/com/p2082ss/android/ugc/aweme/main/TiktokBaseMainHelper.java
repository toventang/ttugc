package com.p2082ss.android.ugc.aweme.main;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.webkit.CookieSyncManager;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.p2133d.C29847a;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.lego.C58243m;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.main.TiktokBaseMainHelper */
public abstract class TiktokBaseMainHelper implements AbstractC59106m {

    /* renamed from: a */
    private static boolean f134328a;

    /* renamed from: b */
    protected Activity f134329b;

    /* renamed from: c */
    protected NotificationManager f134330c;

    /* renamed from: d */
    protected boolean f134331d;

    /* renamed from: e */
    protected boolean f134332e;

    /* renamed from: f */
    protected boolean f134333f;

    /* renamed from: g */
    protected final Handler f134334g = new Handler();

    /* renamed from: h */
    protected long f134335h = 0;

    static {
        Covode.recordClassIndex(69350);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.main.TiktokBaseMainHelper$AppStartJobTask */
    public class AppStartJobTask implements AbstractC58264w {
        static {
            Covode.recordClassIndex(69351);
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        public final int bQ_() {
            return 1048575;
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: f */
        public final EnumC58150ad mo28606f() {
            return AbstractC58265x.m105221a(this);
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: g */
        public final String mo28607g() {
            return "task_";
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: i */
        public final boolean mo28609i() {
            return true;
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: j */
        public final List mo28610j() {
            return null;
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: k */
        public final EnumC58148ab mo28611k() {
            return EnumC58148ab.DEFAULT;
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: h */
        public final String mo28608h() {
            return getClass().getSimpleName();
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
        /* renamed from: b */
        public final EnumC58151ae mo28601b() {
            if (((Boolean) C58243m.f132662j.getValue()).booleanValue()) {
                return EnumC58151ae.APP_BACKGROUND;
            }
            return EnumC58151ae.BOOT_FINISH;
        }

        private AppStartJobTask() {
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: a */
        public final void mo28600a(Context context) {
            new C29847a(TiktokBaseMainHelper.this.f134329b).mo52133b();
            IMService.createIIMServicebyMonsterPlugin(false);
        }

        /* synthetic */ AppStartJobTask(TiktokBaseMainHelper tiktokBaseMainHelper, byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.main.AbstractC59106m
    /* renamed from: a */
    public void mo89425a() {
        BusinessComponentServiceUtils.getMainHelperService().mo96564a();
        try {
            CookieSyncManager.getInstance().sync();
        } catch (Throwable unused) {
        }
        this.f134333f = true;
        this.f134329b.finish();
    }

    /* renamed from: c */
    public final void mo96539c() {
        if (!this.f134331d && !this.f134332e) {
            new C58221f.C58224c().mo95703b((AbstractC58264w) new AppStartJobTask(this, (byte) 0)).mo95706a();
        }
    }

    /* renamed from: d */
    public final boolean mo96540d() {
        if (f134328a) {
            mo89425a();
            return true;
        } else if (System.currentTimeMillis() - this.f134335h <= InteractFirstFrameTimeOutDurationSetting.DEFAULT) {
            mo89425a();
            this.f134335h = 0;
            return true;
        } else {
            this.f134335h = System.currentTimeMillis();
            new C23144b(this.f134329b).mo37640e(R.string.a22).mo37637b();
            return false;
        }
    }

    protected TiktokBaseMainHelper(Activity activity) {
        this.f134329b = activity;
        this.f134330c = (NotificationManager) m108442a(activity, "notification");
        this.f134331d = false;
        this.f134332e = false;
    }

    /* renamed from: a */
    private static Object m108442a(Activity activity, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    return activity.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            return activity.getSystemService(str);
        } else if (!C58027i.f132246a) {
            return activity.getSystemService(str);
        } else {
            synchronized (ClipboardManager.class) {
                systemService = activity.getSystemService(str);
                if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                    try {
                        Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                        declaredField.setAccessible(true);
                        declaredField.set(systemService, new C58027i.HandlerC58028a((Handler) declaredField.get(systemService)));
                    } catch (Exception e) {
                        C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                    }
                }
                C58027i.f132246a = false;
            }
            return systemService;
        }
    }
}
