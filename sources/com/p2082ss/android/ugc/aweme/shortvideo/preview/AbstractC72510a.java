package com.p2082ss.android.ugc.aweme.shortvideo.preview;

import android.graphics.Bitmap;
import android.view.SurfaceView;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.bytedance.als.AbstractC2547b;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.editor.preview.AbstractC14088a;
import com.bytedance.creativex.editor.preview.IAudioEffectParam;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.effect.EffectPointModel;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;
import com.p2082ss.android.ugc.aweme.filter.p2983c.C50649a;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50703k;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50706n;
import com.p2082ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.p3809b.C70936b;
import com.p2082ss.android.vesdk.filterparam.VEBaseFilterParam;
import dmt.p4542av.video.C88271g;
import dmt.p4542av.video.C88276k;
import dmt.p4542av.video.C88288n;
import dmt.p4542av.video.C88292p;
import dmt.p4542av.video.C88295s;
import dmt.p4542av.video.C88296t;
import dmt.p4542av.video.C88297u;
import dmt.p4542av.video.C88300w;
import dmt.p4542av.video.VEEditorAutoStartStopArbiter;
import dmt.p4542av.video.VEPreviewMusicParams;
import dmt.p4542av.video.p4545b.AbstractC88181j;
import java.util.ArrayList;
import p4600h.C89386u;
import p4600h.C89391z;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.preview.a */
public interface AbstractC72510a extends AbstractC2547b {

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.preview.a$a */
    public static final class C72511a {
        static {
            Covode.recordClassIndex(85190);
        }
    }

    static {
        Covode.recordClassIndex(85189);
    }

    /* renamed from: A */
    C1213t<C70936b> mo114776A();

    /* renamed from: B */
    C1213t<Boolean> mo114777B();

    /* renamed from: C */
    LiveData<AbstractC31071f> mo114778C();

    /* renamed from: D */
    LiveData<VEEditorAutoStartStopArbiter> mo114779D();

    /* renamed from: E */
    C1213t<C88297u> mo114780E();

    /* renamed from: F */
    LiveData<C89386u<Boolean, Boolean, Boolean>> mo114781F();

    /* renamed from: G */
    AbstractC14088a mo114782G();

    /* renamed from: H */
    FrameLayout mo114783H();

    /* renamed from: I */
    LiveData<Boolean> mo114784I();

    /* renamed from: J */
    void mo114785J();

    /* renamed from: K */
    LiveData<C89391z> mo114786K();

    /* renamed from: L */
    void mo114787L();

    /* renamed from: M */
    LiveData<C89391z> mo114788M();

    /* renamed from: N */
    void mo114789N();

    /* renamed from: O */
    LiveData<C89391z> mo114790O();

    /* renamed from: P */
    void mo114791P();

    /* renamed from: Q */
    LiveData<Integer> mo114792Q();

    /* renamed from: R */
    LiveData<Integer> mo114793R();

    /* renamed from: S */
    LiveData<Boolean> mo114794S();

    /* renamed from: a */
    ViewGroup.MarginLayoutParams mo114795a();

    /* renamed from: a */
    void mo114796a(int i);

    /* renamed from: a */
    void mo114797a(int i, int i2, VEBaseFilterParam vEBaseFilterParam);

    /* renamed from: a */
    void mo114798a(FilterBean filterBean, FilterBean filterBean2, float f);

    /* renamed from: a */
    void mo114799a(C50649a aVar);

    /* renamed from: a */
    void mo114800a(VEVolumeChangeOp vEVolumeChangeOp);

    /* renamed from: a */
    void mo114801a(C88288n nVar);

    /* renamed from: a */
    void mo114802a(C88295s sVar);

    /* renamed from: a */
    void mo114803a(C88297u uVar);

    /* renamed from: a */
    void mo114804a(boolean z);

    /* renamed from: a */
    void mo114805a(boolean z, boolean z2, boolean z3);

    /* renamed from: a */
    boolean mo114806a(VEPreviewMusicParams vEPreviewMusicParams);

    /* renamed from: b */
    int mo114807b();

    /* renamed from: b */
    void mo114808b(int i);

    /* renamed from: b */
    void mo114809b(boolean z);

    /* renamed from: c */
    int mo114810c();

    /* renamed from: c */
    void mo114811c(int i);

    /* renamed from: c */
    void mo114812c(boolean z);

    /* renamed from: d */
    AbstractC88181j mo114813d();

    /* renamed from: d */
    void mo114814d(int i);

    /* renamed from: d */
    void mo114815d(boolean z);

    /* renamed from: e */
    LiveData<Void> mo114816e();

    /* renamed from: f */
    LiveData<Void> mo114817f();

    /* renamed from: g */
    LiveData<SurfaceView> mo114818g();

    /* renamed from: h */
    C1213t<Boolean> mo114819h();

    /* renamed from: i */
    C1213t<Bitmap> mo114820i();

    /* renamed from: j */
    LiveData<C50649a> mo114821j();

    /* renamed from: k */
    LiveData<AbstractC50706n> mo114822k();

    /* renamed from: l */
    LiveData<AbstractC50703k> mo114823l();

    /* renamed from: m */
    int mo114824m();

    /* renamed from: n */
    C1213t<Integer> mo114825n();

    /* renamed from: o */
    void mo114826o();

    /* renamed from: p */
    C88271g<C88292p> mo114827p();

    /* renamed from: q */
    C88276k<C88300w> mo114828q();

    /* renamed from: r */
    ArrayList<EffectPointModel> mo114829r();

    /* renamed from: s */
    LiveData<Boolean> mo114830s();

    /* renamed from: t */
    LiveData<C88300w> mo114831t();

    /* renamed from: u */
    LiveData<IAudioEffectParam> mo114832u();

    /* renamed from: v */
    C1213t<C88296t> mo114833v();

    /* renamed from: w */
    LiveData<VEPreviewMusicParams> mo114834w();

    /* renamed from: x */
    LiveData<C88295s> mo114835x();

    /* renamed from: y */
    LiveData<Boolean> mo114836y();

    /* renamed from: z */
    void mo114837z();
}
