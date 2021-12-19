package com.p2082ss.android.ugc.aweme.ftc;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.LiveData;
import com.C1764a;
import com.bytedance.als.dsl.C2552c;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.C21582f;
import com.bytedance.scene.AbstractC22219j;
import com.bytedance.scene.C22268t;
import com.bytedance.scene.ktx.C22227b;
import com.bytedance.scene.navigation.AbstractC22238c;
import com.p2082ss.android.ugc.aweme.adaptation.AbstractActivityC33414h;
import com.p2082ss.android.ugc.aweme.ftc.p3040l.p3041a.C52697f;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.C59187c;
import com.p2082ss.android.ugc.aweme.property.C65348ar;
import com.p2082ss.android.ugc.aweme.servicimpl.PageFactoryDelegate;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.p3835h.AbstractC71864a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.task.C73806f;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.task.EnumC73804d;
import com.p2082ss.android.ugc.aweme.shortvideo.transition.C73296a;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73975b;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.gamora.p4272a.C82004a;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84918b;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;

/* renamed from: com.ss.android.ugc.aweme.ftc.c */
public class C51913c extends AbstractC52500d implements AbstractC84918b {

    /* renamed from: b */
    public View f119603b;

    /* renamed from: c */
    public ShortVideoContext f119604c;

    /* renamed from: f */
    private C21582f f119605f;

    static {
        Covode.recordClassIndex(61282);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public LiveData<Float> getZoomEvent() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.AbstractC52500d
    /* renamed from: E */
    public final C21582f mo62771E() {
        if (this.f119605f == null) {
            this.f119605f = C2552c.m7464b(this);
        }
        return this.f119605f;
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.AbstractC52500d
    /* renamed from: F */
    public final AbstractC71864a mo87612F() {
        return (AbstractC71864a) mo62771E().mo35252b(AbstractC71864a.class, null);
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: n */
    public final void mo36480n() {
        super.mo36480n();
        C59187c.m108691a(mo36488u(), C65348ar.m117034a());
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: o */
    public final void mo36481o() {
        super.mo36481o();
        ((FTCVideoRecordNewActivity) mo36486t()).mo87534b(this);
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: w */
    public final void mo36490w() {
        super.mo36490w();
        C73975b.C73976a.f166071a.end("av_video_record_init", "PlanC onResume");
        C73806f.m129873a(EnumC73804d.RECORD_ON_UI_SHOW);
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.c$a */
    class C51914a implements AbstractC22238c {
        static {
            Covode.recordClassIndex(61283);
        }

        C51914a() {
        }

        @Override // com.bytedance.scene.navigation.AbstractC22238c
        /* renamed from: a */
        public final void mo36521a(AbstractC22219j jVar, AbstractC22219j jVar2, boolean z) {
            if (z) {
                if (jVar2 instanceof C52697f) {
                    C73296a.f164605a = true;
                    C51913c.this.mo36474b(R.id.dgc).setVisibility(8);
                    C51913c.this.f119603b.setVisibility(8);
                    C73296a.f164605a = false;
                }
            } else if (jVar instanceof C52697f) {
                C73296a.f164605a = true;
                C51913c.this.f119603b.setVisibility(0);
                C51913c.this.mo36474b(R.id.dgc).setVisibility(0);
                C73296a.f164605a = false;
            }
        }
    }

    /* renamed from: a */
    private static Bundle m96603a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        super.mo22704a(bundle);
        C22268t B = C22227b.m41826b(this).mo36471B();
        FTCVideoRecordNewActivity fTCVideoRecordNewActivity = (FTCVideoRecordNewActivity) this.f52549m;
        C82004a aVar = new C82004a();
        aVar.mo127176a(this);
        aVar.mo127170a((ActivityC0945e) this.f52549m);
        aVar.mo127177a(mo88278G().f155842a);
        aVar.mo127175a(fTCVideoRecordNewActivity.f119401A.mo22747A().getMediaController());
        aVar.mo127172a(fTCVideoRecordNewActivity.f119401A);
        aVar.mo127173a(fTCVideoRecordNewActivity.f119402B);
        aVar.mo127179a(new AbstractC89244h<AbstractC84089j>(fTCVideoRecordNewActivity) {
            /* class com.p2082ss.android.ugc.aweme.ftc.AbstractC52500d.C525011 */

            /* renamed from: a */
            final /* synthetic */ FTCVideoRecordNewActivity f120899a;

            static {
                Covode.recordClassIndex(61897);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.AbstractC89244h
            public final /* synthetic */ AbstractC84089j getValue() {
                return this.f120899a.mo87541m();
            }

            @Override // p4600h.AbstractC89244h
            public final boolean isInitialized() {
                if (this.f120899a.mo87541m() != null) {
                    return true;
                }
                return false;
            }

            {
                this.f120899a = r2;
            }
        });
        aVar.mo127171a(fTCVideoRecordNewActivity.f119404D);
        aVar.mo127174a(fTCVideoRecordNewActivity.mo87540l());
        aVar.mo127178a(fTCVideoRecordNewActivity.f119417i);
        aVar.mo127180a("VideoRecordNewActivity");
        B.mo36580a("record_env_context", aVar);
        C22227b.m41826b(this).mo36527a(this, new C51914a());
        PageFactoryDelegate.m120145a().mo88345a(this);
        ((AbstractActivityC33414h) mo36486t()).cB_();
    }

    public C51913c(ShortVideoContext shortVideoContext, Intent intent) {
        this.f119604c = shortVideoContext;
        Bundle a = m96603a(intent);
        if (a != null) {
            this.f52554r = a;
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j, com.bytedance.scene.group.AbstractC22186b
    /* renamed from: a */
    public final /* synthetic */ View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return mo22702a(layoutInflater, viewGroup);
    }

    @Override // com.bytedance.scene.group.AbstractC22186b
    /* renamed from: b */
    public final ViewGroup mo36393b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C73991bj.m130128a("planC => onCreateView start");
        FrameLayout frameLayout = (FrameLayout) C1764a.m5927a(layoutInflater, R.layout.a2y, viewGroup, false);
        this.f119603b = frameLayout.findViewById(R.id.dnk);
        ((FTCVideoRecordNewActivity) this.f52549m).mo87532a(this);
        C73975b.C73976a.f166071a.step("av_video_record_init", "PlanC onCreateView");
        C73991bj.m130128a("planC => onCreateView end");
        return frameLayout;
    }

    @Override // com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84918b
    /* renamed from: a */
    public final boolean mo62778a(int i, int i2, Intent intent) {
        AbstractC71864a F = mo87612F();
        if (F == null) {
            return false;
        }
        F.mo113508a(i, i2, intent);
        return false;
    }
}
