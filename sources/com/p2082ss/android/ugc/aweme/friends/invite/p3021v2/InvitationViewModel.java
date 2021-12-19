package com.p2082ss.android.ugc.aweme.friends.invite.p3021v2;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33943c;
import com.p2082ss.android.ugc.aweme.common.C39077ac;
import com.p2082ss.android.ugc.aweme.common.C39109f;
import com.p2082ss.android.ugc.aweme.common.C39117g;
import com.p2082ss.android.ugc.aweme.common.C39121h;
import com.p2082ss.android.ugc.aweme.common.C39139k;
import com.p2082ss.android.ugc.aweme.share.improve.p3758c.C69124b;
import com.p2082ss.android.ugc.aweme.share.improve.p3758c.C69125c;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import java.util.concurrent.ConcurrentHashMap;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.friends.invite.v2.InvitationViewModel */
public final class InvitationViewModel extends AbstractC1174ac {

    /* renamed from: d */
    public static final C51573a f118851d = new C51573a((byte) 0);

    /* renamed from: a */
    boolean f118852a;

    /* renamed from: b */
    public C51596a f118853b;

    /* renamed from: c */
    public boolean f118854c;

    /* renamed from: e */
    private final AbstractC89244h f118855e = C89250i.m154773a((AbstractC89171a) C51580f.f118867a);

    /* renamed from: f */
    private final AbstractC89244h f118856f = C89250i.m154773a((AbstractC89171a) C51575c.f118859a);

    static {
        Covode.recordClassIndex(60844);
    }

    /* renamed from: a */
    public final C33943c<Boolean> mo87089a() {
        return (C33943c) this.f118855e.getValue();
    }

    /* renamed from: b */
    public final ConcurrentHashMap<String, C51574b> mo87091b() {
        return (ConcurrentHashMap) this.f118856f.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.invite.v2.InvitationViewModel$a */
    public static final class C51573a {
        static {
            Covode.recordClassIndex(60845);
        }

        private C51573a() {
        }

        public /* synthetic */ C51573a(byte b) {
            this();
        }

        /* renamed from: a */
        public static InvitationViewModel m96080a(Fragment fragment) {
            C89219l.m154721d(fragment, "");
            AbstractC1174ac a = C1181ae.m3879a(fragment, (C1175ad.AbstractC1177b) null).mo3983a(InvitationViewModel.class);
            C89219l.m154716b(a, "");
            return (InvitationViewModel) a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.invite.v2.InvitationViewModel$c */
    static final class C51575c extends AbstractC89220m implements AbstractC89171a<ConcurrentHashMap<String, C51574b>> {

        /* renamed from: a */
        public static final C51575c f118859a = new C51575c();

        static {
            Covode.recordClassIndex(60847);
        }

        C51575c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ConcurrentHashMap<String, C51574b> invoke() {
            return new ConcurrentHashMap();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.invite.v2.InvitationViewModel$f */
    static final class C51580f extends AbstractC89220m implements AbstractC89171a<C33943c<Boolean>> {

        /* renamed from: a */
        public static final C51580f f118867a = new C51580f();

        static {
            Covode.recordClassIndex(60852);
        }

        C51580f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C33943c<Boolean> invoke() {
            return new C33943c();
        }
    }

    /* renamed from: c */
    private final AbstractC88979t<C51596a> m96076c() {
        AbstractC88979t<C51596a> a = AbstractC88979t.m154294a(new C51576d(this));
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // androidx.lifecycle.AbstractC1174ac
    public final void onCleared() {
        super.onCleared();
        this.f118853b = null;
        mo87091b().clear();
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.invite.v2.InvitationViewModel$h */
    static final class C51582h extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ InvitationViewModel f118869a;

        static {
            Covode.recordClassIndex(60854);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51582h(InvitationViewModel invitationViewModel) {
            super(1);
            this.f118869a = invitationViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            Throwable th2 = th;
            C89219l.m154721d(th2, "");
            C39109f.m79401a("InvitationViewModel", "requestInviteConfig error", th2);
            this.f118869a.mo87089a().postValue(false);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.invite.v2.InvitationViewModel$k */
    static final class C51585k extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ InvitationViewModel f118874a;

        static {
            Covode.recordClassIndex(60857);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51585k(InvitationViewModel invitationViewModel) {
            super(1);
            this.f118874a = invitationViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            Throwable th2 = th;
            C89219l.m154721d(th2, "");
            this.f118874a.mo87089a().postValue(false);
            C39109f.m79401a("InvitationViewModel", "requestInviteMsg error", th2);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.friends.invite.v2.InvitationViewModel$d */
    public static final class C51576d<T> implements AbstractC88983w {

        /* renamed from: a */
        final /* synthetic */ InvitationViewModel f118860a;

        static {
            Covode.recordClassIndex(60848);
        }

        C51576d(InvitationViewModel invitationViewModel) {
            this.f118860a = invitationViewModel;
        }

        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(final AbstractC88982v<C51596a> vVar) {
            C89219l.m154721d(vVar, "");
            C51596a aVar = this.f118860a.f118853b;
            if (aVar == null || !aVar.mo87103a()) {
                C39117g.m79416a(InvitationApi.f118801a.getInvitationConfig(""), new AbstractC89172b<C51596a, C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.friends.invite.p3021v2.InvitationViewModel.C51576d.C515771 */

                    /* renamed from: a */
                    final /* synthetic */ C51576d f118861a;

                    static {
                        Covode.recordClassIndex(60849);
                    }

                    {
                        this.f118861a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C89391z invoke(C51596a aVar) {
                        C51596a aVar2 = aVar;
                        C89219l.m154721d(aVar2, "");
                        if (aVar2.mo87103a()) {
                            this.f118861a.f118860a.f118853b = aVar2;
                            AbstractC88982v vVar = vVar;
                            C89219l.m154716b(vVar, "");
                            C39077ac.m79342a(vVar, aVar2);
                        } else {
                            AbstractC88982v vVar2 = vVar;
                            C89219l.m154716b(vVar2, "");
                            C39077ac.m79343a(vVar2, (Throwable) new IllegalStateException("generateConfigFlow config invalid:".concat(String.valueOf(aVar2))));
                        }
                        return C89391z.f203057a;
                    }
                }, new AbstractC89172b<Throwable, C89391z>() {
                    /* class com.p2082ss.android.ugc.aweme.friends.invite.p3021v2.InvitationViewModel.C51576d.C515782 */

                    static {
                        Covode.recordClassIndex(60850);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C89391z invoke(Throwable th) {
                        Throwable th2 = th;
                        C89219l.m154721d(th2, "");
                        AbstractC88982v vVar = vVar;
                        C89219l.m154716b(vVar, "");
                        C39077ac.m79343a(vVar, th2);
                        return C89391z.f203057a;
                    }
                });
            } else {
                C39077ac.m79342a(vVar, this.f118860a.f118853b);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.invite.v2.InvitationViewModel$g */
    static final class C51581g extends AbstractC89220m implements AbstractC89172b<C51596a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ InvitationViewModel f118868a;

        static {
            Covode.recordClassIndex(60853);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51581g(InvitationViewModel invitationViewModel) {
            super(1);
            this.f118868a = invitationViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C51596a aVar) {
            C51596a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            this.f118868a.f118853b = aVar2;
            if (!aVar2.mo87103a()) {
                C39109f.m79404c("InvitationViewModel", "requestInviteConfig invalid:".concat(String.valueOf(aVar2)));
            }
            this.f118868a.mo87089a().postValue(false);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.invite.v2.InvitationViewModel$i */
    static final class C51583i<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ InvitationViewModel f118870a;

        /* renamed from: b */
        final /* synthetic */ AbstractC69581b f118871b;

        static {
            Covode.recordClassIndex(60855);
        }

        C51583i(InvitationViewModel invitationViewModel, AbstractC69581b bVar) {
            this.f118870a = invitationViewModel;
            this.f118871b = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C51596a aVar = (C51596a) obj;
            C89219l.m154721d(aVar, "");
            String str = aVar.f118902c;
            if (str == null) {
                C89219l.m154715b();
            }
            String str2 = aVar.f118901b;
            if (str2 == null) {
                C89219l.m154715b();
            }
            if (aVar.f118900a == null) {
                C89219l.m154715b();
            }
            AbstractC88979t a = AbstractC88979t.m154294a(new C51579e(str, this.f118871b, str2));
            C89219l.m154716b(a, "");
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.invite.v2.InvitationViewModel$j */
    static final class C51584j extends AbstractC89220m implements AbstractC89172b<C51574b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ InvitationViewModel f118872a;

        /* renamed from: b */
        final /* synthetic */ AbstractC69581b f118873b;

        static {
            Covode.recordClassIndex(60856);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51584j(InvitationViewModel invitationViewModel, AbstractC69581b bVar) {
            super(1);
            this.f118872a = invitationViewModel;
            this.f118873b = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C51574b bVar) {
            C89219l.m154721d(bVar, "");
            this.f118872a.mo87091b().put(this.f118873b.mo109548a(), bVar);
            this.f118872a.mo87089a().postValue(false);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.invite.v2.InvitationViewModel$e */
    static final class C51579e<T> implements AbstractC88983w {

        /* renamed from: a */
        final /* synthetic */ String f118864a;

        /* renamed from: b */
        final /* synthetic */ AbstractC69581b f118865b;

        /* renamed from: c */
        final /* synthetic */ String f118866c;

        static {
            Covode.recordClassIndex(60851);
        }

        C51579e(String str, AbstractC69581b bVar, String str2) {
            this.f118864a = str;
            this.f118865b = bVar;
            this.f118866c = str2;
        }

        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(AbstractC88982v<C51574b> vVar) {
            String str = "";
            C89219l.m154721d(vVar, str);
            String c = C69124b.m122228c(C69124b.m122226b(C69124b.m122224a(this.f118864a)));
            if (c != null) {
                str = c;
            }
            String a = C69125c.m122232a(str, "invite_friends", this.f118865b);
            if (a.length() == 0) {
                C39077ac.m79343a((AbstractC88982v) vVar, (Throwable) new IllegalStateException("generateMsgFlow shorten error, longUrl:".concat(String.valueOf(str))));
            } else {
                C39077ac.m79342a(vVar, new C51574b(a, C89361p.m154868a(this.f118866c, "{URL}", a)));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.invite.v2.InvitationViewModel$b */
    public static final class C51574b {

        /* renamed from: a */
        public final String f118857a;

        /* renamed from: b */
        public final String f118858b;

        static {
            Covode.recordClassIndex(60846);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C51574b)) {
                return false;
            }
            C51574b bVar = (C51574b) obj;
            return C89219l.m154714a(this.f118857a, bVar.f118857a) && C89219l.m154714a(this.f118858b, bVar.f118858b);
        }

        public final int hashCode() {
            String str = this.f118857a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f118858b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            return "InvitationMsg(shortUrl=" + this.f118857a + ", shareText=" + this.f118858b + ")";
        }

        public C51574b(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            this.f118857a = str;
            this.f118858b = str2;
        }
    }

    /* renamed from: a */
    public final void mo87090a(C39139k<C51574b> kVar, AbstractC69581b bVar) {
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(bVar, "");
        if (C89219l.m154714a((Object) mo87089a().getValue(), (Object) true)) {
            C39109f.m79404c("InvitationViewModel", "requestInviteMsg block by loading");
            return;
        }
        C51574b bVar2 = mo87091b().get(bVar.mo109548a());
        if (bVar2 != null) {
            kVar.f92347b.invoke(bVar2);
            return;
        }
        mo87089a().postValue(true);
        AbstractC88979t<R> a = m96076c().mo143267a((AbstractC88434g<? super C51596a, ? extends AbstractC88984x<? extends R>>) new C51583i(this, bVar), false);
        C89219l.m154716b(a, "");
        C39117g.m79415a(a, kVar, new C39121h(new C51584j(this, bVar), new C51585k(this)));
    }
}
