package com.p2082ss.android.ugc.aweme.sticker.text;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.adaptation.C33398a;
import com.p2082ss.android.ugc.aweme.editSticker.C45821a;
import com.p2082ss.android.ugc.aweme.editSticker.C45874e;
import com.p2082ss.android.ugc.aweme.editSticker.C45879f;
import com.p2082ss.android.ugc.aweme.editSticker.p2877a.AbstractC45829e;
import com.p2082ss.android.ugc.aweme.editSticker.p2877a.C45830f;
import com.p2082ss.android.ugc.aweme.editSticker.p2881e.p2882a.C45876a;
import com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f;
import com.p2082ss.android.ugc.aweme.effectplatform.C46404c;
import com.p2082ss.android.ugc.aweme.out.AVServiceImpl;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.property.C65353aw;
import com.p2082ss.android.ugc.aweme.property.C65399cl;
import com.p2082ss.android.ugc.aweme.property.C65411cu;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.gamora.editor.sticker.permission.C82949a;
import com.p2082ss.android.ugc.gamora.editor.sticker.read.C83063g;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.text.c */
public final class C75896c {

    /* renamed from: a */
    public static final C75896c f170471a = new C75896c();

    /* renamed from: b */
    private static final AbstractC89244h f170472b = C89250i.m154773a((AbstractC89171a) C75897a.f170474a);

    /* renamed from: c */
    private static boolean f170473c;

    /* renamed from: a */
    public static C45876a m133081a() {
        return (C45876a) f170472b.getValue();
    }

    private C75896c() {
    }

    static {
        Covode.recordClassIndex(88836);
    }

    /* renamed from: b */
    public static final void m133084b() {
        if (!f170473c) {
            m133081a();
            C45821a aVar = new C45821a("coverpic", "covertext");
            Application application = C63247i.f143610a;
            C89219l.m154716b(application, "");
            C45876a.m88517a(aVar, C46404c.m89554a(application, null), C75899e.f170475a, C63244g.m114602a().mo73259E().mo93881a());
            f170473c = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.text.c$a */
    static final class C75897a extends AbstractC89220m implements AbstractC89171a<C45876a> {

        /* renamed from: a */
        public static final C75897a f170474a = new C75897a();

        static {
            Covode.recordClassIndex(88837);
        }

        C75897a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C45876a invoke() {
            C45876a aVar = new C45876a();
            C45879f fVar = new C45879f(C16048b.m29633a().mo25421a(true, "edit_text_sticker_stroke_mode", false), C83063g.m143407a(), 12);
            C45830f fVar2 = new C45830f();
            boolean a = C65399cl.m117099a();
            boolean a2 = C65353aw.m117038a();
            C70005cr a3 = C70005cr.m123611a();
            C89219l.m154716b(a3, "");
            Boolean bool = a3.f156494n;
            C89219l.m154716b(bool, "");
            C45874e eVar = new C45874e("textfont", fVar, fVar2, a, a2, bool.booleanValue(), C82949a.f185358a, C65411cu.m117126a());
            AbstractC46415f createFontEffectPlatform = AVServiceImpl.m113116a().effectService().createFontEffectPlatform(C63247i.f143610a);
            C89219l.m154716b(createFontEffectPlatform, "");
            aVar.mo77244a(eVar, createFontEffectPlatform, C33398a.f79357a, C75904j.f170479a);
            return aVar;
        }
    }

    /* renamed from: a */
    public static final void m133082a(AbstractC45829e eVar) {
        C89219l.m154721d(eVar, "");
        m133081a();
        C45876a.m88516a(eVar);
    }

    /* renamed from: a */
    public static final void m133083a(boolean z, boolean z2, boolean z3) {
        m133081a();
        C45876a.m88518a(z, z2, z3);
    }
}
