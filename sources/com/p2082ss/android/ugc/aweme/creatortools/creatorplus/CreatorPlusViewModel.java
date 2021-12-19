package com.p2082ss.android.ugc.aweme.creatortools.creatorplus;

import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.creatortools.creatorplus.CreatorPlusApi;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.creatortools.creatorplus.CreatorPlusViewModel */
public final class CreatorPlusViewModel extends AbstractC1174ac {

    /* renamed from: a */
    public final C88411a f94687a = new C88411a();

    /* renamed from: b */
    private final AbstractC89244h f94688b = C89250i.m154773a((AbstractC89171a) C40463d.f94693a);

    /* renamed from: c */
    private final AbstractC89244h f94689c = C89250i.m154773a((AbstractC89171a) C40462c.f94692a);

    static {
        Covode.recordClassIndex(48266);
    }

    /* renamed from: a */
    public final C1213t<C40471d> mo69549a() {
        return (C1213t) this.f94688b.getValue();
    }

    /* renamed from: b */
    public final C1213t<BaseResponse> mo69550b() {
        return (C1213t) this.f94689c.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.creatortools.creatorplus.CreatorPlusViewModel$c */
    static final class C40462c extends AbstractC89220m implements AbstractC89171a<C1213t<BaseResponse>> {

        /* renamed from: a */
        public static final C40462c f94692a = new C40462c();

        static {
            Covode.recordClassIndex(48269);
        }

        C40462c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<BaseResponse> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.creatortools.creatorplus.CreatorPlusViewModel$d */
    static final class C40463d extends AbstractC89220m implements AbstractC89171a<C1213t<C40471d>> {

        /* renamed from: a */
        public static final C40463d f94693a = new C40463d();

        static {
            Covode.recordClassIndex(48270);
        }

        C40463d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<C40471d> invoke() {
            return new C1213t();
        }
    }

    @Override // androidx.lifecycle.AbstractC1174ac
    public final void onCleared() {
        super.onCleared();
        this.f94687a.dispose();
    }

    /* renamed from: c */
    public final void mo69551c() {
        this.f94687a.mo142945a(CreatorPlusApi.C40458a.m81692a().mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C40464e(this), new C40465f(this)));
    }

    /* renamed from: com.ss.android.ugc.aweme.creatortools.creatorplus.CreatorPlusViewModel$a */
    static final class C40460a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ CreatorPlusViewModel f94690a;

        static {
            Covode.recordClassIndex(48267);
        }

        C40460a(CreatorPlusViewModel creatorPlusViewModel) {
            this.f94690a = creatorPlusViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            if (obj != null) {
                this.f94690a.mo69550b().setValue(obj);
            } else {
                this.f94690a.mo69550b().setValue(null);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.creatortools.creatorplus.CreatorPlusViewModel$b */
    static final class C40461b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ CreatorPlusViewModel f94691a;

        static {
            Covode.recordClassIndex(48268);
        }

        C40461b(CreatorPlusViewModel creatorPlusViewModel) {
            this.f94691a = creatorPlusViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C89219l.m154721d(th, "");
            this.f94691a.mo69550b().setValue(null);
            th.getMessage();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.creatortools.creatorplus.CreatorPlusViewModel$e */
    static final class C40464e<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ CreatorPlusViewModel f94694a;

        static {
            Covode.recordClassIndex(48271);
        }

        C40464e(CreatorPlusViewModel creatorPlusViewModel) {
            this.f94694a = creatorPlusViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            if (obj != null) {
                this.f94694a.mo69549a().setValue(obj);
            } else {
                this.f94694a.mo69549a().setValue(null);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.creatortools.creatorplus.CreatorPlusViewModel$f */
    static final class C40465f<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ CreatorPlusViewModel f94695a;

        static {
            Covode.recordClassIndex(48272);
        }

        C40465f(CreatorPlusViewModel creatorPlusViewModel) {
            this.f94695a = creatorPlusViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C89219l.m154721d(th, "");
            this.f94695a.mo69549a().setValue(null);
            th.getMessage();
        }
    }
}
