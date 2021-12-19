package com.p2082ss.android.ugc.aweme.choosemusic.p2463c;

import android.os.Bundle;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.tablayout.DmtTabLayout;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.choosemusic.C35699a;
import com.p2082ss.android.ugc.aweme.choosemusic.p2462b.C35755a;
import com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout;
import com.p2082ss.android.ugc.aweme.login.C58957c;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.c.al */
public final class C35780al extends AbstractC35809r {

    /* renamed from: u */
    public static final C35781a f84448u = new C35781a((byte) 0);

    /* renamed from: v */
    private HashMap f84449v;

    static {
        Covode.recordClassIndex(43019);
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.c.al$a */
    public static final class C35781a {
        static {
            Covode.recordClassIndex(43020);
        }

        private C35781a() {
        }

        public /* synthetic */ C35781a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.choosemusic.p2463c.AbstractC35809r
    /* renamed from: b */
    public final void mo62856b() {
        ScrollableLayout scrollableLayout = this.f84553j;
        if (scrollableLayout != null) {
            scrollableLayout.setTabsMarginTop(C34728n.m70946a(44.0d));
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.choosemusic.p2463c.AbstractC35809r
    /* renamed from: c */
    public final void mo62857c() {
        DmtTabLayout dmtTabLayout = this.f84551d;
        if (dmtTabLayout != null) {
            dmtTabLayout.setSelectedTabIndicatorHeight(C34728n.m70946a(2.0d));
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.choosemusic.p2463c.AbstractC35809r
    /* renamed from: d */
    public final void mo62858d() {
        C35699a.m72863a();
        C58957c.m108324a(this, "", "click_my_music", (Bundle) null, (AbstractC34543f) null);
    }

    @Override // com.p2082ss.android.ugc.aweme.choosemusic.p2463c.AbstractC35809r, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f84449v;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.choosemusic.p2463c.AbstractC35809r
    /* renamed from: a */
    public final void mo62854a(LinearLayout linearLayout) {
        if (linearLayout != null) {
            linearLayout.setShowDividers(0);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.choosemusic.p2463c.AbstractC35809r
    /* renamed from: a */
    public final void mo62855a(C33942b bVar) {
        C89219l.m154721d(bVar, "");
        Fragment parentFragment = getParentFragment();
        if (!(parentFragment instanceof C35818v) || !((C35818v) parentFragment).f84386d) {
            C35755a aVar = (C35755a) bVar.mo60212a();
            C89219l.m154716b(aVar, "");
            int i = aVar.f84360d;
            MusicModel musicModel = aVar.f84361e;
            if (aVar.f84357a != 0) {
                return;
            }
            if (i == 0) {
                new C79459a(getActivity()).mo123050a(R.string.a93).mo123053a();
            } else if (i == 1) {
                mo62919d(musicModel);
            }
        }
    }
}
