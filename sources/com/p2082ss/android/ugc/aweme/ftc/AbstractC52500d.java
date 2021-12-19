package com.p2082ss.android.ugc.aweme.ftc;

import android.os.Build;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.gesture.api.AbstractC14315b;
import com.bytedance.creativex.recorder.gesture.api.AbstractC14318d;
import com.bytedance.p1559o.C21582f;
import com.bytedance.scene.group.AbstractC22186b;
import com.p2082ss.android.ugc.asve.p2216e.C31059c;
import com.p2082ss.android.ugc.aweme.framework.services.IStickerService;
import com.p2082ss.android.ugc.aweme.port.internal.AbstractC63281h;
import com.p2082ss.android.ugc.aweme.services.recording.IRecordingOperationPanel;
import com.p2082ss.android.ugc.aweme.shortvideo.C71828ex;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.p3804d.p3805a.C70627b;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.VideoRecordNewActivity;
import com.p2082ss.android.ugc.aweme.shortvideo.p3892x.AbstractC74317i;
import com.p2082ss.android.ugc.aweme.shortvideo.p3892x.AbstractC74319k;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.C72863d;
import com.p2082ss.android.ugc.aweme.tools.C78599g;
import com.p2082ss.android.ugc.aweme.widgetcompat.RemoteImageView;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;

/* renamed from: com.ss.android.ugc.aweme.ftc.d */
public abstract class AbstractC52500d extends AbstractC22186b implements IRecordingOperationPanel {

    /* renamed from: d */
    public static final String f120895d = AbstractC52500d.class.getSimpleName();

    /* renamed from: b */
    private ShortVideoContextViewModel f120896b;

    /* renamed from: c */
    private C71828ex f120897c;

    /* renamed from: e */
    public Runnable f120898e;

    /* renamed from: E */
    public abstract C21582f mo62771E();

    @Override // com.p2082ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public void onHidePanel(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public void onShowPanel(String str) {
    }

    static {
        Covode.recordClassIndex(61896);
    }

    /* renamed from: H */
    private AbstractC14315b m97426H() {
        return (AbstractC14315b) mo62771E().mo35249a(AbstractC14315b.class, (String) null);
    }

    @Override // com.bytedance.scene.group.AbstractC22186b
    /* renamed from: D */
    public final void mo36385D() {
        super.mo36385D();
        Runnable runnable = this.f120898e;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public AbstractC0952i fragmentManager() {
        return ((ActivityC0945e) this.f52549m).getSupportFragmentManager();
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public RemoteImageView backgroundView() {
        if (this.f52550n != null) {
            return (RemoteImageView) this.f52550n.findViewById(R.id.dgi);
        }
        return null;
    }

    /* renamed from: G */
    public final ShortVideoContextViewModel mo88278G() {
        if (this.f120896b == null) {
            this.f120896b = (ShortVideoContextViewModel) C1181ae.m3881a((ActivityC0945e) this.f52549m, (C1175ad.AbstractC1177b) null).mo3983a(ShortVideoContextViewModel.class);
        }
        return this.f120896b;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public void closeRecording() {
        if (this.f52549m != null) {
            ((FTCVideoRecordNewActivity) mo36486t()).f119402B.mo22886a(false);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public AbstractC74317i filterModule() {
        if (this.f120897c == null && (mo36486t() instanceof FTCVideoRecordNewActivity)) {
            this.f120897c = new C71828ex(((FTCVideoRecordNewActivity) mo36486t()).mo87540l());
        }
        return this.f120897c;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public int getCameraPos() {
        int i = Build.VERSION.SDK_INT;
        return ((VideoRecordNewActivity) Objects.requireNonNull(this.f52549m)).f164792F.mo22757K();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public AbstractC74319k videoRecorder() {
        if (this.f52549m instanceof AbstractC63281h) {
            return ((AbstractC63281h) this.f52549m).mo87547p();
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public void updateLiveBackgroundView() {
        FrameLayout.LayoutParams layoutParams;
        RemoteImageView F = backgroundView();
        FTCVideoRecordNewActivity fTCVideoRecordNewActivity = (FTCVideoRecordNewActivity) this.f52549m;
        if (fTCVideoRecordNewActivity.f119420l == null) {
            layoutParams = null;
        } else {
            layoutParams = (FrameLayout.LayoutParams) fTCVideoRecordNewActivity.f119420l.getLayoutParams();
        }
        if (F != null && layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) F.getLayoutParams();
            layoutParams2.width = layoutParams.width;
            layoutParams2.height = layoutParams.height;
            layoutParams2.topMargin = layoutParams.topMargin;
            layoutParams2.bottomMargin = layoutParams.bottomMargin;
            F.setLayoutParams(layoutParams2);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public void closeCamera(PrivacyCert privacyCert) {
        ((FTCVideoRecordNewActivity) mo36486t()).f119401A.mo22743c(C31059c.m63960a(), privacyCert);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public void openCamera(PrivacyCert privacyCert) {
        ((FTCVideoRecordNewActivity) mo36486t()).f119401A.mo22739a(privacyCert);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public void onGameStickerChosen(IStickerService.FaceSticker faceSticker, String str) {
        if (this.f52549m != null && (this.f52549m instanceof FTCVideoRecordNewActivity)) {
            m97426H().mo23096a(new AbstractC14318d.C14319a());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public void onStickerCancel(IStickerService.FaceSticker faceSticker, String str) {
        if (this.f52549m != null && (this.f52549m instanceof FTCVideoRecordNewActivity)) {
            m97426H().mo23096a(new AbstractC14318d.C14319a());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public void setCameraPos(int i, PrivacyCert privacyCert) {
        C78599g b;
        if (this.f52549m != null) {
            if (i == 1) {
                b = C78599g.m137207a();
            } else {
                b = C78599g.m137208b();
            }
            ((FTCVideoRecordNewActivity) mo36486t()).f119401A.mo22773a(b, privacyCert, (String) null);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public void onStickerChosen(IStickerService.FaceSticker faceSticker, String str) {
        if (this.f52549m != null && (this.f52549m instanceof FTCVideoRecordNewActivity) && "livestreaming".equals(str)) {
            AbstractC14315b H = m97426H();
            if (!C84904k.m145909a(faceSticker.tags) && faceSticker.tags.contains("transfer_touch")) {
                H.mo23096a(new C72863d(this.f52549m, videoRecorder()));
            } else if (!C84904k.m145909a(faceSticker.types) && faceSticker.types.contains("AR")) {
                H.mo23096a(new C70627b(videoRecorder(), new ViewGroup.MarginLayoutParams((ViewGroup.MarginLayoutParams) ((FTCVideoRecordNewActivity) this.f52549m).f119401A.mo22750D().getLayoutParams())));
            } else if (C84904k.m145909a(faceSticker.types) || !faceSticker.types.contains("TouchGes")) {
                H.mo23096a(new AbstractC14318d.C14319a());
            } else {
                H.mo23096a(new C70627b(videoRecorder(), new ViewGroup.MarginLayoutParams((ViewGroup.MarginLayoutParams) ((FTCVideoRecordNewActivity) this.f52549m).f119401A.mo22750D().getLayoutParams())));
            }
        }
    }
}
