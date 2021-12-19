package com.bytedance.android.live.publicscreen.impl.model;

import android.graphics.Bitmap;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k;
import com.bytedance.android.livesdk.model.message.p579c.C9698b;
import com.bytedance.android.livesdk.model.message.p579c.C9700d;
import com.bytedance.android.livesdk.model.message.p579c.C9703g;
import com.bytedance.android.livesdk.model.message.p592e.C9815b;
import com.bytedance.android.livesdkapi.host.AbstractC11803e;
import com.bytedance.android.livesdkapi.p692h.C11778b;
import com.bytedance.android.livesdkapi.p692h.EnumC11780d;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.publicscreen.impl.model.l */
public final class C6024l extends AbstractC5877k<C9815b> {

    /* renamed from: e */
    public static final C6026b f15107e = new C6026b((byte) 0);

    static {
        Covode.recordClassIndex(6635);
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k
    /* renamed from: a */
    public final CharSequence mo10374a() {
        return null;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5875i, com.bytedance.android.livesdk.chatroom.p491f.AbstractC7556b
    /* renamed from: b */
    public final User mo10375b() {
        return null;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k
    /* renamed from: h_ */
    public final int mo10712h_() {
        return R.drawable.c_j;
    }

    /* renamed from: com.bytedance.android.live.publicscreen.impl.model.l$a */
    public static final class C6025a implements AbstractC11803e.AbstractC11805b {
        static {
            Covode.recordClassIndex(6636);
        }

        C6025a() {
        }

        @Override // com.bytedance.android.livesdkapi.host.AbstractC11803e.AbstractC11805b
        /* renamed from: a */
        public final void mo8986a(Bitmap bitmap) {
            C3854a.m9453a(3, "RedEnvelopeMessageModel", "load icon success");
        }
    }

    /* renamed from: com.bytedance.android.live.publicscreen.impl.model.l$b */
    public static final class C6026b {
        static {
            Covode.recordClassIndex(6637);
        }

        private C6026b() {
        }

        public /* synthetic */ C6026b(byte b) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6024l(C9815b bVar) {
        super(bVar);
        C9698b bVar2;
        List<C9700d> list;
        AbstractC11803e eVar;
        ImageModel imageModel;
        C89219l.m154721d(bVar, "");
        bVar.f23841g = ((IGiftService) C6193a.m13435a(IGiftService.class)).enableRedEnvelope();
        C11778b bVar3 = bVar.f28134O;
        if (!(bVar3 == null || (bVar2 = bVar3.f28144j) == null || (list = bVar2.f23648d) == null)) {
            for (T t : list) {
                C89219l.m154716b(t, "");
                if (t.f23657a == EnumC11780d.IMAGE.getPieceType() && (eVar = (AbstractC11803e) C6193a.m13435a(AbstractC11803e.class)) != null) {
                    C9703g gVar = t.f23664h;
                    if (gVar != null) {
                        imageModel = gVar.f23670a;
                    } else {
                        imageModel = null;
                    }
                    eVar.mo18862a(imageModel, new C6025a());
                }
            }
        }
    }
}
