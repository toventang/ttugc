package com.p2082ss.android.ugc.aweme.kids.experiment.abmock.p3351a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.kids.api.abmock.AbstractC57149a;
import com.p2082ss.android.ugc.aweme.kids.api.abmock.C57150b;
import com.p2082ss.android.ugc.aweme.kids.api.abmock.EnumC57151c;
import java.util.List;
import p4600h.p4601a.C89070n;

/* renamed from: com.ss.android.ugc.aweme.kids.experiment.abmock.a.b */
public final class C57614b extends AbstractC57149a {

    /* renamed from: a */
    public static final C57615a f131506a = new C57615a((byte) 0);

    static {
        Covode.recordClassIndex(67573);
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.api.abmock.AbstractC57149a
    /* renamed from: a */
    public final String mo94306a() {
        return "kids_mode_gallery_play_count";
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.api.abmock.AbstractC57149a
    /* renamed from: d */
    public final boolean mo94309d() {
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.experiment.abmock.a.b$a */
    public static final class C57615a {
        static {
            Covode.recordClassIndex(67574);
        }

        private C57615a() {
        }

        public /* synthetic */ C57615a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.api.abmock.AbstractC57149a
    /* renamed from: c */
    public final EnumC57151c mo94308c() {
        return EnumC57151c.INT;
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.api.abmock.AbstractC57149a
    /* renamed from: b */
    public final List<C57150b> mo94307b() {
        return C89070n.m154524c(new C57150b("no play count on gallery grid preview", true, 0), new C57150b("display play count on gallery grid preview", false, 1));
    }
}
