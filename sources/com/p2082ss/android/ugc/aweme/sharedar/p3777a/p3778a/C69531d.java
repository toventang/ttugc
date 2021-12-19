package com.p2082ss.android.ugc.aweme.sharedar.p3777a.p3778a;

import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.tux.dialog.C23013a;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.p2082ss.android.ugc.trill.R;
import org.json.JSONObject;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.sharedar.a.a.d */
public final class C69531d extends AbstractC69514a {

    /* renamed from: b */
    static final /* synthetic */ AbstractC89286i[] f155333b = {new C89232y(C69531d.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0)};

    /* renamed from: c */
    public static final C69532a f155334c = new C69532a((byte) 0);

    /* renamed from: d */
    private final AbstractC89248d f155335d = C21572a.m40504a(getDiContainer(), ActivityC0945e.class);

    static {
        Covode.recordClassIndex(81873);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharedar.p3777a.p3778a.AbstractC69514a
    /* renamed from: a */
    public final long mo109765a() {
        return 7;
    }

    /* renamed from: b */
    public final ActivityC0945e mo109777b() {
        return (ActivityC0945e) this.f155335d.mo23374a(this, f155333b[0]);
    }

    /* renamed from: com.ss.android.ugc.aweme.sharedar.a.a.d$a */
    public static final class C69532a {
        static {
            Covode.recordClassIndex(81874);
        }

        private C69532a() {
        }

        public /* synthetic */ C69532a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sharedar.a.a.d$b */
    static final class C69533b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C69531d f155336a;

        static {
            Covode.recordClassIndex(81875);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69533b(C69531d dVar) {
            super(0);
            this.f155336a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C23025b bVar = new C23025b(this.f155336a.mo109777b());
            bVar.mo37416a(R.string.fs_, C695341.f155337a);
            ((C23023b) ((C23023b) C23013a.C23015a.m43405a(this.f155336a.mo109777b()).mo37479a(R.string.fsb).mo37483b(R.string.fsa)).mo37407a(bVar).mo37482a(true)).mo37405a().mo37396b().show();
            return C89391z.f203057a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69531d(C21582f fVar) {
        super(fVar);
        C89219l.m154721d(fVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.sharedar.p3777a.p3778a.AbstractC69514a
    /* renamed from: a */
    public final void mo109766a(int i, long j, String str) {
        if (new JSONObject(str).optInt("state") == 2) {
            mo109767b(new C69533b(this));
        }
    }
}
