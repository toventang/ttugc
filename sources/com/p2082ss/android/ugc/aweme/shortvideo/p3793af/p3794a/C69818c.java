package com.p2082ss.android.ugc.aweme.shortvideo.p3793af.p3794a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.editor.C31060a;
import com.p2082ss.android.ugc.asve.editor.C31079j;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.aweme.watermark.AbstractC81510t;
import com.p2082ss.android.ugc.aweme.watermark.C81488b;
import com.p2082ss.android.ugc.aweme.watermark.C81504n;
import com.p2082ss.android.ugc.aweme.watermark.C81505o;
import com.p2082ss.android.vesdk.C85581w;
import com.p2082ss.android.vesdk.VEListener;
import com.p2082ss.android.vesdk.VESize;
import com.p2082ss.android.vesdk.VEUtils;
import com.p2082ss.android.vesdk.VEWatermarkParam;
import com.p2082ss.android.vesdk.filterparam.VEImageAddFilterParam;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.af.a.c */
public final class C69818c implements AbstractC69822f {

    /* renamed from: a */
    private volatile boolean f156038a;

    /* renamed from: b */
    private C81505o f156039b;

    /* renamed from: c */
    private C31060a f156040c;

    /* renamed from: d */
    private final String f156041d;

    static {
        Covode.recordClassIndex(82224);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.af.a.c$a */
    public static final class C69819a implements VEListener.AbstractC85248q {

        /* renamed from: a */
        final /* synthetic */ C69818c f156042a;

        /* renamed from: b */
        final /* synthetic */ AbstractC81510t f156043b;

        /* renamed from: c */
        final /* synthetic */ AbstractC69820d f156044c;

        static {
            Covode.recordClassIndex(82225);
        }

        @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85248q
        public final void onCompileDone() {
            AbstractC69820d dVar = this.f156044c;
            if (dVar != null) {
                dVar.mo110171a();
            }
            this.f156042a.mo110170a((C81505o) this.f156043b);
        }

        @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85248q
        public final void onCompileProgress(float f) {
            AbstractC69820d dVar = this.f156044c;
            if (dVar != null) {
                dVar.mo110172a(f);
            }
        }

        C69819a(C69818c cVar, AbstractC81510t tVar, AbstractC69820d dVar) {
            this.f156042a = cVar;
            this.f156043b = tVar;
            this.f156044c = dVar;
        }

        @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85248q
        public final void onCompileError(int i, int i2, float f, String str) {
            AbstractC69820d dVar = this.f156044c;
            if (dVar != null) {
                if (str == null) {
                    str = "";
                }
                dVar.mo110173a(i, str, i2);
            }
            this.f156042a.mo110170a((C81505o) this.f156043b);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3793af.p3794a.AbstractC69822f
    /* renamed from: a */
    public final void mo110167a() {
        if (this.f156038a) {
            C81505o oVar = this.f156039b;
            if (oVar != null) {
                m123377b(oVar);
            }
            C31060a aVar = this.f156040c;
            if (aVar != null) {
                aVar.mo56387s();
            }
            this.f156040c = null;
            this.f156038a = false;
        }
    }

    public C69818c(String str) {
        C89219l.m154721d(str, "");
        this.f156041d = str;
    }

    /* renamed from: a */
    public final void mo110170a(C81505o oVar) {
        this.f156038a = false;
        C31060a aVar = this.f156040c;
        if (aVar != null) {
            aVar.mo56387s();
        }
        this.f156040c = null;
        m123377b(oVar);
    }

    /* renamed from: b */
    private static void m123377b(C81505o oVar) {
        String str;
        String str2;
        String[] strArr;
        String[] strArr2;
        VEWatermarkParam vEWatermarkParam = oVar.f182233f;
        if (!(vEWatermarkParam == null || (strArr2 = vEWatermarkParam.images) == null || strArr2.length == 0)) {
            for (String str3 : strArr2) {
                C80720e.m139931c(str3);
            }
        }
        VEWatermarkParam vEWatermarkParam2 = oVar.f182233f;
        if (!(vEWatermarkParam2 == null || (strArr = vEWatermarkParam2.secondHalfImages) == null || strArr.length == 0)) {
            for (String str4 : strArr) {
                C80720e.m139931c(str4);
            }
        }
        C81504n nVar = oVar.f182228a;
        if (!(nVar == null || (str2 = nVar.f182222b) == null)) {
            C80720e.m139931c(str2);
        }
        C81504n nVar2 = oVar.f182228a;
        if (!(nVar2 == null || (str = nVar2.f182223c) == null)) {
            C80720e.m139931c(str);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v3, resolved type: java.lang.Integer[] */
    /* JADX DEBUG: Multi-variable search result rejected for r1v25, resolved type: java.lang.Integer[] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3793af.p3794a.AbstractC69822f
    /* renamed from: a */
    public final void mo110169a(AbstractC81510t tVar, AbstractC69820d dVar) {
        int a;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        List<Number> b;
        String str;
        int i7;
        int i8;
        int i9;
        VEWatermarkParam vEWatermarkParam;
        VEWatermarkParam vEWatermarkParam2;
        VEWatermarkParam.VEWatermarkEntity[] entities;
        String[] strArr;
        C89219l.m154721d(tVar, "");
        if (tVar instanceof C81505o) {
            C81505o oVar = (C81505o) tVar;
            String str2 = null;
            int i10 = -1;
            if (oVar.f182233f == null || !(((vEWatermarkParam = oVar.f182233f) == null || (strArr = vEWatermarkParam.images) == null || strArr.length == 0) && ((vEWatermarkParam2 = oVar.f182233f) == null || (entities = vEWatermarkParam2.getEntities()) == null || entities.length == 0))) {
                C63238c.m114595e();
                if (this.f156040c == null) {
                    C31060a aVar = new C31060a(this.f156041d);
                    aVar.mo56311a(false);
                    aVar.mo56342c(2);
                    this.f156040c = aVar;
                }
                C31060a aVar2 = this.f156040c;
                if (aVar2 != null) {
                    this.f156039b = oVar;
                    if (oVar.f182233f != null) {
                        oVar.f182234g.setWatermark(oVar.f182233f);
                    }
                    if (oVar.f182228a != null) {
                        C81504n nVar = oVar.f182228a;
                        if (nVar != null) {
                            if (nVar.f182224d <= 0) {
                                VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo(tVar.f182253h);
                                if (videoFileInfo != null) {
                                    i7 = videoFileInfo.duration;
                                } else {
                                    i7 = -1;
                                }
                                nVar.f182224d = i7;
                                Integer[] numArr = new Integer[2];
                                if (videoFileInfo != null) {
                                    i8 = videoFileInfo.width;
                                } else {
                                    i8 = -1;
                                }
                                numArr[0] = Integer.valueOf(i8);
                                if (videoFileInfo != null) {
                                    i9 = videoFileInfo.height;
                                } else {
                                    i9 = -1;
                                }
                                numArr[1] = Integer.valueOf(i9);
                                nVar.mo125219a(C89070n.m154522b(numArr));
                            }
                            C31079j jVar = new C31079j(new String[]{tVar.f182253h, nVar.f182222b});
                            jVar.mo56409a(oVar.f182231d);
                            jVar.f74439a = new int[]{0, 0};
                            jVar.f74440b = new int[]{nVar.f182224d, nVar.f182225e + nVar.f182226f};
                            jVar.f74441c = null;
                            a = aVar2.mo56274a(jVar);
                            if (a == 0 && (str = nVar.f182223c) != null && new File(str).exists()) {
                                int i11 = nVar.f182224d;
                                Integer.valueOf(aVar2.mo56285a(str, 0, nVar.f182225e, i11, i11 + nVar.f182225e, false));
                            }
                            VEWatermarkParam vEWatermarkParam3 = oVar.f182233f;
                            if (vEWatermarkParam3 != null) {
                                vEWatermarkParam3.duration = (long) nVar.f182224d;
                            }
                        } else {
                            a = -1;
                        }
                    } else if (oVar.f182233f == null) {
                        a = -1;
                        dVar.mo110173a(a, "init editor failed with errorCode:".concat(String.valueOf(a)), 0);
                        mo110170a(oVar);
                        return;
                    } else {
                        C31079j jVar2 = new C31079j(new String[]{tVar.f182253h});
                        jVar2.mo56409a(oVar.f182231d);
                        a = aVar2.mo56274a(jVar2);
                    }
                    if (a == 0) {
                        C81504n nVar2 = oVar.f182228a;
                        if (nVar2 != null && (!nVar2.f182221a.isEmpty())) {
                            Integer[] numArr2 = new Integer[2];
                            VESize videoRes = oVar.f182234g.getVideoRes();
                            if (videoRes != null) {
                                i6 = videoRes.width;
                            } else {
                                i6 = -1;
                            }
                            numArr2[0] = Integer.valueOf(i6);
                            VESize videoRes2 = oVar.f182234g.getVideoRes();
                            if (videoRes2 != null) {
                                i10 = videoRes2.height;
                            }
                            numArr2[1] = Integer.valueOf(i10);
                            List b2 = C89070n.m154522b(numArr2);
                            List<Integer> list = nVar2.f182227g;
                            if (list.get(0).intValue() > list.get(1).intValue()) {
                                b = C89070n.m154522b(b2.get(0), Integer.valueOf((int) ((((Number) b2.get(0)).floatValue() * 1.0f) / ((list.get(0).floatValue() * 1.0f) / list.get(1).floatValue()))));
                            } else {
                                b = C89070n.m154522b(b2.get(0), Integer.valueOf(Math.min((int) ((((Number) b2.get(0)).floatValue() * 1.0f) / ((list.get(0).floatValue() * 1.0f) / list.get(1).floatValue())), ((Number) b2.get(1)).intValue())));
                            }
                            String str3 = nVar2.f182221a.get(0);
                            ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) b, 10));
                            for (Number number : b) {
                                arrayList.add(String.valueOf(number.intValue()));
                            }
                            Object[] array = arrayList.toArray(new String[0]);
                            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                            int a2 = aVar2.mo56292a(str3, (String[]) array);
                            int i12 = nVar2.f182224d;
                            aVar2.mo56255a(a2, i12, nVar2.f182225e + i12 + nVar2.f182226f);
                        }
                        if (oVar.f182230c != null) {
                            aVar2.mo56342c(3);
                            VEImageAddFilterParam vEImageAddFilterParam = new VEImageAddFilterParam();
                            C81488b bVar = oVar.f182230c;
                            if (bVar != null) {
                                str2 = bVar.f182191d;
                            }
                            vEImageAddFilterParam.imagePath = str2;
                            C81488b bVar2 = oVar.f182230c;
                            if (bVar2 != null) {
                                i = bVar2.f182189b;
                            } else {
                                i = 0;
                            }
                            C81488b bVar3 = oVar.f182230c;
                            if (bVar3 != null) {
                                i2 = bVar3.f182190c;
                            } else {
                                i2 = 0;
                            }
                            C81488b bVar4 = oVar.f182230c;
                            if (bVar4 != null) {
                                i3 = bVar4.f182192e;
                            } else {
                                i3 = 0;
                            }
                            C81488b bVar5 = oVar.f182230c;
                            if (bVar5 != null) {
                                i4 = bVar5.f182193f;
                            } else {
                                i4 = 0;
                            }
                            aVar2.mo56280a(C85581w.EnumC85606e.SCALE_MODE_CENTER_INSIDE_WITH_2DENGINE);
                            C81488b bVar6 = oVar.f182230c;
                            if (bVar6 == null || !bVar6.f182194g) {
                                if (oVar.f182228a != null) {
                                    aVar2.mo56280a(C85581w.EnumC85606e.SCALE_MODE_CENTER_INSIDE);
                                    if (i > i2) {
                                        i5 = i - i2;
                                    } else {
                                        i5 = i2 - i;
                                        i = i2;
                                    }
                                    VEWatermarkParam vEWatermarkParam4 = oVar.f182233f;
                                    if (vEWatermarkParam4 == null) {
                                        C89219l.m154715b();
                                    }
                                    vEWatermarkParam4.xOffset += i5 / 2;
                                    i2 = i;
                                } else {
                                    i5 = 0;
                                }
                                float f = ((float) (i - i4)) / 2.0f;
                                double d = (double) f;
                                double d2 = (double) i;
                                Double.isNaN(d2);
                                double d3 = d2 * 1.0d;
                                Double.isNaN(d);
                                vEImageAddFilterParam.f191453x = (float) (d / d3);
                                double d4 = (double) (((float) (i2 - i3)) - (f - ((float) (i5 / 2))));
                                double d5 = (double) i2;
                                Double.isNaN(d5);
                                double d6 = d5 * 1.0d;
                                Double.isNaN(d4);
                                vEImageAddFilterParam.f191454y = (float) (d4 / d6);
                                double d7 = (double) i4;
                                Double.isNaN(d7);
                                vEImageAddFilterParam.width = (float) (d7 / d3);
                                double d8 = (double) i3;
                                Double.isNaN(d8);
                                vEImageAddFilterParam.height = (float) (d8 / d6);
                                oVar.f182234g.setVideoRes(i, i2);
                            } else {
                                int i13 = i2 + i3;
                                aVar2.mo56343c(i, i13);
                                vEImageAddFilterParam.f191453x = 0.0f;
                                double d9 = (double) i2;
                                double d10 = (double) i13;
                                Double.isNaN(d10);
                                double d11 = d10 * 1.0d;
                                Double.isNaN(d9);
                                vEImageAddFilterParam.f191454y = (float) (d9 / d11);
                                vEImageAddFilterParam.width = 1.0f;
                                double d12 = (double) i3;
                                Double.isNaN(d12);
                                vEImageAddFilterParam.height = (float) (d12 / d11);
                                oVar.f182234g.setResizeMode(5);
                                oVar.f182234g.setVideoRes(i, i13);
                            }
                            VEWatermarkParam vEWatermarkParam5 = oVar.f182233f;
                            if (vEWatermarkParam5 != null) {
                                vEWatermarkParam5.secondHalfImages = null;
                            }
                            C81488b bVar7 = oVar.f182230c;
                            if (bVar7 == null) {
                                C89219l.m154715b();
                            }
                            aVar2.mo56263a(aVar2.mo56264a(0, vEImageAddFilterParam, 0, bVar7.f182188a), vEImageAddFilterParam);
                        }
                        this.f156038a = true;
                        aVar2.mo56331b(oVar.f182232e);
                        Boolean.valueOf(aVar2.mo56316a(tVar.f182254i, (String) null, oVar.f182234g, new C69819a(this, tVar, dVar)));
                        return;
                    }
                    dVar.mo110173a(a, "init editor failed with errorCode:".concat(String.valueOf(a)), 0);
                    mo110170a(oVar);
                    return;
                }
                return;
            }
            dVar.mo110173a(-1, "images in veWatermarkParam is null or empty", 0);
            return;
        }
        throw new IllegalArgumentException("VideoWatermarkParam is needed when use VEVideoWatermarkCreator");
    }
}
