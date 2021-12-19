package com.p2082ss.android.ugc.aweme.p3070im.sdk.notification;

import android.app.Activity;
import android.app.Dialog;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0944d;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.main.AbstractC59103j;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p3070im.INotificationManagerService;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.notification.C55642a;
import com.p2082ss.android.ugc.aweme.services.IExternalService;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3728a.C68348f;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89517an;
import kotlinx.coroutines.C89546bf;
import kotlinx.coroutines.C89624i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.NotificationManagerServiceImpl */
public final class NotificationManagerServiceImpl implements INotificationManagerService {
    static {
        Covode.recordClassIndex(65424);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.INotificationManagerService
    /* renamed from: a */
    public final boolean mo90136a() {
        return C55642a.C55643a.m101399a().f126917j;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.INotificationManagerService
    /* renamed from: b */
    public final boolean mo90139b() {
        return C55642a.C55643a.m101399a().f126912e;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.INotificationManagerService
    /* renamed from: c */
    public final Activity mo90140c() {
        WeakReference<Activity> weakReference = C55642a.C55643a.m101399a().f126908a;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* renamed from: d */
    public static INotificationManagerService m101386d() {
        MethodCollector.m26663i(3887);
        Object a = C81908b.m141854a(INotificationManagerService.class, false);
        if (a != null) {
            INotificationManagerService iNotificationManagerService = (INotificationManagerService) a;
            MethodCollector.m26664o(3887);
            return iNotificationManagerService;
        }
        if (C81908b.f183249bz == null) {
            synchronized (INotificationManagerService.class) {
                try {
                    if (C81908b.f183249bz == null) {
                        C81908b.f183249bz = new NotificationManagerServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3887);
                    throw th;
                }
            }
        }
        NotificationManagerServiceImpl notificationManagerServiceImpl = (NotificationManagerServiceImpl) C81908b.f183249bz;
        MethodCollector.m26664o(3887);
        return notificationManagerServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.INotificationManagerService
    /* renamed from: a */
    public final void mo90134a(Integer num) {
        C55642a a = C55642a.C55643a.m101399a();
        boolean z = true;
        if (num == null || num.intValue() != 1) {
            z = false;
        }
        a.f126911d = z;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.INotificationManagerService
    /* renamed from: b */
    public final void mo90138b(Integer num) {
        C55642a a = C55642a.C55643a.m101399a();
        boolean z = true;
        if (num == null || num.intValue() != 1) {
            z = false;
        }
        a.f126909b = z;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.INotificationManagerService
    /* renamed from: d */
    public final void mo90142d(Integer num) {
        C55642a a = C55642a.C55643a.m101399a();
        boolean z = true;
        if (num == null || num.intValue() != 1) {
            z = false;
        }
        a.f126913f = z;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.INotificationManagerService
    /* renamed from: e */
    public final void mo90143e(Integer num) {
        C55642a a = C55642a.C55643a.m101399a();
        boolean z = true;
        if (num == null || num.intValue() != 1) {
            z = false;
        }
        a.f126910c = z;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.INotificationManagerService
    /* renamed from: a */
    public final void mo90133a(C68348f fVar) {
        boolean z;
        boolean z2;
        boolean z3;
        C89219l.m154721d(fVar, "");
        C55642a a = C55642a.C55643a.m101399a();
        C89219l.m154721d(fVar, "");
        boolean z4 = false;
        if (fVar.f152992n == 1) {
            z = true;
        } else {
            z = false;
        }
        a.f126911d = z;
        if (fVar.f152995q == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        a.f126909b = z2;
        if (fVar.f152990l == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        a.f126912e = z3;
        if (fVar.f152983e == 1) {
            z4 = true;
        }
        a.f126913f = z4;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.INotificationManagerService
    /* renamed from: c */
    public final void mo90141c(Integer num) {
        C55642a a = C55642a.C55643a.m101399a();
        boolean z = true;
        if (num == null || num.intValue() != 1) {
            z = false;
        }
        a.f126912e = z;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.INotificationManagerService
    /* renamed from: a */
    public final ViewGroup mo90132a(Activity activity) {
        T t;
        Window window;
        C55642a.C55643a.m101399a();
        View view = null;
        if (activity == null) {
            return null;
        }
        if (activity instanceof ActivityC0945e) {
            ActivityC0945e eVar = (ActivityC0945e) activity;
            AbstractC0952i supportFragmentManager = eVar.getSupportFragmentManager();
            C89219l.m154716b(supportFragmentManager, "");
            List<Fragment> f = supportFragmentManager.mo3565f();
            C89219l.m154716b(f, "");
            Iterator<T> it = f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                T t2 = t;
                if ((t2 instanceof DialogInterface$OnCancelListenerC0944d) && t2.isVisible()) {
                    break;
                }
            }
            T t3 = t;
            if (t3 != null) {
                Objects.requireNonNull(t3, "null cannot be cast to non-null type androidx.fragment.app.DialogFragment");
                Dialog dialog = t3.getDialog();
                if (!(dialog == null || (window = dialog.getWindow()) == null)) {
                    view = window.getDecorView();
                }
                ViewGroup viewGroup = (ViewGroup) view;
                if (viewGroup != null) {
                    return viewGroup;
                }
            }
            Window window2 = eVar.getWindow();
            C89219l.m154716b(window2, "");
            View decorView = window2.getDecorView();
            Objects.requireNonNull(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
            return (ViewGroup) decorView;
        }
        Window window3 = activity.getWindow();
        C89219l.m154716b(window3, "");
        View decorView2 = window3.getDecorView();
        Objects.requireNonNull(decorView2, "null cannot be cast to non-null type android.view.ViewGroup");
        return (ViewGroup) decorView2;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.INotificationManagerService
    /* renamed from: a */
    public final void mo90135a(boolean z) {
        C55642a a = C55642a.C55643a.m101399a();
        if (!z) {
            AbstractC89568bz unused = C89624i.m155555a(C89517an.m155448a(C89546bf.f203266a), null, null, new C55642a.C55645c(a, z, null), 3);
        } else {
            a.f126915h = z;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.INotificationManagerService
    /* renamed from: b */
    public final void mo90137b(Activity activity) {
        String str;
        String str2;
        String str3;
        C55642a a = C55642a.C55643a.m101399a();
        a.f126908a = new WeakReference<>(activity);
        if (activity != null) {
            activity.getLocalClassName();
        }
        boolean z = activity instanceof AbstractC59103j;
        if (z && a.f126916i) {
            a.f126916i = false;
        } else if (!IMService.createIIMServicebyMonsterPlugin(false).isNotificationMessageQueueEmpty()) {
            String str4 = null;
            if (activity != null) {
                str = activity.getLocalClassName();
            } else {
                str = null;
            }
            if (!TextUtils.equals(str, "miniapp.views.MiniAppListH5Activity")) {
                if (activity != null) {
                    str2 = activity.getLocalClassName();
                } else {
                    str2 = null;
                }
                if (!TextUtils.equals(str2, "miniapp.RecentlyUsedMicroAppActivity") && (!z || !((AbstractC59103j) activity).isUnderThirdTab())) {
                    if (activity != null) {
                        str3 = activity.getLocalClassName();
                    } else {
                        str3 = null;
                    }
                    if (!TextUtils.equals(str3, "im.sdk.chat.ChatRoomActivity")) {
                        if (activity != null) {
                            str4 = activity.getLocalClassName();
                        }
                        if (!TextUtils.equals(str4, "shortvideo.ui.VideoRecordNewActivity")) {
                            IExternalService a2 = AVExternalServiceImpl.m113114a();
                            if (a2.configService().shortVideoConfig().isRecording()) {
                                return;
                            }
                            if ((activity == null || !a2.publishService().inPublishPage(activity)) && !a.f126915h) {
                                IMService.createIIMServicebyMonsterPlugin(false).showIMNotification(a.f126914g);
                                a.f126914g = false;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
            }
            IMService.createIIMServicebyMonsterPlugin(false).clearIMNotification();
            a.f126914g = false;
        }
    }
}
