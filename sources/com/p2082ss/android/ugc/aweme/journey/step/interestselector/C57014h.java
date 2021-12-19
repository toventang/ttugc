package com.p2082ss.android.ugc.aweme.journey.step.interestselector;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.p2019b.C27895a;
import com.p2082ss.android.ugc.aweme.journey.C56849ai;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.LinkedList;
import java.util.List;
import p4600h.p4610e.C89146c;
import p4600h.p4610e.C89167q;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89338d;

/* renamed from: com.ss.android.ugc.aweme.journey.step.interestselector.h */
public final class C57014h {
    static {
        Covode.recordClassIndex(66902);
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.interestselector.h$a */
    public static final class C57015a extends C27895a<List<? extends C56849ai>> {
        static {
            Covode.recordClassIndex(66903);
        }

        C57015a() {
        }
    }

    /* renamed from: a */
    public static final List<C56849ai> m103360a(Activity activity) {
        MethodCollector.m26663i(3874);
        C89219l.m154721d(activity, "");
        InputStream open = activity.getAssets().open("interest_list/topic_interest_list_US.json");
        C89219l.m154716b(open, "");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open, C89338d.f202990a), 8192);
        try {
            String a = C89167q.m154662a((Reader) bufferedReader);
            C89146c.m154636a(bufferedReader, null);
            List<C56849ai> list = (List) C80342dg.m139300a().mo46671a(a, new C57015a().type);
            if (list == null || list.isEmpty()) {
                LinkedList linkedList = new LinkedList();
                MethodCollector.m26664o(3874);
                return linkedList;
            }
            MethodCollector.m26664o(3874);
            return list;
        } catch (Throwable th) {
            C89146c.m154636a(bufferedReader, th);
            MethodCollector.m26664o(3874);
            throw th;
        }
    }
}
