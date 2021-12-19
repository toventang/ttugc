package com.p2082ss.android.ugc.aweme.profile.editprofile.pronouns.p3572a;

import com.bytedance.assem.arch.p794a.AbstractC12644a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.profile.editprofile.pronouns.api.PronounsAPI;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.a.b */
public final class C63551b implements AbstractC12644a<AbstractC63550a> {

    /* renamed from: a */
    public final AbstractC63550a f144230a = new C63552a();

    static {
        Covode.recordClassIndex(74866);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.a.b$a */
    public static final class C63552a implements AbstractC63550a {
        static {
            Covode.recordClassIndex(74867);
        }

        C63552a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.profile.editprofile.pronouns.p3572a.AbstractC63550a
        /* renamed from: a */
        public final AbstractC88979t<C63553c> mo102205a(String str) {
            C89219l.m154721d(str, "");
            Object a = RetrofitFactory.m33635a().mo28817b(C29736b.f70924e).mo28832d().mo28858a(PronounsAPI.class);
            C89219l.m154716b(a, "");
            return ((PronounsAPI) a).updatePronouns(str);
        }
    }

    /* Return type fixed from 'com.bytedance.assem.arch.a.d' to match base method */
    @Override // com.bytedance.assem.arch.p794a.AbstractC12644a
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ AbstractC63550a mo20458a() {
        return this.f144230a;
    }
}
