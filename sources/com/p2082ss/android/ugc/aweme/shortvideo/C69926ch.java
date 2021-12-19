package com.p2082ss.android.ugc.aweme.shortvideo;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import com.C1764a;
import com.bytedance.als.dsl.C2552c;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.filter.p942a.AbstractC14210a;
import com.bytedance.creativex.recorder.p938a.p939a.AbstractC14099a;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14209z;
import com.bytedance.p1559o.C21582f;
import com.bytedance.scene.AbstractC22219j;
import com.bytedance.scene.C22268t;
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.scene.ktx.C22227b;
import com.bytedance.scene.navigation.AbstractC22238c;
import com.p2082ss.android.ugc.aweme.adaptation.AbstractActivityC33414h;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.C59187c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.property.C65348ar;
import com.p2082ss.android.ugc.aweme.shortvideo.p3835h.AbstractC71864a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.AbstractC73760n;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.task.C73806f;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.task.EnumC73804d;
import com.p2082ss.android.ugc.aweme.shortvideo.transition.C73296a;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73975b;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.aweme.shortvideo.util.performance.CameraFirstFramePerformanceMonitor;
import com.p2082ss.android.ugc.aweme.shortvideo.widget.TabHost;
import com.p2082ss.android.ugc.gamora.p4272a.C82004a;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83406b;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.C83462j;
import com.p2082ss.android.ugc.gamora.recorder.p4307n.p4308a.C83927h;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84918b;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c;
import com.p2082ss.android.ugc.trill.R;
import dmt.p4542av.video.p4549f.C88263c;
import p4600h.AbstractC89244h;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ch */
public class C69926ch extends AbstractC70630dc implements AbstractC84918b {

    /* renamed from: b */
    public View f156271b;

    /* renamed from: c */
    public ShortVideoContext f156272c;

    /* renamed from: f */
    private final AbstractC14177d f156273f;

    /* renamed from: g */
    private C21582f f156274g;

    /* renamed from: h */
    private AbstractC69927a f156275h;

    /* renamed from: i */
    private C21582f f156276i;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ch$a */
    public interface AbstractC69927a {
        static {
            Covode.recordClassIndex(82336);
        }

        /* renamed from: a */
        void mo110339a(AbstractC22186b bVar);
    }

    static {
        Covode.recordClassIndex(82335);
    }

    /* renamed from: I */
    private AbstractC71864a m123491I() {
        return (AbstractC71864a) mo62771E().mo35252b(AbstractC71864a.class, null);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.AbstractC70630dc
    /* renamed from: E */
    public final C21582f mo62771E() {
        if (this.f156274g == null) {
            this.f156274g = C2552c.m7464b(this);
        }
        return this.f156274g;
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
        ((AbstractC84919c) mo36486t()).mo87534b(this);
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: w */
    public final void mo36490w() {
        super.mo36490w();
        C73975b.C73976a.f166071a.end(CameraFirstFramePerformanceMonitor.f166157a, "PlanC onResume");
        C73806f.m129873a(EnumC73804d.RECORD_ON_UI_SHOW);
    }

    /* renamed from: F */
    public final boolean mo110336F() {
        C83462j jVar;
        if (getLifecycle().mo4011a().isAtLeast(AbstractC1196i.EnumC1199b.CREATED) && (jVar = (C83462j) mo36386a("RecordBottomTabScene")) != null) {
            TabHost tabHost = jVar.f186407a;
            if (tabHost == null) {
                C89219l.m154710a("tabHost");
            }
            TabHost tabHost2 = jVar.f186407a;
            if (tabHost2 == null) {
                C89219l.m154710a("tabHost");
            }
            if (TextUtils.equals((CharSequence) tabHost.mo116829a(tabHost2.getCurrentIndex()), mo36476c_(R.string.f7u))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ch$b */
    class C69928b implements AbstractC22238c {
        static {
            Covode.recordClassIndex(82337);
        }

        C69928b() {
        }

        @Override // com.bytedance.scene.navigation.AbstractC22238c
        /* renamed from: a */
        public final void mo36521a(AbstractC22219j jVar, AbstractC22219j jVar2, boolean z) {
            if (z) {
                if (jVar2 instanceof C83927h) {
                    C73296a.f164605a = true;
                    C69926ch.this.mo36474b(R.id.dgc).setVisibility(8);
                    C69926ch.this.f156271b.setVisibility(8);
                    C73296a.f164605a = false;
                }
            } else if (jVar instanceof C83927h) {
                C73296a.f164605a = true;
                C69926ch.this.f156271b.setVisibility(0);
                C69926ch.this.mo36474b(R.id.dgc).setVisibility(0);
                C73296a.f164605a = false;
            }
        }
    }

    /* renamed from: a */
    private static Bundle m123492a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final void mo110338b(boolean z) {
        AbstractC71864a I = m123491I();
        if (I != null) {
            I.mo113514c(z);
        }
    }

    /* renamed from: a */
    public final void mo110337a(boolean z) {
        AbstractC71864a I = m123491I();
        if (I != null) {
            I.mo113516d(z);
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        String str;
        super.mo22704a(bundle);
        C22268t B = C22227b.m41826b(this).mo36471B();
        C82004a aVar = new C82004a();
        aVar.mo127176a(this);
        aVar.mo127170a((ActivityC0945e) this.f52549m);
        aVar.mo127177a(mo111443G().f155842a);
        aVar.mo127175a(((AbstractC14177d) mo111444H().mo35249a(AbstractC14177d.class, (String) null)).mo22747A().getMediaController());
        aVar.mo127172a((AbstractC14177d) mo111444H().mo35249a(AbstractC14177d.class, (String) null));
        aVar.mo127173a((AbstractC14193m) mo111444H().mo35249a(AbstractC14193m.class, (String) null));
        aVar.mo127179a(new AbstractC89244h<AbstractC84089j>() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.AbstractC70630dc.C706311 */

            static {
                Covode.recordClassIndex(83097);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.AbstractC89244h
            public final /* synthetic */ AbstractC84089j getValue() {
                return AbstractC70630dc.this.mo111444H().mo35252b(AbstractC84089j.class, null);
            }

            @Override // p4600h.AbstractC89244h
            public final boolean isInitialized() {
                if (AbstractC70630dc.this.mo111444H().mo35252b(AbstractC84089j.class, null) != null) {
                    return true;
                }
                return false;
            }
        });
        aVar.mo127171a((AbstractC14099a) mo111444H().mo35249a(AbstractC14099a.class, (String) null));
        aVar.mo127174a((AbstractC14210a) mo111444H().mo35249a(AbstractC14210a.class, (String) null));
        aVar.mo127178a(((AbstractC14209z) mo111444H().mo35249a(AbstractC14209z.class, (String) null)).mo22941an());
        if (this.f52549m instanceof AbstractC73760n) {
            str = ((AbstractC73760n) this.f52549m).mo115995m();
        } else {
            str = "";
        }
        aVar.mo127180a(str);
        B.mo36580a("record_env_context", aVar);
        C22227b.m41826b(this).mo36527a(this, new C69928b());
        this.f156275h.mo110339a(this);
        if (!C63238c.f143592s.mo93840a() && !this.f156272c.mo110022c()) {
            ((AbstractC83406b) mo62771E().mo35249a(AbstractC83406b.class, (String) null)).showBottomTab(false);
        }
        ((AbstractActivityC33414h) mo36486t()).cB_();
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
        FrameLayout frameLayout = (FrameLayout) C1764a.m5927a(layoutInflater, R.layout.a1l, viewGroup, false);
        this.f156271b = frameLayout.findViewById(R.id.dnk);
        ((AbstractC84919c) this.f52549m).mo87532a(this);
        C73806f.m129872a(new C88263c());
        C73975b.C73976a.f166071a.step("av_video_record_init", "PlanC onCreateView");
        C73991bj.m130128a("planC => onCreateView end");
        return frameLayout;
    }

    @Override // com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84918b
    /* renamed from: a */
    public final boolean mo62778a(int i, int i2, Intent intent) {
        AbstractC71864a I = m123491I();
        if (I == null) {
            return false;
        }
        I.mo113508a(i, i2, intent);
        return false;
    }

    public C69926ch(ShortVideoContext shortVideoContext, Intent intent, C21582f fVar, AbstractC69927a aVar) {
        this.f156272c = shortVideoContext;
        this.f156273f = (AbstractC14177d) fVar.mo35249a(AbstractC14177d.class, (String) null);
        this.f156276i = fVar;
        this.f156275h = aVar;
        Bundle a = m123492a(intent);
        if (a != null) {
            this.f52554r = a;
        }
    }
}
