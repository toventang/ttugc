package com.p2082ss.android.ugc.aweme.inbox;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.friends.service.C51648a;
import com.p2082ss.android.ugc.aweme.inbox.p3267b.C56318b;
import com.p2082ss.android.ugc.aweme.main.AbstractC59103j;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: com.ss.android.ugc.aweme.inbox.q */
public abstract class EnumC56501q extends Enum<EnumC56501q> {
    public static final EnumC56501q CONTACTS;
    public static final C56503b Companion = new C56503b((byte) 0);
    public static final AbstractC89244h REPO_PREFIX$delegate = C89250i.m154773a((AbstractC89171a) C56504c.f128826a);
    public static final EnumC56501q THIRD_PLATFORM;

    /* renamed from: a */
    private static final /* synthetic */ EnumC56501q[] f128823a;

    /* renamed from: b */
    private C56505d f128824b;

    /* renamed from: c */
    private final String f128825c;

    public static EnumC56501q valueOf(String str) {
        return (EnumC56501q) Enum.valueOf(EnumC56501q.class, str);
    }

    public static EnumC56501q[] values() {
        return (EnumC56501q[]) f128823a.clone();
    }

    public abstract EnumC56508r decideDisplay(Context context);

    /* renamed from: com.ss.android.ugc.aweme.inbox.q$b */
    public static final class C56503b {
        static {
            Covode.recordClassIndex(66323);
        }

        private C56503b() {
        }

        public /* synthetic */ C56503b(byte b) {
            this();
        }
    }

    public final String getKey() {
        return this.f128825c;
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.q$c */
    static final class C56504c extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        public static final C56504c f128826a = new C56504c();

        static {
            Covode.recordClassIndex(66324);
        }

        C56504c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            return "inbox_invitation_" + C56318b.m102310a() + "_";
        }
    }

    public final void markAction() {
        C56505d a = mo93447a();
        a.mo93454a().storeInt(a.mo93455a("enter_inbox_times_"), 0);
        a.mo93454a().storeBoolean(a.mo93455a("bottom_by_del_"), false);
    }

    public final void markEnterInbox() {
        C56505d a = mo93447a();
        String a2 = a.mo93455a("enter_inbox_times_");
        a.mo93454a().storeInt(a2, a.mo93454a().getInt(a2, 0) + 1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.ss.android.ugc.aweme.inbox.q$d */
    public static final class C56505d {

        /* renamed from: a */
        EnumC56508r f128827a = EnumC56508r.GONE;

        /* renamed from: b */
        public final EnumC56501q f128828b;

        /* renamed from: c */
        public final String f128829c;

        /* renamed from: d */
        private final AbstractC89244h f128830d = C89250i.m154773a((AbstractC89171a) new C56506a(this));

        static {
            Covode.recordClassIndex(66325);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final Keva mo93454a() {
            return (Keva) this.f128830d.getValue();
        }

        /* renamed from: com.ss.android.ugc.aweme.inbox.q$d$a */
        static final class C56506a extends AbstractC89220m implements AbstractC89171a<Keva> {

            /* renamed from: a */
            final /* synthetic */ C56505d f128831a;

            static {
                Covode.recordClassIndex(66326);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C56506a(C56505d dVar) {
                super(0);
                this.f128831a = dVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ Keva invoke() {
                return Keva.getRepo(((String) EnumC56501q.REPO_PREFIX$delegate.getValue()) + this.f128831a.f128829c);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final String mo93455a(String str) {
            return this.f128828b.asRepoKey(str);
        }

        public C56505d(EnumC56501q qVar, String str) {
            C89219l.m154721d(qVar, "");
            C89219l.m154721d(str, "");
            this.f128828b = qVar;
            this.f128829c = str;
        }
    }

    static {
        Covode.recordClassIndex(66321);
        C56502a aVar = new C56502a("CONTACTS");
        CONTACTS = aVar;
        C56507e eVar = new C56507e("THIRD_PLATFORM");
        THIRD_PLATFORM = eVar;
        f128823a = new EnumC56501q[]{aVar, eVar};
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C56505d mo93447a() {
        String str;
        String uid;
        IAccountUserService g = C31575b.m65865g();
        String str2 = "";
        C89219l.m154716b(g, str2);
        User curUser = g.getCurUser();
        if (!(curUser == null || (uid = curUser.getUid()) == null)) {
            str2 = uid;
        }
        C56505d dVar = this.f128824b;
        if (dVar != null) {
            str = dVar.f128829c;
        } else {
            str = null;
        }
        if (!C89219l.m154714a((Object) str, (Object) str2)) {
            this.f128824b = new C56505d(this, str2);
        }
        C56505d dVar2 = this.f128824b;
        if (dVar2 == null) {
            C89219l.m154715b();
        }
        return dVar2;
    }

    public final void markDelete() {
        C56505d a = mo93447a();
        a.mo93454a().storeLong(a.mo93455a("del_time_"), System.currentTimeMillis());
        String a2 = a.mo93455a("del_times_");
        a.mo93454a().storeInt(a2, a.mo93454a().getInt(a2, 0) + 1);
        a.mo93454a().storeBoolean(a.mo93455a("bottom_by_del_"), true);
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.q$e */
    static final class C56507e extends EnumC56501q {
        static {
            Covode.recordClassIndex(66327);
        }

        @Override // com.p2082ss.android.ugc.aweme.inbox.EnumC56501q
        public final EnumC56508r decideDisplay(Context context) {
            return EnumC56508r.GONE;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C56507e(String str) {
            super(str, 1, "third_platform", null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.q$a */
    static final class C56502a extends EnumC56501q {
        static {
            Covode.recordClassIndex(66322);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C56502a(String str) {
            super(str, 0, "contacts", null);
        }

        @Override // com.p2082ss.android.ugc.aweme.inbox.EnumC56501q
        public final EnumC56508r decideDisplay(Context context) {
            EnumC56508r rVar;
            if ((context != null && !(context instanceof AbstractC59103j)) || !C56318b.m102313d() || C51648a.f118980a.mo87322d().mo86984c()) {
                return EnumC56508r.GONE;
            }
            C56505d a = mo93447a();
            C56500p pVar = (C56500p) C56498o.f128817b.getValue();
            if (System.currentTimeMillis() - a.mo93454a().getLong(a.mo93455a("del_time_"), 0) < ((long) pVar.f128820a) * 86400000) {
                rVar = EnumC56508r.GONE;
            } else if (a.mo93454a().getInt(a.mo93455a("del_times_"), 0) >= pVar.f128821b) {
                rVar = EnumC56508r.GONE;
            } else if (a.mo93454a().getBoolean(a.mo93455a("bottom_by_del_"), false)) {
                rVar = EnumC56508r.BOTTOM;
            } else if (a.mo93454a().getInt(a.mo93455a("enter_inbox_times_"), 0) > pVar.f128822c) {
                rVar = EnumC56508r.BOTTOM;
            } else {
                rVar = EnumC56508r.TOP;
            }
            if (rVar != EnumC56508r.GONE && a.f128827a != EnumC56508r.GONE && rVar != a.f128827a) {
                return a.f128827a;
            }
            a.f128827a = rVar;
            return rVar;
        }
    }

    public final String asRepoKey(String str) {
        return str + this.f128825c;
    }

    private EnumC56501q(String str, int i, String str2) {
        this.f128825c = str2;
    }

    public /* synthetic */ EnumC56501q(String str, int i, String str2, C89214g gVar) {
        this(str, i, str2);
    }

    public static /* synthetic */ EnumC56508r decideDisplay$default(EnumC56501q qVar, Context context, int i, Object obj) {
        if ((i & 1) != 0) {
            context = null;
        }
        return qVar.decideDisplay(context);
    }
}
