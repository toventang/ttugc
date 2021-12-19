package com.p2082ss.android.ugc.aweme.detail.p2749h;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.detail.p2751ui.MarqueeView2;
import com.p2082ss.android.ugc.aweme.experiment.C46847dp;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import com.p2082ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.music.service.C61068e;
import com.p2082ss.android.ugc.aweme.music.service.IMusicRecordService;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.utils.C80567ic;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import java.util.UUID;

/* renamed from: com.ss.android.ugc.aweme.detail.h.v */
public final class C41214v extends AbstractC41220y {

    /* renamed from: a */
    private boolean f96314a;

    /* renamed from: bx */
    private Music f96315bx;

    /* renamed from: by */
    private String f96316by;

    /* renamed from: bz */
    private String f96317bz;

    static {
        Covode.recordClassIndex(49097);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.detail.p2749h.AbstractC41220y
    /* renamed from: o */
    public final int mo70389o() {
        return R.string.h4o;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.detail.p2749h.AbstractC41220y
    /* renamed from: n */
    public final void mo70388n() {
        String str;
        int i;
        boolean z;
        if (this.f96315bx != null) {
            if (this.f183419bv == null || !MSAdaptionService.m97895c().mo89375b(this.f183419bv)) {
                String str2 = null;
                Aweme aD = mo81109aD();
                String str3 = "";
                if (aD != null) {
                    if (!C46847dp.m90162a() || C80580in.m139689d() || !Aweme.containsGreenScreenGiphyAnchor(aD.getAnchors())) {
                        str = str3;
                    } else {
                        str = aD.getGiphyGifIds();
                    }
                    str2 = aD.getStickerIDs();
                    if (aD.getVideo() != null) {
                        i = aD.getVideo().getVideoLength();
                    }
                    i = 0;
                } else {
                    str = str3;
                    i = 0;
                }
                C61068e eVar = new C61068e();
                boolean downloadEffectOrMusicAfterEnterCamera = AVExternalServiceImpl.m113114a().configService().avsettingsConfig().downloadEffectOrMusicAfterEnterCamera();
                boolean isRecording = AVExternalServiceImpl.m113114a().configService().shortVideoConfig().isRecording();
                Fragment aH_ = aH_();
                Activity activity = this.f183419bv;
                MusicModel convertToMusicModel = this.f96315bx.convertToMusicModel();
                C412151 r11 = new IMusicRecordService.AbstractC61062a() {
                    /* class com.p2082ss.android.ugc.aweme.detail.p2749h.C41214v.C412151 */

                    static {
                        Covode.recordClassIndex(49098);
                    }
                };
                if (!downloadEffectOrMusicAfterEnterCamera || (isRecording && this.f183419bv != null)) {
                    z = false;
                } else {
                    z = true;
                }
                eVar.startRecord(aH_, activity, convertToMusicModel, str2, str, r11, i, z);
                C33744d a = new C33744d().mo59983a("enter_method", "music_feed").mo59981a("music_id", this.f96315bx.getId()).mo59983a("creation_id", UUID.randomUUID().toString()).mo59983a("enter_from", "single_song").mo59983a("shoot_way", "single_song").mo59983a("group_id", this.f96317bz);
                if (!TextUtils.isEmpty(str)) {
                    str3 = str.split(",")[0];
                }
                C39162r.m79460a("shoot", a.mo59983a("giphy_id", str3).f79943a);
                return;
            }
            Toast makeText = Toast.makeText(this.f183419bv, this.f183419bv.getString(R.string.bed), 0);
            if (Build.VERSION.SDK_INT == 25) {
                C80567ic.m139657a(makeText);
            }
            makeText.show();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.detail.p2749h.AbstractC41220y
    /* renamed from: a */
    public final View mo70386a(RelativeLayout relativeLayout) {
        View a = C1764a.m5927a(LayoutInflater.from(this.f183419bv), R.layout.wo, relativeLayout, false);
        RemoteImageView remoteImageView = (RemoteImageView) a.findViewById(R.id.cnr);
        remoteImageView.setVisibility(0);
        C34577e.m70591a(remoteImageView, 2131231900);
        if (this.f96315bx != null) {
            MarqueeView2 marqueeView2 = (MarqueeView2) a.findViewById(R.id.b0s);
            if (this.f96315bx.getMatchedPGCSoundInfo() != null && !TextUtils.isEmpty(this.f96315bx.getMatchedPGCSoundInfo().getMixedTitle())) {
                mo70549a(marqueeView2, this.f96315bx.getMatchedPGCSoundInfo().getMixedTitle());
            } else if (this.f96314a || this.f96315bx.getMatchedPGCSoundInfo() == null || TextUtils.isEmpty(this.f96315bx.getMatchedPGCSoundInfo().getShowInfo())) {
                mo70549a(marqueeView2, this.f183419bv.getResources().getString(R.string.dbi, this.f96315bx.getMusicName(), "@" + this.f96315bx.getAuthorName()));
            } else {
                mo70549a(marqueeView2, this.f183419bv.getResources().getString(R.string.dbi, this.f96315bx.getMusicName(), this.f96315bx.getAuthorName()));
            }
        }
        return a;
    }

    public C41214v(Bundle bundle, C49812b bVar) {
        this.f96315bx = (Music) bundle.getSerializable("feed_data_music");
        this.f96314a = bundle.getBoolean("feed_data_is_ad", false);
        this.f96317bz = bundle.getString("id");
        this.f96316by = bundle.getString("feed_data_author_id");
        bVar.setHideMusicText(true);
    }
}
