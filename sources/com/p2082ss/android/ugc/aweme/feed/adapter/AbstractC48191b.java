package com.p2082ss.android.ugc.aweme.feed.adapter;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p036g.C0691d;
import androidx.fragment.app.Fragment;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.View$OnTouchListenerC17271b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48234cd;
import com.p2082ss.android.ugc.aweme.feed.assem.C48704f;
import com.p2082ss.android.ugc.aweme.feed.helper.C49617c;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p2082ss.android.ugc.aweme.feed.p2944e.AbstractC49439l;
import com.p2082ss.android.ugc.aweme.feed.p2949i.AbstractC49691s;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.LongPressLayout;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50544l;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.live.ILiveOuterService;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.aweme.p2433ca.C35351h;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4602b.C89090a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.b */
public abstract class AbstractC48191b extends AbstractC48160aq implements AbstractC48146af {

    /* renamed from: m */
    public static int f111621m;

    /* renamed from: n */
    public static final C48193b f111622n = new C48193b((byte) 0);

    /* renamed from: a */
    public final C48256i f111623a = new C48256i();

    /* renamed from: b */
    public boolean f111624b;

    /* renamed from: c */
    public boolean f111625c = true;

    /* renamed from: d */
    public AbstractC89172b<? super String, ? extends View> f111626d;

    /* renamed from: e */
    public long f111627e;

    /* renamed from: f */
    public final Context f111628f;

    /* renamed from: g */
    public final LayoutInflater f111629g;

    /* renamed from: h */
    public final AbstractC49691s<C49672ag> f111630h;

    /* renamed from: i */
    public final Fragment f111631i;

    /* renamed from: j */
    public final View.OnTouchListener f111632j;

    /* renamed from: k */
    public final BaseFeedPageParams f111633k;

    /* renamed from: l */
    public final AbstractC49439l f111634l;

    /* renamed from: o */
    private final LongPressLayout.AbstractC50014a f111635o;

    /* renamed from: p */
    private final View$OnTouchListenerC17271b f111636p;

    /* renamed from: q */
    private final C49617c f111637q;

    /* renamed from: v */
    private final AbstractC89244h f111638v;

    /* renamed from: w */
    private final AbstractC89244h f111639w;

    /* renamed from: x */
    private final Map<Integer, C48286o> f111640x;

    /* renamed from: y */
    private int f111641y;

    static {
        Covode.recordClassIndex(56933);
    }

    /* renamed from: b */
    public abstract String mo70375b();

    /* renamed from: c */
    public final C48704f mo80325c() {
        return (C48704f) this.f111638v.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.b$b */
    public static final class C48193b {
        static {
            Covode.recordClassIndex(56935);
        }

        private C48193b() {
        }

        public /* synthetic */ C48193b(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public C48240cg mo70374a() {
        return C48248e.f111779a;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.b$c */
    public static final class RunnableC48194c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC48149ai f111642a;

        /* renamed from: b */
        final /* synthetic */ View f111643b;

        static {
            Covode.recordClassIndex(56936);
        }

        RunnableC48194c(AbstractC48149ai aiVar, View view) {
            this.f111642a = aiVar;
            this.f111643b = view;
        }

        public final void run() {
            this.f111642a.mo80113a(this.f111643b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.b$f */
    static final class C48197f extends AbstractC89220m implements AbstractC89171a<C48704f> {

        /* renamed from: a */
        final /* synthetic */ AbstractC48191b f111649a;

        static {
            Covode.recordClassIndex(56939);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48197f(AbstractC48191b bVar) {
            super(0);
            this.f111649a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C48704f invoke() {
            return new C48704f(this.f111649a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48146af
    /* renamed from: e */
    public List<Aweme> mo80288e() {
        return this.f111623a.f111788a;
    }

    @Override // androidx.viewpager.widget.PagerAdapter, com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48146af
    public int getCount() {
        return this.f111623a.f111788a.size();
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.b$d */
    static final class C48195d extends AbstractC89220m implements AbstractC89171a<ExecutorService> {

        /* renamed from: a */
        public static final C48195d f111644a = new C48195d();

        static {
            Covode.recordClassIndex(56937);
        }

        C48195d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ExecutorService invoke() {
            C40787l.C40788a a = C40787l.m82269a(EnumC40793o.SERIAL);
            a.f95504b = "feed-diff";
            return C40780g.m82242a(a.mo70028a());
        }
    }

    /* renamed from: d */
    public final List<Aweme> mo80327d() {
        return this.f111623a.f111788a;
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.b$e */
    static final class RunnableC48196e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC48191b f111645a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89238e f111646b;

        /* renamed from: c */
        final /* synthetic */ AbstractC48149ai f111647c;

        /* renamed from: d */
        final /* synthetic */ int f111648d;

        static {
            Covode.recordClassIndex(56938);
        }

        RunnableC48196e(AbstractC48191b bVar, C89233z.C89238e eVar, AbstractC48149ai aiVar, int i) {
            this.f111645a = bVar;
            this.f111646b = eVar;
            this.f111647c = aiVar;
            this.f111648d = i;
        }

        public final void run() {
            String str;
            AbstractC48191b.m91516a((View) this.f111646b.element);
            long currentTimeMillis = System.currentTimeMillis();
            this.f111647c.mo80123b(this.f111645a.mo70375b());
            this.f111647c.mo80114a(this.f111645a.mo80326d(this.f111648d), this.f111648d);
            long currentTimeMillis2 = System.currentTimeMillis();
            try {
                Aweme c = this.f111645a.mo80287c(this.f111648d);
                if (c != null) {
                    AbstractC48191b bVar = this.f111645a;
                    long j = currentTimeMillis2 - currentTimeMillis;
                    if (c.isAd()) {
                        str = "ad";
                    } else if (c.getAwemeType() == 101) {
                        str = "live";
                    } else {
                        str = "common";
                    }
                    C39162r.m79462a("mt_feed_total_bind_consumption", C89387v.m154943a(Long.valueOf(j), "duration"), C89387v.m154943a(str, "aweme_type"), C89387v.m154943a(bVar.mo70375b(), "feed_type"));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48160aq
    /* renamed from: a */
    public final int mo80294a(int i) {
        return mo80296b(i);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48146af
    /* renamed from: c */
    public final Aweme mo80287c(int i) {
        return this.f111623a.mo80378a(i);
    }

    /* renamed from: d */
    public Aweme mo80326d(int i) {
        return mo80287c(i);
    }

    /* renamed from: f */
    public final void mo80329f(int i) {
        mo80328e(i);
        notifyDataSetChanged();
    }

    /* renamed from: d */
    protected static AbstractC48149ai m91517d(View view) {
        Object obj;
        if (view != null) {
            obj = view.getTag(R.id.b0u);
        } else {
            obj = null;
        }
        return (AbstractC48149ai) obj;
    }

    /* renamed from: a */
    public static void m91516a(View view) {
        if (view != null) {
            int i = f111621m;
            f111621m = i + 1;
            view.setTag(R.id.b0v, Integer.valueOf(i));
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48160aq
    /* renamed from: c */
    public final void mo80298c(View view) {
        if (view != null && (view instanceof AbstractC48149ai)) {
            AbstractC48149ai d = m91517d(view);
            if (d == null) {
                C89219l.m154715b();
            }
            d.mo80230u();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48160aq
    /* renamed from: e */
    public final void mo80299e(View view) {
        Object obj;
        AbstractC48149ai aiVar = null;
        if (view != null) {
            obj = view.getTag(R.id.b0u);
        } else {
            obj = null;
        }
        if (obj instanceof AbstractC48149ai) {
            aiVar = obj;
        }
        AbstractC48149ai aiVar2 = aiVar;
        if (aiVar2 != null) {
            aiVar2.mo80080c();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48160aq
    /* renamed from: b */
    public final int mo80297b(View view) {
        Object obj;
        if (view != null) {
            obj = view.getTag(R.id.b0w);
        } else {
            obj = null;
        }
        if (obj instanceof Integer) {
            return ((Number) obj).intValue();
        }
        C51423a.m95786a((Exception) new RuntimeException("expect tag is type int,but no:".concat(String.valueOf(obj))));
        return 0;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(Object obj) {
        C89219l.m154721d(obj, "");
        AbstractC48149ai d = m91517d((View) obj);
        int count = getCount();
        for (int i = 0; i < count; i++) {
            Aweme aweme = mo80288e().get(i);
            if (!(d == null || d.mo80206b() == null)) {
                String aid = aweme.getAid();
                Aweme b = d.mo80206b();
                C89219l.m154716b(b, "");
                if (C13627m.m24499a(aid, b.getAid())) {
                    return i;
                }
            }
        }
        return -2;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48160aq
    /* renamed from: b */
    public int mo80296b(int i) {
        Aweme c = mo80287c(i);
        if (c == null) {
            return 0;
        }
        for (Map.Entry<Integer, C48286o> entry : this.f111640x.entrySet()) {
            int intValue = entry.getKey().intValue();
            AbstractC89172b<C48186ax, Boolean> bVar = entry.getValue().f111905c;
            Context context = this.f111628f;
            List<Aweme> e = mo80288e();
            String str = this.f111633k.eventType;
            C89219l.m154716b(str, "");
            if (bVar.invoke(new C48186ax(c, i, context, e, str, this.f111633k.awemeFromPage, this.f111633k.isMyProfile, this.f111633k.pageType, this.f111633k.isFromPostList)).booleanValue()) {
                return intValue;
            }
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo80328e(int i) {
        if (i >= 0 && i < getCount()) {
            Aweme remove = mo80327d().remove(i);
            C48704f c = mo80325c();
            C89219l.m154721d(remove, "");
            Iterator<Map.Entry<String, C48155ao<VideoBaseCell, VideoItemParams>>> it = c.f112565a.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, C48155ao<VideoBaseCell, VideoItemParams>> next = it.next();
                C89219l.m154716b(next, "");
                if (C89219l.m154714a((Object) next.getKey(), (Object) C50544l.m94759a(remove))) {
                    it.remove();
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48146af
    /* renamed from: a */
    public void mo80286a(List<? extends Aweme> list) {
        String str;
        this.f111623a.mo80379a(list);
        C48704f c = mo80325c();
        ConcurrentHashMap<String, C48155ao<VideoBaseCell, VideoItemParams>> concurrentHashMap = new ConcurrentHashMap<>();
        if (list != null) {
            for (T t : list) {
                if (t != null) {
                    str = C50544l.m94759a(t);
                } else {
                    str = null;
                }
                if (!TextUtils.isEmpty(str) && c.f112565a.get(str) != null) {
                    if (str == null) {
                        C89219l.m154715b();
                    }
                    concurrentHashMap.put(str, c.f112565a.get(str));
                }
            }
        }
        c.f112565a = concurrentHashMap;
        notifyDataSetChanged();
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0163  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo80330g(int r18) {
        /*
        // Method dump skipped, instructions count: 357
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48191b.mo80330g(int):void");
    }

    /* renamed from: a */
    public final boolean mo80324a(String str) {
        C89219l.m154721d(str, "");
        List<Aweme> d = mo80327d();
        boolean z = false;
        for (int size = d.size() - 1; size >= 0; size--) {
            if (TextUtils.equals(str, d.get(size).getAuthorUid())) {
                mo80328e(size);
                z = true;
            }
        }
        if (z) {
            notifyDataSetChanged();
        }
        return z;
    }

    /* renamed from: a */
    public final void mo80322a(List<? extends Aweme> list, int i) {
        mo80323a(list, i, 1);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.b$a */
    public static final class C48192a<T> implements Comparator {
        static {
            Covode.recordClassIndex(56934);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C89090a.m154604a(Integer.valueOf(t.f111904b), Integer.valueOf(t2.f111904b));
        }
    }

    /* renamed from: a */
    public final void mo80321a(Aweme aweme, int i) {
        if (aweme == null || i < 0 || i > getCount()) {
            throw new IllegalArgumentException("position out of range");
        }
        mo80327d().add(i, aweme);
        notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo80320a(int i, ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        C48286o oVar = this.f111640x.get(Integer.valueOf(i));
        if (oVar == null) {
            oVar = mo70374a();
        }
        AbstractC89172b<C48154an, View> bVar = oVar.f111906d;
        Context context = this.f111628f;
        LayoutInflater layoutInflater = this.f111629g;
        String str = this.f111633k.eventType;
        C89219l.m154716b(str, "");
        View invoke = bVar.invoke(new C48154an(viewGroup, context, layoutInflater, str));
        invoke.setTag(R.id.b0w, Integer.valueOf(i));
        AbstractC89172b<C48238ce, AbstractC48149ai> bVar2 = oVar.f111907e;
        C89219l.m154721d(invoke, "");
        AbstractC49691s<C49672ag> sVar = this.f111630h;
        Fragment fragment = this.f111631i;
        View.OnTouchListener onTouchListener = this.f111632j;
        BaseFeedPageParams baseFeedPageParams = this.f111633k;
        AbstractC49439l lVar = this.f111634l;
        C49617c cVar = this.f111637q;
        View$OnTouchListenerC17271b bVar3 = this.f111636p;
        LongPressLayout.AbstractC50014a aVar = this.f111635o;
        String str2 = baseFeedPageParams.eventType;
        C89219l.m154716b(str2, "");
        AbstractC48149ai invoke2 = bVar2.invoke(new C48238ce(invoke, sVar, fragment, onTouchListener, baseFeedPageParams, lVar, cVar, bVar3, aVar, str2, this.f111627e, this.f111633k.challengeId, i, mo80325c(), this.f111626d));
        invoke.setTag(R.id.b0u, invoke2);
        invoke.setTag(R.id.b0u, invoke2);
        C35351h.m72351a(new RunnableC48194c(invoke2, invoke));
        return invoke;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: android.view.View */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48160aq
    /* renamed from: a */
    public View mo80295a(int i, View view, ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        C89233z.C89238e eVar = new C89233z.C89238e();
        eVar.element = view;
        int b = mo80296b(i);
        T t = eVar.element;
        if (t == null || !C0691d.m2448a(t.getTag(R.id.b0w), Integer.valueOf(b))) {
            eVar.element = (T) mo80320a(b, viewGroup);
        }
        AbstractC48149ai d = m91517d(eVar.element);
        if (d == null) {
            C89219l.m154715b();
        }
        if (C35351h.m72352a()) {
            d.mo80125d(mo80287c(i));
        }
        C35351h.m72351a(new RunnableC48196e(this, eVar, d, i));
        T t2 = eVar.element;
        if (t2 == null) {
            C89219l.m154715b();
        }
        return t2;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo80323a(java.util.List<? extends com.p2082ss.android.ugc.aweme.feed.model.Aweme> r7, int r8, int r9) {
        /*
            r6 = this;
            if (r7 != 0) goto L_0x0003
            return
        L_0x0003:
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x0017
            if (r8 < 0) goto L_0x0017
            int r0 = r7.size()
            if (r8 >= r0) goto L_0x0017
            int r0 = r6.getCount()
            if (r8 <= r0) goto L_0x0018
        L_0x0017:
            return
        L_0x0018:
            java.util.List r2 = r6.mo80327d()
            r1 = 0
        L_0x001d:
            if (r1 >= r9) goto L_0x002e
            int r0 = r8 + r1
            java.lang.Object r0 = r7.get(r0)
            if (r0 != 0) goto L_0x002a
        L_0x0027:
            int r1 = r1 + 1
            goto L_0x001d
        L_0x002a:
            r2.add(r8, r0)
            goto L_0x0027
        L_0x002e:
            com.ss.android.ugc.aweme.feed.adapter.i r5 = r6.f111623a
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x003e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0059
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.p2082ss.android.ugc.aweme.feed.model.Aweme) r0
            java.lang.String r0 = r0.getAid()
            boolean r0 = r4.add(r0)
            if (r0 == 0) goto L_0x003e
            r3.add(r1)
            goto L_0x003e
        L_0x0059:
            r5.mo80379a(r3)
            r6.notifyDataSetChanged()
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48191b.mo80323a(java.util.List, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.ss.android.ugc.aweme.feed.adapter.o[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractC48191b(Context context, LayoutInflater layoutInflater, AbstractC49691s<C49672ag> sVar, Fragment fragment, View.OnTouchListener onTouchListener, BaseFeedPageParams baseFeedPageParams, AbstractC49439l lVar) {
        super(context, layoutInflater);
        LongPressLayout.AbstractC50014a bVar;
        C89219l.m154721d(context, "");
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(sVar, "");
        C89219l.m154721d(fragment, "");
        C89219l.m154721d(onTouchListener, "");
        C89219l.m154721d(baseFeedPageParams, "");
        C89219l.m154721d(lVar, "");
        this.f111628f = context;
        this.f111629g = layoutInflater;
        this.f111630h = sVar;
        this.f111631i = fragment;
        this.f111632j = onTouchListener;
        this.f111633k = baseFeedPageParams;
        this.f111634l = lVar;
        Context context2 = this.f111553t;
        C89219l.m154716b(context2, "");
        C89219l.m154721d(context2, "");
        if (baseFeedPageParams == null) {
            bVar = AbstractC48234cd.C48235a.C48236a.f111741a;
        } else {
            bVar = new AbstractC48234cd.C48235a.C48237b(baseFeedPageParams, context2);
        }
        this.f111635o = bVar;
        this.f111636p = new View$OnTouchListenerC17271b();
        C49617c cVar = new C49617c();
        int i = Build.VERSION.SDK_INT;
        C49617c.m93044a(this.f111553t);
        this.f111637q = cVar;
        this.f111638v = C89250i.m154773a((AbstractC89171a) new C48197f(this));
        this.f111639w = C89250i.m154773a((AbstractC89171a) C48195d.f111644a);
        ILiveOuterService s = LiveOuterService.m107269s();
        C89219l.m154716b(s, "");
        Object a = s.mo95844r().mo96082a();
        Objects.requireNonNull(a, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.adapter.FeedTypeConfig");
        List<C48286o> g = C89070n.m154585g((Collection) C89070n.m154553a((Iterable) C89070n.m154524c(a, C48157ap.f111548a, C48161ar.f111555a, C48187ay.f111615a, C48166au.f111560a, C48250f.f111781a), (Comparator) new C48192a()));
        g.add(mo70374a());
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) g, 10));
        for (C48286o oVar : g) {
            arrayList.add(C89387v.m154943a(Integer.valueOf(oVar.f111904b), oVar));
        }
        this.f111640x = C89041ag.m154417a(arrayList);
        this.f111641y = -1;
    }
}
