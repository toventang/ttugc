package com.p2082ss.android.ugc.aweme.autoplay.player.live;

import android.view.View;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.autoplay.player.live.h */
public final class C34219h implements AbstractC34203b {

    /* renamed from: a */
    public static final C34220a f80910a = new C34220a((byte) 0);

    /* renamed from: b */
    private final AbstractC89244h f80911b = C89250i.m154773a((AbstractC89171a) C34221b.f80912a);

    static {
        Covode.recordClassIndex(41154);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final List<AbstractC34203b> mo60579m() {
        return (List) this.f80911b.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.player.live.h$a */
    public static final class C34220a {
        static {
            Covode.recordClassIndex(41155);
        }

        private C34220a() {
        }

        public /* synthetic */ C34220a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.player.live.h$b */
    static final class C34221b extends AbstractC89220m implements AbstractC89171a<ArrayList<AbstractC34203b>> {

        /* renamed from: a */
        public static final C34221b f80912a = new C34221b();

        static {
            Covode.recordClassIndex(41156);
        }

        C34221b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ArrayList<AbstractC34203b> invoke() {
            return new ArrayList();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.live.AbstractC34203b
    /* renamed from: a */
    public final void mo60365a() {
        List<AbstractC34203b> m = mo60579m();
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) m, 10));
        for (T t : m) {
            new StringBuilder().append((Object) t).append(" onFirstFrame");
            t.mo60365a();
            arrayList.add(C89391z.f203057a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.live.AbstractC34203b
    public final void ak_() {
        List<AbstractC34203b> m = mo60579m();
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) m, 10));
        for (T t : m) {
            new StringBuilder().append((Object) t).append(" onIdle");
            t.ak_();
            arrayList.add(C89391z.f203057a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.live.AbstractC34203b
    public final void al_() {
        List<AbstractC34203b> m = mo60579m();
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) m, 10));
        for (T t : m) {
            new StringBuilder().append((Object) t).append(" onInit");
            t.al_();
            arrayList.add(C89391z.f203057a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.live.AbstractC34203b
    public final void am_() {
        List<AbstractC34203b> m = mo60579m();
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) m, 10));
        for (T t : m) {
            new StringBuilder().append((Object) t).append(" onPause");
            t.am_();
            arrayList.add(C89391z.f203057a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.live.AbstractC34203b
    /* renamed from: e */
    public final void mo60522e() {
        List<AbstractC34203b> m = mo60579m();
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) m, 10));
        for (T t : m) {
            new StringBuilder().append((Object) t).append(" onAttachWindow");
            t.mo60522e();
            arrayList.add(C89391z.f203057a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.live.AbstractC34203b
    /* renamed from: f */
    public final void mo60523f() {
        List<AbstractC34203b> m = mo60579m();
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) m, 10));
        for (T t : m) {
            new StringBuilder().append((Object) t).append(" onBind");
            t.mo60523f();
            arrayList.add(C89391z.f203057a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.live.AbstractC34203b
    /* renamed from: g */
    public final void mo60524g() {
        List<AbstractC34203b> m = mo60579m();
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) m, 10));
        for (T t : m) {
            new StringBuilder().append((Object) t).append(" onRequestPlay");
            t.mo60524g();
            arrayList.add(C89391z.f203057a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.live.AbstractC34203b
    /* renamed from: h */
    public final void mo60530h() {
        List<AbstractC34203b> m = mo60579m();
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) m, 10));
        for (T t : m) {
            new StringBuilder().append((Object) t).append(" onPlayPrepared");
            t.mo60530h();
            arrayList.add(C89391z.f203057a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.live.AbstractC34203b
    /* renamed from: i */
    public final void mo60531i() {
        List<AbstractC34203b> m = mo60579m();
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) m, 10));
        for (T t : m) {
            new StringBuilder().append((Object) t).append(" onPlaying");
            t.mo60531i();
            arrayList.add(C89391z.f203057a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.live.AbstractC34203b
    /* renamed from: j */
    public final void mo60532j() {
        List<AbstractC34203b> m = mo60579m();
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) m, 10));
        for (T t : m) {
            new StringBuilder().append((Object) t).append(" onFinish");
            t.mo60532j();
            arrayList.add(C89391z.f203057a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.live.AbstractC34203b
    /* renamed from: k */
    public final void mo60533k() {
        List<AbstractC34203b> m = mo60579m();
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) m, 10));
        for (T t : m) {
            new StringBuilder().append((Object) t).append(" onDetachWindow");
            t.mo60533k();
            arrayList.add(C89391z.f203057a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.live.AbstractC34203b
    /* renamed from: l */
    public final void mo60534l() {
        List<AbstractC34203b> m = mo60579m();
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) m, 10));
        for (T t : m) {
            new StringBuilder().append((Object) t).append(" onDestroy");
            t.mo60534l();
            arrayList.add(C89391z.f203057a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.live.AbstractC34203b
    /* renamed from: a */
    public final void mo60519a(String str) {
        C89219l.m154721d(str, "");
        List<AbstractC34203b> m = mo60579m();
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) m, 10));
        for (T t : m) {
            new StringBuilder().append((Object) t).append(" onError");
            t.mo60519a(str);
            arrayList.add(C89391z.f203057a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.live.AbstractC34203b
    /* renamed from: a */
    public final void mo60366a(View view, int i, int i2) {
        List<AbstractC34203b> m = mo60579m();
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) m, 10));
        for (T t : m) {
            new StringBuilder().append((Object) t).append(" OnSizeChange ").append(i).append(" : ").append(i2);
            t.mo60366a(view, i, i2);
            arrayList.add(C89391z.f203057a);
        }
    }
}
