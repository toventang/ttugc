package com.p2082ss.android.ugc.aweme.ftc;

import android.content.Intent;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.ftc.C51836aa;
import com.p2082ss.android.ugc.aweme.p2730de.C40982q;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.property.C65398ck;
import com.p2082ss.android.ugc.aweme.shortvideo.C69840ar;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.creationflow.AbstractC73587b;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.creationflow.C73592c;
import com.p2082ss.android.ugc.aweme.shortvideo.p3889w.C74162a;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import java.lang.reflect.Type;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89546bf;
import kotlinx.coroutines.C89561bs;
import kotlinx.coroutines.C89624i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ftc.v */
final /* synthetic */ class C52802v implements AbstractC2565m {

    /* renamed from: a */
    private final FTCVideoRecordNewActivity f121498a;

    static {
        Covode.recordClassIndex(62201);
    }

    C52802v(FTCVideoRecordNewActivity fTCVideoRecordNewActivity) {
        this.f121498a = fTCVideoRecordNewActivity;
    }

    @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
    public final void onChanged(Object obj) {
        FTCVideoRecordNewActivity fTCVideoRecordNewActivity = this.f121498a;
        C74162a aVar = (C74162a) obj;
        C89219l.m154721d(fTCVideoRecordNewActivity, "");
        C89219l.m154721d(aVar, "");
        ShortVideoContext shortVideoContext = fTCVideoRecordNewActivity.f119415g;
        Object a = fTCVideoRecordNewActivity.f119414f.mo35249a((Type) C73592c.class, (String) null);
        C89219l.m154716b(a, "");
        C73592c cVar = (C73592c) a;
        C89219l.m154716b(shortVideoContext, "");
        if (shortVideoContext.f155817b.f155645a == 1 && shortVideoContext.f155818c == 0 && !shortVideoContext.f155817b.f155653i && !shortVideoContext.mo110041q()) {
            C70005cr.m123611a().f156496p = "";
            C84425b a2 = new C84425b().mo129406a("enter_from", "video_shoot_page").mo129406a("creation_id", shortVideoContext.f155830o);
            if (shortVideoContext.f155740A != 0) {
                a2.mo129406a("creation_id", shortVideoContext.f155830o);
            }
            if (shortVideoContext.f155818c == 0) {
                a2.mo129406a("draft_way", "general_draft_list");
            }
            C80322d.m139251a("click_draft_edit_cancel", a2.f188764a);
            if (shortVideoContext.f155818c == 0) {
                C63244g.m114602a().mo73290r().mo86005c().mo86020a();
                SmartRouter.buildRoute(fTCVideoRecordNewActivity, "//kids/main").withParam("key_init_page_index", 4).open();
            }
        }
        if (fTCVideoRecordNewActivity.getIntent().getBooleanExtra("navigate_back_to_main", false)) {
            Intent intent = new Intent(fTCVideoRecordNewActivity, C63238c.f143576c.mo93775d());
            try {
                C84349a.m145093a(intent, fTCVideoRecordNewActivity);
                fTCVideoRecordNewActivity.startActivity(intent);
            } catch (Exception unused) {
                C40982q.m82522a("returnmain", new C69840ar().mo110189a("event", "crash").mo110191a());
            }
        }
        if (shortVideoContext.f155797ag) {
            fTCVideoRecordNewActivity.setResult(-1);
        }
        if (shortVideoContext.f155817b.f155653i) {
            cVar.mo116185a(new AbstractC73587b.C73589b(fTCVideoRecordNewActivity, fTCVideoRecordNewActivity.f119402B.mo22871a(), shortVideoContext, fTCVideoRecordNewActivity.f119401A.mo22757K()));
        } else if (shortVideoContext.mo110022c()) {
            cVar.mo116185a(new AbstractC73587b.C73591d(fTCVideoRecordNewActivity, aVar.f166564a));
        } else if (shortVideoContext.f155817b.f155645a != 1) {
            C84911q.m145926b("current restoreType is " + shortVideoContext.f155817b.f155645a);
            cVar.mo116185a(new AbstractC73587b.C73590c(fTCVideoRecordNewActivity));
            if (C65398ck.m117098a()) {
                AbstractC89568bz unused2 = C89624i.m155555a(C89561bs.f203280a, C89546bf.f203267b, null, new C51836aa.C51837a(shortVideoContext, null), 2);
            }
        } else {
            cVar.mo116185a(new AbstractC73587b.C73590c(fTCVideoRecordNewActivity));
        }
    }
}
