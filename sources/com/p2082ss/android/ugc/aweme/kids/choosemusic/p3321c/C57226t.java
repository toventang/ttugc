package com.p2082ss.android.ugc.aweme.kids.choosemusic.p3321c;

import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.tablayout.DmtTabLayout;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3320b.C57191a;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.c.t */
public final class C57226t extends AbstractC57202e {

    /* renamed from: v */
    public static final C57227a f130357v = new C57227a((byte) 0);

    /* renamed from: w */
    private HashMap f130358w;

    static {
        Covode.recordClassIndex(67131);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.c.t$a */
    public static final class C57227a {
        static {
            Covode.recordClassIndex(67132);
        }

        private C57227a() {
        }

        public /* synthetic */ C57227a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.kids.choosemusic.p3321c.AbstractC57202e
    /* renamed from: a */
    public final void mo94427a() {
        ScrollableLayout scrollableLayout = this.f130300k;
        if (scrollableLayout != null) {
            scrollableLayout.setTabsMarginTop(C34728n.m70946a(44.0d));
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.kids.choosemusic.p3321c.AbstractC57202e
    /* renamed from: b */
    public final void mo94432b() {
        DmtTabLayout dmtTabLayout = this.f130298e;
        if (dmtTabLayout != null) {
            dmtTabLayout.setSelectedTabIndicatorHeight(C34728n.m70946a(2.0d));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.p2082ss.android.ugc.aweme.kids.choosemusic.p3321c.AbstractC57202e, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f130358w;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.kids.choosemusic.p3321c.AbstractC57202e
    /* renamed from: a */
    public final void mo94429a(LinearLayout linearLayout) {
        if (linearLayout != null) {
            linearLayout.setShowDividers(0);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.kids.choosemusic.p3321c.AbstractC57202e
    /* renamed from: a */
    public final void mo94431a(C33942b bVar) {
        C89219l.m154721d(bVar, "");
        Fragment parentFragment = getParentFragment();
        if (!(parentFragment instanceof C57211i) || !((C57211i) parentFragment).f130241b) {
            C57191a aVar = (C57191a) bVar.mo60212a();
            C89219l.m154716b(aVar, "");
            int i = aVar.f130234d;
            MusicModel musicModel = aVar.f130235e;
            int i2 = aVar.f130231a;
            if (i == 1 && i2 == 0) {
                mo94435c(musicModel);
            }
        }
    }
}
