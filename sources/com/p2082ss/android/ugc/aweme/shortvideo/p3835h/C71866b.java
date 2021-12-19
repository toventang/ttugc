package com.p2082ss.android.ugc.aweme.shortvideo.p3835h;

import android.content.Intent;
import android.text.TextUtils;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import com.bytedance.als.AbstractC2562j;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.als.C2549d;
import com.bytedance.als.C2559g;
import com.bytedance.als.C2560h;
import com.bytedance.als.C2563k;
import com.bytedance.als.C2564l;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m;
import com.bytedance.creativex.recorder.p940b.p941a.C14192l;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.p2082ss.android.ugc.aweme.utils.C80571if;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83406b;
import com.p2082ss.android.ugc.gamora.recorder.p4306m.AbstractC83881a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89386u;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.h.b */
public final class C71866b extends AbstractC2562j<AbstractC71864a> implements AbstractC21566a, AbstractC71864a {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f161045a = {new C89232y(C71866b.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new C89232y(C71866b.class, "splitShootApiComponent", "getSplitShootApiComponent()Lcom/ss/android/ugc/gamora/recorder/splitshoot/SplitShootApiComponent;", 0)};

    /* renamed from: b */
    public final C2564l<Boolean> f161046b = new C2564l<>(true);

    /* renamed from: c */
    public final C2564l<Boolean> f161047c = new C2549d(false);

    /* renamed from: d */
    public final C2564l<Boolean> f161048d = new C2549d(false);

    /* renamed from: e */
    public final C2563k<C89386u<Integer, Integer, Intent>> f161049e = new C2563k<>();

    /* renamed from: f */
    public final C2563k<Boolean> f161050f = new C2563k<>();

    /* renamed from: g */
    public long f161051g = -1;

    /* renamed from: h */
    private boolean f161052h;

    /* renamed from: i */
    private final ActivityC0945e f161053i = ((ActivityC0945e) getDiContainer().mo35249a(ActivityC0945e.class, (String) null));

    /* renamed from: j */
    private final AbstractC14177d f161054j = ((AbstractC14177d) getDiContainer().mo35249a(AbstractC14177d.class, (String) null));

    /* renamed from: k */
    private final AbstractC89248d f161055k = C21572a.m40504a(getDiContainer(), AbstractC14193m.class);

    /* renamed from: l */
    private final AbstractC89248d f161056l = C21572a.m40505b(getDiContainer(), AbstractC83881a.class);

    /* renamed from: m */
    private final AbstractC89244h f161057m = C89250i.m154773a((AbstractC89171a) C71871e.f161063a);

    /* renamed from: n */
    private final C21582f f161058n;

    static {
        Covode.recordClassIndex(84415);
    }

    /* renamed from: h */
    private final AbstractC14193m m126897h() {
        return (AbstractC14193m) this.f161055k.mo23374a(this, f161045a[0]);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3835h.AbstractC71864a
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C2560h mo113507a() {
        return this.f161046b;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3835h.AbstractC71864a
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C2559g mo113511b() {
        return this.f161050f;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3835h.AbstractC71864a
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C2560h mo113513c() {
        return this.f161047c;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3835h.AbstractC71864a
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C2560h mo113515d() {
        return this.f161048d;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3835h.AbstractC71864a
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C2559g mo113517e() {
        return this.f161049e;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3835h.AbstractC71864a
    /* renamed from: g */
    public final boolean mo113519g() {
        return this.f161052h;
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.AbstractC2562j
    public final /* bridge */ /* synthetic */ AbstractC71864a getApiComponent() {
        return this;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f161058n;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.h.b$e */
    static final class C71871e extends AbstractC89220m implements AbstractC89171a<C80571if> {

        /* renamed from: a */
        public static final C71871e f161063a = new C71871e();

        static {
            Covode.recordClassIndex(84420);
        }

        C71871e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C80571if invoke() {
            return new C80571if();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3835h.AbstractC71864a
    /* renamed from: f */
    public final boolean mo113518f() {
        if (!getLifecycle().mo4011a().isAtLeast(AbstractC1196i.EnumC1199b.CREATED)) {
            return false;
        }
        String str = null;
        AbstractC83406b bVar = (AbstractC83406b) getDiContainer().mo35252b(AbstractC83406b.class, null);
        if (bVar != null) {
            str = bVar.getCurrentBottomTag();
        }
        return TextUtils.equals(str, this.f161053i.getString(R.string.f7u));
    }

    @Override // com.bytedance.als.AbstractC2562j
    public final void onCreate() {
        super.onCreate();
        m126897h().mo22904k().mo6997a(this, new C71867a(this));
        m126897h().mo22901h().mo6997a(this, new C71868b(this));
        this.f161054j.mo22798af().mo6997a(this, new C71869c(this));
        this.f161049e.mo6997a(this, new C71870d(this));
    }

    @Override // com.bytedance.als.AbstractC2562j
    public final void onResume() {
        super.onResume();
        if (this.f161051g != -1) {
            ((C80571if) this.f161057m.getValue()).mo123791a("click_back_in_edit", System.currentTimeMillis() - this.f161051g, false);
            this.f161051g = -1;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.h.b$a */
    static final class C71867a<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C71866b f161059a;

        static {
            Covode.recordClassIndex(84416);
        }

        C71867a(C71866b bVar) {
            this.f161059a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f161059a.mo113510a(true, true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.h.b$b */
    static final class C71868b<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C71866b f161060a;

        static {
            Covode.recordClassIndex(84417);
        }

        C71868b(C71866b bVar) {
            this.f161060a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f161060a.mo113510a(false, false);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3835h.AbstractC71864a
    /* renamed from: a */
    public final void mo113509a(boolean z) {
        this.f161052h = z;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.h.b$c */
    static final class C71869c<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C71866b f161061a;

        static {
            Covode.recordClassIndex(84418);
        }

        C71869c(C71866b bVar) {
            this.f161061a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C14192l lVar = (C14192l) obj;
            if (!lVar.f34467a) {
                this.f161061a.mo113510a(lVar.f34468b, false);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3835h.AbstractC71864a
    /* renamed from: b */
    public final void mo113512b(boolean z) {
        mo113510a(z, false);
        this.f161050f.mo6999a(Boolean.valueOf(z));
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3835h.AbstractC71864a
    /* renamed from: c */
    public final void mo113514c(boolean z) {
        this.f161047c.mo7019b(Boolean.valueOf(z));
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3835h.AbstractC71864a
    /* renamed from: d */
    public final void mo113516d(boolean z) {
        this.f161048d.mo7019b(Boolean.valueOf(z));
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.h.b$d */
    static final class C71870d<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C71866b f161062a;

        static {
            Covode.recordClassIndex(84419);
        }

        C71870d(C71866b bVar) {
            this.f161062a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C89386u uVar = (C89386u) obj;
            if (uVar != null && ((Number) uVar.getFirst()).intValue() == 12344) {
                C71866b bVar = this.f161062a;
                Intent intent = (Intent) uVar.getThird();
                long j = -1;
                if (intent != null) {
                    j = intent.getLongExtra("edit_to_record_time", -1);
                }
                bVar.f161051g = j;
            }
        }
    }

    public C71866b(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        this.f161058n = fVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3835h.AbstractC71864a
    /* renamed from: a */
    public final void mo113510a(boolean z, boolean z2) {
        this.f161046b.mo7019b(Boolean.valueOf(z));
        AbstractC83881a aVar = (AbstractC83881a) this.f161056l.mo23374a(this, f161045a[1]);
        if (aVar != null) {
            aVar.mo123008a(z, z2);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3835h.AbstractC71864a
    /* renamed from: a */
    public final void mo113508a(int i, int i2, Intent intent) {
        this.f161049e.mo6999a(new C89386u<>(Integer.valueOf(i), Integer.valueOf(i2), intent));
    }
}
