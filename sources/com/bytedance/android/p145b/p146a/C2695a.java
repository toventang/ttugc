package com.bytedance.android.p145b.p146a;

import android.os.SystemClock;
import com.bytedance.android.live.base.model.p181c.C2965a;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.model.C9594m;
import com.bytedance.android.livesdk.model.C9897n;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Stack;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.android.b.a.a */
public final class C2695a {

    /* renamed from: g */
    public static final C2695a f8059g = C2697b.f8069a;

    /* renamed from: h */
    public static final C2696a f8060h = new C2696a((byte) 0);

    /* renamed from: a */
    public int f8061a;

    /* renamed from: b */
    public C2965a f8062b;

    /* renamed from: c */
    public String f8063c;

    /* renamed from: d */
    public String f8064d;

    /* renamed from: e */
    public long f8065e;

    /* renamed from: f */
    public long f8066f;

    /* renamed from: i */
    private final AbstractC89244h f8067i;

    /* renamed from: j */
    private final AbstractC89244h f8068j;

    /* renamed from: com.bytedance.android.b.a.a$f */
    static final class C2701f<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C2701f f8074a = new C2701f();

        static {
            Covode.recordClassIndex(3090);
        }

        C2701f() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: a */
    public final Stack<Long> mo7216a() {
        return (Stack) this.f8067i.getValue();
    }

    /* renamed from: b */
    public final HashSet<FeedItem> mo7219b() {
        return (HashSet) this.f8068j.getValue();
    }

    /* renamed from: com.bytedance.android.b.a.a$a */
    public static final class C2696a {
        static {
            Covode.recordClassIndex(3085);
        }

        private C2696a() {
        }

        public /* synthetic */ C2696a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.b.a.a$b */
    static final class C2697b {

        /* renamed from: a */
        static final C2695a f8069a = new C2695a((byte) 0);

        /* renamed from: b */
        public static final C2697b f8070b = new C2697b();

        private C2697b() {
        }

        static {
            Covode.recordClassIndex(3086);
        }
    }

    /* renamed from: com.bytedance.android.b.a.a$c */
    static final class C2698c extends AbstractC89220m implements AbstractC89171a<HashSet<FeedItem>> {

        /* renamed from: a */
        public static final C2698c f8071a = new C2698c();

        static {
            Covode.recordClassIndex(3087);
        }

        C2698c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ HashSet<FeedItem> invoke() {
            return new HashSet();
        }
    }

    /* renamed from: com.bytedance.android.b.a.a$d */
    static final class C2699d extends AbstractC89220m implements AbstractC89171a<Stack<Long>> {

        /* renamed from: a */
        public static final C2699d f8072a = new C2699d();

        static {
            Covode.recordClassIndex(3088);
        }

        C2699d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Stack<Long> invoke() {
            return new Stack();
        }
    }

    static {
        Covode.recordClassIndex(3084);
    }

    private C2695a() {
        this.f8063c = "scroll";
        this.f8064d = "drawer";
        this.f8067i = C89250i.m154773a((AbstractC89171a) C2699d.f8072a);
        this.f8068j = C89250i.m154773a((AbstractC89171a) C2698c.f8071a);
    }

    /* renamed from: c */
    public final int mo7220c() {
        C9897n nVar;
        C2965a aVar = this.f8062b;
        if (aVar == null) {
            return 0;
        }
        List<C9594m> list = null;
        if (aVar.f8721g == null) {
            return 0;
        }
        C2965a aVar2 = this.f8062b;
        if (!(aVar2 == null || (nVar = aVar2.f8721g) == null)) {
            list = nVar.f23957a;
        }
        if (!C13603b.m24435a((Collection) list)) {
            return 1;
        }
        return 0;
    }

    /* renamed from: d */
    public final void mo7221d() {
        Room room;
        String str = "";
        for (T t : mo7219b()) {
            if (!(t == null || (room = t.getRoom()) == null)) {
                str = str + room.getId() + ",";
            }
        }
        if (C89361p.m154876c(str, ",", false)) {
            Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
            str = str.substring(0, str.length() - 1);
            C89219l.m154716b(str, "");
        }
        if (!C13627m.m24498a(str)) {
            C2965a aVar = this.f8062b;
            String str2 = null;
            if (!C13627m.m24498a(aVar != null ? aVar.f8716b : null)) {
                RoomRetrofitApi roomRetrofitApi = (RoomRetrofitApi) C5805e.m12718a().mo11572a(RoomRetrofitApi.class);
                C2965a aVar2 = this.f8062b;
                if (aVar2 != null) {
                    str2 = aVar2.f8716b;
                }
                roomRetrofitApi.collectUnreadRequest(str2, str).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C2700e(this), C2701f.f8074a);
                mo7219b().clear();
            }
        }
    }

    public /* synthetic */ C2695a(byte b) {
        this();
    }

    /* renamed from: a */
    public final void mo7217a(FeedItem feedItem) {
        C89219l.m154721d(feedItem, "");
        mo7219b().remove(feedItem);
    }

    /* renamed from: com.bytedance.android.b.a.a$e */
    static final class C2700e<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C2695a f8073a;

        static {
            Covode.recordClassIndex(3089);
        }

        C2700e(C2695a aVar) {
            this.f8073a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C3854a.m9453a(3, "FeedDataManager", "Collecting unread room result, extra:" + this.f8073a.f8062b + ", statusCode: " + ((C5832d) obj).statusCode + '.');
        }
    }

    /* renamed from: a */
    public final void mo7218a(boolean z, DataChannel dataChannel) {
        if (this.f8065e == 0) {
            return;
        }
        if (mo7216a().size() == 0 || z) {
            C6501b.C6502a.m13948a("livesdk_explore_total_duration").mo12643a(dataChannel).mo12645a("has_banner", mo7220c()).mo12646a("duration", SystemClock.elapsedRealtime() - this.f8065e).mo12645a("total_explore_level", this.f8061a).mo12655b();
            this.f8065e = 0;
            this.f8061a = 0;
        }
    }
}
