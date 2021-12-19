package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.video.p3116ui;

import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.video.data.api.FavoriteAwemeService;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.video.data.p3115a.C54200a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.video.p3116ui.DialogInterface$OnDismissListenerC54209b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.p3187a.C55256c;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4560f.p4561a.AbstractC88398aa;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88429b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.ui.FavoriteVideoPickerViewModel */
public final class FavoriteVideoPickerViewModel extends AbstractC1174ac {

    /* renamed from: h */
    public static final C54202a f124173h = new C54202a((byte) 0);

    /* renamed from: a */
    public int f124174a;

    /* renamed from: b */
    public final C1213t<Boolean> f124175b;

    /* renamed from: c */
    public final C1213t<List<Aweme>> f124176c;

    /* renamed from: d */
    final C1213t<C54200a> f124177d;

    /* renamed from: e */
    public final C1213t<Aweme> f124178e;

    /* renamed from: f */
    final C1213t<C55256c<Aweme>> f124179f;

    /* renamed from: g */
    final C1213t<C55256c<Aweme>> f124180g;

    /* renamed from: i */
    private final C88411a f124181i;

    /* renamed from: j */
    private final FavoriteAwemeService f124182j;

    /* renamed from: k */
    private final AbstractC88398aa f124183k;

    /* renamed from: l */
    private final AbstractC88398aa f124184l;

    /* renamed from: m */
    private final User f124185m;

    static {
        Covode.recordClassIndex(63888);
    }

    public FavoriteVideoPickerViewModel() {
        this((byte) 0);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.ui.FavoriteVideoPickerViewModel$a */
    public static final class C54202a {
        static {
            Covode.recordClassIndex(63889);
        }

        private C54202a() {
        }

        public /* synthetic */ C54202a(byte b) {
            this();
        }
    }

    @Override // androidx.lifecycle.AbstractC1174ac
    public final void onCleared() {
        super.onCleared();
        this.f124181i.mo142944a();
    }

    /* renamed from: b */
    private final void m99465b() {
        int i;
        String str;
        FavoriteAwemeService favoriteAwemeService = this.f124182j;
        List<Aweme> value = this.f124176c.getValue();
        if (value != null) {
            i = value.size();
        } else {
            i = 30;
        }
        User user = this.f124185m;
        String str2 = null;
        if (user != null) {
            str = user.getUid();
        } else {
            str = null;
        }
        User user2 = this.f124185m;
        if (user2 != null) {
            str2 = user2.getSecUid();
        }
        this.f124181i.mo142945a(favoriteAwemeService.getFavoriteAweme(i, str, str2, 0).mo142918b(this.f124184l).mo142909a(this.f124183k).mo142922b(new C54205d(this)));
    }

    /* renamed from: a */
    public final void mo91299a() {
        String str;
        FavoriteAwemeService favoriteAwemeService = this.f124182j;
        User user = this.f124185m;
        String str2 = null;
        if (user != null) {
            str = user.getUid();
        } else {
            str = null;
        }
        User user2 = this.f124185m;
        if (user2 != null) {
            str2 = user2.getSecUid();
        }
        this.f124181i.mo142945a(favoriteAwemeService.getFavoriteAweme(30, str, str2, (long) (this.f124174a * 30)).mo142918b(this.f124184l).mo142909a(this.f124183k).mo142913a(new C54203b(this)).mo142922b(new C54204c(this)));
    }

    /* renamed from: a */
    public final void mo91300a(Aweme aweme) {
        this.f124178e.setValue(aweme);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.ui.FavoriteVideoPickerViewModel$b */
    static final class C54203b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ FavoriteVideoPickerViewModel f124186a;

        static {
            Covode.recordClassIndex(63890);
        }

        C54203b(FavoriteVideoPickerViewModel favoriteVideoPickerViewModel) {
            this.f124186a = favoriteVideoPickerViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f124186a.f124175b.setValue(true);
        }
    }

    /* renamed from: b */
    public final void mo91301b(Aweme aweme) {
        if (aweme != null) {
            this.f124177d.setValue(new C54200a(aweme, DialogInterface$OnDismissListenerC54209b.AbstractC54212c.C54213a.f124209b));
        } else {
            m99465b();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private /* synthetic */ FavoriteVideoPickerViewModel(byte r6) {
        /*
            r5 = this;
            com.bytedance.ies.ugc.aweme.network.IRetrofitFactory r1 = com.bytedance.ies.ugc.aweme.network.RetrofitFactory.m33635a()
            java.lang.String r0 = com.p2082ss.android.p2123b.C29736b.f70924e
            com.bytedance.ies.ugc.aweme.network.f r1 = r1.mo28816a(r0)
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.data.api.FavoriteAwemeService> r0 = com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.video.data.api.FavoriteAwemeService.class
            java.lang.Object r4 = r1.mo28858a(r0)
            java.lang.String r3 = ""
            p4600h.p4611f.p4613b.C89219l.m154716b(r4, r3)
            com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.data.api.FavoriteAwemeService r4 = (com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.video.data.api.FavoriteAwemeService) r4
            f.a.aa r0 = p4560f.p4561a.p4562a.p4564b.C88392a.f200660a
            f.a.aa r2 = p4560f.p4561a.p4562a.p4563a.C88391a.m153580a(r0)
            p4600h.p4611f.p4613b.C89219l.m154716b(r2, r3)
            f.a.aa r0 = p4560f.p4561a.p4590k.C88946a.f201991c
            f.a.aa r1 = p4560f.p4561a.p4587h.C88925a.m154180b(r0)
            p4600h.p4611f.p4613b.C89219l.m154716b(r1, r3)
            com.ss.android.ugc.aweme.profile.model.User r0 = com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55197c.m100922d()
            r5.<init>(r4, r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.video.p3116ui.FavoriteVideoPickerViewModel.<init>(byte):void");
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.ui.FavoriteVideoPickerViewModel$c */
    static final class C54204c<T1, T2> implements AbstractC88429b {

        /* renamed from: a */
        final /* synthetic */ FavoriteVideoPickerViewModel f124187a;

        static {
            Covode.recordClassIndex(63891);
        }

        C54204c(FavoriteVideoPickerViewModel favoriteVideoPickerViewModel) {
            this.f124187a = favoriteVideoPickerViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88429b
        /* renamed from: a */
        public final /* synthetic */ void mo10350a(Object obj, Object obj2) {
            FeedItemList feedItemList = (FeedItemList) obj;
            this.f124187a.f124175b.setValue(false);
            if (feedItemList != null) {
                this.f124187a.f124174a++;
                if (feedItemList.hasMore == 0) {
                    this.f124187a.f124174a = -1;
                }
                ArrayList arrayList = new ArrayList();
                List<Aweme> value = this.f124187a.f124176c.getValue();
                if (value == null) {
                    C89219l.m154715b();
                }
                arrayList.addAll(value);
                List<Aweme> items = feedItemList.getItems();
                if (items != null) {
                    arrayList.addAll(items);
                }
                this.f124187a.f124176c.setValue(arrayList);
                if (this.f124187a.f124174a == 1) {
                    this.f124187a.f124178e.setValue(null);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.ui.FavoriteVideoPickerViewModel$d */
    public static final class C54205d<T1, T2> implements AbstractC88429b {

        /* renamed from: a */
        final /* synthetic */ FavoriteVideoPickerViewModel f124188a;

        static {
            Covode.recordClassIndex(63892);
        }

        C54205d(FavoriteVideoPickerViewModel favoriteVideoPickerViewModel) {
            this.f124188a = favoriteVideoPickerViewModel;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.lang.Object */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p4560f.p4561a.p4567d.AbstractC88429b
        /* renamed from: a */
        public final /* synthetic */ void mo10350a(Object obj, Object obj2) {
            String str;
            FeedItemList feedItemList = (FeedItemList) obj;
            if (feedItemList != null) {
                ArrayList arrayList = new ArrayList();
                List<Aweme> items = feedItemList.getItems();
                if (items != null) {
                    arrayList.addAll(items);
                }
                this.f124188a.f124176c.setValue(arrayList);
                Iterator it = arrayList.iterator();
                while (true) {
                    str = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    String aid = ((Aweme) next).getAid();
                    Aweme value = this.f124188a.f124178e.getValue();
                    if (value != null) {
                        str = value.getAid();
                    }
                    if (C89219l.m154714a((Object) aid, (Object) str)) {
                        str = next;
                        break;
                    }
                }
                this.f124188a.f124178e.setValue(str);
            }
        }
    }

    private FavoriteVideoPickerViewModel(FavoriteAwemeService favoriteAwemeService, AbstractC88398aa aaVar, AbstractC88398aa aaVar2, User user) {
        C89219l.m154721d(favoriteAwemeService, "");
        C89219l.m154721d(aaVar, "");
        C89219l.m154721d(aaVar2, "");
        this.f124182j = favoriteAwemeService;
        this.f124183k = aaVar;
        this.f124184l = aaVar2;
        this.f124185m = user;
        this.f124175b = new C1213t<>();
        C1213t<List<Aweme>> tVar = new C1213t<>();
        tVar.setValue(C89086z.INSTANCE);
        this.f124176c = tVar;
        this.f124177d = new C1213t<>();
        this.f124178e = new C1213t<>();
        this.f124179f = new C1213t<>();
        this.f124180g = new C1213t<>();
        this.f124181i = new C88411a();
    }
}
