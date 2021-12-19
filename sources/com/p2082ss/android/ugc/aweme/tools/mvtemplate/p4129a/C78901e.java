package com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.common.C39078ad;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.internal.AVCommerceServiceImpl;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.mvtheme.C61288d;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p2477ci.C36080a;
import com.p2082ss.android.ugc.aweme.p2730de.C40982q;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.property.C65401cn;
import com.p2082ss.android.ugc.aweme.property.C65402co;
import com.p2082ss.android.ugc.aweme.property.C65414cx;
import com.p2082ss.android.ugc.aweme.record.AbstractC66810d;
import com.p2082ss.android.ugc.aweme.services.upload.IPhotoPreDownloadMusic;
import com.p2082ss.android.ugc.aweme.setting.p3721i.C68099i;
import com.p2082ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p2082ss.android.ugc.aweme.shortvideo.C69840ar;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.C70641dm;
import com.p2082ss.android.ugc.aweme.shortvideo.C71872i;
import com.p2082ss.android.ugc.aweme.shortvideo.ImportVideoInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.C69744c;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.C71417f;
import com.p2082ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MvModel;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AbstractC72264w;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.p3846b.C72308f;
import com.p2082ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.MvThemeData;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.C78839a;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4131a.AbstractC78854d;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4132b.C78859b;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4133c.C78860a;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4135e.C78882b;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4140e.C78948b;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80209ad;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89546bf;
import kotlinx.coroutines.C89561bs;
import kotlinx.coroutines.C89624i;
import org.json.JSONObject;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.a.e */
public final class C78901e {

    /* renamed from: l */
    public static final C78902a f177330l = new C78902a((byte) 0);

    /* renamed from: a */
    public MvThemeData f177331a;

    /* renamed from: b */
    public AVETParameter f177332b;

    /* renamed from: c */
    public final Map<String, String> f177333c = new LinkedHashMap();

    /* renamed from: d */
    public MusicModel f177334d;

    /* renamed from: e */
    public String f177335e;

    /* renamed from: f */
    public ShortVideoContext f177336f;

    /* renamed from: g */
    public AbstractC78903b f177337g;

    /* renamed from: h */
    public boolean f177338h;

    /* renamed from: i */
    public final C78882b f177339i = new C78882b();

    /* renamed from: j */
    public final C78899d f177340j = new C78899d();

    /* renamed from: k */
    public final ActivityC0945e f177341k;

    /* renamed from: m */
    private final C78839a f177342m;

    /* renamed from: n */
    private AVChallenge f177343n;

    /* renamed from: o */
    private long f177344o;

    /* renamed from: p */
    private FaceStickerBean f177345p;

    /* renamed from: q */
    private List<? extends MediaModel> f177346q;

    /* renamed from: r */
    private final boolean f177347r;

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.a.e$b */
    public interface AbstractC78903b {
        static {
            Covode.recordClassIndex(92052);
        }

        /* renamed from: a */
        void mo79422a(boolean z);
    }

    static {
        Covode.recordClassIndex(92050);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.a.e$a */
    public static final class C78902a {
        static {
            Covode.recordClassIndex(92051);
        }

        private C78902a() {
        }

        public /* synthetic */ C78902a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.a.e$g */
    public static final class C78910g implements AbstractC78854d {

        /* renamed from: a */
        final /* synthetic */ C78901e f177372a;

        /* renamed from: b */
        final /* synthetic */ C78839a.C78843d f177373b;

        /* renamed from: c */
        final /* synthetic */ ShortVideoContext f177374c;

        /* renamed from: d */
        final /* synthetic */ IPhotoPreDownloadMusic f177375d = null;

        /* renamed from: e */
        final /* synthetic */ List f177376e;

        /* renamed from: f */
        final /* synthetic */ C89233z.C89238e f177377f;

        /* renamed from: g */
        final /* synthetic */ AbstractC78903b f177378g;

        static {
            Covode.recordClassIndex(92059);
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4131a.AbstractC78854d
        /* renamed from: a */
        public final void mo122699a() {
            C78901e.m137694a(1, this.f177372a.f177340j, this.f177376e.size());
            AbstractC78903b bVar = this.f177378g;
            if (bVar != null) {
                bVar.mo79422a(false);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v56, resolved type: java.util.ArrayList<java.lang.String> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4131a.AbstractC78854d
        /* renamed from: a */
        public final void mo122700a(MvThemeData mvThemeData, MusicModel musicModel, String str, boolean z, boolean z2) {
            boolean z3;
            boolean z4;
            int i;
            int i2;
            C39078ad adVar;
            HashMap hashMap;
            Integer num;
            C89219l.m154721d(mvThemeData, "");
            this.f177372a.f177334d = musicModel;
            this.f177372a.f177335e = str;
            this.f177372a.f177338h = z;
            boolean a = C84902i.m145892a(str);
            int i3 = 0;
            if (this.f177373b.f177228a != 0 && ((musicModel != null && musicModel.getId() == Long.MIN_VALUE) || !a)) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (musicModel != null && str != null && !z3 && ((adVar = this.f177374c.f155840y) == null || (hashMap = adVar.mExtraShareOptions) == null || (num = (Integer) hashMap.get("tiktok_videokit_disable_music_selection")) == null || num.intValue() != 1)) {
                if (!z2 && (this.f177372a.f177341k instanceof AbstractC72264w)) {
                    ((AbstractC72264w) this.f177372a.f177341k).mo114264a(true, musicModel, str);
                }
                IPhotoPreDownloadMusic iPhotoPreDownloadMusic = this.f177375d;
                if (iPhotoPreDownloadMusic != null) {
                    iPhotoPreDownloadMusic.firstMusicDownloadSuccess(musicModel, str);
                }
                if (this.f177374c.f155817b.f155652h == null) {
                    this.f177374c.mo110005a(C69744c.m123266a());
                }
                this.f177374c.f155817b.f155652h.mo110090a(str);
                this.f177374c.mo110011a(str);
                this.f177374c.f155753N = !z;
                int duration = musicModel.getDuration();
                if (duration > 0) {
                    this.f177374c.f155822g = duration;
                }
                this.f177374c.mo110023d(0);
                AVExternalServiceImpl.m113114a().publishService().setCurMusic(musicModel, false, Boolean.valueOf(!z));
            }
            String d = mvThemeData.mo122669d();
            C61288d dVar = new C61288d();
            for (Object obj : this.f177376e) {
                dVar.selectMediaList.add(obj);
            }
            dVar.isMVRes1080p = C65402co.C65403a.m117104a().f147549a;
            this.f177372a.f177331a = mvThemeData;
            this.f177372a.f177332b = this.f177374c.mo110034j();
            if (!C84904k.m145909a(dVar.selectMediaList) && !TextUtils.isEmpty(d)) {
                C78901e eVar = this.f177372a;
                if (SettingsManager.m29616a().mo25400a("enable_1080p_photo_mv", false) || C65402co.C65403a.m117104a().f147549a) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                C89233z.C89236c cVar = new C89233z.C89236c();
                if (z4) {
                    i = 1080;
                } else {
                    i = 720;
                }
                cVar.element = i;
                C89233z.C89236c cVar2 = new C89233z.C89236c();
                if (z4) {
                    i2 = 1920;
                } else {
                    i2 = 1280;
                }
                cVar2.element = i2;
                C89233z.C89236c cVar3 = new C89233z.C89236c();
                cVar3.element = 1;
                MvThemeData mvThemeData2 = eVar.f177331a;
                if (mvThemeData2 != null) {
                    if (!(mvThemeData2.f177190g == 0 || mvThemeData2.f177191h == 0)) {
                        cVar.element = mvThemeData2.f177190g;
                        cVar2.element = mvThemeData2.f177191h;
                    }
                    if (C89219l.m154714a((Object) "AspectFill", (Object) mvThemeData2.f177189f)) {
                        cVar3.element = 1;
                    } else if (C89219l.m154714a((Object) "AspectFit", (Object) mvThemeData2.f177189f)) {
                        cVar3.element = 3;
                    } else if (C89219l.m154714a((Object) "AspectWidth", (Object) mvThemeData2.f177189f)) {
                        cVar3.element = 2;
                    } else if (C89219l.m154714a((Object) "FreeMode", (Object) mvThemeData2.f177189f)) {
                        cVar3.element = 4;
                    } else if (C89219l.m154714a((Object) "CenterZoom", (Object) mvThemeData2.f177189f)) {
                        cVar3.element = 5;
                    }
                }
                dVar.srcSelectMediaList.clear();
                dVar.srcSelectMediaList.addAll(dVar.selectMediaList);
                if (C68099i.m120395a()) {
                    AbstractC89568bz unused = C89624i.m155555a(C89561bs.f203280a, C89546bf.f203267b, null, new C78904c(eVar, dVar, cVar, cVar2, cVar3, null), 2);
                } else {
                    C1731i.m5640b(new CallableC78907d(eVar, dVar, cVar, cVar2, cVar3), C1731i.f5562a).mo5534a(new C78908e(eVar, dVar), C1731i.f5564c, null);
                }
            }
            if (str == null || musicModel == null) {
                i3 = 2;
            }
            C78901e.m137694a(i3, this.f177372a.f177340j, this.f177376e.size());
        }

        C78910g(C78901e eVar, C78839a.C78843d dVar, ShortVideoContext shortVideoContext, IPhotoPreDownloadMusic iPhotoPreDownloadMusic, List list, C89233z.C89238e eVar2, AbstractC78903b bVar) {
            this.f177372a = eVar;
            this.f177373b = dVar;
            this.f177374c = shortVideoContext;
            this.f177376e = list;
            this.f177377f = eVar2;
            this.f177378g = bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.a.e$d */
    static final class CallableC78907d<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C78901e f177364a;

        /* renamed from: b */
        final /* synthetic */ C61288d f177365b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89236c f177366c;

        /* renamed from: d */
        final /* synthetic */ C89233z.C89236c f177367d;

        /* renamed from: e */
        final /* synthetic */ C89233z.C89236c f177368e;

        static {
            Covode.recordClassIndex(92056);
        }

        CallableC78907d(C78901e eVar, C61288d dVar, C89233z.C89236c cVar, C89233z.C89236c cVar2, C89233z.C89236c cVar3) {
            this.f177364a = eVar;
            this.f177365b = dVar;
            this.f177366c = cVar;
            this.f177367d = cVar2;
            this.f177368e = cVar3;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            ArrayList arrayList = new ArrayList();
            String str = C78948b.m137762a("resize_bitmap_tmp") + File.separator;
            ArrayList<String> arrayList2 = this.f177365b.selectMediaList;
            C89219l.m154716b(arrayList2, "");
            C89378p<Integer, Integer> a = C78838a.m137626a(arrayList2, new C89378p(Integer.valueOf(this.f177366c.element), Integer.valueOf(this.f177367d.element)));
            Iterator<String> it = this.f177365b.selectMediaList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (C84902i.m145892a(next)) {
                    if (this.f177364a.f177333c.containsKey(next.toString())) {
                        String str2 = this.f177364a.f177333c.get(next.toString());
                        if (str2 == null) {
                            C89219l.m154715b();
                        }
                        arrayList.add(str2);
                    } else if (C36080a.m73536a(next) == null) {
                        arrayList.add(next);
                    } else {
                        String str3 = str + C78948b.m137769c(".bmp");
                        if (C78948b.m137766a(next, str3, a.getFirst().intValue(), a.getSecond().intValue(), this.f177368e.element, Bitmap.CompressFormat.JPEG)) {
                            this.f177364a.f177333c.put(next.toString(), str3);
                            arrayList.add(str3);
                        } else {
                            arrayList.add(next);
                        }
                    }
                }
            }
            if (arrayList.size() > 0) {
                this.f177365b.selectMediaList.clear();
                this.f177365b.selectMediaList.addAll(arrayList);
            }
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.a.e$f */
    static final class C78909f extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC78903b f177371a;

        static {
            Covode.recordClassIndex(92058);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C78909f(AbstractC78903b bVar) {
            super(1);
            this.f177371a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            AbstractC78903b bVar = this.f177371a;
            if (bVar != null) {
                bVar.mo79422a(booleanValue);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.a.e$e */
    static final class C78908e<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ C78901e f177369a;

        /* renamed from: b */
        final /* synthetic */ C61288d f177370b;

        static {
            Covode.recordClassIndex(92057);
        }

        C78908e(C78901e eVar, C61288d dVar) {
            this.f177369a = eVar;
            this.f177370b = dVar;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            AbstractC78903b bVar = this.f177369a.f177337g;
            if (bVar != null) {
                bVar.mo79422a(true);
            }
            this.f177369a.mo122721a(this.f177370b);
            C78901e.m137693a((int) this.f177369a.f177339i.mo122711a("resize image", "success"), this.f177370b.selectMediaList.size());
            C78901e eVar = this.f177369a;
            C61288d dVar = this.f177370b;
            C89219l.m154716b(iVar, "");
            eVar.mo122722a(dVar, (C89378p) iVar.mo5545d());
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo122721a(C61288d dVar) {
        if (C65401cn.m117101a() && C65414cx.m117133a() != 0 && !C63244g.m114602a().mo73255A().mo93901a() && !AVCommerceServiceImpl.m102988h().mo93962a() && C63238c.f143594u.mo93903b()) {
            new C78860a(new C78859b(null, new WeakReference(this.f177341k), null, null, dVar.srcSelectMediaList, "", 448)).mo122701a(null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.a.e$c */
    public static final class C78904c extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f177348a;

        /* renamed from: b */
        final /* synthetic */ C78901e f177349b;

        /* renamed from: c */
        final /* synthetic */ C61288d f177350c;

        /* renamed from: d */
        final /* synthetic */ C89233z.C89236c f177351d;

        /* renamed from: e */
        final /* synthetic */ C89233z.C89236c f177352e;

        /* renamed from: f */
        final /* synthetic */ C89233z.C89236c f177353f;

        /* renamed from: g */
        private /* synthetic */ Object f177354g;

        static {
            Covode.recordClassIndex(92053);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C78904c(C78901e eVar, C61288d dVar, C89233z.C89236c cVar, C89233z.C89236c cVar2, C89233z.C89236c cVar3, AbstractC89124d dVar2) {
            super(2, dVar2);
            this.f177349b = eVar;
            this.f177350c = dVar;
            this.f177351d = cVar;
            this.f177352e = cVar2;
            this.f177353f = cVar3;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            C78904c cVar = new C78904c(this.f177349b, this.f177350c, this.f177351d, this.f177352e, this.f177353f, dVar);
            cVar.f177354g = obj;
            return cVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C78904c) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x00ab  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x00cb A[RETURN] */
        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
            // Method dump skipped, instructions count: 212
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.C78901e.C78904c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C78901e(ActivityC0945e eVar, boolean z) {
        C89219l.m154721d(eVar, "");
        this.f177341k = eVar;
        this.f177347r = z;
        this.f177342m = new C78839a(eVar);
    }

    /* renamed from: a */
    public static void m137693a(int i, int i2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("duration", i);
        C40982q.m82523a("aweme_photomv_generate_duration", jSONObject, new C69840ar().mo110187a("pictureCount", Integer.valueOf(i2)).mo110191a());
    }

    /* renamed from: a */
    public final void mo122722a(C61288d dVar, C89378p<Integer, Integer> pVar) {
        ShortVideoContext shortVideoContext;
        boolean z;
        List<String> list;
        String str;
        ArrayList<? extends Parcelable> arrayList;
        String str2;
        if (dVar.selectMediaList.isEmpty()) {
            new C79459a(this.f177341k).mo123052a(this.f177341k.getString(R.string.cit)).mo123053a();
            return;
        }
        boolean a = C63244g.m114602a().mo73255A().mo93901a();
        String str3 = "multiple_content";
        String str4 = UGCMonitor.TYPE_PHOTO;
        int i = 0;
        boolean z2 = true;
        if (a) {
            C84425b a2 = new C84425b().mo129406a("content_type", str4);
            if (dVar.selectMediaList.size() <= 1) {
                str3 = "single_content";
            }
            C39162r.m79460a("upload_content_next", a2.mo129406a("upload_type", str3).f188764a);
        } else {
            if (this.f177336f != null) {
                shortVideoContext = this.f177336f;
                if (shortVideoContext == null) {
                    C89219l.m154710a("shortVideoContext");
                }
            } else {
                shortVideoContext = null;
            }
            if (dVar.selectMediaList.size() <= 1) {
                str3 = "single_content";
            }
            int size = dVar.selectMediaList.size();
            if (dVar.selectMediaList.size() <= 1) {
                str4 = "none";
            }
            if (dVar.selectMediaList.size() > 1) {
                z = true;
            } else {
                z = false;
            }
            new C72308f(shortVideoContext, "slideshow", str3, 0, size, str4, z).mo114576a(shortVideoContext).mo114577a();
        }
        Intent intent = new Intent();
        MvThemeData mvThemeData = this.f177331a;
        if (mvThemeData != null) {
            list = mvThemeData.mo122667b();
        } else {
            list = null;
        }
        dVar.musicIds = list;
        ActivityC0945e eVar = this.f177341k;
        MvThemeData mvThemeData2 = this.f177331a;
        if (mvThemeData2 != null) {
            str = mvThemeData2.mo122665a();
        } else {
            str = null;
        }
        C80209ad.m139034a(eVar, str, 2);
        MvThemeData mvThemeData3 = this.f177331a;
        if (mvThemeData3 != null && !TextUtils.isEmpty(mvThemeData3.mo122665a())) {
            C71872i iVar = new C71872i();
            iVar.mvThemeId = mvThemeData3.mo122665a();
            MvModel mvModel = new MvModel();
            mvModel.setMvId(mvThemeData3.mo122665a());
            mvModel.setName(mvThemeData3.f177184a.getName());
            UrlModel urlModel = new UrlModel();
            urlModel.setUrlList(mvThemeData3.f177184a.getIconUrl().getUrlList());
            mvModel.setIconUrl(urlModel);
            iVar.mvInfo = mvModel;
            intent.putExtra("av_upload_struct", iVar);
            String a3 = mvThemeData3.mo122665a();
            ShortVideoContext shortVideoContext2 = this.f177336f;
            if (shortVideoContext2 == null) {
                C89219l.m154710a("shortVideoContext");
            }
            if (TextUtils.equals(a3, shortVideoContext2.f155801ak)) {
                ShortVideoContext shortVideoContext3 = this.f177336f;
                if (shortVideoContext3 == null) {
                    C89219l.m154710a("shortVideoContext");
                }
                intent.putExtra("extra_bind_mv_id", shortVideoContext3.f155801ak);
            }
            dVar.mvResUnzipPath = mvThemeData3.mo122669d();
            dVar.mvType = mvThemeData3.f177193j;
            dVar.mvAutoSaveToast = mvThemeData3.f177196m;
        }
        dVar.contactVideoPath = C78948b.m137762a("contact_video") + File.separator + C78948b.m137769c(".mp4");
        intent.putExtra("key_mv_theme_data", dVar);
        intent.putExtra("key_mv_theme_enter", true);
        AVETParameter aVETParameter = this.f177332b;
        if (aVETParameter != null) {
            C70005cr a4 = C70005cr.m123611a();
            String str5 = "";
            C89219l.m154716b(a4, str5);
            List list2 = a4.f156485d;
            if (this.f177343n != null) {
                if (list2 == null) {
                    list2 = new ArrayList();
                }
                AVChallenge aVChallenge = this.f177343n;
                if (aVChallenge == null) {
                    C89219l.m154715b();
                }
                list2.add(aVChallenge);
            }
            if (pVar != null) {
                Parcelable a5 = new C71417f(pVar.getFirst().intValue(), pVar.getSecond().intValue()).mo113022a(dVar);
                Objects.requireNonNull(a5, "null cannot be cast to non-null type android.os.Parcelable");
                intent.putExtra("extra_edit_preview_info", a5);
            } else if (C65402co.C65403a.m117104a().f147549a) {
                Parcelable a6 = new C71417f(1080, 1920).mo113022a(dVar);
                Objects.requireNonNull(a6, "null cannot be cast to non-null type android.os.Parcelable");
                intent.putExtra("extra_edit_preview_info", a6);
            } else {
                Parcelable a7 = new C71417f(720, 1280).mo113022a(dVar);
                Objects.requireNonNull(a7, "null cannot be cast to non-null type android.os.Parcelable");
                intent.putExtra("extra_edit_preview_info", a7);
            }
            intent.putExtra("challenge", (Serializable) list2);
            ShortVideoContext shortVideoContext4 = this.f177336f;
            if (shortVideoContext4 == null) {
                C89219l.m154710a("shortVideoContext");
            }
            if (TextUtils.equals(shortVideoContext4.f155837v, "open_platform_share")) {
                ShortVideoContext shortVideoContext5 = this.f177336f;
                if (shortVideoContext5 == null) {
                    C89219l.m154710a("shortVideoContext");
                }
                intent.putExtra("shoot_way", shortVideoContext5.f155831p);
                ShortVideoContext shortVideoContext6 = this.f177336f;
                if (shortVideoContext6 == null) {
                    C89219l.m154710a("shortVideoContext");
                }
                intent.putExtra("creation_id", shortVideoContext6.f155830o);
                ShortVideoContext shortVideoContext7 = this.f177336f;
                if (shortVideoContext7 == null) {
                    C89219l.m154710a("shortVideoContext");
                }
                if (shortVideoContext7.f155840y != null) {
                    ShortVideoContext shortVideoContext8 = this.f177336f;
                    if (shortVideoContext8 == null) {
                        C89219l.m154710a("shortVideoContext");
                    }
                    intent.putExtra("extra_share_context", shortVideoContext8.f155840y);
                    ShortVideoContext shortVideoContext9 = this.f177336f;
                    if (shortVideoContext9 == null) {
                        C89219l.m154710a("shortVideoContext");
                    }
                    ArrayList arrayList2 = shortVideoContext9.f155840y.mHashTags;
                    C89219l.m154716b(arrayList2, str5);
                    if (!arrayList2.isEmpty()) {
                        if (list2 == null) {
                            list2 = new ArrayList();
                        }
                        ShortVideoContext shortVideoContext10 = this.f177336f;
                        if (shortVideoContext10 == null) {
                            C89219l.m154710a("shortVideoContext");
                        }
                        Iterator it = shortVideoContext10.f155840y.mHashTags.iterator();
                        while (it.hasNext()) {
                            AVChallenge aVChallenge2 = new AVChallenge();
                            aVChallenge2.challengeName = (String) it.next();
                            list2.add(aVChallenge2);
                        }
                    }
                }
            } else {
                intent.putExtra("shoot_way", aVETParameter.getShootWay());
                C89219l.m154716b(intent.putExtra("creation_id", aVETParameter.getCreationId()), str5);
            }
            ShortVideoContext shortVideoContext11 = this.f177336f;
            if (shortVideoContext11 == null) {
                C89219l.m154710a("shortVideoContext");
            }
            intent.putExtra("is_rivate", shortVideoContext11.f155749J);
            intent.putExtra("shoot_mode", aVETParameter.getShootMode());
            intent.putExtra("draft_id", aVETParameter.getDraftId());
            intent.putExtra("new_draft_id", aVETParameter.getNewDraftId());
            intent.putExtra("origin", this.f177347r ? 1 : 0);
            intent.putExtra("content_type", "slideshow");
            intent.putExtra("content_source", "upload");
            ShortVideoContext shortVideoContext12 = this.f177336f;
            if (shortVideoContext12 == null) {
                C89219l.m154710a("shortVideoContext");
            }
            intent.putExtra("tag_id", shortVideoContext12.f155762W);
            ShortVideoContext shortVideoContext13 = this.f177336f;
            if (shortVideoContext13 == null) {
                C89219l.m154710a("shortVideoContext");
            }
            intent.putExtra("shout_out_data", shortVideoContext13.f155765Z);
            ShortVideoContext shortVideoContext14 = this.f177336f;
            if (shortVideoContext14 == null) {
                C89219l.m154710a("shortVideoContext");
            }
            intent.putExtra("creative_flow_data", shortVideoContext14.f155766a);
            ShortVideoContext shortVideoContext15 = this.f177336f;
            if (shortVideoContext15 == null) {
                C89219l.m154710a("shortVideoContext");
            }
            intent.putExtra("share_id", shortVideoContext15.f155821f);
            ShortVideoContext shortVideoContext16 = this.f177336f;
            if (shortVideoContext16 == null) {
                C89219l.m154710a("shortVideoContext");
            }
            intent.putExtra("channel", shortVideoContext16.f155841z);
            ShortVideoContext shortVideoContext17 = this.f177336f;
            if (shortVideoContext17 == null) {
                C89219l.m154710a("shortVideoContext");
            }
            intent.putExtra("comment_video_model", shortVideoContext17.f155825j);
            ShortVideoContext shortVideoContext18 = this.f177336f;
            if (shortVideoContext18 == null) {
                C89219l.m154710a("shortVideoContext");
            }
            intent.putExtra("question_answer_video_model", shortVideoContext18.f155826k);
            intent.putExtra("extra_start_enter_edit_page", this.f177344o);
            intent.putExtra("use_music_before_edit", true);
            FaceStickerBean faceStickerBean = this.f177345p;
            if (faceStickerBean != null) {
                String valueOf = String.valueOf(faceStickerBean.getStickerId());
                if (valueOf != null) {
                    str5 = valueOf;
                }
                intent.putExtra("sticker_id", str5);
            }
            String str6 = this.f177335e;
            if (!(str6 == null || this.f177334d == null)) {
                intent.putExtra("path", str6);
                intent.putExtra("music_model", this.f177334d);
                if (this.f177338h) {
                    ShortVideoContext shortVideoContext19 = this.f177336f;
                    if (shortVideoContext19 == null) {
                        C89219l.m154710a("shortVideoContext");
                    }
                    str2 = shortVideoContext19.f155823h;
                } else {
                    str2 = "slideshow_rec";
                }
                intent.putExtra("music_origin", str2);
                C27910f fVar = new C27910f();
                MusicModel musicModel = this.f177334d;
                if (musicModel == null) {
                    C89219l.m154715b();
                }
                intent.putExtra("first_sticker_music_ids", fVar.mo46674b(C89070n.m154516a(musicModel.getMusicId())));
                MusicModel musicModel2 = this.f177334d;
                if (musicModel2 == null) {
                    C89219l.m154715b();
                }
                intent.putExtra("id", musicModel2.getMusicId());
            }
            ShortVideoContext shortVideoContext20 = this.f177336f;
            if (shortVideoContext20 == null) {
                C89219l.m154710a("shortVideoContext");
            }
            intent.putExtra("workspace", shortVideoContext20.f155817b.f155652h);
            intent.putExtra("extra_photo_mv_mode", true);
            if (!SettingsManager.m29616a().mo25400a("enable_1080p_photo_mv", false) && !C65402co.C65403a.m117104a().f147549a) {
                z2 = false;
            }
            intent.putExtra("extra_photo_mv_mode_1080p", z2);
            ShortVideoContext shortVideoContext21 = this.f177336f;
            if (shortVideoContext21 == null) {
                C89219l.m154710a("shortVideoContext");
            }
            intent.putExtra("is_photo_mv_music", shortVideoContext21.f155753N);
            List<? extends MediaModel> list3 = this.f177346q;
            if (list3 != null) {
                ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>(C89070n.m154526a((Iterable) list3, 10));
                for (T t : list3) {
                    int i2 = i + 1;
                    if (i < 0) {
                        C89070n.m154520a();
                    }
                    T t2 = t;
                    int i3 = t2.f134672l;
                    int i4 = t2.f134673m;
                    long j = t2.f134668h;
                    arrayList3.add(new ImportVideoInfo(i3, i4, 0, 0, String.valueOf(i), (long) (t2.f134678r - t2.f134677q), j, null, null, 0, 0.0f, t2.f134662b, 1932, null));
                    i = i2;
                }
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
            if (!(arrayList instanceof ArrayList)) {
                arrayList = null;
            }
            ArrayList<? extends Parcelable> arrayList4 = arrayList;
            if (arrayList4 != null) {
                intent.putParcelableArrayListExtra("extra_import_video_info_list", arrayList4);
            }
            ShortVideoContext shortVideoContext22 = this.f177336f;
            if (shortVideoContext22 == null) {
                C89219l.m154710a("shortVideoContext");
            }
            intent.putExtra("commerce_data_in_tools_line", shortVideoContext22.f155794ad.f155707c);
        }
        intent.putExtra("extra_request_code", 12346);
        ShortVideoContext shortVideoContext23 = this.f177336f;
        if (shortVideoContext23 == null) {
            C89219l.m154710a("shortVideoContext");
        }
        intent.putExtra("enter_method", shortVideoContext23.f155838w);
        ShortVideoContext shortVideoContext24 = this.f177336f;
        if (shortVideoContext24 == null) {
            C89219l.m154710a("shortVideoContext");
        }
        C70641dm.m124845a(intent, shortVideoContext24);
        VEVideoPublishEditActivity.m125011a((Activity) this.f177341k, intent);
    }

    /* renamed from: a */
    private final void m137695a(String str, MediaModel mediaModel, AbstractC89172b<? super Boolean, C89391z> bVar) {
        AbstractC66810d l = C63244g.m114602a().mo73284l();
        ActivityC0945e eVar = this.f177341k;
        ShortVideoContext shortVideoContext = this.f177336f;
        if (shortVideoContext == null) {
            C89219l.m154710a("shortVideoContext");
        }
        l.photoCanvasGoNext(eVar, str, shortVideoContext, this.f177345p, true, mediaModel, bVar);
    }

    /* renamed from: a */
    public static void m137694a(int i, C78899d dVar, int i2) {
        String str;
        C89219l.m154721d(dVar, "");
        C69840ar arVar = new C69840ar();
        if (i2 > 1) {
            str = "multi";
        } else {
            str = "single";
        }
        C40982q.m82520a("aweme_photomv_synthesis_error_rate", i, arVar.mo110189a("photo_import_mode", str).mo110187a("mvtemplate_list_download_time", Integer.valueOf(dVar.f177319b)).mo110187a("mvtemplate_download_time", Integer.valueOf(dVar.f177320c)).mo110187a("mvtemplate_use_predownload", Integer.valueOf(dVar.f177321d)).mo110187a("hot_music_list_download_time", Integer.valueOf(dVar.f177322e)).mo110187a("hot_music_list_list_size", Integer.valueOf(dVar.f177323f)).mo110187a("music_download_time", Integer.valueOf(dVar.f177324g)).mo110189a("music_id", dVar.f177325h).mo110187a("error_code", Integer.valueOf(dVar.f177326i)).mo110187a("failed_step", Integer.valueOf(dVar.f177328k)).mo110189a("failed_reason", dVar.f177329l).mo110191a());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00f5, code lost:
        if (r9.equals("multi") != false) goto L_0x00b5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0138  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo122723a(com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext r30, java.util.List<java.lang.String> r31, com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.C78901e.AbstractC78903b r32, boolean r33, java.lang.Long r34, boolean r35, java.util.List<? extends com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel> r36) {
        /*
        // Method dump skipped, instructions count: 363
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.C78901e.mo122723a(com.ss.android.ugc.aweme.shortvideo.ShortVideoContext, java.util.List, com.ss.android.ugc.aweme.tools.mvtemplate.a.e$b, boolean, java.lang.Long, boolean, java.util.List):void");
    }
}
