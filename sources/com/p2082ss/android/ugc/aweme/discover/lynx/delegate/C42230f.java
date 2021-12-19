package com.p2082ss.android.ugc.aweme.discover.lynx.delegate;

import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33943c;
import com.p2082ss.android.ugc.aweme.discover.helper.C41985ae;
import com.p2082ss.android.ugc.aweme.discover.lynx.p2779a.C42186b;
import com.p2082ss.android.ugc.aweme.discover.p2787m.AbstractC42293b;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.userservice.UserService;
import com.p2082ss.android.ugc.aweme.userservice.api.IUserService;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.lynx.delegate.f */
public final class C42230f extends AbstractC42218b implements AbstractC1214u<FollowStatus> {

    /* renamed from: a */
    public static final C42231a f98401a = new C42231a((byte) 0);

    /* renamed from: c */
    private final AbstractC89244h f98402c = C89250i.m154773a((AbstractC89171a) C42234c.f98406a);

    /* renamed from: d */
    private final AbstractC89244h f98403d = C89250i.m154773a((AbstractC89171a) new C42232b(this));

    static {
        Covode.recordClassIndex(50172);
    }

    /* renamed from: d */
    private final IUserService m84521d() {
        return (IUserService) this.f98402c.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.lynx.delegate.f$a */
    public static final class C42231a {
        static {
            Covode.recordClassIndex(50173);
        }

        private C42231a() {
        }

        public /* synthetic */ C42231a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.lynx.delegate.f$b */
    static final class C42232b extends AbstractC89220m implements AbstractC89171a<C422331> {

        /* renamed from: a */
        final /* synthetic */ C42230f f98404a;

        static {
            Covode.recordClassIndex(50174);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42232b(C42230f fVar) {
            super(0);
            this.f98404a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C422331 invoke() {
            return new AbstractC42293b.AbstractC42294a<FollowStatus>(this) {
                /* class com.p2082ss.android.ugc.aweme.discover.lynx.delegate.C42230f.C42232b.C422331 */

                /* renamed from: a */
                final /* synthetic */ C42232b f98405a;

                static {
                    Covode.recordClassIndex(50175);
                }

                @Override // com.p2082ss.android.ugc.aweme.discover.p2787m.AbstractC42293b.AbstractC42294a
                /* renamed from: a */
                public final Class<FollowStatus> mo60371a() {
                    return FollowStatus.class;
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f98405a = r1;
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.p2082ss.android.ugc.aweme.discover.p2787m.AbstractC42293b.AbstractC42294a
                /* renamed from: a */
                public final /* synthetic */ void mo60372a(FollowStatus followStatus) {
                    FollowStatus followStatus2 = followStatus;
                    C89219l.m154721d(followStatus2, "");
                    this.f98405a.f98404a.onChanged(followStatus2);
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.lynx.delegate.f$c */
    static final class C42234c extends AbstractC89220m implements AbstractC89171a<IUserService> {

        /* renamed from: a */
        public static final C42234c f98406a = new C42234c();

        static {
            Covode.recordClassIndex(50176);
        }

        C42234c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ IUserService invoke() {
            return UserService.m138861d();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.lynx.delegate.AbstractC42218b
    /* renamed from: a */
    public final void mo71429a() {
        if (!(this.f98388b.f98319a == null || m84521d() == null)) {
            m84521d().mo123566b().removeObserver(this);
            C33943c<FollowStatus> b = m84521d().mo123566b();
            ActivityC0945e eVar = this.f98388b.f98319a;
            if (eVar == null) {
                C89219l.m154715b();
            }
            b.observe(eVar, this);
        }
        C41985ae.f97915a.mo71487a((AbstractC42293b.AbstractC42294a) this.f98403d.getValue());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42230f(C42186b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    /* renamed from: a */
    public final void onChanged(FollowStatus followStatus) {
        if (followStatus != null) {
            C42186b bVar = this.f98388b;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("uid", followStatus.userId);
            jSONObject.put("follow_status", followStatus.followStatus);
            bVar.mo71386a("changeFollowState", jSONObject);
            if (followStatus.followStatus == 1 || followStatus.followStatus == 2 || followStatus.followStatus == 4) {
                C42186b bVar2 = this.f98388b;
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("uid", followStatus.userId);
                jSONObject2.put("block_status", 0);
                bVar2.mo71386a("changeBlockState", jSONObject2);
            }
        }
    }
}
