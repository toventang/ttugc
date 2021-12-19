package com.p2082ss.android.ugc.aweme.choosemusic.p2463c;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.choosemusic.view.C35986q;
import com.p2082ss.android.ugc.aweme.keyword.C57071b;
import com.p2082ss.android.ugc.aweme.music.p3465b.C60717d;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.c.v */
public final class C35818v extends AbstractView$OnClickListenerC35761a {

    /* renamed from: w */
    public static final C35819a f84583w = new C35819a((byte) 0);

    /* renamed from: y */
    private HashMap f84584y;

    static {
        Covode.recordClassIndex(43057);
    }

    /* renamed from: a */
    public static final C35818v m73157a(int i, String str, MusicModel musicModel, C60717d.EnumC60718a aVar, boolean z, boolean z2, Bundle bundle, String str2, String str3, int i2) {
        return C35819a.m73160a(i, str, musicModel, aVar, z, z2, bundle, str2, str3, i2);
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.c.v$a */
    public static final class C35819a {
        static {
            Covode.recordClassIndex(43058);
        }

        private C35819a() {
        }

        public /* synthetic */ C35819a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C35818v m73160a(int i, String str, MusicModel musicModel, C60717d.EnumC60718a aVar, boolean z, boolean z2, Bundle bundle, String str2, String str3, int i2) {
            C35818v vVar = new C35818v();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i);
            bundle2.putSerializable("challenge", str);
            bundle2.putSerializable("music_model", musicModel);
            bundle2.putSerializable("music_style", aVar);
            bundle2.putBoolean("music_allow_clear", z);
            bundle2.putString("creation_id", str3);
            bundle2.putString("shoot_way", str2);
            bundle2.putBoolean("music_is_photomv", z2);
            bundle2.putInt("sound_page_scene", i2);
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            vVar.setArguments(bundle2);
            return vVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.choosemusic.p2463c.AbstractView$OnClickListenerC35761a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f84584y;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.choosemusic.p2463c.AbstractView$OnClickListenerC35761a
    /* renamed from: d */
    public final void mo62812d() {
        this.f84396r.mo62736b().setValue(this.f84397s.mo94218a().f129938a);
        this.f84396r.mo62735a().setValue(2);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.choosemusic.p2463c.AbstractView$OnClickListenerC35761a
    /* renamed from: a */
    public final void mo62806a(Editable editable) {
        String valueOf = String.valueOf(editable);
        this.f84397s.mo94219a(new C57071b(valueOf, null, 2));
        if (!TextUtils.equals(this.f84398t, valueOf)) {
            this.f84398t = valueOf;
            if (TextUtils.isEmpty(valueOf)) {
                C35986q qVar = this.f84387e;
                qVar.f84914h.setVisibility(0);
                qVar.f84911e.setVisibility(4);
                qVar.f84913g.setVisibility(8);
                if (qVar.f84924r != null) {
                    qVar.f84924r.setVisibility(0);
                }
                if (qVar.f84925s != null) {
                    qVar.f84925s.setVisibility(8);
                }
                mo62811c();
            } else if (this.f84396r.mo62740f() != 0) {
                C35986q qVar2 = this.f84387e;
                qVar2.f84914h.setVisibility(4);
                qVar2.f84911e.setVisibility(0);
                qVar2.f84913g.setVisibility(8);
                if (qVar2.f84924r != null) {
                    qVar2.f84924r.setVisibility(0);
                }
                if (qVar2.f84925s != null) {
                    qVar2.f84925s.setVisibility(8);
                }
                mo62812d();
            }
        }
    }
}
