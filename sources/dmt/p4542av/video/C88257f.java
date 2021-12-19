package dmt.p4542av.video;

import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1213t;
import com.bytedance.common.utility.C13617h;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.p2082ss.android.ugc.aweme.draft.C43213k;
import com.p2082ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.p2082ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.p2082ss.android.ugc.aweme.effect.EffectPointModel;
import com.p2082ss.android.ugc.aweme.effect.p2891c.p2893b.C46344a;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.utils.C50811a;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50709q;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.p2987a.C50691c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.property.C65329a;
import com.p2082ss.android.ugc.aweme.property.C65357b;
import com.p2082ss.android.ugc.aweme.property.C65381bu;
import com.p2082ss.android.ugc.aweme.property.C65382bv;
import com.p2082ss.android.ugc.aweme.property.C65396ci;
import com.p2082ss.android.ugc.aweme.property.C65450ef;
import com.p2082ss.android.ugc.aweme.property.C65458em;
import com.p2082ss.android.ugc.aweme.property.C65475h;
import com.p2082ss.android.ugc.aweme.property.C65502y;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.C71817eu;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.AbstractC70977bq;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70973bm;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70979br;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.C71413b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.p3809b.C70935a;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.p3809b.C70936b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.p3809b.C70942f;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73962ap;
import com.p2082ss.android.ugc.aweme.utils.C80285bz;
import com.p2082ss.android.ugc.aweme.utils.C80418fa;
import com.p2082ss.android.ugc.gamora.editor.p4274a.C82027a;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import dmt.p4542av.video.C88288n;
import java.util.ArrayList;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: dmt.av.video.f */
public final class C88257f {

    /* renamed from: a */
    public static final C88257f f200297a = new C88257f();

    private C88257f() {
    }

    static {
        Covode.recordClassIndex(104292);
    }

    /* renamed from: a */
    public static final boolean m153367a(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        if (!videoPublishEditModel.isFastImport || C65458em.m117177a()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static final int[] m153370c(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        int[] b = m153369b(videoPublishEditModel);
        if (b[0] > 0 && b[1] > 0) {
            return b;
        }
        return new int[]{videoPublishEditModel.videoWidth(), videoPublishEditModel.videoHeight()};
    }

    /* renamed from: e */
    private static int m153372e(VideoPublishEditModel videoPublishEditModel) {
        AbstractC70977bq a = C70979br.m125332a(videoPublishEditModel);
        if (!(a.mo112109b() == 0 || a.mo112106a() == 0)) {
            float a2 = ((float) videoPublishEditModel.mOutVideoWidth) / ((float) a.mo112106a());
            float b = ((float) videoPublishEditModel.mOutVideoHeight) / ((float) a.mo112109b());
            if (a2 != 1.0f && b != 1.0f && a2 == b) {
                return 1;
            }
            if (!((a.mo112112d() == a.mo112109b() && a.mo112111c() == a.mo112106a()) || videoPublishEditModel.mOutVideoWidth == a.mo112106a())) {
                return 2;
            }
        }
        return 0;
    }

    /* renamed from: b */
    public static final int[] m153369b(VideoPublishEditModel videoPublishEditModel) {
        int a;
        boolean z;
        int i;
        String str = "";
        C89219l.m154721d(videoPublishEditModel, str);
        C65329a aVar = C63238c.f143572J;
        C89219l.m154716b(aVar, str);
        int[] a2 = C65357b.m117045a(aVar.f147454b);
        if (a2 == null || a2.length != 2 || a2[0] <= 0 || a2[1] <= 0) {
            if (!C70973bm.m125284a(videoPublishEditModel) || videoPublishEditModel.mOutVideoWidth <= 0 || videoPublishEditModel.mOutVideoHeight <= 0) {
                a2 = videoPublishEditModel.isFastImport ? new int[]{-1, -1} : new int[]{videoPublishEditModel.videoWidth(), videoPublishEditModel.videoHeight()};
            } else {
                a2 = new int[]{videoPublishEditModel.mOutVideoWidth, videoPublishEditModel.mOutVideoHeight};
            }
        }
        if (videoPublishEditModel.isMvThemeVideoType()) {
            C84911q.m145921a("CalculateOutVideoSize mv/status compileSize : " + a2[0] + 'x' + a2[1]);
            return a2;
        }
        C65450ef uploadSpeedEncodeSettings = videoPublishEditModel.getUploadSpeedEncodeSettings();
        if (C88278m.m153408a((Object) videoPublishEditModel)) {
            if (uploadSpeedEncodeSettings != null) {
                C84911q.m145928d("UploadSpeeds , highQualityCompileVideoSizeIndex : " + uploadSpeedEncodeSettings.f147625e);
                a = uploadSpeedEncodeSettings.f147625e;
            } else {
                a = C65382bv.m117079a();
            }
        } else if (uploadSpeedEncodeSettings != null) {
            C84911q.m145928d("UploadSpeeds , compileVideoSizeIndex : " + uploadSpeedEncodeSettings.f147624d);
            a = uploadSpeedEncodeSettings.f147624d;
        } else {
            a = C65502y.m117230a();
        }
        int[] a3 = C65357b.m117044a(a);
        if (videoPublishEditModel.isDuet()) {
            return m153368a(C65357b.m117051g(), a2);
        }
        String str2 = " sourceSize:" + a2[0] + "x" + a2[1];
        if (a3 != null) {
            str = " compileSize:" + a3[0] + "x" + a3[1];
            if (a2[0] > a2[1]) {
                z = true;
            } else {
                z = false;
            }
            int max = Math.max(a2[0], a2[1]);
            int min = Math.min(a2[0], a2[1]);
            float f = ((float) max) / ((float) min);
            int max2 = Math.max(a3[0], a3[1]);
            int min2 = Math.min(a3[0], a3[1]);
            if (min2 == 1080) {
                i = 1100;
            } else {
                i = min2;
            }
            if (max > max2 || min > i) {
                if (max * min2 >= min * max2) {
                    min = (int) (((float) max2) / f);
                    max = max2;
                } else {
                    max = (int) (((float) min2) * f);
                    min = min2;
                }
            }
            if (z) {
                a2[0] = max;
                a2[1] = min;
            } else {
                a2[1] = max;
                a2[0] = min;
            }
        }
        C84911q.m145921a("CalculateOutVideoSize " + str2 + (" resultSize:" + a2[0] + "x" + a2[1]) + " compileIndex:" + a + str);
        return a2;
    }

    /* renamed from: d */
    public static final boolean m153371d(VideoPublishEditModel videoPublishEditModel) {
        boolean z;
        boolean z2;
        boolean z3;
        int a;
        boolean z4;
        boolean z5;
        boolean z6;
        C89219l.m154721d(videoPublishEditModel, "");
        boolean a2 = C65396ci.m117096a();
        boolean a3 = m153367a(videoPublishEditModel);
        boolean isMvThemeVideoType = videoPublishEditModel.isMvThemeVideoType();
        boolean hasStickers = videoPublishEditModel.hasStickers();
        if (videoPublishEditModel.mTimeEffect != null || C13617h.m24466b(videoPublishEditModel.mEffectList)) {
            z = true;
        } else {
            z = false;
        }
        if (videoPublishEditModel.mSelectedId != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!videoPublishEditModel.isAutoEnhanceEnable(C70935a.m125235a()) || !videoPublishEditModel.autoEnhanceOn) {
            z3 = false;
        } else {
            z3 = true;
        }
        int c = C88168aj.m153239c(videoPublishEditModel.videoPath()) * 1000;
        C65450ef uploadSpeedEncodeSettings = videoPublishEditModel.getUploadSpeedEncodeSettings();
        if (uploadSpeedEncodeSettings != null) {
            a = uploadSpeedEncodeSettings.f147631k;
        } else {
            a = C65475h.m117202a();
        }
        if (C88278m.m153408a((Object) videoPublishEditModel)) {
            C65450ef uploadSpeedEncodeSettings2 = videoPublishEditModel.getUploadSpeedEncodeSettings();
            if (uploadSpeedEncodeSettings2 != null) {
                a = uploadSpeedEncodeSettings2.f147632l;
            } else {
                a = C65381bu.m117078a();
            }
        }
        if (c > a) {
            z4 = true;
        } else {
            z4 = false;
        }
        C65329a aVar = C63238c.f143572J;
        C89219l.m154716b(aVar, "");
        if (aVar.f147453a > 0.0f) {
            z5 = true;
        } else {
            z5 = false;
        }
        String str = videoPublishEditModel.mSelectedFilterResId;
        if (!(str == null || str.length() == 0)) {
            AbstractC50709q f = C63244g.m114602a().mo73290r().mo86006d().mo86071f();
            String str2 = videoPublishEditModel.mSelectedFilterResId;
            C89219l.m154716b(str2, "");
            FilterBean a4 = C50691c.m94987a(f, str2);
            if (a4 != null) {
                z6 = C50811a.m95159a(a4);
                C84911q.m145921a("ShouldRecode isABForceRecode:" + a2 + " isFastImportNotAllow:" + a3 + ' ' + "isMvThemeVideoType:" + isMvThemeVideoType + " hasStickers:" + hasStickers + " hasEffect:" + z + " hasEditPageFilter:" + z2 + ' ' + "isBitrateLarge:" + z4 + " isFestivalClose:" + z5 + " isComposerFilter: " + z6 + "useAutoEnhance: " + z3);
                if (!a2 || a3 || isMvThemeVideoType || hasStickers || z || z2 || z4 || z5 || z6 || z3) {
                    return true;
                }
                return false;
            }
        }
        z6 = false;
        C84911q.m145921a("ShouldRecode isABForceRecode:" + a2 + " isFastImportNotAllow:" + a3 + ' ' + "isMvThemeVideoType:" + isMvThemeVideoType + " hasStickers:" + hasStickers + " hasEffect:" + z + " hasEditPageFilter:" + z2 + ' ' + "isBitrateLarge:" + z4 + " isFestivalClose:" + z5 + " isComposerFilter: " + z6 + "useAutoEnhance: " + z3);
        if (!a2) {
        }
        return true;
    }

    /* renamed from: a */
    private static int[] m153368a(int[] iArr, int[] iArr2) {
        C89219l.m154721d(iArr2, "");
        if (iArr == null || iArr.length < 2 || iArr2.length < 2) {
            return iArr2;
        }
        if (C73962ap.m130083a(((float) iArr2[0]) / ((float) iArr2[1]), ((float) iArr[0]) / ((float) iArr[1]), 0.05f)) {
            return iArr2;
        }
        C84911q.m145921a("DuetCompileVideoSize, original video width:" + iArr2[0] + "height:" + iArr2[1] + " server RecordSize width " + iArr[0] + " height: " + iArr[1]);
        int min = Math.min(iArr[0], iArr[1]);
        int[] iArr3 = new int[2];
        float f = (float) (iArr[0] * 2);
        if (f > ((float) iArr[1])) {
            iArr3[1] = min;
            iArr3[0] = (int) ((f / ((float) iArr[1])) * ((float) iArr3[1]));
        } else {
            iArr3[0] = min;
            iArr3[1] = (int) ((((float) iArr[1]) / f) * ((float) iArr3[0]));
        }
        int i = 0;
        do {
            int i2 = iArr3[i] % 16;
            if (i2 < 8) {
                iArr3[i] = iArr3[i] - i2;
            } else {
                iArr3[i] = (iArr3[i] + 16) - i2;
            }
            i++;
        } while (i <= 1);
        C84911q.m145921a("DuetCompileVideoSize, final compile width:" + iArr3[0] + "height:" + iArr3[1]);
        return iArr3;
    }

    /* renamed from: a */
    public static final C88303z m153366a(VideoPublishEditModel videoPublishEditModel, AbstractC1204m mVar) {
        InfoStickerModel infoStickerModel;
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        C89219l.m154721d(videoPublishEditModel, "");
        C89219l.m154721d(mVar, "");
        C88271g gVar = new C88271g();
        AbstractC70977bq a = C70979br.m125332a(videoPublishEditModel);
        a.mo112108a(videoPublishEditModel.getCoverPublishModel().getNeedExpandCompiledSize(), false);
        VEPreviewParams a2 = C71413b.m126118a(videoPublishEditModel, 3, -1, -1);
        a2.mCanvasWidth = a.mo112111c();
        a2.mCanvasHeight = a.mo112112d();
        if (a2.mVideoPaths != null) {
            for (String str : a2.mVideoPaths) {
                C43213k.m86181a("[createFromVideoPublishEditModel]: segment.videoPath = ".concat(String.valueOf(str)));
            }
        }
        if (a2.mAudioPaths != null) {
            for (String str2 : a2.mAudioPaths) {
                C43213k.m86181a("[createFromVideoPublishEditModel]: segment.audioPath = ".concat(String.valueOf(str2)));
            }
        }
        if (videoPublishEditModel.veAudioEffectParam != null) {
            a2.setVeAudioEffectParam(videoPublishEditModel.veAudioEffectParam);
        }
        C1213t tVar = new C1213t();
        tVar.setValue(a2);
        C1213t tVar2 = new C1213t();
        if (videoPublishEditModel.isMusic() == 1 || C80285bz.m139187a(videoPublishEditModel)) {
            VEPreviewMusicParams vEPreviewMusicParams = new VEPreviewMusicParams();
            vEPreviewMusicParams.f200089i = videoPublishEditModel.isFastImport;
            vEPreviewMusicParams.f200088h = 3;
            vEPreviewMusicParams.f200081a = videoPublishEditModel.mMusicPath;
            vEPreviewMusicParams.f200082b = videoPublishEditModel.mMusicStart;
            String str3 = videoPublishEditModel.mMusicPath;
            C89219l.m154721d(videoPublishEditModel, "");
            vEPreviewMusicParams.f200083c = C80418fa.m139406a(str3);
            vEPreviewMusicParams.f200094n = videoPublishEditModel.recordBgmDelay;
            if (videoPublishEditModel.loudnessBalanceParam != null) {
                vEPreviewMusicParams.f200095o = videoPublishEditModel.loudnessBalanceParam.getBgmLoudness();
                vEPreviewMusicParams.f200096p = videoPublishEditModel.loudnessBalanceParam.getPeakLoudness();
                vEPreviewMusicParams.f200097q = videoPublishEditModel.loudnessBalanceParam.getAvgLoudness();
            }
            C69905c cVar = C70005cr.m123611a().f156482a;
            if (cVar == null || cVar.getShootDuration() <= 0 || Math.abs(vEPreviewMusicParams.f200083c - cVar.getShootDuration()) < 1000) {
                vEPreviewMusicParams.f200084d = vEPreviewMusicParams.f200083c;
            } else {
                vEPreviewMusicParams.f200084d = cVar.getShootDuration();
            }
            vEPreviewMusicParams.f200085e = videoPublishEditModel.musicVolume;
            vEPreviewMusicParams.f200086f = videoPublishEditModel.musicId;
            vEPreviewMusicParams.f200087g = videoPublishEditModel.previewStartTime;
            Boolean bool = videoPublishEditModel.isSoundLoop;
            C89219l.m154716b(bool, "");
            vEPreviewMusicParams.f200092l = bool.booleanValue();
            vEPreviewMusicParams.f200093m = C80285bz.m139187a(videoPublishEditModel);
            tVar2.setValue(vEPreviewMusicParams);
        }
        C1213t<InfoStickerModel> tVar3 = new C1213t<>();
        InfoStickerModel infoStickerModel2 = videoPublishEditModel.infoStickerModel;
        if (infoStickerModel2 == null || !C13617h.m24466b(infoStickerModel2.stickers) || !C70973bm.m125286b(videoPublishEditModel)) {
            infoStickerModel = videoPublishEditModel.infoStickerModel;
        } else {
            infoStickerModel = infoStickerModel2.clone();
            C89219l.m154716b(infoStickerModel, "");
            for (StickerItemModel stickerItemModel : infoStickerModel.stickers) {
                if (!stickerItemModel.isImageStickerLayer) {
                    float[] a3 = C70973bm.m125285a(stickerItemModel.currentOffsetX, stickerItemModel.currentOffsetY, videoPublishEditModel.mVideoCanvasWidth, videoPublishEditModel.mVideoCanvasHeight, videoPublishEditModel.mOutVideoWidth, videoPublishEditModel.mOutVideoHeight);
                    stickerItemModel.currentOffsetX = a3[0];
                    stickerItemModel.currentOffsetY = a3[1];
                }
            }
        }
        tVar3.setValue(infoStickerModel);
        C88276k<C88300w> kVar = new C88276k<>();
        C1213t<Boolean> tVar4 = new C1213t<>();
        C88276k<C88288n> kVar2 = new C88276k<>();
        C1213t<AudioRecorderParam> tVar5 = new C1213t<>();
        C1213t<C82027a> tVar6 = new C1213t<>();
        tVar6.setValue(new C82027a(videoPublishEditModel.isFastImport, videoPublishEditModel.isAudioEnhance));
        C1213t tVar7 = new C1213t();
        tVar7.setValue(new C70936b(videoPublishEditModel.autoEnhanceOn, videoPublishEditModel.autoEnhanceType, false, C70942f.m125238a(), C70942f.m125239b(), null, 32));
        C88303z zVar = new C88303z(videoPublishEditModel.videoEditorType);
        zVar.mo142791a(1);
        zVar.f200398I = m153372e(videoPublishEditModel);
        zVar.mo142790a();
        zVar.mo142794a(new ArrayList<>());
        zVar.mo142793a(tVar4);
        zVar.f200414n = new C1213t();
        zVar.f200415o = new C1213t();
        zVar.f200410j = kVar;
        zVar.f200412l = tVar5;
        zVar.f200411k = kVar2;
        zVar.mo142797b(new C1213t<>());
        zVar.f200413m = new C1213t();
        zVar.f200409i = gVar;
        zVar.f200408h = new C1213t();
        zVar.f200417q = tVar3;
        zVar.f200407g = new C1213t();
        zVar.f200406f = tVar2;
        zVar.f200419s = tVar7;
        zVar.f200421u = tVar6;
        zVar.f200405e = tVar;
        zVar.mo142792a(null, mVar, null, videoPublishEditModel);
        C88300w a4 = C46344a.m89393a(zVar.f200397H.mo142744d(), videoPublishEditModel);
        if (a4 != null) {
            kVar.setValue(a4);
        }
        if (videoPublishEditModel.mTimeEffect != null) {
            EffectPointModel effectPointModel = videoPublishEditModel.mTimeEffect;
            C89219l.m154716b(effectPointModel, "");
            if (C89219l.m154714a((Object) effectPointModel.getKey(), (Object) "1")) {
                if (videoPublishEditModel.isFastImport || videoPublishEditModel.isCutSameVideoType()) {
                    AbstractC31071f fVar = zVar.f200423w;
                    String[] reverseVideoArray = videoPublishEditModel.getPreviewInfo().getReverseVideoArray();
                    if (reverseVideoArray != null) {
                        ArrayList arrayList = new ArrayList(reverseVideoArray.length);
                        for (String str4 : reverseVideoArray) {
                            arrayList.add(str4.toString());
                        }
                        Object[] array = arrayList.toArray(new String[0]);
                        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                        strArr = (String[]) array;
                    } else {
                        strArr = null;
                    }
                    fVar.mo56296a(strArr, videoPublishEditModel.getPreviewInfo().getReverseAudioArray());
                    AbstractC31071f fVar2 = zVar.f200423w;
                    String[] tempVideoArray = videoPublishEditModel.getPreviewInfo().getTempVideoArray();
                    if (tempVideoArray != null) {
                        ArrayList arrayList2 = new ArrayList(tempVideoArray.length);
                        for (String str5 : tempVideoArray) {
                            arrayList2.add(str5.toString());
                        }
                        Object[] array2 = arrayList2.toArray(new String[0]);
                        Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T>");
                        strArr2 = (String[]) array2;
                    } else {
                        strArr2 = null;
                    }
                    fVar2.mo56312a(strArr2);
                } else {
                    AbstractC31071f fVar3 = zVar.f200423w;
                    String[] reverseVideoArray2 = videoPublishEditModel.getPreviewInfo().getReverseVideoArray();
                    if (reverseVideoArray2 != null) {
                        ArrayList arrayList3 = new ArrayList(reverseVideoArray2.length);
                        for (String str6 : reverseVideoArray2) {
                            arrayList3.add(str6.toString());
                        }
                        Object[] array3 = arrayList3.toArray(new String[0]);
                        Objects.requireNonNull(array3, "null cannot be cast to non-null type kotlin.Array<T>");
                        strArr3 = (String[]) array3;
                    } else {
                        strArr3 = null;
                    }
                    fVar3.mo56329b(strArr3);
                }
                zVar.f200423w.mo56338c(true);
                if (videoPublishEditModel.isFastImport || videoPublishEditModel.isCutSameVideoType()) {
                    zVar.f200423w.mo56313a(zVar.f200423w.mo56300a().f191689j, zVar.f200423w.mo56300a().f191690k, a2.mVolume);
                }
            }
        }
        if (videoPublishEditModel.mEffectList != null) {
            C88293q.m153433a(videoPublishEditModel.mEffectList, gVar);
        }
        if (videoPublishEditModel.veAudioRecorderParam != null) {
            tVar5.setValue(videoPublishEditModel.veAudioRecorderParam);
        }
        if (videoPublishEditModel.veAudioEffectParam != null) {
            AudioEffectParam audioEffectParam = videoPublishEditModel.veAudioEffectParam;
            if (audioEffectParam != null) {
                audioEffectParam.setShowErrorToast(false);
            }
            AudioEffectParam audioEffectParam2 = videoPublishEditModel.veAudioEffectParam;
            if (audioEffectParam2 != null) {
                audioEffectParam2.setPreprocessResult(null);
            }
            kVar2.setValue(C88288n.C88289a.m153424a(videoPublishEditModel.veAudioEffectParam));
        }
        if (videoPublishEditModel.mSelectedId != 0) {
            zVar.f200423w.mo56337c(C71817eu.m126789a(videoPublishEditModel, C63244g.m114602a().mo73272a(C71817eu.m126795f(videoPublishEditModel)).mo86006d()).getFilterFolder(), videoPublishEditModel.mSelectedFilterIntensity);
        }
        return zVar;
    }
}
