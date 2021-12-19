package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.preview;

import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.scene.group.AbstractC22213f;
import com.bytedance.scene.p1624ui.AbstractC22276a;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.l */
public final class C72401l extends AbstractC22276a {

    /* renamed from: a */
    public List<? extends MvImageChooseAdapter.MyMediaModel> f162305a = C89086z.INSTANCE;

    /* renamed from: b */
    public final AbstractC72363b f162306b;

    /* renamed from: c */
    private final Map<Integer, AbstractC72364c> f162307c = new LinkedHashMap();

    static {
        Covode.recordClassIndex(85074);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.f162305a.size();
    }

    /* renamed from: b */
    public final AbstractC72364c mo114673b(int i) {
        AbstractC72364c cVar = this.f162307c.get(Integer.valueOf(i));
        if (cVar == null) {
            cVar = null;
        }
        return cVar;
    }

    @Override // com.bytedance.scene.p1624ui.AbstractC22276a
    /* renamed from: a */
    public final AbstractC22213f mo36583a(int i) {
        AbstractC22213f eVar;
        MediaModel mediaModel = (MediaModel) C89070n.m154561b((List) this.f162305a, i);
        if (mediaModel == null || !mediaModel.mo96674b()) {
            eVar = new C72367e();
        } else {
            eVar = new C72403n();
        }
        AbstractC72364c cVar = (AbstractC72364c) eVar;
        cVar.mo114658a(i, this.f162306b);
        cVar.mo114659a((MvImageChooseAdapter.MyMediaModel) C89070n.m154561b((List) this.f162305a, i));
        this.f162307c.put(Integer.valueOf(i), cVar);
        return eVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C72401l(AbstractC22186b bVar, AbstractC72363b bVar2) {
        super(bVar);
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(bVar2, "");
        this.f162306b = bVar2;
    }

    @Override // com.bytedance.scene.p1624ui.AbstractC22276a, androidx.viewpager.widget.PagerAdapter
    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(obj, "");
        super.destroyItem(viewGroup, i, obj);
        if ((obj instanceof AbstractC72364c) && obj != null) {
            this.f162307c.remove(Integer.valueOf(i));
        }
    }
}
