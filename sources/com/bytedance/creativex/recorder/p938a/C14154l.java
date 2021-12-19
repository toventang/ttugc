package com.bytedance.creativex.recorder.p938a;

import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.filter.p942a.AbstractC14210a;
import com.p2082ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.p2082ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify;
import com.p2082ss.android.ugc.aweme.shortvideo.beauty.BeautyMetadata;
import com.p2082ss.android.ugc.aweme.tools.beauty.C77878d;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.EnumC77907c;
import com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78051c;
import com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78054d;
import com.p2082ss.android.ugc.tools.utils.AbstractC84903j;
import java.util.Iterator;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.creativex.recorder.a.l */
public final class C14154l extends AbstractC14095a {

    /* renamed from: e */
    private final AbstractC14210a f34417e;

    static {
        Covode.recordClassIndex(16223);
    }

    @Override // com.bytedance.creativex.recorder.p938a.AbstractC14095a
    /* renamed from: a */
    public final BeautyMetadata mo22643a() {
        boolean z;
        BeautyMetadata r = this.f34287b.mo121774g().mo121634r();
        StringBuilder sb = new StringBuilder();
        List<ComposerBeauty> s = this.f34287b.mo121774g().mo121635s();
        int size = s.size();
        boolean z2 = true;
        for (int i = 0; i < size; i++) {
            if (this.f34287b.mo121774g().mo121604b(s.get(i).getCategoryId())) {
                s.get(i).setEnable(true);
                if (!s.get(i).isCollectionType()) {
                    if (C77878d.m136004f(s.get(i))) {
                        m25774a(s.get(i));
                    }
                } else if (s.get(i).getChildList() != null) {
                    List<ComposerBeauty> childList = s.get(i).getChildList();
                    if (childList == null) {
                        C89219l.m154715b();
                    }
                    if (!childList.isEmpty()) {
                        List<ComposerBeauty> childList2 = s.get(i).getChildList();
                        if (childList2 == null) {
                            C89219l.m154715b();
                        }
                        int size2 = childList2.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            List<ComposerBeauty> childList3 = s.get(i).getChildList();
                            if (childList3 == null) {
                                C89219l.m154715b();
                            }
                            ComposerBeauty composerBeauty = childList3.get(i2);
                            composerBeauty.setEnable(true);
                            if (C77878d.m136004f(composerBeauty)) {
                                m25774a(composerBeauty);
                            }
                        }
                        List<ComposerBeauty> childList4 = s.get(i).getChildList();
                        if (childList4 == null) {
                            C89219l.m154715b();
                        }
                        Iterator<ComposerBeauty> it = childList4.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (it.next().getEnable()) {
                                    z = true;
                                    break;
                                }
                            } else {
                                z = false;
                                break;
                            }
                        }
                        s.get(i).setEnable(z);
                    }
                }
                if (!z2) {
                    sb.append(",");
                } else {
                    z2 = false;
                }
                sb.append(s.get(i).getEnable() ? 1 : 0);
            }
        }
        String sb2 = sb.toString();
        C89219l.m154716b(sb2, "");
        r.setBeautyValid(sb2);
        r.getBeautyName();
        r.getBeautyStrength();
        r.getBeautyId();
        r.getBeautyRes();
        r.getBeautyValid();
        return r;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.creativex.recorder.p938a.AbstractC14095a
    /* renamed from: b */
    public final void mo22647b(AbstractC1204m mVar) {
        C89219l.m154721d(mVar, "");
        AbstractC14210a aVar = this.f34417e;
        if (aVar != null) {
            aVar.setFilterFromStore(true);
        }
    }

    /* renamed from: a */
    private final void m25774a(ComposerBeauty composerBeauty) {
        if (composerBeauty.getExtra().isNone()) {
            int[] a = this.f34286a.mo22677a(composerBeauty.getEffect().getUnzipPath(), "");
            if (a.length == 2 && a[0] == 0 && a[1] == EnumC77907c.EXCLUDE.getFlag()) {
                composerBeauty.setEnable(false);
                return;
            }
            return;
        }
        List<ComposerBeautyExtraBeautify.ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
        if (items == null) {
            C89219l.m154715b();
        }
        for (ComposerBeautyExtraBeautify.ItemsBean itemsBean : items) {
            int[] a2 = this.f34286a.mo22677a(composerBeauty.getEffect().getUnzipPath(), itemsBean.component5());
            if (a2.length == 2 && a2[0] == 0 && a2[1] == EnumC77907c.EXCLUDE.getFlag()) {
                composerBeauty.setEnable(false);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14154l(AbstractC78054d dVar, AbstractC14210a aVar, AbstractC78051c cVar, AbstractC84903j jVar, boolean z) {
        super(dVar, cVar, aVar, jVar, z);
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(cVar, "");
        this.f34417e = aVar;
    }
}
