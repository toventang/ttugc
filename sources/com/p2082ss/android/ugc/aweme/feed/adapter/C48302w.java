package com.p2082ss.android.ugc.aweme.feed.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.p2082ss.android.ugc.aweme.feed.p2944e.AbstractC49439l;
import com.p2082ss.android.ugc.aweme.feed.p2949i.AbstractC49691s;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.w */
public final class C48302w extends AbstractC48191b {

    /* renamed from: o */
    private final ArrayList<Aweme> f111945o = new ArrayList<>();

    static {
        Covode.recordClassIndex(57044);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48191b
    /* renamed from: b */
    public final String mo70375b() {
        return "forward_feed";
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48191b, com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48146af
    /* renamed from: e */
    public final List<Aweme> mo80288e() {
        return this.f111945o;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48191b
    /* renamed from: a */
    public final C48240cg mo70374a() {
        return new C48240cg(C48303a.f111946a);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.w$a */
    static final class C48303a extends AbstractC89220m implements AbstractC89172b<C48238ce, AbstractC48234cd> {

        /* renamed from: a */
        public static final C48303a f111946a = new C48303a();

        static {
            Covode.recordClassIndex(57045);
        }

        C48303a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC48234cd invoke(C48238ce ceVar) {
            C48238ce ceVar2 = ceVar;
            C89219l.m154721d(ceVar2, "");
            return new ForwardFeedVideoViewHolder(ceVar2);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48191b
    /* renamed from: d */
    public final Aweme mo80326d(int i) {
        if (i < 0 || i >= getCount()) {
            return null;
        }
        return this.f111945o.get(i);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48191b
    /* renamed from: e */
    public final void mo80328e(int i) {
        if (i >= 0 && i < getCount()) {
            this.f111945o.remove(i);
            super.mo80328e(i);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48191b, com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48160aq
    /* renamed from: b */
    public final int mo80296b(int i) {
        Aweme c = mo80287c(i);
        if (c == null || !c.isForwardAweme() || c.getForwardItem() == null) {
            return super.mo80296b(i);
        }
        Aweme forwardItem = c.getForwardItem();
        C89219l.m154716b(forwardItem, "");
        if (forwardItem.getAwemeType() == 2) {
            return 1;
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48191b, androidx.viewpager.widget.PagerAdapter
    public final int getItemPosition(Object obj) {
        C89219l.m154721d(obj, "");
        AbstractC48149ai d = m91517d((View) obj);
        int count = getCount();
        for (int i = 0; i < count; i++) {
            Aweme d2 = mo80326d(i);
            if (!(d == null || d2 == null)) {
                String aid = d2.getAid();
                Aweme O = d.mo80089O();
                C89219l.m154716b(O, "");
                if (C13627m.m24499a(aid, O.getAid())) {
                    return i;
                }
            }
        }
        return -2;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48191b, com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48146af
    /* renamed from: a */
    public final void mo80286a(List<? extends Aweme> list) {
        this.f111945o.clear();
        ArrayList arrayList = null;
        C48257j.m91661a(this.f111945o, list != null ? C89070n.m154580f((Iterable) list) : null);
        if (list != null) {
            arrayList = new ArrayList();
            for (Aweme aweme : list) {
                if (aweme != null) {
                    if (aweme.isForwardAweme()) {
                        arrayList.add(aweme.getForwardItem());
                    } else {
                        arrayList.add(aweme);
                    }
                }
            }
        }
        super.mo80286a(arrayList);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48302w(Context context, LayoutInflater layoutInflater, AbstractC49691s<C49672ag> sVar, Fragment fragment, View.OnTouchListener onTouchListener, BaseFeedPageParams baseFeedPageParams, AbstractC49439l lVar) {
        super(context, layoutInflater, sVar, fragment, onTouchListener, baseFeedPageParams, lVar);
        C89219l.m154721d(context, "");
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(sVar, "");
        C89219l.m154721d(fragment, "");
        C89219l.m154721d(onTouchListener, "");
        C89219l.m154721d(baseFeedPageParams, "");
        C89219l.m154721d(lVar, "");
    }
}
