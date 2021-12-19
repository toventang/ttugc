package com.bytedance.android.live.liveinteract.cohost.p263a.p266c;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.liveinteract.api.C4395ai;
import com.bytedance.android.live.liveinteract.api.C4396aj;
import com.bytedance.android.live.liveinteract.api.C4397ak;
import com.bytedance.android.live.liveinteract.api.C4398al;
import com.bytedance.android.live.liveinteract.api.C4447q;
import com.bytedance.android.live.liveinteract.api.C4448r;
import com.bytedance.android.live.liveinteract.api.C4449s;
import com.bytedance.android.live.liveinteract.api.C4450t;
import com.bytedance.android.live.liveinteract.api.EnumC4440k;
import com.bytedance.android.live.liveinteract.api.EnumC4442m;
import com.bytedance.android.live.liveinteract.api.p260a.C4384b;
import com.bytedance.android.live.liveinteract.api.p262c.AbstractC4430d;
import com.bytedance.android.live.liveinteract.api.p262c.C4431e;
import com.bytedance.android.live.liveinteract.cohost.p263a.p268e.C4595b;
import com.bytedance.android.live.liveinteract.cohost.p270c.C4616a;
import com.bytedance.android.live.liveinteract.cohost.p279ui.p281b.C4662e;
import com.bytedance.android.live.liveinteract.cohost.p279ui.p281b.C4667f;
import com.bytedance.android.live.liveinteract.cohost.remote.api.CoHostApi;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5713h;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5737w;
import com.bytedance.android.live.liveinteract.platform.p363a.AbstractC5651b;
import com.bytedance.android.live.liveinteract.platform.p363a.C5659c;
import com.bytedance.android.live.liveinteract.platform.p363a.p364a.C5647a;
import com.bytedance.android.live.liveinteract.platform.p363a.p364a.C5650b;
import com.bytedance.android.live.liveinteract.platform.p363a.p366c.C5661a;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.livesdk.chatroom.interact.model.C7608g;
import com.bytedance.android.livesdk.chatroom.p488c.C7398o;
import com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostInviteTimeOutSetting;
import com.bytedance.android.livesdk.model.message.C9606aj;
import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.model.message.p580d.p590j.C9778a;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.p561j.C9068cg;
import com.bytedance.android.livesdk.p561j.C9071cj;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p561j.C9101dm;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.utils.C11264f;
import com.bytedance.android.livesdk.utils.p654b.C11231b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.ugc.live.sdk.message.data.IMessage;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.cohost.a.c.a */
public final class C4502a implements OnMessageListener {

    /* renamed from: a */
    static DataChannel f12069a;

    /* renamed from: b */
    static long f12070b;

    /* renamed from: c */
    public static long f12071c;

    /* renamed from: d */
    static final C88411a f12072d = new C88411a();

    /* renamed from: e */
    static AbstractC88412b f12073e;

    /* renamed from: f */
    static AbstractC88412b f12074f;

    /* renamed from: g */
    static AbstractC88412b f12075g;

    /* renamed from: h */
    static EnumC4509f f12076h = EnumC4509f.IDLE;

    /* renamed from: i */
    static List<AbstractC4503a> f12077i = new ArrayList();

    /* renamed from: j */
    static C4667f f12078j;

    /* renamed from: k */
    static C4662e f12079k;

    /* renamed from: l */
    public static long f12080l;

    /* renamed from: m */
    static boolean f12081m;

    /* renamed from: n */
    public static List<? extends ImageModel> f12082n;

    /* renamed from: o */
    public static C7608g.C7609a f12083o;

    /* renamed from: p */
    public static String f12084p = "";

    /* renamed from: q */
    public static EnumC4507d f12085q = EnumC4507d.RANDOM_MATCH;

    /* renamed from: r */
    public static final C4502a f12086r = new C4502a();
    @AbstractC4430d(mo10204a = "LINKER_MANAGER")

    /* renamed from: s */
    private static C5659c f12087s;

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.c.a$a */
    public static abstract class AbstractC4503a {
        static {
            Covode.recordClassIndex(5079);
        }

        /* renamed from: a */
        public void mo10276a() {
        }

        /* renamed from: a */
        public void mo10277a(C89378p<? extends EnumC4510g, Long> pVar) {
            C89219l.m154721d(pVar, "");
        }

        /* renamed from: b */
        public void mo10278b() {
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.c.a$b */
    public enum EnumC4505b {
        CHANGE_PAIRING,
        DISCONNECT,
        EXIT;

        static {
            Covode.recordClassIndex(5081);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.c.a$c */
    public enum EnumC4506c {
        PREVIEW_DIALOG,
        CANCEL_DIALOG;

        static {
            Covode.recordClassIndex(5082);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.c.a$e */
    public enum EnumC4508e {
        TYPE_INVITEE_LIST_DIALOG,
        TYPE_PUBLIC_SCREEN,
        TYPE_AUTO_START_WHEN_END;

        static {
            Covode.recordClassIndex(5084);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.c.a$f */
    public enum EnumC4509f {
        IDLE,
        WAITING,
        INVITING,
        LINKING,
        LINKING_SUCCESS;

        static {
            Covode.recordClassIndex(5085);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.c.a$g */
    public enum EnumC4510g {
        COUNTDOWN_WAITING,
        TIMEOUT_WAITING;

        static {
            Covode.recordClassIndex(5086);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.c.a$d */
    public enum EnumC4507d {
        RANDOM_MATCH("random_match"),
        CHANGE_PAIRING_MATCH("change_pairing"),
        SYSTEM_REMATCH("system_rematching");
        

        /* renamed from: b */
        private final String f12092b;

        public final String getType() {
            return this.f12092b;
        }

        static {
            Covode.recordClassIndex(5083);
        }

        private EnumC4507d(String str) {
            this.f12092b = str;
        }
    }

    private C4502a() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.c.a$h */
    public static final class C4511h extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        public static final C4511h f12096a = new C4511h();

        static {
            Covode.recordClassIndex(5087);
        }

        C4511h() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C4502a.m10591g();
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.c.a$i */
    public static final class C4512i extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        public static final C4512i f12097a = new C4512i();

        static {
            Covode.recordClassIndex(5088);
        }

        C4512i() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C4502a.m10591g();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.c.a$y */
    static final class C4530y extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        public static final C4530y f12116a = new C4530y();

        static {
            Covode.recordClassIndex(5106);
        }

        C4530y() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            m10597a();
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public static void m10597a() {
            for (AbstractC4503a aVar : C4502a.f12077i) {
                aVar.mo10277a(C4502a.m10593i());
            }
            if (C4502a.f12070b >= 0) {
                C4502a.f12070b--;
            }
            C4502a.f12071c++;
        }
    }

    /* renamed from: a */
    public static final boolean m10583a() {
        if (f12076h.compareTo((Enum) EnumC4509f.IDLE) > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m10585b() {
        if (f12076h == EnumC4509f.WAITING) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static final boolean m10587c() {
        if (f12076h == EnumC4509f.INVITING) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static final boolean m10588d() {
        if (f12076h == EnumC4509f.LINKING) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static final boolean m10589e() {
        if (f12076h == EnumC4509f.WAITING || f12076h == EnumC4509f.INVITING) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static final boolean m10590f() {
        if (f12076h == EnumC4509f.LINKING_SUCCESS) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.c.a$j */
    public static final class C4513j extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        public static final C4513j f12098a = new C4513j();

        static {
            Covode.recordClassIndex(5089);
        }

        C4513j() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            DataChannel dataChannel = C4502a.f12069a;
            if (dataChannel != null) {
                dataChannel.mo28320c(C4395ai.class, false);
            }
            C4502a.m10591g();
            C4384b.C4385a.m10496a().mo10156e("Random_Link_Waiting");
            return C89391z.f203057a;
        }
    }

    static {
        Covode.recordClassIndex(5078);
    }

    /* renamed from: i */
    public static C89378p<EnumC4510g, Long> m10593i() {
        if (f12070b >= 0) {
            return new C89378p<>(EnumC4510g.COUNTDOWN_WAITING, Long.valueOf(f12070b));
        }
        return new C89378p<>(EnumC4510g.TIMEOUT_WAITING, Long.valueOf(f12071c));
    }

    /* renamed from: g */
    public static final void m10591g() {
        IMessageManager iMessageManager;
        DataChannel dataChannel = f12069a;
        if (dataChannel != null) {
            dataChannel.mo28316b(f12086r);
        }
        f12072d.mo142944a();
        DataChannel dataChannel2 = f12069a;
        if (!(dataChannel2 == null || (iMessageManager = (IMessageManager) dataChannel2.mo28318b(C9068cg.class)) == null)) {
            iMessageManager.removeMessageListener(f12086r);
        }
        C4667f fVar = f12078j;
        if (fVar != null && fVar.mo18054n()) {
            fVar.dismiss();
        }
        C4662e eVar = f12079k;
        if (eVar != null && eVar.mo18054n()) {
            eVar.dismiss();
        }
        f12076h = EnumC4509f.IDLE;
        f12070b = 0;
        f12071c = 0;
        f12080l = 0;
        f12082n = null;
        AbstractC88412b bVar = f12073e;
        if (bVar != null) {
            bVar.dispose();
        }
        f12073e = null;
        f12069a = null;
        f12078j = null;
        f12079k = null;
        f12083o = null;
    }

    /* renamed from: h */
    public static void m10592h() {
        try {
            if (f12076h.compareTo((Enum) EnumC4509f.IDLE) > 0) {
                int i = C4532b.f12121d[f12076h.ordinal()];
                if (i == 1) {
                    C4513j jVar = C4513j.f12098a;
                    m10582a(jVar, jVar);
                } else if (i == 2 || i == 3) {
                    DataChannel dataChannel = f12069a;
                    if (dataChannel != null) {
                        dataChannel.mo28320c(C4395ai.class, false);
                    }
                    m10578a(EnumC4505b.EXIT);
                } else if (i == 4) {
                    C4595b.m10703c();
                    DataChannel dataChannel2 = f12069a;
                    if (dataChannel2 != null) {
                        dataChannel2.mo28320c(C4395ai.class, false);
                    }
                    m10591g();
                }
            } else {
                throw new IllegalStateException("Check failed.".toString());
            }
        } catch (IllegalStateException unused) {
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.c.a$aa */
    static final class C4504aa<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C4504aa f12088a = new C4504aa();

        static {
            Covode.recordClassIndex(5080);
        }

        C4504aa() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C4530y.m10597a();
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.c.a$z */
    static final class C4531z<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C4531z f12117a = new C4531z();

        static {
            Covode.recordClassIndex(5107);
        }

        C4531z() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C4530y.m10597a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.c.a$k */
    public static final class C4514k<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f12099a;

        static {
            Covode.recordClassIndex(5090);
        }

        C4514k(AbstractC89171a aVar) {
            this.f12099a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f12099a.invoke();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.c.a$l */
    public static final class C4515l<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f12100a;

        static {
            Covode.recordClassIndex(5091);
        }

        C4515l(AbstractC89171a aVar) {
            this.f12100a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f12100a.invoke();
        }
    }

    /* renamed from: a */
    public static final void m10580a(EnumC4507d dVar) {
        C89219l.m154721d(dVar, "");
        f12085q = dVar;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.c.a$o */
    static final class C4520o extends AbstractC89220m implements AbstractC89172b<String, C89391z> {

        /* renamed from: a */
        public static final C4520o f12105a = new C4520o();

        static {
            Covode.recordClassIndex(5096);
        }

        C4520o() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(String str) {
            C89219l.m154721d(str, "");
            C4502a.m10592h();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.c.a$r */
    static final class C4523r<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C4523r f12108a = new C4523r();

        static {
            Covode.recordClassIndex(5099);
        }

        C4523r() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C4384b.C4385a.m10496a().mo10152b(EnumC4440k.MATCH);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.c.a$p */
    static final class C4521p extends AbstractC89220m implements AbstractC89172b<String, C89391z> {

        /* renamed from: a */
        public static final C4521p f12106a = new C4521p();

        static {
            Covode.recordClassIndex(5097);
        }

        C4521p() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(String str) {
            C89219l.m154721d(str, "");
            AbstractC88412b bVar = C4502a.f12075g;
            if (bVar != null) {
                bVar.dispose();
            }
            C4384b.C4385a.m10496a().mo10152b(EnumC4440k.MATCH);
            C4502a.f12076h = EnumC4509f.WAITING;
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.c.a$s */
    static final class C4524s<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C4524s f12109a = new C4524s();

        static {
            Covode.recordClassIndex(5100);
        }

        C4524s() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            DataChannel dataChannel = C4502a.f12069a;
            if (dataChannel != null) {
                dataChannel.mo28320c(C4397ak.class, "");
            }
            C4502a.m10578a(EnumC4505b.EXIT);
            C11226ao.m19882a(C3966y.m9669e(), (int) R.string.dxt);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.c.a$t */
    static final class C4525t<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C4525t f12110a = new C4525t();

        static {
            Covode.recordClassIndex(5101);
        }

        C4525t() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            DataChannel dataChannel = C4502a.f12069a;
            if (dataChannel != null) {
                dataChannel.mo28320c(C4397ak.class, "");
            }
            C4502a.m10578a(EnumC4505b.EXIT);
            C11226ao.m19882a(C3966y.m9669e(), (int) R.string.dxt);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.c.a$u */
    static final class C4526u<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C4526u f12111a = new C4526u();

        static {
            Covode.recordClassIndex(5102);
        }

        C4526u() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            if (C4502a.f12076h == EnumC4509f.WAITING) {
                C11226ao.m19883a(C3966y.m9669e(), C3966y.m9657a((int) R.string.dsr), 0);
                C4502a.m10592h();
                C5737w.m12599a();
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.c.a$v */
    static final class C4527v<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C4527v f12112a = new C4527v();

        static {
            Covode.recordClassIndex(5103);
        }

        C4527v() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            if (C4502a.f12076h == EnumC4509f.WAITING) {
                C11226ao.m19883a(C3966y.m9669e(), C3966y.m9657a((int) R.string.dsr), 0);
                C4502a.m10592h();
                C5737w.m12599a();
            }
        }
    }

    /* renamed from: a */
    public static final boolean m10584a(AbstractC4503a aVar) {
        C89219l.m154721d(aVar, "");
        return f12077i.add(aVar);
    }

    /* renamed from: b */
    public static final boolean m10586b(AbstractC4503a aVar) {
        C89219l.m154721d(aVar, "");
        return f12077i.remove(aVar);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.c.a$n */
    static final class C4517n extends AbstractC89220m implements AbstractC89172b<String, C89391z> {

        /* renamed from: a */
        public static final C4517n f12102a = new C4517n();

        static {
            Covode.recordClassIndex(5093);
        }

        C4517n() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(String str) {
            C89219l.m154721d(str, "");
            C4502a.m10582a(C45181.f12103a, C45192.f12104a);
            C4502a.f12076h = EnumC4509f.LINKING;
            AbstractC88412b bVar = C4502a.f12075g;
            if (bVar != null) {
                bVar.dispose();
            }
            AbstractC88412b bVar2 = C4502a.f12074f;
            if (bVar2 != null) {
                bVar2.dispose();
            }
            for (AbstractC4503a aVar : C4502a.f12077i) {
                aVar.mo10276a();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.c.a$q */
    static final class C4522q<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C4522q f12107a = new C4522q();

        static {
            Covode.recordClassIndex(5098);
        }

        C4522q() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C4502a.f12076h = EnumC4509f.INVITING;
            AbstractC88412b a = C11231b.m19899b((long) MtCoHostInviteTimeOutSetting.INSTANCE.getValue(), TimeUnit.SECONDS).mo143271a(new C11191f()).mo143254a(C4524s.f12109a, C4525t.f12110a);
            AbstractC88412b bVar = C4502a.f12075g;
            if (bVar != null) {
                bVar.dispose();
            }
            C4502a.f12075g = a;
            C4502a.f12072d.mo142945a(a);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.c.a$x */
    static final class C4529x<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ DataChannel f12114a;

        /* renamed from: b */
        final /* synthetic */ EnumC4508e f12115b;

        static {
            Covode.recordClassIndex(5105);
        }

        C4529x(DataChannel dataChannel, EnumC4508e eVar) {
            this.f12114a = dataChannel;
            this.f12115b = eVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            DataChannel dataChannel;
            Throwable th = (Throwable) obj;
            DataChannel dataChannel2 = this.f12114a;
            if (dataChannel2 != null) {
                dataChannel2.mo28320c(C4450t.class, new C7398o(1));
            }
            C11264f.m19957a(C3966y.m9669e(), th);
            C4502a.m10591g();
            C4502a.f12081m = false;
            if (this.f12115b == EnumC4508e.TYPE_PUBLIC_SCREEN && (dataChannel = this.f12114a) != null) {
                dataChannel.mo28320c(C9071cj.class, "anchor_host_notice");
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.c.a$m */
    static final class C4516m extends AbstractC89220m implements AbstractC89172b<String, C89391z> {

        /* renamed from: a */
        public static final C4516m f12101a = new C4516m();

        static {
            Covode.recordClassIndex(5092);
        }

        C4516m() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(String str) {
            C89219l.m154721d(str, "");
            if (C4502a.f12076h == EnumC4509f.WAITING || C4502a.f12076h == EnumC4509f.INVITING || C4502a.f12076h == EnumC4509f.LINKING) {
                AbstractC88412b bVar = C4502a.f12073e;
                if (bVar != null) {
                    bVar.dispose();
                }
                AbstractC88412b bVar2 = C4502a.f12075g;
                if (bVar2 != null) {
                    bVar2.dispose();
                }
                C4502a.f12080l = System.currentTimeMillis() / 1000;
                C4667f fVar = C4502a.f12078j;
                if (fVar != null && fVar.mo18054n()) {
                    fVar.dismiss();
                }
                C4662e eVar = C4502a.f12079k;
                if (eVar != null && eVar.mo18054n()) {
                    eVar.dismiss();
                }
                C4502a.f12076h = EnumC4509f.LINKING_SUCCESS;
                for (AbstractC4503a aVar : C4502a.f12077i) {
                    aVar.mo10278b();
                }
                C4502a.f12083o = null;
                C4502a.f12082n = null;
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static final void m10578a(EnumC4505b bVar) {
        C89219l.m154721d(bVar, "");
        int i = C4532b.f12118a[bVar.ordinal()];
        if (i == 1) {
            m10592h();
        } else if (i != 2) {
            if (i == 3) {
                m10582a(C4511h.f12096a, C4512i.f12097a);
            }
        } else if (f12076h == EnumC4509f.LINKING_SUCCESS) {
            C4595b.m10703c();
            DataChannel dataChannel = f12069a;
            if (dataChannel != null) {
                dataChannel.mo28320c(C4395ai.class, true);
            }
            DataChannel dataChannel2 = f12069a;
            if (dataChannel2 != null) {
                String a = C3966y.m9657a((int) R.string.dsp);
                C89219l.m154716b(a, "");
                dataChannel2.mo28320c(C4396aj.class, a);
            }
            m10591g();
            f12085q = EnumC4507d.CHANGE_PAIRING_MATCH;
            C5713h.m12510a((Room) null, EnumC4442m.RANDOM_LINK_MIC_INVITE, "");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0096, code lost:
        if (r0 == null) goto L_0x0098;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m10579a(com.bytedance.android.live.liveinteract.cohost.p263a.p266c.C4502a.EnumC4506c r6) {
        /*
        // Method dump skipped, instructions count: 218
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.cohost.p263a.p266c.C4502a.m10579a(com.bytedance.android.live.liveinteract.cohost.a.c.a$c):void");
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.c.a$w */
    static final class C4528w<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ EnumC4508e f12113a;

        static {
            Covode.recordClassIndex(5104);
        }

        C4528w(EnumC4508e eVar) {
            this.f12113a = eVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            List<ImageModel> list;
            C7608g.C7609a aVar;
            long j;
            int i;
            C7608g.C7609a a;
            IMessageManager iMessageManager;
            C7608g.C7609a a2;
            C5832d dVar = (C5832d) obj;
            C6805b<Integer> bVar = AbstractC6804a.f16977bZ;
            C89219l.m154716b(bVar, "");
            C6806c.m14603a(bVar, Integer.valueOf(bVar.mo13066a().intValue() + 1));
            C7608g gVar = (C7608g) dVar.data;
            if (gVar != null) {
                list = gVar.f18885a;
            } else {
                list = null;
            }
            C4502a.f12082n = list;
            C7608g gVar2 = (C7608g) dVar.data;
            if (gVar2 != null) {
                aVar = gVar2.mo13843a();
            } else {
                aVar = null;
            }
            C4502a.f12083o = aVar;
            C4384b.C4385a.m10496a().mo10152b(EnumC4440k.MATCH);
            C4502a.f12076h = EnumC4509f.WAITING;
            C7608g gVar3 = (C7608g) dVar.data;
            if (gVar3 == null || (a2 = gVar3.mo13843a()) == null) {
                j = 16;
            } else {
                j = (long) a2.f18887a;
            }
            C4502a.f12070b = j;
            AbstractC88412b a3 = AbstractC88979t.m154282a(0, 1000, TimeUnit.MILLISECONDS).mo143271a(new C11191f()).mo143254a(C4531z.f12117a, C4504aa.f12088a);
            C4502a.f12072d.mo142945a(a3);
            C4502a.f12073e = a3;
            DataChannel dataChannel = C4502a.f12069a;
            if (!(dataChannel == null || (iMessageManager = (IMessageManager) dataChannel.mo28318b(C9068cg.class)) == null)) {
                iMessageManager.addMessageListener(EnumC9596a.LINK_MESSAGE.getIntType(), C4502a.f12086r);
            }
            C4502a aVar2 = C4502a.f12086r;
            DataChannel dataChannel2 = C4502a.f12069a;
            if (dataChannel2 != null) {
                dataChannel2.mo28312a(aVar2, C4447q.class, C4516m.f12101a).mo28312a(aVar2, C4449s.class, C4517n.f12102a).mo28312a(aVar2, C4398al.class, C4520o.f12105a).mo28312a(aVar2, C4448r.class, C4521p.f12106a);
            }
            C7608g gVar4 = (C7608g) dVar.data;
            if (gVar4 == null || (a = gVar4.mo13843a()) == null) {
                i = 60;
            } else {
                i = a.f18888b;
            }
            AbstractC88412b a4 = AbstractC88979t.m154307b((long) i, TimeUnit.SECONDS).mo143271a(new C11191f()).mo143254a(C4526u.f12111a, C4527v.f12112a);
            C4502a.f12072d.mo142945a(a4);
            C4502a.f12074f = a4;
            if (this.f12113a != EnumC4508e.TYPE_AUTO_START_WHEN_END) {
                C4502a.m10580a(EnumC4507d.RANDOM_MATCH);
                C5713h.m12510a((Room) null, EnumC4442m.RANDOM_LINK_MIC_INVITE, "");
            }
            C4502a.f12081m = false;
            if (this.f12113a == EnumC4508e.TYPE_PUBLIC_SCREEN) {
                C4502a.m10579a(EnumC4506c.PREVIEW_DIALOG);
            }
        }
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        boolean z;
        long j;
        String str;
        long j2;
        AbstractC88403ab<C5661a> a;
        AbstractC88403ab<R> a2;
        try {
            if (!(iMessage instanceof C9606aj)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            } else if (((C9606aj) iMessage).f23319a == 16) {
                C9778a aVar = ((C9606aj) iMessage).f23330p;
                if (aVar == null || aVar.f23792c == 0) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                User user = aVar.f23791b;
                if (user != null) {
                    user.getId();
                }
                if (f12076h == EnumC4509f.WAITING) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    throw new IllegalStateException("Check failed.".toString());
                } else if (!C4384b.C4385a.m10496a().f11965m) {
                    String str2 = aVar.f23790a;
                    C89219l.m154716b(str2, "");
                    f12084p = str2;
                    C4384b a3 = C4384b.C4385a.m10496a();
                    long j3 = aVar.f23792c;
                    User user2 = aVar.f23791b;
                    if (user2 != null) {
                        j = user2.getId();
                    } else {
                        j = 0;
                    }
                    User user3 = aVar.f23791b;
                    if (user3 == null || (str = user3.getSecUid()) == null) {
                        str = "";
                    }
                    Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
                    if (room != null) {
                        j2 = room.getId();
                    } else {
                        j2 = 0;
                    }
                    try {
                        if (a3.f11957e != 0) {
                            throw new IllegalStateException("Check failed.".toString());
                        } else if (!(!a3.f11943af)) {
                            throw new IllegalStateException("Check failed.".toString());
                        } else if (f12069a == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        } else if (j3 == 0) {
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        } else if (j == 0) {
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        } else if (!(!TextUtils.isEmpty(str))) {
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        } else if (j2 != 0) {
                            C4431e.f12034a.mo10201a(this);
                            C4431e.f12034a.mo10198a(new C4616a(), null);
                            C5650b bVar = new C5650b();
                            bVar.f14365b = true;
                            bVar.f14366c = true;
                            C5659c cVar = f12087s;
                            if (cVar == null) {
                                C89219l.m154710a("mLinkerManager");
                            }
                            AbstractC6872f b = C11115u.m19743a().mo17915b();
                            C89219l.m154716b(b, "");
                            cVar.mo11440a(b.mo13161c(), C5647a.EnumC5648a.COHOST, f12069a, bVar);
                            a3.f11943af = true;
                            a3.f11969q = true;
                            a3.f11954b = true;
                            a3.f11958f = j;
                            a3.f11959g = str;
                            a3.f11961i = j3;
                            a3.f11960h = j2;
                            a3.f11968p = EnumC4442m.RANDOM_LINK_MIC_INVITE;
                            a3.mo10152b(EnumC4440k.INVITING);
                            C5713h.m12510a((Room) null, EnumC4442m.RANDOM_LINK_MIC_INVITE, "");
                            HashMap hashMap = new HashMap();
                            C5659c cVar2 = f12087s;
                            if (cVar2 == null) {
                                C89219l.m154710a("mLinkerManager");
                            }
                            AbstractC5651b a4 = cVar2.mo11439a();
                            if (a4 != null && (a = a4.mo10341a(hashMap)) != null && (a2 = a.mo142910a(new C11191f())) != null) {
                                a2.mo142915a(C4522q.f12107a, C4523r.f12108a);
                            }
                        } else {
                            try {
                                throw new IllegalArgumentException("Failed requirement.".toString());
                            } catch (Exception unused) {
                            }
                        }
                    } catch (Exception unused2) {
                    }
                } else {
                    try {
                        throw new IllegalStateException("Check failed.".toString());
                    } catch (IllegalArgumentException unused3) {
                    } catch (IllegalStateException unused4) {
                    }
                }
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } catch (IllegalArgumentException unused5) {
        } catch (IllegalStateException unused6) {
        }
    }

    /* renamed from: a */
    public static final void m10581a(DataChannel dataChannel, EnumC4508e eVar) {
        long j;
        long j2;
        String str;
        User user;
        User user2;
        Room room;
        C89219l.m154721d(eVar, "");
        f12069a = dataChannel;
        if (dataChannel == null || (room = (Room) dataChannel.mo28318b(C9093de.class)) == null) {
            j = 0;
        } else {
            j = room.getId();
        }
        DataChannel dataChannel2 = f12069a;
        if (dataChannel2 == null || (user2 = (User) dataChannel2.mo28318b(C9101dm.class)) == null) {
            j2 = 0;
        } else {
            j2 = user2.getId();
        }
        DataChannel dataChannel3 = f12069a;
        if (dataChannel3 == null || (user = (User) dataChannel3.mo28318b(C9101dm.class)) == null || (str = user.getSecUid()) == null) {
            str = "";
        }
        if (j == 0 || j2 == 0 || TextUtils.isEmpty(str)) {
            m10591g();
        } else if (!f12081m) {
            f12081m = true;
            Calendar instance = Calendar.getInstance();
            C89219l.m154716b(instance, "");
            TimeZone timeZone = instance.getTimeZone();
            C89219l.m154716b(timeZone, "");
            String id = timeZone.getID();
            Calendar instance2 = Calendar.getInstance();
            C89219l.m154716b(instance2, "");
            f12072d.mo142945a(((CoHostApi) C5805e.m12718a().mo11572a(CoHostApi.class)).randomLinkMicAutoMatch(j, j2, str, id, instance2.getTimeZone().getOffset(System.currentTimeMillis()) / 1000).mo143271a(new C11191f()).mo143254a(new C4528w(eVar), new C4529x(dataChannel, eVar)));
        }
    }

    /* renamed from: a */
    public static void m10582a(AbstractC89171a<C89391z> aVar, AbstractC89171a<C89391z> aVar2) {
        long j;
        String str;
        User user;
        User user2;
        Room room;
        DataChannel dataChannel = f12069a;
        long j2 = 0;
        if (dataChannel == null || (room = (Room) dataChannel.mo28318b(C9093de.class)) == null) {
            j = 0;
        } else {
            j = room.getId();
        }
        DataChannel dataChannel2 = f12069a;
        if (!(dataChannel2 == null || (user2 = (User) dataChannel2.mo28318b(C9101dm.class)) == null)) {
            j2 = user2.getId();
        }
        DataChannel dataChannel3 = f12069a;
        if (dataChannel3 == null || (user = (User) dataChannel3.mo28318b(C9101dm.class)) == null || (str = user.getSecUid()) == null) {
            str = "";
        }
        f12072d.mo142945a(((CoHostApi) C5805e.m12718a().mo11572a(CoHostApi.class)).randomLinkMicCancelMatch(j, j2, str).mo143271a(new C11191f()).mo143254a(new C4514k(aVar), new C4515l(aVar2)));
    }
}
