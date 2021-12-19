package com.p2082ss.android.ugc.aweme.external.p2915a;

import android.text.TextUtils;
import com.bytedance.common.utility.p909d.C13609b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.external.p2915a.C47092e;
import com.p2082ss.android.ugc.aweme.p2730de.C40976k;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.property.C65357b;
import com.p2082ss.android.ugc.aweme.services.IVideo2GifService;
import com.p2082ss.android.ugc.aweme.services.external.ability.IAVTransformService;
import com.p2082ss.android.ugc.aweme.share.gif.VideoShare2GifEditContext;
import com.p2082ss.android.ugc.aweme.shortvideo.C70637di;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.p3798a.p3799a.C70049a;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.p3798a.p3799a.C70051c;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.p3798a.p3799a.C70052d;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.p3798a.p3799a.C70053e;
import com.p2082ss.android.ugc.aweme.shortvideo.cutmusic.C70612k;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import com.p2082ss.android.vesdk.C85581w;
import com.p2082ss.android.vesdk.VEUtils;
import com.p2082ss.android.vesdk.VEVideoEncodeSettings;
import java.io.File;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.external.a.d */
public final class C47083d implements IAVTransformService {
    static {
        Covode.recordClassIndex(55687);
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a.d$b */
    static final class C47085b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ IAVTransformService.ITransformCallback f109654a;

        static {
            Covode.recordClassIndex(55689);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47085b(IAVTransformService.ITransformCallback iTransformCallback) {
            super(0);
            this.f109654a = iTransformCallback;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f109654a.finish(null);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a.d$d */
    static final class C47087d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ IAVTransformService.ITransformCallback f109657a;

        static {
            Covode.recordClassIndex(55691);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47087d(IAVTransformService.ITransformCallback iTransformCallback) {
            super(0);
            this.f109657a = iTransformCallback;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            IAVTransformService.ITransformCallback iTransformCallback = this.f109657a;
            if (iTransformCallback != null) {
                iTransformCallback.finish(false);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a.d$g */
    static final class C47091g extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ IAVTransformService.ITransformCallback f109668a;

        static {
            Covode.recordClassIndex(55695);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47091g(IAVTransformService.ITransformCallback iTransformCallback) {
            super(0);
            this.f109668a = iTransformCallback;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            IAVTransformService.ITransformCallback iTransformCallback = this.f109668a;
            if (iTransformCallback != null) {
                iTransformCallback.finish(-1);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a.d$a */
    static final class C47084a extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ String f109652a;

        /* renamed from: b */
        final /* synthetic */ IAVTransformService.ITransformCallback f109653b;

        static {
            Covode.recordClassIndex(55688);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47084a(String str, IAVTransformService.ITransformCallback iTransformCallback) {
            super(0);
            this.f109652a = str;
            this.f109653b = iTransformCallback;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            Object a;
            if (TextUtils.isEmpty(this.f109652a)) {
                a = null;
            } else {
                a = C63238c.f143566D.mo73306b().mo101536a(C70612k.C70614b.m124757a(this.f109652a));
            }
            this.f109653b.finish(a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a.d$f */
    static final class C47089f extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ String f109661a;

        /* renamed from: b */
        final /* synthetic */ String f109662b;

        /* renamed from: c */
        final /* synthetic */ int f109663c;

        /* renamed from: d */
        final /* synthetic */ int f109664d;

        /* renamed from: e */
        final /* synthetic */ IAVTransformService.ITransformProgress f109665e;

        /* renamed from: f */
        final /* synthetic */ IAVTransformService.ITransformCallback f109666f;

        static {
            Covode.recordClassIndex(55693);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47089f(String str, String str2, int i, int i2, IAVTransformService.ITransformProgress iTransformProgress, IAVTransformService.ITransformCallback iTransformCallback) {
            super(0);
            this.f109661a = str;
            this.f109662b = str2;
            this.f109663c = i;
            this.f109664d = i2;
            this.f109665e = iTransformProgress;
            this.f109666f = iTransformCallback;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C13609b.m24454b(C70637di.f158101d);
            C13609b.m24454b(C70637di.f158112o);
            C13609b.m24454b(C70637di.f158102e);
            VEUtils.C85284k kVar = new VEUtils.C85284k();
            kVar.f190850a = this.f109661a;
            kVar.f190851b = this.f109662b;
            kVar.f190861l = this.f109663c;
            kVar.f190862m = this.f109664d;
            kVar.f190857h = -1;
            kVar.f190858i = 240;
            kVar.f190856g = 10;
            int convertVideo2Webp = VEUtils.convertVideo2Webp(kVar, new C47090a(this));
            IAVTransformService.ITransformCallback iTransformCallback = this.f109666f;
            if (iTransformCallback != null) {
                iTransformCallback.finish(Integer.valueOf(convertVideo2Webp));
            }
            return C89391z.f203057a;
        }

        /* renamed from: com.ss.android.ugc.aweme.external.a.d$f$a */
        static final class C47090a implements VEUtils.AbstractC85282i {

            /* renamed from: a */
            final /* synthetic */ C47089f f109667a;

            static {
                Covode.recordClassIndex(55694);
            }

            C47090a(C47089f fVar) {
                this.f109667a = fVar;
            }

            @Override // com.p2082ss.android.vesdk.VEUtils.AbstractC85282i
            /* renamed from: a */
            public final void mo79408a(int i) {
                IAVTransformService.ITransformProgress iTransformProgress = this.f109667a.f109665e;
                if (iTransformProgress != null) {
                    iTransformProgress.update(i);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a.d$c */
    static final class C47086c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ VideoShare2GifEditContext f109655a;

        /* renamed from: b */
        final /* synthetic */ C47088e f109656b;

        static {
            Covode.recordClassIndex(55690);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47086c(VideoShare2GifEditContext videoShare2GifEditContext, C47088e eVar) {
            super(0);
            this.f109655a = videoShare2GifEditContext;
            this.f109656b = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            int i;
            float f;
            VideoShare2GifEditContext videoShare2GifEditContext = this.f109655a;
            C47088e eVar = this.f109656b;
            eVar.onStart();
            C85581w wVar = new C85581w(videoShare2GifEditContext.f154197f);
            if (wVar.mo131628a(new String[]{videoShare2GifEditContext.f154192a}, (String[]) null, (String[]) null, C85581w.EnumC85613l.VIDEO_OUT_RATIO_ORIGINAL) != 0) {
                eVar.onDone(false);
            } else {
                wVar.mo131685f();
                wVar.mo131665b(new C70052d(eVar, wVar));
                wVar.mo131644a(new C70053e(eVar, wVar));
                if (!TextUtils.isEmpty(videoShare2GifEditContext.f154196e)) {
                    File file = new File(videoShare2GifEditContext.f154196e);
                    if (file.exists()) {
                        C70051c.m123688a(file);
                    }
                    wVar.mo131682e((int) videoShare2GifEditContext.f154204m, (int) videoShare2GifEditContext.f154205n);
                    if (videoShare2GifEditContext.f154194c) {
                        String str = C63247i.f143610a.getExternalCacheDir() + "/watermark.png";
                        if (C84902i.m145892a(str)) {
                            C80720e.m139931c(str);
                        }
                        C63244g.m114602a().mo73288p().mo125205a().mo125215a(str);
                        if (videoShare2GifEditContext.f154200i < videoShare2GifEditContext.f154201j) {
                            f = 0.47f;
                        } else {
                            f = 0.27f;
                        }
                        float f2 = (((((float) videoShare2GifEditContext.f154200i) * f) * 52.0f) / 145.0f) / ((float) videoShare2GifEditContext.f154201j);
                        wVar.f191825al = str;
                        wVar.f191826am = (double) f;
                        wVar.f191827an = (double) f2;
                        wVar.f191828ao = (double) (1.0f - (f / 2.0f));
                        wVar.f191829ap = (double) (1.0f - (f2 / 2.0f));
                    }
                    int i2 = videoShare2GifEditContext.f154200i;
                    if (videoShare2GifEditContext.f154200i > videoShare2GifEditContext.f154201j) {
                        i = 480;
                    } else {
                        i = 270;
                    }
                    int min = Math.min(i2, i);
                    int i3 = (int) (((((float) min) * 1.0f) / ((float) videoShare2GifEditContext.f154200i)) * ((float) videoShare2GifEditContext.f154201j));
                    VEVideoEncodeSettings d = new VEVideoEncodeSettings.C85292a(2).mo130575a(VEVideoEncodeSettings.COMPILE_TYPE.COMPILE_TYPE_HIGH_GIF).mo130573a(min, i3).mo130572a(8).mo130588b(C65357b.m117046b()).mo130594d();
                    d.setSpeed(2.5f);
                    eVar.onConfigured(new C70049a(min, i3, videoShare2GifEditContext.f154204m, videoShare2GifEditContext.f154205n));
                    wVar.mo131678d(2);
                    wVar.mo131648a(videoShare2GifEditContext.f154196e, (String) null, d);
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a.d$e */
    public static final class C47088e implements IVideo2GifService.ConvertListener {

        /* renamed from: a */
        final /* synthetic */ VideoShare2GifEditContext f109658a;

        /* renamed from: b */
        final /* synthetic */ IAVTransformService.ITransformProgress f109659b;

        /* renamed from: c */
        final /* synthetic */ IAVTransformService.ITransformCallback f109660c;

        static {
            Covode.recordClassIndex(55692);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.IVideo2GifService.ConvertListener
        public final void onStart() {
        }

        @Override // com.p2082ss.android.ugc.aweme.services.IVideo2GifService.ConvertListener
        public final void onUpdateProgress(int i) {
            IAVTransformService.ITransformProgress iTransformProgress = this.f109659b;
            if (iTransformProgress != null) {
                iTransformProgress.update(i);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.services.IVideo2GifService.ConvertListener
        public final void onDone(boolean z) {
            IAVTransformService.ITransformCallback iTransformCallback = this.f109660c;
            if (iTransformCallback != null) {
                iTransformCallback.finish(Boolean.valueOf(z));
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.services.IVideo2GifService.ConvertListener
        public final void onConfigured(C70049a aVar) {
            C89219l.m154721d(aVar, "");
            C39162r.m79461a("gif_generate", new C40976k().mo70157a("height", String.valueOf(aVar.f156653b)).mo70157a("width", String.valueOf(aVar.f156652a)).mo70157a("gif_length_in_video", String.valueOf(aVar.f156655d - aVar.f156654c)).mo70157a("gif_offset", String.valueOf(aVar.f156654c)).mo70157a("group_id", this.f109658a.f154193b).mo70157a("author_id", this.f109658a.f154207p).mo70157a("speed", String.valueOf(aVar.f156656e)).mo70158a());
        }

        C47088e(VideoShare2GifEditContext videoShare2GifEditContext, IAVTransformService.ITransformProgress iTransformProgress, IAVTransformService.ITransformCallback iTransformCallback) {
            this.f109658a = videoShare2GifEditContext;
            this.f109659b = iTransformProgress;
            this.f109660c = iTransformCallback;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0036, code lost:
        if (r1 == null) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0038, code lost:
        r7 = r1.f147889d;
        r8 = r1.f147886a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003c, code lost:
        if (r8 != null) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
        r8 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003f, code lost:
        if (r1 == null) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0041, code lost:
        r0 = r1.f147894i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0043, code lost:
        if (r0 != null) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0048, code lost:
        return new com.p2082ss.android.ugc.aweme.services.upload.ExternalUploadVideoConfig(r3, r4, r5, r6, r7, r8, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0049, code lost:
        r9 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004b, code lost:
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0029, code lost:
        if (r5 == null) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002c, code lost:
        if (r1 != null) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002e, code lost:
        r6 = r1.f147888c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0030, code lost:
        if (r6 != null) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0032, code lost:
        r6 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0033, code lost:
        p4600h.p4611f.p4613b.C89219l.m154716b(r6, r9);
     */
    @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IAVTransformService
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p2082ss.android.ugc.aweme.services.upload.ExternalUploadVideoConfig parseUploadVideoConfig(java.lang.String r11) {
        /*
            r10 = this;
            java.lang.String r9 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r11, r9)
            com.ss.android.ugc.aweme.port.in.u r0 = com.p2082ss.android.ugc.aweme.port.p3561in.C63244g.m114602a()
            com.ss.android.ugc.aweme.port.in.au r0 = r0.mo73257C()
            com.google.gson.f r1 = r0.getRetrofitFactoryGson()
            java.lang.Class<com.ss.android.ugc.aweme.publish.f.c> r0 = com.p2082ss.android.ugc.aweme.publish.p3619f.C65611c.class
            java.lang.Object r0 = r1.mo46670a(r11, r0)
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, r9)
            com.ss.android.ugc.aweme.publish.f.c r0 = (com.p2082ss.android.ugc.aweme.publish.p3619f.C65611c) r0
            com.ss.android.ugc.aweme.publish.f.f r1 = r0.f147851a
            com.ss.android.ugc.aweme.services.upload.ExternalUploadVideoConfig r2 = new com.ss.android.ugc.aweme.services.upload.ExternalUploadVideoConfig
            r0 = 0
            if (r1 == 0) goto L_0x004d
            int r3 = r1.f147893h
            int r4 = r1.f147891f
            java.lang.String r5 = r1.f147887b
            if (r5 != 0) goto L_0x002e
        L_0x002b:
            r5 = r9
            if (r1 == 0) goto L_0x0032
        L_0x002e:
            java.lang.String r6 = r1.f147888c
            if (r6 != 0) goto L_0x0033
        L_0x0032:
            r6 = r9
        L_0x0033:
            p4600h.p4611f.p4613b.C89219l.m154716b(r6, r9)
            if (r1 == 0) goto L_0x004b
            int r7 = r1.f147889d
            java.lang.String r8 = r1.f147886a
            if (r8 != 0) goto L_0x0041
        L_0x003e:
            r8 = r9
            if (r1 == 0) goto L_0x0045
        L_0x0041:
            java.lang.String r0 = r1.f147894i
            if (r0 != 0) goto L_0x0049
        L_0x0045:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r2
        L_0x0049:
            r9 = r0
            goto L_0x0045
        L_0x004b:
            r7 = 0
            goto L_0x003e
        L_0x004d:
            r3 = 0
            r4 = 0
            goto L_0x002b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.external.p2915a.C47083d.parseUploadVideoConfig(java.lang.String):com.ss.android.ugc.aweme.services.upload.ExternalUploadVideoConfig");
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IAVTransformService
    public final void audio2wavebean(String str, IAVTransformService.ITransformCallback<MusicWaveBean> iTransformCallback) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(iTransformCallback, "");
        C47092e.C47093a aVar = new C47092e.C47093a();
        aVar.f109675c = true;
        C47092e.C47093a a = aVar.mo79415a(new C47084a(str, iTransformCallback));
        a.f109673a = new C47085b(iTransformCallback);
        a.mo79416a();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IAVTransformService
    public final void video2gif(VideoShare2GifEditContext videoShare2GifEditContext, IAVTransformService.ITransformProgress iTransformProgress, IAVTransformService.ITransformCallback<Boolean> iTransformCallback) {
        C89219l.m154721d(videoShare2GifEditContext, "");
        C47088e eVar = new C47088e(videoShare2GifEditContext, iTransformProgress, iTransformCallback);
        C47092e.C47093a aVar = new C47092e.C47093a();
        aVar.f109675c = true;
        C47092e.C47093a a = aVar.mo79415a(new C47086c(videoShare2GifEditContext, eVar));
        a.f109673a = new C47087d(iTransformCallback);
        a.mo79416a();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IAVTransformService
    public final void video2webp(String str, String str2, int i, int i2, IAVTransformService.ITransformCallback<Integer> iTransformCallback, IAVTransformService.ITransformProgress iTransformProgress) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C47092e.C47093a aVar = new C47092e.C47093a();
        aVar.f109675c = true;
        C47092e.C47093a a = aVar.mo79415a(new C47089f(str, str2, i, i2, iTransformProgress, iTransformCallback));
        a.f109673a = new C47091g(iTransformCallback);
        a.mo79416a();
    }
}
