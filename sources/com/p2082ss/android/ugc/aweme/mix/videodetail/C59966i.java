package com.p2082ss.android.ugc.aweme.mix.videodetail;

import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.p2379ui.C34700p;
import com.p2082ss.android.ugc.aweme.detail.p2751ui.C41401l;

/* renamed from: com.ss.android.ugc.aweme.mix.videodetail.i */
public final class C59966i extends C41401l {

    /* renamed from: y */
    public static final C59967a f136558y = new C59967a((byte) 0);

    /* renamed from: z */
    private SparseArray f136559z;

    static {
        Covode.recordClassIndex(70385);
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.videodetail.i$a */
    public static final class C59967a {
        static {
            Covode.recordClassIndex(70386);
        }

        private C59967a() {
        }

        public /* synthetic */ C59967a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f136559z;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.p2751ui.C41401l
    /* renamed from: b */
    public final C34700p.C34701a mo70662b() {
        C34700p.C34701a aVar = new C34700p.C34701a();
        aVar.mo61369a(C59934a.class, "page_feed", 0, getArguments());
        return aVar;
    }
}
