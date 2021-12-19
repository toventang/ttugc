package com.p2082ss.android.ugc.aweme.kids.experiment.abmock.p3351a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.kids.api.abmock.AbstractC57149a;
import com.p2082ss.android.ugc.aweme.kids.api.abmock.C57150b;
import com.p2082ss.android.ugc.aweme.kids.api.abmock.EnumC57151c;
import com.p2082ss.android.ugc.aweme.kids.experiment.abmock.C57611a;
import java.util.List;
import java.util.Objects;
import p4600h.p4601a.C89070n;

/* renamed from: com.ss.android.ugc.aweme.kids.experiment.abmock.a.d */
public final class C57618d extends AbstractC57149a {

    /* renamed from: a */
    public static final C57619a f131508a = new C57619a((byte) 0);

    static {
        Covode.recordClassIndex(67577);
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.api.abmock.AbstractC57149a
    /* renamed from: a */
    public final String mo94306a() {
        return "kids_mode_wellbeing_notification";
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.api.abmock.AbstractC57149a
    /* renamed from: d */
    public final boolean mo94309d() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.experiment.abmock.a.d$a */
    public static final class C57619a {
        static {
            Covode.recordClassIndex(67578);
        }

        private C57619a() {
        }

        /* renamed from: a */
        public static int m104342a() {
            Object a = C57611a.m104321a(new C57618d());
            Objects.requireNonNull(a, "null cannot be cast to non-null type kotlin.Int");
            return ((Integer) a).intValue();
        }

        public /* synthetic */ C57619a(byte b) {
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
        return C89070n.m154524c(new C57150b("no reminder", true, 0), new C57150b("half screen reminder", false, 1), new C57150b("full screen reminder", false, 2), new C57150b("video reminder", false, 1));
    }
}
