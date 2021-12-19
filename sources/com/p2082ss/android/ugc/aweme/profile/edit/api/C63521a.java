package com.p2082ss.android.ugc.aweme.profile.edit.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2085a.p2086a.p2087a.C29339a;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.profile.edit.api.a */
public final class C63521a {

    /* renamed from: com.ss.android.ugc.aweme.profile.edit.api.a$a */
    public interface AbstractC63523a {
        static {
            Covode.recordClassIndex(74838);
        }

        /* renamed from: a */
        String mo102180a();

        /* renamed from: b */
        void mo102181b();

        /* renamed from: c */
        void mo102182c();
    }

    static {
        Covode.recordClassIndex(74836);
    }

    /* renamed from: a */
    public static void m115114a(final AbstractC63523a aVar) {
        C29339a.m58752a(new Runnable() {
            /* class com.p2082ss.android.ugc.aweme.profile.edit.api.C63521a.RunnableC635221 */

            static {
                Covode.recordClassIndex(74837);
            }

            public final void run() {
                try {
                    String a = aVar.mo102180a();
                    if (a != null && a.length() > 0 && new JSONObject(a).getString("status_code").equals("0")) {
                        aVar.mo102181b();
                        return;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                aVar.mo102182c();
            }
        });
    }
}
