package com.bytedance.android.live.publicscreen.impl.model;

import android.graphics.Bitmap;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k;
import com.bytedance.android.livesdk.gift.model.C8865y;
import com.bytedance.android.livesdk.model.message.p579c.C9698b;
import com.bytedance.android.livesdk.model.message.p579c.C9700d;
import com.bytedance.android.livesdk.model.message.p579c.C9703g;
import com.bytedance.android.livesdkapi.host.AbstractC11803e;
import com.bytedance.android.livesdkapi.p692h.C11778b;
import com.bytedance.android.livesdkapi.p692h.EnumC11780d;
import com.bytedance.covode.number.Covode;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.publicscreen.impl.model.r */
public final class C6032r extends AbstractC5877k<C8865y> {

    /* renamed from: e */
    public static final C6034b f15112e = new C6034b((byte) 0);

    static {
        Covode.recordClassIndex(6643);
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

    /* renamed from: com.bytedance.android.live.publicscreen.impl.model.r$a */
    public static final class C6033a implements AbstractC11803e.AbstractC11805b {
        static {
            Covode.recordClassIndex(6644);
        }

        C6033a() {
        }

        @Override // com.bytedance.android.livesdkapi.host.AbstractC11803e.AbstractC11805b
        /* renamed from: a */
        public final void mo8986a(Bitmap bitmap) {
            C3854a.m9453a(3, "WishListMessageModel", "load icon success");
        }
    }

    /* renamed from: com.bytedance.android.live.publicscreen.impl.model.r$b */
    public static final class C6034b {
        static {
            Covode.recordClassIndex(6645);
        }

        private C6034b() {
        }

        public /* synthetic */ C6034b(byte b) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6032r(C8865y yVar) {
        super(yVar);
        C9698b bVar;
        List<C9700d> list;
        AbstractC11803e eVar;
        ImageModel imageModel;
        C89219l.m154721d(yVar, "");
        C11778b bVar2 = yVar.f28134O;
        if (!(bVar2 == null || (bVar = bVar2.f28144j) == null || (list = bVar.f23648d) == null)) {
            for (T t : list) {
                C89219l.m154716b(t, "");
                if (t.f23657a == EnumC11780d.IMAGE.getPieceType() && (eVar = (AbstractC11803e) C6193a.m13435a(AbstractC11803e.class)) != null) {
                    C9703g gVar = t.f23664h;
                    if (gVar != null) {
                        imageModel = gVar.f23670a;
                    } else {
                        imageModel = null;
                    }
                    eVar.mo18862a(imageModel, new C6033a());
                }
            }
        }
    }
}
