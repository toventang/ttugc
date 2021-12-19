package com.bytedance.android.p147c.p148a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import androidx.core.graphics.drawable.C0705a;
import androidx.lifecycle.AbstractC1204m;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.C4049d;
import com.bytedance.android.live.base.model.emoji.C2972a;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.C4079b;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.p379n.C5793y;
import com.bytedance.android.live.uikit.p411c.C6229a;
import com.bytedance.android.livesdk.chatroom.p499ui.SSGridLayoutManager;
import com.bytedance.android.livesdk.livesetting.comment.LiveCommentEmoteInputMaxCount;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.widget.C11432m;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p678b.C11625a;
import com.bytedance.android.p147c.p148a.AbstractC2713c;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.facebook.common.p1832d.C24085e;
import com.p2082ss.android.ugc.trill.R;
import emotes.p4557a.C88356b;
import emotes.p4558b.C88366a;
import emotes.p4559c.C88379h;
import emotes.p4559c.C88381j;
import emotes.p4559c.C88382k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4628j.p4629a.p4630a.C89399f;

/* renamed from: com.bytedance.android.c.a.b */
public final class C2709b extends AbstractC2713c {

    /* renamed from: a */
    public final SpannableStringBuilder f8087a = new SpannableStringBuilder();

    /* renamed from: b */
    public final List<EmoteModel> f8088b;

    /* renamed from: c */
    public final int f8089c;

    /* renamed from: d */
    public AbstractC2710a f8090d;

    /* renamed from: e */
    AbstractC2713c.AbstractC2714a f8091e;

    /* renamed from: m */
    private LiveTextView f8092m;

    /* renamed from: n */
    private AbstractC2713c.AbstractC2714a f8093n;

    /* renamed from: o */
    private final int f8094o;

    /* renamed from: p */
    private final int f8095p;

    /* renamed from: q */
    private final int f8096q;

    /* renamed from: r */
    private C88356b f8097r;

    /* renamed from: com.bytedance.android.c.a.b$a */
    public interface AbstractC2710a extends AbstractC2713c.AbstractC2714a {
        static {
            Covode.recordClassIndex(3100);
        }

        /* renamed from: a */
        void mo7238a(List<? extends EmoteModel> list);
    }

    static {
        Covode.recordClassIndex(3099);
    }

    @Override // com.bytedance.android.p147c.p148a.AbstractC2713c
    /* renamed from: a */
    public final int mo7223a() {
        return 2131234372;
    }

    /* renamed from: com.bytedance.android.c.a.b$b */
    public static final class C2711b implements AbstractC2713c.AbstractC2714a {

        /* renamed from: a */
        final /* synthetic */ AbstractC2713c.AbstractC2714a f8098a;

        /* renamed from: b */
        final /* synthetic */ C2709b f8099b;

        static {
            Covode.recordClassIndex(3101);
        }

        @Override // com.bytedance.android.live.p236e.p237a.p238a.AbstractC4141a
        /* renamed from: b_ */
        public final void mo7242b_() {
        }

        @Override // com.bytedance.android.p147c.p148a.AbstractC2713c.AbstractC2714a
        /* renamed from: a_ */
        public final void mo7241a_() {
            this.f8098a.mo7241a_();
        }

        @Override // com.bytedance.android.p147c.p148a.AbstractC2713c.AbstractC2714a
        /* renamed from: a */
        public final void mo7239a(AbstractC2713c cVar) {
            C89219l.m154721d(cVar, "");
            this.f8098a.mo7239a(cVar);
            this.f8099b.mo7237f();
        }

        @Override // com.bytedance.android.live.p236e.p237a.p238a.AbstractC4141a
        /* renamed from: a */
        public final void mo7240a(C2972a aVar) {
            if (this.f8099b.f8087a.length() >= this.f8099b.f8089c) {
                C11226ao.m19883a(C3966y.m9669e(), this.f8099b.f8109l.getResources().getQuantityString(R.plurals.gi, this.f8099b.f8089c, String.valueOf(this.f8099b.f8089c)), 0);
                return;
            }
            if (!(aVar instanceof EmoteModel)) {
                aVar = null;
            }
            EmoteModel emoteModel = (EmoteModel) aVar;
            if (emoteModel != null) {
                this.f8099b.mo7233a(emoteModel);
            }
        }

        C2711b(AbstractC2713c.AbstractC2714a aVar, C2709b bVar) {
            this.f8098a = aVar;
            this.f8099b = bVar;
        }
    }

    /* renamed from: com.bytedance.android.c.a.b$c */
    public static final class C2712c implements C88356b.AbstractC88358b {

        /* renamed from: a */
        final /* synthetic */ C2709b f8100a;

        static {
            Covode.recordClassIndex(3102);
        }

        @Override // emotes.p4557a.C88356b.AbstractC88358b
        /* renamed from: a */
        public final void mo7243a() {
            AbstractC2713c.AbstractC2714a aVar = this.f8100a.f8091e;
            if (aVar != null) {
                aVar.mo7241a_();
            }
        }

        C2712c(C2709b bVar) {
            this.f8100a = bVar;
        }

        @Override // emotes.p4557a.C88356b.AbstractC88358b
        /* renamed from: a */
        public final void mo7244a(boolean z) {
            this.f8100a.mo7248e(z);
        }
    }

    @Override // com.bytedance.android.p147c.p148a.AbstractC2713c
    /* renamed from: d */
    public final boolean mo7228d() {
        if (this.f8087a.length() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.p147c.p148a.AbstractC2713c
    /* renamed from: b */
    public final /* synthetic */ CharSequence mo7226b() {
        String string = this.f8109l.getResources().getString(R.string.eks);
        C89219l.m154716b(string, "");
        return string;
    }

    @Override // com.bytedance.android.p147c.p148a.AbstractC2713c
    /* renamed from: e */
    public final void mo7229e() {
        AbstractC2710a aVar = this.f8090d;
        if (aVar != null) {
            C24085e copyOf = C24085e.copyOf(this.f8088b);
            C89219l.m154716b(copyOf, "");
            aVar.mo7238a(copyOf);
        }
    }

    /* renamed from: f */
    public final void mo7237f() {
        if (this.f8108k) {
            C88356b bVar = this.f8097r;
            if (bVar != null) {
                bVar.mo142864a(true);
            }
        } else if (this.f8088b.size() >= this.f8089c) {
            C88356b bVar2 = this.f8097r;
            if (bVar2 != null) {
                bVar2.mo142864a(true);
            }
        } else {
            C88356b bVar3 = this.f8097r;
            if (bVar3 != null) {
                bVar3.mo142864a(false);
            }
        }
    }

    /* renamed from: g */
    private final void m7809g() {
        if (this.f8108k) {
            LiveTextView liveTextView = this.f8092m;
            if (liveTextView != null) {
                liveTextView.setText(R.string.e_g);
            }
        } else if (this.f8087a.length() == 0) {
            LiveTextView liveTextView2 = this.f8092m;
            if (liveTextView2 != null) {
                liveTextView2.setText(this.f8109l.getResources().getString(R.string.ekq, String.valueOf(this.f8089c)));
            }
        } else {
            LiveTextView liveTextView3 = this.f8092m;
            if (liveTextView3 != null) {
                liveTextView3.setText(this.f8087a);
            }
        }
    }

    @Override // com.bytedance.android.p147c.p148a.AbstractC2713c
    /* renamed from: c */
    public final void mo7227c() {
        boolean z;
        SpannableStringBuilder spannableStringBuilder = this.f8087a;
        if (spannableStringBuilder.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && spannableStringBuilder != null) {
            spannableStringBuilder.delete(this.f8087a.length() - 1, this.f8087a.length());
        }
        List<EmoteModel> list = this.f8088b;
        if ((!list.isEmpty()) && list != null) {
            list.remove(C89070n.m154517a((List) this.f8088b));
        }
        m7809g();
        AbstractC2713c.AbstractC2714a aVar = this.f8093n;
        if (aVar != null) {
            aVar.mo7239a(this);
        }
    }

    @Override // com.bytedance.android.p147c.p148a.AbstractC2713c
    /* renamed from: a */
    public final void mo7232a(AbstractC2713c.AbstractC2714a aVar) {
        if (aVar != null) {
            this.f8093n = new C2711b(aVar, this);
        }
        this.f8091e = aVar;
    }

    @Override // com.bytedance.android.p147c.p148a.AbstractC2713c
    /* renamed from: b */
    public final void mo7236b(boolean z) {
        super.mo7236b(z);
        m7809g();
        mo7237f();
    }

    /* renamed from: a */
    public final void mo7234a(List<? extends EmoteModel> list) {
        int size = this.f8088b.size();
        for (int i = 0; i < size; i++) {
            mo7227c();
        }
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                mo7233a((EmoteModel) it.next());
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2709b(Context context) {
        super(context);
        C89219l.m154721d(context, "");
        this.f8094o = context.getResources().getDimensionPixelSize(R.dimen.wa);
        this.f8095p = context.getResources().getDimensionPixelSize(R.dimen.wb);
        this.f8096q = context.getResources().getDimensionPixelSize(R.dimen.w_);
        this.f8088b = new ArrayList();
        this.f8089c = LiveCommentEmoteInputMaxCount.INSTANCE.getValue();
    }

    /* renamed from: a */
    public final void mo7233a(EmoteModel emoteModel) {
        this.f8087a.append((char) 65532);
        SpannableStringBuilder spannableStringBuilder = this.f8087a;
        Drawable mutate = emoteModel.f8733m.mutate();
        int i = this.f8094o;
        mutate.setBounds(0, 0, i, i);
        C0705a.m2503b(mutate, C6229a.m13521a(this.f8109l) ? 1 : 0);
        C89219l.m154716b(mutate, "");
        C11432m mVar = new C11432m(mutate);
        mVar.mo18269a((float) this.f8096q);
        mVar.f27402a = this.f8095p;
        spannableStringBuilder.setSpan(mVar, this.f8087a.length() - 1, this.f8087a.length(), 33);
        this.f8088b.add(emoteModel);
        m7809g();
        AbstractC2713c.AbstractC2714a aVar = this.f8093n;
        if (aVar != null) {
            aVar.mo7239a(this);
        }
    }

    @Override // com.bytedance.android.p147c.p148a.AbstractC2713c
    /* renamed from: b */
    public final View mo7235b(ViewGroup viewGroup) {
        MethodCollector.m26663i(10198);
        C89219l.m154721d(viewGroup, "");
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(this.f8109l);
        horizontalScrollView.setScrollBarSize(0);
        LiveTextView liveTextView = new LiveTextView(this.f8109l);
        liveTextView.setGravity(16);
        liveTextView.setSingleLine(true);
        liveTextView.mo9623a(R.style.tm);
        liveTextView.setTextColor(C4079b.m9889a(liveTextView, (int) R.attr.amn));
        this.f8092m = liveTextView;
        horizontalScrollView.addView(liveTextView, -2, -1);
        m7809g();
        MethodCollector.m26664o(10198);
        return horizontalScrollView;
    }

    @Override // com.bytedance.android.p147c.p148a.AbstractC2713c
    /* renamed from: a */
    public final void mo7225a(boolean z) {
        super.mo7225a(z);
        C88356b bVar = this.f8097r;
        if (bVar != null && z) {
            if (DataChannelGlobal.f42558d.mo28324b(C9009ac.class) != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("show_entrance", "comment_area");
                C88366a.m153562a(hashMap);
                C6501b.C6502a.m13948a("livesdk_privilege_emote_bar_show").mo12639a().mo12652a((Map<String, String>) hashMap).mo12655b();
            }
            if (!bVar.f200582m) {
                C88366a.m153561a("emote_bar");
            }
        }
    }

    @Override // com.bytedance.android.p147c.p148a.AbstractC2713c
    /* renamed from: a */
    public final View mo7224a(ViewGroup viewGroup) {
        int i;
        boolean z;
        boolean z2;
        User owner;
        User owner2;
        C89219l.m154721d(viewGroup, "");
        Context context = this.f8109l;
        boolean z3 = this.f8104g;
        AbstractC2713c.AbstractC2714a aVar = this.f8093n;
        C88356b bVar = new C88356b(context);
        bVar.setOnEmojiSelectListener(aVar);
        bVar.f200580k = z3;
        if (bVar.f200580k) {
            i = 5;
        } else {
            i = 10;
        }
        bVar.f200581l = i;
        View findViewById = bVar.findViewById(R.id.do9);
        C89219l.m154716b(findViewById, "");
        bVar.f200576g = (RecyclerView) findViewById;
        RecyclerView recyclerView = bVar.f200576g;
        if (recyclerView == null) {
            C89219l.m154710a("mRecyclerView");
        }
        boolean z4 = false;
        recyclerView.setClipToPadding(false);
        bVar.f200588s = (C3966y.m9664c() - C3966y.m9653a(18.0f)) / bVar.f200581l;
        C89399f fVar = bVar.f200577h;
        fVar.mo143771a(C88379h.class, new C88381j(bVar));
        fVar.mo143771a(EmoteModel.class, new C88382k(bVar.f200588s, bVar, bVar));
        bVar.f200578i = new SSGridLayoutManager(bVar.getContext(), bVar.f200581l);
        SSGridLayoutManager sSGridLayoutManager = bVar.f200578i;
        if (sSGridLayoutManager != null) {
            sSGridLayoutManager.mo4320a(new C88356b.C88362f(bVar));
        }
        RecyclerView recyclerView2 = bVar.f200576g;
        if (recyclerView2 == null) {
            C89219l.m154710a("mRecyclerView");
        }
        recyclerView2.setAdapter(bVar.f200577h);
        RecyclerView recyclerView3 = bVar.f200576g;
        if (recyclerView3 == null) {
            C89219l.m154710a("mRecyclerView");
        }
        recyclerView3.setLayoutManager(bVar.f200578i);
        RecyclerView recyclerView4 = bVar.f200576g;
        if (recyclerView4 == null) {
            C89219l.m154710a("mRecyclerView");
        }
        recyclerView4.setHasFixedSize(true);
        RecyclerView recyclerView5 = bVar.f200576g;
        if (recyclerView5 == null) {
            C89219l.m154710a("mRecyclerView");
        }
        recyclerView5.setItemViewCacheSize(36);
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        if (room == null || (owner2 = room.getOwner()) == null) {
            z = false;
        } else {
            z = owner2.isFollowing();
        }
        bVar.f200583n = z;
        bVar.f200587r.mo142945a(C6779a.m14563a().mo13052a(C11625a.class).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143289d(new C88356b.C88359c(bVar)));
        Room room2 = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        if (room2 == null || (owner = room2.getOwner()) == null) {
            z2 = false;
        } else {
            z2 = owner.isSubscribed();
        }
        bVar.f200582m = z2;
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        C89219l.m154716b(b, "");
        long c = b.mo13161c();
        Room room3 = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        if (room3 != null && c == room3.getOwnerUserId()) {
            z4 = true;
        }
        bVar.f200584o = z4;
        C88356b.AbstractC88358b bVar2 = bVar.f200579j;
        if (bVar2 != null) {
            bVar2.mo7244a(bVar.mo9139b());
        }
        bVar.f200586q.clear();
        Collection<? extends EmoteModel> collection = (List) DataChannelGlobal.f42558d.mo28324b(C4049d.class);
        if (collection == null) {
            collection = new ArrayList<>();
        }
        bVar.f200586q.addAll(collection);
        if (bVar.getContext() instanceof AbstractC1204m) {
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.f42558d;
            Context context2 = bVar.getContext();
            Objects.requireNonNull(context2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
            dataChannelGlobal.mo28322a(bVar, (AbstractC1204m) context2, C5793y.class, new C88356b.C88360d(bVar));
            DataChannelGlobal dataChannelGlobal2 = DataChannelGlobal.f42558d;
            Context context3 = bVar.getContext();
            Objects.requireNonNull(context3, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
            dataChannelGlobal2.mo28322a(bVar, (AbstractC1204m) context3, C4049d.class, new C88356b.C88361e(bVar));
        }
        bVar.f200577h.mo17153a(bVar.f200585p);
        bVar.mo142866c();
        Context context4 = bVar.getContext();
        C89219l.m154716b(context4, "");
        int dimensionPixelSize = context4.getResources().getDimensionPixelSize(R.dimen.w9);
        RecyclerView recyclerView6 = bVar.f200576g;
        if (recyclerView6 == null) {
            C89219l.m154710a("mRecyclerView");
        }
        RecyclerView recyclerView7 = bVar.f200576g;
        if (recyclerView7 == null) {
            C89219l.m154710a("mRecyclerView");
        }
        int paddingLeft = recyclerView7.getPaddingLeft();
        RecyclerView recyclerView8 = bVar.f200576g;
        if (recyclerView8 == null) {
            C89219l.m154710a("mRecyclerView");
        }
        int paddingTop = recyclerView8.getPaddingTop();
        RecyclerView recyclerView9 = bVar.f200576g;
        if (recyclerView9 == null) {
            C89219l.m154710a("mRecyclerView");
        }
        recyclerView6.setPadding(paddingLeft, paddingTop, recyclerView9.getPaddingRight(), dimensionPixelSize);
        this.f8097r = bVar;
        mo7237f();
        mo7248e(bVar.mo9139b());
        bVar.setEmoteSelectPanelCallback(new C2712c(this));
        C89219l.m154716b(bVar, "");
        return bVar;
    }
}
