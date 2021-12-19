package com.p2082ss.android.ugc.aweme.p3452ml.impl;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.p3452ml.api.AbstractC60013b;
import com.p2082ss.android.ugc.aweme.p3452ml.api.C60012a;
import com.p2082ss.android.ugc.aweme.p3452ml.api.IMLCommonService;
import com.p2082ss.android.ugc.aweme.p3452ml.api.MLCommonService;
import com.p2082ss.android.ugc.aweme.p3452ml.api.MLDataCenterService;
import com.p2082ss.android.ugc.aweme.p3452ml.api.SmartDataTrackerService;
import com.p2082ss.android.ugc.aweme.p3452ml.api.SmartFeedAdUIService;
import com.p2082ss.android.ugc.aweme.p3452ml.api.SmartFeedLoadMoreService;
import com.p2082ss.android.ugc.aweme.p3452ml.api.SmartFeedPreloadService;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.SmartCommonPreloadService;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.SmartPlaytimePredictService;
import com.p2082ss.android.ugc.aweme.p3452ml.p3453a.AbstractC59976b;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import p077b.C1731i;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ml.impl.MLCommonServiceImpl */
public final class MLCommonServiceImpl extends MLCommonService {

    /* renamed from: a */
    AbstractC88412b f136799a;

    /* renamed from: b */
    public AbstractC59976b f136800b;

    /* renamed from: c */
    boolean f136801c;

    /* renamed from: d */
    final AbstractC88433f<Boolean> f136802d = new C60048a(this);

    /* renamed from: e */
    private boolean f136803e;

    /* renamed from: f */
    private final ConcurrentHashMap<String, ArrayList<AbstractC60013b>> f136804f = new ConcurrentHashMap<>();

    /* renamed from: g */
    private int f136805g;

    static {
        Covode.recordClassIndex(70513);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.IMLCommonService
    public final void runInMainActivityOnCreate() {
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.IMLCommonService
    public final void runInMainActivityOnDestroy() {
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.IMLCommonService
    public final AbstractC59976b getAwemeAdapter() {
        return this.f136800b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ml.impl.MLCommonServiceImpl$b */
    public static final class CallableC60049b<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ ArrayList f136807a;

        /* renamed from: b */
        final /* synthetic */ MLCommonServiceImpl f136808b;

        /* renamed from: c */
        final /* synthetic */ Aweme f136809c;

        /* renamed from: d */
        final /* synthetic */ String f136810d;

        /* renamed from: e */
        final /* synthetic */ String f136811e;

        static {
            Covode.recordClassIndex(70515);
        }

        CallableC60049b(ArrayList arrayList, MLCommonServiceImpl mLCommonServiceImpl, Aweme aweme, String str, String str2) {
            this.f136807a = arrayList;
            this.f136808b = mLCommonServiceImpl;
            this.f136809c = aweme;
            this.f136810d = str;
            this.f136811e = str2;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            C60012a aVar;
            if (this.f136809c != null) {
                aVar = new C60012a(this.f136809c, this.f136810d);
            } else {
                aVar = null;
            }
            MLCommonServiceImpl.m109530a(this.f136811e, aVar, this.f136807a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ml.impl.MLCommonServiceImpl$c */
    static final class CallableC60050c<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ ArrayList f136812a;

        /* renamed from: b */
        final /* synthetic */ MLCommonServiceImpl f136813b;

        /* renamed from: c */
        final /* synthetic */ Aweme f136814c;

        /* renamed from: d */
        final /* synthetic */ String f136815d;

        /* renamed from: e */
        final /* synthetic */ boolean f136816e;

        static {
            Covode.recordClassIndex(70516);
        }

        CallableC60050c(ArrayList arrayList, MLCommonServiceImpl mLCommonServiceImpl, Aweme aweme, String str, boolean z) {
            this.f136812a = arrayList;
            this.f136813b = mLCommonServiceImpl;
            this.f136814c = aweme;
            this.f136815d = str;
            this.f136816e = z;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            C60012a aVar = new C60012a(this.f136814c, this.f136815d);
            aVar.f136670b = this.f136816e;
            MLCommonServiceImpl.m109530a("play_pause", aVar, this.f136812a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ml.impl.MLCommonServiceImpl$f */
    static final class CallableC60053f<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ ArrayList f136825a;

        /* renamed from: b */
        final /* synthetic */ MLCommonServiceImpl f136826b;

        /* renamed from: c */
        final /* synthetic */ Aweme f136827c;

        /* renamed from: d */
        final /* synthetic */ String f136828d;

        /* renamed from: e */
        final /* synthetic */ long f136829e;

        static {
            Covode.recordClassIndex(70519);
        }

        CallableC60053f(ArrayList arrayList, MLCommonServiceImpl mLCommonServiceImpl, Aweme aweme, String str, long j) {
            this.f136825a = arrayList;
            this.f136826b = mLCommonServiceImpl;
            this.f136827c = aweme;
            this.f136828d = str;
            this.f136829e = j;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            C60012a aVar = new C60012a(this.f136827c, this.f136828d);
            aVar.f136669a = this.f136829e;
            MLCommonServiceImpl.m109530a("play_call_playtime", aVar, this.f136825a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ml.impl.MLCommonServiceImpl$e */
    static final class CallableC60052e<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ ArrayList f136820a;

        /* renamed from: b */
        final /* synthetic */ MLCommonServiceImpl f136821b;

        /* renamed from: c */
        final /* synthetic */ String f136822c;

        /* renamed from: d */
        final /* synthetic */ String f136823d;

        /* renamed from: e */
        final /* synthetic */ Aweme f136824e;

        static {
            Covode.recordClassIndex(70518);
        }

        CallableC60052e(ArrayList arrayList, MLCommonServiceImpl mLCommonServiceImpl, String str, String str2, Aweme aweme) {
            this.f136820a = arrayList;
            this.f136821b = mLCommonServiceImpl;
            this.f136822c = str;
            this.f136823d = str2;
            this.f136824e = aweme;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            Aweme aweme;
            AbstractC59976b bVar = this.f136821b.f136800b;
            if (bVar != null) {
                aweme = bVar.mo84947a(this.f136822c);
            } else {
                aweme = null;
            }
            C60012a aVar = new C60012a(aweme, this.f136823d);
            aVar.f136671c = this.f136824e;
            MLCommonServiceImpl.m109530a("play_stop", aVar, this.f136820a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static IMLCommonService m109529a() {
        MethodCollector.m26663i(12717);
        Object a = C81908b.m141854a(IMLCommonService.class, false);
        if (a != null) {
            IMLCommonService iMLCommonService = (IMLCommonService) a;
            MethodCollector.m26664o(12717);
            return iMLCommonService;
        }
        if (C81908b.f183252cB == null) {
            synchronized (IMLCommonService.class) {
                try {
                    if (C81908b.f183252cB == null) {
                        C81908b.f183252cB = new MLCommonServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(12717);
                    throw th;
                }
            }
        }
        MLCommonService mLCommonService = (MLCommonService) C81908b.f183252cB;
        MethodCollector.m26664o(12717);
        return mLCommonService;
    }

    /* renamed from: com.ss.android.ugc.aweme.ml.impl.MLCommonServiceImpl$d */
    static final class CallableC60051d<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ MLCommonServiceImpl f136817a;

        /* renamed from: b */
        final /* synthetic */ Aweme f136818b;

        /* renamed from: c */
        final /* synthetic */ String f136819c;

        static {
            Covode.recordClassIndex(70517);
        }

        CallableC60051d(MLCommonServiceImpl mLCommonServiceImpl, Aweme aweme, String str) {
            this.f136817a = mLCommonServiceImpl;
            this.f136818b = aweme;
            this.f136819c = str;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            MLCommonServiceImpl mLCommonServiceImpl = this.f136817a;
            if (!mLCommonServiceImpl.f136801c) {
                mLCommonServiceImpl.f136801c = true;
                if (MLCommonService.debug) {
                    System.currentTimeMillis();
                }
                MLDataCenterService.C59999b.f136655a.checkAndInit();
                SmartPlaytimePredictService.C60077b.f136899a.checkAndInit();
                SmartCommonPreloadService.C60068b.f136879a.checkAndInit();
                SmartFeedPreloadService.C60007b.f136663a.checkAndInit();
                SmartFeedLoadMoreService.C60005b.f136661a.checkAndInit();
                SmartFeedAdUIService.C60003b.f136659a.checkAndInit();
                SmartDataTrackerService.C60001b.f136657a.checkAndInit();
                mLCommonServiceImpl.f136799a = C17873f.m33099g().mo143289d(mLCommonServiceImpl.f136802d);
                if (MLCommonService.debug) {
                    System.currentTimeMillis();
                }
            }
            ArrayList<AbstractC60013b> a = this.f136817a.mo97493a("play_prepare");
            if (a == null) {
                return null;
            }
            MLCommonServiceImpl.m109530a("play_prepare", new C60012a(this.f136818b, this.f136819c), a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ml.impl.MLCommonServiceImpl$a */
    static final class C60048a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ MLCommonServiceImpl f136806a;

        static {
            Covode.recordClassIndex(70514);
        }

        C60048a(MLCommonServiceImpl mLCommonServiceImpl) {
            this.f136806a = mLCommonServiceImpl;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f136806a.mo97494a("app_background", (Aweme) null, (String) null);
        }
    }

    /* renamed from: a */
    public final ArrayList<AbstractC60013b> mo97493a(String str) {
        MethodCollector.m26663i(11807);
        ArrayList<AbstractC60013b> arrayList = this.f136804f.get(str);
        if (arrayList != null) {
            C89219l.m154716b(arrayList, "");
            if (!arrayList.isEmpty()) {
                ArrayList<AbstractC60013b> arrayList2 = new ArrayList<>();
                synchronized (arrayList) {
                    try {
                        arrayList2.addAll(arrayList);
                    } finally {
                        MethodCollector.m26664o(11807);
                    }
                }
                return arrayList2;
            }
        }
        MethodCollector.m26664o(11807);
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.IMLCommonService
    public final void onPlayFinishFirst(Aweme aweme, String str) {
        if (MLCommonService.debug && aweme != null) {
            aweme.getAid();
            User author = aweme.getAuthor();
            if (author != null) {
                author.getNickname();
            }
        }
        mo97494a("play_finish_first", aweme, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.IMLCommonService
    public final void onPlayFirstFrame(Aweme aweme, String str) {
        if (MLCommonService.debug && aweme != null) {
            aweme.getAid();
            User author = aweme.getAuthor();
            if (author != null) {
                author.getNickname();
            }
        }
        mo97494a("play_first_frame", aweme, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.IMLCommonService
    public final void onPlayResume(Aweme aweme, String str) {
        if (MLCommonService.debug && aweme != null) {
            aweme.getAid();
            User author = aweme.getAuthor();
            if (author != null) {
                author.getNickname();
            }
        }
        mo97494a("play_resume", aweme, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.IMLCommonService
    public final void addCommonEventListener(String str, AbstractC60013b bVar) {
        MethodCollector.m26663i(11644);
        C89219l.m154721d(str, "");
        if (bVar == null) {
            MethodCollector.m26664o(11644);
            return;
        }
        if (this.f136804f.get(str) == null) {
            this.f136804f.put(str, new ArrayList<>());
        }
        ArrayList<AbstractC60013b> arrayList = this.f136804f.get(str);
        if (arrayList != null) {
            C89219l.m154716b(arrayList, "");
            synchronized (arrayList) {
                try {
                    if (!arrayList.contains(bVar)) {
                        arrayList.add(bVar);
                    }
                } finally {
                    MethodCollector.m26664o(11644);
                }
            }
            return;
        }
        MethodCollector.m26664o(11644);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo97494a(String str, Aweme aweme, String str2) {
        ArrayList<AbstractC60013b> a = mo97493a(str);
        if (a != null) {
            C1731i.m5640b(new CallableC60049b(a, this, aweme, str2, str), C1731i.f5562a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.IMLCommonService
    public final void onPlayPause(Aweme aweme, String str, boolean z) {
        if (MLCommonService.debug && aweme != null) {
            aweme.getAid();
            User author = aweme.getAuthor();
            if (author != null) {
                author.getNickname();
            }
        }
        ArrayList<AbstractC60013b> a = mo97493a("play_pause");
        if (a != null) {
            C1731i.m5640b(new CallableC60050c(a, this, aweme, str, z), C1731i.f5562a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.IMLCommonService
    public final void onPlayPrepare(Aweme aweme, String str, AbstractC59976b bVar) {
        this.f136805g++;
        if (!C89219l.m154714a(bVar, this.f136800b)) {
            this.f136800b = bVar;
        }
        if (MLCommonService.debug && aweme != null) {
            aweme.getAid();
            User author = aweme.getAuthor();
            if (author != null) {
                author.getNickname();
            }
        }
        if (!this.f136803e) {
            this.f136803e = true;
            C1731i.m5640b(new CallableC60051d(this, aweme, str), C1731i.f5562a);
            return;
        }
        mo97494a("play_prepare", aweme, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.IMLCommonService
    public final void onPlayStop(String str, Aweme aweme, String str2) {
        Aweme a;
        User author;
        if (MLCommonService.debug) {
            AbstractC59976b bVar = this.f136800b;
            if (!(bVar == null || (a = bVar.mo84947a(str)) == null || (author = a.getAuthor()) == null)) {
                author.getNickname();
            }
            if (aweme != null) {
                aweme.getAid();
                User author2 = aweme.getAuthor();
                if (author2 != null) {
                    author2.getNickname();
                }
            }
        }
        ArrayList<AbstractC60013b> a2 = mo97493a("play_stop");
        if (a2 != null) {
            C1731i.m5640b(new CallableC60052e(a2, this, str, str2, aweme), C1731i.f5562a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.IMLCommonService
    public final void onPlayStopCallPlayTime(Aweme aweme, long j, String str) {
        if (MLCommonService.debug && aweme != null) {
            aweme.getAid();
            User author = aweme.getAuthor();
            if (author != null) {
                author.getNickname();
            }
        }
        ArrayList<AbstractC60013b> a = mo97493a("play_call_playtime");
        if (a != null) {
            C1731i.m5640b(new CallableC60053f(a, this, aweme, str, j), C1731i.f5562a);
        }
    }

    /* renamed from: a */
    public static void m109530a(String str, C60012a aVar, ArrayList<AbstractC60013b> arrayList) {
        Aweme aweme;
        User author;
        if (MLCommonService.debug) {
            arrayList.size();
            if (!(aVar == null || (aweme = aVar.f136672d) == null || (author = aweme.getAuthor()) == null)) {
                author.getNickname();
            }
        }
        Iterator<AbstractC60013b> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().mo97476a(str, aVar);
        }
    }
}
