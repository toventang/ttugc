package com.p2082ss.android.ugc.aweme.discover.helper;

import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.helper.AbstractC42021i;
import com.p2082ss.android.ugc.aweme.discover.model.SearchUserFeedback;
import com.p2082ss.android.ugc.aweme.discover.p2777k.C42180d;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.Dialog.C42557d;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.p2798a.C42611b;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.p2798a.p2799a.p2800a.C42607a;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.p2798a.p2802b.p2803a.C42618a;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.p2798a.p2802b.p2803a.C42619b;
import java.util.List;
import java.util.Map;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.helper.v */
public final class C42055v implements AbstractC42021i {

    /* renamed from: a */
    public static final C42055v f98050a = new C42055v();

    private C42055v() {
    }

    static {
        Covode.recordClassIndex(49985);
    }

    /* renamed from: a */
    public static void m84170a(AbstractC42021i.C42022a aVar) {
        C42618a aVar2;
        String schema;
        C42557d b;
        C89219l.m154721d(aVar, "");
        Fragment fragment = aVar.f97974b;
        List<? extends Object> list = null;
        if (!(fragment instanceof C42611b)) {
            fragment = null;
        }
        C42611b bVar = (C42611b) fragment;
        if (bVar != null) {
            Map<String, String> map = aVar.f97976d;
            boolean z = aVar.f97977e;
            boolean z2 = aVar.f97978f;
            C42607a a = bVar.mo72808a();
            if (z) {
                aVar2 = C42619b.f99427b.mo72818a(aVar.f97975c);
            } else {
                aVar2 = null;
            }
            a.f99396a = aVar2;
            if (!z2 && (b = C42557d.C42558a.m85062b(aVar.f97973a)) != null) {
                C42557d.C42559b bVar2 = b.f99270o;
                if (bVar2 != null) {
                    bVar2.f99278b = C42002c.m84069a(b.getActivity(), bVar.mo72808a().f99396a, bVar.f99410k);
                    bVar2.f99286j = C42002c.m84070a(bVar.mo72808a().f99396a);
                }
                b.mo72731c();
            }
            C42607a a2 = bVar.mo72808a();
            C42180d.C42181a a3 = C42180d.m84432a(aVar.f97975c);
            if (!(a3 == null || (schema = a3.getSchema()) == null || schema.length() == 0)) {
                list = C89070n.m154524c(new SearchUserFeedback(schema));
            }
            a2.f99397b = list;
            bVar.f99407d = map;
            bVar.mo72812d();
        }
    }
}
