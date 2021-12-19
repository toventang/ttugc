package com.bytedance.android.livesdk.utils;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.utils.aq */
public final class C11228aq {

    /* renamed from: a */
    private static int f26874a;

    static {
        Covode.recordClassIndex(12856);
    }

    /* renamed from: a */
    private static boolean m19890a(View view) {
        if (view.getId() != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static String m19891b(View view) {
        if (view.getContext() == null || view.getContext().getResources() == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder(128);
        int i = f26874a;
        f26874a = i + 1;
        sb.append(i);
        if (view instanceof ProgressBar) {
            sb.append("#ProgressBar#");
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static JSONObject m19888a(ViewGroup viewGroup) {
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        JSONObject jSONObject = new JSONObject();
        if (m19890a((View) viewGroup)) {
            arrayList.add(Integer.valueOf(viewGroup.getId()));
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(m19891b(viewGroup), m19889a(viewGroup, arrayList, hashSet));
            jSONObject.put("view_info", jSONObject2);
            if (!C13603b.m24435a((Collection) hashSet)) {
                jSONObject.put("repeat_id", TextUtils.join(", ", hashSet));
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    private static JSONObject m19889a(ViewGroup viewGroup, List<Integer> list, HashSet<Integer> hashSet) {
        if (viewGroup == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", viewGroup.getId());
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if (m19890a(childAt)) {
                    if (list.contains(Integer.valueOf(childAt.getId()))) {
                        hashSet.add(Integer.valueOf(childAt.getId()));
                    } else {
                        list.add(Integer.valueOf(childAt.getId()));
                    }
                }
                if (childAt instanceof ViewGroup) {
                    jSONObject.put(m19891b(childAt), m19889a((ViewGroup) childAt, list, hashSet));
                } else {
                    jSONObject.put(m19891b(childAt), String.valueOf(childAt.getId()));
                }
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
