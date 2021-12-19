package com.facebook.p1814a.p1816b.p1817a;

import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import com.facebook.internal.C24693ad;
import com.facebook.internal.p1894a.p1896b.C24677a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.a.b.a.f */
public class C23888f {

    /* renamed from: a */
    private static final String f56554a = C23888f.class.getCanonicalName();

    /* renamed from: b */
    private static WeakReference<View> f56555b = new WeakReference<>(null);

    /* renamed from: c */
    private static Method f56556c = null;

    static {
        Covode.recordClassIndex(28009);
    }

    /* renamed from: a */
    public static ViewGroup m45157a(View view) {
        if (C24677a.m47209a(C23888f.class) || view == null) {
            return null;
        }
        try {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                return (ViewGroup) parent;
            }
            return null;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23888f.class);
            return null;
        }
    }

    /* renamed from: l */
    private static boolean m45170l(View view) {
        if (C24677a.m47209a(C23888f.class)) {
            return false;
        }
        try {
            return view.getClass().getName().equals("com.facebook.react.ReactRootView");
        } catch (Throwable th) {
            C24677a.m47208a(th, C23888f.class);
            return false;
        }
    }

    /* renamed from: a */
    private static Class<?> m45158a(String str) {
        if (C24677a.m47209a(C23888f.class)) {
            return null;
        }
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23888f.class);
            return null;
        }
    }

    /* renamed from: b */
    public static List<View> m45160b(View view) {
        if (C24677a.m47209a(C23888f.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    arrayList.add(viewGroup.getChildAt(i));
                }
            }
            return arrayList;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23888f.class);
            return null;
        }
    }

    /* renamed from: f */
    public static String m45164f(View view) {
        CharSequence charSequence;
        if (C24677a.m47209a(C23888f.class)) {
            return null;
        }
        try {
            if (view instanceof EditText) {
                charSequence = ((EditText) view).getHint();
            } else if (view instanceof TextView) {
                charSequence = ((TextView) view).getHint();
            } else {
                charSequence = null;
            }
            if (charSequence == null) {
                return "";
            }
            return charSequence.toString();
        } catch (Throwable th) {
            C24677a.m47208a(th, C23888f.class);
            return null;
        }
    }

    /* renamed from: i */
    public static View m45167i(View view) {
        if (C24677a.m47209a(C23888f.class)) {
            return null;
        }
        while (view != null) {
            try {
                if (!m45170l(view)) {
                    ViewParent parent = view.getParent();
                    if (!(parent instanceof View)) {
                        break;
                    }
                    view = (View) parent;
                } else {
                    return view;
                }
            } catch (Throwable th) {
                C24677a.m47208a(th, C23888f.class);
            }
        }
        return null;
    }

    /* renamed from: j */
    private static boolean m45168j(View view) {
        if (C24677a.m47209a(C23888f.class)) {
            return false;
        }
        try {
            ViewParent parent = view.getParent();
            if (parent instanceof AdapterView) {
                return true;
            }
            Class<?> a = m45158a("android.support.v4.view.NestedScrollingChild");
            if (a != null && a.isInstance(parent)) {
                return true;
            }
            Class<?> a2 = m45158a("androidx.core.view.NestedScrollingChild");
            if (a2 == null || !a2.isInstance(parent)) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23888f.class);
            return false;
        }
    }

    /* renamed from: m */
    private static float[] m45171m(View view) {
        if (C24677a.m47209a(C23888f.class)) {
            return null;
        }
        try {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            return new float[]{(float) iArr[0], (float) iArr[1]};
        } catch (Throwable th) {
            C24677a.m47208a(th, C23888f.class);
            return null;
        }
    }

    /* renamed from: d */
    public static int m45162d(View view) {
        int i;
        if (C24677a.m47209a(C23888f.class)) {
            return 0;
        }
        try {
            if (view instanceof ImageView) {
                i = 2;
            } else {
                i = 0;
            }
            if (view.isClickable()) {
                i |= 32;
            }
            if (m45168j(view)) {
                i |= 512;
            }
            if (view instanceof TextView) {
                int i2 = i | 1024 | 1;
                if (view instanceof Button) {
                    i2 |= 4;
                    if (view instanceof Switch) {
                        i2 |= 8192;
                    } else if (view instanceof CheckBox) {
                        i2 |= 32768;
                    }
                }
                if (view instanceof EditText) {
                    return i2 | 2048;
                }
                return i2;
            }
            if (!(view instanceof Spinner)) {
                if (!(view instanceof DatePicker)) {
                    if (view instanceof RatingBar) {
                        return i | 65536;
                    }
                    if (view instanceof RadioGroup) {
                        return i | 16384;
                    }
                    if (!(view instanceof ViewGroup) || !m45159a(view, f56555b.get())) {
                        return i;
                    }
                    return i | 64;
                }
            }
            return i | 4096;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23888f.class);
            return 0;
        }
    }

    /* renamed from: g */
    public static View.OnClickListener m45165g(View view) {
        Field declaredField;
        if (C24677a.m47209a(C23888f.class)) {
            return null;
        }
        try {
            Field declaredField2 = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            if (declaredField2 != null) {
                declaredField2.setAccessible(true);
            }
            Object obj = declaredField2.get(view);
            if (obj == null || (declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener")) == null) {
                return null;
            }
            declaredField.setAccessible(true);
            return (View.OnClickListener) declaredField.get(obj);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return null;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23888f.class);
            return null;
        }
    }

    /* renamed from: h */
    public static View.OnTouchListener m45166h(View view) {
        Field declaredField;
        if (C24677a.m47209a(C23888f.class)) {
            return null;
        }
        try {
            Field declaredField2 = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            if (declaredField2 != null) {
                declaredField2.setAccessible(true);
            }
            Object obj = declaredField2.get(view);
            if (obj == null || (declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnTouchListener")) == null) {
                return null;
            }
            declaredField.setAccessible(true);
            return (View.OnTouchListener) declaredField.get(obj);
        } catch (NoSuchFieldException e) {
            C24693ad.m47255a(f56554a, (Exception) e);
        } catch (ClassNotFoundException e2) {
            C24693ad.m47255a(f56554a, (Exception) e2);
        } catch (IllegalAccessException e3) {
            C24693ad.m47255a(f56554a, (Exception) e3);
        } catch (Throwable th) {
            C24677a.m47208a(th, C23888f.class);
            return null;
        }
        return null;
    }

    /* renamed from: k */
    private static JSONObject m45169k(View view) {
        if (C24677a.m47209a(C23888f.class)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("top", view.getTop());
                jSONObject.put("left", view.getLeft());
                jSONObject.put("width", view.getWidth());
                jSONObject.put("height", view.getHeight());
                jSONObject.put("scrollx", view.getScrollX());
                jSONObject.put("scrolly", view.getScrollY());
                jSONObject.put("visibility", view.getVisibility());
            } catch (JSONException unused) {
            }
            return jSONObject;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23888f.class);
            return null;
        }
    }

    /* renamed from: c */
    public static JSONObject m45161c(View view) {
        if (C24677a.m47209a(C23888f.class)) {
            return null;
        }
        try {
            if (view.getClass().getName().equals("com.facebook.react.ReactRootView")) {
                f56555b = new WeakReference<>(view);
            }
            JSONObject jSONObject = new JSONObject();
            try {
                if (!C24677a.m47209a(C23888f.class)) {
                    try {
                        String e = m45163e(view);
                        String f = m45164f(view);
                        Object tag = view.getTag();
                        CharSequence contentDescription = view.getContentDescription();
                        jSONObject.put("classname", view.getClass().getCanonicalName());
                        jSONObject.put("classtypebitmask", m45162d(view));
                        jSONObject.put("id", view.getId());
                        if (!C23886d.m45147a(view)) {
                            jSONObject.put("text", C24693ad.m47236a(C24693ad.m47265b(e), ""));
                        } else {
                            jSONObject.put("text", "");
                            jSONObject.put("is_user_input", true);
                        }
                        jSONObject.put("hint", C24693ad.m47236a(C24693ad.m47265b(f), ""));
                        if (tag != null) {
                            jSONObject.put("tag", C24693ad.m47236a(C24693ad.m47265b(tag.toString()), ""));
                        }
                        if (contentDescription != null) {
                            jSONObject.put("description", C24693ad.m47236a(C24693ad.m47265b(contentDescription.toString()), ""));
                        }
                        jSONObject.put("dimension", m45169k(view));
                    } catch (JSONException e2) {
                        C24693ad.m47255a(f56554a, (Exception) e2);
                    } catch (Throwable th) {
                        C24677a.m47208a(th, C23888f.class);
                    }
                }
                JSONArray jSONArray = new JSONArray();
                List<View> b = m45160b(view);
                for (int i = 0; i < b.size(); i++) {
                    jSONArray.put(m45161c(b.get(i)));
                }
                jSONObject.put("childviews", jSONArray);
            } catch (JSONException unused) {
            }
            return jSONObject;
        } catch (Throwable th2) {
            C24677a.m47208a(th2, C23888f.class);
            return null;
        }
    }

    /* renamed from: e */
    public static String m45163e(View view) {
        CharSequence charSequence;
        Object selectedItem;
        if (C24677a.m47209a(C23888f.class)) {
            return null;
        }
        try {
            if (view instanceof TextView) {
                charSequence = ((TextView) view).getText();
                if (view instanceof Switch) {
                    if (((Switch) view).isChecked()) {
                        charSequence = "1";
                    } else {
                        charSequence = "0";
                    }
                }
            } else {
                if (!(view instanceof Spinner)) {
                    int i = 0;
                    if (view instanceof DatePicker) {
                        DatePicker datePicker = (DatePicker) view;
                        charSequence = C1764a.m5928a("%04d-%02d-%02d", new Object[]{Integer.valueOf(datePicker.getYear()), Integer.valueOf(datePicker.getMonth()), Integer.valueOf(datePicker.getDayOfMonth())});
                    } else if (view instanceof TimePicker) {
                        TimePicker timePicker = (TimePicker) view;
                        charSequence = C1764a.m5928a("%02d:%02d", new Object[]{Integer.valueOf(timePicker.getCurrentHour().intValue()), Integer.valueOf(timePicker.getCurrentMinute().intValue())});
                    } else if (view instanceof RadioGroup) {
                        RadioGroup radioGroup = (RadioGroup) view;
                        int checkedRadioButtonId = radioGroup.getCheckedRadioButtonId();
                        int childCount = radioGroup.getChildCount();
                        while (true) {
                            if (i >= childCount) {
                                break;
                            }
                            View childAt = radioGroup.getChildAt(i);
                            if (childAt.getId() == checkedRadioButtonId && (childAt instanceof RadioButton)) {
                                charSequence = ((RadioButton) childAt).getText();
                                break;
                            }
                            i++;
                        }
                    } else if (view instanceof RatingBar) {
                        charSequence = String.valueOf(((RatingBar) view).getRating());
                    }
                } else if (((Spinner) view).getCount() > 0 && (selectedItem = ((Spinner) view).getSelectedItem()) != null) {
                    charSequence = selectedItem.toString();
                }
                charSequence = null;
            }
            if (charSequence == null) {
                return "";
            }
            return charSequence.toString();
        } catch (Throwable th) {
            C24677a.m47208a(th, C23888f.class);
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m45159a(View view, View view2) {
        View a;
        if (C24677a.m47209a(C23888f.class)) {
            return false;
        }
        try {
            if (!view.getClass().getName().equals("com.facebook.react.views.view.ReactViewGroup") || (a = m45156a(m45171m(view), view2)) == null || a.getId() != view.getId()) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23888f.class);
            return false;
        }
    }

    /* renamed from: a */
    private static View m45156a(float[] fArr, View view) {
        Object invoke;
        View view2;
        if (C24677a.m47209a(C23888f.class)) {
            return null;
        }
        try {
            if (!C24677a.m47209a(C23888f.class)) {
                try {
                    if (f56556c == null) {
                        try {
                            Method declaredMethod = Class.forName("com.facebook.react.uimanager.TouchTargetHelper").getDeclaredMethod("findTouchTargetView", float[].class, ViewGroup.class);
                            f56556c = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (ClassNotFoundException e) {
                            C24693ad.m47255a(f56554a, (Exception) e);
                        } catch (NoSuchMethodException e2) {
                            C24693ad.m47255a(f56554a, (Exception) e2);
                        }
                    }
                } catch (Throwable th) {
                    C24677a.m47208a(th, C23888f.class);
                }
            }
            Method method = f56556c;
            if (!(method == null || view == null)) {
                try {
                    Object[] objArr = {fArr, view};
                    Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{null, objArr}, 110000, "java.lang.Object", true, "com_facebook_appevents_codeless_internal_ViewHierarchy_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                    if (((Boolean) a.first).booleanValue()) {
                        invoke = a.second;
                    } else {
                        invoke = method.invoke(null, objArr);
                        C15346a.m28242a(invoke, method, new Object[]{null, objArr}, "com_facebook_appevents_codeless_internal_ViewHierarchy_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                    }
                    View view3 = (View) invoke;
                    if (view3 == null || view3.getId() <= 0 || (view2 = (View) view3.getParent()) == null) {
                        return null;
                    }
                    return view2;
                } catch (IllegalAccessException e3) {
                    C24693ad.m47255a(f56554a, (Exception) e3);
                } catch (InvocationTargetException e4) {
                    C24693ad.m47255a(f56554a, (Exception) e4);
                }
            }
            return null;
        } catch (Throwable th2) {
            C24677a.m47208a(th2, C23888f.class);
            return null;
        }
    }
}
