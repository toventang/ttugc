package com.p2082ss.android.ugc.aweme.emoji.emojiPageV2;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.lifecycle.AbstractC1204m;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.emoji.p2897b.C46447a;
import com.p2082ss.android.ugc.aweme.emoji.p2906i.p2913c.C46579b;
import com.p2082ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.emoji.emojiPageV2.i */
public final class C46485i extends AbstractC46467a<C46447a> {

    /* renamed from: g */
    public final AbstractC1204m f108331g;

    /* renamed from: h */
    private final float f108332h = 14.0f;

    /* renamed from: i */
    private final float f108333i = 12.0f;

    /* renamed from: j */
    private final float f108334j = 24.0f;

    /* renamed from: k */
    private final float f108335k = 29.0f;

    /* renamed from: w */
    private final int f108336w = ((int) C13628n.m24520b(((AbstractC46467a) this).f108251d, 14.0f));

    /* renamed from: x */
    private final int f108337x = ((int) C13628n.m24520b(((AbstractC46467a) this).f108251d, 12.0f));

    /* renamed from: y */
    private final int f108338y = ((int) C13628n.m24520b(((AbstractC46467a) this).f108251d, 24.0f));

    /* renamed from: z */
    private final int f108339z = ((int) C13628n.m24520b(((AbstractC46467a) this).f108251d, 29.0f));

    static {
        Covode.recordClassIndex(55070);
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.emojiPageV2.AbstractC46467a
    /* renamed from: m */
    public final int mo78993m() {
        return R.layout.ym;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46485i(AbstractC1204m mVar) {
        super(mVar);
        C89219l.m154721d(mVar, "");
        this.f108331g = mVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.emojiPageV2.AbstractC46467a
    /* renamed from: a */
    public final void mo78990a(RecyclerView recyclerView) {
        C89219l.m154721d(recyclerView, "");
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        int i = this.f108336w;
        ((RelativeLayout.LayoutParams) layoutParams).setMargins(i, 0, i, 0);
        recyclerView.setLayoutManager(new WrapGridLayoutManager(((AbstractC46467a) this).f108248a, 1));
        recyclerView.mo4415b(new C46471b(((AbstractC46467a) this).f108248a, mo78989a(this.f108339z, this.f108336w, ((AbstractC46467a) this).f108248a), this.f108338y));
        recyclerView.setAdapter(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.emojiPageV2.AbstractC46467a
    /* renamed from: a */
    public final void mo78991a(AbstractC46467a<C46447a>.C46469b bVar, int i) {
        if (mo63369e() != null && mo63369e().size() > 0 && bVar != null) {
            Object obj = mo63369e().get(i);
            C89219l.m154716b(obj, "");
            C46447a aVar = (C46447a) obj;
            if ((!TextUtils.isEmpty(aVar.f108223c) || aVar.f108221a > 0 || !TextUtils.isEmpty(aVar.f108222b)) && bVar.f108254a != null) {
                bVar.f108254a.setVisibility(0);
                C46579b.m89900a(bVar.f108254a, aVar);
                bVar.f108254a.setContentDescription(((AbstractC46467a) this).f108251d.getString(R.string.bm0, aVar.f108223c));
            }
        }
    }
}
