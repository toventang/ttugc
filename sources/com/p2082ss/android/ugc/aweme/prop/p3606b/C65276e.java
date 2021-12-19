package com.p2082ss.android.ugc.aweme.prop.p3606b;

import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35658s;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.sticker.model.C75445g;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.prop.b.e */
public final class C65276e extends C35658s {

    /* renamed from: I */
    public List<C75445g> f147284I;

    /* renamed from: J */
    public String f147285J;

    static {
        Covode.recordClassIndex(76755);
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35658s
    /* renamed from: a */
    public final SmartRoute mo62661a(Aweme aweme, C35658s.C35664c cVar) {
        SmartRoute a = super.mo62661a(aweme, cVar);
        if (this.f147284I != null) {
            a.withParam("feed_data_sticker_model", new ArrayList(this.f147284I));
        }
        String str = this.f147285J;
        if (str != null) {
            a.withParam("feed_data_sticker_group_id", str);
        }
        return a;
    }
}
