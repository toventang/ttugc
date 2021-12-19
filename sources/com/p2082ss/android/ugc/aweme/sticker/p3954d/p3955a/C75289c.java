package com.p2082ss.android.ugc.aweme.sticker.p3954d.p3955a;

import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.als.C2559g;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.p3956b.AbstractC75296b;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.p3956b.C75297c;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.p3956b.EnumC75295a;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75466g;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.view.p4366e.C84954a;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.d.a.c */
public final class C75289c implements AbstractC75292d {

    /* renamed from: a */
    public Object f169267a;

    /* renamed from: b */
    public final AbstractC89172b<AbstractC75296b<?>, C89391z> f169268b;

    /* renamed from: c */
    private final Context f169269c;

    /* renamed from: d */
    private final C2559g<Boolean> f169270d;

    /* renamed from: e */
    private final ShortVideoContext f169271e;

    static {
        Covode.recordClassIndex(88191);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.p3954d.p3955a.AbstractC75292d
    /* renamed from: a */
    public final <T> boolean mo118624a(AbstractC75296b<T> bVar) {
        C89219l.m154721d(bVar, "");
        if ((!C89219l.m154714a(this.f169267a, bVar)) && (bVar instanceof C75297c) && (bVar.mo118631b() == EnumC75295a.UI_CLICK || bVar.mo118631b() == EnumC75295a.UI_GALLERY)) {
            Effect effect = ((C75297c) bVar).f169280a;
            if (!C75466g.m132368t(effect) || !C89219l.m154714a((Object) this.f169270d.mo6996a(), (Object) true) || this.f169271e.f155817b.f155650f.isEmpty()) {
                return false;
            }
            HashMap c = C89041ag.m154428c(C89387v.m154943a("prop_id", effect.getEffectId()), C89387v.m154943a("creation_id", this.f169271e.f155830o), C89387v.m154943a("shoot_way", this.f169271e.f155831p));
            C84954a.C84957a a = new C84954a.C84957a(this.f169269c).mo129716a(R.string.h4t);
            a.f189845b = a.f189851h.getString(R.string.h4s);
            a.mo129718a(new DialogInterface$OnClickListenerC75290a(c)).mo129717a(R.string.as_, new DialogInterface$OnClickListenerC75291b(this, c, bVar)).mo129719a().mo129713a();
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.d.a.c$a */
    static final class DialogInterface$OnClickListenerC75290a implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ HashMap f169272a;

        static {
            Covode.recordClassIndex(88192);
        }

        DialogInterface$OnClickListenerC75290a(HashMap hashMap) {
            this.f169272a = hashMap;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f169272a.put("to_status", "cancel");
            C80322d.m139251a("shoot_video_delete_confirm", this.f169272a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.d.a.c$b */
    static final class DialogInterface$OnClickListenerC75291b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C75289c f169273a;

        /* renamed from: b */
        final /* synthetic */ HashMap f169274b;

        /* renamed from: c */
        final /* synthetic */ AbstractC75296b f169275c;

        static {
            Covode.recordClassIndex(88193);
        }

        DialogInterface$OnClickListenerC75291b(C75289c cVar, HashMap hashMap, AbstractC75296b bVar) {
            this.f169273a = cVar;
            this.f169274b = hashMap;
            this.f169275c = bVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f169274b.put("to_status", "confirm");
            C80322d.m139251a("shoot_video_delete_confirm", this.f169274b);
            this.f169273a.f169267a = this.f169275c;
            this.f169273a.f169268b.invoke(this.f169275c);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.b<? super com.ss.android.ugc.aweme.sticker.d.b.b<?>, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public C75289c(Context context, C2559g<Boolean> gVar, ShortVideoContext shortVideoContext, AbstractC89172b<? super AbstractC75296b<?>, C89391z> bVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(shortVideoContext, "");
        C89219l.m154721d(bVar, "");
        this.f169269c = context;
        this.f169270d = gVar;
        this.f169271e = shortVideoContext;
        this.f169268b = bVar;
    }
}
