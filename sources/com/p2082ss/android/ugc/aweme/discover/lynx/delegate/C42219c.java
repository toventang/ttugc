package com.p2082ss.android.ugc.aweme.discover.lynx.delegate;

import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33943c;
import com.p2082ss.android.ugc.aweme.discover.helper.C41985ae;
import com.p2082ss.android.ugc.aweme.discover.lynx.p2779a.C42186b;
import com.p2082ss.android.ugc.aweme.discover.p2787m.AbstractC42293b;
import com.p2082ss.android.ugc.aweme.profile.model.BlockStatus;
import com.p2082ss.android.ugc.aweme.userservice.UserService;
import com.p2082ss.android.ugc.aweme.userservice.api.IUserService;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.lynx.delegate.c */
public final class C42219c extends AbstractC42218b implements AbstractC1214u<BlockStatus> {

    /* renamed from: a */
    public static final C42220a f98389a = new C42220a((byte) 0);

    /* renamed from: c */
    private final AbstractC89244h f98390c = C89250i.m154773a((AbstractC89171a) C42223c.f98394a);

    /* renamed from: d */
    private final AbstractC89244h f98391d = C89250i.m154773a((AbstractC89171a) new C42221b(this));

    static {
        Covode.recordClassIndex(50161);
    }

    /* renamed from: d */
    private final IUserService m84509d() {
        return (IUserService) this.f98390c.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.lynx.delegate.c$a */
    public static final class C42220a {
        static {
            Covode.recordClassIndex(50162);
        }

        private C42220a() {
        }

        public /* synthetic */ C42220a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.lynx.delegate.c$b */
    static final class C42221b extends AbstractC89220m implements AbstractC89171a<C422221> {

        /* renamed from: a */
        final /* synthetic */ C42219c f98392a;

        static {
            Covode.recordClassIndex(50163);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42221b(C42219c cVar) {
            super(0);
            this.f98392a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C422221 invoke() {
            return new AbstractC42293b.AbstractC42294a<BlockStatus>(this) {
                /* class com.p2082ss.android.ugc.aweme.discover.lynx.delegate.C42219c.C42221b.C422221 */

                /* renamed from: a */
                final /* synthetic */ C42221b f98393a;

                static {
                    Covode.recordClassIndex(50164);
                }

                @Override // com.p2082ss.android.ugc.aweme.discover.p2787m.AbstractC42293b.AbstractC42294a
                /* renamed from: a */
                public final Class<BlockStatus> mo60371a() {
                    return BlockStatus.class;
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f98393a = r1;
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.p2082ss.android.ugc.aweme.discover.p2787m.AbstractC42293b.AbstractC42294a
                /* renamed from: a */
                public final /* synthetic */ void mo60372a(BlockStatus blockStatus) {
                    BlockStatus blockStatus2 = blockStatus;
                    C89219l.m154721d(blockStatus2, "");
                    this.f98393a.f98392a.onChanged(blockStatus2);
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.lynx.delegate.c$c */
    static final class C42223c extends AbstractC89220m implements AbstractC89171a<IUserService> {

        /* renamed from: a */
        public static final C42223c f98394a = new C42223c();

        static {
            Covode.recordClassIndex(50165);
        }

        C42223c() {
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
        if (!(this.f98388b.f98319a == null || m84509d() == null)) {
            m84509d().mo123567c().removeObserver(this);
            C33943c<BlockStatus> c = m84509d().mo123567c();
            ActivityC0945e eVar = this.f98388b.f98319a;
            if (eVar == null) {
                C89219l.m154715b();
            }
            c.observe(eVar, this);
        }
        C41985ae.f97915a.mo71487a((AbstractC42293b.AbstractC42294a) this.f98391d.getValue());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42219c(C42186b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    /* renamed from: a */
    public final void onChanged(BlockStatus blockStatus) {
        if (blockStatus != null) {
            C42186b bVar = this.f98388b;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("uid", blockStatus.userId);
            jSONObject.put("block_status", blockStatus.blockStatus);
            bVar.mo71386a("changeBlockState", jSONObject);
            if (blockStatus.blockStatus == 1) {
                C42186b bVar2 = this.f98388b;
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("uid", blockStatus.userId);
                jSONObject2.put("follow_status", 0);
                bVar2.mo71386a("changeFollowState", jSONObject2);
            }
        }
    }
}
