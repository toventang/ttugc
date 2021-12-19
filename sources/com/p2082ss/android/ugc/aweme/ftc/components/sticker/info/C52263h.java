package com.p2082ss.android.ugc.aweme.ftc.components.sticker.info;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.editSticker.interact.p2884a.AbstractC45895b;
import com.p2082ss.android.ugc.aweme.ftc.components.sticker.C52154a;
import com.p2082ss.android.ugc.aweme.ftc.components.sticker.hint.FTCStickerHintTextViewModel;
import com.p2082ss.android.ugc.aweme.scene.C67279a;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.AbstractC71033a;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.C71045ak;
import com.p2082ss.android.ugc.aweme.tools.p4115e.AbstractC78486c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.info.h */
public final class C52263h {

    /* renamed from: a */
    public List<C52154a> f120398a = new ArrayList();

    /* renamed from: b */
    public C52154a f120399b;

    /* renamed from: c */
    public int f120400c;

    /* renamed from: d */
    public AbstractC31071f f120401d;

    /* renamed from: e */
    public AbstractC71033a f120402e;

    /* renamed from: f */
    public AbstractC45895b f120403f;

    /* renamed from: g */
    public AbstractC78486c<C52154a> f120404g;

    /* renamed from: h */
    private final float f120405h = 0.5f;

    /* renamed from: i */
    private final float f120406i = 0.5f;

    /* renamed from: j */
    private FTCInfoStickerEditView f120407j;

    /* renamed from: k */
    private FTCStickerHintTextViewModel f120408k;

    static {
        Covode.recordClassIndex(61651);
    }

    /* renamed from: a */
    public final void mo88000a() {
        FTCStickerHintTextViewModel fTCStickerHintTextViewModel = this.f120408k;
        if (fTCStickerHintTextViewModel != null) {
            fTCStickerHintTextViewModel.mo87920a().postValue(true);
        }
    }

    /* renamed from: c */
    public final void mo88009c() {
        for (C52154a aVar : this.f120398a) {
            this.f120401d.mo56336c(aVar.f120151b.getId(), 0.3137255f);
        }
    }

    /* renamed from: d */
    public final void mo88011d() {
        for (C52154a aVar : this.f120398a) {
            this.f120401d.mo56336c(aVar.f120151b.getId(), 1.0f);
        }
    }

    /* renamed from: b */
    public final void mo88006b() {
        C52154a aVar = this.f120399b;
        if (aVar != null) {
            aVar.f120151b.getId();
            if (!this.f120399b.f120161l) {
                this.f120401d.mo56255a(this.f120399b.f120151b.getId(), this.f120399b.f120151b.startTime, this.f120399b.f120151b.endTime);
                this.f120399b.f120152c = false;
            }
            this.f120399b = null;
        }
    }

    /* renamed from: d */
    public final void mo88012d(C52154a aVar) {
        aVar.f120152c = true;
        this.f120399b = aVar;
    }

    /* renamed from: e */
    public final boolean mo88013e(C52154a aVar) {
        if (!aVar.f120151b.isPin() || this.f120401d.mo56383q(aVar.f120151b.getId())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo88001a(C52154a aVar) {
        if (aVar != null && !aVar.f120161l) {
            aVar.f120151b.getId();
            this.f120401d.mo56255a(aVar.f120151b.getId(), 0, this.f120400c);
        }
    }

    /* renamed from: c */
    public final void mo88010c(C52154a aVar) {
        if (aVar != null) {
            aVar.f120151b.getId();
            if (aVar.f120151b.layerWeight != C71045ak.f159068b) {
                aVar.f120151b.updateLayerWeight(C71045ak.m125453a());
                aVar.f120151b.getId();
                this.f120401d.mo56355f(aVar.f120151b.getId(), aVar.f120151b.layerWeight);
                AbstractC78486c<C52154a> cVar = this.f120404g;
                if (cVar != null) {
                    cVar.mo87979a(aVar);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo88007b(C52154a aVar) {
        if (aVar != null && this.f120398a.contains(aVar) && !aVar.f120161l) {
            aVar.f120151b.getId();
            this.f120401d.mo56255a(aVar.f120151b.getId(), aVar.f120151b.startTime, aVar.f120151b.endTime);
        }
    }

    /* renamed from: a */
    public static int m97093a(C52154a aVar, C52154a aVar2) {
        return aVar.f120151b.layerWeight - aVar2.f120151b.layerWeight;
    }

    /* renamed from: a */
    public final void mo88002a(C52154a aVar, float f) {
        if (!aVar.f120161l && f != 0.0f) {
            aVar.f120151b.rotateAngle += f;
            this.f120401d.mo56253a(aVar.f120151b.getId(), -aVar.f120151b.rotateAngle);
            aVar.mo87875a(f);
        }
    }

    /* renamed from: a */
    public final boolean mo88005a(C52154a aVar, int i) {
        if (aVar.f120161l) {
            if (i < aVar.f120151b.startTime || i > aVar.f120151b.endTime) {
                return false;
            }
            return true;
        } else if ((i < aVar.f120151b.startTime || i > aVar.f120151b.endTime) && !aVar.equals(this.f120399b)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: b */
    public final void mo88008b(C52154a aVar, float f) {
        float f2 = aVar.f120151b.scale * f;
        if (f2 >= aVar.f120150a || f >= 1.0f) {
            this.f120401d.mo56321b(aVar.f120151b.getId(), f);
            aVar.f120151b.scale = f2;
            aVar.mo87877b(f);
        }
    }

    /* renamed from: a */
    public final void mo88004a(C52154a aVar, int i, int i2) {
        if (aVar != null) {
            m97094b(aVar, i, i2);
        }
    }

    C52263h(FTCInfoStickerEditView fTCInfoStickerEditView, AbstractC31071f fVar, View view) {
        this.f120407j = fTCInfoStickerEditView;
        this.f120401d = fVar;
        this.f120400c = fVar.mo56368j();
        Activity a = C67279a.m119194a(view.getContext());
        if (a != null) {
            this.f120408k = (FTCStickerHintTextViewModel) C1181ae.m3881a((ActivityC0945e) a, (C1175ad.AbstractC1177b) null).mo3983a(FTCStickerHintTextViewModel.class);
        }
    }

    /* renamed from: b */
    private void m97094b(C52154a aVar, int i, int i2) {
        aVar.f120151b.startTime = i;
        aVar.f120151b.endTime = i2;
        int r = this.f120401d.mo56384r(i);
        int r2 = this.f120401d.mo56384r(i2);
        aVar.f120151b.uiStartTime = r;
        aVar.f120151b.uiEndTime = r2;
        this.f120401d.mo56255a(aVar.f120151b.getId(), i, i2);
    }

    /* renamed from: a */
    public final void mo88003a(C52154a aVar, float f, float f2) {
        if (aVar.f120161l) {
            for (C52154a aVar2 : this.f120398a) {
                if (aVar2.f120161l) {
                    aVar2.f120151b.currentOffsetY += f2 / ((float) this.f120407j.f120310d);
                    this.f120401d.mo56254a(aVar2.f120151b.getId(), aVar2.f120151b.currentOffsetX, aVar2.f120151b.currentOffsetY);
                    aVar2.mo87876a(0.0f, f2);
                }
            }
            return;
        }
        aVar.f120151b.currentOffsetX += f / ((float) this.f120407j.f120309c);
        aVar.f120151b.currentOffsetY += f2 / ((float) this.f120407j.f120310d);
        this.f120401d.mo56254a(aVar.f120151b.getId(), aVar.f120151b.currentOffsetX, aVar.f120151b.currentOffsetY);
        aVar.mo87876a(f, f2);
    }
}
