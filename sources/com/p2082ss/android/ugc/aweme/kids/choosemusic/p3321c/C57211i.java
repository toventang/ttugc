package com.p2082ss.android.ugc.aweme.kids.choosemusic.p3321c;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.c.i */
public final class C57211i extends AbstractView$OnClickListenerC57193a {

    /* renamed from: o */
    public static final C57212a f130329o = new C57212a((byte) 0);

    /* renamed from: p */
    private HashMap f130330p;

    static {
        Covode.recordClassIndex(67116);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.c.i$a */
    public static final class C57212a {
        static {
            Covode.recordClassIndex(67117);
        }

        private C57212a() {
        }

        public /* synthetic */ C57212a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.choosemusic.p3321c.AbstractView$OnClickListenerC57193a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f130330p;
        if (hashMap != null) {
            hashMap.clear();
        }
    }
}
