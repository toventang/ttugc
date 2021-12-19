package com.p2082ss.android.ugc.aweme.choosemusic.p2463c;

import com.bytedance.covode.number.Covode;
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4166g.C79440a;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.c.ak */
public final class C35778ak extends AbstractC35797j {

    /* renamed from: y */
    public static final C35779a f84446y = new C35779a((byte) 0);

    /* renamed from: z */
    private HashMap f84447z;

    static {
        Covode.recordClassIndex(43017);
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.c.ak$a */
    public static final class C35779a {
        static {
            Covode.recordClassIndex(43018);
        }

        private C35779a() {
        }

        public /* synthetic */ C35779a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.p2082ss.android.ugc.aweme.choosemusic.p2463c.AbstractC35797j, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f84447z;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.choosemusic.p2463c.AbstractC35797j
    /* renamed from: a */
    public final void mo62852a() {
        super.mo62852a();
        try {
            IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
            C89219l.m154716b(iESSettingsProxy, "");
            Boolean showMusicFeedbackEntrance = iESSettingsProxy.getShowMusicFeedbackEntrance();
            C89219l.m154716b(showMusicFeedbackEntrance, "");
            this.f84525s = showMusicFeedbackEntrance.booleanValue();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.choosemusic.p2463c.AbstractC35797j
    /* renamed from: b */
    public final TuxStatusView.C23263c mo62853b() {
        if (!CommerceMediaServiceImpl.m77578f().mo66513b() && !CommerceMediaServiceImpl.m77578f().mo66517e()) {
            return C79440a.m138170b(new TuxStatusView.C23263c());
        }
        TuxStatusView.C23263c b = C79440a.m138170b(new TuxStatusView.C23263c());
        String string = getString(R.string.and);
        C89219l.m154716b(string, "");
        TuxStatusView.C23263c a = b.mo37879a(string);
        String string2 = getString(R.string.anb);
        C89219l.m154716b(string2, "");
        return a.mo37878a((CharSequence) string2);
    }
}
