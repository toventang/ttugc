package com.p2082ss.android.ugc.aweme.sharedar;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.C72847c;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.ugc.effectplatform.model.Effect;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import p4600h.C89386u;
import p4600h.p4601a.AbstractC89040af;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89269g;
import p4600h.p4619j.C89271h;

/* renamed from: com.ss.android.ugc.aweme.sharedar.e */
public final class C69566e {

    /* renamed from: a */
    public static final C69566e f155390a = new C69566e();

    private C69566e() {
    }

    static {
        Covode.recordClassIndex(81908);
    }

    /* renamed from: b */
    public static boolean m122776b(Effect effect) {
        C89219l.m154721d(effect, "");
        return C72847c.m128629a(effect.getSdk_extra(), "share_ar");
    }

    /* renamed from: a */
    public static String m122773a(Context context) {
        C89219l.m154721d(context, "");
        try {
            Object a = m122772a(context, "phone");
            if (a != null) {
                String simOperatorName = ((TelephonyManager) a).getSimOperatorName();
                C89219l.m154716b(simOperatorName, "");
                return simOperatorName;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.telephony.TelephonyManager");
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: b */
    public static String m122775b(Context context) {
        C89219l.m154721d(context, "");
        try {
            Object a = m122772a(context, "phone");
            if (a != null) {
                String simOperator = ((TelephonyManager) a).getSimOperator();
                C89219l.m154716b(simOperator, "");
                return simOperator;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.telephony.TelephonyManager");
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static String[] m122774a(Effect effect) {
        C89219l.m154721d(effect, "");
        try {
            JSONArray optJSONArray = new JSONObject(effect.getSdk_extra()).optJSONArray("operator");
            if (optJSONArray == null) {
                return new String[0];
            }
            C89269g a = C89271h.m154766a(0, optJSONArray.length());
            ArrayList arrayList = new ArrayList(C89070n.m154526a(a, 10));
            Iterator it = a.iterator();
            while (it.hasNext()) {
                arrayList.add(optJSONArray.getString(((AbstractC89040af) it).mo143429a()));
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                StringBuilder sb = new StringBuilder("effect mcc codes: ");
                String arrays = Arrays.toString((String[]) array);
                C89219l.m154716b(arrays, "");
                C84911q.m145922a("SharedAR", sb.append(arrays).toString());
                return (String[]) array;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Exception e) {
            C84911q.m145923a("SharedAR", e);
            return new String[0];
        }
    }

    /* renamed from: a */
    public static C89386u<String, String, String> m122771a(Effect effect, String str) {
        String str2 = "";
        C89219l.m154721d(effect, str2);
        C89219l.m154721d(str, str2);
        try {
            JSONArray optJSONArray = new JSONObject(effect.getSdk_extra()).optJSONArray("operator_info");
            if (optJSONArray == null) {
                return null;
            }
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("code");
                    if (optJSONArray2 != null) {
                        int length2 = optJSONArray2.length();
                        for (int i2 = 0; i2 < length2; i2++) {
                            if (C89219l.m154714a((Object) optJSONArray2.optString(i2), (Object) str)) {
                                String optString = optJSONObject.optString("title");
                                if (optString == null) {
                                    optString = str2;
                                }
                                String optString2 = optJSONObject.optString("desc");
                                if (optString2 == null) {
                                    optString2 = str2;
                                }
                                String optString3 = optJSONObject.optString("icon");
                                if (optString3 != null) {
                                    str2 = optString3;
                                }
                                return new C89386u<>(optString, optString2, str2);
                            }
                        }
                        continue;
                    }
                }
            }
            return null;
        } catch (Exception e) {
            C84911q.m145923a("SharedAR", e);
        }
    }

    /* renamed from: a */
    private static Object m122772a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(10384);
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
                    MethodCollector.m26664o(10384);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
