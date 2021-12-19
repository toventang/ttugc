package com.p2082ss.android.ugc.aweme.tools.music.aichoosemusic.p4122b;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.google.p1998c.p2006h.p2007a.AbstractC27645k;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.experiment.C46953fs;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.out.AVServiceImpl;
import com.p2082ss.android.ugc.aweme.p2730de.C40963b;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.publish.p3619f.C65611c;
import com.p2082ss.android.ugc.aweme.publish.p3619f.C65612d;
import com.p2082ss.android.ugc.aweme.publish.p3619f.C65616g;
import com.p2082ss.android.ugc.aweme.services.IExternalService;
import com.p2082ss.android.ugc.aweme.services.video.IAVPublishService;
import com.p2082ss.android.ugc.aweme.shortvideo.C69840ar;
import com.p2082ss.android.ugc.aweme.tools.music.aichoosemusic.AIChooseMusicManager;
import com.p2082ss.android.ugc.aweme.tools.music.aichoosemusic.C78727d;
import com.p2082ss.android.ugc.aweme.tools.music.p4125d.C78744a;
import com.p2082ss.android.ugc.aweme.tools.music.p4128e.C78825d;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.ttuploader.TTImageInfo;
import com.p2082ss.ttuploader.TTImageUploader;
import com.p2082ss.ttuploader.TTImageUploaderListener;
import java.io.File;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89561bs;
import kotlinx.coroutines.C89624i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p078c.p080b.C1752a;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4568e.p4570b.C88446a;
import p4560f.p4561a.p4591l.C88958b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.music.aichoosemusic.b.a */
public abstract class AbstractC78708a {

    /* renamed from: d */
    public static final C78710a f176871d = new C78710a((byte) 0);

    /* renamed from: a */
    public long f176872a;

    /* renamed from: b */
    public AbstractC89568bz f176873b;

    /* renamed from: c */
    public final C88958b<String> f176874c;

    /* renamed from: e */
    private final C88411a f176875e;

    /* renamed from: f */
    private final AbstractC89244h f176876f = C89250i.m154773a((AbstractC89171a) C78711b.f176878a);

    static {
        Covode.recordClassIndex(91851);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo122566a(AbstractC89124d<? super String> dVar);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo122568a() {
        return (String) this.f176876f.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.aichoosemusic.b.a$a */
    public static final class C78710a {
        static {
            Covode.recordClassIndex(91853);
        }

        private C78710a() {
        }

        public /* synthetic */ C78710a(byte b) {
            this();
        }
    }

    /* renamed from: c */
    public final String mo122570c() {
        return this.f176874c.mo143221i();
    }

    /* renamed from: d */
    public final AbstractC88979t<String> mo122571d() {
        AbstractC88979t<String> c = this.f176874c.mo143283c();
        C89219l.m154716b(c, "");
        return c;
    }

    /* renamed from: f */
    public final void mo122573f() {
        AbstractC89568bz bzVar = this.f176873b;
        if (bzVar != null) {
            bzVar.mo143985a((CancellationException) null);
        }
        this.f176873b = null;
        this.f176875e.dispose();
        C84902i.m145886a(new File(mo122568a()));
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.aichoosemusic.b.a$b */
    static final class C78711b extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        public static final C78711b f176878a = new C78711b();

        static {
            Covode.recordClassIndex(91854);
        }

        C78711b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            File file = new File(AIChooseMusicManager.m137315e() + File.separator + SystemClock.elapsedRealtime());
            if (!file.exists()) {
                file.mkdir();
            }
            return file.getAbsolutePath();
        }
    }

    public AbstractC78708a() {
        C88411a aVar = new C88411a();
        this.f176875e = aVar;
        C88958b<String> bVar = new C88958b<>();
        C89219l.m154716b(bVar, "");
        this.f176874c = bVar;
        aVar.mo142945a(mo122571d().mo143254a(new AbstractC88433f(this) {
            /* class com.p2082ss.android.ugc.aweme.tools.music.aichoosemusic.p4122b.AbstractC78708a.C787091 */

            /* renamed from: a */
            final /* synthetic */ AbstractC78708a f176877a;

            static {
                Covode.recordClassIndex(91852);
            }

            {
                this.f176877a = r1;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                C84902i.m145886a(new C1752a(this.f176877a.mo122568a()));
            }
        }, C88446a.f200698d));
    }

    /* renamed from: b */
    protected static int m137360b() {
        if (C78744a.f176943a == null) {
            return 5;
        }
        C78744a aVar = C78744a.f176943a;
        if (aVar == null) {
            C89219l.m154715b();
        }
        C89219l.m154716b(aVar, "");
        if (aVar.f176944b <= 1) {
            return 5;
        }
        C78744a aVar2 = C78744a.f176943a;
        if (aVar2 == null) {
            C89219l.m154715b();
        }
        C89219l.m154716b(aVar2, "");
        return aVar2.f176944b;
    }

    /* renamed from: e */
    public void mo122572e() {
        String str;
        IAVPublishService publishService;
        if (C63244g.m114602a().mo73255A().mo93903b() && (AVServiceImpl.m113116a().avSettingsService().recommentMusicByAIPolicy() != 0 || C46953fs.m90240a())) {
            IExternalService a = AVExternalServiceImpl.m113114a();
            if (a == null || (publishService = a.publishService()) == null) {
                str = null;
            } else {
                str = publishService.getShootWay();
            }
            if (!C89219l.m154714a((Object) str, (Object) "tcm_upload") && !C63244g.m114602a().mo73255A().mo93901a()) {
                AbstractC89568bz unused = C89624i.m155555a(C89561bs.f203280a, null, null, new C78714d(this, null), 3);
                return;
            }
        }
        mo122569a("");
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.aichoosemusic.b.a$e */
    public static final class C78716e implements AbstractC27645k<C65616g> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89124d f176888a;

        static {
            Covode.recordClassIndex(91859);
        }

        C78716e(AbstractC89124d dVar) {
            this.f176888a = dVar;
        }

        @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
        public final void onFailure(Throwable th) {
            C89219l.m154721d(th, "");
            this.f176888a.resumeWith(C89379q.m157068constructorimpl(null));
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
        public final /* synthetic */ void onSuccess(C65616g gVar) {
            if (gVar instanceof C65611c) {
                this.f176888a.resumeWith(C89379q.m157068constructorimpl(C78825d.f177140a.mo46674b(gVar)));
                return;
            }
            this.f176888a.resumeWith(C89379q.m157068constructorimpl(null));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.music.aichoosemusic.b.a$c */
    public static final class C78712c extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f176879a;

        /* renamed from: b */
        final /* synthetic */ AbstractC78708a f176880b;

        static {
            Covode.recordClassIndex(91855);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C78712c(AbstractC78708a aVar, AbstractC89124d dVar) {
            super(2, dVar);
            this.f176880b = aVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C78712c(this.f176880b, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C78712c) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            if (this.f176879a == 0) {
                C89382r.m154942a(obj);
                C84902i.m145888a(this.f176880b.mo122568a(), C787131.f176881a);
                return C89391z.f203057a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo122569a(String str) {
        C89219l.m154721d(str, "");
        this.f176874c.onNext(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.music.aichoosemusic.b.a$d */
    public static final class C78714d extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f176882a;

        /* renamed from: b */
        final /* synthetic */ AbstractC78708a f176883b;

        /* renamed from: c */
        private /* synthetic */ Object f176884c;

        static {
            Covode.recordClassIndex(91857);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C78714d(AbstractC78708a aVar, AbstractC89124d dVar) {
            super(2, dVar);
            this.f176883b = aVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            C78714d dVar2 = new C78714d(this.f176883b, dVar);
            dVar2.f176884c = obj;
            return dVar2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C78714d) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            if (this.f176882a == 0) {
                C89382r.m154942a(obj);
                this.f176883b.f176873b = C89624i.m155555a((AbstractC89516am) this.f176884c, null, null, new AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object>(this, null) {
                    /* class com.p2082ss.android.ugc.aweme.tools.music.aichoosemusic.p4122b.AbstractC78708a.C78714d.C787151 */

                    /* renamed from: a */
                    int f176885a;

                    /* renamed from: b */
                    final /* synthetic */ C78714d f176886b;

                    /* renamed from: c */
                    private /* synthetic */ Object f176887c;

                    static {
                        Covode.recordClassIndex(91858);
                    }

                    {
                        this.f176886b = r2;
                    }

                    @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                    public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                        C89219l.m154721d(dVar, "");
                        C787151 r1 = 

                        /* access modifiers changed from: protected */
                        /* renamed from: a */
                        public final File mo122565a(Bitmap bitmap, int i) {
                            C89219l.m154721d(bitmap, "");
                            File file = new File(mo122568a() + File.separator + i + ".jpg");
                            String a = mo122568a();
                            String name = file.getName();
                            C89219l.m154716b(name, "");
                            C78727d.m137387a(bitmap, a, name);
                            if (!bitmap.isRecycled()) {
                                bitmap.recycle();
                            }
                            return file;
                        }

                        /* access modifiers changed from: package-private */
                        /* JADX WARNING: Removed duplicated region for block: B:11:0x002c  */
                        /* JADX WARNING: Removed duplicated region for block: B:38:0x00ea  */
                        /* renamed from: a */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final java.lang.Object mo122567a(java.lang.String r16, java.lang.String r17, p4600h.p4603c.AbstractC89124d<? super java.lang.String> r18) {
                            /*
                            // Method dump skipped, instructions count: 245
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.tools.music.aichoosemusic.p4122b.AbstractC78708a.mo122567a(java.lang.String, java.lang.String, h.c.d):java.lang.Object");
                        }

                        /* access modifiers changed from: package-private */
                        /* renamed from: com.ss.android.ugc.aweme.tools.music.aichoosemusic.b.a$f */
                        public static final class C78717f implements TTImageUploaderListener {

                            /* renamed from: a */
                            final /* synthetic */ TTImageUploader f176889a;

                            /* renamed from: b */
                            final /* synthetic */ AbstractC89124d f176890b;

                            /* renamed from: c */
                            final /* synthetic */ C65612d f176891c;

                            /* renamed from: d */
                            final /* synthetic */ AbstractC78708a f176892d;

                            /* renamed from: e */
                            final /* synthetic */ String f176893e;

                            /* renamed from: f */
                            final /* synthetic */ List f176894f = null;

                            /* renamed from: g */
                            final /* synthetic */ String f176895g;

                            static {
                                Covode.recordClassIndex(91860);
                            }

                            C78717f(TTImageUploader tTImageUploader, AbstractC89124d dVar, C65612d dVar2, AbstractC78708a aVar, String str, List list, String str2) {
                                this.f176889a = tTImageUploader;
                                this.f176890b = dVar;
                                this.f176891c = dVar2;
                                this.f176892d = aVar;
                                this.f176893e = str;
                                this.f176895g = str2;
                            }

                            @Override // com.p2082ss.ttuploader.TTImageUploaderListener
                            public final void onNotify(int i, long j, TTImageInfo tTImageInfo) {
                                Integer num = null;
                                if (i == 3) {
                                    int currentTimeMillis = (int) (System.currentTimeMillis() - this.f176892d.f176872a);
                                    List list = this.f176894f;
                                    if (list != null) {
                                        num = Integer.valueOf(list.size());
                                    }
                                    C69840ar a = new C69840ar().mo110187a("time_cost_ms", Integer.valueOf(currentTimeMillis));
                                    if (num != null) {
                                        num.intValue();
                                        a.mo110187a("photo_to_video_assets_count", num);
                                    }
                                    C12290b.m22060a("ies_ai_recommend_video_frames_upload_monitor", 0, a.mo110191a());
                                    this.f176889a.close();
                                    this.f176890b.resumeWith(C89379q.m157068constructorimpl(tTImageInfo.mImageUri));
                                    C39162r.m79460a("account_info_after_zip_upload", new C84425b().mo129406a("login", String.valueOf(C63244g.m114602a().mo73255A().mo93903b())).mo129403a("zip_upload_res_status", !TextUtils.isEmpty(tTImageInfo.mImageUri) ? 1 : 0).mo129406a("zipuri", tTImageInfo.mImageUri).f188764a);
                                    JSONArray a2 = C63244g.m114602a().mo73287o().mo104792l().mo104816a();
                                    int length = a2.length();
                                    for (int i2 = 0; i2 < length; i2++) {
                                        try {
                                            JSONObject jSONObject = a2.getJSONObject(i2);
                                            if (jSONObject != null) {
                                                C84911q.m145928d("AIChooseMusicManager, upload image:" + i2 + ':' + jSONObject);
                                                AppLog.recordMiscLog(C40963b.m82473a(), "image_upload", jSONObject);
                                            }
                                        } catch (JSONException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                } else if (i == 4) {
                                    List list2 = this.f176894f;
                                    Integer valueOf = list2 != null ? Integer.valueOf(list2.size()) : null;
                                    C69840ar arVar = new C69840ar();
                                    if (valueOf != null) {
                                        valueOf.intValue();
                                        arVar.mo110187a("photo_to_video_assets_count", valueOf);
                                    }
                                    C12290b.m22060a("ies_ai_recommend_video_frames_upload_monitor", 1, arVar.mo110191a());
                                    this.f176889a.close();
                                    this.f176890b.resumeWith(C89379q.m157068constructorimpl(null));
                                }
                            }
                        }
                    }
