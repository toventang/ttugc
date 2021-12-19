package com.p2082ss.android.ugc.aweme.compliance.privacy.data;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39256o;
import com.p2082ss.android.ugc.aweme.compliance.privacy.utils.C40043a;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import org.json.JSONException;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.data.a */
public final class C39657a {

    /* renamed from: a */
    static String f93457a;

    /* renamed from: b */
    static final Keva f93458b;

    /* renamed from: c */
    static final C39256o f93459c = new C39256o(2, 0, null, 0, 14, null);

    /* renamed from: d */
    static C39256o f93460d;

    /* renamed from: e */
    public static final C39657a f93461e = new C39657a();

    /* renamed from: f */
    private static final C39256o f93462f = new C39256o(0, 0, null, 0, 14, null);

    private C39657a() {
    }

    static {
        Covode.recordClassIndex(47380);
        Keva repo = Keva.getRepo("compliance_privacy_group_chat_cache");
        C89219l.m154716b(repo, "");
        f93458b = repo;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.data.a$a */
    public static final class C39658a extends AbstractC89220m implements AbstractC89172b<C33743c, C33743c> {

        /* renamed from: a */
        final /* synthetic */ C39256o f93463a;

        static {
            Covode.recordClassIndex(47381);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39658a(C39256o oVar) {
            super(1);
            this.f93463a = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C33743c invoke(C33743c cVar) {
            C33743c cVar2 = cVar;
            C89219l.m154721d(cVar2, "");
            C40043a.m80991a(cVar2, "load groupchat restriction cache");
            C40043a.m80992a(cVar2, "cache", C39657a.f93460d);
            return C40043a.m80992a(cVar2, "keva", this.f93463a);
        }
    }

    /* renamed from: a */
    static C39256o m80535a(String str) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        try {
            return (C39256o) C80342dg.m139301a(f93458b.getString(str, ""), C39256o.class);
        } catch (JSONException unused) {
            return null;
        }
    }
}
