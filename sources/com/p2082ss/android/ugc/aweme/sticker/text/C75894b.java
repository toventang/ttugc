package com.p2082ss.android.ugc.aweme.sticker.text;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.google.gson.C27917g;
import com.p2082ss.android.ugc.aweme.editSticker.C45855c;
import com.p2082ss.android.ugc.aweme.editSticker.C45866d;
import com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45901f;
import com.p2082ss.android.ugc.aweme.editSticker.interact.view.AbstractC45913a;
import com.p2082ss.android.ugc.aweme.editSticker.p2881e.AbstractC45878b;
import com.p2082ss.android.ugc.aweme.editSticker.p2881e.C45875a;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.sticker.C75247a;
import com.p2082ss.android.ugc.aweme.sticker.C75269b;
import com.p2082ss.android.ugc.aweme.sticker.view.C76136b;
import com.p2082ss.android.ugc.aweme.sticker.view.C76137c;
import com.p2082ss.android.ugc.tools.p4353i.C84531a;
import java.lang.reflect.Type;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.text.b */
public final class C75894b {

    /* renamed from: a */
    public static final C75894b f170468a = new C75894b();

    /* renamed from: b */
    private static final AbstractC89244h f170469b = C89250i.m154773a((AbstractC89171a) C75895a.f170470a);

    /* renamed from: a */
    public static AbstractC45878b m133079a() {
        return (AbstractC45878b) f170469b.getValue();
    }

    private C75894b() {
    }

    static {
        Covode.recordClassIndex(88834);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.text.b$a */
    static final class C75895a extends AbstractC89220m implements AbstractC89171a<C45875a> {

        /* renamed from: a */
        public static final C75895a f170470a = new C75895a();

        static {
            Covode.recordClassIndex(88835);
        }

        C75895a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C45875a invoke() {
            C45875a aVar = new C45875a(new C45855c(C63244g.m114602a().mo73280h().getVideoWidth(), C63244g.m114602a().mo73280h().getVideoHeight(), (AbstractC45901f) null, new C76136b(), new C76137c(), 36));
            Application application = C63247i.f143610a;
            C89219l.m154716b(application, "");
            C27910f G = C63244g.m114602a().mo73261G();
            C75247a aVar2 = C75247a.f169188a;
            C75269b bVar = C75269b.f169232a;
            C89219l.m154721d(application, "");
            C89219l.m154721d(aVar2, "");
            C89219l.m154721d(bVar, "");
            C45855c cVar = aVar.f106869a;
            C89219l.m154721d(application, "");
            C89219l.m154721d(cVar, "");
            C89219l.m154721d(aVar2, "");
            C89219l.m154721d(bVar, "");
            if (!C45866d.f106850f) {
                C45866d.f106845a = application;
                if (G == null) {
                    C27917g gVar = new C27917g();
                    gVar.f65564d = true;
                    C27910f b = gVar.mo46681a((Type) Integer.TYPE, (Object) new C84531a()).mo46682b();
                    C89219l.m154716b(b, "");
                    C45866d.f106846b = b;
                } else {
                    C45866d.f106846b = G;
                }
                C45866d.f106847c = cVar;
                C45866d.f106848d = aVar2;
                C45866d.f106849e = bVar;
                C45866d.f106850f = true;
            }
            return aVar;
        }
    }

    /* renamed from: a */
    public static void m133080a(AbstractC45913a aVar) {
        C89219l.m154721d(aVar, "");
        C45855c c = C45866d.m88490c();
        C45855c cVar = new C45855c(c.f106818a, c.f106819b, c.f106820c, aVar, c.f106822e, c.f106823f);
        C89219l.m154721d(cVar, "");
        C45866d.f106847c = cVar;
    }
}
