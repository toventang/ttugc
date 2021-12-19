package com.p2082ss.android.ugc.aweme.sticker.panel.guide;

import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.sticker.panel.guide.AbstractC75547h;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import java.util.List;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.guide.m */
public final class C75565m {
    static {
        Covode.recordClassIndex(88489);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.guide.m$c */
    public static final class C75568c extends AbstractC89220m implements AbstractC89171a<C27910f> {

        /* renamed from: a */
        public static final C75568c f169824a = new C75568c();

        static {
            Covode.recordClassIndex(88492);
        }

        C75568c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C27910f invoke() {
            return C63244g.m114602a().mo73261G();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.guide.m$b */
    public static final class C75567b implements AbstractC75547h {

        /* renamed from: a */
        final /* synthetic */ ShortVideoContext f169823a;

        static {
            Covode.recordClassIndex(88491);
        }

        public C75567b(ShortVideoContext shortVideoContext) {
            this.f169823a = shortVideoContext;
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.panel.guide.AbstractC75547h
        /* renamed from: a */
        public final void mo119249a(boolean z, Effect effect, AbstractC75547h.EnumC75548a aVar) {
            String str;
            String str2 = "";
            C89219l.m154721d(effect, str2);
            C89219l.m154721d(aVar, str2);
            int i = C75569n.f169825a[aVar.ordinal()];
            if (i == 1) {
                str2 = "gif";
            } else if (i == 2) {
                str2 = "lottie";
            }
            C84425b a = new C84425b().mo129406a("shoot_way", this.f169823a.f155831p).mo129406a("prop_id", effect.getEffectId()).mo129406a("enter_from", "EffectStickerViewHolder").mo129406a("hint_type", str2);
            if (z) {
                str = "succeed";
            } else {
                str = "failed";
            }
            C80322d.m139251a("load_prop_hint_end", a.mo129406a("load_status", str).f188764a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.guide.m$a */
    public static final class C75566a extends AbstractC89220m implements AbstractC89187q<Effect, ExtraParams, C27910f, AbstractC75544f> {

        /* renamed from: a */
        final /* synthetic */ ShortVideoContext f169822a;

        static {
            Covode.recordClassIndex(88490);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C75566a(ShortVideoContext shortVideoContext) {
            super(3);
            this.f169822a = shortVideoContext;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ AbstractC75544f invoke(Effect effect, ExtraParams extraParams, C27910f fVar) {
            Effect effect2 = effect;
            C89219l.m154721d(effect2, "");
            C89219l.m154721d(fVar, "");
            if (effect2.getTags() == null) {
                return null;
            }
            List<String> tags = effect2.getTags();
            if (tags == null) {
                C89219l.m154715b();
            }
            if (tags.contains("strong_beat")) {
                return new C75524a(effect2, this.f169822a);
            }
            return null;
        }
    }
}
