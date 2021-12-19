package com.facebook.p1814a.p1824i;

import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TimePicker;
import com.bytedance.covode.number.Covode;
import com.facebook.internal.p1894a.p1896b.C24677a;
import com.facebook.p1814a.p1816b.p1817a.C23888f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.a.i.c */
class C23987c {

    /* renamed from: a */
    static final String f56775a = C23987c.class.getCanonicalName();

    /* renamed from: b */
    private static final List<Class<? extends View>> f56776b = new ArrayList(Arrays.asList(Switch.class, Spinner.class, DatePicker.class, TimePicker.class, RadioGroup.class, RatingBar.class, EditText.class, AdapterView.class));

    C23987c() {
    }

    static {
        Covode.recordClassIndex(28108);
    }

    /* renamed from: b */
    static String m45363b(View view) {
        if (C24677a.m47209a(C23987c.class)) {
            return null;
        }
        try {
            String e = C23888f.m45163e(view);
            if (!e.isEmpty()) {
                return e;
            }
            return TextUtils.join(" ", m45364c(view));
        } catch (Throwable th) {
            C24677a.m47208a(th, C23987c.class);
            return null;
        }
    }

    /* renamed from: c */
    private static List<String> m45364c(View view) {
        if (C24677a.m47209a(C23987c.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (View view2 : C23888f.m45160b(view)) {
                String e = C23888f.m45163e(view2);
                if (!e.isEmpty()) {
                    arrayList.add(e);
                }
                arrayList.addAll(m45364c(view2));
            }
            return arrayList;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23987c.class);
            return null;
        }
    }

    /* renamed from: a */
    static List<View> m45361a(View view) {
        if (C24677a.m47209a(C23987c.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (Class<? extends View> cls : f56776b) {
                if (cls.isInstance(view)) {
                    return arrayList;
                }
            }
            if (view.isClickable()) {
                arrayList.add(view);
            }
            for (View view2 : C23888f.m45160b(view)) {
                arrayList.addAll(m45361a(view2));
            }
            return arrayList;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23987c.class);
            return null;
        }
    }

    /* renamed from: a */
    static JSONObject m45362a(View view, View view2) {
        if (C24677a.m47209a(C23987c.class)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (view == view2) {
                try {
                    jSONObject.put("is_interacted", true);
                } catch (JSONException unused) {
                }
            }
            if (!C24677a.m47209a(C23987c.class)) {
                try {
                    String e = C23888f.m45163e(view);
                    String f = C23888f.m45164f(view);
                    jSONObject.put("classname", view.getClass().getSimpleName());
                    jSONObject.put("classtypebitmask", C23888f.m45162d(view));
                    if (!e.isEmpty()) {
                        jSONObject.put("text", e);
                    }
                    if (!f.isEmpty()) {
                        jSONObject.put("hint", f);
                    }
                    if (view instanceof EditText) {
                        jSONObject.put("inputtype", ((EditText) view).getInputType());
                    }
                } catch (JSONException unused2) {
                } catch (Throwable th) {
                    C24677a.m47208a(th, C23987c.class);
                }
            }
            JSONArray jSONArray = new JSONArray();
            for (View view3 : C23888f.m45160b(view)) {
                jSONArray.put(m45362a(view3, view2));
            }
            jSONObject.put("childviews", jSONArray);
            return jSONObject;
        } catch (Throwable th2) {
            C24677a.m47208a(th2, C23987c.class);
            return null;
        }
    }
}
