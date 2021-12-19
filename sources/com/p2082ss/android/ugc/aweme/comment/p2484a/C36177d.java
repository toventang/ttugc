package com.p2082ss.android.ugc.aweme.comment.p2484a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.comment.util.C37199i;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.comment.a.d */
public final class C36177d {

    /* renamed from: a */
    public static final C36182h[] f85456a = null;

    /* renamed from: b */
    public static final AbstractC89244h f85457b = C89250i.m154773a((AbstractC89171a) C36178a.f85459a);

    /* renamed from: c */
    public static final C36177d f85458c = new C36177d();

    private C36177d() {
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.a.d$a */
    static final class C36178a extends AbstractC89220m implements AbstractC89171a<Map<Integer, ? extends UrlModel>> {

        /* renamed from: a */
        public static final C36178a f85459a = new C36178a();

        static {
            Covode.recordClassIndex(43438);
        }

        C36178a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Map<Integer, ? extends UrlModel> invoke() {
            return C36177d.m73731a();
        }
    }

    static {
        Covode.recordClassIndex(43437);
    }

    /* renamed from: a */
    public static Map<Integer, UrlModel> m73731a() {
        C36182h[] hVarArr = (C36182h[]) SettingsManager.m29616a().mo25397a("social_bubble_anchors", C36182h[].class, f85456a);
        try {
            HashMap hashMap = new HashMap();
            if (hVarArr != null) {
                for (C36182h hVar : hVarArr) {
                    hashMap.put(Integer.valueOf(hVar.f85462a), hVar.f85463b);
                }
            }
            return hashMap;
        } catch (Exception e) {
            C37199i.m75175b("AnchorsResourceSettings", String.valueOf(e.getMessage()));
            return new LinkedHashMap();
        }
    }
}
