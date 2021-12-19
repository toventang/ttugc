package com.bytedance.android.live.liveinteract.cohost.p263a.p267d;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.liveinteract.api.EnumC4440k;
import com.bytedance.android.live.liveinteract.api.EnumC4442m;
import com.bytedance.android.live.liveinteract.api.p260a.C4384b;
import com.bytedance.android.live.liveinteract.api.p262c.AbstractC4430d;
import com.bytedance.android.live.liveinteract.api.p262c.C4431e;
import com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4462b;
import com.bytedance.android.live.liveinteract.cohost.p263a.p265b.C4499j;
import com.bytedance.android.live.liveinteract.cohost.p263a.p265b.C4500k;
import com.bytedance.android.live.liveinteract.cohost.p263a.p268e.C4595b;
import com.bytedance.android.live.liveinteract.cohost.p270c.C4616a;
import com.bytedance.android.live.liveinteract.cohost.p279ui.p283d.C4702a;
import com.bytedance.android.live.liveinteract.cohost.p279ui.p283d.C4703b;
import com.bytedance.android.live.liveinteract.cohost.p279ui.p283d.C4704c;
import com.bytedance.android.live.liveinteract.cohost.p279ui.p283d.C4705d;
import com.bytedance.android.live.liveinteract.cohost.p279ui.p283d.C4706e;
import com.bytedance.android.live.liveinteract.cohost.p279ui.p283d.C4707f;
import com.bytedance.android.live.liveinteract.cohost.p279ui.p284e.C4708a;
import com.bytedance.android.live.liveinteract.cohost.remote.api.CoHostApi;
import com.bytedance.android.live.liveinteract.platform.common.api.C5672a;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5713h;
import com.bytedance.android.live.liveinteract.platform.p363a.AbstractC5651b;
import com.bytedance.android.live.liveinteract.platform.p363a.C5659c;
import com.bytedance.android.live.liveinteract.platform.p363a.p364a.C5647a;
import com.bytedance.android.live.liveinteract.platform.p363a.p364a.C5650b;
import com.bytedance.android.live.liveinteract.platform.p363a.p366c.C5661a;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.network.response.C5830b;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.livesdk.chatroom.interact.model.C7610h;
import com.bytedance.android.livesdk.chatroom.interact.model.C7611i;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalsListExtra;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveCoHostInviteePanelDismissSetting;
import com.bytedance.android.livesdk.p450an.C6800c;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11137ac;
import com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11181z;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C13617h;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.p2082ss.android.ugc.trill.R;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4628j.p4629a.p4630a.C89397d;

/* renamed from: com.bytedance.android.live.liveinteract.cohost.a.d.b */
public final class C4542b extends C4462b.AbstractC4463a {

    /* renamed from: t */
    public static final C4544a f12137t = new C4544a((byte) 0);

    /* renamed from: j */
    public List<? extends Room> f12138j = C89086z.INSTANCE;

    /* renamed from: k */
    public List<? extends Room> f12139k = C89086z.INSTANCE;

    /* renamed from: l */
    public Map<Long, ? extends C7610h> f12140l = C89041ag.m154415a();

    /* renamed from: m */
    public boolean f12141m;

    /* renamed from: n */
    public int f12142n;

    /* renamed from: o */
    public String f12143o = "";

    /* renamed from: p */
    public C7611i.C7612a f12144p;

    /* renamed from: q */
    public boolean f12145q;
    @AbstractC4430d(mo10204a = "LINKER_MANAGER")

    /* renamed from: r */
    public C5659c f12146r;

    /* renamed from: s */
    public final DataChannel f12147s;

    /* renamed from: u */
    private HashSet<Long> f12148u = new HashSet<>();

    /* renamed from: v */
    private final C88411a f12149v = new C88411a();

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.d.b$b */
    public enum EnumC4545b {
        TYPE_FRIEND_TITLE,
        TYPE_RECOMMEND_TITLE;

        static {
            Covode.recordClassIndex(5121);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.d.b$c */
    public enum EnumC4546c {
        TYPE_FRIEND_USER,
        TYPE_RECOMMEND_USER;

        static {
            Covode.recordClassIndex(5122);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.d.b$l */
    static final class C4555l<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C4555l f12162a = new C4555l();

        static {
            Covode.recordClassIndex(5131);
        }

        C4555l() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(5118);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.d.b$a */
    public static final class C4544a {
        static {
            Covode.recordClassIndex(5120);
        }

        private C4544a() {
        }

        public /* synthetic */ C4544a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.d.b$i */
    public static final class C4552i extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        final /* synthetic */ C4542b f12158a;

        static {
            Covode.recordClassIndex(5128);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4552i(C4542b bVar) {
            super(0);
            this.f12158a = bVar;
        }

        /* renamed from: a */
        public final int mo10284a() {
            return this.f12158a.f12138j.size();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(mo10284a());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.d.b$j */
    public static final class C4553j extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        final /* synthetic */ C4542b f12159a;

        /* renamed from: b */
        final /* synthetic */ C4551h f12160b;

        static {
            Covode.recordClassIndex(5129);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4553j(C4542b bVar, C4551h hVar) {
            super(0);
            this.f12159a = bVar;
            this.f12160b = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(mo10285a());
        }

        /* renamed from: a */
        public final int mo10285a() {
            Iterator<T> it = this.f12159a.f12138j.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (this.f12160b.mo10283a(it.next())) {
                    i++;
                }
            }
            return i;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4462b.AbstractC4463a
    /* renamed from: d */
    public final void mo10233d() {
        this.f12046c--;
        this.f12047d--;
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4469d.AbstractC4470a
    /* renamed from: g */
    public final void mo10251g() {
        this.f12149v.mo142944a();
        this.f12147s.mo28316b(this);
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4462b.AbstractC4463a
    /* renamed from: c */
    public final void mo10232c() {
        int i = this.f12046c - 1;
        int i2 = this.f12045b;
        int i3 = 0;
        while (i3 < i2) {
            this.f12048e.remove(i);
            i3++;
            i--;
        }
        this.f12046c = i + 1;
        this.f12044a = true;
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4462b.AbstractC4463a
    /* renamed from: e */
    public final void mo10234e() {
        AbstractC88979t<C5832d<Void>> a = C5672a.m12412a(2, true);
        if (a != null) {
            ((AbstractC11181z) a.mo143274a(mo10250f())).mo17950a(C4554k.f12161a, C4555l.f12162a);
        }
    }

    /* renamed from: k */
    private static C4703b m10608k() {
        Room room = C4384b.C4385a.m10496a().f11977y;
        if (room == null) {
            C89219l.m154715b();
        }
        return new C4703b(room, C4384b.C4385a.m10496a().f11968p, C4384b.C4385a.m10496a().f11978z, C4384b.C4385a.m10496a().f11976x);
    }

    /* renamed from: l */
    private static boolean m10609l() {
        EnumC4440k b = C4384b.C4385a.m10496a().mo10151b();
        if (LiveCoHostInviteePanelDismissSetting.INSTANCE.getValue() != 2 || b != EnumC4440k.INVITING || C4384b.C4385a.m10496a().f11924N < 0 || C4384b.C4385a.m10496a().f11977y == null) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4462b.AbstractC4463a
    /* renamed from: b */
    public final void mo10231b() {
        C4556m mVar = new C4556m(this);
        int i = this.f12046c - 1;
        int size = this.f12138j.size();
        for (int i2 = this.f12142n; i2 < size; i2++) {
            C4703b a = mVar.mo10286a(i2);
            if (a != null) {
                i++;
                this.f12048e.add(i, a);
            }
        }
        this.f12046c = i + 1;
        this.f12044a = false;
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4462b.AbstractC4463a
    /* renamed from: a */
    public final void mo10229a() {
        long j;
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        CoHostApi coHostApi = (CoHostApi) C5805e.m12718a().mo11572a(CoHostApi.class);
        if (room != null) {
            j = room.getId();
        } else {
            j = 0;
        }
        Calendar instance = Calendar.getInstance();
        C89219l.m154716b(instance, "");
        TimeZone timeZone = instance.getTimeZone();
        C89219l.m154716b(timeZone, "");
        String id = timeZone.getID();
        Calendar instance2 = Calendar.getInstance();
        C89219l.m154716b(instance2, "");
        ((AbstractC11181z) coHostApi.rivalsList(1, j, id, instance2.getTimeZone().getOffset(System.currentTimeMillis()) / 1000).mo143271a(new C11191f()).mo143274a(mo10250f())).mo17950a(new C4547d(this), new C4548e(this));
    }

    /* renamed from: i */
    public final void mo10281i() {
        C4462b.AbstractC4464b bVar;
        C89397d dVar = this.f12048e;
        C89219l.m154716b(dVar, "");
        int i = 0;
        for (Object obj : dVar) {
            int i2 = i + 1;
            if (i < 0) {
                C89070n.m154520a();
            }
            if ((obj instanceof C4703b) && ((this.f12054i.f11961i == 0 || ((C4703b) obj).f12429a.getId() == this.f12054i.f11961i) && (bVar = (C4462b.AbstractC4464b) this.f12053h) != null)) {
                bVar.mo10235a(i);
            }
            i = i2;
        }
    }

    /* renamed from: j */
    public final Pair<Boolean, Integer> mo10282j() {
        C4551h hVar = new C4551h(this);
        C4552i iVar = new C4552i(this);
        C4553j jVar = new C4553j(this, hVar);
        int a = iVar.mo10284a();
        int a2 = jVar.mo10285a();
        if (a2 <= 3 && a <= 3) {
            return new Pair<>(false, Integer.valueOf(a));
        }
        if (a2 <= 3) {
            return new Pair<>(true, 3);
        }
        if (a2 < a) {
            return new Pair<>(true, Integer.valueOf(a2));
        }
        return new Pair<>(false, Integer.valueOf(a2));
    }

    /* renamed from: h */
    public final C89397d mo10280h() {
        this.f12148u.clear();
        this.f12048e = new C89397d();
        C6805b<Boolean> bVar = AbstractC6804a.f16970bS;
        C89219l.m154716b(bVar, "");
        Boolean a = bVar.mo13066a();
        C6805b<Boolean> bVar2 = AbstractC6804a.f16971bT;
        C89219l.m154716b(bVar2, "");
        Boolean a2 = bVar2.mo13066a();
        C6805b<Boolean> bVar3 = AbstractC6804a.f17034ch;
        C89219l.m154716b(bVar3, "");
        Boolean a3 = bVar3.mo13066a();
        C89219l.m154716b(a, "");
        if (a.booleanValue() && !a2.booleanValue() && !a3.booleanValue()) {
            C6805b<Boolean> bVar4 = AbstractC6804a.f17034ch;
            C89219l.m154716b(bVar4, "");
            C6806c.m14603a((C6800c) bVar4, (Object) true);
            C89397d dVar = this.f12048e;
            C89219l.m154716b(dVar, "");
            dVar.add(new C4706e());
        }
        if (this.f12145q) {
            C89397d dVar2 = this.f12048e;
            C7611i.C7612a aVar = this.f12144p;
            if (aVar == null) {
                C89219l.m154715b();
            }
            dVar2.add(new C4705d(aVar));
            this.f12047d = this.f12048e.size() - 1;
            if (!this.f12138j.isEmpty()) {
                m10606a(EnumC4545b.TYPE_FRIEND_TITLE);
                m10607a(EnumC4546c.TYPE_FRIEND_USER);
            }
        } else {
            m10606a(EnumC4545b.TYPE_FRIEND_TITLE);
            if (!this.f12138j.isEmpty()) {
                m10607a(EnumC4546c.TYPE_FRIEND_USER);
            } else {
                this.f12048e.add(new C4704c());
            }
        }
        if (this.f12141m) {
            this.f12048e.add(new C4702a());
            this.f12046c = this.f12048e.size() - 1;
        }
        m10606a(EnumC4545b.TYPE_RECOMMEND_TITLE);
        m10607a(EnumC4546c.TYPE_RECOMMEND_USER);
        C89397d dVar3 = this.f12048e;
        C89219l.m154716b(dVar3, "");
        return dVar3;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.d.b$e */
    static final class C4548e<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C4542b f12154a;

        static {
            Covode.recordClassIndex(5124);
        }

        C4548e(C4542b bVar) {
            this.f12154a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C4462b.AbstractC4464b bVar = (C4462b.AbstractC4464b) this.f12154a.f12053h;
            if (bVar != null) {
                bVar.mo10237a(th);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.d.b$g */
    static final class C4550g<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C4542b f12156a;

        static {
            Covode.recordClassIndex(5126);
        }

        C4550g(C4542b bVar) {
            this.f12156a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C4462b.AbstractC4464b bVar = (C4462b.AbstractC4464b) this.f12156a.f12053h;
            if (bVar != null) {
                bVar.mo10240b(th);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.d.b$h */
    public static final class C4551h extends AbstractC89220m implements AbstractC89172b<Room, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C4542b f12157a;

        static {
            Covode.recordClassIndex(5127);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4551h(C4542b bVar) {
            super(1);
            this.f12157a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Room room) {
            return Boolean.valueOf(mo10283a(room));
        }

        /* renamed from: a */
        public final boolean mo10283a(Room room) {
            C89219l.m154721d(room, "");
            C7610h hVar = (C7610h) this.f12157a.f12140l.get(Long.valueOf(room.getId()));
            if (hVar == null || hVar.f18898f == 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.d.b$k */
    static final class C4554k<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C4554k f12161a = new C4554k();

        static {
            Covode.recordClassIndex(5130);
        }

        C4554k() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C6805b<Boolean> bVar = AbstractC6804a.f16971bT;
            C89219l.m154716b(bVar, "");
            C6806c.m14603a((C6800c) bVar, (Object) true);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.d.b$m */
    static final class C4556m extends AbstractC89220m implements AbstractC89172b<Integer, C4703b> {

        /* renamed from: a */
        final /* synthetic */ C4542b f12163a;

        static {
            Covode.recordClassIndex(5132);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4556m(C4542b bVar) {
            super(1);
            this.f12163a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C4703b invoke(Integer num) {
            return mo10286a(num.intValue());
        }

        /* renamed from: a */
        public final C4703b mo10286a(int i) {
            if (i >= this.f12163a.f12138j.size()) {
                return null;
            }
            Room room = (Room) this.f12163a.f12138j.get(i);
            C7610h hVar = (C7610h) this.f12163a.f12140l.get(Long.valueOf(room.getId()));
            if (hVar == null) {
                return null;
            }
            return new C4703b(room, EnumC4442m.FOLLOW_INVITE, hVar, this.f12163a.f12143o);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.d.b$f */
    static final class C4549f<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C4542b f12155a;

        static {
            Covode.recordClassIndex(5125);
        }

        C4549f(C4542b bVar) {
            this.f12155a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C4462b.AbstractC4464b bVar;
            C5661a aVar = (C5661a) obj;
            if (aVar.f14391a instanceof C5832d) {
                Object obj2 = aVar.f14391a;
                Objects.requireNonNull(obj2, "null cannot be cast to non-null type com.bytedance.android.live.network.response.Response<com.bytedance.android.livesdk.chatroom.interact.model.LinkInviteResult>");
                C5832d dVar = (C5832d) obj2;
                if (dVar != null && dVar.data != null && (bVar = (C4462b.AbstractC4464b) this.f12155a.f12053h) != null) {
                    bVar.mo10239b();
                }
            }
        }
    }

    /* renamed from: a */
    private final void m10606a(EnumC4545b bVar) {
        C4707f fVar;
        C89397d dVar = this.f12048e;
        if (bVar == EnumC4545b.TYPE_FRIEND_TITLE) {
            String a = C3966y.m9657a((int) R.string.dxb);
            C89219l.m154716b(a, "");
            fVar = new C4707f(a);
        } else {
            String a2 = C3966y.m9657a((int) R.string.e4m);
            C89219l.m154716b(a2, "");
            fVar = new C4707f(a2);
        }
        dVar.add(fVar);
    }

    /* renamed from: a */
    private final void m10607a(EnumC4546c cVar) {
        List<? extends Room> list;
        EnumC4442m mVar;
        if (cVar == EnumC4546c.TYPE_FRIEND_USER) {
            if (this.f12142n < this.f12138j.size()) {
                this.f12044a = true;
                this.f12045b = this.f12138j.size() - this.f12142n;
            }
            list = C89070n.m154571d((Iterable) this.f12138j, this.f12142n);
        } else {
            list = this.f12139k;
        }
        if (m10609l()) {
            Room room = this.f12054i.f11977y;
            if (room != null) {
                long ownerUserId = room.getOwnerUserId();
                if (this.f12054i.f11968p == EnumC4442m.FOLLOW_INVITE && cVar == EnumC4546c.TYPE_FRIEND_USER && !this.f12148u.contains(Long.valueOf(ownerUserId))) {
                    this.f12048e.add(m10608k());
                    this.f12148u.add(Long.valueOf(ownerUserId));
                } else if (this.f12054i.f11968p == EnumC4442m.RECOMMEND_INVITE && cVar == EnumC4546c.TYPE_RECOMMEND_USER && !this.f12148u.contains(Long.valueOf(ownerUserId))) {
                    this.f12048e.add(m10608k());
                    this.f12148u.add(Long.valueOf(ownerUserId));
                }
            } else {
                return;
            }
        }
        C89397d dVar = this.f12048e;
        for (T t : list) {
            C7610h hVar = (C7610h) this.f12140l.get(Long.valueOf(t.getId()));
            if (hVar != null) {
                if (cVar == EnumC4546c.TYPE_FRIEND_USER) {
                    mVar = EnumC4442m.FOLLOW_INVITE;
                } else {
                    mVar = EnumC4442m.RECOMMEND_INVITE;
                }
                if (!this.f12148u.contains(Long.valueOf(t.getOwnerUserId()))) {
                    dVar.add(new C4703b(t, mVar, hVar, this.f12143o));
                    this.f12148u.add(Long.valueOf(t.getOwnerUserId()));
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.d.b$d */
    static final class C4547d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C4542b f12153a;

        static {
            Covode.recordClassIndex(5123);
        }

        C4547d(C4542b bVar) {
            this.f12153a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            List<? extends Room> list;
            List<? extends Room> list2;
            Map<Long, ? extends C7610h> map;
            C7611i.C7612a aVar;
            boolean z;
            List<Room> list3;
            Map<Long, C7610h> map2;
            C4462b.AbstractC4464b bVar;
            Map<Long, C7610h> map3;
            List<Room> list4;
            List<Room> list5;
            C5830b bVar2 = (C5830b) obj;
            this.f12153a.f12046c = -1;
            C4708a.EnumC4711c cVar = C4708a.EnumC4711c.SHRINK;
            C89219l.m154721d(cVar, "");
            C4708a.f12438b = cVar;
            C4542b bVar3 = this.f12153a;
            RivalsListExtra rivalsListExtra = (RivalsListExtra) bVar2.extra;
            if (rivalsListExtra == null || (str = rivalsListExtra.getRequestId()) == null) {
                str = "";
            }
            bVar3.f12143o = str;
            C4542b bVar4 = this.f12153a;
            T t = bVar2.data;
            if (t == null || (list5 = t.f18899a) == null || (list = C89070n.m154580f((Iterable) list5)) == null) {
                list = C89086z.INSTANCE;
            }
            bVar4.f12138j = list;
            C4542b bVar5 = this.f12153a;
            T t2 = bVar2.data;
            if (t2 == null || (list4 = t2.f18900b) == null || (list2 = C89070n.m154580f((Iterable) list4)) == null) {
                list2 = C89086z.INSTANCE;
            }
            bVar5.f12139k = list2;
            C4542b bVar6 = this.f12153a;
            T t3 = bVar2.data;
            boolean z2 = false;
            if (t3 == null || (map3 = t3.f18901c) == null) {
                map = C89041ag.m154415a();
            } else {
                map = new LinkedHashMap<>();
                for (Map.Entry<Long, C7610h> entry : map3.entrySet()) {
                    if (entry.getKey() != null || entry.getValue() != null) {
                        map.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            bVar6.f12140l = map;
            Pair<Boolean, Integer> j = this.f12153a.mo10282j();
            C4542b bVar7 = this.f12153a;
            Object obj2 = j.first;
            C89219l.m154716b(obj2, "");
            bVar7.f12141m = ((Boolean) obj2).booleanValue();
            C4542b bVar8 = this.f12153a;
            Object obj3 = j.second;
            C89219l.m154716b(obj3, "");
            bVar8.f12142n = ((Number) obj3).intValue();
            C4542b bVar9 = this.f12153a;
            T t4 = bVar2.data;
            if (t4 != null) {
                aVar = t4.f18902d;
            } else {
                aVar = null;
            }
            bVar9.f12144p = aVar;
            C4542b bVar10 = this.f12153a;
            C7611i.C7612a aVar2 = bVar10.f12144p;
            if (aVar2 == null || TextUtils.isEmpty(aVar2.f18903a) || TextUtils.isEmpty(aVar2.f18904b) || TextUtils.isEmpty(aVar2.f18905c)) {
                z = false;
            } else {
                z = true;
            }
            bVar10.f12145q = z;
            C4542b bVar11 = this.f12153a;
            bVar11.f12048e = bVar11.mo10280h();
            C4462b.AbstractC4464b bVar12 = (C4462b.AbstractC4464b) this.f12153a.f12053h;
            if (bVar12 != null) {
                C4542b bVar13 = this.f12153a;
                if (!C13617h.m24465a(bVar13.f12138j) || !C13617h.m24465a(bVar13.f12139k)) {
                    z2 = true;
                }
                bVar12.mo10238a(z2);
            }
            if (this.f12153a.f12145q) {
                C4462b.AbstractC4464b bVar14 = (C4462b.AbstractC4464b) this.f12153a.f12053h;
                if (bVar14 != null) {
                    bVar14.mo10236a(this.f12153a.f12144p);
                }
                if (C4595b.m10702b() && (bVar = (C4462b.AbstractC4464b) this.f12153a.f12053h) != null) {
                    bVar.mo10241g_();
                }
            }
            this.f12153a.mo10281i();
            T t5 = bVar2.data;
            if (!(t5 == null || (list3 = t5.f18899a) == null)) {
                for (T t6 : list3) {
                    T t7 = bVar2.data;
                    if (!(t7 == null || (map2 = t7.f18901c) == null)) {
                        C89219l.m154716b(t6, "");
                        if (map2.containsKey(Long.valueOf(t6.getId()))) {
                            this.f12153a.f12049f++;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4542b(C4462b.AbstractC4464b bVar, DataChannel dataChannel) {
        super(bVar);
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(dataChannel, "");
        this.f12147s = dataChannel;
        C4431e.f12034a.mo10201a(this);
        dataChannel.mo28310a(C4500k.class, (AbstractC89172b) new AbstractC89172b<Integer, C89391z>(this) {
            /* class com.bytedance.android.live.liveinteract.cohost.p263a.p267d.C4542b.C45431 */

            /* renamed from: a */
            final /* synthetic */ C4542b f12150a;

            static {
                Covode.recordClassIndex(5119);
            }

            {
                this.f12150a = r2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(Integer num) {
                num.intValue();
                this.f12150a.mo10281i();
                return C89391z.f203057a;
            }
        });
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4462b.AbstractC4463a
    /* renamed from: a */
    public final void mo10230a(Room room, EnumC4442m mVar) {
        Room room2;
        AbstractC88403ab<C5661a> a;
        AbstractC11137ac acVar;
        C89219l.m154721d(room, "");
        C89219l.m154721d(mVar, "");
        if (this.f12054i.f11957e <= 0 && !C4384b.C4385a.m10496a().f11943af && (room2 = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class)) != null) {
            long id = room2.getId();
            long id2 = room.getId();
            C4431e.f12034a.mo10198a(new C4616a(), null);
            C5650b bVar = new C5650b();
            bVar.f14365b = true;
            bVar.f14366c = true;
            C5659c cVar = this.f12146r;
            if (cVar == null) {
                C89219l.m154710a("mLinkerManager");
            }
            AbstractC6872f b = C11115u.m19743a().mo17915b();
            C89219l.m154716b(b, "");
            cVar.mo11440a(b.mo13161c(), C5647a.EnumC5648a.COHOST, this.f12147s, bVar);
            C4384b bVar2 = this.f12054i;
            bVar2.f11943af = true;
            bVar2.f11969q = true;
            bVar2.f11954b = true;
            bVar2.f11958f = room.getOwnerUserId();
            User owner = room.getOwner();
            C89219l.m154716b(owner, "");
            bVar2.f11959g = owner.getSecUid();
            bVar2.f11930T = room.getOwner();
            bVar2.f11961i = id2;
            bVar2.f11960h = id;
            this.f12054i.mo10152b(EnumC4440k.INVITING);
            this.f12147s.mo28319c(C4499j.class);
            HashMap hashMap = new HashMap();
            C5713h.m12510a(room, mVar, C4384b.C4385a.m10496a().f11976x);
            C4384b.C4385a.m10496a().f11929S = System.currentTimeMillis();
            C5659c cVar2 = this.f12146r;
            if (cVar2 == null) {
                C89219l.m154710a("mLinkerManager");
            }
            AbstractC5651b a2 = cVar2.mo11439a();
            if (a2 != null && (a = a2.mo10341a(hashMap)) != null && (acVar = (AbstractC11137ac) a.mo142916a(mo10250f())) != null) {
                acVar.mo17937a(new C4549f(this), new C4550g(this));
            }
        }
    }
}
