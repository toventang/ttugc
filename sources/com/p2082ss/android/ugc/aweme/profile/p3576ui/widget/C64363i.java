package com.p2082ss.android.ugc.aweme.profile.p3576ui.widget;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.nita.p1553a.C21522a;
import com.bytedance.nita.p1554b.C21532b;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.base.api.AbstractC34479a;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f;
import com.p2082ss.android.ugc.aweme.common.p2632d.AbstractC39097c;
import com.p2082ss.android.ugc.aweme.friends.model.FriendList;
import com.p2082ss.android.ugc.aweme.friends.model.MutualStruct;
import com.p2082ss.android.ugc.aweme.friends.model.MutualUser;
import com.p2082ss.android.ugc.aweme.friends.model.RecommendContact;
import com.p2082ss.android.ugc.aweme.friends.model.UploadContactsResult;
import com.p2082ss.android.ugc.aweme.friends.service.C51648a;
import com.p2082ss.android.ugc.aweme.profile.experiment.C63746h;
import com.p2082ss.android.ugc.aweme.profile.experiment.C63748i;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.C64121cr;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.RecommendCommonUserViewMus;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.View$OnClickListenerC64123cs;
import com.p2082ss.android.ugc.aweme.social.ext.C74729a;
import com.p2082ss.android.ugc.aweme.social.widget.C74743a;
import com.p2082ss.android.ugc.aweme.social.widget.card.AbstractC74788j;
import com.p2082ss.android.ugc.aweme.social.widget.card.C74787i;
import com.p2082ss.android.ugc.aweme.social.widget.card.EnumC74790k;
import com.p2082ss.android.ugc.aweme.social.widget.card.p3920a.C74762g;
import com.p2082ss.android.ugc.aweme.social.widget.card.p3920a.C74765i;
import com.p2082ss.android.ugc.aweme.social.widget.card.p3920a.EnumC74754a;
import com.p2082ss.android.ugc.aweme.social.widget.card.p3920a.EnumC74760e;
import com.p2082ss.android.ugc.aweme.social.widget.card.p3920a.EnumC74761f;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.aweme.utils.C80581io;
import com.p2082ss.android.ugc.aweme.utils.UserVerify;
import com.p2082ss.android.ugc.aweme.views.MutualRelationView;
import com.p2082ss.android.ugc.aweme.views.SuggestUserAvatarView;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4589j.C88934a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89387v;
import p4600h.C89388w;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89064i;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.i */
public final class C64363i extends AbstractC39060f<User> {

    /* renamed from: y */
    public static final C64364a f145917y = new C64364a((byte) 0);

    /* renamed from: A */
    private int f145918A;

    /* renamed from: B */
    private int f145919B = 1;

    /* renamed from: C */
    private float f145920C = mo103922n();

    /* renamed from: D */
    private final Paint f145921D = new Paint();

    /* renamed from: E */
    private final Set<String> f145922E = new LinkedHashSet();

    /* renamed from: F */
    private int f145923F;

    /* renamed from: G */
    private final AbstractC89244h f145924G = C89250i.m154773a((AbstractC89171a) new C64373i(this));

    /* renamed from: H */
    private final C64370g f145925H;

    /* renamed from: a */
    public AbstractC64365b f145926a;

    /* renamed from: b */
    public AbstractC39097c<View$OnClickListenerC64123cs> f145927b;

    /* renamed from: c */
    public View$OnClickListenerC64123cs.AbstractC64126c f145928c;

    /* renamed from: d */
    public C64121cr.AbstractC64122a f145929d;

    /* renamed from: e */
    public String f145930e;

    /* renamed from: f */
    public String f145931f;

    /* renamed from: g */
    public int f145932g;

    /* renamed from: h */
    public final HashMap<String, Integer> f145933h = new HashMap<>();

    /* renamed from: i */
    public C88411a f145934i;

    /* renamed from: j */
    public User f145935j;

    /* renamed from: k */
    public boolean f145936k;

    /* renamed from: w */
    final AbstractC89244h f145937w = C89250i.m154773a((AbstractC89171a) new C64374j(this));

    /* renamed from: x */
    final AbstractC89244h f145938x;

    /* renamed from: z */
    private int f145939z;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.i$b */
    public interface AbstractC64365b {
        static {
            Covode.recordClassIndex(75819);
        }

        /* renamed from: a */
        void mo103923a(User user);

        /* renamed from: b */
        void mo103924b(User user);

        /* renamed from: c */
        void mo103925c(User user);

        /* renamed from: d */
        void mo103926d(User user);
    }

    static {
        Covode.recordClassIndex(75817);
    }

    /* renamed from: l */
    public final C64121cr mo103921l() {
        return (C64121cr) this.f145924G.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.i$a */
    public static final class C64364a {
        static {
            Covode.recordClassIndex(75818);
        }

        private C64364a() {
        }

        public /* synthetic */ C64364a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f
    /* renamed from: e */
    public final List<User> mo63369e() {
        List<User> list = this.f92236l;
        if (list == null) {
            return C89086z.INSTANCE;
        }
        return list;
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.i$i */
    static final class C64373i extends AbstractC89220m implements AbstractC89171a<C64121cr> {

        /* renamed from: a */
        final /* synthetic */ C64363i f145956a;

        static {
            Covode.recordClassIndex(75827);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64373i(C64363i iVar) {
            super(0);
            this.f145956a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C64121cr invoke() {
            return new C64121cr((View) this.f145956a.f145938x.getValue());
        }
    }

    /* renamed from: m */
    public static EnumC74754a m116248m() {
        if (C63746h.m115277a()) {
            return EnumC74754a.LARGE_SQUARE;
        }
        return EnumC74754a.SQUARE;
    }

    /* renamed from: n */
    public final float mo103922n() {
        float f;
        int i = this.f145919B;
        if (i >= 2) {
            i = 2;
        }
        if (C63746h.m115277a()) {
            f = 226.0f;
        } else {
            f = 176.0f;
        }
        return (((float) (i - 1)) * 14.0f) + f;
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.i$j */
    static final class C64374j extends AbstractC89220m implements AbstractC89171a<C74762g> {

        /* renamed from: a */
        final /* synthetic */ C64363i f145957a;

        static {
            Covode.recordClassIndex(75828);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64374j(C64363i iVar) {
            super(0);
            this.f145957a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C74762g invoke() {
            return new C74762g(C89041ag.m154421a(C89387v.m154943a(EnumC74761f.CONTACT, C64363i.m116248m()), C89387v.m154943a(EnumC74761f.FACEBOOK, C64363i.m116248m())));
        }
    }

    /* renamed from: o */
    private final void m116249o() {
        User user = this.f145935j;
        if (user != null) {
            boolean z = this.f145936k;
            C89219l.m154721d(user, "");
            int i = 2;
            int i2 = 0;
            if (user.getFollowerCount() < 1000 && user.getAccountType() != 2 && user.getAccountType() != 3) {
                if (C63748i.m115280a() == 1 || C63748i.m115280a() == 3 || (!z && C63748i.m115280a() == 2)) {
                    if (C63746h.m115277a()) {
                        i = 1;
                    }
                    while (i2 < this.f92236l.size() && i2 < i) {
                        String[] strArr = C64376k.f145959a;
                        Object obj = this.f92236l.get(i2);
                        C89219l.m154716b(obj, "");
                        if (!C89064i.m154489a(strArr, ((User) obj).getRecType())) {
                            break;
                        }
                        i2++;
                    }
                    this.f92236l.add(i2, new RecommendContact(null, 1, null));
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.i$h */
    static final class C64371h extends AbstractC89220m implements AbstractC89171a<LinearLayout> {

        /* renamed from: a */
        final /* synthetic */ C64363i f145953a;

        /* renamed from: b */
        final /* synthetic */ Context f145954b;

        static {
            Covode.recordClassIndex(75825);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64371h(C64363i iVar, Context context) {
            super(0);
            this.f145953a = iVar;
            this.f145954b = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LinearLayout invoke() {
            Activity a;
            String str;
            Context context;
            Context context2 = this.f145954b;
            if (context2 instanceof C21522a) {
                C21522a aVar = (C21522a) context2;
                WeakReference<Context> weakReference = aVar.f51100a;
                Context context3 = null;
                if (weakReference != null) {
                    context3 = weakReference.get();
                }
                if (context3 instanceof Activity) {
                    WeakReference<Context> weakReference2 = aVar.f51100a;
                    if (weakReference2 == null || (context = weakReference2.get()) == null) {
                        throw new C89388w("null cannot be cast to non-null type");
                    }
                    a = (Activity) context;
                } else {
                    throw new C21532b("make sure you get this preCreated View from Activity context ");
                }
            } else {
                a = C34729o.m70950a(context2);
            }
            C74787i iVar = C74787i.f168102a;
            Objects.requireNonNull(a, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            C74743a aVar2 = new C74743a((ActivityC0945e) a, null, null, null, 14);
            C74765i.C74766a aVar3 = new C74765i.C74766a();
            int i = this.f145953a.f145932g;
            if (i == RecommendCommonUserViewMus.f145014j) {
                str = "others_homepage";
            } else if (i == 1) {
                str = "homepage_follow";
            } else if (i == RecommendCommonUserViewMus.f145016l) {
                str = "homepage_friends";
            } else {
                str = "";
            }
            return iVar.mo117802a(aVar2, 0, aVar3.mo117828a(C89041ag.m154412a(C89387v.m154943a("enter_from", str))).mo117824a((C74762g) this.f145953a.f145937w.getValue()).mo117826a(new AbstractC74788j(this) {
                /* class com.p2082ss.android.ugc.aweme.profile.p3576ui.widget.C64363i.C64371h.C643721 */

                /* renamed from: a */
                final /* synthetic */ C64371h f145955a;

                static {
                    Covode.recordClassIndex(75826);
                }

                @Override // com.p2082ss.android.ugc.aweme.social.widget.card.AbstractC74788j
                /* renamed from: d */
                public final void mo86630d(int i) {
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f145955a = r1;
                }

                @Override // com.p2082ss.android.ugc.aweme.social.widget.card.AbstractC74788j
                /* renamed from: a */
                public final void mo86627a(User user) {
                    C89219l.m154721d(user, "");
                    C89219l.m154721d(user, "");
                }

                @Override // com.p2082ss.android.ugc.aweme.social.widget.card.AbstractC74788j
                /* renamed from: a */
                public final void mo86629a(EnumC74790k kVar) {
                    C89219l.m154721d(kVar, "");
                    C89219l.m154721d(kVar, "");
                }

                @Override // com.p2082ss.android.ugc.aweme.social.widget.card.AbstractC74788j
                /* renamed from: a */
                public final void mo86628a(EnumC74761f fVar, EnumC74760e eVar, List<? extends User> list) {
                    int adapterPosition;
                    C88411a aVar;
                    C89219l.m154721d(fVar, "");
                    C89219l.m154721d(eVar, "");
                    if (eVar == EnumC74760e.ON_AUTHORIZE) {
                        if (fVar == EnumC74761f.CONTACT) {
                            adapterPosition = this.f145955a.f145953a.mo103921l().getAdapterPosition();
                        } else {
                            adapterPosition = this.f145955a.f145953a.mo103921l().getAdapterPosition() + 1;
                        }
                        C64363i iVar = this.f145955a.f145953a;
                        Context context = this.f145955a.f145954b;
                        int i = C64375j.f145958a[fVar.ordinal()];
                        if (i == 1) {
                            C88411a aVar2 = iVar.f145934i;
                            if (aVar2 != null) {
                                C51648a aVar3 = C51648a.f118980a;
                                User b = C80580in.m139683b();
                                C89219l.m154716b(b, "");
                                String uid = b.getUid();
                                C89219l.m154716b(uid, "");
                                AbstractC88412b a = aVar3.mo87301a(uid, 6).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C64368e(iVar, context, adapterPosition), new C64369f(iVar, context, adapterPosition));
                                C89219l.m154716b(a, "");
                                C88934a.m154195a(a, aVar2);
                            }
                        } else if (i == 2 && (aVar = iVar.f145934i) != null) {
                            AbstractC88412b a2 = C51648a.f118980a.mo87314b(6).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C64366c(iVar, context, adapterPosition), new C64367d(iVar, context, adapterPosition));
                            C89219l.m154716b(a2, "");
                            C88934a.m154195a(a2, aVar);
                        }
                    }
                }
            }).mo117829a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.i$d */
    static final class C64367d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C64363i f145943a;

        /* renamed from: b */
        final /* synthetic */ Context f145944b;

        /* renamed from: c */
        final /* synthetic */ int f145945c;

        static {
            Covode.recordClassIndex(75821);
        }

        C64367d(C64363i iVar, Context context, int i) {
            this.f145943a = iVar;
            this.f145944b = context;
            this.f145945c = i;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C64363i.m116247a(this.f145944b, 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.i$f */
    static final class C64369f<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C64363i f145949a;

        /* renamed from: b */
        final /* synthetic */ Context f145950b;

        /* renamed from: c */
        final /* synthetic */ int f145951c;

        static {
            Covode.recordClassIndex(75823);
        }

        C64369f(C64363i iVar, Context context, int i) {
            this.f145949a = iVar;
            this.f145950b = context;
            this.f145951c = i;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C64363i.m116247a(this.f145950b, 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.i$g */
    public static final class C64370g implements View$OnClickListenerC64123cs.AbstractC64125b {

        /* renamed from: a */
        final /* synthetic */ C64363i f145952a;

        static {
            Covode.recordClassIndex(75824);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C64370g(C64363i iVar) {
            this.f145952a = iVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.View$OnClickListenerC64123cs.AbstractC64125b
        /* renamed from: a */
        public final void mo103735a(User user, int i) {
            AbstractC64365b bVar;
            C89219l.m154721d(user, "");
            if (i >= 0 && i < this.f145952a.f92236l.size()) {
                this.f145952a.f92236l.remove(i);
                this.f145952a.notifyItemRemoved(i);
                if (this.f145952a.f145926a != null && !(user instanceof RecommendContact)) {
                    AbstractC64365b bVar2 = this.f145952a.f145926a;
                    if (bVar2 != null) {
                        bVar2.mo103923a(user);
                    }
                    if (this.f145952a.f92236l.isEmpty() && (bVar = this.f145952a.f145926a) != null) {
                        bVar.mo103924b(user);
                    }
                }
                if (i != this.f145952a.f92236l.size()) {
                    C64363i iVar = this.f145952a;
                    iVar.notifyItemRangeChanged(i, iVar.f92236l.size() - i);
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: c */
    public final int mo60936c(int i) {
        if (this.f92236l.get(i) instanceof RecommendContact) {
            return 1;
        }
        return 0;
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.i$c */
    static final class C64366c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C64363i f145940a;

        /* renamed from: b */
        final /* synthetic */ Context f145941b;

        /* renamed from: c */
        final /* synthetic */ int f145942c;

        static {
            Covode.recordClassIndex(75820);
        }

        C64366c(C64363i iVar, Context context, int i) {
            this.f145940a = iVar;
            this.f145941b = context;
            this.f145942c = i;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Object checkValid = ((AbstractC34479a) obj).checkValid();
            C89219l.m154716b(checkValid, "");
            List<User> list = ((UploadContactsResult) checkValid).users;
            C64363i iVar = this.f145940a;
            Context context = this.f145941b;
            C89219l.m154716b(list, "");
            iVar.mo103920a(context, 1, list, this.f145942c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.i$e */
    static final class C64368e<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C64363i f145946a;

        /* renamed from: b */
        final /* synthetic */ Context f145947b;

        /* renamed from: c */
        final /* synthetic */ int f145948c;

        static {
            Covode.recordClassIndex(75822);
        }

        C64368e(C64363i iVar, Context context, int i) {
            this.f145946a = iVar;
            this.f145947b = context;
            this.f145948c = i;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            AbstractC34479a aVar = (AbstractC34479a) obj;
            C89219l.m154721d(aVar, "");
            Object checkValid = aVar.checkValid();
            C89219l.m154716b(checkValid, "");
            List<? extends User> friends = ((FriendList) checkValid).getFriends();
            C64363i iVar = this.f145946a;
            Context context = this.f145947b;
            C89219l.m154716b(friends, "");
            iVar.mo103920a(context, 2, friends, this.f145948c);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        C89219l.m154721d(viewHolder, "");
        super.onViewAttachedToWindow(viewHolder);
        if (viewHolder instanceof View$OnClickListenerC64123cs) {
            AbstractC39097c<View$OnClickListenerC64123cs> cVar = this.f145927b;
            if (cVar != null) {
                cVar.mo67855a(viewHolder);
            }
        } else if ((viewHolder instanceof C64121cr) && this.f145918A != 0) {
            C51648a.f118980a.mo87323d(this.f145918A);
        }
    }

    public C64363i(Context context) {
        C89219l.m154721d(context, "");
        this.f145938x = C89250i.m154773a((AbstractC89171a) new C64371h(this, context));
        this.f145925H = new C64370g(this);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User>] */
    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f
    /* renamed from: b_ */
    public final void mo62377b_(List<User> list) {
        String quantityString;
        List<MutualUser> userList;
        C89219l.m154721d(list, "");
        int a = C51648a.f118980a.mo87293a("others_homepage");
        this.f145918A = a;
        if (a == 0 && !C63748i.m115281b()) {
            this.f92236l = list;
        } else if (!list.isEmpty()) {
            if (this.f92236l == null) {
                this.f92236l = new ArrayList();
            }
            this.f92236l.clear();
            if (!(list.get(0) instanceof RecommendContact)) {
                this.f92236l.addAll(list);
            }
            m116249o();
        } else {
            return;
        }
        this.f145919B = 1;
        this.f145922E.clear();
        List list2 = this.f92236l;
        C89219l.m154716b(list2, "");
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            User user = (User) this.f92236l.get(i);
            if (!(user instanceof RecommendContact)) {
                HashMap<String, Integer> hashMap = this.f145933h;
                C89219l.m154716b(user, "");
                String uid = user.getUid();
                C89219l.m154716b(uid, "");
                hashMap.put(uid, Integer.valueOf(i));
                Set<String> set = this.f145922E;
                String uid2 = user.getUid();
                C89219l.m154716b(uid2, "");
                set.add(uid2);
                if (C63746h.m115278b()) {
                    Object obj = this.f92236l.get(i);
                    C89219l.m154716b(obj, "");
                    User user2 = (User) obj;
                    C89219l.m154721d(user2, "");
                    Paint paint = this.f145921D;
                    Resources system = Resources.getSystem();
                    C89219l.m154709a((Object) system, "");
                    paint.setTextSize(TypedValue.applyDimension(1, 12.0f, system.getDisplayMetrics()));
                    Resources system2 = Resources.getSystem();
                    C89219l.m154709a((Object) system2, "");
                    float applyDimension = TypedValue.applyDimension(1, 130.0f, system2.getDisplayMetrics());
                    if (C63746h.m115277a()) {
                        Paint paint2 = this.f145921D;
                        Resources system3 = Resources.getSystem();
                        C89219l.m154709a((Object) system3, "");
                        paint2.setTextSize(TypedValue.applyDimension(1, 13.0f, system3.getDisplayMetrics()));
                        Resources system4 = Resources.getSystem();
                        C89219l.m154709a((Object) system4, "");
                        applyDimension = TypedValue.applyDimension(1, 160.0f, system4.getDisplayMetrics());
                    }
                    Resources system5 = Resources.getSystem();
                    C89219l.m154709a((Object) system5, "");
                    double applyDimension2 = (double) (applyDimension - (TypedValue.applyDimension(1, 8.0f, system5.getDisplayMetrics()) * 2.0f));
                    C89219l.m154721d(user2, "");
                    if (user2.getMutualStruct() == null) {
                        quantityString = user2.getRecommendReason();
                        C89219l.m154716b(quantityString, "");
                    } else {
                        List<MutualUser> userList2 = user2.getMutualStruct().getUserList();
                        if (userList2 == null || userList2.isEmpty()) {
                            quantityString = C17867d.m33078a().getResources().getQuantityString(R.plurals.fa, user2.getMutualStruct().getTotal(), Integer.valueOf(user2.getMutualStruct().getTotal()));
                            C89219l.m154716b(quantityString, "");
                        } else {
                            quantityString = MutualRelationView.C81410a.m141133a(C17867d.m33078a(), Integer.valueOf(user2.getMutualStruct().getMutualType()));
                        }
                    }
                    double measureText = (double) this.f145921D.measureText(quantityString);
                    if (!(user2.getMutualStruct() == null || (userList = user2.getMutualStruct().getUserList()) == null || userList.isEmpty())) {
                        MutualStruct mutualStruct = user2.getMutualStruct();
                        C89219l.m154716b(mutualStruct, "");
                        float a2 = SuggestUserAvatarView.C81421a.m141180a(mutualStruct);
                        Resources system6 = Resources.getSystem();
                        C89219l.m154709a((Object) system6, "");
                        double applyDimension3 = (double) TypedValue.applyDimension(1, a2, system6.getDisplayMetrics());
                        Double.isNaN(measureText);
                        Double.isNaN(applyDimension3);
                        measureText += applyDimension3;
                    }
                    Double.isNaN(applyDimension2);
                    int ceil = (int) Math.ceil(measureText / applyDimension2);
                    if (ceil > this.f145919B) {
                        this.f145919B = ceil;
                    }
                }
            }
        }
        this.f145920C = mo103922n();
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public static void m116247a(Context context, int i) {
        int i2 = R.string.c0t;
        if (i != 0) {
            if (i == 1) {
                i2 = R.string.dft;
            } else if (i == 2) {
                i2 = R.string.dfp;
            } else if (i == 3) {
                i2 = R.string.gfx;
            }
        }
        Activity a = C34729o.m70950a(context);
        if (a != null) {
            new C23144b(a).mo37640e(i2).mo37637b();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo60184a(ViewGroup viewGroup, int i) {
        C89219l.m154721d(viewGroup, "");
        if (i == 1) {
            return mo103921l();
        }
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.ao7, viewGroup, false);
        C89219l.m154716b(a, "");
        return new View$OnClickListenerC64123cs(a, this.f145932g);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final void mo60186a(RecyclerView.ViewHolder viewHolder, int i) {
        User user;
        TextView textView;
        C89219l.m154721d(viewHolder, "");
        if (viewHolder instanceof View$OnClickListenerC64123cs) {
            View$OnClickListenerC64123cs csVar = (View$OnClickListenerC64123cs) viewHolder;
            if (this.f92236l == null || i < 0 || i >= this.f92236l.size()) {
                user = null;
            } else {
                user = (User) this.f92236l.get(i);
            }
            C64370g gVar = this.f145925H;
            View$OnClickListenerC64123cs.AbstractC64126c cVar = this.f145928c;
            AbstractC64365b bVar = this.f145926a;
            int i2 = this.f145939z;
            String str = this.f145930e;
            String str2 = this.f145931f;
            if (user != null) {
                csVar.f145474j = bVar;
                csVar.f145469e = user;
                User user2 = csVar.f145469e;
                if (user2 == null) {
                    C89219l.m154710a("mUser");
                }
                csVar.f145478n = Integer.valueOf(user2.getFollowStatus());
                csVar.f145471g = gVar;
                csVar.f145472h = cVar;
                csVar.f145470f = i;
                UrlModel avatarMedium = user.getAvatarMedium();
                if (avatarMedium == null) {
                    avatarMedium = user.getAvatarThumb();
                }
                csVar.f145465a.setUserData(new UserVerify(avatarMedium, user.getCustomVerify(), user.getEnterpriseVerifyReason(), Integer.valueOf(user.getVerificationType())));
                csVar.f145465a.mo61285a();
                csVar.f145466b.setText(user.getNickname());
                csVar.f145467c.setVisibility(8);
                csVar.f145468d.setVisibility(0);
                csVar.f145468d.setMaxLines(1);
                if (C63746h.m115278b()) {
                    if (user.getMutualStruct() == null) {
                        csVar.f145467c.setVisibility(8);
                        csVar.f145468d.setVisibility(0);
                        C74729a.m131190a(csVar.f145468d, user, null, null, 6);
                        csVar.f145468d.setMinTextSize(10.0f);
                        csVar.f145468d.setMaxLines(2);
                        csVar.f145468d.setEllipsize(TextUtils.TruncateAt.END);
                    } else {
                        csVar.f145468d.setVisibility(8);
                        csVar.f145467c.setVisibility(0);
                        csVar.f145468d.setText(user.getUniqueId());
                        csVar.f145467c.getTvDesc().setMaxLines(2);
                        csVar.f145467c.getTvDesc().setEllipsize(TextUtils.TruncateAt.END);
                        csVar.f145467c.mo125023a(user.getMutualStruct(), 6);
                        List<MutualUser> userList = user.getMutualStruct().getUserList();
                        if (userList == null || userList.isEmpty()) {
                            csVar.f145467c.mo125020a();
                            csVar.f145467c.getTvDesc().setMaxLines(2);
                            csVar.f145467c.getTvDesc().setMinTextSize(10.0f);
                            csVar.f145467c.getTvDesc().setGravity(17);
                        } else {
                            MutualRelationView mutualRelationView = csVar.f145467c;
                            MutualStruct mutualStruct = user.getMutualStruct();
                            C89219l.m154716b(mutualStruct, "");
                            mutualRelationView.mo125022a(mutualStruct, View$OnClickListenerC64123cs.m116042b());
                        }
                    }
                }
                if (C63746h.m115278b()) {
                    textView = csVar.f145466b;
                } else {
                    textView = csVar.f145468d;
                }
                C80581io.m139704a(csVar.f145473i, user.getCustomVerify(), user.getEnterpriseVerifyReason(), textView);
                User user3 = csVar.f145469e;
                if (user3 == null) {
                    C89219l.m154710a("mUser");
                }
                Integer valueOf = Integer.valueOf(user3.getFollowStatus());
                User user4 = csVar.f145469e;
                if (user4 == null) {
                    C89219l.m154710a("mUser");
                }
                csVar.mo103733a(valueOf, user4.getFollowerStatus());
                ViewGroup.LayoutParams layoutParams = csVar.f145475k.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                RecyclerView.C1367j jVar = (RecyclerView.C1367j) layoutParams;
                if (i != 0) {
                    i2 = 0;
                }
                jVar.leftMargin = i2;
                csVar.f145475k.setLayoutParams(jVar);
                csVar.f145477m = str2;
                csVar.f145476l = str;
                if (csVar.f145476l == null) {
                    csVar.f145476l = "";
                }
            }
            float f = this.f145920C;
            int i3 = csVar.f145475k.getLayoutParams().height;
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            if (i3 != C89241a.m154730a(TypedValue.applyDimension(1, f, system.getDisplayMetrics()))) {
                ViewGroup.LayoutParams layoutParams2 = csVar.f145475k.getLayoutParams();
                Resources system2 = Resources.getSystem();
                C89219l.m154709a((Object) system2, "");
                layoutParams2.height = C89241a.m154730a(TypedValue.applyDimension(1, f, system2.getDisplayMetrics()));
                csVar.f145475k.setLayoutParams(layoutParams2);
            }
        } else if (viewHolder instanceof C64121cr) {
            this.f145923F = i;
            C64121cr crVar = (C64121cr) viewHolder;
            float f2 = this.f145920C;
            View view = crVar.itemView;
            C89219l.m154716b(view, "");
            int i4 = view.getLayoutParams().height;
            Resources system3 = Resources.getSystem();
            C89219l.m154709a((Object) system3, "");
            if (i4 != C89241a.m154730a(TypedValue.applyDimension(1, f2, system3.getDisplayMetrics()))) {
                View view2 = crVar.itemView;
                C89219l.m154716b(view2, "");
                ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
                Resources system4 = Resources.getSystem();
                C89219l.m154709a((Object) system4, "");
                layoutParams3.height = C89241a.m154730a(TypedValue.applyDimension(1, f2, system4.getDisplayMetrics()));
                View view3 = crVar.itemView;
                C89219l.m154716b(view3, "");
                view3.setLayoutParams(layoutParams3);
            }
        }
    }

    /* renamed from: a */
    public final void mo103920a(Context context, int i, List<? extends User> list, int i2) {
        if (list.isEmpty()) {
            m116247a(context, i);
            return;
        }
        int i3 = i2;
        for (T t : list) {
            if (!this.f145922E.contains(t.getUid())) {
                int i4 = i3 + 1;
                this.f92236l.add(i3, t);
                Set<String> set = this.f145922E;
                String uid = t.getUid();
                C89219l.m154716b(uid, "");
                set.add(uid);
                i3 = i4;
            }
        }
        if (i3 > i2) {
            notifyItemRangeInserted(i2, i3 - i2);
            C64121cr.AbstractC64122a aVar = this.f145929d;
            if (aVar != null) {
                aVar.mo103529a(i2);
                return;
            }
            return;
        }
        m116247a(context, 3);
    }
}
