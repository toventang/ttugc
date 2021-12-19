package com.bytedance.android.live.liveinteract.cohost.p263a.p267d;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.AbstractC2994b;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.liveinteract.api.C4450t;
import com.bytedance.android.live.liveinteract.api.p260a.C4384b;
import com.bytedance.android.live.liveinteract.api.p262c.AbstractC4430d;
import com.bytedance.android.live.liveinteract.api.p262c.C4431e;
import com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4457a;
import com.bytedance.android.live.liveinteract.cohost.p263a.p265b.C4501l;
import com.bytedance.android.live.liveinteract.cohost.p263a.p266c.C4502a;
import com.bytedance.android.live.liveinteract.cohost.p270c.C4617b;
import com.bytedance.android.live.liveinteract.platform.common.api.C5672a;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5702a;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5721p;
import com.bytedance.android.live.liveinteract.platform.p363a.AbstractC5651b;
import com.bytedance.android.live.liveinteract.platform.p363a.C5659c;
import com.bytedance.android.live.liveinteract.platform.p363a.p366c.C5661a;
import com.bytedance.android.livesdk.chatroom.p488c.C7398o;
import com.bytedance.android.livesdk.p450an.C6800c;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11137ac;
import com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11181z;
import com.bytedance.android.livesdk.util.rxutils.autodispose.C11152e;
import com.bytedance.android.livesdk.utils.p654b.C11231b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.live.liveinteract.cohost.a.d.a */
public final class C4533a extends C4457a.AbstractC4458a {

    /* renamed from: a */
    private AbstractC88412b f12122a;
    @AbstractC4430d(mo10204a = "LINKER_MANAGER")

    /* renamed from: b */
    private final C5659c f12123b;

    /* renamed from: c */
    private final DataChannel f12124c;

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.d.a$c */
    static final class C4536c<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C4536c f12127a = new C4536c();

        static {
            Covode.recordClassIndex(5112);
        }

        C4536c() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(5109);
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4457a.AbstractC4458a
    /* renamed from: a */
    public final void mo10222a() {
        AbstractC88412b bVar = this.f12122a;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4457a.AbstractC4458a
    /* renamed from: b */
    public final void mo10225b() {
        ((AbstractC11181z) C5672a.m12412a(4, true).mo143274a(mo10250f())).mo17950a(C4534a.f12125a, C4535b.f12126a);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.d.a$f */
    static final class C4539f<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C4533a f12132a;

        static {
            Covode.recordClassIndex(5115);
        }

        C4539f(C4533a aVar) {
            this.f12132a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f12132a.mo10249a((Throwable) obj);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.d.a$a */
    static final class C4534a<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C4534a f12125a = new C4534a();

        static {
            Covode.recordClassIndex(5110);
        }

        C4534a() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C6806c.m14603a((C6800c) AbstractC6804a.f17035ci, (Object) true);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.d.a$b */
    static final class C4535b<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C4535b f12126a = new C4535b();

        static {
            Covode.recordClassIndex(5111);
        }

        C4535b() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C6806c.m14603a((C6800c) AbstractC6804a.f17035ci, (Object) true);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.d.a$e */
    static final class C4538e<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C4533a f12130a;

        /* renamed from: b */
        final /* synthetic */ int f12131b;

        static {
            Covode.recordClassIndex(5114);
        }

        C4538e(C4533a aVar, int i) {
            this.f12130a = aVar;
            this.f12131b = i;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            long longValue = ((Number) obj).longValue();
            C3854a.m9453a(4, "receive_count_down", "sec = ".concat(String.valueOf(longValue)));
            C4457a.AbstractC4459b bVar = (C4457a.AbstractC4459b) this.f12130a.f12053h;
            if (bVar != null) {
                bVar.mo10227a(this.f12131b, (int) longValue);
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4457a.AbstractC4458a
    /* renamed from: a */
    public final void mo10223a(int i) {
        C3854a.m9453a(4, "receive_count_down", "time = ".concat(String.valueOf(i)));
        this.f12122a = ((AbstractC11181z) C11231b.m19896a(1, TimeUnit.SECONDS).mo143276b((long) (i + 1)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143274a(C11152e.m19790a(this.f12053h.f12055a.mo10260e()))).mo17950a(new C4538e(this, i), new C4539f(this));
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.d.a$d */
    static final class C4537d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C4533a f12128a;

        /* renamed from: b */
        final /* synthetic */ HashMap f12129b;

        static {
            Covode.recordClassIndex(5113);
        }

        C4537d(C4533a aVar, HashMap hashMap) {
            this.f12128a = aVar;
            this.f12129b = hashMap;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            long j;
            long j2;
            String str;
            int i;
            Throwable th = (Throwable) obj;
            HashMap hashMap = this.f12129b;
            long id = ((Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class)).getId();
            if (hashMap.get("channel_id") != null) {
                j = ((Long) hashMap.get("channel_id")).longValue();
            } else {
                j = 0;
            }
            if (hashMap.get("inviter_uid") != null) {
                j2 = ((Long) hashMap.get("inviter_uid")).longValue();
            } else {
                j2 = 0;
            }
            if (hashMap.get("inviter_sec_uid") != null) {
                str = hashMap.get("inviter_sec_uid").toString();
            } else {
                str = "";
            }
            AbstractC2994b a = C11115u.m19743a().mo17915b().mo13147a();
            long id2 = a.getId();
            String secUid = a.getSecUid();
            if (hashMap.get("vendor") != null) {
                i = ((Integer) hashMap.get("vendor")).intValue();
            } else {
                i = 0;
            }
            C5721p.m12582a(id, j, j2, str, id2, secUid, String.valueOf(C5721p.f14513a), i, C5721p.EnumC5722a.FAILED_REPLY.f14523f, C5721p.EnumC5722a.FAILED_REPLY.f14524g, C5721p.m12578a(th), th.toString());
            this.f12128a.mo10249a(th);
        }
    }

    public C4533a(C4457a.AbstractC4459b bVar, DataChannel dataChannel) {
        super(bVar);
        this.f12124c = dataChannel;
        C4431e.f12034a.mo10201a(this);
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4457a.AbstractC4458a
    /* renamed from: a */
    public final void mo10224a(int i, long j, long j2, long j3) {
        String str;
        AbstractC5651b a;
        AbstractC88403ab<C5661a> b;
        AbstractC11137ac acVar;
        long j4 = 0;
        if (this.f12054i.f11957e == 0) {
            C4617b.m10735a();
            C4457a.AbstractC4459b bVar = (C4457a.AbstractC4459b) this.f12053h;
            if (bVar != null) {
                bVar.mo10226a();
                return;
            }
            return;
        }
        if (i == 1) {
            if (this.f12054i.f11975w && !TextUtils.isEmpty(this.f12054i.f11974v)) {
                C5702a.m12449a("LinkCross_Reply", "start Interact when reply click agree");
                this.f12054i.f11955c = true;
                DataChannel dataChannel = this.f12124c;
                if (dataChannel != null) {
                    dataChannel.mo28320c(C4450t.class, new C7398o(4));
                }
            }
            if (C4502a.m10585b()) {
                C4502a.m10578a(C4502a.EnumC4505b.EXIT);
            }
        }
        if (this.f12054i.f11958f != 0) {
            j3 = this.f12054i.f11958f;
        }
        C5702a.m12449a("LinkCross_Reply", "channelId:" + j + "; roomId:" + j2 + "; replyStatus:" + i + "; guestUserId:" + j3);
        DataChannel dataChannel2 = this.f12124c;
        if (dataChannel2 != null) {
            dataChannel2.mo28320c(C4501l.class, Integer.valueOf(i));
        }
        C4384b a2 = C4384b.C4385a.m10496a();
        HashMap hashMap = new HashMap();
        hashMap.put("channel_id", Long.valueOf(a2.f11957e));
        hashMap.put("inviter_uid", Long.valueOf(a2.f11958f));
        hashMap.put("inviter_sec_uid", a2.f11959g);
        hashMap.put("vendor", Integer.valueOf(a2.mo10153d().getValue()));
        C4384b a3 = C4384b.C4385a.m10496a();
        HashMap hashMap2 = new HashMap();
        if (a3.f11969q) {
            str = "inviter";
        } else {
            str = "invitee";
        }
        hashMap2.put("role_type", str);
        hashMap2.put("channel_id", Long.valueOf(a3.f11957e));
        hashMap2.put("guest_user_id", Long.valueOf(a3.f11958f));
        if (a3.f11922L != null) {
            String str2 = a3.f11922L;
            if (str2 == null) {
                str2 = "";
            }
            hashMap2.put("link_mic_id", str2);
        }
        if (a3.f11975w) {
            j4 = 1;
        }
        hashMap2.put("rtc_join_channel_advance", Long.valueOf(j4));
        HashMap hashMap3 = new HashMap();
        hashMap3.put("reply_status", Integer.valueOf(i));
        hashMap3.putAll(hashMap2);
        C5659c cVar = this.f12123b;
        if (!(cVar == null || (a = cVar.mo11439a()) == null || (b = a.mo10344b(hashMap3)) == null || (acVar = (AbstractC11137ac) b.mo142916a(mo10250f())) == null)) {
            acVar.mo17937a(C4536c.f12127a, new C4537d(this, hashMap));
        }
        C4457a.AbstractC4459b bVar2 = (C4457a.AbstractC4459b) this.f12053h;
        if (bVar2 != null) {
            bVar2.mo10226a();
        }
    }
}
