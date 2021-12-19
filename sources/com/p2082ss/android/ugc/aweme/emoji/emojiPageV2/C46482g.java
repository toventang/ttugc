package com.p2082ss.android.ugc.aweme.emoji.emojiPageV2;

import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.lifecycle.AbstractC1204m;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.p1855f.C24246a;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.emoji.p2897b.C46447a;
import com.p2082ss.android.ugc.aweme.emoji.p2904g.C46534a;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.emoji.emojiPageV2.g */
public final class C46482g extends AbstractC46467a<C46447a> {

    /* renamed from: g */
    public final AbstractC1204m f108313g;

    /* renamed from: h */
    private final float f108314h = 16.0f;

    /* renamed from: i */
    private final float f108315i = 4.0f;

    /* renamed from: j */
    private final float f108316j = 8.0f;

    /* renamed from: k */
    private final int f108317k = ((int) C13628n.m24520b(((AbstractC46467a) this).f108251d, 8.0f));

    /* renamed from: w */
    private final int f108318w = ((int) C13628n.m24520b(((AbstractC46467a) this).f108251d, 16.0f));

    /* renamed from: x */
    private final int f108319x = ((int) C13628n.m24520b(((AbstractC46467a) this).f108251d, 4.0f));

    static {
        Covode.recordClassIndex(55067);
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.emojiPageV2.AbstractC46467a
    /* renamed from: m */
    public final int mo78993m() {
        return R.layout.yp;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46482g(AbstractC1204m mVar) {
        super(mVar);
        C89219l.m154721d(mVar, "");
        this.f108313g = mVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.emojiPageV2.AbstractC46467a
    /* renamed from: a */
    public final void mo78990a(RecyclerView recyclerView) {
        C89219l.m154721d(recyclerView, "");
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        int i = this.f108318w;
        int i2 = this.f108319x;
        ((RelativeLayout.LayoutParams) layoutParams).setMargins(i, i2, i, i2);
        WrapStaggeredGridLayoutManager wrapStaggeredGridLayoutManager = new WrapStaggeredGridLayoutManager(((AbstractC46467a) this).f108250c);
        recyclerView.setLayoutManager(wrapStaggeredGridLayoutManager);
        recyclerView.setItemAnimator(null);
        recyclerView.mo4405a(new C46483a(wrapStaggeredGridLayoutManager, recyclerView));
        recyclerView.mo4415b(new C46481f(((AbstractC46467a) this).f108250c, this.f108317k));
        recyclerView.setAdapter(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.emojiPageV2.g$a */
    public static final class C46483a extends RecyclerView.AbstractC1371n {

        /* renamed from: a */
        final /* synthetic */ StaggeredGridLayoutManager f108320a;

        /* renamed from: b */
        final /* synthetic */ RecyclerView f108321b;

        static {
            Covode.recordClassIndex(55068);
        }

        C46483a(StaggeredGridLayoutManager staggeredGridLayoutManager, RecyclerView recyclerView) {
            this.f108320a = staggeredGridLayoutManager;
            this.f108321b = recyclerView;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4753a(RecyclerView recyclerView, int i) {
            C89219l.m154721d(recyclerView, "");
            if (i == 0) {
                int[] a = this.f108320a.mo4790a((int[]) null);
                if (a[0] <= 1 && a[1] <= 1) {
                    this.f108320a.mo4794k();
                    this.f108321b.mo4487o();
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.emojiPageV2.AbstractC46467a
    /* renamed from: a */
    public final void mo78991a(AbstractC46467a<C46447a>.C46469b bVar, int i) {
        C24246a aVar;
        if (mo63369e() != null && mo63369e().size() > 0 && bVar != null) {
            RemoteImageView remoteImageView = bVar.f108254a;
            if (!(remoteImageView == null || (aVar = (C24246a) remoteImageView.getHierarchy()) == null)) {
                aVar.mo39966c(R.color.j);
            }
            Object obj = mo63369e().get(i);
            C89219l.m154716b(obj, "");
            C46447a aVar2 = (C46447a) obj;
            C46534a aVar3 = aVar2.f108224d;
            C89219l.m154716b(aVar3, "");
            if (aVar3.getStickerType() == 10 && bVar.f108254a != null) {
                if (aVar2.f108221a == 2131231989) {
                    m89707a(bVar.f108254a, ((AbstractC46467a) this).f108251d, aVar2.f108221a);
                    bVar.f108254a.setContentDescription(((AbstractC46467a) this).f108251d.getString(R.string.bm2));
                    return;
                }
                m89708a(bVar.f108254a, aVar2);
                bVar.f108254a.setContentDescription(((AbstractC46467a) this).f108251d.getString(R.string.bm1));
            }
        }
    }
}
