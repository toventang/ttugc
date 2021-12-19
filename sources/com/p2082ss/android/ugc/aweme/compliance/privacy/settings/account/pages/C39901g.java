package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages;

import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39724i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.g */
public final class C39901g {

    /* renamed from: o */
    public static final C39902a f93862o = new C39902a((byte) 0);

    /* renamed from: a */
    public Integer f93863a = 0;

    /* renamed from: b */
    public String f93864b;

    /* renamed from: c */
    public Integer f93865c;

    /* renamed from: d */
    public CharSequence f93866d;

    /* renamed from: e */
    public AbstractC89171a<? extends CharSequence> f93867e;

    /* renamed from: f */
    public int f93868f;

    /* renamed from: g */
    public int f93869g;

    /* renamed from: h */
    public int f93870h = 1;

    /* renamed from: i */
    public C1213t<Integer> f93871i;

    /* renamed from: j */
    public C1213t<Boolean> f93872j;

    /* renamed from: k */
    public AbstractC39724i f93873k;

    /* renamed from: l */
    public AbstractC89172b<? super Integer, C89391z> f93874l;

    /* renamed from: m */
    public AbstractC89171a<C89391z> f93875m;

    /* renamed from: n */
    public AbstractC89172b<? super Integer, Boolean> f93876n;

    static {
        Covode.recordClassIndex(47644);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.g$a */
    public static final class C39902a {
        static {
            Covode.recordClassIndex(47645);
        }

        private C39902a() {
        }

        public /* synthetic */ C39902a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final AbstractC39896f mo69155a() {
        if (this.f93868f == 0) {
            return new C39893e(this);
        }
        return new C39906h(this);
    }

    /* renamed from: a */
    public final C39901g mo69156a(int i) {
        this.f93863a = Integer.valueOf(i);
        return this;
    }

    /* renamed from: b */
    public final C39901g mo69162b(int i) {
        this.f93865c = Integer.valueOf(i);
        return this;
    }

    /* renamed from: c */
    public final C39901g mo69165c(int i) {
        this.f93868f = 0;
        this.f93869g = i;
        return this;
    }

    /* renamed from: b */
    public final C39901g mo69163b(AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        this.f93875m = aVar;
        return this;
    }

    /* renamed from: b */
    public final C39901g mo69164b(AbstractC89172b<? super Integer, Boolean> bVar) {
        C89219l.m154721d(bVar, "");
        this.f93876n = bVar;
        return this;
    }

    /* renamed from: a */
    public final C39901g mo69158a(AbstractC39724i iVar) {
        C89219l.m154721d(iVar, "");
        this.f93873k = iVar;
        return this;
    }

    /* renamed from: a */
    public final C39901g mo69159a(BasePrivacySettingViewModel basePrivacySettingViewModel) {
        C89219l.m154721d(basePrivacySettingViewModel, "");
        this.f93871i = basePrivacySettingViewModel.f93798d;
        this.f93872j = basePrivacySettingViewModel.f93799e;
        return this;
    }

    /* renamed from: a */
    public final C39901g mo69160a(AbstractC89171a<? extends CharSequence> aVar) {
        C89219l.m154721d(aVar, "");
        this.f93867e = aVar;
        return this;
    }

    /* renamed from: a */
    public final C39901g mo69161a(AbstractC89172b<? super Integer, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        this.f93874l = bVar;
        return this;
    }

    /* renamed from: a */
    public final C39901g mo69157a(int i, int i2) {
        this.f93868f = 1;
        this.f93869g = i;
        this.f93870h = i2;
        return this;
    }
}
