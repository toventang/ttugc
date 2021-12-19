package com.p2082ss.android.ugc.awemepushlib.interaction;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Activity;
import android.app.NotificationManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.apm.C12290b;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.p1206f.C17308a;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.common.util.C29843f;
import com.p2082ss.android.p2085a.p2086a.p2087a.C29339a;
import com.p2082ss.android.push.C30194a;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.AccountService;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.deeplink.C41050m;
import com.p2082ss.android.ugc.aweme.framework.p3009d.C51427a;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.awemepushapi.AbstractC81805a;
import com.p2082ss.android.ugc.awemepushapi.IPushApi;
import com.p2082ss.android.ugc.awemepushlib.manager.AwemeRedBadgerManager;
import com.p2082ss.android.ugc.awemepushlib.manager.C81900a;
import com.p2082ss.android.ugc.awemepushlib.manager.MessageShowHandler;
import com.p2082ss.android.ugc.awemepushlib.p4247c.C81822a;
import com.p2082ss.android.ugc.awemepushlib.p4250e.C81828b;
import com.p2082ss.android.ugc.awemepushlib.p4251f.C81835d;
import com.p2082ss.android.ugc.awemepushlib.p4253os.lifecycle.LifecycleCallbackAdapter;
import com.p2082ss.android.ugc.awemepushlib.task.CancelNotificationTask;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.awemepushlib.interaction.PushService */
public class PushService implements IPushApi {
    static {
        Covode.recordClassIndex(95258);
    }

    /* renamed from: com_ss_android_ugc_awemepushlib_interaction_PushService_com_ss_android_ugc_aweme_lancet_LogLancet_d */
    public static int m141745x7f81dbc6(String str, String str2) {
        return 0;
    }

    @Override // com.p2082ss.android.ugc.awemepushapi.IPushApi
    public boolean isSswoAct(Activity activity) {
        return false;
    }

    @Override // com.p2082ss.android.ugc.awemepushapi.IPushApi
    public void startPushProcess(Context context) {
    }

    @Override // com.p2082ss.android.ugc.awemepushapi.IPushApi
    public List<String> getFromNotificationIds() {
        return MessageShowHandler.f183069d;
    }

    @Override // com.p2082ss.android.ugc.awemepushapi.IPushApi
    public AbstractC58264w getCancelNotiTask() {
        return new CancelNotificationTask();
    }

    @Override // com.p2082ss.android.ugc.awemepushapi.IPushApi
    public void initNotificationChannel() {
        C81863g.m141765a(C17867d.m33078a());
    }

    @Override // com.p2082ss.android.ugc.awemepushapi.IPushApi
    public void initMessageDepend() {
        C81862f.m141760a(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0005: INVOKE  
              (wrap: com.ss.android.ugc.awemepushlib.interaction.j$1 : 0x0002: CONSTRUCTOR  (r0v0 com.ss.android.ugc.awemepushlib.interaction.j$1) =  call: com.ss.android.ugc.awemepushlib.interaction.j.1.<init>():void type: CONSTRUCTOR)
             type: STATIC call: com.ss.android.ugc.awemepushlib.interaction.f.a(com.ss.android.ugc.awemepushapi.a):void in method: com.ss.android.ugc.awemepushlib.interaction.PushService.initMessageDepend():void, file: classes2.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0002: CONSTRUCTOR  (r0v0 com.ss.android.ugc.awemepushlib.interaction.j$1) =  call: com.ss.android.ugc.awemepushlib.interaction.j.1.<init>():void type: CONSTRUCTOR in method: com.ss.android.ugc.awemepushlib.interaction.PushService.initMessageDepend():void, file: classes2.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 14 more
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.awemepushlib.interaction.j, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 20 more
            */
        /*
            this = this;
            com.ss.android.ugc.awemepushlib.interaction.j$1 r0 = new com.ss.android.ugc.awemepushlib.interaction.j$1
            r0.<init>()
            com.p2082ss.android.ugc.awemepushlib.interaction.C81862f.m141760a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.awemepushlib.interaction.PushService.initMessageDepend():void");
    }

    @Override // com.p2082ss.android.ugc.awemepushapi.IPushApi
    public void setAutoDisappear(int i) {
        C81850aa.f183008a = i;
    }

    @Override // com.p2082ss.android.ugc.awemepushapi.IPushApi
    public boolean isNotificationIdContains(String str) {
        return C81861e.f183022a.contains(str);
    }

    @Override // com.p2082ss.android.ugc.awemepushapi.IPushApi
    public int isPushVideoPreload(long j) {
        return C81828b.m141710a(j);
    }

    @Override // com.p2082ss.android.ugc.awemepushapi.IPushApi
    public void removeRedBadge(Context context) {
        AwemeRedBadgerManager.f183060b.mo125543b(context);
    }

    private boolean getNotifyEnabled(Context context) {
        return C81900a.m141823a().mo125559d(context);
    }

    @Override // com.p2082ss.android.ugc.awemepushapi.IPushApi
    public String getRealChannelId(String str) {
        return C81863g.m141763a(str, C81835d.m141729a());
    }

    public static IPushApi createIPushApibyMonsterPlugin(boolean z) {
        Object a = C81908b.m141854a(IPushApi.class, z);
        if (a != null) {
            return (IPushApi) a;
        }
        return new PushService();
    }

    private synchronized boolean getConfirmPush(Context context) {
        boolean c;
        MethodCollector.m26663i(10819);
        c = C81900a.m141823a().mo125558c(context);
        MethodCollector.m26664o(10819);
        return c;
    }

    @Override // com.p2082ss.android.ugc.awemepushapi.IPushApi
    public void clearAll(Context context) {
        NotificationManager notificationManager = (NotificationManager) m141743x67eafdea(context, "notification");
        if (notificationManager != null) {
            notificationManager.cancelAll();
        } else {
            m141745x7f81dbc6("xzqtest", "notification manager is null!");
        }
    }

    @Override // com.p2082ss.android.ugc.awemepushapi.IPushApi
    public boolean isPushProcess(Context context) {
        String b = C29843f.m60132b(context);
        if (b == null) {
            return false;
        }
        if (b.endsWith(":push") || b.endsWith(":pushservice")) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.awemepushapi.IPushApi
    public void initPushAccountService(boolean z) {
        Context a = C17867d.m33078a();
        if (z) {
            C1731i.m5640b(new CallableC81880o(a), C1731i.f5562a);
            return;
        }
        AccountManager accountManager = AccountManager.get(a);
        String packageName = a.getPackageName();
        String string = a.getString(a.getApplicationInfo().labelRes);
        if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(packageName)) {
            try {
                accountManager.removeAccount(new Account(string, packageName), null, null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com_ss_android_ugc_awemepushlib_interaction_PushService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra */
    public static String m141744x7fd9a797(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    private String getParameterString(Uri uri, String str) {
        try {
            return uri.getQueryParameter(str);
        } catch (Exception unused) {
            return "";
        }
    }

    private void setNotifyEnabled(Context context, boolean z) {
        C81900a.m141823a().mo125556b(context, z);
    }

    @Override // com.p2082ss.android.ugc.awemepushapi.IPushApi
    public void init(Context context, AbstractC81805a aVar) {
        pushInit(context, aVar, false);
    }

    @Override // com.p2082ss.android.ugc.awemepushapi.IPushApi
    public void initImmediately(Context context, AbstractC81805a aVar) {
        pushInit(context, aVar, true);
    }

    private synchronized void setConfirmPush(Context context, boolean z) {
        MethodCollector.m26663i(10965);
        C81900a.m141823a().mo125551a(context, z);
        MethodCollector.m26664o(10965);
    }

    @Override // com.p2082ss.android.ugc.awemepushapi.IPushApi
    public boolean checkChannelStatus(Context context, String str) {
        String realChannelId = getRealChannelId(str);
        NotificationManager notificationManager = (NotificationManager) m141743x67eafdea(context, "notification");
        if (Build.VERSION.SDK_INT < 26 || notificationManager == null || notificationManager.getNotificationChannel(realChannelId).getImportance() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: com_ss_android_ugc_awemepushlib_interaction_PushService_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService */
    public static Object m141743x67eafdea(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(11416);
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
                    MethodCollector.m26664o(11416);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    @Override // com.p2082ss.android.ugc.awemepushapi.IPushApi
    public void clearNotificationId(String str, Context context, int i) {
        NotificationManager notificationManager = (NotificationManager) m141743x67eafdea(context, "notification");
        if (notificationManager != null) {
            notificationManager.cancel(str, i);
        } else {
            m141745x7f81dbc6("clearNotificationId", "notification manager is null!");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0104, code lost:
        if (r3 != false) goto L_0x0041;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void pushInit(android.content.Context r8, com.p2082ss.android.ugc.awemepushapi.AbstractC81805a r9, java.lang.Boolean r10) {
        /*
        // Method dump skipped, instructions count: 264
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.awemepushlib.interaction.PushService.pushInit(android.content.Context, com.ss.android.ugc.awemepushapi.a, java.lang.Boolean):void");
    }

    @Override // com.p2082ss.android.ugc.awemepushapi.IPushApi
    public void notifyOnDeeplink(boolean z, Context context, Intent intent, Uri uri) {
        String str;
        long j;
        if (!z) {
            C81867i.m141780a(uri.toString(), false);
            return;
        }
        try {
            int a = C30194a.m61069a(intent, "msg_from", -1);
            long a2 = C30194a.m61070a(intent, "msg_id");
            HashMap hashMap = (HashMap) intent.getSerializableExtra("log_data_extra_to_adsapp");
            if (hashMap == null) {
                hashMap = new HashMap(8);
                C81822a.m141703a(uri.toString(), hashMap);
            }
            String com_ss_android_ugc_awemepushlib_interaction_PushService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = m141744x7fd9a797(intent, "post_back");
            String str2 = (String) hashMap.get("rule_id");
            if (TextUtils.isEmpty(m141744x7fd9a797(intent, "rule_id"))) {
                intent.putExtra("rule_id", str2);
            }
            String parameterString = getParameterString(uri, "push_params");
            if (!TextUtils.isEmpty(parameterString)) {
                hashMap.put("feed_batch_params", parameterString);
            }
            String parameterString2 = getParameterString(uri, "gids");
            if (!TextUtils.isEmpty(parameterString2) && TextUtils.equals("aweme", uri.getHost())) {
                if (parameterString2.contains(",")) {
                    parameterString2 = parameterString2.substring(0, parameterString2.indexOf(","));
                }
                hashMap.put("group_id", parameterString2);
            }
            if (AccountService.m65215a().mo57069e().isLogin()) {
                str = "1";
            } else {
                str = "0";
            }
            hashMap.put("is_login", str);
            C30194a.m61069a(intent, "message_from", -1);
            m141744x7fd9a797(intent, "message_extra");
            JSONObject jSONObject = new JSONObject(hashMap);
            if (TextUtils.isEmpty(str2)) {
                j = a2;
            } else {
                j = Long.valueOf(str2).longValue();
            }
            if (a == 1) {
                C81867i.m141777a(context, "news_notify_view", a2, -1, new JSONObject[0]);
                trackClickPush(context, j, m141744x7fd9a797(intent, "action_id"), true, com_ss_android_ugc_awemepushlib_interaction_PushService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra, jSONObject);
            } else if (a == 2) {
                C81867i.m141777a(context, "news_notify_view", a2, -1, new JSONObject[0]);
                trackClickPush(context, j, null, false, com_ss_android_ugc_awemepushlib_interaction_PushService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra, jSONObject);
            }
        } catch (Exception e) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("exception", e.toString());
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            C12290b.m22066a("push_click_error_event", jSONObject2, (JSONObject) null, (JSONObject) null);
        }
    }

    private void trackClickPush(Context context, final long j, final String str, final boolean z, final String str2, final JSONObject jSONObject) {
        Exception e;
        JSONObject jSONObject2;
        if (jSONObject == null) {
            try {
                jSONObject2 = new JSONObject();
            } catch (Exception e2) {
                e = e2;
                e.printStackTrace();
                C51427a.f118503a.registerActivityLifecycleCallbacks(new LifecycleCallbackAdapter() {
                    /* class com.p2082ss.android.ugc.awemepushlib.interaction.PushService.C818451 */

                    static {
                        Covode.recordClassIndex(95259);
                    }

                    @Override // com.p2082ss.android.ugc.awemepushlib.p4253os.lifecycle.LifecycleCallbackAdapter
                    public final void onActivityResumed(Activity activity) {
                        C51427a.f118503a.unregisterActivityLifecycleCallbacks(this);
                        C29339a.m58754b(new Runnable() {
                            /* class com.p2082ss.android.ugc.awemepushlib.interaction.PushService.C818451.RunnableC818461 */

                            static {
                                Covode.recordClassIndex(95260);
                            }

                            public final void run() {
                                long j = j;
                                boolean z = z;
                                String str = str;
                                String str2 = str2;
                                JSONObject jSONObject = jSONObject;
                                if (jSONObject == null) {
                                    try {
                                        jSONObject = new JSONObject();
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                        return;
                                    }
                                }
                                if (z) {
                                    jSONObject.put("click_position", "notify");
                                    if (str != null) {
                                        jSONObject.put("position", str);
                                    } else {
                                        jSONObject.put("position", "push_body");
                                    }
                                } else {
                                    jSONObject.put("click_position", "alert");
                                }
                                if (!TextUtils.isEmpty(str2)) {
                                    jSONObject.put("post_back", str2);
                                }
                                jSONObject.put("rule_id", String.valueOf(j));
                                C39162r.m79461a("push_click_v2", jSONObject);
                            }
                        });
                    }
                });
            }
        } else {
            jSONObject2 = jSONObject;
        }
        if (z) {
            jSONObject2.put("click_position", "notify");
            if (str != null) {
                jSONObject2.put("position", str);
            } else {
                jSONObject2.put("position", "push_body");
            }
        } else {
            jSONObject2.put("click_position", "alert");
        }
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject2.put("post_back", str2);
            } catch (Exception e3) {
                e = e3;
                e.printStackTrace();
                C51427a.f118503a.registerActivityLifecycleCallbacks(new LifecycleCallbackAdapter() {
                    /* class com.p2082ss.android.ugc.awemepushlib.interaction.PushService.C818451 */

                    static {
                        Covode.recordClassIndex(95259);
                    }

                    @Override // com.p2082ss.android.ugc.awemepushlib.p4253os.lifecycle.LifecycleCallbackAdapter
                    public final void onActivityResumed(Activity activity) {
                        C51427a.f118503a.unregisterActivityLifecycleCallbacks(this);
                        C29339a.m58754b(new Runnable() {
                            /* class com.p2082ss.android.ugc.awemepushlib.interaction.PushService.C818451.RunnableC818461 */

                            static {
                                Covode.recordClassIndex(95260);
                            }

                            public final void run() {
                                long j = j;
                                boolean z = z;
                                String str = str;
                                String str2 = str2;
                                JSONObject jSONObject = jSONObject;
                                if (jSONObject == null) {
                                    try {
                                        jSONObject = new JSONObject();
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                        return;
                                    }
                                }
                                if (z) {
                                    jSONObject.put("click_position", "notify");
                                    if (str != null) {
                                        jSONObject.put("position", str);
                                    } else {
                                        jSONObject.put("position", "push_body");
                                    }
                                } else {
                                    jSONObject.put("click_position", "alert");
                                }
                                if (!TextUtils.isEmpty(str2)) {
                                    jSONObject.put("post_back", str2);
                                }
                                jSONObject.put("rule_id", String.valueOf(j));
                                C39162r.m79461a("push_click_v2", jSONObject);
                            }
                        });
                    }
                });
            }
        }
        jSONObject2.put("rule_id", String.valueOf(j));
        C39162r.m79461a("push_click", jSONObject2);
        C51427a.f118503a.registerActivityLifecycleCallbacks(new LifecycleCallbackAdapter() {
            /* class com.p2082ss.android.ugc.awemepushlib.interaction.PushService.C818451 */

            static {
                Covode.recordClassIndex(95259);
            }

            @Override // com.p2082ss.android.ugc.awemepushlib.p4253os.lifecycle.LifecycleCallbackAdapter
            public final void onActivityResumed(Activity activity) {
                C51427a.f118503a.unregisterActivityLifecycleCallbacks(this);
                C29339a.m58754b(new Runnable() {
                    /* class com.p2082ss.android.ugc.awemepushlib.interaction.PushService.C818451.RunnableC818461 */

                    static {
                        Covode.recordClassIndex(95260);
                    }

                    public final void run() {
                        long j = j;
                        boolean z = z;
                        String str = str;
                        String str2 = str2;
                        JSONObject jSONObject = jSONObject;
                        if (jSONObject == null) {
                            try {
                                jSONObject = new JSONObject();
                            } catch (Exception e) {
                                e.printStackTrace();
                                return;
                            }
                        }
                        if (z) {
                            jSONObject.put("click_position", "notify");
                            if (str != null) {
                                jSONObject.put("position", str);
                            } else {
                                jSONObject.put("position", "push_body");
                            }
                        } else {
                            jSONObject.put("click_position", "alert");
                        }
                        if (!TextUtils.isEmpty(str2)) {
                            jSONObject.put("post_back", str2);
                        }
                        jSONObject.put("rule_id", String.valueOf(j));
                        C39162r.m79461a("push_click_v2", jSONObject);
                    }
                });
            }
        });
    }

    @Override // com.p2082ss.android.ugc.awemepushapi.IPushApi
    public void onGcmNotificationClick(JSONObject jSONObject, Activity activity, int i, String str, int i2, String str2) {
        try {
            jSONObject.optInt("preload_article", 0);
            String optString = jSONObject.optString("open_url");
            Intent intent = null;
            if (C13627m.m24498a(optString)) {
                JSONObject optJSONObject = jSONObject.optJSONObject("app_data");
                if (optJSONObject != null) {
                    int optInt = optJSONObject.optInt("t", 0);
                    int optInt2 = optJSONObject.optInt("p", 0);
                    long optLong = optJSONObject.optLong("uid", 0);
                    if (optInt == 1) {
                        if (optInt2 == 1) {
                            throw new NullPointerException("addFlags");
                        } else if (optInt2 == 3) {
                            throw new NullPointerException("addFlags");
                        } else if (optInt2 == 4) {
                            if (optLong > 0) {
                                C81861e.m141757a(null);
                            }
                        }
                    }
                }
            } else {
                Uri parse = Uri.parse(optString);
                String scheme = parse.getScheme();
                if ("sslocal".equals(scheme)) {
                    parse = Uri.parse(C41050m.f95959a.mo70176b(optString));
                }
                intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                if (C41050m.f95959a.mo70174a(scheme)) {
                    intent.putExtra("is_from_self", true);
                }
                intent.setData(parse);
            }
            String packageName = activity.getPackageName();
            if (intent != null || (intent = C29843f.m60127a(activity, packageName)) != null) {
                intent.addFlags(268435456);
                C81861e.m141757a(intent);
                intent.putExtra("msg_from", 2);
                intent.putExtra("msg_id", i);
                intent.putExtra("message_from", str);
                if (!C13627m.m24498a(str2)) {
                    intent.putExtra("message_extra", str2);
                }
                if (!C81861e.m141758a(i2, activity, intent) && !activity.isFinishing()) {
                    C84349a.m145093a(intent, activity);
                    activity.startActivity(intent);
                }
            }
        } catch (Exception unused) {
            C17308a.m32047a();
        }
    }
}
