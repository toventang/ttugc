package com.bytedance.android.livesdk.feed.repository;

import android.text.TextUtils;
import android.util.Pair;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.p053i.AbstractC1036i;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.p181c.C2965a;
import com.bytedance.android.live.core.feed.FeedApi;
import com.bytedance.android.live.core.p210a.AbstractC3827a;
import com.bytedance.android.live.core.p210a.AbstractC3838b;
import com.bytedance.android.live.core.p210a.AbstractC3851n;
import com.bytedance.android.live.core.p215e.C3884b;
import com.bytedance.android.live.core.paging.AbstractC3985b;
import com.bytedance.android.live.core.paging.p225b.C3988c;
import com.bytedance.android.live.core.paging.p226c.AbstractC3992b;
import com.bytedance.android.live.network.response.C5827a;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.feed.AbstractC8470a;
import com.bytedance.android.livesdk.feed.AbstractC8593h;
import com.bytedance.android.livesdk.feed.AbstractC8639l;
import com.bytedance.android.livesdk.feed.feed.C8582a;
import com.bytedance.android.livesdk.feed.feed.C8583b;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdk.feed.p527d.AbstractC8526a;
import com.bytedance.android.livesdk.feed.p531g.AbstractC8592a;
import com.bytedance.android.livesdk.livesetting.feed.RefreshShowSandBoxRoomSetting;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.util.rxutils.C11195i;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.p145b.p146a.C2695a;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4591l.C88960c;

public class FeedRepository extends BaseFeedRepository implements AbstractC8470a, AbstractC8639l, AbstractC33974au {

    /* renamed from: e */
    protected final FeedApi f21374e;

    /* renamed from: f */
    protected final AbstractC3827a<FeedDataKey, C2965a> f21375f;

    /* renamed from: g */
    protected AbstractC8639l.AbstractC8640a f21376g;

    /* renamed from: h */
    protected C8582a<AbstractC3985b<FeedItem>, C8583b> f21377h;

    /* renamed from: i */
    protected C88960c<Object> f21378i = new C88960c<>();

    /* renamed from: j */
    protected C88960c<String> f21379j = new C88960c<>();

    /* renamed from: k */
    protected C88960c<List<ImageModel>> f21380k = new C88960c<>();

    /* renamed from: l */
    protected C88960c<Pair<String, String>> f21381l = new C88960c<>();

    /* renamed from: m */
    protected C88960c<String> f21382m;

    /* renamed from: n */
    protected final AbstractC8592a f21383n;

    /* renamed from: o */
    protected AbstractC3985b<FeedItem> f21384o;

    /* renamed from: p */
    protected int f21385p;

    /* renamed from: q */
    protected final AbstractC3827a<Long, Integer> f21386q;

    /* renamed from: r */
    public AbstractC8593h f21387r;

    /* renamed from: s */
    public C8658a f21388s;

    /* renamed from: t */
    String f21389t;

    /* renamed from: u */
    private AbstractC8526a f21390u;

    /* renamed from: v */
    private String f21391v;

    static {
        Covode.recordClassIndex(9523);
    }

    @Override // com.bytedance.android.livesdk.feed.repository.BaseFeedRepository, androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.android.livesdk.feed.AbstractC8639l
    /* renamed from: a */
    public final AbstractC88979t<String> mo14935a() {
        return this.f21379j;
    }

    @Override // com.bytedance.android.livesdk.feed.AbstractC8639l
    /* renamed from: b */
    public final AbstractC88979t<List<ImageModel>> mo14939b() {
        return this.f21380k;
    }

    @Override // com.bytedance.android.livesdk.feed.AbstractC8639l
    /* renamed from: d */
    public final AbstractC8593h mo14942d() {
        return this.f21387r;
    }

    @Override // com.bytedance.android.livesdk.feed.AbstractC8656r
    /* renamed from: e */
    public final List<FeedItem> mo14956e() {
        return this.f21367b.mo9205b(mo14961h());
    }

    /* renamed from: i */
    private int m16934i() {
        AbstractC8639l.AbstractC8640a aVar = this.f21376g;
        if (aVar == null || aVar.mo14944b() <= 0) {
            return 12;
        }
        return this.f21376g.mo14944b();
    }

    @Override // com.bytedance.android.livesdk.feed.AbstractC8639l
    /* renamed from: c */
    public final void mo14941c() {
        if (this.f21366a != null) {
            mo14961h();
            TextUtils.equals(this.f21389t, "enter_auto");
            mo14961h();
        }
    }

    @Override // com.bytedance.android.livesdk.feed.AbstractC8656r
    /* renamed from: f */
    public final void mo14957f() {
        this.f21367b.mo9207d(mo14961h());
        C8658a aVar = this.f21388s;
        if (aVar != null) {
            aVar.f21402k.mo142944a();
        }
    }

    @Override // com.bytedance.android.livesdk.feed.AbstractC8656r
    /* renamed from: g */
    public final void mo14958g() {
        this.f21367b.mo9207d(mo14961h());
        if (this.f21384o != null) {
            C2695a.f8059g.mo7221d();
            this.f21384o.mo9323f();
        }
    }

    @Override // com.bytedance.android.livesdk.feed.repository.BaseFeedRepository
    /* renamed from: h */
    public final FeedDataKey mo14961h() {
        AbstractC8639l.AbstractC8640a aVar = this.f21376g;
        if (aVar != null) {
            return aVar.mo14943a();
        }
        throw new IllegalStateException("not call init() or params be null");
    }

    /* renamed from: com.bytedance.android.livesdk.feed.repository.FeedRepository$a */
    public static class C8658a implements AbstractC3992b<FeedItem> {

        /* renamed from: a */
        int f21392a;

        /* renamed from: b */
        public String f21393b;

        /* renamed from: c */
        String f21394c = "enter_auto";

        /* renamed from: d */
        String f21395d = "feed_loadmore";

        /* renamed from: e */
        AbstractC8593h f21396e;

        /* renamed from: f */
        C88960c<String> f21397f;

        /* renamed from: g */
        C88960c<String> f21398g;

        /* renamed from: h */
        long f21399h;

        /* renamed from: i */
        AbstractC8470a f21400i;

        /* renamed from: j */
        C88960c<List<ImageModel>> f21401j;

        /* renamed from: k */
        final C88411a f21402k = new C88411a();

        /* renamed from: l */
        private FeedApi f21403l;

        /* renamed from: m */
        private AbstractC8592a f21404m;

        /* renamed from: n */
        private AbstractC8659a f21405n;

        /* renamed from: o */
        private AbstractC8526a f21406o;

        /* renamed from: p */
        private FeedDataKey f21407p;

        /* renamed from: com.bytedance.android.livesdk.feed.repository.FeedRepository$a$a */
        interface AbstractC8659a {
            static {
                Covode.recordClassIndex(9525);
            }
        }

        static {
            Covode.recordClassIndex(9524);
        }

        /* renamed from: a */
        private void m16950a(AbstractC88412b bVar) {
            this.f21402k.mo142945a(bVar);
        }

        @Override // com.bytedance.android.live.core.paging.p226c.AbstractC3992b
        /* renamed from: a */
        public final AbstractC88979t<Pair<List<FeedItem>, C2965a>> mo9363a(boolean z, Long l) {
            AbstractC88979t<C5827a<FeedItem, C2965a>> feed;
            m16950a(AbstractC88979t.m154310b((Object) 1).mo143295e(3000, TimeUnit.MILLISECONDS).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C8670k(this), C8671l.f21419a));
            if (z) {
                this.f21400i.mo14802a(AbstractC8470a.EnumC8471a.REFRESH, this.f21394c);
                if (this.f21399h > 0) {
                    feed = this.f21403l.feed(this.f21393b, 0, "push");
                } else {
                    if (RefreshShowSandBoxRoomSetting.INSTANCE.getValue() && ((IHostContext) C6193a.m13435a(IHostContext.class)).getChannel().equals("local_test")) {
                        this.f21394c = "feed_refresh_local_test";
                    }
                    feed = this.f21403l.feed(this.f21393b, 0, this.f21394c);
                }
                this.f21397f.onNext(this.f21394c);
            } else {
                this.f21400i.mo14802a(AbstractC8470a.EnumC8471a.LOAD_MORE, this.f21395d);
                feed = this.f21403l.feed(this.f21393b, l.longValue(), this.f21395d);
                this.f21397f.onNext(this.f21395d);
                this.f21398g.onNext(this.f21395d);
            }
            return feed.mo143292d(new C8672m(this, z)).mo143280b(new C8673n(this)).mo143280b(new C8674o(this)).mo143280b(C8675p.f21424a).mo143280b(new C8676q(this)).mo143264a(new C8677r(this, z));
        }

        C8658a(String str, FeedApi feedApi, AbstractC8592a aVar, AbstractC8593h hVar, C88960c<Pair<String, String>> cVar, AbstractC8470a aVar2, C88960c<String> cVar2, C88960c<String> cVar3, String str2, AbstractC8659a aVar3, AbstractC8526a aVar4, FeedDataKey feedDataKey, C88960c<List<ImageModel>> cVar4) {
            this.f21393b = str;
            this.f21403l = feedApi;
            this.f21405n = aVar3;
            this.f21396e = hVar;
            this.f21404m = aVar;
            this.f21406o = aVar4;
            this.f21407p = feedDataKey;
            this.f21397f = cVar2;
            this.f21400i = aVar2;
            this.f21398g = cVar3;
            this.f21394c = str2;
            m16950a(cVar.mo143254a(new C8667h(this), C8668i.f21416a));
            this.f21401j = cVar4;
        }
    }

    @Override // com.bytedance.android.livesdk.feed.AbstractC8639l
    /* renamed from: a */
    public final void mo14937a(AbstractC8639l.AbstractC8640a aVar) {
        this.f21376g = aVar;
    }

    @Override // com.bytedance.android.livesdk.feed.AbstractC8639l
    /* renamed from: b */
    public final void mo14940b(String str) {
        this.f21391v = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo14964a(C3884b bVar) {
        C88960c<Object> cVar;
        if (bVar != null && bVar.f10741a == C3884b.EnumC3885a.SUCCESS && (cVar = this.f21378i) != null) {
            cVar.onNext(C11195i.f26825c);
        }
    }

    @Override // com.bytedance.android.livesdk.feed.AbstractC8656r
    /* renamed from: d */
    public final FeedItem mo14955d(String str) {
        return (FeedItem) this.f21367b.mo9201a((Object) mo14961h(), (AbstractC3851n) new C8666g(str));
    }

    @Override // com.bytedance.android.livesdk.feed.AbstractC8656r
    /* renamed from: c */
    public final void mo14954c(String str) {
        FeedItem d = mo14955d(str);
        if (d != null) {
            this.f21367b.mo9204a(mo14961h(), d);
        }
        AbstractC3985b<FeedItem> bVar = this.f21384o;
        if (bVar != null) {
            bVar.mo9325h();
        }
    }

    @Override // com.bytedance.android.livesdk.feed.AbstractC8639l
    /* renamed from: a */
    public final C8582a<AbstractC3985b<FeedItem>, C8583b> mo14934a(String str) {
        String str2;
        int i;
        mo14960a(this.f21375f.mo9172a(this.f21376g.mo14943a()).mo143289d(C8663d.f21411a));
        FeedApi feedApi = this.f21374e;
        AbstractC8592a aVar = this.f21383n;
        AbstractC8593h hVar = this.f21387r;
        C88960c<Pair<String, String>> cVar = this.f21381l;
        C88960c<String> cVar2 = this.f21382m;
        C88960c<String> cVar3 = this.f21379j;
        if (!C13627m.m24498a(this.f21391v)) {
            str2 = this.f21391v;
        } else {
            str2 = "enter_auto";
        }
        this.f21388s = new C8658a(str, feedApi, aVar, hVar, cVar, this, cVar2, cVar3, str2, new C8664e(this), this.f21390u, this.f21376g.mo14943a(), this.f21380k);
        C3988c cVar4 = new C3988c();
        cVar4.f10929o = this.f21388s;
        cVar4.f10925k = (CacheKey) this.f21376g.mo14943a();
        cVar4.f10926l = this.f21367b;
        cVar4.f10927m = (AbstractC3827a<CacheKey, C2965a>) this.f21375f;
        AbstractC1036i.C1042d.C1043a aVar2 = new AbstractC1036i.C1042d.C1043a();
        aVar2.f3666d = false;
        aVar2.f3663a = m16934i();
        aVar2.f3665c = m16934i();
        AbstractC8639l.AbstractC8640a aVar3 = this.f21376g;
        if (aVar3 == null || aVar3.mo14945c() <= 0) {
            i = 4;
        } else {
            i = this.f21376g.mo14945c();
        }
        aVar2.f3664b = i;
        cVar4.f10928n = aVar2.mo3756a();
        C3988c.C39891 r4 = 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0090: CONSTRUCTOR  (r4v1 'r4' com.bytedance.android.live.core.paging.b.c$1) = (r5v1 'cVar4' com.bytedance.android.live.core.paging.b.c) call: com.bytedance.android.live.core.paging.b.c.1.<init>(com.bytedance.android.live.core.paging.b.c):void type: CONSTRUCTOR in method: com.bytedance.android.livesdk.feed.repository.FeedRepository.a(java.lang.String):com.bytedance.android.livesdk.feed.feed.a<com.bytedance.android.live.core.paging.b<com.bytedance.android.livesdk.model.FeedItem>, com.bytedance.android.livesdk.feed.feed.b>, file: classes6.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.android.live.core.paging.b.c, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 14 more
            */
        /*
        // Method dump skipped, instructions count: 209
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.feed.repository.FeedRepository.mo14934a(java.lang.String):com.bytedance.android.livesdk.feed.feed.a");
    }

    @Override // com.bytedance.android.livesdk.feed.AbstractC8639l
    /* renamed from: a */
    public final void mo14938a(String str, String str2) {
        this.f21381l.onNext(new Pair<>(str, str2));
    }

    public FeedRepository(AbstractC8593h hVar, FeedApi feedApi, AbstractC3827a<FeedDataKey, C2965a> aVar, AbstractC3838b<FeedDataKey, FeedItem> bVar, AbstractC3827a<Long, Integer> aVar2, AbstractC8592a aVar3, AbstractC8526a aVar4) {
        super(hVar, bVar);
        C88960c<String> cVar = new C88960c<>();
        this.f21382m = cVar;
        this.f21385p = -1;
        this.f21391v = null;
        this.f21387r = hVar;
        this.f21374e = feedApi;
        this.f21375f = aVar;
        this.f21386q = aVar2;
        this.f21383n = aVar3;
        this.f21390u = aVar4;
        mo14960a(cVar.mo143254a(new C8660a(this), C8661b.f21409a));
        mo14960a(bVar.mo9200a().mo143289d(C8662c.f21410a));
    }
}
