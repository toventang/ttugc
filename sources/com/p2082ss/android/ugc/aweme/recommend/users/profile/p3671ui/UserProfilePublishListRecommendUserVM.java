package com.p2082ss.android.ugc.aweme.recommend.users.profile.p3671ui;

import android.app.Activity;
import android.content.Context;
import com.bytedance.assem.arch.p794a.AbstractC12644a;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.ext_power_list.C14515a;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.bytedance.ies.powerlist.page.AbstractC17700f;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.api.AbstractC34479a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.friends.model.FriendList;
import com.p2082ss.android.ugc.aweme.friends.model.UploadContactsResult;
import com.p2082ss.android.ugc.aweme.metrics.C59256u;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.recommend.users.profile.p3670a.AbstractC66653a;
import com.p2082ss.android.ugc.aweme.recommend.users.profile.powerlist.C66693a;
import com.p2082ss.android.ugc.aweme.recommend.users.profile.powerlist.C66694b;
import com.p2082ss.android.ugc.aweme.utils.C80409eu;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89110d;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.ui.UserProfilePublishListRecommendUserVM */
public final class UserProfilePublishListRecommendUserVM extends AssemListViewModel<C66737f, AbstractC17641a, Integer> {

    /* renamed from: o */
    public static final C66695a f149863o = new C66695a((byte) 0);

    /* renamed from: k */
    public final C88411a f149864k = new C88411a();

    /* renamed from: l */
    public final Set<String> f149865l = new LinkedHashSet();

    /* renamed from: m */
    public User f149866m;

    /* renamed from: n */
    public String f149867n;

    /* renamed from: p */
    private final String f149868p = "[\"private_account\", \"no_content_account\"]";

    /* renamed from: q */
    private boolean f149869q;

    /* renamed from: r */
    private int f149870r;

    /* renamed from: s */
    private int f149871s;

    /* renamed from: t */
    private final AbstractC12644a<AbstractC66653a> f149872t;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.ui.UserProfilePublishListRecommendUserVM$b */
    public static final class C66696b extends AbstractC89110d {

        /* renamed from: a */
        /* synthetic */ Object f149873a;

        /* renamed from: b */
        int f149874b;

        /* renamed from: c */
        final /* synthetic */ UserProfilePublishListRecommendUserVM f149875c;

        /* renamed from: d */
        Object f149876d;

        /* renamed from: e */
        Object f149877e;

        static {
            Covode.recordClassIndex(78265);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66696b(UserProfilePublishListRecommendUserVM userProfilePublishListRecommendUserVM, AbstractC89124d dVar) {
            super(dVar);
            this.f149875c = userProfilePublishListRecommendUserVM;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            this.f149873a = obj;
            this.f149874b |= Integer.MIN_VALUE;
            return this.f149875c.mo105682a(0, 0, (String) null, 0, this);
        }
    }

    static {
        Covode.recordClassIndex(78263);
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.ui.UserProfilePublishListRecommendUserVM$a */
    public static final class C66695a {
        static {
            Covode.recordClassIndex(78264);
        }

        private C66695a() {
        }

        public /* synthetic */ C66695a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /* renamed from: f */
    public final /* synthetic */ AbstractC12853j mo20674f() {
        return new C66737f();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.AbstractC1174ac
    public final void onCleared() {
        super.onCleared();
        this.f149864k.mo142944a();
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.ui.UserProfilePublishListRecommendUserVM$d */
    static final class C66699d extends AbstractC89220m implements AbstractC89172b<C66737f, C66737f> {

        /* renamed from: a */
        final /* synthetic */ C14515a f149880a;

        static {
            Covode.recordClassIndex(78268);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66699d(C14515a aVar) {
            super(1);
            this.f149880a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C66737f invoke(C66737f fVar) {
            C66737f fVar2 = fVar;
            C89219l.m154721d(fVar2, "");
            return C66737f.m118521a(fVar2, this.f149880a, 0, false, 6);
        }
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* renamed from: a */
    public final void mo23334a(C14515a<AbstractC17641a> aVar) {
        C89219l.m154721d(aVar, "");
        mo20662a((AbstractC89172b) new C66699d(aVar));
    }

    /* renamed from: b */
    public final void mo105684b(int i) {
        mo20667b((AbstractC89172b) new C66704i(this, i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.ui.UserProfilePublishListRecommendUserVM$c */
    public static final class C66697c extends AbstractC89220m implements AbstractC89172b<C66737f, C89391z> {

        /* renamed from: a */
        final /* synthetic */ UserProfilePublishListRecommendUserVM f149878a;

        static {
            Covode.recordClassIndex(78266);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66697c(UserProfilePublishListRecommendUserVM userProfilePublishListRecommendUserVM) {
            super(1);
            this.f149878a = userProfilePublishListRecommendUserVM;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C66737f fVar) {
            C66737f fVar2 = fVar;
            C89219l.m154721d(fVar2, "");
            if (!fVar2.f149928b) {
                this.f149878a.mo20662a((AbstractC89172b) C666981.f149879a);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.ui.UserProfilePublishListRecommendUserVM$f */
    public static final class C66701f<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ Context f149885a;

        static {
            Covode.recordClassIndex(78270);
        }

        public C66701f(Context context) {
            this.f149885a = context;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Context context = this.f149885a;
            Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
            new C23144b((Activity) context).mo37640e(R.string.c0t).mo37637b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.ui.UserProfilePublishListRecommendUserVM$h */
    public static final class C66703h<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ Context f149890a;

        static {
            Covode.recordClassIndex(78272);
        }

        public C66703h(Context context) {
            this.f149890a = context;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Context context = this.f149890a;
            Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
            new C23144b((Activity) context).mo37640e(R.string.c0t).mo37637b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.ui.UserProfilePublishListRecommendUserVM$i */
    public static final class C66704i extends AbstractC89220m implements AbstractC89172b<C66737f, C89391z> {

        /* renamed from: a */
        final /* synthetic */ UserProfilePublishListRecommendUserVM f149891a;

        /* renamed from: b */
        final /* synthetic */ int f149892b;

        static {
            Covode.recordClassIndex(78273);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66704i(UserProfilePublishListRecommendUserVM userProfilePublishListRecommendUserVM, int i) {
            super(1);
            this.f149891a = userProfilePublishListRecommendUserVM;
            this.f149892b = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C66737f fVar) {
            C89219l.m154721d(fVar, "");
            this.f149891a.mo20662a((AbstractC89172b) new AbstractC89172b<C66737f, C66737f>(this) {
                /* class com.p2082ss.android.ugc.aweme.recommend.users.profile.p3671ui.UserProfilePublishListRecommendUserVM.C66704i.C667051 */

                /* renamed from: a */
                final /* synthetic */ C66704i f149893a;

                static {
                    Covode.recordClassIndex(78274);
                }

                {
                    this.f149893a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C66737f invoke(C66737f fVar) {
                    C66737f fVar2 = fVar;
                    C89219l.m154721d(fVar2, "");
                    return C66737f.m118521a(fVar2, null, this.f149893a.f149892b, false, 5);
                }
            });
            return C89391z.f203057a;
        }
    }

    public UserProfilePublishListRecommendUserVM(AbstractC12644a<AbstractC66653a> aVar) {
        C89219l.m154721d(aVar, "");
        this.f149872t = aVar;
    }

    /* renamed from: a */
    private final void m118503a(ArrayList<AbstractC17641a> arrayList) {
        if (!this.f149869q) {
            arrayList.add(new C66693a());
            this.f149869q = true;
        }
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* renamed from: a */
    public final Object mo23330a(AbstractC89124d<? super AbstractC17700f<Integer>> dVar) {
        String str;
        this.f149865l.clear();
        User user = this.f149866m;
        if (user != null) {
            str = user.getSecUid();
        } else {
            str = null;
        }
        return mo105682a(20, 0, str, 1, dVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.ui.UserProfilePublishListRecommendUserVM$e */
    public static final class C66700e<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ UserProfilePublishListRecommendUserVM f149881a;

        /* renamed from: b */
        final /* synthetic */ Context f149882b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89236c f149883c;

        /* renamed from: d */
        final /* synthetic */ int f149884d;

        static {
            Covode.recordClassIndex(78269);
        }

        public C66700e(UserProfilePublishListRecommendUserVM userProfilePublishListRecommendUserVM, Context context, C89233z.C89236c cVar, int i) {
            this.f149881a = userProfilePublishListRecommendUserVM;
            this.f149882b = context;
            this.f149883c = cVar;
            this.f149884d = i;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            AbstractC34479a aVar = (AbstractC34479a) obj;
            C89219l.m154721d(aVar, "");
            Object checkValid = aVar.checkValid();
            C89219l.m154716b(checkValid, "");
            List friends = ((FriendList) checkValid).getFriends();
            if (friends.size() == 0) {
                Context context = this.f149882b;
                Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
                new C23144b((Activity) context).mo37640e(R.string.dfp).mo37637b();
                return;
            }
            C89219l.m154716b(friends, "");
            ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) friends, 10));
            for (T t : friends) {
                Set<String> set = this.f149881a.f149865l;
                C89219l.m154716b(t, "");
                if (!set.contains(t.getUid())) {
                    UserProfilePublishListRecommendUserVM userProfilePublishListRecommendUserVM = this.f149881a;
                    C89233z.C89236c cVar = this.f149883c;
                    int i = cVar.element;
                    cVar.element = i + 1;
                    userProfilePublishListRecommendUserVM.mo23333a(i, new C66694b(t));
                    Set<String> set2 = this.f149881a.f149865l;
                    String uid = t.getUid();
                    C89219l.m154716b(uid, "");
                    set2.add(uid);
                }
                arrayList.add(C89391z.f203057a);
            }
            this.f149881a.mo105684b(this.f149884d);
            if (this.f149883c.element == this.f149884d) {
                Context context2 = this.f149882b;
                Objects.requireNonNull(context2, "null cannot be cast to non-null type android.app.Activity");
                new C23144b((Activity) context2).mo37640e(R.string.gfx).mo37637b();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.ui.UserProfilePublishListRecommendUserVM$g */
    public static final class C66702g<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ UserProfilePublishListRecommendUserVM f149886a;

        /* renamed from: b */
        final /* synthetic */ Context f149887b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89236c f149888c;

        /* renamed from: d */
        final /* synthetic */ int f149889d;

        static {
            Covode.recordClassIndex(78271);
        }

        public C66702g(UserProfilePublishListRecommendUserVM userProfilePublishListRecommendUserVM, Context context, C89233z.C89236c cVar, int i) {
            this.f149886a = userProfilePublishListRecommendUserVM;
            this.f149887b = context;
            this.f149888c = cVar;
            this.f149889d = i;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Object checkValid = ((AbstractC34479a) obj).checkValid();
            C89219l.m154716b(checkValid, "");
            List<User> list = ((UploadContactsResult) checkValid).users;
            if (list.size() == 0) {
                Context context = this.f149887b;
                Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
                new C23144b((Activity) context).mo37640e(R.string.dft).mo37637b();
                return;
            }
            C89219l.m154716b(list, "");
            ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
            for (T t : list) {
                Set<String> set = this.f149886a.f149865l;
                C89219l.m154716b(t, "");
                if (!set.contains(t.getUid())) {
                    UserProfilePublishListRecommendUserVM userProfilePublishListRecommendUserVM = this.f149886a;
                    C89233z.C89236c cVar = this.f149888c;
                    int i = cVar.element;
                    cVar.element = i + 1;
                    userProfilePublishListRecommendUserVM.mo23333a(i, new C66694b(t));
                    Set<String> set2 = this.f149886a.f149865l;
                    String uid = t.getUid();
                    C89219l.m154716b(uid, "");
                    set2.add(uid);
                }
                arrayList.add(C89391z.f203057a);
            }
            this.f149886a.mo105684b(this.f149889d);
            if (this.f149888c.element == this.f149889d) {
                Context context2 = this.f149887b;
                Objects.requireNonNull(context2, "null cannot be cast to non-null type android.app.Activity");
                new C23144b((Activity) context2).mo37640e(R.string.gfx).mo37637b();
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, h.c.d] */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* renamed from: a */
    public final /* synthetic */ Object mo23331a(Integer num, AbstractC89124d<? super AbstractC17700f<Integer>> dVar) {
        String str;
        int intValue = num.intValue();
        User user = this.f149866m;
        if (user != null) {
            str = user.getSecUid();
        } else {
            str = null;
        }
        return mo105682a(20, intValue, str, 1, dVar);
    }

    /* renamed from: b */
    private final void m118504b(C59256u.EnumC59257a aVar, User user) {
        String str;
        String str2;
        String str3;
        int i;
        int i2 = C66738g.f149930a[aVar.ordinal()];
        int i3 = 1;
        if (i2 == 1) {
            str = "follow";
        } else if (i2 == 2) {
            str = "follow_cancel";
        } else if (i2 != 3) {
            str = "";
        } else {
            str = "enter_personal_detail";
        }
        C33744d a = new C33744d().mo59983a("enter_method", "follow_card_button").mo59983a("enter_from", "others_homepage").mo59983a("event_type", "card").mo59983a("req_id", this.f149867n);
        String str4 = null;
        if (user != null) {
            str2 = user.getRecType();
        } else {
            str2 = null;
        }
        C33744d a2 = a.mo59983a("rec_type", str2);
        if (user != null) {
            str3 = user.getUid();
        } else {
            str3 = null;
        }
        C33744d a3 = a2.mo59983a("to_user_id", str3);
        User user2 = this.f149866m;
        if (user2 != null) {
            str4 = user2.getUid();
        }
        C33744d a4 = a3.mo59983a("from_user_id", str4);
        if (user == null || !user.isSecret()) {
            i = 0;
        } else {
            i = 1;
        }
        C33744d a5 = a4.mo59980a("is_private", i);
        if (user != null && user.getFollowStatus() == 4) {
            i3 = 0;
        }
        C33744d a6 = a5.mo59980a("cancel_type", i3);
        C89219l.m154716b(a6, "");
        C39162r.m79460a(str, C80409eu.m139390a(a6, user).f79943a);
    }

    /* renamed from: a */
    public final void mo105683a(C59256u.EnumC59257a aVar, User user) {
        String str;
        C89219l.m154721d(aVar, "");
        C59256u a = new C59256u().mo96834a("others_homepage");
        a.f135350a = C59256u.EnumC59259c.CARD;
        a.f135352b = aVar;
        C59256u s = a.mo96832a(user).mo96838p("bottom").mo96841s(this.f149867n);
        if (user != null) {
            str = user.getUid();
        } else {
            str = null;
        }
        s.mo96842t(str).mo96792f();
        m118504b(aVar, user);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008b A[Catch:{ Exception -> 0x011b }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c5 A[Catch:{ Exception -> 0x011b }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00dc A[Catch:{ Exception -> 0x011b }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0114 A[Catch:{ Exception -> 0x011b }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo105682a(int r15, int r16, java.lang.String r17, int r18, p4600h.p4603c.AbstractC89124d<? super com.bytedance.ies.powerlist.page.AbstractC17700f<java.lang.Integer>> r19) {
        /*
        // Method dump skipped, instructions count: 294
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.recommend.users.profile.p3671ui.UserProfilePublishListRecommendUserVM.mo105682a(int, int, java.lang.String, int, h.c.d):java.lang.Object");
    }
}
