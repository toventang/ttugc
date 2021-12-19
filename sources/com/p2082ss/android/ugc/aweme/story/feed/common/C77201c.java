package com.p2082ss.android.ugc.aweme.story.feed.common;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48191b;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48234cd;
import com.p2082ss.android.ugc.aweme.feed.adapter.C48238ce;
import com.p2082ss.android.ugc.aweme.feed.adapter.C48240cg;
import com.p2082ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.p2082ss.android.ugc.aweme.feed.p2944e.AbstractC49439l;
import com.p2082ss.android.ugc.aweme.feed.p2949i.AbstractC49691s;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.feed.common.c */
public final class C77201c extends AbstractC48191b {
    static {
        Covode.recordClassIndex(90213);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48191b
    /* renamed from: b */
    public final String mo70375b() {
        return "story_feed";
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48191b
    /* renamed from: a */
    public final C48240cg mo70374a() {
        return new C48240cg(C77202a.f173197a);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.feed.common.c$a */
    static final class C77202a extends AbstractC89220m implements AbstractC89172b<C48238ce, AbstractC48234cd> {

        /* renamed from: a */
        public static final C77202a f173197a = new C77202a();

        static {
            Covode.recordClassIndex(90214);
        }

        C77202a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC48234cd invoke(C48238ce ceVar) {
            C48238ce ceVar2 = ceVar;
            C89219l.m154721d(ceVar2, "");
            return new StoryVideoViewHolder(ceVar2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C77201c(Context context, LayoutInflater layoutInflater, AbstractC49691s<C49672ag> sVar, Fragment fragment, View.OnTouchListener onTouchListener, BaseFeedPageParams baseFeedPageParams, AbstractC49439l lVar) {
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
