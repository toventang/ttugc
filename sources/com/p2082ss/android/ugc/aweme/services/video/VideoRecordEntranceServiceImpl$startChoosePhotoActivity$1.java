package com.p2082ss.android.ugc.aweme.services.video;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.C59187c;
import com.p2082ss.android.ugc.aweme.photomovie.PhotoMvConfig;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63212bb;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.property.C65348ar;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.PhotoMvAnchorConfig;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.C70643dn;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C72175bj;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C74007f;
import com.p2082ss.android.ugc.tools.view.widget.C85041d;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.services.video.VideoRecordEntranceServiceImpl$startChoosePhotoActivity$1 */
public final class VideoRecordEntranceServiceImpl$startChoosePhotoActivity$1 implements AbstractC63212bb.AbstractC63213a {
    final /* synthetic */ Activity $context;
    final /* synthetic */ Intent $intent;
    final /* synthetic */ PhotoMvAnchorConfig $photoMvAnchorConfig;

    static {
        Covode.recordClassIndex(80037);
    }

    public final void onCancel() {
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63212bb.AbstractC63213a
    public final void onSuccess() {
        Activity activity = this.$context;
        Intent intent = this.$intent;
        PhotoMvAnchorConfig photoMvAnchorConfig = this.$photoMvAnchorConfig;
        C74007f.m130167a(intent);
        ShortVideoContext a = C70643dn.m124852a(intent, activity);
        AVETParameter aVETParameter = new AVETParameter();
        aVETParameter.setCreationId(a.f155830o);
        aVETParameter.setShootWay(a.f155831p);
        a.f155742C = aVETParameter;
        a.f155783aQ = new PhotoMvConfig(photoMvAnchorConfig.getSlideshowMvId(), photoMvAnchorConfig.getTemplateType());
        C72175bj.m127364a(activity, new C72175bj.AbstractC72176a(activity, photoMvAnchorConfig, a) {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.util.C74007f.C740081 */

            /* renamed from: a */
            final /* synthetic */ Activity f166102a;

            /* renamed from: b */
            final /* synthetic */ PhotoMvAnchorConfig f166103b;

            /* renamed from: c */
            final /* synthetic */ ShortVideoContext f166104c;

            static {
                Covode.recordClassIndex(86758);
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C72175bj.AbstractC72176a
            /* renamed from: b */
            public final void mo114424b() {
                C85041d.m146220a(this.f166102a, (int) R.string.dng).mo129984b();
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C72175bj.AbstractC72176a
            /* renamed from: a */
            public final void mo114423a() {
                if (this.f166102a != null) {
                    Bundle bundle = new Bundle();
                    C59187c.m108691a(this.f166102a, C65348ar.m117034a());
                    bundle.putInt("key_support_flag", 2);
                    bundle.putInt("key_photo_select_min_count", 1);
                    bundle.putInt("key_photo_select_max_count", 35);
                    bundle.putSerializable("key_music_model", this.f166103b.getMusicModel());
                    bundle.putInt("key_choose_scene", 9);
                    bundle.putParcelable("key_short_video_context", this.f166104c);
                    C70005cr.m123611a().mo70083a(C63238c.f143581h.mo101543b(this.f166103b.getMusicModel()));
                    MvChoosePhotoActivity.C72040a.m127136a(this.f166102a, bundle, 1);
                }
            }

            {
                this.f166102a = r1;
                this.f166103b = r2;
                this.f166104c = r3;
            }
        });
    }

    VideoRecordEntranceServiceImpl$startChoosePhotoActivity$1(Activity activity, Intent intent, PhotoMvAnchorConfig photoMvAnchorConfig) {
        this.$context = activity;
        this.$intent = intent;
        this.$photoMvAnchorConfig = photoMvAnchorConfig;
    }
}
