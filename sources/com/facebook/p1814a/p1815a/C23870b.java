package com.facebook.p1814a.p1815a;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.facebook.internal.p1894a.p1896b.C24677a;
import com.facebook.p1814a.p1816b.p1817a.C23888f;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.a.a.b */
final class C23870b {

    /* renamed from: a */
    private static final String f56495a = C23870b.class.getCanonicalName();

    C23870b() {
    }

    static {
        Covode.recordClassIndex(27991);
    }

    /* renamed from: b */
    static List<String> m45128b(View view) {
        if (C24677a.m47209a(C23870b.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            ViewGroup a = C23888f.m45157a(view);
            if (a != null) {
                for (View view2 : C23888f.m45160b(a)) {
                    if (view != view2) {
                        arrayList.addAll(m45129c(view2));
                    }
                }
            }
            return arrayList;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23870b.class);
            return null;
        }
    }

    /* renamed from: c */
    private static List<String> m45129c(View view) {
        if (C24677a.m47209a(C23870b.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof EditText) {
                return arrayList;
            }
            if (view instanceof TextView) {
                String charSequence = ((TextView) view).getText().toString();
                if (!charSequence.isEmpty() && charSequence.length() < 100) {
                    arrayList.add(charSequence.toLowerCase());
                }
                return arrayList;
            }
            for (View view2 : C23888f.m45160b(view)) {
                arrayList.addAll(m45129c(view2));
            }
            return arrayList;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23870b.class);
            return null;
        }
    }

    /* renamed from: a */
    static List<String> m45124a(View view) {
        if (C24677a.m47209a(C23870b.class)) {
            return null;
        }
        try {
            ArrayList<String> arrayList = new ArrayList();
            arrayList.add(C23888f.m45164f(view));
            Object tag = view.getTag();
            if (tag != null) {
                arrayList.add(tag.toString());
            }
            CharSequence contentDescription = view.getContentDescription();
            if (contentDescription != null) {
                arrayList.add(contentDescription.toString());
            }
            try {
                if (view.getId() != -1) {
                    String[] split = view.getResources().getResourceName(view.getId()).split("/");
                    if (split.length == 2) {
                        arrayList.add(split[1]);
                    }
                }
            } catch (Resources.NotFoundException unused) {
            }
            ArrayList arrayList2 = new ArrayList();
            for (String str : arrayList) {
                if (!str.isEmpty() && str.length() <= 100) {
                    arrayList2.add(str.toLowerCase());
                }
            }
            return arrayList2;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23870b.class);
            return null;
        }
    }

    /* renamed from: a */
    static boolean m45125a(String str, String str2) {
        if (C24677a.m47209a(C23870b.class)) {
            return false;
        }
        try {
            return str.matches(str2);
        } catch (Throwable th) {
            C24677a.m47208a(th, C23870b.class);
            return false;
        }
    }

    /* renamed from: a */
    private static boolean m45126a(String str, List<String> list) {
        if (C24677a.m47209a(C23870b.class)) {
            return false;
        }
        try {
            for (String str2 : list) {
                if (str.contains(str2)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23870b.class);
            return false;
        }
    }

    /* renamed from: a */
    static boolean m45127a(List<String> list, List<String> list2) {
        if (C24677a.m47209a(C23870b.class)) {
            return false;
        }
        try {
            for (String str : list) {
                if (m45126a(str, list2)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23870b.class);
            return false;
        }
    }
}
