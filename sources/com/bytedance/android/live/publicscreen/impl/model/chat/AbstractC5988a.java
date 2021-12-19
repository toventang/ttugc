package com.bytedance.android.live.publicscreen.impl.model.chat;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p218f.C3941k;
import com.bytedance.android.live.publicscreen.impl.model.chat.badge.AbstractC5996b;
import com.bytedance.android.live.publicscreen.impl.model.chat.badge.AbstractC6005i;
import com.bytedance.android.live.publicscreen.impl.model.chat.badge.C5998d;
import com.bytedance.android.live.publicscreen.impl.model.chat.badge.C5999e;
import com.bytedance.android.live.publicscreen.impl.model.chat.badge.C6003g;
import com.bytedance.android.live.publicscreen.impl.model.chat.badge.C6004h;
import com.bytedance.android.live.publicscreen.impl.model.chat.badge.C6006j;
import com.bytedance.android.live.publicscreen.p386a.C5889g;
import com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5873h;
import com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p425aa.C6544e;
import com.bytedance.android.livesdk.p425aa.C6555i;
import com.bytedance.android.livesdk.p430ab.C6581g;
import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.bytedance.android.live.publicscreen.impl.model.chat.a */
public abstract class AbstractC5988a<MESSAGE extends AbstractC6571a> extends AbstractC5877k<MESSAGE> {

    /* renamed from: e */
    public final Handler f15033e = new Handler(Looper.getMainLooper());

    /* renamed from: f */
    public final List<AbstractC5996b> f15034f = new ArrayList();

    /* renamed from: g */
    public boolean f15035g;

    /* renamed from: h */
    private CharSequence f15036h;

    /* renamed from: i */
    private final List<AbstractC6005i> f15037i = new ArrayList();

    /* renamed from: j */
    private long f15038j;

    static {
        Covode.recordClassIndex(6598);
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k
    /* renamed from: B */
    public boolean mo11701B() {
        return false;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k, com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5873h
    /* renamed from: n */
    public final boolean mo11688n() {
        return true;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k, com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5873h
    /* renamed from: p */
    public final long mo11690p() {
        return this.f15038j;
    }

    /* renamed from: s */
    private final CharSequence mo11878s() {
        return C6581g.m14075a(mo10375b());
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k, com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5869d
    /* renamed from: e */
    public void mo11677e() {
        super.mo11677e();
        Iterator<T> it = this.f15037i.iterator();
        while (it.hasNext()) {
            it.next().mo11894e();
        }
        this.f15035g = false;
    }

    /* renamed from: com.bytedance.android.live.publicscreen.impl.model.chat.a$b */
    static final class RunnableC5990b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC5988a f15040a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89236c f15041b;

        /* renamed from: c */
        final /* synthetic */ C5889g f15042c;

        static {
            Covode.recordClassIndex(6600);
        }

        RunnableC5990b(AbstractC5988a aVar, C89233z.C89236c cVar, C5889g gVar) {
            this.f15040a = aVar;
            this.f15041b = cVar;
            this.f15042c = gVar;
        }

        public final void run() {
            if (!this.f15040a.f15035g) {
                C6501b.C6502a.m13948a("livesdk_privilege_badge_show").mo12643a(this.f15042c.f14755l).mo12651a("request_id", C6544e.m13997k()).mo12651a("show_entrance", "comment_area").mo12655b();
                this.f15040a.f15035g = true;
            }
        }
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k
    /* renamed from: J */
    public final ImageModel mo11709J() {
        ImageModel avatarThumb;
        List<String> urls;
        User b;
        User b2 = mo10375b();
        if (b2 == null || (avatarThumb = b2.getAvatarThumb()) == null || (urls = avatarThumb.getUrls()) == null || urls.isEmpty() || (b = mo10375b()) == null) {
            return null;
        }
        return b.getAvatarThumb();
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k, com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5873h
    /* renamed from: r */
    public void mo11692r() {
        super.mo11692r();
        this.f15034f.clear();
        Iterator<T> it = this.f15037i.iterator();
        while (it.hasNext()) {
            it.next().mo11895f();
        }
        this.f15037i.clear();
    }

    /* renamed from: v */
    public final CharSequence mo11871v() {
        String valueOf;
        String str;
        String str2;
        if (TextUtils.isEmpty(this.f15036h)) {
            CharSequence s = mo11878s();
            this.f15036h = s;
            if (TextUtils.isEmpty(s)) {
                Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
                HashMap hashMap = new HashMap();
                if (this.f14737d.f28134O == null) {
                    valueOf = "";
                } else {
                    valueOf = String.valueOf(this.f14737d.f28134O.f28138d);
                }
                hashMap.put("message_id", valueOf);
                if (mo10375b() == null) {
                    hashMap.put("reason", "User is null.");
                } else if (room == null) {
                    hashMap.put("reason", "Room is null.");
                } else {
                    long ownerUserId = room.getOwnerUserId();
                    User b = mo10375b();
                    String str3 = null;
                    if (b != null && ownerUserId == b.getId()) {
                        User b2 = mo10375b();
                        if (b2 != null) {
                            str2 = b2.getDisplayId();
                        } else {
                            str2 = null;
                        }
                        if (TextUtils.isEmpty(str2)) {
                            hashMap.put("reason", "User is anchor, but displayId is empty.");
                        }
                    }
                    if (room.getNameMode() == 1) {
                        User b3 = mo10375b();
                        if (b3 != null) {
                            str = b3.getNickName();
                        } else {
                            str = null;
                        }
                        if (TextUtils.isEmpty(str)) {
                            hashMap.put("reason", "User is audience and display nickname, but nickname is empty.");
                        }
                    }
                    User b4 = mo10375b();
                    if (b4 != null) {
                        str3 = b4.getDisplayId();
                    }
                    if (TextUtils.isEmpty(str3)) {
                        hashMap.put("reason", "User is audience, but displayId is empty.");
                    }
                }
                C6555i.m14021b().mo9217b("ttlive_text_message_not_display_name", hashMap);
            }
        }
        return this.f15036h;
    }

    /* renamed from: b */
    private void m13109b(AbstractC6005i iVar) {
        C89219l.m154721d(iVar, "");
        this.f15037i.add(iVar);
        iVar.mo11894e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11870a(AbstractC6005i iVar) {
        C89219l.m154721d(iVar, "");
        m13108a((AbstractC5996b) iVar);
        this.f15037i.remove(iVar);
    }

    /* renamed from: com.bytedance.android.live.publicscreen.impl.model.chat.a$c */
    static final /* synthetic */ class C5991c extends C89217j implements AbstractC89172b<AbstractC6005i, C89391z> {
        static {
            Covode.recordClassIndex(6601);
        }

        C5991c(AbstractC5988a aVar) {
            super(1, aVar, AbstractC5988a.class, "updateBadge", "updateBadge(Lcom/bytedance/android/live/publicscreen/impl/model/chat/badge/PendingBadgeHolder;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC6005i iVar) {
            AbstractC6005i iVar2 = iVar;
            C89219l.m154721d(iVar2, "");
            ((AbstractC5988a) this.receiver).mo11870a(iVar2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.live.publicscreen.impl.model.chat.a$d */
    static final /* synthetic */ class C5992d extends C89217j implements AbstractC89172b<AbstractC6005i, C89391z> {
        static {
            Covode.recordClassIndex(6602);
        }

        C5992d(AbstractC5988a aVar) {
            super(1, aVar, AbstractC5988a.class, "updateBadge", "updateBadge(Lcom/bytedance/android/live/publicscreen/impl/model/chat/badge/PendingBadgeHolder;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC6005i iVar) {
            AbstractC6005i iVar2 = iVar;
            C89219l.m154721d(iVar2, "");
            ((AbstractC5988a) this.receiver).mo11870a(iVar2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private void m13108a(AbstractC5996b bVar) {
        C89219l.m154721d(bVar, "");
        List<AbstractC5996b> list = this.f15034f;
        list.add(bVar);
        C89070n.m154530a((List) list, (Comparator) C5989a.f15039a);
        C5889g A = mo11700A();
        if (A != null) {
            A.mo11742a((AbstractC5873h) this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractC5988a(MESSAGE message) {
        super(message);
        C89219l.m154721d(message, "");
        ImageModel J = mo11709J();
        if (J != null) {
            C3941k.m9598a(J);
        }
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k, com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5872g
    /* renamed from: b */
    public void mo11686b(C5889g gVar) {
        boolean z;
        boolean z2;
        User user;
        FollowInfo followInfo;
        List<ImageModel> badgeImageList;
        List<ImageModel> f;
        User b;
        FollowInfo followInfo2;
        List<ImageModel> badgeImageList2;
        List<ImageModel> f2;
        C89219l.m154721d(gVar, "");
        super.mo11686b(gVar);
        this.f15036h = null;
        int d = gVar.f14757n.mo11672d();
        if (gVar.f14757n.mo11673e() && gVar.f14757n.mo11671c() && d > 0 && !mo11681i()) {
            this.f15038j = SystemClock.uptimeMillis() + ((long) d);
        }
        User b2 = mo10375b();
        boolean z3 = true;
        if (b2 == null || (badgeImageList2 = b2.getBadgeImageList()) == null || (f2 = C89070n.m154580f((Iterable) badgeImageList2)) == null) {
            z = false;
            z2 = false;
        } else {
            z = false;
            z2 = false;
            for (ImageModel imageModel : f2) {
                int imageType = imageModel.getImageType();
                if (imageType == 3) {
                    z2 = true;
                } else if (imageType == 26) {
                    z = true;
                }
            }
        }
        if (!gVar.f14752i ? !mo11681i() || (user = gVar.f14754k) == null || (followInfo = user.getFollowInfo()) == null || followInfo.getFollowStatus() != 2 : (b = mo10375b()) == null || (followInfo2 = b.getFollowInfo()) == null || followInfo2.getFollowStatus() != 2) {
            z3 = false;
        }
        if (z) {
            m13108a(new C5998d(gVar));
        }
        if (z2) {
            m13108a(new C6003g(gVar));
        }
        if (z3) {
            m13108a(new C5999e(gVar));
        }
        C89233z.C89236c cVar = new C89233z.C89236c();
        cVar.element = 7;
        User b3 = mo10375b();
        if (!(b3 == null || (badgeImageList = b3.getBadgeImageList()) == null || (f = C89070n.m154580f((Iterable) badgeImageList)) == null)) {
            for (ImageModel imageModel2 : f) {
                if (imageModel2.getImageType() == 30) {
                    int i = cVar.element;
                    cVar.element = i - 1;
                    m13109b(new C6006j(i, gVar, this.f15033e, imageModel2, new C5991c(this), new RunnableC5990b(this, cVar, gVar)));
                } else if (!(imageModel2.getImageType() == 26 || imageModel2.getImageType() == 3)) {
                    int i2 = cVar.element;
                    cVar.element = i2 - 1;
                    m13109b(new C6004h(i2, gVar, this.f15033e, imageModel2, new C5992d(this)));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.publicscreen.impl.model.chat.a$a */
    public static final class C5989a<T> implements Comparator {

        /* renamed from: a */
        public static final C5989a f15039a = new C5989a();

        static {
            Covode.recordClassIndex(6599);
        }

        C5989a() {
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            AbstractC5996b bVar = (AbstractC5996b) obj;
            AbstractC5996b bVar2 = (AbstractC5996b) obj2;
            if (bVar.mo11890a() > bVar2.mo11890a()) {
                return -1;
            }
            if (bVar.mo11890a() < bVar2.mo11890a()) {
                return 1;
            }
            return 0;
        }
    }
}
