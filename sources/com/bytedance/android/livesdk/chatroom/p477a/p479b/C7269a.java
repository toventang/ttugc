package com.bytedance.android.livesdk.chatroom.p477a.p479b;

import android.graphics.Path;
import com.bytedance.android.livesdk.model.AbstractC9513a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.live.barrage.C87046a;
import com.p2082ss.ugc.live.barrage.p4467a.AbstractC87048a;
import com.p2082ss.ugc.live.barrage.view.BarrageLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.chatroom.a.b.a */
public final class C7269a extends AbstractC9513a {

    /* renamed from: a */
    public static final C7270a f18081a = new C7270a((byte) 0);

    /* renamed from: j */
    private final ArrayList<C7271b> f18082j = new ArrayList<>();

    /* renamed from: k */
    private final Random f18083k = new Random();

    /* renamed from: l */
    private float f18084l = 1.0f;

    /* renamed from: m */
    private final BarrageLayout f18085m;

    /* renamed from: n */
    private final int f18086n;

    static {
        Covode.recordClassIndex(8020);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.a.b.a$a */
    public static final class C7270a {
        static {
            Covode.recordClassIndex(8021);
        }

        private C7270a() {
        }

        public /* synthetic */ C7270a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.ugc.live.barrage.p4468b.AbstractC87059a
    /* renamed from: a */
    public final void mo13469a() {
        mo140683d();
        Iterator<T> it = this.f18082j.iterator();
        while (it.hasNext()) {
            it.next().mo13469a();
        }
        super.mo13469a();
    }

    @Override // com.p2082ss.ugc.live.barrage.p4468b.AbstractC87059a
    /* renamed from: b */
    public final int mo13473b() {
        int b = super.mo13473b();
        Iterator<T> it = this.f18082j.iterator();
        while (it.hasNext()) {
            b += it.next().mo13473b();
        }
        return b;
    }

    @Override // com.p2082ss.ugc.live.barrage.p4468b.AbstractC87059a
    /* renamed from: a */
    public final void mo13471a(AbstractC87048a aVar) {
        C89219l.m154721d(aVar, "");
        mo140682c();
    }

    @Override // com.bytedance.android.livesdk.model.AbstractC9513a
    /* renamed from: a */
    public final void mo13470a(Path path) {
        C89219l.m154721d(path, "");
        C7271b bVar = new C7271b(this.f18085m, path, this.f18086n);
        this.f18082j.add(bVar);
        BarrageLayout.m150805a(this.f18085m, bVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7269a(BarrageLayout barrageLayout, int i) {
        super(barrageLayout);
        C89219l.m154721d(barrageLayout, "");
        this.f18085m = barrageLayout;
        this.f18086n = i;
    }

    @Override // com.p2082ss.ugc.live.barrage.p4468b.AbstractC87059a
    /* renamed from: a */
    public final void mo13472a(C87046a aVar, float f) {
        C89219l.m154721d(aVar, "");
        float f2 = this.f18084l + (f / ((float) this.f18086n));
        this.f18084l = f2;
        if (f2 > 0.32f) {
            AbstractC87048a e = mo140684e();
            if (e != null) {
                this.f18082j.get(this.f18083k.nextInt(this.f18082j.size())).mo140680a(e, false);
            }
            this.f18084l = 0.0f;
        }
    }
}
