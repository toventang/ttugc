package com.p2082ss.android.ugc.aweme.sharedar.p3777a.p3778a;

import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.p2082ss.android.ugc.aweme.sharedar.C69548c;
import com.p2082ss.android.ugc.aweme.sharedar.SharedARModel;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
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

/* renamed from: com.ss.android.ugc.aweme.sharedar.a.a.c */
public final class C69527c extends AbstractC69514a {

    /* renamed from: b */
    static final /* synthetic */ AbstractC89286i[] f155323b = {new C89232y(C69527c.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0), new C89232y(C69527c.class, "manager", "getManager()Lcom/ss/android/ugc/aweme/sharedar/SharedAREffectManager;", 0)};

    /* renamed from: c */
    public static final C69528a f155324c = new C69528a((byte) 0);

    /* renamed from: d */
    private final AbstractC89248d f155325d = C21572a.m40504a(getDiContainer(), ActivityC0945e.class);

    /* renamed from: e */
    private final AbstractC89248d f155326e = C21572a.m40504a(getDiContainer(), C69548c.class);

    static {
        Covode.recordClassIndex(81869);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharedar.p3777a.p3778a.AbstractC69514a
    /* renamed from: a */
    public final long mo109765a() {
        return 9;
    }

    /* renamed from: b */
    public final ActivityC0945e mo109775b() {
        return (ActivityC0945e) this.f155325d.mo23374a(this, f155323b[0]);
    }

    /* renamed from: com.ss.android.ugc.aweme.sharedar.a.a.c$a */
    public static final class C69528a {
        static {
            Covode.recordClassIndex(81870);
        }

        private C69528a() {
        }

        public /* synthetic */ C69528a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sharedar.a.a.c$b */
    static final class C69529b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C69527c f155327a;

        /* renamed from: b */
        final /* synthetic */ String f155328b;

        static {
            Covode.recordClassIndex(81871);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69529b(C69527c cVar, String str) {
            super(0);
            this.f155327a = cVar;
            this.f155328b = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C85041d.m146227b(this.f155327a.mo109775b(), this.f155328b, 0).mo129984b();
            return C89391z.f203057a;
        }
    }

    /* renamed from: c */
    public final ShortVideoContext mo109776c() {
        AbstractC1174ac a = C1181ae.m3881a(mo109775b(), (C1175ad.AbstractC1177b) null).mo3983a(ShortVideoContextViewModel.class);
        C89219l.m154716b(a, "");
        ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) a).f155842a;
        C89219l.m154716b(shortVideoContext, "");
        return shortVideoContext;
    }

    /* renamed from: com.ss.android.ugc.aweme.sharedar.a.a.c$c */
    static final class C69530c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C69527c f155329a;

        /* renamed from: b */
        final /* synthetic */ int f155330b;

        /* renamed from: c */
        final /* synthetic */ String f155331c;

        /* renamed from: d */
        final /* synthetic */ String f155332d;

        static {
            Covode.recordClassIndex(81872);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69530c(C69527c cVar, int i, String str, String str2) {
            super(0);
            this.f155329a = cVar;
            this.f155330b = i;
            this.f155331c = str;
            this.f155332d = str2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            if (this.f155330b == 1) {
                SharedARModel sharedARModel = this.f155329a.mo109776c().f155756Q;
                if (sharedARModel != null) {
                    sharedARModel.setSharedARMultiPlayerUserName(this.f155331c);
                }
                SharedARModel sharedARModel2 = this.f155329a.mo109776c().f155756Q;
                if (sharedARModel2 != null) {
                    sharedARModel2.setSharedARMultiPlayerUserId(this.f155332d);
                }
            }
            return C89391z.f203057a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69527c(C21582f fVar) {
        super(fVar);
        C89219l.m154721d(fVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.sharedar.p3777a.p3778a.AbstractC69514a
    /* renamed from: a */
    public final void mo109766a(int i, long j, String str) {
        String string;
        if (str != null) {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("username", "");
            String optString2 = jSONObject.optString("sec_uid", "");
            int optInt = jSONObject.optInt("status", -1);
            if (optInt == 0) {
                string = mo109775b().getString(R.string.frx, new Object[]{optString});
            } else if (optInt != 1) {
                string = "";
            } else {
                string = mo109775b().getString(R.string.fsi, new Object[]{optString});
            }
            C89219l.m154716b(string, "");
            if (string.length() > 0) {
                mo109767b(new C69529b(this, string));
            }
            mo109767b(new C69530c(this, optInt, optString, optString2));
        }
    }
}
