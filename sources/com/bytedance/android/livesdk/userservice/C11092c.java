package com.bytedance.android.livesdk.userservice;

import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.android.live.base.model.user.AbstractC2994b;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p210a.AbstractC3827a;
import com.bytedance.android.live.core.p210a.C3840c;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.livesdk.chatroom.p488c.C7402s;
import com.bytedance.android.livesdk.event.C8461n;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p456as.C6865d;
import com.bytedance.android.livesdk.p456as.C6869e;
import com.bytedance.android.livesdk.p456as.C6873g;
import com.bytedance.android.livesdk.p456as.C6876j;
import com.bytedance.android.livesdk.p456as.C6878k;
import com.bytedance.android.livesdk.p456as.EnumC6874h;
import com.bytedance.android.livesdk.p562k.DialogC9148b;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdkapi.depend.model.p686b.C11688a;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.android.livesdkapi.host.p695c.AbstractC11800a;
import com.bytedance.android.livesdkapi.model.C11839e;
import com.bytedance.android.livesdkapi.p690f.C11756a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88406ae;
import p4560f.p4561a.AbstractC88924h;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4588i.C88928b;
import p4560f.p4561a.p4590k.C88946a;
import p4560f.p4561a.p4591l.C88960c;

/* renamed from: com.bytedance.android.livesdk.userservice.c */
public final class C11092c implements AbstractC6872f {

    /* renamed from: a */
    public AbstractC2994b f26670a;

    /* renamed from: b */
    IHostUser f26671b;

    /* renamed from: c */
    public final C88928b<C8461n> f26672c = new C88928b<>();

    /* renamed from: d */
    final C88960c<AbstractC2994b> f26673d = new C88960c<>();

    /* renamed from: e */
    final C88960c<C11688a> f26674e = new C88960c<>();

    /* renamed from: f */
    public C88960c<AbstractC2994b> f26675f;

    /* renamed from: g */
    private User f26676g;

    /* renamed from: h */
    private AbstractC3827a<Long, AbstractC2994b> f26677h = new C3840c();

    /* renamed from: i */
    private UserApi f26678i;

    /* renamed from: j */
    private FollowApi f26679j;

    /* renamed from: k */
    private AbstractC11800a f26680k = new AbstractC11800a() {
        /* class com.bytedance.android.livesdk.userservice.C11092c.C110931 */

        static {
            Covode.recordClassIndex(12716);
        }

        @Override // com.bytedance.android.livesdkapi.host.p695c.AbstractC11800a
        /* renamed from: a */
        public final void mo17909a(final AbstractC2994b bVar) {
            if (C11092c.this.f26675f != null) {
                C11092c.this.f26670a = bVar;
                C11092c.this.mo13169i().mo116431a_(new AbstractC88406ae<AbstractC2994b>() {
                    /* class com.bytedance.android.livesdk.userservice.C11092c.C110931.C110941 */

                    static {
                        Covode.recordClassIndex(12717);
                    }

                    @Override // p4560f.p4561a.AbstractC88406ae
                    public final void onError(Throwable th) {
                    }

                    @Override // p4560f.p4561a.AbstractC88406ae
                    public final void onSubscribe(AbstractC88412b bVar) {
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4560f.p4561a.AbstractC88406ae
                    public final /* synthetic */ void onSuccess(AbstractC2994b bVar) {
                        AbstractC2994b bVar2 = bVar;
                        if (C11092c.this.f26675f != null) {
                            C11092c.this.f26675f.onNext(bVar2);
                            C11092c.this.f26675f.onComplete();
                            C11092c.this.f26675f = null;
                        }
                        C7402s sVar = new C7402s();
                        sVar.f18340a = true;
                        sVar.f18341b = bVar;
                        C6779a.m14563a().mo13053a(sVar);
                        C11092c.this.f26672c.onNext(new C8461n(AbstractC2994b.EnumC2995a.Login, bVar));
                        C11092c.this.mo17908b(bVar2);
                    }
                });
            }
        }
    };

    static {
        Covode.recordClassIndex(12715);
    }

    @Override // com.bytedance.android.livesdk.p456as.AbstractC6872f
    /* renamed from: a */
    public final AbstractC2994b mo13147a() {
        return this.f26670a;
    }

    @Override // com.bytedance.android.livesdk.p456as.AbstractC6872f
    /* renamed from: h */
    public final AbstractC88924h<C8461n> mo13168h() {
        return this.f26672c;
    }

    @Override // com.bytedance.android.livesdk.p456as.AbstractC6872f
    /* renamed from: k */
    public final AbstractC88979t<C11688a> mo13171k() {
        return this.f26674e;
    }

    @Override // com.bytedance.android.livesdk.p456as.AbstractC6872f
    /* renamed from: a */
    public final boolean mo13158a(EnumC6874h hVar) {
        return this.f26671b.interceptOperation(hVar.getFunc());
    }

    @Override // com.bytedance.android.livesdk.p456as.AbstractC6872f
    /* renamed from: a */
    public final void mo13156a(C11688a aVar) {
        AbstractC2994b c = this.f26677h.mo9175c(Long.valueOf(aVar.f27930a));
        if (c != null) {
            c.setFollowStatus(aVar.mo18451a());
        }
        this.f26674e.onNext(aVar);
    }

    @Override // com.bytedance.android.livesdk.p456as.AbstractC6872f
    /* renamed from: a */
    public final void mo13157a(String str, DialogInterface.OnClickListener onClickListener, Context context, String str2, String str3, long j) {
        if (context != null) {
            DialogC9148b.C9149a aVar = new DialogC9148b.C9149a(context);
            aVar.f22244a = str;
            aVar.mo15249b(R.string.gi8, DialogInterface$OnClickListenerC11098d.f26690a, false).mo15244a(R.string.gtk, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC11099e(str2, j, str3, "", "", onClickListener), false);
            aVar.mo15247a().show();
        }
    }

    @Override // com.bytedance.android.livesdk.p456as.AbstractC6872f
    /* renamed from: c */
    public final long mo13161c() {
        return this.f26670a.getId();
    }

    @Override // com.bytedance.android.livesdk.p456as.AbstractC6872f
    /* renamed from: f */
    public final void mo13166f() {
        this.f26671b.markAsOutOfDate(true);
    }

    @Override // com.bytedance.android.livesdk.p456as.AbstractC6872f
    /* renamed from: g */
    public final List<C11839e> mo13167g() {
        return this.f26671b.getAllFriends();
    }

    @Override // com.bytedance.android.livesdk.p456as.AbstractC6872f
    /* renamed from: b */
    public final User mo13159b() {
        AbstractC2994b bVar = this.f26670a;
        if (bVar instanceof User) {
            return (User) bVar;
        }
        return this.f26676g;
    }

    @Override // com.bytedance.android.livesdk.p456as.AbstractC6872f
    /* renamed from: e */
    public final boolean mo13165e() {
        if (this.f26670a.getId() > 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.p456as.AbstractC6872f
    /* renamed from: j */
    public final AbstractC88979t<AbstractC2994b> mo13170j() {
        return this.f26673d.mo143268a(new C11114t(this));
    }

    @Override // com.bytedance.android.livesdk.p456as.AbstractC6872f
    /* renamed from: d */
    public final boolean mo13164d() {
        IHostUser iHostUser = this.f26671b;
        if (iHostUser == null) {
            return false;
        }
        if (iHostUser.isMinorMode() || this.f26671b.isDeleteByAgeGate()) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.p456as.AbstractC6872f
    /* renamed from: i */
    public final AbstractC88403ab<AbstractC2994b> mo13169i() {
        long curUserId = this.f26671b.getCurUserId();
        return this.f26678i.queryUser(curUserId, 2, mo13153a(curUserId)).mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142925c(C11111q.f26718a).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo142920b(new C11112r(this));
    }

    @Override // com.bytedance.android.livesdk.p456as.AbstractC6872f
    /* renamed from: a */
    public final void mo13154a(int i) {
        this.f26671b.setRoomAttrsAdminFlag(i);
    }

    @Override // com.bytedance.android.livesdk.p456as.AbstractC6872f
    /* renamed from: a */
    public final AbstractC88979t<C11688a> mo13150a(C6865d dVar) {
        return mo17907a(1, dVar.f17204a, dVar.f17209e);
    }

    @Override // com.bytedance.android.livesdk.p456as.AbstractC6872f
    /* renamed from: c */
    public final AbstractC88979t<AbstractC2994b> mo13162c(long j) {
        return this.f26673d.mo143268a(new C11113s(j));
    }

    @Override // com.bytedance.android.livesdk.p456as.AbstractC6872f
    /* renamed from: d */
    public final AbstractC88979t<C11688a> mo13163d(long j) {
        return this.f26674e.mo143268a(new C11100f(j));
    }

    @Override // com.bytedance.android.livesdk.p456as.AbstractC6872f
    /* renamed from: a */
    public final AbstractC88979t<C11688a> mo13151a(C6869e eVar) {
        return mo17907a(1, eVar.f17204a, eVar.f17209e);
    }

    @Override // com.bytedance.android.livesdk.p456as.AbstractC6872f
    /* renamed from: a */
    public final AbstractC88403ab<User> mo13148a(HashMap<String, String> hashMap) {
        return this.f26678i.queryUser(hashMap).mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142925c(C11109o.f26716a).mo142920b(new C11110p(this)).mo142909a(C88391a.m153580a(C88392a.f200660a));
    }

    @Override // com.bytedance.android.livesdk.p456as.AbstractC6872f
    /* renamed from: b */
    public final AbstractC88403ab<User> mo13160b(long j) {
        return this.f26678i.queryUser(j, 2, mo13153a(j)).mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142925c(C11107m.f26714a).mo142920b(new C11108n(this)).mo142909a(C88391a.m153580a(C88392a.f200660a));
    }

    public C11092c(IHostUser iHostUser) {
        C11091b bVar = new C11091b();
        this.f26676g = bVar;
        this.f26670a = bVar;
        if (iHostUser != null) {
            this.f26671b = iHostUser;
            mo17908b(iHostUser.getCurUser());
            this.f26678i = (UserApi) C5805e.m12718a().mo11572a(UserApi.class);
            this.f26679j = (FollowApi) C5805e.m12718a().mo11572a(FollowApi.class);
            iHostUser.registerCurrentUserUpdateListener(new C11101g(this, iHostUser));
            iHostUser.registerFollowStatusListener(new C11102h(this));
            mo13169i().mo116431a_(new C6873g());
        }
    }

    /* renamed from: b */
    public final void mo17908b(AbstractC2994b bVar) {
        if (bVar != null) {
            this.f26670a = bVar;
            this.f26672c.onNext(new C8461n(AbstractC2994b.EnumC2995a.Update, bVar));
            this.f26677h.mo9173a(Long.valueOf(bVar.getId()), bVar);
            this.f26673d.onNext(bVar);
            return;
        }
        this.f26670a = new C11091b();
    }

    @Override // com.bytedance.android.livesdk.p456as.AbstractC6872f
    /* renamed from: a */
    public final AbstractC88979t<C11688a> mo13152a(C6878k kVar) {
        return AbstractC88979t.m154294a(new C11103i(this, kVar, kVar));
    }

    @Override // com.bytedance.android.livesdk.p456as.AbstractC6872f
    /* renamed from: a */
    public final String mo13153a(long j) {
        AbstractC2994b c = this.f26677h.mo9175c(Long.valueOf(j));
        if (c != null) {
            return c.getSecUid();
        }
        return null;
    }

    @Override // com.bytedance.android.livesdk.p456as.AbstractC6872f
    /* renamed from: a */
    public final void mo13155a(AbstractC2994b bVar) {
        if (bVar != null) {
            this.f26677h.mo9173a(Long.valueOf(bVar.getId()), bVar);
        }
    }

    @Override // com.bytedance.android.livesdk.p456as.AbstractC6872f
    /* renamed from: a */
    public final AbstractC88979t<AbstractC2994b> mo13149a(Context context, C6876j jVar) {
        if (context.getResources().getConfiguration().orientation == 2) {
            C6779a.m14563a().mo13053a(new C11756a("login"));
        }
        ActivityC0945e a = C11279p.m20001a(context);
        if (a != null) {
            this.f26671b.login(a, this.f26680k, jVar.f17226a, jVar.f17227b, jVar.f17228c, jVar.f17229d, jVar.f17230e, jVar.f17231f);
            C88960c<AbstractC2994b> cVar = new C88960c<>();
            this.f26675f = cVar;
            return cVar.mo143261a(C88391a.m153580a(C88392a.f200660a));
        }
        throw new IllegalArgumentException("Argument \"context\" cannot be transformed to FragmentActivity in UserCenter.login() method. ");
    }

    /* renamed from: a */
    public final AbstractC88979t<C11688a> mo17907a(int i, long j, long j2) {
        AbstractC88979t<C5832d<C11090a>> unfollow;
        if (i == 1) {
            unfollow = this.f26679j.follow(1, j, j2, this.f26670a.getSecUid(), mo13153a(j));
        } else {
            unfollow = this.f26679j.unfollow(i, this.f26670a.getSecUid(), j, mo13153a(j), j2);
        }
        AbstractC88979t<R> i2 = unfollow.mo143271a(new C11191f()).mo143292d(new C11104j(j)).mo143294e().mo143189i();
        i2.mo143254a(new C11105k(this, i, j, j2), new C11106l(this, i, j, j2));
        return i2.mo143294e().mo143189i();
    }
}
