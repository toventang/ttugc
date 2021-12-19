package com.p2082ss.android.p2092ad.splash.p2109f;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.TouchDelegate;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.core.p035f.C0687g;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.p2092ad.splash.core.C29478f;
import com.p2082ss.android.p2092ad.splash.core.C29495h;
import com.p2082ss.android.p2092ad.splash.core.C29535k;
import com.p2082ss.android.p2092ad.splash.core.C29556v;
import com.p2082ss.android.p2092ad.splash.core.C29628x;
import com.p2082ss.android.p2092ad.splash.core.p2098c.C29446b;
import com.p2082ss.android.p2092ad.splash.core.p2100e.C29455b;
import com.p2082ss.android.p2092ad.splash.core.p2100e.C29462f;
import com.p2082ss.android.p2092ad.splash.core.p2100e.C29464h;
import com.p2082ss.android.p2092ad.splash.core.p2100e.C29467k;
import com.p2082ss.android.p2092ad.splash.core.p2100e.C29468l;
import com.p2082ss.android.p2092ad.splash.core.p2100e.C29474p;
import com.p2082ss.android.p2092ad.splash.core.video2.AbstractC29621g;
import com.p2082ss.android.p2092ad.splash.core.video2.BDASplashVideoView;
import com.p2082ss.android.p2092ad.splash.core.video2.C29589a;
import com.p2082ss.android.p2092ad.splash.core.video2.C29614d;
import com.p2082ss.android.p2092ad.splash.p2094b.C29375a;
import com.p2082ss.android.p2092ad.splash.p2095c.AbstractC29383a;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import com.p2082ss.android.ugc.trill.R;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.f.j */
public final class C29654j {

    /* renamed from: a */
    private static final Map<String, String> f70722a;

    /* renamed from: b */
    private static final Set<String> f70723b;

    /* renamed from: a */
    public static boolean m59727a(long j, long j2) {
        return j2 > j;
    }

    /* renamed from: a */
    public static boolean m59732a(C29556v vVar) {
        int m = vVar.mo51756m();
        return m > 0 && vVar.mo51758o() >= m;
    }

    /* renamed from: a */
    public static String m59712a(C29462f fVar) {
        List<String> list;
        if (fVar == null || (list = fVar.f70075a) == null || list.isEmpty()) {
            return null;
        }
        String str = list.get(0);
        if (!C29657l.m59760a(str) || list.size() < 2) {
            return str;
        }
        String str2 = list.get(1);
        return (!C29657l.m59760a(str2) || list.size() < 3) ? str2 : list.get(2);
    }

    /* renamed from: a */
    public static String m59713a(C29474p pVar) {
        if (pVar == null || pVar.f70123c == null || pVar.f70123c.isEmpty()) {
            return null;
        }
        return C29659n.m59766a(pVar.f70123c.get(0));
    }

    /* renamed from: a */
    private static void m59725a(Calendar calendar) {
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
    }

    /* renamed from: a */
    public static String m59716a(boolean z) {
        C29478f b = C29495h.m59102b();
        b.f70135a = false;
        HashMap<String, String> i = C29495h.m59110i();
        StringBuilder sb = new StringBuilder(5120);
        try {
            String r = C29556v.m59363a().mo51761r();
            sb.append("/api/ad/v1/splash/stock/");
            sb.append("?_unused=0");
            sb.append((CharSequence) m59757k());
            sb.append(b.toString());
            if (i != null) {
                sb.append(m59715a(i));
            }
            if (z) {
                sb.append("&show_limit=1");
            } else {
                sb.append("&show_limit=0");
            }
            if (!TextUtils.isEmpty(r)) {
                sb.append(r);
            }
            int p = C29556v.m59363a().mo51759p();
            C29638a.m59659a(0, " sending stop request, current refresh time is ".concat(String.valueOf(p)));
            sb.append("&refresh_num=");
            sb.append(p);
            if (C29495h.f70200X != -1) {
                sb.append("&is_cold_start=");
                sb.append(C29495h.f70200X);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static boolean m59729a(C29455b bVar) {
        if (bVar == null) {
            return false;
        }
        return bVar.mo51544i() || bVar.mo51542h();
    }

    /* renamed from: a */
    public static boolean m59730a(C29462f fVar, C29556v vVar) {
        return fVar != null && fVar.mo51558a() && m59734a(fVar.f70078d, vVar);
    }

    /* renamed from: a */
    public static boolean m59731a(C29474p pVar, C29556v vVar) {
        return pVar != null && pVar.mo51561a() && m59734a(pVar.f70124d, vVar);
    }

    /* renamed from: a */
    private static boolean m59734a(String str, C29556v vVar) {
        if (C29657l.m59760a(str)) {
            return false;
        }
        String[] strArr = {m59751e(str), m59746c(str)};
        int i = 0;
        do {
            String str2 = strArr[i];
            if (!TextUtils.isEmpty(str2) && new File(str2).exists()) {
                if (vVar.mo51746f(str)) {
                    return true;
                }
                C29446b.m58971a();
                C29446b.m58979a(str, str2);
                C29535k.m59196a();
                C29535k.m59197a(str, str2);
            }
            i++;
        } while (i < 2);
        vVar.mo51744e(str);
        return false;
    }

    /* renamed from: a */
    public static List<C29455b> m59720a(JSONArray jSONArray, long j, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            int length = jSONArray.length();
            JSONObject jSONObject = null;
            if (z) {
                jSONObject = m59753g();
            }
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    C29455b bVar = new C29455b();
                    bVar.mo51533a(optJSONObject, j, z);
                    if (z) {
                        if (jSONObject != null) {
                            int optInt = jSONObject.optInt(String.valueOf(bVar.f70026d), 0);
                            bVar.f69993R = optInt;
                            C29638a.m59661a("show times updated, id:" + bVar.f70026d + ", current show time: " + optInt);
                        }
                    } else if (m59729a(bVar)) {
                        C29446b.m58971a();
                        C29446b.m58978a(bVar, "topview_boarding");
                    }
                    arrayList.add(bVar);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static List<C29455b> m59721a(JSONArray jSONArray, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    C29455b bVar = new C29455b();
                    bVar.mo51531a(optJSONObject);
                    if (!z) {
                        arrayList.add(bVar);
                    } else if (System.currentTimeMillis() <= bVar.mo51539e()) {
                        arrayList.add(bVar);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static Map<String, C29455b> m59722a(List<C29455b> list) {
        HashMap hashMap = new HashMap();
        if (C29643f.m59683a(list)) {
            return hashMap;
        }
        for (C29455b bVar : list) {
            if (!TextUtils.isEmpty(bVar.f69980E)) {
                hashMap.put(bVar.f69980E, bVar);
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public static List<C29455b> m59717a(List<C29455b> list, List<C29455b> list2) {
        if (list == null) {
            list = new ArrayList<>();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            C29455b bVar = list.get(i);
            long currentTimeMillis = System.currentTimeMillis();
            Calendar instance = Calendar.getInstance();
            instance.set(11, 23);
            instance.set(12, 59);
            instance.set(13, 59);
            instance.set(14, 999);
            if (bVar.mo51538d() > instance.getTimeInMillis() || currentTimeMillis >= bVar.mo51539e()) {
                C29638a.m59659a(bVar.f70026d, "preload progress: first-show ad expired");
            } else {
                arrayList.add(bVar);
                C29638a.m59659a(bVar.f70026d, "preload progress: suitable first-show ad");
            }
        }
        ArrayList arrayList2 = new ArrayList();
        if (C29643f.m59683a(list2)) {
            return arrayList;
        }
        for (C29455b bVar2 : list2) {
            if (bVar2.f70043u == 1) {
                arrayList2.add(bVar2);
                C29638a.m59659a(bVar2.f70026d, "preload progress: get one first-show ad");
            }
        }
        arrayList.removeAll(arrayList2);
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    /* renamed from: a */
    public static <E extends C29468l> List<C29455b> m59718a(Map<String, C29455b> map, List<E> list) {
        ArrayList arrayList = new ArrayList();
        if (!C29643f.m59683a(list) && map != null) {
            for (E e : list) {
                C29455b bVar = map.get(e.mo51554x());
                if (bVar != null) {
                    if (e instanceof C29467k) {
                        bVar.f70032j = ((C29467k) e).f70095a;
                        bVar.f69978C = true;
                    }
                    arrayList.add(bVar);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static List<C29468l> m59719a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                String optString = jSONArray.optString(i);
                if (!TextUtils.isEmpty(optString)) {
                    arrayList.add(new C29468l(optString));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static String m59715a(HashMap<String, String> hashMap) {
        if (hashMap == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            if (!C29657l.m59760a(entry.getKey()) && !C29657l.m59760a(entry.getValue())) {
                sb.append("&");
                sb.append(C1764a.m5928a("%s=%s", new Object[]{entry.getKey(), entry.getValue()}));
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static void m59723a(final View view, final int i, final int i2, final int i3, final int i4) {
        ((View) view.getParent()).post(new Runnable() {
            /* class com.p2082ss.android.p2092ad.splash.p2109f.C29654j.RunnableC296551 */

            static {
                Covode.recordClassIndex(36051);
            }

            public final void run() {
                View view = view;
                if (view != null && view.getParent() != null) {
                    Rect rect = new Rect();
                    view.setEnabled(true);
                    view.getHitRect(rect);
                    rect.top -= i;
                    rect.bottom += i2;
                    rect.left -= i3;
                    rect.right += i4;
                    TouchDelegate touchDelegate = new TouchDelegate(rect, view);
                    if (View.class.isInstance(view.getParent())) {
                        ((View) view.getParent()).setTouchDelegate(touchDelegate);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    private static byte[] m59736a(InputStream inputStream) {
        MethodCollector.m26663i(12603);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read >= 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byteArrayOutputStream.flush();
                    byteArrayOutputStream.close();
                    m59724a(byteArrayOutputStream);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    MethodCollector.m26664o(12603);
                    return byteArray;
                }
            } catch (IOException e) {
                e.printStackTrace();
                m59724a(byteArrayOutputStream);
                MethodCollector.m26664o(12603);
                return null;
            } catch (Throwable th) {
                m59724a(byteArrayOutputStream);
                MethodCollector.m26664o(12603);
                throw th;
            }
        }
    }

    /* renamed from: a */
    private static void m59724a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static boolean m59728a(Context context) {
        return C0687g.m2442a(context.getResources().getConfiguration().locale) == 1;
    }

    /* renamed from: a */
    public static AbstractC29621g m59710a(BDASplashVideoView bDASplashVideoView) {
        if (C29495h.m59095a().f70667o) {
            return new C29589a(bDASplashVideoView);
        }
        return new C29614d(bDASplashVideoView);
    }

    /* renamed from: a */
    private static boolean m59733a(File file) {
        MethodCollector.m26663i(12109);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(12109);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(12109);
        return delete;
    }

    /* renamed from: a */
    private static Object m59711a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(11468);
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
                    MethodCollector.m26664o(11468);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: a */
    public static boolean m59735a(int[] iArr, long j, long j2) {
        C29638a.m59659a(0, ", is skippable: ");
        boolean z = true;
        if (iArr != null && iArr.length >= 2) {
            long a = m59705a(j);
            long j3 = (((long) iArr[0]) * 1000) + a;
            if (j2 > a + (((long) iArr[1]) * 1000) || j2 < j3) {
                z = false;
            }
            C29638a.m59659a(0, " whether first-show-timegap opportunity has been consumed : ".concat(String.valueOf(z)));
        }
        return z;
    }

    /* renamed from: a */
    public static String m59714a(C29474p pVar, boolean z) {
        if (TextUtils.isEmpty(C29495h.f70185I) || !z) {
            return m59740b(pVar);
        }
        return m59745c(pVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x001f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0012 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m59726a(int r4, boolean r5) {
        /*
            r3 = 0
            r1 = 2
            r2 = 1
            if (r4 == 0) goto L_0x001a
            if (r4 == r2) goto L_0x0013
            if (r4 == r1) goto L_0x0013
            r0 = 3
            if (r4 == r0) goto L_0x001a
            r1 = 0
        L_0x000d:
            int r0 = com.p2082ss.android.p2092ad.splash.core.C29495h.f70219ap
            r1 = r1 & r0
            if (r1 <= 0) goto L_0x001f
            return r2
        L_0x0013:
            if (r5 == 0) goto L_0x0018
            r1 = 8
            goto L_0x000d
        L_0x0018:
            r1 = 4
            goto L_0x000d
        L_0x001a:
            if (r5 == 0) goto L_0x001d
            goto L_0x000d
        L_0x001d:
            r1 = 1
            goto L_0x000d
        L_0x001f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.p2092ad.splash.p2109f.C29654j.m59726a(int, boolean):boolean");
    }

    /* renamed from: a */
    private static byte[] m59737a(byte[] bArr, String str) {
        try {
            int length = str.length() / 2;
            byte[] bArr2 = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr2[i] = Integer.valueOf(str.substring(i2, i2 + 2), 16).byteValue();
            }
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 12, bArr.length);
            IvParameterSpec ivParameterSpec = new IvParameterSpec(Arrays.copyOfRange(bArr, 0, 12));
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
            Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
            instance.init(2, secretKeySpec, ivParameterSpec);
            return instance.doFinal(copyOfRange);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static int m59702a() {
        int i = m59755i();
        if (i <= 0) {
            return m59756j();
        }
        return i;
    }

    /* renamed from: i */
    private static int m59755i() {
        return (int) C29661o.m59767a(C29495h.f70242r, (float) C29495h.f70189M);
    }

    /* renamed from: g */
    public static JSONObject m59753g() {
        try {
            String string = C29556v.m59363a().f70433b.getString("key_splash_show_times_map", "");
            if (!TextUtils.isEmpty(string)) {
                return new JSONObject(string);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: h */
    public static int m59754h() {
        int a = (int) C29661o.m59767a(C29495h.f70242r, (float) C29495h.f70195S);
        if (a > 0) {
            return a;
        }
        return (m59702a() / 2) - C29495h.f70242r.getResources().getDimensionPixelSize(R.dimen.sp);
    }

    /* renamed from: c */
    public static String m59744c() {
        C29464h hVar = C29535k.m59196a().f70370c;
        if (hVar == null) {
            return null;
        }
        List<C29455b> list = hVar.f70084a;
        if (C29643f.m59683a(list)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i).f69979D;
            if (!TextUtils.isEmpty(str)) {
                sb.append(str);
                if (i != list.size() - 1) {
                    sb.append(",");
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: d */
    public static String m59748d() {
        StringBuilder sb = new StringBuilder(5120);
        C29478f b = C29495h.m59102b();
        b.f70135a = true;
        try {
            String r = C29556v.m59363a().mo51761r();
            sb.append("/api/ad/v3/splash/creatives/");
            sb.append("?_unused=0");
            sb.append((CharSequence) m59757k());
            sb.append(b.toString());
            if (!TextUtils.isEmpty(r)) {
                sb.append(r);
            }
            if (C29495h.f70200X != -1) {
                sb.append("&is_cold_start=");
                sb.append(C29495h.f70200X);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    /* renamed from: e */
    public static String m59750e() {
        StringBuilder sb = new StringBuilder(5120);
        C29478f b = C29495h.m59102b();
        b.f70135a = true;
        try {
            String r = C29556v.m59363a().mo51761r();
            sb.append("/api/ad/v2/ack/splash/");
            sb.append("?_unused=0");
            sb.append((CharSequence) m59757k());
            sb.append(b.toString());
            if (!TextUtils.isEmpty(r)) {
                sb.append(r);
            }
            sb.append("&refresh_num=");
            sb.append(C29556v.m59363a().mo51759p());
            if (C29495h.f70200X != -1) {
                sb.append("&is_cold_start=");
                sb.append(C29495h.f70200X);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    /* renamed from: j */
    private static int m59756j() {
        int i;
        Point point = new Point();
        WindowManager windowManager = (WindowManager) m59711a(C29495h.f70242r, "window");
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getSize(point);
        }
        double d = (double) C29495h.f70242r.getResources().getDisplayMetrics().density;
        if (d <= 1.1d) {
            i = 100;
        } else if (d <= 1.6d) {
            i = 960;
        } else {
            i = 1260;
        }
        return (((point.y - C29646i.m59698a(C29495h.f70242r)) * 200) / i) + ((int) C29661o.m59767a(C29495h.f70242r, 25.0f));
    }

    /* renamed from: b */
    public static String m59738b() {
        C29478f b = C29495h.m59102b();
        b.f70135a = true;
        HashMap<String, String> i = C29495h.m59110i();
        String b2 = b.mo51564b();
        if (C29657l.m59760a(b2)) {
            C29638a.m59660a(0, "app_name is null, please check whether SplashAdSdk is initialized properly!", null);
            return null;
        }
        StringBuilder sb = new StringBuilder(5120);
        try {
            sb.append("/api/ad/splash/").append(b2);
            if (C29495h.f70201Y) {
                sb.append("/v14/");
            } else {
                sb.append("/v16/");
            }
            sb.append("?_unused=0");
            sb.append((CharSequence) m59757k());
            sb.append(b.toString());
            sb.append("&app_name=");
            sb.append(b2);
            if (i != null) {
                sb.append(m59715a(i));
            }
            sb.append("&refresh_num=");
            sb.append(C29556v.m59363a().mo51759p() + 1);
            if (C29495h.f70200X != -1) {
                sb.append("&is_cold_start=");
                sb.append(C29495h.f70200X);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    /* renamed from: f */
    public static long m59752f() {
        if (!C29495h.f70214ak) {
            return System.currentTimeMillis();
        }
        long e = C29628x.m59641a().mo51924e();
        if (e != -1) {
            C29638a.m59661a("time check, remote time back:".concat(String.valueOf(e)));
            return e;
        }
        long c = C29556v.m59363a().mo51735c();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime < c) {
            C29638a.m59661a("time check, device restarted, current time :" + elapsedRealtime + ", last boot time: " + c);
            return -1;
        }
        long b = C29556v.m59363a().mo51731b();
        long j = elapsedRealtime - c;
        long j2 = b + j;
        C29638a.m59661a("time check, last remote time: " + b + ", time gap between launch: " + j + ", current time calculated: " + j2);
        return j2;
    }

    static {
        Covode.recordClassIndex(36050);
        HashMap hashMap = new HashMap();
        f70722a = hashMap;
        HashSet hashSet = new HashSet();
        f70723b = hashSet;
        hashMap.put("1128", "aweme");
        hashMap.put("1180", "trill");
        hashMap.put("1233", "musical");
        hashMap.put("13", "news_article");
        hashMap.put("35", "news_article_lite");
        hashMap.put("32", "video_article");
        hashMap.put("1106", "topbuzz");
        hashMap.put("1116", "topbuzz");
        hashMap.put("1131", "topbuzz");
        hashMap.put("1184", "topbuzz");
        hashMap.put("1104", "topbuzz");
        hashMap.put("1117", "topbuzz");
        hashMap.put("1132", "topbuzz");
        hashMap.put("1185", "topbuzz");
        hashMap.put("1239", "topbuzz");
        hashMap.put("1197", "topbuzz");
        hashMap.put("1193", "topbuzz");
        hashMap.put("1222", "topbuzz");
        hashMap.put("1211", "topbuzz");
        hashMap.put("1194", "topbuzz");
        hashMap.put("1124", "topbuzz");
        hashMap.put("1125", "topbuzz");
        hashMap.put("1245", "topbuzz");
        hashMap.put("1113", "topbuzz");
        hashMap.put("1342", "topbuzz");
        hashMap.put("1346", "topbuzz");
        hashMap.put("1145", "live_i18n");
        hashMap.put("1164", "flipagram");
        hashMap.put("7", "neihan");
        hashMap.put("10001", "faceu");
        hashMap.put("1207", "learning");
        hashMap.put("36", "automobile");
        hashMap.put("150121", "beauty_me");
        hashMap.put("1372", "beauty_me_oversea");
        hashMap.put("1319", "super");
        hashMap.put("1370", "f100");
        hashMap.put("1488", "f101");
        hashMap.put("1353", "hively");
        hashMap.put("1354", "hively");
        hashMap.put("1112", "live_stream");
        hashMap.put("1350", "live_stream_lite");
        hashMap.put("1398", "homed");
        hashMap.put("1967", "novelapp");
        hashMap.put("1840", "xianshijie");
        hashMap.put("3040", "novel_fm");
        hashSet.add("1180");
        hashSet.add("1233");
        hashSet.add("1106");
        hashSet.add("1116");
        hashSet.add("1131");
        hashSet.add("1184");
        hashSet.add("1104");
        hashSet.add("1117");
        hashSet.add("1132");
        hashSet.add("1185");
        hashSet.add("1239");
        hashSet.add("1197");
        hashSet.add("1193");
        hashSet.add("1222");
        hashSet.add("1211");
        hashSet.add("1194");
        hashSet.add("1124");
        hashSet.add("1125");
        hashSet.add("1245");
        hashSet.add("1113");
        hashSet.add("1342");
        hashSet.add("1346");
        hashSet.add("1372");
    }

    /* renamed from: k */
    private static StringBuilder m59757k() {
        StringBuilder sb = new StringBuilder(1024);
        TelephonyManager telephonyManager = (TelephonyManager) m59711a(C29495h.f70242r, "phone");
        if (telephonyManager != null) {
            String networkOperatorName = telephonyManager.getNetworkOperatorName();
            if (!C29657l.m59760a(networkOperatorName)) {
                sb.append("&carrier=").append(Uri.encode(networkOperatorName));
            }
            String networkOperator = telephonyManager.getNetworkOperator();
            if (!C29657l.m59760a(networkOperator)) {
                sb.append("&mcc_mnc=").append(Uri.encode(networkOperator));
            }
        }
        DisplayMetrics displayMetrics = C29495h.f70242r.getResources().getDisplayMetrics();
        Context context = C29495h.f70242r;
        int b = C29646i.f70707c.mo51930b(context);
        int a = C29646i.m59699a(C29495h.f70242r, false);
        sb.append("&ad_area=").append(displayMetrics.widthPixels).append("x").append(displayMetrics.heightPixels - C29646i.m59698a(context));
        sb.append("&sdk_version=").append(C29495h.f70203a);
        sb.append("&os_api=").append(Build.VERSION.SDK_INT);
        sb.append("&device_platform=android");
        sb.append("&os_version=").append(Build.VERSION.RELEASE);
        if (C29495h.m59095a().f70670r) {
            sb.append("&display_density=").append(a).append("x").append(b);
        } else {
            sb.append("&display_density=").append(displayMetrics.widthPixels).append("x").append(displayMetrics.heightPixels);
        }
        sb.append("&dpi=").append(C29661o.m59774b(C29495h.f70242r));
        sb.append("&device_brand=").append(Uri.encode(Build.BRAND));
        sb.append("&device_type=").append(Uri.encode(Build.MODEL));
        int a2 = m59702a();
        if (a2 > 0) {
            sb.append("&bh=").append(a2);
        }
        sb.append("&display_dpi=").append(displayMetrics.densityDpi);
        sb.append("&density=").append(displayMetrics.density);
        String d = C29645h.m59697d(C29495h.f70242r);
        if (!C29657l.m59760a(d)) {
            sb.append("&ac=").append(Uri.encode(d));
        }
        return sb;
    }

    /* renamed from: b */
    public static String m59739b(C29462f fVar) {
        if (fVar == null || !fVar.mo51558a()) {
            return null;
        }
        return m59746c(fVar.f70078d);
    }

    /* renamed from: c */
    private static String m59745c(C29474p pVar) {
        if (pVar == null || !pVar.mo51561a()) {
            return null;
        }
        return m59751e(pVar.f70124d);
    }

    /* renamed from: e */
    private static String m59751e(String str) {
        if (C29657l.m59760a(str)) {
            return null;
        }
        String str2 = C29495h.f70185I;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        return m59747c(str2, str);
    }

    /* renamed from: a */
    public static int m59703a(String str) {
        if (C29657l.m59760a(str)) {
            return 0;
        }
        try {
            if (C29657l.m59760a(Uri.parse(str).getScheme())) {
                return 0;
            }
            if (C29662p.m59778a(str)) {
                return 2;
            }
            if (C29662p.m59779b(str)) {
                return 5;
            }
            return 1;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: b */
    public static String m59740b(C29474p pVar) {
        if (pVar == null || !pVar.mo51561a()) {
            return null;
        }
        return m59746c(pVar.f70124d);
    }

    /* renamed from: c */
    private static String m59746c(String str) {
        if (C29495h.m59095a().f70655c) {
            return m59749d(str);
        }
        if (C29657l.m59760a(str)) {
            return null;
        }
        String e = C29495h.m59106e();
        if (TextUtils.isEmpty(e)) {
            return null;
        }
        return m59747c(e, str);
    }

    /* renamed from: a */
    public static long m59705a(long j) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        m59725a(instance);
        return instance.getTimeInMillis();
    }

    /* renamed from: b */
    public static JSONArray m59741b(List<C29455b> list) {
        JSONArray jSONArray = new JSONArray();
        if (C29643f.m59683a(list)) {
            return jSONArray;
        }
        try {
            for (C29455b bVar : list) {
                if (bVar.f69981F != null) {
                    jSONArray.put(bVar.f69981F);
                }
            }
        } catch (Exception unused) {
        }
        return jSONArray;
    }

    /* renamed from: a */
    public static long m59706a(AbstractC29383a aVar) {
        if (aVar instanceof C29455b) {
            return (((C29455b) aVar).mo51539e() - System.currentTimeMillis()) / 1000;
        }
        return 0;
    }

    /* renamed from: d */
    private static String m59749d(String str) {
        String str2;
        String str3 = null;
        if (C29657l.m59760a(str)) {
            return null;
        }
        String e = C29495h.m59106e();
        String f = C29495h.m59107f();
        if (TextUtils.isEmpty(e) && TextUtils.isEmpty(f)) {
            return null;
        }
        if (e != null && e.equals(f)) {
            return m59747c(e, str);
        }
        if (!TextUtils.isEmpty(e)) {
            str2 = m59747c(e, str);
        } else {
            str2 = null;
        }
        if (!TextUtils.isEmpty(f)) {
            str3 = m59747c(f, str);
        }
        if (!C29641d.m59682c(str2) && C29641d.m59682c(str3)) {
            return str3;
        }
        return str2;
    }

    /* renamed from: b */
    public static boolean m59742b(String str) {
        if (C29657l.m59760a(str)) {
            return false;
        }
        try {
            int a = m59703a(str);
            if (a == 1) {
                Uri parse = Uri.parse(str);
                if ("sslocal".equalsIgnoreCase(parse.getScheme())) {
                    return true;
                }
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(parse);
                List<ResolveInfo> queryIntentActivities = C29495h.f70242r.getPackageManager().queryIntentActivities(intent, 65536);
                if (queryIntentActivities == null || queryIntentActivities.size() <= 0) {
                    return false;
                }
                return true;
            } else if (a == 2 || a == 5) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            C29375a.m58829a().mo51356a(e, "key_exception_open_url");
            return false;
        }
    }

    /* renamed from: a */
    public static int m59704a(String str, String str2) {
        try {
            return Color.parseColor(str);
        } catch (Exception unused) {
            return Color.parseColor(str2);
        }
    }

    /* renamed from: c */
    private static String m59747c(String str, String str2) {
        try {
            File file = new File(str);
            if (!file.isDirectory()) {
                m59733a(file);
            }
            if (!file.exists()) {
                file.mkdirs();
            }
            return str + C29639b.m59664a(str2);
        } catch (Exception unused) {
            C29638a.m59659a(0, " illegal cache path ");
            return null;
        }
    }

    /* renamed from: a */
    public static Pair<Boolean, Integer> m59707a(long j, int[][] iArr) {
        if (iArr != null && iArr.length > 0) {
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(j);
            m59725a(instance);
            long timeInMillis = j - instance.getTimeInMillis();
            for (int i = 0; i < iArr.length; i++) {
                int[] iArr2 = iArr[i];
                if (iArr2.length >= 2) {
                    long j2 = ((long) iArr2[1]) * 1000;
                    if (((long) iArr2[0]) * 1000 <= timeInMillis && timeInMillis <= j2) {
                        return new Pair<>(true, Integer.valueOf(i));
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public static byte[] m59743b(String str, String str2) {
        Throwable th;
        BufferedInputStream bufferedInputStream;
        FileNotFoundException e;
        MethodCollector.m26663i(12494);
        BufferedInputStream bufferedInputStream2 = null;
        if (TextUtils.isEmpty(str)) {
            MethodCollector.m26664o(12494);
            return null;
        }
        File file = new File(str);
        if (!file.exists()) {
            MethodCollector.m26664o(12494);
            return null;
        }
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                byte[] a = m59737a(m59736a((InputStream) bufferedInputStream), str2);
                m59724a((Closeable) bufferedInputStream);
                MethodCollector.m26664o(12494);
                return a;
            } catch (FileNotFoundException e2) {
                e = e2;
                try {
                    e.printStackTrace();
                    m59724a((Closeable) bufferedInputStream);
                    MethodCollector.m26664o(12494);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    bufferedInputStream2 = bufferedInputStream;
                    m59724a((Closeable) bufferedInputStream2);
                    MethodCollector.m26664o(12494);
                    throw th;
                }
            }
        } catch (FileNotFoundException e3) {
            e = e3;
            bufferedInputStream = null;
            e.printStackTrace();
            m59724a((Closeable) bufferedInputStream);
            MethodCollector.m26664o(12494);
            return null;
        } catch (Throwable th3) {
            th = th3;
            m59724a((Closeable) bufferedInputStream2);
            MethodCollector.m26664o(12494);
            throw th;
        }
    }

    /* renamed from: a */
    public static C29464h m59709a(JSONArray jSONArray, JSONArray jSONArray2, long j) {
        C29464h hVar = new C29464h();
        ArrayList<C29455b> arrayList = new ArrayList();
        if (jSONArray2 != null) {
            int length = jSONArray2.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = jSONArray2.optJSONObject(i);
                if (optJSONObject != null) {
                    C29455b bVar = new C29455b();
                    bVar.mo51532a(optJSONObject, j);
                    arrayList.add(bVar);
                }
            }
        }
        if (C29495h.f70216am != null) {
            C29495h.f70216am.mo28667a(arrayList);
        }
        List<C29455b> a = m59721a(jSONArray, true);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (C29455b bVar2 : a) {
            if (!C29657l.m59760a(bVar2.f69980E)) {
                arrayList2.add(bVar2);
            }
        }
        for (C29455b bVar3 : arrayList) {
            if (m59729a(bVar3)) {
                C29446b.m58971a();
                C29446b.m58978a(bVar3, "topview_boarding");
            }
            if (!C29657l.m59760a(bVar3.f69980E)) {
                arrayList3.add(bVar3);
            }
        }
        arrayList2.removeAll(arrayList3);
        arrayList2.addAll(arrayList3);
        Map<String, C29455b> a2 = m59722a(arrayList2);
        hVar.f70084a = arrayList2;
        hVar.f70086c = a2;
        hVar.f70087d = arrayList;
        return hVar;
    }

    /* renamed from: a */
    public static FrameLayout.LayoutParams m59708a(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (i <= 0 || i2 <= 0) {
            return null;
        }
        float f = (float) i;
        float f2 = (float) i2;
        float f3 = f / f2;
        float f4 = (float) i3;
        float f5 = (float) i4;
        float f6 = f4 / f5;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (f6 > f3) {
            i6 = (int) ((f4 * f2) / f5);
            i5 = i2;
        } else {
            if (f6 < f3) {
                i5 = (int) ((f * f5) / f4);
                i6 = i;
            }
            return layoutParams;
        }
        int i7 = (-Math.abs(i6 - i)) / 2;
        int i8 = (-Math.abs(i5 - i2)) / 2;
        layoutParams.setMargins(i7, i8, i7, i8);
        return layoutParams;
    }
}
