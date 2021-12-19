package com.p2082ss.android.ugc.aweme.sharedar.p3777a.p3778a;

import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.p2082ss.android.ugc.tools.view.widget.C85041d;
import com.p2082ss.android.ugc.trill.R;
import org.json.JSONObject;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.sharedar.a.a.g */
public final class C69544g extends AbstractC69514a {

    /* renamed from: b */
    static final /* synthetic */ AbstractC89286i[] f155355b = {new C89232y(C69544g.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0)};

    /* renamed from: c */
    public static final C69545a f155356c = new C69545a((byte) 0);

    /* renamed from: d */
    private final AbstractC89248d f155357d = C21572a.m40504a(getDiContainer(), ActivityC0945e.class);

    static {
        Covode.recordClassIndex(81886);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharedar.p3777a.p3778a.AbstractC69514a
    /* renamed from: a */
    public final long mo109765a() {
        return 5;
    }

    /* renamed from: b */
    public final ActivityC0945e mo109782b() {
        return (ActivityC0945e) this.f155357d.mo23374a(this, f155355b[0]);
    }

    /* renamed from: com.ss.android.ugc.aweme.sharedar.a.a.g$a */
    public static final class C69545a {
        static {
            Covode.recordClassIndex(81887);
        }

        private C69545a() {
        }

        public /* synthetic */ C69545a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sharedar.a.a.g$b */
    static final class C69546b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C69544g f155358a;

        /* renamed from: b */
        final /* synthetic */ String f155359b;

        static {
            Covode.recordClassIndex(81888);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69546b(C69544g gVar, String str) {
            super(0);
            this.f155358a = gVar;
            this.f155359b = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C85041d.m146227b(this.f155358a.mo109782b(), this.f155359b, 0).mo129984b();
            return C89391z.f203057a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69544g(C21582f fVar) {
        super(fVar);
        C89219l.m154721d(fVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.sharedar.p3777a.p3778a.AbstractC69514a
    /* renamed from: a */
    public final void mo109766a(int i, long j, String str) {
        String string;
        if (str != null) {
            JSONObject jSONObject = new JSONObject(str);
            int i2 = -1;
            if (jSONObject.has("state")) {
                i2 = jSONObject.optInt("state", -1);
            }
            if (i2 == 0) {
                string = mo109782b().getString(R.string.fsh);
            } else if (i2 == 1) {
                string = mo109782b().getString(R.string.fsi);
            } else if (i2 == 2) {
                string = mo109782b().getString(R.string.frx);
            } else if (i2 == 3) {
                string = mo109782b().getString(R.string.fsj);
            } else if (i2 != 4) {
                string = "";
            } else {
                string = mo109782b().getString(R.string.fsk);
            }
            C89219l.m154716b(string, "");
            if (string.length() > 0) {
                mo109767b(new C69546b(this, string));
            }
        }
    }
}
