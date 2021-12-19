package com.p2082ss.android.ugc.aweme.story.record.p4061a;

import android.app.Activity;
import android.content.Intent;
import androidx.appcompat.app.ActivityC0218d;
import androidx.core.p036g.AbstractC0688a;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.C21582f;
import com.p2082ss.android.ugc.asve.recorder.camera.C31181c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.property.C65338ah;
import com.p2082ss.android.ugc.aweme.property.C65347aq;
import com.p2082ss.android.ugc.aweme.property.C65364bd;
import com.p2082ss.android.ugc.aweme.property.C65378br;
import com.p2082ss.android.ugc.aweme.property.C65386bz;
import com.p2082ss.android.ugc.aweme.property.C65425dh;
import com.p2082ss.android.ugc.aweme.property.C65455ej;
import com.p2082ss.android.ugc.aweme.property.C65456ek;
import com.p2082ss.android.ugc.aweme.property.C65498u;
import com.p2082ss.android.ugc.aweme.setting.C68339r;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.p3877a.C73366af;
import com.p2082ss.android.ugc.aweme.shortvideo.record.C72791h;
import com.p2082ss.android.ugc.aweme.shortvideo.record.C72802q;
import com.p2082ss.android.ugc.aweme.shortvideo.record.EnumC72773as;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker.C76002c;
import com.p2082ss.android.ugc.aweme.story.record.p4062b.C77489e;
import com.p2082ss.android.ugc.aweme.tools.extract.AbstractC78563v;
import java.lang.reflect.Type;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.record.a.c */
final /* synthetic */ class C77469c implements AbstractC0688a {

    /* renamed from: a */
    private final C21582f f173803a;

    static {
        Covode.recordClassIndex(90504);
    }

    C77469c(C21582f fVar) {
        this.f173803a = fVar;
    }

    @Override // androidx.core.p036g.AbstractC0688a
    /* renamed from: a */
    public final void mo2720a(Object obj) {
        C21582f fVar = this.f173803a;
        C72802q qVar = (C72802q) obj;
        qVar.f163262a.f163198a = new C77473g(fVar);
        qVar.f163262a.f163199b = new C77474h(fVar);
        qVar.mo115092a(new AbstractC78563v() {
            /* class com.p2082ss.android.ugc.aweme.story.record.p4061a.C77467b.C774681 */

            static {
                Covode.recordClassIndex(90503);
            }

            @Override // com.p2082ss.android.ugc.aweme.tools.extract.AbstractC78563v
            /* renamed from: b */
            public final String mo116052b() {
                return "upload_sticker_frame";
            }

            @Override // com.p2082ss.android.ugc.aweme.tools.extract.AbstractC78563v
            /* renamed from: a */
            public final boolean mo116051a() {
                return C76002c.f170763b;
            }
        });
        qVar.f163264c = false;
        qVar.mo115090a(EnumC72773as.STAGE_ON_CREATE);
        qVar.f163263b = C77475i.f173809a;
        Intent intent = ((Activity) fVar.mo35249a((Type) ActivityC0218d.class, (String) null)).getIntent();
        if (intent != null && intent.hasExtra("extra_camera_facing")) {
            qVar.f163266e = Integer.valueOf(intent.getIntExtra("extra_camera_facing", 1));
            intent.removeExtra("extra_camera_facing");
        }
        qVar.f163267f = -1;
        qVar.f163268g = C65364bd.m117060a();
        qVar.f163269h = C63244g.m114602a().mo73284l().getABService().getEnableRenderPause();
        qVar.f163270i = true;
        qVar.f163281t = false;
        qVar.f163273l = true;
        qVar.f163275n = C65456ek.m117175a();
        qVar.f163276o = C65455ej.m117174a();
        qVar.f163277p = C65498u.m117222a() == 0;
        qVar.f163278q = C65386bz.m117083a();
        qVar.mo115093a("extract_shot");
        qVar.f163280s = C65425dh.f147580a;
        C31181c.f74765a = C65347aq.m117033a();
        qVar.f163282u = 200;
        qVar.f163283v = C68339r.m120619a();
        C89219l.m154721d(qVar, "");
        qVar.mo115091a(C72791h.m128376a(qVar.f163286y, C77489e.C77490a.f173825a));
        qVar.f163287z = 0;
        qVar.f163246A = 0.8f;
        qVar.f163253H = C65378br.m117074a();
        qVar.f163249D = C65338ah.m117024a();
        qVar.f163258M = true;
        qVar.mo115089a(new C73366af((byte) 0));
    }
}
