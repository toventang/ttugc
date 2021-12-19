package com.bytedance.android.livesdk.manage;

import android.util.Pair;
import androidx.p025c.C0489d;
import com.bytedance.android.live.C4139e;
import com.bytedance.android.live.base.model.user.AbstractC2994b;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live.core.p218f.C3927c;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.p408u.C6203g;
import com.bytedance.android.livesdk.C10310r;
import com.bytedance.android.livesdk.gift.C8781a;
import com.bytedance.android.livesdk.gift.assets.AbstractC8784a;
import com.bytedance.android.livesdk.gift.assets.AbstractC8785b;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.livesetting.gift.EnableAssetsDeleteTimeLimitSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftAssetsStorageLimit;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftResourceDownloadSetting;
import com.bytedance.android.livesdk.manage.api.AssetsApi;
import com.bytedance.android.livesdk.manage.p572a.C9478a;
import com.bytedance.android.livesdk.manage.p573b.C9482a;
import com.bytedance.android.livesdk.manage.p574c.AbstractC9484a;
import com.bytedance.android.livesdk.manage.p574c.C9485b;
import com.bytedance.android.livesdk.manage.p574c.C9486c;
import com.bytedance.android.livesdk.manage.p574c.C9488d;
import com.bytedance.android.livesdk.manage.p574c.C9489e;
import com.bytedance.android.livesdk.manage.p574c.C9490f;
import com.bytedance.android.livesdk.manage.p574c.C9491g;
import com.bytedance.android.livesdk.manage.p574c.C9492h;
import com.bytedance.android.livesdk.manage.p575d.C9493a;
import com.bytedance.android.livesdk.model.C9904t;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p425aa.C6559l;
import com.bytedance.android.livesdk.p425aa.p429d.C6542d;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p450an.C6800c;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.service.assets.C10681a;
import com.bytedance.android.livesdk.service.assets.GiftManager;
import com.bytedance.android.livesdk.service.p625c.p628c.C10731d;
import com.bytedance.android.livesdk.service.p625c.p632g.C10752a;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.utils.C11265g;
import com.bytedance.common.utility.C13617h;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.p907b.RunnableC13596e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.google.gson.C27910f;
import com.google.gson.p2019b.C27895a;
import com.p2082ss.android.ugc.effectmanager.common.utils.FileUtils;
import com.p2082ss.ugc.live.p4460a.p4461a.AbstractC87013b;
import com.p2082ss.ugc.live.p4460a.p4461a.AbstractC87026d;
import com.p2082ss.ugc.live.p4460a.p4461a.C87020c;
import com.p2082ss.ugc.live.p4460a.p4461a.C87040f;
import com.p2082ss.ugc.live.p4460a.p4461a.p4462a.AbstractC87012b;
import com.p2082ss.ugc.live.p4460a.p4461a.p4464c.C87021a;
import com.p2082ss.ugc.live.p4460a.p4461a.p4464c.C87022b;
import com.p2082ss.ugc.live.p4460a.p4461a.p4464c.C87023c;
import com.p2082ss.ugc.live.p4460a.p4461a.p4464c.C87024d;
import com.p2082ss.ugc.live.p4460a.p4461a.p4464c.C87025e;
import com.p2082ss.ugc.live.p4460a.p4461a.p4466e.C87037b;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import p4560f.p4561a.AbstractC88398aa;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.manage.a */
public final class C9462a implements AbstractC8785b {

    /* renamed from: d */
    public static final C9464a f23003d = new C9464a((byte) 0);

    /* renamed from: a */
    public List<? extends AssetsModel> f23004a;

    /* renamed from: b */
    public final C0489d<Long> f23005b;

    /* renamed from: c */
    public final C88411a f23006c;

    /* renamed from: e */
    private final C88411a f23007e;

    /* renamed from: f */
    private final LinkedList<AbstractC9484a> f23008f;

    /* renamed from: com.bytedance.android.livesdk.manage.a$k */
    public static final class C9474k extends C27895a<C0489d<Double>> {
        static {
            Covode.recordClassIndex(10982);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.manage.a$l */
    public static final class C9475l extends C27895a<List<? extends AssetsModel>> {
        static {
            Covode.recordClassIndex(10983);
        }
    }

    static {
        Covode.recordClassIndex(10970);
    }

    /* renamed from: com.bytedance.android.livesdk.manage.a$a */
    public static final class C9464a {
        static {
            Covode.recordClassIndex(10972);
        }

        private C9464a() {
        }

        public /* synthetic */ C9464a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.manage.a$b */
    public static final class C9465b {

        /* renamed from: a */
        public static final C9462a f23010a = new C9462a((byte) 0);

        /* renamed from: b */
        public static final C9465b f23011b = new C9465b();

        private C9465b() {
        }

        static {
            Covode.recordClassIndex(10973);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.manage.a$c */
    public static final class C9466c extends C27895a<List<? extends AssetsModel>> {
        static {
            Covode.recordClassIndex(10974);
        }

        C9466c() {
        }
    }

    /* renamed from: com.bytedance.android.livesdk.manage.a$d */
    public static final class C9467d extends C27895a<C0489d<Double>> {
        static {
            Covode.recordClassIndex(10975);
        }

        C9467d() {
        }
    }

    /* renamed from: com.bytedance.android.livesdk.manage.a$e */
    public static final class C9468e extends C27895a<List<? extends AssetsModel>> {
        static {
            Covode.recordClassIndex(10976);
        }

        C9468e() {
        }
    }

    /* renamed from: com.bytedance.android.livesdk.manage.a$h */
    public static final class C9471h extends C27895a<List<? extends AssetsModel>> {
        static {
            Covode.recordClassIndex(10979);
        }

        C9471h() {
        }
    }

    /* renamed from: com.bytedance.android.livesdk.manage.a$j */
    public static final class C9473j implements AbstractC87013b {
        static {
            Covode.recordClassIndex(10981);
        }

        C9473j() {
        }

        @Override // com.p2082ss.ugc.live.p4460a.p4461a.AbstractC87013b
        /* renamed from: a */
        public final void mo16293a(C87021a aVar) {
            int i;
            long j;
            C89219l.m154721d(aVar, "");
            try {
                JSONObject jSONObject = new JSONObject();
                int i2 = -1;
                if (aVar instanceof C87023c) {
                    jSONObject.put("response_code", ((C87023c) aVar).getErrorCode());
                    i = 1;
                } else if (aVar instanceof C87025e) {
                    i = 2;
                } else if (aVar instanceof C87022b) {
                    i = 3;
                } else if (aVar instanceof C87024d) {
                    i = 4;
                } else if (aVar instanceof C9478a) {
                    i = 5;
                    jSONObject.put("downloader_error_code", ((C9478a) aVar).getErrorCode());
                } else {
                    i = -1;
                }
                C87020c resourceRequest = aVar.getResourceRequest();
                long j2 = -1;
                if (resourceRequest != null) {
                    j = resourceRequest.f196192d;
                } else {
                    j = -1;
                }
                AssetsModel a = C9465b.f23010a.mo15073a(aVar.getResourceId());
                if (a != null) {
                    i2 = a.getResourceType();
                    j2 = a.getSize();
                }
                jSONObject.put("gift_id", aVar.getResourceId());
                jSONObject.put("gift_type", i2);
                jSONObject.put("size", j2);
                jSONObject.put("error_code", i);
                jSONObject.put("error_desc", aVar.toString());
                jSONObject.put("download_assets_from", j);
                C6559l lVar = new C6559l();
                lVar.f16376a = jSONObject;
                lVar.mo12693a("hotsoon_live_gift_resource_download_rate", 1);
                HashMap hashMap = new HashMap(1);
                String jSONObject2 = jSONObject.toString();
                C89219l.m154716b(jSONObject2, "");
                hashMap.put("info", jSONObject2);
                C6501b.C6502a.m13948a("hotsoon_live_gift_resource_download_failed").mo12652a((Map<String, String>) hashMap).mo12655b();
                if (aVar instanceof C9478a) {
                    i = ((C9478a) aVar).getErrorCode();
                }
                C10752a.m19342a(aVar.getResourceId(), i2, j, i, aVar.toString());
            } catch (JSONException e) {
                C3854a.m9459b(e.toString());
            }
        }

        @Override // com.p2082ss.ugc.live.p4460a.p4461a.AbstractC87013b
        /* renamed from: a */
        public final void mo16292a(long j, C87020c cVar) {
            int i;
            long j2;
            C89219l.m154721d(cVar, "");
            JSONObject jSONObject = new JSONObject();
            long j3 = cVar.f196192d;
            AssetsModel a = C9465b.f23010a.mo15073a(j);
            if (a != null) {
                i = a.getResourceType();
                j2 = a.getSize();
            } else {
                i = -1;
                j2 = -1;
            }
            try {
                jSONObject.put("gift_id", j);
                jSONObject.put("gift_type", i);
                jSONObject.put("size", j2);
                jSONObject.put("download_assets_from", j3);
            } catch (JSONException e) {
                C3854a.m9459b(e.toString());
            }
            C6559l lVar = new C6559l();
            lVar.f16376a = jSONObject;
            lVar.mo12693a("hotsoon_live_gift_resource_download_rate", 0);
            C6779a.m14563a().mo13053a(new C8781a(j));
            C6501b.C6502a.m13948a("hotsoon_live_gift_resource_download_success").mo12651a("resource_id", String.valueOf(j)).mo12639a().mo12655b();
            HashMap hashMap = new HashMap();
            hashMap.put("asset_id", Long.valueOf(j));
            hashMap.put("asset_type", Integer.valueOf(i));
            hashMap.put("download_assets_from", Long.valueOf(j3));
            C3868c.m9491a(C6542d.m13984a("ttlive_gift_asset_download_status"), 0, hashMap);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.manage.a$i */
    public static final class C9472i implements AbstractC87026d {

        /* renamed from: a */
        final /* synthetic */ AbstractC8784a f23014a;

        static {
            Covode.recordClassIndex(10980);
        }

        @Override // com.p2082ss.ugc.live.p4460a.p4461a.AbstractC87026d
        /* renamed from: a */
        public final void mo16289a() {
            this.f23014a.mo8562a();
        }

        C9472i(AbstractC8784a aVar) {
            this.f23014a = aVar;
        }

        @Override // com.p2082ss.ugc.live.p4460a.p4461a.AbstractC87026d
        /* renamed from: a */
        public final void mo16290a(String str) {
            C89219l.m154721d(str, "");
            this.f23014a.mo8563a(str);
        }

        @Override // com.p2082ss.ugc.live.p4460a.p4461a.AbstractC87026d
        /* renamed from: a */
        public final void mo16291a(Throwable th) {
            C89219l.m154721d(th, "");
            this.f23014a.mo8564a(th);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.manage.a$g */
    public static final class C9470g extends RunnableC13596e {

        /* renamed from: a */
        final /* synthetic */ File f23013a;

        static {
            Covode.recordClassIndex(10978);
        }

        @Override // com.bytedance.common.utility.p907b.RunnableC13596e
        public final void run() {
            try {
                C11265g.m19964b(this.f23013a);
                C87040f.m150751a().f196234e.clear();
            } catch (Throwable unused) {
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9470g(File file) {
            super((byte) 0);
            this.f23013a = file;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.manage.a$f */
    public static final class C9469f extends RunnableC13596e {

        /* renamed from: a */
        final /* synthetic */ List f23012a;

        static {
            Covode.recordClassIndex(10977);
        }

        @Override // com.bytedance.common.utility.p907b.RunnableC13596e
        public final void run() {
            for (AssetsModel assetsModel : this.f23012a) {
                C87020c a = C10681a.m19251a(assetsModel, 0);
                if (a != null) {
                    C87040f a2 = C87040f.m150751a();
                    a2.f196234e.put(a.f196189a, new Pair<>(false, Long.valueOf(System.currentTimeMillis())));
                    String a3 = a2.f196232c.f196214a.mo16301a(a);
                    if (a3 != null) {
                        File file = new File(a3);
                        if (file.exists()) {
                            C87037b.m150746a(file);
                        }
                    }
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9469f(List list) {
            super((byte) 0);
            this.f23012a = list;
        }
    }

    private C9462a() {
        this.f23004a = new ArrayList();
        this.f23005b = new C0489d<>();
        this.f23006c = new C88411a();
        this.f23007e = new C88411a();
        this.f23008f = new LinkedList<>();
        try {
            ((IGiftService) C6193a.m13435a(IGiftService.class)).initGiftResourceManager(C3966y.m9669e());
        } catch (Exception unused) {
        }
        C87040f a = C87040f.m150751a();
        C9473j jVar = new C9473j();
        if (!a.f196233d.contains(jVar)) {
            a.f196233d.add(jVar);
        }
        if (LiveGiftResourceDownloadSetting.INSTANCE.getValue() != 0) {
            this.f23007e.mo142945a(C17873f.m33097e().mo143289d(new AbstractC88433f(this) {
                /* class com.bytedance.android.livesdk.manage.C9462a.C94631 */

                /* renamed from: a */
                final /* synthetic */ C9462a f23009a;

                static {
                    Covode.recordClassIndex(10971);
                }

                {
                    this.f23009a = r1;
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88433f
                public final /* synthetic */ void accept(Object obj) {
                    long j;
                    if (C17873f.f42636l) {
                        C9462a aVar = this.f23009a;
                        int i = 0;
                        if (LiveGiftResourceDownloadSetting.INSTANCE.getValue() == 1) {
                            i = 3;
                        } else if (LiveGiftResourceDownloadSetting.INSTANCE.getValue() == 2) {
                            i = 7;
                        }
                        List<AssetsModel> a = aVar.mo16286a();
                        if (!C13617h.m24465a(a)) {
                            C6805b<String> bVar = AbstractC6804a.f17054e;
                            C89219l.m154716b(bVar, "");
                            String a2 = bVar.mo13066a();
                            C6805b<String> bVar2 = AbstractC6804a.f17055f;
                            C89219l.m154716b(bVar2, "");
                            String a3 = bVar2.mo13066a();
                            C27910f fVar = C4139e.C4140a.f11575b;
                            if (!(C13627m.m24498a(a2) || C13627m.m24498a(a3))) {
                                Object a4 = fVar.mo46671a(a2, new C9468e().type);
                                C89219l.m154716b(a4, "");
                                List<AssetsModel> list = (List) a4;
                                Object a5 = fVar.mo46671a(a3, new C9467d().type);
                                C89219l.m154716b(a5, "");
                                C0489d dVar = (C0489d) a5;
                                ArrayList<AssetsModel> arrayList = new ArrayList();
                                long currentTimeMillis = System.currentTimeMillis();
                                for (AssetsModel assetsModel : list) {
                                    Double d = (Double) dVar.mo2077a(assetsModel.getId());
                                    if (d != null) {
                                        j = (long) d.doubleValue();
                                    } else {
                                        j = 0;
                                    }
                                    if (!a.contains(assetsModel) && currentTimeMillis - j > ((long) i) * 86400000) {
                                        arrayList.add(assetsModel);
                                    }
                                }
                                for (AssetsModel assetsModel2 : arrayList) {
                                    if (dVar.mo2089d(assetsModel2.getId())) {
                                        dVar.mo2082b(assetsModel2.getId());
                                    }
                                    if (list.contains(assetsModel2)) {
                                        list.remove(assetsModel2);
                                    }
                                }
                                C6805b<String> bVar3 = AbstractC6804a.f17054e;
                                C89219l.m154716b(bVar3, "");
                                C6806c.m14603a(bVar3, fVar.mo46674b(list));
                                C6805b<String> bVar4 = AbstractC6804a.f17055f;
                                C89219l.m154716b(bVar4, "");
                                C6806c.m14603a(bVar4, fVar.mo46674b(dVar));
                                C9462a.m17764b(arrayList);
                            }
                        }
                    }
                }
            }));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final List<AssetsModel> mo16286a() {
        GiftManager inst = GiftManager.inst();
        C89219l.m154716b(inst, "");
        List<GiftPage> giftPageList = inst.getGiftPageList();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (GiftPage giftPage : giftPageList) {
            for (C9904t tVar : giftPage.gifts) {
                C89219l.m154716b(tVar, "");
                if (tVar.f24008m && tVar.f24009n != 0) {
                    arrayList.add(Long.valueOf(tVar.f24009n));
                }
            }
        }
        for (AssetsModel assetsModel : this.f23004a) {
            if (arrayList.contains(Long.valueOf(assetsModel.getId()))) {
                arrayList2.add(assetsModel);
            }
        }
        return arrayList2;
    }

    /* renamed from: b */
    public static long m17763b() {
        String a;
        List<AssetsModel> list;
        C27910f fVar = C4139e.C4140a.f11575b;
        if (LiveGiftResourceDownloadSetting.INSTANCE.getValue() == 0) {
            C6805b<String> bVar = AbstractC6804a.f17053d;
            C89219l.m154716b(bVar, "");
            a = bVar.mo13066a();
            C6805b<Long> bVar2 = AbstractC6804a.f17056g;
            C89219l.m154716b(bVar2, "");
            C6806c.m14603a((C6800c) bVar2, (Object) 0L);
            C6805b<String> bVar3 = AbstractC6804a.f17053d;
            C89219l.m154716b(bVar3, "");
            C6806c.m14603a(bVar3, "");
            C6805b<String> bVar4 = AbstractC6804a.f17055f;
            C89219l.m154716b(bVar4, "");
            C6806c.m14603a(bVar4, "");
        } else {
            C6805b<String> bVar5 = AbstractC6804a.f17054e;
            C89219l.m154716b(bVar5, "");
            a = bVar5.mo13066a();
            C6805b<String> bVar6 = AbstractC6804a.f17054e;
            C89219l.m154716b(bVar6, "");
            C6806c.m14603a(bVar6, "");
        }
        if (C13627m.m24498a(a) || (list = (List) fVar.mo46671a(a, new C9466c().type)) == null) {
            return 0;
        }
        ArrayList arrayList = new ArrayList();
        long j = 0;
        for (AssetsModel assetsModel : list) {
            C10310r.m18755a(assetsModel.getId(), 0);
            arrayList.add(Long.valueOf(assetsModel.getId()));
            C87020c a2 = C10681a.m19251a(assetsModel, 0);
            if (a2 != null) {
                C87040f a3 = C87040f.m150751a();
                C89219l.m154716b(a3, "");
                j += FileUtils.INSTANCE.getFolderSize(new File(a3.f196232c.f196214a.mo16301a(a2)));
            }
        }
        try {
            m17764b(list);
        } catch (Exception unused) {
        }
        int size = arrayList.size();
        C89219l.m154721d(arrayList, "");
        HashMap hashMap = new HashMap();
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        C89219l.m154716b(b, "");
        AbstractC2994b a4 = b.mo13147a();
        C89219l.m154716b(a4, "");
        long id = a4.getId();
        hashMap.put("resource_num", String.valueOf(size));
        hashMap.put("assets_id_list", arrayList.toString());
        hashMap.put("user_id", String.valueOf(id));
        C3868c.m9491a(C6542d.m13984a("resource_gift_video_delete"), 0, hashMap);
        return j;
    }

    public /* synthetic */ C9462a(byte b) {
        this();
    }

    /* renamed from: b */
    static void m17764b(List<AssetsModel> list) {
        if (!C13617h.m24465a(list)) {
            new C9469f(list).mo21860a();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.manage.a$n */
    static final class C9477n<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C9462a f23017a;

        static {
            Covode.recordClassIndex(10985);
        }

        C9477n(C9462a aVar) {
            this.f23017a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C89219l.m154721d(th, "");
            C3854a.m9453a(6, "Assets Manager", th.getMessage());
            this.f23017a.f23006c.mo142944a();
        }
    }

    /* renamed from: a */
    public static boolean m17762a(AssetsModel assetsModel) {
        C87020c a = C10681a.m19251a(assetsModel, 0);
        if (a == null || !C87040f.m150751a().mo140643b(a)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m17765b(long j) {
        return m17762a(C9465b.f23010a.mo15073a(j));
    }

    /* renamed from: c */
    public static String m17766c(long j) {
        return C87040f.m150751a().mo140640a(C10681a.m19251a(C9465b.f23010a.mo15073a(j), 0));
    }

    @Override // com.bytedance.android.livesdk.gift.assets.AbstractC8785b
    /* renamed from: a */
    public final AssetsModel mo15073a(long j) {
        for (AssetsModel assetsModel : this.f23004a) {
            if (assetsModel.getId() == j) {
                return assetsModel;
            }
        }
        return null;
    }

    /* renamed from: com.bytedance.android.livesdk.manage.a$m */
    static final class C9476m<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C9462a f23015a;

        /* renamed from: b */
        final /* synthetic */ int f23016b;

        static {
            Covode.recordClassIndex(10984);
        }

        C9476m(C9462a aVar, int i) {
            this.f23015a = aVar;
            this.f23016b = i;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C9493a aVar;
            List<? extends AssetsModel> list;
            C5832d dVar = (C5832d) obj;
            if (!(dVar == null || (aVar = (C9493a) dVar.data) == null || (list = aVar.f23035a) == null)) {
                this.f23015a.f23004a = list;
            }
            if (LiveGiftResourceDownloadSetting.INSTANCE.getValue() != 0) {
                C6805b<String> bVar = AbstractC6804a.f17054e;
                C89219l.m154716b(bVar, "");
                if (C13627m.m24498a(bVar.mo13066a())) {
                    C9462a aVar2 = this.f23015a;
                    List<AssetsModel> a = aVar2.mo16286a();
                    ArrayList arrayList = new ArrayList();
                    if (!C13617h.m24465a(a)) {
                        for (Object obj2 : aVar2.f23004a) {
                            if (!a.contains(obj2)) {
                                arrayList.add(obj2);
                            }
                        }
                        C9462a.m17764b(arrayList);
                    }
                    if (LiveGiftResourceDownloadSetting.INSTANCE.getValue() != 0) {
                        C87040f a2 = C87040f.m150751a();
                        C89219l.m154716b(a2, "");
                        if (a2.f196232c.f196214a instanceof C9482a) {
                            C87040f a3 = C87040f.m150751a();
                            C89219l.m154716b(a3, "");
                            AbstractC87012b bVar2 = a3.f196232c.f196214a;
                            Objects.requireNonNull(bVar2, "null cannot be cast to non-null type com.bytedance.android.livesdk.manage.file.AssetsFileCacheFactory");
                            File file = new File(((C9482a) bVar2).f23029a);
                            if (file.exists()) {
                                new C9470g(file).mo21860a();
                            }
                        }
                    }
                }
            }
            this.f23015a.mo16287a(this.f23016b);
            if (LiveGiftResourceDownloadSetting.INSTANCE.getValue() == 0) {
                C9462a.m17761a(this.f23015a.f23004a);
            }
            this.f23015a.f23006c.mo142944a();
        }
    }

    /* renamed from: a */
    public static void m17761a(List<? extends AssetsModel> list) {
        if (!C13617h.m24465a(list)) {
            C6805b<Long> bVar = AbstractC6804a.f17056g;
            C89219l.m154716b(bVar, "");
            Long a = bVar.mo13066a();
            C6805b<String> bVar2 = AbstractC6804a.f17053d;
            C89219l.m154716b(bVar2, "");
            String a2 = bVar2.mo13066a();
            if (EnableAssetsDeleteTimeLimitSetting.INSTANCE.getValue()) {
                long currentTimeMillis = System.currentTimeMillis();
                C89219l.m154716b(a, "");
                if (currentTimeMillis - a.longValue() < 86400000) {
                    return;
                }
            }
            C27910f fVar = C4139e.C4140a.f11575b;
            if ((a != null && a.longValue() == 0) || C13627m.m24498a(a2)) {
                C6805b<Long> bVar3 = AbstractC6804a.f17056g;
                C89219l.m154716b(bVar3, "");
                C6806c.m14603a(bVar3, Long.valueOf(System.currentTimeMillis()));
                C6805b<String> bVar4 = AbstractC6804a.f17053d;
                C89219l.m154716b(bVar4, "");
                C6806c.m14603a(bVar4, fVar.mo46674b(list));
                return;
            }
            Object a3 = fVar.mo46671a(a2, new C9471h().type);
            C89219l.m154716b(a3, "");
            ArrayList arrayList = new ArrayList();
            for (Object obj : (List) a3) {
                if (!list.contains(obj)) {
                    arrayList.add(obj);
                }
            }
            C6805b<Long> bVar5 = AbstractC6804a.f17056g;
            C89219l.m154716b(bVar5, "");
            C6806c.m14603a(bVar5, Long.valueOf(System.currentTimeMillis()));
            C6805b<String> bVar6 = AbstractC6804a.f17053d;
            C89219l.m154716b(bVar6, "");
            C6806c.m14603a(bVar6, fVar.mo46674b(list));
            m17764b(arrayList);
        }
    }

    /* renamed from: a */
    public final void mo16287a(int i) {
        Iterator<AbstractC9484a> it = this.f23008f.iterator();
        while (it.hasNext()) {
            it.next().mo16302a(i);
        }
    }

    @Override // com.bytedance.android.livesdk.gift.assets.AbstractC8785b
    /* renamed from: a */
    public final void mo15075a(long j, AbstractC8784a aVar, int i) {
        m17760a(C9465b.f23010a.mo15073a(j), aVar, i);
    }

    /* renamed from: a */
    public static void m17760a(AssetsModel assetsModel, AbstractC8784a aVar, int i) {
        int i2;
        boolean z = false;
        if (LiveGiftAssetsStorageLimit.INSTANCE.isCheckEnable()) {
            C87040f a = C87040f.m150751a();
            C89219l.m154716b(a, "");
            AbstractC87012b bVar = a.f196232c.f196214a;
            C89219l.m154716b(bVar, "");
            long a2 = C3927c.m9563a(bVar.mo16300a());
            long j = 0;
            if (a2 > 0 && a2 / 1024 < LiveGiftAssetsStorageLimit.INSTANCE.getThreshold() && !m17762a(assetsModel)) {
                String concat = "AssetsManager.downloadAssets: storage available ".concat(String.valueOf(a2));
                if (aVar != null) {
                    aVar.mo8564a(new Exception(concat));
                }
                if (assetsModel != null) {
                    j = assetsModel.getId();
                }
                if (assetsModel != null) {
                    i2 = assetsModel.getResourceType();
                } else {
                    i2 = 0;
                }
                C10752a.m19342a(j, i2, (long) i, 6, concat);
                return;
            }
        }
        C87020c a3 = C10681a.m19251a(assetsModel, i);
        if (a3 == null) {
            if (aVar != null) {
                aVar.mo8564a(new Exception("AssetsManager.downloadAssets: GetResourceRequest is null"));
            }
            C10731d.C10732a.C10733a.f25859a.mo17659a(C10731d.EnumC10736b.ASSET_ERROR, "Request Create Error");
            return;
        }
        if (i == 4) {
            z = true;
        }
        a3.f196195g = z;
        if (aVar == null) {
            C87040f.m150751a().mo140641a(a3, (AbstractC87026d) null);
        } else {
            C87040f.m150751a().mo140641a(a3, (AbstractC87026d) new C9472i(aVar));
        }
    }

    @Override // com.bytedance.android.livesdk.gift.assets.AbstractC8785b
    /* renamed from: a */
    public final void mo15074a(int i, boolean z, Long l) {
        AbstractC88398aa a;
        this.f23008f.clear();
        if (LiveGiftResourceDownloadSetting.INSTANCE.getValue() == 0) {
            this.f23008f.addLast(new C9485b());
            this.f23008f.addLast(new C9488d());
            this.f23008f.addLast(new C9490f());
            if (z) {
                this.f23008f.addLast(new C9491g());
            }
        } else {
            this.f23008f.addLast(new C9486c());
            this.f23008f.addLast(new C9489e());
            if (z) {
                this.f23008f.addLast(new C9492h());
            }
        }
        C88411a aVar = this.f23006c;
        AbstractC88979t<C5832d<C9493a>> b = ((AssetsApi) C5805e.m12718a().mo11572a(AssetsApi.class)).getAssets(i, l).mo143278b(C88925a.m154180b(C88946a.f201991c));
        if (C6203g.m13464a()) {
            a = C88925a.m154180b(C88946a.f201991c);
        } else {
            a = C88391a.m153580a(C88392a.f200660a);
        }
        aVar.mo142945a(b.mo143261a(a).mo143254a(new C9476m(this, i), new C9477n(this)));
    }
}
