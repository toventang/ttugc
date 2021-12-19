package com.p2082ss.android.ugc.aweme.choosemusic.p2463c;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import androidx.core.content.C0643b;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1710c.C23005c;
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.ugc.aweme.arch.AbstractC33936c;
import com.p2082ss.android.ugc.aweme.base.SafeHandler;
import com.p2082ss.android.ugc.aweme.choosemusic.C35699a;
import com.p2082ss.android.ugc.aweme.choosemusic.C35754b;
import com.p2082ss.android.ugc.aweme.choosemusic.model.C35920u;
import com.p2082ss.android.ugc.aweme.choosemusic.model.C35925z;
import com.p2082ss.android.ugc.aweme.choosemusic.p2467g.C35842d;
import com.p2082ss.android.ugc.aweme.choosemusic.utils.C35936b;
import com.p2082ss.android.ugc.aweme.choosemusic.view.C35991u;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import com.p2082ss.android.ugc.aweme.p2440ce.C35444b;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.c.ab */
public final class C35767ab extends AbstractC35794i implements AbstractC39063h.AbstractC39067a, AbstractC39063h.AbstractC39067a {

    /* renamed from: m */
    private C35920u f84414m;

    /* renamed from: n */
    private long f84415n;

    /* renamed from: o */
    private Handler f84416o = new SafeHandler(this);

    /* renamed from: p */
    private boolean f84417p = false;

    static {
        Covode.recordClassIndex(43006);
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.C33933a.AbstractC33934a
    /* renamed from: b */
    public final String mo60169b() {
        return "local_music_list_data";
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo62832b(Object obj) {
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.C33933a.AbstractC33934a
    /* renamed from: c */
    public final String mo60170c() {
        return "local_music_list_status";
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.C33933a.AbstractC33934a
    /* renamed from: d */
    public final String mo60171d() {
        return "local_music_list_load_more_status";
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.choosemusic.p2463c.AbstractC35794i
    /* renamed from: o */
    public final int mo62834o() {
        return 5;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.choosemusic.p2463c.AbstractC35794i
    /* renamed from: p */
    public final String mo62835p() {
        return "";
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.choosemusic.p2463c.AbstractC35794i
    /* renamed from: q */
    public final int mo62836q() {
        return R.layout.a1_;
    }

    /* renamed from: t */
    public final void mo62838t() {
    }

    /* renamed from: u */
    public final void mo62839u() {
        if (this.f84414m != null) {
            m72966w();
        }
    }

    /* renamed from: v */
    public final void mo62840v() {
        if (getActivity() != null) {
            getActivity().onBackPressed();
        }
    }

    /* renamed from: w */
    private void m72966w() {
        if (C35842d.m73235a()) {
            this.f84414m.mo63038c(new WeakReference<>(getActivity()));
        } else {
            this.f84414m.mo63036a(new WeakReference<>(getActivity()));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.choosemusic.p2463c.AbstractC35794i, com.p2082ss.android.ugc.aweme.arch.C33933a.AbstractC33934a
    /* renamed from: a */
    public final void mo60168a() {
        super.mo60168a();
        this.f84414m = new C35920u(this.f84493e);
        this.f84416o.postDelayed(new RunnableC35768ac(this), 5000);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h.AbstractC39067a
    /* renamed from: l */
    public final void mo62837s() {
        C35920u uVar;
        if (C35842d.m73235a() && (uVar = this.f84414m) != null && !uVar.f84776b) {
            if (this.f84494j != null) {
                this.f84494j.mo60175a();
            }
            C35920u uVar2 = this.f84414m;
            WeakReference<Activity> weakReference = new WeakReference<>(getActivity());
            long currentTimeMillis = System.currentTimeMillis();
            if (!uVar2.f84777c) {
                uVar2.f84777c = true;
                uVar2.mo63037b(weakReference).mo5534a(new C35925z(uVar2, weakReference, currentTimeMillis), C1731i.f5564c, null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo62833m() {
        if (!this.f84417p && getActivity() != null) {
            this.f84417p = true;
            if (C0643b.m2367a(getActivity(), "android.permission.WRITE_EXTERNAL_STORAGE") != 0 || this.f84414m == null) {
                C35444b.m72473a(getActivity(), new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new C35769ad(this));
            } else {
                m72966w();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.p2082ss.android.ugc.aweme.choosemusic.p2463c.AbstractC35794i, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f84415n = System.currentTimeMillis();
    }

    /* renamed from: a */
    public static Fragment m72965a(int i) {
        C35767ab abVar = new C35767ab();
        Bundle bundle = new Bundle();
        bundle.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i);
        abVar.setArguments(bundle);
        return abVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.choosemusic.p2463c.AbstractC35794i
    /* renamed from: b */
    public final AbstractC33936c mo62831b(View view) {
        C35991u uVar = new C35991u(getContext(), view, this, this, this.f84496l);
        uVar.f84984o = this.f84415n;
        C89219l.m154721d(this, "");
        TuxStatusView.C23263c cVar = new TuxStatusView.C23263c();
        String string = getString(R.string.dbe);
        C89219l.m154716b(string, "");
        TuxStatusView.C23263c a = cVar.mo37879a(string);
        String string2 = getString(R.string.cxt);
        C89219l.m154716b(string2, "");
        uVar.f84960k = a.mo37878a((CharSequence) string2).mo37877a(C23005c.m43393a(C35699a.C35700a.f84201a));
        uVar.mo63140a(R.string.dbe);
        uVar.mo63143a(this);
        uVar.mo63142a(new C35754b("change_music_page_detail", "local_music", "click_button", C35936b.f84812a));
        if (C35842d.m73235a()) {
            uVar.mo63135a(new C35770ae(this));
        }
        uVar.f84952c.setVisibility(0);
        uVar.mo63136f();
        return uVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.choosemusic.p2463c.AbstractC35794i
    /* renamed from: a */
    public final void mo62830a(String str, MusicModel musicModel, String str2, Activity activity) {
        String name;
        Intent intent = new Intent();
        intent.putExtra("path", str);
        intent.putExtra("music_model", musicModel);
        intent.putExtra("music_origin", str2);
        if (musicModel == null) {
            name = "";
        } else {
            name = musicModel.getName();
        }
        intent.putExtra("local_music_name", name);
        activity.setResult(-1, intent);
        activity.finish();
    }
}
