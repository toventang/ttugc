package com.p2082ss.android.ugc.aweme.emoji.sysemoji;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1204m;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.emoji.emojiPageV2.AbstractC46467a;
import com.p2082ss.android.ugc.aweme.emoji.emojiPageV2.C46471b;
import com.p2082ss.android.ugc.aweme.emoji.emojiPageV2.SwipeControlledRecycleView;
import com.p2082ss.android.ugc.aweme.emoji.p2897b.C46447a;
import com.p2082ss.android.ugc.aweme.emoji.p2904g.C46534a;
import com.p2082ss.android.ugc.aweme.emoji.sysemoji.C46588c;
import com.p2082ss.android.ugc.aweme.emoji.sysemoji.C46595g;
import com.p2082ss.android.ugc.aweme.emoji.sysemoji.C46597h;
import com.p2082ss.android.ugc.aweme.emoji.utils.C46642d;
import com.p2082ss.android.ugc.aweme.emoji.views.SwipeControlledViewPager;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Objects;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89624i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.emoji.sysemoji.p */
public final class C46613p extends AbstractC46467a<C46447a> implements C46588c.AbstractC46590b {

    /* renamed from: g */
    public final AbstractC1204m f108687g;

    /* renamed from: h */
    public final SwipeControlledRecycleView f108688h;

    /* renamed from: i */
    public final SwipeControlledViewPager f108689i;

    /* renamed from: j */
    private final float f108690j = 14.0f;

    /* renamed from: k */
    private final float f108691k = 24.0f;

    /* renamed from: w */
    private final float f108692w = 29.0f;

    /* renamed from: x */
    private final int f108693x = ((int) C13628n.m24520b(((AbstractC46467a) this).f108251d, 14.0f));

    /* renamed from: y */
    private final int f108694y = ((int) C13628n.m24520b(((AbstractC46467a) this).f108251d, 24.0f));

    /* renamed from: z */
    private final int f108695z = ((int) C13628n.m24520b(((AbstractC46467a) this).f108251d, 29.0f));

    static {
        Covode.recordClassIndex(55203);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final long getItemId(int i) {
        return (long) i;
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.emojiPageV2.AbstractC46467a
    /* renamed from: m */
    public final int mo78993m() {
        return R.layout.yo;
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.emojiPageV2.AbstractC46467a
    /* renamed from: a */
    public final void mo78990a(RecyclerView recyclerView) {
        C89219l.m154721d(recyclerView, "");
        Context context = recyclerView.getContext();
        while (!(context instanceof Activity)) {
            if (context instanceof ContextWrapper) {
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                return;
            }
        }
        Activity activity = (Activity) context;
        if (activity != null) {
            ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            int i = this.f108693x;
            ((RelativeLayout.LayoutParams) layoutParams).setMargins(i, 0, i, 0);
            recyclerView.setLayoutManager(new WrapGridLayoutManager(((AbstractC46467a) this).f108248a));
            C46588c cVar = new C46588c(activity, this.f108688h);
            C89219l.m154721d(this, "");
            cVar.f108620a = this;
            recyclerView.mo4415b(new C46471b(((AbstractC46467a) this).f108248a, mo78989a(this.f108695z, this.f108693x, ((AbstractC46467a) this).f108248a), this.f108694y));
            recyclerView.setAdapter(this);
            SwipeControlledViewPager swipeControlledViewPager = this.f108689i;
            List e = mo63369e();
            C89219l.m154716b(e, "");
            recyclerView.mo4404a(new C46591d(cVar, swipeControlledViewPager, e, this.f108695z));
            recyclerView.setItemViewCacheSize(14);
            recyclerView.setHasFixedSize(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.sysemoji.p$a */
    public final class C46614a extends AbstractC46467a<C46447a>.C46469b {

        /* renamed from: d */
        public final TextView f108696d;

        /* renamed from: e */
        final /* synthetic */ C46613p f108697e;

        static {
            Covode.recordClassIndex(55204);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C46614a(C46613p pVar, View view) {
            super(pVar, view);
            C89219l.m154721d(view, "");
            this.f108697e = pVar;
            this.f108696d = (TextView) view.findViewById(R.id.auk);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l, com.p2082ss.android.ugc.aweme.emoji.emojiPageV2.AbstractC46467a
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo60184a(ViewGroup viewGroup, int i) {
        View a = C1764a.m5927a(LayoutInflater.from(((AbstractC46467a) this).f108251d), R.layout.yo, viewGroup, false);
        C89219l.m154716b(a, "");
        return new C46614a(this, a);
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.emojiPageV2.AbstractC46467a
    /* renamed from: a */
    public final void mo78991a(AbstractC46467a<C46447a>.C46469b bVar, int i) {
        List e = mo63369e();
        if (e != null && !e.isEmpty() && bVar != null) {
            Object obj = mo63369e().get(i);
            C89219l.m154716b(obj, "");
            C46447a aVar = (C46447a) obj;
            if (!TextUtils.isEmpty(aVar.f108223c)) {
                C46614a aVar2 = (C46614a) bVar;
                if (aVar2.f108696d != null) {
                    C46534a aVar3 = aVar.f108224d;
                    Objects.requireNonNull(aVar3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.emoji.sysemoji.ImSysEmojiModel");
                    C46605i iVar = (C46605i) aVar3;
                    iVar.setPosition(i);
                    aVar2.f108696d.setText(iVar.getPreviewEmoji());
                    aVar2.f108696d.setContentDescription(((AbstractC46467a) this).f108251d.getString(R.string.bm0, aVar.f108223c));
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.sysemoji.C46588c.AbstractC46590b
    /* renamed from: a */
    public final void mo79185a(C46605i iVar, String str) {
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(str, "");
        iVar.getPosition();
        Object obj = mo63369e().get(iVar.getPosition());
        C89219l.m154716b(obj, "");
        C46534a aVar = ((C46447a) obj).f108224d;
        Objects.requireNonNull(aVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.emoji.sysemoji.ImSysEmojiModel");
        ((C46605i) aVar).setPreviewEmoji(str);
        mo78992l().mo79017a(str);
        notifyItemChanged(iVar.getPosition());
        C46595g.C46596a.m89935a();
        List<C46605i> a = C46615q.m89956a(mo63369e());
        C89219l.m154716b(a, "");
        C89219l.m154721d(a, "");
        C89219l.m154721d(a, "");
        C46642d a2 = C46642d.m90028a();
        C89219l.m154716b(a2, "");
        String e = a2.mo79254e();
        if (e != null && e.length() != 0) {
            AbstractC89568bz unused = C89624i.m155555a(C46597h.f108647a, null, null, new C46597h.C46604f(e, 1, a, null), 3);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46613p(AbstractC1204m mVar, SwipeControlledRecycleView swipeControlledRecycleView, SwipeControlledViewPager swipeControlledViewPager) {
        super(mVar);
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(swipeControlledRecycleView, "");
        C89219l.m154721d(swipeControlledViewPager, "");
        this.f108687g = mVar;
        this.f108688h = swipeControlledRecycleView;
        this.f108689i = swipeControlledViewPager;
    }
}
