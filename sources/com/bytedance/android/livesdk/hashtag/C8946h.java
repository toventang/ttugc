package com.bytedance.android.livesdk.hashtag;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.AbstractC1204m;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.p181c.C2965a;
import com.bytedance.android.live.core.feed.FeedApi;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p218f.C3951p;
import com.bytedance.android.live.core.widget.StateLayout;
import com.bytedance.android.live.design.widget.LiveButton;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.network.response.C5827a;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.AbstractC11293v;
import com.bytedance.android.livesdk.event.C8452e;
import com.bytedance.android.livesdk.feed.p536l.C8641a;
import com.bytedance.android.livesdk.livesetting.feed.FeedDrawMtSetting;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p561j.C9012af;
import com.bytedance.android.livesdk.p561j.C9023aq;
import com.bytedance.android.livesdk.p561j.C9052br;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p561j.C9115e;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdk.util.rxutils.C11195i;
import com.bytedance.android.livesdk.util.rxutils.p651b.EnumC11186b;
import com.bytedance.android.livesdk.utils.C11221ak;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.android.livesdkapi.p691g.C11760a;
import com.bytedance.android.livesdkapi.p699l.AbstractC11827c;
import com.bytedance.android.livesdkapi.p699l.C11825a;
import com.bytedance.android.livesdkapi.p699l.C11826b;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.android.livesdkapi.session.EnumC11866b;
import com.bytedance.android.livesdkapi.session.Event;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.google.android.material.appbar.AppBarLayout;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.android.livesdk.hashtag.h */
public final class C8946h extends AbstractC11293v {

    /* renamed from: i */
    public static final C8947a f22028i = new C8947a((byte) 0);

    /* renamed from: a */
    Room f22029a;

    /* renamed from: b */
    public final String f22030b = FeedDrawMtSetting.INSTANCE.getValue().getUrl();

    /* renamed from: c */
    public C8962i f22031c;

    /* renamed from: d */
    public long f22032d;

    /* renamed from: e */
    public long f22033e;

    /* renamed from: f */
    public boolean f22034f;

    /* renamed from: g */
    public final float f22035g = 0.5f;

    /* renamed from: h */
    public final float f22036h = 0.3f;

    /* renamed from: j */
    private C8931b f22037j;

    /* renamed from: k */
    private final C11221ak.EnumC11222a f22038k = C11221ak.EnumC11222a.PANEL_HASHTAG_AUDIENCE;

    /* renamed from: l */
    private HashMap f22039l;

    static {
        Covode.recordClassIndex(9838);
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a */
    public final void mo8165a() {
        HashMap hashMap = this.f22039l;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a_ */
    public final View mo8166a_(int i) {
        if (this.f22039l == null) {
            this.f22039l = new HashMap();
        }
        View view = (View) this.f22039l.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f22039l.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo8165a();
    }

    /* renamed from: com.bytedance.android.livesdk.hashtag.h$a */
    public static final class C8947a {
        static {
            Covode.recordClassIndex(9839);
        }

        private C8947a() {
        }

        public /* synthetic */ C8947a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: c_ */
    public final C11221ak.EnumC11222a mo9928c_() {
        return this.f22038k;
    }

    /* renamed from: com.bytedance.android.livesdk.hashtag.h$j */
    static final class C8956j implements StateLayout.AbstractC4030a {

        /* renamed from: a */
        final /* synthetic */ C8946h f22049a;

        static {
            Covode.recordClassIndex(9848);
        }

        C8956j(C8946h hVar) {
            this.f22049a = hVar;
        }

        @Override // com.bytedance.android.live.core.widget.StateLayout.AbstractC4030a
        /* renamed from: a */
        public final void mo9424a() {
            this.f22049a.mo9929d();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.hashtag.h$k */
    static final class C8957k implements StateLayout.AbstractC4030a {

        /* renamed from: a */
        final /* synthetic */ C8946h f22050a;

        static {
            Covode.recordClassIndex(9849);
        }

        C8957k(C8946h hVar) {
            this.f22050a = hVar;
        }

        @Override // com.bytedance.android.live.core.widget.StateLayout.AbstractC4030a
        /* renamed from: a */
        public final void mo9424a() {
            this.f22050a.mo9929d();
        }
    }

    /* renamed from: f */
    private static boolean m17291f() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: e */
    public static boolean m17290e() {
        if (C58029j.f132253e && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132253e;
        }
        boolean f = m17291f();
        C58029j.f132253e = f;
        return f;
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: b */
    public final AbstractC11293v.C11295b mo8355b() {
        AbstractC11293v.C11295b bVar = new AbstractC11293v.C11295b(R.layout.b5y);
        bVar.f27020g = 80;
        bVar.f27023j = 73;
        return bVar;
    }

    /* renamed from: com.bytedance.android.livesdk.hashtag.h$m */
    static final class C8959m extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C8946h f22052a;

        static {
            Covode.recordClassIndex(9851);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8959m(C8946h hVar) {
            super(0);
            this.f22052a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            String str;
            long j;
            Hashtag hashtag;
            Long l;
            String valueOf;
            C8946h.m17289a(this.f22052a).f22056a = 1;
            C8946h.m17289a(this.f22052a).notifyDataSetChanged();
            C8946h hVar = this.f22052a;
            long j2 = hVar.f22033e;
            hVar.getContext();
            if (!C8946h.m17290e()) {
                C8962i iVar = hVar.f22031c;
                if (iVar == null) {
                    C89219l.m154710a("mAdapter");
                }
                iVar.f22056a = 3;
            } else {
                FeedApi feedApi = (FeedApi) C5805e.m12718a().mo11572a(FeedApi.class);
                String str2 = hVar.f22030b;
                Room room = hVar.f22029a;
                String str3 = "";
                if (room == null || (str = String.valueOf(room.getId())) == null) {
                    str = str3;
                }
                Room room2 = hVar.f22029a;
                if (!(room2 == null || (valueOf = String.valueOf(room2.getOwnerUserId())) == null)) {
                    str3 = valueOf;
                }
                DataChannel dataChannel = hVar.f27010p;
                if (dataChannel == null || (hashtag = (Hashtag) dataChannel.mo28318b(C9023aq.class)) == null || (l = hashtag.f23083id) == null) {
                    j = 0;
                } else {
                    j = l.longValue();
                }
                feedApi.feed(str2, j2, "enter_hashtag_loadmore", "76", str, str3, j, 6).mo143292d(C8949c.f22042a).mo143271a(new C11191f()).mo143271a(C11195i.m19838a(hVar, EnumC11186b.DESTROY)).mo143254a(new C8950d(hVar), new C8951e(hVar));
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: d */
    public final void mo9929d() {
        String str;
        long j;
        Hashtag hashtag;
        Long l;
        String valueOf;
        ((StateLayout) mo8166a_(R.id.bdl)).mo9406a("LOADING");
        getContext();
        if (!m17290e()) {
            ((StateLayout) mo8166a_(R.id.bdl)).mo9406a("OFFLINE");
            return;
        }
        FeedApi feedApi = (FeedApi) C5805e.m12718a().mo11572a(FeedApi.class);
        String str2 = this.f22030b;
        Room room = this.f22029a;
        String str3 = "";
        if (room == null || (str = String.valueOf(room.getId())) == null) {
            str = str3;
        }
        Room room2 = this.f22029a;
        if (!(room2 == null || (valueOf = String.valueOf(room2.getOwnerUserId())) == null)) {
            str3 = valueOf;
        }
        DataChannel dataChannel = this.f27010p;
        if (dataChannel == null || (hashtag = (Hashtag) dataChannel.mo28318b(C9023aq.class)) == null || (l = hashtag.f23083id) == null) {
            j = 0;
        } else {
            j = l.longValue();
        }
        feedApi.feed(str2, 0, "enter_hashtag_refresh", "76", str, str3, j, 6).mo143292d(C8952f.f22045a).mo143271a(new C11191f()).mo143271a(C11195i.m19838a(this, EnumC11186b.DESTROY)).mo143254a(new C8953g(this), new C8954h(this));
    }

    /* renamed from: com.bytedance.android.livesdk.hashtag.h$n */
    public static final class C8960n implements AbstractC11827c {

        /* renamed from: a */
        final /* synthetic */ C8946h f22053a;

        static {
            Covode.recordClassIndex(9852);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C8960n(C8946h hVar) {
            this.f22053a = hVar;
        }

        @Override // com.bytedance.android.livesdkapi.p699l.AbstractC11827c
        /* renamed from: a */
        public final void mo14879a(Throwable th) {
            C89219l.m154721d(th, "");
            C3854a.m9453a(6, "HashtagAudienceDialog", "query Live permission failed");
        }

        @Override // com.bytedance.android.livesdkapi.p699l.AbstractC11827c
        /* renamed from: a */
        public final void mo14878a(Boolean bool, C11826b bVar, C11825a aVar) {
            this.f22053a.f22034f = C11279p.m20012a(bool);
            if (bVar != null) {
                DataChannelGlobal.f42558d.mo28321a(C9012af.class, bVar);
            }
            if (aVar != null) {
                DataChannelGlobal.f42558d.mo28321a(C9115e.class, aVar);
            }
            if (this.f22053a.f22034f) {
                C8946h hVar = this.f22053a;
                LiveButton liveButton = (LiveButton) hVar.mo8166a_(R.id.e6n);
                C89219l.m154716b(liveButton, "");
                hVar.mo15195a(liveButton);
                C8946h hVar2 = this.f22053a;
                ImageView imageView = (ImageView) hVar2.mo8166a_(R.id.e6o);
                C89219l.m154716b(imageView, "");
                hVar2.mo15195a(imageView);
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.hashtag.h$l */
    static final class C8958l extends AbstractC89220m implements AbstractC89172b<C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C8946h f22051a;

        static {
            Covode.recordClassIndex(9850);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8958l(C8946h hVar) {
            super(1);
            this.f22051a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C89391z zVar) {
            C89219l.m154721d(zVar, "");
            this.f22051a.dismiss();
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C8962i m17289a(C8946h hVar) {
        C8962i iVar = hVar.f22031c;
        if (iVar == null) {
            C89219l.m154710a("mAdapter");
        }
        return iVar;
    }

    /* renamed from: com.bytedance.android.livesdk.hashtag.h$c */
    static final class C8949c<T, R> implements AbstractC88434g {

        /* renamed from: a */
        public static final C8949c f22042a = new C8949c();

        static {
            Covode.recordClassIndex(9841);
        }

        C8949c() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C5827a aVar = (C5827a) obj;
            C89219l.m154721d(aVar, "");
            return new C8641a(aVar.f14684b, (C2965a) aVar.f14685c);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.hashtag.h$e */
    static final class C8951e<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C8946h f22044a;

        static {
            Covode.recordClassIndex(9843);
        }

        C8951e(C8946h hVar) {
            this.f22044a = hVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C8946h.m17289a(this.f22044a).f22056a = 2;
            C3854a.m9453a(6, "HashtagAudienceDialog", "failed to fetch feeds!");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.hashtag.h$f */
    public static final class C8952f<T, R> implements AbstractC88434g {

        /* renamed from: a */
        public static final C8952f f22045a = new C8952f();

        static {
            Covode.recordClassIndex(9844);
        }

        C8952f() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C5827a aVar = (C5827a) obj;
            C89219l.m154721d(aVar, "");
            return new C8641a(aVar.f14684b, (C2965a) aVar.f14685c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.hashtag.h$h */
    public static final class C8954h<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C8946h f22047a;

        static {
            Covode.recordClassIndex(9846);
        }

        C8954h(C8946h hVar) {
            this.f22047a = hVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            ((StateLayout) this.f22047a.mo8166a_(R.id.bdl)).mo9406a("ERROR");
            C3854a.m9453a(6, "HashtagAudienceDialog", "failed to fetch feeds!");
        }
    }

    /* renamed from: a */
    public final void mo15195a(View view) {
        view.setVisibility(0);
        C8966k.m17306a("show");
        view.setOnClickListener(new View$OnClickListenerC8948b(view, this));
    }

    /* renamed from: com.bytedance.android.livesdk.hashtag.h$d */
    static final class C8950d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C8946h f22043a;

        static {
            Covode.recordClassIndex(9842);
        }

        C8950d(C8946h hVar) {
            this.f22043a = hVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            long j;
            C2965a aVar;
            List<FeedItem> list;
            C8641a aVar2 = (C8641a) obj;
            if (!(aVar2 == null || (list = aVar2.f21360a) == null)) {
                if (list.isEmpty()) {
                    C8946h.m17289a(this.f22043a).f22056a = 3;
                    C8946h.m17289a(this.f22043a).notifyDataSetChanged();
                } else {
                    C8946h.m17289a(this.f22043a).f22056a = 2;
                    C8946h.m17289a(this.f22043a).mo15198a(list);
                }
            }
            C8946h hVar = this.f22043a;
            if (aVar2 == null || (aVar = aVar2.f21361b) == null) {
                j = 0;
            } else {
                j = aVar.f8718d;
            }
            hVar.f22033e = j;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.hashtag.h$g */
    public static final class C8953g<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C8946h f22046a;

        static {
            Covode.recordClassIndex(9845);
        }

        C8953g(C8946h hVar) {
            this.f22046a = hVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            long j;
            C2965a aVar;
            List<FeedItem> list;
            String str;
            C8641a aVar2 = (C8641a) obj;
            if (!(aVar2 == null || (list = aVar2.f21360a) == null)) {
                if (!list.isEmpty()) {
                    ((StateLayout) this.f22046a.mo8166a_(R.id.bdl)).mo9406a("CONTENT");
                    C2965a aVar3 = aVar2.f21361b;
                    if (!(aVar3 == null || (str = aVar3.f8724j) == null)) {
                        LiveTextView liveTextView = (LiveTextView) this.f22046a.mo8166a_(R.id.bdp);
                        liveTextView.setText(str);
                        liveTextView.setVisibility(0);
                    }
                    C8946h.m17289a(this.f22046a).mo15198a(list);
                } else if (this.f22046a.f22034f) {
                    ((StateLayout) this.f22046a.mo8166a_(R.id.bdl)).mo9406a("WithGoLivePerm");
                } else {
                    ((StateLayout) this.f22046a.mo8166a_(R.id.bdl)).mo9406a("WithoutGoLivePerm");
                }
            }
            C8946h hVar = this.f22046a;
            if (aVar2 == null || (aVar = aVar2.f21361b) == null) {
                j = 0;
            } else {
                j = aVar.f8718d;
            }
            hVar.f22033e = j;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.hashtag.h$i */
    static final class C8955i extends AbstractC89220m implements AbstractC89172b<Room, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C8946h f22048a;

        static {
            Covode.recordClassIndex(9847);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8955i(C8946h hVar) {
            super(1);
            this.f22048a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Room room) {
            Room room2 = room;
            C89219l.m154721d(room2, "");
            this.f22048a.dismiss();
            EnterRoomConfig a = C11760a.m20718a(room2, false);
            a.f28233c.f28295L = "hashtag";
            a.f28233c.f28293J = "live_detail";
            EnterRoomLinkSession.m20943a(a).mo18994a(new Event("hashtag_enter_room", 4864, EnumC11866b.BussinessApiCall));
            C6779a.m14563a().mo13053a(new C8452e(room2.getId(), a));
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.hashtag.h$b */
    public static final class View$OnClickListenerC8948b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ View f22040a;

        /* renamed from: b */
        final /* synthetic */ C8946h f22041b;

        static {
            Covode.recordClassIndex(9840);
        }

        View$OnClickListenerC8948b(View view, C8946h hVar) {
            this.f22040a = view;
            this.f22041b = hVar;
        }

        public final void onClick(View view) {
            long j;
            Hashtag hashtag;
            Long l;
            Hashtag hashtag2;
            String str;
            String a;
            if (System.currentTimeMillis() - this.f22041b.f22032d > 500) {
                String str2 = "";
                C89219l.m154716b(view, str2);
                if (view.getAlpha() >= 0.01f) {
                    this.f22041b.f22032d = System.currentTimeMillis();
                    C8966k.m17306a("click");
                    DataChannel dataChannel = this.f22041b.f27010p;
                    if (!(dataChannel == null || (hashtag2 = (Hashtag) dataChannel.mo28318b(C9023aq.class)) == null || (str = hashtag2.title) == null || (a = C89361p.m154869a(str, "&", "%26", false)) == null)) {
                        str2 = a;
                    }
                    DataChannel dataChannel2 = this.f22041b.f27010p;
                    if (dataChannel2 == null || (hashtag = (Hashtag) dataChannel2.mo28318b(C9023aq.class)) == null || (l = hashtag.f23083id) == null) {
                        j = 0;
                    } else {
                        j = l.longValue();
                    }
                    ((IHostAction) C6193a.m13435a(IHostAction.class)).handleSchema(C11279p.m20001a(this.f22040a.getContext()), "sslocal://openRecord?enter_from=direct_shoot&tab=live&".concat(String.valueOf("source_params={\"hashtag_title\":\"" + str2 + "\",\"hashtag_id\":" + j + ",\"request_from\":hashtag}")), new Bundle());
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.hashtag.h$o */
    static final class C8961o implements AppBarLayout.AbstractC26571c {

        /* renamed from: a */
        final /* synthetic */ C8946h f22054a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89235b f22055b;

        static {
            Covode.recordClassIndex(9853);
        }

        C8961o(C8946h hVar, C89233z.C89235b bVar) {
            this.f22054a = hVar;
            this.f22055b = bVar;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.AbstractC26569a
        /* renamed from: a */
        public final void mo15197a(AppBarLayout appBarLayout, int i) {
            C89233z.C89235b bVar = this.f22055b;
            AppBarLayout appBarLayout2 = (AppBarLayout) this.f22054a.mo8166a_(R.id.kl);
            C89219l.m154716b(appBarLayout2, "");
            bVar.element = Math.abs(((float) i) / ((float) appBarLayout2.getTotalScrollRange()));
            if (this.f22055b.element > this.f22054a.f22036h) {
                ConstraintLayout constraintLayout = (ConstraintLayout) this.f22054a.mo8166a_(R.id.eiz);
                C89219l.m154716b(constraintLayout, "");
                constraintLayout.setAlpha(Math.min(((1.0f - (((1.0f - this.f22055b.element) * (1.0f - this.f22055b.element)) * (1.0f - this.f22055b.element))) - this.f22054a.f22036h) / (1.0f - this.f22054a.f22036h), 1.0f));
            } else {
                ConstraintLayout constraintLayout2 = (ConstraintLayout) this.f22054a.mo8166a_(R.id.eiz);
                C89219l.m154716b(constraintLayout2, "");
                constraintLayout2.setAlpha(0.0f);
            }
            if (this.f22055b.element > this.f22054a.f22035g) {
                ImageView imageView = (ImageView) this.f22054a.mo8166a_(R.id.e6o);
                C89219l.m154716b(imageView, "");
                imageView.setAlpha(Math.min((this.f22055b.element - this.f22054a.f22035g) / (1.0f - this.f22054a.f22035g), 1.0f));
                return;
            }
            ImageView imageView2 = (ImageView) this.f22054a.mo8166a_(R.id.e6o);
            C89219l.m154716b(imageView2, "");
            imageView2.setAlpha(0.0f);
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Room room;
        Hashtag hashtag;
        ImageModel imageModel;
        String str;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        DataChannel dataChannel = this.f27010p;
        if (dataChannel != null) {
            dataChannel.mo28309a((AbstractC1204m) this, C9052br.class, (AbstractC89172b) new C8958l(this));
        }
        DataChannel dataChannel2 = this.f27010p;
        String str2 = null;
        if (dataChannel2 != null) {
            room = (Room) dataChannel2.mo28318b(C9093de.class);
        } else {
            room = null;
        }
        this.f22029a = room;
        DataChannel dataChannel3 = this.f27010p;
        if (dataChannel3 != null) {
            hashtag = (Hashtag) dataChannel3.mo28318b(C9023aq.class);
        } else {
            hashtag = null;
        }
        ImageView imageView = (ImageView) mo8166a_(R.id.bdm);
        if (hashtag != null) {
            imageModel = hashtag.image;
        } else {
            imageModel = null;
        }
        C3951p.m9631b(imageView, imageModel, 2131234133, 2);
        LiveTextView liveTextView = (LiveTextView) mo8166a_(R.id.bdq);
        C89219l.m154716b(liveTextView, "");
        if (hashtag != null) {
            str = hashtag.title;
        } else {
            str = null;
        }
        liveTextView.setText(str);
        LiveTextView liveTextView2 = (LiveTextView) mo8166a_(R.id.bdr);
        C89219l.m154716b(liveTextView2, "");
        if (hashtag != null) {
            str2 = hashtag.title;
        }
        liveTextView2.setText(str2);
        ((AppBarLayout) mo8166a_(R.id.kl)).mo43717a(new C8961o(this, new C89233z.C89235b()));
        C8962i iVar = new C8962i(this.f27010p);
        C8955i iVar2 = new C8955i(this);
        C89219l.m154721d(iVar2, "");
        iVar.f22057b = iVar2;
        this.f22031c = iVar;
        this.f22037j = new C8931b(new C8959m(this));
        StateLayout stateLayout = (StateLayout) mo8166a_(R.id.bdl);
        stateLayout.mo9407a("WithoutGoLivePerm", R.layout.b60);
        stateLayout.mo9407a("WithGoLivePerm", R.layout.b5z);
        stateLayout.setOfflineClickListener(new C8956j(this));
        stateLayout.setErrorClickListener(new C8957k(this));
        RecyclerView recyclerView = (RecyclerView) mo8166a_(R.id.b0k);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new GridLayoutManager(2));
        C8962i iVar3 = this.f22031c;
        if (iVar3 == null) {
            C89219l.m154710a("mAdapter");
        }
        recyclerView.setAdapter(iVar3);
        recyclerView.mo4402a(new C8930a());
        C8931b bVar = this.f22037j;
        if (bVar == null) {
            C89219l.m154710a("feedRecyclerOnScrollListener");
        }
        recyclerView.mo4405a(bVar);
        mo9929d();
        ((IHostUser) C6193a.m13435a(IHostUser.class)).requestLivePermission(new C8960n(this));
    }
}
