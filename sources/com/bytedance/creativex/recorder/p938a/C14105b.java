package com.bytedance.creativex.recorder.p938a;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.dependence.beauty.data.BeautyComposerInfo;
import com.p2082ss.android.ugc.tools.C84401c;
import java.util.List;

/* renamed from: com.bytedance.creativex.recorder.a.b */
final /* synthetic */ class C14105b implements AbstractC1214u {

    /* renamed from: a */
    private final AbstractC14095a f34302a;

    static {
        Covode.recordClassIndex(16174);
    }

    C14105b(AbstractC14095a aVar) {
        this.f34302a = aVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        AbstractC14095a aVar = this.f34302a;
        List<BeautyComposerInfo> list = (List) obj;
        if (list != null) {
            try {
                if (list.isEmpty()) {
                    return;
                }
                if (aVar.f34287b.mo121769b().equals("record")) {
                    aVar.f34286a.mo22681c(list, 10000);
                }
            } catch (Exception e) {
                if (!C84401c.f188718b) {
                    aVar.mo22644a(new C14108e(e));
                    return;
                }
                throw new RuntimeException("thx to contact dengchong.999 ...", e);
            }
        }
    }
}
