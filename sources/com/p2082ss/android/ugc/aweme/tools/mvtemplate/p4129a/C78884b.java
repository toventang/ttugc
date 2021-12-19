package com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.mime.TypedFile;
import com.bytedance.sysoptimizer.BadParcelableCrashOptimizer;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.google.gson.AbstractC28019l;
import com.google.gson.C27910f;
import com.google.gson.C28024q;
import com.google.gson.C28027t;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.mvtheme.C61288d;
import com.p2082ss.android.ugc.aweme.mvtheme.MvNetFileBean;
import com.p2082ss.android.ugc.aweme.p2477ci.C36080a;
import com.p2082ss.android.ugc.aweme.p2730de.C40982q;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p2082ss.android.ugc.aweme.shortvideo.C69840ar;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.C70641dm;
import com.p2082ss.android.ugc.aweme.shortvideo.C71872i;
import com.p2082ss.android.ugc.aweme.shortvideo.ImportVideoInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.C71417f;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MvModel;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AbstractC72263v;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.MvThemeData;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.net.AbstractC78993e;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.net.AfrApi;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.net.C78975a;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.net.C78981c;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.net.C78992d;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.net.ImageResponse;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.net.ProgressDialogC78977b;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.net.VideoResponse;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4140e.C78947a;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4140e.C78948b;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80209ad;
import com.p2082ss.android.ugc.aweme.utils.C80537hk;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84896h;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.vesdk.VEMVAlgorithmConfig;
import com.p2082ss.android.vesdk.VEUtils;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.a.b */
public final class C78884b implements AbstractC72263v {

    /* renamed from: g */
    public static final C78885a f177277g = new C78885a((byte) 0);

    /* renamed from: a */
    public MvThemeData f177278a;

    /* renamed from: b */
    public boolean f177279b;

    /* renamed from: c */
    public final Map<String, String> f177280c = new LinkedHashMap();

    /* renamed from: d */
    public final List<MvNetFileBean> f177281d = new ArrayList();

    /* renamed from: e */
    final AbstractC89244h f177282e = C89250i.m154773a((AbstractC89171a) C78887c.f177292a);

    /* renamed from: f */
    public final ActivityC0945e f177283f;

    /* renamed from: h */
    private final AbstractC89244h f177284h = C89250i.m154773a((AbstractC89171a) new C78886b(this));

    /* renamed from: i */
    private AVETParameter f177285i;

    /* renamed from: j */
    private ShortVideoContext f177286j;

    /* renamed from: k */
    private AVChallenge f177287k;

    /* renamed from: l */
    private long f177288l;

    /* renamed from: m */
    private long f177289m;

    /* renamed from: n */
    private final ArrayList<ImportVideoInfo> f177290n = new ArrayList<>();

    static {
        Covode.recordClassIndex(92033);
    }

    /* renamed from: b */
    public final ProgressDialogC78977b mo122713b() {
        return (ProgressDialogC78977b) this.f177284h.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.a.b$a */
    public static final class C78885a {
        static {
            Covode.recordClassIndex(92034);
        }

        private C78885a() {
        }

        public /* synthetic */ C78885a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.a.b$c */
    static final class C78887c extends AbstractC89220m implements AbstractC89171a<C78981c> {

        /* renamed from: a */
        public static final C78887c f177292a = new C78887c();

        static {
            Covode.recordClassIndex(92036);
        }

        C78887c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C78981c invoke() {
            return new C78981c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.a.b$h */
    public static final class C78893h implements AbstractC78993e {

        /* renamed from: a */
        final /* synthetic */ C78884b f177303a;

        /* renamed from: b */
        final /* synthetic */ C61288d f177304b;

        static {
            Covode.recordClassIndex(92042);
        }

        /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.a.b$h$b */
        static final class C78895b extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C78893h f177307a;

            static {
                Covode.recordClassIndex(92044);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C78895b(C78893h hVar) {
                super(0);
                this.f177307a = hVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                this.f177307a.f177303a.mo122712a(this.f177307a.f177304b);
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.a.b$h$a */
        static final class C78894a extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C78893h f177305a;

            /* renamed from: b */
            final /* synthetic */ String f177306b;

            static {
                Covode.recordClassIndex(92043);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C78894a(C78893h hVar, String str) {
                super(0);
                this.f177305a = hVar;
                this.f177306b = str;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                if (this.f177306b.length() > 0) {
                    new C79459a(this.f177305a.f177303a.f177283f).mo123052a(this.f177306b).mo123053a();
                } else {
                    new C79459a(this.f177305a.f177303a.f177283f).mo123052a(this.f177305a.f177303a.f177283f.getResources().getString(R.string.c0)).mo123053a();
                }
                return C89391z.f203057a;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.mvtemplate.net.AbstractC78993e
        /* renamed from: a */
        public final void mo122716a(ArrayList<MvNetFileBean> arrayList) {
            List<String> list;
            String h;
            C89219l.m154721d(arrayList, "");
            for (T t : arrayList) {
                C78884b bVar = this.f177303a;
                C61288d dVar = this.f177304b;
                MvThemeData mvThemeData = bVar.f177278a;
                if (mvThemeData != null && (list = mvThemeData.f177197n) != null && list.contains(t.getAlgorithm()) && ((h = C84896h.m145875h(t.getFilePath())) == null || !(C89361p.m154876c(h, ".mp4", false) || C89361p.m154876c(h, "/mp4", false)))) {
                    dVar.photoToSave.add(t.getFilePath());
                }
                dVar.newMaskFileData.add(t);
            }
            List<MvNetFileBean> list2 = this.f177303a.f177281d;
            list2.clear();
            ArrayList<MvNetFileBean> arrayList2 = this.f177304b.newMaskFileData;
            C89219l.m154716b(arrayList2, "");
            list2.addAll(arrayList2);
            this.f177303a.mo122713b().mo122796a(new C78895b(this));
        }

        C78893h(C78884b bVar, C61288d dVar) {
            this.f177303a = bVar;
            this.f177304b = dVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.mvtemplate.net.AbstractC78993e
        /* renamed from: a */
        public final void mo122717a(ArrayList<MvNetFileBean> arrayList, String str) {
            C89219l.m154721d(arrayList, "");
            C89219l.m154721d(str, "");
            this.f177303a.f177281d.addAll(arrayList);
            this.f177303a.mo122713b().mo122796a(new C78894a(this, str));
            C78947a.m137760a(false, this.f177303a.f177278a, (C89378p<Integer, String>) C89387v.m154943a(103, str));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.a.b$b */
    static final class C78886b extends AbstractC89220m implements AbstractC89171a<ProgressDialogC78977b> {

        /* renamed from: a */
        final /* synthetic */ C78884b f177291a;

        static {
            Covode.recordClassIndex(92035);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C78886b(C78884b bVar) {
            super(0);
            this.f177291a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ProgressDialogC78977b invoke() {
            return new ProgressDialogC78977b(this.f177291a.f177283f);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AbstractC72263v
    /* renamed from: a */
    public final void mo114427a() {
        C1731i.m5640b(new CallableC78888d(this), C1731i.f5562a);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.a.b$g */
    static final class C78892g extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C78884b f177302a;

        static {
            Covode.recordClassIndex(92041);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C78892g(C78884b bVar) {
            super(0);
            this.f177302a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            new C79459a(this.f177302a.f177283f).mo123052a(this.f177302a.f177283f.getResources().getString(R.string.c0)).mo123053a();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.a.b$d */
    static final class CallableC78888d<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C78884b f177293a;

        static {
            Covode.recordClassIndex(92037);
        }

        CallableC78888d(C78884b bVar) {
            this.f177293a = bVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            for (Map.Entry<String, String> entry : this.f177293a.f177280c.entrySet()) {
                if (C89361p.m154876c(entry.getValue(), ".bmp", false)) {
                    C80720e.m139931c(entry.getValue());
                }
            }
            Iterator<T> it = this.f177293a.f177281d.iterator();
            while (it.hasNext()) {
                C80720e.m139931c(it.next().getFilePath());
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.a.b$e */
    static final class CallableC78889e<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C78884b f177294a;

        /* renamed from: b */
        final /* synthetic */ C61288d f177295b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89236c f177296c;

        /* renamed from: d */
        final /* synthetic */ C89233z.C89236c f177297d;

        /* renamed from: e */
        final /* synthetic */ C89233z.C89236c f177298e;

        static {
            Covode.recordClassIndex(92038);
        }

        CallableC78889e(C78884b bVar, C61288d dVar, C89233z.C89236c cVar, C89233z.C89236c cVar2, C89233z.C89236c cVar3) {
            this.f177294a = bVar;
            this.f177295b = dVar;
            this.f177296c = cVar;
            this.f177297d = cVar2;
            this.f177298e = cVar3;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            ArrayList arrayList = new ArrayList();
            String str = C78948b.m137762a("resize_bitmap_tmp") + File.separator;
            Iterator<String> it = this.f177295b.selectMediaList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (C84902i.m145892a(next)) {
                    if (this.f177294a.f177280c.containsKey(next.toString())) {
                        String str2 = this.f177294a.f177280c.get(next.toString());
                        if (str2 == null) {
                            C89219l.m154715b();
                        }
                        arrayList.add(str2);
                    } else if (C36080a.m73536a(next) == null) {
                        arrayList.add(next);
                    } else {
                        String str3 = str + C78948b.m137769c(".bmp");
                        if (C78948b.m137766a(next, str3, this.f177296c.element, this.f177297d.element, this.f177298e.element, Bitmap.CompressFormat.PNG)) {
                            this.f177294a.f177280c.put(next.toString(), str3);
                            arrayList.add(str3);
                        } else {
                            arrayList.add(next);
                        }
                    }
                }
            }
            if (arrayList.size() > 0) {
                this.f177295b.selectMediaList.clear();
                this.f177295b.selectMediaList.addAll(arrayList);
            }
            return C89391z.f203057a;
        }
    }

    public C78884b(ActivityC0945e eVar) {
        C89219l.m154721d(eVar, "");
        this.f177283f = eVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.a.b$f */
    static final class C78890f<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ C78884b f177299a;

        /* renamed from: b */
        final /* synthetic */ C61288d f177300b;

        static {
            Covode.recordClassIndex(92039);
        }

        C78890f(C78884b bVar, C61288d dVar) {
            this.f177299a = bVar;
            this.f177300b = dVar;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            boolean z;
            boolean z2;
            boolean z3;
            if (this.f177299a.f177279b) {
                C78884b bVar = this.f177299a;
                MvThemeData mvThemeData = bVar.f177278a;
                if (mvThemeData == null) {
                    C89219l.m154715b();
                }
                String d = mvThemeData.mo122669d();
                if (d == null) {
                    C89219l.m154715b();
                }
                C89219l.m154716b(d, "");
                ArrayList<String> arrayList = this.f177300b.selectMediaList;
                C89219l.m154716b(arrayList, "");
                C61288d dVar = this.f177300b;
                VEMVAlgorithmConfig mVAlgorithmConfigs = VEUtils.getMVAlgorithmConfigs(d, arrayList);
                if (mVAlgorithmConfigs == null) {
                    bVar.mo122713b().mo122796a(new C78892g(bVar));
                    C78947a.m137760a(false, bVar.f177278a, (C89378p<Integer, String>) C89387v.m154943a(102, "algorithmConfig is null"));
                } else {
                    C78981c cVar = (C78981c) bVar.f177282e.getValue();
                    C78893h hVar = new C78893h(bVar, dVar);
                    C89219l.m154721d(mVAlgorithmConfigs, "");
                    C89219l.m154721d(hVar, "");
                    C89233z.C89238e eVar = new C89233z.C89238e();
                    eVar.element = "";
                    C89233z.C89236c cVar2 = new C89233z.C89236c();
                    cVar2.element = 0;
                    cVar.f177499b.clear();
                    ArrayList arrayList2 = new ArrayList();
                    VEMVAlgorithmConfig.AlgorithmInfo[] algorithmInfoArr = mVAlgorithmConfigs.infos;
                    int length = algorithmInfoArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        VEMVAlgorithmConfig.AlgorithmInfo algorithmInfo = algorithmInfoArr[i];
                        if (algorithmInfo.photoPath == null) {
                            arrayList2.clear();
                            break;
                        }
                        String str = algorithmInfo.photoPath;
                        C78975a b = cVar.mo122803b();
                        C89219l.m154716b(str, "");
                        String a = b.mo122793a(str);
                        VEMVAlgorithmConfig.AlgorithmInfo.AlgorithmItem[] algorithmItemArr = algorithmInfo.items;
                        C89219l.m154716b(algorithmItemArr, "");
                        String str2 = "";
                        String str3 = str2;
                        for (VEMVAlgorithmConfig.AlgorithmInfo.AlgorithmItem algorithmItem : algorithmItemArr) {
                            VEMVAlgorithmConfig.MV_REESULT_OUT_TYPE mv_reesult_out_type = algorithmItem.result_out_type;
                            if (mv_reesult_out_type != null) {
                                int i2 = C78992d.f177519a[mv_reesult_out_type.ordinal()];
                                AbstractC28019l lVar = null;
                                if (i2 == 1 || i2 == 2) {
                                    if (algorithmItem.isNeedServerExecute) {
                                        C78975a b2 = cVar.mo122803b();
                                        String str4 = algorithmItem.algorithmName;
                                        C89219l.m154716b(str4, "");
                                        MvNetFileBean a2 = b2.mo122792a(a, str4);
                                        if (a2 == null) {
                                            String str5 = algorithmItem.algorithmParamJson;
                                            if (str5 == null || str5.length() == 0) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            if (z2) {
                                                str3 = str3 + algorithmItem.algorithmName + ',';
                                                str2 = str2 + algorithmItem.result_out_type.ordinal() + ',';
                                            } else {
                                                C89219l.m154716b(algorithmItem, "");
                                                String a3 = cVar.mo122803b().mo122793a(str);
                                                if (algorithmItem.isNeedServerExecute && C80537hk.m139613a(algorithmItem.algorithmName)) {
                                                    C78975a b3 = cVar.mo122803b();
                                                    String str6 = algorithmItem.algorithmName;
                                                    C89219l.m154716b(str6, "");
                                                    MvNetFileBean a4 = b3.mo122792a(a3, str6);
                                                    if (a4 == null) {
                                                        TypedFile typedFile = new TypedFile("image/*", new File(str));
                                                        try {
                                                            lVar = C28024q.m56139a(algorithmItem.algorithmParamJson);
                                                        } catch (C28027t unused) {
                                                        }
                                                        if (!C63238c.f143594u.mo93901a() && C63238c.f143594u.mo93903b()) {
                                                            AfrApi a5 = cVar.mo122801a();
                                                            String str7 = algorithmItem.algorithmName;
                                                            C89219l.m154716b(str7, "");
                                                            AbstractC88979t<ImageResponse> b4 = a5.getImageInfo(str7, a3, String.valueOf(algorithmItem.result_out_type.ordinal()), typedFile, lVar).mo143299f(C78981c.C78983b.f177503a).mo143278b(C88925a.m154180b(C88946a.f201991c));
                                                            C89219l.m154716b(b4, "");
                                                            arrayList2.add(b4);
                                                        }
                                                    } else {
                                                        cVar.f177499b.add(a4);
                                                    }
                                                }
                                            }
                                        } else {
                                            cVar.f177499b.add(a2);
                                        }
                                    }
                                } else if (i2 == 3 || i2 == 4) {
                                    C89219l.m154716b(algorithmItem, "");
                                    String a6 = cVar.mo122803b().mo122793a(str);
                                    if (algorithmItem.isNeedServerExecute) {
                                        String str8 = algorithmItem.algorithmName;
                                        C89219l.m154716b(str8, "");
                                        if (str8.length() > 0) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        if (z3) {
                                            C78975a b5 = cVar.mo122803b();
                                            String str9 = algorithmItem.algorithmName;
                                            C89219l.m154716b(str9, "");
                                            MvNetFileBean a7 = b5.mo122792a(a6, str9);
                                            if (a7 == null) {
                                                TypedFile typedFile2 = new TypedFile("image/*", new File(str));
                                                try {
                                                    lVar = C28024q.m56139a(algorithmItem.algorithmParamJson);
                                                } catch (C28027t unused2) {
                                                }
                                                if (!C63238c.f143594u.mo93901a() && C63238c.f143594u.mo93903b()) {
                                                    AfrApi a8 = cVar.mo122801a();
                                                    String str10 = algorithmItem.algorithmName;
                                                    C89219l.m154716b(str10, "");
                                                    AbstractC88979t<VideoResponse> b6 = a8.getVideoInfo(str10, a6, algorithmItem.result_out_type.ordinal(), typedFile2, lVar).mo143299f(C78981c.C78985d.f177505a).mo143278b(C88925a.m154180b(C88946a.f201991c));
                                                    C89219l.m154716b(b6, "");
                                                    arrayList2.add(b6);
                                                }
                                            } else {
                                                cVar.f177499b.add(a7);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        String b7 = C89361p.m154913b(str3, (CharSequence) ",");
                        String b8 = C89361p.m154913b(str2, (CharSequence) ",");
                        if (b7.length() > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z && !C63238c.f143594u.mo93901a() && C63238c.f143594u.mo93903b()) {
                            AbstractC88979t<ImageResponse> b9 = cVar.mo122801a().getImageInfo(b7, a, b8, new TypedFile("image/*", new File(str)), null).mo143299f(C78981c.C78984c.f177504a).mo143278b(C88925a.m154180b(C88946a.f201991c));
                            C89219l.m154716b(b9, "");
                            arrayList2.add(b9);
                        }
                        i++;
                    }
                    if (!arrayList2.isEmpty()) {
                        cVar.f177498a = AbstractC88979t.m154301a(arrayList2, new C78981c.C78987f(cVar2, eVar)).mo143292d(new C78981c.C78988g(cVar, cVar2)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143255a(new C78981c.C78989h(cVar, cVar2, hVar, eVar), new C78981c.C78990i(cVar, hVar, eVar), new C78981c.C78991j(cVar));
                    } else if (cVar.f177499b.isEmpty()) {
                        hVar.mo122717a(cVar.f177499b, eVar.element);
                    } else {
                        hVar.mo122716a(cVar.f177499b);
                    }
                }
            } else {
                this.f177299a.mo122713b().mo122796a(new AbstractC89171a<C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.C78884b.C78890f.C788911 */

                    /* renamed from: a */
                    final /* synthetic */ C78890f f177301a;

                    static {
                        Covode.recordClassIndex(92040);
                    }

                    {
                        this.f177301a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // p4600h.p4611f.p4612a.AbstractC89171a
                    public final /* synthetic */ C89391z invoke() {
                        this.f177301a.f177299a.mo122712a(this.f177301a.f177300b);
                        return C89391z.f203057a;
                    }
                });
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo122712a(C61288d dVar) {
        String str;
        String str2;
        List<String> list;
        if (C63244g.m114602a().mo73255A() != null && C63244g.m114602a().mo73255A().mo93901a()) {
            C78947a.m137760a(false, this.f177278a, (C89378p<Integer, String>) C89387v.m154943a(101, "teen mode"));
        } else if (dVar.selectMediaList.isEmpty()) {
            new C79459a(this.f177283f).mo123052a(this.f177283f.getString(R.string.cit)).mo123053a();
            C78947a.m137760a(false, this.f177278a, (C89378p<Integer, String>) C89387v.m154943a(100, "media list is empty"));
        } else {
            long currentTimeMillis = System.currentTimeMillis() - this.f177289m;
            MvThemeData mvThemeData = this.f177278a;
            if (mvThemeData != null) {
                str = mvThemeData.mo122665a();
            } else {
                str = null;
            }
            boolean z = this.f177279b;
            C89219l.m154721d(dVar, "");
            if (!C84904k.m145909a(dVar.selectMediaList) && str != null) {
                C40982q.m82520a("aweme_mv_generate_duration", 0, new C69840ar().mo110188a("duration", Long.valueOf(currentTimeMillis)).mo110187a("pictureCount", Integer.valueOf(dVar.selectMediaList.size())).mo110185a("needServer", Boolean.valueOf(z)).mo110189a("mvID", str).mo110191a());
            }
            C39162r.m79460a("upload_event_next", new C84425b().mo129406a("content_type", UGCMonitor.TYPE_PHOTO).mo129406a("upload_type", "mv").f188764a);
            ActivityC0945e eVar = this.f177283f;
            MvThemeData mvThemeData2 = this.f177278a;
            if (mvThemeData2 != null) {
                str2 = mvThemeData2.mo122665a();
            } else {
                str2 = null;
            }
            C80209ad.m139034a(eVar, str2, 2);
            ActivityC0945e eVar2 = this.f177283f;
            MvThemeData mvThemeData3 = this.f177278a;
            AVChallenge aVChallenge = this.f177287k;
            ShortVideoContext shortVideoContext = this.f177286j;
            if (shortVideoContext == null) {
                C89219l.m154710a("shortVideoContext");
            }
            AVETParameter aVETParameter = this.f177285i;
            long j = this.f177288l;
            ArrayList<ImportVideoInfo> arrayList = this.f177290n;
            C89219l.m154721d(eVar2, "");
            C89219l.m154721d(dVar, "");
            C89219l.m154721d(shortVideoContext, "");
            Intent intent = new Intent();
            if (mvThemeData3 != null) {
                list = mvThemeData3.mo122667b();
            } else {
                list = null;
            }
            dVar.musicIds = list;
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
                if (!C84904k.m145909a(mvThemeData3.mo122667b())) {
                    intent.putExtra("first_sticker_music_ids", new C27910f().mo46674b(mvThemeData3.mo122667b()));
                }
                if (TextUtils.equals(mvThemeData3.mo122665a(), shortVideoContext.f155801ak)) {
                    intent.putExtra("extra_bind_mv_id", shortVideoContext.f155801ak);
                }
                dVar.mvResUnzipPath = mvThemeData3.mo122669d();
                dVar.mvType = mvThemeData3.f177193j;
                dVar.mvId = mvThemeData3.mo122665a();
                dVar.mvAutoSaveToast = mvThemeData3.f177196m;
            }
            dVar.contactVideoPath = C78948b.m137762a("contact_video") + File.separator + C78948b.m137769c(".mp4");
            intent.putExtra("key_mv_theme_data", dVar);
            intent.putExtra("creative_flow_data", (Parcelable) shortVideoContext.f155766a);
            intent.putExtra("key_mv_theme_enter", true);
            if (arrayList != null && !arrayList.isEmpty()) {
                intent.putParcelableArrayListExtra("extra_import_video_info_list", arrayList);
            }
            C70641dm.m124845a(intent, shortVideoContext);
            if (aVETParameter != null) {
                C70005cr a = C70005cr.m123611a();
                C89219l.m154716b(a, "");
                List list2 = a.f156485d;
                if (aVChallenge != null) {
                    if (list2 == null) {
                        list2 = new ArrayList();
                    }
                    list2.add(aVChallenge);
                }
                EditPreviewInfo a2 = new C71417f(720, 1280).mo113022a(dVar);
                Objects.requireNonNull(a2, "null cannot be cast to non-null type android.os.Parcelable");
                intent.putExtra("extra_edit_preview_info", (Parcelable) a2);
                Objects.requireNonNull(list2, "null cannot be cast to non-null type java.io.Serializable");
                intent.putExtra("challenge", (Serializable) list2);
                intent.putExtra("shoot_way", aVETParameter.getShootWay());
                intent.putExtra("creation_id", aVETParameter.getCreationId());
                intent.putExtra("shoot_mode", aVETParameter.getShootMode());
                intent.putExtra("draft_id", aVETParameter.getDraftId());
                intent.putExtra("new_draft_id", aVETParameter.getNewDraftId());
                intent.putExtra("origin", 0);
                intent.putExtra("content_type", "mv");
                intent.putExtra("content_source", "upload");
                intent.putExtra("tag_id", shortVideoContext.f155762W);
                intent.putExtra("comment_video_model", shortVideoContext.f155825j);
                intent.putExtra("question_answer_video_model", shortVideoContext.f155826k);
                intent.putExtra("extra_start_enter_edit_page", j);
                intent.putExtra("micro_app_info", shortVideoContext.f155796af);
                intent.putExtra("enter_method", shortVideoContext.f155838w);
                intent.putExtra("commerce_data_in_tools_line", shortVideoContext.f155794ad.f155707c);
            }
            VEVideoPublishEditActivity.m125012a((Context) this.f177283f, intent);
            C78947a.m137760a(true, this.f177278a, (C89378p<Integer, String>) null);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AbstractC72263v
    /* renamed from: a */
    public final void mo114428a(int i, Intent intent) {
        Serializable serializable;
        boolean z;
        MvThemeData mvThemeData;
        String d;
        C89219l.m154721d(intent, "");
        if (i == 10001) {
            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data");
            if (parcelableArrayListExtra == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(parcelableArrayListExtra, "");
            this.f177290n.clear();
            int size = parcelableArrayListExtra.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                MediaModel mediaModel = (MediaModel) parcelableArrayListExtra.get(i2);
                C89219l.m154716b(mediaModel, "");
                if (mediaModel.mo96674b()) {
                    this.f177290n.clear();
                    break;
                } else {
                    this.f177290n.add(new ImportVideoInfo(mediaModel.f134672l, mediaModel.f134673m, 0, 0, String.valueOf(i2), mediaModel.f134668h, (long) (mediaModel.f134678r - mediaModel.f134677q), "", "", 0, 0.0f, mediaModel.f134662b));
                    i2++;
                }
            }
            Bundle bundleExtra = intent.getBundleExtra("key_extra_info");
            Context context = BadParcelableCrashOptimizer.getContext();
            if (!(bundleExtra == null || context == null)) {
                bundleExtra.setClassLoader(context.getClassLoader());
            }
            if (bundleExtra != null) {
                serializable = bundleExtra.getSerializable("Key_mv_challenge");
            } else {
                serializable = null;
            }
            this.f177287k = (AVChallenge) serializable;
            this.f177288l = intent.getLongExtra("extra_start_enter_edit_page", System.currentTimeMillis());
            C61288d dVar = new C61288d();
            Iterator it = parcelableArrayListExtra.iterator();
            while (it.hasNext()) {
                MediaModel mediaModel2 = (MediaModel) it.next();
                ArrayList<String> arrayList = dVar.selectMediaList;
                C89219l.m154716b(mediaModel2, "");
                arrayList.add(mediaModel2.f134662b);
            }
            MvThemeData mvThemeData2 = (MvThemeData) intent.getParcelableExtra("key_select_mv_data");
            this.f177278a = mvThemeData2;
            if (mvThemeData2 != null) {
                z = mvThemeData2.f177194k;
            } else {
                z = false;
            }
            this.f177279b = z;
            Parcelable parcelableExtra = intent.getParcelableExtra("key_short_video_context");
            if (parcelableExtra == null) {
                C89219l.m154715b();
            }
            ShortVideoContext shortVideoContext = (ShortVideoContext) parcelableExtra;
            this.f177286j = shortVideoContext;
            if (shortVideoContext == null) {
                C89219l.m154710a("shortVideoContext");
            }
            this.f177285i = shortVideoContext.mo110034j();
            if (!C84904k.m145909a(dVar.selectMediaList) && (mvThemeData = this.f177278a) != null && (d = mvThemeData.mo122669d()) != null && d.length() > 0) {
                this.f177289m = System.currentTimeMillis();
                if (this.f177279b) {
                    ProgressDialogC78977b b = mo122713b();
                    String string = this.f177283f.getString(R.string.c1);
                    C89219l.m154716b(string, "");
                    b.mo122797a(string);
                } else {
                    ProgressDialogC78977b b2 = mo122713b();
                    String string2 = this.f177283f.getString(R.string.fvf);
                    C89219l.m154716b(string2, "");
                    b2.mo122797a(string2);
                }
                C89233z.C89236c cVar = new C89233z.C89236c();
                cVar.element = 720;
                C89233z.C89236c cVar2 = new C89233z.C89236c();
                cVar2.element = 1280;
                C89233z.C89236c cVar3 = new C89233z.C89236c();
                cVar3.element = 1;
                MvThemeData mvThemeData3 = this.f177278a;
                if (mvThemeData3 != null) {
                    if (!(mvThemeData3.f177190g == 0 || mvThemeData3.f177191h == 0)) {
                        cVar.element = mvThemeData3.f177190g;
                        cVar2.element = mvThemeData3.f177191h;
                    }
                    if (C89219l.m154714a((Object) "AspectFill", (Object) mvThemeData3.f177189f)) {
                        cVar3.element = 1;
                    } else if (C89219l.m154714a((Object) "AspectFit", (Object) mvThemeData3.f177189f)) {
                        cVar3.element = 3;
                    } else if (C89219l.m154714a((Object) "AspectWidth", (Object) mvThemeData3.f177189f)) {
                        cVar3.element = 2;
                    } else if (C89219l.m154714a((Object) "FreeMode", (Object) mvThemeData3.f177189f)) {
                        cVar3.element = 4;
                    } else if (C89219l.m154714a((Object) "CenterZoom", (Object) mvThemeData3.f177189f)) {
                        cVar3.element = 5;
                    }
                }
                dVar.srcSelectMediaList.clear();
                dVar.srcSelectMediaList.addAll(dVar.selectMediaList);
                C1731i.m5640b(new CallableC78889e(this, dVar, cVar, cVar2, cVar3), C1731i.f5562a).mo5534a(new C78890f(this, dVar), C1731i.f5564c, null);
            }
        }
    }
}
