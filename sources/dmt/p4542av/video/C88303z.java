package dmt.p4542av.video;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.view.SurfaceView;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.bytedance.common.utility.C13617h;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.editor.preview.IAudioEffectParam;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.asve.editor.C31060a;
import com.p2082ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.p2082ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.p2082ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.p2082ss.android.ugc.aweme.effect.EffectPointModel;
import com.p2082ss.android.ugc.aweme.filter.p2982b.C50647b;
import com.p2082ss.android.ugc.aweme.filter.p2983c.C50649a;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.main.C50798l;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.main.C50808r;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50706n;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50707o;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50709q;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.p2987a.C50691c;
import com.p2082ss.android.ugc.aweme.p2730de.C40970e;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.property.C65375bo;
import com.p2082ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.audioeffect.C70837c;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.C71046al;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3827b.C71428c;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.p3809b.C70936b;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73975b;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.gamora.editor.p4274a.C82027a;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.vesdk.filterparam.VEAudioSamiFilterParam;
import dmt.p4542av.video.C88288n;
import dmt.p4542av.video.p4545b.AbstractC88181j;
import dmt.p4542av.video.p4545b.C88229m;
import dmt.p4542av.video.p4545b.C88231n;
import dmt.p4542av.video.p4545b.C88233o;
import dmt.p4542av.video.p4545b.C88234p;
import dmt.p4542av.video.p4545b.C88238s;
import java.io.File;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: dmt.av.video.z */
public final class C88303z {

    /* renamed from: A */
    public C1213t<Void> f200390A = new C1213t<>();

    /* renamed from: B */
    public C1213t<Boolean> f200391B = new C1213t<>();

    /* renamed from: C */
    boolean f200392C = false;

    /* renamed from: D */
    boolean f200393D = false;

    /* renamed from: E */
    boolean f200394E = false;

    /* renamed from: F */
    volatile boolean f200395F = false;

    /* renamed from: G */
    VEAudioSamiFilterParam f200396G = null;

    /* renamed from: H */
    public AbstractC88181j f200397H;

    /* renamed from: I */
    public int f200398I;

    /* renamed from: J */
    public C1213t<AbstractC31071f> f200399J;

    /* renamed from: K */
    private int f200400K;

    /* renamed from: a */
    Context f200401a;

    /* renamed from: b */
    AbstractC1204m f200402b;

    /* renamed from: c */
    SurfaceView f200403c;

    /* renamed from: d */
    public boolean f200404d;

    /* renamed from: e */
    public LiveData<VEPreviewParams> f200405e;

    /* renamed from: f */
    public LiveData<VEPreviewMusicParams> f200406f;

    /* renamed from: g */
    public LiveData<C50649a> f200407g;

    /* renamed from: h */
    public LiveData<C88296t> f200408h;

    /* renamed from: i */
    public LiveData<C88292p> f200409i;

    /* renamed from: j */
    public C88276k<C88300w> f200410j;

    /* renamed from: k */
    public C88276k<C88288n> f200411k;

    /* renamed from: l */
    public C1213t<AudioRecorderParam> f200412l;

    /* renamed from: m */
    public LiveData<VEVolumeChangeOp> f200413m;

    /* renamed from: n */
    public LiveData<C88295s> f200414n;

    /* renamed from: o */
    public LiveData<C88299v> f200415o;

    /* renamed from: p */
    public C1213t<InfoStickerModel> f200416p;

    /* renamed from: q */
    public C1213t<InfoStickerModel> f200417q;

    /* renamed from: r */
    public C1213t<Boolean> f200418r;

    /* renamed from: s */
    public LiveData<C70936b> f200419s;

    /* renamed from: t */
    public C1213t<Boolean> f200420t;

    /* renamed from: u */
    public C1213t<C82027a> f200421u;

    /* renamed from: v */
    public VEEditorAutoStartStopArbiter f200422v;

    /* renamed from: w */
    public AbstractC31071f f200423w;

    /* renamed from: x */
    public C1213t<Integer> f200424x = new C1213t<>();

    /* renamed from: y */
    public boolean f200425y = false;

    /* renamed from: z */
    public C1213t<Void> f200426z = new C1213t<>();

    static {
        Covode.recordClassIndex(104338);
    }

    /* renamed from: a */
    public final void mo142790a() {
        this.f200397H.f200156q = false;
    }

    /* renamed from: d */
    public final void mo142799d() {
        this.f200423w.mo56390u();
    }

    /* renamed from: e */
    public final void mo142800e() {
        this.f200423w.mo56388t();
    }

    /* renamed from: b */
    public final void mo142796b() {
        C1213t<AbstractC31071f> tVar = this.f200399J;
        if (tVar != null) {
            tVar.setValue(null);
        }
        AbstractC31071f fVar = this.f200423w;
        if (fVar != null) {
            fVar.mo56387s();
        }
    }

    /* renamed from: c */
    public final C88276k<C88288n> mo142798c() {
        C88276k<C88288n> kVar = this.f200411k;
        if (kVar == null) {
            return new C88276k<>();
        }
        return kVar;
    }

    /* renamed from: b */
    public final void mo142797b(C1213t<IAudioEffectParam> tVar) {
        this.f200397H.f200142c = tVar;
    }

    /* renamed from: a */
    public final void mo142791a(int i) {
        this.f200400K = i;
        AbstractC88181j jVar = this.f200397H;
        if (jVar != null) {
            jVar.f200157r = i;
        }
    }

    /* renamed from: a */
    public final void mo142793a(C1213t<Boolean> tVar) {
        this.f200397H.f200140a = tVar;
    }

    /* renamed from: a */
    public final void mo142794a(ArrayList<EffectPointModel> arrayList) {
        this.f200397H.f200143d = arrayList;
    }

    public C88303z(int i) {
        AbstractC50706n a;
        C88238s sVar = new C88238s();
        sVar.f200274b = 3;
        sVar.mo142772a(C88159aa.f200114a);
        sVar.f200276d = C65375bo.m117071a();
        AbstractC88181j a2 = C88229m.m153326a(i, sVar);
        this.f200397H = a2;
        if (i == 6) {
            this.f200394E = true;
        }
        String str = VEVideoPublishEditActivity.f158469e;
        if (C50647b.m94905a()) {
            a = C50808r.C50809a.m95157a(str);
        } else {
            a = C50798l.C50799a.m95127a(str);
        }
        a2.f200155p = a;
    }

    /* renamed from: a */
    public final boolean mo142795a(InfoStickerModel infoStickerModel, VEPreviewParams vEPreviewParams) {
        int a;
        float canvasHeight;
        TextStickerData textStickerData;
        MethodCollector.m26663i(11345);
        if (infoStickerModel == null || C13617h.m24465a(infoStickerModel.stickers)) {
            MethodCollector.m26664o(11345);
            return false;
        }
        for (StickerItemModel stickerItemModel : infoStickerModel.stickers) {
            if (stickerItemModel == null) {
                C63244g.m114602a();
            } else {
                String str = C80720e.m139927b(stickerItemModel.path) ? stickerItemModel.path : infoStickerModel.infoStickerDraftDir + File.separator + new File(stickerItemModel.path).getName();
                if (!C80720e.m139927b(str)) {
                    C63244g.m114602a();
                    C40970e.m82487a((Throwable) new Exception("infoSticker not exist ".concat(String.valueOf(stickerItemModel))));
                } else {
                    if (stickerItemModel.isImageSticker()) {
                        a = this.f200423w.mo56283a(str, stickerItemModel.f106999x, stickerItemModel.f107000y, stickerItemModel.f106998w, stickerItemModel.f106997h);
                    } else if (!stickerItemModel.isImageStickerLayer) {
                        a = this.f200423w.mo56292a(str, TextUtils.isEmpty(stickerItemModel.extra) ? null : new String[]{stickerItemModel.extra});
                    } else if (vEPreviewParams == null || vEPreviewParams.getCanvasWidth() <= 0 || vEPreviewParams.getCanvasHeight() <= 0) {
                        a = this.f200423w.mo56283a(str, 0.0f, 0.0f, 1.0f, 1.0f);
                    } else {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        if (C84902i.m145892a(str)) {
                            BitmapFactory.decodeFile(str, options);
                            canvasHeight = (((float) options.outHeight) * 1.0f) / ((float) options.outWidth);
                        } else {
                            canvasHeight = (((float) vEPreviewParams.getCanvasHeight()) * 1.0f) / ((float) vEPreviewParams.getCanvasWidth());
                        }
                        a = this.f200423w.mo56282a(str, new BigDecimal((double) canvasHeight).setScale(4, 4).floatValue());
                        vEPreviewParams.getCanvasWidth();
                        vEPreviewParams.getCanvasHeight();
                    }
                    C84911q.m145928d("changeInfoSticker id = ".concat(String.valueOf(a)));
                    if (a == -1) {
                        C63244g.m114602a();
                    } else {
                        if (!stickerItemModel.isPin() || !C84902i.m145892a(stickerItemModel.pinAlgorithmFile)) {
                            this.f200423w.mo56254a(a, stickerItemModel.currentOffsetX, stickerItemModel.currentOffsetY);
                            this.f200423w.mo56321b(a, stickerItemModel.scale);
                            this.f200423w.mo56253a(a, -stickerItemModel.rotateAngle);
                            this.f200423w.mo56255a(a, stickerItemModel.startTime, stickerItemModel.endTime);
                            this.f200423w.mo56355f(a, stickerItemModel.layerWeight);
                        } else {
                            this.f200423w.mo56255a(a, stickerItemModel.startTime, stickerItemModel.endTime);
                            this.f200423w.mo56355f(a, stickerItemModel.layerWeight);
                            ByteBuffer a2 = C71046al.m125455a(stickerItemModel.pinAlgorithmFile);
                            if (a2 != null) {
                                this.f200423w.mo56268a(a, a2);
                                int i = this.f200400K;
                                if (i == 1) {
                                    this.f200423w.mo56377n(this.f200398I);
                                } else if (i == 2) {
                                    this.f200423w.mo56377n(1);
                                }
                            }
                        }
                        if (stickerItemModel.isTextSticker() && (textStickerData = (TextStickerData) C63244g.m114602a().mo73261G().mo46670a(stickerItemModel.extra, TextStickerData.class)) != null && textStickerData.getHasReadTextAudio() && !TextUtils.isEmpty(textStickerData.getAudioTrackFilePath())) {
                            this.f200423w.mo56313a(this.f200423w.mo56285a((String) Objects.requireNonNull(textStickerData.getAudioTrackFilePath()), 0, textStickerData.getAudioTrackDuration(), textStickerData.getStartTime(), textStickerData.getStartTime() + textStickerData.getAudioTrackDuration(), false), 1, 1.0f);
                        }
                    }
                }
            }
        }
        MethodCollector.m26664o(11345);
        return true;
    }

    /* renamed from: a */
    public final void mo142792a(Context context, AbstractC1204m mVar, SurfaceView surfaceView, VideoPublishEditModel videoPublishEditModel) {
        m153460b(context, mVar, surfaceView, videoPublishEditModel);
    }

    /* renamed from: b */
    private void m153460b(Context context, final AbstractC1204m mVar, SurfaceView surfaceView, final VideoPublishEditModel videoPublishEditModel) {
        this.f200392C = false;
        this.f200401a = context;
        this.f200402b = mVar;
        this.f200403c = surfaceView;
        this.f200405e.observe(mVar, new AbstractC1214u<VEPreviewParams>() {
            /* class dmt.p4542av.video.C88303z.C883041 */

            static {
                Covode.recordClassIndex(104339);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // androidx.lifecycle.AbstractC1214u
            public final /* synthetic */ void onChanged(VEPreviewParams vEPreviewParams) {
                boolean z;
                VEPreviewParams vEPreviewParams2 = vEPreviewParams;
                C73975b.C73976a.f166071a.step("av_video_edit", "VEEditor init start");
                C84911q.m145921a("VEEditor init start");
                C71428c.m126149a(vEPreviewParams2);
                C88303z.this.f200397H.f200164y = new C88167ai(this);
                int a = C88303z.this.f200397H.mo142714a(C88303z.this.f200401a, vEPreviewParams2, C88303z.this.f200403c, mVar);
                C88303z zVar = C88303z.this;
                zVar.f200423w = zVar.f200397H.mo142739b();
                if (C88303z.this.f200423w instanceof C31060a) {
                    ((C31060a) C88303z.this.f200423w).mo56244E().mo131672c(true);
                }
                C88303z zVar2 = C88303z.this;
                zVar2.f200422v = zVar2.f200397H.f200144e;
                if (!(vEPreviewParams2.veCherEffectParam == null || vEPreviewParams2.veCherEffectParam.getMatrix() == null)) {
                    C88303z.this.f200423w.mo56317a(vEPreviewParams2.veCherEffectParam);
                }
                C88303z zVar3 = C88303z.this;
                VideoPublishEditModel videoPublishEditModel = videoPublishEditModel;
                AbstractC50707o d = C63244g.m114602a().mo73290r().mo86006d();
                AbstractC50709q f = d.mo86071f();
                d.mo86064a();
                AbstractC1204m mVar = zVar3.f200402b;
                String str = videoPublishEditModel.mSelectedFilterId;
                String str2 = videoPublishEditModel.mSelectedFilterResId;
                C88166ah ahVar = new C88166ah(zVar3, videoPublishEditModel);
                C89219l.m154721d(f, "");
                C89219l.m154721d(mVar, "");
                C89219l.m154721d(ahVar, "");
                f.mo86075b().observe(mVar, new C50691c.C50693b(ahVar, str2, str));
                C88303z.this.f200397H.mo142749i();
                AbstractC88181j jVar = C88303z.this.f200397H;
                if (!C88303z.this.f200394E || !vEPreviewParams2.recordData.isMultiEditRetake) {
                    z = true;
                } else {
                    z = false;
                }
                jVar.mo142730a(z);
                if (vEPreviewParams2.mVeAudioRecordParam != null && !TextUtils.isEmpty(vEPreviewParams2.mVeAudioRecordParam.getAudioUrl())) {
                    C88303z.this.f200412l.setValue(vEPreviewParams2.mVeAudioRecordParam);
                }
                if (!(vEPreviewParams2.mVeAudioEffectParam == null || C88303z.this.mo142798c() == null)) {
                    C88303z.this.mo142798c().setValue(C88288n.C88289a.m153424a(vEPreviewParams2.mVeAudioEffectParam));
                }
                if (C88303z.this.f200397H instanceof C88233o) {
                    C88303z.this.f200423w.mo56313a(0, 1, vEPreviewParams2.mMusicVolume);
                } else if (C88303z.this.f200397H instanceof C88234p) {
                    C88303z.this.f200423w.mo56313a(0, 1, vEPreviewParams2.mMusicVolume);
                } else if (C88303z.this.f200397H instanceof C88231n) {
                    C88303z.this.f200423w.mo56313a(0, 0, vEPreviewParams2.mVolume);
                } else if (vEPreviewParams2.mAudioPaths != null && vEPreviewParams2.mAudioPaths.length == 1) {
                    C88303z.this.f200423w.mo56313a(0, 0, vEPreviewParams2.mVolume);
                }
                if (vEPreviewParams2.isFastImport || vEPreviewParams2.isCutSameType) {
                    C88303z.this.f200423w.mo56313a(C88303z.this.f200423w.mo56300a().f191689j, C88303z.this.f200423w.mo56300a().f191690k, vEPreviewParams2.mVolume);
                }
                C88303z.this.f200424x.setValue(Integer.valueOf(a));
                if (C88303z.this.f200399J != null) {
                    C88303z.this.f200399J.setValue(C88303z.this.f200423w);
                }
                C73975b.C73976a.f166071a.step("av_video_edit", "VEEditor init end");
                C84911q.m145921a("VEEditor init end");
            }
        });
        this.f200405e.observe(this.f200402b, new C88252e());
        this.f200406f.observe(this.f200402b, new AbstractC1214u<VEPreviewMusicParams>() {
            /* class dmt.p4542av.video.C88303z.C883094 */

            static {
                Covode.recordClassIndex(104344);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // androidx.lifecycle.AbstractC1214u
            public final /* synthetic */ void onChanged(VEPreviewMusicParams vEPreviewMusicParams) {
                C88303z.this.f200397H.mo142733a(vEPreviewMusicParams);
            }
        });
        this.f200406f.observe(this.f200402b, new C88252e());
        this.f200407g.observe(this.f200402b, new AbstractC1214u<C50649a>() {
            /* class dmt.p4542av.video.C88303z.C883105 */

            static {
                Covode.recordClassIndex(104345);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // androidx.lifecycle.AbstractC1214u
            public final /* synthetic */ void onChanged(C50649a aVar) {
                C50649a aVar2 = aVar;
                if (aVar2 != null) {
                    C88303z.this.f200397H.mo142731a(aVar2.f116985b, true);
                }
            }
        });
        this.f200407g.observe(this.f200402b, new C88252e());
        this.f200408h.observe(this.f200402b, new AbstractC1214u<C88296t>() {
            /* class dmt.p4542av.video.C88303z.C883116 */

            static {
                Covode.recordClassIndex(104346);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // androidx.lifecycle.AbstractC1214u
            public final /* synthetic */ void onChanged(C88296t tVar) {
                C88303z.this.f200397H.mo142736a(tVar);
            }
        });
        this.f200408h.observe(this.f200402b, new C88252e());
        this.f200409i.observe(this.f200402b, new AbstractC1214u<C88292p>() {
            /* class dmt.p4542av.video.C88303z.C883127 */

            static {
                Covode.recordClassIndex(104347);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // androidx.lifecycle.AbstractC1214u
            public final /* synthetic */ void onChanged(C88292p pVar) {
                C88303z.this.f200397H.mo142734a(pVar);
            }
        });
        this.f200409i.observe(this.f200402b, new C88252e());
        this.f200410j.mo142776a(this.f200402b, new AbstractC88248d<C88300w>() {
            /* class dmt.p4542av.video.C88303z.C883138 */

            static {
                Covode.recordClassIndex(104348);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // dmt.p4542av.video.AbstractC88248d
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo114868a(C88300w wVar, C88300w wVar2) {
                C88303z.this.f200397H.mo142738a(wVar, wVar2);
            }
        });
        this.f200410j.observe(this.f200402b, new C88252e());
        C1213t<AudioRecorderParam> tVar = this.f200412l;
        if (tVar != null) {
            tVar.observe(this.f200402b, new C88160ab(this));
        }
        mo142798c().mo142776a(this.f200402b, new AbstractC88248d<C88288n>() {
            /* class dmt.p4542av.video.C88303z.C883149 */

            static {
                Covode.recordClassIndex(104349);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // dmt.p4542av.video.AbstractC88248d
            /* renamed from: a */
            public final /* synthetic */ void mo114868a(C88288n nVar, C88288n nVar2) {
                AbstractC88181j jVar = C88303z.this.f200397H;
                C70837c.C70838a.m125105a();
                jVar.mo142727a(nVar, nVar2, C70837c.C70838a.m125107c());
            }
        });
        this.f200413m.observe(this.f200402b, new AbstractC1214u<VEVolumeChangeOp>() {
            /* class dmt.p4542av.video.C88303z.C8830510 */

            static {
                Covode.recordClassIndex(104340);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // androidx.lifecycle.AbstractC1214u
            public final /* synthetic */ void onChanged(VEVolumeChangeOp vEVolumeChangeOp) {
                C88303z.this.f200397H.mo142732a(vEVolumeChangeOp);
            }
        });
        this.f200413m.observe(this.f200402b, new C88252e());
        this.f200414n.observe(this.f200402b, new AbstractC1214u<C88295s>() {
            /* class dmt.p4542av.video.C88303z.C8830611 */

            static {
                Covode.recordClassIndex(104341);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // androidx.lifecycle.AbstractC1214u
            public final /* synthetic */ void onChanged(C88295s sVar) {
                C88303z.this.f200397H.mo142735a(sVar);
            }
        });
        this.f200414n.observe(this.f200402b, new C88252e());
        this.f200415o.observe(this.f200402b, new AbstractC1214u<C88299v>() {
            /* class dmt.p4542av.video.C88303z.C883072 */

            static {
                Covode.recordClassIndex(104342);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // androidx.lifecycle.AbstractC1214u
            public final /* synthetic */ void onChanged(C88299v vVar) {
                C88303z.this.f200397H.mo142737a(vVar);
            }
        });
        C1213t<InfoStickerModel> tVar2 = this.f200416p;
        if (tVar2 != null) {
            tVar2.observe(this.f200402b, new C88161ac(this));
            this.f200416p.observe(this.f200402b, new C88252e());
        }
        C1213t<Boolean> tVar3 = this.f200418r;
        if (tVar3 != null) {
            tVar3.observe(this.f200402b, new C88162ad(this));
        }
        C1213t<Boolean> tVar4 = this.f200420t;
        if (tVar4 != null) {
            tVar4.observe(this.f200402b, new C88163ae(this));
        }
        C1213t<InfoStickerModel> tVar5 = this.f200417q;
        if (tVar5 != null) {
            tVar5.observe(this.f200402b, new C88164af(this));
            this.f200417q.observe(this.f200402b, new C88252e());
        }
        LiveData<C70936b> liveData = this.f200419s;
        if (liveData != null) {
            liveData.observe(this.f200402b, new C88252e<C70936b>() {
                /* class dmt.p4542av.video.C88303z.C883083 */

                static {
                    Covode.recordClassIndex(104343);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // androidx.lifecycle.AbstractC1214u, dmt.p4542av.video.C88252e
                public final /* synthetic */ void onChanged(C70936b bVar) {
                    C88303z.this.f200397H.mo142726a(bVar, "");
                }
            });
        }
        C1213t<C82027a> tVar6 = this.f200421u;
        if (tVar6 != null) {
            tVar6.observe(this.f200402b, new C88165ag(this));
        }
    }
}
