package com.bytedance.android.live.broadcast.preview;

import android.os.Message;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1213t;
import com.bytedance.android.live.broadcast.api.model.Game;
import com.bytedance.android.live.broadcast.model.C3256c;
import com.bytedance.android.live.broadcast.model.C3261g;
import com.bytedance.android.live.broadcast.model.C3272o;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.livesdk.chatroom.model.C7694n;
import com.bytedance.android.livesdkapi.depend.model.live.EnumC11728i;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11683e;
import com.bytedance.android.widget.C12249d;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

public final class StartLiveViewModel extends AbstractC1174ac {

    /* renamed from: a */
    public static final C3346a f9542a = new C3346a((byte) 0);

    /* renamed from: b */
    private AbstractC88412b f9543b;

    /* renamed from: c */
    private AbstractC88412b f9544c;

    /* renamed from: d */
    private final AbstractC89244h f9545d = C89250i.m154773a((AbstractC89171a) C3355j.f9571a);

    /* renamed from: e */
    private final AbstractC89244h f9546e = C89250i.m154773a((AbstractC89171a) C3358m.f9574a);

    /* renamed from: f */
    private final AbstractC89244h f9547f = C89250i.m154773a((AbstractC89171a) C3356k.f9572a);

    /* renamed from: g */
    private final AbstractC89244h f9548g = C89250i.m154773a((AbstractC89171a) C3362q.f9578a);

    /* renamed from: h */
    private final AbstractC89244h f9549h = C89250i.m154773a((AbstractC89171a) C3354i.f9570a);

    /* renamed from: i */
    private final AbstractC89244h f9550i = C89250i.m154773a((AbstractC89171a) C3348c.f9564a);

    /* renamed from: j */
    private final AbstractC89244h f9551j = C89250i.m154773a((AbstractC89171a) C3350e.f9566a);

    /* renamed from: k */
    private final AbstractC89244h f9552k = C89250i.m154773a((AbstractC89171a) C3363r.f9579a);

    /* renamed from: l */
    private final AbstractC89244h f9553l = C89250i.m154773a((AbstractC89171a) C3361p.f9577a);

    /* renamed from: m */
    private final AbstractC89244h f9554m = C89250i.m154773a((AbstractC89171a) C3349d.f9565a);

    /* renamed from: n */
    private final AbstractC89244h f9555n = C89250i.m154773a((AbstractC89171a) C3359n.f9575a);

    /* renamed from: o */
    private final AbstractC89244h f9556o = C89250i.m154773a((AbstractC89171a) C3353h.f9569a);

    /* renamed from: p */
    private final AbstractC89244h f9557p = C89250i.m154773a((AbstractC89171a) C3364s.f9580a);

    /* renamed from: q */
    private final AbstractC89244h f9558q = C89250i.m154773a((AbstractC89171a) C3352g.f9568a);

    /* renamed from: r */
    private final AbstractC89244h f9559r = C89250i.m154773a((AbstractC89171a) C3351f.f9567a);

    /* renamed from: s */
    private final AbstractC89244h f9560s = C89250i.m154773a((AbstractC89171a) C3360o.f9576a);

    /* renamed from: t */
    private final AbstractC89244h f9561t = C89250i.m154773a((AbstractC89171a) C3357l.f9573a);

    /* renamed from: u */
    private final AbstractC89244h f9562u = C89250i.m154773a((AbstractC89171a) C3347b.f9563a);

    static {
        Covode.recordClassIndex(3829);
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveViewModel$a */
    public static final class C3346a {
        static {
            Covode.recordClassIndex(3830);
        }

        private C3346a() {
        }

        public /* synthetic */ C3346a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveViewModel$b */
    static final class C3347b extends AbstractC89220m implements AbstractC89171a<C1213t<C5832d<C3256c>>> {

        /* renamed from: a */
        public static final C3347b f9563a = new C3347b();

        static {
            Covode.recordClassIndex(3831);
        }

        C3347b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<C5832d<C3256c>> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveViewModel$d */
    static final class C3349d extends AbstractC89220m implements AbstractC89171a<C1213t<String>> {

        /* renamed from: a */
        public static final C3349d f9565a = new C3349d();

        static {
            Covode.recordClassIndex(3833);
        }

        C3349d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<String> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveViewModel$e */
    static final class C3350e extends AbstractC89220m implements AbstractC89171a<C1213t<Game>> {

        /* renamed from: a */
        public static final C3350e f9566a = new C3350e();

        static {
            Covode.recordClassIndex(3834);
        }

        C3350e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<Game> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveViewModel$j */
    static final class C3355j extends AbstractC89220m implements AbstractC89171a<C1213t<AbstractC11683e>> {

        /* renamed from: a */
        public static final C3355j f9571a = new C3355j();

        static {
            Covode.recordClassIndex(3839);
        }

        C3355j() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<AbstractC11683e> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveViewModel$l */
    static final class C3357l extends AbstractC89220m implements AbstractC89171a<C1213t<Room>> {

        /* renamed from: a */
        public static final C3357l f9573a = new C3357l();

        static {
            Covode.recordClassIndex(3841);
        }

        C3357l() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<Room> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveViewModel$o */
    static final class C3360o extends AbstractC89220m implements AbstractC89171a<C1213t<Message>> {

        /* renamed from: a */
        public static final C3360o f9576a = new C3360o();

        static {
            Covode.recordClassIndex(3844);
        }

        C3360o() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<Message> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveViewModel$c */
    static final class C3348c extends AbstractC89220m implements AbstractC89171a<C1213t<Integer>> {

        /* renamed from: a */
        public static final C3348c f9564a = new C3348c();

        static {
            Covode.recordClassIndex(3832);
        }

        C3348c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<Integer> invoke() {
            C1213t tVar = new C1213t();
            tVar.setValue(1);
            return tVar;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveViewModel$f */
    static final class C3351f extends AbstractC89220m implements AbstractC89171a<C12249d<C3261g>> {

        /* renamed from: a */
        public static final C3351f f9567a = new C3351f();

        static {
            Covode.recordClassIndex(3835);
        }

        C3351f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C12249d<C3261g> invoke() {
            C12249d dVar = new C12249d();
            dVar.setValue(new C3261g());
            return dVar;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveViewModel$g */
    static final class C3352g extends AbstractC89220m implements AbstractC89171a<C12249d<Integer>> {

        /* renamed from: a */
        public static final C3352g f9568a = new C3352g();

        static {
            Covode.recordClassIndex(3836);
        }

        C3352g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C12249d<Integer> invoke() {
            C12249d dVar = new C12249d();
            dVar.setValue(1);
            return dVar;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveViewModel$h */
    static final class C3353h extends AbstractC89220m implements AbstractC89171a<C1213t<Boolean>> {

        /* renamed from: a */
        public static final C3353h f9569a = new C3353h();

        static {
            Covode.recordClassIndex(3837);
        }

        C3353h() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<Boolean> invoke() {
            C1213t tVar = new C1213t();
            tVar.setValue(false);
            return tVar;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveViewModel$i */
    static final class C3354i extends AbstractC89220m implements AbstractC89171a<C1213t<EnumC11728i>> {

        /* renamed from: a */
        public static final C3354i f9570a = new C3354i();

        static {
            Covode.recordClassIndex(3838);
        }

        C3354i() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<EnumC11728i> invoke() {
            C1213t tVar = new C1213t();
            tVar.setValue(EnumC11728i.VIDEO);
            return tVar;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveViewModel$k */
    static final class C3356k extends AbstractC89220m implements AbstractC89171a<C12249d<Boolean>> {

        /* renamed from: a */
        public static final C3356k f9572a = new C3356k();

        static {
            Covode.recordClassIndex(3840);
        }

        C3356k() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C12249d<Boolean> invoke() {
            C12249d dVar = new C12249d();
            dVar.setValue(false);
            return dVar;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveViewModel$m */
    static final class C3358m extends AbstractC89220m implements AbstractC89171a<C12249d<C3272o>> {

        /* renamed from: a */
        public static final C3358m f9574a = new C3358m();

        static {
            Covode.recordClassIndex(3842);
        }

        C3358m() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C12249d<C3272o> invoke() {
            C12249d dVar = new C12249d();
            dVar.setValue(new C3272o());
            return dVar;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveViewModel$n */
    static final class C3359n extends AbstractC89220m implements AbstractC89171a<C1213t<C7694n>> {

        /* renamed from: a */
        public static final C3359n f9575a = new C3359n();

        static {
            Covode.recordClassIndex(3843);
        }

        C3359n() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<C7694n> invoke() {
            C1213t tVar = new C1213t();
            tVar.setValue(new C7694n());
            return tVar;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveViewModel$p */
    static final class C3361p extends AbstractC89220m implements AbstractC89171a<C1213t<String>> {

        /* renamed from: a */
        public static final C3361p f9577a = new C3361p();

        static {
            Covode.recordClassIndex(3845);
        }

        C3361p() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<String> invoke() {
            C1213t tVar = new C1213t();
            tVar.setValue("");
            return tVar;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveViewModel$q */
    static final class C3362q extends AbstractC89220m implements AbstractC89171a<C12249d<Integer>> {

        /* renamed from: a */
        public static final C3362q f9578a = new C3362q();

        static {
            Covode.recordClassIndex(3846);
        }

        C3362q() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C12249d<Integer> invoke() {
            C12249d dVar = new C12249d();
            dVar.setValue(20);
            return dVar;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveViewModel$r */
    static final class C3363r extends AbstractC89220m implements AbstractC89171a<C12249d<Integer>> {

        /* renamed from: a */
        public static final C3363r f9579a = new C3363r();

        static {
            Covode.recordClassIndex(3847);
        }

        C3363r() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C12249d<Integer> invoke() {
            C12249d dVar = new C12249d();
            dVar.setValue(0);
            return dVar;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveViewModel$s */
    static final class C3364s extends AbstractC89220m implements AbstractC89171a<C1213t<HashMap<String, String>>> {

        /* renamed from: a */
        public static final C3364s f9580a = new C3364s();

        static {
            Covode.recordClassIndex(3848);
        }

        C3364s() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<HashMap<String, String>> invoke() {
            C1213t tVar = new C1213t();
            tVar.setValue(new HashMap());
            return tVar;
        }
    }

    @Override // androidx.lifecycle.AbstractC1174ac
    public final void onCleared() {
        AbstractC88412b bVar;
        AbstractC88412b bVar2;
        super.onCleared();
        AbstractC88412b bVar3 = this.f9544c;
        if (!(bVar3 == null || bVar3.isDisposed() || (bVar2 = this.f9544c) == null)) {
            bVar2.dispose();
        }
        this.f9544c = null;
        AbstractC88412b bVar4 = this.f9543b;
        if (!(bVar4 == null || bVar4.isDisposed() || (bVar = this.f9543b) == null)) {
            bVar.dispose();
        }
        this.f9543b = null;
    }
}
