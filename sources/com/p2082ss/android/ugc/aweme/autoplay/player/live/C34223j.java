package com.p2082ss.android.ugc.aweme.autoplay.player.live;

import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.autoplay.p2350e.C34181a;
import com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.autoplay.player.live.j */
public final class C34223j implements WeakHandler.IHandler, AbstractC34186b.AbstractC34189c {

    /* renamed from: b */
    public static final C34224a f80915b = new C34224a((byte) 0);

    /* renamed from: a */
    public final AbstractC34186b.AbstractC34192d f80916a;

    /* renamed from: c */
    private final AbstractC89244h f80917c;

    /* renamed from: d */
    private final AbstractC34186b.AbstractC34188b f80918d;

    static {
        Covode.recordClassIndex(41158);
    }

    /* renamed from: a */
    private WeakHandler m69977a() {
        return (WeakHandler) this.f80917c.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34189c
    public final void an_() {
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.player.live.j$a */
    public static final class C34224a {
        static {
            Covode.recordClassIndex(41159);
        }

        private C34224a() {
        }

        public /* synthetic */ C34224a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.player.live.j$b */
    static final class C34225b extends AbstractC89220m implements AbstractC89171a<WeakHandler> {

        /* renamed from: a */
        final /* synthetic */ C34223j f80919a;

        static {
            Covode.recordClassIndex(41160);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34225b(C34223j jVar) {
            super(0);
            this.f80919a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ WeakHandler invoke() {
            return new WeakHandler(Looper.getMainLooper(), this.f80919a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34189c
    public final boolean aZ_() {
        AbstractC34186b.AbstractC34192d dVar = this.f80916a;
        if (dVar != null) {
            return dVar.aZ_();
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34189c
    public final void bg_() {
        AbstractC34186b.AbstractC34192d dVar = this.f80916a;
        if (dVar != null) {
            dVar.hashCode();
        }
        m69977a().removeMessages(16);
        AbstractC34186b.AbstractC34192d dVar2 = this.f80916a;
        if (dVar2 != null) {
            dVar2.bg_();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34189c
    public final void bi_() {
        m69977a().removeMessages(16);
        AbstractC34186b.AbstractC34192d dVar = this.f80916a;
        if (dVar != null) {
            dVar.hashCode();
        }
        AbstractC34186b.AbstractC34192d dVar2 = this.f80916a;
        if (dVar2 != null) {
            dVar2.bi_();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34189c
    /* renamed from: e */
    public final void mo60344e() {
        AbstractC34186b.AbstractC34192d dVar = this.f80916a;
        if (dVar != null) {
            dVar.hashCode();
        }
        m69977a().removeCallbacksAndMessages(null);
        m69977a().removeMessages(16);
        AbstractC34186b.AbstractC34192d dVar2 = this.f80916a;
        if (dVar2 != null) {
            dVar2.mo60425B();
        }
    }

    public /* synthetic */ C34223j(AbstractC34186b.AbstractC34192d dVar) {
        this(dVar, null);
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34189c
    /* renamed from: a */
    public final void mo60340a(long j) {
        Aweme aweme;
        m69977a().removeMessages(16);
        Message message = new Message();
        message.what = 16;
        AbstractC34186b.AbstractC34188b bVar = this.f80918d;
        if (bVar != null) {
            aweme = bVar.mo60511a();
        } else {
            aweme = null;
        }
        message.obj = aweme;
        m69977a().sendMessageDelayed(message, j);
        AbstractC34186b.AbstractC34192d dVar = this.f80916a;
        if (dVar != null) {
            dVar.hashCode();
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        String str;
        C89219l.m154721d(message, "");
        if (this.f80918d != null) {
            if (message.what == 16 && (message.obj instanceof Aweme)) {
                Object obj = message.obj;
                Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.Aweme");
                String aid = ((Aweme) obj).getAid();
                Aweme a = this.f80918d.mo60511a();
                if (a != null) {
                    str = a.getAid();
                } else {
                    str = null;
                }
                if (!C89219l.m154714a((Object) aid, (Object) str)) {
                    return;
                }
            } else {
                return;
            }
        }
        AbstractC34186b.AbstractC34192d dVar = this.f80916a;
        if (dVar != null) {
            C34181a.m69861d(dVar);
            this.f80916a.hashCode();
            dVar.mo60424A();
        }
    }

    public C34223j(AbstractC34186b.AbstractC34192d dVar, AbstractC34186b.AbstractC34188b bVar) {
        this.f80916a = dVar;
        this.f80918d = bVar;
        this.f80917c = C89250i.m154773a((AbstractC89171a) new C34225b(this));
    }
}
