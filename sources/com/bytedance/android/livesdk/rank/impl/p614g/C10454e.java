package com.bytedance.android.livesdk.rank.impl.p614g;

import android.graphics.drawable.Animatable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.p218f.C3941k;
import com.bytedance.android.live.core.widget.HSAnimImageView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p425aa.C6544e;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.rank.api.model.C10348b;
import com.bytedance.android.livesdk.rank.impl.p611d.C10387b;
import com.bytedance.android.livesdk.rank.impl.p613f.C10414c;
import com.bytedance.android.livesdk.rank.impl.p613f.C10424l;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.facebook.drawee.p1845a.p1846a.C24182c;
import com.facebook.drawee.p1845a.p1846a.C24185e;
import com.facebook.drawee.p1851c.C24202c;
import com.facebook.imagepipeline.p1885j.AbstractC24457f;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4628j.p4629a.p4630a.AbstractC89396c;

/* renamed from: com.bytedance.android.livesdk.rank.impl.g.e */
public final class C10454e extends AbstractC89396c<C10348b, C10456b> {

    /* renamed from: b */
    public static final C10455a f25181b = new C10455a((byte) 0);

    /* renamed from: a */
    public final DataChannel f25182a;

    static {
        Covode.recordClassIndex(12028);
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.g.e$a */
    public static final class C10455a {
        static {
            Covode.recordClassIndex(12029);
        }

        private C10455a() {
        }

        public /* synthetic */ C10455a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.g.e$e */
    public static final class C10468e implements C10414c.AbstractC10415a {

        /* renamed from: a */
        final /* synthetic */ C10456b f25205a;

        /* renamed from: b */
        final /* synthetic */ C10348b f25206b;

        static {
            Covode.recordClassIndex(12042);
        }

        @Override // com.bytedance.android.livesdk.rank.impl.p613f.C10414c.AbstractC10415a
        /* renamed from: c */
        public final C10348b mo17285c() {
            return this.f25206b;
        }

        @Override // com.bytedance.android.livesdk.rank.impl.p613f.C10414c.AbstractC10415a
        /* renamed from: b */
        public final void mo17284b() {
            this.f25205a.mo17301b().setVisibility(0);
        }

        /* renamed from: com.bytedance.android.livesdk.rank.impl.g.e$e$a */
        static final class RunnableC10469a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C10468e f25207a;

            static {
                Covode.recordClassIndex(12043);
            }

            RunnableC10469a(C10468e eVar) {
                this.f25207a = eVar;
            }

            public final void run() {
                Animatable animatable = this.f25207a.f25205a.f25187e;
                if (animatable != null && animatable.isRunning()) {
                    Animatable animatable2 = this.f25207a.f25205a.f25187e;
                    if (animatable2 != null) {
                        animatable2.stop();
                    }
                    this.f25207a.f25205a.mo17301b().setVisibility(8);
                }
            }
        }

        @Override // com.bytedance.android.livesdk.rank.impl.p613f.C10414c.AbstractC10415a
        /* renamed from: a */
        public final void mo17283a() {
            try {
                Animatable animatable = this.f25205a.f25187e;
                if (animatable == null || !(!animatable.isRunning())) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                Animatable animatable2 = this.f25205a.f25187e;
                if (animatable2 != null) {
                    animatable2.start();
                }
                this.f25205a.mo17301b().postDelayed(new RunnableC10469a(this), 1240);
            } catch (IllegalStateException unused) {
            }
        }

        C10468e(C10456b bVar, C10348b bVar2) {
            this.f25205a = bVar;
            this.f25206b = bVar2;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.g.e$c */
    static final class C10464c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C10456b f25198a;

        /* renamed from: b */
        final /* synthetic */ C10348b f25199b;

        static {
            Covode.recordClassIndex(12038);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10464c(C10456b bVar, C10348b bVar2) {
            super(0);
            this.f25198a = bVar;
            this.f25199b = bVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            mo17303a();
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo17303a() {
            int i;
            HSImageView b = this.f25198a.mo17301b();
            if (C10414c.m18934a(this.f25199b) || !C10414c.m18933a()) {
                i = 8;
            } else {
                i = 0;
            }
            b.setVisibility(i);
            b.setOnClickListener(new View$OnClickListenerC10465a(this));
            C24185e a = C24182c.m45843b().mo39797a(HSAnimImageView.f11029i.mo9399a("tiktok_live_interaction_resource", "ttlive_rank_follow_anim.webp"));
            a.f57303g = new C10466b(this);
            b.setController(a.mo39827e());
        }

        /* renamed from: com.bytedance.android.livesdk.rank.impl.g.e$c$b */
        public static final class C10466b extends C24202c<AbstractC24457f> {

            /* renamed from: a */
            final /* synthetic */ C10464c f25201a;

            static {
                Covode.recordClassIndex(12040);
            }

            C10466b(C10464c cVar) {
                this.f25201a = cVar;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
            @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
            public final /* synthetic */ void onFinalImageSet(String str, AbstractC24457f fVar, Animatable animatable) {
                C89219l.m154721d(str, "");
                this.f25201a.f25198a.f25187e = animatable;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.android.livesdk.rank.impl.g.e$c$a */
        public static final class View$OnClickListenerC10465a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C10464c f25200a;

            static {
                Covode.recordClassIndex(12039);
            }

            View$OnClickListenerC10465a(C10464c cVar) {
                this.f25200a = cVar;
            }

            public final void onClick(View view) {
                C10414c.m18929a(this.f25200a.f25199b.f25001a.getId());
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.g.e$d */
    static final class C10467d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C10454e f25202a;

        /* renamed from: b */
        final /* synthetic */ C10348b f25203b;

        /* renamed from: c */
        final /* synthetic */ C10456b f25204c;

        static {
            Covode.recordClassIndex(12041);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10467d(C10454e eVar, C10348b bVar, C10456b bVar2) {
            super(0);
            this.f25202a = eVar;
            this.f25203b = bVar;
            this.f25204c = bVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            mo17305a();
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo17305a() {
            Room room;
            long j = 0;
            if (this.f25203b.f25003c > 0) {
                DataChannel dataChannel = this.f25202a.f25182a;
                if (!(dataChannel == null || (room = (Room) dataChannel.mo28318b(C9093de.class)) == null)) {
                    j = room.getOwnerUserId();
                }
                this.f25204c.mo17300a().setText(C10387b.m18895a().mo17276a(j, this.f25203b.f25003c));
                return;
            }
            this.f25204c.mo17300a().setText("");
        }
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.g.e$b */
    public static final class C10456b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final AbstractC89244h f25183a;

        /* renamed from: b */
        final AbstractC89244h f25184b;

        /* renamed from: c */
        final AbstractC89244h f25185c;

        /* renamed from: d */
        final AbstractC89244h f25186d;

        /* renamed from: e */
        public Animatable f25187e;

        /* renamed from: f */
        private final AbstractC89244h f25188f;

        /* renamed from: g */
        private final AbstractC89244h f25189g;

        /* renamed from: h */
        private final AbstractC89244h f25190h;

        static {
            Covode.recordClassIndex(12030);
        }

        /* renamed from: a */
        public final LiveTextView mo17300a() {
            return (LiveTextView) this.f25188f.getValue();
        }

        /* renamed from: b */
        public final HSImageView mo17301b() {
            return (HSImageView) this.f25189g.getValue();
        }

        /* renamed from: c */
        public final HSImageView mo17302c() {
            return (HSImageView) this.f25190h.getValue();
        }

        /* renamed from: com.bytedance.android.livesdk.rank.impl.g.e$b$a */
        static final class C10457a extends AbstractC89220m implements AbstractC89171a<HSImageView> {

            /* renamed from: a */
            final /* synthetic */ View f25191a;

            static {
                Covode.recordClassIndex(12031);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10457a(View view) {
                super(0);
                this.f25191a = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ HSImageView invoke() {
                return this.f25191a.findViewById(R.id.b6n);
            }
        }

        /* renamed from: com.bytedance.android.livesdk.rank.impl.g.e$b$b */
        static final class C10458b extends AbstractC89220m implements AbstractC89171a<LiveTextView> {

            /* renamed from: a */
            final /* synthetic */ View f25192a;

            static {
                Covode.recordClassIndex(12032);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10458b(View view) {
                super(0);
                this.f25192a = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ LiveTextView invoke() {
                return this.f25192a.findViewById(R.id.f23);
            }
        }

        /* renamed from: com.bytedance.android.livesdk.rank.impl.g.e$b$c */
        static final class C10459c extends AbstractC89220m implements AbstractC89171a<LiveTextView> {

            /* renamed from: a */
            final /* synthetic */ View f25193a;

            static {
                Covode.recordClassIndex(12033);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10459c(View view) {
                super(0);
                this.f25193a = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ LiveTextView invoke() {
                return this.f25193a.findViewById(R.id.f5u);
            }
        }

        /* renamed from: com.bytedance.android.livesdk.rank.impl.g.e$b$d */
        static final class C10460d extends AbstractC89220m implements AbstractC89171a<ImageView> {

            /* renamed from: a */
            final /* synthetic */ View f25194a;

            static {
                Covode.recordClassIndex(12034);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10460d(View view) {
                super(0);
                this.f25194a = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ ImageView invoke() {
                return this.f25194a.findViewById(R.id.c15);
            }
        }

        /* renamed from: com.bytedance.android.livesdk.rank.impl.g.e$b$e */
        static final class C10461e extends AbstractC89220m implements AbstractC89171a<HSImageView> {

            /* renamed from: a */
            final /* synthetic */ View f25195a;

            static {
                Covode.recordClassIndex(12035);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10461e(View view) {
                super(0);
                this.f25195a = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ HSImageView invoke() {
                return this.f25195a.findViewById(R.id.bt1);
            }
        }

        /* renamed from: com.bytedance.android.livesdk.rank.impl.g.e$b$f */
        static final class C10462f extends AbstractC89220m implements AbstractC89171a<HSImageView> {

            /* renamed from: a */
            final /* synthetic */ View f25196a;

            static {
                Covode.recordClassIndex(12036);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10462f(View view) {
                super(0);
                this.f25196a = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ HSImageView invoke() {
                return this.f25196a.findViewById(R.id.bss);
            }
        }

        /* renamed from: com.bytedance.android.livesdk.rank.impl.g.e$b$g */
        static final class C10463g extends AbstractC89220m implements AbstractC89171a<LiveTextView> {

            /* renamed from: a */
            final /* synthetic */ View f25197a;

            static {
                Covode.recordClassIndex(12037);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10463g(View view) {
                super(0);
                this.f25197a = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ LiveTextView invoke() {
                return this.f25197a.findViewById(R.id.f6t);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10456b(View view) {
            super(view);
            C89219l.m154721d(view, "");
            this.f25183a = C89250i.m154773a((AbstractC89171a) new C10458b(view));
            this.f25184b = C89250i.m154773a((AbstractC89171a) new C10460d(view));
            this.f25185c = C89250i.m154773a((AbstractC89171a) new C10463g(view));
            this.f25188f = C89250i.m154773a((AbstractC89171a) new C10459c(view));
            this.f25189g = C89250i.m154773a((AbstractC89171a) new C10457a(view));
            this.f25186d = C89250i.m154773a((AbstractC89171a) new C10462f(view));
            this.f25190h = C89250i.m154773a((AbstractC89171a) new C10461e(view));
        }
    }

    public C10454e(DataChannel dataChannel) {
        this.f25182a = dataChannel;
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.g.e$f */
    static final class View$OnClickListenerC10470f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C10348b f25208a;

        static {
            Covode.recordClassIndex(12044);
        }

        View$OnClickListenerC10470f(C10348b bVar) {
            this.f25208a = bVar;
        }

        public final void onClick(View view) {
            UserProfileEvent userProfileEvent = new UserProfileEvent(this.f25208a.f25001a.getId());
            userProfileEvent.mRankInfo = C10424l.m18944a(this.f25208a);
            C6779a.m14563a().mo13053a(userProfileEvent);
        }
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // p4628j.p4629a.p4630a.AbstractC89396c
    /* renamed from: a */
    public final /* synthetic */ C10456b mo10368a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.b9d, viewGroup, false);
        C89219l.m154716b(a, "");
        return new C10456b(a);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, java.lang.Object] */
    @Override // p4628j.p4629a.p4630a.AbstractC89396c
    /* renamed from: a */
    public final /* synthetic */ void mo10140a(C10456b bVar, C10348b bVar2) {
        T t;
        C10456b bVar3 = bVar;
        C10348b bVar4 = bVar2;
        C89219l.m154721d(bVar3, "");
        C89219l.m154721d(bVar4, "");
        C10464c cVar = new C10464c(bVar3, bVar4);
        C10467d dVar = new C10467d(this, bVar4, bVar3);
        C10414c.m18931a((LiveTextView) bVar3.f25183a.getValue(), bVar4, (Boolean) true);
        C10414c.m18930a((HSImageView) bVar3.f25186d.getValue(), (ImageView) bVar3.f25184b.getValue(), bVar4);
        cVar.mo17303a();
        LiveTextView liveTextView = (LiveTextView) bVar3.f25185c.getValue();
        String str = bVar4.f25001a.displayId;
        if (str == null) {
            str = "";
        }
        liveTextView.setText(str);
        dVar.mo17305a();
        if (bVar4.f25001a.getBadgeImageList() == null || bVar4.f25001a.getBadgeImageList().size() == 0) {
            bVar3.mo17302c().setVisibility(8);
        } else {
            List<ImageModel> badgeImageList = bVar4.f25001a.getBadgeImageList();
            C89219l.m154716b(badgeImageList, "");
            Iterator<T> it = badgeImageList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                T t2 = t;
                C89219l.m154716b(t2, "");
                if (t2.getImageType() == 30) {
                    break;
                }
            }
            T t3 = t;
            if (t3 != null) {
                C3941k.m9601a(bVar3.mo17302c(), (ImageModel) t3);
                bVar3.mo17302c().setVisibility(0);
                Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
                if (room != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("show_entrance", "active_user_rank");
                    hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
                    String idStr = room.getIdStr();
                    C89219l.m154716b(idStr, "");
                    hashMap.put("room_id", idStr);
                    hashMap.put("enter_method", C6544e.m13990d());
                    hashMap.put("enter_from_merge", C6544e.m13987a());
                    hashMap.put("action_type", C6544e.m13991e());
                    hashMap.put("request_id", C6544e.m13997k());
                    hashMap.put("video_id", C6544e.m13992f());
                    C6501b.C6502a.m13948a("livesdk_privilege_badge_show").mo12639a().mo12652a((Map<String, String>) hashMap).mo12655b();
                }
            }
        }
        C10414c.m18932a(new C10468e(bVar3, bVar4));
        bVar3.itemView.setOnClickListener(new View$OnClickListenerC10470f(bVar4));
        if (bVar4.f25004d != 0) {
            long id = bVar4.f25001a.getId();
            int i = bVar4.f25004d;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("to_user_id", String.valueOf(id));
            linkedHashMap.put("show_user_position", "top_active_user_rank");
            linkedHashMap.put("rank_position", "active_user_rank_detail");
            linkedHashMap.put("age_level", String.valueOf(i));
            C6501b.C6502a.m13948a("l1_audience_show").mo12652a((Map<String, String>) linkedHashMap).mo12639a().mo12655b();
        }
    }
}
