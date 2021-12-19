package com.p2082ss.android.ugc.aweme.autoplay.player.video;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b;
import com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.p2082ss.android.ugc.playerkit.model.C84208l;
import com.p2082ss.android.ugc.playerkit.model.C84216o;

/* renamed from: com.ss.android.ugc.aweme.autoplay.player.video.f */
public interface AbstractC34259f extends AbstractC34186b.AbstractC34192d, OnUIPlayListener {
    static {
        Covode.recordClassIndex(41196);
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    /* renamed from: A */
    void mo60424A();

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    /* renamed from: B */
    void mo60425B();

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    void bg_();

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    void bi_();

    /* renamed from: g */
    void mo60429g();

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    void onBuffering(boolean z);

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    void onDecoderBuffering(boolean z);

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    void onPausePlay(String str);

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    void onPlayCompleted(String str);

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    void onPlayCompletedFirstTime(String str);

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    void onPlayFailed(C84208l lVar);

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    void onPlayProgressChange(float f);

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    void onPreparePlay(String str);

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    void onRenderFirstFrame(C84216o oVar);

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    void onResumePlay(String str);

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    void onRetryOnError(C84208l lVar);
}
