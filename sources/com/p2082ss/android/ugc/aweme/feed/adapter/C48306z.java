package com.p2082ss.android.ugc.aweme.feed.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p037h.C0792v;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1202k;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.adapter.C48254h;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.p2082ss.android.ugc.aweme.feed.p2936ab.C48024d;
import com.p2082ss.android.ugc.aweme.feed.p2936ab.C48026f;
import com.p2082ss.android.ugc.aweme.feed.p2944e.AbstractC49439l;
import com.p2082ss.android.ugc.aweme.feed.p2949i.AbstractC49691s;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.trill.R;
import java.util.LinkedList;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.z */
public class C48306z extends AbstractC48191b {

    /* renamed from: o */
    public int f111952o = -1;

    /* renamed from: p */
    public C48254h f111953p = new C48254h();

    /* renamed from: q */
    final AbstractC1202k f111954q;

    /* renamed from: v */
    private final int f111955v = 1;

    static {
        Covode.recordClassIndex(57048);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48191b
    /* renamed from: b */
    public String mo70375b() {
        return "full_feed";
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.z$b */
    static final class RunnableC48308b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C48306z f111957a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f111958b;

        static {
            Covode.recordClassIndex(57050);
        }

        RunnableC48308b(C48306z zVar, ViewGroup viewGroup) {
            this.f111957a = zVar;
            this.f111958b = viewGroup;
        }

        public final void run() {
            this.f111957a.mo80410a(this.f111958b);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48191b
    /* renamed from: a */
    public C48240cg mo70374a() {
        return new C48240cg(new C48307a(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.z$a */
    static final class C48307a extends AbstractC89220m implements AbstractC89172b<C48238ce, AbstractC48234cd> {

        /* renamed from: a */
        final /* synthetic */ C48306z f111956a;

        static {
            Covode.recordClassIndex(57049);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48307a(C48306z zVar) {
            super(1);
            this.f111956a = zVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC48234cd invoke(C48238ce ceVar) {
            C48238ce ceVar2 = ceVar;
            C89219l.m154721d(ceVar2, "");
            C89219l.m154721d(ceVar2, "");
            return new FullFeedVideoViewHolder(ceVar2);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48191b, androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(Object obj) {
        C89219l.m154721d(obj, "");
        AbstractC48149ai d = m91517d((View) obj);
        if (!(d == null || d.mo80206b() == null)) {
            Aweme b = d.mo80206b();
            C89219l.m154716b(b, "");
            if (b.isLiveNoDeduplicate() && C48026f.m91035a()) {
                int count = getCount();
                for (int i = 0; i < count; i++) {
                    String uniqueId = mo80288e().get(i).getUniqueId();
                    Aweme b2 = d.mo80206b();
                    C89219l.m154716b(b2, "");
                    if (C89219l.m154714a((Object) uniqueId, (Object) b2.getUniqueId())) {
                        return i;
                    }
                }
                return -2;
            }
        }
        return super.getItemPosition(obj);
    }

    /* renamed from: a */
    public final void mo80410a(ViewGroup viewGroup) {
        int i;
        int i2;
        Aweme d;
        int b;
        View poll;
        if (viewGroup != null && C0792v.m2791y(viewGroup) && this.f111631i != null && this.f111631i.getActivity() != null && (i = this.f111952o) >= 0 && i < getCount() - 1 && (d = mo80326d((i2 = this.f111952o + 1))) != null && !this.f111953p.f111785b.containsKey(d) && (b = mo80296b(i2)) == 0) {
            LinkedList<View> linkedList = this.f111953p.f111784a.get(b);
            if (linkedList == null || linkedList.size() <= 0) {
                this.f111953p.mo80377a(b, mo80320a(b, viewGroup));
            }
            LinkedList<View> linkedList2 = this.f111953p.f111784a.get(b);
            if (linkedList2 != null && linkedList2.size() > 0 && (poll = linkedList2.poll()) != null) {
                m91516a(poll);
                C48254h hVar = this.f111953p;
                String b2 = mo70375b();
                AbstractC48149ai aiVar = (AbstractC48149ai) poll.getTag(R.id.b0u);
                if (aiVar != null) {
                    aiVar.mo80123b(b2);
                    aiVar.mo80114a(d, i2);
                    if (hVar.f111785b.size() > 0) {
                        hVar.mo80376a();
                    }
                    hVar.f111785b.put(d, new C48254h.C48255a(poll, i2));
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005c, code lost:
        if (r4 == null) goto L_0x005e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005c  */
    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48191b, com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48160aq
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View mo80295a(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
        // Method dump skipped, instructions count: 129
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.adapter.C48306z.mo80295a(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48306z(Context context, LayoutInflater layoutInflater, AbstractC49691s<C49672ag> sVar, Fragment fragment, View.OnTouchListener onTouchListener, BaseFeedPageParams baseFeedPageParams, AbstractC49439l lVar) {
        super(context, layoutInflater, sVar, fragment, onTouchListener, baseFeedPageParams, lVar);
        C89219l.m154721d(context, "");
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(sVar, "");
        C89219l.m154721d(fragment, "");
        C89219l.m154721d(onTouchListener, "");
        C89219l.m154721d(baseFeedPageParams, "");
        C89219l.m154721d(lVar, "");
        FullFeedPagerAdapter$lifecycleObserver$1 fullFeedPagerAdapter$lifecycleObserver$1 = new FullFeedPagerAdapter$lifecycleObserver$1(this);
        this.f111954q = fullFeedPagerAdapter$lifecycleObserver$1;
        if (C48024d.f111249a) {
            fragment.getLifecycle().mo4012a(fullFeedPagerAdapter$lifecycleObserver$1);
        }
    }
}
