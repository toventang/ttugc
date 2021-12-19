package com.p2082ss.android.ugc.trill.abtest;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.i18n.language.i18n.AbstractC53460e;
import com.p2082ss.android.ugc.aweme.setting.C68012b;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.trill.abtest.b */
public final class C85071b {

    /* renamed from: c */
    private static final AbstractC53460e<C85071b> f190352c = new AbstractC53460e<C85071b>() {
        /* class com.p2082ss.android.ugc.trill.abtest.C85071b.C850721 */

        static {
            Covode.recordClassIndex(99093);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.p2082ss.android.ugc.aweme.i18n.language.i18n.AbstractC53460e
        /* renamed from: a */
        public final /* synthetic */ C85071b mo90027a() {
            return new C85071b((byte) 0);
        }
    };

    /* renamed from: a */
    private Map<String, AbstractC85070a> f190353a;

    /* renamed from: b */
    private JSONObject f190354b;

    static {
        Covode.recordClassIndex(99092);
    }

    private C85071b() {
        this.f190353a = new HashMap();
    }

    /* renamed from: a */
    public static C85071b m146270a() {
        return f190352c.mo90028b();
    }

    /* synthetic */ C85071b(byte b) {
        this();
    }

    /* renamed from: a */
    public final boolean mo130012a(String str) {
        AbstractC85070a aVar = this.f190353a.get(str);
        if (aVar == null) {
            return false;
        }
        if (this.f190354b == null) {
            try {
                this.f190354b = new JSONObject((String) C68012b.m120309b().mo63259a(C17867d.m33078a(), "ab_test_model", String.class));
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        Object opt = this.f190354b.opt(str);
        if (opt == null) {
            opt = aVar.mo130009a();
        }
        return aVar.mo130010a(opt);
    }

    /* renamed from: a */
    public final void mo130011a(String str, AbstractC85070a aVar) {
        this.f190353a.put(str, aVar);
    }
}
