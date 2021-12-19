package com.p2082ss.android.ugc.awemepushlib.manager;

import android.app.NotificationManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.apm.C12290b;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.p1206f.C17308a;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.p1610b.AbstractC21993ag;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.p2082ss.android.common.util.C29843f;
import com.p2082ss.android.common.util.NetworkUtils;
import com.p2082ss.android.ugc.aweme.AccountService;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.awemepushlib.interaction.C81863g;
import com.p2082ss.android.ugc.awemepushlib.interaction.C81867i;
import com.p2082ss.android.ugc.awemepushlib.p4247c.C81822a;
import com.p2082ss.android.ugc.awemepushlib.p4247c.C81823b;
import com.p2082ss.android.ugc.awemepushlib.p4251f.C81834c;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.awemepushlib.manager.MessageShowHandler */
public final class MessageShowHandler {

    /* renamed from: a */
    static boolean f183066a = true;

    /* renamed from: b */
    static NotificationManager f183067b;

    /* renamed from: c */
    static final List<C81897a> f183068c = new ArrayList();

    /* renamed from: d */
    public static final List<String> f183069d = new ArrayList();

    /* renamed from: e */
    static final Comparator<C81897a> f183070e = new Comparator<C81897a>() {
        /* class com.p2082ss.android.ugc.awemepushlib.manager.MessageShowHandler.C818952 */

        static {
            Covode.recordClassIndex(95311);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(C81897a aVar, C81897a aVar2) {
            C81897a aVar3 = aVar;
            C81897a aVar4 = aVar2;
            if (aVar3.f183079b == aVar4.f183079b) {
                return 0;
            }
            if (aVar3.f183079b > aVar4.f183079b) {
                return -1;
            }
            return 1;
        }
    };

    /* renamed from: f */
    private static final Object f183071f = new Object();

    /* renamed from: g */
    private static volatile boolean f183072g = false;

    /* renamed from: h */
    private static DownloadImageApi f183073h;

    /* renamed from: i */
    private static WeakHandler f183074i = new WeakHandler(Looper.getMainLooper(), new WeakHandler.IHandler() {
        /* class com.p2082ss.android.ugc.awemepushlib.manager.MessageShowHandler.C818941 */

        static {
            Covode.recordClassIndex(95310);
        }

        @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
        public final void handleMsg(Message message) {
        }
    });

    /* renamed from: com.ss.android.ugc.awemepushlib.manager.MessageShowHandler$DownloadImageApi */
    public interface DownloadImageApi {
        static {
            Covode.recordClassIndex(95313);
        }

        @AbstractC22000h
        AbstractC21983b<TypedInput> downloadImageWithUrl(@AbstractC21993ag String str);
    }

    /* renamed from: a */
    private static void m141815a(Intent intent) {
        if (intent != null) {
            intent.putExtra("from_notification", true);
            String uuid = UUID.randomUUID().toString();
            f183069d.add(uuid);
            intent.putExtra("from_notification_uuid", uuid);
        }
    }

    /* renamed from: a */
    public static void m141814a(Context context, String str, int i) {
        C81823b from;
        if (!C13627m.m24498a(str) && (from = C81823b.from(str)) != null && !AwemeRedBadgerManager.f183060b.mo125542a(context, from)) {
            C81867i.m141778a(from, i);
            C81867i.m141780a(from.openUrl, true);
            from.extra.turn_screen_on = false;
            m141809a(context, i, from);
            C81900a.m141823a().mo125550a(System.currentTimeMillis());
        }
    }

    /* renamed from: a */
    private static boolean m141819a(String str) {
        Uri parse;
        if (TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null) {
            return false;
        }
        String queryParameter = parse.getQueryParameter("need_filter_uid");
        if (queryParameter == null) {
            queryParameter = "0";
        }
        if (queryParameter.equals("0")) {
            return false;
        }
        try {
            String secUid = AccountService.m65215a().mo57069e().getCurUser().getSecUid();
            String queryParameter2 = parse.getQueryParameter("sec_target_uid");
            if (!TextUtils.isEmpty(queryParameter2) && !TextUtils.equals(secUid, queryParameter2)) {
                return true;
            }
            return false;
        } catch (NullPointerException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: a */
    private static boolean m141818a(Context context, C81823b bVar, int i, JSONObject jSONObject) {
        C81867i.m141777a(context, "news_achieve", bVar.f182958id, (long) i, jSONObject);
        if (bVar.isPing == 1) {
            return true;
        }
        if (C13627m.m24498a(bVar.text)) {
            if (bVar.pass_through == 0) {
                m141808a(context);
            }
            return true;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (bVar.pass_through == 0 || bVar.filter == 0 || !C81900a.m141823a().mo125552a(bVar.f182958id, currentTimeMillis)) {
            return false;
        }
        Logger.debug();
        C81867i.m141777a(context, "news_forbid", bVar.f182958id, 2, new JSONObject[0]);
        C17308a.m32047a();
        return true;
    }

    /* renamed from: a */
    private static void m141816a(C81823b bVar) {
        if (bVar != null && !TextUtils.isEmpty(bVar.extra.notificationChannelId)) {
            bVar.extra.notificationChannelId = C81863g.m141763a(bVar.extra.notificationChannelId, bVar.soundType);
        }
    }

    /* renamed from: a */
    private static void m141817a(String str, String str2, String str3, Bitmap bitmap, int i, String str4) {
        JSONObject a = new C33743c().mo59976a("content", str2).mo59976a("title", str).mo59976a("imageUrl", str3).mo59976a("errorMsg", str4).mo59976a("imageType", String.valueOf(i)).mo59977a();
        if (bitmap != null) {
            C12290b.m22060a("aweme_push_image_load_error_rate", 0, a);
        } else if (TextUtils.isEmpty(str4) || !str4.contains("network not available")) {
            C12290b.m22060a("aweme_push_image_load_error_rate", 1, a);
        }
    }

    /* renamed from: com.ss.android.ugc.awemepushlib.manager.MessageShowHandler$b */
    static class RunnableC81898b implements Runnable {

        /* renamed from: a */
        private final String f183080a;

        static {
            Covode.recordClassIndex(95315);
        }

        public final void run() {
            Context a = C17867d.m33078a();
            if (a != null) {
                try {
                    MessageShowHandler.m141813a(a, this.f183080a);
                } catch (Exception unused) {
                }
            }
        }

        private RunnableC81898b(String str) {
            this.f183080a = str;
        }

        /* synthetic */ RunnableC81898b(String str, byte b) {
            this(str);
        }
    }

    static {
        Covode.recordClassIndex(95309);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.awemepushlib.manager.MessageShowHandler$c */
    public static class RunnableC81899c implements Runnable {

        /* renamed from: a */
        private final String[] f183081a;

        static {
            Covode.recordClassIndex(95316);
        }

        public final void run() {
            String[] strArr = this.f183081a;
            if (strArr != null && strArr.length > 0) {
                try {
                    String str = strArr[0];
                    String str2 = strArr[1];
                    String str3 = strArr[2];
                    String str4 = strArr[3];
                    if (!TextUtils.isEmpty(str)) {
                        Logger.debug();
                        JSONObject jSONObject = new JSONObject();
                        if (!TextUtils.isEmpty(str2)) {
                            jSONObject.put("did", str2);
                        }
                        if (!TextUtils.isEmpty(str3)) {
                            jSONObject.put("id", str3);
                        }
                        if (!TextUtils.isEmpty(str4)) {
                            jSONObject.put("url", str4);
                        }
                        if ("success".equals(new JSONObject(NetworkUtils.executePost(-1, str, jSONObject.toString().getBytes("UTF-8"), NetworkUtils.EnumC29832e.GZIP, "application/json")).optString("message"))) {
                            Logger.debug();
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }

        RunnableC81899c(String[] strArr) {
            this.f183081a = strArr;
        }
    }

    /* renamed from: a */
    private static void m141808a(Context context) {
        if (context != null) {
            try {
                Intent a = C29843f.m60127a(context, context.getPackageName());
                if (a != null) {
                    a.addFlags(268435456);
                    m141815a(a);
                    m141811a(context, a);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    private static Bitmap m141820b(String str) {
        MethodCollector.m26663i(10670);
        if (f183073h == null) {
            f183073h = (DownloadImageApi) RetrofitFactory.m33635a().mo28817b(str).mo28832d().mo28858a(DownloadImageApi.class);
        }
        try {
            Bitmap decodeStream = BitmapFactory.decodeStream(f183073h.downloadImageWithUrl(str).execute().f52262b.mo11577in());
            MethodCollector.m26664o(10670);
            return decodeStream;
        } catch (Exception e) {
            e.printStackTrace();
            MethodCollector.m26664o(10670);
            return null;
        }
    }

    /* renamed from: b */
    private static void m141822b(Context context) {
        String string;
        MethodCollector.m26663i(10675);
        ArrayList arrayList = new ArrayList();
        try {
            synchronized (f183071f) {
                try {
                    string = C34822d.m71158a(context, "app_notify_info", 0).getString("notify_list", null);
                } catch (Throwable th) {
                    MethodCollector.m26664o(10675);
                    throw th;
                }
            }
            if (!C13627m.m24498a(string)) {
                JSONArray jSONArray = new JSONArray(string);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    long optLong = jSONObject.optLong("time", 0);
                    int optInt = jSONObject.optInt("id", 0);
                    if (optInt > 0) {
                        arrayList.add(new C81897a((long) optInt, optLong));
                    }
                }
            }
        } catch (Exception unused) {
        }
        if (!arrayList.isEmpty()) {
            try {
                List<C81897a> list = f183068c;
                list.clear();
                list.addAll(arrayList);
                MethodCollector.m26664o(10675);
                return;
            } catch (Exception unused2) {
            }
        }
        MethodCollector.m26664o(10675);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.awemepushlib.manager.MessageShowHandler$a */
    public static class C81897a {

        /* renamed from: a */
        public long f183078a;

        /* renamed from: b */
        public long f183079b;

        static {
            Covode.recordClassIndex(95314);
        }

        C81897a(long j, long j2) {
            this.f183078a = j;
            this.f183079b = j2;
        }
    }

    /* renamed from: a */
    private static void m141811a(Context context, Intent intent) {
        C84349a.m145093a(intent, context);
        context.startActivity(intent);
    }

    /* renamed from: b */
    private static Object m141821b(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(10503);
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
                    MethodCollector.m26664o(10503);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: a */
    public static void m141813a(Context context, String str) {
        MethodCollector.m26663i(10673);
        synchronized (f183071f) {
            try {
                SharedPreferences.Editor edit = C34822d.m71158a(context, "app_notify_info", 0).edit();
                edit.putString("notify_list", str);
                edit.commit();
            } finally {
                MethodCollector.m26664o(10673);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:90:0x0234 A[ADDED_TO_REGION, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0235  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m141809a(final android.content.Context r16, final int r17, final com.p2082ss.android.ugc.awemepushlib.p4247c.C81823b r18) {
        /*
        // Method dump skipped, instructions count: 589
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.awemepushlib.manager.MessageShowHandler.m141809a(android.content.Context, int, com.ss.android.ugc.awemepushlib.c.b):void");
    }

    /* renamed from: a */
    public static void m141810a(Context context, int i, String str, int i2) {
        if (context != null && str != null) {
            try {
                if (C81900a.m141823a().mo125559d(context) && !TextUtils.isEmpty(str)) {
                    m141814a(context, str, i2);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    private static Intent m141805a(Context context, int i, C81823b bVar, int i2) {
        Intent intent;
        if (i2 == 2) {
            try {
                Intent intent2 = new Intent();
                try {
                    intent2.setPackage(context.getPackageName());
                    intent = intent2;
                } catch (Throwable unused) {
                    return intent2;
                }
            } catch (Throwable unused2) {
                return null;
            }
        } else {
            Intent a = C81822a.m141699a(context, bVar);
            if (a == null) {
                return null;
            }
            try {
                a.addFlags(268435456);
                intent = a;
            } catch (Throwable unused3) {
                return a;
            }
        }
        m141815a(intent);
        boolean z = true;
        if (i2 == 0) {
            intent.putExtra("msg_from", 1);
        } else if (i2 == 1) {
            intent.putExtra("msg_from", 2);
        }
        intent.putExtra("msg_id", bVar.f182958id);
        intent.putExtra("message_from", i);
        if (!C13627m.m24498a(bVar.extra.toJsonString())) {
            intent.putExtra("message_extra", bVar.extra.toJsonString());
        }
        if (!(bVar.extra.activeClickValid == 1 || C16048b.m29633a().mo25412a(true, "cancel_other_push", 0) == 1)) {
            z = false;
        }
        intent.putExtra("clear_all_notifications", z);
        intent.putExtra("imageType", bVar.imageType);
        return intent;
    }

    /* renamed from: a */
    static final /* synthetic */ Object m141807a(Bitmap[] bitmapArr, C81823b bVar, Context context, Bitmap[] bitmapArr2, int i) {
        String str;
        boolean z;
        try {
            bitmapArr[0] = m141820b(bVar.imageUrl);
            if (bitmapArr[0] == null) {
                bitmapArr[0] = m141820b(bVar.imageUrl);
                C81834c cVar = new C81834c();
                if (bitmapArr[0] != null) {
                    z = true;
                } else {
                    z = false;
                }
                cVar.f182970a.put("retrySuccess", Boolean.valueOf(z));
                C81867i.m141777a(context, "push_image_retry", 0, 0, cVar.mo125504a());
            }
            if (!TextUtils.isEmpty(bVar.extra.largeModeIconUrl)) {
                bitmapArr2[0] = m141820b(bVar.extra.largeModeIconUrl);
            }
            String str2 = bVar.title;
            String str3 = bVar.text;
            String str4 = bVar.imageUrl;
            Bitmap bitmap = bitmapArr[0];
            int i2 = bVar.imageType;
            if (bitmapArr[0] == null) {
                str = "imageUrlbitmap==null";
            } else {
                str = "";
            }
            m141817a(str2, str3, str4, bitmap, i2, str);
        } catch (Exception e) {
            m141817a(bVar.title, bVar.text, bVar.imageUrl, null, bVar.imageType, Log.getStackTraceString(e));
            m141812a(context, (Bitmap) null, (Bitmap) null, i, bVar);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003a, code lost:
        if (com.p2082ss.android.ugc.aweme.utils.p4203d.C80329c.f179849a == 1) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0054, code lost:
        if (r2 == 1) goto L_0x003c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01ad A[Catch:{ Exception -> 0x01cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01af A[Catch:{ Exception -> 0x01cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01b8 A[Catch:{ Exception -> 0x01cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01bd A[Catch:{ Exception -> 0x01cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01c0 A[ADDED_TO_REGION, Catch:{ Exception -> 0x01cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:? A[ADDED_TO_REGION, Catch:{ Exception -> 0x01cd }, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m141812a(android.content.Context r21, android.graphics.Bitmap r22, android.graphics.Bitmap r23, int r24, com.p2082ss.android.ugc.awemepushlib.p4247c.C81823b r25) {
        /*
        // Method dump skipped, instructions count: 470
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.awemepushlib.manager.MessageShowHandler.m141812a(android.content.Context, android.graphics.Bitmap, android.graphics.Bitmap, int, com.ss.android.ugc.awemepushlib.c.b):void");
    }
}
