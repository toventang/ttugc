package com.p2082ss.android.ugc.aweme.discover.p2797ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.adapter.AbstractC41728j;
import com.p2082ss.android.ugc.aweme.discover.adapter.C41618ai;
import com.p2082ss.android.ugc.aweme.discover.adapter.p2762a.AbstractC41595a;
import com.p2082ss.android.ugc.aweme.discover.adapter.p2762a.AbstractC41596b;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42410g;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.p2789b.C42317b;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42751bf;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.C42741ba;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67542d;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67568r;
import com.p2082ss.android.ugc.aweme.search.p3696l.C67631j;
import com.p2082ss.android.ugc.trill.R;
import java.util.LinkedList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.bh */
public final class C42755bh extends AbstractC42751bf<Music> implements AbstractC41728j, C42741ba.AbstractC42742a<Music> {

    /* renamed from: a */
    public int f99730a;

    /* renamed from: j */
    private List<AbstractC41596b> f99731j = new LinkedList();

    static {
        Covode.recordClassIndex(50859);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42751bf
    /* renamed from: a */
    public final void mo73022a() {
        super.mo73022a();
        this.f99722d.setText(R.string.dbc);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.adapter.AbstractC41728j
    /* renamed from: a */
    public final int mo70825a(Music music) {
        return this.f99730a;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.C42741ba.AbstractC42742a
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo73011a(ViewGroup viewGroup) {
        ViewGroup viewGroup2 = (ViewGroup) this.f99721c;
        C89219l.m154721d(viewGroup2, "");
        C89219l.m154721d(this, "");
        return C41618ai.C41623a.m83582a(viewGroup2, this);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.C42741ba.AbstractC42742a
    /* renamed from: a */
    public final void mo73012a(RecyclerView.ViewHolder viewHolder, C42680ao<Music> aoVar) {
        AbstractC41595a aVar = (AbstractC41595a) viewHolder;
        aVar.mo70820b("general_search");
        aVar.mo70818a(aoVar.f99533a, aoVar.f99534b.f151311f);
        aVar.mo70819a(this.f99725g);
        this.f99731j.add(aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42751bf
    /* renamed from: a */
    public final void mo73020a(final List<Music> list, final C67568r rVar, boolean z) {
        super.mo73020a(list, rVar, z);
        this.f99731j.clear();
        Music music = list.get(0);
        if (music == null || music.getSoundsListType() != 2) {
            this.f99722d.setText(R.string.dbc);
        } else {
            this.f99722d.setText(R.string.h7);
        }
        C67631j.m119782a(this.f99721c, new Runnable() {
            /* class com.p2082ss.android.ugc.aweme.discover.p2797ui.C42755bh.RunnableC427561 */

            static {
                Covode.recordClassIndex(50860);
            }

            public final void run() {
                C42410g gVar;
                Music music = (Music) list.get(0);
                C67568r rVar = rVar;
                if (music != null && rVar != null && (gVar = (C42410g) music.getExtraParamFromPretreatment().get(C42410g.class)) != null) {
                    if (music.getSoundsListType() == 1 || music.getSoundsListType() == 2) {
                        ((C67542d) C42317b.m84679a(rVar).mo106487g(gVar.f98785a)).mo106497x(gVar.f98786b).mo96792f();
                    }
                }
            }
        });
        mo73025b(list, rVar, z);
    }

    public C42755bh(View view, Context context, boolean z, AbstractC42751bf.AbstractC42753a aVar) {
        super(view, context, aVar);
        mo73023a(new C42741ba(this));
    }
}
