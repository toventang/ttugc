package com.p2082ss.android.ugc.aweme.mediachoose;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.ftc.C51811a;
import com.p2082ss.android.ugc.aweme.mediachoose.AbstractC59180g;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import com.p2082ss.android.ugc.aweme.p2730de.C40982q;
import com.p2082ss.android.ugc.aweme.setting.C68436u;
import com.p2082ss.android.ugc.aweme.shortvideo.C69840ar;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C70455f;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C74002bq;
import com.p2082ss.android.ugc.aweme.tools.p4098c.C78102c;
import com.p2082ss.android.ugc.tools.utils.C84896h;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import com.p2082ss.android.vesdk.C85574u;
import com.p2082ss.android.vesdk.VEUtils;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4619j.C89271h;

/* renamed from: com.ss.android.ugc.aweme.mediachoose.c */
public final class C59164c implements AbstractC59180g {

    /* renamed from: a */
    boolean f134621a = true;

    /* renamed from: b */
    String f134622b = "";

    /* renamed from: c */
    final boolean f134623c = C16048b.m29633a().mo25421a(true, "creative_tools_upload_format_ext", false);

    /* renamed from: d */
    public final Context f134624d;

    /* renamed from: e */
    private final AbstractC89244h f134625e = C89250i.m154773a((AbstractC89171a) C59173e.f134651a);

    static {
        Covode.recordClassIndex(69522);
    }

    @Override // com.p2082ss.android.ugc.aweme.mediachoose.AbstractC59180g
    /* renamed from: a */
    public final void mo96648a() {
        this.f134621a = false;
    }

    /* renamed from: b */
    public final ExecutorService mo96665b() {
        return (ExecutorService) this.f134625e.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.mediachoose.c$e */
    static final class C59173e extends AbstractC89220m implements AbstractC89171a<ExecutorService> {

        /* renamed from: a */
        public static final C59173e f134651a = new C59173e();

        static {
            Covode.recordClassIndex(69531);
        }

        C59173e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ExecutorService invoke() {
            C40787l.C40788a a = C40787l.m82269a(EnumC40793o.FIXED);
            a.f95504b = "videoLegalCheck";
            return C40780g.m82242a(a.mo70028a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mediachoose.c$b */
    static final class CallableC59170b<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ MediaModel f134639a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89236c f134640b;

        static {
            Covode.recordClassIndex(69528);
        }

        CallableC59170b(MediaModel mediaModel, C89233z.C89236c cVar) {
            this.f134639a = mediaModel;
            this.f134640b = cVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            int[] iArr = new int[10];
            long currentTimeMillis = System.currentTimeMillis();
            String str = this.f134639a.f134662b;
            C89219l.m154716b(str, "");
            int a = C78102c.m136520a(str, iArr);
            long currentTimeMillis2 = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", (int) (currentTimeMillis2 - currentTimeMillis));
            C40982q.m82523a("ve_get_video_info_consume_monitor", jSONObject, new C69840ar().mo110191a());
            if (a == 0) {
                this.f134639a.f134672l = iArr[0];
                this.f134639a.f134673m = iArr[1];
                this.f134640b.element = iArr[8];
            }
            return Integer.valueOf(a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.mediachoose.AbstractC59180g
    /* renamed from: a */
    public final void mo96650a(String str) {
        C89219l.m154721d(str, "");
        this.f134622b = str;
    }

    /* renamed from: com.ss.android.ugc.aweme.mediachoose.c$c */
    static final class C59171c<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ AbstractC89183m f134641a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89236c f134642b;

        static {
            Covode.recordClassIndex(69529);
        }

        C59171c(AbstractC89183m mVar, C89233z.C89236c cVar) {
            this.f134641a = mVar;
            this.f134642b = cVar;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            AbstractC89183m mVar = this.f134641a;
            C89219l.m154716b(iVar, "");
            Object d = iVar.mo5545d();
            C89219l.m154716b(d, "");
            mVar.invoke(d, Integer.valueOf(this.f134642b.element));
            return C89391z.f203057a;
        }
    }

    public C59164c(Context context) {
        C89219l.m154721d(context, "");
        this.f134624d = context;
    }

    /* renamed from: com.ss.android.ugc.aweme.mediachoose.c$d */
    public static final class C59172d implements C84896h.AbstractC84898b {

        /* renamed from: a */
        final /* synthetic */ C59164c f134643a;

        /* renamed from: b */
        final /* synthetic */ MediaModel f134644b;

        /* renamed from: c */
        final /* synthetic */ long f134645c;

        /* renamed from: d */
        final /* synthetic */ long f134646d;

        /* renamed from: e */
        final /* synthetic */ long f134647e;

        /* renamed from: f */
        final /* synthetic */ String f134648f;

        /* renamed from: g */
        final /* synthetic */ AbstractC89172b f134649g;

        /* renamed from: h */
        final /* synthetic */ AbstractC89172b f134650h;

        static {
            Covode.recordClassIndex(69530);
        }

        @Override // com.p2082ss.android.ugc.tools.utils.C84896h.AbstractC84898b
        /* renamed from: a */
        public final void mo96669a(Object obj) {
            boolean z;
            Object obj2 = obj;
            if (!(obj2 instanceof Boolean)) {
                obj2 = null;
            }
            if (C89219l.m154714a(obj2, (Object) true)) {
                C59164c cVar = this.f134643a;
                MediaModel mediaModel = this.f134644b;
                long j = this.f134645c;
                long j2 = this.f134646d;
                long j3 = this.f134647e;
                String str = this.f134648f;
                AbstractC89172b bVar = this.f134649g;
                AbstractC89172b bVar2 = this.f134650h;
                String str2 = mediaModel.f134670j;
                String str3 = "";
                if (str2 != null) {
                    Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
                    String lowerCase = str2.toLowerCase();
                    C89219l.m154716b(lowerCase, str3);
                    if (lowerCase != null) {
                        str3 = lowerCase;
                    }
                }
                if (TextUtils.isEmpty(mediaModel.f134670j) || !TextUtils.equals("video/mp4", str3)) {
                    z = false;
                } else {
                    z = true;
                }
                if (!cVar.f134623c && !z) {
                    C73991bj.m130128a("LocalVideoLegalChecker ImportVideoTypeError:".concat(String.valueOf(str3)));
                    bVar2.invoke(new C59179f(false, "LocalVideoLegalChecker", System.currentTimeMillis() - j3, str, -2, str3));
                } else if (mediaModel.f134668h < j) {
                    bVar2.invoke(new C59179f(false, "LocalVideoLegalChecker", System.currentTimeMillis() - j3, str, -1, ""));
                } else if (j2 != -1 && mediaModel.f134668h > j2) {
                    bVar2.invoke(new C59179f(false, "LocalVideoLegalChecker", System.currentTimeMillis() - j3, str, -6, ""));
                } else if (!C51811a.m96524a(cVar.f134624d, C84896h.m145868b(mediaModel), "video_upload")) {
                    if (C70455f.f157420d) {
                        cVar.mo96650a("enter_from_single");
                    }
                    boolean equals = TextUtils.equals(cVar.f134622b, "enter_from_multi");
                    C59165a aVar = new C59165a(cVar, mediaModel, j, j2, bVar, bVar2, j3, str, str3);
                    if (mediaModel.f134672l <= 0 || mediaModel.f134673m <= 0 || (!equals && C89271h.m154772c(mediaModel.f134672l, mediaModel.f134673m) > 1100)) {
                        C89233z.C89236c cVar2 = new C89233z.C89236c();
                        cVar2.element = 0;
                        C1731i.m5640b(new CallableC59170b(mediaModel, cVar2), cVar.mo96665b()).mo5534a(new C59171c(aVar, cVar2), C1731i.f5564c, null);
                        return;
                    }
                    aVar.invoke(0, 0);
                }
            } else {
                this.f134650h.invoke(new C59179f(false, "LocalVideoLegalChecker", System.currentTimeMillis() - this.f134647e, this.f134648f, -4, ""));
            }
        }

        C59172d(C59164c cVar, MediaModel mediaModel, long j, long j2, long j3, String str, AbstractC89172b bVar, AbstractC89172b bVar2) {
            this.f134643a = cVar;
            this.f134644b = mediaModel;
            this.f134645c = j;
            this.f134646d = j2;
            this.f134647e = j3;
            this.f134648f = str;
            this.f134649g = bVar;
            this.f134650h = bVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mediachoose.c$a */
    static final class C59165a extends AbstractC89220m implements AbstractC89183m<Integer, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C59164c f134626a;

        /* renamed from: b */
        final /* synthetic */ MediaModel f134627b;

        /* renamed from: c */
        final /* synthetic */ long f134628c;

        /* renamed from: d */
        final /* synthetic */ long f134629d;

        /* renamed from: e */
        final /* synthetic */ AbstractC89172b f134630e;

        /* renamed from: f */
        final /* synthetic */ AbstractC89172b f134631f;

        /* renamed from: g */
        final /* synthetic */ long f134632g;

        /* renamed from: h */
        final /* synthetic */ String f134633h;

        /* renamed from: i */
        final /* synthetic */ String f134634i;

        static {
            Covode.recordClassIndex(69523);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59165a(C59164c cVar, MediaModel mediaModel, long j, long j2, AbstractC89172b bVar, AbstractC89172b bVar2, long j3, String str, String str2) {
            super(2);
            this.f134626a = cVar;
            this.f134627b = mediaModel;
            this.f134628c = j;
            this.f134629d = j2;
            this.f134630e = bVar;
            this.f134631f = bVar2;
            this.f134632g = j3;
            this.f134633h = str;
            this.f134634i = str2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(Integer num, Integer num2) {
            int i;
            int intValue = num.intValue();
            int intValue2 = num2.intValue();
            if (intValue != 0) {
                C59141a aVar = new C59141a(this.f134626a.f134624d);
                aVar.f134568a = this.f134626a.f134621a;
                aVar.mo96649a(this.f134627b, this.f134628c, this.f134629d, this.f134630e, this.f134631f);
            } else {
                int b = C89271h.m154769b(this.f134627b.f134672l, this.f134627b.f134673m);
                int c = C89271h.m154772c(this.f134627b.f134672l, this.f134627b.f134673m);
                boolean z = false;
                if (!C74002bq.m130147a()) {
                    if (c > 1100) {
                        this.f134631f.invoke(new C59179f(false, "LocalVideoLegalChecker", System.currentTimeMillis() - this.f134632g, this.f134633h, -5, ""));
                    }
                } else if (c > 1100) {
                    if (TextUtils.equals(this.f134626a.f134622b, "enter_from_multi")) {
                        i = -8;
                    } else if (!C68436u.m120866a() && intValue2 != C85574u.EnumC85575a.AV_CODEC_ID_H264.ordinal()) {
                        i = -7;
                    } else if (c > 2160 || b > 4096) {
                        i = -5;
                    } else {
                        C1731i.m5640b(new Callable(this) {
                            /* class com.p2082ss.android.ugc.aweme.mediachoose.C59164c.C59165a.CallableC591661 */

                            /* renamed from: a */
                            final /* synthetic */ C59165a f134635a;

                            static {
                                Covode.recordClassIndex(69524);
                            }

                            {
                                this.f134635a = r1;
                            }

                            @Override // java.util.concurrent.Callable
                            public final /* synthetic */ Object call() {
                                return Integer.valueOf(VEUtils.isCanImport(this.f134635a.f134627b.f134662b));
                            }
                        }, this.f134626a.mo96665b()).mo5534a(new AbstractC1729g(this) {
                            /* class com.p2082ss.android.ugc.aweme.mediachoose.C59164c.C59165a.C591672 */

                            /* renamed from: a */
                            final /* synthetic */ C59165a f134636a;

                            static {
                                Covode.recordClassIndex(69525);
                            }

                            {
                                this.f134636a = r1;
                            }

                            @Override // p077b.AbstractC1729g
                            public final /* synthetic */ Object then(C1731i iVar) {
                                C89219l.m154716b(iVar, "");
                                Integer num = (Integer) iVar.mo5545d();
                                if (num != null && num.intValue() == 0) {
                                    this.f134636a.f134630e.invoke(new C59179f(true, "LocalVideoLegalChecker", System.currentTimeMillis() - this.f134636a.f134632g, this.f134636a.f134633h, 0, ""));
                                } else {
                                    AbstractC89172b bVar = this.f134636a.f134631f;
                                    long currentTimeMillis = System.currentTimeMillis() - this.f134636a.f134632g;
                                    String str = this.f134636a.f134633h;
                                    Object d = iVar.mo5545d();
                                    C89219l.m154716b(d, "");
                                    bVar.invoke(new C59179f(false, "LocalVideoLegalChecker", currentTimeMillis, str, ((Number) d).intValue(), ""));
                                }
                                return C89391z.f203057a;
                            }
                        }, C1731i.f5564c, null);
                    }
                    this.f134631f.invoke(new C59179f(false, "LocalVideoLegalChecker", System.currentTimeMillis() - this.f134632g, this.f134633h, i, ""));
                }
                if (TextUtils.equals("video/mp4", this.f134634i) || TextUtils.equals("video/quicktime", this.f134634i)) {
                    z = true;
                }
                if (intValue2 != C85574u.EnumC85575a.AV_CODEC_ID_H264.ordinal() || !z) {
                    C1731i.m5640b(new Callable(this) {
                        /* class com.p2082ss.android.ugc.aweme.mediachoose.C59164c.C59165a.CallableC591683 */

                        /* renamed from: a */
                        final /* synthetic */ C59165a f134637a;

                        static {
                            Covode.recordClassIndex(69526);
                        }

                        {
                            this.f134637a = r1;
                        }

                        @Override // java.util.concurrent.Callable
                        public final /* synthetic */ Object call() {
                            return Integer.valueOf(VEUtils.isCanImport(this.f134637a.f134627b.f134662b));
                        }
                    }, this.f134626a.mo96665b()).mo5534a(new AbstractC1729g(this) {
                        /* class com.p2082ss.android.ugc.aweme.mediachoose.C59164c.C59165a.C591694 */

                        /* renamed from: a */
                        final /* synthetic */ C59165a f134638a;

                        static {
                            Covode.recordClassIndex(69527);
                        }

                        {
                            this.f134638a = r1;
                        }

                        @Override // p077b.AbstractC1729g
                        public final /* synthetic */ Object then(C1731i iVar) {
                            C89219l.m154716b(iVar, "");
                            Integer num = (Integer) iVar.mo5545d();
                            if (num != null && num.intValue() == 0) {
                                this.f134638a.f134630e.invoke(new C59179f(true, "LocalVideoLegalChecker", System.currentTimeMillis() - this.f134638a.f134632g, this.f134638a.f134633h, 0, ""));
                            } else {
                                AbstractC89172b bVar = this.f134638a.f134631f;
                                long currentTimeMillis = System.currentTimeMillis() - this.f134638a.f134632g;
                                String str = this.f134638a.f134633h;
                                Object d = iVar.mo5545d();
                                C89219l.m154716b(d, "");
                                bVar.invoke(new C59179f(false, "LocalVideoLegalChecker", currentTimeMillis, str, ((Number) d).intValue(), ""));
                            }
                            return C89391z.f203057a;
                        }
                    }, C1731i.f5564c, null);
                } else {
                    this.f134630e.invoke(new C59179f(true, "LocalVideoLegalChecker", System.currentTimeMillis() - this.f134632g, this.f134633h, 0, ""));
                }
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.mediachoose.AbstractC59180g
    /* renamed from: a */
    public final void mo96649a(MediaModel mediaModel, long j, long j2, AbstractC89172b<? super C59179f, C89391z> bVar, AbstractC89172b<? super C59179f, C89391z> bVar2) {
        C89219l.m154721d(mediaModel, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(bVar2, "");
        C84902i.m145889a(mediaModel.f134662b, new C59172d(this, mediaModel, j, j2, System.currentTimeMillis(), AbstractC59180g.C59181a.m108676a(mediaModel.f134664d), bVar, bVar2));
    }
}
