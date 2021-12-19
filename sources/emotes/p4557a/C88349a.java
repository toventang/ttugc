package emotes.p4557a;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.C4049d;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.user.SubscribeBadge;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p218f.C3951p;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.widget.HSAnimImageView;
import com.bytedance.android.live.p379n.C5793y;
import com.bytedance.android.live.p384o.AbstractC5834a;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.AbstractC11293v;
import com.bytedance.android.livesdk.chatroom.p499ui.SSGridLayoutManager;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11181z;
import com.bytedance.android.livesdk.util.rxutils.autodispose.C11152e;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.p686b.C11688a;
import com.bytedance.android.livesdkapi.depend.p678b.C11625a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.p2082ss.android.ugc.trill.R;
import emotes.p4558b.C88366a;
import emotes.p4559c.C88372c;
import emotes.p4559c.C88373d;
import emotes.p4559c.C88374e;
import emotes.p4559c.C88379h;
import emotes.p4559c.C88382k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4628j.p4629a.p4630a.C89397d;
import p4628j.p4629a.p4630a.C89399f;

/* renamed from: emotes.a.a */
public final class C88349a extends AbstractC11293v implements AbstractC88364d {

    /* renamed from: e */
    public static final C88350a f200553e = new C88350a((byte) 0);

    /* renamed from: a */
    public final C89399f f200554a = new C89399f();

    /* renamed from: b */
    public boolean f200555b;

    /* renamed from: c */
    public final ArrayList<EmoteModel> f200556c = new ArrayList<>();

    /* renamed from: d */
    public EmoteModel f200557d;

    /* renamed from: f */
    private final boolean f200558f = true;

    /* renamed from: g */
    private RecyclerView f200559g;

    /* renamed from: h */
    private ImageView f200560h;

    /* renamed from: i */
    private View f200561i;

    /* renamed from: j */
    private boolean f200562j = true;

    /* renamed from: k */
    private int f200563k = 5;

    /* renamed from: l */
    private boolean f200564l;

    /* renamed from: m */
    private boolean f200565m;

    /* renamed from: n */
    private SSGridLayoutManager f200566n;

    /* renamed from: t */
    private final C89397d f200567t = new C89397d();

    /* renamed from: u */
    private int f200568u = C3966y.m9653a(58.0f);

    /* renamed from: v */
    private HashMap f200569v;

    static {
        Covode.recordClassIndex(104388);
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a */
    public final void mo8165a() {
        HashMap hashMap = this.f200569v;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a_ */
    public final View mo8166a_(int i) {
        if (this.f200569v == null) {
            this.f200569v = new HashMap();
        }
        View view = (View) this.f200569v.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f200569v.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo8165a();
    }

    /* renamed from: emotes.a.a$a */
    public static final class C88350a {
        static {
            Covode.recordClassIndex(104389);
        }

        private C88350a() {
        }

        public /* synthetic */ C88350a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: b */
    public final AbstractC11293v.C11295b mo8355b() {
        int i;
        AbstractC11293v.C11295b bVar = new AbstractC11293v.C11295b(R.layout.b5h);
        bVar.f27015b = R.style.a2c;
        if (this.f200558f) {
            i = 80;
        } else {
            i = 8388613;
        }
        bVar.f27020g = i;
        bVar.f27022i = -1;
        bVar.f27019f = 0.0f;
        return bVar;
    }

    /* renamed from: d */
    public final void mo9929d() {
        if (!this.f200556c.isEmpty()) {
            this.f200567t.clear();
            C89397d dVar = this.f200567t;
            dVar.add(0, new C88379h(this.f200564l, this.f200555b));
            for (T t : this.f200556c) {
                t.f8731k = true;
                t.f8732l = false;
            }
            dVar.addAll(this.f200556c);
            if (!this.f200555b && !this.f200565m) {
                dVar.add(new C88374e(this.f200564l, this.f200555b));
            }
            this.f200554a.notifyDataSetChanged();
        }
    }

    /* renamed from: emotes.a.a$b */
    static final class C88351b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C88349a f200570a;

        static {
            Covode.recordClassIndex(104390);
        }

        C88351b(C88349a aVar) {
            this.f200570a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f200570a.onEvent((C11625a) obj);
        }
    }

    /* renamed from: emotes.a.a$e */
    public static final class C88354e extends GridLayoutManager.AbstractC1337c {

        /* renamed from: e */
        final /* synthetic */ C88349a f200573e;

        static {
            Covode.recordClassIndex(104393);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C88354e(C88349a aVar) {
            this.f200573e = aVar;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1337c
        /* renamed from: a */
        public final int mo4342a(int i) {
            if (this.f200573e.f200554a.getItemViewType(i) == 1) {
                return 1;
            }
            return 5;
        }
    }

    /* renamed from: emotes.a.a$f */
    static final class View$OnClickListenerC88355f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C88349a f200574a;

        static {
            Covode.recordClassIndex(104394);
        }

        View$OnClickListenerC88355f(C88349a aVar) {
            this.f200574a = aVar;
        }

        public final void onClick(View view) {
            this.f200574a.dismiss();
        }
    }

    /* renamed from: emotes.a.a$c */
    static final class C88352c extends AbstractC89220m implements AbstractC89172b<SubscribeBadge, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C88349a f200571a;

        static {
            Covode.recordClassIndex(104391);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C88352c(C88349a aVar) {
            super(1);
            this.f200571a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(SubscribeBadge subscribeBadge) {
            C89219l.m154721d(subscribeBadge, "");
            this.f200571a.f200555b = true;
            this.f200571a.mo9929d();
            return C89391z.f203057a;
        }
    }

    public final void onEvent(C11625a aVar) {
        C11688a aVar2;
        if (aVar != null && (aVar2 = aVar.f27775a) != null) {
            this.f200564l = aVar2.mo18452b();
            mo9929d();
        }
    }

    /* renamed from: emotes.a.a$d */
    static final class C88353d extends AbstractC89220m implements AbstractC89172b<List<EmoteModel>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C88349a f200572a;

        static {
            Covode.recordClassIndex(104392);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C88353d(C88349a aVar) {
            super(1);
            this.f200572a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(List<EmoteModel> list) {
            List<EmoteModel> list2 = list;
            C89219l.m154721d(list2, "");
            if (list2.size() > 0 && this.f200572a.f200556c.size() == 0) {
                this.f200572a.f200556c.addAll(list2);
                this.f200572a.mo9929d();
            }
            return C89391z.f203057a;
        }
    }

    @Override // emotes.p4557a.AbstractC88364d
    /* renamed from: a */
    public final void mo142861a(String str) {
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        if (getContext() != null && room != null) {
            AbstractC5834a aVar = (AbstractC5834a) C6193a.m13435a(AbstractC5834a.class);
            Context context = getContext();
            if (context == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(context, "");
            aVar.openUserSubscribeEntry(context, room, str);
            dismiss();
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        boolean z2;
        User owner;
        User owner2;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        this.f200563k = 5;
        View findViewById = view.findViewById(R.id.do9);
        C89219l.m154716b(findViewById, "");
        this.f200559g = (RecyclerView) findViewById;
        View findViewById2 = view.findViewById(R.id.byf);
        C89219l.m154716b(findViewById2, "");
        this.f200560h = (ImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.cy5);
        C89219l.m154716b(findViewById3, "");
        this.f200561i = findViewById3;
        ImageView imageView = this.f200560h;
        if (imageView == null) {
            C89219l.m154710a("mIvPlanet");
        }
        boolean z3 = false;
        imageView.setVisibility(0);
        this.f200568u = (C3966y.m9664c() - C3966y.m9653a(18.0f)) / this.f200563k;
        C89399f fVar = this.f200554a;
        if (this.f200557d != null) {
            EmoteModel emoteModel = this.f200557d;
            if (emoteModel == null) {
                C89219l.m154715b();
            }
            fVar.mo143771a(C88379h.class, new C88373d(emoteModel));
        }
        fVar.mo143771a(EmoteModel.class, new C88382k(this.f200568u, null, null));
        fVar.mo143771a(C88374e.class, new C88372c(this));
        SSGridLayoutManager sSGridLayoutManager = new SSGridLayoutManager(getContext(), 5);
        this.f200566n = sSGridLayoutManager;
        sSGridLayoutManager.mo4320a(new C88354e(this));
        RecyclerView recyclerView = this.f200559g;
        if (recyclerView == null) {
            C89219l.m154710a("mRecyclerView");
        }
        recyclerView.setAdapter(this.f200554a);
        RecyclerView recyclerView2 = this.f200559g;
        if (recyclerView2 == null) {
            C89219l.m154710a("mRecyclerView");
        }
        recyclerView2.setLayoutManager(this.f200566n);
        RecyclerView recyclerView3 = this.f200559g;
        if (recyclerView3 == null) {
            C89219l.m154710a("mRecyclerView");
        }
        recyclerView3.setHasFixedSize(true);
        RecyclerView recyclerView4 = this.f200559g;
        if (recyclerView4 == null) {
            C89219l.m154710a("mRecyclerView");
        }
        recyclerView4.setItemViewCacheSize(36);
        RecyclerView recyclerView5 = this.f200559g;
        if (recyclerView5 == null) {
            C89219l.m154710a("mRecyclerView");
        }
        C11279p.m20015b(recyclerView5, C3966y.m9653a(32.0f));
        RecyclerView recyclerView6 = this.f200559g;
        if (recyclerView6 == null) {
            C89219l.m154710a("mRecyclerView");
        }
        recyclerView6.setNestedScrollingEnabled(false);
        String a = HSAnimImageView.f11029i.mo9400a("tiktok_live_basic_resource", "ttlive_bg_emote_header.png", false);
        if (!TextUtils.isEmpty(a)) {
            ImageView imageView2 = this.f200560h;
            if (imageView2 == null) {
                C89219l.m154710a("mIvPlanet");
            }
            C3951p.m9622a(imageView2, new ImageModel(a, C89070n.m154516a(a)), 0);
            View view2 = this.f200561i;
            if (view2 == null) {
                C89219l.m154710a("mOuterView");
            }
            view2.setOnClickListener(new View$OnClickListenerC88355f(this));
        }
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        if (room == null || (owner2 = room.getOwner()) == null) {
            z = false;
        } else {
            z = owner2.isFollowing();
        }
        this.f200564l = z;
        ((AbstractC11181z) C6779a.m14563a().mo13052a(C11625a.class).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143274a(C11152e.m19789a((Fragment) this))).mo17949a(new C88351b(this));
        Room room2 = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        if (room2 == null || (owner = room2.getOwner()) == null) {
            z2 = false;
        } else {
            z2 = owner.isSubscribed();
        }
        this.f200555b = z2;
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        C89219l.m154716b(b, "");
        long c = b.mo13161c();
        Room room3 = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        if (room3 != null && c == room3.getOwnerUserId()) {
            z3 = true;
        }
        this.f200565m = z3;
        this.f200556c.clear();
        Collection<? extends EmoteModel> collection = (List) DataChannelGlobal.f42558d.mo28324b(C4049d.class);
        if (collection == null) {
            collection = new ArrayList<>();
        }
        this.f200556c.addAll(collection);
        DataChannelGlobal.f42558d.mo28322a(this, this, C5793y.class, new C88352c(this));
        DataChannelGlobal.f42558d.mo28322a(this, this, C4049d.class, new C88353d(this));
        this.f200554a.mo17153a(this.f200567t);
        mo9929d();
        if (DataChannelGlobal.f42558d.mo28324b(C9009ac.class) != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("show_entrance", "comment_area");
            C88366a.m153562a(hashMap);
            C6501b.C6502a.m13948a("livesdk_privilege_emote_show").mo12639a().mo12652a((Map<String, String>) hashMap).mo12655b();
        }
    }
}
