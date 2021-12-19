package com.p2082ss.android.ugc.aweme.upvote.detail;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.upvote.event.C79899b;
import com.p2082ss.android.ugc.aweme.upvote.p4189c.C79711e;
import com.p2082ss.android.ugc.aweme.upvote.p4189c.C79714h;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.upvote.detail.UpvoteListViewModel */
public final class UpvoteListViewModel implements AbstractC33974au, AbstractC79752c {

    /* renamed from: e */
    public static boolean f178878e;

    /* renamed from: f */
    public static final C79719a f178879f = new C79719a((byte) 0);

    /* renamed from: a */
    public List<C79714h> f178880a;

    /* renamed from: b */
    public String f178881b;

    /* renamed from: c */
    public final String f178882c;

    /* renamed from: d */
    public C79899b f178883d;

    /* renamed from: g */
    private final AbstractC89244h f178884g;

    static {
        Covode.recordClassIndex(92940);
    }

    /* renamed from: a */
    public final C1213t<C79711e> mo123317a() {
        return (C1213t) this.f178884g.getValue();
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.UpvoteListViewModel$a */
    public static final class C79719a {
        static {
            Covode.recordClassIndex(92941);
        }

        private C79719a() {
        }

        public /* synthetic */ C79719a(byte b) {
            this();
        }

        /* renamed from: a */
        public static UpvoteListViewModel m138552a(AbstractC1204m mVar) {
            C89219l.m154721d(mVar, "");
            return new UpvoteListViewModel(mVar, (byte) 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.UpvoteListViewModel$b */
    static final class C79720b extends AbstractC89220m implements AbstractC89171a<C1213t<C79711e>> {

        /* renamed from: a */
        public static final C79720b f178885a = new C79720b();

        static {
            Covode.recordClassIndex(92942);
        }

        C79720b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<C79711e> invoke() {
            return new C1213t();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onDestroy() {
        String str = this.f178881b;
        if (str != null) {
            C79788d.m138617a(str, this);
        }
        C89219l.m154721d(this, "");
        C79788d.m138619b().get(this.f178882c);
    }

    /* renamed from: c */
    public final boolean mo123322c() {
        List<C79714h> upvotes;
        C79711e value = mo123317a().getValue();
        if (value == null || value.getTotal() <= 0 || (upvotes = value.getUpvotes()) == null || upvotes.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo123321b() {
        List<C79714h> list;
        String str;
        T next;
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        User curUser = g.getCurUser();
        C89219l.m154716b(curUser, "");
        String uid = curUser.getUid();
        C79711e value = mo123317a().getValue();
        if (value == null || (list = value.getUpvotes()) == null) {
            list = C89086z.INSTANCE;
        }
        Iterator<T> it = list.iterator();
        do {
            str = null;
            if (!it.hasNext()) {
                return false;
            }
            next = it.next();
            User user = next.getUser();
            if (user != null) {
                str = user.getUid();
            }
        } while (!C89219l.m154714a((Object) str, (Object) uid));
        if (next != null) {
            return true;
        }
        return false;
    }

    private UpvoteListViewModel(AbstractC1204m mVar) {
        this.f178884g = C89250i.m154773a((AbstractC89171a) C79720b.f178885a);
        this.f178880a = C89086z.INSTANCE;
        String valueOf = String.valueOf(hashCode());
        this.f178882c = valueOf;
        mVar.getLifecycle().mo4012a(this);
        C89219l.m154721d(this, "");
        C79788d.m138619b().put(valueOf, this);
    }

    /* renamed from: a */
    public final void mo123318a(C79711e eVar) {
        m138545b(eVar);
        mo123317a().setValue(eVar);
    }

    /* renamed from: b */
    private final void m138545b(C79711e eVar) {
        List<C79714h> list;
        String text;
        if (eVar == null || (list = eVar.getUpvotes()) == null) {
            list = C89086z.INSTANCE;
        }
        Iterator<C79714h> it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C79714h next = it.next();
            if (!C80580in.m139694g(next.getUser()) || (text = next.getText()) == null || text.length() == 0 || next.getBubbleHidden()) {
                i++;
            } else if (i > 0) {
                list = C89070n.m154585g((Collection) list);
                C79714h hVar = list.get(i);
                list.remove(i);
                list.add(0, hVar);
            }
        }
        this.f178880a = list;
    }

    public /* synthetic */ UpvoteListViewModel(AbstractC1204m mVar, byte b) {
        this(mVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.upvote.detail.AbstractC79752c
    /* renamed from: a */
    public final void mo123320a(String str, C79711e eVar) {
        C89219l.m154721d(str, "");
        if (!C89219l.m154714a((Object) this.f178881b, (Object) str)) {
            C79788d.m138617a(str, this);
        } else {
            mo123318a(eVar);
        }
    }

    /* renamed from: a */
    public final void mo123319a(AbstractC79721a aVar, String str, long j) {
        String str2;
        C89219l.m154721d(str, "");
        if ((!f178878e || aVar != null) && (str2 = this.f178881b) != null) {
            C79788d.m138616a(str2, C79722b.m138555a(str2), j, str, aVar);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m138544a(UpvoteListViewModel upvoteListViewModel, AbstractC79721a aVar, String str, long j, int i) {
        if ((i & 1) != 0) {
            aVar = null;
        }
        if ((i & 2) != 0) {
            str = "";
        }
        upvoteListViewModel.mo123319a(aVar, str, j);
    }
}
