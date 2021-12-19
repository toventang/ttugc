package com.bytedance.push.notification;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.push.p1593f.C21799a;
import com.bytedance.push.settings.C21895h;
import com.bytedance.push.settings.LocalFrequencySettings;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.message.p2159a.C30062a;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.push.notification.e */
final class C21869e {

    /* renamed from: a */
    static AbstractC21871b f51801a;

    /* renamed from: com.bytedance.push.notification.e$b */
    interface AbstractC21871b {
        static {
            Covode.recordClassIndex(25524);
        }

        /* renamed from: a */
        JSONArray mo35555a(Context context);

        /* renamed from: a */
        void mo35556a(Context context, C21799a aVar);

        /* renamed from: a */
        boolean mo35557a(Context context, int i);

        /* renamed from: b */
        void mo35559b(Context context, C21799a aVar);
    }

    /* renamed from: com.bytedance.push.notification.e$a */
    static class C21870a implements AbstractC21871b {

        /* renamed from: a */
        private NotificationManager f51802a;

        static {
            Covode.recordClassIndex(25523);
        }

        @Override // com.bytedance.push.notification.C21869e.AbstractC21871b
        /* renamed from: a */
        public void mo35556a(Context context, C21799a aVar) {
        }

        @Override // com.bytedance.push.notification.C21869e.AbstractC21871b
        /* renamed from: b */
        public void mo35559b(Context context, C21799a aVar) {
        }

        private C21870a() {
        }

        /* synthetic */ C21870a(byte b) {
            this();
        }

        @Override // com.bytedance.push.notification.C21869e.AbstractC21871b
        /* renamed from: a */
        public JSONArray mo35555a(Context context) {
            return new JSONArray();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final NotificationManager mo35558b(Context context) {
            if (this.f51802a == null) {
                this.f51802a = (NotificationManager) m40973a(context, "notification");
            }
            return this.f51802a;
        }

        @Override // com.bytedance.push.notification.C21869e.AbstractC21871b
        /* renamed from: a */
        public boolean mo35557a(Context context, int i) {
            if (C30062a.m60805b(context) != i) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        private static Object m40973a(Context context, String str) {
            Object obj;
            MethodCollector.m26663i(4580);
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
                        MethodCollector.m26664o(4580);
                    }
                }
            } else {
                obj = context.getSystemService(str);
            }
            return obj;
        }
    }

    /* renamed from: com.bytedance.push.notification.e$c */
    static class C21872c extends C21870a {

        /* renamed from: a */
        private List<NotificationChannel> f51803a;

        static {
            Covode.recordClassIndex(25525);
        }

        private C21872c() {
            super((byte) 0);
        }

        /* synthetic */ C21872c(byte b) {
            this();
        }

        @Override // com.bytedance.push.notification.C21869e.AbstractC21871b, com.bytedance.push.notification.C21869e.C21870a
        /* renamed from: a */
        public final JSONArray mo35555a(Context context) {
            return m40984a(m40986c(context));
        }

        /* renamed from: a */
        private static Map<String, C21799a> m40983a(JSONArray jSONArray) {
            if (jSONArray.length() == 0) {
                return Collections.emptyMap();
            }
            HashMap hashMap = new HashMap(jSONArray.length());
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                hashMap.put(optJSONObject.optString("id"), new C21799a(optJSONObject));
            }
            return hashMap;
        }

        /* renamed from: c */
        private List<NotificationChannel> m40986c(Context context) {
            List<NotificationChannel> list = this.f51803a;
            if (list == null || list.isEmpty()) {
                try {
                    this.f51803a = ((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationChannels();
                } catch (Throwable unused) {
                    this.f51803a = Collections.emptyList();
                }
            }
            return this.f51803a;
        }

        /* renamed from: d */
        private boolean m40987d(Context context) {
            try {
                List<NotificationChannel> c = m40986c(context);
                String i = ((LocalFrequencySettings) C21895h.m41120a(context, LocalFrequencySettings.class)).mo35592i();
                if (TextUtils.isEmpty(i)) {
                    if (c != null) {
                        if (!c.isEmpty()) {
                            return true;
                        }
                    }
                    return false;
                } else if (!m40985a(c, m40983a(new JSONArray(i)))) {
                    return true;
                } else {
                    return false;
                }
            } catch (JSONException e) {
                e.printStackTrace();
                return false;
            }
        }

        /* renamed from: a */
        private static JSONArray m40984a(List<NotificationChannel> list) {
            JSONArray jSONArray = new JSONArray();
            if (list == null) {
                return jSONArray;
            }
            for (NotificationChannel notificationChannel : list) {
                try {
                    C21799a aVar = new C21799a(notificationChannel);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("id", aVar.f51658c);
                    jSONObject.put(StringSet.name, aVar.f51659d);
                    jSONObject.put("importance", aVar.f51660e);
                    jSONObject.put("bypassDnd", aVar.f51661f);
                    jSONObject.put("lockscreenVisibility", aVar.f51662g);
                    jSONObject.put("lights", aVar.f51663h);
                    jSONObject.put("vibration", aVar.f51664i);
                    jSONObject.put("showBadge", aVar.f51665j);
                    jSONObject.put("enable", aVar.f51657b);
                    jSONObject.put("desc", aVar.f51656a);
                    jSONArray.put(jSONObject);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            return jSONArray;
        }

        @Override // com.bytedance.push.notification.C21869e.AbstractC21871b, com.bytedance.push.notification.C21869e.C21870a
        /* renamed from: a */
        public final boolean mo35557a(Context context, int i) {
            if (super.mo35557a(context, i)) {
                return true;
            }
            return m40987d(context);
        }

        @Override // com.bytedance.push.notification.C21869e.AbstractC21871b, com.bytedance.push.notification.C21869e.C21870a
        /* renamed from: b */
        public final void mo35559b(Context context, C21799a aVar) {
            NotificationManager b;
            if (aVar != null && (b = mo35558b(context)) != null && !TextUtils.isEmpty(aVar.f51658c) && b.getNotificationChannel(aVar.f51658c) != null) {
                b.deleteNotificationChannel(aVar.f51658c);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:6:0x0016  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static boolean m40985a(java.util.List<android.app.NotificationChannel> r6, java.util.Map<java.lang.String, com.bytedance.push.p1593f.C21799a> r7) {
            /*
                int r1 = r6.size()
                int r0 = r7.size()
                r5 = 0
                if (r1 == r0) goto L_0x000c
                return r5
            L_0x000c:
                java.util.Iterator r4 = r6.iterator()
            L_0x0010:
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L_0x0056
                java.lang.Object r3 = r4.next()
                android.app.NotificationChannel r3 = (android.app.NotificationChannel) r3
                java.lang.String r0 = r3.getId()
                java.lang.Object r2 = r7.get(r0)
                com.bytedance.push.f.a r2 = (com.bytedance.push.p1593f.C21799a) r2
                if (r2 != 0) goto L_0x0029
                return r5
            L_0x0029:
                int r1 = r2.f51660e
                int r0 = r3.getImportance()
                if (r1 == r0) goto L_0x0032
                return r5
            L_0x0032:
                int r1 = r2.f51662g
                int r0 = r3.getLockscreenVisibility()
                if (r1 == r0) goto L_0x003b
                return r5
            L_0x003b:
                boolean r1 = r2.f51661f
                boolean r0 = r3.canBypassDnd()
                if (r1 == r0) goto L_0x0044
                return r5
            L_0x0044:
                boolean r1 = r2.f51663h
                boolean r0 = r3.shouldShowLights()
                if (r1 == r0) goto L_0x004d
                return r5
            L_0x004d:
                boolean r1 = r2.f51664i
                boolean r0 = r3.shouldVibrate()
                if (r1 == r0) goto L_0x0010
                return r5
            L_0x0056:
                r0 = 1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.push.notification.C21869e.C21872c.m40985a(java.util.List, java.util.Map):boolean");
        }

        @Override // com.bytedance.push.notification.C21869e.AbstractC21871b, com.bytedance.push.notification.C21869e.C21870a
        /* renamed from: a */
        public final void mo35556a(Context context, C21799a aVar) {
            NotificationManager b;
            if (aVar != null && (b = mo35558b(context)) != null && !TextUtils.isEmpty(aVar.f51658c) && !TextUtils.isEmpty(aVar.f51659d) && b.getNotificationChannel(aVar.f51658c) == null) {
                int i = aVar.f51660e;
                if (i < 0 || i > 5) {
                    i = 3;
                }
                NotificationChannel notificationChannel = new NotificationChannel(aVar.f51658c, aVar.f51659d, i);
                notificationChannel.setShowBadge(aVar.f51665j);
                notificationChannel.setDescription(aVar.f51656a);
                notificationChannel.enableVibration(aVar.f51664i);
                notificationChannel.setBypassDnd(aVar.f51661f);
                notificationChannel.enableLights(aVar.f51663h);
                notificationChannel.setLockscreenVisibility(aVar.f51662g);
                b.createNotificationChannel(notificationChannel);
            }
        }
    }

    static {
        Covode.recordClassIndex(25522);
        if (Build.VERSION.SDK_INT >= 26) {
            f51801a = new C21872c((byte) 0);
        } else {
            f51801a = new C21870a((byte) 0);
        }
    }
}
