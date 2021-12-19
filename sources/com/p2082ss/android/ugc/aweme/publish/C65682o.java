package com.p2082ss.android.ugc.aweme.publish;

import android.app.ActivityManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.cukaie.closet.C14401a;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.keva.Keva;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.port.internal.IVideoRecordPreferences;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.scheduler.C67295g;
import com.p2082ss.android.ugc.aweme.scheduler.C67296h;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.IDraftService;
import com.p2082ss.android.ugc.aweme.services.publish.Publish;
import com.p2082ss.android.ugc.aweme.services.superentrance.SuperEntranceEvent;
import com.p2082ss.android.ugc.aweme.settings.C68743i;
import com.p2082ss.android.ugc.aweme.settings.C68747m;
import com.p2082ss.android.ugc.aweme.settings.C68749o;
import com.p2082ss.android.ugc.aweme.shortvideo.C71817eu;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70974bn;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C71515r;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.tools.C77807b;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import java.lang.reflect.Field;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.publish.o */
public final class C65682o {

    /* renamed from: a */
    public static C65682o f148003a = new C65682o();

    private C65682o() {
    }

    /* renamed from: a */
    public static boolean m117576a(Context context, Class<?> cls) {
        ActivityManager activityManager;
        List<ActivityManager.RunningServiceInfo> runningServices;
        if (context == null || (activityManager = (ActivityManager) m117570a(context, "activity")) == null || (runningServices = activityManager.getRunningServices(Integer.MAX_VALUE)) == null) {
            return false;
        }
        for (ActivityManager.RunningServiceInfo runningServiceInfo : runningServices) {
            if (cls.getName().equals(runningServiceInfo.service.getClassName())) {
                return true;
            }
        }
        return false;
    }

    static {
        Covode.recordClassIndex(77173);
    }

    /* renamed from: a */
    private static void m117571a() {
        Keva repo;
        int i;
        if (C68747m.m121183d() && (i = (repo = Keva.getRepo("TOOLS_PUBLISH_PARALLEL_REPO_NAME")).getInt("PUBLISH_PARALLEL_PREVIOUS_SHOW_TIP_COUNT", 0)) < 3) {
            if (TimeUnit.MILLISECONDS.toHours(System.currentTimeMillis() - repo.getLong("PUBLISH_PARALLEL_PREVIOUS_SHOW_TIP_TIMESTAMP", 0)) >= 24) {
                new SuperEntranceEvent(4, true).post();
                repo.storeLong("PUBLISH_PARALLEL_PREVIOUS_SHOW_TIP_TIMESTAMP", System.currentTimeMillis());
                repo.storeInt("PUBLISH_PARALLEL_PREVIOUS_SHOW_TIP_COUNT", i + 1);
            }
        }
    }

    /* renamed from: a */
    private static void m117575a(String str) {
        C39162r.m79460a("performance_publish", new C84425b().mo129406a("creation_id", str).mo129406a("content_type", "video").mo129403a("retry_publish", 1).mo129403a("video_type", 0).mo129403a("video_upload_type", 1).f188764a);
        if (C68743i.m121176a()) {
            C12290b.m22060a("user_publish_success_rate_parallel", -1, new C33743c().mo59974a("video_type", (Integer) 0).mo59974a("retry_publish", (Integer) 1).mo59974a("video_upload_type", (Integer) 1).mo59977a());
        }
    }

    /* renamed from: a */
    public static boolean m117577a(ActivityC0945e eVar, Intent intent) {
        return C63238c.f143591r.mo93937a(eVar, intent);
    }

    /* renamed from: a */
    public static void m117574a(ActivityC0945e eVar, C43223c cVar) {
        String a;
        if (cVar != null) {
            Bundle a2 = m117569a((Context) eVar, cVar);
            Intent intent = new Intent();
            intent.putExtra("publish_bundle", a2);
            if (C68747m.m121180a()) {
                a = C67296h.m119230a(a2);
                C67296h.m119234a();
            } else {
                a = C67296h.m119231a(a2, (String) null);
            }
            if (a == null) {
                C84911q.m145926b("Already In publish, can not start new");
                return;
            }
            intent.putExtra("multi_publish_id", a);
            m117577a(eVar, intent);
        }
    }

    /* renamed from: a */
    public static Bundle m117569a(Context context, C43223c cVar) {
        Bundle bundle = new Bundle();
        new C70974bn("PublishServiceImpl");
        VideoPublishEditModel a = C70974bn.m125289a(cVar);
        a.mIsFromDraft = true;
        a.userClickPublishTime = SystemClock.uptimeMillis();
        bundle.putInt("video_type", 0);
        bundle.putSerializable("extra_video_publish_args", a);
        bundle.putString("shoot_way", a.mShootWay);
        bundle.putInt("publish_permission", a.isPrivate);
        if (C71817eu.m126791b(a)) {
            bundle.putBoolean("shoutouts_video_fast_publish", true);
        }
        m117575a(cVar.mo73676f());
        bundle.putBoolean("publish_retry", true);
        if (!C68749o.m121186a()) {
            ((IVideoRecordPreferences) new C14401a((byte) 0).mo23215a(context, IVideoRecordPreferences.class)).setUploadRecoverPath("");
        }
        return bundle;
    }

    /* renamed from: a */
    private static Object m117570a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(6743);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(6743);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: a */
    public static void m117572a(Context context, IDraftService.OnGetRecoverDraftCallback onGetRecoverDraftCallback) {
        String uploadRecoverPath;
        IVideoRecordPreferences iVideoRecordPreferences = (IVideoRecordPreferences) new C14401a((byte) 0).mo23215a(context, IVideoRecordPreferences.class);
        if (C68747m.m121180a()) {
            List<String> a = C63244g.m114602a().mo73287o().mo104793m().mo104823a();
            if (a.size() > 0) {
                uploadRecoverPath = a.get(0);
            } else {
                uploadRecoverPath = null;
            }
        } else {
            uploadRecoverPath = iVideoRecordPreferences.getUploadRecoverPath("");
        }
        if (TextUtils.isEmpty(uploadRecoverPath)) {
            onGetRecoverDraftCallback.onFail();
        } else {
            C1731i.m5640b(new CallableC65683p(uploadRecoverPath), C77807b.f174559a).mo5534a(new C65684q(onGetRecoverDraftCallback), C1731i.f5564c, null);
        }
    }

    /* renamed from: a */
    public static void m117573a(ActivityC0945e eVar, Bundle bundle, String str) {
        String a;
        String a2;
        String a3;
        String a4;
        C84911q.m145928d("PublishServiceImpl startPublish publish");
        C63244g.m114602a().mo73276d().mo101829a();
        boolean z = bundle.getBoolean("enter_record_from_other_platform", false);
        if (bundle.getBoolean("extra_enter_from_live", false)) {
            if (bundle.getBoolean("live_highlight")) {
                Intent intent = new Intent();
                intent.putExtra("publish_bundle", bundle);
                if (bundle.getBoolean("review_video_fast_publish", false)) {
                    intent.putExtra("review_video_fast_publish", true);
                }
                if (C68747m.m121180a()) {
                    a4 = C67296h.m119230a(bundle);
                    C67296h.m119234a();
                } else {
                    a4 = C67296h.m119231a(bundle, str);
                }
                if (a4 == null) {
                    C84911q.m145926b("Already In publish, can not start new");
                    return;
                }
                intent.putExtra("multi_publish_id", a4);
                m117571a();
                m117577a(eVar, intent);
                C71515r rVar = new C71515r();
                rVar.setCode(1);
                rVar.setType("highlight");
                rVar.setStatus("success");
                intent.putExtra("live_highlight_responce", rVar);
                eVar.setResult(9, intent);
                eVar.finish();
                return;
            }
            Intent intent2 = new Intent(eVar, C63238c.f143576c.mo93776e());
            intent2.addFlags(603979776);
            if (!C63238c.f143576c.mo93778g()) {
                intent2.putExtra("enable_optimize_main_not_in_stack", true);
            }
            intent2.putExtra("publish_bundle", bundle);
            if (bundle.getBoolean("review_video_fast_publish", false)) {
                intent2.putExtra("review_video_fast_publish", true);
            }
            if (C68747m.m121180a()) {
                a3 = C67296h.m119230a(bundle);
                C67296h.m119234a();
            } else {
                a3 = C67296h.m119231a(bundle, str);
            }
            if (a3 == null) {
                C84911q.m145926b("Already In publish, can not start new");
                return;
            }
            intent2.putExtra("multi_publish_id", a3);
            m117571a();
            intent2.putExtra("live_capture_responce", "publish");
            eVar.setResult(9, intent2);
            eVar.finish();
            C84911q.m145928d("PublishServiceImpl startPublish publish fromOtherPlatform:".concat(String.valueOf(z)));
        } else if (z) {
            Intent intent3 = new Intent();
            intent3.putExtra("publish_bundle", bundle);
            if (bundle.getBoolean("review_video_fast_publish", false)) {
                intent3.putExtra("review_video_fast_publish", true);
            }
            if (C68747m.m121180a()) {
                a2 = C67296h.m119230a(bundle);
                C67296h.m119234a();
            } else {
                a2 = C67296h.m119231a(bundle, str);
            }
            if (a2 == null) {
                C84911q.m145926b("Already In publish, can not start new");
                return;
            }
            intent3.putExtra("multi_publish_id", a2);
            m117571a();
            m117577a(eVar, intent3);
            eVar.setResult(-1, intent3);
            eVar.finish();
        } else {
            Class<? extends ActivityC0945e> e = C63238c.f143576c.mo93776e();
            C84911q.m145928d("PublishServiceImpl startPublish containerActivityClass:" + e.getName());
            Intent intent4 = new Intent(eVar, e);
            intent4.addFlags(603979776);
            boolean g = C63238c.f143576c.mo93778g();
            C84911q.m145928d("PublishServiceImpl startPublish isPublishContainerActivityClassAlive:".concat(String.valueOf(g)));
            if (!g) {
                C84911q.m145928d("PublishServiceImpl startPublish EXTRA_ENABLE_OPTIMIZE_MAIN_NOT_IN_STACK:");
                intent4.putExtra("enable_optimize_main_not_in_stack", true);
            }
            Publish.isNeedProcessPublish = true;
            if (bundle.getBoolean("review_video_fast_publish", false)) {
                intent4.putExtra("review_video_fast_publish", true);
            }
            if (C68747m.m121180a()) {
                a = C67296h.m119238b(bundle);
                if (TextUtils.isEmpty(a)) {
                    C67295g.m119228a("PublishParallel start normal publish task");
                    a = C67296h.m119230a(bundle);
                    C67296h.m119234a();
                } else {
                    C67295g.m119228a("PublishParallel restart pre publish task");
                }
            } else {
                a = C67296h.m119231a(bundle, str);
            }
            if (a == null) {
                C84911q.m145926b("Already In publish, can not start new");
                return;
            }
            intent4.putExtra("multi_publish_id", a);
            m117571a();
            bundle.remove("extra_video_publish_args");
            intent4.putExtra("publish_bundle", bundle);
            intent4.setExtrasClassLoader(e.getClassLoader());
            C84349a.m145093a(intent4, eVar);
            eVar.startActivity(intent4);
        }
    }
}
