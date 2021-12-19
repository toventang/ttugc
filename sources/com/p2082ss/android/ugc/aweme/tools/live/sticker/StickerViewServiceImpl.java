package com.p2082ss.android.ugc.aweme.tools.live.sticker;

import android.widget.FrameLayout;
import androidx.appcompat.app.ActivityC0218d;
import androidx.fragment.app.AbstractC0952i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.p1998c.p1999a.AbstractC27255q;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.framework.services.IStickerService;
import com.p2082ss.android.ugc.aweme.sticker.C75404l;
import com.p2082ss.android.ugc.aweme.sticker.IStickerViewService;
import com.p2082ss.android.ugc.aweme.sticker.favorite.AbstractC75361b;
import com.p2082ss.android.ugc.aweme.sticker.p3958f.C75346e;
import com.p2082ss.android.ugc.aweme.sticker.p3964l.AbstractC75413a;
import com.p2082ss.android.ugc.aweme.sticker.p3967n.AbstractC75448a;
import com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75573i;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o;
import com.p2082ss.android.ugc.aweme.sticker.repository.internals.StickerPreferences;
import com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76115b;
import com.p2082ss.android.ugc.aweme.tools.live.sticker.C78629d;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import java.lang.reflect.Type;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.live.sticker.StickerViewServiceImpl */
public class StickerViewServiceImpl implements IStickerViewService {
    private C78629d liveStickerModule;
    private AbstractC27255q<AbstractC75448a> processorSupplier;
    private AbstractC75413a stickerMobHelper;

    static {
        Covode.recordClassIndex(91765);
    }

    public String getFaceTrackPath() {
        return "face_track.model";
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.IStickerViewService
    public boolean isShowStickerView() {
        C78629d dVar = this.liveStickerModule;
        if (dVar == null || !C75346e.m132161c(dVar)) {
            return false;
        }
        return true;
    }

    public void release() {
        C78629d dVar = this.liveStickerModule;
        if (dVar != null) {
            this.stickerMobHelper = null;
            dVar.mo122533f();
            this.liveStickerModule = null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.IStickerViewService
    public void hideStickerView() {
        C78629d dVar = this.liveStickerModule;
        if (dVar != null) {
            C89219l.m154721d(dVar, "");
            AbstractC75573i v = dVar.mo23169v();
            if (v != null) {
                v.mo119143g();
            }
        }
    }

    public String getStickerFilePath(IStickerService.FaceSticker faceSticker) {
        return faceSticker.localPath;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.IStickerViewService
    public void setPixelLoopStickerPresenterSupplier(AbstractC27255q<AbstractC75448a> qVar) {
        this.processorSupplier = qVar;
        C78629d dVar = this.liveStickerModule;
        if (dVar != null) {
            dVar.mo122529a(qVar);
        }
    }

    public void setStickerMobHelper(AbstractC75413a aVar) {
        this.stickerMobHelper = aVar;
        C78629d dVar = this.liveStickerModule;
        if (dVar != null) {
            dVar.mo122530a(aVar);
        }
    }

    public static IStickerViewService createIStickerViewServicebyMonsterPlugin(boolean z) {
        MethodCollector.m26663i(12039);
        Object a = C81908b.m141854a(IStickerViewService.class, z);
        if (a != null) {
            IStickerViewService iStickerViewService = (IStickerViewService) a;
            MethodCollector.m26664o(12039);
            return iStickerViewService;
        }
        if (C81908b.f183386ep == null) {
            synchronized (IStickerViewService.class) {
                try {
                    if (C81908b.f183386ep == null) {
                        C81908b.f183386ep = new StickerViewServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(12039);
                    throw th;
                }
            }
        }
        StickerViewServiceImpl stickerViewServiceImpl = (StickerViewServiceImpl) C81908b.f183386ep;
        MethodCollector.m26664o(12039);
        return stickerViewServiceImpl;
    }

    private void initLiveModuleIfNeeded(ActivityC0218d dVar, String str) {
        C78629d dVar2 = this.liveStickerModule;
        Effect effect = null;
        if (dVar2 == null || dVar2.f176700r != dVar || !this.liveStickerModule.f176701s.equals(str)) {
            C78629d dVar3 = this.liveStickerModule;
            if (dVar3 != null) {
                effect = dVar3.f176690h.mo119294f();
                this.liveStickerModule.mo122533f();
            }
            this.liveStickerModule = new C78629d(dVar, str);
            if (effect != null && this.liveStickerModule.f176690h.mo119291c().mo119459e().mo119439a(effect)) {
                this.liveStickerModule.f176690h.mo119302n().mo119321a(effect);
            }
        }
        AbstractC27255q<AbstractC75448a> qVar = this.processorSupplier;
        if (qVar != null) {
            this.liveStickerModule.mo122529a(qVar);
        }
        AbstractC75413a aVar = this.stickerMobHelper;
        if (aVar != null) {
            this.liveStickerModule.mo122530a(aVar);
        }
    }

    public void showStickerView(ActivityC0218d dVar, String str, FrameLayout frameLayout, IStickerViewService.AbstractC75242a aVar) {
        showStickerView(dVar, dVar.getSupportFragmentManager(), str, frameLayout, aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.IStickerViewService
    public void showStickerView(ActivityC0218d dVar, AbstractC0952i iVar, String str, FrameLayout frameLayout, IStickerViewService.AbstractC75242a aVar) {
        initLiveModuleIfNeeded(dVar, str);
        C78629d dVar2 = this.liveStickerModule;
        if (dVar2 != null) {
            C89219l.m154721d(frameLayout, "");
            C89219l.m154721d(iVar, "");
            if (dVar2.f169899f == null || (!C89219l.m154714a(dVar2.f176696n, frameLayout)) || (!C89219l.m154714a(dVar2.f176697o, iVar))) {
                dVar2.f176697o = iVar;
                dVar2.f176696n = frameLayout;
                AbstractC75573i a = C75404l.m132236a(dVar2.mo122532e(), dVar2.f176690h, dVar2.f176691i, dVar2.f176689a.getValue(), dVar2.f176698p, dVar2.f176699q).mo119151a(dVar2.f176700r, frameLayout, dVar2.f176700r, iVar);
                Object a2 = dVar2.f176699q.mo35249a((Type) AbstractC76115b.class, (String) null);
                ActivityC0218d dVar3 = dVar2.f176700r;
                Object a3 = dVar2.f176699q.mo35249a((Type) AbstractC75361b.class, (String) null);
                AbstractC75655o oVar = dVar2.f176690h;
                Object a4 = dVar2.f176699q.mo35249a((Type) StickerPreferences.class, (String) null);
                C89219l.m154721d(a2, "");
                C89219l.m154721d(dVar3, "");
                C89219l.m154721d(a3, "");
                C89219l.m154721d(oVar, "");
                C89219l.m154721d(a4, "");
                a.mo119134a(new C78629d.C78647o(dVar2, aVar));
                a.mo119132a(new C78629d.C78648p(aVar));
                a.mo119138b(new C78629d.C78649q(dVar2, aVar));
                dVar2.mo23156a(a);
            }
            C78629d dVar4 = this.liveStickerModule;
            C89219l.m154721d(dVar4, "");
            AbstractC75573i v = dVar4.mo23169v();
            if (v != null) {
                v.mo119142f();
            }
        }
    }

    public void addStickersWithModel(ActivityC0218d dVar, FrameLayout frameLayout, List<Effect> list, boolean z, boolean z2, String str) {
        initLiveModuleIfNeeded(dVar, str);
        C78629d dVar2 = this.liveStickerModule;
        C89219l.m154721d(list, "");
        if ((!list.isEmpty()) && list != null) {
            C75346e.m132159a(dVar2, list, z, z2, null, 0, null, 504);
        }
    }
}
