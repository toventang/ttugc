package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.common.utility.C13617h;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.editSticker.interact.hit.StickerHintTextViewModel;
import com.p2082ss.android.ugc.aweme.editSticker.interact.p2884a.AbstractC45895b;
import com.p2082ss.android.ugc.aweme.editSticker.model.C45939c;
import com.p2082ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.p2082ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.p2082ss.android.ugc.aweme.p2730de.C40970e;
import com.p2082ss.android.ugc.aweme.p2730de.C40982q;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.scene.C67279a;
import com.p2082ss.android.ugc.aweme.shortvideo.C69840ar;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.aweme.tools.p4115e.AbstractC78486c;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4356b.C84606n;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import com.p2082ss.android.vesdk.C85615x;
import com.p2082ss.ugc.effectplatform.model.EffectCategoryResponse;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.c */
public final class C71050c {

    /* renamed from: a */
    public List<C71044aj> f159073a = new ArrayList();

    /* renamed from: b */
    public C71044aj f159074b;

    /* renamed from: c */
    public int f159075c;

    /* renamed from: d */
    public InfoStickerEditView f159076d;

    /* renamed from: e */
    public AbstractC31071f f159077e;

    /* renamed from: f */
    public AbstractC71033a f159078f;

    /* renamed from: g */
    public AbstractC45895b f159079g;

    /* renamed from: h */
    StickerHintTextViewModel f159080h;

    /* renamed from: i */
    public boolean f159081i = true;

    /* renamed from: j */
    public AbstractC78486c<C71044aj> f159082j;

    /* renamed from: k */
    private final float f159083k = 0.5f;

    /* renamed from: l */
    private final float f159084l = 0.5f;

    /* renamed from: m */
    private ActivityC0945e f159085m;

    static {
        Covode.recordClassIndex(83548);
    }

    /* renamed from: a */
    public final boolean mo112230a(C71044aj ajVar, int i) {
        return (i >= ajVar.f159054c.startTime && i <= ajVar.f159054c.endTime) || ajVar.equals(this.f159074b);
    }

    /* renamed from: a */
    public final void mo112229a(C71044aj ajVar, int i, int i2) {
        if (ajVar != null) {
            ajVar.f159054c.startTime = i;
            ajVar.f159054c.endTime = i2;
            int r = this.f159077e.mo56384r(i);
            int r2 = this.f159077e.mo56384r(i2);
            ajVar.f159054c.uiStartTime = r;
            ajVar.f159054c.uiEndTime = r2;
            this.f159077e.mo56255a(ajVar.f159054c.getId(), i, i2);
        }
    }

    /* renamed from: a */
    public final void mo112224a() {
        StickerHintTextViewModel stickerHintTextViewModel = this.f159080h;
        if (stickerHintTextViewModel != null) {
            stickerHintTextViewModel.mo77288a().postValue(true);
        }
    }

    /* renamed from: b */
    public final void mo112231b() {
        C71044aj ajVar = this.f159074b;
        if (ajVar != null) {
            ajVar.f159054c.getId();
            this.f159077e.mo56255a(this.f159074b.f159054c.getId(), this.f159074b.f159054c.startTime, this.f159074b.f159054c.endTime);
            this.f159074b.f159055d = false;
            this.f159074b = null;
        }
    }

    /* renamed from: c */
    public final void mo112234c() {
        for (C71044aj ajVar : this.f159073a) {
            this.f159077e.mo56336c(ajVar.f159054c.getId(), 0.3137255f);
        }
    }

    /* renamed from: d */
    public final void mo112236d() {
        for (C71044aj ajVar : this.f159073a) {
            this.f159077e.mo56336c(ajVar.f159054c.getId(), 1.0f);
        }
    }

    /* renamed from: d */
    public final void mo112237d(C71044aj ajVar) {
        ajVar.f159055d = true;
        this.f159074b = ajVar;
    }

    /* renamed from: e */
    public final boolean mo112238e(C71044aj ajVar) {
        if (!ajVar.f159054c.isPin() || this.f159077e.mo56383q(ajVar.f159054c.getId())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo112226a(C71044aj ajVar) {
        if (ajVar != null) {
            ajVar.f159054c.getId();
            this.f159077e.mo56255a(ajVar.f159054c.getId(), 0, this.f159075c);
        }
    }

    /* renamed from: b */
    public final void mo112232b(C71044aj ajVar) {
        if (ajVar != null && this.f159073a.contains(ajVar)) {
            ajVar.f159054c.getId();
            this.f159077e.mo56255a(ajVar.f159054c.getId(), ajVar.f159054c.startTime, ajVar.f159054c.endTime);
        }
    }

    /* renamed from: c */
    public final void mo112235c(C71044aj ajVar) {
        if (ajVar != null) {
            ajVar.f159054c.getId();
            if (ajVar.f159054c.layerWeight != C71045ak.f159068b) {
                ajVar.f159054c.updateLayerWeight(C71045ak.m125453a());
                ajVar.f159054c.getId();
                this.f159077e.mo56355f(ajVar.f159054c.getId(), ajVar.f159054c.layerWeight);
                AbstractC78486c<C71044aj> cVar = this.f159082j;
                if (cVar != null) {
                    cVar.mo87979a(ajVar);
                }
            }
        }
    }

    /* renamed from: a */
    public static int m125460a(C71044aj ajVar, C71044aj ajVar2) {
        return ajVar.f159054c.layerWeight - ajVar2.f159054c.layerWeight;
    }

    /* renamed from: b */
    public final void mo112233b(C71044aj ajVar, float f) {
        if (ajVar.f159054c.isMagnifier()) {
            m125462a(ajVar, f, ajVar.f159052a, ajVar.f159053b);
        } else {
            m125462a(ajVar, f, ajVar.f159052a, 2.14748365E9f);
        }
    }

    /* renamed from: a */
    public final void mo112225a(InfoStickerModel infoStickerModel, boolean z) {
        if (!(infoStickerModel == null || C13617h.m24465a(infoStickerModel.stickers))) {
            ArrayList<StickerItemModel> arrayList = null;
            for (StickerItemModel stickerItemModel : infoStickerModel.stickers) {
                int i = stickerItemModel.layerWeight;
                if (i != C71045ak.f159068b) {
                    C71045ak.f159067a = Math.max(i, C71045ak.f159067a);
                }
                if (C45939c.m88695a(stickerItemModel)) {
                    if (z) {
                        String str = infoStickerModel.infoStickerDraftDir;
                        if (stickerItemModel.isImageSticker()) {
                            stickerItemModel.setId(this.f159077e.mo56283a(stickerItemModel.path, stickerItemModel.f106999x, stickerItemModel.f107000y, stickerItemModel.f106998w, stickerItemModel.f106997h));
                            if (stickerItemModel.getId() < 0) {
                                C40970e.m82485a("restore subtitle failed: " + stickerItemModel.getId());
                            } else {
                                if (!stickerItemModel.isPin() || !C84902i.m145892a(stickerItemModel.pinAlgorithmFile)) {
                                    this.f159077e.mo56253a(stickerItemModel.getId(), -stickerItemModel.rotateAngle);
                                    this.f159077e.mo56321b(stickerItemModel.getId(), stickerItemModel.scale);
                                    this.f159077e.mo56254a(stickerItemModel.getId(), stickerItemModel.currentOffsetX, stickerItemModel.currentOffsetY);
                                } else {
                                    C1731i.m5640b(new CallableC71052e(this, stickerItemModel), C1731i.f5562a);
                                }
                                this.f159077e.mo56255a(stickerItemModel.getId(), stickerItemModel.startTime, stickerItemModel.endTime);
                                this.f159077e.mo56355f(stickerItemModel.getId(), stickerItemModel.layerWeight);
                            }
                        } else {
                            String str2 = stickerItemModel.path;
                            if (!C80720e.m139927b(str2)) {
                                str2 = str + File.separator + new File(str2).getName();
                            }
                            if (!C80720e.m139927b(str2)) {
                                C63244g.m114602a();
                                C40970e.m82487a((Throwable) new Exception("infoSticker not exist in edit"));
                            } else {
                                stickerItemModel.setId(this.f159077e.mo56292a(str2, TextUtils.isEmpty(stickerItemModel.extra) ? null : new String[]{stickerItemModel.extra}));
                                C73991bj.m130133d("veAddInfoSticker id = " + stickerItemModel.getId());
                                if (stickerItemModel.getId() < 0) {
                                    C40970e.m82485a("restore infoSticker failed: " + stickerItemModel.getId());
                                    C40982q.m82522a("info_sticker", new C69840ar().mo110189a("event", "restore_failed: " + stickerItemModel.getId()).mo110189a("user_info", "path: " + str2 + " extra: " + stickerItemModel.extra).mo110191a());
                                } else {
                                    if (!stickerItemModel.isPin() || !C84902i.m145892a(stickerItemModel.pinAlgorithmFile)) {
                                        this.f159077e.mo56253a(stickerItemModel.getId(), -stickerItemModel.rotateAngle);
                                        this.f159077e.mo56321b(stickerItemModel.getId(), stickerItemModel.scale);
                                        this.f159077e.mo56254a(stickerItemModel.getId(), stickerItemModel.currentOffsetX, stickerItemModel.currentOffsetY);
                                    } else {
                                        C1731i.m5640b(new CallableC71053f(this, stickerItemModel), C1731i.f5562a);
                                    }
                                    this.f159077e.mo56255a(stickerItemModel.getId(), stickerItemModel.startTime, stickerItemModel.endTime);
                                    this.f159077e.mo56355f(stickerItemModel.getId(), stickerItemModel.layerWeight);
                                }
                            }
                        }
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(stickerItemModel);
                    }
                    C71044aj ajVar = new C71044aj(this.f159076d.getContext(), stickerItemModel, this);
                    ajVar.mo112210a(this.f159076d.f158994c, this.f159076d.f158995d, this.f159076d.f158992a, this.f159076d.f158993b);
                    ajVar.mo112211b(stickerItemModel.scale);
                    ajVar.mo112209a((stickerItemModel.currentOffsetX - 0.5f) * ((float) this.f159076d.f158994c), (stickerItemModel.currentOffsetY - 0.5f) * ((float) this.f159076d.f158995d));
                    this.f159073a.add(ajVar);
                    if (stickerItemModel.isImageSticker()) {
                        ajVar.f159064m = true;
                    }
                }
            }
            if (C13617h.m24466b(arrayList)) {
                C73991bj.m130131b("restore info stickers error: " + arrayList.size());
                for (StickerItemModel stickerItemModel2 : arrayList) {
                    C73991bj.m130131b("remove error sticker " + stickerItemModel2.getId());
                    infoStickerModel.removeSticker(stickerItemModel2);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo112227a(C71044aj ajVar, float f) {
        if (f != 0.0f) {
            ajVar.f159054c.rotateAngle += f;
            this.f159077e.mo56253a(ajVar.f159054c.getId(), -ajVar.f159054c.rotateAngle);
            ajVar.mo112208a(f);
        }
    }

    /* renamed from: a */
    public final void mo112228a(C71044aj ajVar, float f, float f2) {
        ajVar.f159054c.currentOffsetX += f / ((float) this.f159076d.f158994c);
        ajVar.f159054c.currentOffsetY += f2 / ((float) this.f159076d.f158995d);
        this.f159077e.mo56254a(ajVar.f159054c.getId(), ajVar.f159054c.currentOffsetX, ajVar.f159054c.currentOffsetY);
        ajVar.mo112209a(f, f2);
    }

    public C71050c(ActivityC0945e eVar, InfoStickerEditView infoStickerEditView, AbstractC31071f fVar, View view) {
        this.f159076d = infoStickerEditView;
        this.f159077e = fVar;
        this.f159085m = eVar;
        this.f159075c = fVar.mo56368j();
        Activity a = C67279a.m119194a(view.getContext());
        if (a != null) {
            this.f159080h = (StickerHintTextViewModel) C1181ae.m3881a((ActivityC0945e) a, (C1175ad.AbstractC1177b) null).mo3983a(StickerHintTextViewModel.class);
        }
    }

    /* renamed from: a */
    private void m125462a(C71044aj ajVar, float f, float f2, float f3) {
        float f4 = ajVar.f159054c.scale * f;
        if (f4 < f2 && f < 1.0f) {
            return;
        }
        if (f4 <= f3 || f <= 1.0f) {
            this.f159077e.mo56321b(ajVar.f159054c.getId(), f);
            ajVar.f159054c.scale = f4;
            ajVar.mo112211b(f);
        }
    }

    /* renamed from: a */
    public final C71044aj mo112223a(String str, String str2, String str3, int i, int i2, float f, float f2, float f3, float f4, boolean z) {
        long j;
        C73991bj.m130133d("addInfoSticker1 id = ".concat(String.valueOf(i2)));
        if (i2 < 0) {
            boolean b = C80720e.m139927b(str2);
            if (b) {
                j = new File(str2).length();
            } else {
                j = 0;
            }
            C40970e.m82485a("add infoSticker failed: ".concat(String.valueOf(i2)));
            C40982q.m82522a("info_sticker", new C69840ar().mo110189a("event", "addFailed: ".concat(String.valueOf(i2))).mo110189a("user_info", "path: " + str2 + " file exist " + b + " size: " + j + " extra: " + str3).mo110191a());
            return null;
        }
        StickerItemModel a = m125461a(i2, str, str2, str3, i, C71045ak.m125453a(), f, f2, f3, f4, z);
        if (a == null) {
            return null;
        }
        C71044aj ajVar = new C71044aj(this.f159076d.getContext(), a, this);
        ajVar.mo112210a(this.f159076d.f158994c, this.f159076d.f158995d, this.f159076d.f158992a, this.f159076d.f158993b);
        this.f159077e.mo56254a(a.getId(), a.currentOffsetX, a.currentOffsetY);
        this.f159077e.mo56355f(a.getId(), ajVar.f159054c.layerWeight);
        a.getId();
        this.f159074b = ajVar;
        ajVar.f159055d = false;
        this.f159073a.add(ajVar);
        AbstractC71033a aVar = this.f159078f;
        if (aVar != null) {
            aVar.mo87992a(a);
        }
        if (this.f159080h != null && this.f159081i) {
            this.f159076d.postDelayed(new RunnableC71051d(this, ajVar), 500);
        }
        return ajVar;
    }

    /* renamed from: a */
    private StickerItemModel m125461a(int i, String str, String str2, String str3, int i2, int i3, float f, float f2, float f3, float f4, boolean z) {
        C85615x e;
        try {
            StickerItemModel stickerItemModel = new StickerItemModel(str, str2, str3, i3, this.f159077e.mo56358f(i), 0, this.f159075c, i2);
            stickerItemModel.f106999x = f;
            stickerItemModel.f107000y = f2;
            stickerItemModel.f106998w = f3;
            stickerItemModel.f106997h = f4;
            stickerItemModel.cutout = z;
            stickerItemModel.uiStartTime = 0;
            stickerItemModel.uiEndTime = this.f159077e.mo56246G();
            float[] fArr = new float[2];
            this.f159077e.mo56270a(i, fArr);
            stickerItemModel.currentOffsetX = fArr[0];
            stickerItemModel.currentOffsetY = fArr[1];
            this.f159077e.mo56322b(i, fArr[0], fArr[1]);
            stickerItemModel.setId(i);
            float[] h = this.f159077e.mo56364h(i);
            stickerItemModel.initWidth = (h[2] - h[0]) * ((float) this.f159076d.f158994c);
            stickerItemModel.initHeight = (h[1] - h[3]) * ((float) this.f159076d.f158995d);
            try {
                EffectCategoryResponse effectCategoryResponse = (EffectCategoryResponse) C84606n.m145426b().mo129425a(str);
                if (effectCategoryResponse != null) {
                    stickerItemModel.tabId = effectCategoryResponse.getId();
                }
                return stickerItemModel;
            } catch (C85615x e2) {
                e = e2;
                C40970e.m82487a((Throwable) new RuntimeException("add info sticker failed: ".concat(String.valueOf(str)), e));
                C40982q.m82522a("info_sticker", new C69840ar().mo110189a("event", "initSticker failed : ".concat(String.valueOf(str))).mo110189a("user_info", "initSticker size : " + this.f159073a.size()).mo110191a());
                return null;
            }
        } catch (C85615x e3) {
            e = e3;
            C40970e.m82487a((Throwable) new RuntimeException("add info sticker failed: ".concat(String.valueOf(str)), e));
            C40982q.m82522a("info_sticker", new C69840ar().mo110189a("event", "initSticker failed : ".concat(String.valueOf(str))).mo110189a("user_info", "initSticker size : " + this.f159073a.size()).mo110191a());
            return null;
        }
    }
}
