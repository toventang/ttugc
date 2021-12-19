package com.p2082ss.android.ugc.aweme.sticker.types.lock;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.C72847c;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.lock.b */
public final class C76086b {

    /* renamed from: a */
    private static final HashMap<String, List<String>> f170946a = new HashMap<>();

    static {
        Covode.recordClassIndex(89032);
    }

    /* renamed from: a */
    public static final boolean m133424a(Effect effect) {
        C89219l.m154721d(effect, "");
        ArrayList<String> a = C76090e.m133432a();
        if (a.isEmpty()) {
            return false;
        }
        return a.contains(effect.getEffectId());
    }

    /* renamed from: a */
    public static final int m133421a(String str) {
        C89219l.m154721d(str, "");
        if (!TextUtils.isEmpty(str) && !C89219l.m154714a((Object) str, (Object) "{}")) {
            try {
                return new JSONObject(str).getInt("lock_type");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return -1;
    }

    /* renamed from: b */
    public static final boolean m133425b(Effect effect) {
        if (effect == null || !C72847c.m128632b(effect) || C72847c.m128636c(effect)) {
            return false;
        }
        String effectId = effect.getEffectId();
        if (TextUtils.isEmpty(effectId)) {
            return false;
        }
        ArrayList<String> a = C76090e.m133432a();
        C89219l.m154716b(a, "");
        for (String str : a) {
            if (TextUtils.equals(effectId, str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static final List<String> m133422a(Context context, String str) {
        C89219l.m154721d(str, "");
        HashMap<String, List<String>> hashMap = f170946a;
        Set<String> keySet = hashMap.keySet();
        C89219l.m154716b(keySet, "");
        if (keySet.contains(str)) {
            return hashMap.get(str);
        }
        List<String> a = new C76089d(context, str).mo119823a();
        C89219l.m154716b(a, "");
        hashMap.put(str, a);
        Iterator<String> it = a.iterator();
        while (it.hasNext()) {
            it.next();
        }
        return a;
    }

    /* renamed from: a */
    public static final void m133423a(Context context, String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        HashMap<String, List<String>> hashMap = f170946a;
        Set<String> keySet = hashMap.keySet();
        C89219l.m154716b(keySet, "");
        if (keySet.contains(str)) {
            List<String> list = hashMap.get(str);
            if (list == null) {
                C89219l.m154715b();
            }
            list.add(str2);
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str2);
            hashMap.put(str, arrayList);
        }
        new C76089d(context, str).mo119824a(str2);
    }
}
