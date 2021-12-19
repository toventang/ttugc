package com.facebook.core.p1841a.p1842a.p1843a;

import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.bytedance.covode.number.Covode;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.core.a.a.a.b */
public final class C24144b {

    /* renamed from: a */
    public static C24144b f57100a;

    /* renamed from: d */
    private static Method f57101d;

    /* renamed from: b */
    public final C24142a f57102b = new C24142a();

    /* renamed from: c */
    public final C24147d f57103c = new C24147d();

    /* renamed from: e */
    private Method f57104e;

    static {
        Covode.recordClassIndex(28275);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.core.a.a.a.b$a */
    public static class C24145a {

        /* renamed from: a */
        private static Field f57105a;

        static {
            Covode.recordClassIndex(28276);
            try {
                Field declaredField = View.class.getDeclaredField("mKeyedTags");
                f57105a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
        }

        /* renamed from: a */
        static JSONObject m45758a(View view) {
            try {
                if (f57105a == null) {
                    Field declaredField = View.class.getDeclaredField("mKeyedTags");
                    f57105a = declaredField;
                    declaredField.setAccessible(true);
                }
                SparseArray sparseArray = (SparseArray) f57105a.get(view);
                if (sparseArray == null || sparseArray.size() <= 0) {
                    return null;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    int size = sparseArray.size();
                    for (int i = 0; i < size; i++) {
                        view.getContext();
                        try {
                            jSONObject.put(C24146c.m45760a(view.getResources(), sparseArray.keyAt(i)), sparseArray.valueAt(i));
                        } catch (JSONException unused) {
                        }
                    }
                } catch (Exception unused2) {
                }
                return jSONObject;
            } catch (Exception unused3) {
                return null;
            }
        }
    }

    /* renamed from: a */
    private static boolean m45754a(View view) {
        for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
            if (cls.getName().equals("com.facebook.litho.LithoView")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private static AccessibilityNodeInfo m45756b(View view) {
        if (view == null) {
            return null;
        }
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        try {
            view.onInitializeAccessibilityNodeInfo(obtain);
            return obtain;
        } catch (NullPointerException unused) {
            if (obtain != null) {
                obtain.recycle();
            }
            return null;
        }
    }

    /* renamed from: a */
    private static void m45753a(PrintWriter printWriter, View view) {
        Object tag = view.getTag();
        if (tag instanceof String) {
            String str = (String) tag;
            if (str.length() > 0) {
                printWriter.print(" app:tag/");
                printWriter.print(m45752a(str, 60));
            }
        }
    }

    /* renamed from: a */
    private static String m45752a(CharSequence charSequence, int i) {
        if (charSequence == null || charSequence.length() <= 0) {
            return "";
        }
        String replace = charSequence.toString().replace(" \n", " ").replace("\n", " ").replace("\"", "");
        if (charSequence.length() > i) {
            return replace.substring(0, i) + "...";
        }
        return replace;
    }

    /* renamed from: a */
    public static boolean m45755a(String[] strArr, String str) {
        if (strArr == null) {
            return false;
        }
        for (String str2 : strArr) {
            if (str.equalsIgnoreCase(str2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0224, code lost:
        if (r1.isEmpty() == false) goto L_0x0227;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0227, code lost:
        r25.print(" text=\"");
        r25.print(m45752a(r1, 600));
        r25.print("\"");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x020b, code lost:
        if (r1.isEmpty() == false) goto L_0x0220;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x021e, code lost:
        if (r1 != null) goto L_0x0220;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo39732a(java.lang.String r24, java.io.PrintWriter r25, android.view.View r26, int r27, int r28, boolean r29, boolean r30) {
        /*
        // Method dump skipped, instructions count: 1209
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.core.p1841a.p1842a.p1843a.C24144b.mo39732a(java.lang.String, java.io.PrintWriter, android.view.View, int, int, boolean, boolean):void");
    }
}
