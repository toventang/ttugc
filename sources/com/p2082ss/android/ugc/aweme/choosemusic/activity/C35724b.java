package com.p2082ss.android.ugc.aweme.choosemusic.activity;

import android.os.Bundle;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.choosemusic.p2463c.C35818v;
import com.p2082ss.android.ugc.aweme.music.p3465b.C60717d;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.activity.b */
final /* synthetic */ class C35724b implements AbstractC89171a {

    /* renamed from: a */
    private final ChooseMusicActivity f84280a;

    /* renamed from: b */
    private final AbstractC0952i f84281b;

    /* renamed from: c */
    private final String f84282c;

    /* renamed from: d */
    private final MusicModel f84283d;

    /* renamed from: e */
    private final boolean f84284e;

    /* renamed from: f */
    private final boolean f84285f;

    /* renamed from: g */
    private final Bundle f84286g;

    /* renamed from: h */
    private final String f84287h;

    /* renamed from: i */
    private final String f84288i;

    static {
        Covode.recordClassIndex(42959);
    }

    C35724b(ChooseMusicActivity chooseMusicActivity, AbstractC0952i iVar, String str, MusicModel musicModel, boolean z, boolean z2, Bundle bundle, String str2, String str3) {
        this.f84280a = chooseMusicActivity;
        this.f84281b = iVar;
        this.f84282c = str;
        this.f84283d = musicModel;
        this.f84284e = z;
        this.f84285f = z2;
        this.f84286g = bundle;
        this.f84287h = str2;
        this.f84288i = str3;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89171a
    public final Object invoke() {
        ChooseMusicActivity chooseMusicActivity = this.f84280a;
        AbstractC0952i iVar = this.f84281b;
        String str = this.f84282c;
        MusicModel musicModel = this.f84283d;
        boolean z = this.f84284e;
        boolean z2 = this.f84285f;
        Bundle bundle = this.f84286g;
        String str2 = this.f84287h;
        String str3 = this.f84288i;
        chooseMusicActivity.mo62765a();
        Fragment a = iVar.mo3549a(R.id.b82);
        C35818v a2 = C35818v.m73157a(chooseMusicActivity.f84271c, str, musicModel, C60717d.EnumC60718a.BtnConfirm, z, z2, bundle, str2, str3, chooseMusicActivity.f84272d ? 1 : 0);
        if (a != null) {
            iVar.mo3552a().mo3469b(R.id.b82, a2).mo3467b();
        } else {
            iVar.mo3552a().mo3453a(R.id.b82, a2).mo3467b();
        }
        return C89391z.f203057a;
    }
}
