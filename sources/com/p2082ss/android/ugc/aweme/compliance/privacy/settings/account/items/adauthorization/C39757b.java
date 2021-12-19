package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.adauthorization;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.AbstractC22030d;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.p1721g.C23144b;
import com.google.gson.AbstractC28019l;
import com.google.gson.C28022o;
import com.google.gson.C28024q;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.adauthorization.AdAuthorizationApi;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.adauthorization.b */
public final class C39757b {

    /* renamed from: a */
    public static final C39757b f93612a = new C39757b();

    /* renamed from: b */
    private static final AbstractC89244h f93613b = C89250i.m154773a((AbstractC89171a) C39758a.f93614a);

    private C39757b() {
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.adauthorization.b$a */
    static final class C39758a extends AbstractC89220m implements AbstractC89171a<C28024q> {

        /* renamed from: a */
        public static final C39758a f93614a = new C39758a();

        static {
            Covode.recordClassIndex(47488);
        }

        C39758a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C28024q invoke() {
            return new C28024q();
        }
    }

    static {
        Covode.recordClassIndex(47487);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.adauthorization.b$b */
    public static final class C39759b implements AbstractC22030d<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC39763c f93615a;

        /* renamed from: b */
        final /* synthetic */ Context f93616b;

        /* renamed from: c */
        final /* synthetic */ boolean f93617c;

        static {
            Covode.recordClassIndex(47489);
        }

        /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.adauthorization.b$b$a */
        static final class C39760a extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C39759b f93618a;

            static {
                Covode.recordClassIndex(47490);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C39760a(C39759b bVar) {
                super(1);
                this.f93618a = bVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(C23025b bVar) {
                C23025b bVar2 = bVar;
                C89219l.m154721d(bVar2, "");
                bVar2.mo37416a(R.string.mp, new AbstractC89172b<C23024a, C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.adauthorization.C39757b.C39759b.C39760a.C397611 */

                    /* renamed from: a */
                    final /* synthetic */ C39760a f93619a;

                    static {
                        Covode.recordClassIndex(47491);
                    }

                    {
                        this.f93619a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C89391z invoke(C23024a aVar) {
                        C89219l.m154721d(aVar, "");
                        C39757b.m80638a(this.f93619a.f93618a.f93616b, this.f93619a.f93618a.f93617c, this.f93619a.f93618a.f93615a, true);
                        return C89391z.f203057a;
                    }
                });
                bVar2.mo37418b(R.string.b6e, (AbstractC89172b<? super C23024a, C89391z>) null);
                bVar2.f54513b = true;
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.adauthorization.b$b$b */
        static final class C39762b extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

            /* renamed from: a */
            public static final C39762b f93620a = new C39762b();

            static {
                Covode.recordClassIndex(47492);
            }

            C39762b() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(C23025b bVar) {
                C23025b bVar2 = bVar;
                C89219l.m154721d(bVar2, "");
                bVar2.mo37416a(R.string.b6k, (AbstractC89172b<? super C23024a, C89391z>) null);
                return C89391z.f203057a;
            }
        }

        @Override // com.bytedance.retrofit2.AbstractC22030d
        /* renamed from: a */
        public final void mo6818a(AbstractC21983b<String> bVar, Throwable th) {
            AbstractC39763c cVar = this.f93615a;
            if (cVar != null) {
                cVar.mo69118b();
            }
            Context context = this.f93616b;
            Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
            new C23144b((Activity) context).mo37635a("Request Failed").mo37637b();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:25:0x005b, code lost:
            if (r1 != null) goto L_0x0024;
         */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x003f  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0063  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x006b  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x0097  */
        /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
        @Override // com.bytedance.retrofit2.AbstractC22030d
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo6817a(com.bytedance.retrofit2.AbstractC21983b<java.lang.String> r5, com.bytedance.retrofit2.C22099u<java.lang.String> r6) {
            /*
            // Method dump skipped, instructions count: 209
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.adauthorization.C39757b.C39759b.mo6817a(com.bytedance.retrofit2.b, com.bytedance.retrofit2.u):void");
        }

        C39759b(AbstractC39763c cVar, Context context, boolean z) {
            this.f93615a = cVar;
            this.f93616b = context;
            this.f93617c = z;
        }
    }

    /* renamed from: a */
    public static C28022o m80637a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            f93613b.getValue();
            AbstractC28019l a = C28024q.m56139a(str);
            C89219l.m154716b(a, "");
            return a.mo46789j();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m80638a(Context context, boolean z, AbstractC39763c cVar, boolean z2) {
        C89219l.m154721d(context, "");
        HashMap hashMap = new HashMap();
        hashMap.put("ad_authorization", Boolean.valueOf(z));
        hashMap.put("confirmed", Boolean.valueOf(z2));
        if (cVar != null) {
            cVar.mo69119c();
        }
        AdAuthorizationApi.C39754a.f93606a.requestAdAuthorization(hashMap).enqueue(new C39759b(cVar, context, z));
    }
}
