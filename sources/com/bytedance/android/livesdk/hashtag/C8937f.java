package com.bytedance.android.livesdk.hashtag;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.HashtagResponse;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.widget.StateLayout;
import com.bytedance.android.live.design.p230a.C4054a;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.livesdk.AbstractC11293v;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdk.util.rxutils.C11195i;
import com.bytedance.android.livesdk.util.rxutils.p651b.EnumC11186b;
import com.bytedance.android.livesdk.utils.C11221ak;
import com.bytedance.android.livesdkapi.depend.model.live.EnumC11728i;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.hashtag.f */
public final class C8937f extends AbstractC11293v {

    /* renamed from: e */
    public static final C8938a f22014e = new C8938a((byte) 0);

    /* renamed from: a */
    public Hashtag f22015a;

    /* renamed from: b */
    public List<GameTag> f22016b;

    /* renamed from: c */
    EnumC11728i f22017c;

    /* renamed from: d */
    AbstractC89172b<? super Hashtag, C89391z> f22018d = new C8941d(this);

    /* renamed from: f */
    private final C11221ak.EnumC11222a f22019f = C11221ak.EnumC11222a.PANEL_HASHTAG_ANCHOR;

    /* renamed from: g */
    private HashMap f22020g;

    static {
        Covode.recordClassIndex(9829);
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a */
    public final void mo8165a() {
        HashMap hashMap = this.f22020g;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a_ */
    public final View mo8166a_(int i) {
        if (this.f22020g == null) {
            this.f22020g = new HashMap();
        }
        View view = (View) this.f22020g.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f22020g.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo8165a();
    }

    /* renamed from: com.bytedance.android.livesdk.hashtag.f$a */
    public static final class C8938a {
        static {
            Covode.recordClassIndex(9830);
        }

        private C8938a() {
        }

        public /* synthetic */ C8938a(byte b) {
            this();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x002d, code lost:
            if (r0 != 2) goto L_0x0016;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static void m17286a(androidx.fragment.app.AbstractC0952i r6, java.lang.String r7, com.bytedance.android.livesdkapi.depend.model.live.EnumC11728i r8) {
            /*
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154721d(r6, r0)
                p4600h.p4611f.p4613b.C89219l.m154721d(r7, r0)
                com.bytedance.android.livesdk.hashtag.f r5 = new com.bytedance.android.livesdk.hashtag.f
                r5.<init>()
                android.os.Bundle r4 = new android.os.Bundle
                r4.<init>()
                r3 = 2
                r2 = 1
                if (r8 != 0) goto L_0x0023
            L_0x0016:
                r3 = 3
            L_0x0017:
                java.lang.String r0 = "key_live_mode"
                r4.putInt(r0, r3)
                r5.setArguments(r4)
                r5.show(r6, r7)
                return
            L_0x0023:
                int[] r1 = com.bytedance.android.livesdk.hashtag.C8945g.f22027a
                int r0 = r8.ordinal()
                r0 = r1[r0]
                if (r0 == r2) goto L_0x0030
                if (r0 == r3) goto L_0x0017
                goto L_0x0016
            L_0x0030:
                r3 = 1
                goto L_0x0017
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.hashtag.C8937f.C8938a.m17286a(androidx.fragment.app.i, java.lang.String, com.bytedance.android.livesdkapi.depend.model.live.i):void");
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: c_ */
    public final C11221ak.EnumC11222a mo9928c_() {
        return this.f22019f;
    }

    /* renamed from: com.bytedance.android.livesdk.hashtag.f$f */
    static final class C8943f implements StateLayout.AbstractC4030a {

        /* renamed from: a */
        final /* synthetic */ C8937f f22025a;

        static {
            Covode.recordClassIndex(9835);
        }

        C8943f(C8937f fVar) {
            this.f22025a = fVar;
        }

        @Override // com.bytedance.android.live.core.widget.StateLayout.AbstractC4030a
        /* renamed from: a */
        public final void mo9424a() {
            this.f22025a.mo9929d();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.hashtag.f$g */
    static final class C8944g implements StateLayout.AbstractC4030a {

        /* renamed from: a */
        final /* synthetic */ C8937f f22026a;

        static {
            Covode.recordClassIndex(9836);
        }

        C8944g(C8937f fVar) {
            this.f22026a = fVar;
        }

        @Override // com.bytedance.android.live.core.widget.StateLayout.AbstractC4030a
        /* renamed from: a */
        public final void mo9424a() {
            this.f22026a.mo9929d();
        }
    }

    /* renamed from: e */
    private static boolean m17279e() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: f */
    private static boolean m17280f() {
        if (C58029j.f132253e && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132253e;
        }
        boolean e = m17279e();
        C58029j.f132253e = e;
        return e;
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: b */
    public final AbstractC11293v.C11295b mo8355b() {
        AbstractC11293v.C11295b bVar = new AbstractC11293v.C11295b(R.layout.b7n);
        bVar.f27020g = 80;
        bVar.f27023j = 73;
        return bVar;
    }

    /* renamed from: d */
    public final void mo9929d() {
        ((StateLayout) mo8166a_(R.id.bds)).mo9406a("LOADING");
        getContext();
        if (!m17280f()) {
            ((StateLayout) mo8166a_(R.id.bds)).mo9406a("OFFLINE");
        } else {
            ((HashtagApi) C5805e.m12718a().mo11572a(HashtagApi.class)).fetchHashtagList().mo143271a(new C11191f()).mo143271a(C11195i.m19838a(this, EnumC11186b.DESTROY)).mo143254a(new C8939b(this), new C8940c(this));
        }
    }

    /* renamed from: com.bytedance.android.livesdk.hashtag.f$e */
    static final class View$OnClickListenerC8942e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C8937f f22024a;

        static {
            Covode.recordClassIndex(9834);
        }

        View$OnClickListenerC8942e(C8937f fVar) {
            this.f22024a = fVar;
        }

        public final void onClick(View view) {
            this.f22024a.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.hashtag.f$c */
    public static final class C8940c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C8937f f22022a;

        static {
            Covode.recordClassIndex(9832);
        }

        C8940c(C8937f fVar) {
            this.f22022a = fVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            ((StateLayout) this.f22022a.mo8166a_(R.id.bds)).mo9406a("ERROR");
            C3854a.m9453a(6, "HashtagAnchorDialog", "failed to fetch topics!");
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater cloneInContext = super.onGetLayoutInflater(bundle).cloneInContext(C4054a.m9853a(getActivity()));
        C89219l.m154716b(cloneInContext, "");
        return cloneInContext;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Integer valueOf;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        EnumC11728i iVar = null;
        if (!(arguments == null || (valueOf = Integer.valueOf(arguments.getInt("key_live_mode"))) == null)) {
            if (valueOf.intValue() == 2) {
                iVar = EnumC11728i.SCREEN_RECORD;
            } else if (valueOf.intValue() == 1) {
                iVar = EnumC11728i.THIRD_PARTY;
            }
        }
        this.f22017c = iVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.hashtag.f$b */
    public static final class C8939b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C8937f f22021a;

        static {
            Covode.recordClassIndex(9831);
        }

        C8939b(C8937f fVar) {
            this.f22021a = fVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Hashtag hashtag;
            List<GameTag> list;
            List list2;
            List<Hashtag> list3;
            C5832d dVar = (C5832d) obj;
            C8937f fVar = this.f22021a;
            HashtagResponse hashtagResponse = (HashtagResponse) dVar.data;
            C8935e eVar = null;
            if (hashtagResponse != null) {
                hashtag = hashtagResponse.gameHashTag;
            } else {
                hashtag = null;
            }
            fVar.f22015a = hashtag;
            C8937f fVar2 = this.f22021a;
            HashtagResponse hashtagResponse2 = (HashtagResponse) dVar.data;
            if (hashtagResponse2 != null) {
                list = hashtagResponse2.gameTagList;
            } else {
                list = null;
            }
            fVar2.f22016b = list;
            C8937f fVar3 = this.f22021a;
            HashtagResponse hashtagResponse3 = (HashtagResponse) dVar.data;
            if (hashtagResponse3 == null || (list3 = hashtagResponse3.hashtags) == null) {
                list2 = null;
            } else {
                list2 = C89070n.m154580f((Iterable) list3);
            }
            ((StateLayout) fVar3.mo8166a_(R.id.bds)).mo9406a("CONTENT");
            boolean a = C89219l.m154714a((Object) fVar3.getTag(), (Object) "Preview");
            RecyclerView recyclerView = (RecyclerView) fVar3.mo8166a_(R.id.emf);
            recyclerView.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager());
            if (list2 != null) {
                Context context = recyclerView.getContext();
                C89219l.m154716b(context, "");
                eVar = new C8935e(context, list2, fVar3.f27010p, a, fVar3.f22018d);
            }
            recyclerView.setAdapter(eVar);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.hashtag.f$d */
    static final class C8941d extends AbstractC89220m implements AbstractC89172b<Hashtag, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C8937f f22023a;

        static {
            Covode.recordClassIndex(9833);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8941d(C8937f fVar) {
            super(1);
            this.f22023a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0066  */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ p4600h.C89391z invoke(com.bytedance.android.livesdk.model.Hashtag r7) {
            /*
            // Method dump skipped, instructions count: 123
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.hashtag.C8937f.C8941d.invoke(java.lang.Object):java.lang.Object");
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        ((ImageView) mo8166a_(R.id.a72)).setOnClickListener(new View$OnClickListenerC8942e(this));
        mo9929d();
        ((StateLayout) mo8166a_(R.id.bds)).setErrorClickListener(new C8943f(this));
        ((StateLayout) mo8166a_(R.id.bds)).setOfflineClickListener(new C8944g(this));
    }
}
