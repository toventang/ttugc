package com.p2082ss.android.ugc.aweme.autoplay.player.video;

import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.autoplay.player.video.e */
public final class C34256e implements WeakHandler.IHandler, AbstractC34186b.AbstractC34189c {

    /* renamed from: b */
    public static final C34257a f81021b = new C34257a((byte) 0);

    /* renamed from: a */
    public final AbstractC34186b.AbstractC34192d f81022a;

    /* renamed from: c */
    private final AbstractC89244h f81023c = C89250i.m154773a((AbstractC89171a) new C34258b(this));

    /* renamed from: d */
    private final C34246c f81024d;

    static {
        Covode.recordClassIndex(41193);
    }

    /* renamed from: a */
    private WeakHandler m70037a() {
        return (WeakHandler) this.f81023c.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.player.video.e$a */
    public static final class C34257a {
        static {
            Covode.recordClassIndex(41194);
        }

        private C34257a() {
        }

        public /* synthetic */ C34257a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34189c
    public final void an_() {
        AbstractC34186b.AbstractC34192d dVar = this.f81022a;
        if (dVar != null) {
            dVar.an_();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.player.video.e$b */
    static final class C34258b extends AbstractC89220m implements AbstractC89171a<WeakHandler> {

        /* renamed from: a */
        final /* synthetic */ C34256e f81025a;

        static {
            Covode.recordClassIndex(41195);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34258b(C34256e eVar) {
            super(0);
            this.f81025a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ WeakHandler invoke() {
            return new WeakHandler(Looper.getMainLooper(), this.f81025a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34189c
    public final boolean aZ_() {
        AbstractC34186b.AbstractC34192d dVar = this.f81022a;
        if (dVar != null) {
            return dVar.aZ_();
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34189c
    public final void bg_() {
        m70037a().removeMessages(16);
        AbstractC34186b.AbstractC34192d dVar = this.f81022a;
        if (dVar != null) {
            dVar.bg_();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34189c
    public final void bi_() {
        m70037a().removeMessages(16);
        AbstractC34186b.AbstractC34192d dVar = this.f81022a;
        if (dVar != null) {
            dVar.bi_();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34189c
    /* renamed from: e */
    public final void mo60344e() {
        m70037a().removeCallbacksAndMessages(null);
        m70037a().removeMessages(16);
        AbstractC34186b.AbstractC34192d dVar = this.f81022a;
        if (dVar != null) {
            dVar.mo60425B();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34189c
    /* renamed from: a */
    public final void mo60340a(long j) {
        Aweme aweme;
        m70037a().removeMessages(16);
        Message message = new Message();
        message.what = 16;
        C34246c cVar = this.f81024d;
        if (cVar != null) {
            aweme = cVar.f80987d;
        } else {
            aweme = null;
        }
        message.obj = aweme;
        m70037a().sendMessageDelayed(message, j);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        String str;
        AbstractC34186b.AbstractC34192d dVar;
        Aweme aweme;
        C89219l.m154721d(message, "");
        if (message.what == 16 && (message.obj instanceof Aweme)) {
            Object obj = message.obj;
            Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.Aweme");
            String aid = ((Aweme) obj).getAid();
            C34246c cVar = this.f81024d;
            if (cVar == null || (aweme = cVar.f80987d) == null) {
                str = null;
            } else {
                str = aweme.getAid();
            }
            if (C89219l.m154714a((Object) aid, (Object) str) && (dVar = this.f81022a) != null) {
                dVar.mo60424A();
            }
        }
    }

    public C34256e(AbstractC34186b.AbstractC34192d dVar, C34246c cVar) {
        this.f81022a = dVar;
        this.f81024d = cVar;
    }
}
