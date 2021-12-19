package com.p2082ss.android.ugc.aweme.emoji.emojiPageV2;

import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.lifecycle.AbstractC1204m;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.emoji.p2897b.C46447a;
import com.p2082ss.android.ugc.aweme.emoji.p2904g.C46534a;
import com.p2082ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.emoji.emojiPageV2.e */
public final class C46480e extends AbstractC46467a<C46447a> {

    /* renamed from: g */
    public final AbstractC1204m f108302g;

    /* renamed from: h */
    private final float f108303h = 16.0f;

    /* renamed from: i */
    private final float f108304i = 12.0f;

    /* renamed from: j */
    private final float f108305j = 64.0f;

    /* renamed from: k */
    private final float f108306k = 8.0f;

    /* renamed from: w */
    private final int f108307w = ((int) C13628n.m24520b(((AbstractC46467a) this).f108251d, 16.0f));

    /* renamed from: x */
    private final int f108308x = ((int) C13628n.m24520b(((AbstractC46467a) this).f108251d, 12.0f));

    /* renamed from: y */
    private final int f108309y = ((int) C13628n.m24520b(((AbstractC46467a) this).f108251d, 64.0f));

    /* renamed from: z */
    private final int f108310z = ((int) C13628n.m24520b(((AbstractC46467a) this).f108251d, 8.0f));

    static {
        Covode.recordClassIndex(55065);
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.emojiPageV2.AbstractC46467a
    /* renamed from: m */
    public final int mo78993m() {
        return R.layout.yg;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46480e(AbstractC1204m mVar) {
        super(mVar);
        C89219l.m154721d(mVar, "");
        this.f108302g = mVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.emojiPageV2.AbstractC46467a
    /* renamed from: a */
    public final void mo78990a(RecyclerView recyclerView) {
        C89219l.m154721d(recyclerView, "");
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        int i = this.f108307w;
        ((RelativeLayout.LayoutParams) layoutParams).setMargins(i, 0, i, 0);
        recyclerView.setLayoutManager(new WrapGridLayoutManager(((AbstractC46467a) this).f108249b, 1));
        recyclerView.mo4415b(new C46471b(((AbstractC46467a) this).f108249b, mo78989a(this.f108309y, this.f108307w, ((AbstractC46467a) this).f108250c), this.f108310z));
        recyclerView.setAdapter(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.emojiPageV2.AbstractC46467a
    /* renamed from: a */
    public final void mo78991a(AbstractC46467a<C46447a>.C46469b bVar, int i) {
        if (mo63369e() != null && mo63369e().size() > 0 && bVar != null) {
            Object obj = mo63369e().get(i);
            C89219l.m154716b(obj, "");
            C46447a aVar = (C46447a) obj;
            C46534a aVar2 = aVar.f108224d;
            C89219l.m154716b(aVar2, "");
            if (aVar2.getStickerType() == 2 && bVar.f108254a != null) {
                if (aVar.f108221a == 2131231980) {
                    m89707a(bVar.f108254a, ((AbstractC46467a) this).f108251d, aVar.f108221a);
                } else {
                    m89710b(bVar.f108254a, aVar);
                }
                bVar.f108254a.setContentDescription(((AbstractC46467a) this).f108251d.getString(R.string.bm3));
            }
        }
    }
}
