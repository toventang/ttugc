package com.p2082ss.android.ugc.aweme.share;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.friends.p3015e.C51488a;
import com.p2082ss.android.ugc.aweme.friends.p3016f.C51492c;
import com.p2082ss.android.ugc.aweme.share.improve.pkg.LinkDefaultSharePackage;
import com.p2082ss.android.ugc.aweme.share.p3767m.C69315h;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69645h;
import com.p2082ss.android.ugc.aweme.sharer.C69650k;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.InviteFriendSharePackage */
public final class InviteFriendSharePackage extends LinkDefaultSharePackage {

    /* renamed from: b */
    public static final C68820a f153913b = new C68820a((byte) 0);

    /* renamed from: a */
    public C51492c f153914a;

    static {
        Covode.recordClassIndex(81104);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.InviteFriendSharePackage$a */
    public static final class C68820a {
        static {
            Covode.recordClassIndex(81105);
        }

        private C68820a() {
        }

        public /* synthetic */ C68820a(byte b) {
            this();
        }

        /* renamed from: a */
        public static InviteFriendSharePackage m121291a(C51492c cVar) {
            C89219l.m154721d(cVar, "");
            SharePackage.C69654a c = new SharePackage.C69654a().mo109807c("");
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            String a = cVar.mo87004a(C80580in.m139697j(g.getCurUser()));
            C89219l.m154716b(a, "");
            InviteFriendSharePackage inviteFriendSharePackage = new InviteFriendSharePackage(c.mo109808d(a).mo109809e("").mo109803a("text"));
            inviteFriendSharePackage.mo109320a(cVar);
            return inviteFriendSharePackage;
        }
    }

    /* renamed from: a */
    public final void mo109320a(C51492c cVar) {
        C89219l.m154721d(cVar, "");
        this.f153914a = cVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InviteFriendSharePackage(SharePackage.C69654a aVar) {
        super(aVar);
        C89219l.m154721d(aVar, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.share.InviteFriendSharePackage$b */
    static final class C68821b implements C51492c.AbstractC51494b {

        /* renamed from: a */
        final /* synthetic */ InviteFriendSharePackage f153915a;

        /* renamed from: b */
        final /* synthetic */ AbstractC69581b f153916b;

        /* renamed from: c */
        final /* synthetic */ String f153917c;

        /* renamed from: d */
        final /* synthetic */ Context f153918d;

        static {
            Covode.recordClassIndex(81106);
        }

        C68821b(InviteFriendSharePackage inviteFriendSharePackage, AbstractC69581b bVar, String str, Context context) {
            this.f153915a = inviteFriendSharePackage;
            this.f153916b = bVar;
            this.f153917c = str;
            this.f153918d = context;
        }

        @Override // com.p2082ss.android.ugc.aweme.friends.p3016f.C51492c.AbstractC51494b
        /* renamed from: a */
        public final void mo87010a(String str) {
            String a = this.f153916b.mo109548a();
            if (a.hashCode() == 96619420 && a.equals("email")) {
                AbstractC69581b bVar = this.f153916b;
                C89219l.m154716b(str, "");
                bVar.mo61913a((AbstractC69645h) new C69650k(str, this.f153915a.f155489f, this.f153917c), this.f153918d);
                return;
            }
            AbstractC69581b bVar2 = this.f153916b;
            C89219l.m154716b(str, "");
            bVar2.mo61913a((AbstractC69645h) new C69650k(str, this.f153917c, null, 4), this.f153918d);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage
    /* renamed from: a */
    public final boolean mo109321a(AbstractC69581b bVar, Context context) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(context, "");
        if (this.f153914a == null) {
            C89219l.m154710a("presenter");
        }
        C51492c cVar = this.f153914a;
        if (cVar == null) {
            C89219l.m154710a("presenter");
        }
        String a = C51492c.m95945a(cVar.mo87007b(), bVar.mo109548a(), "invitevia", "invite_friends", false);
        C68863ah.f154028b.mo109361a(bVar.mo109548a(), 2);
        C51488a.m95914a("find_friends_page", bVar.mo109548a(), (String) null, (String) null);
        String a2 = C69315h.f154879a.mo109599a(bVar, this.f155487d, this.f155490g);
        C51492c cVar2 = this.f153914a;
        if (cVar2 == null) {
            C89219l.m154710a("presenter");
        }
        cVar2.mo87006a(a, new C68821b(this, bVar, a2, context));
        return true;
    }
}
