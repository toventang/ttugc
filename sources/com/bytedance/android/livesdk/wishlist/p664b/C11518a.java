package com.bytedance.android.livesdk.wishlist.p664b;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.AbstractC11293v;
import com.bytedance.android.livesdk.C8312d;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.widget.LiveLoadingView;
import com.bytedance.android.livesdk.wishlist.C11512a;
import com.bytedance.android.livesdk.wishlist.C11517b;
import com.bytedance.android.livesdk.wishlist.C11539c;
import com.bytedance.android.livesdk.wishlist.p663a.C11513a;
import com.bytedance.android.livesdk.wishlist.p665c.C11541b;
import com.bytedance.android.livesdk.wishlist.view.WishContributorView;
import com.bytedance.android.livesdk.wishlist.view.WishGiftView;
import com.bytedance.android.livesdk.wishlist.view.WishListServerErrorView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.wishlist.b.a */
public final class C11518a extends AbstractC11293v implements C11513a.AbstractC11516c {

    /* renamed from: i */
    public static final C11520b f27591i = new C11520b((byte) 0);

    /* renamed from: A */
    private HashMap f27592A;

    /* renamed from: a */
    public Room f27593a;

    /* renamed from: b */
    public User f27594b;

    /* renamed from: c */
    public User f27595c;

    /* renamed from: d */
    public boolean f27596d;

    /* renamed from: e */
    public final AbstractC89244h f27597e;

    /* renamed from: f */
    public final AbstractC89244h f27598f;

    /* renamed from: g */
    public final AbstractC89244h f27599g;

    /* renamed from: h */
    public final AbstractC89244h f27600h;

    /* renamed from: j */
    private final AbstractC89244h f27601j;

    /* renamed from: k */
    private final AbstractC89244h f27602k;

    /* renamed from: l */
    private final AbstractC89244h f27603l;

    /* renamed from: m */
    private final AbstractC89244h f27604m;

    /* renamed from: n */
    private final AbstractC89244h f27605n;

    /* renamed from: t */
    private final AbstractC89244h f27606t;

    /* renamed from: u */
    private final AbstractC89244h f27607u;

    /* renamed from: v */
    private final AbstractC89244h f27608v;

    /* renamed from: w */
    private final AbstractC89244h f27609w;

    /* renamed from: x */
    private final AbstractC89244h f27610x;

    /* renamed from: y */
    private final AbstractC89244h f27611y;

    /* renamed from: z */
    private final AbstractC89244h f27612z;

    /* renamed from: com.bytedance.android.livesdk.wishlist.b.a$a */
    public static final class C11519a {

        /* renamed from: a */
        public Room f27613a;

        /* renamed from: b */
        public User f27614b;

        /* renamed from: c */
        public User f27615c;

        static {
            Covode.recordClassIndex(13178);
        }
    }

    static {
        Covode.recordClassIndex(13177);
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a */
    public final void mo8165a() {
        HashMap hashMap = this.f27592A;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a_ */
    public final View mo8166a_(int i) {
        if (this.f27592A == null) {
            this.f27592A = new HashMap();
        }
        View view = (View) this.f27592A.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f27592A.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: d */
    public final View mo9929d() {
        return (View) this.f27601j.getValue();
    }

    /* renamed from: e */
    public final WishListServerErrorView mo18335e() {
        return (WishListServerErrorView) this.f27602k.getValue();
    }

    /* renamed from: f */
    public final LiveLoadingView mo18336f() {
        return (LiveLoadingView) this.f27603l.getValue();
    }

    /* renamed from: g */
    public final LiveTextView mo18337g() {
        return (LiveTextView) this.f27604m.getValue();
    }

    /* renamed from: h */
    public final WishGiftView mo18338h() {
        return (WishGiftView) this.f27605n.getValue();
    }

    /* renamed from: j */
    public final WishGiftView mo18339j() {
        return (WishGiftView) this.f27606t.getValue();
    }

    /* renamed from: k */
    public final WishGiftView mo18340k() {
        return (WishGiftView) this.f27607u.getValue();
    }

    /* renamed from: l */
    public final WishContributorView mo18341l() {
        return (WishContributorView) this.f27608v.getValue();
    }

    /* renamed from: m */
    public final WishContributorView mo18342m() {
        return (WishContributorView) this.f27609w.getValue();
    }

    /* renamed from: o */
    public final ImageView mo18343o() {
        return (ImageView) this.f27610x.getValue();
    }

    /* renamed from: p */
    public final ImageView mo18344p() {
        return (ImageView) this.f27611y.getValue();
    }

    /* renamed from: q */
    public final LiveTextView mo18345q() {
        return (LiveTextView) this.f27612z.getValue();
    }

    /* renamed from: com.bytedance.android.livesdk.wishlist.b.a$b */
    public static final class C11520b {
        static {
            Covode.recordClassIndex(13179);
        }

        private C11520b() {
        }

        public /* synthetic */ C11520b(byte b) {
            this();
        }
    }

    @Override // com.bytedance.android.livesdk.wishlist.p663a.C11513a.AbstractC11516c
    /* renamed from: c */
    public final void mo18333c() {
        this.f27596d = false;
        m20354r();
        DataChannel dataChannel = this.f27010p;
        if (dataChannel != null) {
            dataChannel.mo28319c(C11512a.class);
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        DataChannel dataChannel = this.f27010p;
        if (dataChannel != null) {
            dataChannel.mo28316b(this);
        }
        mo8165a();
    }

    /* renamed from: com.bytedance.android.livesdk.wishlist.b.a$c */
    static final class C11521c extends AbstractC89220m implements AbstractC89171a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ C11518a f27616a;

        static {
            Covode.recordClassIndex(13180);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11521c(C11518a aVar) {
            super(0);
            this.f27616a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ImageView invoke() {
            View view = this.f27616a.getView();
            if (view != null) {
                return view.findViewById(R.id.bsf);
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.wishlist.b.a$d */
    static final class C11522d extends AbstractC89220m implements AbstractC89171a<LiveTextView> {

        /* renamed from: a */
        final /* synthetic */ C11518a f27617a;

        static {
            Covode.recordClassIndex(13181);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11522d(C11518a aVar) {
            super(0);
            this.f27617a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LiveTextView invoke() {
            View view = this.f27617a.getView();
            if (view != null) {
                return view.findViewById(R.id.es8);
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.wishlist.b.a$e */
    static final class C11523e extends AbstractC89220m implements AbstractC89171a<LiveTextView> {

        /* renamed from: a */
        final /* synthetic */ C11518a f27618a;

        static {
            Covode.recordClassIndex(13182);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11523e(C11518a aVar) {
            super(0);
            this.f27618a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LiveTextView invoke() {
            View view = this.f27618a.getView();
            if (view != null) {
                return view.findViewById(R.id.es9);
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.wishlist.b.a$f */
    static final class C11524f extends AbstractC89220m implements AbstractC89171a<LiveTextView> {

        /* renamed from: a */
        final /* synthetic */ C11518a f27619a;

        static {
            Covode.recordClassIndex(13183);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11524f(C11518a aVar) {
            super(0);
            this.f27619a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LiveTextView invoke() {
            View view = this.f27619a.getView();
            if (view != null) {
                return view.findViewById(R.id.esa);
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.wishlist.b.a$g */
    static final class C11525g extends AbstractC89220m implements AbstractC89171a<View> {

        /* renamed from: a */
        final /* synthetic */ C11518a f27620a;

        static {
            Covode.recordClassIndex(13184);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11525g(C11518a aVar) {
            super(0);
            this.f27620a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View invoke() {
            View view = this.f27620a.getView();
            if (view != null) {
                return view.findViewById(R.id.ahj);
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.wishlist.b.a$h */
    static final class C11526h extends AbstractC89220m implements AbstractC89171a<LiveLoadingView> {

        /* renamed from: a */
        final /* synthetic */ C11518a f27621a;

        static {
            Covode.recordClassIndex(13185);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11526h(C11518a aVar) {
            super(0);
            this.f27621a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LiveLoadingView invoke() {
            View view = this.f27621a.getView();
            if (view != null) {
                return view.findViewById(R.id.fjd);
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.wishlist.b.a$i */
    static final class C11527i extends AbstractC89220m implements AbstractC89171a<WishListServerErrorView> {

        /* renamed from: a */
        final /* synthetic */ C11518a f27622a;

        static {
            Covode.recordClassIndex(13186);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11527i(C11518a aVar) {
            super(0);
            this.f27622a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ WishListServerErrorView invoke() {
            View view = this.f27622a.getView();
            if (view != null) {
                return view.findViewById(R.id.fjg);
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.wishlist.b.a$j */
    static final class C11528j extends AbstractC89220m implements AbstractC89171a<WishGiftView> {

        /* renamed from: a */
        final /* synthetic */ C11518a f27623a;

        static {
            Covode.recordClassIndex(13187);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11528j(C11518a aVar) {
            super(0);
            this.f27623a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ WishGiftView invoke() {
            View view = this.f27623a.getView();
            if (view != null) {
                return view.findViewById(R.id.fj_);
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.wishlist.b.a$k */
    static final class C11529k extends AbstractC89220m implements AbstractC89171a<WishGiftView> {

        /* renamed from: a */
        final /* synthetic */ C11518a f27624a;

        static {
            Covode.recordClassIndex(13188);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11529k(C11518a aVar) {
            super(0);
            this.f27624a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ WishGiftView invoke() {
            View view = this.f27624a.getView();
            if (view != null) {
                return view.findViewById(R.id.fja);
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.wishlist.b.a$l */
    static final class C11530l extends AbstractC89220m implements AbstractC89171a<WishGiftView> {

        /* renamed from: a */
        final /* synthetic */ C11518a f27625a;

        static {
            Covode.recordClassIndex(13189);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11530l(C11518a aVar) {
            super(0);
            this.f27625a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ WishGiftView invoke() {
            View view = this.f27625a.getView();
            if (view != null) {
                return view.findViewById(R.id.fjb);
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.wishlist.b.a$m */
    static final class C11531m extends AbstractC89220m implements AbstractC89171a<WishContributorView> {

        /* renamed from: a */
        final /* synthetic */ C11518a f27626a;

        static {
            Covode.recordClassIndex(13190);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11531m(C11518a aVar) {
            super(0);
            this.f27626a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ WishContributorView invoke() {
            View view = this.f27626a.getView();
            if (view != null) {
                return view.findViewById(R.id.fj7);
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.wishlist.b.a$n */
    static final class C11532n extends AbstractC89220m implements AbstractC89171a<WishContributorView> {

        /* renamed from: a */
        final /* synthetic */ C11518a f27627a;

        static {
            Covode.recordClassIndex(13191);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11532n(C11518a aVar) {
            super(0);
            this.f27627a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ WishContributorView invoke() {
            View view = this.f27627a.getView();
            if (view != null) {
                return view.findViewById(R.id.fj8);
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.wishlist.b.a$o */
    static final class C11533o extends AbstractC89220m implements AbstractC89171a<WishContributorView> {

        /* renamed from: a */
        final /* synthetic */ C11518a f27628a;

        static {
            Covode.recordClassIndex(13192);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11533o(C11518a aVar) {
            super(0);
            this.f27628a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ WishContributorView invoke() {
            View view = this.f27628a.getView();
            if (view != null) {
                return view.findViewById(R.id.fj9);
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.wishlist.b.a$p */
    static final class C11534p extends AbstractC89220m implements AbstractC89171a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ C11518a f27629a;

        static {
            Covode.recordClassIndex(13193);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11534p(C11518a aVar) {
            super(0);
            this.f27629a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ImageView invoke() {
            View view = this.f27629a.getView();
            if (view != null) {
                return view.findViewById(R.id.bkv);
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.wishlist.b.a$q */
    static final class C11535q extends AbstractC89220m implements AbstractC89171a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ C11518a f27630a;

        static {
            Covode.recordClassIndex(13194);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11535q(C11518a aVar) {
            super(0);
            this.f27630a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ImageView invoke() {
            View view = this.f27630a.getView();
            if (view != null) {
                return view.findViewById(R.id.fj6);
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.wishlist.b.a$r */
    static final class C11536r extends AbstractC89220m implements AbstractC89171a<LiveTextView> {

        /* renamed from: a */
        final /* synthetic */ C11518a f27631a;

        static {
            Covode.recordClassIndex(13195);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11536r(C11518a aVar) {
            super(0);
            this.f27631a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LiveTextView invoke() {
            View view = this.f27631a.getView();
            if (view != null) {
                return view.findViewById(R.id.f7_);
            }
            return null;
        }
    }

    /* renamed from: r */
    private final void m20354r() {
        View d = mo9929d();
        if (d != null) {
            d.setVisibility(8);
        }
        WishListServerErrorView e = mo18335e();
        if (e != null) {
            e.setVisibility(8);
        }
        LiveLoadingView f = mo18336f();
        if (f != null) {
            f.setVisibility(0);
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: b */
    public final AbstractC11293v.C11295b mo8355b() {
        AbstractC11293v.C11295b bVar = new AbstractC11293v.C11295b(R.layout.b7p);
        bVar.f27020g = 80;
        bVar.f27019f = 0.0f;
        bVar.f27021h = -1;
        bVar.f27022i = C3966y.m9653a(450.0f);
        return bVar;
    }

    private C11518a() {
        this.f27601j = C89250i.m154773a((AbstractC89171a) new C11525g(this));
        this.f27602k = C89250i.m154773a((AbstractC89171a) new C11527i(this));
        this.f27603l = C89250i.m154773a((AbstractC89171a) new C11526h(this));
        this.f27597e = C89250i.m154773a((AbstractC89171a) new C11521c(this));
        this.f27604m = C89250i.m154773a((AbstractC89171a) new C11523e(this));
        this.f27598f = C89250i.m154773a((AbstractC89171a) new C11522d(this));
        this.f27599g = C89250i.m154773a((AbstractC89171a) new C11524f(this));
        this.f27605n = C89250i.m154773a((AbstractC89171a) new C11528j(this));
        this.f27606t = C89250i.m154773a((AbstractC89171a) new C11529k(this));
        this.f27607u = C89250i.m154773a((AbstractC89171a) new C11530l(this));
        this.f27600h = C89250i.m154773a((AbstractC89171a) new C11531m(this));
        this.f27608v = C89250i.m154773a((AbstractC89171a) new C11532n(this));
        this.f27609w = C89250i.m154773a((AbstractC89171a) new C11533o(this));
        this.f27610x = C89250i.m154773a((AbstractC89171a) new C11535q(this));
        this.f27611y = C89250i.m154773a((AbstractC89171a) new C11534p(this));
        this.f27612z = C89250i.m154773a((AbstractC89171a) new C11536r(this));
    }

    public /* synthetic */ C11518a(byte b) {
        this();
    }

    /* renamed from: com.bytedance.android.livesdk.wishlist.b.a$s */
    static final class C11537s extends AbstractC89220m implements AbstractC89172b<C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C11518a f27632a;

        static {
            Covode.recordClassIndex(13196);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11537s(C11518a aVar) {
            super(1);
            this.f27632a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C89391z zVar) {
            C89219l.m154721d(zVar, "");
            if (this.f27632a.f27596d) {
                C11518a aVar = this.f27632a;
                WishGiftView h = aVar.mo18338h();
                if (h != null) {
                    h.mo18358a();
                }
                WishGiftView j = aVar.mo18339j();
                if (j != null) {
                    j.mo18358a();
                }
                WishGiftView k = aVar.mo18340k();
                if (k != null) {
                    k.mo18358a();
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.wishlist.b.a$t */
    static final class C11538t extends AbstractC89220m implements AbstractC89172b<C11539c, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C11518a f27633a;

        static {
            Covode.recordClassIndex(13197);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11538t(C11518a aVar) {
            super(1);
            this.f27633a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C11539c cVar) {
            WishGiftView k;
            C11539c cVar2 = cVar;
            C89219l.m154721d(cVar2, "");
            if (this.f27633a.f27596d) {
                C11518a aVar = this.f27633a;
                long j = cVar2.f27634a;
                WishGiftView h = aVar.mo18338h();
                if (h == null || j != h.getWishGiftId()) {
                    WishGiftView j2 = aVar.mo18339j();
                    if (j2 == null || j != j2.getWishGiftId()) {
                        WishGiftView k2 = aVar.mo18340k();
                        if (!(k2 == null || j != k2.getWishGiftId() || (k = aVar.mo18340k()) == null)) {
                            k.mo18359a(cVar2.f27635b);
                        }
                    } else {
                        WishGiftView j3 = aVar.mo18339j();
                        if (j3 != null) {
                            j3.mo18359a(cVar2.f27635b);
                        }
                    }
                } else {
                    WishGiftView h2 = aVar.mo18338h();
                    if (h2 != null) {
                        h2.mo18359a(cVar2.f27635b);
                    }
                }
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        if (this.f27010p == null) {
            dismiss();
            return;
        }
        this.f27596d = false;
        DataChannel dataChannel = this.f27010p;
        if (dataChannel != null) {
            dataChannel.mo28312a((Object) this, C8312d.class, (AbstractC89172b) new C11537s(this));
            dataChannel.mo28312a((Object) this, C11517b.class, (AbstractC89172b) new C11538t(this));
        }
        WishListServerErrorView e = mo18335e();
        if (e != null) {
            C89219l.m154721d(this, "");
            e.getMRefreshLayout().setOnClickListener(new WishListServerErrorView.View$OnClickListenerC11572a(this));
        }
        m20354r();
        C6501b.C6502a.m13948a("livesdk_wishlist_show").mo12639a().mo12652a(C11541b.m20373a(false)).mo12655b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d3, code lost:
        if (r2 != null) goto L_0x0078;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18334a(com.bytedance.android.livesdk.wishlist.view.WishGiftView r7, com.bytedance.android.livesdk.gift.model.C8860x.C8861a r8) {
        /*
        // Method dump skipped, instructions count: 214
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.wishlist.p664b.C11518a.mo18334a(com.bytedance.android.livesdk.wishlist.view.WishGiftView, com.bytedance.android.livesdk.gift.model.x$a):void");
    }
}
