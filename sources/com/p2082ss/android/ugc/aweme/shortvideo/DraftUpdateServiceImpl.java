package com.p2082ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.draft.model.DraftUpdateService;
import com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p2082ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.shortvideo.p3792ae.C69800b;
import com.p2082ss.android.ugc.aweme.utils.GsonHolder;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.DraftUpdateServiceImpl */
public final class DraftUpdateServiceImpl implements DraftUpdateService {
    public static final C69726a Companion = new C69726a((byte) 0);
    public static final AbstractC89244h gson$delegate = C89250i.m154773a((AbstractC89171a) C69727b.f155674a);

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.DraftUpdateServiceImpl$a */
    public static final class C69726a {
        static {
            Covode.recordClassIndex(82111);
        }

        private C69726a() {
        }

        public /* synthetic */ C69726a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.DraftUpdateServiceImpl$b */
    static final class C69727b extends AbstractC89220m implements AbstractC89171a<C27910f> {

        /* renamed from: a */
        public static final C69727b f155674a = new C69727b();

        static {
            Covode.recordClassIndex(82112);
        }

        C69727b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C27910f invoke() {
            IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
            C89219l.m154716b(createIAVServiceProxybyMonsterPlugin, "");
            return createIAVServiceProxybyMonsterPlugin.getNetworkService().getRetrofitFactoryGson();
        }
    }

    static {
        Covode.recordClassIndex(82110);
    }

    public static DraftUpdateService createDraftUpdateServicebyMonsterPlugin(boolean z) {
        MethodCollector.m26663i(8085);
        Object a = C81908b.m141854a(DraftUpdateService.class, z);
        if (a != null) {
            DraftUpdateService draftUpdateService = (DraftUpdateService) a;
            MethodCollector.m26664o(8085);
            return draftUpdateService;
        }
        if (C81908b.f183326dW == null) {
            synchronized (DraftUpdateService.class) {
                try {
                    if (C81908b.f183326dW == null) {
                        C81908b.f183326dW = new DraftUpdateServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(8085);
                    throw th;
                }
            }
        }
        DraftUpdateServiceImpl draftUpdateServiceImpl = (DraftUpdateServiceImpl) C81908b.f183326dW;
        MethodCollector.m26664o(8085);
        return draftUpdateServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.draft.model.DraftUpdateService
    public final C69905c transformNewAVMusic(String str) {
        C89219l.m154721d(str, "");
        Object a = ((C27910f) gson$delegate.getValue()).mo46670a(str, MusicModel.class);
        C89219l.m154716b(a, "");
        MusicModel musicModel = (MusicModel) a;
        if (musicModel.getName() == null && musicModel.getMusicType() == null) {
            Object a2 = GsonHolder.m138943c().mo123620b().mo46670a(str, C69905c.class);
            C89219l.m154716b(a2, "");
            return (C69905c) a2;
        }
        C69905c a3 = C69800b.m123327a(musicModel);
        C89219l.m154716b(a3, "");
        return a3;
    }
}
