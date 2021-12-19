package com.p2082ss.android.ugc.aweme.shortvideo.sticker.p3860b;

import android.content.Intent;
import android.text.TextUtils;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.C59187c;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.ShortVideoCommonParams;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AbstractC72263v;
import com.p2082ss.android.ugc.aweme.shortvideo.p3854r.C72724a;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.b.a */
public final class C72846a implements AbstractC72263v {

    /* renamed from: a */
    private final ActivityC0945e f163457a;

    static {
        Covode.recordClassIndex(85537);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AbstractC72263v
    /* renamed from: a */
    public final void mo114427a() {
    }

    public C72846a(ActivityC0945e eVar) {
        C89219l.m154721d(eVar, "");
        this.f163457a = eVar;
    }

    /* renamed from: a */
    private static String m128622a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AbstractC72263v
    /* renamed from: a */
    public final void mo114428a(int i, Intent intent) {
        C89219l.m154721d(intent, "");
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data");
        if (parcelableArrayListExtra != null && !parcelableArrayListExtra.isEmpty() && !TextUtils.isEmpty(((MediaModel) parcelableArrayListExtra.get(0)).f134662b)) {
            C59187c.f134693a.mo96693b();
            MediaModel mediaModel = (MediaModel) parcelableArrayListExtra.get(0);
            Effect effect = (Effect) intent.getParcelableExtra("key_custom_effect_sticker");
            String a = m128622a(intent, "shoot_way");
            if (a == null) {
                a = "";
            }
            C89219l.m154716b(a, "");
            String a2 = m128622a(intent, "content_source");
            if (a2 == null) {
                a2 = "";
            }
            C89219l.m154716b(a2, "");
            String a3 = m128622a(intent, "content_type");
            if (a3 == null) {
                a3 = "";
            }
            C89219l.m154716b(a3, "");
            String a4 = m128622a(intent, "creation_id");
            if (a4 == null) {
                a4 = "";
            }
            C89219l.m154716b(a4, "");
            C72724a.m128203a().mo62194a(this.f163457a, mediaModel, effect, new ShortVideoCommonParams(a, a2, a3, a4));
        }
    }
}
