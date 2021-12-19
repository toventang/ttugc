package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.content.Intent;
import androidx.appcompat.app.ActivityC0218d;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.p1559o.C21582f;
import com.p2082ss.android.ugc.aweme.out.AVServiceImpl;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import com.p2082ss.android.ugc.aweme.p2730de.C40982q;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.property.C65398ck;
import com.p2082ss.android.ugc.aweme.shortvideo.C69840ar;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.creationflow.AbstractC73587b;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.creationflow.C73592c;
import com.p2082ss.android.ugc.aweme.shortvideo.p3889w.C74162a;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import java.io.File;
import java.lang.reflect.Type;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89546bf;
import kotlinx.coroutines.C89561bs;
import kotlinx.coroutines.C89624i;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.y */
public final class C73831y {
    static {
        Covode.recordClassIndex(86576);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.y$a */
    public static final class C73832a extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f165751a;

        /* renamed from: b */
        final /* synthetic */ ShortVideoContext f165752b;

        static {
            Covode.recordClassIndex(86577);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C73832a(ShortVideoContext shortVideoContext, AbstractC89124d dVar) {
            super(2, dVar);
            this.f165752b = shortVideoContext;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C73832a(this.f165752b, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C73832a) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        /* renamed from: a */
        private static boolean m129893a(File file) {
            MethodCollector.m26663i(10844);
            try {
                C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
                if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                    C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
                }
                if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                    C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                    MethodCollector.m26664o(10844);
                    return false;
                }
            } catch (Throwable unused) {
            }
            boolean delete = file.delete();
            MethodCollector.m26664o(10844);
            return delete;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            if (this.f165751a == 0) {
                C89382r.m154942a(obj);
                Workspace workspace = this.f165752b.f155817b.f155652h;
                File a = workspace.mo110089a();
                if (!a.exists()) {
                    a = null;
                }
                if (a != null) {
                    m129893a(a);
                    StringBuilder sb = new StringBuilder("delete video, path is ");
                    File a2 = workspace.mo110089a();
                    C89219l.m154716b(a2, "");
                    C84911q.m145926b(sb.append(a2.getPath()).toString());
                }
                File b = workspace.mo110091b();
                if (b.exists()) {
                    m129893a(b);
                    StringBuilder sb2 = new StringBuilder("delete audio, path is ");
                    File b2 = workspace.mo110091b();
                    C89219l.m154716b(b2, "");
                    C84911q.m145926b(sb2.append(b2.getPath()).toString());
                }
                return C89391z.f203057a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: a */
    public static final void m129892a(ActivityC0218d dVar, C74162a aVar, AbstractC89171a<? extends ShortVideoContext> aVar2, AbstractC89171a<C21582f> aVar3, AbstractC89171a<? extends AbstractC14193m> aVar4, AbstractC89171a<? extends AbstractC14177d> aVar5) {
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        C89219l.m154721d(aVar3, "");
        C89219l.m154721d(aVar4, "");
        C89219l.m154721d(aVar5, "");
        ShortVideoContext shortVideoContext = (ShortVideoContext) aVar2.invoke();
        Object a = aVar3.invoke().mo35249a((Type) C73592c.class, (String) null);
        C89219l.m154716b(a, "");
        C73592c cVar = (C73592c) a;
        if (shortVideoContext.f155817b.f155645a == 1 && shortVideoContext.f155818c == 0 && !shortVideoContext.f155817b.f155653i) {
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
                AVServiceImpl.m113116a().draftService().enterDraftBox(dVar);
            }
        }
        if (dVar.getIntent().getBooleanExtra("navigate_back_to_main", false)) {
            Intent intent = new Intent(dVar, C63238c.f143576c.mo93775d());
            try {
                C84349a.m145093a(intent, dVar);
                dVar.startActivity(intent);
            } catch (Exception unused) {
                C40982q.m82522a("returnmain", new C69840ar().mo110189a("event", "crash").mo110191a());
            }
        }
        if (shortVideoContext.f155797ag) {
            dVar.setResult(-1);
        }
        if (shortVideoContext.f155817b.f155653i) {
            cVar.mo116185a(new AbstractC73587b.C73589b(dVar, ((AbstractC14193m) aVar4.invoke()).mo22871a(), shortVideoContext, ((AbstractC14177d) aVar5.invoke()).mo22757K()));
        } else if (shortVideoContext.mo110022c()) {
            cVar.mo116185a(new AbstractC73587b.C73591d(dVar, aVar.f166564a));
        } else if (shortVideoContext.f155817b.f155645a != 1) {
            C84911q.m145926b("current restoreType is " + shortVideoContext.f155817b.f155645a);
            cVar.mo116185a(new AbstractC73587b.C73590c(dVar));
            if (C65398ck.m117098a()) {
                AbstractC89568bz unused2 = C89624i.m155555a(C89561bs.f203280a, C89546bf.f203267b, null, new C73832a(shortVideoContext, null), 2);
            }
        } else {
            cVar.mo116185a(new AbstractC73587b.C73590c(dVar));
        }
    }
}
