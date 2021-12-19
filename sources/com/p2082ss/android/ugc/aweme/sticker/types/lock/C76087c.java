package com.p2082ss.android.ugc.aweme.sticker.types.lock;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.C27910f;
import com.google.gson.p2019b.C27895a;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.C72847c;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.lock.c */
public class C76087c {

    /* renamed from: a */
    private static volatile C76087c f170947a;

    /* renamed from: c */
    private static SharedPreferences f170948c;

    /* renamed from: b */
    private List<String> f170949b;

    /* renamed from: d */
    private C27910f f170950d = C63244g.m114602a().mo73261G();

    static {
        Covode.recordClassIndex(89033);
    }

    private C76087c() {
    }

    /* renamed from: b */
    public final List<String> mo119822b() {
        if (this.f170949b == null) {
            this.f170949b = m133427c();
        }
        return this.f170949b;
    }

    /* renamed from: a */
    public static C76087c m133426a() {
        MethodCollector.m26663i(8508);
        if (f170947a == null) {
            synchronized (C76087c.class) {
                try {
                    f170948c = C34822d.m71158a(C63247i.f143610a, "commerce_sticker_unlock", 0);
                    f170947a = new C76087c();
                } catch (Throwable th) {
                    MethodCollector.m26664o(8508);
                    throw th;
                }
            }
        }
        C76087c cVar = f170947a;
        MethodCollector.m26664o(8508);
        return cVar;
    }

    /* renamed from: c */
    private List<String> m133427c() {
        List list;
        ArrayList arrayList = new ArrayList();
        try {
            String string = f170948c.getString("sticker_id_info", null);
            if (!TextUtils.isEmpty(string) && (list = (List) this.f170950d.mo46671a(string, new C27895a<List<String>>() {
                /* class com.p2082ss.android.ugc.aweme.sticker.types.lock.C76087c.C760881 */

                static {
                    Covode.recordClassIndex(89034);
                }
            }.type)) != null) {
                arrayList.addAll(list);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo119821a(Effect effect) {
        if (C72847c.m128636c(effect)) {
            String effectId = effect.getEffectId();
            if (!mo119822b().contains(effectId)) {
                mo119822b().add(effectId);
                f170948c.edit().putString("sticker_id_info", this.f170950d.mo46674b(mo119822b())).apply();
            }
        }
    }
}
