package com.p2082ss.android.ugc.aweme.emoji.emojiPageV2;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.lifecycle.AbstractC1204m;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.emoji.p2897b.C46447a;
import com.p2082ss.android.ugc.aweme.emoji.p2899d.p2900a.C46459a;
import com.p2082ss.android.ugc.aweme.emoji.p2904g.C46534a;
import com.p2082ss.android.ugc.aweme.emoji.utils.C46641c;
import com.p2082ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.emoji.emojiPageV2.h */
public final class C46484h extends AbstractC46467a<C46447a> {

    /* renamed from: g */
    public final AbstractC1204m f108322g;

    /* renamed from: h */
    private final float f108323h = 16.0f;

    /* renamed from: i */
    private final float f108324i = 16.0f;

    /* renamed from: j */
    private final float f108325j = 24.0f;

    /* renamed from: k */
    private final float f108326k = 60.0f;

    /* renamed from: w */
    private final int f108327w = ((int) C13628n.m24520b(((AbstractC46467a) this).f108251d, 16.0f));

    /* renamed from: x */
    private final int f108328x = ((int) C13628n.m24520b(((AbstractC46467a) this).f108251d, 16.0f));

    /* renamed from: y */
    private final int f108329y = ((int) C13628n.m24520b(((AbstractC46467a) this).f108251d, 60.0f));

    /* renamed from: z */
    private final int f108330z = ((int) C13628n.m24520b(((AbstractC46467a) this).f108251d, 24.0f));

    static {
        Covode.recordClassIndex(55069);
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.emojiPageV2.AbstractC46467a
    /* renamed from: m */
    public final int mo78993m() {
        return R.layout.yg;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46484h(AbstractC1204m mVar) {
        super(mVar);
        C89219l.m154721d(mVar, "");
        this.f108322g = mVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.emojiPageV2.AbstractC46467a
    /* renamed from: a */
    public final void mo78990a(RecyclerView recyclerView) {
        C89219l.m154721d(recyclerView, "");
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        int i = this.f108327w;
        ((RelativeLayout.LayoutParams) layoutParams).setMargins(i, 0, i, 0);
        recyclerView.setLayoutManager(new WrapGridLayoutManager(((AbstractC46467a) this).f108249b, 1));
        recyclerView.mo4415b(new C46471b(((AbstractC46467a) this).f108249b, mo78989a(this.f108329y, this.f108327w, ((AbstractC46467a) this).f108249b), this.f108330z));
        recyclerView.setAdapter(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.emojiPageV2.AbstractC46467a
    /* renamed from: a */
    public final void mo78991a(AbstractC46467a<C46447a>.C46469b bVar, int i) {
        if (mo63369e() != null && mo63369e().size() > 0 && bVar != null && bVar.f108254a != null) {
            Object obj = mo63369e().get(i);
            C89219l.m154716b(obj, "");
            C46447a aVar = (C46447a) obj;
            String a = C46641c.m90025a(aVar.f108224d);
            if (new File(a).exists()) {
                RemoteImageView remoteImageView = bVar.f108254a;
                C89219l.m154716b(a, "");
                C46534a aVar2 = aVar.f108224d;
                C89219l.m154716b(aVar2, "");
                m89709a(remoteImageView, a, C46459a.m89693d(aVar2));
            } else {
                m89708a(bVar.f108254a, aVar);
            }
            if (!TextUtils.isEmpty(aVar.f108223c)) {
                bVar.f108254a.setContentDescription(((AbstractC46467a) this).f108251d.getString(R.string.bm0, aVar.f108223c));
            }
        }
    }
}
