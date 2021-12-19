package com.p2082ss.android.ugc.aweme.shortvideo;

import android.os.Build;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.LiveData;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.filter.p942a.AbstractC14210a;
import com.bytedance.creativex.recorder.gesture.api.AbstractC14315b;
import com.bytedance.creativex.recorder.gesture.api.AbstractC14318d;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m;
import com.bytedance.creativex.recorder.p940b.p941a.C14171ac;
import com.bytedance.p1559o.C21582f;
import com.bytedance.scene.group.AbstractC22186b;
import com.p2082ss.android.ugc.asve.p2216e.C31059c;
import com.p2082ss.android.ugc.aweme.framework.services.IStickerService;
import com.p2082ss.android.ugc.aweme.port.internal.AbstractC63281h;
import com.p2082ss.android.ugc.aweme.services.recording.IRecordingOperationPanel;
import com.p2082ss.android.ugc.aweme.shortvideo.p3804d.p3805a.C70627b;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.AbstractC73758l;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.AbstractC73759m;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.VideoRecordNewActivity;
import com.p2082ss.android.ugc.aweme.shortvideo.p3892x.AbstractC74317i;
import com.p2082ss.android.ugc.aweme.shortvideo.p3892x.AbstractC74319k;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.C72863d;
import com.p2082ss.android.ugc.aweme.tools.C78599g;
import com.p2082ss.android.ugc.aweme.widgetcompat.RemoteImageView;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.dc */
public abstract class AbstractC70630dc extends AbstractC22186b implements IRecordingOperationPanel {

    /* renamed from: d */
    public static final String f158090d = AbstractC70630dc.class.getSimpleName();

    /* renamed from: b */
    private ShortVideoContextViewModel f158091b;

    /* renamed from: c */
    private C71828ex f158092c;

    /* renamed from: e */
    public Runnable f158093e;

    /* renamed from: E */
    public abstract C21582f mo62771E();

    static {
        Covode.recordClassIndex(83096);
    }

    /* renamed from: I */
    private AbstractC14315b m124818I() {
        return (AbstractC14315b) mo62771E().mo35249a(AbstractC14315b.class, (String) null);
    }

    @Override // com.bytedance.scene.group.AbstractC22186b
    /* renamed from: D */
    public final void mo36385D() {
        super.mo36385D();
        Runnable runnable = this.f158093e;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: H */
    public final C21582f mo111444H() {
        return ((AbstractC73758l) mo36486t()).mo87538j();
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
    public final ShortVideoContextViewModel mo111443G() {
        if (this.f158091b == null) {
            this.f158091b = (ShortVideoContextViewModel) C1181ae.m3881a((ActivityC0945e) this.f52549m, (C1175ad.AbstractC1177b) null).mo3983a(ShortVideoContextViewModel.class);
        }
        return this.f158091b;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public void closeRecording() {
        if (this.f52549m != null) {
            ((AbstractC14193m) mo111444H().mo35249a(AbstractC14193m.class, (String) null)).mo22886a(false);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public AbstractC74317i filterModule() {
        if (this.f158092c == null && this.f52549m != null) {
            this.f158092c = new C71828ex((AbstractC14210a) mo111444H().mo35247a(AbstractC14210a.class));
        }
        return this.f158092c;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public int getCameraPos() {
        int i = Build.VERSION.SDK_INT;
        return ((AbstractC14177d) mo111444H().mo35249a(AbstractC14177d.class, (String) null)).mo22757K();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public LiveData<Float> getZoomEvent() {
        return ((AbstractC14177d) mo111444H().mo35249a(AbstractC14177d.class, (String) null)).mo22825m();
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
        if (this.f52549m instanceof AbstractC73759m) {
            layoutParams = ((AbstractC73759m) this.f52549m).mo115994l();
        } else {
            layoutParams = null;
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

    /* renamed from: b */
    private static boolean m124819b(String str) {
        if ("xssticker".equals(str) || "xsbeauty".equals(str) || "livestreaming".equals(str)) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public void closeCamera(PrivacyCert privacyCert) {
        ((AbstractC14177d) mo111444H().mo35249a(AbstractC14177d.class, (String) null)).mo22743c(C31059c.m63960a(), privacyCert);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public void onHidePanel(String str) {
        if (m124819b(str)) {
            ((AbstractC14177d) mo62771E().mo35249a(AbstractC14177d.class, (String) null)).mo22779a(new C14171ac(true, false, true));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public void onShowPanel(String str) {
        if (m124819b(str)) {
            ((AbstractC14177d) mo62771E().mo35249a(AbstractC14177d.class, (String) null)).mo22779a(new C14171ac(false, false, true));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public void openCamera(PrivacyCert privacyCert) {
        ((AbstractC14177d) mo111444H().mo35249a(AbstractC14177d.class, (String) null)).mo22739a(privacyCert);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public void onGameStickerChosen(IStickerService.FaceSticker faceSticker, String str) {
        if (this.f52549m != null) {
            m124818I().mo23096a(new AbstractC14318d.C14319a());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public void onStickerCancel(IStickerService.FaceSticker faceSticker, String str) {
        if (this.f52549m != null) {
            m124818I().mo23096a(new AbstractC14318d.C14319a());
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
            ((AbstractC14177d) mo111444H().mo35249a(AbstractC14177d.class, (String) null)).mo22773a(b, privacyCert, (String) null);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public void onStickerChosen(IStickerService.FaceSticker faceSticker, String str) {
        boolean z;
        boolean z2;
        if (this.f52549m != null && "livestreaming".equals(str)) {
            AbstractC14315b I = m124818I();
            if (C84904k.m145909a(faceSticker.tags) || !faceSticker.tags.contains("transfer_touch")) {
                if (faceSticker.types == null || !faceSticker.types.contains("AR")) {
                    z = false;
                } else {
                    z = true;
                }
                if (faceSticker.requirements == null || !faceSticker.requirements.contains("AR")) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z || z2) {
                    I.mo23096a(new C70627b(videoRecorder(), new ViewGroup.MarginLayoutParams((ViewGroup.MarginLayoutParams) ((VideoRecordNewActivity) this.f52549m).f164792F.mo22750D().getLayoutParams())));
                } else if (C84904k.m145909a(faceSticker.types) || !faceSticker.types.contains("TouchGes")) {
                    I.mo23096a(new AbstractC14318d.C14319a());
                } else {
                    I.mo23096a(new C70627b(videoRecorder(), new ViewGroup.MarginLayoutParams((ViewGroup.MarginLayoutParams) ((VideoRecordNewActivity) this.f52549m).f164792F.mo22750D().getLayoutParams())));
                }
            } else {
                I.mo23096a(new C72863d(this.f52549m, videoRecorder()));
            }
        }
    }
}
