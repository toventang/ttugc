package com.p2082ss.android.ugc.aweme.comment.gift.model;

import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1213t;
import com.bytedance.android.livesdkapi.depend.p680d.p682b.AbstractC11636c;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.comment.gift.api.GiftListApi;
import com.p2082ss.android.ugc.aweme.comment.util.C37216s;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.live.ILiveOuterService;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.ugc.live.p4460a.p4461a.AbstractC87026d;
import com.p2082ss.ugc.live.p4460a.p4461a.C87020c;
import java.util.HashMap;
import java.util.List;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.comment.gift.model.GiftViewModel */
public final class GiftViewModel extends AbstractC1174ac {

    /* renamed from: a */
    public String f86226a = "";

    /* renamed from: b */
    public String f86227b = "";

    /* renamed from: c */
    public String f86228c = "";

    /* renamed from: d */
    public String f86229d = "";

    /* renamed from: e */
    public String f86230e = "";

    /* renamed from: f */
    public Long f86231f;

    /* renamed from: g */
    public final C1213t<Integer> f86232g = new C1213t<>();

    /* renamed from: h */
    public Aweme f86233h;

    /* renamed from: i */
    private final AbstractC89244h f86234i = C89250i.m154773a((AbstractC89171a) C36479g.f86245a);

    /* renamed from: j */
    private final AbstractC89244h f86235j = C89250i.m154773a((AbstractC89171a) C36474b.f86239a);

    /* renamed from: k */
    private final AbstractC89244h f86236k = C89250i.m154773a((AbstractC89171a) C36478f.f86244a);

    /* renamed from: l */
    private final AbstractC89244h f86237l = C89250i.m154773a((AbstractC89171a) C36473a.f86238a);

    static {
        Covode.recordClassIndex(43775);
    }

    /* renamed from: a */
    public final C1213t<GiftResponse> mo63835a() {
        return (C1213t) this.f86234i.getValue();
    }

    /* renamed from: b */
    public final C1213t<GiftStruct> mo63841b() {
        return (C1213t) this.f86235j.getValue();
    }

    /* renamed from: c */
    public final C1213t<HashMap<Long, String>> mo63842c() {
        return (C1213t) this.f86236k.getValue();
    }

    /* renamed from: d */
    public final C1213t<Long> mo63843d() {
        return (C1213t) this.f86237l.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.gift.model.GiftViewModel$b */
    static final class C36474b extends AbstractC89220m implements AbstractC89171a<C1213t<GiftStruct>> {

        /* renamed from: a */
        public static final C36474b f86239a = new C36474b();

        static {
            Covode.recordClassIndex(43777);
        }

        C36474b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<GiftStruct> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.gift.model.GiftViewModel$g */
    static final class C36479g extends AbstractC89220m implements AbstractC89171a<C1213t<GiftResponse>> {

        /* renamed from: a */
        public static final C36479g f86245a = new C36479g();

        static {
            Covode.recordClassIndex(43782);
        }

        C36479g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<GiftResponse> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.gift.model.GiftViewModel$a */
    static final class C36473a extends AbstractC89220m implements AbstractC89171a<C1213t<Long>> {

        /* renamed from: a */
        public static final C36473a f86238a = new C36473a();

        static {
            Covode.recordClassIndex(43776);
        }

        C36473a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<Long> invoke() {
            C1213t tVar = new C1213t();
            tVar.setValue(-1L);
            return tVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.gift.model.GiftViewModel$f */
    static final class C36478f extends AbstractC89220m implements AbstractC89171a<C1213t<HashMap<Long, String>>> {

        /* renamed from: a */
        public static final C36478f f86244a = new C36478f();

        static {
            Covode.recordClassIndex(43781);
        }

        C36478f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<HashMap<Long, String>> invoke() {
            C1213t tVar = new C1213t();
            tVar.setValue(new HashMap());
            return tVar;
        }
    }

    /* renamed from: e */
    public final void mo63844e() {
        String str;
        mo63835a().getValue();
        Aweme aweme = this.f86233h;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        new C88411a().mo142945a(GiftListApi.C36433a.m74205a(str, this.f86228c).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C36476d(this), new C36477e(this)));
    }

    /* renamed from: a */
    private static boolean m74251a(UrlModel urlModel) {
        List<String> urlList;
        if (urlModel != null && !TextUtils.isEmpty(urlModel.getFileHash()) && (urlList = urlModel.getUrlList()) != null && !urlList.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.gift.model.GiftViewModel$e */
    static final class C36477e<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ GiftViewModel f86243a;

        static {
            Covode.recordClassIndex(43780);
        }

        C36477e(GiftViewModel giftViewModel) {
            this.f86243a = giftViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            String str = "";
            C89219l.m154721d(th, str);
            this.f86243a.mo63835a().setValue(null);
            th.getMessage();
            GiftViewModel giftViewModel = this.f86243a;
            String message = th.getMessage();
            if (message != null) {
                str = message;
            }
            giftViewModel.mo63838a((Integer) 0, str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.gift.model.GiftViewModel$h */
    public static final class C36480h implements AbstractC11636c {

        /* renamed from: a */
        final /* synthetic */ GiftViewModel f86246a;

        /* renamed from: b */
        final /* synthetic */ String f86247b;

        /* renamed from: c */
        final /* synthetic */ int f86248c;

        /* renamed from: d */
        final /* synthetic */ long f86249d;

        /* renamed from: e */
        final /* synthetic */ Long f86250e;

        /* renamed from: f */
        final /* synthetic */ Context f86251f;

        static {
            Covode.recordClassIndex(43783);
        }

        @Override // com.bytedance.android.livesdkapi.depend.p680d.p682b.AbstractC11636c
        /* renamed from: a */
        public final void mo12313a(long j) {
            this.f86246a.mo63843d().setValue(Long.valueOf(j));
            if (C89219l.m154714a((Object) this.f86247b, (Object) "from_recharge")) {
                this.f86246a.mo63837a(Integer.valueOf(this.f86248c), Long.valueOf(this.f86249d), this.f86250e);
            }
        }

        @Override // com.bytedance.android.livesdkapi.depend.p680d.p682b.AbstractC11636c
        /* renamed from: a */
        public final void mo12314a(Throwable th) {
            C89219l.m154721d(th, "");
            this.f86246a.mo63843d().setValue(-1L);
            C33744d dVar = new C33744d();
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            C33744d a = dVar.mo59983a("failure_reason", message).mo59983a("enter_from", this.f86246a.f86226a);
            C89219l.m154716b(a, "");
            C39162r.m79460a("refresh_coin_balance_fail", a.f79943a);
            if (C89219l.m154714a((Object) this.f86247b, (Object) "from_recharge")) {
                this.f86246a.mo63837a(Integer.valueOf(this.f86248c), Long.valueOf(this.f86249d), this.f86250e);
            }
            if (this.f86251f != null) {
                new C79459a(this.f86251f).mo123050a(R.string.h8u).mo123053a();
            }
        }

        C36480h(GiftViewModel giftViewModel, String str, int i, long j, Long l, Context context) {
            this.f86246a = giftViewModel;
            this.f86247b = str;
            this.f86248c = i;
            this.f86249d = j;
            this.f86250e = l;
            this.f86251f = context;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.gift.model.GiftViewModel$c */
    public static final class C36475c implements AbstractC87026d {

        /* renamed from: a */
        final /* synthetic */ GiftViewModel f86240a;

        /* renamed from: b */
        final /* synthetic */ long f86241b;

        static {
            Covode.recordClassIndex(43778);
        }

        @Override // com.p2082ss.ugc.live.p4460a.p4461a.AbstractC87026d
        /* renamed from: a */
        public final void mo16289a() {
        }

        @Override // com.p2082ss.ugc.live.p4460a.p4461a.AbstractC87026d
        /* renamed from: a */
        public final void mo16291a(Throwable th) {
            C89219l.m154721d(th, "");
        }

        @Override // com.p2082ss.ugc.live.p4460a.p4461a.AbstractC87026d
        /* renamed from: a */
        public final void mo16290a(String str) {
            C89219l.m154721d(str, "");
            HashMap<Long, String> value = this.f86240a.mo63842c().getValue();
            if (value == null) {
                value = new HashMap<>();
            } else if (value.containsKey(Long.valueOf(this.f86241b)) && C89361p.m154872a(value.get(Long.valueOf(this.f86241b)), str, false)) {
                return;
            }
            value.put(Long.valueOf(this.f86241b), str);
            this.f86240a.mo63842c().postValue(value);
        }

        C36475c(GiftViewModel giftViewModel, long j) {
            this.f86240a = giftViewModel;
            this.f86241b = j;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.gift.model.GiftViewModel$d */
    static final class C36476d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ GiftViewModel f86242a;

        static {
            Covode.recordClassIndex(43779);
        }

        C36476d(GiftViewModel giftViewModel) {
            this.f86242a = giftViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            GiftResult giftPageList;
            List<GiftPage> giftPageList2;
            int i = 0;
            if (obj != null) {
                this.f86242a.mo63835a().setValue(obj);
                GiftViewModel giftViewModel = this.f86242a;
                if (giftViewModel.f86231f == null) {
                    giftViewModel.f86232g.setValue(0);
                } else {
                    GiftResponse value = giftViewModel.mo63835a().getValue();
                    if (!(value == null || (giftPageList = value.getGiftPageList()) == null || (giftPageList2 = giftPageList.getGiftPageList()) == null)) {
                        int i2 = 0;
                        for (T t : giftPageList2) {
                            int i3 = i2 + 1;
                            if (i2 < 0) {
                                C89070n.m154520a();
                            }
                            List<GiftStruct> giftList = t.getGiftList();
                            if (giftList != null) {
                                for (T t2 : giftList) {
                                    long id = t2.getId();
                                    Long l = giftViewModel.f86231f;
                                    if (l != null && id == l.longValue()) {
                                        giftViewModel.f86231f = null;
                                        giftViewModel.f86232g.setValue(Integer.valueOf(i2));
                                        giftViewModel.mo63841b().setValue(t2);
                                        giftViewModel.mo63836a(t2.getId(), t2.getEffectAsset());
                                    }
                                }
                            }
                            i2 = i3;
                        }
                    }
                }
                i = 1;
            } else {
                this.f86242a.mo63835a().setValue(null);
            }
            this.f86242a.mo63838a(Integer.valueOf(i), "");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        if (r5 != null) goto L_0x0020;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.p2082ss.ugc.live.p4460a.p4461a.C87020c m74252b(long r3, com.p2082ss.android.ugc.aweme.base.model.UrlModel r5) {
        /*
            boolean r1 = m74251a(r5)
            r0 = 0
            if (r1 != 0) goto L_0x0008
            return r0
        L_0x0008:
            com.ss.ugc.live.a.a.c r2 = new com.ss.ugc.live.a.a.c
            if (r5 == 0) goto L_0x0028
            java.util.List r1 = r5.getUrlList()
            if (r1 == 0) goto L_0x0028
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r1 = r1.toArray(r0)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<T>"
            java.util.Objects.requireNonNull(r1, r0)
            java.lang.String[] r1 = (java.lang.String[]) r1
        L_0x0020:
            java.lang.String r0 = r5.getFileHash()
        L_0x0024:
            r2.<init>(r3, r1, r0)
            return r2
        L_0x0028:
            r1 = r0
            if (r5 == 0) goto L_0x0024
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.comment.gift.model.GiftViewModel.m74252b(long, com.ss.android.ugc.aweme.base.model.UrlModel):com.ss.ugc.live.a.a.c");
    }

    /* renamed from: a */
    public final void mo63836a(long j, UrlModel urlModel) {
        C87020c b;
        if (urlModel != null && (b = m74252b(j, urlModel)) != null) {
            C36481a.f86258g.mo63849a(b, (AbstractC87026d) new C36475c(this, j));
        }
    }

    /* renamed from: a */
    public final void mo63838a(Integer num, String str) {
        String str2 = this.f86230e;
        if (str2 != null && str2.length() != 0) {
            C33744d a = new C33744d().mo59983a("enter_from", this.f86226a).mo59983a("group_id", this.f86227b).mo59983a("author_id", this.f86228c).mo59980a("is_follow", C37216s.m75210b(this.f86233h)).mo59980a("is_like", C37216s.m75210b(this.f86233h)).mo59983a("enter_method", this.f86230e).mo59982a("is_success", num).mo59983a("error_code", str);
            C89219l.m154716b(a, "");
            this.f86230e = "";
            C39162r.m79460a("show_gift_panel_result", a.f79943a);
        }
    }

    /* renamed from: a */
    public final void mo63837a(Integer num, Long l, Long l2) {
        C33744d a = new C33744d().mo59983a("enter_from", this.f86226a).mo59983a("group_id", this.f86227b).mo59983a("author_id", this.f86228c).mo59982a("product_id", l).mo59982a("is_success", num).mo59982a("previous_balance", l2).mo59982a("new_balance", mo63843d().getValue());
        C89219l.m154716b(a, "");
        C39162r.m79460a("confirm_coin_recharge", a.f79943a);
    }

    /* renamed from: a */
    public final void mo63839a(String str, Context context, int i, long j) {
        C89219l.m154721d(str, "");
        mo63843d().setValue(-1L);
        ILiveOuterService s = LiveOuterService.m107269s();
        C89219l.m154716b(s, "");
        s.mo95830d().mo12996a(new C36480h(this, str, i, j, mo63843d().getValue(), context));
    }

    /* renamed from: a */
    public final void mo63840a(String str, String str2, String str3, String str4) {
        this.f86226a = str;
        this.f86227b = str2;
        this.f86228c = str3;
        this.f86229d = str4;
    }
}
